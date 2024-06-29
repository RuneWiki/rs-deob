import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class96 {

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "Luj;")
    public class141 field23;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "Z")
    public static boolean field14 = false;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "Lna;")
    public static class26 field18 = class69.method505("", (byte) -117);

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "Lna;")
    public static class26 field19 = field18;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "[Z")
    public static boolean[] field21 = new boolean[100];

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "Lna;")
    public static class26 field22 = field18;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "[[B")
    public static byte[][] field15;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V", line = 5)
    public static final void method9(int arg0) {
        field13++;
        if (class82.field1328 == null) {
            return;
        }
        if (class109.field1725 < 10) {
            if (!class74.field1135.method1883((byte) -83, class82.field1328.field1047)) {
                class109.field1725 = class37.field610.method1872(22813, class82.field1328.field1047) / 10;
                return;
            }
            class114.method794(arg0 ^ 0x5696);
            class109.field1725 = 10;
        }
        if (class109.field1725 == 10) {
            class135.field2057 = class82.field1328.field1038 >> 6 << 6;
            class9.field111 = class82.field1328.field1048 >> 6 << 6;
            class317.field5436 = (class82.field1328.field1030 >> 6 << 6) + 64 - class9.field111;
            class38.field623 = (class82.field1328.field1045 >> 6 << 6) + 64 - class135.field2057;
            if (class82.field1328.field1049 == 37) {
                class229.field3640 = 3.0F;
                class324.field5568 = 3.0F;
            } else if (class82.field1328.field1049 == 50) {
                class229.field3640 = 4.0F;
                class324.field5568 = 4.0F;
            } else if (class82.field1328.field1049 == 75) {
                class229.field3640 = 6.0F;
                class324.field5568 = 6.0F;
            } else if (class82.field1328.field1049 == 100) {
                class229.field3640 = 8.0F;
                class324.field5568 = 8.0F;
            } else if (class82.field1328.field1049 == 200) {
                class229.field3640 = 16.0F;
                class324.field5568 = 16.0F;
            } else {
                class229.field3640 = 8.0F;
                class324.field5568 = 8.0F;
            }
            int var1 = (class13.field221.field3962 >> 7) + class12.field157 - class135.field2057;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class9.field111 + class317.field5436 - (class13.field221.field3972 >> 7) - class165.field2568 - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && class38.field623 > var2 && var4 >= 0 && var4 < class317.field5436) {
                class118.field1860 = var2;
                class69.field1069 = var4;
            } else {
                class69.field1069 = class9.field111 + class317.field5436 - class82.field1328.field1039 * 64 - 1;
                class118.field1860 = class82.field1328.field1044 * 64 - class135.field2057;
            }
            class265.method1868((byte) 87);
            class124.field1924 = new int[class29.field497 + 1];
            int var5 = class317.field5436 >> 6;
            int var6 = class38.field623 >> 6;
            class35.field578 = new byte[var6][var5][];
            int var7 = class292.field4853 >> 2 << 10;
            class260.field4257 = new byte[var6][var5][];
            class229.field3631 = new int[var6][var5][];
            class236.field3770 = new byte[var6][var5][];
            class189.field2970 = new int[var6][var5][];
            class315.field5386 = new byte[var6][var5][];
            int var8 = class150.field2343 >> 1;
            class263.field4310 = new byte[var6][var5][];
            class167.field2588 = new int[var6][var5][];
            class260.method1835(-120, var8, var7);
            class109.field1725 = 20;
        } else if (class109.field1725 == 20) {
            class316.method2190((byte) 105, new class82(class74.field1135.method1879(0, class145.field2201, class82.field1328.field1047)));
            class109.field1725 = 30;
            class205.method1383((byte) -90, true);
            class196.method1321(true);
        } else {
            if (arg0 != 64) {
                method11(-40, -12, 40, (class159) null);
            }
            if (class109.field1725 == 30) {
                class211.method1414(new class82(class74.field1135.method1879(0, class163.field2537, class82.field1328.field1047)), false);
                class109.field1725 = 40;
                class196.method1321(true);
            } else if (class109.field1725 == 40) {
                class126.method859(-21774, new class82(class74.field1135.method1879(0, class46.field735, class82.field1328.field1047)));
                class109.field1725 = 50;
                class196.method1321(true);
            } else if (class109.field1725 == 50) {
                class145.method961((byte) -83, new class82(class74.field1135.method1879(arg0 - 64, class164.field2543, class82.field1328.field1047)));
                class109.field1725 = 60;
                class205.method1383((byte) -90, true);
                class196.method1321(true);
            } else if (class109.field1725 == 60) {
                if (class74.field1135.method1891(class236.method1587(new class26[] { class82.field1328.field1047, class107.field1691 }, (byte) -107), -106)) {
                    if (!class74.field1135.method1883((byte) -83, class236.method1587(new class26[] { class82.field1328.field1047, class107.field1691 }, (byte) -71))) {
                        return;
                    }
                    class298.field5133 = class138.method927(arg0 - 120, class236.method1587(new class26[] { class82.field1328.field1047, class107.field1691 }, (byte) -91), class74.field1135);
                } else {
                    class298.field5133 = new class12(0);
                }
                class109.field1725 = 70;
                class196.method1321(true);
            } else if (class109.field1725 == 70) {
                class51.field796 = new class242(11, true, class250.field4085);
                class109.field1725 = 73;
                class205.method1383((byte) -90, true);
                class196.method1321(true);
            } else if (class109.field1725 == 73) {
                class285.field4786 = new class242(12, true, class250.field4085);
                class109.field1725 = 76;
                class205.method1383((byte) -90, true);
                class196.method1321(true);
            } else if (class109.field1725 == 76) {
                class67.field1054 = new class242(14, true, class250.field4085);
                class109.field1725 = 79;
                class205.method1383((byte) -90, true);
                class196.method1321(true);
            } else if (class109.field1725 == 79) {
                class36.field584 = new class242(17, true, class250.field4085);
                class109.field1725 = 82;
                class205.method1383((byte) -90, true);
                class196.method1321(true);
            } else if (class109.field1725 == 82) {
                class298.field5136 = new class242(19, true, class250.field4085);
                class109.field1725 = 85;
                class205.method1383((byte) -90, true);
                class196.method1321(true);
            } else if (class109.field1725 == 85) {
                class36.field599 = new class242(22, true, class250.field4085);
                class109.field1725 = 88;
                class205.method1383((byte) -90, true);
                class196.method1321(true);
            } else if (class109.field1725 == 88) {
                class154.field2410 = new class242(26, true, class250.field4085);
                class109.field1725 = 91;
                class205.method1383((byte) -90, true);
                class196.method1321(true);
            } else {
                class228.field3606 = new class242(30, true, class250.field4085);
                class109.field1725 = 100;
                class205.method1383((byte) -90, true);
                class196.method1321(true);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Luj;)V", line = 263)
    public class2(class141 arg0) {
        this.field23 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(B)V", line = 274)
    public static void method10(byte arg0) {
        if (arg0 > -112) {
            return;
        }
        field22 = null;
        field19 = null;
        field15 = (byte[][]) null;
        field18 = null;
        field21 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILe;)V", line = 289)
    public static final void method11(int arg0, int arg1, int arg2, class159 arg3) {
        field20++;
        if (arg0 != 0) {
            field21 = (boolean[]) null;
        }
        if (arg3.field3908 == arg2 && arg2 != -1) {
            class249 var4 = client.method1731(arg2, (byte) -20);
            int var5 = var4.field4045;
            if (var5 == 1) {
                arg3.field3971 = arg1;
                arg3.field3895 = 0;
                arg3.field3913 = 1;
                arg3.field3976 = 0;
                arg3.field3910 = 0;
                class285.method2020(arg3.field3972, var4, arg0 + 183921384, arg3.field3962, class13.field221 == arg3, arg3.field3976);
            }
            if (var5 == 2) {
                arg3.field3910 = 0;
            }
        } else if (arg2 == -1 || arg3.field3908 == -1 || client.method1731(arg2, (byte) -20).field4060 >= client.method1731(arg3.field3908, (byte) -20).field4060) {
            arg3.field3913 = 1;
            arg3.field3976 = 0;
            arg3.field3971 = arg1;
            arg3.field3954 = arg3.field3959;
            arg3.field3910 = 0;
            arg3.field3895 = 0;
            arg3.field3908 = arg2;
            if (arg3.field3908 != -1) {
                class285.method2020(arg3.field3972, client.method1731(arg3.field3908, (byte) -20), 183921384, arg3.field3962, class13.field221 == arg3, arg3.field3976);
            }
        }
    }
}
