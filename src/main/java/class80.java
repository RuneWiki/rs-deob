import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class80 extends class108 {

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lww;")
    private class592 field1067;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lnk;")
    private class376 field1073;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Luq;")
    private class313 field1070;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "[[F")
    private float[][] field1081;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "[[F")
    private float[][] field1075;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "[[F")
    private float[][] field1076;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "Lcd;")
    private class86 field1084;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Lee;")
    private class159 field1071;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "Lnu;")
    private class326 field1082;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lcd;")
    private class86 field1072;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "Lge;")
    private class551 field1092;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "Law;")
    private class616 field1085;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lba;")
    private class607 field1069;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field1077;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "[Lha;")
    public static class116[] field1078;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method450(boolean arg0) {
        field1078 = null;
        if (arg0) {
            method454(38, null, -108);
        }
        field1077 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IS)V")
    private final void method451(int arg0, short arg1) {
        if (this.field1070.field4291) {
            this.field1092.method3042(arg1, 113);
        } else {
            this.field1092.method3094(true, arg1);
        }
        field1074++;
        this.field1090++;
        if (arg0 >= -103) {
            this.field1073 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIBIII)V")
    private final void method452(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1066++;
        long var8 = -1L;
        int var10 = (arg5 << this.field1073.field7583) + arg2;
        int var11 = (arg6 << this.field1073.field7583) + arg4;
        int var12 = this.field1073.method1040(var10, var11);
        if ((arg2 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class108 var13 = this.field1069.method3476(var8, (byte) 28);
            if (var13 != null) {
                this.method451(-126, ((class149) var13).field1928);
                return;
            }
        }
        short var14 = (short) (this.field1083++);
        if (var8 != -1L) {
            this.field1069.method3475(arg3 ^ 0xFFFFFF84, new class149(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg4 == 0) {
            var15 = this.field1075[arg1][arg0];
            var16 = this.field1076[arg1][arg0];
            var17 = this.field1081[arg1][arg0];
        } else if (this.field1073.field7582 == arg2 && arg4 == 0) {
            var17 = this.field1081[arg1 + 1][arg0];
            var15 = this.field1075[arg1 + 1][arg0];
            var16 = this.field1076[arg1 + 1][arg0];
        } else if (this.field1073.field7582 == arg2 && this.field1073.field7582 == arg4) {
            var15 = this.field1075[arg1 + 1][arg0 + 1];
            var16 = this.field1076[arg1 + 1][arg0 + 1];
            var17 = this.field1081[arg1 + 1][arg0 + 1];
        } else if (arg2 == 0 && this.field1073.field7582 == arg4) {
            var15 = this.field1075[arg1][arg0 + 1];
            var17 = this.field1081[arg1][arg0 + 1];
            var16 = this.field1076[arg1][arg0 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field1073.field7582;
            float var19 = (float) arg4 / (float) this.field1073.field7582;
            float var20 = this.field1076[arg1][arg0];
            float var21 = this.field1081[arg1][arg0];
            float var22 = this.field1075[arg1][arg0];
            float var23 = this.field1076[arg1 + 1][arg0];
            float var24 = this.field1081[arg1 + 1][arg0];
            float var25 = (this.field1081[arg1 + 1][arg0 + 1] - var24) * var18 + var24;
            float var26 = this.field1075[arg1 + 1][arg0];
            float var27 = (this.field1075[arg1][arg0 + 1] - var22) * var18 + var22;
            float var28 = (this.field1081[arg1][arg0 + 1] - var21) * var18 + var21;
            float var29 = (this.field1076[arg1 + 1][arg0 + 1] - var23) * var18 + var23;
            float var30 = (this.field1076[arg1][arg0 + 1] - var20) * var18 + var20;
            float var31 = (this.field1075[arg1 + 1][arg0 + 1] - var26) * var18 + var26;
            var16 = (var29 - var30) * var19 + var30;
            var17 = (var25 - var28) * var19 + var28;
            var15 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field1067.method3414(232) - var10);
        float var33 = (float) (this.field1067.method3416(-2) - var12);
        float var34 = (float) (this.field1067.method3415((byte) 117) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field1067.method3420(true);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        if (arg3 != 32) {
            field1087 = -55;
        }
        int var44 = this.field1067.method3419(101);
        int var45 = (int) ((float) ((var44 & 0xFFFAB7) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF77) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field1070.field4291) {
            this.field1085.method3531(1448476952, (float) var10);
            this.field1085.method3531(1448476952, (float) var12);
            this.field1085.method3531(1448476952, (float) var11);
        } else {
            this.field1085.method3529((float) var10, -92);
            this.field1085.method3529((float) var12, -72);
            this.field1085.method3529((float) var11, -69);
        }
        this.field1085.method3060(var45, -25098);
        this.field1085.method3060(var46, -25098);
        this.field1085.method3060(var47, arg3 ^ 0xFFFF9DD6);
        this.field1085.method3060(255, -25098);
        this.method451(-105, var14);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII[[Z)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field1080++;
        if (this.field1082 == null || arg0 < 29 || arg1 + arg3 < this.field1088 || arg1 - arg3 > this.field1068 || this.field1065 > (arg2 + arg3) || arg2 - arg3 > this.field1064) {
            return;
        }
        for (int var6 = this.field1065; var6 <= this.field1064; var6++) {
            for (int var7 = this.field1088; var7 <= this.field1068; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg2;
                if (var8 > (-arg3) && arg3 > var8 && var9 > (-arg3) && arg3 > var9 && arg4[arg3 + var8][arg3 + var9]) {
                    this.field1070.method1885((int) (this.field1067.method3422(75) * 255.0F) << 24, -44);
                    this.field1070.method1924(null, 0, this.field1072, null, this.field1084);
                    this.field1070.method1923(this.field1090, 97, 4, this.field1082, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILge;I)V")
    public static final void method454(int arg0, class551 arg1, int arg2) {
        if (class254.field3161 != null) {
            try {
                class254.field3161.method3685(arg0 ^ 0x62F8, 0L);
                class254.field3161.method3694((byte) 125, arg1.field7693, arg2, 24);
            } catch (Exception var3) {
            }
        }
        if (arg0 != 26440) {
            method454(-102, null, -18);
        }
        field1089++;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Luq;Lnk;Lww;[I)V")
    public class80(class313 arg0, class376 arg1, class592 arg2, int[] arg3) {
        this.field1067 = arg2;
        this.field1073 = arg1;
        this.field1070 = arg0;
        int var5 = this.field1067.method3420(true) - (arg1.field7582 >> 1);
        this.field1088 = this.field1067.method3414(232) - var5 >> arg1.field7583;
        this.field1068 = this.field1067.method3414(232) + var5 >> arg1.field7583;
        this.field1065 = this.field1067.method3415((byte) 117) - var5 >> arg1.field7583;
        this.field1064 = this.field1067.method3415((byte) 117) + var5 >> arg1.field7583;
        int var6 = this.field1068 + 1 - this.field1088;
        int var7 = this.field1064 - (this.field1065 - 1);
        this.field1081 = new float[var6 + 1][var7 + 1];
        this.field1075 = new float[var6 + 1][var7 + 1];
        this.field1076 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field1065 + var8;
            if (var24 > 0 && (this.field1073.field7585 - 1) > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field1088 + var25;
                    if (var26 > 0 && this.field1073.field7581 - 1 > var26) {
                        int var27 = arg1.method1031(var26 + 1, var24) - arg1.method1031(var26 - 1, var24);
                        int var28 = arg1.method1031(var26, var24 + 1) - arg1.method1031(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var27 * var27 + 65536)));
                        this.field1076[var25][var8] = (float) var27 * var29;
                        this.field1081[var25][var8] = var29 * -256.0F;
                        this.field1075[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field1065; var11 <= this.field1064; var11++) {
            if (var11 >= 0 && arg1.field7585 > var11) {
                for (int var21 = this.field1088; var21 <= this.field1068; var21++) {
                    if (var21 >= 0 && arg1.field7581 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field5235[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field1068 - this.field1088;
            }
        }
        if (var9 <= 0) {
            this.field1084 = null;
            this.field1071 = null;
            this.field1082 = null;
            this.field1072 = null;
        } else {
            this.field1092 = new class551(var9 * 2);
            this.field1085 = new class616(var9 * 16);
            this.field1069 = new class607(class468.method2685(var9, false));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field1065; var14 <= this.field1064; var14++) {
                if (var14 >= 0 && arg1.field7585 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field1088; var16 <= this.field1068; var16++) {
                        if (var16 >= 0 && var16 < arg1.field7581) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field5235[var16][var14];
                            int[] var19 = arg1.field5257[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method452(var12, var15, var18[var20], (byte) 32, var19[var20], var16, var14);
                                    }
                                } else if (var17 == 3) {
                                    this.method452(var12, var15, 0, (byte) 32, 0, var16, var14);
                                    this.method452(var12, var15, arg1.field7582, (byte) 32, 0, var16, var14);
                                    this.method452(var12, var15, 0, (byte) 32, arg1.field7582, var16, var14);
                                } else if (var17 == 2) {
                                    this.method452(var12, var15, arg1.field7582, (byte) 32, 0, var16, var14);
                                    this.method452(var12, var15, arg1.field7582, (byte) 32, arg1.field7582, var16, var14);
                                    this.method452(var12, var15, 0, (byte) 32, 0, var16, var14);
                                } else if (var17 == 5) {
                                    this.method452(var12, var15, arg1.field7582, (byte) 32, arg1.field7582, var16, var14);
                                    this.method452(var12, var15, 0, (byte) 32, arg1.field7582, var16, var14);
                                    this.method452(var12, var15, arg1.field7582, (byte) 32, 0, var16, var14);
                                } else if (var17 == 4) {
                                    this.method452(var12, var15, 0, (byte) 32, arg1.field7582, var16, var14);
                                    this.method452(var12, var15, 0, (byte) 32, 0, var16, var14);
                                    this.method452(var12, var15, arg1.field7582, (byte) 32, arg1.field7582, var16, var14);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field1068 - this.field1088;
                }
                var12++;
            }
            this.field1082 = this.field1070.method1935(false, this.field1092.field7693, this.field1092.field7707, false, 5123);
            this.field1071 = this.field1070.method1926(8771, this.field1085.field7693, 16, false, this.field1085.field7707);
            this.field1072 = new class86(this.field1071, 5126, 3, 0);
            this.field1084 = new class86(this.field1071, 5121, 4, 12);
        }
        this.field1069 = null;
        this.field1085 = null;
        this.field1092 = null;
        this.field1076 = this.field1081 = this.field1075 = null;
    }

    static {
        new class344("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field1077 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        field1086 = 0;
        field1087 = 0;
    }
}
