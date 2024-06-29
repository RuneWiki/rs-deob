import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class22 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field512 = 0;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lgg;")
    private static class63 field514 = class116.method911(43, "Loading config )2 ");

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lgg;")
    private static class63 field522 = class116.method911(43, "Attack");

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lgg;")
    public static class63 field520 = field522;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lgg;")
    private static class63 field526 = class116.method911(43, "Loaded interfaces");

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lgg;")
    public static class63 field518 = field526;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Lgg;")
    public static class63 field527 = field514;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lgg;")
    public static class63 field528 = class116.method911(43, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lna;")
    public static class118 field525 = new class118(0, 0);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lve;")
    public static class194 field516;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lhf;")
    public static class71 field523;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method225(int arg0) {
        field515++;
        if (!class188.field3796) {
            class196.field3924[0] = 1004;
            class106.field2414[0] = class103.field2374;
            class166.field3404 = 1;
            class84.field2003[0] = class151.field3175;
        }
        if (class130.field2836 != -1) {
            class191.method1259((byte) 126, class130.field2836);
        }
        for (int var1 = 0; var1 < class202.field4005; var1++) {
            if (class135.field2927[var1]) {
                class60.field1523[var1] = true;
            }
            class11.field254[var1] = class135.field2927[var1];
            class135.field2927[var1] = false;
        }
        class142.field3048 = class173.field3571;
        class167.field3464 = -1;
        class43.field1044 = -1;
        class13.field307 = null;
        if (class130.field2836 != -1) {
            class202.field4005 = 0;
            class180.method1199(503, 0, 765, -1, 0, 0, 0, 0, class130.field2836);
        }
        class178.method1190();
        class26.method258(arg0 + 30607);
        if (arg0 != -30606) {
            method225(-79);
        }
        if (class188.field3796) {
            class111.method887(true);
        } else if (class167.field3464 != -1) {
            class171.method1151(class43.field1044, -4, class167.field3464);
        }
        if (class12.field279 == 3) {
            for (int var2 = 0; var2 < class202.field4005; var2++) {
                if (class11.field254[var2]) {
                    class178.method1193(class27.field606[var2], class110.field2481[var2], class97.field2307[var2], class98.field2322[var2], 16711935, 128);
                } else if (class60.field1523[var2]) {
                    class178.method1193(class27.field606[var2], class110.field2481[var2], class97.field2307[var2], class98.field2322[var2], 16711680, 128);
                }
            }
        }
        class30.method302(class3.field72.field1141, 109, class112.field2528, class3.field72.field1144, class131.field2852);
        class131.field2852 = 0;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static void method226(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field516 = null;
        field525 = null;
        field528 = null;
        field522 = null;
        field527 = null;
        field523 = null;
        field520 = null;
        field514 = null;
        field526 = null;
        field518 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Leh;I)V")
    public static final void method227(class47 arg0, int arg1) {
        field517++;
        arg0.field1162 = false;
        if (arg1 != -2) {
            method226(127);
        }
        if (arg0.field1108 != -1) {
            class9 var2 = class49.method480(1000, arg0.field1108);
            if (var2 == null || var2.field219 == null) {
                arg0.field1108 = -1;
            } else {
                arg0.field1103++;
                if (arg0.field1119 < var2.field219.length && arg0.field1103 > var2.field201[arg0.field1119]) {
                    arg0.field1103 = 1;
                    arg0.field1119++;
                    class131.method967(arg0.field1144, arg0.field1141, arg1 ^ 0x4DD5FF9A, class3.field72 == arg0, arg0.field1119, var2);
                }
                if (var2.field219.length <= arg0.field1119) {
                    arg0.field1103 = 0;
                    arg0.field1119 = 0;
                    class131.method967(arg0.field1144, arg0.field1141, -1305870236, class3.field72 == arg0, arg0.field1119, var2);
                }
            }
        }
        if (arg0.field1135 != -1 && arg0.field1150 <= class173.field3571) {
            if (arg0.field1114 < 0) {
                arg0.field1114 = 0;
            }
            int var3 = class19.method198(111, arg0.field1135).field1076;
            if (var3 == -1) {
                arg0.field1135 = -1;
            } else {
                class9 var4 = class49.method480(arg1 ^ 0xFFFFFC16, var3);
                if (var4 == null || var4.field219 == null) {
                    arg0.field1135 = -1;
                } else {
                    arg0.field1128++;
                    if (arg0.field1114 < var4.field219.length && arg0.field1128 > var4.field201[arg0.field1114]) {
                        arg0.field1128 = 1;
                        arg0.field1114++;
                        class131.method967(arg0.field1144, arg0.field1141, arg1 ^ 0x4DD5FF9A, class3.field72 == arg0, arg0.field1114, var4);
                    }
                    if (arg0.field1114 >= var4.field219.length) {
                        arg0.field1135 = -1;
                    }
                }
            }
        }
        if (arg0.field1167 != -1 && arg0.field1152 <= 1) {
            class9 var5 = class49.method480(1000, arg0.field1167);
            if (var5.field195 == 1 && arg0.field1155 > 0 && arg0.field1126 <= class173.field3571 && class173.field3571 > arg0.field1140) {
                arg0.field1152 = 1;
                return;
            }
        }
        if (arg0.field1167 != -1 && arg0.field1152 == 0) {
            class9 var6 = class49.method480(1000, arg0.field1167);
            if (var6 == null || var6.field219 == null) {
                arg0.field1167 = -1;
            } else {
                arg0.field1121++;
                if (var6.field219.length > arg0.field1097 && var6.field201[arg0.field1097] < arg0.field1121) {
                    arg0.field1097++;
                    arg0.field1121 = 1;
                    class131.method967(arg0.field1144, arg0.field1141, -1305870236, class3.field72 == arg0, arg0.field1097, var6);
                }
                if (arg0.field1097 >= var6.field219.length) {
                    arg0.field1112++;
                    arg0.field1097 -= var6.field215;
                    if (arg0.field1112 >= var6.field216) {
                        arg0.field1167 = -1;
                    } else if (arg0.field1097 >= 0 && arg0.field1097 < var6.field219.length) {
                        class131.method967(arg0.field1144, arg0.field1141, -1305870236, class3.field72 == arg0, arg0.field1097, var6);
                    } else {
                        arg0.field1167 = -1;
                    }
                }
                arg0.field1162 = var6.field221;
            }
        }
        if (arg0.field1152 > 0) {
            arg0.field1152--;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZIIZ)Lmc;")
    public static final class111 method228(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field513++;
        class71 var5 = null;
        if (class80.field1941 != null) {
            var5 = new class71(arg2, class80.field1941, class63.field1617[arg2], 1000000);
        }
        return arg3 == -13677 ? new class111(var5, field523, arg2, arg0, arg4, arg1) : null;
    }
}
