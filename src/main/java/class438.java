import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class class438 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    private int field6154 = 0;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public int field6155 = 4;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    private int field6164 = 4;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    private int field6161 = 4;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    private int field6166 = 4;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "[S")
    private short[] field6167 = new short[512];

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "Laq;")
    public static class90 field6168 = new class90();

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "[S")
    private short[] field6158;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)I")
    public static final int method2748(byte arg0, int arg1) {
        field6162++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 <= 112) {
            field6171 = -127;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    private final void method2749(byte arg0) {
        this.field6158 = new short[this.field6155];
        field6159++;
        if (arg0 > -110) {
            field6171 = -9;
        }
        for (int var2 = 0; var2 < this.field6155; var2++) {
            this.field6158[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public abstract void method1035(int arg0);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBZ)V")
    public static final void method2750(int arg0, byte arg1, boolean arg2) {
        field6169++;
        class304 var3 = class356.method2281(arg0, arg2, 0);
        if (var3 != null) {
            var3.method2467((byte) 80);
            if (arg1 > -60) {
                field6170 = -6;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
    public static void method2751(int arg0) {
        field6168 = null;
        int var1 = 88 % ((-arg0 - 14) / 49);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V")
    public abstract void method1036(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
    public static final void method2752(byte arg0) {
        if (arg0 > 97) {
            class248.field3509.method900(0);
            field6156++;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
    private final void method2753(boolean arg0) {
        field6160++;
        Random var2 = new Random((long) this.field6154);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field6167[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0) {
            return;
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class26.method299(var5, (byte) 100, var2);
            short var7 = this.field6167[var6];
            this.field6167[var6] = this.field6167[var5];
            this.field6167[var5] = this.field6167[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)Lmk;")
    public static final class34 method2754(int arg0, int arg1, int arg2) {
        class125 var3 = class328.field4549[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1761;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I")
    public static final int method2755(int arg0, int arg1) {
        field6165++;
        double var2 = (double) ((arg0 & 0xFF0DDA) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF6A) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (arg1 != -32430) {
            return -3;
        }
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)V")
    public final void method2756(int arg0, int arg1, int arg2, int arg3) {
        field6163++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg3];
        if (arg2 != 936163788) {
            return;
        }
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg1];
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var8[var10] = (var10 << 12) / arg1;
        }
        this.method1035(-416361076);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field6155; var14++) {
                        int var15 = this.field6158[var14] << 12;
                        int var16 = this.field6166 * var15 >> 12;
                        int var17 = this.field6161 * var15 >> 12;
                        int var18 = var8[var11] * var15 >> 12;
                        int var19 = this.field6164 * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field6166 * var20;
                        int var23 = this.field6164 * var18;
                        int var24 = this.field6161 * var21;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var23 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var17 > var26) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35 = var24 & 0xFFF;
                        int var36 = var30 & 0xFF;
                        int var37;
                        if (var19 <= var32) {
                            var37 = 0;
                        } else {
                            var37 = var32 & 0xFF;
                        }
                        int var38 = var22 & 0xFFF;
                        int var39;
                        if (var29 < var16) {
                            var39 = var29 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = class349.field4801[var35];
                        short var41 = this.field6167[var37];
                        int var42 = class349.field4801[var34];
                        int var43 = var38 - 4096;
                        int var44 = var35 - 4096;
                        int var45 = var34 - 4096;
                        int var46 = class349.field4801[var38];
                        short var47 = this.field6167[var36];
                        short var48 = this.field6167[var31 + var41];
                        short var49 = this.field6167[var39 + var47];
                        short var50 = this.field6167[var39 + var41];
                        short var51 = this.field6167[var31 + var47];
                        int var52 = class333.method2139(var34, this.field6167[var28 + var51], var35, (byte) -30, var38);
                        int var53 = class333.method2139(var34, this.field6167[var33 + var51], var44, (byte) -30, var38);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class333.method2139(var34, this.field6167[var28 + var49], var35, (byte) -30, var43);
                        int var56 = class333.method2139(var34, this.field6167[var33 + var49], var44, (byte) -30, var43);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var46 >> 12);
                        int var59 = class333.method2139(var45, this.field6167[var28 + var48], var35, (byte) -30, var38);
                        int var60 = class333.method2139(var45, this.field6167[var33 + var48], var44, (byte) -30, var38);
                        int var61 = var59 + ((var60 - var59) * var40 >> 12);
                        int var62 = class333.method2139(var45, this.field6167[var28 + var50], var35, (byte) -30, var43);
                        int var63 = class333.method2139(var45, this.field6167[var33 + var50], var44, (byte) -30, var43);
                        int var64 = var62 + ((var63 - var62) * var40 >> 12);
                        int var65 = ((var64 - var61) * var46 >> 12) + var61;
                        this.method1036(-115, ((var65 - var58) * var42 >> 12) + var58, var14);
                    }
                    this.method1033(4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIIZ)V")
    public static final void method2757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field6157++;
        if (arg5 >= 1 && arg2 >= 1 && (class211.field2954 - 2) >= arg5 && arg2 <= class290.field4061 - 2) {
            if (!class51.method428(-1) && !class85.method614(class125.field1760, arg2, -31202, arg7, arg5)) {
                return;
            }
            if (class328.field4549 == null) {
                return;
            }
            int var9 = arg7;
            if (arg7 < 3 && class112.method791((byte) -116, arg2, arg5)) {
                var9 = arg7 + 1;
            }
            class222.method1477(arg0, class64.field949, arg5, -1, class426.field5999[arg7], arg2, arg7, var9);
            if (arg4 >= 0) {
                boolean var10 = class154.field2169;
                class154.field2169 = true;
                class99.method715(arg1, arg6, false, arg4, false, arg7, var9, arg3, class64.field949, arg5, 1, arg2, class426.field5999[arg7]);
                class154.field2169 = var10;
            }
        }
        if (arg8) {
            method2757(-2, -77, -109, -55, 83, -20, -34, -122, true);
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
    public abstract void method1033(int arg0);

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIII)V")
    public class438(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6166 = arg3;
        this.field6164 = arg4;
        this.field6155 = arg1;
        this.field6154 = arg0;
        this.field6161 = arg2;
        this.method2749((byte) -128);
        this.method2753(false);
    }

    static {
        new class442("Ok", "Okay", "OK", "Ok");
        field6170 = -2;
        field6171 = 0;
    }
}
