import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class272 {

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public int field4828;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lcf;")
    public static class93 field4829 = class147.method1066("(U2", -48);

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Z")
    public static boolean field4836 = false;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field4839 = 0;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lcf;")
    public static class93 field4834 = class147.method1066("Verbindung abgebrochen)3", -48);

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "Ltg;")
    public static class181 field4851 = null;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Lcf;")
    public static class93 field4847 = class147.method1066("::breakcon", -48);

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lhd;")
    public static class11 field4835 = new class11();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public int field4827;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public int field4853;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lhg;")
    public static class177 field4830;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lad;")
    public class251 field4837;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "Lcd;")
    public static class27 field4843;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[I")
    public int[] field4826;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "[I")
    public int[] field4833;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "[I")
    public int[] field4838;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "[I")
    public int[] field4844;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "[I")
    public int[] field4845;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "[I")
    public int[] field4850;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "[Lad;")
    public class251[] field4840;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[[I")
    public int[][] field4832;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "[[I")
    public int[][] field4846;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static final void method1803(int arg0) {
        field4842++;
        if (arg0 <= 34) {
            return;
        }
        try {
            if (class120.field2138 == 1) {
                int var1 = class234.field4175.method833((byte) 120);
                if (var1 > 0 && class234.field4175.method832(32563)) {
                    int var2 = var1 - class41.field628;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class234.field4175.method839(var2, -21204);
                } else {
                    class234.field4175.method840((byte) -13);
                    class234.field4175.method852(50);
                    if (class66.field1213 == null) {
                        class120.field2138 = 0;
                    } else {
                        class120.field2138 = 2;
                    }
                    class186.field3438 = null;
                    class40.field621 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class234.field4175.method840((byte) -13);
            class120.field2138 = 0;
            class186.field3438 = null;
            class40.field621 = null;
            class66.field1213 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIZZIZI)Ldh;")
    public static final class120 method1804(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        field4841++;
        class29 var8 = class89.method617(arg5, arg2 - 27030);
        if (arg1 > 1 && var8.field390 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field359[var10] && var8.field359[var10] != 0) {
                    var9 = var8.field390[var10];
                }
            }
            if (var9 != -1) {
                var8 = class89.method617(var9, 0);
            }
        }
        class62 var11 = var8.method162(0);
        if (var11 == null) {
            return null;
        }
        class158 var12 = null;
        if (var8.field427 != -1) {
            var12 = (class158) method1804(0, 10, arg2, false, true, var8.field397, true, 1);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field382 != -1) {
            var12 = (class158) method1804(arg0, arg1, 27030, false, true, var8.field372, false, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class75.field1397;
        int var14 = class75.field1393;
        int[] var15 = new int[4];
        int var16 = class75.field1398;
        class75.method521(var15);
        class158 var17 = new class158(36, 32);
        class75.method516(var17.field2795, 36, 32);
        class179.method1318();
        class179.method1307(16, 16);
        int var18 = var8.field418;
        if (arg6) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg7 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class179.field3148 = false;
        int var19 = class179.field3158[var8.field403] * var18 >> 16;
        int var20 = class179.field3155[var8.field403] * var18 >> 16;
        var11.method112(0, var8.field393, var8.field411, var8.field403, var8.field371, var20 + var8.field422 - (var11.method93() / 2), var19 - -var8.field422, -1L);
        if (arg2 != 27030) {
            method1803(-14);
        }
        if (arg7 >= 1) {
            var17.method1140(1);
            if (arg7 >= 2) {
                var17.method1140(16777215);
            }
            class75.method516(var17.field2795, 36, 32);
        }
        if (arg0 != 0) {
            var17.method1130(arg0);
        }
        if (var8.field427 != -1) {
            var12.method560(0, 0);
        } else if (var8.field382 != -1) {
            class75.method516(var12.field2795, 36, 32);
            var17.method560(0, 0);
            var17 = var12;
        }
        if (arg3 && (var8.field414 == 1 || arg1 != 1) && arg1 != -1) {
            class19.field262.method1832(class190.method1368(arg1, -926), 0, 9, 16776960, 1);
        }
        class75.method516(var13, var16, var14);
        class75.method511(var15);
        class179.method1318();
        class179.field3148 = true;
        return var17;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method1805(byte arg0) {
        field4830 = null;
        if (arg0 > -118) {
            return;
        }
        field4847 = null;
        field4835 = null;
        field4851 = null;
        field4843 = null;
        field4829 = null;
        field4834 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B[B)V")
    private final void method1806(byte arg0, byte[] arg1) {
        class280 var3 = new class280(client.method1118(0, arg1));
        field4848++;
        int var4 = var3.method1907(16832);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4827 = var3.method1872(97);
        } else {
            this.field4827 = 0;
        }
        int var5 = var3.method1907(16832);
        this.field4852 = var3.method1891(-125);
        int var6 = 0;
        this.field4838 = new int[this.field4852];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field4852; var8++) {
            this.field4838[var8] = var6 += var3.method1891(-122);
            if (this.field4838[var8] > var7) {
                var7 = this.field4838[var8];
            }
        }
        this.field4853 = var7 + 1;
        this.field4844 = new int[this.field4853];
        this.field4826 = new int[this.field4853];
        this.field4846 = new int[this.field4853][];
        this.field4833 = new int[this.field4853];
        this.field4850 = new int[this.field4853];
        if (var5 != 0) {
            this.field4845 = new int[this.field4853];
            for (int var9 = 0; var9 < this.field4853; var9++) {
                this.field4845[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4852; var10++) {
                this.field4845[this.field4838[var10]] = var3.method1872(92);
            }
            this.field4837 = new class251(this.field4845);
        }
        for (int var11 = 0; var11 < this.field4852; var11++) {
            this.field4833[this.field4838[var11]] = var3.method1872(108);
        }
        for (int var12 = 0; var12 < this.field4852; var12++) {
            this.field4850[this.field4838[var12]] = var3.method1872(96);
        }
        int var13 = 0;
        if (arg0 > -86) {
            field4829 = null;
        }
        while (this.field4852 > var13) {
            this.field4826[this.field4838[var13]] = var3.method1891(-113);
            var13++;
        }
        for (int var14 = 0; var14 < this.field4852; var14++) {
            int var21 = this.field4838[var14];
            int var22 = this.field4826[var21];
            int var23 = 0;
            int var24 = -1;
            this.field4846[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field4846[var21][var25] = var23 += var3.method1891(-127);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field4844[var21] = var24 + 1;
            if ((var24 + 1) == var22) {
                this.field4846[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4840 = new class251[var7 + 1];
        this.field4832 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field4852; var15++) {
            int var16 = this.field4838[var15];
            int var17 = this.field4826[var16];
            this.field4832[var16] = new int[this.field4844[var16]];
            for (int var18 = 0; var18 < this.field4844[var16]; var18++) {
                this.field4832[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4846[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4846[var16][var19];
                }
                this.field4832[var16][var20] = var3.method1872(109);
            }
            this.field4840[var16] = new class251(this.field4832[var16]);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILcc;)V")
    public static final void method1807(int arg0, class210 arg1) {
        field4831++;
        class50 var2 = arg1.method1483(0);
        arg1.field3797 = var2.field800;
        if (arg1.field3870 == 0) {
            arg1.field3823 = 0;
        } else {
            if (arg1.field3840 != -1 && arg1.field3869 == 0) {
                class31 var3 = class131.method964(arg1.field3840, true);
                if (arg1.field3785 > 0 && var3.field473 == 0) {
                    arg1.field3823++;
                    return;
                }
                if (arg1.field3785 <= 0 && var3.field490 == 0) {
                    arg1.field3823++;
                    return;
                }
            }
            int var4 = arg1.field3868;
            int var5 = arg1.field3784;
            int var6 = arg1.field3805[arg1.field3870 - 1] * 128 + (arg1.method1475(false) * 64);
            int var7 = arg1.field3820[arg1.field3870 - 1] * 128 + (arg1.method1475(false) * 64);
            if ((var6 - var4) > 256 || (var6 - var4) < -256 || (var7 - var5) > 256 || var7 - var5 < -256) {
                arg1.field3868 = var6;
                arg1.field3784 = var7;
                return;
            }
            if (var6 > var4) {
                if (var5 < var7) {
                    arg1.field3770 = 1280;
                } else if (var5 > var7) {
                    arg1.field3770 = 1792;
                } else {
                    arg1.field3770 = 1536;
                }
            } else if (var6 < var4) {
                if (var7 > var5) {
                    arg1.field3770 = 768;
                } else if (var7 >= var5) {
                    arg1.field3770 = 512;
                } else {
                    arg1.field3770 = 256;
                }
            } else if (var5 < var7) {
                arg1.field3770 = 1024;
            } else if (var7 < var5) {
                arg1.field3770 = 0;
            }
            int var8 = arg1.field3770 - arg1.field3807 & 0x7FF;
            int var9 = 4;
            if (var8 > 1024) {
                var8 -= 2048;
            }
            int var10 = var2.field801;
            boolean var11 = true;
            byte var12 = 1;
            if (var8 >= -256 && var8 <= 256) {
                var10 = var2.field823;
            } else if (var8 >= 256 && var8 < 768) {
                var10 = var2.field819;
            } else if (var8 >= -768 && var8 <= -256) {
                var10 = var2.field803;
            }
            if (var10 == -1) {
                var10 = var2.field823;
            }
            arg1.field3797 = var10;
            if (arg1 instanceof class227) {
                var11 = ((class227) arg1).field4062.field2549;
            }
            if (var11) {
                if (arg1.field3807 != arg1.field3770 && arg1.field3841 == -1 && arg1.field3791 != 0) {
                    var9 = 2;
                }
                if (arg1.field3870 > 2) {
                    var9 = 6;
                }
                if (arg1.field3870 > 3) {
                    var9 = 8;
                }
                if (arg1.field3823 > 0 && arg1.field3870 > 1) {
                    arg1.field3823--;
                    var9 = 8;
                }
            } else {
                if (arg1.field3870 > 1) {
                    var9 = 6;
                }
                if (arg1.field3870 > 2) {
                    var9 = 8;
                }
                if (arg1.field3823 > 0 && arg1.field3870 > 1) {
                    arg1.field3823--;
                    var9 = 8;
                }
            }
            if (arg1.field3789[arg1.field3870 - 1] == 2) {
                var9 <<= 0x1;
                var12 = 2;
            } else if (arg1.field3789[arg1.field3870 - 1] == 0) {
                var9 >>= 0x1;
                var12 = 0;
            }
            if (var9 < 8 || var2.field824 == -1) {
                if (var2.field820 != -1 && var12 == 0) {
                    if (arg1.field3797 == var2.field801 && var2.field806 != -1) {
                        arg1.field3797 = var2.field806;
                    } else if (arg1.field3797 == var2.field803 && var2.field799 != -1) {
                        arg1.field3797 = var2.field799;
                    } else if (arg1.field3797 == var2.field819 && var2.field818 != -1) {
                        arg1.field3797 = var2.field818;
                    } else {
                        arg1.field3797 = var2.field820;
                    }
                }
            } else if (arg1.field3797 == var2.field801 && var2.field807 != -1) {
                arg1.field3797 = var2.field807;
            } else if (arg1.field3797 == var2.field803 && var2.field826 != -1) {
                arg1.field3797 = var2.field826;
            } else if (arg1.field3797 == var2.field819 && var2.field795 != -1) {
                arg1.field3797 = var2.field795;
            } else {
                arg1.field3797 = var2.field824;
            }
            if (var2.field792 != -1) {
                int var13 = var9 << 7;
                if (arg1.field3870 == 1) {
                    int var14 = arg1.field3814 * arg1.field3814;
                    int var15 = (var6 >= arg1.field3868 ? var6 - arg1.field3868 : -var6 + arg1.field3868) << 7;
                    int var16 = (arg1.field3784 <= var7 ? var7 - arg1.field3784 : -var7 + arg1.field3784) << 7;
                    int var17 = var16 < var15 ? var15 : var16;
                    int var18 = var2.field792 * 2 * var17;
                    if (var14 > var18) {
                        arg1.field3814 /= 2;
                    } else if (var17 < var14 / 2) {
                        arg1.field3814 -= var2.field792;
                        if (arg1.field3814 < 0) {
                            arg1.field3814 = 0;
                        }
                    } else if (arg1.field3814 < var13) {
                        arg1.field3814 += var2.field792;
                        if (var13 < arg1.field3814) {
                            arg1.field3814 = var13;
                        }
                    }
                } else if (var13 > arg1.field3814) {
                    arg1.field3814 += var2.field792;
                    if (arg1.field3814 > var13) {
                        arg1.field3814 = var13;
                    }
                } else if (arg1.field3814 > 0) {
                    arg1.field3814 -= var2.field792;
                    if (arg1.field3814 < 0) {
                        arg1.field3814 = 0;
                    }
                }
                var9 = arg1.field3814 >> 7;
                if (var9 < 1) {
                    var9 = 1;
                }
            }
            if (var7 > var5) {
                arg1.field3784 += var9;
                if (var7 < arg1.field3784) {
                    arg1.field3784 = var7;
                }
            } else if (var5 > var7) {
                arg1.field3784 -= var9;
                if (arg1.field3784 < var7) {
                    arg1.field3784 = var7;
                }
            }
            if (var6 > var4) {
                arg1.field3868 += var9;
                if (arg1.field3868 > var6) {
                    arg1.field3868 = var6;
                }
            } else if (var4 > var6) {
                arg1.field3868 -= var9;
                if (var6 > arg1.field3868) {
                    arg1.field3868 = var6;
                }
            }
            if (arg1.field3868 == var6 && arg1.field3784 == var7) {
                arg1.field3870--;
                if (arg1.field3785 > 0) {
                    arg1.field3785--;
                }
            }
        }
        if (arg0 > -9) {
            method1807(-56, (class210) null);
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "([BI)V")
    public class272(byte[] arg0, int arg1) {
        this.field4828 = class89.method616(arg0.length, (byte) 125, arg0);
        if (this.field4828 != arg1) {
            throw new RuntimeException();
        }
        this.method1806((byte) -96, arg0);
    }
}
