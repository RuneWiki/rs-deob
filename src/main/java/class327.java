import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class327 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field5127 = 0;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "[I")
    public static int[] field5133 = new int[1000];

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lbh;")
    public static class18 field5128;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[Ltm;")
    public static class173[] field5130;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 6)
    public static void method2295(int arg0) {
        field5133 = null;
        field5130 = null;
        if (arg0 <= 39) {
            field5128 = (class18) null;
        }
        field5128 = null;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V", line = 24)
    public static final void method2296(int arg0) {
        field5132++;
        int var1 = 0;
        if (arg0 <= 77) {
            return;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class58.method470(var3, true, var2, var1, 1, class83.field1138)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 59)
    public static final String method2297(boolean arg0, String arg1) {
        if (!arg0) {
            field5133 = (int[]) null;
        }
        field5135++;
        String var2 = class76.method568(class83.method608(arg1, (byte) -78), (byte) 101);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 79)
    public static final void method2298(byte arg0, String arg1, boolean arg2) {
        field5134++;
        String var3 = arg1.toLowerCase();
        int var4 = 0;
        int var5 = arg2 ? 32768 : 0;
        short[] var6 = new short[16];
        int var7 = var5 + (arg2 ? class229.field3592 : class257.field4061);
        for (int var8 = var5; var8 < var7; var8++) {
            class318 var9 = class142.method1059(-63, var8);
            if (var9.field5023 && var9.method2237((byte) 68).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class325.field5099 = -1;
                    class277.field4273 = null;
                    return;
                }
                if (var6.length <= var4) {
                    short[] var10 = new short[var6.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var6[var11];
                    }
                    var6 = var10;
                }
                var6[var4++] = (short) var8;
            }
        }
        class220.field3481 = 0;
        class277.field4273 = var6;
        class325.field5099 = var4;
        String[] var12 = new String[class325.field5099];
        for (int var13 = 0; var13 < class325.field5099; var13++) {
            var12[var13] = class142.method1059(-119, var6[var13]).method2237((byte) 54);
        }
        class82.method599(var12, false, class277.field4273);
        if (arg0 >= -70) {
            method2295(12);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V", line = 150)
    public static final void method2299(int arg0, byte arg1) {
        class197.field3154.method1353(-1, arg0);
        class62.field909.method1353(-1, arg0);
        field5131++;
        class161.field2597.method1353(arg1 - 104, arg0);
        if (arg1 != 103) {
            method2298((byte) -82, (String) null, false);
        }
    }
}
