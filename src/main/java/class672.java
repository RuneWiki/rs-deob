import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class672 extends class440 {

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    private int field9499 = 4;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    private int field9503 = 4;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public static int field9495 = 2;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field9501;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field9502;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "[[[B")
    public static byte[][][] field9500;

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class672() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field9497;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = 39 % ((arg0 - -56) / 41);
        if (super.field6412.field8047) {
            int var5 = class549.field7715 / this.field9503;
            int var6 = class221.field3098 / this.field9499;
            int[] var7;
            if (~var6 >= -1) {
                var7 = this.method2611(-27, 0, 0);
            } else {
                int var8 = arg1 % var6;
                var7 = this.method2611(-121, class221.field3098 * var8 / var6, 0);
            }
            for (int var9 = 0; ~class549.field7715 < ~var9; ++var9) {
                if (var5 <= 0) {
                    var3[var9] = var7[0];
                } else {
                    int var10 = var9 % var5;
                    var3[var9] = var7[class549.field7715 * var10 / var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lmo;B)V")
    public static final void method3725(class695 arg0, byte arg1) {
        int var2 = 40 % ((19 - arg1) / 60);
        for (int var3 = 0; class475.field6775 > var3; ++var3) {
            int var4 = arg0.method3815(-32768);
            int var5 = arg0.method3847((byte) 118);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class656.field9195[var4] != null) {
                class656.field9195[var4].field2928 = var5;
            }
        }
        ++field9501;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field9496;
        if (arg0 == 5) {
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    this.field9499 = arg1.method3826(false);
                }
            } else {
                this.field9503 = arg1.method3826(false);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)I")
    public static final int method3726(int arg0, int arg1) {
        ++field9494;
        if (arg1 != 255) {
            field9495 = -114;
        }
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
    public static void method3727(byte arg0) {
        if (arg0 < 123) {
            field9500 = null;
        }
        field9500 = null;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIZ)V")
    public static final void method3728(int arg0, int arg1, boolean arg2) {
        ++field9498;
        class138 var3 = class642.method3576(arg1, (byte) -76, arg2);
        if (var3 != null) {
            if (arg0 == 0) {
                var3.method3678(-1);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[[I")
    public final int[][] method763(int arg0, int arg1) {
        ++field9502;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (super.field6417.field9606) {
            int var4 = class549.field7715 / this.field9503;
            int var5 = class221.field3098 / this.field9499;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method2606(class221.field3098 * var6 / var5, 0, -1);
            } else {
                var7 = this.method2606(0, 0, arg0 ^ 5765);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class549.field7715; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class549.field7715 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        if (arg0 != -5766) {
            field9495 = -114;
        }
        return var3;
    }
}
