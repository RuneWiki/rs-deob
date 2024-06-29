import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 extends class141 {

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field2025 = 0;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Ll;")
    public static class76 field2017 = new class76();

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lkd;")
    public static class73 field2030 = class126.method1070((byte) -66, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "B")
    public byte field2021;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "Lud;")
    public static class140 field2028;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Lde;")
    public static class27 field2019;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "Lkd;")
    public class73 field2015;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static final void method683(byte arg0) {
        field2023++;
        if (class87.field2198 != 0) {
            return;
        }
        if (arg0 != -113) {
            method689(null, 8, (byte) -27, null, -2);
        }
        class54.field1440[0] = class142.field3553;
        class74.field1921[0] = 1002;
        class129.field3262 = 1;
        if (class81.field2033 != -1) {
            class109.field2667 = -1;
            class24.field700 = -1;
            class132.method1102(0, (byte) -71, class31.field869, 765, class3.field161, 503, class81.field2033, 0, 0);
            class107.field2651 = class24.field700;
            class119.field3054 = class109.field2667;
            return;
        }
        class76.method663(-22982);
        class24.field700 = -1;
        class109.field2667 = -1;
        if (class31.field869 > 4 && class3.field161 > 4 && class31.field869 < 516 && class3.field161 < 338) {
            if (class52.field1393 == -1) {
                class12.method105(-64);
            } else {
                class132.method1102(4, (byte) -88, class31.field869, 516, class3.field161, 338, class52.field1393, 4, 0);
            }
        }
        boolean var1 = false;
        class119.field3054 = class109.field2667;
        class109.field2667 = -1;
        class107.field2651 = class24.field700;
        class24.field700 = -1;
        if (class31.field869 > 553 && class3.field161 > 205 && class31.field869 < 743 && class3.field161 < 466) {
            if (class105.field2624 != -1) {
                class132.method1102(205, (byte) -84, class31.field869, 743, class3.field161, 466, class105.field2624, 553, 1);
            } else if (class24.field683[class141.field3523] != -1) {
                class132.method1102(205, (byte) -125, class31.field869, 743, class3.field161, 466, class24.field683[class141.field3523], 553, 1);
            }
        }
        if (class24.field700 != class23.field671) {
            class23.field671 = class24.field700;
            class38.field1028 = true;
        }
        class24.field700 = -1;
        if (class24.field702 != class109.field2667) {
            class38.field1028 = true;
            class24.field702 = class109.field2667;
        }
        class109.field2667 = -1;
        if (class31.field869 > 17 && class3.field161 > 357 && class31.field869 < 496 && class3.field161 < 453) {
            if (class129.field3246 != -1) {
                class132.method1102(357, (byte) -116, class31.field869, 496, class3.field161, 453, class129.field3246, 17, 2);
            } else if (class11.field364 != -1) {
                class132.method1102(357, (byte) -74, class31.field869, 496, class3.field161, 453, class11.field364, 17, 3);
            } else if (class3.field161 < 434 && class31.field869 < 426) {
                class104.method834(class31.field869 - 17, class3.field161 + -357, -105);
            }
        }
        if ((class129.field3246 != -1 || class11.field364 != -1) && class24.field700 != class18.field517) {
            class132.field3304 = true;
            class18.field517 = class24.field700;
        }
        if ((class129.field3246 != -1 || class11.field364 != -1) && class133.field3351 != class109.field2667) {
            class133.field3351 = class109.field2667;
            class132.field3304 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class129.field3262 - 1; var2++) {
                if (class74.field1921[var2] < 1000 && class74.field1921[var2 + 1] > 1000) {
                    var1 = false;
                    class73 var3 = class54.field1440[var2];
                    class54.field1440[var2] = class54.field1440[var2 + 1];
                    class54.field1440[var2 + 1] = var3;
                    int var4 = class74.field1921[var2];
                    class74.field1921[var2] = class74.field1921[var2 + 1];
                    class74.field1921[var2 + 1] = var4;
                    int var5 = class118.field3013[var2];
                    class118.field3013[var2] = class118.field3013[var2 + 1];
                    class118.field3013[var2 + 1] = var5;
                    int var6 = class76.field1946[var2];
                    class76.field1946[var2] = class76.field1946[var2 + 1];
                    class76.field1946[var2 + 1] = var6;
                    int var7 = class14.field429[var2];
                    class14.field429[var2] = class14.field429[var2 + 1];
                    class14.field429[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lkd;ZILkd;III)V")
    public static final void method684(class73 arg0, boolean arg1, int arg2, class73 arg3, int arg4, int arg5, int arg6) {
        field2027++;
        if (arg1) {
            method690(6, 93);
        }
        if (class129.field3262 >= 500) {
            return;
        }
        if (arg0.method632((byte) -57) <= 0) {
            class54.field1440[class129.field3262] = arg3;
        } else {
            class54.field1440[class129.field3262] = class32.method258(-84, new class73[] { arg3, class136.field3382, arg0 });
        }
        class74.field1921[class129.field3262] = arg2;
        class14.field429[class129.field3262] = arg6;
        class118.field3013[class129.field3262] = arg4;
        class76.field1946[class129.field3262] = arg5;
        class129.field3262++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method685(int arg0) {
        field2013++;
        if (arg0 != 1) {
            field2019 = null;
        }
        class64.field1675.method534((byte) 59);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lq;IZLq;I)Lqd;")
    public static final class115 method686(class111 arg0, int arg1, boolean arg2, class111 arg3, int arg4) {
        field2020++;
        int[] var5 = arg0.method896((byte) 123, arg4);
        boolean var6 = true;
        for (int var7 = arg1; var7 < var5.length; var7++) {
            byte[] var8 = arg0.method890((byte) 122, arg4, var5[var7]);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg2) {
                    var10 = arg3.method890((byte) 124, 0, var9);
                } else {
                    var10 = arg3.method890((byte) 124, var9, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class115(arg0, arg3, arg4, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
    public static final void method687(byte arg0) {
        field2014++;
        for (class23 var1 = (class23) class141.field3505.method514((byte) -79); var1 != null; var1 = (class23) class141.field3505.method517(-83)) {
            if (var1.field668 != null) {
                class21.field575.method916(var1.field668);
                var1.field668 = null;
            }
            if (var1.field675 != null) {
                class21.field575.method916(var1.field675);
                var1.field675 = null;
            }
        }
        if (arg0 < -41) {
            class141.field3505.method509((byte) 81);
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)V")
    public static void method688(byte arg0) {
        field2017 = null;
        if (arg0 == 97) {
            field2028 = null;
            field2030 = null;
            field2019 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/Component;IBLw;I)Lha;")
    public static final class50 method689(Component arg0, int arg1, byte arg2, class148 arg3, int arg4) {
        if (arg2 != 32) {
            method686(null, 98, true, null, 97);
        }
        field2026++;
        if (class48.field1282 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class50 var5 = (class50) Class.forName("od").getDeclaredConstructor().newInstance();
                var5.field1344 = arg1;
                var5.field1319 = new int[(class20.field568 ? 2 : 1) * 256];
                var5.method412(arg0);
                var5.field1343 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field1343 > 16384) {
                    var5.field1343 = 16384;
                }
                var5.method403(var5.field1343);
                if (class62.field1623 > 0 && class102.field2536 == null) {
                    class102.field2536 = new class5();
                    arg3.method1176(class62.field1623, class102.field2536, (byte) 68);
                }
                if (class102.field2536 != null) {
                    if (class102.field2536.field181[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class102.field2536.field181[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class127 var6 = new class127(arg3, arg4);
                    var6.field1344 = arg1;
                    var6.field1319 = new int[(class20.field568 ? 2 : 1) * 256];
                    var6.method412(arg0);
                    var6.field1343 = 16384;
                    var6.method403(var6.field1343);
                    if (class62.field1623 > 0 && class102.field2536 == null) {
                        class102.field2536 = new class5();
                        arg3.method1176(class62.field1623, class102.field2536, (byte) -47);
                    }
                    if (class102.field2536 != null) {
                        if (class102.field2536.field181[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class102.field2536.field181[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class50();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Z")
    public static final boolean method690(int arg0, int arg1) {
        field2022++;
        if (class70.field1781[arg0]) {
            return true;
        } else if (class48.field1270.method895(arg1 ^ 0xFFFFF0F9, arg0)) {
            int var2 = class48.field1270.method889(arg1, arg0);
            if (var2 == 0) {
                class70.field1781[arg0] = true;
                return true;
            }
            if (class120.field3066[arg0] == null) {
                class120.field3066[arg0] = new class1[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class120.field3066[arg0][var3] == null) {
                    byte[] var4 = class48.field1270.method898((byte) -65, var3, arg0);
                    if (var4 != null) {
                        class120.field3066[arg0][var3] = new class1();
                        class120.field3066[arg0][var3].field45 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class120.field3066[arg0][var3].method4(new class114(var4), -30159);
                        } else {
                            class120.field3066[arg0][var3].method13(2, new class114(var4));
                        }
                    }
                }
            }
            class70.field1781[arg0] = true;
            return true;
        } else {
            return false;
        }
    }
}
