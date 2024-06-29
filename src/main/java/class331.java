import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class331 extends class145 {

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    private int field4503 = 32768;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field4504 = 127;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "Lbi;")
    public static class139 field4502 = null;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "[I")
    public static int[] field4511;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BI)[B")
    public static final byte[] method2106(byte[] arg0, int arg1) {
        ++field4509;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class152.method1170(arg0, 0, var3, arg1, var2);
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
    public static void method2107(boolean arg0) {
        if (!arg0) {
            field4511 = null;
            field4502 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIIIIZ)V")
    public static final void method2108(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg2 < arg4) {
            int var7 = (arg2 - -arg4) / 2;
            int var8 = arg2;
            class187 var9 = class365.field5034[var7];
            class365.field5034[var7] = class365.field5034[arg4];
            class365.field5034[arg4] = var9;
            for (int var10 = arg2; ~arg4 < ~var10; ++var10) {
                if (method2110(var9, class365.field5034[var10], arg5, true, arg1, arg6, arg3) <= 0) {
                    class187 var11 = class365.field5034[var10];
                    class365.field5034[var10] = class365.field5034[var8];
                    class365.field5034[var8++] = var11;
                }
            }
            class365.field5034[arg4] = class365.field5034[var8];
            class365.field5034[var8] = var9;
            method2108(-20519, arg1, arg2, arg3, var8 + -1, arg5, arg6);
            method2108(arg0, arg1, var8 + 1, arg3, arg4, arg5, arg6);
        }
        if (arg0 == -20519) {
            ++field4500;
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (arg0 != 77) {
            this.method4(true, -82);
        }
        ++field4507;
        class377.method2347(arg0 + -155);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field4508;
        int[] var3 = super.field2218.method1614(51, arg0);
        if (super.field2218.field3396) {
            int[] var4 = this.method1119(1, 0, arg0);
            int[] var5 = this.method1119(2, 0, arg0);
            for (int var6 = 0; ~class156.field2364 < ~var6; ++var6) {
                int var7 = (var4[var6] & 4081) >> 4;
                int var8 = var5[var6] * this.field4503 >> 12;
                int var9 = class381.field5351[var7] * var8 >> 12;
                int var10 = class100.field1444[var7] * var8 >> 12;
                int var11 = class40.field606 & var6 - -(var9 >> 12);
                int var12 = arg0 - -(var10 >> 12) & class402.field5610;
                int[] var13 = this.method1119(0, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        int var14 = 102 / ((16 - arg1) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method4(boolean arg0, int arg1) {
        ++field4506;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int[] var4 = this.method1119(1, 0, arg1);
            int[] var5 = this.method1119(2, 0, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class156.field2364 > var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field4503 >> 12;
                int var12 = class381.field5351[var10] * var11 >> 12;
                int var13 = class100.field1444[var10] * var11 >> 12;
                int var14 = class40.field606 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg1 & class402.field5610;
                int[][] var16 = this.method1121(var15, 0, 2);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (!arg0) {
            this.method3(-75, 4);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)I")
    public static int method2109(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class331() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lu;Lu;IZZZI)I")
    private static final int method2110(class187 arg0, class187 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, int arg6) {
        ++field4505;
        int var7 = class12.method59(arg5, arg1, arg2, arg0, -3);
        if (~var7 != -1) {
            return !arg5 ? var7 : -var7;
        } else {
            if (!arg3) {
                method2110((class187) null, (class187) null, -46, false, false, true, 1);
            }
            if (arg6 == -1) {
                return 0;
            } else {
                int var8 = class12.method59(arg4, arg1, arg6, arg0, -3);
                return arg4 ? -var8 : var8;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field4510;
        int var4 = -54 / ((11 - arg1) / 52);
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field2205 = arg0.method1861((byte) -72) == 1;
            }
        } else {
            this.field4503 = arg0.method1853(95) << 4;
        }
    }
}
