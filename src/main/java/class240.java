import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class240 {

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "Ljn;")
    private class504 field3307 = null;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Z")
    private boolean field3299;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lkl;")
    private class54 field3297;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[Ljava/lang/Object;")
    private Object[] field3291;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3316;

    static {
        new class83("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)[B", line = 3)
    public final byte[] method1388(int arg0, byte arg1) {
        field3320++;
        if (!this.method1394(-2)) {
            return null;
        } else if (arg1 >= 0) {
            return null;
        } else if (this.field3307.field7407.length == 1) {
            return this.method1411(true, arg0, 0);
        } else if (!this.method1418(arg0, false)) {
            return null;
        } else if (this.field3307.field7407[arg0] == 1) {
            return this.method1411(true, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)[Llg;", line = 29)
    public static final class284[] method1389(byte arg0) {
        field3313++;
        return arg0 > -62 ? null : new class284[] { class215.field3053, class215.field3058, class296.field4096, class192.field2732, class480.field7018, class51.field691, class500.field7349, class377.field5308, class26.field404, class320.field4429, class60.field799, class36.field502, class449.field6491, class45.field625, class269.field3689 };
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V", line = 40)
    public final void method1390(int arg0, boolean arg1) {
        field3296++;
        if (!this.method1418(arg0, arg1)) {
            return;
        }
        if (this.field3316 != null) {
            this.field3316[arg0] = null;
        }
        if (arg1) {
            this.field3307 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V", line = 61)
    private final void method1391(int arg0, int arg1) {
        if (this.field3299) {
            this.field3291[arg0] = this.field3297.method350((byte) 125, arg0);
        } else {
            this.field3291[arg0] = class385.method2211(this.field3297.method350((byte) 127, arg0), false, 17341);
        }
        if (arg1 == 23487) {
            field3298++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 79)
    public final void method1392(String arg0, int arg1) {
        field3318++;
        if (!this.method1394(-2)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3307.field7406.method2652(class374.method2161(1653059589, var3), 106);
        this.method1405(var4, (byte) 111);
        if (arg1 > -49) {
            this.method1394(-127);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)Z", line = 100)
    public final boolean method1393(int arg0, int arg1) {
        field3300++;
        if (!this.method1418(arg1, false)) {
            return false;
        } else if (this.field3291[arg1] == null) {
            this.method1391(arg1, 23487);
            int var3 = -123 / ((arg0 + 47) / 56);
            return this.field3291[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Z", line = 123)
    private final boolean method1394(int arg0) {
        if (arg0 != -2) {
            return false;
        }
        field3309++;
        if (this.field3307 == null) {
            this.field3307 = this.field3297.method352(-26270);
            if (this.field3307 == null) {
                return false;
            }
            this.field3316 = new Object[this.field3307.field7399][];
            this.field3291 = new Object[this.field3307.field7399];
        }
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)[Lnq;", line = 147)
    public static final class319[] method1395(int arg0) {
        field3321++;
        if (class252.field3490 == null) {
            class319[] var1 = class77.method568(true, class282.field3804);
            class319[] var2 = new class319[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class319 var8 = var1[var4];
                if ((var8.field4413 <= 0 || var8.field4413 >= 24) && var8.field4405 >= 800 && var8.field4407 >= 600 && (class463.field6730 >= 96 || class278.field3761 != 0 || var8.field4405 <= 1024 && var8.field4407 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class319 var10 = var2[var9];
                        if (var8.field4405 == var10.field4405 && var8.field4407 == var10.field4407) {
                            if (var10.field4413 < var8.field4413) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class252.field3490 = new class319[var3];
            class416.method2485(var2, 0, class252.field3490, 0, var3);
            int[] var5 = new int[class252.field3490.length];
            for (int var6 = 0; var6 < class252.field3490.length; var6++) {
                class319 var7 = class252.field3490[var6];
                var5[var6] = var7.field4407 * var7.field4405;
            }
            class351.method1944(false, class252.field3490, var5);
        }
        return arg0 == 0 ? class252.field3490 : null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 228)
    public final int method1396(String arg0, byte arg1) {
        field3311++;
        if (!this.method1394(-2)) {
            return -1;
        }
        if (arg1 != 71) {
            this.field3297 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3307.field7406.method2652(class374.method2161(1653059589, var3), 123);
        return this.method1418(var4, false) ? var4 : -1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)I", line = 249)
    public final int method1397(byte arg0, int arg1) {
        field3308++;
        if (this.method1418(arg1, false)) {
            int var3 = -123 % ((arg0 + 72) / 37);
            return this.field3307.field7407[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)I", line = 263)
    public final int method1398(byte arg0) {
        if (arg0 >= -90) {
            this.field3316 = null;
        }
        field3293++;
        if (!this.method1394(-2)) {
            throw new IllegalStateException("");
        }
        return this.field3307.field7405;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[III)[B", line = 280)
    public final byte[] method1399(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            this.field3299 = false;
        }
        field3315++;
        if (!this.method1401(arg0, arg2, (byte) -108)) {
            return null;
        }
        if (this.field3316[arg0] == null || this.field3316[arg0][arg2] == null) {
            boolean var5 = this.method1403(arg2, false, arg0, arg1);
            if (!var5) {
                this.method1391(arg0, 23487);
                boolean var6 = this.method1403(arg2, false, arg0, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class103.method682(-2, false, this.field3316[arg0][arg2]);
        if (this.field3322 == 1) {
            this.field3316[arg0][arg2] = null;
            if (this.field3307.field7407[arg0] == 1) {
                this.field3316[arg0] = null;
            }
        } else if (this.field3322 == 2) {
            this.field3316[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 337)
    public final boolean method1400(int arg0, String arg1) {
        field3305++;
        if (this.method1394(-2)) {
            int var3 = 107 % ((-arg0 - 24) / 35);
            String var4 = arg1.toLowerCase();
            int var5 = this.field3307.field7406.method2652(class374.method2161(1653059589, var4), 80);
            return this.method1393(-114, var5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIB)Z", line = 357)
    private final boolean method1401(int arg0, int arg1, byte arg2) {
        if (arg2 != -108) {
            this.field3299 = true;
        }
        field3312++;
        if (!this.method1394(-2)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && this.field3307.field7407.length > arg0 && arg1 < this.field3307.field7407[arg0]) {
            return true;
        } else if (class403.field5599) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Z", line = 383)
    public final boolean method1402(int arg0) {
        field3289++;
        if (!this.method1394(arg0 ^ 0xFFFFF2DB)) {
            return false;
        }
        if (arg0 != 3365) {
            this.method1397((byte) 113, 17);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3307.field7397.length; var3++) {
            int var4 = this.field3307.field7397[var3];
            if (this.field3291[var4] == null) {
                this.method1391(var4, 23487);
                if (this.field3291[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZI[I)Z", line = 420)
    private final boolean method1403(int arg0, boolean arg1, int arg2, int[] arg3) {
        field3325++;
        if (!this.method1418(arg2, arg1)) {
            return false;
        } else if (this.field3291[arg2] == null) {
            return false;
        } else {
            int var5 = this.field3307.field7401[arg2];
            int[] var6 = this.field3307.field7402[arg2];
            if (this.field3316[arg2] == null) {
                this.field3316[arg2] = new Object[this.field3307.field7407[arg2]];
            }
            Object[] var7 = this.field3316[arg2];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class103.method682(-2, false, this.field3291[arg2]);
            } else {
                var11 = class103.method682(-2, true, this.field3291[arg2]);
                class365 var12 = new class365(var11);
                var12.method2092(var12.field5073.length, 5, arg3, 255);
            }
            byte[] var13;
            try {
                var13 = class254.method1493(arg1, var11);
            } catch (RuntimeException var49) {
                throw class430.method2567(var49, "T3 - " + (arg3 != null) + "," + arg2 + "," + var11.length + "," + class287.method1636(var11.length, var11, -8849) + "," + class287.method1636(var11.length - 2, var11, -8849) + "," + this.field3307.field7393[arg2] + "," + this.field3307.field7405);
            }
            if (this.field3299) {
                this.field3291[arg2] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field3322 == 0) {
                    var7[var48] = class385.method2211(var13, false, 17341);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field3322 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class365 var18 = new class365(var13);
                int var19 = 0;
                int var20 = 0;
                var18.field5069 = var17;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method2056((byte) -64);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg0 == var24) {
                            var20 = var24;
                            var19 += var22;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                var18.field5069 = var17;
                int var26 = 0;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method2056((byte) 124);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg0 == var31) {
                            class416.method2491(var13, var27, var25, var26, var29);
                            var26 += var29;
                        }
                        var27 += var29;
                    }
                }
                var7[var20] = var25;
            } else {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * var33 * 4;
                class365 var35 = new class365(var13);
                var35.field5069 = var34;
                int[] var36 = new int[var5];
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method2056((byte) 109);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field5069 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method2056((byte) -65);
                        class416.method2491(var13, var42, var40[var45], var36[var45], var44);
                        var42 += var44;
                        var36[var45] += var44;
                    }
                }
                for (int var46 = 0; var46 < var5; var46++) {
                    int var47;
                    if (var6 == null) {
                        var47 = var46;
                    } else {
                        var47 = var6[var46];
                    }
                    if (this.field3322 == 0) {
                        var7[var47] = class385.method2211(var40[var46], false, 17341);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z", line = 704)
    public final boolean method1404(int arg0, int arg1, int arg2) {
        field3314++;
        if (arg2 != 0) {
            this.field3322 = 66;
        }
        if (!this.method1401(arg0, arg1, (byte) -108)) {
            return false;
        } else if (this.field3316[arg0] != null && this.field3316[arg0][arg1] != null) {
            return true;
        } else if (this.field3291[arg0] == null) {
            this.method1391(arg0, 23487);
            return this.field3291[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IB)V", line = 733)
    private final void method1405(int arg0, byte arg1) {
        if (arg1 <= 104) {
            this.field3299 = false;
        }
        field3326++;
        this.field3297.method353(arg0, (byte) 87);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 744)
    public final boolean method1406(String arg0, int arg1) {
        field3295++;
        if (!this.method1394(-2)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 < 105) {
            this.method1411(true, 47, 75);
        }
        int var4 = this.field3307.field7406.method2652(class374.method2161(1653059589, var3), 110);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B", line = 766)
    public final byte[] method1407(String arg0, byte arg1, String arg2) {
        field3319++;
        if (!this.method1394(-2)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        if (arg1 >= -28) {
            this.method1399(-128, null, 126, -28);
        }
        int var6 = this.field3307.field7406.method2652(class374.method2161(1653059589, var4), 68);
        if (this.method1418(var6, false)) {
            int var7 = this.field3307.field7412[var6].method2652(class374.method2161(1653059589, var5), 75);
            return this.method1411(true, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lkl;ZI)V", line = 1124)
    public class240(class54 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field3299 = arg1;
        this.field3322 = arg2;
        this.field3297 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)I", line = 793)
    public final int method1408(byte arg0, String arg1) {
        field3294++;
        if (arg0 != 43) {
            this.method1396(null, (byte) -11);
        }
        if (this.method1394(-2)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3307.field7406.method2652(class374.method2161(1653059589, var3), arg0 + 71);
            return this.method1417(var4, arg0 ^ 0x2B);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)I", line = 810)
    public final int method1409(int arg0) {
        field3306++;
        if (!this.method1394(-2)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 <= 4) {
            return 114;
        }
        for (int var4 = 0; var4 < this.field3291.length; var4++) {
            if (this.field3307.field7401[var4] > 0) {
                var2 += 100;
                var3 += this.method1417(var4, 0);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)I", line = 851)
    public final int method1410(int arg0) {
        field3303++;
        if (arg0 == 0) {
            return this.method1394(-2) ? this.field3307.field7407.length : -1;
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZII)[B", line = 866)
    public final byte[] method1411(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field3327++;
            return this.method1399(arg2, null, arg1, -1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)Z", line = 878)
    public final boolean method1412(int arg0, int arg1) {
        field3324++;
        if (!this.method1394(arg1 - 3)) {
            return false;
        } else if (this.field3307.field7407.length == 1) {
            return this.method1404(0, arg0, 0);
        } else if (!this.method1418(arg0, false)) {
            return false;
        } else if (this.field3307.field7407[arg0] == arg1) {
            return this.method1404(arg0, 0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 913)
    public final boolean method1413(String arg0, int arg1, String arg2) {
        field3317++;
        if (!this.method1394(-2)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        if (arg1 != 0) {
            this.field3322 = -121;
        }
        int var6 = this.field3307.field7406.method2652(class374.method2161(1653059589, var4), arg1 + 111);
        if (this.method1418(var6, false)) {
            int var7 = this.field3307.field7412[var6].method2652(class374.method2161(1653059589, var5), 99);
            return this.method1404(var6, var7, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V", line = 944)
    public final void method1414(boolean arg0) {
        field3328++;
        if (!arg0) {
            method1395(54);
        }
        if (this.field3291 != null) {
            for (int var2 = 0; var2 < this.field3291.length; var2++) {
                this.field3291[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(II)[I", line = 968)
    public final int[] method1415(int arg0, int arg1) {
        field3323++;
        if (!this.method1418(arg1, false)) {
            return null;
        } else if (arg0 >= -121) {
            return null;
        } else {
            int[] var3 = this.field3307.field7402[arg1];
            if (var3 == null) {
                var3 = new int[this.field3307.field7401[arg1]];
                int var4 = 0;
                while (var4 < var3.length) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(II)I", line = 997)
    public final int method1416(int arg0, int arg1) {
        field3301++;
        if (!this.method1394(-2)) {
            return -1;
        }
        int var3 = this.field3307.field7406.method2652(arg0, 82);
        if (arg1 < 42) {
            this.method1420(-80);
        }
        return this.method1418(var3, false) ? var3 : -1;
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(II)I", line = 1017)
    private final int method1417(int arg0, int arg1) {
        field3304++;
        if (!this.method1418(arg0, false)) {
            return 0;
        } else if (this.field3291[arg0] == null) {
            return arg1 == 0 ? this.field3297.method349(arg1, arg0) : -52;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IZ)Z", line = 1043)
    private final boolean method1418(int arg0, boolean arg1) {
        if (arg1) {
            this.field3291 = null;
        }
        field3290++;
        if (!this.method1394(-2)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field3307.field7407.length && this.field3307.field7407[arg0] != 0) {
            return true;
        } else if (class403.field5599) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZZ)V", line = 1072)
    public final void method1419(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != 0) {
            this.method1409(-111);
        }
        field3292++;
        if (!this.method1394(-2)) {
            return;
        }
        if (arg2) {
            this.field3307.field7396 = null;
            this.field3307.field7412 = null;
        }
        if (arg1) {
            this.field3307.field7406 = null;
            this.field3307.field7409 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V", line = 1101)
    public final void method1420(int arg0) {
        field3310++;
        if (arg0 != 2) {
            this.method1419(16, true, false);
        }
        if (this.field3316 != null) {
            for (int var2 = 0; var2 < this.field3316.length; var2++) {
                this.field3316[var2] = null;
            }
        }
    }
}
