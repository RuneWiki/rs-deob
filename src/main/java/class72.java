import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class72 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[I")
    public static int[] field1500 = new int[50];

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field1499 = 99;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "[I")
    public static int[] field1507 = new int[25];

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Lclient;")
    public static client field1506;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field1505;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[[B")
    public static byte[][] field1502;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V", line = 4)
    public static final void method550(int arg0, int arg1) {
        if (arg1 <= 3) {
            method551(105);
        }
        class2 var2 = class212.method1433(arg0, 9, -13802);
        var2.method16((byte) -89);
        field1514++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 35)
    public static final void method551(int arg0) {
        class71.method543();
        class204.field3313 = null;
        class189.field3070 = -1;
        class188.method1198(-116);
        class143.field2360.method2376(0);
        field1513++;
        class285.field4411 = new class15();
        ((class52) class284.field4393).method386(73);
        class145.method942();
        class310.field4711 = new class1[255];
        class310.field4719 = 0;
        class184.method1149();
        class60.method468();
        class230.method1526(24884);
        class225.method1489(false, (byte) -54);
        class220.method1467(arg0 ^ arg0);
        class70.method540((byte) 91);
        for (int var1 = 0; var1 < 2048; var1++) {
            class278 var2 = class97.field1715[var1];
            if (var2 != null) {
                var2.field1904 = null;
            }
        }
        if (class249.field3893) {
            class60.method463(104, 104);
            class321.method2234((byte) 126, class28.field539);
            class275.method1843();
        }
        class55.method431(false, class18.field330, class154.field2514);
        class50.method379((byte) 42, class154.field2514);
        class75.field1527 = null;
        class170.field2745 = null;
        class132.field2236 = null;
        class162.field2618 = null;
        class120.field2087 = null;
        if (class38.field730 == 5) {
            class122.method789((byte) 82, class154.field2514);
        }
        if (class38.field730 == 10) {
            class9.method82(71, false);
        }
        if (class38.field730 == 30) {
            class9.method79((byte) -101, 25);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 99)
    public static final String method552(long arg0, int arg1) {
        field1511++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % (long) arg1 == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class15.field279[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 141)
    public static void method553(byte arg0) {
        field1506 = null;
        field1502 = (byte[][]) null;
        field1505 = null;
        if (arg0 != 57) {
            method550(94, -42);
        }
        field1507 = null;
        field1500 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V", line = 159)
    public static final void method554(int arg0, int arg1) {
        class6.field133.method1883(arg0 ^ 0x7A0E8A67, arg1);
        field1508++;
        if (arg0 == 0) {
            class28.field533.method1883(2047773287, arg1);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)I", line = 172)
    public static final int method555(int arg0, int arg1, int arg2, int arg3) {
        field1509++;
        if ((class99.field1749[arg1][arg0][arg2] & 0x8) == arg3) {
            return arg1 <= 0 || (class99.field1749[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lkl;III)V", line = 195)
    public static final void method556(class68 arg0, int arg1, int arg2, int arg3) {
        field1504++;
        if (class48.field999 < 2 && class21.field447 == 0 && !class86.field1617) {
            return;
        }
        String var4 = class150.method979(-392039001);
        if (arg3 <= 54) {
            method551(5);
        }
        if (arg0 == null) {
            int var6 = class214.field3428.method2107(var4, arg2 + 4, arg1 - -15, 16777215, 0, class324.field4941, class46.field950);
            class25.method204((byte) -44, arg1, arg2 + 4, var6 + class214.field3428.method2118(var4), 15);
            return;
        }
        class312 var5 = arg0.method527(class344.field5343, -1);
        if (var5 == null) {
            var5 = class214.field3428;
        }
        var5.method2121(var4, arg2, arg1, arg0.field1416, arg0.field1414, arg0.field1355, arg0.field1299, arg0.field1446, arg0.field1397, class324.field4941, class46.field950, class116.field2035);
        class25.method204((byte) 105, class116.field2035[1], class116.field2035[0], class116.field2035[2], class116.field2035[3]);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lhm;II)V", line = 227)
    public static final void method557(class109 arg0, int arg1, int arg2) {
        field1503++;
        if (arg0.field1924 > class25.field494) {
            class317.method2185(arg0, 90);
        } else if (class25.field494 > arg0.field1909) {
            class190.method1218(52, arg0);
        } else {
            class153.method996(arg0, 7);
        }
        if (arg0.field1869 < 128 || arg0.field1872 < 128 || arg0.field1869 >= 13184 || arg0.field1872 >= 13184) {
            arg0.field1856 = -1;
            arg0.field1924 = 0;
            arg0.field1897 = -1;
            arg0.field1909 = 0;
            arg0.field1869 = arg0.field1871[0] * 128 + arg0.method710(-1) * 64;
            arg0.field1872 = arg0.field1899[0] * 128 + (arg0.method710(-1) * 64);
            arg0.method709(22440);
        }
        if (class66.field1265 == arg0 && (arg0.field1869 < 1536 || arg0.field1872 < 1536 || arg0.field1869 >= 11776 || arg0.field1872 >= 11776)) {
            arg0.field1909 = 0;
            arg0.field1924 = 0;
            arg0.field1856 = -1;
            arg0.field1897 = -1;
            arg0.field1869 = arg0.field1871[0] * 128 + arg0.method710(-1) * 64;
            arg0.field1872 = arg0.field1899[0] * 128 + (arg0.method710(-1) * 64);
            arg0.method709(22440);
        }
        class221.method1472(arg0, 1);
        if (arg1 == 0) {
            class31.method248(1373, arg0);
        }
    }
}
