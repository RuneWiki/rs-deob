import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class319 extends class739 {

    @OriginalMember(owner = "client!iia", name = "I", descriptor = "[S")
    private short[] field4353 = new short[257];

    @OriginalMember(owner = "client!iia", name = "L", descriptor = "I")
    private int field4356 = 0;

    @OriginalMember(owner = "client!iia", name = "C", descriptor = "I")
    public static int field4347 = 0;

    @OriginalMember(owner = "client!iia", name = "A", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!iia", name = "E", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!iia", name = "F", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!iia", name = "G", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!iia", name = "H", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!iia", name = "J", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!iia", name = "K", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!iia", name = "M", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "[I")
    private int[] field4344;

    @OriginalMember(owner = "client!iia", name = "B", descriptor = "[I")
    private int[] field4346;

    @OriginalMember(owner = "client!iia", name = "D", descriptor = "[[I")
    private int[][] field4348;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIILnf;Lnf;)V")
    public static final void method1981(int arg0, int arg1, int arg2, class19 arg3, class19 arg4) {
        class375 var5 = class211.method1494(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5431 = arg3;
            var5.field5427 = arg4;
            int var6 = class95.field1372 == class25.field221 ? 1 : 0;
            if (arg3.method607((byte) 97)) {
                if (arg3.method614((byte) -107)) {
                    class499.field7174[var6][class575.field8273[var6]++] = arg3;
                } else {
                    class132.field1818[var6][class355.field5248[var6]++] = arg3;
                    class235.field3518 = true;
                }
            } else {
                class399.field5714[var6][class145.field1963[var6]++] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method607((byte) 125)) {
                    if (arg4.method614((byte) 45)) {
                        class499.field7174[var6][class575.field8273[var6]++] = arg4;
                        return;
                    }
                    class132.field1818[var6][class355.field5248[var6]++] = arg4;
                    class235.field3518 = true;
                    return;
                }
                class399.field5714[var6][class145.field1963[var6]++] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)V")
    private final void method1982(int arg0) {
        ++field4354;
        int[] var2 = this.field4348[0];
        int[] var3 = this.field4348[1];
        int[] var4 = this.field4348[this.field4348.length + -2];
        int[] var5 = this.field4348[this.field4348.length - 1];
        this.field4346 = new int[] { var2[0] - var3[arg0] - -var2[0], var2[1] + var2[1] + -var3[1] };
        this.field4344 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "()V")
    public class319() {
        super(1, true);
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(II)[I")
    private final int[] method1983(int arg0, int arg1) {
        ++field4357;
        if (arg0 < 0) {
            return this.field4346;
        } else if (arg1 <= 80) {
            return null;
        } else {
            return arg0 >= this.field4348.length ? this.field4344 : this.field4348[arg0];
        }
    }

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "(I)V")
    public static final void method1984(int arg0) {
        class43.field733 = new class151[1000];
        class755.field10518 = new class151[500];
        class618.field8798 = 0;
        class311.field4226 = 0;
        class367.field5373 = class150.field2190;
        ++field4352;
        class704.field9921 = false;
        class495.field7114 = 0;
        class445.field6359 = 0;
        class694.field9823 = new int[class433.field6202][class439.field6264 + 1][class408.field5806 + 1];
        class160.field2308 = new class151[500];
        if (arg0 != -32769) {
            method1986(-32, 92, -42, -102, 47);
        }
        class15.field156 = class150.field2190;
        class633.field8932 = new class151[2000];
        if (class391.field5644 instanceof class406) {
            class522.field7591 = false;
        } else {
            class522.field7591 = true;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        if (arg0) {
            method1981(48, -99, 58, (class19) null, (class19) null);
        }
        ++field4345;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int[] var4 = this.method4127(arg1, 83, 0);
            for (int var5 = 0; class399.field5703 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4353[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)V")
    private final void method1985(byte arg0) {
        int var2 = this.field4356;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field4348.length + -1) && ~this.field4348[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field4348[var5 + -1];
                    int[] var7 = this.field4348[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = 4096 - class195.field2853[var8 >> 5 & 255] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field4353[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field4348.length + -1 && ~this.field4348[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field4348[var14 - 1];
                    int[] var16 = this.field4348[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field4353[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field4348.length + -1) && ~var21 <= ~this.field4348[var22][0]; ++var22) {
                }
                int[] var23 = this.field4348[var22 + -1];
                int[] var24 = this.field4348[var22];
                int var25 = this.method1983(var22 + -2, 90)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1983(var22 - -1, 99)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 - -var37 - -var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field4353[var20] = (short) var38;
            }
        }
        if (arg0 > -26) {
            this.field4348 = null;
        }
        ++field4349;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V")
    public final void method628(int arg0) {
        if (this.field4348 == null) {
            this.field4348 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 > 53) {
            ++field4350;
            if (this.field4348.length < 2) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (~this.field4356 == -3) {
                    this.method1982(0);
                }
                class451.method2765(8);
                this.method1985((byte) -82);
            }
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIIII)V")
    public static final void method1986(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4355;
        if (arg3 == 0) {
            if (~arg2 != -9 && arg2 != 16) {
                class375 var5 = class565.field8185[arg4][arg0][arg1];
                if (var5 != null) {
                    if (~arg2 != -2) {
                        if (arg2 == 2) {
                            var5.field5436 = 0;
                        }
                    } else {
                        var5.field5434 = 0;
                    }
                }
                class749.method4175(125);
            } else {
                for (int var6 = 0; var6 < class495.field7114; ++var6) {
                    class151 var7 = class43.field733[var6];
                    if (~var7.field2197 == ~arg2 && ~var7.field2200 == ~arg0 && ~var7.field2205 == ~arg1 || var7.field2202 == arg0 && var7.field2205 == arg1) {
                        if (class495.field7114 != var6) {
                            class85.method680(class43.field733, var6 + 1, class43.field733, var6, class43.field733.length + -1 + -var6);
                        }
                        --class495.field7114;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            this.field4356 = arg0.method2886(true);
            this.field4348 = new int[arg0.method2886(true)][2];
            for (int var4 = 0; var4 < this.field4348.length; ++var4) {
                this.field4348[var4][0] = arg0.method2882(-1);
                this.field4348[var4][1] = arg0.method2882(class639.method3689(arg2, -2));
            }
        }
        ++field4351;
        if (arg2 != 1) {
            this.field4356 = 114;
        }
    }
}
