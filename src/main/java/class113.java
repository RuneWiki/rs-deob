import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class113 extends class11 {

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    private int field1696 = 12288;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    private int field1692 = 8192;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    private int field1700 = 4096;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    private int field1694 = 2048;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    private int field1703 = 0;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    private int field1705 = 2048;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    private int field1695 = 0;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "Z")
    public static boolean field1690 = false;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "Lwj;")
    public static class270 field1693 = new class270(103, -2);

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "Lol;")
    public static class187 field1704 = new class187("", 14);

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(III)Z", line = 3)
    private final boolean method811(int arg0, int arg1, int arg2) {
        int var4 = 38 % ((arg2 - -23) / 43);
        ++field1706;
        int var5 = (arg0 - arg1) * this.field1696 >> 12;
        int var6 = class150.field2284[var5 * 255 >> 12 & 255];
        int var7 = (var6 << 12) / this.field1696;
        int var8 = (var7 << 12) / this.field1692;
        int var9 = this.field1700 * var8 >> 12;
        return ~var9 < ~(arg0 + arg1) && arg0 + arg1 > -var9;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V", line = 20)
    public static void method812(byte arg0) {
        field1704 = null;
        int var1 = 44 / ((arg0 - -12) / 57);
        field1693 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lju;I)Ljava/lang/String;", line = 36)
    public static final String method813(class82 arg0, int arg1) {
        if (arg1 != -2048) {
            field1701 = -59;
        }
        ++field1699;
        return arg0.field1240 != null && ~arg0.field1240.length() < -1 ? arg0.field1227 + class340.field4897.method2731(arg1 + 2110, class372.field5455) + arg0.field1240 : arg0.field1227;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(II)[I", line = 52)
    public final int[] method44(int arg0, int arg1) {
        if (arg0 > -42) {
            return null;
        } else {
            ++field1702;
            int[] var3 = super.field158.method1312(arg1, (byte) 74);
            if (super.field158.field2966) {
                int var4 = class328.field4484[arg1] - 2048;
                for (int var5 = 0; class90.field1316 > var5; ++var5) {
                    int var6 = class448.field6606[var5] + -2048;
                    int var7 = var6 - -this.field1705;
                    int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                    int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                    int var10 = this.field1703 + var4;
                    int var11 = var10 < -2048 ? var10 + 4096 : var10;
                    int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                    int var13 = this.field1695 + var6;
                    int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                    int var15 = ~var14 >= -2049 ? var14 : var14 - 4096;
                    int var16 = this.field1694 + var4;
                    int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                    int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                    var3[var5] = !this.method811(var12, var9, -97) && !this.method814(-7383, var15, var18) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(III)Z", line = 110)
    private final boolean method814(int arg0, int arg1, int arg2) {
        if (arg0 != -7383) {
            method812((byte) -115);
        }
        ++field1697;
        int var4 = (arg1 + arg2) * this.field1696 >> 12;
        int var5 = class150.field2284[(var4 * 255 & 1047973) >> 12];
        int var6 = (var5 << 12) / this.field1696;
        int var7 = (var6 << 12) / this.field1692;
        int var8 = this.field1700 * var7 >> 12;
        return ~(-arg1 + arg2) > ~var8 && ~(-arg1 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 251)
    public class113() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lsi;II)V", line = 136)
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field1698;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field1692 = arg0.method2353((byte) 115);
                                }
                            } else {
                                this.field1700 = arg0.method2353((byte) 83);
                            }
                        } else {
                            this.field1696 = arg0.method2353((byte) 90);
                        }
                    } else {
                        this.field1694 = arg0.method2353((byte) 127);
                    }
                } else {
                    this.field1695 = arg0.method2353((byte) 107);
                }
            } else {
                this.field1703 = arg0.method2353((byte) 72);
            }
        } else {
            this.field1705 = arg0.method2353((byte) 71);
        }
        if (arg1 > -40) {
            field1690 = true;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V", line = 240)
    public final void method42(boolean arg0) {
        ++field1691;
        class144.method971((byte) 26);
        if (!arg0) {
            this.field1700 = -78;
        }
    }
}
