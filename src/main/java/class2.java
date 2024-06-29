import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[[S")
    public static short[][] field24 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lhe;")
    public static class54 field26 = class6.method58("_", false);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lhe;")
    public static class54 field22 = class6.method58("Clientscript error in: ", false);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
    public static int[] field25 = new int[32];

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lhe;")
    private static class54 field29 = class6.method58("No response from server)3", false);

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lhe;")
    public static class54 field33 = class6.method58("titlebox", false);

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field37 = 0;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Lhe;")
    public static class54 field34 = field29;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field36 = 0;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "J")
    public static long field23;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
    public static int[] field31;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILd;III)V")
    public static final void method7(int arg0, class22 arg1, int arg2, int arg3, int arg4) {
        field28++;
        if (class108.field2639 == arg1 || class67.field1641 >= 400) {
            return;
        }
        class54 var5;
        if (arg1.field619 == 0) {
            var5 = class143.method1105(new class54[] { arg1.field626, class31.method231(class108.field2639.field617, arg1.field617, (byte) -45), class43.field1106, class5.field168, class147.method1117(-80, arg1.field617), class62.field1505 }, -842);
        } else {
            var5 = class143.method1105(new class54[] { arg1.field626, class43.field1106, class43.field1097, class147.method1117(-73, arg1.field619), class62.field1505 }, arg0 - 31187);
        }
        if (class3.field76 == 1) {
            class27.method208(class143.method1105(new class54[] { class124.field2866, class54.field1335, var5 }, -842), arg3, arg2, 30, arg4, (byte) 91, class111.field2682);
            class7.field209++;
        } else if (!class141.field3216) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class138.field3154[var6] != null) {
                    class133.field3008++;
                    short var8 = 0;
                    if (class138.field3154[var6].method397(class112.field2685, (byte) -105)) {
                        if (class108.field2639.field617 < arg1.field617) {
                            var8 = 2000;
                        }
                        if (class108.field2639.field623 != 0 && arg1.field623 != 0) {
                            if (class108.field2639.field623 == arg1.field623) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class53.field1287[var6]) {
                        var8 = 2000;
                    }
                    boolean var9 = false;
                    int var10 = class95.field2417[var6] + var8;
                    class27.method208(class143.method1105(new class54[] { class51.field1226, var5 }, arg0 - 31187), arg3, arg2, var10, arg4, (byte) 116, class138.field3154[var6]);
                }
            }
        } else if ((class68.field1700 & 0x8) == 8) {
            class27.method208(class143.method1105(new class54[] { class8.field246, class54.field1335, var5 }, -842), arg3, arg2, 7, arg4, (byte) 32, class157.field3576);
            class88.field2178++;
        }
        for (int var7 = 0; var7 < class67.field1641; var7++) {
            if (class157.field3574[var7] == 35) {
                class34.field842[var7] = class143.method1105(new class54[] { class51.field1226, var5 }, -842);
                break;
            }
        }
        if (arg0 != 30345) {
            field26 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method8(int arg0) {
        class131.field2969.method454(71, 109);
        for (class112 var1 = (class112) class63.field1530.method245((byte) 60); var1 != null; var1 = (class112) class63.field1530.method244((byte) -25)) {
            if (var1.field2686 == 0 || var1.field2686 == 3) {
                class44.method330(-46, true, var1);
            }
        }
        if (arg0 < 120) {
            field29 = null;
        }
        field27++;
        if (class93.field2242 != null) {
            class134.method1005(class93.field2242, 0);
            class93.field2242 = null;
        }
        class19.field546++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILhe;Lhe;Lef;)Lce;")
    public static final class20 method9(int arg0, class54 arg1, class54 arg2, class35 arg3) {
        field32++;
        if (arg0 != 24094) {
            field26 = null;
        }
        int var4 = arg3.method273(arg2, 1);
        int var5 = arg3.method267(false, arg1, var4);
        return class128.method963(true, arg3, var5, var4);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
    public static final boolean method10(int arg0, int arg1) {
        if (arg0 >= -98) {
            field26 = null;
        }
        field35++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method11(int arg0) {
        field33 = null;
        field26 = null;
        field22 = null;
        field24 = null;
        field34 = null;
        if (arg0 == 4634) {
            field29 = null;
            field25 = null;
            field31 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Z")
    public static final boolean method12(int arg0, int arg1) {
        if (arg1 != 4626) {
            field33 = null;
        }
        field30++;
        return (arg0 >> 28 & 0x1) != 0;
    }
}
