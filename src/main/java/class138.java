import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class138 extends class124 {

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "[S")
    private short[] field2317 = new short[257];

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "I")
    private int field2330 = 0;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Z")
    public static volatile boolean field2314 = true;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "Le;")
    public static class191 field2322 = class54.method368("", 2047);

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Z")
    public static boolean field2323 = false;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "Leg;")
    public static class33 field2310;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "Lcg;")
    public static class44 field2325;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "[I")
    private int[] field2326;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "[I")
    private int[] field2328;

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "[I")
    public static int[] field2331;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "[[I")
    private int[][] field2316;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(BI)[I")
    private final int[] method915(byte arg0, int arg1) {
        ++field2315;
        if (arg0 < 21) {
            this.field2316 = null;
        }
        if (arg1 < 0) {
            return this.field2328;
        } else {
            return ~this.field2316.length >= ~arg1 ? this.field2326 : this.field2316[arg1];
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
    private final void method916(byte arg0) {
        ++field2320;
        if (arg0 != 48) {
            method921(-46);
        }
        int var2 = this.field2330;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field2316.length + -1 > var5 && this.field2316[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field2316[var5 + -1];
                    int[] var7 = this.field2316[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class150.field2582[(8176 & var8) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field2317[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field2316.length + -1 && var13 >= this.field2316[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field2316[var14 + -1];
                    int[] var16 = this.field2316[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field2317[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field2316.length - 1) && ~var21 <= ~this.field2316[var22][0]; ++var22) {
                }
                int[] var23 = this.field2316[var22 - 1];
                int[] var24 = this.field2316[var22];
                int var25 = this.method915((byte) 24, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method915((byte) 101, var22 - -1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 - (var25 - var26);
                int var32 = var27 - var25;
                int var33 = -var26 + var25 + -var31;
                int var35 = var30 * var33 >> 12;
                int var36 = (var29 * var31 >> 12) * var30 >> 12;
                int var37 = var29 * var32 >> 12;
                int var38 = var35 + var36 + var37 - -var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2317[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class138() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 <= 68) {
            this.field2326 = null;
        }
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int[] var4 = this.method844(0, 121, arg1);
            for (int var5 = 0; ~class64.field1132 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2317[var6];
            }
        }
        ++field2329;
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (!arg2) {
            this.method917((byte) 74);
        }
        if (arg0 == 0) {
            this.field2330 = arg1.method1580(-122);
            this.field2316 = new int[arg1.method1580(-2)][2];
            for (int var4 = 0; ~this.field2316.length < ~var4; ++var4) {
                this.field2316[var4][0] = arg1.method1593(true);
                this.field2316[var4][1] = arg1.method1593(true);
            }
        }
        ++field2324;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
    private final void method917(byte arg0) {
        ++field2321;
        int[] var2 = this.field2316[1];
        int[] var3 = this.field2316[0];
        int var4 = -40 / ((arg0 - 14) / 60);
        int[] var5 = this.field2316[this.field2316.length + -2];
        int[] var6 = this.field2316[this.field2316.length + -1];
        this.field2328 = new int[] { var3[0] + -var2[0] + var3[0], var3[1] + -var2[1] + var3[1] };
        this.field2326 = new int[] { var5[0] - (var6[0] + -var5[0]), var5[1] + var5[1] + -var6[1] };
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (this.field2316 == null) {
            this.field2316 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2327;
        if (this.field2316.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2330 == -3) {
                this.method917((byte) 99);
            }
            if (arg0 != -1) {
                this.field2317 = null;
            }
            class127.method862(7332);
            this.method916((byte) 48);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)I")
    public static final int method918(int arg0, int arg1, int arg2) {
        class34 var3 = (class34) class91.field1475.method612((long) arg1, true);
        ++field2311;
        if (var3 == null) {
            return -1;
        } else {
            return arg2 >= ~arg0 && ~arg0 > ~var3.field634.length ? var3.field634[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(BI)I")
    public static final int method919(byte arg0, int arg1) {
        if (arg0 < 118) {
            field2310 = null;
        }
        ++field2313;
        return arg1 & 127;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILng;)V")
    public static final void method920(int arg0, class121 arg1) {
        class79.field1355 = class18.method138(arg1, 0, true, class86.field1417);
        class169.field2857 = new class60[class79.field1355.length];
        ++field2312;
        class23.field323 = new class60[class79.field1355.length];
        class31.field436 = new class60[class79.field1355.length];
        for (int var2 = 0; class79.field1355.length > var2; ++var2) {
            class79.field1355[var2].method408();
            class169.field2857[var2] = class79.field1355[var2].method402();
            class79.field1355[var2].method408();
            class23.field323[var2] = class79.field1355[var2].method402();
            class79.field1355[var2].method408();
            class31.field436[var2] = class79.field1355[var2].method402();
            class79.field1355[var2].method408();
        }
        class255.field4530 = class127.method860(0, class191.field3407, arg1, (byte) -107);
        class148.field2533 = class263.method1805(arg1, 0, arg0, class62.field1113);
        class25.field364 = class263.method1805(arg1, 0, arg0, class53.field962);
        class158.field2687 = class263.method1805(arg1, 0, arg0, class196.field3500);
        class256.field4543 = class263.method1805(arg1, 0, arg0, class14.field178);
        class110.field1856 = class3.method11(class83.field1396, arg1, 89, 0);
        class97.field1569 = class3.method11(class189.field3323, arg1, arg0 + 123, 0);
        class191.field3408 = class117.method777(0, arg1, (byte) 11, class67.field1164);
        class74.field1272 = class3.method11(class126.field2082, arg1, 48, 0);
        class25.field368 = class3.method11(class248.field4410, arg1, arg0 + 39, 0);
        class241.field4297 = class145.method977((byte) -57, 0, arg1, class175.field2939);
        class37.field671 = class145.method977((byte) -57, 0, arg1, class137.field2297);
        class83.field1393.method282(class37.field671, (int[]) null);
        field2325.method282(class37.field671, (int[]) null);
        class230.field4128.method282(class37.field671, (int[]) null);
        class155 var3 = class173.method1165(true, arg1, 0, class133.field2227);
        var3.method1067();
        class9.field98 = var3;
        class155[] var4 = class127.method860(0, class21.field306, arg1, (byte) -124);
        for (int var5 = 0; var5 < var4.length; ++var5) {
            var4[var5].method1067();
        }
        int var6 = -10 + (int) (Math.random() * 21.0D);
        int var7 = -10 + (int) (Math.random() * 21.0D);
        class55.field1016 = var4;
        int var8 = (int) (Math.random() * 21.0D) + -10;
        int var9 = -20 + (int) (41.0D * Math.random());
        for (int var10 = 0; var10 < class255.field4530.length; ++var10) {
            class255.field4530[var10].method1059(var7 + var9, var6 + var9, var8 + var9);
        }
        class79.field1355[arg0].method403(var7 + var9, var6 + var9, var8 - -var9);
        class133.field2233 = class255.field4530;
    }

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)V")
    public static void method921(int arg0) {
        field2310 = null;
        if (arg0 != 0) {
            field2310 = null;
        }
        field2325 = null;
        field2322 = null;
        field2331 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIZ)I")
    public static final int method922(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field2319;
        class34 var4 = (class34) class91.field1475.method612((long) arg1, arg3);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; ~var4.field634.length < ~var6; ++var6) {
                if (var4.field634[var6] >= 0 && class42.field745 > var4.field634[var6]) {
                    class148 var7 = class100.method623(-1, var4.field634[var6]);
                    if (var7.field2491 != null) {
                        class115 var8 = (class115) var7.field2491.method612((long) arg2, true);
                        if (var8 != null) {
                            if (!arg0) {
                                var5 += var8.field1896;
                            } else {
                                var5 += var4.field638[var6] * var8.field1896;
                            }
                        }
                    }
                }
            }
            return var5;
        }
    }
}
