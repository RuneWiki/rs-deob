import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class51 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public int field703 = -1;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field702 = 0;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "F")
    public static float field721 = 0.0F;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Lec;")
    private class129 field728;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lai;")
    public static class357 field711;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Ljava/lang/String;")
    private String field707;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Ljava/lang/String;")
    private String field716;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
    private int[] field704;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
    private int[] field706;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[I")
    private int[] field712;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[I")
    private int[] field713;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "[I")
    private int[] field714;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "[I")
    private int[] field720;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "[I")
    private int[] field723;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "[I")
    private int[] field727;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field717;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field726;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[[I")
    private int[][] field708;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[[I")
    private int[][] field715;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "[[I")
    private int[][] field719;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V", line = 9)
    public static final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field722++;
        if (arg2 == arg7) {
            class295.method1927((byte) 91, arg1, arg4, arg5, arg2, arg0, arg3);
            return;
        }
        if (arg3 - arg2 >= class154.field2161 && (arg2 + arg3) <= class233.field3350 && class290.field4058 <= (arg0 - arg7) && class442.field6212 >= arg0 + arg7) {
            class205.method1331(3, arg4, arg3, arg7, arg1, arg2, arg0, arg5);
        } else {
            class380.method2425(arg7, arg2, arg0, arg1, arg3, arg5, (byte) 125, arg4);
        }
        int var8 = 76 % ((arg6 - 34) / 55);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 33)
    public static void method427(byte arg0) {
        field711 = null;
        if (arg0 != -22) {
            method433((byte) 111, 72);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Z", line = 43)
    public static final boolean method428(int arg0) {
        field710++;
        return ~class326.field4462 == arg0 ? class288.field4044 : true;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLkh;)V", line = 55)
    public final void method429(byte arg0, class11 arg1) {
        if (arg0 != -70) {
            return;
        }
        field718++;
        while (true) {
            int var3 = arg1.method172((byte) 52);
            if (var3 == 0) {
                return;
            }
            this.method432(var3, arg1, 123);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 84)
    public final void method430(boolean arg0) {
        field705++;
        if (this.field707 == null) {
            this.field707 = this.field716;
        }
        if (arg0) {
            method427((byte) -86);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 114)
    public static final void method431(int arg0) {
        class360.field4922.method900(0);
        if (arg0 <= 24) {
            field721 = 1.3885002F;
        }
        field725++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILkh;I)V", line = 133)
    private final void method432(int arg0, class11 arg1, int arg2) {
        if (arg0 == 1) {
            this.field716 = arg1.method212(false);
        } else if (arg0 == 2) {
            this.field707 = arg1.method212(false);
        } else if (arg0 == 3) {
            int var22 = arg1.method172((byte) 52);
            this.field715 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field715[var23][0] = arg1.method174(255);
                this.field715[var23][1] = arg1.method185(25239);
                this.field715[var23][2] = arg1.method185(25239);
            }
        } else if (arg0 == 4) {
            int var4 = arg1.method172((byte) 52);
            this.field708 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field708[var5][0] = arg1.method174(255);
                this.field708[var5][1] = arg1.method185(25239);
                this.field708[var5][2] = arg1.method185(25239);
            }
        } else if (arg0 == 5) {
            arg1.method174(255);
        } else if (arg0 == 6) {
            arg1.method172((byte) 52);
        } else if (arg0 == 7) {
            arg1.method172((byte) 52);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method172((byte) 52);
            } else if (arg0 == 10) {
                int var6 = arg1.method172((byte) 52);
                this.field712 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field712[var7] = arg1.method185(25239);
                }
            } else if (arg0 == 12) {
                arg1.method185(25239);
            } else if (arg0 == 13) {
                int var8 = arg1.method172((byte) 52);
                this.field727 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field727[var9] = arg1.method174(255);
                }
            } else if (arg0 == 14) {
                int var10 = arg1.method172((byte) 52);
                this.field719 = new int[var10][2];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field719[var11][0] = arg1.method172((byte) 52);
                    this.field719[var11][1] = arg1.method172((byte) 52);
                }
            } else if (arg0 == 15) {
                arg1.method174(255);
            } else if (arg0 == 17) {
                this.field703 = arg1.method174(255);
            } else if (arg0 == 18) {
                int var12 = arg1.method172((byte) 52);
                this.field723 = new int[var12];
                this.field713 = new int[var12];
                this.field717 = new String[var12];
                this.field706 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field706[var13] = arg1.method185(25239);
                    this.field723[var13] = arg1.method185(25239);
                    this.field713[var13] = arg1.method185(25239);
                    this.field717[var13] = arg1.method171(-9265);
                }
            } else if (arg0 == 19) {
                int var20 = arg1.method172((byte) 52);
                this.field720 = new int[var20];
                this.field704 = new int[var20];
                this.field726 = new String[var20];
                this.field714 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field714[var21] = arg1.method185(25239);
                    this.field720[var21] = arg1.method185(25239);
                    this.field704[var21] = arg1.method185(25239);
                    this.field726[var21] = arg1.method171(-9265);
                }
            } else if (arg0 == 249) {
                int var14 = arg1.method172((byte) 52);
                if (this.field728 == null) {
                    int var15 = class438.method2748((byte) 124, var14);
                    this.field728 = new class129(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg1.method172((byte) 52) == 1;
                    int var18 = arg1.method208(27308);
                    class390 var19;
                    if (var17) {
                        var19 = new class200(arg1.method171(-9265));
                    } else {
                        var19 = new class406(arg1.method185(25239));
                    }
                    this.field728.method883((byte) -54, (long) var18, var19);
                }
            }
        }
        field709++;
        if (arg2 < 89) {
            this.field713 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Lqs;", line = 364)
    public static final class360 method433(byte arg0, int arg1) {
        field724++;
        class131 var2 = class366.field5155;
        class360 var3;
        synchronized (class366.field5155) {
            var3 = (class360) class366.field5155.method904(false, (long) arg1);
        }
        if (arg0 != 87) {
            field711 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class12.field247.method1745(class231.method1592(8064, arg1), (byte) 104, class192.method1248(arg1, (byte) -53));
        class360 var5 = new class360();
        var5.field4945 = arg1;
        var5.field4965 = new String[] { null, null, class337.field4627.method2763(arg0 ^ 0x33, class250.field3540), null, null };
        var5.field4955 = new String[] { null, null, null, null, class346.field4721.method2763(22, class250.field3540) };
        if (var4 != null) {
            var5.method2313(new class11(var4), 123);
        }
        var5.method2305((byte) -119);
        if (var5.field4963 != -1) {
            var5.method2308((byte) -124, method433((byte) 87, var5.field4961), method433((byte) 87, var5.field4963));
        }
        if (var5.field4921 != -1) {
            var5.method2315(method433((byte) 87, var5.field4921), method433((byte) 87, var5.field4937), true);
        }
        if (!class155.field2188 && var5.field4942) {
            var5.field4938 = class291.field4078.method2763(-105, class250.field3540);
            var5.field4955 = class20.field372;
            var5.field4943 = 0;
            var5.field4973 = false;
            var5.field4950 = null;
            var5.field4965 = class77.field1103;
            if (var5.field4904 != null) {
                boolean var6 = false;
                for (class390 var7 = var5.field4904.method885(-116); var7 != null; var7 = var5.field4904.method881((byte) -68)) {
                    class116 var8 = class44.method396((byte) -57, (int) var7.field5600);
                    if (var8.field1664) {
                        var7.method2467((byte) -90);
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var5.field4904 = null;
                }
            }
        }
        class131 var9 = class366.field5155;
        synchronized (class366.field5155) {
            class366.field5155.method902((long) arg1, (byte) 112, var5);
            return var5;
        }
    }
}
