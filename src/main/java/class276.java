import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class276 {

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Z")
    public boolean field4590 = false;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    private int field4601 = 0;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field4600 = -1;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    private int field4610 = 128;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    private int field4613 = 128;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    private int field4609 = 0;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    private int field4606 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lqd;")
    private static class40 field4588 = class147.method1106(" ", (byte) -108);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lqd;")
    public static class40 field4589 = class147.method1106("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) -74);

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lqd;")
    public static class40 field4599 = field4588;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Z")
    public static boolean field4596 = false;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lqd;")
    private static class40 field4598 = class147.method1106("Starting 3d Library", (byte) -58);

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Lqd;")
    public static class40 field4612 = field4598;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "[Lta;")
    public static class189[] field4608 = new class189[4];

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    private int field4614;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[Lnm;")
    public static class178[] field4603;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[S")
    private short[] field4593;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "[S")
    private short[] field4594;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[S")
    private short[] field4597;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "[S")
    private short[] field4611;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Lb;", line = 9)
    public static final class56 method1917(int arg0, byte arg1) {
        field4604++;
        class56 var2 = (class56) class205.field3259.method984(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class40.field735.method1651(5, arg0, -1);
        if (arg1 < 88) {
            field4588 = (class40) null;
        }
        class56 var4 = new class56();
        if (var3 != null) {
            var4.method479((byte) 123, new class26(var3));
        }
        class205.field3259.method982(var4, (long) arg0, (byte) 79);
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 37)
    public static final void method1918(int arg0) {
        class194.field3133.method1347(0);
        field4592++;
        if (arg0 >= -81) {
            field4599 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZI)I", line = 48)
    public static final int method1919(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return -113;
        }
        field4605++;
        int var3 = class149.method1118(arg2 - 1, arg0 + -1, -16) - (-class149.method1118(arg2 + 1, arg0 + -1, -82) - class149.method1118(arg2 - 1, arg0 + 1, -70) - class149.method1118(arg2 - -1, arg0 + 1, -64));
        int var4 = class149.method1118(arg2 - 1, arg0, -49) + class149.method1118(arg2 + 1, arg0, -88) - (-class149.method1118(arg2, arg0 + -1, -17) + -class149.method1118(arg2, arg0 + 1, -116));
        int var5 = class149.method1118(arg2, arg0, -109);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILsd;I)V", line = 65)
    private final void method1920(int arg0, class26 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4614 = arg1.method197(-1);
        } else if (arg2 == 2) {
            this.field4600 = arg1.method197(-1);
        } else if (arg2 == 4) {
            this.field4613 = arg1.method197(arg0 ^ 0x2);
        } else if (arg2 == 5) {
            this.field4610 = arg1.method197(-1);
        } else if (arg2 == 6) {
            this.field4606 = arg1.method197(-1);
        } else if (arg2 == 7) {
            this.field4609 = arg1.method226(arg0 + 258);
        } else if (arg2 == 8) {
            this.field4601 = arg1.method226(255);
        } else if (arg2 == 9) {
            this.field4590 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method226(255);
            this.field4593 = new short[var6];
            this.field4597 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4597[var7] = (short) arg1.method197(-1);
                this.field4593[var7] = (short) arg1.method197(-1);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method226(arg0 + 258);
            this.field4611 = new short[var4];
            this.field4594 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4611[var5] = (short) arg1.method197(arg0 + 2);
                this.field4594[var5] = (short) arg1.method197(-1);
            }
        }
        if (arg0 != -3) {
            this.field4600 = 109;
        }
        field4616++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Lrf;", line = 151)
    public final class266 method1921(int arg0, int arg1) {
        field4591++;
        if (arg0 != 180) {
            method1918(-97);
        }
        class266 var3 = (class266) class104.field1843.method1345((long) this.field4615, 28150);
        if (var3 == null) {
            class311 var4 = class311.method2145(class185.field2989, this.field4614, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field4597 != null) {
                for (int var5 = 0; var5 < this.field4597.length; var5++) {
                    var4.method2127(this.field4597[var5], this.field4593[var5]);
                }
            }
            if (this.field4611 != null) {
                for (int var6 = 0; var6 < this.field4611.length; var6++) {
                    var4.method2149(this.field4611[var6], this.field4594[var6]);
                }
            }
            var3 = var4.method2138(this.field4609 + 64, this.field4601 + 850, -30, -50, -30);
            class104.field1843.method1350(var3, (long) this.field4615, arg0 - 109);
        }
        class266 var7;
        if (this.field4600 == -1 || arg1 == -1) {
            var7 = var3.method1161(true, true);
        } else {
            var7 = class20.method128(112, this.field4600).method2043(3254, var3, arg1);
        }
        if (this.field4613 != 128 || this.field4610 != 128) {
            var7.method1182(this.field4613, this.field4610, this.field4613);
        }
        if (this.field4606 != 0) {
            if (this.field4606 == 90) {
                var7.method1145();
            }
            if (this.field4606 == 180) {
                var7.method1135();
            }
            if (this.field4606 == 270) {
                var7.method1144();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IB)Z", line = 229)
    public static final boolean method1922(int arg0, byte arg1) {
        if (arg1 > -11) {
            field4588 = (class40) null;
        }
        field4607++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)I", line = 251)
    public static int method1923(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lsd;B)V", line = 263)
    public final void method1924(class26 arg0, byte arg1) {
        if (arg1 != -100) {
            method1922(-65, (byte) -26);
        }
        field4602++;
        while (true) {
            int var3 = arg0.method226(arg1 ^ 0xFFFFFF63);
            if (var3 == 0) {
                return;
            }
            this.method1920(-3, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 285)
    public static void method1925(boolean arg0) {
        field4603 = null;
        field4598 = null;
        field4599 = null;
        field4608 = null;
        field4589 = null;
        if (!arg0) {
            method1919(-74, false, 67);
        }
        field4612 = null;
        field4588 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLsd;)V", line = 303)
    public static final void method1926(byte arg0, class26 arg1) {
        field4617++;
        while (true) {
            while (arg1.field472.length > arg1.field478) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method226(255) == 1) {
                    var3 = arg1.method226(255);
                    var4 = arg1.method226(255);
                    var2 = true;
                }
                int var5 = arg1.method226(255);
                int var6 = arg1.method226(255);
                int var7 = var5 * 64 - class91.field1662;
                int var8 = class272.field4524 + class268.field4462 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class233.field3840 > var7 + 63 && var8 < class268.field4462) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < (var3 * 8 + 8) && var4 * 8 <= var12 && var4 * 8 + 8 > var12) {
                                int var13 = arg1.method226(255);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method226(255);
                                        if (class225.field3734[var9][var10] == null) {
                                            class225.field3734[var9][var10] = new byte[4096];
                                        }
                                        class225.field3734[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method197(-1);
                                        if (class108.field1892[var9][var10] == null) {
                                            class108.field1892[var9][var10] = new short[4096];
                                        }
                                        class108.field1892[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg1.method226(255) & 0xFF << 16) + (arg1.method226(255) & 0xFF << 8) + (arg1.method226(255) & 0xFF);
                                        if (class87.field1579[var9][var10] == null) {
                                            class87.field1579[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class27 var17 = class72.method540(0, var16);
                                        if (var17.field546 != null) {
                                            var17 = var17.method258((byte) -13);
                                            if (var17 == null || var17.field558 == -1) {
                                                continue;
                                            }
                                        }
                                        class87.field1579[var9][var10][(63 - var12 << 6) + var11] = var17.field557 + 1;
                                        class165 var18 = new class165();
                                        var18.field2726 = var8;
                                        var18.field2734 = var7;
                                        var18.field2732 = var17.field558;
                                        class166.field2745.method1972(var18, 94);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method226(255);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field478++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field478 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field478 += 3;
                            }
                        }
                    }
                }
            }
            if (arg0 > -52) {
                method1922(-105, (byte) -88);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Lqd;", line = 490)
    public static final class40 method1927(byte arg0, int arg1) {
        field4595++;
        if (arg0 >= -60) {
            field4598 = (class40) null;
        }
        return class208.method1473(10, arg1, (byte) 99, false);
    }
}
