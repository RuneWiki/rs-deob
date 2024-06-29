import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class513 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[S")
    private short[] field7333 = new short[512];

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    private int field7336 = 0;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    private int field7342 = 4;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    private int field7344 = 4;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    private int field7345 = 4;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public int field7348 = 4;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lpr;")
    public static class407 field7341 = new class407(45, 2);

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "[I")
    public static int[] field7347 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lxa;")
    public static class458 field7337;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "[S")
    private short[] field7340;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public abstract void method532(int arg0);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public static void method2934(int arg0) {
        if (arg0 == 2) {
            field7347 = null;
            field7341 = null;
            field7337 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method2935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 2) {
            method2936(9, 7, -53, 107, -82, 64, null, null, 119);
        }
        field7346++;
        if (arg4 < arg2 + arg5 && (arg0 + arg4) > arg5) {
            return arg7 < (arg1 + arg8) && arg1 < arg6 + arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public abstract void method531(int arg0);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII[B[BI)V")
    public static final void method2936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, byte[] arg7, int arg8) {
        field7343++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg7[var10001] = (byte) (arg7[var10001] - arg6[arg2++]);
                int var14 = arg1++;
                arg7[var14] = (byte) (arg7[var14] - arg6[arg2++]);
                int var15 = arg1++;
                arg7[var15] = (byte) (arg7[var15] - arg6[arg2++]);
                int var16 = arg1++;
                arg7[var16] = (byte) (arg7[var16] - arg6[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg7[var10001] = (byte) (arg7[var10001] - arg6[arg2++]);
            }
            arg1 += arg3;
            arg2 += arg8;
        }
        if (arg0 != 6130) {
            field7341 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2937(String arg0, int arg1, int arg2) {
        field7338++;
        if (arg1 != -5) {
            field7341 = null;
        }
        int var3 = class11.field111;
        int[] var4 = class79.field827;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class455 var7 = class362.field4726[var4[var6]];
            if (var7 != null && class377.field4914 != var7 && var7.field6324 != null && var7.field6324.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg2 == 1) {
                    class28.field342++;
                    class480.method2802(class344.field4479, 16751);
                    class334.field4314.method2566(var4[var6], true);
                    class334.field4314.method2525(0, -81849);
                } else if (arg2 == 4) {
                    class443.field6108++;
                    class480.method2802(class469.field6546, arg1 ^ 0xFFFFBE94);
                    class334.field4314.method2570(0, (byte) -91);
                    class334.field4314.method2566(var4[var6], true);
                } else if (arg2 == 5) {
                    class480.method2802(class54.field557, 16751);
                    class15.field136++;
                    class334.field4314.method2530(0, -932621016);
                    class334.field4314.method2566(var4[var6], true);
                } else if (arg2 == 6) {
                    class488.field7086++;
                    class480.method2802(class679.field9617, 16751);
                    class334.field4314.method2521(-1531903640, var4[var6]);
                    class334.field4314.method2570(0, (byte) -121);
                } else if (arg2 == 7) {
                    class480.method2802(class286.field3666, 16751);
                    class406.field5408++;
                    class334.field4314.method2546(true, 0);
                    class334.field4314.method2540(var4[var6], arg1 + 115);
                }
                break;
            }
        }
        if (!var5) {
            class638.method3593(true, 4, class221.field2740.method1296(class226.field2899, (byte) 122) + arg0);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    private final void method2938(boolean arg0) {
        field7334++;
        Random var2 = new Random((long) this.field7336);
        if (!arg0) {
            this.field7333 = null;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field7333[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class252.method1448(var2, var5, (byte) 50);
            short var7 = this.field7333[var6];
            this.field7333[var6] = this.field7333[var5];
            this.field7333[var5] = this.field7333[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
    private final void method2939(int arg0) {
        this.field7340 = new short[this.field7348];
        field7332++;
        int var2 = 0;
        if (arg0 != -11091) {
            this.method532(2);
        }
        while (this.field7348 > var2) {
            this.field7340[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            var2++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BIII)V")
    public final void method2940(byte arg0, int arg1, int arg2, int arg3) {
        field7339++;
        if (arg0 != 28) {
            return;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method531(65);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field7348; var14++) {
                        int var15 = this.field7340[var14] << 12;
                        int var16 = this.field7344 * var15 >> 12;
                        int var17 = var6[var12] * var15 >> 12;
                        int var18 = this.field7342 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var7[var11] * var15 >> 12;
                        int var21 = this.field7345 * var15 >> 12;
                        int var22 = this.field7344 * var20;
                        int var23 = this.field7345 * var17;
                        int var24 = this.field7342 * var19;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var30 & 0xFF;
                        int var34;
                        if (var32 >= var16) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35 = var24 & 0xFFF;
                        int var36 = var22 & 0xFFF;
                        int var37;
                        if (var26 < var18) {
                            var37 = var26 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var23 & 0xFFF;
                        int var39;
                        if (var29 >= var21) {
                            var39 = 0;
                        } else {
                            var39 = var29 & 0xFF;
                        }
                        int var40 = var35 - 4096;
                        short var41 = this.field7333[var33];
                        int var42 = class552.field7871[var36];
                        short var43 = this.field7333[var34];
                        int var44 = class552.field7871[var38];
                        int var45 = var38 - 4096;
                        int var46 = class552.field7871[var35];
                        int var47 = var36 - 4096;
                        short var48 = this.field7333[var31 + var41];
                        short var49 = this.field7333[var39 + var43];
                        short var50 = this.field7333[var31 + var43];
                        short var51 = this.field7333[var39 + var41];
                        int var52 = class487.method2817(this.field7333[var28 + var48], var38, var35, 44, var36);
                        int var53 = class487.method2817(this.field7333[var37 + var48], var38, var40, arg0 - 143, var36);
                        int var54 = ((var53 - var52) * var46 >> 12) + var52;
                        int var55 = class487.method2817(this.field7333[var28 + var51], var45, var35, 19, var36);
                        int var56 = class487.method2817(this.field7333[var37 + var51], var45, var40, -120, var36);
                        int var57 = ((var56 - var55) * var46 >> 12) + var55;
                        int var58 = ((var57 - var54) * var44 >> 12) + var54;
                        int var59 = class487.method2817(this.field7333[var28 + var50], var38, var35, 6, var47);
                        int var60 = class487.method2817(this.field7333[var37 + var50], var38, var40, 92, var47);
                        int var61 = ((var60 - var59) * var46 >> 12) + var59;
                        int var62 = class487.method2817(this.field7333[var28 + var49], var45, var35, 38, var47);
                        int var63 = class487.method2817(this.field7333[var37 + var49], var45, var40, -124, var47);
                        int var64 = ((var63 - var62) * var46 >> 12) + var62;
                        int var65 = ((var64 - var61) * var44 >> 12) + var61;
                        this.method530(((var65 - var58) * var42 >> 12) + var58, 0, var14);
                    }
                    this.method532(arg0 + 16831);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
    public abstract void method530(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)Z")
    public static final boolean method2941(int arg0, int arg1, int arg2) {
        field7335++;
        if (arg2 > -84) {
            return false;
        } else {
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIIII)V")
    public class513(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7336 = arg0;
        this.field7344 = arg4;
        this.field7345 = arg3;
        this.field7348 = arg1;
        this.field7342 = arg2;
        this.method2939(-11091);
        this.method2938(true);
    }
}
