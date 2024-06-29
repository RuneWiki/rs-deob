import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class106 {

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public int field1278 = -1;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Lva;")
    private class288 field1282;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Ltq;")
    public static class376 field1286;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Ljava/lang/String;")
    private String field1277;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Ljava/lang/String;")
    private String field1287;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
    private int[] field1267;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
    private int[] field1270;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[I")
    private int[] field1271;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[I")
    private int[] field1273;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
    private int[] field1276;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
    private int[] field1280;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[I")
    private int[] field1283;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "[I")
    private int[] field1284;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[Ljava/lang/String;")
    private String[] field1272;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field1288;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[[I")
    private int[][] field1275;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "[[I")
    private int[][] field1281;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "[[I")
    private int[][] field1289;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILdg;)V")
    public final void method581(int arg0, class236 arg1) {
        while (true) {
            int var3 = arg1.method1574(-50);
            if (var3 == 0) {
                if (arg0 != 25733) {
                    return;
                }
                field1269++;
                return;
            }
            this.method587(18927, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method582(byte arg0) {
        if (arg0 > -61) {
            field1266 = -2;
        }
        field1286 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILul;Lae;II)V")
    public static final void method583(int arg0, int arg1, int arg2, class343 arg3, class134 arg4, int arg5, int arg6) {
        field1264++;
        if (class310.field4383 < 100) {
            class102.method571(arg4, arg3, 106);
        }
        arg4.method660(arg1, arg0, arg1 + arg6, arg0 + arg2);
        if (class310.field4383 < 100) {
            byte var7 = 20;
            int var8 = arg1 + (arg6 / 2);
            int var9 = arg2 / 2 + arg0 - var7 - 18;
            arg4.method653(arg1, arg0, arg6, arg2, -16777216, 0);
            arg4.method594(var8 - 152, var9, 304, 34, class99.field1201[class176.field2397].getRGB(), 0);
            arg4.method653(var8 - 150, var9 + 2, class310.field4383 * 3, 30, class203.field2914[class176.field2397].getRGB(), 0);
            class174.field2391.method1776(var7 + var9, class102.field1239[class176.field2397].getRGB(), class215.field3041.method2331(25, class271.field3836), var8, -119, -1);
            return;
        }
        int var10 = class324.field4619 - (int) ((float) arg6 / class308.field4355);
        int var11 = class419.field5993 + ((int) ((float) arg2 / class308.field4355));
        int var12 = class324.field4619 + ((int) ((float) arg6 / class308.field4355));
        int var13 = class419.field5993 - ((int) ((float) arg2 / class308.field4355));
        class262.field3743 = (int) ((float) (arg2 * 2) / class308.field4355);
        int var14 = -12 / ((-arg5 - 60) / 51);
        class447.field6412 = (int) ((float) (arg6 * 2) / class308.field4355);
        class68.field765 = class419.field5993 - (int) ((float) arg2 / class308.field4355);
        class366.field5199 = class324.field4619 - ((int) ((float) arg6 / class308.field4355));
        class308.method2036(var10 + class308.field4368, class308.field4367 + var11, var12 + class308.field4368, class308.field4367 + var13, arg1, arg0, arg1 + arg6, arg0 + 1 - -arg2);
        class308.method2021(arg4);
        class92 var15 = class308.method2025(arg4);
        class340.method2182(arg4, (byte) 126, 0, var15, 0);
        if (class327.field4643 > 0) {
            class152.field1877--;
            if (class152.field1877 == 0) {
                class327.field4643--;
                class152.field1877 = 20;
            }
        }
        if (!class151.field1866) {
            return;
        }
        int var16 = arg1 + arg6 - 5;
        int var17 = arg0 + arg2 - 8;
        class73.field874.method1772("Fps:" + class98.field1195, (byte) 95, -1, 16776960, var17, var16);
        int var21 = var17 - 15;
        Runtime var18 = Runtime.getRuntime();
        int var19 = (int) ((var18.totalMemory() - var18.freeMemory()) / 1024L);
        int var20 = 16776960;
        if (var19 > 65536) {
            var20 = 16711680;
        }
        class73.field874.method1772("Mem:" + var19 + "k", (byte) 97, -1, var20, var21, var16);
        var17 = var21 - 15;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public final void method584(int arg0) {
        if (arg0 != -2) {
            this.method587(-122, -120, (class236) null);
        }
        field1265++;
        if (this.field1277 == null) {
            this.field1277 = this.field1287;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
    public static final int method585(int arg0, int arg1) {
        if (arg1 != 2) {
            field1266 = -126;
        }
        field1285++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)Lbj;")
    public static final class130 method586(byte arg0, int arg1) {
        field1274++;
        if (class141.field1741 && arg1 >= class86.field977 && arg1 <= class180.field2462) {
            return arg0 == 60 ? class166.field2330[arg1 - class86.field977] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILdg;)V")
    private final void method587(int arg0, int arg1, class236 arg2) {
        if (arg0 != 18927) {
            this.field1289 = null;
        }
        field1279++;
        if (arg1 == 1) {
            this.field1287 = arg2.method1561((byte) -121);
        } else if (arg1 == 2) {
            this.field1277 = arg2.method1561((byte) -121);
        } else if (arg1 == 3) {
            int var22 = arg2.method1574(-52);
            this.field1281 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field1281[var23][0] = arg2.method1617((byte) 48);
                this.field1281[var23][1] = arg2.method1597(class2.method10(arg0, 18390));
                this.field1281[var23][2] = arg2.method1597(class2.method10(arg0, 18390));
            }
        } else if (arg1 == 4) {
            int var4 = arg2.method1574(-4);
            this.field1275 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1275[var5][0] = arg2.method1617((byte) 48);
                this.field1275[var5][1] = arg2.method1597(class2.method10(arg0, 18390));
                this.field1275[var5][2] = arg2.method1597(3641);
            }
        } else if (arg1 == 5) {
            arg2.method1617((byte) 48);
        } else if (arg1 == 6) {
            arg2.method1574(-20);
        } else if (arg1 == 7) {
            arg2.method1574(-15);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method1574(-43);
                return;
            }
            if (arg1 == 10) {
                int var6 = arg2.method1574(arg0 ^ 0xFFFFB66F);
                this.field1267 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1267[var7] = arg2.method1597(3641);
                }
                return;
            }
            if (arg1 == 12) {
                arg2.method1597(3641);
                return;
            }
            if (arg1 == 13) {
                int var8 = arg2.method1574(arg0 - 18985);
                this.field1273 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field1273[var9] = arg2.method1617((byte) 48);
                }
                return;
            }
            if (arg1 != 14) {
                if (arg1 == 15) {
                    arg2.method1617((byte) 48);
                    return;
                }
                if (arg1 == 17) {
                    this.field1278 = arg2.method1617((byte) 48);
                    return;
                }
                if (arg1 == 18) {
                    int var10 = arg2.method1574(-85);
                    this.field1280 = new int[var10];
                    this.field1284 = new int[var10];
                    this.field1276 = new int[var10];
                    this.field1272 = new String[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field1284[var11] = arg2.method1597(arg0 - 15286);
                        this.field1280[var11] = arg2.method1597(3641);
                        this.field1276[var11] = arg2.method1597(3641);
                        this.field1272[var11] = arg2.method1562(false);
                    }
                    return;
                }
                if (arg1 == 19) {
                    int var18 = arg2.method1574(-47);
                    this.field1283 = new int[var18];
                    this.field1270 = new int[var18];
                    this.field1271 = new int[var18];
                    this.field1288 = new String[var18];
                    for (int var19 = 0; var19 < var18; var19++) {
                        this.field1283[var19] = arg2.method1597(3641);
                        this.field1270[var19] = arg2.method1597(class2.method10(arg0, 18390));
                        this.field1271[var19] = arg2.method1597(3641);
                        this.field1288[var19] = arg2.method1562(false);
                    }
                } else if (arg1 == 249) {
                    int var12 = arg2.method1574(-31);
                    if (this.field1282 == null) {
                        int var13 = class328.method2123(var12, 20867);
                        this.field1282 = new class288(var13);
                    }
                    for (int var14 = 0; var14 < var12; var14++) {
                        boolean var15 = arg2.method1574(-49) == 1;
                        int var16 = arg2.method1616(false);
                        class406 var17;
                        if (var15) {
                            var17 = new class49(arg2.method1562(false));
                        } else {
                            var17 = new class25(arg2.method1597(arg0 - 15286));
                        }
                        this.field1282.method1886(var17, (long) var16, 1);
                    }
                    return;
                }
                return;
            }
            int var20 = arg2.method1574(-89);
            this.field1289 = new int[var20][2];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field1289[var21][0] = arg2.method1574(arg0 - 19031);
                this.field1289[var21][1] = arg2.method1574(-36);
            }
            return;
        }
    }
}
