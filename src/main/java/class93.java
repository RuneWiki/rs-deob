import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class93 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public int field1040 = -1;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Ljo;")
    private class353 field1044;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Ljava/lang/String;")
    private String field1048;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "Ljava/lang/String;")
    private String field1054;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[I")
    private int[] field1041;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
    private int[] field1042;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "[I")
    private int[] field1043;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "[I")
    private int[] field1050;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "[I")
    private int[] field1051;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "[I")
    private int[] field1053;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "[I")
    private int[] field1056;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "[I")
    private int[] field1058;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field1038;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "[Ljava/lang/String;")
    private String[] field1046;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "[[I")
    private int[][] field1052;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "[[I")
    private int[][] field1055;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "[[I")
    private int[][] field1057;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lso;II)V", line = 12)
    private final void method685(class494 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field1054 = arg0.method3001((byte) -9);
        } else if (arg2 == 2) {
            this.field1048 = arg0.method3001((byte) 2);
        } else if (arg2 == 3) {
            int var22 = arg0.method2964((byte) 98);
            this.field1052 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field1052[var23][0] = arg0.method2998(true);
                this.field1052[var23][1] = arg0.method2976(-126);
                this.field1052[var23][2] = arg0.method2976(class587.method3425(arg1, 15729));
            }
        } else if (arg2 == 4) {
            int var4 = arg0.method2964((byte) 56);
            this.field1057 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1057[var5][0] = arg0.method2998(true);
                this.field1057[var5][1] = arg0.method2976(-127);
                this.field1057[var5][2] = arg0.method2976(-127);
            }
        } else if (arg2 == 5) {
            arg0.method2998(true);
        } else if (arg2 == 6) {
            arg0.method2964((byte) 96);
        } else if (arg2 == 7) {
            arg0.method2964((byte) 64);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method2964((byte) 52);
            } else if (arg2 == 10) {
                int var20 = arg0.method2964((byte) 81);
                this.field1053 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field1053[var21] = arg0.method2976(-128);
                }
            } else if (arg2 == 12) {
                arg0.method2976(-128);
            } else if (arg2 == 13) {
                int var18 = arg0.method2964((byte) 37);
                this.field1043 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field1043[var19] = arg0.method2998(true);
                }
            } else if (arg2 == 14) {
                int var6 = arg0.method2964((byte) 66);
                this.field1055 = new int[var6][2];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1055[var7][0] = arg0.method2964((byte) 70);
                    this.field1055[var7][1] = arg0.method2964((byte) 107);
                }
            } else if (arg2 == 15) {
                arg0.method2998(true);
            } else if (arg2 == 17) {
                this.field1040 = arg0.method2998(true);
            } else if (arg2 == 18) {
                int var16 = arg0.method2964((byte) 108);
                this.field1056 = new int[var16];
                this.field1038 = new String[var16];
                this.field1058 = new int[var16];
                this.field1050 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field1058[var17] = arg0.method2976(-128);
                    this.field1050[var17] = arg0.method2976(-124);
                    this.field1056[var17] = arg0.method2976(-125);
                    this.field1038[var17] = arg0.method2996(119);
                }
            } else if (arg2 == 19) {
                int var14 = arg0.method2964((byte) 94);
                this.field1046 = new String[var14];
                this.field1051 = new int[var14];
                this.field1041 = new int[var14];
                this.field1042 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1042[var15] = arg0.method2976(-126);
                    this.field1041[var15] = arg0.method2976(class587.method3425(arg1, 15734));
                    this.field1051[var15] = arg0.method2976(-126);
                    this.field1046[var15] = arg0.method2996(111);
                }
            } else if (arg2 == 249) {
                int var8 = arg0.method2964((byte) 118);
                if (this.field1044 == null) {
                    int var9 = class433.method2595(var8, (byte) -82);
                    this.field1044 = new class353(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg0.method2964((byte) 96) == 1;
                    int var12 = arg0.method2960((byte) 94);
                    class577 var13;
                    if (var11) {
                        var13 = new class68(arg0.method2996(arg1 ^ 0xFFFFC284));
                    } else {
                        var13 = new class489(arg0.method2976(-125));
                    }
                    this.field1044.method2241(arg1 ^ 0xFFFFC2C2, (long) var12, var13);
                }
            }
        }
        field1059++;
        if (arg1 != -15627) {
            this.field1058 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V", line = 260)
    public static final void method686(int arg0, int arg1, int arg2) {
        field1045++;
        int var3 = class395.field5431.method41(class620.field8685.method3580(class140.field2081, 12), -121);
        int var5;
        if (class378.field5223) {
            for (class753 var7 = (class753) class371.field5135.method636(arg1 ^ 0x108); var7 != null; var7 = (class753) class371.field5135.method637(false)) {
                int var10;
                if (var7.field10409 == 1) {
                    var10 = class298.method1939((class746) var7.field10411.field923.field1600, 101);
                } else {
                    var10 = class738.method4108(var7, true);
                }
                if (var10 > var3) {
                    var3 = var10;
                }
            }
            var3 += 8;
            class42.field549 = (class463.field6530 ? 26 : 22) + class310.field4426 * 16;
            var5 = class310.field4426 * 16 + 21;
        } else {
            for (class746 var4 = (class746) class239.field3583.method1731((byte) -128); var4 != null; var4 = (class746) class239.field3583.method1724(0)) {
                int var6 = class298.method1939(var4, arg1 + 114);
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            var3 += 8;
            class42.field549 = (class463.field6530 ? 26 : 22) + class618.field8644 * 16;
            var5 = class618.field8644 * 16 + 21;
        }
        if (arg1 != 8) {
            return;
        }
        int var8 = arg2 - (var3 / 2);
        if ((var3 + var8) > class428.field5825) {
            var8 = class428.field5825 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        if (class714.field9895 < (var5 + arg0)) {
            var9 = class714.field9895 - var5;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class109.field1608 = var8;
        class54.field679 = var3;
        class407.field5549 = var9;
        class626.field8777 = true;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Lwja;", line = 350)
    public static final class280 method687(int arg0) {
        field1047++;
        try {
            return new class223();
        } catch (Throwable var2) {
            if (arg0 != 0) {
                return null;
            }
            try {
                return (class280) Class.forName("ida").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class573();
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lso;I)V", line = 381)
    public final void method688(class494 arg0, int arg1) {
        if (arg1 != -1) {
            this.method690(119);
        }
        while (true) {
            int var3 = arg0.method2964((byte) 42);
            if (var3 == 0) {
                field1049++;
                return;
            }
            this.method685(arg0, -15627, var3);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZIII[IILqfa;)Lcw;", line = 402)
    public static final class192 method689(int arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, class106 arg7) {
        field1039++;
        if (arg3 != 22) {
            return null;
        } else if (!arg7.field1515 && (!class262.method1704(arg6, 3) || !class262.method1704(arg2, 3))) {
            return arg7.field1517 ? new class192(arg7, 34037, arg6, arg2, arg1, arg5, arg0, arg4) : new class192(arg7, arg6, arg2, class433.method2595(arg6, (byte) -82), class433.method2595(arg2, (byte) -82), arg5);
        } else {
            return new class192(arg7, 3553, arg6, arg2, arg1, arg5, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V", line = 438)
    public final void method690(int arg0) {
        if (arg0 != -16) {
            this.method688(null, 13);
        }
        if (this.field1048 == null) {
            this.field1048 = this.field1054;
        }
        field1060++;
    }
}
