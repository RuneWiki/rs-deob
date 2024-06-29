import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class369 extends class34 {

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "[Ljp;")
    public static class55[] field5274 = new class55[14];

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "[I")
    public static int[] field5278 = new int[4096];

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "[[S")
    public static short[][] field5280;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Lrb;")
    public static class283 field5281;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Lpu;")
    public static class177 field5284;

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field5278[var0] = class291.method1680(true, var0);
        }
        field5280 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };
        field5281 = new class283(71, -2);
        field5285 = 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public static final void method2203(int arg0, String arg1) {
        ++field5275;
        if (arg1 != null) {
            if ((~class399.field5724 > -101 || class296.field3998) && class399.field5724 < 200) {
                String var2 = class75.method585(arg1, -1);
                if (var2 != null) {
                    if (arg0 >= -23) {
                        method2205(16);
                    }
                    for (int var3 = 0; var3 < class399.field5724; ++var3) {
                        String var7 = class75.method585(class494.field7148[var3], -1);
                        if (var7 != null && var7.equals(var2)) {
                            class35.method256((byte) 103, arg1 + class504.field7377.method1126(class486.field6998, (byte) -19));
                            return;
                        }
                        if (class384.field5510[var3] != null) {
                            String var8 = class75.method585(class384.field5510[var3], -1);
                            if (var8 != null && var8.equals(var2)) {
                                class35.method256((byte) 119, arg1 + class504.field7377.method1126(class486.field6998, (byte) -19));
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; var4 < class296.field3993; ++var4) {
                        String var5 = class75.method585(class169.field2579[var4], -1);
                        if (var5 != null && var5.equals(var2)) {
                            class35.method256((byte) 125, class343.field4963.method1126(class486.field6998, (byte) -19) + arg1 + class18.field281.method1126(class486.field6998, (byte) -19));
                            return;
                        }
                        if (class148.field2266[var4] != null) {
                            String var6 = class75.method585(class148.field2266[var4], -1);
                            if (var6 != null && var6.equals(var2)) {
                                class35.method256((byte) 125, class343.field4963.method1126(class486.field6998, (byte) -19) + arg1 + class18.field281.method1126(class486.field6998, (byte) -19));
                                return;
                            }
                        }
                    }
                    if (class75.method585(class81.field1158.field7036, -1).equals(var2)) {
                        class35.method256((byte) 94, class468.field6769.method1126(class486.field6998, (byte) -19));
                    } else {
                        class274.method1602(14, class312.field4236);
                        ++class186.field2748;
                        class17.field275.method1891(false, class515.method3047((byte) -97, arg1));
                        class17.field275.method1879(32767, arg1);
                    }
                }
            } else {
                class35.method256((byte) 118, class398.field5708.method1126(class486.field6998, (byte) -19));
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 99)
    public class369() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)V", line = 102)
    private final void method2204(int arg0, int arg1, int arg2) {
        ++field5277;
        int var4 = class91.field1463[arg2];
        int var5 = class284.field3856[arg0];
        if (arg1 >= -24) {
            this.method69((class319) null, -20, 30);
        }
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class197.field2892 = arg0;
            class306.field4154 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class197.field2892 = arg2;
            class306.field4154 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class197.field2892 = arg2;
            class306.field4154 = class383.field5502 - arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class197.field2892 = -arg0 + class494.field7150;
            class306.field4154 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class197.field2892 = -arg0 + class494.field7150;
            class306.field4154 = class383.field5502 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class197.field2892 = -arg2 + class494.field7150;
            class306.field4154 = -arg0 + class383.field5502;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class306.field4154 = arg0;
            class197.field2892 = class494.field7150 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class197.field2892 = arg0;
            class306.field4154 = -arg2 + class383.field5502;
        }
        class197.field2892 &= class343.field4968;
        class306.field4154 &= class120.field1872;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V", line = 185)
    public static final void method2205(int arg0) {
        ++field5282;
        class473 var1 = class134.field2044;
        synchronized (class134.field2044) {
            class134.field2044.method2764(-769);
        }
        class473 var2 = client.field7546;
        synchronized (client.field7546) {
            if (arg0 == -5360) {
                client.field7546.method2764(-769);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V", line = 201)
    public static void method2206(int arg0) {
        field5281 = null;
        field5278 = null;
        field5284 = null;
        field5280 = null;
        if (arg0 == 13863) {
            field5274 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)[I", line = 217)
    public final int[] method64(int arg0, byte arg1) {
        int var3 = -55 / (-arg1 / 50);
        ++field5276;
        int[] var4 = super.field537.method1780(arg0, (byte) 68);
        if (super.field537.field4191) {
            for (int var5 = 0; ~class383.field5502 < ~var5; ++var5) {
                this.method2204(arg0, -123, var5);
                int[] var6 = this.method252(false, class197.field2892, 0);
                var4[var5] = var6[class306.field4154];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)[[I", line = 251)
    public final int[][] method66(byte arg0, int arg1) {
        ++field5273;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (arg0 != -11) {
            field5274 = null;
        }
        if (super.field536.field726) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class383.field5502; ++var7) {
                this.method2204(arg1, -99, var7);
                int[][] var8 = this.method254(arg0 + 11, 0, class197.field2892);
                var4[var7] = var8[0][class306.field4154];
                var5[var7] = var8[1][class306.field4154];
                var6[var7] = var8[2][class306.field4154];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lsv;II)V", line = 292)
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 <= 16) {
            this.method2204(-125, 36, -127);
        }
        if (~arg2 == -1) {
            super.field533 = ~arg0.method1869(-105) == -2;
        }
        ++field5279;
    }
}
