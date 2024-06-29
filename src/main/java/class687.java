import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class687 {

    @OriginalMember(owner = "client!kha", name = "o", descriptor = "Loba;")
    private class347 field9719 = null;

    @OriginalMember(owner = "client!kha", name = "C", descriptor = "Z")
    private boolean field9733;

    @OriginalMember(owner = "client!kha", name = "q", descriptor = "Lmc;")
    private class339 field9721;

    @OriginalMember(owner = "client!kha", name = "p", descriptor = "I")
    public int field9720;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!kha", name = "i", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!kha", name = "j", descriptor = "I")
    public static int field9714;

    @OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!kha", name = "l", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!kha", name = "m", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!kha", name = "n", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!kha", name = "r", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!kha", name = "t", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!kha", name = "u", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!kha", name = "v", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!kha", name = "w", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!kha", name = "x", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!kha", name = "A", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!kha", name = "B", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!kha", name = "D", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!kha", name = "F", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!kha", name = "G", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!kha", name = "H", descriptor = "I")
    public static int field9738;

    @OriginalMember(owner = "client!kha", name = "I", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!kha", name = "J", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!kha", name = "K", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!kha", name = "L", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!kha", name = "M", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!kha", name = "N", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!kha", name = "O", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!kha", name = "y", descriptor = "Lkha;")
    public static class687 field9729;

    @OriginalMember(owner = "client!kha", name = "E", descriptor = "[Ljava/lang/Object;")
    private Object[] field9735;

    @OriginalMember(owner = "client!kha", name = "s", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field9723;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)[B", line = 5)
    public final byte[] method3810(int arg0, int arg1, int arg2) {
        if (arg1 != -23360) {
            field9708 = 106;
        }
        field9722++;
        return this.method3828(arg0, null, arg2, arg1 ^ 0xFFFFA4C2);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IBI)Z", line = 18)
    public final boolean method3811(int arg0, byte arg1, int arg2) {
        field9726++;
        if (!this.method3815(arg2, arg0, (byte) -98)) {
            return false;
        } else if (this.field9723[arg2] != null && this.field9723[arg2][arg0] != null) {
            return true;
        } else if (this.field9735[arg2] == null) {
            if (arg1 != 101) {
                this.field9720 = -87;
            }
            this.method3834((byte) 93, arg2);
            return this.field9735[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(II)I", line = 45)
    public final int method3812(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method3815(20, -7, (byte) -2);
        }
        field9712++;
        return this.method3837(true, arg1) ? this.field9719.field4485[arg1] : 0;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", line = 60)
    public final byte[] method3813(String arg0, String arg1, int arg2) {
        field9715++;
        if (!this.method3841(false)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field9719.field4495.method482(class198.method1241(var4, (byte) -125), (byte) -77);
        if (arg2 >= -20) {
            return null;
        } else if (this.method3837(true, var6)) {
            int var7 = this.field9719.field4502[var6].method482(class198.method1241(var5, (byte) -110), (byte) -72);
            return this.method3810(var6, -23360, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V", line = 87)
    public static void method3814(int arg0) {
        if (arg0 != 1) {
            method3814(0);
        }
        field9729 = null;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIB)Z", line = 101)
    private final boolean method3815(int arg0, int arg1, byte arg2) {
        field9705++;
        if (!this.method3841(false)) {
            return false;
        } else if (arg2 >= -81) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field9719.field4485.length && arg1 < this.field9719.field4485[arg0]) {
            return true;
        } else if (class589.field8222) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)I", line = 131)
    public final int method3816(int arg0) {
        if (arg0 >= -124) {
            this.field9723 = null;
        }
        field9709++;
        return this.method3841(false) ? this.field9719.field4485.length : -1;
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(II)[I", line = 147)
    public final int[] method3817(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field9733 = false;
        }
        field9716++;
        if (!this.method3837(true, arg0)) {
            return null;
        }
        int[] var3 = this.field9719.field4500[arg0];
        if (var3 == null) {
            var3 = new int[this.field9719.field4492[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(BI)Z", line = 177)
    public final boolean method3818(byte arg0, int arg1) {
        field9736++;
        if (!this.method3837(true, arg1)) {
            return false;
        } else if (this.field9735[arg1] == null) {
            this.method3834((byte) -125, arg1);
            if (this.field9735[arg1] == null) {
                if (arg0 != 81) {
                    field9729 = null;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(II[II)Z", line = 207)
    private final boolean method3819(int arg0, int arg1, int[] arg2, int arg3) {
        field9741++;
        if (!this.method3837(true, arg0)) {
            return false;
        } else if (this.field9735[arg0] == null) {
            return false;
        } else {
            int var5 = this.field9719.field4492[arg0];
            int[] var6 = this.field9719.field4500[arg0];
            if (this.field9723[arg0] == null) {
                this.field9723[arg0] = new Object[this.field9719.field4485[arg0]];
            }
            Object[] var7 = this.field9723[arg0];
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
            if (arg3 >= -106) {
                this.field9721 = null;
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var11 = class638.method3459(-32767, this.field9735[arg0], false);
            } else {
                var11 = class638.method3459(-32767, this.field9735[arg0], true);
                class179 var12 = new class179(var11);
                var12.method1142(5, arg2, var12.field2325.length, -27816);
            }
            byte[] var13;
            try {
                var13 = class66.method503(var11, -1);
            } catch (RuntimeException var49) {
                throw class77.method558(var49, "T3 - " + (arg2 != null) + "," + arg0 + "," + var11.length + "," + class27.method275(var11.length, -8, var11) + "," + class27.method275(var11.length - 2, -10, var11) + "," + this.field9719.field4499[arg0] + "," + this.field9719.field4498);
            }
            if (this.field9733) {
                this.field9735[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field9720 == 0) {
                    var7[var15] = class574.method3222(var13, (byte) -103, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field9720 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * 4 * var17;
                class179 var19 = new class179(var13);
                int var20 = 0;
                var19.field2354 = var18;
                int var21 = 0;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method1095((byte) 116);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg1 == var25) {
                            var20 += var23;
                            var21 = var25;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                var19.field2354 = var18;
                int var27 = 0;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method1095((byte) 118);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg1 == var32) {
                            class617.method3389(var13, var28, var26, var27, var30);
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
                int var35 = var51 - var5 * 4 * var34;
                class179 var36 = new class179(var13);
                int[] var37 = new int[var5];
                var36.field2354 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method1095((byte) 122);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field2354 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method1095((byte) 114);
                        class617.method3389(var13, var43, var41[var46], var37[var46], var45);
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
                    if (this.field9720 == 0) {
                        var7[var48] = class574.method3222(var41[var47], (byte) -105, false);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 494)
    public final int method3820(String arg0, int arg1) {
        field9739++;
        if (!this.method3841(false)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != -1) {
            this.field9735 = null;
        }
        int var4 = this.field9719.field4495.method482(class198.method1241(var3, (byte) -111), (byte) -125);
        return this.method3837(true, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 516)
    public final boolean method3821(int arg0, String arg1) {
        field9727++;
        if (!this.method3841(false)) {
            return false;
        }
        if (arg0 != 8933) {
            this.method3825(null, (byte) -12);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field9719.field4495.method482(class198.method1241(var3, (byte) -108), (byte) 123);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(II)I", line = 538)
    private final int method3822(int arg0, int arg1) {
        field9710++;
        if (!this.method3837(true, arg0)) {
            return 0;
        } else if (arg1 == 100) {
            return this.field9735[arg0] == null ? this.field9721.method1986(arg0, (byte) 125) : 100;
        } else {
            return 25;
        }
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 556)
    public final int method3823(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field9733 = true;
        }
        field9711++;
        if (this.method3841(false)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field9719.field4495.method482(class198.method1241(var3, (byte) -126), (byte) 118);
            return this.method3822(var4, 100);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IB)I", line = 575)
    public final int method3824(int arg0, byte arg1) {
        field9742++;
        if (!this.method3841(false)) {
            return -1;
        }
        int var3 = this.field9719.field4495.method482(arg0, (byte) 111);
        if (this.method3837(true, var3)) {
            if (arg1 != -59) {
                this.field9721 = null;
            }
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 599)
    public final boolean method3825(String arg0, byte arg1) {
        field9745++;
        if (!this.method3841(false)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field9719.field4495.method482(class198.method1241(var3, (byte) -115), (byte) -66);
        if (arg1 >= -113) {
            this.method3817(-19, 55);
        }
        return this.method3818((byte) 81, var4);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZZB)V", line = 616)
    public final void method3826(boolean arg0, boolean arg1, byte arg2) {
        field9744++;
        if (arg2 != -2) {
            this.field9723 = null;
        }
        if (!this.method3841(false)) {
            return;
        }
        if (arg1) {
            this.field9719.field4489 = null;
            this.field9719.field4502 = null;
        }
        if (arg0) {
            this.field9719.field4503 = null;
            this.field9719.field4495 = null;
        }
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(IB)Z", line = 641)
    public final boolean method3827(int arg0, byte arg1) {
        if (arg1 <= 43) {
            return false;
        }
        field9730++;
        if (!this.method3841(false)) {
            return false;
        } else if (this.field9719.field4485.length == 1) {
            return this.method3811(arg0, (byte) 101, 0);
        } else if (!this.method3837(true, arg0)) {
            return false;
        } else if (this.field9719.field4485[arg0] == 1) {
            return this.method3811(0, (byte) 101, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I[III)[B", line = 667)
    public final byte[] method3828(int arg0, int[] arg1, int arg2, int arg3) {
        field9714++;
        if (!this.method3815(arg0, arg2, (byte) -94)) {
            return null;
        }
        if (this.field9723[arg0] == null || this.field9723[arg0][arg2] == null) {
            boolean var5 = this.method3819(arg0, arg2, arg1, -107);
            if (!var5) {
                this.method3834((byte) -118, arg0);
                boolean var6 = this.method3819(arg0, arg2, arg1, arg3 ^ 0xFFFFFF89);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class638.method3459(-32767, this.field9723[arg0][arg2], false);
        if (arg3 != 2) {
            field9708 = -73;
        }
        if (this.field9720 == 1) {
            this.field9723[arg0][arg2] = null;
            if (this.field9719.field4485[arg0] == 1) {
                this.field9723[arg0] = null;
            }
        } else if (this.field9720 == 2) {
            this.field9723[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)Z", line = 717)
    public final boolean method3829(byte arg0) {
        field9737++;
        if (!this.method3841(false)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 != -27) {
            this.method3832(6);
        }
        for (int var3 = 0; var3 < this.field9719.field4496.length; var3++) {
            int var4 = this.field9719.field4496[var3];
            if (this.field9735[var4] == null) {
                this.method3834((byte) -127, var4);
                if (this.field9735[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V", line = 754)
    public final void method3830(int arg0) {
        field9707++;
        if (arg0 >= -51) {
            this.method3834((byte) 8, 42);
        }
        if (this.field9735 != null) {
            for (int var2 = 0; var2 < this.field9735.length; var2++) {
                this.field9735[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "(II)V", line = 779)
    public final void method3831(int arg0, int arg1) {
        if (arg0 >= 86) {
            field9734++;
            if (this.method3837(true, arg1) && this.field9723 != null) {
                this.field9723[arg1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "(I)I", line = 796)
    public final int method3832(int arg0) {
        field9728++;
        if (arg0 < 57) {
            this.field9721 = null;
        }
        if (!this.method3841(false)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field9735.length; var4++) {
            if (this.field9719.field4492[var4] > 0) {
                var2 += 100;
                var3 += this.method3822(var4, 100);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)I", line = 835)
    public final int method3833(byte arg0) {
        field9740++;
        int var2 = -107 % ((7 - arg0) / 63);
        if (!this.method3841(false)) {
            throw new IllegalStateException("");
        }
        return this.field9719.field4498;
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(BI)V", line = 849)
    private final void method3834(byte arg0, int arg1) {
        int var3 = 106 % ((arg0 + 57) / 55);
        if (this.field9733) {
            this.field9735[arg1] = this.field9721.method1987(arg1, (byte) -90);
        } else {
            this.field9735[arg1] = class574.method3222(this.field9721.method1987(arg1, (byte) -125), (byte) -83, false);
        }
        field9706++;
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(B)V", line = 863)
    public final void method3835(byte arg0) {
        field9718++;
        if (arg0 == -106 && this.field9723 != null) {
            for (int var2 = 0; var2 < this.field9723.length; var2++) {
                this.field9723[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IZ)[B", line = 891)
    public final byte[] method3836(int arg0, boolean arg1) {
        field9731++;
        if (!this.method3841(false)) {
            return null;
        } else if (this.field9719.field4485.length == 1) {
            return this.method3810(0, -23360, arg0);
        } else if (!this.method3837(arg1, arg0)) {
            return null;
        } else if (this.field9719.field4485[arg0] == 1) {
            return this.method3810(arg0, -23360, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZI)Z", line = 916)
    private final boolean method3837(boolean arg0, int arg1) {
        field9725++;
        if (!arg0) {
            return false;
        } else if (!this.method3841(false)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field9719.field4485.length && this.field9719.field4485[arg1] != 0) {
            return true;
        } else if (class589.field8222) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 945)
    public final void method3838(boolean arg0, String arg1) {
        field9738++;
        if (this.method3841(arg0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field9719.field4495.method482(class198.method1241(var3, (byte) -123), (byte) 127);
            this.method3842(var4, 127);
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 971)
    private final boolean method3839(String arg0, int arg1, String arg2) {
        field9724++;
        if (!this.method3841(false)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field9719.field4495.method482(class198.method1241(var4, (byte) -109), (byte) 113);
        int var7 = -114 / ((2 - arg1) / 55);
        if (this.method3837(true, var6)) {
            int var8 = this.field9719.field4502[var6].method482(class198.method1241(var5, (byte) -106), (byte) -16);
            return this.method3811(var8, (byte) 101, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lmc;ZI)V", line = 1023)
    public class687(class339 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field9733 = arg1;
        this.field9721 = arg0;
        this.field9720 = arg2;
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(Ljava/lang/String;I)Z", line = 1010)
    public final boolean method3840(String arg0, int arg1) {
        field9743++;
        int var3 = this.method3820("", arg1);
        return var3 == -1 ? this.method3839(arg0, -107, "") : this.method3839("", 61, arg0);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)Z", line = 1037)
    private final boolean method3841(boolean arg0) {
        field9713++;
        if (arg0) {
            this.method3826(true, true, (byte) -63);
        }
        if (this.field9719 == null) {
            this.field9719 = this.field9721.method1983(-102);
            if (this.field9719 == null) {
                return false;
            }
            this.field9735 = new Object[this.field9719.field4505];
            this.field9723 = new Object[this.field9719.field4505][];
        }
        return true;
    }

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "(II)V", line = 1060)
    private final void method3842(int arg0, int arg1) {
        int var3 = 70 % ((84 - arg1) / 38);
        this.field9721.method1985(-119, arg0);
        field9717++;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z", line = 1071)
    public final boolean method3843(String arg0, String arg1, boolean arg2) {
        field9732++;
        if (!this.method3841(false)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        if (!arg2) {
            this.method3820(null, -14);
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field9719.field4495.method482(class198.method1241(var4, (byte) -113), (byte) -128);
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field9719.field4502[var6].method482(class198.method1241(var5, (byte) -122), (byte) -66);
            return var7 >= 0;
        }
    }
}
