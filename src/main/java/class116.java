import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class116 extends class68 {

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "[I")
    private int[] field1645 = new int[3];

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    private int field1652 = 3216;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    private int field1649 = 4096;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    private int field1660 = 3216;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "D")
    public static double field1648 = -1.0D;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field1644 = -1;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "[I")
    public static int[] field1659 = new int[32];

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "Lhc;")
    public static class235 field1650;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIZILgj;)V")
    public static final void method781(int arg0, int arg1, int arg2, boolean arg3, int arg4, class240 arg5) {
        ++field1658;
        if (~class84.field1151 > -51) {
            if (arg5.field3672 != null && arg4 < arg5.field3672.length && arg5.field3672[arg4] != null) {
                int var6 = arg5.field3672[arg4][0];
                int var7 = var6 >> 8;
                if (arg5.field3672[arg4].length > 1) {
                    int var8 = (int) (Math.random() * (double) arg5.field3672[arg4].length);
                    if (var8 > 0) {
                        var7 = arg5.field3672[arg4][var8];
                    }
                }
                int var9 = 31 & var6;
                int var10 = (arg1 & var6) >> 5;
                if (var9 == 0) {
                    if (arg3) {
                        class148.method1000(var10, 0, -94, var7, 255);
                    }
                } else if (~class122.field1701 != -1) {
                    class71.field994[class84.field1151] = var7;
                    class140.field1939[class84.field1151] = var10;
                    class66.field900[class84.field1151] = 0;
                    int var11 = (arg2 + -64) / 128;
                    int var12 = (arg0 - 64) / 128;
                    class102.field1429[class84.field1151] = null;
                    class174.field2439[class84.field1151] = 255;
                    class8.field68[class84.field1151] = (var12 << 8) + ((var11 << 16) - -var9);
                    ++class84.field1151;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; class146.field2037.field2393 > var9; ++var9) {
            if (class146.field2037.method1130(var9, (byte) 83)) {
                int[] var10 = class210.field3000.method1701(75, (class146.field2037.field2386[var9] & 1016508272) >> 28, 16383 & class146.field2037.field2386[var9], class146.field2037.field2386[var9] >> 14 & 16383);
                if (var10 != null) {
                    int var11 = var10[1] - class164.field2273;
                    int var12 = class142.field1972 - var10[2] + class41.field605 + -1;
                    int var13 = arg5 - -((-arg3 + var11) * (-arg5 + arg1) / (-arg3 + arg7));
                    int var14 = (var12 - arg4) * (-arg0 + arg8) / (arg6 - arg4) + arg0;
                    int var15 = class146.field2037.method1124(var9, -24698);
                    class220 var16 = null;
                    int var17 = 16777215;
                    if (var15 == 0) {
                        if ((double) class221.field3310 == 3.0D) {
                            var16 = class221.field3320;
                        }
                        if ((double) class221.field3310 == 4.0D) {
                            var16 = class197.field2735;
                        }
                        if ((double) class221.field3310 == 6.0D) {
                            var16 = class278.field4317;
                        }
                        if ((double) class221.field3310 >= 8.0D) {
                            var16 = class287.field4541;
                        }
                    }
                    if (var15 == 1) {
                        if ((double) class221.field3310 == 3.0D) {
                            var16 = class278.field4317;
                        }
                        if ((double) class221.field3310 == 4.0D) {
                            var16 = class287.field4541;
                        }
                        if ((double) class221.field3310 == 6.0D) {
                            var16 = class46.field680;
                        }
                        if ((double) class221.field3310 >= 8.0D) {
                            var16 = class203.field2826;
                        }
                    }
                    if (var15 == 2) {
                        var17 = 16755200;
                        if ((double) class221.field3310 == 3.0D) {
                            var16 = class46.field680;
                        }
                        if ((double) class221.field3310 == 4.0D) {
                            var16 = class203.field2826;
                        }
                        if ((double) class221.field3310 == 6.0D) {
                            var16 = class76.field1067;
                        }
                        if ((double) class221.field3310 >= 8.0D) {
                            var16 = class249.field3821;
                        }
                    }
                    if (~class146.field2037.field2394[var9] != 0) {
                        var17 = class146.field2037.field2394[var9];
                    }
                    if (var16 != null) {
                        int var18 = class61.field852.method828(class146.field2037.field2395[var9], (int[]) null, class1.field2);
                        int var19 = var14 - (var18 + -1) * var16.method1416() / 2;
                        int var20 = var19 + var16.method1422() / 2;
                        for (int var21 = 0; ~var21 > ~var18; ++var21) {
                            String var22 = class1.field2[var21];
                            if (~(var18 - 1) < ~var21) {
                                var22 = var22.substring(0, -4 + var22.length());
                            }
                            var16.method1423(var22, var13, var20, var17, true);
                            var20 += var16.method1416();
                        }
                    }
                }
            }
        }
        ++field1661;
        if (arg2 != -167582047) {
            method781(-79, 50, -120, false, 92, (class240) null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
    private final void method783(int arg0) {
        ++field1651;
        double var2 = Math.cos((double) ((float) this.field1660 / 4096.0F));
        int var4 = -87 / ((arg0 - 45) / 41);
        this.field1645[0] = (int) (Math.sin((double) ((float) this.field1652 / 4096.0F)) * var2 * 4096.0D);
        this.field1645[1] = (int) (4096.0D * Math.cos((double) ((float) this.field1652 / 4096.0F)) * var2);
        this.field1645[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1660 / 4096.0F)));
        int var5 = this.field1645[1] * this.field1645[1] >> 12;
        int var6 = this.field1645[2] * this.field1645[2] >> 12;
        int var7 = this.field1645[0] * this.field1645[0] >> 12;
        int var8 = (int) (4096.0D * Math.sqrt((double) (var5 + var7 + var6 >> 12)));
        if (~var8 != -1) {
            this.field1645[0] = (this.field1645[0] << 12) / var8;
            this.field1645[2] = (this.field1645[2] << 12) / var8;
            this.field1645[1] = (this.field1645[1] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(B)V")
    public static void method784(byte arg0) {
        field1650 = null;
        field1659 = null;
        if (arg0 < 97) {
            field1644 = 15;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIILtb;I)V")
    public static final void method785(int arg0, int arg1, int arg2, int arg3, class71 arg4, int arg5) {
        ++field1657;
        if (arg4.field973 != -1 || arg4.field978 != null) {
            int var6 = 0;
            int var7 = class122.field1701 * arg4.field985 >> 8;
            if (arg2 <= arg4.field972) {
                if (arg4.field980 > arg2) {
                    var6 += -arg2 + arg4.field980;
                }
            } else {
                var6 += arg2 - arg4.field972;
            }
            if (arg4.field983 >= arg1) {
                if (arg4.field970 > arg1) {
                    var6 += arg4.field970 - arg1;
                }
            } else {
                var6 += arg1 - arg4.field983;
            }
            if (~arg4.field990 != -1 && var6 - 64 <= arg4.field990 && ~class122.field1701 != -1 && ~arg4.field988 == ~arg5) {
                if (arg0 != -32316) {
                    method788(-33, (byte) 5);
                }
                var6 -= 64;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var8 = (arg4.field990 - var6) * var7 / arg4.field990;
                if (arg4.field989 != null) {
                    arg4.field989.method766(var8);
                } else if (~arg4.field973 <= -1) {
                    class147 var9 = class147.method986(class10.field94, arg4.field973, 0);
                    if (var9 != null) {
                        class24 var10 = var9.method985().method169(class181.field2543);
                        class112 var11 = class112.method753(var10, 100, var8);
                        var11.method767(-1);
                        class21.field298.method359(var11);
                        arg4.field989 = var11;
                    }
                }
                if (arg4.field992 != null) {
                    arg4.field992.method766(var8);
                    if (!arg4.field992.method1116((byte) 121)) {
                        arg4.field992 = null;
                    }
                } else {
                    if (arg4.field978 != null && (arg4.field974 -= arg3) <= 0) {
                        int var12 = (int) ((double) arg4.field978.length * Math.random());
                        class147 var13 = class147.method986(class10.field94, arg4.field978[var12], 0);
                        if (var13 != null) {
                            class24 var14 = var13.method985().method169(class181.field2543);
                            class112 var15 = class112.method753(var14, 100, var8);
                            var15.method767(0);
                            class21.field298.method359(var15);
                            arg4.field992 = var15;
                            arg4.field974 = arg4.field969 + (int) (Math.random() * (double) (-arg4.field969 + arg4.field987));
                            return;
                        }
                    }
                }
            } else {
                if (arg4.field989 != null) {
                    class21.field298.method360(arg4.field989);
                    arg4.field989 = null;
                }
                if (arg4.field992 != null) {
                    class21.field298.method360(arg4.field992);
                    arg4.field992 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V")
    public static final void method786(int arg0) {
        if (arg0 != -1) {
            method782(10, 41, 107, 81, 1, 28, 33, -117, 118);
        }
        if (class87.field1182 != null) {
            class269 var1 = class87.field1182;
            synchronized (class87.field1182) {
                class87.field1182 = null;
            }
        }
        ++field1656;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public static final void method787(int arg0, int arg1) {
        ++field1654;
        int var2 = 7 / ((arg0 - 21) / 50);
        class280 var3 = class181.method1180(arg1, 0, 4);
        var3.method1871((byte) 26);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field1645 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field1660 = arg0.method1445(false);
                }
            } else {
                this.field1652 = arg0.method1445(false);
            }
        } else {
            this.field1649 = arg0.method1445(!arg2);
        }
        ++field1655;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        ++field1653;
        if (arg0 >= -18) {
            field1644 = -64;
        }
        this.method783(122);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field1646;
        int[] var3 = super.field917.method1920(arg0, true);
        if (arg1 > -118) {
            this.field1649 = 66;
        }
        if (super.field917.field4474) {
            int var4 = class224.field3337 * this.field1649 >> 12;
            int[] var5 = this.method423(0, (byte) -54, arg0 + -1 & class17.field184);
            int[] var6 = this.method423(0, (byte) -54, arg0);
            int[] var7 = this.method423(0, (byte) -54, arg0 + 1 & class17.field184);
            for (int var8 = 0; class89.field1248 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class173.field2411] - var6[var8 + 1 & class173.field2411]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = 255 & class56.field804[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field1645[0] * var16 >> 12;
                int var18 = this.field1645[2] * var14 >> 12;
                int var19 = this.field1645[1] * var15 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)I")
    public static final int method788(int arg0, byte arg1) {
        ++field1647;
        return arg1 != 47 ? 113 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class116() {
        super(1, true);
    }
}
