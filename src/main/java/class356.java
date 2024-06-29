import java.io.File;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public abstract class class356 {

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    private int field5053 = 4;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public int field5050 = 4;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    private int field5060 = 0;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "[S")
    private short[] field5061 = new short[512];

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    private int field5057 = 4;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    private int field5058 = 4;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lmu;")
    public static class303 field5047 = new class303(35, 0);

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "D")
    public static double field5062;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "[S")
    private short[] field5048;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 4)
    private final void method2234(int arg0) {
        field5049++;
        Random var2 = new Random((long) this.field5060);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5061[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class37.method463((byte) 106, var5, var2);
            short var7 = this.field5061[var6];
            this.field5061[var6] = this.field5061[var5];
            this.field5061[var5] = this.field5061[var5 + 256] = var7;
        }
        if (arg0 <= 6) {
            this.field5050 = -11;
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V", line = 44)
    private final void method2235(int arg0) {
        this.field5048 = new short[this.field5050];
        field5051++;
        for (int var2 = arg0; var2 < this.field5050; var2++) {
            this.field5048[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V", line = 68)
    public final void method2236(int arg0, int arg1, int arg2, int arg3) {
        field5052++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = arg2; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method1628(true);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field5050; var14++) {
                        int var15 = this.field5048[var14] << 12;
                        int var16 = var8[var11] * var15 >> 12;
                        int var17 = this.field5053 * var15 >> 12;
                        int var18 = this.field5057 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = this.field5058 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field5058 * var19;
                        int var23 = this.field5057 * var21;
                        int var24 = this.field5053 * var16;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var22 & 0xFFF;
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var18 <= var29) {
                            var35 = 0;
                        } else {
                            var35 = var29 & 0xFF;
                        }
                        int var36;
                        if (var26 >= var20) {
                            var36 = 0;
                        } else {
                            var36 = var26 & 0xFF;
                        }
                        int var37 = var31 & 0xFF;
                        int var38;
                        if (var17 > var32) {
                            var38 = var32 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var24 & 0xFFF;
                        int var40 = var34 - 4096;
                        short var41 = this.field5061[var38];
                        int var42 = var33 - 4096;
                        int var43 = class538.field7440[var39];
                        int var44 = class538.field7440[var33];
                        int var45 = class538.field7440[var34];
                        int var46 = var39 - 4096;
                        short var47 = this.field5061[var37];
                        short var48 = this.field5061[var35 + var47];
                        short var49 = this.field5061[var30 + var41];
                        short var50 = this.field5061[var35 + var41];
                        short var51 = this.field5061[var30 + var47];
                        int var52 = class173.method1294(true, this.field5061[var27 + var51], var39, var34, var33);
                        int var53 = class173.method1294(true, this.field5061[var36 + var51], var39, var34, var42);
                        int var54 = var52 + ((var53 - var52) * var44 >> 12);
                        int var55 = class173.method1294(true, this.field5061[var27 + var48], var39, var40, var33);
                        int var56 = class173.method1294(true, this.field5061[var36 + var48], var39, var40, var42);
                        int var57 = ((var56 - var55) * var44 >> 12) + var55;
                        int var58 = class173.method1294(true, this.field5061[var27 + var49], var46, var34, var33);
                        int var59 = ((var57 - var54) * var45 >> 12) + var54;
                        int var60 = class173.method1294(true, this.field5061[var36 + var49], var46, var34, var42);
                        int var61 = ((var60 - var58) * var44 >> 12) + var58;
                        int var62 = class173.method1294(true, this.field5061[var27 + var50], var46, var40, var33);
                        int var63 = class173.method1294(true, this.field5061[var36 + var50], var46, var40, var42);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = ((var64 - var61) * var45 >> 12) + var61;
                        this.method1627(((var65 - var59) * var43 >> 12) + var59, var14, arg2 ^ 0xFFFFFFFE);
                    }
                    this.method1629(-1538606516);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 236)
    public static final void method2237(String arg0, boolean arg1, int arg2) {
        field5054++;
        class128.method1064("", arg2, (byte) -96, 0, arg0, "", "");
        if (arg1) {
            method2239(null, -103);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(IIIII)V", line = 536)
    public class356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5050 = arg1;
        this.field5057 = arg3;
        this.field5058 = arg2;
        this.field5060 = arg0;
        this.field5053 = arg4;
        this.method2235(0);
        this.method2234(85);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V", line = 255)
    public static final void method2238(int arg0, int arg1) {
        class124.field2128.method987(2, arg0);
        field5056++;
        class493.field6825.method987(2, arg0);
        if (arg1 != -1) {
            field5047 = null;
        }
        class94.field1657.method987(2, arg0);
        class566.field7800.method987(arg1 ^ 0xFFFFFFFD, arg0);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 271)
    public static final int method2239(String arg0, int arg1) {
        field5055++;
        if (!class241.field3526.field2525) {
            return -1;
        } else if (class197.field2895.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class511.method2995(arg0, 3);
            if (var2 == null) {
                return -1;
            }
            String var3 = class432.field6179 + var2;
            if (arg1 != 7468) {
                method2241((byte) 28, null, null, null);
            }
            if (!class534.field7356.method875("", var3, -88)) {
                return -1;
            } else if (class534.field7356.method866(arg1 ^ 0x1D48, var3)) {
                byte[] var4 = class534.field7356.method844(var3, "", -29832);
                Object var5 = null;
                File var6;
                try {
                    var6 = class395.method2479(arg1 - 7470, var2);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class94.method888(arg1 ^ 0x1D5B, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class241.field3526.method1216(var4, (byte) -104, var6);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class730.method4037(var6, 64, arg0);
                return 100;
            } else {
                return class534.field7356.method850(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V", line = 362)
    public static void method2240(int arg0) {
        field5047 = null;
        if (arg0 != 10) {
            field5047 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLlga;Lha;Lii;)V", line = 372)
    public static final void method2241(byte arg0, class710 arg1, class59 arg2, class553 arg3) {
        field5059++;
        class496 var4 = arg3.method3182(arg2, false);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1626();
        if (var5 < var4.method1619()) {
            var5 = var4.method1619();
        }
        byte var6 = 10;
        int var7 = arg1.field9635;
        int var8 = arg1.field9637;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field7642 != null) {
            var9 = class635.field8727.method3394(arg3.field7642, null, class745.field10133, (byte) 87, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class745.field10133[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class428.field6146.method2161(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class428.field6146.method2162() + (class428.field6146.method2157() / 2);
        }
        int var15 = var5 / 2 + arg1.field9635;
        int var16 = arg1.field9637;
        if (var7 < (class489.field6794 + var5)) {
            var7 = class489.field6794;
            var15 = var5 / 2 + var10 / 2 + var6 + class489.field6794 + 5;
        } else if ((class489.field6798 - var5) < var7) {
            var7 = class489.field6798 - var5;
            var15 = class489.field6798 - (var10 / 2) - var6 - (var5 / 2) - 5;
        }
        if (var8 < class489.field6784 + var5) {
            var8 = class489.field6784;
            var16 = var5 / 2 + var6 + class489.field6784;
        } else if (var8 > class489.field6790 - var5) {
            var8 = class489.field6790 - var5;
            var16 = class489.field6790 - (var5 / 2) - (var6 - -var11);
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field9635), (double) (var8 - arg1.field9637)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method2930((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        if (arg0 != -43) {
            method2238(-91, -16);
        }
        int var21 = -2;
        if (arg3.field7642 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var9 * class428.field6146.method2162() + var16 + 3;
            var20 = var18 + var10 + 10;
            if (arg3.field7647 != 0) {
                arg2.method624(var20 - var18, (byte) -125, var18, var16, var21 - var16, arg3.field7647);
            }
            if (arg3.field7649 != 0) {
                arg2.method623(var20 - var18, var16, arg3.field7649, var18, var21 - var16, 67);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class745.field10133[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class428.field6146.method2160(arg2, var23, var15, var16, arg3.field7625, true);
                var16 += class428.field6146.method2162();
            }
        }
        if (arg3.field7623 == -1 && arg3.field7642 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class682 var25 = new class682(arg1);
        var25.field9233 = var20;
        var25.field9242 = var8 - var24;
        var25.field9231 = var8 + var24;
        var25.field9246 = var7 + var24;
        var25.field9234 = var21;
        var25.field9249 = var19;
        var25.field9243 = var7 - var24;
        var25.field9241 = var18;
        class591.field8075.method1273(var25, -20180);
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
    public abstract void method1629(int arg0);

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
    public abstract void method1628(boolean arg0);

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)V")
    public abstract void method1627(int arg0, int arg1, int arg2);
}
