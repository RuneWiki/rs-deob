import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class188 extends class175 {

    @OriginalMember(owner = "client!rd", name = "Ub", descriptor = "Lqe;")
    public static class179 field3500 = class206.method1380("hint_mapedge", (byte) -1);

    @OriginalMember(owner = "client!rd", name = "Tb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3499 = new CRC32();

    @OriginalMember(owner = "client!rd", name = "Xb", descriptor = "Lqe;")
    public static class179 field3503 = class206.method1380("Benutzeroberfl-=che geladen)3", (byte) -42);

    @OriginalMember(owner = "client!rd", name = "Vb", descriptor = "[B")
    public static byte[] field3501 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!rd", name = "Ob", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!rd", name = "Pb", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!rd", name = "Rb", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!rd", name = "Sb", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!rd", name = "Qb", descriptor = "Lqf;")
    public class180 field3496;

    @OriginalMember(owner = "client!rd", name = "Wb", descriptor = "[[[B")
    public static byte[][][] field3502;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
    public static void method1270(byte arg0) {
        if (arg0 <= -2) {
            field3502 = null;
            field3501 = null;
            field3500 = null;
            field3499 = null;
            field3503 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3495;
        if (this.field3496 != null) {
            class117 var11 = ~super.field3182 != 0 && ~super.field3140 == -1 ? class239.method1550(super.field3182, (byte) 107) : null;
            class117 var12 = super.field3153 == -1 || super.field3153 == super.field3130 && var11 != null ? null : class239.method1550(super.field3153, (byte) 107);
            class75 var13 = this.field3496.method1183(super.field3156, var12, super.field3166, var11, -9823);
            if (var13 != null) {
                int var14 = 0;
                super.field3150 = var13.method295();
                int var15 = 0;
                int var16 = 0;
                if (this.field3496.field3312 != 0 && ~this.field3496.field3349 != -1) {
                    int var17 = class27.field600[arg0];
                    int var18 = class27.field612[arg0];
                    short var19 = this.field3496.field3312;
                    short var20 = this.field3496.field3349;
                    int var21 = -var20 / 2;
                    int var22 = -var19 / 2;
                    int var23 = var17 * var22 + var18 * var21 >> 16;
                    int var24 = var19 / 2;
                    int var25 = -var20 / 2;
                    int var26 = var17 * var24 + var18 * var25 >> 16;
                    int var27 = var17 * var21 + -(var18 * var22) >> 16;
                    int var28 = class202.method1341(-95, super.field3159 + var23, class49.field1038, super.field3198 + var27);
                    int var29 = var17 * var25 + -(var18 * var24) >> 16;
                    int var30 = class202.method1341(-60, super.field3159 - -var26, class49.field1038, super.field3198 + var29);
                    int var31 = -var19 / 2;
                    int var32 = var20 / 2;
                    int var33 = var17 * var31 + var18 * var32 >> 16;
                    int var34 = var17 * var32 - var18 * var31 >> 16;
                    int var35 = class202.method1341(85, super.field3159 + var33, class49.field1038, super.field3198 + var34);
                    int var36 = var20 / 2;
                    int var37 = var19 / 2;
                    int var38 = var17 * var37 + var18 * var36 >> 16;
                    int var39 = var17 * var36 + -(var18 * var37) >> 16;
                    int var40 = class202.method1341(-68, super.field3159 - -var38, class49.field1038, super.field3198 + var39);
                    int var41 = var28 + var40;
                    int var42 = var30 <= var28 ? var30 : var28;
                    if (var30 + var35 < var41) {
                        var41 = var30 + var35;
                    }
                    int var43 = var30 >= var40 ? var40 : var30;
                    int var44 = var35 < var40 ? var35 : var40;
                    int var45 = ~var35 >= ~var28 ? var35 : var28;
                    var14 = 2047 & (int) (Math.atan2((double) (-var44 + var42), (double) var20) * 325.95D);
                    if (~var14 != -1) {
                        var13.method487(var14);
                    }
                    var16 = (int) (325.95D * Math.atan2((double) (-var43 + var45), (double) var19)) & 2047;
                    if (var16 != 0) {
                        var13.method484(var16);
                    }
                    var15 = (var41 >> 1) + -super.field3146;
                    if (var15 != 0) {
                        var13.method479(0, var15, 0);
                    }
                }
                class75 var46 = null;
                if (~super.field3154 != 0 && super.field3192 != -1) {
                    class54 var47 = class180.method1180(126, super.field3154);
                    var46 = var47.method375(super.field3192, (byte) 12);
                    if (var46 != null) {
                        var46.method479(0, -super.field3138, 0);
                        if (var47.field1186) {
                            if (var14 != 0) {
                                var46.method487(var14);
                            }
                            if (var16 != 0) {
                                var46.method484(var16);
                            }
                            if (~var15 != -1) {
                                var46.method479(0, var15, 0);
                            }
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class203) var13).method1347(var46);
                }
                if (~this.field3496.field3303 == -2) {
                    var13.field1461 = true;
                }
                var13.method286(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()I")
    public final int method295() {
        ++field3494;
        return super.field3150;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
    public static final int method1271(int arg0) {
        ++field3497;
        if (arg0 < 116) {
            field3501 = null;
        }
        return class239.field4399;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)Z")
    public final boolean method742(byte arg0) {
        ++field3498;
        if (arg0 != -66) {
            return false;
        } else {
            return this.field3496 != null;
        }
    }
}
