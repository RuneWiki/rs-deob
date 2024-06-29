import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class423 extends class30 {

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
    private int field5948 = 4096;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "Z")
    private boolean field5953 = true;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field5950 = new String[200];

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "J")
    public static long field5954;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II[BIII[BII)V", line = 4)
    public static final void method2444(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5951;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg8 & arg7);
        for (int var11 = -arg3; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg0++;
                arg2[var10001] += arg6[arg5++];
                int var14 = arg0++;
                arg2[var14] += arg6[arg5++];
                int var15 = arg0++;
                arg2[var15] += arg6[arg5++];
                int var16 = arg0++;
                arg2[var16] += arg6[arg5++];
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg0++;
                arg2[var10001] += arg6[arg5++];
            }
            arg5 += arg1;
            arg0 += arg4;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 53)
    public class423() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)Ljb;", line = 59)
    public static final class457 method2445(int arg0, int arg1, int arg2) {
        class390 var3 = class295.field4051[arg0][arg1][arg2];
        return var3 != null && var3.field5524 != null ? var3.field5524 : null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BILac;)V", line = 67)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field5953 = arg2.method2874((byte) -75) == 1;
            }
        } else {
            this.field5948 = arg2.method2845(-1);
        }
        if (arg0 <= 100) {
            method2445(-10, 1, -119);
        }
        ++field5949;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V", line = 101)
    public static void method2446(int arg0) {
        int var1 = 26 / ((37 - arg0) / 41);
        field5950 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLac;)V", line = 115)
    public static final void method2447(byte arg0, class501 arg1) {
        ++field5952;
        if (~(arg1.field6855.length + -arg1.field6892) <= -2) {
            int var2 = arg1.method2874((byte) -75);
            if (~var2 <= -1 && var2 <= 1) {
                if (arg1.field6855.length + -arg1.field6892 >= 2) {
                    int var3 = arg1.method2845(-1);
                    if (arg1.field6855.length + -arg1.field6892 >= var3 * 6) {
                        int var4 = 0;
                        if (arg0 == -17) {
                            while (~var3 < ~var4) {
                                int var5 = arg1.method2845(-1);
                                int var6 = arg1.method2840(false);
                                if (class324.field4421.length > var5 && class588.field8266[var5] && (class166.field2417.method2396((byte) 82, var5).field9714 != '1' || ~var6 <= 0 && var6 <= 1)) {
                                    class324.field4421[var5] = var6;
                                }
                                ++var4;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)[[I", line = 170)
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != 7) {
            return null;
        } else {
            ++field5947;
            int[][] var3 = super.field377.method3683(arg0, (byte) -70);
            if (super.field377.field9085) {
                int[] var4 = this.method294(arg0 + -1 & class649.field9002, 0, (byte) -124);
                int[] var5 = this.method294(arg0, 0, (byte) -58);
                int[] var6 = this.method294(class649.field9002 & arg0 + 1, 0, (byte) -115);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; ~class31.field399 < ~var10; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field5948;
                    int var12 = (var5[var10 + 1 & class353.field4694] + -var5[var10 + -1 & class353.field4694]) * this.field5948;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 != 0) {
                        var18 = 16777216 / var17;
                        var19 = var11 / var17;
                        var20 = var12 / var17;
                    } else {
                        var20 = 0;
                        var19 = 0;
                        var18 = 0;
                    }
                    if (this.field5953) {
                        var19 = (var19 >> 1) + 2048;
                        var20 = (var20 >> 1) + 2048;
                        var18 = (var18 >> 1) + 2048;
                    }
                    var7[var10] = var20;
                    var8[var10] = var19;
                    var9[var10] = var18;
                }
            }
            return var3;
        }
    }
}
