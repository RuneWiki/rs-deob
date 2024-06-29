import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class69 extends class398 {

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "[S")
    private short[] field897 = new short[257];

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    private int field889 = 0;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "Z")
    public static boolean field886 = false;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "Z")
    public static boolean field887 = false;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "Z")
    public static boolean field898 = false;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "[I")
    public static int[] field882 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "I")
    public static int field904 = -1;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "Llm;")
    public static class347 field893;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "Lii;")
    public static class405 field894;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "[I")
    private int[] field890;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "[I")
    private int[] field895;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "[[I")
    private int[][] field899;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(Z)V")
    private final void method458(boolean arg0) {
        ++field892;
        int[] var2 = this.field899[0];
        int[] var3 = this.field899[1];
        int[] var4 = this.field899[this.field899.length + -2];
        int[] var5 = this.field899[this.field899.length + -1];
        this.field895 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
        if (arg0) {
            this.field897 = null;
        }
        this.field890 = new int[] { var4[0] + -var5[0] + var4[0], -var5[1] - (-var4[1] - var4[1]) };
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class69() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
    public final void method209(int arg0) {
        ++field903;
        if (this.field899 == null) {
            this.field899 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field899.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field889 == -3) {
                this.method458(false);
            }
            class42.method303(7344);
            this.method459(127);
            if (arg0 != 16) {
                method464(-35);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    private final void method459(int arg0) {
        int var2 = this.field889;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field899.length + -1) && this.field899[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field899[var5 + -1];
                    int[] var7 = this.field899[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class286.field4148[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field897[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field899.length + -1) < ~var14 && this.field899[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field899[var14 + -1];
                    int[] var16 = this.field899[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field897[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field899.length + -1) && ~this.field899[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field899[var22 + -1];
                int[] var24 = this.field899[var22];
                int var25 = this.method460(-1, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method460(-1, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 - -var26 + -var25;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 - -var37 + var35 - -var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field897[var20] = (short) var38;
            }
        }
        if (arg0 <= 119) {
            method466(-11, -18, -60);
        }
        ++field900;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field889 = arg0.method1348(-123);
            this.field899 = new int[arg0.method1348(arg2 ^ 13095)][2];
            for (int var4 = 0; ~var4 > ~this.field899.length; ++var4) {
                this.field899[var4][0] = arg0.method1343(class399.method2571(arg2, -13237));
                this.field899[var4][1] = arg0.method1343(255);
            }
        }
        if (arg2 != -13132) {
            this.field899 = null;
        }
        ++field884;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)[I")
    private final int[] method460(int arg0, int arg1) {
        ++field885;
        if (arg0 < ~arg1) {
            return this.field895;
        } else {
            return ~arg1 <= ~this.field899.length ? this.field890 : this.field899[arg1];
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(Z)V")
    public static final void method461(boolean arg0) {
        ++field896;
        class388.method2497(true, class365.field5288);
        int var1 = (class400.field5971 >> 10) - -(class7.field138 >> 3);
        int var2 = (class200.field2660 >> 3) + (class179.field2371 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class27.field384 = new int[var6];
        class177.field2340 = new int[var6];
        class146.field2006 = new byte[var6][];
        class379.field5503 = new byte[var6][];
        class94.field1346 = new byte[var6][];
        class88.field1238 = new int[var6];
        class147.field2015 = new int[var6];
        class73.field1051 = new int[var6][4];
        class35.field497 = new int[var6];
        class12.field198 = new byte[var6][];
        class395.field5833 = new byte[var6][];
        class117.field1641 = new int[var6];
        int var7 = 0;
        for (int var8 = (-(class192.field2574 >> 4) + var1) / 8; ((class192.field2574 >> 4) + var1) / 8 >= var8; ++var8) {
            for (int var10 = (var2 - (class364.field5262 >> 4)) / 8; (var2 - -(class364.field5262 >> 4)) / 8 >= var10; ++var10) {
                int var11 = (var8 << 8) - -var10;
                class147.field2015[var7] = var11;
                class117.field1641[var7] = class153.field2066.method2270("m" + var8 + "_" + var10, (byte) 115);
                class35.field497[var7] = class153.field2066.method2270("l" + var8 + "_" + var10, (byte) 115);
                class177.field2340[var7] = class153.field2066.method2270("n" + var8 + "_" + var10, (byte) 115);
                class27.field384[var7] = class153.field2066.method2270("um" + var8 + "_" + var10, (byte) 115);
                class88.field1238[var7] = class153.field2066.method2270("ul" + var8 + "_" + var10, (byte) 115);
                if (~class177.field2340[var7] == 0) {
                    class117.field1641[var7] = -1;
                    class35.field497[var7] = -1;
                    class27.field384[var7] = -1;
                    class88.field1238[var7] = -1;
                }
                ++var7;
            }
        }
        for (int var9 = var7; class177.field2340.length > var9; ++var9) {
            class177.field2340[var9] = -1;
            class117.field1641[var9] = -1;
            class35.field497[var9] = -1;
            class27.field384[var9] = -1;
            class88.field1238[var9] = -1;
        }
        class419.method2683(false, var1, var3, var2, arg0, var4, var5, 128);
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(II)V")
    public static final void method462(int arg0, int arg1) {
        class319.field4665 = -1;
        if (arg0 != 4096) {
            method463(20, -9, 64, 92);
        }
        class449.field6577 = 3;
        class249.field3365 = 100;
        ++field902;
        class372.field5415 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)I")
    public static final int method463(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field888;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2 != 588709228 ? -73 : arg0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
    public static void method464(int arg0) {
        field882 = null;
        field894 = null;
        if (arg0 != 0) {
            method461(true);
        }
        field893 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Llm;B)V")
    public static final void method465(class347 arg0, byte arg1) {
        ++field901;
        class420.field6215 = arg0;
        if (arg1 != 87) {
            field886 = false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field881;
        int[] var3 = super.field5927.method305(arg0, (byte) 111);
        if (arg1 != 0) {
            return null;
        } else {
            if (super.field5927.field591) {
                int[] var4 = this.method2558(0, 29295, arg0);
                for (int var5 = 0; ~var5 > ~class140.field1922; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field897[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)I")
    public static final int method466(int arg0, int arg1, int arg2) {
        int var3 = (127 & arg2) * arg1 >> 7;
        ++field891;
        if (arg0 != -1) {
            method461(false);
        }
        if (var3 >= 2) {
            if (~var3 < -127) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (arg2 & 65408) + var3;
    }
}
