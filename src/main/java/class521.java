import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class521 {

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public int field7530 = -1;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "[[I")
    public static int[][] field7546;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "[I")
    public static int[] field7548;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Lek;")
    private class352 field7531;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Lqj;")
    public static class354 field7538;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Ljava/lang/String;")
    private String field7524;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Ljava/lang/String;")
    private String field7528;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "[I")
    private int[] field7523;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "[I")
    private int[] field7525;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "[I")
    private int[] field7532;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "[I")
    private int[] field7534;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "[I")
    private int[] field7539;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "[I")
    private int[] field7542;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "[I")
    private int[] field7543;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "[I")
    private int[] field7544;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field7537;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field7547;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[[I")
    private int[][] field7521;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "[[I")
    private int[][] field7526;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "[[I")
    private int[][] field7541;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZI)I")
    public static final int method3093(int arg0, boolean arg1, int arg2) {
        field7545++;
        int var3 = class405.method2400((byte) 64, arg2 - 1, arg0 - 1) + class405.method2400((byte) 64, arg2 - 1, arg0 + 1) + (class405.method2400((byte) 64, arg2 + 1, arg0 + -1) - -class405.method2400((byte) 64, arg2 + 1, arg0 + 1));
        if (arg1) {
            method3094(-79, null, 59, 123);
        }
        int var4 = class405.method2400((byte) 64, arg2, arg0 - 1) + (class405.method2400((byte) 64, arg2, arg0 + 1) + class405.method2400((byte) 64, arg2 - 1, arg0)) + class405.method2400((byte) 64, arg2 - -1, arg0);
        int var5 = class405.method2400((byte) 64, arg2, arg0);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILhd;II)V")
    public static final void method3094(int arg0, class523 arg1, int arg2, int arg3) {
        if (class211.field2717) {
            class172 var9 = class496.field7211 == -1 ? null : class199.field2592.method2579((byte) -89, class496.field7211);
            if (client.method1226(arg1).method641(614752694) && (class92.field1125 & 0x20) != 0 && (var9 == null || arg1.method3123(class496.field7211, var9.field2188, arg0 - 14) != var9.field2188)) {
                class8.method45(22461, 0L, arg1.field7567, arg1.field7723, arg1.field7562, class468.field6768, class446.field6389 + " -> " + arg1.field7592, 58, false, class516.field7480, true);
                class468.field6763++;
            }
        } else {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class20.method171(arg1, var4, -1);
                if (var8 != null) {
                    class178.field2356++;
                    class8.method45(22461, (long) (var4 + 1), arg1.field7567, arg1.field7723, arg1.field7562, class56.method530(var4, arg1, -35), arg1.field7592, 1012, false, var8, true);
                }
            }
            String var5 = class403.method2386(arg1, (byte) 84);
            if (var5 != null) {
                class8.method45(22461, 0L, arg1.field7567, arg1.field7723, arg1.field7562, arg1.field7594, arg1.field7592, 12, false, var5, true);
                class354.field4553++;
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class20.method171(arg1, var6, arg0 - 13);
                if (var7 != null) {
                    class178.field2356++;
                    class8.method45(22461, (long) (var6 + 1), arg1.field7567, arg1.field7723, arg1.field7562, class56.method530(var6, arg1, -101), arg1.field7592, 47, false, var7, true);
                }
            }
            if (client.method1226(arg1).method643(29597)) {
                if (arg1.field7729 == null) {
                    class8.method45(22461, 0L, arg1.field7567, arg1.field7723, arg1.field7562, -1, "", 4, false, class511.field7382.method1936(-26539, class11.field177), true);
                } else {
                    class8.method45(22461, 0L, arg1.field7567, arg1.field7723, arg1.field7562, -1, "", 4, false, arg1.field7729, true);
                }
                class153.field1936++;
            }
        }
        if (arg0 == 12) {
            field7535++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static final void method3095(byte arg0) {
        field7533++;
        if (arg0 != 55 || class162.field2059) {
            return;
        }
        if (class407.field5817.field3615) {
            class49.field629 = ((int) class49.field629 - 17 & 0xFFFFFFF0);
        } else {
            class59.field773 += (-12.0F - class59.field773) / 2.0F;
        }
        class469.field6792 = true;
        class162.field2059 = true;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLfh;)V")
    public final void method3096(byte arg0, class463 arg1) {
        field7527++;
        if (arg0 != -65) {
            return;
        }
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                return;
            }
            this.method3097(25133, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILfh;I)V")
    private final void method3097(int arg0, class463 arg1, int arg2) {
        if (arg2 == 1) {
            this.field7524 = arg1.method2745(true);
        } else if (arg2 == 2) {
            this.field7528 = arg1.method2745(true);
        } else if (arg2 == 3) {
            int var22 = arg1.method2737(false);
            this.field7521 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field7521[var23][0] = arg1.method2758((byte) 88);
                this.field7521[var23][1] = arg1.method2727(-77);
                this.field7521[var23][2] = arg1.method2727(-124);
            }
        } else if (arg2 == 4) {
            int var4 = arg1.method2737(false);
            this.field7541 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7541[var5][0] = arg1.method2758((byte) 93);
                this.field7541[var5][1] = arg1.method2727(-79);
                this.field7541[var5][2] = arg1.method2727(-83);
            }
        } else if (arg2 == 5) {
            arg1.method2758((byte) 99);
        } else if (arg2 == 6) {
            arg1.method2737(false);
        } else if (arg2 == 7) {
            arg1.method2737(false);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method2737(false);
            } else if (arg2 == 10) {
                int var6 = arg1.method2737(false);
                this.field7543 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field7543[var7] = arg1.method2727(class489.method2968(arg0, -25160));
                }
            } else if (arg2 == 12) {
                arg1.method2727(-95);
            } else if (arg2 == 13) {
                int var20 = arg1.method2737(false);
                this.field7534 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field7534[var21] = arg1.method2758((byte) 107);
                }
            } else if (arg2 == 14) {
                int var18 = arg1.method2737(false);
                this.field7526 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field7526[var19][0] = arg1.method2737(false);
                    this.field7526[var19][1] = arg1.method2737(false);
                }
            } else if (arg2 == 15) {
                arg1.method2758((byte) 80);
            } else if (arg2 == 17) {
                this.field7530 = arg1.method2758((byte) 105);
            } else if (arg2 == 18) {
                int var16 = arg1.method2737(false);
                this.field7537 = new String[var16];
                this.field7525 = new int[var16];
                this.field7539 = new int[var16];
                this.field7544 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field7539[var17] = arg1.method2727(-103);
                    this.field7544[var17] = arg1.method2727(class489.method2968(arg0, -25173));
                    this.field7525[var17] = arg1.method2727(arg0 - 25251);
                    this.field7537[var17] = arg1.method2768((byte) -119);
                }
            } else if (arg2 == 19) {
                int var14 = arg1.method2737(false);
                this.field7542 = new int[var14];
                this.field7547 = new String[var14];
                this.field7532 = new int[var14];
                this.field7523 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field7523[var15] = arg1.method2727(class489.method2968(arg0, -25215));
                    this.field7532[var15] = arg1.method2727(-94);
                    this.field7542[var15] = arg1.method2727(arg0 - 25241);
                    this.field7547[var15] = arg1.method2768((byte) -71);
                }
            } else if (arg2 == 249) {
                int var8 = arg1.method2737(false);
                if (this.field7531 == null) {
                    int var9 = class60.method550(119, var8);
                    this.field7531 = new class352(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg1.method2737(false) == 1;
                    int var12 = arg1.method2738(-93);
                    class383 var13;
                    if (var11) {
                        var13 = new class441(arg1.method2768((byte) -69));
                    } else {
                        var13 = new class101(arg1.method2727(-112));
                    }
                    this.field7531.method2019((byte) -128, var13, (long) var12);
                }
            }
        }
        if (arg0 != 25133) {
            method3100(false);
        }
        field7536++;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
    public final void method3098(byte arg0) {
        field7522++;
        if (arg0 < 118) {
            method3095((byte) -75);
        }
        if (this.field7528 == null) {
            this.field7528 = this.field7524;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3099(String arg0, int arg1) {
        field7540++;
        if (arg1 <= 17) {
            method3100(false);
        }
        return class410.method2433(arg0, true, 5565, 10);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public static void method3100(boolean arg0) {
        field7538 = null;
        field7548 = null;
        field7546 = null;
        if (!arg0) {
            field7538 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZI)V")
    public static final void method3101(int arg0, int arg1, boolean arg2, int arg3) {
        field7529++;
        if (!arg2) {
            String var4 = "tele " + arg0 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (arg3 & 0x3F) + "," + (arg1 & 0x3F);
            System.out.println(var4);
            class211.method1307(-31081, var4, true);
        }
    }

    static {
        new class335("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field7546 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
        field7548 = new int[14];
    }
}
