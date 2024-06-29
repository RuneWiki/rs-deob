import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class40 {

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    private final int field233;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    private final int field219;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    private final int field231;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    private final int field218;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lhj;")
    public static class69 field221 = class181.method1318("::fpson", (byte) -125);

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[[[I")
    public static int[][][] field223 = new int[4][13][13];

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Lhj;")
    public static class69 field232 = class181.method1318("", (byte) -125);

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field224 = 0;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "F")
    public static float field220;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "[Lhk;")
    public static class121[] field225;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[Lhj;")
    public static class69[] field227;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "[[[I")
    public static int[][][] field226;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
    public static final void method103() {
        for (int var0 = 0; var0 < class261.field4653; ++var0) {
            class85 var1 = class99.field1872[var0];
            class104.method779(var1);
            class99.field1872[var0] = null;
        }
        class261.field4653 = 0;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static final void method104(int arg0) {
        ++field217;
        if (class21.field299 != null) {
            if (class21.field296 < 10) {
                if (!class136.field2546.method611(50, class21.field299.field712) || !class136.field2546.method611(50, class9.method42(arg0 + 72, new class69[] { class21.field299.field712, class173.field3158 }))) {
                    class21.field296 = class110.field2095.method584(arg0 ^ 14, class21.field299.field712) / 10;
                    return;
                }
                class255.method1769(41);
                class21.field296 = 10;
            }
            if (class21.field296 != 10) {
                if (class21.field296 == 20) {
                    class243.method1725(0, new class128(class136.field2546.method604((byte) -26, class69.field1304, class21.field299.field712)));
                    class21.field296 = 30;
                    class9.method43(true, (byte) -127);
                    class88.method630((byte) -121);
                } else if (class21.field296 == 30) {
                    class258.method1782(new class128(class136.field2546.method604((byte) -125, class71.field1388, class21.field299.field712)), (byte) 67);
                    class21.field296 = 40;
                    class88.method630((byte) -118);
                } else if (class21.field296 == 40) {
                    class57.method348(arg0 ^ 8, new class128(class136.field2546.method604((byte) -124, class47.field673, class21.field299.field712)));
                    class21.field296 = 50;
                    class88.method630((byte) -69);
                } else if (~class21.field296 == -51) {
                    class173.method1264(new class128(class136.field2546.method604((byte) -81, class181.field3278, class21.field299.field712)), (byte) -5);
                    class21.field296 = 60;
                    class9.method43(true, (byte) -127);
                    class88.method630((byte) -17);
                } else if (~class21.field296 == -61) {
                    class61.field1117 = class97.method717(class136.field2546, class9.method42(-75, new class69[] { class21.field299.field712, class173.field3158 }), -125);
                    class21.field296 = 70;
                    class88.method630((byte) -28);
                } else if (class21.field296 == 70) {
                    class98.field1839 = new class185(11, true, class212.field3862);
                    class21.field296 = 73;
                    class9.method43(true, (byte) -127);
                    class88.method630((byte) -83);
                } else if (class21.field296 == 73) {
                    class112.field2162 = new class185(12, true, class212.field3862);
                    class21.field296 = 76;
                    class9.method43(true, (byte) -127);
                    class88.method630((byte) -28);
                } else if (~class21.field296 == -77) {
                    class147.field2717 = new class185(14, true, class212.field3862);
                    class21.field296 = 79;
                    class9.method43(true, (byte) -127);
                    class88.method630((byte) -122);
                } else if (class21.field296 == 79) {
                    class161.field2984 = new class185(17, true, class212.field3862);
                    class21.field296 = 82;
                    class9.method43(true, (byte) -127);
                    class88.method630((byte) -50);
                } else if (class21.field296 == 82) {
                    class106.field2000 = new class185(19, true, class212.field3862);
                    class21.field296 = 85;
                    class9.method43(true, (byte) -127);
                    class88.method630((byte) -92);
                } else if (class21.field296 == 85) {
                    class161.field2982 = new class185(22, true, class212.field3862);
                    class21.field296 = 88;
                    class9.method43(true, (byte) -127);
                    class88.method630((byte) -101);
                } else if (~class21.field296 == -89) {
                    class11.field108 = new class185(26, true, class212.field3862);
                    class21.field296 = 91;
                    class9.method43(true, (byte) -127);
                    class88.method630((byte) -96);
                } else {
                    class129.field2412 = new class185(30, true, class212.field3862);
                    class21.field296 = 100;
                    class9.method43(true, (byte) -127);
                    class88.method630((byte) -31);
                    class109.field2089 = -1;
                    class4.field32 = -1;
                    System.gc();
                    if (arg0 != 11) {
                        field220 = -0.44393134F;
                    }
                }
            } else {
                class93.field1741 = 8.0F;
                class246.field4502 = 8.0F;
                class209.field3806 = class21.field299.field715 >> 6 << 6;
                class250.field4539 = class21.field299.field704 >> 6 << 6;
                int var1 = (class156.field2904.field3985 >> 7) + class242.field4441 - class250.field4539;
                class84.field1626 = (class21.field299.field713 >> 6 << 6) - (class250.field4539 + -64);
                int var2 = var1 + ((int) (Math.random() * 10.0D) - 5);
                class22.field306 = (class21.field299.field709 >> 6 << 6) + -class209.field3806 + 64;
                int var3 = -1 - -class209.field3806 - (class156.field2904.field4005 >> 7) + class22.field306 - class220.field3962;
                int var4 = var3 + -5 + (int) (Math.random() * 10.0D);
                if (~var2 <= -1 && var2 < class84.field1626 && var4 >= 0 && class22.field306 > var4) {
                    class102.field1905 = var4;
                    class135.field2528 = var2;
                } else {
                    class135.field2528 = class21.field299.field710 * 64 + -class250.field4539;
                    class102.field1905 = class22.field306 - class21.field299.field711 * 64 + -1 + class209.field3806;
                }
                class69.method456(arg0 + -10);
                int var5 = class84.field1626 >> 6;
                int var6 = class22.field306 >> 6;
                field226 = new int[var5][var6][];
                class89.field1690 = new int[class3.field9 + 1];
                int var7 = class55.field992 >> 2 << 10;
                int var8 = class55.field994 >> 1;
                class51.field904 = new byte[var5][var6][];
                class114.field2182 = new byte[var5][var6][];
                class66.field1265 = new byte[var5][var6][];
                class65.field1260 = new byte[var5][var6][];
                class168.field3098 = new byte[var5][var6][];
                class140.field2616 = new short[var5][var6][];
                class64.field1243 = new int[var5][var6][];
                class115.method852(var8, var7, -1);
                class21.field296 = 20;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static final void method105(int arg0) {
        ++field235;
        if (class194.field3551 != null) {
            class194.field3551.method995((byte) 101);
        }
        if (class29.field421 != null) {
            class29.field421.method995((byte) 112);
        }
        if (arg0 >= -98) {
            field221 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(BII)V")
    public final void method106(byte arg0, int arg1, int arg2) {
        ++field222;
        if (arg0 > -102) {
            this.method106((byte) 94, -44, 103);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBII)V")
    public static final void method107(int arg0, byte arg1, int arg2, int arg3) {
        ++field230;
        class135 var4 = class8.method38((byte) 123, 9, arg3);
        if (arg1 != -50) {
            method108(9, -113, 43, 53, -9, (byte) -62, -120, 28);
        }
        var4.method1011((byte) 122);
        var4.field2539 = arg0;
        var4.field2535 = arg2;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIII)V")
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field233 = arg0;
        this.field219 = arg2;
        this.field231 = arg3;
        this.field218 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++field229;
        int var8 = 101 / ((-20 - arg5) / 50);
        if (arg4 >= class201.field3629 && ~arg1 >= ~class35.field485 && ~arg3 <= ~class19.field252 && ~arg6 >= ~class166.field3075) {
            class181.method1319(arg6, arg2, arg1, arg0, arg4, arg7, arg3, 0);
        } else {
            class3.method9(arg2, 122, arg0, arg7, arg4, arg1, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public static void method109(int arg0) {
        field232 = null;
        if (arg0 != -859909594) {
            method107(105, (byte) 99, -49, 17);
        }
        field221 = null;
        field227 = null;
        field225 = null;
        field226 = null;
        field223 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
    public final void method110(int arg0, int arg1, int arg2) {
        if (arg2 == 100) {
            ++field236;
            int var4 = this.field233 * arg1 >> 12;
            int var5 = this.field219 * arg1 >> 12;
            int var6 = this.field218 * arg0 >> 12;
            int var7 = this.field231 * arg0 >> 12;
            class251.method1752(var6, var4, super.field565, var7, super.field575, (byte) -59, var5, super.field567);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BII)V")
    public final void method111(byte arg0, int arg1, int arg2) {
        if (arg0 != -101) {
            method109(28);
        }
        ++field234;
        int var4 = this.field219 * arg1 >> 12;
        int var5 = this.field218 * arg2 >> 12;
        int var6 = this.field231 * arg2 >> 12;
        int var7 = this.field233 * arg1 >> 12;
        class104.method785(var6, var4, (byte) 104, var7, var5, super.field575);
    }
}
