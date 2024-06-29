import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class221 extends class175 {

    @OriginalMember(owner = "client!th", name = "db", descriptor = "I")
    private int field3780 = 0;

    @OriginalMember(owner = "client!th", name = "ib", descriptor = "[S")
    private short[] field3785 = new short[257];

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    public static int field3770 = 0;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field3769 = 2;

    @OriginalMember(owner = "client!th", name = "fb", descriptor = "I")
    public static volatile int field3782 = -1;

    @OriginalMember(owner = "client!th", name = "hb", descriptor = "Lmb;")
    public static class96 field3784 = class243.method1708(" )2> <col=ffffff>", (byte) 122);

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "Lmb;")
    public static class96 field3775 = class243.method1708("floorshadows", (byte) 105);

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!th", name = "gb", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!th", name = "jb", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "Ltf;")
    public static class106 field3768;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "[I")
    private int[] field3777;

    @OriginalMember(owner = "client!th", name = "lb", descriptor = "[I")
    private int[] field3788;

    @OriginalMember(owner = "client!th", name = "kb", descriptor = "[Lmj;")
    public static class246[] field3787;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "[[I")
    private int[][] field3779;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field3767;
        if (this.field3779 == null) {
            this.field3779 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 > this.field3779.length) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3780 == -3) {
                this.method1522(44);
            }
            class29.method189(4096);
            this.method1525(1);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(III)V")
    public static final void method1517(int arg0, int arg1, int arg2) {
        ++field3778;
        if (arg2 == 1) {
            if (class225.method1534(-1, arg1)) {
                class68.method471(arg0, arg2 + -116, class100.field1704[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
    public static final void method1518(int arg0) {
        ++field3772;
        if (arg0 == 0) {
            if (class60.field1037 != null) {
                class234 var1 = class60.field1037;
                synchronized (class60.field1037) {
                    class60.field1037 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(BI)[I")
    private final int[] method1519(byte arg0, int arg1) {
        ++field3776;
        if (~arg1 > -1) {
            return this.field3777;
        } else {
            if (arg0 != 54) {
                this.field3777 = null;
            }
            return arg1 >= this.field3779.length ? this.field3788 : this.field3779[arg1];
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = -21 % ((62 - arg0) / 54);
        int[] var4 = super.field3044.method904((byte) 77, arg1);
        ++field3773;
        if (super.field3044.field2150) {
            int[] var5 = this.method1255(0, arg1, 128);
            for (int var6 = 0; class1.field11 > var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (~var7 > -1) {
                    var7 = 0;
                }
                if (~var7 < -257) {
                    var7 = 256;
                }
                var4[var6] = this.field3785[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(B)V")
    public static final void method1520(byte arg0) {
        class15.field237.method96(false);
        if (arg0 >= 115) {
            class51.field883.method96(false);
            ++field3786;
            class224.field3808.method96(false);
            class258.field4470.method96(false);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILnb;JLnb;Lnb;)V")
    public static final void method1521(int arg0, int arg1, int arg2, int arg3, class108 arg4, long arg5, class108 arg6, class108 arg7) {
        class41 var9 = new class41();
        var9.field695 = arg4;
        var9.field700 = arg1 * 128 + 64;
        var9.field703 = arg2 * 128 + 64;
        var9.field697 = arg3;
        var9.field704 = arg5;
        var9.field708 = arg6;
        var9.field709 = arg7;
        int var10 = 0;
        class187 var11 = class259.field4487[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3282; ++var12) {
                class70 var13 = var11.field3274[var12];
                if ((var13.field1197 & 4194304L) == 4194304L) {
                    int var14 = var13.field1214.method50();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field705 = -var10;
        if (class259.field4487[arg0][arg1][arg2] == null) {
            class259.field4487[arg0][arg1][arg2] = new class187(arg0, arg1, arg2);
        }
        class259.field4487[arg0][arg1][arg2].field3285 = var9;
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    private final void method1522(int arg0) {
        int[] var2 = this.field3779[0];
        if (arg0 >= 23) {
            int[] var3 = this.field3779[1];
            ++field3774;
            int[] var4 = this.field3779[this.field3779.length + -2];
            int[] var5 = this.field3779[this.field3779.length + -1];
            this.field3788 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - (var5[1] - var4[1]) };
            this.field3777 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] + var2[1] + -var3[1] };
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field3766;
        int var4 = -72 % ((-22 - arg0) / 58);
        if (~arg1 == -1) {
            this.field3780 = arg2.method1651(4139);
            this.field3779 = new int[arg2.method1651(4139)][2];
            for (int var5 = 0; this.field3779.length > var5; ++var5) {
                this.field3779[var5][0] = arg2.method1663((byte) -99);
                this.field3779[var5][1] = arg2.method1663((byte) -78);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(B)V")
    public static void method1523(byte arg0) {
        field3787 = null;
        field3784 = null;
        field3775 = null;
        field3768 = null;
        if (arg0 >= -104) {
            field3769 = -43;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class221() {
        super(1, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lrg;Z)V")
    public static final void method1524(class239 arg0, boolean arg1) {
        ++field3771;
        if (!arg1) {
            method1524((class239) null, true);
        }
        for (int var2 = 0; class17.field248 > var2; ++var2) {
            int var3 = arg0.method1666(24348);
            int var4 = arg0.method1663((byte) 106);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class83.field1414[var3] != null) {
                class83.field1414[var3].field772 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    private final void method1525(int arg0) {
        ++field3781;
        if (arg0 != 1) {
            field3775 = null;
        }
        int var2 = this.field3780;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field3779.length + -1) && var4 >= this.field3779[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3779[var5 + -1];
                    int[] var7 = this.field3779[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                    int var9 = -class103.field1741[(8181 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field3785[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field3779.length + -1) < ~var14 && var13 >= this.field3779[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3779[var14 + -1];
                    int[] var16 = this.field3779[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3785[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field3779.length + -1 > var22 && this.field3779[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field3779[var22];
                int[] var24 = this.field3779[var22 + -1];
                int var25 = this.method1519((byte) 54, var22 + -2)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1519((byte) 54, var22 + 1)[1];
                int var29 = (var21 - var24[0] << 12) / (var23[0] + -var24[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 + var26 + -var27;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var34 = (var29 * var31 >> 12) * var30 >> 12;
                int var35 = var29 * var33 >> 12;
                int var36 = var30 * var32 >> 12;
                int var38 = var34 + var35 + var36 + var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3785[var20] = (short) var38;
            }
        }
    }
}
