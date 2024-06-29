import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class421 extends class242 implements class691 {

    @OriginalMember(owner = "client!rca", name = "K", descriptor = "B")
    private byte field5960;

    @OriginalMember(owner = "client!rca", name = "Y", descriptor = "B")
    private byte field5974;

    @OriginalMember(owner = "client!rca", name = "T", descriptor = "Z")
    private boolean field5969;

    @OriginalMember(owner = "client!rca", name = "Z", descriptor = "Z")
    private boolean field5975;

    @OriginalMember(owner = "client!rca", name = "Q", descriptor = "S")
    private short field5966;

    @OriginalMember(owner = "client!rca", name = "cb", descriptor = "Z")
    private boolean field5978;

    @OriginalMember(owner = "client!rca", name = "U", descriptor = "Z")
    private boolean field5970;

    @OriginalMember(owner = "client!rca", name = "ab", descriptor = "Lda;")
    public class55 field5976;

    @OriginalMember(owner = "client!rca", name = "mb", descriptor = "Lha;")
    private class54 field5988;

    @OriginalMember(owner = "client!rca", name = "M", descriptor = "Lwo;")
    public static class690 field5962 = new class690(99, 0);

    @OriginalMember(owner = "client!rca", name = "rb", descriptor = "[J")
    public static long[] field5993 = new long[100];

    @OriginalMember(owner = "client!rca", name = "ub", descriptor = "[[I")
    public static int[][] field5996 = new int[6][];

    @OriginalMember(owner = "client!rca", name = "L", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!rca", name = "N", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!rca", name = "O", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!rca", name = "P", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!rca", name = "R", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!rca", name = "S", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!rca", name = "V", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!rca", name = "W", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!rca", name = "X", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!rca", name = "bb", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!rca", name = "db", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!rca", name = "eb", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!rca", name = "fb", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!rca", name = "gb", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!rca", name = "ib", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!rca", name = "jb", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!rca", name = "kb", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!rca", name = "lb", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!rca", name = "nb", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!rca", name = "ob", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!rca", name = "pb", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!rca", name = "qb", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!rca", name = "sb", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!rca", name = "tb", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!rca", name = "vb", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!rca", name = "wb", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!rca", name = "hb", descriptor = "Lsr;")
    private class229 field5983;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIZLr;ILub;I)V")
    public final void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6) {
        ++field5964;
        if (arg4 < 113) {
            method2540(-53, (byte[]) null);
        }
        if (arg5 instanceof class421) {
            class421 var8 = (class421) arg5;
            if (this.field5976 != null && var8.field5976 != null) {
                this.field5976.method59(var8.field5976, arg6, arg1, arg0, arg2);
            }
        } else {
            if (arg5 instanceof class631) {
                class631 var9 = (class631) arg5;
                if (this.field5976 != null && var9.field9059 != null) {
                    this.field5976.method59(var9.field9059, arg6, arg1, arg0, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I")
    public final int method1070(int arg0) {
        if (arg0 != -24359) {
            method2540(69, (byte[]) null);
        }
        ++field5995;
        return this.field5974;
    }

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "(I)V")
    public static void method2539(int arg0) {
        field5962 = null;
        field5993 = null;
        if (arg0 != 2) {
            field5962 = null;
        }
        field5996 = null;
    }

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "(B)I")
    public final int method172(byte arg0) {
        ++field5987;
        if (arg0 != -117) {
            this.method173(-25);
        }
        return this.field5976 == null ? 0 : this.field5976.method72();
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(I)V")
    public final void method1071(int arg0) {
        if (arg0 == -31121) {
            ++field5977;
            if (this.field5976 != null) {
                this.field5976.method114();
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lr;B)Llt;")
    public final class626 method170(class165 arg0, byte arg1) {
        ++field5961;
        if (this.field5976 == null) {
            return null;
        } else {
            class394 var3 = arg0.method315();
            var3.method712(super.field530, super.field527, super.field531);
            class626 var4 = null;
            if (this.field5978) {
                var4 = class547.method3208(1, -16660);
            }
            if (arg1 != -2) {
                this.method167((byte) 24);
            }
            if (!class547.field7943) {
                this.field5976.method67(var3, var4 == null ? null : var4.field8985[0], 0);
            } else {
                this.field5976.method122(var3, var4 != null ? var4.field8985[0] : null, class676.field9693, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)I")
    public final int method1072(int arg0) {
        if (arg0 != 4378) {
            this.method2541(-102, (class165) null, -121);
        }
        ++field5967;
        return 65535 & this.field5966;
    }

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "(I)I")
    public final int method173(int arg0) {
        ++field5998;
        if (arg0 != 32249) {
            field5962 = null;
        }
        return this.field5976 != null ? this.field5976.method65() : 0;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I[B)Ljava/lang/String;")
    public static final String method2540(int arg0, byte[] arg1) {
        if (arg0 != 27895) {
            method2546((byte) -13, (class82) null);
        }
        ++field5990;
        return class149.method965((byte) -107, arg1.length, 0, arg1);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILr;)V")
    public final void method1068(int arg0, class165 arg1) {
        ++field5971;
        Object var3 = null;
        class54 var5;
        if (this.field5988 == null && this.field5970) {
            class528 var4 = this.method2543(262144, arg1, true, (byte) 112);
            var5 = var4 != null ? var4.field7717 : null;
        } else {
            var5 = this.field5988;
            this.field5988 = null;
        }
        if (arg0 >= -22) {
            method2545((byte) 63, (byte[][]) null, (class302) null);
        }
        if (var5 != null) {
            class30.method389(var5, super.field535, super.field530, super.field531, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "(B)Z")
    public final boolean method165(byte arg0) {
        if (arg0 >= -21) {
            this.method1069(-127);
        }
        ++field5972;
        return this.field5976 == null ? false : this.field5976.method112();
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(BLr;)Lsr;")
    public final class229 method161(byte arg0, class165 arg1) {
        ++field5984;
        if (this.field5983 == null) {
            this.field5983 = class430.method2587((byte) 77, super.field527, super.field531, super.field530, this.method2541(0, arg1, -30608));
        }
        if (arg0 <= 100) {
            this.field5976 = null;
        }
        return this.field5983;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILr;I)Lda;")
    private final class55 method2541(int arg0, class165 arg1, int arg2) {
        ++field5992;
        if (this.field5976 != null && arg1.method306(this.field5976.method118(), arg0) == 0) {
            return this.field5976;
        } else {
            if (arg2 != -30608) {
                this.field5988 = null;
            }
            class528 var4 = this.method2543(arg0, arg1, false, (byte) 112);
            return var4 != null ? var4.field7718 : null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "(I)Z")
    public final boolean method175(int arg0) {
        ++field5980;
        if (arg0 != 0) {
            method2539(-105);
        }
        return true;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BI)V")
    public static final void method2542(byte arg0, int arg1) {
        if (class257.field3493 == null) {
            class257.field3493 = new byte[4][class473.field6604][class205.field2465];
        }
        ++field5965;
        if (arg1 == -25249) {
            for (int var2 = 0; var2 < 4; ++var2) {
                for (int var3 = 0; ~class473.field6604 < ~var3; ++var3) {
                    for (int var4 = 0; ~var4 > ~class205.field2465; ++var4) {
                        class257.field3493[var2][var3][var4] = arg0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILr;ZB)Lfe;")
    private final class528 method2543(int arg0, class165 arg1, boolean arg2, byte arg3) {
        ++field5991;
        class232 var5 = class37.field703.method807(0, this.field5966 & 65535);
        if (arg3 != 112) {
            return null;
        } else {
            class37 var6;
            class37 var7;
            if (this.field5975) {
                var6 = class340.field4500[super.field535];
                var7 = class399.field5631[0];
            } else {
                if (super.field535 < 3) {
                    var7 = class399.field5631[super.field535 + 1];
                } else {
                    var7 = null;
                }
                var6 = class399.field5631[super.field535];
            }
            return var5.method1417(false, super.field531, arg1, this.field5974, var7, arg0, arg2, super.field530, super.field527, this.field5960, var6);
        }
    }

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "(I)V")
    public static final void method2544(int arg0) {
        if (arg0 != 16) {
            method2542((byte) 64, 84);
        }
        for (class377 var1 = (class377) class34.field679.method1132((byte) 31); var1 != null; var1 = (class377) class34.field679.method1134(arg0 + 8430)) {
            if (class358.method2016(var1.field5062, -91)) {
                class366.method2124(var1, 0);
            }
        }
        ++field5979;
        if (class271.field3704 != 1) {
            class79.method661(class1.field2, class675.field9685, 10, class84.field1195, class22.field548);
            int var2 = class12.field205.method553(class424.field6062.method2561(class370.field4980, 0), 64);
            for (class377 var3 = (class377) class34.field679.method1132((byte) -108); var3 != null; var3 = (class377) class34.field679.method1134(8446)) {
                int var4 = class31.method396(var3, 80);
                if (~var2 > ~var4) {
                    var2 = var4;
                }
            }
            class84.field1195 = class271.field3704 * 16 + (class120.field1561 ? 26 : 22);
            class675.field9685 = var2 + 8;
        } else {
            class404.method2437((byte) 5);
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)Z")
    public final boolean method1069(int arg0) {
        ++field5986;
        if (arg0 != 17819) {
            this.field5983 = null;
        }
        return this.field5970;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLr;)V")
    public final void method1073(byte arg0, class165 arg1) {
        ++field5968;
        Object var3 = null;
        class54 var5;
        if (this.field5988 == null && this.field5970) {
            class528 var4 = this.method2543(262144, arg1, true, (byte) 112);
            var5 = var4 == null ? null : var4.field7717;
        } else {
            var5 = this.field5988;
            this.field5988 = null;
        }
        if (arg0 != 73) {
            this.field5983 = null;
        }
        if (var5 != null) {
            class122.method855(var5, super.field535, super.field530, super.field531, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method166(class165 arg0, int arg1, int arg2, int arg3) {
        ++field5989;
        class55 var5 = this.method2541(131072, arg0, -30608);
        if (var5 != null) {
            class394 var6 = arg0.method315();
            var6.method712(super.field530, super.field527, super.field531);
            return !class547.field7943 ? var5.method129(arg1, arg2, var6, false) : var5.method124(arg1, arg2, var6, false, class676.field9693);
        } else {
            if (arg3 >= -20) {
                this.method2543(109, (class165) null, false, (byte) 27);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(B)Z")
    public final boolean method167(byte arg0) {
        ++field5981;
        if (arg0 != 118) {
            this.method162((class165) null, false);
        }
        return this.field5969;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lr;Lfga;IIIIIZIIZ)V")
    public class421(class165 arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class612.method3508((byte) -106, arg8, arg9));
        this.field5960 = (byte) arg9;
        this.field5974 = (byte) arg8;
        super.field531 = arg6;
        this.field5969 = arg10;
        this.field5975 = arg7;
        super.field530 = arg4;
        this.field5966 = (short) arg1.field3056;
        this.field5978 = arg1.field3029 != 0 && !arg7;
        this.field5970 = arg0.method215() && arg1.field3097 && !this.field5975 && ~class221.field2851.method1844(class375.field5039, true) != -1;
        int var12 = 2048;
        if (this.field5969) {
            var12 |= 65536;
        }
        class528 var13 = this.method2543(var12, arg0, this.field5970, (byte) 112);
        if (var13 != null) {
            this.field5976 = var13.field7718;
            this.field5988 = var13.field7717;
            if (this.field5969) {
                this.field5976 = this.field5976.method97((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lr;Z)V")
    public final void method162(class165 arg0, boolean arg1) {
        ++field5982;
        if (arg1) {
            field5996 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)I")
    public final int method1067(byte arg0) {
        ++field5985;
        int var2 = -112 % ((-1 - arg0) / 37);
        return this.field5960;
    }

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "(I)V")
    public final void method163(int arg0) {
        this.field5969 = false;
        ++field5963;
        int var2 = -56 % ((35 - arg0) / 54);
        if (this.field5976 != null) {
            this.field5976.method98(-65537 & this.field5976.method118());
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B[[BLjs;)V")
    public static final void method2545(byte arg0, byte[][] arg1, class302 arg2) {
        ++field5973;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg0 != -3) {
            field5962 = null;
        }
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class389 var11 = new class389(var10);
                int var12 = class312.field4119[var5] >> 8;
                int var13 = 255 & class312.field4119[var5];
                int var14 = var12 * 64 + -class36.field689;
                int var15 = var13 * 64 + -class88.field1239;
                class317.method1849(arg0 ^ 2);
                arg2.method2440(class36.field689, class349.field4642, var14, class88.field1239, var15, (byte) -57, var11);
                arg2.method1789(var14, var15, (byte) 116, var3, class68.field1045, var11);
                if (!arg2.field5716 && ~(class532.field7778 / 8) == ~var12 && class389.field5225 / 8 == var13 && var3[0] != -1) {
                    class418.field5919 = class415.field5873.method2756(var3[0], -123, class32.field653, var3[3], var3[2], var3[1]);
                    class54.field869 = var3[4];
                }
            }
        }
        for (int var6 = 0; var4 > var6; ++var6) {
            int var7 = (class312.field4119[var6] >> 8) * 64 - class36.field689;
            int var8 = (255 & class312.field4119[var6]) * 64 - class88.field1239;
            byte[] var9 = arg1[var6];
            if (var9 == null && class389.field5225 < 800) {
                class317.method1849(-1);
                arg2.method2441(var8, var7, 64, (byte) 25, 64);
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLiv;)V")
    public static final void method2546(byte arg0, class82 arg1) {
        ++field5997;
        if (class173.field2130 == arg1) {
            int var2 = class29.field617.method2260(-98);
            int var3 = class29.field617.method2274((byte) 127);
            int var4 = class29.field617.method2229(255);
            int var5 = (var4 & 7) + class327.field4366;
            int var6 = class88.field1239 + var5;
            int var7 = ((126 & var4) >> 4) + class309.field4086;
            int var8 = class36.field689 - -var7;
            boolean var9 = ~var7 <= -1 && ~var5 <= -1 && class473.field6604 > var7 && ~class205.field2465 < ~var5;
            if (var9 || class24.method362((byte) -98, class53.field865)) {
                class222.method1355(var6, (byte) 101, new class4(var3, var2), var8, class493.field6893);
                if (var9) {
                    class506.method2936(var7, var5, class493.field6893, (byte) -123);
                }
            }
        } else if (class139.field1756 == arg1) {
            int var10 = class29.field617.method2229(255);
            int var11 = ((245 & var10) >> 4) + class309.field4086 * 2;
            int var12 = (15 & var10) + class327.field4366 * 2;
            int var13 = class29.field617.method2229(255);
            boolean var14 = ~(var13 & 1) != -1;
            int var15 = var13 >> 1;
            int var16 = class29.field617.method2249((byte) -70) + var11;
            int var17 = class29.field617.method2249((byte) -70) + var12;
            int var18 = class29.field617.method2270((byte) 71);
            int var19 = class29.field617.method2270((byte) 71);
            int var20 = class29.field617.method2260(-95);
            byte var21 = class29.field617.method2249((byte) -70);
            int var22 = 4 * class29.field617.method2229(255);
            int var23 = class29.field617.method2260(-75);
            int var24 = class29.field617.method2260(-62);
            int var25 = class29.field617.method2229(255);
            int var26 = class29.field617.method2260(-40);
            if (~var25 == -256) {
                var25 = -1;
            }
            if (~var11 <= -1 && ~var12 <= -1 && var11 < class473.field6604 * 2 && ~var12 > ~(class473.field6604 * 2) && var16 >= 0 && var17 >= 0 && class205.field2465 * 2 > var16 && var17 < class205.field2465 * 2 && ~var20 != -65536) {
                int var27 = var26 << 2;
                int var28 = var21 << 2;
                int var29 = var11 * 256;
                int var30 = var16 * 256;
                int var31 = var17 * 256;
                int var32 = var12 * 256;
                int var33 = var22 << 2;
                if (var18 != 0) {
                    class213 var34 = null;
                    if (var18 < 0) {
                        int var35 = -var18 + -1;
                        if (class63.field1016 != var35) {
                            var34 = class184.field2252[var35];
                        } else {
                            var34 = class206.field2472;
                        }
                    } else {
                        int var36 = var18 - 1;
                        class633 var37 = (class633) class522.field7662.method3678((long) var36, -128);
                        if (var37 != null) {
                            var34 = var37.field9097;
                        }
                    }
                    if (var34 != null) {
                        class573 var38 = var34.method1280(-1);
                        if (var38.field8397 != null && var38.field8397[var15] != null) {
                            int var39 = var38.field8397[var15][0];
                            int var40 = var38.field8397[var15][2];
                            int var41 = var34.field2588.method3060(16383);
                            int var42 = class395.field5579[var41];
                            int var43 = class395.field5582[var41];
                            int var44 = var39 * var43 + var40 * var42 >> 14;
                            int var45 = var40 * var43 + -(var39 * var42) >> 14;
                            var32 += var45;
                            var29 += var44;
                            var28 -= var38.field8397[var15][1];
                        }
                    }
                }
                class15 var47 = new class15(var20, class493.field6893, class493.field6893, var29, var32, var28, class543.field7882 + var23, var24 - -class543.field7882, var25, var27, var19, var33, var14);
                var47.method174(var31, var30, -var33 + class589.method3416(var30, -29, class493.field6893, var31), class543.field7882 + var23, -115);
                class6.field49.method1129(new class601(var47), 262144);
            }
        } else if (class262.field3605 == arg1) {
            int var48 = class29.field617.method2229(255);
            int var49 = ((var48 & 119) >> 4) + class309.field4086;
            int var50 = (var48 & 7) + class327.field4366;
            int var51 = class29.field617.method2260(-68);
            if (~var51 == -65536) {
                var51 = -1;
            }
            int var52 = class29.field617.method2229(255);
            int var53 = var52 >> 4 & 15;
            int var54 = 7 & var52;
            int var55 = class29.field617.method2229(255);
            int var56 = class29.field617.method2229(255);
            int var57 = class29.field617.method2260(-83);
            if (var49 >= 0 && ~var50 <= -1 && ~class473.field6604 < ~var49 && ~var50 > ~class205.field2465) {
                int var58 = var53 + 1;
                if (~(-var58 + var49) >= ~class206.field2472.field2689[0] && class206.field2472.field2689[0] <= var49 + var58 && ~class206.field2472.field2686[0] <= ~(-var58 + var50) && class206.field2472.field2686[0] <= var50 + var58) {
                    class293.method1738(var57, var54, var55, var51, (class493.field6893 << 24) - (-(var49 << 16) - ((var50 << 8) - -var53)), (byte) -76, var56);
                }
            }
        } else if (class529.field7729 == arg1) {
            int var59 = class29.field617.method2229(255);
            int var60 = (var59 >> 4 & 15) + class309.field4086 * 2;
            int var61 = class327.field4366 * 2 - -(var59 & 15);
            boolean var62 = class29.field617.method2229(255) != 0;
            int var63 = var60 + class29.field617.method2249((byte) -70);
            int var64 = var61 - -class29.field617.method2249((byte) -70);
            int var65 = class29.field617.method2270((byte) 71);
            int var66 = class29.field617.method2260(-67);
            int var67 = 4 * class29.field617.method2229(255);
            int var68 = 4 * class29.field617.method2229(255);
            int var69 = class29.field617.method2260(-69);
            int var70 = class29.field617.method2260(-91);
            int var71 = class29.field617.method2229(255);
            int var72 = class29.field617.method2260(-47);
            if (var71 == 255) {
                var71 = -1;
            }
            if (var60 >= 0 && var61 >= 0 && class473.field6604 * 2 > var60 && class473.field6604 * 2 > var61 && var63 >= 0 && ~var64 <= -1 && ~(class205.field2465 * 2) < ~var63 && ~(class205.field2465 * 2) < ~var64 && var66 != 65535) {
                int var73 = var63 * 256;
                int var74 = var67 << 2;
                int var75 = var60 * 256;
                int var76 = var72 << 2;
                int var77 = var64 * 256;
                int var78 = var68 << 2;
                int var79 = var61 * 256;
                class15 var80 = new class15(var66, class493.field6893, class493.field6893, var75, var79, var74, class543.field7882 + var69, class543.field7882 + var70, var71, var76, var65, var78, var62);
                var80.method174(var77, var73, class589.method3416(var73, -54, class493.field6893, var77) - var78, class543.field7882 + var69, -82);
                class6.field49.method1129(new class601(var80), 262144);
            }
        } else {
            int var81 = 59 % ((37 - arg0) / 63);
            if (class246.field3380 == arg1) {
                int var82 = class29.field617.method2271(-126);
                int var83 = var82 >> 2;
                int var84 = 3 & var82;
                int var85 = class289.field3918[var83];
                int var86 = class29.field617.method2271(-124);
                int var87 = class309.field4086 - -((var86 & 119) >> 4);
                int var88 = (7 & var86) + class327.field4366;
                if (class24.method362((byte) -88, class53.field865) || ~var87 <= -1 && var88 >= 0 && var87 < class473.field6604 && class205.field2465 > var88) {
                    class422.method2550(-1, var83, class493.field6893, 0, -1, var85, var87, true, var84, var88);
                }
            } else if (class267.field3668 == arg1) {
                class29.field617.method2229(255);
                int var89 = class29.field617.method2229(255);
                int var90 = ((113 & var89) >> 4) + class309.field4086;
                int var91 = class327.field4366 - -(var89 & 7);
                int var92 = class29.field617.method2260(-37);
                int var93 = class29.field617.method2229(255);
                int var94 = class29.field617.method2258(-3);
                String var95 = class29.field617.method2244((byte) -97);
                class109.method795(var93, var91, class493.field6893, (byte) 47, var94, var92, var95, var90);
            } else if (class506.field7215 == arg1) {
                int var96 = class29.field617.method2229(255);
                int var97 = (var96 >> 4 & 7) + class309.field4086;
                int var98 = class327.field4366 - -(var96 & 7);
                int var99 = class29.field617.method2260(-56);
                if (~var99 == -65536) {
                    var99 = -1;
                }
                int var100 = class29.field617.method2229(255);
                int var101 = (243 & var100) >> 4;
                int var102 = 7 & var100;
                int var103 = class29.field617.method2229(255);
                int var104 = class29.field617.method2229(255);
                int var105 = class29.field617.method2260(-115);
                if (~var97 <= -1 && var98 >= 0 && ~var97 > ~class473.field6604 && ~var98 > ~class205.field2465) {
                    int var106 = var101 + 1;
                    if (~(var97 - var106) >= ~class206.field2472.field2689[0] && var97 + var106 >= class206.field2472.field2689[0] && class206.field2472.field2686[0] >= -var106 + var98 && var98 + var106 >= class206.field2472.field2686[0]) {
                        class326.method1897(var103, var105, (var97 << 16) + (class493.field6893 << 24) + (var98 << 8) + var101, false, var99, 111, var102, var104);
                    }
                }
            } else if (class620.field8886 == arg1) {
                int var107 = class29.field617.method2274((byte) 63);
                int var108 = class29.field617.method2262(true);
                int var109 = class309.field4086 - -(7 & var108 >> 4);
                int var110 = (7 & var108) + class327.field4366;
                int var111 = class29.field617.method2240((byte) 122);
                int var112 = var111 >> 2;
                int var113 = var111 & 3;
                int var114 = class289.field3918[var112];
                if (class24.method362((byte) -87, class53.field865) || var109 >= 0 && ~var110 <= -1 && ~var109 > ~class473.field6604 && var110 < class205.field2465) {
                    class422.method2550(-1, var112, class493.field6893, 0, var107, var114, var109, true, var113, var110);
                }
            } else if (class634.field9099 == arg1) {
                int var115 = class29.field617.method2274((byte) 67);
                int var116 = class29.field617.method2262(true);
                int var117 = class327.field4366 - -(7 & var116);
                int var118 = class88.field1239 + var117;
                int var119 = class309.field4086 - -((var116 & 124) >> 4);
                int var120 = var119 - -class36.field689;
                class507 var121 = (class507) class475.field6655.method3678((long) (var120 | class493.field6893 << 28 | var118 << 14), -125);
                if (var121 != null) {
                    for (class4 var122 = (class4) var121.field7422.method1132((byte) 106); var122 != null; var122 = (class4) var121.field7422.method1134(8446)) {
                        if ((32767 & var115) == var122.field25) {
                            var122.method3045(true);
                            break;
                        }
                    }
                    if (var121.field7422.method1130((byte) 116)) {
                        var121.method3045(true);
                    }
                    if (var119 >= 0 && ~var117 <= -1 && ~class473.field6604 < ~var119 && ~class205.field2465 < ~var117) {
                        class506.method2936(var119, var117, class493.field6893, (byte) -82);
                    }
                }
            } else if (class28.field614 == arg1) {
                int var123 = class29.field617.method2240((byte) 121);
                int var124 = class327.field4366 - -(7 & var123);
                int var125 = class88.field1239 + var124;
                int var126 = class309.field4086 - -(var123 >> 4 & 7);
                int var127 = var126 - -class36.field689;
                int var128 = class29.field617.method2279((byte) -127);
                int var129 = class29.field617.method2279((byte) -124);
                int var130 = class29.field617.method2274((byte) -121);
                if (class63.field1016 != var129) {
                    boolean var131 = ~var126 <= -1 && ~var124 <= -1 && var126 < class473.field6604 && ~class205.field2465 < ~var124;
                    if (var131 || class24.method362((byte) -101, class53.field865)) {
                        class222.method1355(var125, (byte) 100, new class4(var130, var128), var127, class493.field6893);
                        if (var131) {
                            class506.method2936(var126, var124, class493.field6893, (byte) -93);
                        }
                    }
                }
            } else if (class468.field6538 == arg1) {
                int var132 = class29.field617.method2260(-124);
                if (~var132 == -65536) {
                    var132 = -1;
                }
                int var133 = class29.field617.method2271(-113);
                int var134 = class309.field4086 - -(7 & var133 >> 4);
                int var135 = (7 & var133) + class327.field4366;
                int var136 = class29.field617.method2271(-126);
                int var137 = var136 >> 2;
                int var138 = var136 & 3;
                int var139 = class289.field3918[var137];
                class327.method1904(var138, var134, var135, var132, class493.field6893, var139, var137, -9);
            } else if (class350.field4677 == arg1) {
                int var140 = class29.field617.method2229(255);
                int var141 = (var140 >> 4 & 7) + class309.field4086;
                int var142 = (var140 & 7) + class327.field4366;
                int var143 = class29.field617.method2260(-102);
                int var144 = class29.field617.method2229(255);
                int var145 = class29.field617.method2260(-92);
                int var146 = class29.field617.method2229(255);
                if (~var141 <= -1 && var142 >= 0 && ~class473.field6604 < ~var141 && ~class205.field2465 < ~var142) {
                    int var147 = var141 * 512 - -256;
                    int var148 = var142 * 512 + 256;
                    int var149 = class493.field6893;
                    if (var149 < 3 && class626.method3602(var141, var142, (byte) 127)) {
                        ++var149;
                    }
                    class120 var150 = new class120(var143, var145, class543.field7882, class493.field6893, var149, var147, -var144 + class589.method3416(var147, -45, class493.field6893, var148), var148, var141, var141, var142, var142, var146);
                    class376.field5049.method1129(new class520(var150), 262144);
                }
            } else if (class389.field5192 == arg1) {
                int var151 = class29.field617.method2229(255);
                boolean var152 = ~(128 & var151) != -1;
                int var153 = ((58 & var151) >> 3) + class309.field4086;
                int var154 = (var151 & 7) + class327.field4366;
                int var155 = class29.field617.method2249((byte) -70) + var153;
                int var156 = var154 + class29.field617.method2249((byte) -70);
                int var157 = class29.field617.method2270((byte) 71);
                int var158 = class29.field617.method2260(-86);
                int var159 = class29.field617.method2229(255) * 4;
                int var160 = class29.field617.method2229(255) * 4;
                int var161 = class29.field617.method2260(-83);
                int var162 = class29.field617.method2260(-60);
                int var163 = class29.field617.method2229(255);
                int var164 = class29.field617.method2260(-127);
                if (var163 == 255) {
                    var163 = -1;
                }
                if (var153 >= 0 && ~var154 <= -1 && var153 < class473.field6604 && ~class205.field2465 < ~var154 && var155 >= 0 && ~var156 <= -1 && ~var155 > ~class473.field6604 && ~var156 > ~class205.field2465 && var158 != 65535) {
                    int var165 = var153 * 512 + 256;
                    int var166 = var159 << 2;
                    int var167 = var154 * 512 - -256;
                    int var168 = var155 * 512 + 256;
                    int var169 = var164 << 2;
                    int var170 = var160 << 2;
                    int var171 = var156 * 512 - -256;
                    class15 var172 = new class15(var158, class493.field6893, class493.field6893, var165, var167, var166, class543.field7882 + var161, class543.field7882 + var162, var163, var169, var157, var170, var152);
                    var172.method174(var171, var168, class589.method3416(var168, -59, class493.field6893, var171) + -var170, class543.field7882 + var161, -103);
                    class6.field49.method1129(new class601(var172), 262144);
                }
            } else if (class6.field58 != arg1) {
                if (class215.field2733 == arg1) {
                    int var183 = class29.field617.method2260(-127);
                    int var184 = class29.field617.method2229(255);
                    class37.field703.method807(0, var183).method1401((byte) -115, var184);
                } else {
                    class544.method3184(23383, "T3 - " + arg1, (Throwable) null);
                    class168.method1061((byte) 61, false);
                }
            } else {
                int var173 = class29.field617.method2229(255);
                int var174 = class327.field4366 - -(var173 & 7);
                int var175 = var174 - -class88.field1239;
                int var176 = (var173 >> 4 & 7) + class309.field4086;
                int var177 = class36.field689 + var176;
                int var178 = class29.field617.method2260(-57);
                int var179 = class29.field617.method2260(-25);
                int var180 = class29.field617.method2260(-48);
                if (class475.field6655 != null) {
                    class507 var181 = (class507) class475.field6655.method3678((long) (var177 | var175 << 14 | class493.field6893 << 28), -125);
                    if (var181 != null) {
                        for (class4 var182 = (class4) var181.field7422.method1132((byte) 44); var182 != null; var182 = (class4) var181.field7422.method1134(8446)) {
                            if (~(var178 & 32767) == ~var182.field25 && var182.field24 == var179) {
                                var182.method3045(true);
                                var182.field24 = var180;
                                class222.method1355(var175, (byte) 97, var182, var177, class493.field6893);
                                break;
                            }
                        }
                        if (var176 >= 0 && ~var174 <= -1 && class473.field6604 > var176 && ~var174 > ~class205.field2465) {
                            class506.method2936(var176, var174, class493.field6893, (byte) -104);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(JJ)J")
    public static long method2547(long arg0, long arg1) {
        return arg0 ^ arg1;
    }
}
