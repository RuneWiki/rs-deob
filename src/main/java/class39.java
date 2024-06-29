import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class39 extends class287 {

    @OriginalMember(owner = "client!kl", name = "kc", descriptor = "B")
    private byte field566 = 0;

    @OriginalMember(owner = "client!kl", name = "pc", descriptor = "I")
    public int field571 = 0;

    @OriginalMember(owner = "client!kl", name = "rc", descriptor = "I")
    public int field573 = -1;

    @OriginalMember(owner = "client!kl", name = "uc", descriptor = "I")
    public int field576 = -1;

    @OriginalMember(owner = "client!kl", name = "mc", descriptor = "I")
    public int field568 = -1;

    @OriginalMember(owner = "client!kl", name = "xc", descriptor = "I")
    public int field579 = 0;

    @OriginalMember(owner = "client!kl", name = "tc", descriptor = "I")
    public int field575 = 0;

    @OriginalMember(owner = "client!kl", name = "Jc", descriptor = "I")
    public int field591 = 0;

    @OriginalMember(owner = "client!kl", name = "Gc", descriptor = "I")
    public int field588 = -1;

    @OriginalMember(owner = "client!kl", name = "Fc", descriptor = "I")
    public int field587 = 255;

    @OriginalMember(owner = "client!kl", name = "vc", descriptor = "Z")
    public boolean field577 = false;

    @OriginalMember(owner = "client!kl", name = "Mc", descriptor = "I")
    public int field594 = -1;

    @OriginalMember(owner = "client!kl", name = "Qc", descriptor = "I")
    public int field598 = -1;

    @OriginalMember(owner = "client!kl", name = "Ac", descriptor = "I")
    public int field582 = -1;

    @OriginalMember(owner = "client!kl", name = "zc", descriptor = "I")
    public int field581 = 0;

    @OriginalMember(owner = "client!kl", name = "oc", descriptor = "[Ljava/lang/String;")
    public static String[] field570 = new String[500];

    @OriginalMember(owner = "client!kl", name = "Ec", descriptor = "I")
    public static int field586 = 0;

    @OriginalMember(owner = "client!kl", name = "nc", descriptor = "[I")
    public static int[] field569 = new int[1000];

    @OriginalMember(owner = "client!kl", name = "Bc", descriptor = "Lui;")
    public static class98 field583 = new class98(64);

    @OriginalMember(owner = "client!kl", name = "Vc", descriptor = "Ljava/lang/String;")
    public static String field603 = "Loaded sprites";

    @OriginalMember(owner = "client!kl", name = "jc", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!kl", name = "lc", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!kl", name = "qc", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!kl", name = "sc", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!kl", name = "wc", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!kl", name = "Cc", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!kl", name = "Dc", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!kl", name = "Hc", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!kl", name = "Ic", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!kl", name = "Kc", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!kl", name = "Lc", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!kl", name = "Nc", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!kl", name = "Oc", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!kl", name = "Rc", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!kl", name = "Tc", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!kl", name = "Uc", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!kl", name = "yc", descriptor = "Lnm;")
    public static class221 field580;

    @OriginalMember(owner = "client!kl", name = "Sc", descriptor = "Lge;")
    public class340 field600;

    @OriginalMember(owner = "client!kl", name = "Pc", descriptor = "Ljava/lang/String;")
    public String field597;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)I", line = 4)
    public final int method309(boolean arg0) {
        field572++;
        return arg0 ? 116 : this.field4722;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)Z", line = 20)
    public final boolean method310(byte arg0) {
        if (arg0 != -12) {
            this.field600 = (class340) null;
        }
        field574++;
        return this.field600 != null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(BI)V", line = 41)
    public static final void method311(byte arg0, int arg1) {
        class117.field1701--;
        if (arg0 != -65) {
            return;
        }
        field590++;
        if (class117.field1701 == arg1) {
            return;
        }
        class298.method2102(field570, arg1 + 1, field570, arg1, class117.field1701 - arg1);
        class298.method2102(class190.field2938, arg1 + 1, class190.field2938, arg1, class117.field1701 - arg1);
        class298.method2100(class109.field1622, arg1 + 1, class109.field1622, arg1, class117.field1701 - arg1);
        class298.method2099(class300.field4949, arg1 + 1, class300.field4949, arg1, class117.field1701 - arg1);
        class298.method2104(class258.field4095, arg1 + 1, class258.field4095, arg1, class117.field1701 - arg1);
        class298.method2100(class100.field1450, arg1 + 1, class100.field1450, arg1, class117.field1701 - arg1);
        class298.method2100(class86.field1243, arg1 + 1, class86.field1243, arg1, class117.field1701 - arg1);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I", line = 64)
    public final int method312(int arg0) {
        field565++;
        if (this.field600 == null || this.field600.field5476 == -1) {
            int var2 = 106 % ((-arg0 - 30) / 41);
            return super.method312(-96);
        } else {
            return class38.method307(this.field600.field5476, 0).field2220;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()I", line = 78)
    public final int method192() {
        field567++;
        return this.field4710;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V", line = 86)
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field585++;
        if (!this.field4764) {
            if (this.field600 == null) {
                return;
            }
            class131 var6 = this.field4795 != -1 && this.field4715 == 0 ? class68.method476((byte) 111, this.field4795) : null;
            class131 var7 = this.field4750 == -1 || this.field577 || this.field4750 == this.method2025((byte) 122).field1739 && var6 != null ? null : class68.method476((byte) 65, this.field4750);
            class128 var8 = this.field600.method2397(var6, this.field4716, this.field4773, false, var7, this.field4776, false, this.field4711, 0, this.field4767, this.field4771, this.field4747);
            if (var8 == null) {
                return;
            }
            this.method2024((class128) null, var8, 5885);
        }
        if (this.field4697 != null) {
            this.field4697.method1038(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lfh;I)V", line = 124)
    public final void method314(class313 arg0, int arg1) {
        arg0.field5137 = 0;
        int var3 = arg0.method2224(-120);
        field593++;
        boolean var4 = (var3 & 0x4) != 0;
        int var5 = var3 & 0x1;
        int var6 = -1;
        int[] var7 = new int[12];
        int var8 = super.method312(arg1 ^ 0x54);
        this.method2028((byte) 56, ((var3 & 0x3E) >> 3) - arg1);
        this.field566 = (byte) (var3 >> 6 & 0x3);
        this.field4796 += (this.method312(66) - var8) * 64;
        this.field4783 += (this.method312(61) - var8) * 64;
        this.field588 = arg0.method2200(arg1 - 123);
        this.field594 = arg0.method2200(60);
        this.field571 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method2224(arg1 ^ 0x7A);
            if (var10 == 0) {
                var7[var9] = 0;
            } else {
                int var11 = arg0.method2224(arg1 - 119);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var6 = arg0.method2250(-1613178296);
                    this.field571 = arg0.method2224(-122);
                    break;
                }
                if (var12 < 32768) {
                    var7[var9] = class167.method1160(var12 - 256, Integer.MIN_VALUE);
                } else {
                    int var13 = class116.field1693[var12 - 32768];
                    var7[var9] = class167.method1160(1073741824, var13);
                    int var14 = class322.method2311(var13, arg1 ^ 0x6A).field1575;
                    if (var14 != 0) {
                        this.field571 = var14;
                    }
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method2224(arg1 ^ 0x7D);
            if (var17 < 0 || class96.field1387[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field4722 = arg0.method2250(-1613178296);
        long var18 = arg0.method2204(true);
        this.field597 = class322.method2314(var18, true);
        this.field591 = arg0.method2224(-122);
        if (var4) {
            this.field575 = arg0.method2250(-1613178296);
            this.field581 = this.field591;
            this.field568 = -1;
        } else {
            this.field575 = 0;
            this.field581 = arg0.method2224(-128);
            this.field568 = arg0.method2224(-119);
            if (this.field568 == 255) {
                this.field568 = -1;
            }
        }
        int var20 = this.field579;
        this.field579 = arg0.method2224(-123);
        if (this.field579 == 0) {
            class38.method308(this, 0);
        } else {
            int var21 = this.field576;
            int var22 = this.field598;
            int var23 = this.field582;
            int var24 = this.field573;
            int var25 = this.field587;
            this.field576 = arg0.method2250(-1613178296);
            this.field598 = arg0.method2250(-1613178296);
            this.field582 = arg0.method2250(arg1 ^ 0x602725B7);
            this.field573 = arg0.method2250(-1613178296);
            this.field587 = arg0.method2224(-126);
            if (this.field579 != var20 || this.field576 != var21 || this.field598 != var22 || this.field582 != var23 || this.field573 != var24 || this.field587 != var25) {
                class56.method422(this, false);
            }
        }
        if (this.field600 == null) {
            this.field600 = new class340();
        }
        int var26 = this.field600.field5476;
        this.field600.method2402(var5 == 1, (byte) 45, var6, var15, this.field4722, var7);
        if (var6 != var26) {
            this.field4796 = this.field4762[0] * 128 + this.method312(-114) * 64;
            this.field4783 = this.field4757[0] * 128 + this.method312(15) * 64;
        }
        if (this.field4697 != null) {
            this.field4697.method1024();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIIJILdh;)V", line = 283)
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class145 arg10) {
        field592++;
        if (this.field600 == null) {
            return;
        }
        class131 var13 = this.field4795 != -1 && this.field4715 == 0 ? class68.method476((byte) 125, this.field4795) : null;
        class118 var14 = this.method2025((byte) 118);
        boolean var15 = var14.field1734 != 0 || var14.field1743 != 0 || var14.field1736 != 0 || var14.field1720 != 0;
        class131 var16 = this.field4750 == -1 || this.field577 || this.field4750 == this.method2025((byte) 117).field1739 && var13 != null ? null : class68.method476((byte) 67, this.field4750);
        class128 var17 = this.field600.method2397(var13, this.field4716, this.field4773, var15, var16, this.field4776, true, this.field4711, 0, this.field4767, this.field4771, this.field4747);
        int var18 = class204.method1392(false);
        if (class245.field3886 && class6.field81 < 96 && var18 > 50) {
            class169.method1171(false);
        }
        if (class343.field5513 != 0 && var18 < 50) {
            int var19 = 50 - var18;
            while (class94.field1378 < var19) {
                class289.field4808[class94.field1378] = new byte[102400];
                class94.field1378++;
            }
            while (var19 < class94.field1378) {
                class94.field1378--;
                class289.field4808[class94.field1378] = null;
            }
        }
        if (var17 == null) {
            return;
        }
        this.field4710 = var17.method192();
        if (class142.field2279 && (this.field600.field5476 == -1 || class38.method307(this.field600.field5476, 0).field2212)) {
            class128 var20 = class54.method387(this.field4794, arg0, 0, 0, var17, this.field4796, 1, 160, var16 == null ? var13 : var16, this.field4783, var16 == null ? this.field4773 : this.field4716, 240, -94, this.field4763);
            if (class245.field3886) {
                float var21 = class245.method1735();
                float var22 = class245.method1722();
                class245.method1713();
                class245.method1727(var21, var22 - 150.0F);
                var20.method180(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class145) null);
                class245.method1724();
                class245.method1727(var21, var22);
            } else {
                var20.method180(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class145) null);
            }
        }
        if (class329.field5388 == this) {
            for (int var23 = class165.field2602.length - 1; var23 >= 0; var23--) {
                class281 var24 = class165.field2602[var23];
                if (var24 != null && var24.field4627 != -1) {
                    if (var24.field4622 == 1 && var24.field4628 >= 0 && class329.field5377.length > var24.field4628) {
                        class233 var25 = class329.field5377[var24.field4628];
                        if (var25 != null) {
                            int var26 = var25.field4796 / 32 - class329.field5388.field4796 / 32;
                            int var27 = var25.field4783 / 32 - class329.field5388.field4783 / 32;
                            this.method315(arg3, 360000, var26, (class145) null, arg0, arg7, arg5, arg4, arg1, var27, arg9, var24.field4627, arg6, (byte) 120, arg2, var17);
                        }
                    }
                    if (var24.field4622 == 2) {
                        int var28 = var24.field4623 * 4;
                        int var29 = var28 * var28;
                        int var30 = (var24.field4618 - class215.field3313) * 4 + 2 - class329.field5388.field4796 / 32;
                        int var31 = (var24.field4617 - class150.field2420) * 4 + 2 - (class329.field5388.field4783 / 32);
                        this.method315(arg3, var29, var30, (class145) null, arg0, arg7, arg5, arg4, arg1, var31, arg9, var24.field4627, arg6, (byte) 125, arg2, var17);
                    }
                    if (var24.field4622 == 10 && var24.field4628 >= 0 && var24.field4628 < class130.field1984.length) {
                        class39 var32 = class130.field1984[var24.field4628];
                        if (var32 != null) {
                            int var33 = var32.field4783 / 32 - (class329.field5388.field4783 / 32);
                            int var34 = var32.field4796 / 32 - (class329.field5388.field4796 / 32);
                            this.method315(arg3, 360000, var34, (class145) null, arg0, arg7, arg5, arg4, arg1, var33, arg9, var24.field4627, arg6, (byte) 118, arg2, var17);
                        }
                    }
                }
            }
        }
        this.method2035(var17, -22);
        this.method2027(65506, var17, arg0);
        class128 var35 = null;
        if (!this.field577 && this.field4784 != -1 && this.field4701 != -1) {
            class172 var36 = class214.method1455((byte) -6, this.field4784);
            var35 = var36.method1186(-25079, this.field4701, this.field4712, this.field4718);
            if (var35 != null) {
                var35.method140(0, -this.field4724, 0);
                if (var36.field2679) {
                    if (class357.field5657 != 0) {
                        var35.method158(class357.field5657);
                    }
                    if (class29.field452 != 0) {
                        var35.method187(class29.field452);
                    }
                    if (class154.field2512 != 0) {
                        var35.method140(0, class154.field2512, 0);
                    }
                }
            }
        }
        class128 var37 = null;
        if (!this.field577 && this.field4739 != null) {
            if (class58.field875 >= this.field4766) {
                this.field4739 = null;
            }
            if (class58.field875 >= this.field4698 && class58.field875 < this.field4766) {
                if (this.field4739 instanceof class263) {
                    var37 = (class128) ((class263) this.field4739).method1848(70);
                } else {
                    var37 = (class128) this.field4739;
                }
                var37.method140(this.field4734 - this.field4796, -this.field4763 + this.field4797, this.field4713 - this.field4783);
                if (this.field4780 == 512) {
                    var37.method166();
                } else if (this.field4780 == 1024) {
                    var37.method167();
                } else if (this.field4780 == 1536) {
                    var37.method171();
                }
            }
        }
        if (class245.field3886) {
            this.method2024(var35, var17, 5885);
            var17.field1966 = true;
            var17.method180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4697);
            if (var35 != null) {
                if (this.field4697 != null) {
                    class22 var38 = (class22) var35;
                    this.field4697.method1037(var38.field287, var38.field282, true, var38.field306, var38.field301, var38.field279);
                }
                var35.field1966 = true;
                var35.method180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4697);
            }
        } else {
            if (var35 != null) {
                var17 = ((class67) var17).method474(var35);
            }
            if (var37 != null) {
                var17 = ((class67) var17).method474(var37);
            }
            this.method2024(var35, var17, 5885);
            var17.field1966 = true;
            var17.method180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4697);
        }
        if (var37 == null) {
            return;
        }
        if (this.field4780 == 512) {
            var37.method171();
        } else if (this.field4780 == 1024) {
            var37.method167();
        } else if (this.field4780 == 1536) {
            var37.method166();
        }
        var37.method140(this.field4796 - this.field4734, -this.field4797 + this.field4763, this.field4783 - this.field4713);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIILdh;IIIIIIIIIBILsm;)V", line = 566)
    private final void method315(int arg0, int arg1, int arg2, class145 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, byte arg13, int arg14, class128 arg15) {
        field578++;
        int var17 = arg2 * arg2 + arg9 * arg9;
        if (var17 < 16 || arg1 < var17) {
            return;
        }
        if (arg13 <= 110) {
            this.finalize();
        }
        int var18 = (int) (Math.atan2((double) arg2, (double) arg9) * 325.949D) & 0x7FF;
        class128 var19 = class150.method1087(arg11, this.field4796, var18, this.field4783, arg15, 0, this.field4763);
        if (var19 == null) {
            return;
        }
        if (!class245.field3886) {
            var19.method180(0, arg8, arg14, arg0, arg7, arg6, arg12, arg5, -1L, arg10, arg3);
            return;
        }
        float var20 = class245.method1735();
        float var21 = class245.method1722();
        class245.method1713();
        class245.method1727(var20, var21 - 150.0F);
        var19.method180(0, arg8, arg14, arg0, arg7, arg6, arg12, arg5, -1L, arg10, arg3);
        class245.method1724();
        class245.method1727(var20, var21);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 618)
    public final String method316(boolean arg0) {
        field589++;
        String var2 = this.field597;
        if (arg0) {
            this.field591 = -122;
        }
        if (class353.field5623 != null) {
            var2 = class353.field5623[this.field566] + var2;
        }
        if (class345.field5535 != null) {
            var2 = var2 + class345.field5535[this.field566];
        }
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZIII)V", line = 640)
    public final void method317(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            field596++;
            super.method2030(arg3, arg0, 29313, arg2, this.method312(-119));
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBII)V", line = 652)
    public static final void method318(int arg0, byte arg1, int arg2, int arg3) {
        field599++;
        if (arg3 == 0) {
            class275.field4533++;
            class195.field2992.method250(21066, 1);
            class195.field2992.method2193(5, false);
        }
        if (arg3 == 1) {
            class107.field1531++;
            class195.field2992.method250(21066, 105);
            class195.field2992.method2193(19, false);
        }
        class195.field2992.method2191(6729, class294.field4896[82] ? 1 : 0);
        class195.field2992.method2189(class215.field3313 + arg0, -1669644664);
        if (arg1 != -74) {
            method318(121, (byte) 49, 22, 67);
        }
        class195.field2992.method2206(arg2 + class150.field2420, (byte) -51);
        class223.field3439 = arg0;
        class183.field2854 = arg2;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 695)
    public static void method319(int arg0) {
        field603 = null;
        if (arg0 != 0) {
            field595 = 22;
        }
        field583 = null;
        field570 = null;
        field569 = null;
        field580 = null;
    }

    @OriginalMember(owner = "client!kl", name = "finalize", descriptor = "()V", line = 712)
    protected final void finalize() {
        if (this.field4697 != null) {
            this.field4697.method1021();
        }
        field584++;
    }
}
