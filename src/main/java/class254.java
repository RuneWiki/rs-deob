import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class254 extends class397 {

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field4125 = -1;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "[Lgl;")
    public static class356[] field4122;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "[[B")
    public static byte[][] field4123;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1755(boolean arg0, String arg1, int arg2) {
        String var3 = arg1.toLowerCase();
        field4124++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class50.field606 : class117.field1628) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class180 var11 = class344.method2253((byte) 108, var8);
            if (var11.field2941 && var11.method1239(0).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class81.field1008 = null;
                    class32.field400 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class32.field400 = var5;
        class81.field1008 = var4;
        class334.field5215 = 0;
        String[] var9 = new String[class32.field400];
        for (int var10 = 0; var10 < class32.field400; var10++) {
            var9[var10] = class344.method2253((byte) 43, var4[var10]).method1239(0);
        }
        if (arg2 != 1) {
            method1755(false, (String) null, -117);
        }
        class117.method851(var9, -1, class81.field1008);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static final void method1756(int arg0) {
        field4126++;
        class94 var1 = (class94) class236.field3946.method253((byte) -6);
        if (arg0 != 16705) {
            method1755(false, (String) null, -92);
        }
        while (var1 != null) {
            class321 var2 = var1.field1143;
            if (class266.field4286 != var2.field714 || var2.field5001) {
                var1.method1120(arg0 - 16636);
                var2.method2131(true);
            } else if (var2.field5019 <= class183.field2987) {
                var2.method2129((byte) -103, class62.field807);
                if (var2.field5001) {
                    var1.method1120(-94);
                } else {
                    class239.method1689(var2, true);
                }
            }
            var1 = (class94) class236.field3946.method247((byte) -124);
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field4123 = null;
        if (arg0 == 19165) {
            field4122 = null;
        }
    }
}
