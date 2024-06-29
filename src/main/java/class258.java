import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class258 extends class124 {

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
    private int field4578 = 0;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
    private int field4576 = 4096;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Le;")
    public static class191 field4568 = class54.method368("null", 2047);

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "Le;")
    public static class191 field4573 = class54.method368("Fps:", 2047);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "Z")
    public static boolean field4575 = false;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "[Lbg;")
    public static class168[] field4577 = new class168[27];

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "[I")
    public static int[] field4581 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "I")
    public static int field4582 = 0;

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "[Le;")
    public static class191[] field4584 = new class191[1000];

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    public static int field4580 = 0;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "Lng;")
    public static class121 field4579;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 <= 68) {
            this.field4576 = -21;
        }
        ++field4571;
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int[] var4 = this.method844(0, 70, arg1);
            for (int var5 = 0; var5 < class64.field1132; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field4578 && ~var6 >= ~this.field4576 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljb;I)V")
    public static final void method1778(class176 arg0, int arg1) {
        ++field4583;
        if (~arg0.field2960 != -1) {
            if (arg0.field2988 != -1 && ~arg0.field2988 > -32769) {
                class156 var2 = class115.field1901[arg0.field2988];
                if (var2 != null) {
                    int var3 = -var2.field3003 + arg0.field3003;
                    int var4 = -var2.field2972 + arg0.field2972;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field2964 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 2047;
                    }
                }
            }
            if (~arg0.field2988 <= -32769) {
                int var5 = arg0.field2988 + -32768;
                if (class35.field641 == var5) {
                    var5 = 2047;
                }
                class76 var6 = class245.field4357[var5];
                if (var6 != null) {
                    int var7 = arg0.field2972 - var6.field2972;
                    int var8 = -var6.field3003 + arg0.field3003;
                    if (~var8 != -1 || var7 != 0) {
                        arg0.field2964 = 2047 & (int) (325.949D * Math.atan2((double) var8, (double) var7));
                    }
                }
            }
            if (arg1 <= 7) {
                method1781(95);
            }
            if ((arg0.field3018 != 0 || arg0.field2979 != 0) && (arg0.field2961 == 0 || ~arg0.field3008 < -1)) {
                int var9 = arg0.field3003 - -((-1 + arg0.method490((byte) -4)) * 64) + -((-class225.field4061 + arg0.field3018 + -class225.field4061) * 64);
                int var10 = arg0.field2972 - -(64 * (-1 + arg0.method490((byte) -4))) - (-class193.field3474 + -class193.field3474 + arg0.field2979) * 64;
                if (var9 != 0 || var10 != 0) {
                    arg0.field2964 = 2047 & (int) (Math.atan2((double) var9, (double) var10) * 325.949D);
                }
                arg0.field2979 = 0;
                arg0.field3018 = 0;
            }
            int var11 = 2047 & -arg0.field2999 + arg0.field2964;
            if (var11 == 0) {
                arg0.field2987 = 0;
            } else {
                ++arg0.field2987;
                if (~var11 < -1025) {
                    arg0.field2999 -= arg0.field2960;
                    boolean var12 = true;
                    if (~var11 > ~arg0.field2960 || ~var11 < ~(-arg0.field2960 + 2048)) {
                        var12 = false;
                        arg0.field2999 = arg0.field2964;
                    }
                    if (arg0.field2977 == arg0.field2974 && (arg0.field2987 > 25 || var12)) {
                        if (arg0.field3011 != -1) {
                            arg0.field2977 = arg0.field3011;
                        } else {
                            arg0.field2977 = arg0.field3007;
                        }
                    }
                } else {
                    arg0.field2999 += arg0.field2960;
                    boolean var13 = true;
                    if (var11 < arg0.field2960 || var11 > -arg0.field2960 + 2048) {
                        arg0.field2999 = arg0.field2964;
                        var13 = false;
                    }
                    if (arg0.field2977 == arg0.field2974 && (~arg0.field2987 < -26 || var13)) {
                        if (arg0.field3012 != -1) {
                            arg0.field2977 = arg0.field3012;
                        } else {
                            arg0.field2977 = arg0.field3007;
                        }
                    }
                }
                arg0.field2999 &= 2047;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field4576 = arg1.method1593(true);
            }
        } else {
            this.field4578 = arg1.method1593(true);
        }
        if (!arg2) {
            method1778((class176) null, 93);
        }
        ++field4574;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(BI)I")
    public static final int method1779(byte arg0, int arg1) {
        int var2 = 35 / ((-58 - arg0) / 46);
        ++field4570;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
    public static void method1780(byte arg0) {
        field4577 = null;
        field4584 = null;
        field4581 = null;
        field4579 = null;
        int var1 = 107 / ((-42 - arg0) / 59);
        field4573 = null;
        field4568 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class258() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)Lli;")
    public static final class155 method1781(int arg0) {
        int var1 = class68.field1183[0] * class47.field842[0];
        ++field4569;
        byte[] var2 = class161.field2731[0];
        if (arg0 != 8639) {
            return null;
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; ++var4) {
                var3[var4] = class19.field261[class167.method1128(255, var2[var4])];
            }
            class155 var5 = new class155(class36.field661, class3.field22, class253.field4489[0], class245.field4360[0], class68.field1183[0], class47.field842[0], var3);
            class228.method1628((byte) 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public static final int method1782(int arg0, int arg1) {
        ++field4572;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        if (arg1 != 1263456684) {
            method1780((byte) -35);
        }
        return var2 * var4 >> 12;
    }
}
