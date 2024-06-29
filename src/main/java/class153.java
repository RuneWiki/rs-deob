import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class153 extends class215 {

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    private int field2371 = 0;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "[S")
    private short[] field2367 = new short[257];

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    public static int field2379 = -1;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "Leh;")
    public static class137 field2376;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "[I")
    private int[] field2365;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "[I")
    private int[] field2368;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "[[I")
    private int[][] field2378;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V")
    private final void method1042(byte arg0) {
        if (arg0 != 8) {
            this.field2368 = null;
        }
        ++field2375;
        int var2 = this.field2371;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field2378.length - 1 && ~var4 <= ~this.field2378[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2378[var5 - 1];
                    int[] var7 = this.field2378[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = 4096 - class36.field468[(8189 & var8) >> 5] >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field2367[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field2378.length - 1) < ~var14 && var13 >= this.field2378[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field2378[var14 - 1];
                    int[] var16 = this.field2378[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field2367[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field2378.length + -1) && ~this.field2378[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field2378[var22 - 1];
                int[] var24 = this.field2378[var22];
                int var25 = this.method1046(var22 + -2, 99)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1046(var22 - -1, arg0 ^ 58)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var26 + var28 + -var27 - var25;
                int var32 = -var26 - var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var29 * var33 >> 12;
                int var37 = var30 * var32 >> 12;
                int var38 = var26 + var36 + var35 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2367[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
    public static final void method1043(int arg0) {
        if (arg0 != -10149) {
            method1045(false);
        }
        class206.field3290.method1699(0);
        ++field2373;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(II)I")
    public static final int method1044(int arg0, int arg1) {
        ++field2364;
        class34 var2 = class160.method1116(arg1, (byte) -35);
        int var3 = var2.field442;
        if (arg0 > -57) {
            return 94;
        } else {
            int var4 = var2.field445;
            int var5 = class15.field194[-var3 + var4];
            int var6 = var2.field440;
            return var5 & class135.field2141[var6] >> var3;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field2372;
        if (~arg1 == -1) {
            this.field2371 = arg2.method584(255);
            this.field2378 = new int[arg2.method584(arg0 + -1521146093)][2];
            for (int var4 = 0; var4 < this.field2378.length; ++var4) {
                this.field2378[var4][0] = arg2.method549(255);
                this.field2378[var4][1] = arg2.method549(255);
            }
        }
        if (arg0 != 1521146348) {
            this.method1047(77);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        if (this.field2378 == null) {
            this.field2378 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2377;
        if (~this.field2378.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2371 == 2) {
                this.method1047(120);
            }
            class247.method1716(arg0 + 305);
            this.method1042((byte) 8);
            if (arg0 != -49) {
                field2379 = -102;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class153() {
        super(1, true);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != 255) {
            field2376 = null;
        }
        ++field2370;
        int[] var3 = super.field3445.method1755(arg0, (byte) 126);
        if (super.field3445.field4163) {
            int[] var4 = this.method1503(arg1 + -256, 0, arg0);
            for (int var5 = 0; ~class244.field4015 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2367[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public static void method1045(boolean arg0) {
        if (!arg0) {
            field2376 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(II)[I")
    private final int[] method1046(int arg0, int arg1) {
        ++field2369;
        if (arg1 < 42) {
            this.field2371 = 23;
        }
        if (~arg0 > -1) {
            return this.field2365;
        } else {
            return arg0 >= this.field2378.length ? this.field2368 : this.field2378[arg0];
        }
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V")
    private final void method1047(int arg0) {
        ++field2374;
        int[] var2 = this.field2378[0];
        if (arg0 <= 110) {
            method1045(true);
        }
        int[] var3 = this.field2378[this.field2378.length + -2];
        int[] var4 = this.field2378[1];
        int[] var5 = this.field2378[this.field2378.length + -1];
        this.field2365 = new int[] { var2[0] + -var4[0] + var2[0], -var4[1] - (-var2[1] - var2[1]) };
        this.field2368 = new int[] { -var5[0] - -var3[0] + var3[0], var3[1] - (var5[1] - var3[1]) };
    }
}
