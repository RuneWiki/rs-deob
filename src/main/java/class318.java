import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class318 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Z")
    public static boolean field4986 = true;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lwf;")
    public static class306 field4988;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([I[Ljava/lang/Object;ZII)V", line = 9)
    public static final void method2160(int[] arg0, Object[] arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            return;
        }
        field4992++;
        if (arg3 <= arg4) {
            return;
        }
        int var5 = arg4;
        int var6 = (arg3 + arg4) / 2;
        int var7 = arg0[var6];
        arg0[var6] = arg0[arg3];
        arg0[arg3] = var7;
        Object var8 = arg1[var6];
        arg1[var6] = arg1[arg3];
        arg1[arg3] = var8;
        for (int var9 = arg4; var9 < arg3; var9++) {
            if (arg0[var9] < (var7 + (var9 & 0x1))) {
                int var10 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5] = var10;
                Object var11 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5++] = var11;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var7;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var8;
        method2160(arg0, arg1, false, var5 - 1, arg4);
        method2160(arg0, arg1, false, arg3, var5 + 1);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)Z", line = 64)
    public static final boolean method2161(int arg0, int arg1) {
        field4991++;
        if (arg1 < 29) {
            method2160((int[]) null, (Object[]) null, true, -36, 96);
        }
        return arg0 >= 0 && arg0 < class311.field4934.length ? class311.field4934[arg0] : false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 78)
    public static void method2162(int arg0) {
        field4988 = null;
        if (arg0 != 1) {
            method2162(-107);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;", line = 88)
    public static final String[] method2163(String arg0, int arg1, char arg2) {
        if (arg1 > -52) {
            field4988 = (class306) null;
        }
        int var3 = class307.method2112((byte) 102, arg2, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        field4989++;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 125)
    public static final void method2164(boolean arg0) {
        class230.field3713.method2068((byte) 107);
        field4990++;
        int var1 = class230.field3713.method2072(1, false);
        if (var1 == 0) {
            return;
        }
        int var2 = class230.field3713.method2072(2, false);
        if (var2 == 0) {
            class105.field1619[class142.field2248++] = 2047;
            return;
        }
        if (!arg0) {
            field4986 = false;
        }
        if (var2 == 1) {
            int var11 = class230.field3713.method2072(3, false);
            class79.field1173.method276((byte) -79, var11, 1);
            int var12 = class230.field3713.method2072(1, !arg0);
            if (var12 == 1) {
                class105.field1619[class142.field2248++] = 2047;
            }
        } else if (var2 == 2) {
            if (class230.field3713.method2072(1, false) == 1) {
                int var8 = class230.field3713.method2072(3, false);
                class79.field1173.method276((byte) -107, var8, 2);
                int var9 = class230.field3713.method2072(3, false);
                class79.field1173.method276((byte) -61, var9, 2);
            } else {
                int var7 = class230.field3713.method2072(3, false);
                class79.field1173.method276((byte) -118, var7, 0);
            }
            int var10 = class230.field3713.method2072(1, false);
            if (var10 == 1) {
                class105.field1619[class142.field2248++] = 2047;
            }
        } else if (var2 == 3) {
            class77.field1154 = class230.field3713.method2072(2, false);
            int var3 = class230.field3713.method2072(1, false);
            int var4 = class230.field3713.method2072(1, false);
            if (var4 == 1) {
                class105.field1619[class142.field2248++] = 2047;
            }
            int var5 = class230.field3713.method2072(7, false);
            int var6 = class230.field3713.method2072(7, false);
            class79.field1173.method567(var3 == 1, -25545, var5, var6);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1308(int arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[B)V")
    public abstract void method1309(int arg0, byte[] arg1);
}
