import java.awt.Component;
import java.awt.Frame;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class414 {

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public int field5785 = 2048;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public int field5784 = 2048;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public int field5797 = 0;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field5794 = 0;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5783 = "purple:";

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[I")
    public static int[] field5786 = new int[25];

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "[Lok;")
    public static class61[] field5789 = new class61[14];

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "[[S")
    public static short[][] field5787 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
    public static int[] field5782 = new int[2500];

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field5793 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field5781;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static final void method2560(int arg0) {
        field5796++;
        for (class63 var1 = (class63) class268.field3613.method1240((byte) -106); var1 != null; var1 = (class63) class268.field3613.method1245(1)) {
            if (class258.method1675((byte) -100, var1.field966)) {
                class118.method939(arg0 ^ 0x6, var1);
            }
        }
        if (arg0 != 22) {
            return;
        }
        if (class415.field5808 == 1) {
            class94.field1369 = false;
            class215.method1471(0, class127.field1791, class381.field5345, class277.field3735, class236.field3264);
            return;
        }
        class215.method1471(arg0 - 22, class127.field1791, class381.field5345, class277.field3735, class236.field3264);
        int var2 = class19.field375.method2060(class148.field2266, (byte) 92);
        for (class63 var3 = (class63) class268.field3613.method1240((byte) -103); var3 != null; var3 = (class63) class268.field3613.method1245(1)) {
            int var4 = class314.method2004(var3, arg0 + 11117);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class236.field3264 = (class427.field6056 ? 26 : 22) + class415.field5808 * 16;
        class277.field3735 = var2 + 8;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method2561(byte arg0, Component arg1) {
        field5780++;
        int var2 = 93 / ((-arg0 - 37) / 63);
        Method var3 = class304.field4128;
        if (var3 != null) {
            try {
                var3.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class446.field6419);
        arg1.addFocusListener(class446.field6419);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLap;)V")
    public final void method2562(int arg0, byte arg1, class289 arg2) {
        field5795++;
        if (arg1 >= -22) {
            method2560(-105);
        }
        while (true) {
            int var4 = arg2.method1861((byte) -72);
            if (var4 == 0) {
                return;
            }
            this.method2563(true, arg0, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILap;I)V")
    private final void method2563(boolean arg0, int arg1, class289 arg2, int arg3) {
        field5792++;
        if (!arg0) {
            this.method2563(true, -113, (class289) null, 92);
        }
        if (arg3 == 1) {
            this.field5794 = arg2.method1861((byte) -72);
        } else if (arg3 == 2) {
            this.field5784 = arg2.method1853(-34);
        } else if (arg3 == 3) {
            this.field5785 = arg2.method1853(125);
        } else if (arg3 == 4) {
            this.field5797 = arg2.method1833(16);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static final void method2564(int arg0) {
        field5788++;
        if (arg0 != 0) {
            method2566(-83);
        }
        if (class166.field2472 == 10 || class166.field2472 == 28) {
            class84.method764(class356.field4842 >> 10, 5000, 71, class374.field5261 >> 10);
        } else {
            class84.method764(class95.field1379.field5005[0] >> 3, 5000, 104, class95.field1379.field4998[0] >> 3);
        }
        class127.method991((byte) 52);
        class348.method2201(-6120);
        class358.method2250((byte) -115);
        class147.method1134(arg0 + 5010);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lbi;B)V")
    public static final void method2565(class139 arg0, byte arg1) {
        field5791++;
        int var2 = arg0.field2108;
        if (var2 == 324) {
            if (class204.field2872 == -1) {
                class204.field2872 = arg0.field2130;
                class312.field4218 = arg0.field2099;
            }
            if (class90.field1344.field436) {
                arg0.field2130 = class204.field2872;
            } else {
                arg0.field2130 = class312.field4218;
            }
            return;
        }
        if (arg1 >= -126) {
            field5783 = null;
        }
        if (var2 == 325) {
            if (class204.field2872 == -1) {
                class204.field2872 = arg0.field2130;
                class312.field4218 = arg0.field2099;
            }
            if (class90.field1344.field436) {
                arg0.field2130 = class312.field4218;
            } else {
                arg0.field2130 = class204.field2872;
            }
        } else if (var2 == 327) {
            arg0.field2030 = 150;
            arg0.field2117 = (int) (Math.sin((double) field5793 / 40.0D) * 256.0D) & 0x3FFF;
            arg0.field2015 = -1;
            arg0.field2116 = 5;
        } else if (var2 == 328) {
            if (class95.field1379.field4577 == null) {
                arg0.field2015 = 0;
                arg0.field2004 = 0;
            } else {
                arg0.field2030 = 150;
                arg0.field2117 = (int) (Math.sin((double) field5793 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2116 = 5;
                arg0.field2015 = 2047;
                arg0.field2004 = class326.method2076(class95.field1379.field4577, 121);
                arg0.field2124 = 0;
                arg0.field2104 = class95.field1379.field4979;
                arg0.field2066 = class95.field1379.field4919;
                arg0.field1963 = class95.field1379.field4941;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public static void method2566(int arg0) {
        field5781 = null;
        field5789 = null;
        field5786 = null;
        field5783 = null;
        field5782 = null;
        if (arg0 != 934) {
            method2564(-39);
        }
        field5787 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method2567(byte arg0) {
        field5790++;
        int var1 = class417.field5851.method1808(8, -11904);
        if (var1 < class174.field2579) {
            for (int var2 = var1; var2 < class174.field2579; var2++) {
                class26.field461[class298.field4018++] = class134.field1921[var2];
            }
        }
        if (arg0 > -47) {
            return;
        }
        if (class174.field2579 < var1) {
            throw new RuntimeException("gppov1");
        }
        class174.field2579 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class134.field1921[var3];
            class338 var5 = class220.field3044[var4];
            int var6 = class417.field5851.method1808(1, -11904);
            if (var6 == 0) {
                class134.field1921[class174.field2579++] = var4;
                var5.field4937 = field5793;
            } else {
                int var7 = class417.field5851.method1808(2, -11904);
                if (var7 == 0) {
                    class134.field1921[class174.field2579++] = var4;
                    var5.field4937 = field5793;
                    class344.field4664[class166.field2464++] = var4;
                } else if (var7 == 1) {
                    class134.field1921[class174.field2579++] = var4;
                    var5.field4937 = field5793;
                    int var8 = class417.field5851.method1808(3, -11904);
                    var5.method2271(22419, var8, 1);
                    int var9 = class417.field5851.method1808(1, -11904);
                    if (var9 == 1) {
                        class344.field4664[class166.field2464++] = var4;
                    }
                } else if (var7 == 2) {
                    class134.field1921[class174.field2579++] = var4;
                    var5.field4937 = field5793;
                    if (class417.field5851.method1808(1, -11904) == 1) {
                        int var11 = class417.field5851.method1808(3, -11904);
                        var5.method2271(22419, var11, 2);
                        int var12 = class417.field5851.method1808(3, -11904);
                        var5.method2271(22419, var12, 2);
                    } else {
                        int var10 = class417.field5851.method1808(3, -11904);
                        var5.method2271(22419, var10, 0);
                    }
                    int var13 = class417.field5851.method1808(1, -11904);
                    if (var13 == 1) {
                        class344.field4664[class166.field2464++] = var4;
                    }
                } else if (var7 == 3) {
                    class26.field461[class298.field4018++] = var4;
                }
            }
        }
    }
}
