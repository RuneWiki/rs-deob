import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class427 {

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "Llr;")
    private class105 field6052 = null;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Z")
    private boolean field6053;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "Lph;")
    private class115 field6063;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public int field6055;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
    public static int[] field6057 = new int[5];

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Z")
    public static boolean field6056 = false;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "[Ljava/lang/Object;")
    private Object[] field6076;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6067;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I", line = 6)
    public final int method2626(int arg0, int arg1) {
        field6058++;
        if (this.method2653(2, arg0)) {
            if (arg1 < 4) {
                this.method2645(-104, -109);
            }
            return this.field6052.field1548[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/lang/String;)I", line = 20)
    public final int method2627(byte arg0, String arg1) {
        field6066++;
        if (!this.method2634((byte) 104)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != -108) {
            this.method2637((String) null, (String) null, (byte) 117);
        }
        int var4 = this.field6052.field1545.method2401(arg0 + 76, class166.method1246(arg0 ^ 0x6D0F, var3));
        return this.method2636(var4, (byte) 20);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)Z", line = 40)
    public final boolean method2628(byte arg0, int arg1, int arg2) {
        int var4 = -95 % ((-arg0 - 45) / 32);
        field6062++;
        if (!this.method2654((byte) 19, arg2, arg1)) {
            return false;
        } else if (this.field6067[arg1] != null && this.field6067[arg1][arg2] != null) {
            return true;
        } else if (this.field6076[arg1] == null) {
            this.method2629(arg1, true);
            return this.field6076[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)V", line = 66)
    private final void method2629(int arg0, boolean arg1) {
        field6048++;
        if (!arg1) {
            this.method2653(87, -83);
        }
        if (this.field6053) {
            this.field6076[arg0] = this.field6063.method928(arg0, true);
        } else {
            this.field6076[arg0] = class109.method904(this.field6063.method928(arg0, arg1), (byte) 124, false);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)I", line = 82)
    public final int method2630(int arg0, byte arg1) {
        if (arg1 != -54) {
            return -97;
        }
        field6045++;
        if (this.method2634((byte) 104)) {
            int var3 = this.field6052.field1545.method2401(-49, arg0);
            return this.method2653(arg1 ^ 0xFFFFFFC8, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 102)
    public final void method2631(byte arg0) {
        if (this.field6067 != null) {
            for (int var2 = 0; var2 < this.field6067.length; var2++) {
                this.field6067[var2] = null;
            }
        }
        if (arg0 != -1) {
            this.method2630(-110, (byte) -84);
        }
        field6075++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 126)
    public final boolean method2632(String arg0, byte arg1) {
        field6072++;
        if (!this.method2634((byte) 104)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field6052.field1545.method2401(-120, class166.method1246(arg1 - 28089, var3));
        if (arg1 != 84) {
            this.method2631((byte) -50);
        }
        return this.method2645(var4, 31822);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)[B", line = 143)
    public final byte[] method2633(int arg0, int arg1, int arg2) {
        field6071++;
        return arg1 == -1 ? this.method2639(arg0, (byte) -107, (int[]) null, arg2) : null;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Z", line = 158)
    private final boolean method2634(byte arg0) {
        field6061++;
        if (arg0 != 104) {
            field6057 = null;
        }
        if (this.field6052 == null) {
            this.field6052 = this.field6063.method926(-10123);
            if (this.field6052 == null) {
                return false;
            }
            this.field6067 = new Object[this.field6052.field1547][];
            this.field6076 = new Object[this.field6052.field1547];
        }
        return true;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IB)Z", line = 196)
    public final boolean method2635(int arg0, byte arg1) {
        field6038++;
        if (!this.method2634((byte) 104)) {
            return false;
        } else if (this.field6052.field1548.length == 1) {
            return this.method2628((byte) -91, 0, arg0);
        } else if (!this.method2653(2, arg0)) {
            return false;
        } else if (this.field6052.field1548[arg0] == 1) {
            return this.method2628((byte) -116, arg0, 0);
        } else {
            int var3 = 67 % ((-arg1 - 10) / 50);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(IB)I", line = 224)
    private final int method2636(int arg0, byte arg1) {
        field6065++;
        if (!this.method2653(2, arg0)) {
            return 0;
        } else if (this.field6076[arg0] == null) {
            if (arg1 != 20) {
                this.method2650(-88, 51, -94, (int[]) null);
            }
            return this.field6063.method930(arg0, 0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B", line = 250)
    public final byte[] method2637(String arg0, String arg1, byte arg2) {
        field6042++;
        if (!this.method2634((byte) 104)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field6052.field1545.method2401(92, class166.method1246(-28005, var4));
        if (arg2 > -23) {
            this.field6063 = null;
        }
        if (this.method2653(2, var6)) {
            int var7 = this.field6052.field1549[var6].method2401(89, class166.method1246(-28005, var5));
            return this.method2633(var7, -1, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V", line = 282)
    public final void method2638(byte arg0) {
        int var2 = 51 % ((arg0 + 6) / 54);
        field6069++;
        if (this.field6076 != null) {
            for (int var3 = 0; var3 < this.field6076.length; var3++) {
                this.field6076[var3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB[II)[B", line = 303)
    public final byte[] method2639(int arg0, byte arg1, int[] arg2, int arg3) {
        field6046++;
        if (!this.method2654((byte) 19, arg0, arg3)) {
            return null;
        }
        if (this.field6067[arg3] == null || this.field6067[arg3][arg0] == null) {
            boolean var5 = this.method2650(arg3, arg0, 112, arg2);
            if (!var5) {
                this.method2629(arg3, true);
                boolean var6 = this.method2650(arg3, arg0, 57, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 >= -28) {
            return null;
        }
        byte[] var7 = class260.method1681((byte) 105, this.field6067[arg3][arg0], false);
        if (this.field6055 == 1) {
            this.field6067[arg3][arg0] = null;
            if (this.field6052.field1548[arg3] == 1) {
                this.field6067[arg3] = null;
            }
        } else if (this.field6055 == 2) {
            this.field6067[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 353)
    public static final void method2640(Component arg0, byte arg1) {
        field6078++;
        if (arg1 != -90) {
            field6056 = true;
        }
        arg0.addMouseListener(class127.field1799);
        arg0.addMouseMotionListener(class127.field1799);
        arg0.addFocusListener(class127.field1799);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)[I", line = 367)
    public final int[] method2641(int arg0, int arg1) {
        field6060++;
        if (arg1 > -123) {
            this.method2656(30, 14);
        }
        if (!this.method2653(2, arg0)) {
            return null;
        }
        int[] var3 = this.field6052.field1532[arg0];
        if (var3 == null) {
            var3 = new int[this.field6052.field1529[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(IB)V", line = 395)
    public final void method2642(int arg0, byte arg1) {
        field6059++;
        if (!this.method2653(2, arg0)) {
            return;
        }
        if (this.field6067 != null) {
            this.field6067[arg0] = null;
        }
        if (arg1 != -51) {
            this.field6067 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 413)
    public final int method2643(String arg0, int arg1) {
        field6064++;
        if (!this.method2634((byte) 104)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field6052.field1545.method2401(87, class166.method1246(-28005, var3));
        if (this.method2653(arg1 ^ 0xFFFFFFFD, var4)) {
            if (arg1 != -1) {
                method2640((Component) null, (byte) -87);
            }
            return var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 437)
    public static void method2644(int arg0) {
        if (arg0 != 0) {
            method2640((Component) null, (byte) 116);
        }
        field6057 = null;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Z", line = 448)
    public final boolean method2645(int arg0, int arg1) {
        field6049++;
        if (!this.method2653(2, arg0)) {
            return false;
        } else if (this.field6076[arg0] == null) {
            this.method2629(arg0, true);
            if (arg1 == 31822) {
                return this.field6076[arg0] != null;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZZZ)V", line = 471)
    public final void method2646(boolean arg0, boolean arg1, boolean arg2) {
        if (arg0) {
            field6050 = 87;
        }
        field6039++;
        if (!this.method2634((byte) 104)) {
            return;
        }
        if (arg1) {
            this.field6052.field1545 = null;
            this.field6052.field1530 = null;
        }
        if (arg2) {
            this.field6052.field1549 = null;
            this.field6052.field1535 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(BLjava/lang/String;)Z", line = 498)
    public final boolean method2647(byte arg0, String arg1) {
        if (arg0 >= -105) {
            this.field6055 = -124;
        }
        field6041++;
        if (this.method2634((byte) 104)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field6052.field1545.method2401(-24, class166.method1246(-28005, var3));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)Z", line = 519)
    public final boolean method2648(byte arg0) {
        if (arg0 < 103) {
            this.method2633(-49, 63, -29);
        }
        field6073++;
        if (!this.method2634((byte) 104)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field6052.field1546.length; var3++) {
            int var4 = this.field6052.field1546[var3];
            if (this.field6076[var4] == null) {
                this.method2629(var4, true);
                if (this.field6076[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(B)I", line = 558)
    public final int method2649(byte arg0) {
        field6040++;
        if (this.method2634((byte) 104)) {
            int var2 = 7 / ((arg0 + 58) / 49);
            return this.field6052.field1548.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III[I)Z", line = 574)
    private final boolean method2650(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 <= 2) {
            return true;
        }
        field6077++;
        if (!this.method2653(2, arg0)) {
            return false;
        } else if (this.field6076[arg0] == null) {
            return false;
        } else {
            int var5 = this.field6052.field1529[arg0];
            int[] var6 = this.field6052.field1532[arg0];
            if (this.field6067[arg0] == null) {
                this.field6067[arg0] = new Object[this.field6052.field1548[arg0]];
            }
            Object[] var7 = this.field6067[arg0];
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
                var11 = class260.method1681((byte) 109, this.field6076[arg0], true);
                class289 var12 = new class289(var11);
                var12.method1848(var12.field3882.length, -1657580732, 5, arg3);
            } else {
                var11 = class260.method1681((byte) 102, this.field6076[arg0], false);
            }
            byte[] var13;
            try {
                var13 = class377.method2349((byte) -103, var11);
            } catch (RuntimeException var49) {
                throw class269.method1729(var49, "T3 - " + (arg3 != null) + "," + arg0 + "," + var11.length + "," + class362.method2279((byte) 109, var11, var11.length) + "," + class362.method2279((byte) 19, var11, var11.length - 2) + "," + this.field6052.field1537[arg0] + "," + this.field6052.field1536);
            }
            if (this.field6053) {
                this.field6076[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field6055 == 0) {
                    var7[var15] = class109.method904(var13, (byte) 120, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field6055 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * 4 * var33;
                class289 var35 = new class289(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field3938 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method1856((byte) 16);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg1 == var41) {
                            var37 = var41;
                            var36 += var39;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                var35.field3938 = var34;
                int var43 = 0;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method1856((byte) 76);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg1 == var48) {
                            class152.method1170(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class289 var19 = new class289(var13);
                var19.field3938 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method1856((byte) 14);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field3938 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method1856((byte) 29);
                        class152.method1170(var13, var26, var24[var29], var20[var29], var28);
                        var20[var29] += var28;
                        var26 += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field6055 == 0) {
                        var7[var31] = class109.method904(var24[var30], (byte) 116, false);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 860)
    public final boolean method2651(String arg0, int arg1, String arg2) {
        field6070++;
        if (!this.method2634((byte) 104)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field6052.field1545.method2401(-21, class166.method1246(arg1 ^ 0x3710, var4));
        if (!this.method2653(2, var6)) {
            return false;
        }
        int var7 = this.field6052.field1549[var6].method2401(-91, class166.method1246(-28005, var5));
        if (arg1 != -23157) {
            this.field6076 = null;
        }
        return this.method2628((byte) -108, var6, var7);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)I", line = 884)
    public final int method2652(int arg0) {
        field6074++;
        if (!this.method2634((byte) 104)) {
            throw new IllegalStateException("");
        }
        if (arg0 != 21594) {
            this.method2633(-40, -116, -19);
        }
        return this.field6052.field1536;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(II)Z", line = 901)
    private final boolean method2653(int arg0, int arg1) {
        if (arg0 != 2) {
            field6050 = -61;
        }
        field6043++;
        if (!this.method2634((byte) 104)) {
            return false;
        } else if (arg1 >= 0 && this.field6052.field1548.length > arg1 && this.field6052.field1548[arg1] != 0) {
            return true;
        } else if (class29.field499) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(BII)Z", line = 927)
    private final boolean method2654(byte arg0, int arg1, int arg2) {
        field6047++;
        if (arg0 != 19) {
            this.method2627((byte) -93, (String) null);
        }
        if (!this.method2634((byte) 104)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && arg2 < this.field6052.field1548.length && this.field6052.field1548[arg2] > arg1) {
            return true;
        } else if (class29.field499) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)I", line = 961)
    public final int method2655(boolean arg0) {
        field6054++;
        if (!this.method2634((byte) 104)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6076.length; var4++) {
            if (this.field6052.field1529[var4] > 0) {
                var3 += this.method2636(var4, (byte) 20);
                var2 += 100;
            }
        }
        if (arg0) {
            this.method2646(false, true, true);
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lph;ZI)V", line = 1069)
    public class427(class115 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6053 = arg1;
        this.field6063 = arg0;
        this.field6055 = arg2;
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(II)[B", line = 1004)
    public final byte[] method2656(int arg0, int arg1) {
        field6068++;
        if (!this.method2634((byte) 104)) {
            return null;
        } else if (this.field6052.field1548.length == 1) {
            return this.method2633(arg1, -1, 0);
        } else if (!this.method2653(arg0 - 98, arg1)) {
            return null;
        } else if (this.field6052.field1548[arg1] == 1) {
            return this.method2633(0, -1, arg1);
        } else {
            if (arg0 != 100) {
                this.method2654((byte) 93, -66, -121);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(II)V", line = 1038)
    private final void method2657(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2647((byte) 122, (String) null);
        }
        field6044++;
        this.field6063.method931(arg1, (byte) 1);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 1052)
    public final void method2658(int arg0, String arg1) {
        field6051++;
        if (!this.method2634((byte) 104)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != 17266) {
            this.field6053 = true;
        }
        int var4 = this.field6052.field1545.method2401(-14, class166.method1246(arg0 - 45271, var3));
        this.method2657(0, var4);
    }
}
