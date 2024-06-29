import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class151 extends class306 {

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "[S")
    private short[] field2387 = new short[257];

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
    private int field2401 = 0;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "Z")
    public static boolean field2386 = false;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "Lvh;")
    public static class62 field2392 = new class62(64);

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "Lqj;")
    public static class280 field2397 = new class280(16);

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "Lnk;")
    public static class16 field2400;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "[I")
    private int[] field2384;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "[I")
    private int[] field2385;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "[[I")
    private int[][] field2391;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V", line = 6)
    private final void method1100(int arg0) {
        field2395++;
        if (arg0 > -5) {
            field2399 = 75;
        }
        int var2 = this.field2401;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field2391.length - 1 > var22 && this.field2391[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field2391[var22];
                int[] var24 = this.field2391[var22 - 1];
                int var25 = this.method1103((byte) -119, var22 - 2)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1103((byte) -69, var22 + 1)[1];
                int var29 = (var21 - var24[0] << 12) / (var23[0] - var24[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var26 + var28 - var27 - var25;
                int var32 = var25 - var26 - var31;
                int var33 = var27 - var25;
                int var34 = (var29 * var31 >> 12) * var30 >> 12;
                int var35 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var34 + var35 - (-var37 - var26);
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2387[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var11 = 0; var11 < 257; var11++) {
                int var12 = var11 << 4;
                int var13;
                for (var13 = 1; var13 < this.field2391.length - 1 && var12 >= this.field2391[var13][0]; var13++) {
                }
                int[] var14 = this.field2391[var13 - 1];
                int[] var15 = this.field2391[var13];
                int var16 = (var12 - var14[0] << 12) / (var15[0] - var14[0]);
                int var17 = 4096 - class323.field5147[(var16 & 0x1FF7) >> 5] >> 1;
                int var18 = 4096 - var17;
                int var19 = var14[1] * var18 + var15[1] * var17 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field2387[var11] = (short) var19;
            }
        } else {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field2391.length - 1) && this.field2391[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field2391[var5 - 1];
                int[] var7 = this.field2391[var5];
                int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var9 = 4096 - var8;
                int var10 = var6[1] * var9 + var7[1] * var8 >> 12;
                if (var10 <= -32768) {
                    var10 = -32767;
                }
                if (var10 >= 32768) {
                    var10 = 32767;
                }
                this.field2387[var3] = (short) var10;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([I[JI)V", line = 186)
    public static final void method1101(int[] arg0, long[] arg1, int arg2) {
        if (arg2 == 32767) {
            class172.method1204(arg0, 111, arg1, 0, arg1.length - 1);
            field2383++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(B)V", line = 202)
    public static void method1102(byte arg0) {
        field2397 = null;
        if (arg0 != 18) {
            field2400 = (class16) null;
        }
        field2392 = null;
        field2400 = null;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)V", line = 216)
    public final void method43(byte arg0) {
        if (this.field2391 == null) {
            this.field2391 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field2396++;
        if (this.field2391.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field2401 == 2) {
            this.method1105(31338);
        }
        class105.method682((byte) -88);
        if (arg0 > -103) {
            this.method1100(-12);
        }
        this.method1100(-59);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILlf;I)V", line = 237)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg0 != -15334) {
            this.field2401 = 20;
        }
        field2393++;
        if (arg2 != 0) {
            return;
        }
        this.field2401 = arg1.method1043(true);
        this.field2391 = new int[arg1.method1043(true)][2];
        for (int var4 = 0; var4 < this.field2391.length; var4++) {
            this.field2391[var4][0] = arg1.method1051(1);
            this.field2391[var4][1] = arg1.method1051(1);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[I", line = 270)
    private final int[] method1103(byte arg0, int arg1) {
        field2398++;
        if (arg0 > -64) {
            this.field2387 = (short[]) null;
        }
        if (arg1 >= 0) {
            return arg1 >= this.field2391.length ? this.field2384 : this.field2391[arg1];
        } else {
            return this.field2385;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V", line = 297)
    public static final void method1104(int arg0, boolean arg1) {
        class336.field5357 = (byte[][][]) null;
        class336.field5364 = (byte[][][]) null;
        class336.field5372 = (byte[][][]) null;
        class336.field5370 = (int[][][]) null;
        class336.field5371 = (byte[][][]) null;
        class68.field852 = null;
        class233.field3526 = null;
        if (arg1 && class336.field5347 != null) {
            class110.field1507 = class336.field5347.field3213;
        } else {
            class110.field1507 = -1;
        }
        class336.field5369 = (byte[][][]) null;
        class336.field5347 = null;
        class336.field5361 = null;
        class336.field5363 = (int[][][]) null;
        class140.field2091 = 0;
        class336.field5352.method2393(106);
        class55.field646 = null;
        class176.field2668 = null;
        field2389++;
        class107.field1477 = null;
        class106.field1466 = null;
        class311.field4880 = arg0;
        class136.field2033 = null;
        class293.field4620 = null;
        class27.field326 = null;
        class360.field5701 = null;
        class132.field1905 = null;
        class168.field2579 = -1;
        class262.field4141 = null;
        class336.field5353 = null;
        class273.method1967((byte) 65);
        class247.field3901 = null;
        class180.field2697 = null;
        class99.field1338 = null;
        class140.method966(64, (byte) -125, 128);
        class236.method1631((byte) -49, 64);
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V", line = 341)
    private final void method1105(int arg0) {
        field2394++;
        int[] var2 = this.field2391[1];
        int[] var3 = this.field2391[this.field2391.length - 2];
        int[] var4 = this.field2391[0];
        if (arg0 != 31338) {
            this.method43((byte) -28);
        }
        int[] var5 = this.field2391[this.field2391.length - 1];
        this.field2384 = new int[] { var3[0] + var3[0] - var5[0], var3[1] + var3[1] + -var5[1] };
        this.field2385 = new int[] { var4[0] + var4[0] - var2[0], var4[1] + var4[1] + -var2[1] };
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[I", line = 373)
    public final int[] method47(int arg0, int arg1) {
        field2382++;
        int[] var3 = this.field4757.method903(arg0, arg1 + 1546337451);
        if (this.field4757.field1898) {
            int[] var4 = this.method2161(arg0, (byte) 126, 0);
            for (int var5 = 0; var5 < class31.field367; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2387[var6];
            }
        }
        if (arg1 != -1546337535) {
            field2392 = (class62) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 413)
    public class151() {
        super(1, true);
    }
}
