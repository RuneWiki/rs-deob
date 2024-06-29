import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class165 extends class104 {

    @OriginalMember(owner = "client!gd", name = "Gb", descriptor = "Lda;")
    private static class275 field2865 = class255.method1672(110, "Use");

    @OriginalMember(owner = "client!gd", name = "Jb", descriptor = "Lda;")
    public static class275 field2868 = class255.method1672(116, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!gd", name = "Kb", descriptor = "Lda;")
    public static class275 field2869 = field2865;

    @OriginalMember(owner = "client!gd", name = "Qb", descriptor = "[Lda;")
    public static class275[] field2875 = new class275[100];

    @OriginalMember(owner = "client!gd", name = "Hb", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!gd", name = "Ib", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!gd", name = "Mb", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!gd", name = "Pb", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!gd", name = "Rb", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!gd", name = "Ob", descriptor = "Lcf;")
    public class23 field2873;

    @OriginalMember(owner = "client!gd", name = "Lb", descriptor = "Ljava/awt/Frame;")
    public static Frame field2870;

    @OriginalMember(owner = "client!gd", name = "Nb", descriptor = "[Lwb;")
    public static class179[] field2872;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public static void method1139(byte arg0) {
        field2875 = null;
        field2865 = null;
        if (arg0 < 114) {
            method1140(-60);
        }
        field2869 = null;
        field2872 = null;
        field2870 = null;
        field2868 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()I")
    public final int method664() {
        ++field2871;
        return super.field1768;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        ++field2876;
        if (arg0 != 1529241680) {
            return false;
        } else {
            return this.field2873 != null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public static final void method1140(int arg0) {
        if (arg0 == 16580) {
            ++field2867;
            class160.field2804.method987((byte) -109);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    public static final void method1141(byte arg0) {
        if (arg0 != 24) {
            field2875 = null;
        }
        class6.field92.method1567(-32717);
        class83.field1347 = 1;
        class96.field1636 = null;
        ++field2874;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2866;
        if (this.field2873 != null) {
            class215 var11 = super.field1776 != -1 && ~super.field1749 == -1 ? class201.method1321(128, super.field1776) : null;
            class215 var12 = super.field1788 == -1 || ~super.field1788 == ~super.field1736 && var11 != null ? null : class201.method1321(128, super.field1788);
            class176 var13 = this.field2873.method152(var11, super.field1746, super.field1740, var12, (byte) 115);
            if (var13 != null) {
                super.field1768 = var13.method664();
                class23 var14 = this.field2873;
                if (var14.field406 != null) {
                    var14 = var14.method140(1);
                }
                if (class163.field2845 && var14.field345) {
                    class176 var15 = class265.method1751(super.field1771, super.field1767, this.field2873.field371, this.field2873.field399, super.field1770, this.field2873.field360, var12 == null ? var11 : var12, this.field2873.field349, this.field2873.field368, var12 != null ? super.field1746 : super.field1740, arg0, var13, super.field1758, 70);
                    var15.method659(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (~this.field2873.field342 != -1 || ~this.field2873.field395 != -1) {
                    int var19 = class223.field3769[arg0];
                    int var20 = class223.field3760[arg0];
                    short var21 = this.field2873.field342;
                    short var22 = this.field2873.field395;
                    int var23 = -var21 / 2;
                    int var24 = -var22 / 2;
                    int var25 = var20 * var24 + -(var19 * var23) >> 16;
                    int var26 = var19 * var24 + var20 * var23 >> 16;
                    int var27 = class89.method647(super.field1758 - -var25, class159.field2790, super.field1770 + var26, -12);
                    int var28 = var21 / 2;
                    int var29 = -var22 / 2;
                    int var30 = var20 * var29 + -(var19 * var28) >> 16;
                    int var31 = var19 * var29 + var20 * var28 >> 16;
                    int var32 = class89.method647(super.field1758 + var30, class159.field2790, super.field1770 + var31, -124);
                    int var33 = -var21 / 2;
                    int var34 = var22 / 2;
                    int var35 = var19 * var34 + var20 * var33 >> 16;
                    int var36 = var20 * var34 + -(var19 * var33) >> 16;
                    int var37 = class89.method647(super.field1758 - -var36, class159.field2790, super.field1770 - -var35, -86);
                    int var38 = var22 / 2;
                    int var39 = var21 / 2;
                    int var40 = var20 * var38 + -(var19 * var39) >> 16;
                    int var41 = var19 * var38 - -(var20 * var39) >> 16;
                    int var42 = class89.method647(super.field1758 - -var40, class159.field2790, super.field1770 - -var41, -22);
                    int var43 = ~var32 >= ~var27 ? var32 : var27;
                    int var44 = var27 - -var42;
                    if (var44 > var32 + var37) {
                        var44 = var32 + var37;
                    }
                    int var45 = ~var37 <= ~var42 ? var42 : var37;
                    int var46 = var32 < var42 ? var32 : var42;
                    int var47 = ~var37 < ~var27 ? var27 : var37;
                    if (~var22 != -1) {
                        var16 = (int) (325.95D * Math.atan2((double) (-var45 + var43), (double) var22)) & 2047;
                        if (var16 != 0) {
                            var13.method940(var16);
                        }
                    }
                    if (var21 != 0) {
                        var17 = (int) (325.95D * Math.atan2((double) (-var46 + var47), (double) var21)) & 2047;
                        if (~var17 != -1) {
                            var13.method930(var17);
                        }
                    }
                    var18 = (var44 >> 1) + -super.field1767;
                    if (var18 != 0) {
                        var13.method927(0, var18, 0);
                    }
                }
                class176 var48 = null;
                if (~super.field1724 != 0 && super.field1777 != -1) {
                    class73 var49 = class188.method1246(super.field1724, 6);
                    var48 = var49.method482((byte) -121, super.field1777);
                    if (var48 != null) {
                        var48.method927(0, -super.field1785, 0);
                        if (var49.field1207) {
                            if (var16 != 0) {
                                var48.method940(var16);
                            }
                            if (var17 != 0) {
                                var48.method930(var17);
                            }
                            if (var18 != 0) {
                                var48.method927(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class130) var13).method945(var48);
                }
                if (this.field2873.field399 == 1) {
                    var13.field3041 = true;
                }
                var13.method659(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }
}
