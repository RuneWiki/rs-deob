import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class330 extends class202 {

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "Low;")
    private class665 field4710 = new class665();

    @OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
    private int field4712 = 256;

    @OriginalMember(owner = "client!fr", name = "Q", descriptor = "I")
    private int field4717 = 256;

    @OriginalMember(owner = "client!fr", name = "P", descriptor = "I")
    private int field4716 = 0;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    private int field4694;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "Lin;")
    public static class380 field4704 = new class380(92, 2);

    @OriginalMember(owner = "client!fr", name = "K", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4711 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!fr", name = "R", descriptor = "Lrha;")
    public static class455 field4718 = new class455();

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!fr", name = "N", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!fr", name = "O", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!fr", name = "T", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!fr", name = "V", descriptor = "I")
    private int field4721;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "Lvw;")
    public static class604 field4697;

    @OriginalMember(owner = "client!fr", name = "M", descriptor = "Z")
    private boolean field4713;

    @OriginalMember(owner = "client!fr", name = "S", descriptor = "Z")
    private boolean field4719;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V", line = 3)
    public static void method2006(int arg0) {
        field4711 = null;
        field4718 = null;
        field4697 = null;
        field4704 = null;
        if (arg0 != -3286) {
            method2009(-108, 68, null, null);
        }
    }

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)Lvj;", line = 17)
    private final synchronized class231 method2007(int arg0) {
        if (arg0 == 1) {
            field4698++;
            return (class231) this.field4710.method3731((byte) -80);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V", line = 35)
    public final void method2008(int arg0, int arg1) {
        field4715++;
        this.field4712 = arg0;
        int var3 = -55 / ((arg1 - 48) / 57);
        this.field4717 = arg0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILth;Lha;)V", line = 47)
    public static final void method2009(int arg0, int arg1, class131 arg2, class475 arg3) {
        field4699++;
        if (class482.field6623 != null && arg2.field2220 >= arg0) {
            for (int var4 = 0; var4 < class482.field6623.length; var4++) {
                if (class482.field6623[var4] != -1000000 && (arg2.field2208[0] <= class482.field6623[var4] || class482.field6623[var4] >= arg2.field2208[1] || class482.field6623[var4] >= arg2.field2208[2] || class482.field6623[var4] >= arg2.field2208[3]) && (arg2.field2212[0] <= class615.field8720[var4] || class615.field8720[var4] >= arg2.field2212[1] || class615.field8720[var4] >= arg2.field2212[2] || class615.field8720[var4] >= arg2.field2212[3]) && (class703.field9854[var4] <= arg2.field2212[0] || arg2.field2212[1] >= class703.field9854[var4] || arg2.field2212[2] >= class703.field9854[var4] || arg2.field2212[3] >= class703.field9854[var4]) && (arg2.field2211[0] <= class493.field6764[var4] || class493.field6764[var4] >= arg2.field2211[1] || arg2.field2211[2] <= class493.field6764[var4] || arg2.field2211[3] <= class493.field6764[var4]) && (class647.field9190[var4] <= arg2.field2211[0] || arg2.field2211[1] >= class647.field9190[var4] || arg2.field2211[2] >= class647.field9190[var4] || arg2.field2211[3] >= class647.field9190[var4])) {
                    return;
                }
            }
        }
        if (arg2.field2216 == 1) {
            int var5 = arg2.field2209 + class162.field2499 - class277.field3995;
            if (var5 >= 0 && var5 <= class162.field2499 + class162.field2499) {
                int var6 = class162.field2499 + arg2.field2219 - class3.field47;
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > (class162.field2499 + class162.field2499)) {
                    return;
                }
                int var7 = arg2.field2205 + class162.field2499 - class3.field47;
                if (class162.field2499 + class162.field2499 < var7) {
                    var7 = class162.field2499 + class162.field2499;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var7 >= var6) {
                    if (class737.field10233[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class556.field7718 - arg2.field2212[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class20.field200) && class554.method3196(arg2, 0, arg1 - 17966) && class554.method3196(arg2, 1, arg1 - 17966) && class554.method3196(arg2, 2, 0) && class554.method3196(arg2, 3, 0)) {
                        class717.field10013[class300.field4323++] = arg2;
                    }
                }
            }
        } else if (arg2.field2216 == 2) {
            int var10 = arg2.field2219 + class162.field2499 - class3.field47;
            if (var10 >= 0 && var10 <= (class162.field2499 + class162.field2499)) {
                int var11 = class162.field2499 + arg2.field2209 - class277.field3995;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > (class162.field2499 + class162.field2499)) {
                    return;
                }
                int var12 = class162.field2499 + arg2.field2210 - class277.field3995;
                if (var12 > class162.field2499 + class162.field2499) {
                    var12 = class162.field2499 + class162.field2499;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class737.field10233[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class355.field5021 - arg2.field2211[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!(var14 < (float) class20.field200) && class554.method3196(arg2, 0, 0) && class554.method3196(arg2, 1, 0) && class554.method3196(arg2, 2, 0) && class554.method3196(arg2, 3, arg1 - 17966)) {
                        class717.field10013[class300.field4323++] = arg2;
                    }
                }
            }
        } else {
            if (arg1 != 17966) {
                method2009(31, 14, null, null);
            }
            if (arg2.field2216 == 16 || arg2.field2216 == 8) {
                int var23 = class162.field2499 + arg2.field2209 - class277.field3995;
                if (var23 >= 0 && var23 <= (class162.field2499 + class162.field2499)) {
                    int var24 = class162.field2499 + arg2.field2219 - class3.field47;
                    if (var24 >= 0 && class162.field2499 + class162.field2499 >= var24 && class737.field10233[var23][var24]) {
                        float var25 = (float) (class556.field7718 - arg2.field2212[0]);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (class355.field5021 - arg2.field2211[0]);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!((float) class20.field200 > var25) || !((float) class20.field200 > var26) && class554.method3196(arg2, 0, arg1 - 17966) && class554.method3196(arg2, 1, 0) && class554.method3196(arg2, 2, 0) && class554.method3196(arg2, 3, arg1 ^ 0x462E)) {
                            class717.field10013[class300.field4323++] = arg2;
                        }
                    }
                }
            } else if (arg2.field2216 == 4) {
                float var15 = (float) (arg2.field2208[0] - class379.field5321);
                if (!(var15 <= (float) class98.field1419)) {
                    int var16 = class162.field2499 + arg2.field2219 - class3.field47;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if ((class162.field2499 + class162.field2499) < var16) {
                        return;
                    }
                    int var17 = arg2.field2205 - (class3.field47 - class162.field2499);
                    if (var17 > (class162.field2499 + class162.field2499)) {
                        var17 = class162.field2499 + class162.field2499;
                    } else if (var17 < 0) {
                        return;
                    }
                    int var18 = arg2.field2209 + class162.field2499 - class277.field3995;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (class162.field2499 + class162.field2499 < var18) {
                        return;
                    }
                    int var19 = class162.field2499 + arg2.field2210 - class277.field3995;
                    if ((class162.field2499 + class162.field2499) < var19) {
                        var19 = class162.field2499 + class162.field2499;
                    } else if (var19 < 0) {
                        return;
                    }
                    boolean var20 = false;
                    label293: for (int var21 = var18; var21 <= var19; var21++) {
                        for (int var22 = var16; var22 <= var17; var22++) {
                            if (class737.field10233[var21][var22]) {
                                var20 = true;
                                break label293;
                            }
                        }
                    }
                    if (var20 && class554.method3196(arg2, 0, 0) && class554.method3196(arg2, 1, arg1 - 17966) && class554.method3196(arg2, 2, 0) && class554.method3196(arg2, 3, 0)) {
                        class717.field10013[class300.field4323++] = arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V", line = 382)
    public static final void method2010(int arg0, int arg1) {
        if (class591.field8484 == 1) {
            class37.field442 = arg1;
        } else if (class591.field8484 == 2) {
            class431.field6011 = arg1;
        }
        if (arg0 == 23708) {
            field4709++;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 399)
    public final synchronized void method1421(int arg0) {
        field4701++;
        if (this.field4713) {
            return;
        }
        while (true) {
            class231 var2 = this.method2007(1);
            if (var2 == null) {
                if (this.field4719) {
                    this.method4237(-1);
                    class119.field2043.method240(false);
                }
                return;
            }
            if (var2.field3378[0].length - this.field4721 > arg0) {
                this.field4721 += arg0;
                return;
            }
            arg0 -= var2.field3378[0].length - this.field4721;
            this.method2015((byte) 83);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)I", line = 439)
    public final synchronized int method2011(byte arg0) {
        if (arg0 == -82) {
            field4696++;
            return this.field4716;
        } else {
            return -18;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "()I", line = 454)
    public final int method1418() {
        field4693++;
        return 1;
    }

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "(I)V", line = 462)
    public final synchronized void method2012(int arg0) {
        this.field4719 = true;
        field4708++;
        if (arg0 <= 34) {
            field4718 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "(I)D", line = 474)
    public final synchronized double method2013(int arg0) {
        int var2 = -128 / ((34 - arg0) / 49);
        field4702++;
        if (this.field4716 < 1) {
            return -1.0D;
        } else {
            class231 var3 = (class231) this.field4710.method3731((byte) -113);
            return var3 == null ? -1.0D : (double) (-((float) var3.field3378[0].length / (float) class702.field9843)) + var3.field3375;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "([III)V", line = 494)
    public final synchronized void method1422(int[] arg0, int arg1, int arg2) {
        field4714++;
        if (this.field4713) {
            return;
        }
        if (this.method2007(1) != null) {
            int var4 = arg1 + arg2;
            if (class209.field3076) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field4694 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class231 var7 = this.method2007(1);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field3378;
                while (var4 > arg1 && var8[0].length > this.field4721) {
                    if (class209.field3076) {
                        arg0[arg1++] = var8[var5][this.field4721] * this.field4712;
                        arg0[arg1++] = var8[var6][this.field4721] * this.field4717;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field4721] * this.field4712 + var8[var6][this.field4721] * this.field4717;
                    }
                    this.field4721++;
                }
                if (var8[0].length <= this.field4721) {
                    this.method2015((byte) 83);
                }
            }
        } else if (this.field4719) {
            this.method4237(-1);
            class119.field2043.method240(false);
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "()Lfja;", line = 564)
    public final class202 method1420() {
        field4695++;
        return null;
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "()Lfja;", line = 572)
    public final class202 method1423() {
        field4700++;
        return null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIII)V", line = 583)
    public static final void method2014(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4706++;
        int var5 = arg3;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class645.method3656(class435.field6058, class742.field10301, arg1 + arg2, 26289);
        int var10 = class645.method3656(class435.field6058, class742.field10301, arg1 - arg2, 26289);
        class379.method2284(var10, var9, class74.field1144[arg4], arg0, 2);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (var12 >= class515.field7102 && var11 <= class698.field9801) {
                    int var13 = class645.method3656(class435.field6058, class742.field10301, arg1 + var5, arg3 ^ 0x66B1);
                    int var14 = class645.method3656(class435.field6058, class742.field10301, arg1 - var5, 26289);
                    if (class698.field9801 >= var12) {
                        class379.method2284(var14, var13, class74.field1144[var12], arg0, 2);
                    }
                    if (var11 >= class515.field7102) {
                        class379.method2284(var14, var13, class74.field1144[var11], arg0, arg3 + 2);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (class515.field7102 <= var16 && var15 <= class698.field9801) {
                int var17 = class645.method3656(class435.field6058, class742.field10301, arg1 + var6, arg3 ^ 0x66B1);
                int var18 = class645.method3656(class435.field6058, class742.field10301, arg1 - var6, arg3 ^ 0x66B1);
                if (var16 <= class698.field9801) {
                    class379.method2284(var18, var17, class74.field1144[var16], arg0, 2);
                }
                if (var15 >= class515.field7102) {
                    class379.method2284(var18, var17, class74.field1144[var15], arg0, arg3 + 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)V", line = 656)
    private final synchronized void method2015(byte arg0) {
        if (arg0 != 83) {
            method2014(118, -11, 57, 118, 7);
        }
        field4707++;
        class231 var2 = this.method2007(1);
        if (var2 != null) {
            var2.method4237(-1);
            this.field4721 = 0;
            this.field4716--;
            class119.field2043.method243((byte) -4, var2, var2.method1579(0));
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(DII)Lvj;", line = 676)
    public final class231 method2016(double arg0, int arg1, int arg2) {
        if (arg2 != 1784986752) {
            return null;
        }
        field4703++;
        long var5 = (long) (arg1 | this.field4694 << 0);
        class231 var7 = (class231) class119.field2043.method245(4768, var5);
        if (var7 == null) {
            var7 = new class231(new short[this.field4694][arg1], arg0);
        } else {
            var7.field3375 = arg0;
            class119.field2043.method244(var5, -20285);
        }
        return var7;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lvj;B)V", line = 699)
    public final synchronized void method2017(class231 arg0, byte arg1) {
        while (this.field4716 >= 100) {
            this.field4710.method3726(12691);
            this.field4716--;
        }
        field4705++;
        this.field4710.method3728((byte) 122, arg0);
        this.field4716++;
        if (arg1 != 68) {
            field4718 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(I)V", line = 755)
    public class330(int arg0) {
        this.field4694 = arg0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BZ)V", line = 729)
    public final synchronized void method2018(byte arg0, boolean arg1) {
        if (arg0 < 35) {
            this.field4713 = false;
        }
        this.field4713 = arg1;
        field4720++;
    }
}
