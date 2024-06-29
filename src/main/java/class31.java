import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 extends class224 {

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Lvj;")
    public static class115 field408 = new class115(128);

    @OriginalMember(owner = "client!na", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field415 = new String[1000];

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field416 = 0;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field421 = -1;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "F")
    public static float field418;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V")
    private final void method245(byte arg0, int arg1) {
        if (arg0 != 115) {
            this.field422 = -110;
        }
        this.field422 = arg1 << 4 & 4080;
        this.field407 = arg1 >> 12 & 4080;
        ++field412;
        this.field405 = (65280 & arg1) >> 4;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(III)Ltb;")
    public static final class69 method246(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class69 var4 = var3.field627;
            var3.field627 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII)V")
    public static final void method247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -1198) {
            field420 = -62;
        }
        if (~arg3 >= ~class189.field2984 && class110.field1669 <= arg4) {
            boolean var6;
            if (~class51.field710 < ~arg5) {
                var6 = false;
                arg5 = class51.field710;
            } else if (~class96.field1484 > ~arg5) {
                var6 = false;
                arg5 = class96.field1484;
            } else {
                var6 = true;
            }
            boolean var7;
            if (~arg2 <= ~class51.field710) {
                if (class96.field1484 >= arg2) {
                    var7 = true;
                } else {
                    arg2 = class96.field1484;
                    var7 = false;
                }
            } else {
                arg2 = class51.field710;
                var7 = false;
            }
            if (~class110.field1669 < ~arg3) {
                arg3 = class110.field1669;
            } else {
                class8.method52(arg5, class106.field1637[arg3++], arg2, arg0, true);
            }
            if (arg4 <= class189.field2984) {
                class8.method52(arg5, class106.field1637[arg4--], arg2, arg0, true);
            } else {
                arg4 = class189.field2984;
            }
            if (var6 && var7) {
                for (int var8 = arg3; ~arg4 <= ~var8; ++var8) {
                    int[] var9 = class106.field1637[var8];
                    var9[arg5] = var9[arg2] = arg0;
                }
            } else if (var6) {
                for (int var10 = arg3; arg4 >= var10; ++var10) {
                    class106.field1637[var10][arg5] = arg0;
                }
            } else if (var7) {
                for (int var11 = arg3; var11 <= arg4; ++var11) {
                    class106.field1637[var11][arg2] = arg0;
                }
            }
        }
        ++field414;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field423;
        if (arg1 != 1) {
            method255((String) null, 63);
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class78.field1108; ++var7) {
                var4[var7] = this.field407;
                var6[var7] = this.field405;
                var5[var7] = this.field422;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([IIIIII)V")
    public static final void method248(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class49 var6 = class90.field1382[arg3][arg4][arg5];
        if (var6 != null) {
            class215 var7 = var6.field638;
            if (var7 == null) {
                class81 var10 = var6.field632;
                if (var10 != null) {
                    int var11 = var10.field1186;
                    int var12 = var10.field1180;
                    int var13 = var10.field1179;
                    int var14 = var10.field1189;
                    int[] var15 = class94.field1465[var11];
                    int[] var16 = class13.field153[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field3515;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method249(String arg0, int arg1) {
        ++field410;
        String var2 = class98.method655(class162.method1116(arg0, (byte) 123), arg1 ^ arg1);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(II)Lsh;")
    public static final class212 method250(int arg0, int arg1) {
        ++field417;
        class212 var2 = (class212) class86.field1359.method765((long) arg1, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class282.field4468.method807((byte) 96, arg1, 26);
            class212 var4 = new class212();
            if (var3 != null) {
                var4.method1433(new class25(var3), true);
            }
            class86.field1359.method763(arg0 + 19293, var4, (long) arg1);
            if (arg0 != -19333) {
                method249((String) null, 95);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        ++field404;
        if (arg1 == 0) {
            this.method245((byte) 115, arg0.method215((byte) 100));
        }
        if (arg2 >= -46) {
            this.field407 = 0;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLlj;)V")
    public static final void method251(byte arg0, class25 arg1) {
        ++field419;
        int var2 = arg1.method192((byte) -20);
        class172.field2706 = new class124[var2];
        for (int var3 = 0; ~var2 < ~var3; ++var3) {
            class172.field2706[var3] = new class124();
            class172.field2706[var3].field1854 = arg1.method192((byte) -20);
            class172.field2706[var3].field1851 = arg1.method208(false);
        }
        class45.field577 = arg1.method192((byte) -20);
        class187.field2950 = arg1.method192((byte) -20);
        class118.field1734 = arg1.method192((byte) -20);
        class80.field1164 = new class157[class187.field2950 - class45.field577 + 1];
        int var4 = 101 % ((48 - arg0) / 58);
        for (int var5 = 0; ~class118.field1734 < ~var5; ++var5) {
            int var6 = arg1.method192((byte) -20);
            class157 var7 = class80.field1164[var6] = new class157();
            var7.field1478 = arg1.method201(255);
            var7.field1493 = arg1.method214((byte) 44);
            var7.field2421 = class45.field577 + var6;
            var7.field2423 = arg1.method208(false);
            var7.field2422 = arg1.method208(false);
        }
        class216.field3524 = arg1.method214((byte) 44);
        class287.field4546 = true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method252(byte arg0) {
        field408 = null;
        if (arg0 == -33) {
            field415 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
    private class31(int arg0) {
        super(0, false);
        this.method245((byte) 115, arg0);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IIII)I")
    public static final int method253(int arg0, int arg1, int arg2, int arg3) {
        ++field411;
        if ((class35.field449[arg2][arg1][arg0] & 8) != 0) {
            return 0;
        } else {
            if (arg3 != 4080) {
                method255((String) null, 50);
            }
            return arg2 > 0 && (class35.field449[1][arg1][arg0] & 2) != 0 ? arg2 + -1 : arg2;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(III)V")
    public static final void method254(int arg0, int arg1, int arg2) {
        if (arg0 != 65280) {
            method247(55, -1, 62, 21, 43, 97);
        }
        ++field409;
        class258.field4166[arg1] = arg2;
        class16 var3 = (class16) class202.field3168.method665((byte) 113, (long) arg1);
        if (var3 == null) {
            class16 var4 = new class16(500L + class260.method1785((byte) -120));
            class202.field3168.method662(arg0 + -65280, var4, (long) arg1);
        } else {
            var3.field188 = class260.method1785((byte) -98) - -500L;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class31() {
        this(0);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public static final void method255(String arg0, int arg1) {
        ++field413;
        class167.field2574 = arg0;
        if (class2.field23.field237 != null) {
            try {
                String var2 = class2.field23.field237.getParameter("cookieprefix");
                if (arg1 == 9327) {
                    String var3 = class2.field23.field237.getParameter("cookiehost");
                    String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                    String var5;
                    if (~arg0.length() != -1) {
                        var5 = var4 + "; Expires=" + class269.method1828((byte) 49, 94608000000L + class260.method1785((byte) -101)) + "; Max-Age=" + 94608000L;
                    } else {
                        var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    class113.method731((byte) 43, class2.field23.field237, "document.cookie=\"" + var5 + "\"");
                }
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILef;B)Ljava/lang/String;")
    public static final String method256(int arg0, class214 arg1, byte arg2) {
        ++field406;
        if (!client.method1038(arg1).method484(-1, arg0) && arg1.field3446 == null) {
            return null;
        } else {
            if (arg2 != 37) {
                method248((int[]) null, -16, 41, 38, -11, 121);
            }
            if (arg1.field3337 != null && ~arg1.field3337.length < ~arg0 && arg1.field3337[arg0] != null && ~arg1.field3337[arg0].trim().length() != -1) {
                return arg1.field3337[arg0];
            } else {
                return class22.field270 ? "Hidden-" + arg0 : null;
            }
        }
    }
}
