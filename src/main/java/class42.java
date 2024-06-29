import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class42 extends class282 {

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "Z")
    public boolean field758 = true;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "Ljf;")
    private static class229 field751 = class212.method1457((byte) 116, " is already on your friend list)3");

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "Ljf;")
    public static class229 field760 = field751;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "Lkh;")
    public static class14 field759 = new class14(new byte[5000]);

    @OriginalMember(owner = "client!cg", name = "ob", descriptor = "Ljf;")
    private static class229 field773 = class212.method1457((byte) 82, "");

    @OriginalMember(owner = "client!cg", name = "nb", descriptor = "Ljf;")
    public static class229 field772 = field773;

    @OriginalMember(owner = "client!cg", name = "pb", descriptor = "[I")
    public static int[] field774 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!cg", name = "ib", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!cg", name = "jb", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!cg", name = "lb", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!cg", name = "mb", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "Lek;")
    public static class185 field747;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "[I")
    public static int[] field746;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "[I")
    private int[] field757;

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "[I")
    public int[] field763;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "[Ljf;")
    private class229[] field748;

    @OriginalMember(owner = "client!cg", name = "kb", descriptor = "[[I")
    private int[][] field769;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)I", line = 4)
    public final int method356(int arg0, byte arg1) {
        field761++;
        int var3 = -100 / ((arg1 + 7) / 62);
        return this.field757 == null || arg0 < 0 || this.field757.length < arg0 ? -1 : this.field757[arg0];
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)I", line = 18)
    public final int method357(int arg0) {
        if (arg0 == -1) {
            field762++;
            return this.field757 == null ? 0 : this.field757.length;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I", line = 38)
    public static final int method358(byte arg0, int arg1) {
        field766++;
        if (arg0 < 126) {
            method358((byte) -29, 80);
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)Ljf;", line = 52)
    public final class229 method359(int arg0) {
        class229 var2 = class4.method19(80, -105);
        field750++;
        if (this.field748 == null) {
            return class230.field3992;
        }
        var2.method1652(this.field748[0], -12501);
        int var3 = -58 % ((arg0 + 65) / 37);
        for (int var4 = 1; var4 < this.field748.length; var4++) {
            var2.method1652(class72.field1382, -12501);
            var2.method1652(this.field748[var4], -12501);
        }
        return var2.method1616(false);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBLkh;)V", line = 78)
    private final void method360(int arg0, byte arg1, class14 arg2) {
        if (arg1 != 111) {
            return;
        }
        if (arg0 == 1) {
            this.field748 = arg2.method105((byte) -87).method1607(60, -96);
        } else if (arg0 == 2) {
            int var4 = arg2.method93(false);
            this.field763 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field763[var5] = arg2.method116(-1);
            }
        } else if (arg0 == 3) {
            int var6 = arg2.method93(false);
            this.field757 = new int[var6];
            this.field769 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method116(-1);
                this.field757[var7] = var8;
                this.field769[var7] = new int[class202.field3538[var8]];
                for (int var9 = 0; var9 < class202.field3538[var8]; var9++) {
                    this.field769[var7][var9] = arg2.method116(-1);
                }
            }
        } else if (arg0 == 4) {
            this.field758 = false;
        }
        field770++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLkh;)Ljf;", line = 144)
    public final class229 method361(boolean arg0, class14 arg1) {
        if (arg0) {
            this.method360(-38, (byte) 87, (class14) null);
        }
        class229 var3 = class4.method19(80, 127);
        field771++;
        if (this.field757 != null) {
            for (int var4 = 0; var4 < this.field757.length; var4++) {
                var3.method1652(this.field748[var4], -12501);
                var3.method1652(class253.method1802((byte) 126, this.field769[var4], arg1.method123(class261.field4537[this.field757[var4]], -127), this.field757[var4]), -12501);
            }
        }
        var3.method1652(this.field748[this.field748.length - 1], -12501);
        return var3.method1616(false);
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V", line = 173)
    public static final void method362(int arg0) {
        field765++;
        if (arg0 != -203338905) {
            method369(-96, 87, -52, 99, 103, -104);
        }
        class64.field1099.method226((byte) -96);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjf;)I", line = 187)
    public static final int method363(int arg0, class229 arg1) {
        field753++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 121 % ((arg0 + 66) / 33);
        for (int var3 = 0; var3 < class113.field2044; var3++) {
            if (arg1.method1653(class74.field1403[var3], false)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V", line = 236)
    public static void method364(byte arg0) {
        field773 = null;
        field751 = null;
        field747 = null;
        field746 = null;
        field760 = null;
        field759 = null;
        field772 = null;
        if (arg0 == 32) {
            field774 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V", line = 254)
    public final void method365(int arg0) {
        field764++;
        if (arg0 != 0) {
            method369(-124, -37, 23, -40, 67, 45);
        }
        if (this.field763 != null) {
            for (int var2 = 0; var2 < this.field763.length; var2++) {
                this.field763[var2] = class97.method665(this.field763[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)V", line = 285)
    public static final void method366(boolean arg0) {
        if (arg0) {
            method364((byte) -13);
        }
        if (class293.field5021 < 128) {
            class293.field5021 = 128;
        }
        if (class293.field5021 > 383) {
            class293.field5021 = 383;
        }
        field752++;
        int var1 = class234.field4049 >> 7;
        int var2 = class186.field3246 >> 7;
        class229.field3939 &= 0x7FF;
        int var3 = 0;
        int var4 = class282.method1984((byte) -80, class186.field3246, class234.field4049, class16.field254);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class16.field254;
                    if (var7 < 3 && (class142.field2464[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class179.field3110[var7][var5][var6] & 0xFF) * 8 + var4 - class132.field2328[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class107.field1885) {
            class107.field1885 += (var9 - class107.field1885) / 24;
        } else if (var9 < class107.field1885) {
            class107.field1885 += (var9 - class107.field1885) / 80;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([ILkh;B)V", line = 360)
    public final void method367(int[] arg0, class14 arg1, byte arg2) {
        field755++;
        int var4 = 100 / ((-arg2 - 59) / 61);
        if (this.field757 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field757.length && var5 < arg0.length; var5++) {
            int var6 = class136.field2371[this.method356(var5, (byte) 90)];
            if (var6 > 0) {
                arg1.method112((long) arg0[var5], var6, (byte) 1);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lkh;B)V", line = 387)
    public final void method368(class14 arg0, byte arg1) {
        field749++;
        int var3 = 18 / ((arg1 + 24) / 57);
        while (true) {
            int var4 = arg0.method93(false);
            if (var4 == 0) {
                return;
            }
            this.method360(var4, (byte) 111, arg0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V", line = 412)
    public static final void method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= -2) {
            field760 = (class229) null;
        }
        field756++;
        long var6 = class104.method701(arg1, arg0, arg3);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            int var10 = (int) var6 >> 14 & 0x1F;
            class83 var11 = class271.method1909(19, var9);
            if (var11.field1554 == -1) {
                int[] var14 = class114.field2050;
                int var15 = arg5;
                if (var6 > 0L) {
                    var15 = arg2;
                }
                int var16 = 24624 - (-(arg0 * 4) - (52736 - (arg3 * 512)) * 4);
                if (var10 == 0 || var10 == 2) {
                    if (var8 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var8 == 1) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var8 == 2) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 515] = var15;
                        var14[var16 + 1024 + 3] = var15;
                        var14[var16 + 1539] = var15;
                    } else if (var8 == 3) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1536 + 1] = var15;
                        var14[var16 + 1538] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
                if (var10 == 3) {
                    if (var8 == 0) {
                        var14[var16] = var15;
                    } else if (var8 == 1) {
                        var14[var16 + 3] = var15;
                    } else if (var8 == 2) {
                        var14[var16 + 1539] = var15;
                    } else if (var8 == 3) {
                        var14[var16 + 1536] = var15;
                    }
                }
                if (var10 == 2) {
                    if (var8 == 3) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var8 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var8 == 1) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 3 + 512] = var15;
                        var14[var16 + 1027] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    } else if (var8 == 2) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1 + 1536] = var15;
                        var14[var16 + 1536 + 2] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
            } else {
                class248 var12 = null;
                int var13 = var11.field1572;
                if (!var11.field1575) {
                    var12 = class320.field5416[var11.field1554];
                } else if (var8 == 0) {
                    var12 = class320.field5416[var11.field1554];
                } else if (var8 == 1) {
                    var12 = class147.field2548[var11.field1554];
                    var13 = var11.field1528;
                } else if (var8 == 2) {
                    var12 = class83.field1597[var11.field1554];
                } else if (var8 == 3) {
                    var12 = class232.field4034[var11.field1554];
                    var13 = var11.field1528;
                }
                if (var12 != null) {
                    var12.method543((arg0 * 4) + 48, 48 - -((-arg3 + 104 + -var13) * 4));
                }
            }
        }
        long var17 = class122.method864(arg1, arg0, arg3);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = (int) var17 >> 14 & 0x1F;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class83 var22 = class271.method1909(115, var21);
            if (var22.field1554 != -1) {
                class248 var26 = null;
                int var27 = var22.field1572;
                if (!var22.field1575) {
                    var26 = class320.field5416[var22.field1554];
                } else if (var19 == 0) {
                    var26 = class320.field5416[var22.field1554];
                } else if (var19 == 1) {
                    var27 = var22.field1528;
                    var26 = class147.field2548[var22.field1554];
                } else if (var19 == 2) {
                    var26 = class83.field1597[var22.field1554];
                } else if (var19 == 3) {
                    var26 = class232.field4034[var22.field1554];
                    var27 = var22.field1528;
                }
                if (var26 != null) {
                    var26.method543(arg0 * 4 + 48, (104 - arg3 + -var27) * 4 + 48);
                }
            } else if (var20 == 9) {
                int var23 = 15658734;
                if (var17 > 0L) {
                    var23 = 15597568;
                }
                int[] var24 = class114.field2050;
                int var25 = (52736 - (arg3 * 512)) * 4 + arg0 * 4 + 24624;
                if (var19 == 0 || var19 == 2) {
                    var24[var25 + 1536] = var23;
                    var24[var25 + 1 + 1024] = var23;
                    var24[var25 + 2 + 512] = var23;
                    var24[var25 + 3] = var23;
                } else {
                    var24[var25] = var23;
                    var24[var25 + 512 + 1] = var23;
                    var24[var25 + 1024 + 2] = var23;
                    var24[var25 + 3 + 1536] = var23;
                }
            }
        }
        long var28 = class124.method880(arg1, arg0, arg3);
        if (var28 == 0L) {
            return;
        }
        int var30 = Integer.MAX_VALUE & (int) (var28 >>> 32);
        int var31 = (int) var28 >> 20 & 0x3;
        class83 var32 = class271.method1909(121, var30);
        if (var32.field1554 == -1) {
            return;
        }
        class248 var33 = null;
        int var34 = var32.field1572;
        if (!var32.field1575) {
            var33 = class320.field5416[var32.field1554];
        } else if (var31 == 0) {
            var33 = class320.field5416[var32.field1554];
        } else if (var31 == 1) {
            var34 = var32.field1528;
            var33 = class147.field2548[var32.field1554];
        } else if (var31 == 2) {
            var33 = class83.field1597[var32.field1554];
        } else if (var31 == 3) {
            var33 = class232.field4034[var32.field1554];
            var34 = var32.field1528;
        }
        if (var33 != null) {
            var33.method543(arg0 * 4 + 48, (-arg3 + 104 + -var34) * 4 + 48);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IBI)I", line = 723)
    public final int method370(int arg0, byte arg1, int arg2) {
        field767++;
        if (this.field757 == null || arg0 < 0 || arg0 > this.field757.length) {
            return -1;
        } else if (arg1 < 71) {
            return -9;
        } else if (this.field769[arg0] == null || arg2 < 0 || arg2 > this.field769[arg0].length) {
            return -1;
        } else {
            return this.field769[arg0][arg2];
        }
    }
}
