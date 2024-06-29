import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class248 extends class154 {

    @OriginalMember(owner = "client!ck", name = "hb", descriptor = "I")
    private int field4461 = 0;

    @OriginalMember(owner = "client!ck", name = "fb", descriptor = "I")
    private int field4459 = 4096;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "[[S")
    public static short[][] field4456 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field4457 = 0;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ck", name = "gb", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ck", name = "jb", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ck", name = "kb", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ck", name = "ib", descriptor = "Ljl;")
    public static class101 field4462;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)Luf;")
    public static final class169 method1709(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field4452;
            try {
                return (class169) Class.forName("sd").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class248() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
    public static final void method1710(int arg0) {
        if (arg0 >= 9) {
            ++field4455;
            class119.field2017.method1409(120);
            class273.field4796.method1409(89);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        if (arg1 != 1075962732) {
            return null;
        } else {
            ++field4463;
            int[] var3 = super.field2574.method206(arg0, 10232);
            if (super.field2574.field536) {
                int[] var4 = this.method1052(0, arg0, (byte) -84);
                for (int var5 = 0; ~var5 > ~class227.field3898; ++var5) {
                    int var6 = var4[var5];
                    if (var6 >= this.field4461) {
                        if (this.field4459 < var6) {
                            var3[var5] = this.field4459;
                        } else {
                            var3[var5] = var6;
                        }
                    } else {
                        var3[var5] = this.field4461;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
    public static void method1711(byte arg0) {
        field4462 = null;
        field4456 = null;
        if (arg0 <= 20) {
            field4462 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)Lwc;")
    public static final class27 method1712(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field1880; ++var4) {
                class27 var5 = var3.field1858[var4];
                if ((var5.field381 >> 29 & 3L) == 2L && var5.field402 == arg1 && var5.field397 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field4451;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field2579 = ~arg0.method1268(255) == -2;
                }
            } else {
                this.field4459 = arg0.method1244(false);
            }
        } else {
            this.field4461 = arg0.method1244(false);
        }
        if (arg1 != -14015) {
            method1713((byte) -99, true);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BZ)V")
    public static final void method1713(byte arg0, boolean arg1) {
        class126.method898((byte) 83);
        ++field4464;
        if (~class232.field4011 == -31 || ~class232.field4011 == -26) {
            if (arg0 <= -82) {
                ++class168.field2805;
                if (class168.field2805 >= 50 || arg1) {
                    class168.field2805 = 0;
                    if (!class2.field50 && class187.field3190 != null) {
                        class273.field4778.method1697(164, 112);
                        ++class25.field356;
                        try {
                            class187.field3190.method420(class273.field4778.field3175, 0, class273.field4778.field3169, -13789);
                            class273.field4778.field3169 = 0;
                        } catch (IOException var2) {
                            class2.field50 = true;
                        }
                    }
                    class126.method898((byte) 83);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)Z")
    public static final boolean method1714(int arg0, int arg1) {
        ++field4454;
        if (arg0 >= 97 && ~arg0 >= -123) {
            return true;
        } else {
            if (arg1 != -123) {
                field4456 = null;
            }
            if (~arg0 <= -66 && arg0 <= 90) {
                return true;
            } else {
                return arg0 >= 48 && arg0 <= 57;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        ++field4460;
        if (arg0 != 115) {
            return null;
        } else {
            int[][] var3 = super.field2585.method1532(arg1, -8);
            if (super.field2585.field3761) {
                int[][] var4 = this.method1054(0, 0, arg1);
                int[] var5 = var4[2];
                int[] var6 = var4[1];
                int[] var7 = var3[0];
                int[] var8 = var4[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class227.field3898 > var11; ++var11) {
                    int var12 = var6[var11];
                    int var13 = var8[var11];
                    int var14 = var5[var11];
                    if (~this.field4461 >= ~var13) {
                        if (~this.field4459 > ~var13) {
                            var7[var11] = this.field4459;
                        } else {
                            var7[var11] = var13;
                        }
                    } else {
                        var7[var11] = this.field4461;
                    }
                    if (~var12 <= ~this.field4461) {
                        if (this.field4459 < var12) {
                            var9[var11] = this.field4459;
                        } else {
                            var9[var11] = var12;
                        }
                    } else {
                        var9[var11] = this.field4461;
                    }
                    if (var14 < this.field4461) {
                        var10[var11] = this.field4461;
                    } else if (~var14 >= ~this.field4459) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field4459;
                    }
                }
            }
            return var3;
        }
    }
}
