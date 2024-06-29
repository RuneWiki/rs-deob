import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class197 extends class243 {

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    private int field2348 = 3216;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "[I")
    private int[] field2349 = new int[3];

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    private int field2356 = 4096;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    private int field2355 = 3216;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "Lkba;")
    public static class108 field2353 = new class108();

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 6)
    public static void method1093(int arg0) {
        if (arg0 != 0) {
            method1093(126);
        }
        field2353 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 21)
    public class197() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)V", line = 25)
    private final void method1094(byte arg0) {
        ++field2357;
        double var2 = Math.cos((double) ((float) this.field2355 / 4096.0F));
        this.field2349[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field2348 / 4096.0F)));
        this.field2349[1] = (int) (Math.cos((double) ((float) this.field2348 / 4096.0F)) * var2 * 4096.0D);
        this.field2349[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2355 / 4096.0F)));
        if (arg0 <= -73) {
            int var4 = this.field2349[0] * this.field2349[0] >> 12;
            int var5 = this.field2349[1] * this.field2349[1] >> 12;
            int var6 = this.field2349[2] * this.field2349[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 - -var6 >> 12)));
            if (~var7 != -1) {
                this.field2349[1] = (this.field2349[1] << 12) / var7;
                this.field2349[2] = (this.field2349[2] << 12) / var7;
                this.field2349[0] = (this.field2349[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V", line = 66)
    public final void method85(byte arg0) {
        this.method1094((byte) -76);
        if (arg0 != 66) {
            this.method85((byte) 126);
        }
        ++field2354;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[BZLjava/lang/String;)I", line = 79)
    public static final int method1095(int arg0, byte[] arg1, boolean arg2, String arg3) {
        if (arg2) {
            return 5;
        } else {
            ++field2351;
            int var4 = arg0;
            int var5 = arg3.length();
            for (int var6 = 0; ~var6 > ~var5; var6 += 4) {
                int var7 = class249.method1492(120, arg3.charAt(var6));
                int var8 = ~var5 >= ~(var6 + 1) ? -1 : class249.method1492(73, arg3.charAt(var6 + 1));
                int var9 = ~(var6 + 2) > ~var5 ? class249.method1492(124, arg3.charAt(var6 + 2)) : -1;
                int var10 = ~(var6 + 3) <= ~var5 ? -1 : class249.method1492(103, arg3.charAt(var6 + 3));
                arg1[arg0++] = (byte) class344.method2020(var7 << 2, var8 >>> 4);
                if (~var9 == 0) {
                    break;
                }
                arg1[arg0++] = (byte) class344.method2020(class321.method1919(240, var8 << 4), var9 >>> 2);
                if (~var10 == 0) {
                    break;
                }
                arg1[arg0++] = (byte) class344.method2020(var10, class321.method1919(3, var9) << 6);
            }
            return arg0 - var4;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I", line = 127)
    public final int[] method5(int arg0, int arg1) {
        ++field2352;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            return null;
        } else {
            if (super.field3164.field9250) {
                int var4 = class265.field3499 * this.field2356 >> 12;
                int[] var5 = this.method1462(arg1 - 1 & class625.field8744, 0, 0);
                int[] var6 = this.method1462(arg1, 0, 0);
                int[] var7 = this.method1462(class625.field8744 & arg1 + 1, 0, arg0 ^ 255);
                for (int var8 = 0; ~var8 > ~class687.field9628; ++var8) {
                    int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class28.field206] - var6[class28.field206 & var8 - -1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = 255 & class509.field6883[((var12 + 1) * var12 >> 1) + var11];
                    int var14 = var9 * var13 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = var13 * 4096 >> 8;
                    int var17 = this.field2349[1] * var14 >> 12;
                    int var18 = this.field2349[2] * var16 >> 12;
                    int var19 = this.field2349[0] * var15 >> 12;
                    var3[var8] = var17 + var19 - -var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILji;B)V", line = 199)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 >= -92) {
            this.field2356 = 79;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2355 = arg1.method3402((byte) 127);
                }
            } else {
                this.field2348 = arg1.method3402((byte) 127);
            }
        } else {
            this.field2356 = arg1.method3402((byte) 127);
        }
        ++field2350;
    }
}
