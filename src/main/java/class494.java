import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class494 {

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public int field7341 = 0;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "Luv;")
    public static class2 field7340 = new class2(35, -1);

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "[B")
    public static byte[] field7343 = new byte[520];

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "[Llc;")
    public static class520[] field7346;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "F")
    public static float field7345;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "[I")
    public static int[] field7338;

    static {
        new class347("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field7346 = new class520[14];
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILgo;IB)V", line = 5)
    public static final void method2937(int arg0, class310 arg1, int arg2, byte arg3) {
        if (arg1.field4798 == 0) {
            arg1.field4671 = arg1.field4805;
        } else if (arg1.field4798 == 1) {
            arg1.field4671 = (arg2 - arg1.field4661) / 2 + arg1.field4805;
        } else if (arg1.field4798 == 2) {
            arg1.field4671 = arg2 - arg1.field4661 - arg1.field4805;
        } else if (arg1.field4798 == 3) {
            arg1.field4671 = arg1.field4805 * arg2 >> 14;
        } else if (arg1.field4798 == 4) {
            arg1.field4671 = (arg1.field4805 * arg2 >> 14) + (arg2 - arg1.field4661) / 2;
        } else {
            arg1.field4671 = arg2 - arg1.field4661 - (arg1.field4805 * arg2 >> 14);
        }
        if (arg1.field4734 == 0) {
            arg1.field4644 = arg1.field4646;
        } else if (arg1.field4734 == 1) {
            arg1.field4644 = (arg0 - arg1.field4736) / 2 + arg1.field4646;
        } else if (arg1.field4734 == 2) {
            arg1.field4644 = arg0 - arg1.field4646 - arg1.field4736;
        } else if (arg1.field4734 == 3) {
            arg1.field4644 = arg1.field4646 * arg0 >> 14;
        } else if (arg1.field4734 == 4) {
            arg1.field4644 = (arg0 - arg1.field4736) / 2 + (arg1.field4646 * arg0 >> 14);
        } else {
            arg1.field4644 = arg0 - arg1.field4736 - (arg1.field4646 * arg0 >> 14);
        }
        field7337++;
        if (class418.field6270 && (client.method3039(arg1).field5948 != 0 || arg1.field4703 == 0)) {
            if (arg1.field4644 < 0) {
                arg1.field4644 = 0;
            } else if ((arg1.field4736 + arg1.field4644) > arg0) {
                arg1.field4644 = arg0 - arg1.field4736;
            }
            if (arg1.field4671 < 0) {
                arg1.field4671 = 0;
            } else if ((arg1.field4671 + arg1.field4661) > arg2) {
                arg1.field4671 = arg2 - arg1.field4661;
            }
        }
        if (arg3 < 118) {
            field7343 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILgk;I)V", line = 79)
    private final void method2938(int arg0, class468 arg1, int arg2) {
        if (arg0 == 0) {
            if (arg2 == 5) {
                this.field7341 = arg1.method2727((byte) 43);
            }
            field7344++;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 96)
    public static void method2939(int arg0) {
        field7343 = null;
        field7346 = null;
        field7340 = null;
        field7338 = null;
        if (arg0 >= -77) {
            field7346 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I[[[BIBII)V", line = 114)
    public static final void method2940(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class520.field7642++;
        class147.field2219 = 0;
        for (int var6 = class39.field523; var6 < class349.field5377; var6++) {
            class306[][] var17 = class236.field3305[var6];
            for (int var18 = class18.field283; var18 < class407.field6144; var18++) {
                for (int var19 = class508.field7457; var19 < class520.field7617; var19++) {
                    class306 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class522.field7677[var18 + class489.field7290 - class487.field7256][var19 + class489.field7290 - class301.field4475] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field4590 = true;
                            var20.field4584 = true;
                            if (var20.field4589 == null) {
                                var20.field4575 = false;
                            } else {
                                var20.field4575 = true;
                            }
                            class147.field2219++;
                        } else {
                            var20.field4590 = false;
                            var20.field4584 = false;
                            var20.field4580 = 0;
                            if (var18 >= class487.field7256 - 16 && var18 <= class487.field7256 + 16 && var19 >= class301.field4475 - 16 && var19 <= class301.field4475 + 16 && (var20.field4596 != null || var20.field4582 != null || var20.field4592 != null || var20.field4586 != null || var20.field4577 != null || var20.field4589 != null)) {
                                class159.field2393.method488(-117, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class420.field6281 == class249.field3405;
        for (int var8 = class39.field523; var8 < class349.field5377; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class521.field7669.method112() && var8 >= arg2 && arg1 != null) {
                int var10 = class522.field7677.length;
                if (class522.field7677.length + class18.field283 > class445.field6562) {
                    var10 -= class522.field7677.length + class18.field283 - class445.field6562;
                }
                int var11 = class522.field7677[0].length;
                if (class522.field7677[0].length + class508.field7457 > class167.field2473) {
                    var11 -= class522.field7677[0].length + class508.field7457 - class167.field2473;
                }
                int var12 = class327.field5113;
                while (true) {
                    if (var12 >= var10) {
                        class159.field2393.method490(true, var9, class249.field3405[var8], var8, 125);
                        break;
                    }
                    int var13 = class18.field283 + var12 - class327.field5113;
                    for (int var14 = class332.field5148; var14 < var11; var14++) {
                        class283.field4278[var12][var14] = false;
                        if (class522.field7677[var12][var14]) {
                            int var15 = class508.field7457 + var14 - class332.field5148;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class236.field3305[var16][var13][var15] != null && class236.field3305[var16][var13][var15].field4583 == var8) {
                                    class283.field4278[var12][var14] = class236.field3305[var16][var13][var15].field4590;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class159.field2393.method490(false, var9, class249.field3405[var8], var8, 123);
            }
            class159.field2393.method493(0);
        }
        if (!class364.method2172(true)) {
            class364.method2172(false);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lgk;I)V", line = 251)
    public final void method2941(class468 arg0, int arg1) {
        if (arg1 != 0) {
            method2942(125);
        }
        while (true) {
            int var3 = arg0.method2765(84);
            if (var3 == 0) {
                field7342++;
                return;
            }
            this.method2938(0, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V", line = 272)
    public static final void method2942(int arg0) {
        if (arg0 >= -102) {
            field7338 = null;
        }
        if (class125.method923((byte) -112)) {
            if (class100.field1522 == null) {
                class103.method778(0);
            }
            class496.field7361 = true;
            class214.field3052 = 0;
            try {
                class202.field2946 = class197.field2894.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        field7339++;
    }
}
