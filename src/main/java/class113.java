import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class113 extends RuntimeException {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1488;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Ljava/lang/String;")
    public String field1496;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lwl;")
    public static class452 field1490 = new class452(44, 6);

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "[I")
    public static int[] field1494;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
    public static int[] field1495;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[I")
    public static int[] field1506;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1499;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[I")
    public static int[] field1497;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "[I")
    public static int[] field1502;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[I")
    public static int[] field1504;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lje;")
    public static class169 field1500;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I")
    public static final int method684(int arg0) {
        if (arg0 != 1) {
            field1494 = null;
        }
        field1491++;
        if (class80.field1058) {
            return 0;
        } else if (class360.method2172(81)) {
            return class213.field3198 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILje;ILfq;IIBLwn;)V")
    public static final void method685(int arg0, class169 arg1, int arg2, class85 arg3, int arg4, int arg5, byte arg6, class155 arg7) {
        field1489++;
        class71 var8 = new class71();
        var8.field923 = arg5 * 128;
        int var9 = -119 / ((33 - arg6) / 56);
        var8.field927 = arg4 * 128;
        var8.field924 = arg2;
        if (arg3 != null) {
            var8.field920 = arg3;
            int var10 = arg3.field1197;
            int var11 = arg3.field1122;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg3.field1122;
                var11 = arg3.field1197;
            }
            var8.field925 = arg3.field1178;
            var8.field929 = (arg4 + var11) * 128;
            var8.field921 = arg3.field1163;
            var8.field907 = arg3.field1188;
            var8.field909 = arg3.field1185;
            var8.field910 = arg3.field1174 * 128;
            var8.field912 = arg3.field1196;
            var8.field908 = (arg5 + var10) * 128;
            if (arg3.field1133 != null) {
                var8.field917 = true;
                var8.method473((byte) 41);
            }
            if (var8.field925 != null) {
                var8.field922 = (int) (Math.random() * (double) (var8.field907 - var8.field912)) + var8.field912;
            }
            class451.field6638.method2504(42, var8);
        } else if (arg7 != null) {
            var8.field915 = arg7;
            class271 var12 = arg7.field2137;
            if (var12.field4100 != null) {
                var8.field917 = true;
                var12 = var12.method1684(6);
            }
            if (var12 != null) {
                var8.field908 = (var12.field4110 + arg5) * 128;
                var8.field929 = (var12.field4110 + arg4) * 128;
                var8.field921 = class8.method62(arg7, -1);
                var8.field909 = var12.field4123;
                var8.field910 = var12.field4114 * 128;
            }
            class281.field4298.method2504(42, var8);
        } else if (arg1 != null) {
            var8.field918 = arg1;
            var8.field908 = (arg1.method911(0) + arg5) * 128;
            var8.field929 = (arg1.method911(0) + arg4) * 128;
            var8.field921 = class233.method1407((byte) 91, arg1);
            var8.field909 = arg1.field2427;
            var8.field910 = arg1.field2462 * 128;
            class466.field6858.method2301(22, var8, (long) arg1.field1929);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILiq;)V")
    public static final void method686(int arg0, class134 arg1) {
        if (arg0 == -4) {
            class169.field2429 = arg1;
            field1493++;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1501++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg5 - arg4;
        int var12 = arg2 - arg4;
        int var13 = arg5 * arg5;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        if (arg3 != 388842497) {
            field1495 = null;
        }
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        if (arg6 >= class189.field2831 && class204.field3060 >= arg6) {
            int[] var38 = class292.field4448[arg6];
            int var39 = class198.method1192(class192.field2917, class39.field497, arg1 - arg5, -3);
            int var40 = class198.method1192(class192.field2917, class39.field497, arg1 + arg5, -3);
            int var41 = class198.method1192(class192.field2917, class39.field497, arg1 - var11, -3);
            int var42 = class198.method1192(class192.field2917, class39.field497, arg1 + var11, -3);
            class379.method2285(arg3 ^ 0x172D447E, var38, var41, arg0, var39);
            class379.method2285(124, var38, var42, arg7, var41);
            class379.method2285(124, var38, var40, arg0, var42);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var43;
                var34 -= var29;
                var43 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (var46 >= class189.field2831 && var45 <= class204.field3060) {
                int var47 = class198.method1192(class192.field2917, class39.field497, arg1 + var8, arg3 + -388842500);
                int var48 = class198.method1192(class192.field2917, class39.field497, arg1 - var8, -3);
                if (var44) {
                    int var49 = class198.method1192(class192.field2917, class39.field497, arg1 + var10, -3);
                    int var50 = class198.method1192(class192.field2917, class39.field497, arg1 - var10, -3);
                    if (class189.field2831 <= var45) {
                        int[] var51 = class292.field4448[var45];
                        class379.method2285(124, var51, var50, arg0, var48);
                        class379.method2285(126, var51, var49, arg7, var50);
                        class379.method2285(arg3 ^ 0x172D447E, var51, var47, arg0, var49);
                    }
                    if (var46 <= class204.field3060) {
                        int[] var52 = class292.field4448[var46];
                        class379.method2285(125, var52, var50, arg0, var48);
                        class379.method2285(arg3 - 388842373, var52, var49, arg7, var50);
                        class379.method2285(125, var52, var47, arg0, var49);
                    }
                } else {
                    if (var45 >= class189.field2831) {
                        class379.method2285(125, class292.field4448[var45], var47, arg0, var48);
                    }
                    if (class204.field3060 >= var46) {
                        class379.method2285(124, class292.field4448[var46], var47, arg0, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method688(int arg0) {
        field1499 = null;
        field1506 = null;
        field1500 = null;
        field1494 = null;
        field1504 = null;
        field1495 = null;
        field1490 = null;
        field1497 = null;
        field1502 = null;
        if (arg0 > -23) {
            method686(-42, (class134) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class113(Throwable arg0, String arg1) {
        this.field1488 = arg0;
        this.field1496 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 78 % ((arg8 + 36) / 41);
        field1503++;
        if (arg5 < 1 || arg1 < 1 || arg5 > class115.field1522 - 2 || (class198.field3004 - 2) < arg1) {
            return;
        }
        if (!class360.method2172(39) && !class56.method319(arg5, arg1, class88.field1263, (byte) 3, arg4)) {
            return;
        }
        if (class277.field4216 == null) {
            return;
        }
        int var10 = arg4;
        if (arg4 < 3 && class430.method2646(27156, arg5, arg1)) {
            var10 = arg4 + 1;
        }
        class38.method217(class449.field6599[arg4], class196.field2965, arg5, 0, var10, arg0, arg4, arg1);
        if (arg7 < 0) {
            return;
        }
        boolean var11 = class345.field5157;
        class345.field5157 = true;
        class331.method2031(false, arg6, class196.field2965, class449.field6599[arg4], arg1, arg7, false, var10, arg2, (byte) 116, arg5, arg4, arg3);
        class345.field5157 = var11;
        return;
    }

    static {
        new class151("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field1505 = 50;
        field1494 = new int[field1505];
        field1498 = 0;
        field1495 = new int[field1505];
        field1506 = new int[field1505];
        field1499 = new String[field1505];
        field1497 = new int[field1505];
        field1502 = new int[field1505];
        field1504 = new int[field1505];
    }
}
