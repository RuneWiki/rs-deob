import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class23 {

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    private int field31 = 0;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    private int field32 = 0;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    private int field38 = 0;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "Ldc;")
    public static class37 field48 = class185.method1233((byte) 86, "<col=ffffff>");

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Ldc;")
    public static class37 field39 = class185.method1233((byte) 86, "sl_arrows");

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "Ldc;")
    private static class37 field37 = class185.method1233((byte) 86, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "Ldc;")
    public static class37 field53 = class185.method1233((byte) 86, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "Ldc;")
    private static class37 field41 = class185.method1233((byte) 86, "Error connecting to server)3");

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "Ldc;")
    public static class37 field50 = field37;

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "Ldc;")
    private static class37 field59 = class185.method1233((byte) 86, "Existing User");

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "Ldc;")
    public static class37 field58 = field59;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "Ldc;")
    public static class37 field55 = field41;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
    private int field49;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
    private int field54;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "I")
    private int field57;

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
    private int field61;

    @OriginalMember(owner = "client!ad", name = "qb", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "Lrb;")
    public static class187 field40;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "Lvd;")
    public static class231 field46;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "[I")
    public static int[] field42;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "[Ljc;")
    public static class100[] field33;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        if (arg1 != 9) {
            field42 = null;
        }
        int[][] var3 = super.field398.method1522(-29659, arg0);
        ++field62;
        if (super.field398.field4303) {
            int[][] var4 = this.method159(0, (byte) -111, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class199.field3705 > var11; ++var11) {
                this.method44(var6[var11], var7[var11], var5[var11], true);
                this.field49 += this.field31;
                this.field54 += this.field32;
                this.field57 += this.field38;
                if (this.field54 < 0) {
                    this.field54 = 0;
                }
                if (~this.field49 > -1) {
                    this.field49 = 0;
                }
                if (~this.field54 < -4097) {
                    this.field54 = 4096;
                }
                if (this.field49 > 4096) {
                    this.field49 = 4096;
                }
                while (~this.field57 > -1) {
                    this.field57 += 4096;
                }
                while (~this.field57 < -4097) {
                    this.field57 -= 4096;
                }
                this.method37(this.field54, this.field49, (byte) 39, this.field57);
                var8[var11] = this.field61;
                var9[var11] = this.field43;
                var10[var11] = this.field47;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBI)V")
    private final void method37(int arg0, int arg1, byte arg2, int arg3) {
        ++field45;
        int var5 = arg1 <= 2048 ? (arg0 + 4096) * arg1 >> 12 : -(arg0 * arg1 >> 12) + arg1 + arg0;
        if (var5 > 0) {
            int var6 = arg3 * 6;
            int var7 = -var5 + arg1 + arg1;
            int var8 = var6 >> 12;
            int var9 = (-var7 + var5 << 12) / var5;
            int var11 = -(var8 << 12) + var6;
            int var12 = var9 * var5 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var7 + var13;
            if (var8 != 0) {
                if (~var8 != -2) {
                    if (var8 != 2) {
                        if (var8 != 3) {
                            if (~var8 != -5) {
                                if (~var8 == -6) {
                                    this.field61 = var5;
                                    this.field47 = var14;
                                    this.field43 = var7;
                                }
                            } else {
                                this.field43 = var7;
                                this.field61 = var15;
                                this.field47 = var5;
                            }
                        } else {
                            this.field47 = var5;
                            this.field61 = var7;
                            this.field43 = var14;
                        }
                    } else {
                        this.field61 = var7;
                        this.field47 = var15;
                        this.field43 = var5;
                    }
                } else {
                    this.field47 = var7;
                    this.field43 = var5;
                    this.field61 = var14;
                }
            } else {
                this.field47 = var7;
                this.field43 = var15;
                this.field61 = var5;
            }
        } else {
            this.field61 = this.field43 = this.field47 = arg1;
        }
        if (arg2 != 39) {
            this.field61 = 125;
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
    public static final void method38(int arg0) {
        ++field56;
        int var1 = -64 % ((8 - arg0) / 47);
        if (class16.field259 && class41.field859 != class125.field2246) {
            class103.method669(class125.field2246, class238.field4382.field3494[0], 31362, class238.field4382.field3525[0], class136.field2648, class151.field2859);
        } else if (~class135.field2504 != ~class125.field2246) {
            class135.field2504 = class125.field2246;
            class208.method1381(class125.field2246, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
    public static final void method39(byte arg0, int arg1) {
        short var2 = 256;
        class117.field2103 += arg1 * 128;
        if (~class117.field2103 < ~class209.field3910.length) {
            int var3 = (int) (Math.random() * 12.0D);
            class117.field2103 -= class209.field3910.length;
            class245.method1594(class163.field3093[var3], (byte) 120);
        }
        ++field35;
        if (arg0 < 111) {
            method39((byte) -1, 66);
        }
        int var4 = 0;
        int var5 = (-arg1 + var2) * 128;
        int var6 = arg1 * 128;
        for (int var7 = 0; ~var7 > ~var5; ++var7) {
            int var27 = class103.field1789[var4 - -var6] - class209.field3910[class117.field2103 + var4 & class209.field3910.length + -1] * arg1 / 6;
            if (~var27 > -1) {
                var27 = 0;
            }
            class103.field1789[var4++] = var27;
        }
        for (int var8 = var2 - arg1; var2 > var8; ++var8) {
            int var24 = var8 * 128;
            for (int var25 = 0; ~var25 > -129; ++var25) {
                int var26 = (int) (100.0D * Math.random());
                if (~var26 > -51 && ~var25 < -11 && var25 < 118) {
                    class103.field1789[var24 + var25] = 255;
                } else {
                    class103.field1789[var25 - -var24] = 0;
                }
            }
        }
        if (class30.field592 > 0) {
            class30.field592 -= arg1 * 4;
        }
        if (class64.field1162 > 0) {
            class64.field1162 -= arg1 * 4;
        }
        if (class30.field592 == 0 && ~class64.field1162 == -1) {
            int var9 = (int) (Math.random() * (double) (2000 / arg1));
            if (var9 == 0) {
                class30.field592 = 1024;
            }
            if (var9 == 1) {
                class64.field1162 = 1024;
            }
        }
        for (int var10 = 0; -arg1 + var2 > var10; ++var10) {
            class72.field1281[var10] = class72.field1281[var10 - -arg1];
        }
        for (int var11 = -arg1 + var2; var11 < var2; ++var11) {
            class72.field1281[var11] = (int) (Math.sin((double) class231.field4232 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class231.field4232 / 15.0D) + 12.0D * Math.sin((double) class231.field4232 / 16.0D));
            ++class231.field4232;
        }
        class29.field542 += arg1;
        int var12 = ((1 & class203.field3758) + arg1) / 2;
        if (var12 > 0) {
            for (int var13 = 0; var13 < class29.field542 * 100; ++var13) {
                int var22 = (int) (124.0D * Math.random()) + 2;
                int var23 = 128 + (int) (128.0D * Math.random());
                class103.field1789[(var23 << 7) + var22] = 192;
            }
            class29.field542 = 0;
            for (int var14 = 0; var14 < var2; ++var14) {
                int var19 = var14 * 128;
                int var20 = 0;
                for (int var21 = -var12; var21 < 128; ++var21) {
                    if (var12 + var21 < 128) {
                        var20 += class103.field1789[var12 + var21 - -var19];
                    }
                    if (~(var21 + -1 + -var12) <= -1) {
                        var20 -= class103.field1789[var19 + var21 - (var12 + 1)];
                    }
                    if (~var21 <= -1) {
                        class63.field1157[var19 + var21] = var20 / (var12 * 2 + 1);
                    }
                }
            }
            for (int var15 = 0; ~var15 > -129; ++var15) {
                int var16 = 0;
                for (int var17 = -var12; ~var17 > ~var2; ++var17) {
                    int var18 = var17 * 128;
                    if (var2 > var12 + var17) {
                        var16 += class63.field1157[var12 * 128 + var15 - -var18];
                    }
                    if (~(-var12 - 1 + var17) <= -1) {
                        var16 -= class63.field1157[-(var12 * 128) + -128 + var15 + var18];
                    }
                    if (~var17 <= -1) {
                        class103.field1789[var15 - -var18] = var16 / (var12 * 2 - -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field60;
        if (arg2 == 1000) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field31 = (arg0.method206(arg2 ^ -16933072) << 12) / 100;
                    }
                } else {
                    this.field32 = (arg0.method206(-16933672) << 12) / 100;
                }
            } else {
                this.field38 = arg0.method228(true);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class5() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IBI)Ldc;")
    public static final class37 method41(int arg0, byte arg1, int arg2) {
        ++field36;
        int var3 = arg0 - arg2;
        if (~var3 > 8) {
            return class232.field4237;
        } else if (var3 < -6) {
            return class210.field3938;
        } else {
            if (arg1 != -15) {
                field59 = null;
            }
            if (var3 < -3) {
                return class117.field2102;
            } else if (~var3 > -1) {
                return class195.field3638;
            } else if (~var3 < -10) {
                return class228.field4194;
            } else if (~var3 < -7) {
                return class162.field3070;
            } else if (var3 > 3) {
                return class99.field1724;
            } else {
                return var3 > 0 ? class237.field4309 : class49.field968;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
    public static void method42(byte arg0) {
        field46 = null;
        field33 = null;
        field53 = null;
        field59 = null;
        field41 = null;
        field40 = null;
        if (arg0 >= 36) {
            field37 = null;
            field50 = null;
            field48 = null;
            field55 = null;
            field58 = null;
            field42 = null;
            field39 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lmf;BII)V")
    public static final void method43(class136 arg0, byte arg1, int arg2, int arg3) {
        ++field52;
        if (class56.field1073 == null && !class118.field2114) {
            if (arg1 > -92) {
                field58 = null;
            }
            if (arg0 != null && class97.method650(arg0, 38) != null) {
                class56.field1073 = arg0;
                class136.field2612 = class97.method650(arg0, -36);
                class75.field1334 = arg3;
                class39.field811 = 0;
                class13.field190 = false;
                class160.field3031 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIZ)V")
    private final void method44(int arg0, int arg1, int arg2, boolean arg3) {
        ++field34;
        int var5 = arg2 < arg1 ? arg2 : arg1;
        int var6 = ~arg0 > ~var5 ? arg0 : var5;
        int var7 = arg2 > arg1 ? arg2 : arg1;
        int var8 = ~arg0 < ~var7 ? arg0 : var7;
        if (!arg3) {
            method42((byte) -19);
        }
        this.field49 = (var6 + var8) / 2;
        int var9 = -var6 + var8;
        if (~var9 < -1) {
            int var10 = (-arg1 + var8 << 12) / var9;
            int var11 = (-arg2 + var8 << 12) / var9;
            int var12 = (var8 - arg0 << 12) / var9;
            if (arg2 == var8) {
                this.field57 = ~arg1 == ~var6 ? 20480 - -var12 : -var10 + 4096;
            } else if (~arg1 != ~var8) {
                this.field57 = ~arg2 != ~var6 ? 20480 - var11 : var10 + 12288;
            } else {
                this.field57 = ~arg0 == ~var6 ? 4096 - -var11 : 12288 - var12;
            }
            this.field57 /= 6;
        } else {
            this.field57 = 0;
        }
        if (this.field49 > 0 && this.field49 < 4096) {
            this.field54 = (var9 << 12) / (this.field49 > 2048 ? -(this.field49 * 2) + 8192 : this.field49 * 2);
        } else {
            this.field54 = 0;
        }
    }
}
