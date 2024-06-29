import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class530 extends class739 {

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    private int field7368 = 4096;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    private int field7369 = 409;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "[I")
    private int[] field7374 = new int[3];

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    private int field7373 = 4096;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    private int field7375 = 4096;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "Lhg;")
    public static class693 field7370 = new class693(26, 7);

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(CZ)Z")
    public static final boolean method3048(char arg0, boolean arg1) {
        ++field7372;
        if (!arg1) {
            return true;
        } else {
            return arg0 >= '0' && ~arg0 >= -58 || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && ~arg0 >= -123;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method3049(byte arg0) {
        field7370 = null;
        if (arg0 != -28) {
            field7370 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V")
    public static final void method3050(int arg0, short[] arg1, String[] arg2, int arg3, int arg4) {
        if (arg3 <= 8) {
            method3048((char) 65529, false);
        }
        if (arg4 > arg0) {
            int var5 = (arg0 - -arg4) / 2;
            int var6 = arg0;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg0; ~var9 > ~arg4; ++var9) {
                if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (1 & var9)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method3050(arg0, arg1, arg2, 96, var6 - 1);
            method3050(var6 + 1, arg1, arg2, 16, arg4);
        }
        ++field7376;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field7377;
        if (arg0 <= 26) {
            this.field7373 = 30;
        }
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (super.field10312.field4922) {
            int[][] var4 = this.method4119(2, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class29.field523 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field7374[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~this.field7369 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field7374[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field7369 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field7374[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field7369 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field7368 * var12 >> 12;
                            var9[var11] = this.field7375 * var14 >> 12;
                            var10[var11] = this.field7373 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class530() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method2576((byte) 56);
                            this.field7374[1] = class702.method3949(var5, 65280) >> 4;
                            this.field7374[0] = class702.method3949(16711680, var5) << 4;
                            this.field7374[2] = class702.method3949(0, var5 >> 12);
                        }
                    } else {
                        this.field7368 = arg0.method2566(arg2 ^ 3);
                    }
                } else {
                    this.field7375 = arg0.method2566(arg2 + 1);
                }
            } else {
                this.field7373 = arg0.method2566(-2);
            }
        } else {
            this.field7369 = arg0.method2566(-2);
        }
        ++field7371;
        if (arg2 != -3) {
            this.field7373 = 64;
        }
    }
}
