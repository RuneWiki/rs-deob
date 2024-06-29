import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class648 {

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "Lfga;")
    private class231 field8957 = null;

    @OriginalMember(owner = "client!sea", name = "G", descriptor = "Lig;")
    private class221 field8982;

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "Z")
    private boolean field8962;

    @OriginalMember(owner = "client!sea", name = "O", descriptor = "I")
    public int field8990;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "Llh;")
    public static class487 field8950 = new class487(75, -1);

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!sea", name = "n", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!sea", name = "o", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!sea", name = "r", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!sea", name = "u", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!sea", name = "v", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!sea", name = "w", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!sea", name = "x", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!sea", name = "y", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!sea", name = "A", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!sea", name = "B", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!sea", name = "C", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!sea", name = "D", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!sea", name = "E", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!sea", name = "F", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!sea", name = "H", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!sea", name = "I", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!sea", name = "J", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!sea", name = "K", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!sea", name = "L", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!sea", name = "N", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!sea", name = "P", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "[Ljava/lang/Object;")
    private Object[] field8951;

    @OriginalMember(owner = "client!sea", name = "M", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field8988;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)Z")
    public final boolean method3620(byte arg0) {
        field8965++;
        if (!this.method3629(false)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 != 2) {
            this.method3654(-117, -97, -57);
        }
        for (int var3 = 0; var3 < this.field8957.field3209.length; var3++) {
            int var4 = this.field8957.field3209[var3];
            if (this.field8951[var4] == null) {
                this.method3650(0, var4);
                if (this.field8951[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method3621(String arg0, int arg1, String arg2) {
        field8987++;
        if (!this.method3629(false)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field8957.field3208.method3869(false, class474.method2672(false, var4));
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field8957.field3205[var6].method3869(false, class474.method2672(false, var5));
            return arg1 <= var7;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZZZ)V")
    public final void method3622(boolean arg0, boolean arg1, boolean arg2) {
        field8953++;
        if (!this.method3629(arg1)) {
            return;
        }
        if (arg2) {
            this.field8957.field3205 = null;
            this.field8957.field3203 = null;
        }
        if (arg0) {
            this.field8957.field3208 = null;
            this.field8957.field3192 = null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Z")
    public final boolean method3623(int arg0, int arg1) {
        field8974++;
        if (!this.method3629(false)) {
            return false;
        } else if (this.field8957.field3206.length == 1) {
            return this.method3630(arg1, 0, -118);
        } else if (!this.method3627(0, arg1)) {
            return false;
        } else if (this.field8957.field3206[arg1] == 1) {
            return this.method3630(0, arg1, -125);
        } else if (arg0 >= -64) {
            return true;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method3624(byte arg0, String arg1) {
        field8986++;
        if (!this.method3629(false)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field8957.field3208.method3869(false, class474.method2672(false, var3));
        if (arg0 < 15) {
            this.field8982 = null;
        }
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method3625(String arg0, int arg1) {
        field8991++;
        if (!this.method3629(false)) {
            return false;
        }
        if (arg1 != -1) {
            this.field8957 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field8957.field3208.method3869(false, class474.method2672(false, var3));
        return this.method3651(var4, -17);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Z")
    private final boolean method3626(int arg0, int arg1, int arg2) {
        if (arg0 <= 18) {
            return false;
        }
        field8978++;
        if (!this.method3629(false)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && this.field8957.field3206.length > arg2 && this.field8957.field3206[arg2] > arg1) {
            return true;
        } else if (class538.field7258) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(II)Z")
    private final boolean method3627(int arg0, int arg1) {
        field8968++;
        if (!this.method3629(false)) {
            return false;
        } else if (arg0 <= arg1 && arg1 < this.field8957.field3206.length && this.field8957.field3206[arg1] != 0) {
            return true;
        } else if (class538.field7258) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)V")
    public final void method3628(byte arg0) {
        field8960++;
        if (arg0 != -14) {
            this.method3646(true);
        }
        if (this.field8988 != null) {
            for (int var2 = 0; var2 < this.field8988.length; var2++) {
                this.field8988[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)Z")
    private final boolean method3629(boolean arg0) {
        field8964++;
        if (arg0) {
            this.method3623(-38, 74);
        }
        if (this.field8957 == null) {
            this.field8957 = this.field8982.method846((byte) -125);
            if (this.field8957 == null) {
                return false;
            }
            this.field8988 = new Object[this.field8957.field3194][];
            this.field8951 = new Object[this.field8957.field3194];
        }
        return true;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(III)Z")
    public final boolean method3630(int arg0, int arg1, int arg2) {
        field8955++;
        if (!this.method3626(58, arg0, arg1)) {
            return false;
        } else if (this.field8988[arg1] != null && this.field8988[arg1][arg0] != null) {
            return true;
        } else if (this.field8951[arg1] == null) {
            this.method3650(0, arg1);
            if (arg2 > -115) {
                this.method3655(-94, 2);
            }
            return this.field8951[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(II)V")
    private final void method3631(int arg0, int arg1) {
        this.field8982.method852(arg1, -18926);
        field8972++;
        int var3 = -74 % ((-arg0 - 17) / 58);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)[B")
    public final byte[] method3632(boolean arg0, int arg1) {
        field8954++;
        if (!this.method3629(false)) {
            return null;
        } else if (this.field8957.field3206.length == 1) {
            return this.method3654(-15615, 0, arg1);
        } else if (!this.method3627(0, arg1)) {
            return null;
        } else if (this.field8957.field3206[arg1] == 1) {
            return this.method3654(-15615, arg1, 0);
        } else {
            if (!arg0) {
                this.method3652((byte) -116);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IB)I")
    public final int method3633(int arg0, byte arg1) {
        field8961++;
        if (arg1 != 124) {
            this.field8988 = null;
        }
        if (this.method3629(false)) {
            int var3 = this.field8957.field3208.method3869(false, arg0);
            return this.method3627(0, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II[II)[B")
    public final byte[] method3634(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 != 23323) {
            return null;
        }
        field8976++;
        if (!this.method3626(arg0 ^ 0x5B56, arg1, arg3)) {
            return null;
        }
        if (this.field8988[arg3] == null || this.field8988[arg3][arg1] == null) {
            boolean var5 = this.method3640(arg3, arg1, arg2, (byte) -91);
            if (!var5) {
                this.method3650(0, arg3);
                boolean var6 = this.method3640(arg3, arg1, arg2, (byte) -91);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class602.method3387(false, -126, this.field8988[arg3][arg1]);
        if (this.field8990 == 1) {
            this.field8988[arg3][arg1] = null;
            if (this.field8957.field3206[arg3] == 1) {
                this.field8988[arg3] = null;
            }
        } else if (this.field8990 == 2) {
            this.field8988[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3635(String arg0, byte arg1) {
        field8956++;
        if (!class426.field5971 || (class89.field1283 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class528.field7160;
        int[] var4 = class439.field6091;
        int var5 = 0;
        if (arg1 != 103) {
            field8950 = null;
        }
        while (var3 > var5) {
            class677 var6 = class671.field9407[var4[var5]];
            if (var6.field9693 != null && var6.field9693.equalsIgnoreCase(arg0) && (class143.field2063 == var6 && (class89.field1283 & 0x10) != 0 || var6 != null && (class89.field1283 & 0x8) != 0)) {
                class519.field7063++;
                class352 var7 = class290.method1786(arg1 - 5, class199.field2836, class124.field1785);
                var7.field4686.method2837(class301.field4099, -2);
                var7.field4686.method2823(var4[var5], -107);
                var7.field4686.method2817(0, true);
                var7.field4686.method2856(class340.field4555, (byte) -58);
                var7.field4686.method2823(class544.field7389, -96);
                class602.method3388(var7, (byte) 28);
                class151.method1091(var6.field1801[0], true, 0, 3762, -2, var6.field1807[0], 0, var6.method881(arg1 - 214), var6.method881(arg1 - 224));
                var2 = true;
                break;
            }
            var5++;
        }
        if (!var2) {
            class114.method819((byte) -102, 4, class65.field809.method555(class697.field9900, true) + arg0);
        }
        if (class426.field5971) {
            class114.method820((byte) -124);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)I")
    private final int method3636(int arg0, boolean arg1) {
        field8977++;
        if (!this.method3627(0, arg0)) {
            return 0;
        } else if (this.field8951[arg0] == null) {
            if (arg1) {
                this.method3630(-33, 97, 24);
            }
            return this.field8982.method844(-87, arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method3637(boolean arg0, String arg1) {
        field8981++;
        int var3 = this.method3643("", 1);
        if (var3 == -1) {
            if (arg0) {
                this.field8990 = -71;
            }
            return this.method3639(105, arg1, "");
        } else {
            return this.method3639(108, "", arg1);
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(ZLjava/lang/String;)I")
    public final int method3638(boolean arg0, String arg1) {
        field8971++;
        if (this.method3629(arg0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field8957.field3208.method3869(arg0, class474.method2672(false, var3));
            return this.method3636(var4, arg0);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    private final boolean method3639(int arg0, String arg1, String arg2) {
        field8983++;
        if (!this.method3629(false)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field8957.field3208.method3869(false, class474.method2672(false, var4));
        if (this.method3627(0, var6)) {
            int var7 = this.field8957.field3205[var6].method3869(false, class474.method2672(false, var5));
            int var8 = 100 % ((arg0 - 35) / 60);
            return this.method3630(var7, var6, -122);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II[IB)Z")
    private final boolean method3640(int arg0, int arg1, int[] arg2, byte arg3) {
        field8963++;
        if (!this.method3627(0, arg0)) {
            return false;
        } else if (this.field8951[arg0] == null) {
            return false;
        } else {
            int var5 = this.field8957.field3196[arg0];
            int[] var6 = this.field8957.field3207[arg0];
            if (this.field8988[arg0] == null) {
                this.field8988[arg0] = new Object[this.field8957.field3206[arg0]];
            }
            Object[] var7 = this.field8988[arg0];
            if (arg3 != -91) {
                this.field8962 = true;
            }
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
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var11 = class602.method3387(true, arg3 - 37, this.field8951[arg0]);
                class501 var12 = new class501(var11);
                var12.method2825((byte) 80, 5, arg2, var12.field6855.length);
            } else {
                var11 = class602.method3387(false, -127, this.field8951[arg0]);
            }
            byte[] var13;
            try {
                var13 = class525.method2993(true, var11);
            } catch (RuntimeException var49) {
                throw class521.method2966(var49, "T3 - " + (arg2 != null) + "," + arg0 + "," + var11.length + "," + class128.method911(arg3 + 2, var11.length, var11) + "," + class128.method911(arg3 + 10, var11.length + -2, var11) + "," + this.field8957.field3199[arg0] + "," + this.field8957.field3204);
            }
            if (this.field8962) {
                this.field8951[arg0] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field8990 == 0) {
                    var7[var48] = class697.method3912(var13, 0, false);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field8990 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * 4 * var32;
                class501 var34 = new class501(var13);
                int var35 = 0;
                var34.field6892 = var33;
                int var36 = 0;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method2840(false);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg1 == var40) {
                            var35 += var38;
                            var36 = var40;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field6892 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method2840(false);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg1 == var47) {
                            class359.method2053(var13, var43, var41, var42, var45);
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
                int var17 = var50 - var16 * 4 * var5;
                class501 var18 = new class501(var13);
                int[] var19 = new int[var5];
                var18.field6892 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method2840(false);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field6892 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method2840(false);
                        class359.method2053(var13, var25, var23[var28], var19[var28], var27);
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
                    if (this.field8990 == 0) {
                        var7[var30] = class697.method3912(var23[var29], 0, false);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "(II)V")
    public final void method3641(int arg0, int arg1) {
        field8952++;
        if (this.method3627(arg1, arg0) && this.field8988 != null) {
            this.field8988[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method3642(int arg0, String arg1, String arg2) {
        field8984++;
        if (arg0 <= 73) {
            this.method3639(-127, null, null);
        }
        if (!this.method3629(false)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field8957.field3208.method3869(false, class474.method2672(false, var4));
        if (this.method3627(0, var6)) {
            int var7 = this.field8957.field3205[var6].method3869(false, class474.method2672(false, var5));
            return this.method3654(-15615, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method3643(String arg0, int arg1) {
        field8970++;
        if (this.method3629(false)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field8957.field3208.method3869(false, class474.method2672(false, var3));
            return this.method3627(arg1 ^ arg1, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method3644(int arg0, String arg1) {
        field8958++;
        if (!this.method3629(false)) {
            return;
        }
        if (arg0 > -60) {
            this.method3633(-27, (byte) -12);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field8957.field3208.method3869(false, class474.method2672(false, var3));
        this.method3631(-125, var4);
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(B)V")
    public static final void method3645(byte arg0) {
        field8979++;
        if (class521.field7090 == 6) {
            class521.field7090 = 7;
            int var1 = -101 % ((-arg0 - 31) / 38);
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(Z)V")
    public final void method3646(boolean arg0) {
        if (this.field8951 != null) {
            for (int var2 = 0; var2 < this.field8951.length; var2++) {
                this.field8951[var2] = null;
            }
        }
        field8989++;
        if (!arg0) {
            this.field8951 = null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)I")
    public final int method3647(int arg0) {
        field8967++;
        if (!this.method3629(false)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field8951.length; var4++) {
            if (this.field8957.field3196[var4] > 0) {
                var3 += this.method3636(var4, false);
                var2 += 100;
            }
        }
        if (arg0 != 2) {
            this.field8962 = false;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "(B)V")
    public static void method3648(byte arg0) {
        if (arg0 != 32) {
            field8950 = null;
        }
        field8950 = null;
    }

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "(B)I")
    public final int method3649(byte arg0) {
        field8985++;
        if (arg0 != 112) {
            this.field8962 = true;
        }
        return this.method3629(false) ? this.field8957.field3206.length : -1;
    }

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "(II)V")
    private final void method3650(int arg0, int arg1) {
        field8966++;
        if (this.field8962) {
            this.field8951[arg1] = this.field8982.method849(arg1, class324.method1944(arg0, -10122));
        } else {
            this.field8951[arg1] = class697.method3912(this.field8982.method849(arg1, -10122), arg0, false);
        }
        if (arg0 != 0) {
            this.method3629(true);
        }
    }

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "(II)Z")
    public final boolean method3651(int arg0, int arg1) {
        field8969++;
        if (!this.method3627(0, arg0)) {
            return false;
        } else if (this.field8951[arg0] == null) {
            this.method3650(arg1 + 17, arg0);
            if (arg1 != -17) {
                this.method3647(-59);
            }
            return this.field8951[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "(B)I")
    public final int method3652(byte arg0) {
        field8975++;
        if (!this.method3629(false)) {
            throw new IllegalStateException("");
        }
        return arg0 == 27 ? this.field8957.field3204 : -15;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(IZ)I")
    public final int method3653(int arg0, boolean arg1) {
        field8973++;
        if (this.method3627(0, arg0)) {
            if (!arg1) {
                this.field8951 = null;
            }
            return this.field8957.field3206[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(III)[B")
    public final byte[] method3654(int arg0, int arg1, int arg2) {
        field8959++;
        if (arg0 != -15615) {
            this.method3623(21, -106);
        }
        return this.method3634(arg0 ^ 0xFFFF981A, arg2, null, arg1);
    }

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "(II)[I")
    public final int[] method3655(int arg0, int arg1) {
        field8980++;
        if (!this.method3627(arg0, arg1)) {
            return null;
        }
        int[] var3 = this.field8957.field3207[arg1];
        if (var3 == null) {
            var3 = new int[this.field8957.field3196[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lig;ZI)V")
    public class648(class221 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field8982 = arg0;
        this.field8962 = arg1;
        this.field8990 = arg2;
    }
}
