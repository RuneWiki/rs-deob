import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class90 extends class267 {

    @OriginalMember(owner = "client!bi", name = "Gb", descriptor = "I")
    public static int field1775 = -1;

    @OriginalMember(owner = "client!bi", name = "Rb", descriptor = "J")
    public static long field1786 = 0L;

    @OriginalMember(owner = "client!bi", name = "Ob", descriptor = "Loh;")
    public static class263 field1783 = class253.method1681(-123, "_labels");

    @OriginalMember(owner = "client!bi", name = "Hb", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!bi", name = "Ib", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!bi", name = "Nb", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!bi", name = "Pb", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!bi", name = "Qb", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!bi", name = "Sb", descriptor = "Llf;")
    public class204 field1787;

    @OriginalMember(owner = "client!bi", name = "Mb", descriptor = "Lhc;")
    public static class221 field1781;

    @OriginalMember(owner = "client!bi", name = "Jb", descriptor = "Lue;")
    public static class86 field1778;

    @OriginalMember(owner = "client!bi", name = "Kb", descriptor = "Lue;")
    public static class86 field1779;

    @OriginalMember(owner = "client!bi", name = "Lb", descriptor = "Lue;")
    public static class86 field1780;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "Ljava/awt/Frame;")
    public static Frame field1774;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1777;
        if (this.field1787 != null) {
            class240 var11 = ~super.field4694 != 0 && super.field4662 == 0 ? class186.method1226(12828, super.field4694) : null;
            class240 var12 = super.field4652 == -1 || ~super.field4687 == ~super.field4652 && var11 != null ? null : class186.method1226(12828, super.field4652);
            class76 var13 = this.field1787.method1415(var11, false, var12, super.field4686, super.field4718);
            if (var13 != null) {
                super.field4684 = var13.method106();
                class204 var14 = this.field1787;
                if (var14.field3691 != null) {
                    var14 = var14.method1407((byte) -31);
                }
                if (class125.field2322 && var14.field3656) {
                    class76 var15 = class214.method1450(this.field1787.field3687, super.field4719, this.field1787.field3676, super.field4705, this.field1787.field3694, var12 != null ? super.field4686 : super.field4718, var12 == null ? var11 : var12, super.field4688, this.field1787.field3712, this.field1787.field3657, var13, (byte) 118, super.field4666, arg0);
                    var15.method105(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field1787.field3680 != 0 || ~this.field1787.field3702 != -1) {
                    int var19 = class270.field4769[arg0];
                    int var20 = class270.field4762[arg0];
                    short var21 = this.field1787.field3680;
                    short var22 = this.field1787.field3702;
                    int var23 = -var21 / 2;
                    int var24 = -var22 / 2;
                    int var25 = var19 * var24 + var20 * var23 >> 16;
                    int var26 = var21 / 2;
                    int var27 = -var22 / 2;
                    int var28 = var19 * var27 - -(var20 * var26) >> 16;
                    int var29 = -var21 / 2;
                    int var30 = var20 * var27 + -(var19 * var26) >> 16;
                    int var31 = var20 * var24 + -(var19 * var23) >> 16;
                    int var32 = class120.method781(class12.field321, super.field4688 + var25, false, super.field4705 + var31);
                    int var33 = var22 / 2;
                    int var34 = class120.method781(class12.field321, super.field4688 + var28, false, super.field4705 - -var30);
                    int var35 = var20 * var33 + -(var19 * var29) >> 16;
                    int var36 = var19 * var33 + var20 * var29 >> 16;
                    int var37 = var21 / 2;
                    int var38 = class120.method781(class12.field321, super.field4688 + var36, false, super.field4705 + var35);
                    int var39 = var22 / 2;
                    int var40 = var19 * var39 + var20 * var37 >> 16;
                    int var41 = ~var34 >= ~var32 ? var34 : var32;
                    int var42 = var38 > var32 ? var32 : var38;
                    int var43 = var20 * var39 + -(var19 * var37) >> 16;
                    int var44 = class120.method781(class12.field321, super.field4688 + var40, false, super.field4705 - -var43);
                    int var45 = ~var38 <= ~var44 ? var44 : var38;
                    int var46 = ~var34 <= ~var44 ? var44 : var34;
                    if (~var22 != -1) {
                        var16 = (int) (325.95D * Math.atan2((double) (-var45 + var41), (double) var22)) & 2047;
                        if (var16 != 0) {
                            var13.method520(var16);
                        }
                    }
                    if (var21 != 0) {
                        var17 = (int) (325.95D * Math.atan2((double) (-var46 + var42), (double) var21)) & 2047;
                        if (var17 != 0) {
                            var13.method507(var17);
                        }
                    }
                    int var47 = var32 + var44;
                    if (~var47 < ~(var34 + var38)) {
                        var47 = var34 + var38;
                    }
                    var18 = (var47 >> 1) - super.field4719;
                    if (~var18 != -1) {
                        var13.method513(0, var18, 0);
                    }
                }
                class76 var48 = null;
                if (~super.field4689 != 0 && super.field4685 != -1) {
                    class46 var49 = class46.method296(-71, super.field4689);
                    var48 = var49.method294(super.field4685, true);
                    if (var48 != null) {
                        var48.method513(0, -super.field4699, 0);
                        if (var49.field1005) {
                            if (~var16 != -1) {
                                var48.method520(var16);
                            }
                            if (~var17 != -1) {
                                var48.method507(var17);
                            }
                            if (var18 != 0) {
                                var48.method513(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class167) var13).method1111(var48);
                }
                if (~this.field1787.field3694 == -2) {
                    var13.field1566 = true;
                }
                var13.method105(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)Z")
    public final boolean method633(byte arg0) {
        ++field1784;
        if (arg0 < 91) {
            field1786 = -1L;
        }
        return this.field1787 != null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
    public static final void method634(boolean arg0) {
        class105.field1984.method830(50);
        if (arg0) {
            method635(0);
        }
        ++field1776;
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V")
    public static void method635(int arg0) {
        field1779 = null;
        field1783 = null;
        field1778 = null;
        field1774 = null;
        if (arg0 != -997605072) {
            method634(false);
        }
        field1781 = null;
        field1780 = null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()I")
    public final int method106() {
        ++field1785;
        return super.field4684;
    }
}
