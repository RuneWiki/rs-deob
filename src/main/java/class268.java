import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class268 extends OutputStream {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[[S")
    public static short[][] field4795 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lcc;")
    private static class209 field4792 = class95.method669(105, "Unable to find ");

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lcc;")
    public static class209 field4798 = class95.method669(116, "Connexion perdue)3");

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field4800 = 20;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lcc;")
    public static class209 field4794 = field4792;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lta;")
    public static class255 field4797;

    @OriginalMember(owner = "client!rb", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4799++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method1824(byte arg0) {
        field4794 = null;
        field4792 = null;
        if (arg0 > -76) {
            field4794 = null;
        }
        field4797 = null;
        field4795 = null;
        field4798 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lji;B)V")
    public static final void method1825(class42 arg0, byte arg1) {
        field4796++;
        if (arg1 < 54) {
            field4798 = null;
        }
        int var2 = arg0.field715;
        if (var2 == 324) {
            if (class230.field4185 == -1) {
                class230.field4185 = arg0.field725;
                class158.field2888 = arg0.field780;
            }
            if (class88.field1742.field2588) {
                arg0.field725 = class230.field4185;
            } else {
                arg0.field725 = class158.field2888;
            }
        } else if (var2 == 325) {
            if (class230.field4185 == -1) {
                class158.field2888 = arg0.field780;
                class230.field4185 = arg0.field725;
            }
            if (class88.field1742.field2588) {
                arg0.field725 = class158.field2888;
            } else {
                arg0.field725 = class230.field4185;
            }
        } else if (var2 == 327) {
            arg0.field773 = 150;
            arg0.field748 = (int) (Math.sin((double) class163.field2968 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field798 = -1;
            arg0.field769 = 5;
        } else if (var2 == 328) {
            if (class223.field4069.field2140 == null) {
                arg0.field798 = 0;
            } else {
                arg0.field773 = 150;
                arg0.field748 = (int) (Math.sin((double) class163.field2968 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field769 = 5;
                arg0.field798 = ((int) class223.field4069.field2140.method1448(true) << 11) + 2047;
                arg0.field850 = class223.field4069.field1551;
                arg0.field815 = class223.field4069.field1519;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method1826(int arg0) {
        field4793++;
        if (class168.field3018 == 0) {
            return;
        }
        try {
            if (++class12.field231 > 1500) {
                if (class193.field3488 != null) {
                    class193.field3488.method1924(false);
                    class193.field3488 = null;
                }
                if (class284.field4982 >= 1) {
                    class8.field164 = -5;
                    class168.field3018 = 0;
                    return;
                }
                class168.field3018 = 1;
                class284.field4982++;
                if (class48.field928 == class16.field326) {
                    class48.field928 = class174.field3182;
                } else {
                    class48.field928 = class16.field326;
                }
                class12.field231 = 0;
            }
            if (class168.field3018 == 1) {
                class246.field4458 = class230.field4187.method994(class48.field928, -32322, class175.field3188);
                class168.field3018 = 2;
            }
            if (class168.field3018 == 2) {
                if (class246.field4458.field3646 == 2) {
                    throw new IOException();
                }
                if (class246.field4458.field3646 != 1) {
                    return;
                }
                class193.field3488 = new class285((Socket) class246.field4458.field3642, class230.field4187);
                class246.field4458 = null;
                class193.field3488.method1921(class84.field1677.field2108, class84.field1677.field2085, -32362, 0);
                if (class95.field1876 != null) {
                    class95.field1876.method66((byte) -59);
                }
                if (class227.field4148 != null) {
                    class227.field4148.method66((byte) -59);
                }
                int var1 = class193.field3488.method1918((byte) 105);
                if (class95.field1876 != null) {
                    class95.field1876.method66((byte) -59);
                }
                if (class227.field4148 != null) {
                    class227.field4148.method66((byte) -59);
                }
                if (var1 != 101) {
                    class168.field3018 = 0;
                    class8.field164 = var1;
                    class193.field3488.method1924(false);
                    class193.field3488 = null;
                    return;
                }
                class168.field3018 = 3;
            }
            if (class168.field3018 == 3) {
                if (class193.field3488.method1915(1) < 2) {
                    return;
                }
                int var2 = class193.field3488.method1918((byte) 89) << 8 | class193.field3488.method1918((byte) 77);
                class168.method1153(0, var2);
                if (class37.field646 == -1) {
                    class8.field164 = 6;
                    class168.field3018 = 0;
                    class193.field3488.method1924(false);
                    class193.field3488 = null;
                    return;
                }
                class168.field3018 = 0;
                class193.field3488.method1924(false);
                class193.field3488 = null;
                class59.method450(6362);
                return;
            }
        } catch (IOException var4) {
            if (class193.field3488 != null) {
                class193.field3488.method1924(false);
                class193.field3488 = null;
            }
            if (class284.field4982 >= 1) {
                class8.field164 = -4;
                class168.field3018 = 0;
            } else {
                if (class48.field928 == class16.field326) {
                    class48.field928 = class174.field3182;
                } else {
                    class48.field928 = class16.field326;
                }
                class168.field3018 = 1;
                class284.field4982++;
                class12.field231 = 0;
            }
        }
        int var3 = -110 % ((arg0 + 80) / 41);
    }
}
