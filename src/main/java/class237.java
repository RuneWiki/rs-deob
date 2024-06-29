import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class237 {

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "Lvh;")
    private class629 field3512 = null;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public int field3498;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "Lcaa;")
    private class639 field3532;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Z")
    private boolean field3500;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
    public static int field3529 = 1338;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field3509 = -60;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3514 = null;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!uu", name = "P", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "[Ljava/lang/Object;")
    private Object[] field3511;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3505;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z")
    public final boolean method1570(int arg0, int arg1, int arg2) {
        field3501++;
        if (!this.method1579(arg1, arg2, arg0 ^ 0xFFFFD58D)) {
            return false;
        } else if (this.field3505[arg1] != null && this.field3505[arg1][arg2] != null) {
            return true;
        } else if (this.field3511[arg1] == null) {
            this.method1599(arg0 ^ arg0, arg1);
            return this.field3511[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    private final boolean method1571(int arg0, String arg1, String arg2) {
        field3530++;
        if (!this.method1600(arg0 - 12802)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3512.field8444.method4203(class45.method244(0, var4), (byte) 123);
        if (!this.method1602((byte) -120, var6)) {
            return false;
        }
        if (arg0 != 24980) {
            this.method1578(-116, (byte) -63);
        }
        int var7 = this.field3512.field8442[var6].method4203(class45.method244(arg0 - 24980, var5), (byte) 117);
        return this.method1570(-2, var6, var7);
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)[B")
    public final byte[] method1572(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field3514 = null;
        }
        field3521++;
        return this.method1577(1, arg0, null, arg2);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)V")
    private final void method1573(int arg0, byte arg1) {
        field3516++;
        this.field3532.method2962(-2, arg0);
        if (arg1 < 65) {
            this.method1601((byte) -35);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I")
    private final int method1574(int arg0, int arg1) {
        field3519++;
        if (this.method1602((byte) -120, arg1)) {
            if (arg0 != 100) {
                this.method1594((byte) 73);
            }
            return this.field3511[arg1] == null ? this.field3532.method2968((byte) -95, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I[III)Z")
    private final boolean method1575(int arg0, int[] arg1, int arg2, int arg3) {
        field3539++;
        if (!this.method1602((byte) -70, arg0)) {
            return false;
        } else if (this.field3511[arg0] == null) {
            return false;
        } else {
            if (arg2 != 255) {
                this.method1576(4, -125);
            }
            int var5 = this.field3512.field8457[arg0];
            int[] var6 = this.field3512.field8462[arg0];
            if (this.field3505[arg0] == null) {
                this.field3505[arg0] = new Object[this.field3512.field8445[arg0]];
            }
            Object[] var7 = this.field3505[arg0];
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
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var11 = class229.method1363(39, this.field3511[arg0], true);
                class63 var12 = new class63(var11);
                var12.method461(arg1, 5, var12.field954.length, -87);
            } else {
                var11 = class229.method1363(84, this.field3511[arg0], false);
            }
            byte[] var13;
            try {
                var13 = class26.method150(arg2 - 256, var11);
            } catch (RuntimeException var49) {
                throw class139.method915(var49, "T3 - " + (arg1 != null) + "," + arg0 + "," + var11.length + "," + class129.method807(true, var11, var11.length) + "," + class129.method807(true, var11, var11.length - 2) + "," + this.field3512.field8456[arg0] + "," + this.field3512.field8446);
            }
            if (this.field3500) {
                this.field3511[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field3498 == 0) {
                    var7[var15] = class733.method4084(false, 824028812, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field3498 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class63 var19 = new class63(var13);
                int var20 = 0;
                var19.field956 = var18;
                int var21 = 0;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method457(-14532);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg3 == var25) {
                            var20 += var23;
                            var21 = var25;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                int var27 = 0;
                var19.field956 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method457(-14532);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg3 == var32) {
                            class245.method1646(var13, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var13.length;
                int var51 = var33 - 1;
                int var34 = var13[var51] & 0xFF;
                int var35 = var51 - var5 * var34 * 4;
                class63 var36 = new class63(var13);
                int[] var37 = new int[var5];
                var36.field956 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method457(-14532);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field956 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method457(-14532);
                        class245.method1646(var13, var43, var41[var46], var37[var46], var45);
                        var43 += var45;
                        var37[var46] += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field3498 == 0) {
                        var7[var48] = class733.method4084(false, 824028812, var41[var47]);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)I")
    public final int method1576(int arg0, int arg1) {
        field3503++;
        if (arg1 != -1) {
            return -21;
        } else if (this.method1600(12178)) {
            int var3 = this.field3512.field8444.method4203(arg0, (byte) 115);
            return this.method1602((byte) -86, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II[II)[B")
    public final byte[] method1577(int arg0, int arg1, int[] arg2, int arg3) {
        field3517++;
        if (arg0 != 1) {
            this.method1572(-126, 86, -111);
        }
        if (!this.method1579(arg1, arg3, 10867)) {
            return null;
        }
        if (this.field3505[arg1] == null || this.field3505[arg1][arg3] == null) {
            boolean var5 = this.method1575(arg1, arg2, 255, arg3);
            if (!var5) {
                this.method1599(0, arg1);
                boolean var6 = this.method1575(arg1, arg2, 255, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class229.method1363(55, this.field3505[arg1][arg3], false);
        if (this.field3498 == 1) {
            this.field3505[arg1][arg3] = null;
            if (this.field3512.field8445[arg1] == 1) {
                this.field3505[arg1] = null;
            }
        } else if (this.field3498 == 2) {
            this.field3505[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(IB)Z")
    public final boolean method1578(int arg0, byte arg1) {
        field3510++;
        if (arg1 != -81) {
            this.method1571(104, null, null);
        }
        if (!this.method1600(12178)) {
            return false;
        } else if (this.field3512.field8445.length == 1) {
            return this.method1570(-2, 0, arg0);
        } else if (!this.method1602((byte) -43, arg0)) {
            return false;
        } else if (this.field3512.field8445[arg0] == 1) {
            return this.method1570(arg1 ^ 0x51, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(III)Z")
    private final boolean method1579(int arg0, int arg1, int arg2) {
        field3526++;
        if (!this.method1600(12178)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && this.field3512.field8445.length > arg0 && this.field3512.field8445[arg0] > arg1) {
            return arg2 == 10867;
        } else if (class646.field8676) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1580(String arg0, int arg1) {
        field3513++;
        if (!this.method1600(12178)) {
            return false;
        }
        if (arg1 != -1) {
            this.field3505 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3512.field8444.method4203(class45.method244(0, var3), (byte) 108);
        return this.method1586((byte) -74, var4);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public final void method1581(int arg0) {
        if (arg0 != 0) {
            this.method1601((byte) -123);
        }
        field3537++;
        if (this.field3511 != null) {
            for (int var2 = 0; var2 < this.field3511.length; var2++) {
                this.field3511[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)[B")
    public final byte[] method1582(String arg0, boolean arg1, String arg2) {
        field3497++;
        if (!this.method1600(12178)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field3512.field8444.method4203(class45.method244(0, var4), (byte) 113);
        if (!this.method1602((byte) -127, var6)) {
            return null;
        }
        if (arg1) {
            this.method1582(null, false, null);
        }
        int var7 = this.field3512.field8442[var6].method4203(class45.method244(0, var5), (byte) 115);
        return this.method1572(var6, 0, var7);
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)[B")
    public final byte[] method1583(int arg0, int arg1) {
        if (arg1 >= -40) {
            this.field3505 = null;
        }
        field3523++;
        if (!this.method1600(12178)) {
            return null;
        } else if (this.field3512.field8445.length == 1) {
            return this.method1572(0, 0, arg0);
        } else if (!this.method1602((byte) -64, arg0)) {
            return null;
        } else if (this.field3512.field8445[arg0] == 1) {
            return this.method1572(arg0, 0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I")
    public final int method1584(byte arg0) {
        field3525++;
        if (arg0 < 37) {
            this.field3512 = null;
        }
        return this.method1600(12178) ? this.field3512.field8445.length : -1;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)[I")
    public final int[] method1585(int arg0, boolean arg1) {
        field3508++;
        if (!this.method1602((byte) -102, arg0)) {
            return null;
        }
        if (arg1) {
            this.method1591(103);
        }
        int[] var3 = this.field3512.field8462[arg0];
        if (var3 == null) {
            var3 = new int[this.field3512.field8457[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)Z")
    public final boolean method1586(byte arg0, int arg1) {
        field3507++;
        if (!this.method1602((byte) -73, arg1)) {
            return false;
        } else if (this.field3511[arg1] == null) {
            this.method1599(0, arg1);
            if (arg0 >= -69) {
                return true;
            } else {
                return this.field3511[arg1] != null;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1587(int arg0, String arg1) {
        field3499++;
        if (this.method1600(12178)) {
            String var3 = arg1.toLowerCase();
            int var4 = 23 / ((arg0 - 20) / 54);
            int var5 = this.field3512.field8444.method4203(class45.method244(0, var3), (byte) 111);
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(IZ)V")
    public final void method1588(int arg0, boolean arg1) {
        field3524++;
        if (this.method1602((byte) -115, arg0) && arg1 && this.field3505 != null) {
            this.field3505[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BZZ)V")
    public final void method1589(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 <= 79) {
            this.method1588(111, true);
        }
        field3527++;
        if (!this.method1600(12178)) {
            return;
        }
        if (arg1) {
            this.field3512.field8444 = null;
            this.field3512.field8452 = null;
        }
        if (arg2) {
            this.field3512.field8449 = null;
            this.field3512.field8442 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1590(int arg0, String arg1) {
        field3502++;
        int var3 = this.method1598("", false);
        return ~var3 == arg0 ? this.method1571(arg0 ^ 0x6194, arg1, "") : this.method1571(24980, "", arg1);
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)Z")
    public final boolean method1591(int arg0) {
        field3531++;
        if (!this.method1600(12178)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field3512.field8455.length; var3++) {
            int var4 = this.field3512.field8455[var3];
            if (this.field3511[var4] == null) {
                this.method1599(0, var4);
                if (this.field3511[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
    public static void method1592(int arg0) {
        if (arg0 != -8266) {
            field3529 = -77;
        }
        field3514 = null;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)I")
    public final int method1593(byte arg0) {
        if (arg0 > -76) {
            this.method1600(30);
        }
        field3534++;
        if (!this.method1600(12178)) {
            throw new IllegalStateException("");
        }
        return this.field3512.field8446;
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)V")
    public final void method1594(byte arg0) {
        if (arg0 <= 119) {
            this.method1572(25, 18, 12);
        }
        if (this.field3505 != null) {
            for (int var2 = 0; var2 < this.field3505.length; var2++) {
                this.field3505[var2] = null;
            }
        }
        field3535++;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1595(String arg0, byte arg1) {
        if (arg1 < 60) {
            this.field3532 = null;
        }
        field3518++;
        if (this.method1600(12178)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3512.field8444.method4203(class45.method244(0, var3), (byte) 111);
            this.method1573(var4, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method1596(String arg0, String arg1, int arg2) {
        field3504++;
        if (!this.method1600(12178)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3512.field8444.method4203(class45.method244(0, var4), (byte) 118);
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field3512.field8442[var6].method4203(class45.method244(arg2 ^ arg2, var5), (byte) 123);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(II)I")
    public final int method1597(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field3500 = true;
        }
        field3506++;
        return this.method1602((byte) -84, arg0) ? this.field3512.field8445[arg0] : 0;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public final int method1598(String arg0, boolean arg1) {
        field3533++;
        if (!this.method1600(12178)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3512.field8444.method4203(class45.method244(0, var3), (byte) 111);
        if (this.method1602((byte) -23, var4)) {
            return arg1 ? 21 : var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(II)V")
    private final void method1599(int arg0, int arg1) {
        field3520++;
        if (arg0 != 0) {
            field3529 = -32;
        }
        if (this.field3500) {
            this.field3511[arg1] = this.field3532.method2966(arg1, (byte) -100);
        } else {
            this.field3511[arg1] = class733.method4084(false, 824028812, this.field3532.method2966(arg1, (byte) -100));
        }
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)Z")
    private final boolean method1600(int arg0) {
        field3522++;
        if (arg0 != 12178) {
            this.field3498 = -113;
        }
        if (this.field3512 == null) {
            this.field3512 = this.field3532.method2974(true);
            if (this.field3512 == null) {
                return false;
            }
            this.field3505 = new Object[this.field3512.field8461][];
            this.field3511 = new Object[this.field3512.field8461];
        }
        return true;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lcaa;ZI)V")
    public class237(class639 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field3498 = arg2;
        this.field3532 = arg0;
        this.field3500 = arg1;
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(B)I")
    public final int method1601(byte arg0) {
        field3515++;
        if (!this.method1600(12178)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -117) {
            this.method1583(-39, -6);
        }
        for (int var4 = 0; var4 < this.field3511.length; var4++) {
            if (this.field3512.field8457[var4] > 0) {
                var2 += 100;
                var3 += this.method1574(100, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(BI)Z")
    private final boolean method1602(byte arg0, int arg1) {
        field3538++;
        if (!this.method1600(12178)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field3512.field8445.length && this.field3512.field8445[arg1] != 0) {
            return arg0 > -11 ? true : true;
        } else if (class646.field8676) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(Ljava/lang/String;B)I")
    public final int method1603(String arg0, byte arg1) {
        field3536++;
        if (!this.method1600(12178)) {
            return 0;
        } else if (arg1 > -121) {
            return 16;
        } else {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3512.field8444.method4203(class45.method244(0, var3), (byte) 113);
            return this.method1574(100, var4);
        }
    }
}
