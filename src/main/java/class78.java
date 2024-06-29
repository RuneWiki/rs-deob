import java.awt.Component;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class78 implements Runnable {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "B")
    public static byte field1507 = 0;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Loc;")
    public static class151 field1509 = class137.method873(2, "(U");

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Loc;")
    public static class151 field1512 = class137.method873(2, "null");

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1516 = Calendar.getInstance();

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[[B")
    public static byte[][] field1520 = new byte[1000][];

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Z")
    public static boolean field1513;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[[[B")
    public static byte[][][] field1508;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method503(int arg0) {
        field1520 = null;
        field1512 = null;
        field1508 = null;
        field1509 = null;
        if (arg0 != -91) {
            field1512 = null;
        }
        field1516 = null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Z")
    public static final boolean method504(int arg0) {
        field1517++;
        class123 var1 = class139.field2545;
        synchronized (class139.field2545) {
            if (class148.field2654 == class117.field2114) {
                return false;
            } else {
                class38.field782 = class223.field3873[class148.field2654];
                class41.field855 = class93.field1745[class148.field2654];
                class148.field2654 = class148.field2654 + 1 & 0x7F;
                return arg0 > -38 ? true : true;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILjava/awt/Component;I)Lse;")
    public static final class193 method505(byte arg0, int arg1, Component arg2, int arg3) {
        field1519++;
        try {
            if (arg0 != 111) {
                field1510 = -81;
            }
            Class var4 = Class.forName("ja");
            class193 var5 = (class193) var4.getDeclaredConstructor().newInstance();
            var5.method522(arg1, arg3, arg2, (byte) 114);
            return var5;
        } catch (Throwable var7) {
            class83 var6 = new class83();
            var6.method522(arg1, arg3, arg2, (byte) -98);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hb", name = "run", descriptor = "()V")
    public final void run() {
        field1515++;
        try {
            while (true) {
                class218 var1 = class144.field2600;
                class220 var2;
                synchronized (class144.field2600) {
                    var2 = (class220) class144.field2600.method1358(-29726);
                }
                if (var2 == null) {
                    class156.method1027(0, 100L);
                    Object var3 = class224.field3898;
                    synchronized (class224.field3898) {
                        if (class237.field4412 <= 1) {
                            class237.field4412 = 0;
                            class224.field3898.notifyAll();
                            return;
                        }
                        class237.field4412--;
                    }
                } else {
                    if (var2.field3825 == 0) {
                        var2.field3821.method467(var2.field3822, var2.field3822.length, (int) var2.field1881, -30550);
                        class218 var4 = class144.field2600;
                        synchronized (class144.field2600) {
                            var2.method636(127);
                        }
                    } else if (var2.field3825 == 1) {
                        var2.field3822 = var2.field3821.method468((int) var2.field1881, 88);
                        class218 var5 = class144.field2600;
                        synchronized (class144.field2600) {
                            class169.field3088.method1361(var2, (byte) 71);
                        }
                    }
                    Object var6 = class224.field3898;
                    synchronized (class224.field3898) {
                        if (class237.field4412 <= 1) {
                            class237.field4412 = 0;
                            class224.field3898.notifyAll();
                            return;
                        }
                        class237.field4412 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class123.method746(var17, null, -12134);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Z")
    public static final boolean method506(boolean arg0, int arg1) {
        if (arg0) {
            field1513 = false;
        }
        field1514++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
    public static final void method507(byte arg0, int arg1) {
        if (arg1 == -3) {
            class203.method1286(class223.field3869, -28588, class235.field4359, class123.field2193);
        } else if (arg1 == -2) {
            class203.method1286(class27.field579, -28588, class235.field4366, class235.field4337);
        } else if (arg1 == -1) {
            class203.method1286(class223.field3868, -28588, class235.field4364, class14.field321);
        } else if (arg1 == 3) {
            class203.method1286(class165.field2969, -28588, class235.field4368, class235.field4338);
        } else if (arg1 == 4) {
            class203.method1286(class58.field1159, arg0 ^ 0xFFFF900B, class235.field4336, class142.field2567);
        } else if (arg1 == 5) {
            class203.method1286(class45.field940, arg0 ^ 0xFFFF900B, class235.field4373, class180.field3259);
        } else if (arg1 == 6) {
            class203.method1286(class235.field4365, -28588, class235.field4367, class177.field3202);
        } else if (arg1 == 7) {
            class203.method1286(class182.field3289, -28588, class235.field4360, class29.field610);
        } else if (arg1 == 8) {
            class203.method1286(class63.field1238, -28588, class235.field4345, class175.field3166);
        } else if (arg1 == 9) {
            class203.method1286(class43.field894, arg0 ^ 0xFFFF900B, class235.field4371, class200.field3547);
        } else if (arg1 == 10) {
            class203.method1286(class157.field2843, -28588, class235.field4351, class175.field3173);
        } else if (arg1 == 11) {
            class203.method1286(class33.field669, -28588, class235.field4339, class36.field734);
        } else if (arg1 == 12) {
            class203.method1286(class226.field3934, -28588, class235.field4350, class101.field1832);
        } else if (arg1 == 13) {
            class203.method1286(class223.field3866, -28588, class235.field4349, class115.field2074);
        } else if (arg1 == 14) {
            class203.method1286(class223.field3872, -28588, class235.field4357, class111.field1960);
        } else if (arg1 == 16) {
            class203.method1286(class52.field1048, -28588, class235.field4375, class193.field3462);
        } else if (arg1 == 17) {
            class203.method1286(class8.field123, -28588, class235.field4378, class108.field1899);
        } else if (arg1 == 18) {
            class203.method1286(class187.field3326, -28588, class235.field4377, class236.field4385);
        } else if (arg1 == 19) {
            class203.method1286(class93.field1747, -28588, class182.field3286, class166.field3036);
        } else if (arg1 == 20) {
            class203.method1286(class223.field3874, -28588, class235.field4342, class192.field3445);
        } else if (arg1 == 22) {
            class203.method1286(class2.field60, -28588, class235.field4372, class104.field1873);
        } else if (arg1 == 23) {
            class203.method1286(class223.field3888, arg0 - 28683, class235.field4344, class99.field1787);
        } else if (arg1 == 24) {
            class203.method1286(class109.field1939, arg0 ^ 0xFFFF900B, class235.field4352, class159.field2858);
        } else if (arg1 == 25) {
            class203.method1286(class223.field3890, -28588, class235.field4353, class64.field1250);
        } else if (arg1 == 26) {
            class203.method1286(class22.field489, -28588, class235.field4376, class162.field2935);
        } else if (arg1 == 27) {
            class203.method1286(class174.field3148, -28588, class235.field4361, class235.field4363);
        } else {
            class203.method1286(class223.field3865, -28588, class235.field4355, class181.field3270);
        }
        class137.method871(10, (byte) 124);
        if (arg0 != 95) {
            field1509 = null;
        }
        field1518++;
    }
}
