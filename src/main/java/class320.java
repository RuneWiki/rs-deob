import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class320 {

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5272 = "white:";

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5275 = "glow1:";

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field5276 = 0;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field5270 = 0;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field5277 = -1;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lnm;")
    public static class221 field5278;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[[[B")
    public static byte[][][] field5273;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 23)
    public static final void method2304(int arg0, String arg1, boolean arg2) {
        short[] var3 = new short[16];
        String var4 = arg1.toLowerCase();
        int var5 = 0;
        if (arg0 != 32768) {
            method2306((byte) 1);
        }
        field5274++;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class48.field690 : class130.field1983) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class33 var9 = class295.method2088(false, var8);
            if (var9.field503 && var9.method278((byte) 127).toLowerCase().indexOf(var4) != -1) {
                if (var5 >= 50) {
                    class30.field464 = -1;
                    class123.field1829 = null;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var8;
            }
        }
        class30.field464 = var5;
        class123.field1829 = var3;
        class334.field5419 = 0;
        String[] var12 = new String[class30.field464];
        for (int var13 = 0; var13 < class30.field464; var13++) {
            var12[var13] = class295.method2088(false, var3[var13]).method278((byte) 126);
        }
        class182.method1267(var12, 0, class123.field1829);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 101)
    public static final void method2305(int arg0, int arg1) {
        if (arg0 == 0) {
            class143.field2297.method645(arg1, (byte) -59);
            field5271++;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 117)
    public static void method2306(byte arg0) {
        field5275 = null;
        if (arg0 < -56) {
            field5278 = null;
            field5272 = null;
            field5273 = (byte[][][]) null;
        }
    }
}
