import java.awt.Image;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class81 extends class74 {

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    private int field1344 = 0;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    private int field1351 = 1;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    private int field1345 = 0;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "[[S")
    public static short[][] field1343 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "[Lf;")
    public static class37[] field1347 = new class37[2048];

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "Z")
    public static boolean field1353 = false;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "Ljava/awt/Image;")
    public static Image field1346;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IJ)V")
    public static final void method634(int arg0, long arg1) {
        ++field1348;
        if (~arg1 != -1L) {
            if ((~class262.field4100 > -101 || class286.field4492) && class262.field4100 < 200) {
                String var3 = class288.method1938(arg1, -101);
                if (arg0 != 29602) {
                    method637(122);
                }
                for (int var4 = 0; ~class262.field4100 < ~var4; ++var4) {
                    if (~class231.field3603[var4] == ~arg1) {
                        class73.method567("", 0, var3 + class46.field734, arg0 ^ 29577);
                        return;
                    }
                }
                for (int var5 = 0; ~class132.field2037 < ~var5; ++var5) {
                    if (~class295.field4629[var5] == ~arg1) {
                        class73.method567("", 0, class10.field205 + var3 + class187.field2815, 27);
                        return;
                    }
                }
                if (var3.equals(class261.field4058.field446)) {
                    class73.method567("", 0, class219.field3430, 49);
                } else {
                    class3.field53[class262.field4100] = var3;
                    ++class109.field1734;
                    class231.field3603[class262.field4100] = arg1;
                    class112.field1761[class262.field4100] = 0;
                    class5.field74[class262.field4100] = "";
                    class174.field2587[class262.field4100] = 0;
                    class29.field467[class262.field4100] = false;
                    ++class262.field4100;
                    class65.field1027 = class141.field2178;
                    class292.field4607.method1251(144, (byte) -90);
                    class292.field4607.method337(2103219728, arg1);
                }
            } else {
                class73.method567("", 0, class78.field1312, arg0 ^ 29659);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field1352;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            this.method80((byte) -57, (class37) null, 56);
        }
        if (super.field1254.field3118) {
            int var4 = class207.field3212[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class178.field2662 < ~var6; ++var6) {
                int var7 = class224.field3522[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field1344 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1351 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field1351;
                }
                int var12 = var11 - (-4096 & var11);
                if (~this.field1345 == -1) {
                    var12 = class11.field214[(4081 & var12) >> 4] - -4096 >> 1;
                } else if (~this.field1345 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class81() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IB)V")
    public static final void method635(int arg0, byte arg1) {
        ++field1350;
        if (!class210.field3261) {
            arg0 = -1;
        }
        if (class83.field1372 != arg0) {
            int var2 = 41 / ((arg1 - -10) / 36);
            if (arg0 != -1) {
                class1 var3 = class129.method912(33, arg0);
                class49 var4 = var3.method1(8);
                if (var4 == null) {
                    arg0 = -1;
                } else {
                    class22.field329.method474(new Point(var3.field1, var3.field5), var4.method405(), class189.field3021, var4.field43, var4.field46, 8);
                    class83.field1372 = arg0;
                }
            }
            if (arg0 == -1 && class83.field1372 != -1) {
                class22.field329.method474(new Point(), (int[]) null, class189.field3021, -1, -1, 8);
                class83.field1372 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        ++field1354;
        class87.method698(arg0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 != -79) {
            this.field1344 = 56;
        }
        ++field1342;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field1351 = arg1.method333((byte) -59);
                }
            } else {
                this.field1345 = arg1.method333((byte) -59);
            }
        } else {
            this.field1344 = arg1.method333((byte) -59);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Luf;I)V")
    public static final void method636(class176 arg0, int arg1) {
        ++field1349;
        if (arg1 != 27626) {
            field1347 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static void method637(int arg0) {
        field1343 = null;
        field1346 = null;
        if (arg0 == 2048) {
            field1347 = null;
        }
    }
}
