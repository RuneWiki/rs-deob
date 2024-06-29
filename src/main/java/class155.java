import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class155 {

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Z")
    public boolean field2835 = true;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public int field2837 = 0;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public int field2834 = -1;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public int field2849 = -1;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Lsg;")
    public static class162 field2831 = new class162();

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "[[S")
    public static short[][] field2839 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "Z")
    public static volatile boolean field2841 = true;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field2847 = 100;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lcc;")
    public static class209 field2848 = class95.method669(116, ":tradereq:");

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lcc;")
    public static class209 field2844 = class95.method669(91, "ondulation2:");

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "Lcc;")
    public static class209 field2846 = class95.method669(125, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "Lcc;")
    public static class209 field2850 = class95.method669(122, "1");

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Ldg;")
    public static class139 field2842;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILtf;I)V")
    private final void method1083(int arg0, int arg1, class106 arg2, int arg3) {
        if (arg0 == 1) {
            this.field2837 = class63.method472(17680, arg2.method776(127));
        } else if (arg0 == 2) {
            this.field2834 = arg2.method774((byte) 109);
        } else if (arg0 == 3) {
            this.field2834 = arg2.method736(121);
            if (this.field2834 == 65535) {
                this.field2834 = -1;
            }
        } else if (arg0 == 5) {
            this.field2835 = false;
        } else if (arg0 == 7) {
            this.field2849 = class63.method472(17680, arg2.method776(121));
        } else if (arg0 == 8) {
            class138.field2593 = arg3;
        } else if (arg0 == 9) {
            arg2.method736(125);
        } else if (arg0 != 10) {
            if (arg0 == 11) {
                arg2.method774((byte) 75);
            } else if (arg0 != 12) {
                if (arg0 == 13) {
                    arg2.method776(126);
                } else if (arg0 == 14) {
                    arg2.method774((byte) 84);
                }
            }
        }
        if (arg1 < 125) {
            method1084(57);
        }
        field2840++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method1084(int arg0) {
        field2848 = null;
        field2831 = null;
        field2844 = null;
        field2839 = null;
        field2850 = null;
        field2842 = null;
        if (arg0 != 28) {
            field2846 = null;
        }
        field2846 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I")
    public static final int method1085(int arg0, int arg1, int arg2) {
        class75 var3 = (class75) class31.field554.method1755((long) arg0, (byte) -128);
        if (arg2 != -8149) {
            field2848 = null;
        }
        field2836++;
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field1403.length > arg1) {
            return var3.field1403[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([Ljb;[Lij;Lsj;[Lij;[Lij;[Lij;B)V")
    public static final void method1086(class269[] arg0, class194[] arg1, class49 arg2, class194[] arg3, class194[] arg4, class194[] arg5, byte arg6) {
        class134.field2550 = arg3;
        field2832++;
        class1.field1 = arg1;
        if (arg6 != 94) {
            method1090((byte) 8, (class49) null, 49);
        }
        class191.field3467 = arg0;
        class39.field667 = arg2;
        class190.field3438 = arg4;
        class165.field2991 = arg5;
        class21.field396.method1117((byte) 81);
        int var7 = class39.field667.method364(arg6 ^ 0xFFFFFFA1, class53.field1041);
        int[] var8 = class39.field667.method357((byte) -71, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class21.field396.method1123(class172.method1190((byte) 41, new class106(class39.field667.method353(var8[var9], arg6 ^ 0xFFFFFFAC, var7))), (byte) -128);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lsj;IIB)Lal;")
    public static final class231 method1087(class49 arg0, int arg1, int arg2, byte arg3) {
        field2838++;
        if (class117.method833(arg2, arg0, 896, arg1)) {
            if (arg3 >= -5) {
                method1084(-87);
            }
            return class178.method1231(-63);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
    public static final void method1088(int arg0, int arg1) {
        field2830++;
        if (class284.field5008 == arg0) {
            return;
        }
        if (class284.field5008 == 0) {
            class48.method346(44);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 40) {
            class59.method450(6362);
        }
        if (arg1 != -3280) {
            field2848 = null;
        }
        if (arg0 != 40 && class171.field3134 != null) {
            class171.field3134.method1924(false);
            class171.field3134 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class170.field3122 = 1;
            class261.field4700 = 0;
            class185.field3333 = 0;
            class137.field2576 = 0;
            class137.field2585 = 1;
            class284.method1913(true, (byte) -17);
        }
        if (arg0 == 25 || arg0 == 10) {
            class178.method1227(-24327);
        }
        if (arg0 == 5) {
            class163.method1131(0, class53.field1056);
        } else {
            class211.method1495(arg1 ^ 0xFFFFF3CF);
        }
        boolean var3 = class284.field5008 == 5 || class284.field5008 == 10 || class284.field5008 == 28;
        if (var2 != var3) {
            if (var2) {
                class59.field1184 = class117.field2350;
                if (class258.field4662 == 0) {
                    class174.method1197(104, 2);
                } else {
                    class185.method1258(false, class279.field4902, class117.field2350, 255, 0, 2, -123);
                }
                class265.field4759.method1382(-123, false);
            } else {
                class174.method1197(96, 2);
                class265.field4759.method1382(-127, true);
            }
        }
        class284.field5008 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZLtf;)V")
    public final void method1089(int arg0, boolean arg1, class106 arg2) {
        if (!arg1) {
            field2839 = null;
        }
        while (true) {
            int var4 = arg2.method774((byte) 107);
            if (var4 == 0) {
                field2833++;
                return;
            }
            this.method1083(var4, 127, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLsj;I)[Lij;")
    public static final class194[] method1090(byte arg0, class49 arg1, int arg2) {
        if (arg0 > -85) {
            field2848 = null;
        }
        field2829++;
        return class280.method1891(false, arg1, arg2) ? class176.method1214((byte) 87) : null;
    }
}
