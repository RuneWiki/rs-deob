import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class135 extends class171 {

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "Z")
    public boolean field2440 = false;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "Lhd;")
    private class113 field2458;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "Z")
    private boolean field2451;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "Z")
    private boolean field2442;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    private int field2438;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field2443 = 0;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field2445 = 0;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "Lha;")
    public static class46 field2446 = class271.method1828("settings=", -46);

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field2452 = 127;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "F")
    private float field2449;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "Lpi;")
    public static class181 field2457;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "[I")
    private int[] field2441;

    @OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2447++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)Lhg;")
    public static final class194 method1040(byte arg0, int arg1) {
        field2444++;
        class194 var2 = (class194) class74.field1332.method86(7961, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class130.field2384.method1293(arg1, 4, (byte) 64);
        class194 var4 = new class194();
        if (var3 != null) {
            var4.method1401(arg1, new class75(var3), arg0 ^ 0xFFFFFFCF);
        }
        class74.field1332.method80(var4, (long) arg1, (byte) 67);
        if (arg0 != -85) {
            method1044(76);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLlk;FLpi;I)[I")
    public final int[] method1041(boolean arg0, class164 arg1, float arg2, class181 arg3, int arg4) {
        int var6 = 117 % ((14 - arg4) / 52);
        field2454++;
        if (this.field2441 == null || this.field2449 != arg2) {
            if (!this.field2458.method918(arg3, 0, arg1)) {
                return null;
            }
            int var7 = arg0 ? 64 : 128;
            this.field2441 = this.field2458.method919(arg3, this.field2442, var7, var7, true, (double) arg2, -91, arg1);
            this.field2449 = arg2;
            if (this.field2451) {
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                int[] var11 = new int[var7 * var7];
                int var12 = var7;
                int var14 = var7;
                int var15 = var7;
                int var16 = var7 - 1;
                int var17 = var7 * var7;
                int var18 = var7 - 1;
                for (int var19 = 2; var19 >= 0; var19--) {
                    for (int var35 = var18; var35 >= 0; var35--) {
                        var14--;
                        int var36 = this.field2441[var14];
                        var8[var35] += class50.method369(255, var36 >> 16);
                        var9[var35] += class50.method369(var36 >> 8, 255);
                        var10[var35] += class50.method369(var36, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                int var20 = var17;
                for (int var21 = var16; var21 >= 0; var21--) {
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 1;
                    for (int var27 = 2; var27 >= 0; var27--) {
                        var22--;
                        var23 += var9[var22];
                        var24 += var10[var22];
                        var25 += var8[var22];
                        if (var22 == 0) {
                            var22 = var12;
                        }
                    }
                    for (int var28 = var18; var28 >= 0; var28--) {
                        var26--;
                        int var32 = var25 / 9;
                        int var33 = var23 / 9;
                        var22--;
                        int var34 = var24 / 9;
                        var20--;
                        var11[var20] = class235.method1595(class235.method1595(var33 << 8, var32 << 16), var34);
                        var23 += var9[var22] - var9[var26];
                        var24 += var10[var22] - var10[var26];
                        var25 += var8[var22] - var8[var26];
                        if (var26 == 0) {
                            var26 = var12;
                        }
                        if (var22 == 0) {
                            var22 = var12;
                        }
                    }
                    for (int var29 = var18; var29 >= 0; var29--) {
                        var15--;
                        int var30 = this.field2441[var15];
                        var14--;
                        int var31 = this.field2441[var14];
                        var8[var29] += class50.method369(var31 >> 16, 255) - (class50.method369(var30, 16735105) >> 16);
                        var9[var29] += class50.method369(var31 >> 8, 255) - (class50.method369(65457, var30) >> 8);
                        var10[var29] += class50.method369(var31, 255) - class50.method369(var30, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                }
                this.field2441 = var11;
            }
        }
        return this.field2441;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLpi;Llk;Z)[I")
    public final int[] method1042(byte arg0, class181 arg1, class164 arg2, boolean arg3) {
        field2453++;
        if (this.field2458.method918(arg1, 0, arg2)) {
            int var5 = arg3 ? 64 : 128;
            return arg0 == -70 ? this.field2458.method919(arg1, this.field2442, var5, var5, false, 1.0D, -119, arg2) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lpi;Llk;Z)Z")
    public final boolean method1043(class181 arg0, class164 arg1, boolean arg2) {
        field2439++;
        if (arg2) {
            this.method1041(false, (class164) null, 0.134306F, (class181) null, 42);
        }
        return this.field2458.method918(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
    public static void method1044(int arg0) {
        field2446 = null;
        if (arg0 != 255) {
            field2445 = 21;
        }
        field2457 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
    public final void method1045(int arg0, byte arg1) {
        field2456++;
        if (this.field2441 == null) {
            return;
        }
        if (arg1 > -33) {
            method1044(116);
        }
        if (this.field2455 == 0 && this.field2438 == 0) {
            return;
        }
        if (class190.field3387 == null || class190.field3387.length < this.field2441.length) {
            class190.field3387 = new int[this.field2441.length];
        }
        int var3 = this.field2441.length == 4096 ? 64 : 128;
        int var4 = this.field2441.length;
        int var5 = this.field2455 * var3 * arg0;
        int var6 = var3 - 1;
        int var7 = this.field2438 * arg0;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var9 + var5 & var8;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = (var7 + var12 & var6) + var11;
                int var14 = var9 + var12;
                class190.field3387[var14] = this.field2441[var13];
            }
        }
        int[] var10 = this.field2441;
        this.field2441 = class190.field3387;
        class190.field3387 = var10;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lwe;)V")
    public class135(class75 arg0) {
        this.field2458 = new class113(arg0);
        this.field2451 = arg0.method558(1) == 1;
        this.field2442 = arg0.method558(1) == 1;
        arg0.method558(1);
        arg0.method558(1);
        int var2 = arg0.method558(1) & 0x3;
        this.field2438 = arg0.method569((byte) -110);
        this.field2455 = arg0.method569((byte) -110);
        arg0.method558(1);
        arg0.method558(1);
    }
}
