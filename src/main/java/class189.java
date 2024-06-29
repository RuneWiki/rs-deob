import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class189 extends class212 {

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    private int field3332 = 0;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "[S")
    private short[] field3337 = new short[257];

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "Lsc;")
    public static class181 field3342 = class149.method967(255, "Spieler");

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "S")
    public static short field3336 = 32767;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "Lsc;")
    public static class181 field3343 = class149.method967(255, "gelb:");

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ke", name = "kb", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ke", name = "lb", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "[I")
    private int[] field3330;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "[I")
    private int[] field3334;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "[[I")
    private int[][] field3331;

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class189() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
    public static final void method1307(int arg0) {
        class18.field328 = null;
        class203.field3508 = null;
        class35.field548 = null;
        class124.field2027 = null;
        ++field3329;
        class107.field1746 = null;
        class2.field61 = null;
        class196.field3424 = null;
        class218.field3749 = null;
        if (arg0 == -1036749716) {
            class52.field813 = null;
            class1.field29 = null;
            class113.field1836 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
    public static final void method1308(byte arg0) {
        class85.field1348.method1420(5125);
        ++field3346;
        class75.field1199.method628(-102);
        class8.field151.method628(-91);
        if (arg0 < 66) {
            field3339 = 104;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILrh;Lrh;)V")
    public static final void method1309(int arg0, class170 arg1, class170 arg2) {
        ++field3341;
        if (arg2.field2853 != null) {
            arg2.method1128((byte) 20);
        }
        arg2.field2850 = arg1.field2850;
        arg2.field2853 = arg1;
        arg2.field2853.field2850 = arg2;
        arg2.field2850.field2853 = arg2;
        if (arg0 != 0) {
            method1307(81);
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(IB)[I")
    private final int[] method1310(int arg0, byte arg1) {
        if (arg1 <= 8) {
            field3343 = null;
        }
        ++field3345;
        if (arg0 < 0) {
            return this.field3330;
        } else {
            return ~arg0 <= ~this.field3331.length ? this.field3334 : this.field3331[arg0];
        }
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)V")
    private final void method1311(int arg0) {
        ++field3344;
        int[] var2 = this.field3331[0];
        int[] var3 = this.field3331[this.field3331.length + -2];
        int[] var4 = this.field3331[1];
        int[] var5 = this.field3331[this.field3331.length + -1];
        this.field3330 = new int[] { var2[0] - -var2[0] - var4[0], var2[1] + -var4[arg0] + var2[1] };
        this.field3334 = new int[] { var3[0] - var5[0] - -var3[0], var3[1] + -var5[1] + var3[1] };
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field3338;
        int[] var3 = super.field3640.method737(true, arg0);
        if (arg1 <= 25) {
            field3340 = 61;
        }
        if (super.field3640.field1813) {
            int[] var4 = this.method1405(arg0, 0, 22);
            for (int var5 = 0; class26.field452 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3337[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field3332 = arg0.method1516((byte) 82);
            this.field3331 = new int[arg0.method1516((byte) 82)][2];
            for (int var4 = 0; ~this.field3331.length < ~var4; ++var4) {
                this.field3331[var4][0] = arg0.method1535(arg2 + 5);
                this.field3331[var4][1] = arg0.method1535(2);
            }
        }
        if (arg2 != -3) {
            this.method26((class230) null, -2, 110);
        }
        ++field3335;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(III)J")
    public static final long method1312(int arg0, int arg1, int arg2) {
        class220 var3 = class221.field3820[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field3806; ++var4) {
                class100 var5 = var3.field3797[var4];
                if ((var5.field1677 >> 29 & 3L) == 2L && var5.field1688 == arg1 && var5.field1672 == arg2) {
                    return var5.field1677;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)V")
    private final void method1313(byte arg0) {
        int var2 = this.field3332;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field3331.length + -1) && var4 >= this.field3331[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3331[var5 + -1];
                    int[] var7 = this.field3331[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                    int var9 = 4096 - class216.field3712[var8 >> 5 & 255] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3337[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field3331.length - 1 > var14 && var13 >= this.field3331[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3331[var14 + -1];
                    int[] var16 = this.field3331[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3337[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var22 = var20 << 4;
                int var23;
                for (var23 = 1; var23 < this.field3331.length - 1 && this.field3331[var23][0] <= var22; ++var23) {
                }
                int[] var24 = this.field3331[var23 - 1];
                int[] var25 = this.field3331[var23];
                int var26 = this.method1310(var23 + -2, (byte) 44)[1];
                int var27 = var25[1];
                int var28 = var24[1];
                int var29 = this.method1310(var23 + 1, (byte) 94)[1];
                int var30 = -var26 + -var27 + var29 + var28;
                int var31 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                int var32 = var31 * var31 >> 12;
                int var33 = -var28 + var26 + -var30;
                int var35 = -var26 + var27;
                int var36 = var31 * var35 >> 12;
                int var37 = (var30 * var31 >> 12) * var32 >> 12;
                int var38 = var32 * var33 >> 12;
                int var39 = var36 + var37 + var28 - -var38;
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (~var39 <= -32769) {
                    var39 = 32767;
                }
                this.field3337[var20] = (short) var39;
            }
        }
        ++field3333;
        int var21 = -65 % ((arg0 - 34) / 60);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        if (this.field3331 == null) {
            this.field3331 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3347;
        if (this.field3331.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3332 == -3) {
                this.method1311(1);
            }
            if (!arg0) {
                this.field3330 = null;
            }
            class85.method575(114);
            this.method1313((byte) -73);
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(B)V")
    public static void method1314(byte arg0) {
        field3342 = null;
        field3343 = null;
        if (arg0 != 50) {
            field3343 = null;
        }
    }
}
