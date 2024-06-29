import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class72 extends class170 {

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "Z")
    public static boolean field1545 = false;

    @OriginalMember(owner = "client!hh", name = "qc", descriptor = "[I")
    public static int[] field1552 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!hh", name = "rc", descriptor = "I")
    public static int field1553 = 0;

    @OriginalMember(owner = "client!hh", name = "oc", descriptor = "Leh;")
    public static class47 field1550 = class195.method1282((byte) -4, "jlv");

    @OriginalMember(owner = "client!hh", name = "sc", descriptor = "I")
    public static int field1554 = 0;

    @OriginalMember(owner = "client!hh", name = "kc", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!hh", name = "nc", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!hh", name = "tc", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!hh", name = "mc", descriptor = "Lfd;")
    public static class52 field1548;

    @OriginalMember(owner = "client!hh", name = "lc", descriptor = "Lfh;")
    public class56 field1547;

    @OriginalMember(owner = "client!hh", name = "pc", descriptor = "[I")
    public static int[] field1551;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lgf;I)Z")
    public static final boolean method632(class61 arg0, int arg1) {
        ++field1549;
        if (class193.field3746) {
            if (class5.method25(arg0, (byte) 112) != 0) {
                return false;
            }
            if (arg0.field1311 == 0) {
                return false;
            }
        }
        return arg1 > -8 ? true : arg0.field1215;
    }

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1548 = null;
        field1551 = null;
        field1552 = null;
        field1550 = null;
        if (arg0 <= 79) {
            method632((class61) null, 100);
        }
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)Z")
    public final boolean method280(int arg0) {
        ++field1555;
        if (this.field1547 == null) {
            return false;
        } else {
            return arg0 >= -92 ? true : true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1546;
        if (this.field1547 != null) {
            class22 var11 = super.field3330 != -1 && ~super.field3329 == -1 ? class25.method236(false, super.field3330) : null;
            class22 var12 = super.field3323 == -1 || ~super.field3323 == ~super.field3314 && var11 != null ? null : class25.method236(false, super.field3323);
            class30 var13 = this.field1547.method483(-103, var11, var12, super.field3290, super.field3306);
            if (var13 != null) {
                var13.method266();
                super.field1928 = var13.field1928;
                if (this.field1547.field1070 != 0 && this.field1547.field1107 != 0) {
                    short var14 = this.field1547.field1107;
                    short var15 = this.field1547.field1070;
                    int var16 = class17.field350[arg0];
                    int var17 = class17.field341[arg0];
                    int var18 = -var14 / 2;
                    int var19 = -var14 / 2;
                    int var20 = var15 / 2;
                    int var21 = var16 * var19 + -(var17 * var20) >> 16;
                    int var22 = -var15 / 2;
                    int var23 = var16 * var22 + var17 * var18 >> 16;
                    int var24 = var16 * var18 - var17 * var22 >> 16;
                    int var25 = class39.method335(super.field3291 + var23, class196.field3827, super.field3281 + var24, 20896);
                    int var26 = var16 * var20 + var17 * var19 >> 16;
                    int var27 = class39.method335(super.field3291 + var26, class196.field3827, super.field3281 + var21, 20896);
                    int var28 = -var15 / 2;
                    int var29 = var14 / 2;
                    int var30 = var17 * var29 - -(var16 * var28) >> 16;
                    int var31 = var16 * var29 + -(var17 * var28) >> 16;
                    int var32 = var15 / 2;
                    int var33 = class39.method335(super.field3291 + var30, class196.field3827, super.field3281 + var31, 20896);
                    int var34 = var14 / 2;
                    int var35 = var16 * var32 + var17 * var34 >> 16;
                    int var36 = var16 * var34 + -(var17 * var32) >> 16;
                    int var37 = class39.method335(super.field3291 + var35, class196.field3827, super.field3281 + var36, 20896);
                    int var38 = ~var27 >= ~var25 ? var27 : var25;
                    int var39 = ~var33 <= ~var37 ? var37 : var33;
                    int var40 = ~var37 < ~var27 ? var27 : var37;
                    int var41 = ~var25 > ~var33 ? var25 : var33;
                    int var42 = (int) (Math.atan2((double) (-var39 + var38), (double) var14) * 320.0D) & 2047;
                    var13.method271(var42);
                    int var43 = 2047 & (int) (320.0D * Math.atan2((double) (-var40 + var41), (double) var15));
                    int var44 = (var38 + var39 + var40 + var41) / 4;
                    var13.method268(var43);
                    var13.method264(0, -super.field3301 + var44, 0);
                }
                class30 var45 = null;
                if (~super.field3279 != 0 && ~super.field3337 != 0) {
                    var45 = class2.method8(super.field3279, -125).method212(super.field3337, (byte) -84);
                    if (var45 != null) {
                        var45.method264(0, -super.field3320, 0);
                    }
                }
                if (var45 != null) {
                    var13 = ((class7) var13).method39(var45);
                }
                if (this.field1547.field1111 == 1) {
                    var13.field560 = true;
                }
                var13.method45(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }
}
