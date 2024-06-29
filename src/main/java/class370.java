import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class370 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    private int field5258;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[[I")
    private int[][] field5262;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    private int field5266;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[I")
    public static int[] field5263 = new int[2];

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field5268 = -2;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
    public final int method2372(int arg0, int arg1) {
        field5269++;
        if (this.field5262 != null) {
            arg0 = (int) ((long) this.field5258 * (long) arg0 / (long) this.field5266);
        }
        if (arg1 >= -59) {
            this.field5258 = 27;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method2373(int arg0) {
        if (arg0 == 18829) {
            field5263 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)I")
    public final int method2374(int arg0, int arg1) {
        if (this.field5262 != null) {
            arg1 = (int) ((long) this.field5258 * (long) arg1 / (long) this.field5266) + 6;
        }
        field5260++;
        int var3 = -41 / (arg0 / 58);
        return arg1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method2375(byte arg0) {
        if (arg0 != -62) {
            field5259 = -43;
        }
        field5265++;
        if (class423.field6041 == 10) {
            class390.method2463(28, true);
        }
        if (class423.field6041 == 30) {
            class390.method2463(25, true);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([BB)[B")
    public final byte[] method2376(byte[] arg0, byte arg1) {
        if (this.field5262 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field5258 / (long) this.field5266) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field5262[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5258 + var6;
                int var14 = var13 / this.field5266;
                var5 += var14;
                var6 = var13 - this.field5266 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field5261++;
        if (arg1 != 16) {
            this.method2372(49, -22);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(II)V")
    public class370(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class430.method2679((byte) 65, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field5258 = var4;
            this.field5262 = new int[var5][14];
            this.field5266 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field5262[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBIIIIIIIIII)V")
    public static final void method2377(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field5267++;
        class254 var13 = new class254();
        var13.field3763 = arg0;
        var13.field3760 = arg3;
        var13.field3764 = arg9;
        var13.field3755 = arg11;
        var13.field3766 = arg10;
        var13.field3765 = arg12;
        var13.field3769 = arg5;
        var13.field3767 = arg8;
        var13.field3756 = arg4;
        if (arg2 > 74) {
            var13.field3758 = arg6;
            var13.field3759 = arg7;
            var13.field3757 = arg1;
            class342.field4955.method2756(65, var13);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static final void method2378(int arg0) {
        field5264++;
        if (class451.field6469 != arg0) {
            class317.method2112(~arg0, -1, false, class451.field6469, -1);
            class451.field6469 = -1;
        }
    }
}
