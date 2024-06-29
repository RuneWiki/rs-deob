import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class438 {

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public int field6021 = -1;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field6008 = -1;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "Ljk;")
    public static class117 field6019;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "Ltm;")
    private class349 field6025;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "Ljava/lang/String;")
    private String field6014;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "Ljava/lang/String;")
    private String field6023;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "[I")
    private int[] field6007;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "[I")
    private int[] field6009;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "[I")
    private int[] field6010;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "[I")
    private int[] field6013;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "[I")
    private int[] field6015;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "[I")
    private int[] field6017;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "[I")
    private int[] field6018;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "[I")
    private int[] field6026;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "[Ljava/lang/String;")
    private String[] field6020;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field6027;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "[[I")
    private int[][] field6006;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "[[I")
    private int[][] field6012;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "[[I")
    private int[][] field6024;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I")
    public static final int method2675(int arg0, int arg1) {
        field6011++;
        if (arg0 != 1023) {
            field6019 = null;
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lbg;I)V")
    public final void method2676(class242 arg0, int arg1) {
        if (arg1 <= 50) {
            this.method2680((class242) null, -4, false);
        }
        while (true) {
            int var3 = arg0.method1563(-128);
            if (var3 == 0) {
                field6029++;
                return;
            }
            this.method2680(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)I")
    public static final int method2677(int arg0, int arg1) {
        return class134.field1536 == null ? 0 : class134.field1536[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)I")
    public static final int method2678(int arg0, int arg1, int arg2, int arg3) {
        field6030++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (arg3 == 7) {
            return var4 == 2 ? 7 - arg0 : -arg2 + 7;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILaq;ZLuo;)V")
    public static final void method2679(int arg0, int arg1, class453 arg2, boolean arg3, class118 arg4) {
        field6028++;
        class423 var5 = arg2.method2808(arg4, false);
        if (!arg3) {
            field6008 = 86;
        }
        if (var5 == null) {
            return;
        }
        arg4.method774(arg0, arg1, arg0 + arg2.field6377, arg2.field6432 + arg1);
        if (class184.field2133 == 2 || class184.field2133 == 5 || class62.field768 == null) {
            arg4.method704(-16777216, var5, arg0, arg1);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class320.field4294 == 4) {
            var6 = 4096;
            var7 = (int) (-class434.field5929) & 0x3FFF;
            var8 = class225.field2856;
            var9 = class347.field4725;
        } else {
            var6 = 4096 - class280.field3627 * 16;
            var8 = class143.field1684.field1516;
            var9 = class143.field1684.field1514;
            var7 = (int) (-class434.field5929) + class231.field3043 & 0x3FFF;
        }
        int var10 = var8 / 32 + 256 - (class22.field232 * 2);
        int var11 = 48 - ((class196.field2329 - 104) * 2) - (var9 / 32 + -(class196.field2329 * 4));
        class62.field768.method2663((float) arg2.field6377 / 2.0F + (float) arg0, (float) arg2.field6432 / 2.0F + (float) arg1, (float) var10, (float) var11, var6, var7 << 2, var5, arg0, arg1);
        for (class369 var12 = (class369) class23.field245.method1690((byte) -124); var12 != null; var12 = (class369) class23.field245.method1699((byte) 72)) {
            int var50 = var12.field5032;
            int var51 = ((class234.field3075.field5342[var50] & 0xFFFDB4D) >> 14) - class278.field3608;
            int var52 = (class234.field3075.field5342[var50] & 0x3FFF) - class129.field1432;
            int var53 = var51 * 4 + 2 - (var8 / 32);
            int var54 = var52 * 4 + 2 - (var9 / 32);
            class341.method2182(arg0, arg2, arg4, var5, var54, (byte) -62, arg1, class234.field3075.field5338[var50], var53);
        }
        for (int var13 = 0; var13 < class414.field5686; var13++) {
            int var47 = class278.field3597[var13] * 4 + 2 - var8 / 32;
            int var48 = class244.field3248[var13] * 4 + 2 - (var9 / 32);
            class446 var49 = class380.method2361(class439.field6041[var13], -29012);
            if (var49.field6233 != null) {
                var49 = var49.method2759(24964);
                if (var49 == null || var49.field6202 == -1) {
                    continue;
                }
            }
            class341.method2182(arg0, arg2, arg4, var5, var48, (byte) 105, arg1, var49.field6202, var47);
        }
        for (class14 var14 = (class14) class76.field939.method2222(0); var14 != null; var14 = (class14) class76.field939.method2215(false)) {
            int var44 = (int) (var14.field505 >> 28 & 0x3L);
            if (class68.field818 == var44) {
                int var45 = (int) (var14.field505 & 0x3FFFL) * 4 + (2 - var8 / 32);
                int var46 = (int) (var14.field505 >> 14 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                class173.method1090(arg1, true, arg2, arg0, var45, class266.field3432[0], var5, var46);
            }
        }
        for (int var15 = 0; var15 < class106.field1263; var15++) {
            class298 var40 = class220.field2726[class437.field5984[var15]];
            if (var40 != null && var40.method1889((byte) 73)) {
                class307 var41 = var40.field3971;
                if (var41 != null && var41.field4113 != null) {
                    var41 = var41.method1946((byte) 127);
                }
                if (var41 != null && var41.field4147 && var41.field4129) {
                    int var42 = var40.field1516 / 32 - (var8 / 32);
                    int var43 = var40.field1514 / 32 - (var9 / 32);
                    if (var41.field4124 == -1) {
                        class173.method1090(arg1, true, arg2, arg0, var42, class266.field3432[1], var5, var43);
                    } else {
                        class341.method2182(arg0, arg2, arg4, var5, var43, (byte) -106, arg1, var41.field4124, var42);
                    }
                }
            }
        }
        for (int var16 = 0; var16 < class450.field6291; var16++) {
            class131 var32 = class212.field2584[class304.field4083[var16]];
            if (var32 != null && var32.method839((byte) 39)) {
                int var33 = var32.field1516 / 32 - (var8 / 32);
                int var34 = var32.field1514 / 32 - (var9 / 32);
                boolean var35 = false;
                for (int var36 = 0; var36 < class332.field4536; var36++) {
                    if (var32.field1480.equals(class107.field1275[var36]) && class379.field5156[var36] != 0) {
                        var35 = true;
                        break;
                    }
                }
                boolean var37 = false;
                for (int var38 = 0; var38 < class406.field5615; var38++) {
                    if (var32.field1480.equals(class345.field4693[var38].field6066)) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                if (class143.field1684.field1472 != 0 && var32.field1472 != 0 && class143.field1684.field1472 == var32.field1472) {
                    var39 = true;
                }
                if (var35) {
                    class173.method1090(arg1, true, arg2, arg0, var33, class266.field3432[3], var5, var34);
                } else if (var37) {
                    class173.method1090(arg1, true, arg2, arg0, var33, class266.field3432[5], var5, var34);
                } else if (var39) {
                    class173.method1090(arg1, true, arg2, arg0, var33, class266.field3432[4], var5, var34);
                } else {
                    class173.method1090(arg1, true, arg2, arg0, var33, class266.field3432[2], var5, var34);
                }
            }
        }
        class220[] var17 = class307.field4159;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class220 var21 = var17[var18];
            if (var21 != null && var21.field2716 != 0 && class106.field1273 % 20 < 10) {
                if (var21.field2716 == 1 && var21.field2711 >= 0 && class220.field2726.length > var21.field2711) {
                    class298 var22 = class220.field2726[var21.field2711];
                    if (var22 != null) {
                        int var23 = var22.field1516 / 32 - (var8 / 32);
                        int var24 = var22.field1514 / 32 - var9 / 32;
                        class304.method1936(360000, arg1, var21.field2715, arg2, arg0, -43, var23, var5, var24);
                    }
                }
                if (var21.field2716 == 2) {
                    int var25 = (var21.field2721 - class278.field3608) * 4 + 2 - var8 / 32;
                    int var26 = (var21.field2718 - class129.field1432) * 4 + 2 - (var9 / 32);
                    int var27 = var21.field2719 * 4;
                    int var28 = var27 * var27;
                    class304.method1936(var28, arg1, var21.field2715, arg2, arg0, -108, var25, var5, var26);
                }
                if (var21.field2716 == 10 && var21.field2711 >= 0 && var21.field2711 < class212.field2584.length) {
                    class131 var29 = class212.field2584[var21.field2711];
                    if (var29 != null) {
                        int var30 = var29.field1516 / 32 - (var8 / 32);
                        int var31 = var29.field1514 / 32 - (var9 / 32);
                        class304.method1936(360000, arg1, var21.field2715, arg2, arg0, -11, var30, var5, var31);
                    }
                }
            }
        }
        if (class320.field4294 == 4) {
            return;
        }
        if (class90.field1043 != 0) {
            int var19 = class90.field1043 * 4 + class143.field1684.method841(true) * 2 + 2 - (var8 / 32) - 2;
            int var20 = class249.field3276 * 4 + (class143.field1684.method841(true) + -1) * 2 + 2 - (var9 / 32);
            class173.method1090(arg1, true, arg2, arg0, var19, class286.field3766[class319.field4292 ? 1 : 0], var5, var20);
        }
        arg4.method739((byte) 27, -1, arg2.field6377 / 2 + arg0 - 1, 3, arg2.field6432 / 2 + arg1 - 1, 3);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lbg;IZ)V")
    private final void method2680(class242 arg0, int arg1, boolean arg2) {
        field6016++;
        if (arg1 == 1) {
            this.field6023 = arg0.method1571(0);
        } else if (arg1 == 2) {
            this.field6014 = arg0.method1571(0);
        } else if (arg1 == 3) {
            int var4 = arg0.method1563(-128);
            this.field6006 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6006[var5][0] = arg0.method1587((byte) -102);
                this.field6006[var5][1] = arg0.method1576((byte) 123);
                this.field6006[var5][2] = arg0.method1576((byte) 126);
            }
        } else if (arg1 == 4) {
            int var22 = arg0.method1563(-128);
            this.field6024 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field6024[var23][0] = arg0.method1587((byte) -102);
                this.field6024[var23][1] = arg0.method1576((byte) 122);
                this.field6024[var23][2] = arg0.method1576((byte) 122);
            }
        } else if (arg1 == 5) {
            arg0.method1587((byte) -102);
        } else if (arg1 == 6) {
            arg0.method1563(-128);
        } else if (arg1 == 7) {
            arg0.method1563(-128);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method1563(-128);
            } else if (arg1 == 10) {
                int var6 = arg0.method1563(-128);
                this.field6007 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6007[var7] = arg0.method1576((byte) 125);
                }
            } else if (arg1 == 12) {
                arg0.method1576((byte) 124);
            } else if (arg1 == 13) {
                int var8 = arg0.method1563(-128);
                this.field6026 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6026[var9] = arg0.method1587((byte) -102);
                }
            } else if (arg1 == 14) {
                int var20 = arg0.method1563(-128);
                this.field6012 = new int[var20][2];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field6012[var21][0] = arg0.method1563(-128);
                    this.field6012[var21][1] = arg0.method1563(-128);
                }
            } else if (arg1 == 15) {
                arg0.method1587((byte) -102);
            } else if (arg1 == 17) {
                this.field6021 = arg0.method1587((byte) -102);
            } else if (arg1 == 18) {
                int var10 = arg0.method1563(-128);
                this.field6027 = new String[var10];
                this.field6015 = new int[var10];
                this.field6018 = new int[var10];
                this.field6013 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field6018[var11] = arg0.method1576((byte) 127);
                    this.field6015[var11] = arg0.method1576((byte) 124);
                    this.field6013[var11] = arg0.method1576((byte) 126);
                    this.field6027[var11] = arg0.method1565(-113);
                }
            } else if (arg1 == 19) {
                int var12 = arg0.method1563(-128);
                this.field6017 = new int[var12];
                this.field6010 = new int[var12];
                this.field6020 = new String[var12];
                this.field6009 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field6010[var13] = arg0.method1576((byte) 122);
                    this.field6009[var13] = arg0.method1576((byte) 122);
                    this.field6017[var13] = arg0.method1576((byte) 124);
                    this.field6020[var13] = arg0.method1565(-50);
                }
            } else if (arg1 == 249) {
                int var14 = arg0.method1563(-128);
                if (this.field6025 == null) {
                    int var15 = class39.method249(var14, true);
                    this.field6025 = new class349(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg0.method1563(-128) == 1;
                    int var18 = arg0.method1545(8);
                    class43 var19;
                    if (var17) {
                        var19 = new class28(arg0.method1565(-90));
                    } else {
                        var19 = new class369(arg0.method1576((byte) 121));
                    }
                    this.field6025.method2227(var19, -8218, (long) var18);
                }
            }
        }
        if (arg2) {
            this.field6023 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static void method2681(int arg0) {
        field6019 = null;
        if (arg0 != -2745) {
            field6008 = -70;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
    public final void method2682(byte arg0) {
        field6022++;
        if (this.field6014 == null) {
            this.field6014 = this.field6023;
        }
        int var2 = -4 / (-arg0 / 60);
    }

    static {
        new class72("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }
}
