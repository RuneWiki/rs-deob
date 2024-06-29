import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class290 extends class107 {

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    private int field4741 = 0;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    private int field4740 = 0;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    private int field4745 = 0;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "Ljava/lang/String;")
    public static String field4754 = "white:";

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    private int field4738;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    private int field4747;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    private int field4750;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    private int field4753;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    private int field4755;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    private int field4758;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "[[[I")
    public static int[][][] field4757;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public static final void method1995(int arg0) {
        ++field4742;
        class101.field1592 = null;
        class236.field3706 = null;
        if (arg0 != -1102255476) {
            field4749 = 31;
        }
        class230.field3606 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIILjava/lang/String;Lge;ZLrg;)V")
    public static final void method1996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, class73 arg7, boolean arg8, class248 arg9) {
        ++field4743;
        int var10 = (int) class114.field1742 - -class278.field4540 & 2047;
        int var11 = arg5 * arg5 - -(arg0 * arg0);
        int var12 = Math.max(arg9.field4016 / 2, arg9.field4057 / 2) + 10;
        if (~var11 >= ~(var12 * var12)) {
            int var13 = class136.field2191[var10];
            int var14 = var13 * 256 / (class150.field2394 - -256);
            if (!arg8) {
                field4754 = null;
            }
            int var15 = class136.field2193[var10];
            int var16 = var15 * 256 / (class150.field2394 + 256);
            int var17 = arg0 * var14 + arg5 * var16 >> 16;
            int var18 = arg0 * var16 + -(arg5 * var14) >> 16;
            int var19 = arg7.method520(arg6, 100);
            int var20 = arg7.method522(arg6, 100, 0);
            int var21 = var17 - var19 / 2;
            if (~var21 <= ~(-arg9.field4016) && var21 <= arg9.field4016 && var18 >= -arg9.field4057 && ~arg9.field4057 <= ~var18) {
                class94.method661(arg9.field3993, arg9.field3934);
                arg7.method517(arg6, arg9.field4016 / 2 + var21 - -arg3, arg9.field4057 / 2 + arg1 + -arg2 + -var18 + -var20, var19, 50, arg4, 0, 256, 1, 0, 0);
                class94.method677();
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class290() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field4741 = (arg1.method1830((byte) -104) << 12) / 100;
                }
            } else {
                this.field4740 = (arg1.method1830((byte) 68) << 12) / 100;
            }
        } else {
            this.field4745 = arg1.method1847(arg2 + -432);
        }
        if (arg2 == 28) {
            ++field4752;
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
    public static void method1997(int arg0) {
        field4754 = null;
        field4757 = null;
        if (arg0 != -30275) {
            method1996(56, -13, -12, -21, 28, -43, (String) null, (class73) null, false, (class248) null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIILie;IJIIII)Z")
    public static final boolean method1998(int arg0, int arg1, int arg2, int arg3, class34 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class154.method1046(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V")
    private final void method1999(int arg0, int arg1, int arg2, int arg3) {
        ++field4748;
        int var5 = arg2 <= 2048 ? (arg3 + 4096) * arg2 >> 12 : -(arg2 * arg3 >> 12) + arg2 - -arg3;
        if (~var5 >= -1) {
            this.field4758 = this.field4738 = this.field4755 = arg2;
        } else {
            int var6 = arg2 + arg2 + -var5;
            int var7 = arg1 * 6;
            int var8 = var7 >> 12;
            int var9 = (-var6 + var5 << 12) / var5;
            int var10 = var7 - (var8 << 12);
            int var12 = var9 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var6 + var13;
            int var15 = -var13 + var5;
            if (var8 != 0) {
                if (var8 != 1) {
                    if (~var8 != -3) {
                        if (var8 != 3) {
                            if (var8 != 4) {
                                if (~var8 == -6) {
                                    this.field4758 = var5;
                                    this.field4738 = var6;
                                    this.field4755 = var15;
                                }
                            } else {
                                this.field4755 = var5;
                                this.field4758 = var14;
                                this.field4738 = var6;
                            }
                        } else {
                            this.field4755 = var5;
                            this.field4758 = var6;
                            this.field4738 = var15;
                        }
                    } else {
                        this.field4755 = var14;
                        this.field4738 = var5;
                        this.field4758 = var6;
                    }
                } else {
                    this.field4758 = var15;
                    this.field4755 = var6;
                    this.field4738 = var5;
                }
            } else {
                this.field4738 = var14;
                this.field4755 = var6;
                this.field4758 = var5;
            }
        }
        if (arg0 != 27603) {
            field4737 = -128;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        ++field4746;
        if (arg1 != -117) {
            this.field4755 = 43;
        }
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063) {
            int[][] var4 = this.method759(0, -128, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class24.field443 > var11; ++var11) {
                this.method2000(var5[var11], var6[var11], var7[var11], -103);
                this.field4750 += this.field4741;
                for (this.field4753 += this.field4745; this.field4753 < 0; this.field4753 += 4096) {
                }
                while (this.field4753 > 4096) {
                    this.field4753 -= 4096;
                }
                if (~this.field4750 > -1) {
                    this.field4750 = 0;
                }
                this.field4747 += this.field4740;
                if (this.field4750 > 4096) {
                    this.field4750 = 4096;
                }
                if (~this.field4747 > -1) {
                    this.field4747 = 0;
                }
                if (~this.field4747 < -4097) {
                    this.field4747 = 4096;
                }
                this.method1999(27603, this.field4753, this.field4750, this.field4747);
                var9[var11] = this.field4758;
                var8[var11] = this.field4738;
                var10[var11] = this.field4755;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIII)V")
    private final void method2000(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 > arg0 ? arg0 : arg1;
        if (arg3 >= -65) {
            method1997(-21);
        }
        ++field4744;
        int var6 = arg1 < arg0 ? arg0 : arg1;
        int var7 = arg2 <= var6 ? var6 : arg2;
        int var8 = arg2 >= var5 ? var5 : arg2;
        this.field4750 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (var9 <= 0) {
            this.field4753 = 0;
        } else {
            int var10 = (var7 - arg0 << 12) / var9;
            int var11 = (-arg1 + var7 << 12) / var9;
            int var12 = (-arg2 + var7 << 12) / var9;
            if (~arg0 != ~var7) {
                if (arg1 != var7) {
                    this.field4753 = arg0 != var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field4753 = arg2 != var8 ? 12288 - var12 : var10 + 4096;
                }
            } else {
                this.field4753 = arg1 == var8 ? var12 + 20480 : -var11 + 4096;
            }
            this.field4753 /= 6;
        }
        if (this.field4750 > 0 && ~this.field4750 > -4097) {
            this.field4747 = (var9 << 12) / (this.field4750 <= 2048 ? this.field4750 * 2 : -(this.field4750 * 2) + 8192);
        } else {
            this.field4747 = 0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)V")
    public static final void method2001(byte arg0) {
        ++field4756;
        class302.method2063(50);
        class7.method69(1260583304);
        class66.method439((byte) -98);
        if (arg0 < 69) {
            method1998(-95, 79, 85, -49, (class34) null, -20, 91L, 22, -110, -103, 92);
        }
        class50.method323((byte) -128);
        class156.method1054(-119);
        class117.method802((byte) 42);
        class104.method742(0);
        class307.method2089(612106668);
        class127.method872(-1);
        class149.method1008(26469);
        class41.method284(0);
        class152.method1032(4806);
        class140.method966((byte) 3);
        class214.method1469((byte) -128);
        class128.method879(true);
        class205.method1418(24989);
        class178.method1253(110);
        class59.method384(3);
        class150.method1014(-19651);
        if (class215.field3395 != 0) {
            for (int var1 = 0; class111.field1709.length > var1; ++var1) {
                class111.field1709[var1] = null;
            }
            class62.field991 = 0;
        }
        class292.method2013(-49);
        class102.method733((byte) 115);
        class208.method1428(0);
        class284.method1931((byte) -59);
        class255.field4210.method1873(-7401);
        ((class220) class136.field2196).method1499(32);
        class108.field1682.method58(false);
        class93.field1492.method1174(-84);
        class205.field3299.method1174(-82);
        class239.field3746.method1174(110);
        class53.field772.method1174(92);
        class175.field2919.method1174(-16);
        class203.field3290.method1174(-63);
        class164.field2710.method1174(83);
        class118.field1844.method1174(-18);
        class61.field880.method1174(-53);
        class221.field3482.method1174(123);
        class6.field151.method1174(103);
        class52.field762.method1873(-7401);
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V")
    public static final void method2002(int arg0) {
        ++field4751;
        for (int var1 = 0; var1 < 5; ++var1) {
            class12.field217[var1] = false;
        }
        class74.field1189 = 0;
        class311.field5026 = -1;
        class251.field4132 = 0;
        class22.field424 = -1;
        if (arg0 != 2048) {
            field4735 = -107;
        }
        class231.field3613 = 5;
    }
}
