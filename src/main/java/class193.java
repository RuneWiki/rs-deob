import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class193 extends class82 {

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    private int field3385;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "J")
    public static long field3382 = 0L;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "Ldj;")
    private static class44 field3381 = class89.method650(255, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "Ldj;")
    public static class44 field3378 = class89.method650(255, "blinken1:");

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "Ldj;")
    public static class44 field3383 = class89.method650(255, "http:)4)4www)3runescape)3com)4l=");

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "Ldj;")
    public static class44 field3387 = field3381;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "Lod;")
    public static class155 field3388;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "[I")
    public static int[] field3377;

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class193() {
        this(4096);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            method1238(-93, (class69) null, (class69) null);
        }
        if (arg1 == 0) {
            this.field3385 = (arg0.method506(255) << 12) / 255;
        }
        ++field3384;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field3380;
        if (arg0 != 25238) {
            field3382 = -28L;
        }
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            class18.method147(var3, 0, class129.field2287, this.field3385);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIBII)V")
    public static final void method1237(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 <= 82) {
            field3382 = -2L;
        }
        if (~class70.field1337 >= ~arg4 && arg0 <= class70.field1321 && ~arg5 <= ~class14.field267 && ~class57.field1068 <= ~arg1) {
            class190.method1195(arg5, (byte) -121, arg0, arg1, arg2, arg4);
        } else {
            class194.method1240(arg1, arg4, arg2, arg5, (byte) -2, arg0);
        }
        ++field3386;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILgb;Lgb;)V")
    public static final void method1238(int arg0, class69 arg1, class69 arg2) {
        ++field3379;
        if (class136.field2439) {
            class163.method1052(arg2, false, arg1);
        } else {
            if (class183.field3191 == 0 || ~class183.field3191 == -6) {
                byte var3 = 20;
                int var4 = -var3 + 253;
                arg1.method401(class108.field1970, 382, -var3 + 245, 16777215, -1);
                class99.method696(230, var4, 304, 34, 9179409);
                class99.method696(231, var4 + 1, 302, 32, 0);
                class99.method688(232, var4 + 2, class55.field1008 * 3, 30, 9179409);
                class99.method688(232 - -(class55.field1008 * 3), var4 + 2, 300 - class55.field1008 * 3, 30, 0);
                arg1.method401(class182.field3164, 382, -var3 + 276, 16777215, -1);
            }
            int var5 = -8 % ((arg0 - -69) / 33);
            if (~class183.field3191 == -21) {
                class103.field1878.method863(382 - class103.field1878.field2271 / 2, 271 - class103.field1878.field2269 / 2);
                short var6 = 211;
                arg1.method401(class182.field3163, 382, var6, 16776960, 0);
                int var24 = var6 + 15;
                arg1.method401(class182.field3172, 382, var24, 16776960, 0);
                int var25 = var24 + 15;
                arg1.method401(class182.field3170, 382, var25, 16776960, 0);
                int var26 = var25 + 15;
                int var27 = var26 + 10;
                arg1.method428(class70.method555(new class44[] { class4.field49, class56.method419(class182.field3177) }, -3), 272, var27, 16777215, 0);
                int var29 = var27 + 15;
                arg1.method428(class70.method555(new class44[] { class73.field1392, class182.field3167.method336((byte) -103) }, -3), 274, var29, 16777215, 0);
                int var30 = var29 + 15;
            }
            if (class183.field3191 == 10) {
                class103.field1878.method863(202, 171);
                if (class118.field2103 == 0) {
                    short var7 = 251;
                    short var8 = 302;
                    arg1.method401(class168.field2893, 382, var7, 16776960, 0);
                    short var9 = 291;
                    int var28 = var7 + 30;
                    class196.field3468.method863(var8 + -73, var9 + -20);
                    arg1.method403(class196.field3476, var8 + -73, var9 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var10 = 462;
                    class196.field3468.method863(var10 + -73, var9 + -20);
                    arg1.method403(class143.field2548, var10 - 73, var9 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (~class118.field2103 != -3) {
                    if (class118.field2103 == 3) {
                        short var11 = 236;
                        arg1.method401(class108.field1982, 382, 211, 16776960, 0);
                        short var12 = 382;
                        short var13 = 321;
                        arg1.method401(class178.field3060, 382, var11, 16777215, 0);
                        int var31 = var11 + 15;
                        arg1.method401(class3.field48, 382, var31, 16777215, 0);
                        int var32 = var31 + 15;
                        arg1.method401(class96.field1775, 382, var32, 16777215, 0);
                        int var33 = var32 + 15;
                        arg1.method401(class88.field1679, 382, var33, 16777215, 0);
                        int var34 = var33 + 15;
                        class196.field3468.method863(var12 + -73, var13 + -20);
                        arg1.method401(class105.field1929, var12, var13 + 5, 16777215, 0);
                    }
                } else {
                    short var14 = 302;
                    short var15 = 321;
                    short var16 = 211;
                    arg1.method401(class182.field3163, 382, var16, 16776960, 0);
                    int var35 = var16 + 15;
                    arg1.method401(class182.field3172, 382, var35, 16776960, 0);
                    int var36 = var35 + 15;
                    arg1.method401(class182.field3170, 382, var36, 16776960, 0);
                    boolean var17;
                    if (class94.field1747 == 0 && class46.field868 % 40 < 20 && class184.field3199) {
                        var17 = true;
                    } else {
                        var17 = false;
                    }
                    var35 = var36 + 15;
                    var35 += 10;
                    arg1.method428(class70.method555(new class44[] { class4.field49, class56.method419(class182.field3177), !var17 ? class182.field3174 : class46.field864 }, -3), 272, var35, 16777215, 0);
                    var35 += 15;
                    boolean var18;
                    if (class94.field1747 == 1 && ~(class46.field868 % 40) > -21 && class184.field3199) {
                        var18 = true;
                    } else {
                        var18 = false;
                    }
                    arg1.method428(class70.method555(new class44[] { class73.field1392, class182.field3167.method336((byte) -103), var18 ? class46.field864 : class182.field3174 }, -3), 274, var35, 16777215, 0);
                    var35 += 15;
                    class196.field3468.method863(var14 + -73, var15 - 20);
                    arg1.method401(class183.field3182, var14, var15 + 5, 16777215, 0);
                    short var19 = 462;
                    class196.field3468.method863(var19 + -73, var15 - 20);
                    arg1.method401(class105.field1929, var19, var15 - -5, 16777215, 0);
                }
            }
            if (class5.field60 != 1) {
                if (class208.field3740 > 0) {
                    class68.method547(1, class208.field3740);
                    class208.field3740 = 0;
                }
                class3.method22((byte) 99);
            }
            class53.field956[class102.field1871 ? 1 : 0].method863(725, 463);
            if (~class183.field3191 < -6 && class92.field1724 != 2) {
                if (class104.field1895 == null) {
                    class104.field1895 = class66.method527(class153.field2656, 0, (byte) -88, class48.field902);
                }
                if (class104.field1895 != null) {
                    byte var20 = 5;
                    short var21 = 463;
                    class104.field1895.method863(var20, var21);
                    byte var22 = 35;
                    byte var23 = 100;
                    arg1.method401(class70.method555(new class44[] { class212.field3807, class67.field1270, class199.method1287(class186.field3209, -1) }, -3), var23 / 2 + var20, var22 / 2 - 2 + var21, 16777215, 0);
                    if (class111.field2007 != null) {
                        arg2.method401(class150.field2614, var20 - -(var23 / 2), var22 / 2 + var21 - -12, 16777215, 0);
                        return;
                    }
                    arg2.method401(class1.field13, var23 / 2 + var20, var22 / 2 + 12 + var21, 16777215, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
    public static void method1239(int arg0) {
        field3378 = null;
        field3383 = null;
        if (arg0 != -9012) {
            method1237(8, -50, -46, (byte) -23, 63, 11);
        }
        field3377 = null;
        field3381 = null;
        field3388 = null;
        field3387 = null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
    private class193(int arg0) {
        super(0, true);
        this.field3385 = 4096;
        this.field3385 = arg0;
    }
}
