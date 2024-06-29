import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class157 extends class3 {

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    private int field2524 = 4096;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "Z")
    private boolean field2530 = true;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2525 = "Loading - please wait.";

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field2527 = 0;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "[S")
    public static short[] field2535 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "Lnm;")
    public static class221 field2522;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "[I")
    public static int[] field2523;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)Z", line = 7)
    public static final boolean method1121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class140.field2257[arg0][var8][var9] == -class141.field2268) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class101.field1457[arg0][arg1][arg3] + arg5;
            if (!class353.method2467(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class353.method2467(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class353.method2467(var10, var12, var14)) {
                return false;
            } else if (class353.method2467(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class148.method1054(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class353.method2467(var6 + 1, class101.field1457[arg0][arg1][arg3] + arg5, var7 + 1) && class353.method2467(var6 + 128 - 1, class101.field1457[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class353.method2467(var6 + 128 - 1, class101.field1457[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class353.method2467(var6 + 1, class101.field1457[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[S)[S", line = 67)
    public static final short[] method1122(int arg0, short[] arg1) {
        field2534++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class298.method2099(arg1, 0, var2, 0, arg1.length);
            return arg0 == 1 ? var2 : (short[]) null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)V", line = 94)
    public static final void method1123(byte arg0, boolean arg1) {
        if (arg0 != 120) {
            method1125((long[]) null, (Object[]) null, 107);
        }
        field2526++;
        class125.method808(class233.field3712, class345.field5538, class243.field3838, arg0 ^ 0xFFFFFF87, arg1);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[[I", line = 106)
    public final int[][] method22(int arg0, int arg1) {
        field2531++;
        if (arg0 != -21194) {
            field2522 = (class221) null;
        }
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int[] var4 = this.method24(arg1 - 1 & class129.field1970, arg0 + 21195, 0);
            int[] var5 = this.method24(arg1, 1, 0);
            int[] var6 = this.method24(class129.field1970 & arg1 + 1, arg0 ^ 0xFFFFAD37, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; var10 < class326.field5342; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field2524;
                int var12 = (var5[var10 + 1 & class5.field70] - var5[var10 - 1 & class5.field70]) * this.field2524;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                }
                if (this.field2530) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var9[var10] = var20;
                var8[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)V", line = 191)
    public static void method1124(byte arg0) {
        field2525 = null;
        if (arg0 < 22) {
            method1123((byte) -53, false);
        }
        field2535 = null;
        field2523 = null;
        field2522 = null;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 216)
    public class157() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lfh;IZ)V", line = 220)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1123((byte) 89, true);
        }
        field2528++;
        if (arg1 == 0) {
            this.field2524 = arg0.method2250(-1613178296);
        } else if (arg1 == 1) {
            this.field2530 = arg0.method2224(-124) == 1;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([J[Ljava/lang/Object;I)V", line = 263)
    public static final void method1125(long[] arg0, Object[] arg1, int arg2) {
        class344.method2427(arg1, 0, arg0, arg0.length - 1, -2);
        if (arg2 <= 10) {
            method1122(-16, (short[]) null);
        }
        field2533++;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(B)V", line = 274)
    public static final void method1126(byte arg0) {
        field2536++;
        class117.field1704.method651(0);
        int var1 = -84 / ((arg0 + 40) / 35);
        class123.field1826.method651(0);
    }
}
