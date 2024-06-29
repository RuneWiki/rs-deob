import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class84 extends class170 {

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "[I")
    private int[] field1172;

    @OriginalMember(owner = "client!mr", name = "J", descriptor = "[I")
    private int[] field1180;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "Lsp;")
    private class424 field1170;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "Lsp;")
    private class424 field1178;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "Lsp;")
    private class424 field1168;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "[Lsp;")
    private class424[] field1167;

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "Z")
    public static boolean field1177;

    @OriginalMember(owner = "client!mr", name = "K", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!mr", name = "I", descriptor = "Lhc;")
    public static class368 field1179;

    @OriginalMember(owner = "client!mr", name = "M", descriptor = "Lhc;")
    public static class368 field1183;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!mr", name = "L", descriptor = "I")
    public static int field1182;

    static {
        new class368("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field1177 = false;
        field1181 = 0;
        field1179 = new class368("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
        new class368("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field1183 = new class368("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZIILgf;DLij;Z)[I", line = 5)
    public final int[] method672(boolean arg0, int arg1, int arg2, class202 arg3, double arg4, class316 arg5, boolean arg6) {
        class81.field1127 = arg5;
        field1173++;
        class232.field3260 = arg3;
        for (int var9 = 0; var9 < this.field1167.length; var9++) {
            this.field1167[var9].method1942(arg2, arg1, 2);
        }
        class31.method287(arg6, arg4);
        class119.method926(arg1, arg2, 209268044);
        int[] var10 = new int[arg1 * arg2 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1178.field5893) {
                int[] var14 = this.field1178.method43(var12, (byte) -10);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1178.method21(var12, true);
                var16 = var18[1];
                var15 = var18[0];
                var17 = var18[2];
            }
            int[] var19;
            if (this.field1168.field5893) {
                var19 = this.field1168.method43(var12, (byte) -10);
            } else {
                var19 = this.field1168.method21(var12, true)[0];
            }
            if (arg0) {
                var11 = var12;
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class183.field2569[var22];
                int var25 = class183.field2569[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class183.field2569[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var24 << 8) + var26 + (var25 << 16) + (var27 << 24);
                if (arg0) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1167.length; var13++) {
            this.field1167[var13].method1940((byte) 105);
        }
        return var10;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BJ)V", line = 139)
    public static final void method673(byte arg0, long arg1) {
        if (arg0 > -122) {
            return;
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field1174++;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lij;DLgf;ZIIZI)[I", line = 153)
    public final int[] method674(class316 arg0, double arg1, class202 arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7) {
        class232.field3260 = arg2;
        class81.field1127 = arg0;
        field1182++;
        if (arg7 != -30651) {
            return null;
        }
        for (int var10 = 0; var10 < this.field1167.length; var10++) {
            this.field1167[var10].method1942(arg5, arg4, 2);
        }
        class31.method287(true, arg1);
        class119.method926(arg4, arg5, 209268044);
        int[] var11 = new int[arg4 * arg5];
        byte var12;
        int var13;
        int var14;
        if (arg3) {
            var12 = -1;
            var13 = arg5 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = 1;
            var14 = arg5;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1178.field5893) {
                int[] var18 = this.field1178.method43(var16, (byte) -10);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1178.method21(var16, true);
                var21 = var22[1];
                var19 = var22[2];
                var20 = var22[0];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class183.field2569[var24];
                int var28 = class183.field2569[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class183.field2569[var26];
                int var30 = (var27 << 16) + var29 + (var28 << 8);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1167.length; var17++) {
            this.field1167[var17].method1940((byte) 30);
        }
        return var11;
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)V", line = 294)
    public static void method675(byte arg0) {
        field1179 = null;
        if (arg0 != -115) {
            method673((byte) -104, 74L);
        }
        field1183 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lij;IIBZLgf;)[F", line = 315)
    public final float[] method676(class316 arg0, int arg1, int arg2, byte arg3, boolean arg4, class202 arg5) {
        class81.field1127 = arg0;
        class232.field3260 = arg5;
        field1176++;
        for (int var7 = 0; var7 < this.field1167.length; var7++) {
            this.field1167[var7].method1942(arg1, arg2, 2);
        }
        class119.method926(arg2, arg1, 209268044);
        float[] var8 = new float[arg1 * arg2 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1178.field5893) {
                int[] var12 = this.field1178.method43(var10, (byte) -10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field1178.method21(var10, true);
                var15 = var16[1];
                var14 = var16[0];
                var13 = var16[2];
            }
            int[] var17;
            if (this.field1168.field5893) {
                var17 = this.field1168.method43(var10, (byte) -10);
            } else {
                var17 = this.field1168.method21(var10, true)[0];
            }
            int[] var18;
            if (this.field1170.field5893) {
                var18 = this.field1170.method43(var10, (byte) -10);
            } else {
                var18 = this.field1170.method21(var10, true)[0];
            }
            if (arg4) {
                var9 = var10 << 2;
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg4) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        if (arg3 <= 58) {
            this.method677((class316) null, (class202) null, -67);
        }
        for (int var11 = 0; var11 < this.field1167.length; var11++) {
            this.field1167[var11].method1940((byte) 81);
        }
        return var8;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lij;Lgf;I)Z", line = 428)
    public final boolean method677(class316 arg0, class202 arg1, int arg2) {
        field1175++;
        if (class446.field6257 <= 0) {
            for (int var4 = 0; var4 < this.field1172.length; var4++) {
                if (!arg0.method1930((byte) -116, this.field1172[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1172.length; var5++) {
                if (!arg0.method1906(-1, this.field1172[var5], class446.field6257)) {
                    return false;
                }
            }
        }
        for (int var6 = arg2; var6 < this.field1180.length; var6++) {
            if (!arg1.method1360((byte) -106, this.field1180[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)V", line = 495)
    public static final void method678(int arg0) {
        field1169++;
        int var1 = class41.field536 * 128 + 64;
        int var2 = class447.field6263 * 128 + 64;
        int var3 = class50.method408(class343.field4623, var1, var2, 16) - class419.field5801;
        if (class336.field4545 >= 100) {
            class63.field874 = class41.field536 * 128 + 64;
            class375.field5213 = class447.field6263 * 128 + 64;
            class104.field1433 = class50.method408(class343.field4623, class63.field874, class375.field5213, arg0 + 16) - class419.field5801;
        } else {
            if (var1 > class63.field874) {
                class63.field874 += class155.field2213 + ((var1 - class63.field874) * class336.field4545 / 1000);
                if (class63.field874 > var1) {
                    class63.field874 = var1;
                }
            }
            if (var1 < class63.field874) {
                class63.field874 -= (class63.field874 - var1) * class336.field4545 / 1000 + class155.field2213;
                if (var1 > class63.field874) {
                    class63.field874 = var1;
                }
            }
            if (var3 > class104.field1433) {
                class104.field1433 += (var3 - class104.field1433) * class336.field4545 / 1000 + class155.field2213;
                if (var3 < class104.field1433) {
                    class104.field1433 = var3;
                }
            }
            if (class104.field1433 > var3) {
                class104.field1433 -= class155.field2213 + ((class104.field1433 - var3) * class336.field4545 / 1000);
                if (class104.field1433 < var3) {
                    class104.field1433 = var3;
                }
            }
            if (var2 > class375.field5213) {
                class375.field5213 += (var2 - class375.field5213) * class336.field4545 / 1000 + class155.field2213;
                if (var2 < class375.field5213) {
                    class375.field5213 = var2;
                }
            }
            if (var2 < class375.field5213) {
                class375.field5213 -= (class375.field5213 - var2) * class336.field4545 / 1000 + class155.field2213;
                if (var2 > class375.field5213) {
                    class375.field5213 = var2;
                }
            }
        }
        int var4 = class313.field4250 * 128 + 64;
        int var5 = class106.field1499 * 128 + 64;
        int var6 = class50.method408(class343.field4623, var4, var5, 16) - class441.field6197;
        int var7 = var4 - class63.field874;
        int var8 = var6 - class104.field1433;
        int var9 = var5 - class375.field5213;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class389.field5410 < var11) {
            class389.field5410 += class46.field590 + ((var11 - class389.field5410 >> 3) * class284.field3865 / 1000) << 3;
            if (class389.field5410 > var11) {
                class389.field5410 = var11;
            }
        }
        if (class389.field5410 > var11) {
            class389.field5410 -= (class389.field5410 - var11 >> 3) * class284.field3865 / 1000 + class46.field590 << 3;
            if (var11 > class389.field5410) {
                class389.field5410 = var11;
            }
        }
        int var13 = var12 - class86.field1208;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class86.field1208 += class46.field590 + (class284.field3865 * var14 / 1000) << 3;
            class86.field1208 &= 0x3FFF;
        }
        if (var14 < 0) {
            class86.field1208 -= -var14 * class284.field3865 / 1000 + class46.field590 << 3;
            class86.field1208 &= 0x3FFF;
        }
        int var15 = var12 - class86.field1208;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class86.field1208 = var12;
        }
        class103.field1426 = arg0;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V", line = 646)
    public class84() {
        this.field1172 = new int[0];
        this.field1180 = new int[0];
        this.field1170 = new class372(0);
        this.field1170.field5907 = 1;
        this.field1178 = new class372();
        this.field1178.field5907 = 1;
        this.field1168 = new class372();
        this.field1168.field5907 = 1;
        this.field1167 = new class424[] { this.field1178, this.field1168, this.field1170 };
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lrg;)V", line = 666)
    public class84(class366 arg0) {
        int var2 = arg0.method2306((byte) 104);
        int var3 = 0;
        int var4 = 0;
        this.field1167 = new class424[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class424 var16 = class78.method636(87, arg0);
            if (var16.method2622(-8793) >= 0) {
                var3++;
            }
            if (var16.method1941(-32563) >= 0) {
                var4++;
            }
            int var17 = var16.field5899.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2306((byte) 114);
            }
            this.field1167[var6] = var16;
        }
        this.field1172 = new int[var3];
        int var7 = 0;
        this.field1180 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class424 var11 = this.field1167[var9];
            int var12 = var11.field5899.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5899[var13] = this.field1167[var5[var9][var13]];
            }
            int var14 = var11.method2622(-8793);
            int var15 = var11.method1941(-32563);
            if (var14 > 0) {
                this.field1172[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1180[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1178 = this.field1167[arg0.method2306((byte) 23)];
        this.field1168 = this.field1167[arg0.method2306((byte) 37)];
        this.field1170 = this.field1167[arg0.method2306((byte) 61)];
        Object var10 = null;
    }
}
