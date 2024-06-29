import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class204 {

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public int field3228 = -1;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "Llo;")
    public static class306 field3232 = new class306("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
    public static int field3242 = -1;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!cu", name = "C", descriptor = "Lbu;")
    private class407 field3241;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "Ljava/lang/String;")
    private String field3222;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "Ljava/lang/String;")
    private String field3231;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "[I")
    private int[] field3214;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "[I")
    private int[] field3218;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "[I")
    private int[] field3223;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "[I")
    private int[] field3224;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "[I")
    private int[] field3229;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "[I")
    private int[] field3233;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "[I")
    private int[] field3237;

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "[I")
    private int[] field3240;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field3213;

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field3239;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "[[I")
    private int[][] field3220;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "[[I")
    private int[][] field3230;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "[[I")
    private int[][] field3236;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method1335(byte arg0, int arg1) {
        field3238++;
        if (arg0 < -24) {
            class266 var2 = class308.method1961(true, arg1, 12);
            var2.method1778(17991);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 19)
    public static final boolean method1336(byte arg0, String arg1) {
        field3217++;
        if (arg1 == null) {
            return false;
        } else if (arg0 == 43) {
            for (int var2 = 0; var2 < class14.field160; var2++) {
                if (arg1.equalsIgnoreCase(class60.field918[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class253.field4309[var2])) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V", line = 59)
    public static final void method1337(int arg0) {
        field3219++;
        int var1 = class506.field7365.method126((byte) -124);
        int var2 = class506.field7365.method180(false);
        boolean var3 = class506.field7365.method126((byte) -101) == 1;
        class194.field3037 = class506.field7365.method173(-1278512920);
        int var4 = class506.field7365.method162(false);
        class79.method579((byte) 83);
        class344.method2214(var1, 36);
        class506.field7365.method2154((byte) -125);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class217.field3775 >> 3; var20++) {
                for (int var21 = 0; var21 < class277.field4548 >> 3; var21++) {
                    int var22 = class506.field7365.method2155(1, 30390);
                    if (var22 == 1) {
                        class361.field5602[var5][var20][var21] = class506.field7365.method2155(26, 30390);
                    } else {
                        class361.field5602[var5][var20][var21] = -1;
                    }
                }
            }
        }
        if (arg0 > -122) {
            field3221 = -126;
        }
        class506.field7365.method2149(30795);
        int var6 = (class195.field3050 - class506.field7365.field301) / 16;
        class52.field845 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class52.field845[var7][var19] = class506.field7365.method143(-3230);
            }
        }
        class435.field6508 = new int[var6];
        class197.field3092 = new byte[var6][];
        class101.field1671 = new int[var6];
        class53.field855 = new byte[var6][];
        class160.field2565 = new int[var6];
        class397.field6073 = new int[var6];
        class23.field328 = new int[var6];
        class162.field2567 = new byte[var6][];
        class505.field7360 = null;
        class503.field7345 = new byte[var6][];
        class496.field7243 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class217.field3775 >> 3; var10++) {
                for (int var11 = 0; var11 < class277.field4548 >> 3; var11++) {
                    int var12 = class361.field5602[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FFE) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class23.field328[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class23.field328[var8] = var15;
                            int var17 = (var15 & 0xFFF4) >> 8;
                            int var18 = var15 & 0xFF;
                            class101.field1671[var8] = class388.field5971.method2927("m" + var17 + "_" + var18, -37);
                            class160.field2565[var8] = class388.field5971.method2927("l" + var17 + "_" + var18, -111);
                            class397.field6073[var8] = class388.field5971.method2927("um" + var17 + "_" + var18, -35);
                            class435.field6508[var8] = class388.field5971.method2927("ul" + var17 + "_" + var18, -92);
                            var8++;
                        }
                    }
                }
            }
        }
        class239.method1642(10, var3, -11, var2, var4);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)I", line = 209)
    public static final int method1338(int arg0, int arg1) {
        return class374.field5819 == null ? 0 : class374.field5819[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lia;I)V", line = 223)
    public final void method1339(class23 arg0, int arg1) {
        field3234++;
        if (arg1 != 20241) {
            method1338(-74, -21);
        }
        while (true) {
            int var3 = arg0.method126((byte) -121);
            if (var3 == 0) {
                return;
            }
            this.method1342((byte) -124, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V", line = 243)
    public static void method1340(byte arg0) {
        if (arg0 < 102) {
            method1338(-106, -119);
        }
        field3232 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZZ)Z", line = 253)
    public static boolean method1341(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BILia;)V", line = 264)
    private final void method1342(byte arg0, int arg1, class23 arg2) {
        int var4 = -37 % ((arg0 + 42) / 46);
        field3216++;
        if (arg1 == 1) {
            this.field3231 = arg2.method133(27482);
        } else if (arg1 == 2) {
            this.field3222 = arg2.method133(27482);
        } else if (arg1 == 3) {
            int var5 = arg2.method126((byte) -78);
            this.field3236 = new int[var5][3];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3236[var6][0] = arg2.method132(42);
                this.field3236[var6][1] = arg2.method143(-3230);
                this.field3236[var6][2] = arg2.method143(-3230);
            }
        } else if (arg1 == 4) {
            int var7 = arg2.method126((byte) -73);
            this.field3230 = new int[var7][3];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3230[var8][0] = arg2.method132(120);
                this.field3230[var8][1] = arg2.method143(-3230);
                this.field3230[var8][2] = arg2.method143(-3230);
            }
        } else if (arg1 == 5) {
            arg2.method132(21);
        } else if (arg1 == 6) {
            arg2.method126((byte) -85);
        } else if (arg1 == 7) {
            arg2.method126((byte) -126);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method126((byte) -104);
                return;
            }
            if (arg1 != 10) {
                if (arg1 == 12) {
                    arg2.method143(-3230);
                    return;
                }
                if (arg1 == 13) {
                    int var9 = arg2.method126((byte) -122);
                    this.field3233 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field3233[var10] = arg2.method132(76);
                    }
                    return;
                }
                if (arg1 != 14) {
                    if (arg1 == 15) {
                        arg2.method132(109);
                        return;
                    }
                    if (arg1 == 17) {
                        this.field3228 = arg2.method132(59);
                        return;
                    }
                    if (arg1 == 18) {
                        int var11 = arg2.method126((byte) -110);
                        this.field3218 = new int[var11];
                        this.field3223 = new int[var11];
                        this.field3214 = new int[var11];
                        this.field3213 = new String[var11];
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3214[var12] = arg2.method143(-3230);
                            this.field3218[var12] = arg2.method143(-3230);
                            this.field3223[var12] = arg2.method143(-3230);
                            this.field3213[var12] = arg2.method156((byte) -27);
                        }
                        return;
                    }
                    if (arg1 == 19) {
                        int var19 = arg2.method126((byte) -103);
                        this.field3229 = new int[var19];
                        this.field3239 = new String[var19];
                        this.field3237 = new int[var19];
                        this.field3240 = new int[var19];
                        for (int var20 = 0; var20 < var19; var20++) {
                            this.field3229[var20] = arg2.method143(-3230);
                            this.field3240[var20] = arg2.method143(-3230);
                            this.field3237[var20] = arg2.method143(-3230);
                            this.field3239[var20] = arg2.method156((byte) -56);
                        }
                    } else if (arg1 == 249) {
                        int var13 = arg2.method126((byte) -70);
                        if (this.field3241 == null) {
                            int var14 = class206.method1351(var13, 120);
                            this.field3241 = new class407(var14);
                        }
                        for (int var15 = 0; var15 < var13; var15++) {
                            boolean var16 = arg2.method126((byte) -77) == 1;
                            int var17 = arg2.method181(125);
                            class276 var18;
                            if (var16) {
                                var18 = new class17(arg2.method156((byte) -41));
                            } else {
                                var18 = new class22(arg2.method143(-3230));
                            }
                            this.field3241.method2517(var18, (long) var17, (byte) -120);
                        }
                        return;
                    }
                    return;
                }
                int var21 = arg2.method126((byte) -83);
                this.field3220 = new int[var21][2];
                for (int var22 = 0; var22 < var21; var22++) {
                    this.field3220[var22][0] = arg2.method126((byte) -73);
                    this.field3220[var22][1] = arg2.method126((byte) -126);
                }
                return;
            }
            int var23 = arg2.method126((byte) -97);
            this.field3224 = new int[var23];
            for (int var24 = 0; var24 < var23; var24++) {
                this.field3224[var24] = arg2.method143(-3230);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IB)V", line = 516)
    public static final void method1343(int arg0, byte arg1) {
        if (class53.field858 == null) {
            class53.field858 = new byte[4][class217.field3775][class277.field4548];
        }
        field3225++;
        for (int var2 = arg0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class217.field3775; var3++) {
                for (int var4 = 0; var4 < class277.field4548; var4++) {
                    class53.field858[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V", line = 553)
    public final void method1344(int arg0) {
        if (this.field3222 == null) {
            this.field3222 = this.field3231;
        }
        if (arg0 == -30712) {
            field3226++;
        }
    }
}
