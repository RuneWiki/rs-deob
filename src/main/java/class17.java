import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class17 extends class224 {

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    private int field190 = 0;

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "[S")
    private short[] field192 = new short[257];

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "Luf;")
    public static class168 field187 = class148.method1019(-1720, ")4l=");

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "Luf;")
    private static class168 field189 = class148.method1019(-1720, " more options");

    @OriginalMember(owner = "client!wf", name = "gb", descriptor = "Luf;")
    public static class168 field198 = field189;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "[F")
    public static float[] field183 = new float[4];

    @OriginalMember(owner = "client!wf", name = "jb", descriptor = "I")
    public static int field201 = 0;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!wf", name = "fb", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "[I")
    private int[] field194;

    @OriginalMember(owner = "client!wf", name = "hb", descriptor = "[I")
    private int[] field199;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "[[I")
    private int[][] field184;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)I", line = 5)
    public static final int method74(int arg0, byte arg1, int arg2) {
        class143 var3 = (class143) class259.field4390.method493((long) arg2, 62);
        field200++;
        if (var3 == null) {
            return 0;
        }
        if (arg1 <= 23) {
            method74(60, (byte) 72, -36);
        }
        if (arg0 == -1) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field2201.length; var5++) {
            if (var3.field2207[var5] == arg0) {
                var4 += var3.field2201[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(B)V", line = 38)
    public static void method75(byte arg0) {
        field183 = null;
        field187 = null;
        if (arg0 == -4) {
            field189 = null;
            field198 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(B)V", line = 56)
    private final void method76(byte arg0) {
        field186++;
        int[] var2 = this.field184[0];
        int[] var3 = this.field184[this.field184.length - 1];
        int[] var4 = this.field184[1];
        if (arg0 <= -18) {
            int[] var5 = this.field184[this.field184.length - 2];
            this.field199 = new int[] { var2[0] - (var4[0] - var2[0]), var2[1] - (var4[1] - var2[1]) };
            this.field194 = new int[] { var5[0] + var5[0] - var3[0], var5[1] + -var3[1] + var5[1] };
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLdk;)V", line = 76)
    public static final void method77(boolean arg0, class241 arg1) {
        class31.field384 = arg1.method1646(-27248, class244.field4161);
        field185 = arg1.method1646(-27248, class135.field2110);
        field197++;
        class159.field2504 = arg1.method1646(-27248, class274.field4612);
        class106.field1635 = arg1.method1646(-27248, class165.field2647);
        class194.field3154 = arg1.method1646(-27248, class159.field2515);
        class156.field2463 = arg1.method1646(-27248, class218.field3553);
        if (arg0) {
            return;
        }
        class6.field74 = arg1.method1646(-27248, class121.field1881);
        class78.field1072 = arg1.method1646(-27248, class139.field2139);
        class224.field3616 = arg1.method1646(-27248, class109.field1684);
        class44.field542 = arg1.method1646(-27248, class113.field1775);
        class153.field2377 = arg1.method1646(-27248, class9.field113);
        class110.field1725 = arg1.method1646(-27248, class60.field788);
        class287.field4845 = arg1.method1646(-27248, class196.field3243);
        class71.field958 = arg1.method1646(-27248, class261.field4424);
        class143.field2210 = arg1.method1646(-27248, class67.field893);
        class133.field2078 = arg1.method1646(-27248, class102.field1584);
        class272.field4580 = arg1.method1646(-27248, class299.field5060);
        class110.field1708 = arg1.method1646(-27248, class143.field2202);
        class189.field3034 = arg1.method1646(-27248, class120.field1867);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I", line = 105)
    private final int[] method78(int arg0, int arg1) {
        field195++;
        if (~arg0 > arg1) {
            return this.field199;
        } else if (this.field184.length <= arg0) {
            return this.field194;
        } else {
            return this.field184[arg0];
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V", line = 120)
    private final void method79(int arg0) {
        field188++;
        int var2 = this.field190;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field184.length - 1 > var22 && this.field184[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field184[var22];
                int[] var24 = this.field184[var22 - 1];
                int var25 = this.method78(var22 - 2, -1)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method78(var22 + 1, -1)[1];
                int var29 = (var21 - var24[0] << 12) / (var23[0] - var24[0]);
                int var30 = var27 + var28 - var26 - var25;
                int var31 = var29 * var29 >> 12;
                int var32 = var25 - (var27 + var30);
                int var33 = (var29 * var30 >> 12) * var31 >> 12;
                int var34 = var31 * var32 >> 12;
                int var35 = var26 - var25;
                int var36 = var29 * var35 >> 12;
                int var38 = var33 + var34 + var36 + var27;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field192[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var11 = 0; var11 < 257; var11++) {
                int var12 = var11 << 4;
                int var13;
                for (var13 = 1; this.field184.length - 1 > var13 && var12 >= this.field184[var13][0]; var13++) {
                }
                int[] var14 = this.field184[var13 - 1];
                int[] var15 = this.field184[var13];
                int var16 = (var12 - var14[0] << 12) / (var15[0] - var14[0]);
                int var17 = 4096 - class261.field4425[var16 >> 5 & 0xFF] >> 1;
                int var18 = 4096 - var17;
                int var19 = var14[1] * var18 + var15[1] * var17 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field192[var11] = (short) var19;
            }
        } else {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field184.length - 1) && this.field184[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field184[var5 - 1];
                int[] var7 = this.field184[var5];
                int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var9 = 4096 - var8;
                int var10 = var6[1] * var9 + (var7[1] * var8) >> 12;
                if (var10 <= -32768) {
                    var10 = -32767;
                }
                if (var10 >= 32768) {
                    var10 = 32767;
                }
                this.field192[var3] = (short) var10;
            }
        }
        if (arg0 != -28752) {
            field198 = (class168) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)[I", line = 300)
    public final int[] method18(byte arg0, int arg1) {
        int[] var3 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int[] var4 = this.method1537(arg1, 0, 0);
            for (int var5 = 0; var5 < class187.field2961; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field192[var6];
            }
        }
        int var7 = -95 / ((20 - arg0) / 51);
        field193++;
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 393)
    public class17() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZLj;)V", line = 366)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field196++;
        if (arg0 == 0) {
            this.field190 = arg2.method1042((byte) -103);
            this.field184 = new int[arg2.method1042((byte) -22)][2];
            for (int var4 = 0; var4 < this.field184.length; var4++) {
                this.field184[var4][0] = arg2.method1069(42);
                this.field184[var4][1] = arg2.method1069(33);
            }
        }
        if (arg1) {
            this.field190 = 11;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 414)
    public final void method80(boolean arg0) {
        if (this.field184 == null) {
            this.field184 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (arg0) {
            field187 = (class168) null;
        }
        field191++;
        if (this.field184.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field190 == 2) {
            this.method76((byte) -124);
        }
        class125.method889(123);
        this.method79(-28752);
    }
}
