import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class284 {

    @OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
    public int field3463 = -1;

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "Ljl;")
    public static class270 field3457 = new class270(16);

    @OriginalMember(owner = "client!ria", name = "s", descriptor = "Lof;")
    public static class620 field3468 = new class620(64);

    @OriginalMember(owner = "client!ria", name = "v", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ria", name = "l", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ria", name = "u", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ria", name = "x", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "Lpfa;")
    private class295 field3455;

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "Ljava/lang/String;")
    private String field3458;

    @OriginalMember(owner = "client!ria", name = "q", descriptor = "Ljava/lang/String;")
    private String field3466;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "[I")
    private int[] field3452;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "[I")
    private int[] field3453;

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "[I")
    private int[] field3456;

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "[I")
    private int[] field3459;

    @OriginalMember(owner = "client!ria", name = "r", descriptor = "[I")
    private int[] field3467;

    @OriginalMember(owner = "client!ria", name = "t", descriptor = "[I")
    private int[] field3469;

    @OriginalMember(owner = "client!ria", name = "w", descriptor = "[I")
    private int[] field3472;

    @OriginalMember(owner = "client!ria", name = "y", descriptor = "[I")
    private int[] field3474;

    @OriginalMember(owner = "client!ria", name = "m", descriptor = "[Ljava/lang/String;")
    private String[] field3462;

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field3475;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "[Z")
    public static boolean[] field3450;

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "[[I")
    private int[][] field3460;

    @OriginalMember(owner = "client!ria", name = "o", descriptor = "[[I")
    private int[][] field3464;

    @OriginalMember(owner = "client!ria", name = "A", descriptor = "[[I")
    private int[][] field3476;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(BLig;)V")
    public final void method1697(byte arg0, class244 arg1) {
        while (true) {
            int var3 = arg1.method1423(-46);
            if (var3 == 0) {
                if (arg0 <= 104) {
                    method1699((byte) -105, null);
                }
                field3465++;
                return;
            }
            this.method1701(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V")
    public static void method1698(byte arg0) {
        field3468 = null;
        field3450 = null;
        int var1 = 22 / ((arg0 - 54) / 44);
        field3457 = null;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1699(byte arg0, String arg1) {
        class74.method536(arg1, "", 0, 0, (byte) -108, "", "");
        if (arg0 > 40) {
            field3451++;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V")
    public final void method1700(int arg0) {
        field3470++;
        if (this.field3466 == null) {
            this.field3466 = this.field3458;
        }
        if (arg0 != 2) {
            field3450 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IZLig;)V")
    private final void method1701(int arg0, boolean arg1, class244 arg2) {
        if (!arg1) {
            method1698((byte) -31);
        }
        field3454++;
        if (arg0 == 1) {
            this.field3458 = arg2.method1467(9348);
        } else if (arg0 == 2) {
            this.field3466 = arg2.method1467(9348);
        } else if (arg0 == 3) {
            int var22 = arg2.method1423(-61);
            this.field3464 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field3464[var23][0] = arg2.method1476(-92);
                this.field3464[var23][1] = arg2.method1438(121);
                this.field3464[var23][2] = arg2.method1438(98);
            }
        } else if (arg0 == 4) {
            int var4 = arg2.method1423(-122);
            this.field3476 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3476[var5][0] = arg2.method1476(-113);
                this.field3476[var5][1] = arg2.method1438(102);
                this.field3476[var5][2] = arg2.method1438(92);
            }
        } else if (arg0 == 5) {
            arg2.method1476(13);
        } else if (arg0 == 6) {
            arg2.method1423(-9);
        } else if (arg0 == 7) {
            arg2.method1423(-73);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg2.method1423(-65);
                return;
            }
            if (arg0 != 10) {
                if (arg0 == 12) {
                    arg2.method1438(89);
                    return;
                }
                if (arg0 == 13) {
                    int var6 = arg2.method1423(-51);
                    this.field3453 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field3453[var7] = arg2.method1476(-101);
                    }
                    return;
                }
                if (arg0 != 14) {
                    if (arg0 == 15) {
                        arg2.method1476(-106);
                        return;
                    }
                    if (arg0 == 17) {
                        this.field3463 = arg2.method1476(-112);
                        return;
                    }
                    if (arg0 == 18) {
                        int var16 = arg2.method1423(-33);
                        this.field3472 = new int[var16];
                        this.field3467 = new int[var16];
                        this.field3462 = new String[var16];
                        this.field3469 = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field3469[var17] = arg2.method1438(101);
                            this.field3472[var17] = arg2.method1438(117);
                            this.field3467[var17] = arg2.method1438(94);
                            this.field3462[var17] = arg2.method1468(-1468860088);
                        }
                    } else if (arg0 == 19) {
                        int var8 = arg2.method1423(-94);
                        this.field3459 = new int[var8];
                        this.field3452 = new int[var8];
                        this.field3456 = new int[var8];
                        this.field3475 = new String[var8];
                        for (int var9 = 0; var9 < var8; var9++) {
                            this.field3459[var9] = arg2.method1438(118);
                            this.field3452[var9] = arg2.method1438(117);
                            this.field3456[var9] = arg2.method1438(127);
                            this.field3475[var9] = arg2.method1468(-1468860088);
                        }
                        return;
                    } else if (arg0 == 249) {
                        int var10 = arg2.method1423(-34);
                        if (this.field3455 == null) {
                            int var11 = class756.method4202(true, var10);
                            this.field3455 = new class295(var11);
                        }
                        for (int var12 = 0; var12 < var10; var12++) {
                            boolean var13 = arg2.method1423(-124) == 1;
                            int var14 = arg2.method1458((byte) -98);
                            class134 var15;
                            if (var13) {
                                var15 = new class551(arg2.method1468(-1468860088));
                            } else {
                                var15 = new class716(arg2.method1438(112));
                            }
                            this.field3455.method1751(var15, 3970, (long) var14);
                        }
                        return;
                    }
                    return;
                }
                int var18 = arg2.method1423(-86);
                this.field3460 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field3460[var19][0] = arg2.method1423(-118);
                    this.field3460[var19][1] = arg2.method1423(-53);
                }
                return;
            }
            int var20 = arg2.method1423(-33);
            this.field3474 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field3474[var21] = arg2.method1438(89);
            }
            return;
        }
    }
}
