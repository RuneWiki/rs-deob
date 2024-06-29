import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class299 extends class43 {

    @OriginalMember(owner = "client!bc", name = "oc", descriptor = "I")
    public int field4766 = -1;

    @OriginalMember(owner = "client!bc", name = "wc", descriptor = "I")
    public int field4774 = 0;

    @OriginalMember(owner = "client!bc", name = "Bc", descriptor = "I")
    public int field4779 = -1;

    @OriginalMember(owner = "client!bc", name = "yc", descriptor = "Z")
    public boolean field4776 = false;

    @OriginalMember(owner = "client!bc", name = "tc", descriptor = "I")
    public int field4771 = 255;

    @OriginalMember(owner = "client!bc", name = "zc", descriptor = "I")
    public int field4777 = -1;

    @OriginalMember(owner = "client!bc", name = "Ic", descriptor = "B")
    private byte field4786 = 0;

    @OriginalMember(owner = "client!bc", name = "Hc", descriptor = "I")
    public int field4785 = -1;

    @OriginalMember(owner = "client!bc", name = "Kc", descriptor = "I")
    public int field4788 = 0;

    @OriginalMember(owner = "client!bc", name = "rc", descriptor = "I")
    public int field4769 = -1;

    @OriginalMember(owner = "client!bc", name = "Nc", descriptor = "I")
    public int field4791 = -1;

    @OriginalMember(owner = "client!bc", name = "Mc", descriptor = "I")
    public int field4790 = 0;

    @OriginalMember(owner = "client!bc", name = "uc", descriptor = "B")
    private byte field4772 = 0;

    @OriginalMember(owner = "client!bc", name = "Dc", descriptor = "I")
    public int field4781 = 0;

    @OriginalMember(owner = "client!bc", name = "Tc", descriptor = "I")
    public int field4797 = 0;

    @OriginalMember(owner = "client!bc", name = "xc", descriptor = "I")
    public int field4775 = -1;

    @OriginalMember(owner = "client!bc", name = "Gc", descriptor = "Lqd;")
    public static class173 field4784 = new class173(64);

    @OriginalMember(owner = "client!bc", name = "Oc", descriptor = "I")
    public static int field4792 = 0;

    @OriginalMember(owner = "client!bc", name = "sc", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!bc", name = "vc", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!bc", name = "Cc", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!bc", name = "Ec", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!bc", name = "Fc", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!bc", name = "Jc", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!bc", name = "Lc", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!bc", name = "Pc", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!bc", name = "Qc", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!bc", name = "Rc", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!bc", name = "Sc", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!bc", name = "Uc", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!bc", name = "Vc", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!bc", name = "Xc", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!bc", name = "Yc", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!bc", name = "Zc", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!bc", name = "pc", descriptor = "Loh;")
    public class264 field4767;

    @OriginalMember(owner = "client!bc", name = "qc", descriptor = "Ljava/lang/String;")
    public String field4768;

    @OriginalMember(owner = "client!bc", name = "Ac", descriptor = "Ljava/lang/String;")
    public String field4778;

    @OriginalMember(owner = "client!bc", name = "Wc", descriptor = "[Ljava/lang/String;")
    public static String[] field4800;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)I")
    public final int method286(int arg0) {
        if (arg0 <= 42) {
            method1978((byte) -36, (char) 65495);
        }
        ++field4783;
        return super.field626;
    }

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "(I)V")
    public static void method1974(int arg0) {
        field4784 = null;
        field4800 = null;
        if (arg0 <= 42) {
            field4800 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBZI)V")
    public final void method1975(int arg0, byte arg1, boolean arg2, int arg3) {
        ++field4802;
        super.method278(arg2, arg0, arg3, (byte) -70, this.method279(23397));
        if (arg1 != -67) {
            this.method1976(false, -101);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method1976(boolean arg0, int arg1) {
        ++field4787;
        if (arg1 != -13) {
            return null;
        } else {
            return !arg0 ? this.field4778 : this.field4768;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)Z")
    public final boolean method285(int arg0) {
        ++field4793;
        if (this.field4767 == null) {
            return false;
        } else {
            return arg0 > 89;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4789;
        if (!super.field675) {
            if (this.field4767 == null) {
                return;
            }
            class307 var6 = ~super.field699 != 0 && super.field717 == 0 ? class22.method121(super.field699, true) : null;
            class307 var7 = ~super.field682 == 0 || this.field4776 || super.field682 == this.method292(122).field3006 && var6 != null ? null : class22.method121(super.field682, true);
            class37 var8 = this.field4767.method1773(super.field686, false, super.field688, false, var7, super.field619, super.field659, super.field662, var6, -1, super.field638, super.field679);
            if (var8 == null) {
                return;
            }
            this.method287(var8, 102, (class37) null);
        }
        if (super.field707 != null) {
            super.field707.method1250(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lwd;II)V")
    public final void method1977(class162 arg0, int arg1, int arg2) {
        ++field4801;
        arg0.field2568 = 0;
        int var4 = arg0.method1133((byte) 53);
        boolean var5 = ~(4 & var4) != -1;
        boolean var6 = ~(var4 & 2) != -1;
        int var7 = super.method279(23397);
        int var8 = 1 & var4;
        int var9 = -1;
        this.method280((byte) -117, (7 & var4 >> 3) + 1);
        int[] var10 = new int[12];
        this.field4786 = (byte) (3 & var4 >> 6);
        super.field637 += 64 * (this.method279(arg1 + 23397) + -var7);
        super.field710 += (this.method279(23397) + -var7) * 64;
        this.field4772 = arg0.method1107((byte) -86);
        this.field4766 = arg0.method1107((byte) -110);
        this.field4769 = arg0.method1107((byte) -100);
        this.field4781 = arg1;
        for (int var11 = 0; ~var11 > -13; ++var11) {
            int var12 = arg0.method1133((byte) 53);
            if (~var12 == -1) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method1133((byte) 53);
                int var14 = (var12 << 8) + var13;
                if (var11 == 0 && var14 == 65535) {
                    var9 = arg0.method1142(-18970);
                    this.field4781 = arg0.method1133((byte) 53);
                    break;
                }
                if (~var14 <= -32769) {
                    int var25 = class86.field1421[var14 + -32768];
                    var10[var11] = class173.method1263(var25, 1073741824);
                    int var26 = class81.method562(var25, -20358).field1840;
                    if (var26 != 0) {
                        this.field4781 = var26;
                    }
                } else {
                    var10[var11] = class173.method1263(var14 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; ++var16) {
            int var24 = arg0.method1133((byte) 53);
            if (~var24 > -1 || class241.field3848[var16].length <= var24) {
                var24 = 0;
            }
            var15[var16] = var24;
        }
        super.field626 = arg0.method1142(-18970);
        this.field4768 = arg0.method1152(-68);
        if (var6) {
            this.field4778 = arg0.method1152(-65);
        } else {
            this.field4778 = this.field4768;
        }
        this.field4790 = arg0.method1133((byte) 53);
        if (!var5) {
            this.field4797 = 0;
            this.field4774 = arg0.method1133((byte) 53);
            this.field4791 = arg0.method1133((byte) 53);
            if (this.field4791 == 255) {
                this.field4791 = -1;
            }
        } else {
            this.field4797 = arg0.method1142(arg1 + -18970);
            this.field4774 = this.field4790;
            this.field4791 = -1;
        }
        int var17 = this.field4788;
        this.field4788 = arg0.method1133((byte) 53);
        if (this.field4788 != 0) {
            int var18 = this.field4775;
            int var19 = this.field4777;
            int var20 = this.field4779;
            int var21 = this.field4771;
            int var22 = this.field4785;
            this.field4785 = arg0.method1142(-18970);
            this.field4779 = arg0.method1142(-18970);
            this.field4777 = arg0.method1142(-18970);
            this.field4775 = arg0.method1142(-18970);
            this.field4771 = arg0.method1133((byte) 53);
            if (this.field4788 != var17 || ~this.field4785 != ~var22 || this.field4779 != var20 || ~this.field4777 != ~var19 || this.field4775 != var18 || ~this.field4771 != ~var21) {
                class178.method1304(arg2, this, arg1 + 37);
            }
        } else {
            class173.method1260(arg1 ^ -113, arg2, this);
        }
        if (this.field4767 == null) {
            this.field4767 = new class264();
        }
        int var23 = this.field4767.field4235;
        this.field4767.method1778(var9, -31959, var15, var8 == 1, super.field626, var10);
        if (~var9 != ~var23) {
            super.field637 = super.field709[0] * 128 - -(64 * this.method279(23397));
            super.field710 = super.field704[0] * 128 + this.method279(arg1 + 23397) * 64;
        }
        if (super.field707 != null) {
            super.field707.method1238();
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)I")
    public final int method290(int arg0) {
        ++field4782;
        return arg0 != -13800 ? 54 : -1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BC)Z")
    public static final boolean method1978(byte arg0, char arg1) {
        ++field4773;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class278.method1871(117, arg1)) {
            return true;
        } else {
            char[] var2 = class266.field4290;
            for (int var3 = 0; var3 < var2.length; ++var3) {
                char var8 = var2[var3];
                if (arg1 == var8) {
                    return true;
                }
            }
            int var4 = 70 % ((57 - arg0) / 51);
            char[] var5 = class128.field2011;
            for (int var6 = 0; var6 < var5.length; ++var6) {
                char var7 = var5[var6];
                if (arg1 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)I")
    public final int method279(int arg0) {
        ++field4794;
        if (arg0 != 23397) {
            this.method1976(false, -92);
        }
        return this.field4767 != null && this.field4767.field4235 != -1 ? class234.method1586(this.field4767.field4235, true).field4048 : super.method279(23397);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
    public final String method1979(boolean arg0, boolean arg1) {
        ++field4770;
        String var3 = "";
        if (class266.field4281 != null) {
            var3 = var3 + class266.field4281[this.field4786];
        }
        if (class67.field1109 != null && ~class67.field1109[this.field4786] != 0) {
            class234 var4 = class309.method2065(class67.field1109[this.field4786], 27029);
            if (var4.field3756 == 's') {
                var3 = var3 + var4.method1585(arg1, 255 & this.field4772);
            } else {
                class19.method94(-109, new Throwable(), "gdn1");
                class67.field1109[this.field4786] = -1;
            }
        }
        String var5;
        if (arg0) {
            var5 = var3 + this.field4768;
        } else {
            var5 = var3 + this.field4778;
        }
        if (!arg1) {
            this.field4778 = null;
        }
        if (field4800 != null) {
            var5 = var5 + field4800[this.field4786];
        }
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILk;IIIIZIILic;IIIIII)V")
    private final void method1980(int arg0, class37 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class171 arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int var17 = arg0 * arg0 + arg8 * arg8;
        ++field4795;
        if (var17 >= 16 && var17 <= arg14) {
            int var18 = (int) (Math.atan2((double) arg0, (double) arg8) * 325.949D) & 2047;
            if (arg6) {
                this.method1979(false, true);
            }
            class37 var19 = class96.method662(super.field653, arg10, arg1, super.field637, super.field710, -24605, var18);
            if (var19 != null) {
                var19.method9(0, arg7, arg2, arg4, arg3, arg5, arg12, arg15, -1L, arg13, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIJILic;)V")
    public final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class171 arg10) {
        ++field4799;
        if (this.field4767 != null) {
            class307 var13 = super.field699 != -1 && ~super.field717 == -1 ? class22.method121(super.field699, true) : null;
            class182 var14 = this.method292(-99);
            boolean var15 = var14.field2970 != 0 || ~var14.field2982 != -1 || ~var14.field2995 != -1 || ~var14.field2979 != -1;
            class307 var16 = ~super.field682 == 0 || this.field4776 || super.field682 == this.method292(-23).field3006 && var13 != null ? null : class22.method121(super.field682, true);
            class37 var17 = this.field4767.method1773(super.field686, true, super.field688, var15, var16, super.field619, super.field659, super.field662, var13, -1, super.field638, super.field679);
            int var18 = class271.method1814(-1);
            if (class130.field2044 != 0 && ~var18 > -51) {
                int var19 = -var18 + 50;
                while (class267.field4296 < var19) {
                    class70.field1182[class267.field4296] = new byte[102400];
                    ++class267.field4296;
                }
                while (~var19 > ~class267.field4296) {
                    --class267.field4296;
                    class70.field1182[class267.field4296] = null;
                }
            }
            if (var17 != null) {
                super.field715 = var17.method15();
                if (class165.field2656 && (this.field4767.field4235 == -1 || class234.method1586(this.field4767.field4235, true).field4077)) {
                    class37 var20 = class174.method1269(super.field710, (byte) 102, arg0, super.field637, 0, var17, 0, 160, super.field621, var16 == null ? var13 : var16, super.field653, var16 == null ? super.field686 : super.field659, 1, 240);
                    var20.method9(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class171) null);
                }
                if (class239.field3829 == this) {
                    for (int var21 = client.field4852.length - 1; ~var21 <= -1; --var21) {
                        class56 var22 = client.field4852[var21];
                        if (var22 != null && ~var22.field932 != 0) {
                            if (var22.field942 == 1 && var22.field930 >= 0 && ~var22.field930 > ~class12.field127.length) {
                                class131 var23 = class12.field127[var22.field930];
                                if (var23 != null) {
                                    int var24 = var23.field637 / 32 + -(class239.field3829.field637 / 32);
                                    int var25 = var23.field710 / 32 + -(class239.field3829.field710 / 32);
                                    this.method1980(var24, var17, arg2, arg4, arg3, arg5, false, arg1, var25, (class171) null, var22.field932, arg0, arg6, arg9, 360000, arg7);
                                }
                            }
                            if (var22.field942 == 2) {
                                int var26 = (-class276.field4438 + var22.field931) * 4 + 2 - class239.field3829.field637 / 32;
                                int var27 = var22.field928 * 4;
                                int var28 = (-class108.field1732 + var22.field934) * 4 + 2 + -(class239.field3829.field710 / 32);
                                int var29 = var27 * var27;
                                this.method1980(var26, var17, arg2, arg4, arg3, arg5, false, arg1, var28, (class171) null, var22.field932, arg0, arg6, arg9, var29, arg7);
                            }
                            if (~var22.field942 == -11 && ~var22.field930 <= -1 && ~class270.field4355.length < ~var22.field930) {
                                class299 var30 = class270.field4355[var22.field930];
                                if (var30 != null) {
                                    int var31 = var30.field637 / 32 + -(class239.field3829.field637 / 32);
                                    int var32 = var30.field710 / 32 + -(class239.field3829.field710 / 32);
                                    this.method1980(var31, var17, arg2, arg4, arg3, arg5, false, arg1, var32, (class171) null, var22.field932, arg0, arg6, arg9, 360000, arg7);
                                }
                            }
                        }
                    }
                }
                this.method283(-104405563, var17);
                class37 var33 = null;
                this.method284(arg0, (byte) -92, var17);
                if (!this.field4776 && super.field669 != -1 && ~super.field627 != 0) {
                    class55 var34 = class137.method958(super.field669, (byte) -104);
                    var33 = var34.method379(super.field660, -18882, super.field627, super.field640);
                    if (var33 != null) {
                        var33.method167(0, -super.field698, 0);
                        if (var34.field910) {
                            if (class279.field4474 != 0) {
                                var33.method199(class279.field4474);
                            }
                            if (~class139.field2215 != -1) {
                                var33.method201(class139.field2215);
                            }
                            if (class244.field3884 != 0) {
                                var33.method167(0, class244.field3884, 0);
                            }
                        }
                    }
                }
                class37 var35 = null;
                if (!this.field4776 && super.field622 != null) {
                    if (super.field663 <= class29.field360) {
                        super.field622 = null;
                    }
                    if (~super.field656 >= ~class29.field360 && super.field663 > class29.field360) {
                        if (super.field622 instanceof class81) {
                            var35 = (class37) ((class81) super.field622).method565(7);
                        } else {
                            var35 = (class37) super.field622;
                        }
                        var35.method167(-super.field637 + super.field703, super.field687 - super.field653, super.field712 - super.field710);
                        if (super.field702 == 512) {
                            var35.method188();
                        } else if (~super.field702 != -1025) {
                            if (super.field702 == 1536) {
                                var35.method196();
                            }
                        } else {
                            var35.method189();
                        }
                    }
                }
                if (var33 != null) {
                    var17 = ((class31) var17).method171(var33);
                }
                if (var35 != null) {
                    var17 = ((class31) var17).method171(var35);
                }
                this.method287(var17, -74, var33);
                var17.field530 = true;
                var17.method9(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field707);
                if (var35 != null) {
                    if (~super.field702 == -513) {
                        var35.method196();
                    } else if (~super.field702 != -1025) {
                        if (super.field702 == 1536) {
                            var35.method188();
                        }
                    } else {
                        var35.method189();
                    }
                    var35.method167(-super.field703 + super.field637, super.field653 - super.field687, super.field710 - super.field712);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4780;
        if (super.field707 != null) {
            super.field707.method1252();
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILag;ILhg;BII)V")
    public static final void method1981(int arg0, class211 arg1, int arg2, class220 arg3, byte arg4, int arg5, int arg6) {
        ++field4803;
        if (arg3 != null) {
            int var7;
            if (~class120.field1919 != -5) {
                var7 = 2047 & (int) class90.field1456 - -class173.field2831;
            } else {
                var7 = 2047 & (int) class90.field1456;
            }
            int var8 = arg0 * arg0 + arg6 * arg6;
            int var9 = Math.max(arg1.field3430 / 2, arg1.field3394 / 2) + 10;
            if (var8 <= var9 * var9) {
                int var10 = class302.field4823[var7];
                int var11 = class302.field4824[var7];
                if (~class120.field1919 != -5) {
                    var11 = var11 * 256 / (class292.field4687 + 256);
                    var10 = var10 * 256 / (class292.field4687 + 256);
                }
                int var12 = arg0 * var11 - arg6 * var10 >> 16;
                int var13 = arg0 * var10 - -(arg6 * var11) >> 16;
                ((class260) arg3).method1748(arg1.field3430 / 2 + -(arg3.field3597 / 2) + arg5 - -var13, -(arg3.field3601 / 2) + arg2 - (-(arg1.field3394 / 2) + var12), arg1.field3460, arg1.field3505);
                if (arg4 < 116) {
                    field4800 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()I")
    public final int method15() {
        ++field4798;
        return super.field715;
    }
}
