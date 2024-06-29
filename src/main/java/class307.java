import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class307 extends class371 {

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "Lpm;")
    public static class129 field4470 = new class129();

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Z")
    public static boolean field4473 = true;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "[Loh;")
    private class550[] field4474;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class307() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field4469;
        if (arg0 == 0) {
            this.field4474 = new class550[arg2.method2561((byte) -74)];
            for (int var4 = 0; var4 < this.field4474.length; ++var4) {
                int var5 = arg2.method2561((byte) -105);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field4474[var4] = class605.method3518(arg2, (byte) 50);
                            }
                        } else {
                            this.field4474[var4] = class445.method2706(arg2, -19907);
                        }
                    } else {
                        this.field4474[var4] = class627.method3661(arg2, false);
                    }
                } else {
                    this.field4474[var4] = class115.method708(arg2, 24771);
                }
            }
        } else if (arg0 == 1) {
            super.field5360 = arg2.method2561((byte) -88) == 1;
        }
        int var7 = 34 % ((arg1 - -15) / 39);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[[I)V")
    private final void method1884(int arg0, int[][] arg1) {
        ++field4468;
        int var3 = class41.field455;
        int var4 = class23.field201;
        class309.method1901((byte) 56, arg1);
        class337.method2100(class343.field5013, -103, arg0, 0, class135.field1789);
        if (this.field4474 != null) {
            for (int var5 = 0; this.field4474.length > var5; ++var5) {
                class550 var6 = this.field4474[var5];
                int var7 = var6.field8199;
                int var8 = var6.field8195;
                if (var7 >= 0) {
                    if (~var8 <= -1) {
                        var6.method648(var3, (byte) -69, var4);
                    } else {
                        var6.method646(var3, (byte) -11, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method647(false, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
    public static void method1885(int arg0) {
        field4470 = null;
        if (arg0 != -12210) {
            field4473 = false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        if (arg0 != 36) {
            this.method1884(43, (int[][]) null);
        }
        ++field4472;
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (super.field5364.field7632) {
            int var4 = class41.field455;
            int var5 = class23.field201;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field5364.method3061(0);
            this.method1884(0, var6);
            for (int var8 = 0; class23.field201 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class41.field455; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class637.method3693(var15, 255) << 4;
                    var12[var14] = class637.method3693(4080, var15 >> 4);
                    var11[var14] = class637.method3693(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1886(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class475.field7254 = arg0;
        class273.field4039 = arg4;
        ++field4475;
        class308.field4486 = arg5;
        class382.field5573 = arg1;
        class241.field3527 = arg3;
        class468.field6940 = arg2;
        if (arg6 >= -105) {
            field4470 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field4471;
        int[] var3 = super.field5378.method1451(7, arg1);
        if (arg0 > -80) {
            this.method1884(-52, (int[][]) null);
        }
        if (super.field5378.field3254) {
            this.method1884(0, super.field5378.method1448(102));
        }
        return var3;
    }
}
