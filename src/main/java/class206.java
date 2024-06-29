import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class206 extends class215 {

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    private int field3283 = 8;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    private int field3284 = 1024;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    private int field3285 = 81;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    private int field3291 = 0;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    private int field3295 = 4;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    private int field3279 = 1024;

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "I")
    private int field3303 = 204;

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "I")
    private int field3304 = 409;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field3287 = 1;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "[I")
    public static int[] field3282 = new int[50];

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
    public static int field3300 = 0;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    public static int field3299 = 0;

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "[[S")
    public static short[][] field3301 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!rc", name = "pb", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "Lte;")
    public static class244 field3290 = new class244(50);

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "C")
    public static char field3292;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    private int field3286;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    private int field3289;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "[I")
    private int[] field3293;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "[[I")
    private int[][] field3281;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "[[I")
    private int[][] field3288;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "[[[Lab;")
    public static class269[][][] field3296;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
    public static void method1452(byte arg0) {
        int var1 = -58 % ((arg0 - 25) / 53);
        field3282 = null;
        field3290 = null;
        field3301 = null;
        field3296 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field3302;
        if (arg0 != 1521146348) {
            this.field3285 = -111;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field3284 = arg2.method549(arg0 + -1521146093);
                                    }
                                } else {
                                    this.field3285 = arg2.method549(255);
                                }
                            } else {
                                this.field3291 = arg2.method549(arg0 ^ 1521146131);
                            }
                        } else {
                            this.field3279 = arg2.method549(arg0 + -1521146093);
                        }
                    } else {
                        this.field3303 = arg2.method549(255);
                    }
                } else {
                    this.field3304 = arg2.method549(arg0 + -1521146093);
                }
            } else {
                this.field3283 = arg2.method584(255);
            }
        } else {
            this.field3295 = arg2.method584(arg0 ^ 1521146131);
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class206() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        this.method1455(0);
        ++field3305;
        if (arg0 != -49) {
            this.field3286 = 111;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I")
    public static final int method1453(byte arg0, int arg1) {
        ++field3278;
        if (arg0 != -53) {
            method1452((byte) -65);
        }
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field3304 = 72;
        }
        ++field3297;
        int[] var3 = super.field3445.method1755(arg0, (byte) 122);
        if (super.field3445.field4163) {
            int var4 = 0;
            int var5;
            for (var5 = class76.field956[arg0] + this.field3291; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field3283 < ~var4 && ~this.field3293[var4] >= ~var5) {
                ++var4;
            }
            boolean var6 = (var4 & 1) == 0;
            int var7 = this.field3293[var4 + -1];
            int var8 = var4 + -1;
            int var9 = this.field3293[var4];
            if (this.field3286 + var7 < var5 && ~var5 > ~(-this.field3286 + var9)) {
                for (int var10 = 0; ~var10 > ~class244.field4015; ++var10) {
                    int var11 = 0;
                    int var12 = !var6 ? -this.field3279 : this.field3279;
                    int var13;
                    for (var13 = class166.field2657[var10] - -(this.field3289 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field3295 && var13 >= this.field3288[var8][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field3288[var8][var11];
                    int var16 = this.field3288[var8][var14];
                    if (var13 > this.field3286 + var16 && -this.field3286 + var15 > var13) {
                        var3[var10] = this.field3281[var8][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class72.method405(var3, 0, class244.field4015, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)V")
    public static final void method1454(byte arg0) {
        ++field3298;
        class96.field1283.method1927(-27511);
        if (arg0 != 37) {
            method1454((byte) 46);
        }
        int var1 = class96.field1283.method1919(1, arg0 + -32);
        if (~var1 != -1) {
            int var2 = class96.field1283.method1919(2, 5);
            if (var2 == 0) {
                class178.field2832[class126.field2027++] = 2047;
            } else if (~var2 == -2) {
                int var3 = class96.field1283.method1919(3, arg0 + -32);
                class286.field4571.method1643(false, 1, var3);
                int var4 = class96.field1283.method1919(1, 5);
                if (~var4 == -2) {
                    class178.field2832[class126.field2027++] = 2047;
                }
            } else if (var2 == 2) {
                if (class96.field1283.method1919(1, 5) != 1) {
                    int var5 = class96.field1283.method1919(3, 5);
                    class286.field4571.method1643(false, 0, var5);
                } else {
                    int var6 = class96.field1283.method1919(3, 5);
                    class286.field4571.method1643(false, 2, var6);
                    int var7 = class96.field1283.method1919(3, arg0 + -32);
                    class286.field4571.method1643(false, 2, var7);
                }
                int var8 = class96.field1283.method1919(1, arg0 + -32);
                if (var8 == 1) {
                    class178.field2832[class126.field2027++] = 2047;
                }
            } else if (var2 == 3) {
                class244.field4011 = class96.field1283.method1919(2, arg0 ^ 32);
                int var9 = class96.field1283.method1919(7, arg0 + -32);
                int var10 = class96.field1283.method1919(1, arg0 + -32);
                int var11 = class96.field1283.method1919(7, 5);
                int var12 = class96.field1283.method1919(1, 5);
                if (var12 == 1) {
                    class178.field2832[class126.field2027++] = 2047;
                }
                class286.field4571.method1768(var9, ~var10 == -2, arg0 ^ 80, var11);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
    private final void method1455(int arg0) {
        ++field3280;
        Random var2 = new Random((long) this.field3283);
        this.field3294 = 4096 / this.field3283;
        this.field3281 = new int[this.field3283][this.field3295];
        this.field3288 = new int[this.field3283][this.field3295 + 1];
        this.field3289 = 4096 / this.field3295;
        this.field3286 = this.field3285 / 2;
        if (arg0 == 0) {
            int var3 = this.field3294 / 2;
            this.field3293 = new int[this.field3283 + 1];
            this.field3293[0] = 0;
            int var4 = this.field3289 / 2;
            for (int var5 = 0; var5 < this.field3283; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field3294;
                    int var7 = (class40.method222(4096, arg0 + -18, var2) + -2048) * this.field3303 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field3293[var5] = this.field3293[var5 - 1] - -var8;
                }
                this.field3288[var5][0] = 0;
                for (int var9 = 0; this.field3295 > var9; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field3289;
                        int var11 = (-2048 + class40.method222(4096, -125, var2)) * this.field3304 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field3288[var5][var9] = this.field3288[var5][var9 + -1] + var12;
                    }
                    this.field3281[var5][var9] = ~this.field3284 >= -1 ? 4096 : 4096 - class40.method222(this.field3284, -116, var2);
                }
                this.field3288[var5][this.field3295] = 4096;
            }
            this.field3293[this.field3283] = 4096;
        }
    }
}
