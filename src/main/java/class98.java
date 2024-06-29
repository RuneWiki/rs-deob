import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class98 extends class115 {

    @OriginalMember(owner = "client!wp", name = "N", descriptor = "I")
    private int field1099 = 585;

    @OriginalMember(owner = "client!wp", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1101 = "M";

    @OriginalMember(owner = "client!wp", name = "M", descriptor = "I")
    public static int field1098 = 0;

    @OriginalMember(owner = "client!wp", name = "T", descriptor = "Z")
    public static boolean field1105 = false;

    @OriginalMember(owner = "client!wp", name = "U", descriptor = "Lwf;")
    public static class70 field1106 = new class70(64);

    @OriginalMember(owner = "client!wp", name = "W", descriptor = "[I")
    public static int[] field1108 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!wp", name = "Y", descriptor = "I")
    public static int field1110 = -1;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!wp", name = "O", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!wp", name = "R", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!wp", name = "S", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!wp", name = "V", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!wp", name = "Q", descriptor = "Lvr;")
    public static class71 field1102;

    @OriginalMember(owner = "client!wp", name = "X", descriptor = "[[B")
    public static byte[][] field1109;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLbk;I)V", line = 7)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 >= 83) {
            ++field1103;
            if (arg2 == 0) {
                this.field1099 = arg1.method1355(32136);
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V", line = 37)
    public static void method527(boolean arg0) {
        field1102 = null;
        field1108 = null;
        field1101 = null;
        if (arg0) {
            field1106 = null;
            field1109 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)[I", line = 61)
    public final int[] method57(int arg0, int arg1) {
        ++field1107;
        int[] var3 = super.field1340.method14(118, arg0);
        if (super.field1340.field35) {
            int var4 = class193.field2634[arg0];
            for (int var5 = 0; ~class218.field2979 < ~var5; ++var5) {
                int var6 = class43.field530[var5];
                if (var6 > this.field1099 && 4096 - this.field1099 > var6 && -this.field1099 + 2048 < var4 && ~var4 > ~(this.field1099 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1099 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > 2048 - this.field1099 && var6 < this.field1099 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field1099;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1099 + 2048);
                } else if (var4 >= this.field1099 && ~(-this.field1099 + 4096) <= ~var4) {
                    if (var6 >= this.field1099 && ~(-this.field1099 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1099 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field1099;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1099);
                }
            }
        }
        if (arg1 != 0) {
            method530(4);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V", line = 147)
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BJ)V", line = 150)
    public static final void method528(byte arg0, long arg1) {
        ++field1104;
        if (arg0 > -42) {
            field1098 = -2;
        }
        int var3 = class355.field5200;
        int var4 = class132.field1811;
        if (class297.field4241 != var3) {
            int var5 = var3 - class297.field4241;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 < -1) {
                if (~var6 == -1) {
                    var6 = 1;
                } else if (~var6 < ~var5) {
                    var6 = var5;
                }
            } else if (var6 != 0) {
                if (var5 > var6) {
                    var6 = var5;
                }
            } else {
                var6 = -1;
            }
            class297.field4241 += var6;
        }
        if (!class291.field4173) {
            class276.field3893 += (float) arg1 * class8.field107 / 40.0F * 8.0F;
            class135.field1886 += (float) arg1 * class102.field1155 / 40.0F * 8.0F;
        }
        if (class10.field113 != var4) {
            int var7 = -class10.field113 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 >= -1) {
                if (var8 != 0) {
                    if (var7 > var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = -1;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (~var8 < ~var7) {
                var8 = var7;
            }
            class10.field113 += var8;
        }
        class324.method1998((byte) 108);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILjava/lang/String;)V", line = 240)
    public static final void method529(int arg0, String arg1) {
        ++field1100;
        if (class166.field2323 != null) {
            class169.field2360.method809(222, -28022);
            int var2 = 84 % ((27 - arg0) / 42);
            ++class286.field4028;
            class169.field2360.method1396(21375, class233.method1488(-19285, arg1));
            class169.field2360.method1359((byte) 0, arg1);
        }
    }

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)V", line = 257)
    public static final void method530(int arg0) {
        if (arg0 != 2048) {
            field1101 = null;
        }
        class433.field6324 = 0;
        ++field1096;
        class32.field301.method1116((byte) -125);
        class81.field903 = false;
    }
}
