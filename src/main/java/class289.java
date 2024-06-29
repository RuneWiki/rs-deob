import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class289 extends class154 {

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "Leg;")
    private static class37 field5100 = class174.method1167("Your ignore list is full)3 Max of 100 users)3", 124);

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "Leg;")
    public static class37 field5102 = field5100;

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "Leg;")
    public static class37 field5103 = class174.method1167("Verbindung mit Update)2Server)3)3)3", -25);

    @OriginalMember(owner = "client!qc", name = "kb", descriptor = "[I")
    public static int[] field5105 = new int[4];

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!qc", name = "lb", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "[Ltj;")
    private class69[] field5099;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)I")
    public static final int method1935(byte arg0) {
        ++field5096;
        if (arg0 != -81) {
            field5103 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([[II)V")
    private final void method1936(int[][] arg0, int arg1) {
        int var3 = class110.field1847;
        int var4 = class227.field3898;
        class269.method1802(arg0, arg1 ^ 4053);
        class93.method612(-107, class239.field4260, class109.field1786, 0, 0);
        ++field5098;
        if (this.field5099 != null) {
            for (int var5 = 0; ~this.field5099.length < ~var5; ++var5) {
                class69 var6 = this.field5099[var5];
                int var7 = var6.field1090;
                int var8 = var6.field1110;
                if (var7 >= 0) {
                    if (~var8 > -1) {
                        var6.method416(arg1 ^ -3995, var3, var4);
                    } else {
                        var6.method418(var3, 28440, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method414(var4, var3, 31712);
                }
            }
        }
        if (arg1 != 4055) {
            this.method143(-96, -113);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZILlb;Lva;)V")
    public static final void method1937(boolean arg0, int arg1, class207 arg2, class187 arg3) {
        ++field5095;
        class230 var4 = new class230();
        var4.field3938 = arg3.method1268(255);
        var4.field3945 = arg3.method1290((byte) 90);
        var4.field3942 = new byte[var4.field3938][][];
        var4.field3933 = new class251[var4.field3938];
        var4.field3940 = new int[var4.field3938];
        var4.field3937 = new class251[var4.field3938];
        var4.field3939 = new int[var4.field3938];
        var4.field3941 = new int[var4.field3938];
        if (!arg0) {
            method1941(82, 81, 39, 17, -91, 5);
        }
        for (int var5 = 0; ~var4.field3938 < ~var5; ++var5) {
            try {
                int var6 = arg3.method1268(255);
                if (var6 != 0 && var6 != 1 && var6 != 2) {
                    if (~var6 == -4 || var6 == 4) {
                        String var10 = new String(arg3.method1253(-125).method261((byte) -6));
                        String var11 = new String(arg3.method1253(67).method261((byte) -6));
                        int var12 = arg3.method1268(255);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; ~var14 > ~var12; ++var14) {
                            var13[var14] = new String(arg3.method1253(7).method261((byte) -6));
                        }
                        byte[][] var15 = new byte[var12][];
                        if (var6 == 3) {
                            for (int var16 = 0; var12 > var16; ++var16) {
                                int var17 = arg3.method1290((byte) 90);
                                var15[var16] = new byte[var17];
                                arg3.method1280(255, var17, 0, var15[var16]);
                            }
                        }
                        var4.field3940[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; var19 < var12; ++var19) {
                            var18[var19] = class276.method1860(var13[var19], 29609);
                        }
                        var4.field3933[var5] = arg2.method1428(var18, var11, -24647, class276.method1860(var10, 29609));
                        var4.field3942[var5] = var15;
                    }
                } else {
                    String var7 = new String(arg3.method1253(34).method261((byte) -6));
                    String var8 = new String(arg3.method1253(-90).method261((byte) -6));
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg3.method1290((byte) 90);
                    }
                    var4.field3940[var5] = var6;
                    var4.field3941[var5] = var9;
                    var4.field3937[var5] = arg2.method1430(16, class276.method1860(var7, 29609), var8);
                }
            } catch (ClassNotFoundException var20) {
                var4.field3939[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3939[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3939[var5] = -3;
            } catch (Exception var23) {
                var4.field3939[var5] = -4;
            } catch (Throwable var24) {
                var4.field3939[var5] = -5;
            }
        }
        class117.field1987.method1574(var4, 0);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field5106;
        if (arg1 != 1075962732) {
            this.method143(-110, -51);
        }
        int[] var3 = super.field2574.method206(arg0, arg1 + -1075952500);
        if (super.field2574.field536) {
            this.method1936(super.field2574.method208(0), 4055);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
    public static final void method1938(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class274 var5 = class166.method1116(arg0, arg3, true);
        ++field5097;
        var5.method1835(-24);
        var5.field4824 = arg4;
        var5.field4802 = arg2;
        var5.field4813 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class289() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 != -14015) {
            field5102 = null;
        }
        ++field5104;
        if (~arg2 == -1) {
            this.field5099 = new class69[arg0.method1268(255)];
            for (int var4 = 0; ~var4 > ~this.field5099.length; ++var4) {
                int var5 = arg0.method1268(255);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field5099[var4] = class42.method279(arg0, true);
                            }
                        } else {
                            this.field5099[var4] = class202.method1400(arg0, -28388);
                        }
                    } else {
                        this.field5099[var4] = class265.method1787(arg1 + 14015, arg0);
                    }
                } else {
                    this.field5099[var4] = class187.method1298((byte) 64, arg0);
                }
            }
        } else if (~arg2 == -2) {
            super.field2579 = ~arg0.method1268(255) == -2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
    public static void method1939(int arg0) {
        field5105 = null;
        field5100 = null;
        field5102 = null;
        if (arg0 > 67) {
            field5103 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1940(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= 0 && arg0 >= 0 && arg5 < 103 && ~arg0 > -104) {
            if (~arg6 == -1) {
                class79 var8 = class278.method1871(arg7, arg5, arg0);
                if (var8 != null) {
                    int var9 = (int) (var8.field1222 >>> 32) & Integer.MAX_VALUE;
                    if (~arg4 != -3) {
                        var8.field1221 = new class139(var9, arg4, arg2, arg7, arg5, arg0, arg3, false, var8.field1221);
                    } else {
                        var8.field1221 = new class139(var9, 2, 4 - -arg2, arg7, arg5, arg0, arg3, false, var8.field1221);
                        var8.field1235 = new class139(var9, 2, 3 & arg2 + 1, arg7, arg5, arg0, arg3, false, var8.field1235);
                    }
                }
            }
            if (~arg6 == -2) {
                class273 var10 = class214.method1519(arg7, arg5, arg0);
                if (var10 != null) {
                    int var11 = (int) (var10.field4781 >>> 32) & Integer.MAX_VALUE;
                    if (arg4 != 4 && arg4 != 5) {
                        if (arg4 != 6) {
                            if (~arg4 == -8) {
                                var10.field4780 = new class139(var11, 4, (3 & arg2 + 2) + 4, arg7, arg5, arg0, arg3, false, var10.field4780);
                            } else if (~arg4 == -9) {
                                var10.field4780 = new class139(var11, 4, arg2 + 4, arg7, arg5, arg0, arg3, false, var10.field4780);
                                var10.field4791 = new class139(var11, 4, (arg2 + 2 & 3) + 4, arg7, arg5, arg0, arg3, false, var10.field4791);
                            }
                        } else {
                            var10.field4780 = new class139(var11, 4, arg2 + 4, arg7, arg5, arg0, arg3, false, var10.field4780);
                        }
                    } else {
                        var10.field4780 = new class139(var11, 4, arg2, arg7, arg5, arg0, arg3, false, var10.field4780);
                    }
                }
            }
            if (arg6 == 2) {
                if (arg4 == 11) {
                    arg4 = 10;
                }
                class27 var12 = class248.method1712(arg7, arg5, arg0);
                if (var12 != null) {
                    var12.field400 = new class139((int) (var12.field381 >>> 32) & Integer.MAX_VALUE, arg4, arg2, arg7, arg5, arg0, arg3, false, var12.field400);
                }
            }
            if (arg6 == 3) {
                class239 var13 = class201.method1396(arg7, arg5, arg0);
                if (var13 != null) {
                    var13.field4251 = new class139(Integer.MAX_VALUE & (int) (var13.field4244 >>> 32), 22, arg2, arg7, arg5, arg0, arg3, false, var13.field4251);
                }
            }
        }
        int var14 = -38 % ((-47 - arg1) / 48);
        ++field5101;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; ~var6 >= ~(arg1 + arg5); ++var6) {
            for (int var11 = arg2; ~var11 >= ~(arg0 + arg2); ++var11) {
                if (~var11 <= -1 && var11 < 104 && ~var6 <= -1 && var6 < 104) {
                    class10.field173[arg3][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg5; arg1 + arg5 > var7; ++var7) {
            for (int var10 = arg2; ~var10 > ~(arg0 + arg2); ++var10) {
                if (~var10 <= -1 && var10 < 104 && var7 >= 0 && ~var7 > -105) {
                    class218.field3754[arg3][var10][var7] = ~arg3 < -1 ? class218.field3754[arg3 + -1][var10][var7] : 0;
                }
            }
        }
        if (arg2 > 0 && ~arg2 > -105) {
            for (int var8 = arg5 + 1; var8 < arg5 - -arg1; ++var8) {
                if (~var8 <= -1 && ~var8 > -105) {
                    class218.field3754[arg3][arg2][var8] = class218.field3754[arg3][arg2 + -1][var8];
                }
            }
        }
        if (arg5 > 0 && ~arg5 > -105) {
            for (int var9 = arg2 + 1; ~var9 > ~(arg0 + arg2); ++var9) {
                if (~var9 <= -1 && var9 < 104) {
                    class218.field3754[arg3][var9][arg5] = class218.field3754[arg3][var9][arg5 + -1];
                }
            }
        }
        if (arg4 != 8571) {
            field5100 = null;
        }
        if (~arg2 <= -1 && ~arg5 <= -1 && arg2 < 104 && arg5 < 104) {
            if (~arg3 != -1) {
                if (~arg2 < -1 && ~class218.field3754[arg3 + -1][arg2 + -1][arg5] != ~class218.field3754[arg3][arg2 + -1][arg5]) {
                    class218.field3754[arg3][arg2][arg5] = class218.field3754[arg3][arg2 + -1][arg5];
                } else if (arg5 > 0 && class218.field3754[arg3 - 1][arg2][arg5 + -1] != class218.field3754[arg3][arg2][arg5 + -1]) {
                    class218.field3754[arg3][arg2][arg5] = class218.field3754[arg3][arg2][arg5 + -1];
                } else if (~arg2 < -1 && arg5 > 0 && class218.field3754[arg3][arg2 + -1][arg5 - 1] != class218.field3754[arg3 - 1][arg2 + -1][arg5 + -1]) {
                    class218.field3754[arg3][arg2][arg5] = class218.field3754[arg3][arg2 - 1][arg5 + -1];
                }
            } else if (~arg2 < -1 && ~class218.field3754[arg3][arg2 + -1][arg5] != -1) {
                class218.field3754[arg3][arg2][arg5] = class218.field3754[arg3][arg2 + -1][arg5];
            } else if (arg5 > 0 && class218.field3754[arg3][arg2][arg5 + -1] != 0) {
                class218.field3754[arg3][arg2][arg5] = class218.field3754[arg3][arg2][arg5 + -1];
            } else if (arg2 > 0 && arg5 > 0 && class218.field3754[arg3][arg2 - 1][arg5 + -1] != 0) {
                class218.field3754[arg3][arg2][arg5] = class218.field3754[arg3][arg2 + -1][arg5 + -1];
            }
        }
        ++field5092;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(II)Ljb;")
    public static final class185 method1942(int arg0, int arg1) {
        if (arg1 != 4) {
            return null;
        } else {
            class185 var2 = (class185) class280.field4949.method1411(-57, (long) arg0);
            ++field5093;
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class290.field5109.method666(arg0, 1, (byte) -51);
                class185 var4 = new class185();
                if (var3 != null) {
                    var4.method1239(new class187(var3), arg0, (byte) 116);
                }
                class280.field4949.method1404((long) arg0, false, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        if (arg0 != 115) {
            field5100 = null;
        }
        int[][] var3 = super.field2585.method1532(arg1, -2);
        if (super.field2585.field3761) {
            int var4 = class227.field3898;
            int var5 = class110.field1847;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2585.method1530(true);
            this.method1936(var6, arg0 ^ 4004);
            for (int var8 = 0; var8 < class110.field1847; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[2];
                int[] var12 = var10[1];
                int[] var13 = var10[0];
                for (int var14 = 0; var14 < class227.field3898; ++var14) {
                    int var15 = var9[var14];
                    var11[var14] = class96.method626(4080, var15 << 4);
                    var12[var14] = class96.method626(65280, var15) >> 4;
                    var13[var14] = class96.method626(var15 >> 12, 4080);
                }
            }
        }
        ++field5094;
        return var3;
    }
}
