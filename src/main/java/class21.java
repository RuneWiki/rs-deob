import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class21 extends class132 {

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "Z")
    public boolean field500 = false;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "Lvd;")
    public static class222 field502 = class212.method1357("titlebox", 10731);

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "Luc;")
    public static class211 field503 = new class211(5000);

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "Z")
    public static boolean field506 = false;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "Luc;")
    public static class211 field505 = new class211(5000);

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "[Lva;")
    public static class219[] field504;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lab;Lvd;ZLvd;)Lbg;")
    public static final class19 method201(class3 arg0, class222 arg1, boolean arg2, class222 arg3) {
        int var4 = arg0.method14(-32249, arg3);
        field501++;
        if (arg2) {
            int var5 = arg0.method30(arg1, var4, (byte) 104);
            return method204(var5, arg0, 19966, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method202(Component arg0, boolean arg1) {
        arg0.removeMouseListener(class176.field3301);
        field497++;
        arg0.removeMouseMotionListener(class176.field3301);
        arg0.removeFocusListener(class176.field3301);
        if (!arg1) {
            field496 = 23;
        }
        class107.field1981 = 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Ltg;")
    public static final class205 method203(int arg0, int arg1) {
        field499++;
        if (arg0 == 0) {
            return new class197();
        } else if (arg0 == 1) {
            return new class192();
        } else if (arg0 == 2) {
            return new class71();
        } else if (arg0 == 3) {
            return new class196();
        } else if (arg0 == 4) {
            return new class235();
        } else if (arg0 == 5) {
            return new class36();
        } else if (arg0 == 6) {
            return new class159();
        } else if (arg0 == 7) {
            return new class55();
        } else if (arg0 == 8) {
            return new class161();
        } else if (arg0 == 9) {
            return new class64();
        } else if (arg0 == 10) {
            return new class214();
        } else if (arg0 == 11) {
            return new class186();
        } else if (arg0 == 12) {
            return new class182();
        } else if (arg0 == 13) {
            return new class112();
        } else if (arg0 == 14) {
            return new class1();
        } else if (arg0 == 15) {
            return new class210();
        } else if (arg0 == 16) {
            return new class99();
        } else if (arg0 == 17) {
            return new class227();
        } else if (arg0 == 18) {
            return new class173();
        } else if (arg0 == 19) {
            return new class84();
        } else if (arg0 == 20) {
            return new class177();
        } else if (arg0 == 21) {
            return new class143();
        } else if (arg0 == 22) {
            return new class108();
        } else if (arg0 == 23) {
            return new class130();
        } else if (arg0 == 24) {
            return new class39();
        } else if (arg0 == 25) {
            return new class160();
        } else if (arg0 == 26) {
            return new class168();
        } else if (arg0 == 27) {
            return new class87();
        } else if (arg0 == 28) {
            return new class59();
        } else if (arg0 == 29) {
            return new class42();
        } else if (arg0 == 30) {
            return new class200();
        } else if (arg0 == 31) {
            return new class209();
        } else if (arg0 == 32) {
            return new class7();
        } else if (arg0 == 33) {
            return new class107();
        } else if (arg0 == 34) {
            return new class14();
        } else if (arg0 == 35) {
            return new class54();
        } else if (arg0 == 36) {
            return new class22();
        } else if (arg0 == 37) {
            return new class111();
        } else if (arg0 == 38) {
            return new class180();
        } else if (arg0 == 39) {
            return new class10();
        } else {
            if (arg1 != -1) {
                field503 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILab;II)Lbg;")
    public static final class19 method204(int arg0, class3 arg1, int arg2, int arg3) {
        field498++;
        if (class47.method344(arg1, arg0, -72, arg3)) {
            if (arg2 != 19966) {
                method206(76);
            }
            return class68.method465(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
    public static final void method205(byte arg0) {
        field495++;
        int var1 = class138.field2664.method900(class175.field3282);
        for (int var2 = 0; var2 < class172.field3227; var2++) {
            int var7 = class138.field2664.method900(client.method276((byte) 88, var2));
            if (var1 < var7) {
                var1 = var7;
            }
        }
        var1 += 8;
        class38.field834 = true;
        class192.field3543 = var1;
        int var3 = class172.field3227 * 15 + 21;
        int var4 = 20 / ((30 - arg0) / 36);
        class34.field735 = class172.field3227 * 15 + 22;
        int var5 = class64.field1168 - var1 / 2;
        if (var5 + var1 > class70.field1315) {
            var5 = class70.field1315 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class217.field4034 = var5;
        int var6 = class153.field2938;
        if (var6 + var3 > class122.field2321) {
            var6 = class122.field2321 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        class222.field4140 = var6;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V")
    public static void method206(int arg0) {
        field503 = null;
        field504 = null;
        field505 = null;
        if (arg0 == -35) {
            field502 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
    public static final void method207(int arg0) {
        field494++;
        int var1 = class175.field3287 - (int) ((double) class228.field4275.field341 / class229.field4313);
        int var2 = class122.field2334 - (int) ((double) class228.field4275.field245 / class229.field4313);
        int var3 = (int) ((double) class228.field4275.field245 / class229.field4313) + class122.field2334;
        if (arg0 != -1) {
            return;
        }
        int var4 = (int) ((double) class228.field4275.field341 / class229.field4313) + class175.field3287;
        if (var1 < 0) {
            class218.field4052 = -1;
            class175.field3287 = (int) ((double) class228.field4275.field341 / class229.field4313);
            class121.field2314 = -1;
        }
        if (class99.field1862 < var4) {
            class175.field3287 = class99.field1862 - (int) ((double) class228.field4275.field341 / class229.field4313);
            class218.field4052 = -1;
            class121.field2314 = -1;
        }
        if (var2 < 0) {
            class122.field2334 = (int) ((double) class228.field4275.field245 / class229.field4313);
            class218.field4052 = -1;
            class121.field2314 = -1;
        }
        if (var3 > class38.field852) {
            class121.field2314 = -1;
            class122.field2334 = class38.field852 - (int) ((double) class228.field4275.field245 / class229.field4313);
            class218.field4052 = -1;
        }
    }
}
