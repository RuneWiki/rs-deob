import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class353 extends class383 {

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "[B")
    public byte[] field4536;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "[S")
    public short[] field4529;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "[Ljc;")
    public class305[] field4539;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "[I")
    private int[] field4538;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "[Lkd;")
    public class186[] field4533;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "[B")
    public byte[] field4537;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "[B")
    public byte[] field4531;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "Lap;")
    public static class335 field4532 = new class335("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "Ldq;")
    public static class493 field4540;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "Lkg;")
    public static class179 field4543;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lbe;")
    public static final class29 method2026(int arg0, int arg1) {
        field4535++;
        class29[] var2 = class195.method1208(-4);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class29 var4 = var2[var3];
            if (var4.field397 == arg1) {
                return var4;
            }
        }
        return arg0 <= 2 ? null : null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([I[BBLjj;)Z")
    public final boolean method2027(int[] arg0, byte[] arg1, byte arg2, class76 arg3) {
        field4528++;
        boolean var5 = true;
        int var6 = 0;
        if (arg2 <= 83) {
            method2026(56, 76);
        }
        class305 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field4538[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method666(2, arg0, var9 >> 2);
                        } else {
                            var7 = arg3.method662(arg0, var9 >> 2, (byte) 68);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4539[var8] = var7;
                        this.field4538[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)V")
    public final void method2028(boolean arg0) {
        field4534++;
        this.field4538 = null;
        if (!arg0) {
            this.field4536 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public static void method2029(int arg0) {
        field4543 = null;
        field4540 = null;
        field4532 = null;
        if (arg0 != 12887) {
            field4541 = 90;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
    public class353() {
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "([B)V")
    public class353(byte[] arg0) {
        this.field4536 = new byte[128];
        this.field4529 = new short[128];
        this.field4539 = new class305[128];
        this.field4538 = new int[128];
        this.field4533 = new class186[128];
        this.field4537 = new byte[128];
        this.field4531 = new byte[128];
        class463 var2 = new class463(arg0);
        int var3;
        for (var3 = 0; var2.field6618[var2.field6631 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2793(32767);
        }
        var2.field6631++;
        var3++;
        int var6 = var2.field6631;
        var2.field6631 += var3;
        int var7;
        for (var7 = 0; var2.field6618[var2.field6631 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2793(32767);
        }
        var7++;
        var2.field6631++;
        int var10 = var2.field6631;
        var2.field6631 += var7;
        int var11;
        for (var11 = 0; var2.field6618[var2.field6631 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2793(32767);
        }
        var2.field6631++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method2737(false);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class186[] var18 = new class186[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class186 var102 = var18[var19] = new class186();
            int var103 = var2.method2737(false);
            if (var103 > 0) {
                var102.field2432 = new byte[var103 * 2];
            }
            int var104 = var2.method2737(false);
            if (var104 > 0) {
                var102.field2433 = new byte[var104 * 2 + 2];
                var102.field2433[1] = 64;
            }
        }
        int var20 = var2.method2737(false);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method2737(false);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field6618[var2.field6631 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2793(32767);
        }
        var24++;
        var2.field6631++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2737(false);
            this.field4529[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2737(false);
            this.field4529[var30] = (short) (this.field4529[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method2730(10637);
            }
            this.field4529[var34] = (short) (this.field4529[var34] + class378.method2145(32768, var33 - 1 << 14));
            var31--;
            this.field4538[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field4538[var38] != 0) {
                if (var36 == 0) {
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var2.field6618[var6++] - 1;
                }
                this.field4536[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4538[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field6618[var10++] + 16 << 2;
                    if (var40 >= var8.length) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                }
                var39--;
                this.field4537[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class186 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4538[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field4533[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length <= var47) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field4538[var50] > 0) {
                    var49 = var2.method2737(false) + 1;
                }
            }
            var48--;
            this.field4531[var50] = (byte) var49;
        }
        this.field4530 = var2.method2737(false) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class186 var99 = var18[var51];
            if (var99.field2432 != null) {
                for (int var100 = 1; var100 < var99.field2432.length; var100 += 2) {
                    var99.field2432[var100] = var2.method2793(32767);
                }
            }
            if (var99.field2433 != null) {
                for (int var101 = 3; var101 < var99.field2433.length - 2; var101 += 2) {
                    var99.field2433[var101] = var2.method2793(32767);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2793(32767);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2793(32767);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class186 var96 = var18[var54];
            if (var96.field2433 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2433.length; var98 += 2) {
                    var97 = (var97 + var2.method2737(false)) + 1;
                    var96.field2433[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class186 var93 = var18[var55];
            if (var93.field2432 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2432.length; var95 += 2) {
                    var94 = var94 + var2.method2737(false) + 1;
                    var93.field2432[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2737(false);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method2737(false) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field4531[var60] = (byte) (this.field4531[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class443.method2619(var64 - var58, (byte) -25, var66);
                    var66 += var65 - var59;
                    this.field4531[var67] = (byte) (this.field4531[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var61 += 2;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field4531[var62] = (byte) (this.field4531[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method2737(false);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method2737(false) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field4537[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field4537[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class443.method2619(var78 - var71, (byte) -110, var80);
                    int var83 = (this.field4537[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field4537[var81] = (byte) var83;
                }
                var72 = var79;
                var74 += 2;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field4537[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field4537[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2425 = var2.method2737(false);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class186 var92 = var18[var86];
            if (var92.field2432 != null) {
                var92.field2436 = var2.method2737(false);
            }
            if (var92.field2433 != null) {
                var92.field2435 = var2.method2737(false);
            }
            if (var92.field2425 > 0) {
                var92.field2424 = var2.method2737(false);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2430 = var2.method2737(false);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class186 var91 = var18[var88];
            if (var91.field2430 > 0) {
                var91.field2437 = var2.method2737(false);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class186 var90 = var18[var89];
            if (var90.field2437 > 0) {
                var90.field2439 = var2.method2737(false);
            }
        }
    }

    static {
        new class335("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field4540 = new class493(38, 0);
        field4541 = 0;
        field4542 = 0;
        field4543 = new class179(25, -1);
    }
}
