import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class240 extends class24 {

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "Z")
    public boolean field3896 = false;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "[I")
    public static int[] field3894 = new int[32];

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "[I")
    public static int[] field3897;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "[Ls;")
    public static class94[] field3900;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "[I")
    public static int[] field3899;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 11)
    public static void method1621(int arg0) {
        if (arg0 != 12666) {
            method1622((byte) 66);
        }
        field3894 = null;
        field3900 = null;
        field3897 = null;
        field3899 = null;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 26)
    public static final void method1622(byte arg0) {
        class92.field1414.method527(-123);
        if (arg0 < -12) {
            class300.field5091 = null;
            field3890++;
            class83.field1261 = 1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZBIIIIIIIII)Z", line = 47)
    public static final boolean method1623(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg2 != 80) {
            field3900 = (class94[]) null;
        }
        field3891++;
        if (class266.field4489.field3012 == 2) {
            return class161.method1139(arg4, arg6, arg7, arg10, arg3, arg2 - 194, arg1, arg9, arg0, arg11, arg5, arg8);
        } else if (class266.field4489.field3012 > 2) {
            return class175.method1264(arg0, class266.field4489.field3012, arg1, -374, arg8, arg6, arg4, arg9, arg10, arg11, arg3, arg7, arg5);
        } else {
            return class148.method1020(arg4, arg11, arg5, arg9, 0, arg8, arg10, arg7, arg0, arg6, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lj;Z)Lcc;", line = 69)
    public static final class199 method1624(class153 arg0, boolean arg1) {
        field3893++;
        class199 var2 = new class199();
        var2.field3291 = arg0.method1069(115);
        var2.field3281 = class294.method2021(var2.field3291, -2828);
        return arg1 ? (class199) null : var2;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3894[var1] = var0 - 1;
            var0 += var0;
        }
        field3897 = new int[] { 16, 32, 64, 128 };
        field3900 = new class94[500];
        field3899 = new int[4096];
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V", line = 88)
    public static final void method1625(byte arg0) {
        if (arg0 != 89) {
            field3899 = (int[]) null;
        }
        class166.field2671.method718(false);
        field3895++;
        int var1 = class166.field2671.method728(1, 20544);
        if (var1 == 0) {
            return;
        }
        int var2 = class166.field2671.method728(2, arg0 + 20455);
        if (var2 == 0) {
            class12.field136[class9.field120++] = 2047;
        } else if (var2 == 1) {
            int var3 = class166.field2671.method728(3, 20544);
            class266.field4489.method1333((byte) -113, false, var3);
            int var4 = class166.field2671.method728(1, 20544);
            if (var4 == 1) {
                class12.field136[class9.field120++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class166.field2671.method728(3, 20544);
            class266.field4489.method1333((byte) -95, true, var5);
            int var6 = class166.field2671.method728(3, arg0 + 20455);
            class266.field4489.method1333((byte) -103, true, var6);
            int var7 = class166.field2671.method728(1, 20544);
            if (var7 == 1) {
                class12.field136[class9.field120++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class166.field2671.method728(7, 20544);
            class79.field1127 = class166.field2671.method728(2, 20544);
            int var9 = class166.field2671.method728(1, arg0 ^ 0x5019);
            int var10 = class166.field2671.method728(1, arg0 ^ 0x5019);
            if (var10 == 1) {
                class12.field136[class9.field120++] = 2047;
            }
            int var11 = class166.field2671.method728(7, arg0 ^ 0x5019);
            class266.field4489.method1334(var9 == 1, var11, (byte) 103, var8);
        }
    }
}
