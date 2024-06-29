import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class275 {

    @OriginalMember(owner = "client!pfa", name = "I", descriptor = "Laca;")
    private class682 field3512 = null;

    @OriginalMember(owner = "client!pfa", name = "v", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!pfa", name = "N", descriptor = "Z")
    private boolean field3517;

    @OriginalMember(owner = "client!pfa", name = "G", descriptor = "Ljq;")
    private class478 field3510;

    @OriginalMember(owner = "client!pfa", name = "y", descriptor = "Lcga;")
    public static class449 field3503 = new class449(37, 4);

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!pfa", name = "o", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!pfa", name = "p", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!pfa", name = "q", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!pfa", name = "r", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!pfa", name = "s", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!pfa", name = "t", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!pfa", name = "u", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!pfa", name = "w", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!pfa", name = "x", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!pfa", name = "z", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!pfa", name = "B", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!pfa", name = "C", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!pfa", name = "D", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!pfa", name = "E", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!pfa", name = "F", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!pfa", name = "H", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!pfa", name = "J", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!pfa", name = "K", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!pfa", name = "M", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!pfa", name = "O", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!pfa", name = "P", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!pfa", name = "Q", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!pfa", name = "L", descriptor = "[Ljava/lang/Object;")
    private Object[] field3515;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3489;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BI)V")
    private final void method1635(byte arg0, int arg1) {
        this.field3510.method2611((byte) 2, arg1);
        field3481++;
        if (arg0 != 24) {
            this.method1652(-11, -84);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V")
    public static void method1636(byte arg0) {
        field3503 = null;
        if (arg0 <= 25) {
            field3503 = null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIFIIIII[F)V")
    public static final void method1637(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float[] arg9) {
        field3483++;
        int var10 = arg6 - arg2;
        int var11 = arg4 - arg0;
        int var12 = arg1 - arg8;
        float var13 = arg9[2] * (float) var11 + arg9[1] * (float) var10 + arg9[0] * (float) var12;
        float var14 = arg9[5] * (float) var11 + arg9[3] * (float) var12 + arg9[4] * (float) var10;
        if (arg5 > -29) {
            return;
        }
        float var15 = arg9[8] * (float) var11 + arg9[6] * (float) var12 + arg9[7] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg3 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg7 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg7 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg7 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class437.field5495 = var18;
        class20.field209 = var17;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1638(String arg0, int arg1) {
        field3513++;
        int var3 = this.method1651("", (byte) 77);
        return ~var3 == arg1 ? this.method1657(arg0, arg1 - 104, "") : this.method1657("", -121, arg0);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)[I")
    public final int[] method1639(int arg0, int arg1) {
        field3488++;
        if (!this.method1665((byte) 91, arg0)) {
            return null;
        }
        int[] var3 = this.field3512.field9301[arg0];
        if (arg1 != -2979) {
            this.method1660((byte) 125, 5);
        }
        if (var3 == null) {
            var3 = new int[this.field3512.field9291[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1640(int arg0, String arg1) {
        if (arg0 != -21656) {
            this.method1652(-17, 8);
        }
        field3487++;
        if (this.method1641(arg0 + 21575)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3512.field9292.method1843(-1746, class398.method2250(var3, false));
            return this.method1662(var4, -31);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)Z")
    private final boolean method1641(int arg0) {
        field3499++;
        if (arg0 >= -2) {
            this.method1670(-27, -68, 11, null);
        }
        if (this.field3512 == null) {
            this.field3512 = this.field3510.method2612(114);
            if (this.field3512 == null) {
                return false;
            }
            this.field3489 = new Object[this.field3512.field9293][];
            this.field3515 = new Object[this.field3512.field9293];
        }
        return true;
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)I")
    public final int method1642(int arg0) {
        field3480++;
        int var2 = -37 % ((arg0 - 15) / 60);
        return this.method1641(-8) ? this.field3512.field9285.length : -1;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public final int method1643(String arg0, boolean arg1) {
        field3518++;
        if (!this.method1641(-112)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1) {
            int var4 = this.field3512.field9292.method1843(-1746, class398.method2250(var3, false));
            return this.method1653(-29133, var4);
        } else {
            return 44;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III[I)Z")
    private final boolean method1644(int arg0, int arg1, int arg2, int[] arg3) {
        field3506++;
        if (!this.method1665((byte) 122, arg1)) {
            return false;
        } else if (this.field3515[arg1] == null) {
            return false;
        } else {
            if (arg0 != -19526) {
                this.method1666((byte) -28);
            }
            int var5 = this.field3512.field9291[arg1];
            int[] var6 = this.field3512.field9301[arg1];
            if (this.field3489[arg1] == null) {
                this.field3489[arg1] = new Object[this.field3512.field9285[arg1]];
            }
            Object[] var7 = this.field3489[arg1];
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
            if (arg3 != null && (arg3[0] != 0 || arg3[1] != 0 || arg3[2] != 0 || arg3[3] != 0)) {
                var11 = class343.method1956(this.field3515[arg1], true, 0);
                class572 var12 = new class572(var11);
                var12.method3062(5, arg3, var12.field7318.length, 2001673284);
            } else {
                var11 = class343.method1956(this.field3515[arg1], false, arg0 + 19526);
            }
            byte[] var13;
            try {
                var13 = class209.method1231(var11, -1);
            } catch (RuntimeException var49) {
                throw class83.method633(var49, "T3 - " + (arg3 != null) + "," + arg1 + "," + var11.length + "," + class68.method531(var11.length, var11, arg0 ^ 0xFFFFB3C5) + "," + class68.method531(var11.length - 2, var11, arg0 ^ 0xFFFFB3AA) + "," + this.field3512.field9287[arg1] + "," + this.field3512.field9283);
            }
            if (this.field3517) {
                this.field3515[arg1] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field3500 == 0) {
                    var7[var48] = class416.method2317(var13, false, -137);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field3500 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * var32 * 4;
                class572 var34 = new class572(var13);
                int var35 = 0;
                var34.field7313 = var33;
                int var36 = 0;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method3064(-2031091464);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg2 == var40) {
                            var35 += var38;
                            var36 = var40;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field7313 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method3064(arg0 ^ 0x790FB342);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg2 == var47) {
                            class70.method557(var13, var43, var41, var42, var45);
                            var42 += var45;
                        }
                        var43 += var45;
                    }
                }
                var7[var36] = var41;
            } else {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class572 var18 = new class572(var13);
                var18.field7313 = var17;
                int[] var19 = new int[var5];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method3064(-2031091464);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field7313 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method3064(-2031091464);
                        class70.method557(var13, var25, var23[var28], var19[var28], var27);
                        var19[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field3500 == 0) {
                        var7[var30] = class416.method2317(var23[var29], false, -137);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(B)Z")
    public final boolean method1645(byte arg0) {
        field3493++;
        int var2 = -80 / ((arg0 + 43) / 44);
        if (!this.method1641(-116)) {
            return false;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field3512.field9296.length; var4++) {
            int var5 = this.field3512.field9296[var4];
            if (this.field3515[var5] == null) {
                this.method1660((byte) 28, var5);
                if (this.field3515[var5] == null) {
                    var3 = false;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZBZ)V")
    public final void method1646(boolean arg0, byte arg1, boolean arg2) {
        field3497++;
        if (!this.method1641(-14)) {
            return;
        }
        if (arg0) {
            this.field3512.field9281 = null;
            this.field3512.field9289 = null;
        }
        if (arg1 != 109) {
            this.method1670(90, 109, 56, null);
        }
        if (arg2) {
            this.field3512.field9300 = null;
            this.field3512.field9292 = null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III)Z")
    private final boolean method1647(int arg0, int arg1, int arg2) {
        field3484++;
        if (!this.method1641(-78)) {
            return false;
        }
        if (arg0 != 2) {
            this.field3489 = null;
        }
        if (arg1 >= 0 && arg2 >= 0 && arg1 < this.field3512.field9285.length && this.field3512.field9285[arg1] > arg2) {
            return true;
        } else if (class35.field525) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(II)[B")
    public final byte[] method1648(int arg0, int arg1) {
        field3520++;
        if (!this.method1641(-41)) {
            return null;
        } else if (this.field3512.field9285.length == 1) {
            return this.method1659(110, arg1, 0);
        } else if (this.method1665((byte) 84, arg1)) {
            int var3 = 25 / ((68 - arg0) / 51);
            if (this.field3512.field9285[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method1659(-3, 0, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method1649(int arg0, String arg1, String arg2) {
        field3508++;
        if (!this.method1641(-40)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3512.field9292.method1843(-1746, class398.method2250(var4, false));
        if (arg0 != -1) {
            field3503 = null;
        }
        if (this.method1665((byte) 101, var6)) {
            int var7 = this.field3512.field9289[var6].method1843(-1746, class398.method2250(var5, false));
            return this.method1659(-31, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "(I)V")
    public final void method1650(int arg0) {
        field3494++;
        if (this.field3515 != null) {
            for (int var2 = 0; var2 < this.field3515.length; var2++) {
                this.field3515[var2] = null;
            }
        }
        if (arg0 != 10027) {
            this.field3489 = null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method1651(String arg0, byte arg1) {
        field3491++;
        if (arg1 != 77) {
            this.field3512 = null;
        }
        if (this.method1641(-97)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3512.field9292.method1843(arg1 ^ 0xFFFFF963, class398.method2250(var3, false));
            return this.method1665((byte) 116, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "(II)I")
    public final int method1652(int arg0, int arg1) {
        field3507++;
        if (!this.method1641(-123)) {
            return -1;
        }
        if (arg0 != -1) {
            this.method1659(40, -28, -9);
        }
        int var3 = this.field3512.field9292.method1843(-1746, arg1);
        return this.method1665((byte) 89, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "(II)I")
    private final int method1653(int arg0, int arg1) {
        field3498++;
        if (!this.method1665((byte) 114, arg1)) {
            return 0;
        } else if (this.field3515[arg1] == null) {
            if (arg0 != -29133) {
                this.field3517 = true;
            }
            return this.field3510.method2610(arg1, (byte) 82);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILji;)V")
    public static final void method1654(int arg0, class572 arg1) {
        field3511++;
        int var2 = 0;
        if (arg0 != 12782) {
            method1637(64, -104, -27, -1.1400626F, -39, 10, -28, 41, -12, null);
        }
        while (var2 < class237.field3067) {
            int var3 = arg1.method3033((byte) 91);
            int var4 = arg1.method3031(-1);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class633.field8584[var3] != null) {
                class633.field8584[var3].field6646 = var4;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IB)I")
    public final int method1655(int arg0, byte arg1) {
        field3514++;
        if (arg1 != -82) {
            this.field3515 = null;
        }
        return this.method1665((byte) 86, arg0) ? this.field3512.field9285[arg0] : 0;
    }

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "(II)V")
    public final void method1656(int arg0, int arg1) {
        field3519++;
        if (arg1 != 1) {
            this.method1643(null, true);
        }
        if (this.method1665((byte) 86, arg0) && this.field3489 != null) {
            this.field3489[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    private final boolean method1657(String arg0, int arg1, String arg2) {
        field3505++;
        if (!this.method1641(-98)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        if (arg1 >= -72) {
            this.method1645((byte) 106);
        }
        String var5 = arg2.toLowerCase();
        int var6 = this.field3512.field9292.method1843(-1746, class398.method2250(var4, false));
        if (this.method1665((byte) 116, var6)) {
            int var7 = this.field3512.field9289[var6].method1843(-1746, class398.method2250(var5, false));
            return this.method1667(var7, var6, 100);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "(I)I")
    public final int method1658(int arg0) {
        field3516++;
        if (!this.method1641(-26)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3515.length; var4++) {
            if (this.field3512.field9291[var4] > 0) {
                var2 += 100;
                var3 += this.method1653(-29133, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            if (arg0 != 21286) {
                this.method1651(null, (byte) 93);
            }
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(III)[B")
    public final byte[] method1659(int arg0, int arg1, int arg2) {
        int var4 = -25 % ((arg0 - 44) / 33);
        field3502++;
        return this.method1670(arg1, arg2, -2, null);
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(BI)V")
    private final void method1660(byte arg0, int arg1) {
        if (this.field3517) {
            this.field3515[arg1] = this.field3510.method2615(arg1, 0);
        } else {
            this.field3515[arg1] = class416.method2317(this.field3510.method2615(arg1, 0), false, class289.method1735(arg0, -149));
        }
        field3496++;
        if (arg0 != 28) {
            this.method1658(82);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method1661(String arg0, boolean arg1) {
        field3479++;
        if (!this.method1641(-76)) {
            return false;
        } else if (arg1) {
            return false;
        } else {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3512.field9292.method1843(-1746, class398.method2250(var3, arg1));
            return var4 >= 0;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "(II)Z")
    public final boolean method1662(int arg0, int arg1) {
        field3482++;
        if (!this.method1665((byte) 115, arg0)) {
            return false;
        } else if (this.field3515[arg0] == null) {
            if (arg1 > -14) {
                this.field3489 = null;
            }
            this.method1660((byte) 28, arg0);
            return this.field3515[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method1663(int arg0, String arg1, String arg2) {
        field3492++;
        if (!this.method1641(-108)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3512.field9292.method1843(-1746, class398.method2250(var4, false));
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field3512.field9289[var6].method1843(arg0 - 1745, class398.method2250(var5, false));
            return ~var7 <= arg0;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)V")
    public final void method1664(boolean arg0) {
        if (arg0) {
            return;
        }
        field3509++;
        if (this.field3489 != null) {
            for (int var2 = 0; var2 < this.field3489.length; var2++) {
                this.field3489[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "(BI)Z")
    private final boolean method1665(byte arg0, int arg1) {
        field3501++;
        if (!this.method1641(-66)) {
            return false;
        }
        if (arg0 < 82) {
            this.method1661(null, true);
        }
        if (arg1 >= 0 && this.field3512.field9285.length > arg1 && this.field3512.field9285[arg1] != 0) {
            return true;
        } else if (class35.field525) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "(B)I")
    public final int method1666(byte arg0) {
        field3485++;
        if (arg0 <= 112) {
            return -96;
        } else if (this.method1641(-69)) {
            return this.field3512.field9283;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "(III)Z")
    public final boolean method1667(int arg0, int arg1, int arg2) {
        field3490++;
        if (!this.method1647(2, arg1, arg0)) {
            return false;
        } else if (this.field3489[arg1] != null && this.field3489[arg1][arg0] != null) {
            return true;
        } else if (this.field3515[arg1] == null) {
            this.method1660((byte) 28, arg1);
            if (arg2 < 57) {
                field3503 = null;
            }
            return this.field3515[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(ILjava/lang/String;)V")
    public final void method1668(int arg0, String arg1) {
        field3504++;
        if (!this.method1641(-98)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3512.field9292.method1843(-1746, class398.method2250(var3, false));
        if (arg0 == -1) {
            this.method1635((byte) 24, var4);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "(BI)Z")
    public final boolean method1669(byte arg0, int arg1) {
        field3495++;
        if (!this.method1641(-58)) {
            return false;
        }
        int var3 = 63 % ((arg0 - 40) / 61);
        if (this.field3512.field9285.length == 1) {
            return this.method1667(arg1, 0, 65);
        } else if (!this.method1665((byte) 125, arg1)) {
            return false;
        } else if (this.field3512.field9285[arg1] == 1) {
            return this.method1667(0, arg1, 113);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(III[I)[B")
    public final byte[] method1670(int arg0, int arg1, int arg2, int[] arg3) {
        field3486++;
        if (!this.method1647(2, arg1, arg0)) {
            return null;
        }
        if (this.field3489[arg1] == null || this.field3489[arg1][arg0] == null) {
            boolean var5 = this.method1644(-19526, arg1, arg0, arg3);
            if (!var5) {
                this.method1660((byte) 28, arg1);
                boolean var6 = this.method1644(-19526, arg1, arg0, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class343.method1956(this.field3489[arg1][arg0], false, 0);
        if (~this.field3500 == arg2) {
            this.field3489[arg1][arg0] = null;
            if (this.field3512.field9285[arg1] == 1) {
                this.field3489[arg1] = null;
            }
        } else if (this.field3500 == 2) {
            this.field3489[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Ljq;ZI)V")
    public class275(class478 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field3500 = arg2;
        this.field3517 = arg1;
        this.field3510 = arg0;
    }
}
