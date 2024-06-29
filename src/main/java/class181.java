import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class181 extends class189 {

    @OriginalMember(owner = "client!ua", name = "ob", descriptor = "I")
    private int field3675 = 0;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    private int field3670 = 1;

    @OriginalMember(owner = "client!ua", name = "ub", descriptor = "I")
    private int field3681 = 0;

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "[I")
    public static int[] field3674 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "I")
    public static int field3673 = 0;

    @OriginalMember(owner = "client!ua", name = "rb", descriptor = "Lgg;")
    public static class63 field3678 = class116.method911(43, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!ua", name = "tb", descriptor = "Z")
    public static boolean field3680 = false;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ua", name = "pb", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ua", name = "qb", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!ua", name = "sb", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        ++field3672;
        if (!arg0) {
            field3674 = null;
        }
        class166.method1123(100);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 <= 32) {
            this.method77(-55, (byte) 26, (class3) null);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 3) {
                    this.field3670 = arg2.method64(31790);
                }
            } else {
                this.field3675 = arg2.method64(31790);
            }
        } else {
            this.field3681 = arg2.method64(31790);
        }
        ++field3667;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3668;
        int[] var3 = super.field3825.method681(arg1, (byte) -127);
        if (super.field3825.field1840) {
            int var4 = class21.field496[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~class54.field1430 < ~var6; ++var6) {
                int var7 = class35.field825[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field3681 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) (var9 / 4096)) * 4096.0D);
                    var11 = (int) ((double) (this.field3670 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field3670;
                }
                int var12 = var11 - (-4096 & var11);
                if (~this.field3675 == -1) {
                    var12 = class183.field3716[(4094 & var12) >> 4] + 4096 >> 1;
                } else if (this.field3675 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static void method1201(int arg0) {
        int var1 = 120 % ((-62 - arg0) / 60);
        field3678 = null;
        field3674 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILjc;I)Lrc;")
    public static final class156 method1202(byte arg0, int arg1, class85 arg2, int arg3) {
        ++field3671;
        if (!class117.method917(arg2, arg1, arg3, -20878)) {
            return null;
        } else {
            return arg0 != -78 ? null : class94.method825((byte) 92);
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class181() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    public static final void method1203(int arg0) {
        ++class177.field3631;
        ++field3679;
        if (arg0 != 32767) {
            method1201(-57);
        }
        class141.field3031.method854(230, true);
        class141.field3031.method32((byte) 72, 0L);
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public static final void method1204(int arg0) {
        if (arg0 == 15) {
            while (~class167.field3437.method859(-120, class112.field2531) <= -28) {
                int var1 = class167.field3437.method856((byte) 2, 15);
                if (var1 == 32767) {
                    break;
                }
                boolean var2 = false;
                if (class55.field1458[var1] == null) {
                    class55.field1458[var1] = new class6();
                    var2 = true;
                }
                class6 var3 = class55.field1458[var1];
                class142.field3045[class29.field695++] = var1;
                var3.field1163 = class173.field3571;
                var3.field150 = class140.method1007(-201, class167.field3437.method856((byte) 2, 14));
                int var4 = class167.field3437.method856((byte) 2, 1);
                int var5 = class167.field3437.method856((byte) 2, 1);
                if (var5 == 1) {
                    class3.field84[class89.field2092++] = var1;
                }
                int var6 = class167.field3437.method856((byte) 2, 5);
                if (~var6 < -16) {
                    var6 -= 32;
                }
                int var7 = class167.field3437.method856((byte) 2, 5);
                int var8 = class144.field3087[class167.field3437.method856((byte) 2, 3)];
                var3.field1136 = var3.field150.field617;
                var3.field1123 = var3.field150.field647;
                var3.field1113 = var3.field150.field636;
                var3.field1160 = var3.field150.field633;
                if (~var7 < -16) {
                    var7 -= 32;
                }
                var3.field1149 = var3.field150.field662;
                var3.field1157 = var3.field150.field665;
                if (var2) {
                    var3.field1129 = var3.field1104 = var8;
                }
                var3.field1124 = var3.field150.field621;
                var3.field1115 = var3.field150.field642;
                if (~var3.field1115 == -1) {
                    var3.field1104 = 0;
                }
                var3.field1110 = var3.field150.field618;
                var3.method473(class3.field72.field1117[0] + var7, ~var4 == -2, class3.field72.field1164[0] + var6, arg0 + -91);
            }
            class167.field3437.method860((byte) -111);
            ++field3677;
        }
    }
}
