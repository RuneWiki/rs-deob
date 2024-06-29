import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class44 extends class273 {

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "[S")
    private short[] field799 = new short[257];

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    private int field810 = 0;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "Lic;")
    public static class160 field805 = new class160(5);

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "Lll;")
    public static class123 field809;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "[I")
    private int[] field794;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "[I")
    private int[] field797;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "[[I")
    private int[][] field807;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)[I")
    private final int[] method376(int arg0, int arg1) {
        ++field806;
        if (arg1 < 0) {
            return this.field794;
        } else if (arg0 != 18436) {
            return null;
        } else {
            return arg1 >= this.field807.length ? this.field797 : this.field807[arg1];
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    private final void method377(int arg0) {
        int var2 = -60 % ((arg0 - -20) / 40);
        int[] var3 = this.field807[1];
        int[] var4 = this.field807[0];
        ++field804;
        int[] var5 = this.field807[this.field807.length - 1];
        int[] var6 = this.field807[this.field807.length + -2];
        this.field794 = new int[] { var4[0] - (var3[0] - var4[0]), var4[1] + -var3[1] + var4[1] };
        this.field797 = new int[] { var6[0] - -var6[0] - var5[0], var6[1] + -var5[1] + var6[1] };
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)I")
    public static final int method378(byte arg0, int arg1) {
        if (arg0 != -39) {
            field805 = null;
        }
        ++field792;
        return arg1 == 16711935 ? -1 : class102.method755((byte) 126, arg1);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
    public static final void method379(int arg0, boolean arg1) {
        ++field798;
        byte[][] var2 = class178.field2967;
        int var3 = class216.field3474.length;
        if (arg0 >= -40) {
            field805 = null;
        }
        for (int var4 = 0; ~var3 < ~var4; ++var4) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class268.field4291[var4] >> 8) * 64 - class256.field4082;
                int var7 = (class268.field4291[var4] & 255) * 64 + -class170.field2787;
                class260.method1738(true);
                class43.method375(var5, arg1, -24713, var6, class141.field2352, var7);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    public static final void method380(int arg0) {
        class80.field1327.method1157(760);
        if (arg0 != 255) {
            method383((byte) -28);
        }
        ++field796;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class44() {
        super(1, true);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLsb;)V")
    public static final void method381(byte arg0, class124 arg1) {
        class176.field2941 = arg1;
        if (arg0 >= -63) {
            field809 = null;
        }
        ++field803;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            this.method377(-63);
        }
        ++field800;
        int[] var3 = super.field4359.method387((byte) -35, arg1);
        if (super.field4359.field833) {
            int[] var4 = this.method1850(arg1, 0, (byte) -125);
            for (int var5 = 0; class26.field458 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field799[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method382(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field808;
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; arg0 > var6; ++var6) {
            int var7 = arg2[arg1 + var6] & 255;
            if (~var7 != -1) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class179.field2979[var7 - 128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg3 != 255) {
            field809 = null;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    public static void method383(byte arg0) {
        field809 = null;
        field805 = null;
        int var1 = -46 / ((-18 - arg0) / 36);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        if (this.field807 == null) {
            this.field807 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field795;
        if (arg0 <= -94) {
            if (this.field807.length < 2) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (~this.field810 == -3) {
                    this.method377(-94);
                }
                class155.method1117(-122);
                this.method384((byte) -9);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field810 = arg0.method1012(arg2 + -1);
            this.field807 = new int[arg0.method1012(4)][2];
            for (int var4 = 0; ~var4 > ~this.field807.length; ++var4) {
                this.field807[var4][0] = arg0.method996(65280);
                this.field807[var4][1] = arg0.method996(65280);
            }
        }
        ++field802;
        if (arg2 != 5) {
            this.field807 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V")
    private final void method384(byte arg0) {
        if (arg0 != -9) {
            this.method4(true, 39);
        }
        int var2 = this.field810;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field807.length + -1) < ~var5 && this.field807[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field807[var5 + -1];
                    int[] var7 = this.field807[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class223.field3561[(8174 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field799[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field807.length - 1) < ~var14 && var13 >= this.field807[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field807[var14];
                    int[] var16 = this.field807[var14 - 1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field799[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field807.length + -1) && ~var21 <= ~this.field807[var22][0]; ++var22) {
                }
                int[] var23 = this.field807[var22 + -1];
                int[] var24 = this.field807[var22];
                int var25 = this.method376(arg0 ^ -18445, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method376(18436, var22 - -1)[1];
                int var29 = -var25 + var27;
                int var31 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var32 = var26 + var28 - var27 + -var25;
                int var33 = var31 * var31 >> 12;
                int var34 = var25 - (var26 + var32);
                int var35 = var33 * var34 >> 12;
                int var36 = (var31 * var32 >> 12) * var33 >> 12;
                int var37 = var29 * var31 >> 12;
                int var38 = var36 - -var35 + var26 - -var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field799[var20] = (short) var38;
            }
        }
        ++field801;
    }
}
