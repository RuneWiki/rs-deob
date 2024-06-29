import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class38 extends class23 {

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    private int field796 = 4096;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "Ldc;")
    private static class37 field805 = class185.method1233((byte) 86, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public static int field802 = -1;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field799 = 0;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Ldc;")
    public static class37 field794 = field805;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "Ldc;")
    private static class37 field798 = class185.method1233((byte) 86, "yellow:");

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "Ldc;")
    public static class37 field804 = class185.method1233((byte) 86, "scrollbar");

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Ldc;")
    public static class37 field795 = field798;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "Ldc;")
    public static class37 field806 = field798;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "Lgb;")
    public static class68 field803;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "Ljava/awt/Font;")
    public static Font field801;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "[I")
    public static int[] field792;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 != 1000) {
            field804 = null;
        }
        ++field797;
        if (arg1 == 0) {
            this.field796 = arg0.method230((byte) -128);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class38() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lig;Lig;I)V")
    public static final void method349(class93 arg0, class93 arg1, int arg2) {
        ++field791;
        if (class181.field3371) {
            class9.method62(arg1, (byte) 121, arg0);
        } else {
            if (arg2 <= 111) {
                field792 = null;
            }
            if (class109.field1891 == 0 || ~class109.field1891 == -6) {
                byte var3 = 20;
                int var4 = 253 - var3;
                arg0.method621(class235.field4279, 382, -var3 + 245, 16777215, -1);
                class48.method413(230, var4, 304, 34, 9179409);
                class48.method413(231, var4 + 1, 302, 32, 0);
                class48.method420(232, var4 + 2, class156.field2927 * 3, 30, 9179409);
                class48.method420(class156.field2927 * 3 + 232, var4 + 2, 300 - class156.field2927 * 3, 30, 0);
                arg0.method621(class19.field311, 382, -var3 + 276, 16777215, -1);
            }
            if (~class109.field1891 == -21) {
                short var5 = 211;
                class32.field648.method662(382 - class32.field648.field1742 / 2, -(class32.field648.field1744 / 2) + 271);
                arg0.method621(class19.field321, 382, var5, 16776960, 0);
                int var23 = var5 + 15;
                arg0.method621(class19.field322, 382, var23, 16776960, 0);
                int var24 = var23 + 15;
                arg0.method621(class19.field324, 382, var24, 16776960, 0);
                int var25 = var24 + 15;
                int var26 = var25 + 10;
                arg0.method607(class80.method548(new class37[] { class222.field4118, class93.method629(class19.field325) }, -107), 272, var26, 16777215, 0);
                int var28 = var26 + 15;
                arg0.method607(class80.method548(new class37[] { class218.field4071, class19.field326.method318((byte) 59) }, -75), 274, var28, 16777215, 0);
                int var29 = var28 + 15;
            }
            if (~class109.field1891 == -11) {
                class32.field648.method662(202, 171);
                if (~class242.field4442 == -1) {
                    short var6 = 251;
                    short var7 = 302;
                    short var8 = 291;
                    arg0.method621(class153.field2895, 382, var6, 16776960, 0);
                    class99.field1723.method662(var7 + -73, var8 + -20);
                    arg0.method620(class209.field3915, var7 + -73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var9 = 462;
                    class99.field1723.method662(var9 + -73, var8 + -20);
                    arg0.method620(class5.field58, var9 + -73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                    int var27 = var6 + 30;
                } else if (~class242.field4442 == -3) {
                    short var10 = 211;
                    arg0.method621(class19.field321, 382, var10, 16776960, 0);
                    short var11 = 302;
                    int var30 = var10 + 15;
                    arg0.method621(class19.field322, 382, var30, 16776960, 0);
                    short var12 = 321;
                    int var31 = var30 + 15;
                    arg0.method621(class19.field324, 382, var31, 16776960, 0);
                    boolean var13;
                    if (~class123.field2211 == -1 && ~(class203.field3758 % 40) > -21 && class224.field4155) {
                        var13 = true;
                    } else {
                        var13 = false;
                    }
                    var30 = var31 + 15;
                    var30 += 10;
                    arg0.method607(class80.method548(new class37[] { class222.field4118, class93.method629(class19.field325), !var13 ? class19.field323 : class215.field4018 }, -56), 272, var30, 16777215, 0);
                    boolean var14;
                    if (~class123.field2211 == -2 && ~(class203.field3758 % 40) > -21 && class224.field4155) {
                        var14 = true;
                    } else {
                        var14 = false;
                    }
                    var30 += 15;
                    arg0.method607(class80.method548(new class37[] { class218.field4071, class19.field326.method318((byte) 59), var14 ? class215.field4018 : class19.field323 }, -98), 274, var30, 16777215, 0);
                    var30 += 15;
                    class99.field1723.method662(var11 + -73, var12 + -20);
                    arg0.method621(class37.field786, var11, var12 + 5, 16777215, 0);
                    short var15 = 462;
                    class99.field1723.method662(var15 - 73, var12 + -20);
                    arg0.method621(class161.field3046, var15, var12 + 5, 16777215, 0);
                } else if (~class242.field4442 == -4) {
                    short var16 = 236;
                    short var17 = 382;
                    arg0.method621(class204.field3791, 382, 211, 16776960, 0);
                    short var18 = 321;
                    arg0.method621(class8.field88, 382, var16, 16777215, 0);
                    int var32 = var16 + 15;
                    arg0.method621(class77.field1349, 382, var32, 16777215, 0);
                    int var33 = var32 + 15;
                    arg0.method621(class198.field3699, 382, var33, 16777215, 0);
                    int var34 = var33 + 15;
                    arg0.method621(class102.field1757, 382, var34, 16777215, 0);
                    int var35 = var34 + 15;
                    class99.field1723.method662(var17 + -73, var18 + -20);
                    arg0.method621(class161.field3046, var17, var18 - -5, 16777215, 0);
                }
            }
            if (~class192.field3592 != -2) {
                if (~class200.field3732 < -1) {
                    class5.method39((byte) 120, class200.field3732);
                    class200.field3732 = 0;
                }
                class145.method1007(27442);
            }
            class144.field2758[!class167.field3190 ? 0 : 1].method662(725, 463);
            if (class109.field1891 > 5 && ~class107.field1876 != -3) {
                if (class102.field1755 == null) {
                    class102.field1755 = class97.method648(class127.field2364, class212.field3958, 0, 0);
                }
                if (class102.field1755 != null) {
                    byte var19 = 5;
                    short var20 = 463;
                    class102.field1755.method662(var19, var20);
                    byte var21 = 100;
                    byte var22 = 35;
                    arg0.method621(class80.method548(new class37[] { class205.field3806, class218.field4076, class151.method1034((byte) -9, class43.field918) }, -30), var21 / 2 + var19, var22 / 2 + var20 - 2, 16777215, 0);
                    if (class54.field1055 != null) {
                        arg1.method621(class83.field1469, var21 / 2 + var19, var22 / 2 + 12 + var20, 16777215, 0);
                        return;
                    }
                    arg1.method621(class76.field1343, var21 / 2 + var19, var22 / 2 + (var20 - -12), 16777215, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
    public static void method350(int arg0) {
        field804 = null;
        field803 = null;
        if (arg0 == -31116) {
            field805 = null;
            field801 = null;
            field792 = null;
            field798 = null;
            field794 = null;
            field806 = null;
            field795 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field800;
        int[] var3 = super.field405.method1461(arg1, (byte) -112);
        if (super.field405.field4114) {
            int[] var4 = this.method162(arg1 + -1 & class5.field44, 0, (byte) 18);
            int[] var5 = this.method162(arg1, 0, (byte) 18);
            int[] var6 = this.method162(class5.field44 & arg1 + 1, 0, (byte) 18);
            for (int var7 = 0; ~var7 > ~class199.field3705; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field796;
                int var9 = (var5[class215.field4008 & var7 - -1] - var5[var7 + -1 & class215.field4008]) * this.field796;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return arg0 != 0 ? null : var3;
    }
}
