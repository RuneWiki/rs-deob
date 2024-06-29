import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class184 {

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public int field2493 = -1;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "[I")
    public static int[] field2494 = new int[13];

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "Lsf;")
    private class143 field2495;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "Ljava/lang/String;")
    private String field2487;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "Ljava/lang/String;")
    private String field2498;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "[I")
    private int[] field2479;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "[I")
    private int[] field2483;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "[I")
    private int[] field2489;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "[I")
    private int[] field2490;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "[I")
    private int[] field2491;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "[I")
    private int[] field2496;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "[I")
    private int[] field2497;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "[I")
    private int[] field2504;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field2492;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field2502;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "[[I")
    private int[][] field2484;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "[[I")
    private int[][] field2501;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "[[I")
    private int[][] field2503;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
    public final void method1132(boolean arg0) {
        field2485++;
        if (!arg0) {
            this.field2496 = null;
        }
        if (this.field2487 == null) {
            this.field2487 = this.field2498;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public static void method1133(byte arg0) {
        if (arg0 >= -12) {
            field2494 = null;
        }
        field2494 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BILil;)V")
    private final void method1134(byte arg0, int arg1, class265 arg2) {
        field2499++;
        if (arg0 <= 65) {
            this.field2487 = null;
        }
        if (arg1 == 1) {
            this.field2498 = arg2.method1663(5);
        } else if (arg1 == 2) {
            this.field2487 = arg2.method1663(5);
        } else if (arg1 == 3) {
            int var4 = arg2.method1697(86);
            this.field2484 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2484[var5][0] = arg2.method1685(8104);
                this.field2484[var5][1] = arg2.method1666(-2);
                this.field2484[var5][2] = arg2.method1666(-2);
            }
        } else if (arg1 == 4) {
            int var22 = arg2.method1697(122);
            this.field2503 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field2503[var23][0] = arg2.method1685(8104);
                this.field2503[var23][1] = arg2.method1666(-2);
                this.field2503[var23][2] = arg2.method1666(-2);
            }
        } else if (arg1 == 5) {
            arg2.method1685(8104);
        } else if (arg1 == 6) {
            arg2.method1697(-37);
            return;
        } else if (arg1 == 7) {
            arg2.method1697(-51);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method1697(116);
                return;
            }
            if (arg1 == 10) {
                int var6 = arg2.method1697(-33);
                this.field2491 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2491[var7] = arg2.method1666(-2);
                }
                return;
            }
            if (arg1 == 12) {
                arg2.method1666(-2);
                return;
            }
            if (arg1 != 13) {
                if (arg1 == 14) {
                    int var8 = arg2.method1697(-60);
                    this.field2501 = new int[var8][2];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field2501[var9][0] = arg2.method1697(-24);
                        this.field2501[var9][1] = arg2.method1697(-13);
                    }
                    return;
                }
                if (arg1 != 15) {
                    if (arg1 == 17) {
                        this.field2493 = arg2.method1685(8104);
                        return;
                    }
                    if (arg1 == 18) {
                        int var10 = arg2.method1697(-60);
                        this.field2490 = new int[var10];
                        this.field2496 = new int[var10];
                        this.field2489 = new int[var10];
                        this.field2502 = new String[var10];
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field2490[var11] = arg2.method1666(-2);
                            this.field2489[var11] = arg2.method1666(-2);
                            this.field2496[var11] = arg2.method1666(-2);
                            this.field2502[var11] = arg2.method1712(false);
                        }
                        return;
                    }
                    if (arg1 == 19) {
                        int var18 = arg2.method1697(104);
                        this.field2492 = new String[var18];
                        this.field2479 = new int[var18];
                        this.field2504 = new int[var18];
                        this.field2483 = new int[var18];
                        for (int var19 = 0; var19 < var18; var19++) {
                            this.field2504[var19] = arg2.method1666(-2);
                            this.field2479[var19] = arg2.method1666(-2);
                            this.field2483[var19] = arg2.method1666(-2);
                            this.field2492[var19] = arg2.method1712(false);
                        }
                    } else if (arg1 == 249) {
                        int var12 = arg2.method1697(-38);
                        if (this.field2495 == null) {
                            int var13 = class8.method64(1388313616, var12);
                            this.field2495 = new class143(var13);
                        }
                        for (int var14 = 0; var14 < var12; var14++) {
                            boolean var15 = arg2.method1697(-15) == 1;
                            int var16 = arg2.method1691(false);
                            class393 var17;
                            if (var15) {
                                var17 = new class442(arg2.method1712(false));
                            } else {
                                var17 = new class231(arg2.method1666(-2));
                            }
                            this.field2495.method956(false, (long) var16, var17);
                        }
                        return;
                    }
                    return;
                }
                arg2.method1685(8104);
                return;
            }
            int var20 = arg2.method1697(-111);
            this.field2497 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field2497[var21] = arg2.method1685(8104);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lil;I)V")
    public final void method1135(class265 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1697(108);
            if (var3 == 0) {
                field2480++;
                if (arg1 > -118) {
                    this.field2492 = null;
                    return;
                }
                return;
            }
            this.method1134((byte) 121, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method1136(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2488++;
        if (class126.method864((byte) -92, arg1)) {
            class135.method906(arg6, arg4, arg0, arg2, arg8, class119.field1607[arg1], arg5, 108, -1, arg7);
            if (arg3 != -35) {
                field2482 = 19;
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class85.field1178[var9] = true;
            }
        } else {
            class85.field1178[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static final void method1137(int arg0) {
        for (int var1 = 0; var1 < class416.field6195.length; var1++) {
            for (int var2 = 0; var2 < class416.field6195[var1].length; var2++) {
                class416.field6195[var1][var2] = class152.field1987;
            }
        }
        if (arg0 != 7716) {
            method1137(-40);
        }
        field2500++;
    }
}
