import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class171 extends class189 {

    @OriginalMember(owner = "client!t", name = "kb", descriptor = "I")
    private int field3546 = 585;

    @OriginalMember(owner = "client!t", name = "ib", descriptor = "Lgg;")
    private static class63 field3544 = class116.method911(43, "Loaded config");

    @OriginalMember(owner = "client!t", name = "ob", descriptor = "Lgg;")
    private static class63 field3550 = class116.method911(43, "slide:");

    @OriginalMember(owner = "client!t", name = "mb", descriptor = "Lgg;")
    public static class63 field3548 = field3550;

    @OriginalMember(owner = "client!t", name = "gb", descriptor = "Lgg;")
    public static class63 field3542 = class116.method911(43, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!t", name = "nb", descriptor = "Lgg;")
    public static class63 field3549 = field3550;

    @OriginalMember(owner = "client!t", name = "qb", descriptor = "Lgg;")
    public static class63 field3552 = field3544;

    @OriginalMember(owner = "client!t", name = "hb", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!t", name = "jb", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!t", name = "pb", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!t", name = "sb", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!t", name = "rb", descriptor = "Lfd;")
    public static class52 field3553;

    @OriginalMember(owner = "client!t", name = "lb", descriptor = "Ljc;")
    public static class85 field3547;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public static final void method1149(int arg0) {
        for (class123 var1 = (class123) class29.field671.method1033(0); var1 != null; var1 = (class123) class29.field671.method1035(arg0 ^ 21057)) {
            if (var1.field2727 == -1) {
                var1.field2716 = 0;
                class187.method1229((byte) 114, var1);
            } else {
                var1.method1172(arg0 ^ -20998);
            }
        }
        ++field3543;
        if (arg0 != 21057) {
            method1149(22);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3551;
        int[] var3 = super.field3825.method681(arg1, (byte) -61);
        if (super.field3825.field1840) {
            int var4 = class21.field496[arg1];
            for (int var5 = 0; var5 < class54.field1430; ++var5) {
                int var6 = class35.field825[var5];
                if (~var6 < ~this.field3546 && ~var6 > ~(-this.field3546 + 4096) && ~var4 < ~(2048 - this.field3546) && ~var4 > ~(this.field3546 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field3546 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field3546 + 2048) && ~(2048 - -this.field3546) < ~var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field3546;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3546 + 2048);
                } else if (this.field3546 <= var4 && ~var4 >= ~(-this.field3546 + 4096)) {
                    if (~var6 <= ~this.field3546 && -this.field3546 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3546 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field3546;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3546 + 2048);
                }
            }
        }
        if (arg0 != 0) {
            field3547 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)V")
    public static void method1150(byte arg0) {
        field3542 = null;
        field3544 = null;
        field3548 = null;
        field3553 = null;
        field3549 = null;
        field3552 = null;
        field3547 = null;
        if (arg0 != 46) {
            field3547 = null;
        }
        field3550 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class171() {
        super(0, true);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg0 == 0) {
            this.field3546 = arg2.method46((byte) 65);
        }
        ++field3545;
        if (arg1 < 32) {
            method1151(93, 46, -81);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(III)V")
    public static final void method1151(int arg0, int arg1, int arg2) {
        ++field3554;
        if (class166.field3404 >= 2 || ~class184.field3729 != -1 || class181.field3680) {
            class63 var3;
            if (~class184.field3729 == -2 && ~class166.field3404 > -3) {
                var3 = class89.method772((byte) 74, new class63[] { class28.field669, class203.field4029, class62.field1554, class177.field3640 });
            } else if (class181.field3680 && class166.field3404 < 2) {
                var3 = class89.method772((byte) 34, new class63[] { class106.field2420, class203.field4029, class24.field547, class177.field3640 });
            } else {
                var3 = class151.method1059(class166.field3404 + -1, arg1 + -686459342);
            }
            if (class166.field3404 > 2) {
                var3 = class89.method772((byte) 39, new class63[] { var3, class43.field1040, class175.method1162((byte) -126, class166.field3404 + -2), class71.field1783 });
            }
            int var4 = class29.field675.method643(var3, arg2 + 4, arg0 + 15, 16777215, 0, class118.field2641, class42.field988);
            class19.method196(15, arg0, arg2 - arg1, class29.field675.method665(var3) + var4, -51);
        }
    }
}
