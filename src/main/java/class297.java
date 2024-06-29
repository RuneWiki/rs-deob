import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class297 extends class107 {

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    private int field4849 = 4096;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    private int field4850 = 4096;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "I")
    private int field4857 = 4096;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "Lad;")
    public static class275 field4852 = new class275(500);

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)V")
    public static final void method2035(byte arg0, int arg1, int arg2) {
        ++field4846;
        if (class118.method816(arg1, 0)) {
            if (arg0 <= 13) {
                method2037(-103, -97);
            }
            class21.method169(arg2, class208.field3315[arg1], false);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 != 28) {
            this.field4857 = 1;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field4850 = arg1.method1837(arg2 + 224);
                }
            } else {
                this.field4857 = arg1.method1837(252);
            }
        } else {
            this.field4849 = arg1.method1837(arg2 ^ 224);
        }
        ++field4854;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class297() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIZII)V")
    public static final void method2036(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 == 18120) {
            class272.field4377 = arg0;
            class70.field1121 = arg1;
            class179.field2965 = arg3;
            class90.field1414 = arg5;
            ++field4847;
            class117.field1806 = arg2;
            if (arg4 && class179.field2965 >= 100) {
                class135.field2184 = class90.field1414 * 128 + 64;
                class123.field1960 = class272.field4377 * 128 + 64;
                class182.field3028 = class60.method387(-18796, class123.field1960, class135.field2184, class214.field3389) - class117.field1806;
            }
            class231.field3613 = 2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)Ld;")
    public static final class259 method2037(int arg0, int arg1) {
        if (arg1 != -15736) {
            return null;
        } else {
            ++field4844;
            class259 var2 = (class259) class75.field1213.method61(arg1 ^ -15707, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3;
                if (arg0 < 32768) {
                    var3 = class101.field1580.method1156(1, arg0, (byte) -16);
                } else {
                    var3 = class9.field198.method1156(1, arg0 & 32767, (byte) -16);
                }
                class259 var4 = new class259();
                if (var3 != null) {
                    var4.method1749(new class274(var3), 117);
                }
                if (arg0 >= 32768) {
                    var4.method1746(-4);
                }
                class75.field1213.method59(var4, (long) arg0, arg1 ^ -15731);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)V")
    public static final void method2038(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method2040(true);
        }
        class275.field4497 = new class275(arg1);
        class16.field303 = new class275(arg0);
        ++field4856;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
    public static void method2039(int arg0) {
        field4852 = null;
        if (arg0 != 64) {
            method2042(-26, -60, (class274) null);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public static final void method2040(boolean arg0) {
        ++field4855;
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class259.field4249[var1] = true;
        }
        if (arg0) {
            method2040(false);
        }
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
    public static final void method2041(int arg0) {
        ++field4845;
        if (~class74.method538(-27785) == -3) {
            byte var1 = (byte) (255 & class89.field1384 + -4);
            int var2 = class89.field1384 % 104;
            if (arg0 < 48) {
                field4852 = null;
            }
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var16 = 0; var16 < 104; ++var16) {
                    class217.field3412[var3][var2][var16] = var1;
                }
            }
            if (class214.field3389 != 3) {
                for (int var4 = 0; ~var4 > -3; ++var4) {
                    class40.field607[var4] = -1000000;
                    class87.field1366[var4] = 1000000;
                    class218.field3424[var4] = 0;
                    class205.field3303[var4] = 1000000;
                    class16.field300[var4] = 0;
                }
                if (~class231.field3613 != -2) {
                    int var5 = class60.method387(-18796, class123.field1960, class135.field2184, class214.field3389);
                    if (~(var5 - class182.field3028) > -801 && (class214.field3386[class214.field3389][class135.field2184 >> 7][class123.field1960 >> 7] & 4) != 0) {
                        class221.method1504(class307.field4991, false, 74, 1, class135.field2184 >> 7, class123.field1960 >> 7);
                        return;
                    }
                } else {
                    if ((class214.field3386[class214.field3389][class217.field3408.field994 >> 7][class217.field3408.field929 >> 7] & 4) != 0) {
                        class221.method1504(class307.field4991, false, 100, 0, class217.field3408.field994 >> 7, class217.field3408.field929 >> 7);
                    }
                    if (class95.field1506 >= 310) {
                        return;
                    }
                    int var6 = class135.field2184 >> 7;
                    int var7 = class123.field1960 >> 7;
                    int var8 = class217.field3408.field994 >> 7;
                    int var9 = class217.field3408.field929 >> 7;
                    int var10;
                    if (~var7 <= ~var9) {
                        var10 = -var9 + var7;
                    } else {
                        var10 = var9 - var7;
                    }
                    int var11;
                    if (~var8 >= ~var6) {
                        var11 = -var8 + var6;
                    } else {
                        var11 = -var6 + var8;
                    }
                    if (var11 == 0 && var10 == 0 || ~var11 >= 103 || var11 >= 104 || var10 <= -104 || ~var10 <= -105) {
                        class284.method1930(-75, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class75.field1211 + "," + class145.field2327, (Throwable) null);
                        return;
                    }
                    if (~var10 <= ~var11) {
                        int var12 = var11 * 65536 / var10;
                        int var13 = 32768;
                        while (~var7 != ~var9) {
                            if (var9 <= var7) {
                                if (var9 < var7) {
                                    --var7;
                                }
                            } else {
                                ++var7;
                            }
                            if ((class214.field3386[class214.field3389][var6][var7] & 4) != 0) {
                                class221.method1504(class307.field4991, false, 87, 1, var6, var7);
                                return;
                            }
                            var13 += var12;
                            if (var13 >= 65536) {
                                var13 -= 65536;
                                if (~var6 > ~var8) {
                                    ++var6;
                                } else if (var8 < var6) {
                                    --var6;
                                }
                                if (~(class214.field3386[class214.field3389][var6][var7] & 4) != -1) {
                                    class221.method1504(class307.field4991, false, 108, 1, var6, var7);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    int var14 = 32768;
                    int var15 = var10 * 65536 / var11;
                    while (~var6 != ~var8) {
                        if (~var6 > ~var8) {
                            ++var6;
                        } else if (var8 < var6) {
                            --var6;
                        }
                        if ((4 & class214.field3386[class214.field3389][var6][var7]) != 0) {
                            class221.method1504(class307.field4991, false, 125, 1, var6, var7);
                            return;
                        }
                        var14 += var15;
                        if (var14 >= 65536) {
                            var14 -= 65536;
                            if (~var7 > ~var9) {
                                ++var7;
                            } else if (var9 < var7) {
                                --var7;
                            }
                            if ((class214.field3386[class214.field3389][var6][var7] & 4) != 0) {
                                class221.method1504(class307.field4991, false, 118, 1, var6, var7);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        ++field4853;
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (arg1 != -117) {
            method2040(true);
        }
        if (super.field1662.field3063) {
            int[][] var4 = this.method759(0, arg1 + -11, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class24.field443; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var10[var11] = this.field4849 * var12 >> 12;
                    var8[var11] = this.field4857 * var13 >> 12;
                    var9[var11] = this.field4850 * var14 >> 12;
                } else {
                    var10[var11] = this.field4849;
                    var8[var11] = this.field4857;
                    var9[var11] = this.field4850;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILfj;)Ljava/lang/String;")
    public static final String method2042(int arg0, int arg1, class274 arg2) {
        ++field4848;
        try {
            int var3 = arg2.method1863((byte) 81);
            if (~arg0 > ~var3) {
                var3 = arg0;
            }
            if (arg1 != -15156) {
                method2035((byte) 17, 37, -121);
            }
            byte[] var4 = new byte[var3];
            arg2.field4458 += class162.field2646.method1264(var3, var4, arg2.field4458, 0, arg2.field4441, arg1 ^ 15155);
            return class88.method616(var4, 0, var3, -161);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
