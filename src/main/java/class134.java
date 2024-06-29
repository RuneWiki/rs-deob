import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class134 {

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "Lat;")
    private class387 field1777 = null;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "Z")
    private boolean field1765;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "Lrr;")
    private class268 field1744;

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "Lsf;")
    public static class398 field1770 = new class398();

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
    public static int field1775 = 0;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "[Ljava/lang/Object;")
    private Object[] field1754;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1758;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method806(int arg0) {
        field1770 = null;
        int var1 = -46 / ((28 - arg0) / 33);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lwf;I)V")
    public static final void method807(class29 arg0, int arg1) {
        field1760++;
        if (arg0.field369 != null) {
            arg0.field369.field2205 = 0;
        }
        arg0.field371 = false;
        if (arg1 != -1) {
            method807((class29) null, -46);
        }
        for (class29 var2 = arg0.method170(); var2 != null; var2 = arg0.method169()) {
            method807(var2, -1);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I[III)[B")
    public final byte[] method808(int arg0, int[] arg1, int arg2, int arg3) {
        field1752++;
        if (!this.method834(arg0, (byte) -78, arg2)) {
            return null;
        }
        if (this.field1758[arg0] == null || this.field1758[arg0][arg2] == null) {
            boolean var5 = this.method833(arg2, (byte) 25, arg1, arg0);
            if (!var5) {
                this.method831((byte) 114, arg0);
                boolean var6 = this.method833(arg2, (byte) 25, arg1, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg3 > -15) {
            return null;
        }
        byte[] var7 = client.method2789(false, this.field1758[arg0][arg2], (byte) 58);
        if (this.field1767 == 1) {
            this.field1758[arg0][arg2] = null;
            if (this.field1777.field5730[arg0] == 1) {
                this.field1758[arg0] = null;
            }
        } else if (this.field1767 == 2) {
            this.field1758[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z")
    private final boolean method809(int arg0) {
        if (arg0 < 57) {
            field1778 = 27;
        }
        field1763++;
        if (this.field1777 == null) {
            this.field1777 = this.field1744.method1671(-105);
            if (this.field1777 == null) {
                return false;
            }
            this.field1754 = new Object[this.field1777.field5714];
            this.field1758 = new Object[this.field1777.field5714][];
        }
        return true;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method810(String arg0, byte arg1) {
        field1774++;
        if (!this.method809(67)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 == -90) {
            int var4 = this.field1777.field5709.method2828(-1, class354.method2119(0, var3));
            return this.method817(var4, 122);
        } else {
            return -60;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)I")
    public final int method811(int arg0, byte arg1) {
        field1751++;
        if (!this.method809(81)) {
            return -1;
        } else if (arg1 == 55) {
            int var3 = this.field1777.field5709.method2828(arg1 - 56, arg0);
            return this.method837(29, var3) ? var3 : -1;
        } else {
            return 59;
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(IB)I")
    public final int method812(int arg0, byte arg1) {
        field1762++;
        if (this.method837(106, arg0)) {
            return arg1 == -41 ? this.field1777.field5730[arg0] : 86;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(IB)Z")
    public final boolean method813(int arg0, byte arg1) {
        field1761++;
        if (!this.method837(arg1 ^ 0xB, arg0)) {
            return false;
        } else if (this.field1754[arg0] != null) {
            return true;
        } else if (arg1 == 110) {
            this.method831((byte) 126, arg0);
            return this.field1754[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)I")
    public final int method814(int arg0) {
        field1757++;
        if (!this.method809(67)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field1754.length; var4++) {
            if (this.field1777.field5717[var4] > 0) {
                var2 += 100;
                var3 += this.method817(var4, 112);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method815(byte arg0, String arg1) {
        field1738++;
        if (!this.method809(116)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 > -5) {
            return true;
        } else {
            int var4 = this.field1777.field5709.method2828(-1, class354.method2119(0, var3));
            return var4 >= 0;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
    public final void method816(int arg0, int arg1) {
        field1753++;
        if (!this.method837(arg1 - 14, arg0)) {
            return;
        }
        if (arg1 != 100) {
            this.method812(29, (byte) 95);
        }
        if (this.field1758 != null) {
            this.field1758[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)I")
    private final int method817(int arg0, int arg1) {
        field1750++;
        if (arg1 < 88) {
            this.field1767 = -9;
        }
        if (this.method837(95, arg0)) {
            return this.field1754[arg0] == null ? this.field1744.method1670(0, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
    public final void method818(int arg0) {
        int var2 = 123 / ((arg0 - 60) / 63);
        field1764++;
        if (this.field1758 != null) {
            for (int var3 = 0; var3 < this.field1758.length; var3++) {
                this.field1758[var3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(II)V")
    private final void method819(int arg0, int arg1) {
        field1739++;
        this.field1744.method1667(arg1, true);
        if (arg0 != 1) {
            field1770 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method820(int arg0, String arg1) {
        field1771++;
        if (this.method809(90)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1777.field5709.method2828(-1, class354.method2119(arg0, var3));
            return this.method813(var4, (byte) 110);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZZB)V")
    public final void method821(boolean arg0, boolean arg1, byte arg2) {
        field1740++;
        if (arg2 < 102) {
            this.method811(8, (byte) -117);
        }
        if (!this.method809(77)) {
            return;
        }
        if (arg1) {
            this.field1777.field5716 = null;
            this.field1777.field5713 = null;
        }
        if (arg0) {
            this.field1777.field5709 = null;
            this.field1777.field5719 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(II)Z")
    public final boolean method822(int arg0, int arg1) {
        field1769++;
        if (!this.method809(108)) {
            return false;
        } else if (this.field1777.field5730.length == 1) {
            return this.method839(0, arg1, -30600);
        } else if (this.method837(65, arg1)) {
            int var3 = 13 / ((arg0 - 20) / 45);
            if (this.field1777.field5730[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method839(arg1, 0, -30600);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)[B")
    public final byte[] method823(int arg0, int arg1, int arg2) {
        field1745++;
        if (arg1 != -20334) {
            this.method837(63, 61);
        }
        return this.method808(arg0, (int[]) null, arg2, arg1 + 20277);
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)I")
    public final int method824(int arg0) {
        field1749++;
        if (this.method809(arg0 ^ 0x715B)) {
            if (arg0 != 28970) {
                field1778 = 13;
            }
            return this.field1777.field5730.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(II)[B")
    public final byte[] method825(int arg0, int arg1) {
        field1759++;
        if (!this.method809(81)) {
            return null;
        } else if (this.field1777.field5730.length == 1) {
            return this.method823(0, -20334, arg0);
        } else if (!this.method837(arg1 ^ 0x3F, arg0)) {
            return null;
        } else if (this.field1777.field5730[arg0] == 1) {
            return this.method823(arg0, -20334, 0);
        } else {
            if (arg1 != 0) {
                field1775 = 113;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1779++;
        int var7 = arg3 + arg5;
        int var8 = arg6 - arg3;
        if (arg1 != 0) {
            field1778 = -73;
        }
        for (int var9 = arg5; var9 < var7; var9++) {
            class379.method2285(arg1 ^ 0x7F, class292.field4448[var9], arg2, arg0, arg4);
        }
        int var10 = arg3 + arg4;
        for (int var11 = arg6; var11 > var8; var11--) {
            class379.method2285(arg1 ^ 0x7C, class292.field4448[var11], arg2, arg0, arg4);
        }
        int var12 = arg2 - arg3;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class292.field4448[var13];
            class379.method2285(125, var14, var10, arg0, arg4);
            class379.method2285(arg1 ^ 0x7D, var14, arg2, arg0, var12);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method827(String arg0, int arg1, String arg2) {
        field1772++;
        if (!this.method809(58)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1777.field5709.method2828(arg1 - 1, class354.method2119(arg1, var4));
        if (this.method837(116, var6)) {
            int var7 = this.field1777.field5716[var6].method2828(-1, class354.method2119(0, var5));
            return this.method823(var6, -20334, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Z")
    public final boolean method828(boolean arg0) {
        field1768++;
        if (!this.method809(118)) {
            return false;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field1777.field5708.length; var3++) {
            int var4 = this.field1777.field5708[var3];
            if (this.field1754[var4] == null) {
                this.method831((byte) 120, var4);
                if (this.field1754[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method829(String arg0, int arg1, String arg2) {
        field1756++;
        if (!this.method809(101)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1777.field5709.method2828(-1, class354.method2119(arg1, var4));
        if (this.method837(56, var6)) {
            int var7 = this.field1777.field5716[var6].method2828(arg1 - 1, class354.method2119(arg1, var5));
            return this.method839(var6, var7, -30600);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "(II)[I")
    public final int[] method830(int arg0, int arg1) {
        field1737++;
        int var3 = 106 / ((-arg0 - 43) / 58);
        if (!this.method837(62, arg1)) {
            return null;
        }
        int[] var4 = this.field1777.field5706[arg1];
        if (var4 == null) {
            var4 = new int[this.field1777.field5717[arg1]];
            int var5 = 0;
            while (var5 < var4.length) {
                var4[var5] = var5++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)V")
    private final void method831(byte arg0, int arg1) {
        if (this.field1765) {
            this.field1754[arg1] = this.field1744.method1668(arg1, 0);
        } else {
            this.field1754[arg1] = class217.method1317(false, this.field1744.method1668(arg1, 0), 9546);
        }
        if (arg0 <= 108) {
            this.method815((byte) -89, (String) null);
        }
        field1766++;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(ILjava/lang/String;)V")
    public final void method832(int arg0, String arg1) {
        field1741++;
        if (this.method809(83)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1777.field5709.method2828(arg0 - 1, class354.method2119(arg0, var3));
            this.method819(arg0 + 1, var4);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB[II)Z")
    private final boolean method833(int arg0, byte arg1, int[] arg2, int arg3) {
        field1755++;
        if (!this.method837(arg1 + 28, arg3)) {
            return false;
        } else if (this.field1754[arg3] == null) {
            return false;
        } else {
            int var5 = this.field1777.field5717[arg3];
            if (arg1 != 25) {
                field1770 = null;
            }
            int[] var6 = this.field1777.field5706[arg3];
            if (this.field1758[arg3] == null) {
                this.field1758[arg3] = new Object[this.field1777.field5730[arg3]];
            }
            Object[] var7 = this.field1758[arg3];
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
                var11 = client.method2789(true, this.field1754[arg3], (byte) 125);
                class385 var12 = new class385(var11);
                var12.method2363(5, 111, var12.field5685.length, arg2);
            } else {
                var11 = client.method2789(false, this.field1754[arg3], (byte) 70);
            }
            byte[] var13;
            try {
                var13 = class280.method1727(9, var11);
            } catch (RuntimeException var49) {
                throw class119.method718(var49, "T3 - " + (arg2 != null) + "," + arg3 + "," + var11.length + "," + class168.method1022((byte) 126, var11.length, var11) + "," + class168.method1022((byte) 126, var11.length - 2, var11) + "," + this.field1777.field5725[arg3] + "," + this.field1777.field5712);
            }
            if (this.field1765) {
                this.field1754[arg3] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field1767 == 0) {
                    var7[var48] = class217.method1317(false, var13, 9546);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field1767 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var32 * 4 * var5;
                class385 var34 = new class385(var13);
                int var35 = 0;
                int var36 = 0;
                var34.field5666 = var33;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method2354(255);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg0 == var40) {
                            var35 += var38;
                            var36 = var40;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                int var42 = 0;
                var34.field5666 = var33;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method2354(255);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg0 == var47) {
                            class129.method768(var13, var43, var41, var42, var45);
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
                int var17 = var50 - var5 * 4 * var16;
                class385 var18 = new class385(var13);
                int[] var19 = new int[var5];
                var18.field5666 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method2354(255);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field5666 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method2354(255);
                        class129.method768(var13, var25, var23[var28], var19[var28], var27);
                        var25 += var27;
                        var19[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field1767 == 0) {
                        var7[var30] = class217.method1317(false, var23[var29], 9546);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBI)Z")
    private final boolean method834(int arg0, byte arg1, int arg2) {
        field1743++;
        if (!this.method809(83)) {
            return false;
        }
        if (arg1 >= -51) {
            this.method817(63, 57);
        }
        if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field1777.field5730.length && arg2 < this.field1777.field5730[arg0]) {
            return true;
        } else if (class132.field1694) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)I")
    public final int method835(int arg0) {
        field1776++;
        if (arg0 > -55) {
            field1775 = -36;
        }
        if (!this.method809(115)) {
            throw new IllegalStateException("");
        }
        return this.field1777.field5712;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(ILjava/lang/String;)I")
    public final int method836(int arg0, String arg1) {
        field1773++;
        if (this.method809(76)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1777.field5709.method2828(arg0, class354.method2119(0, var3));
            return this.method837(113, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "(II)Z")
    private final boolean method837(int arg0, int arg1) {
        field1747++;
        if (!this.method809(62)) {
            return false;
        } else if (arg1 >= 0 && this.field1777.field5730.length > arg1 && this.field1777.field5730[arg1] != 0) {
            return arg0 >= 20;
        } else if (class132.field1694) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
    public final void method838(boolean arg0) {
        field1746++;
        if (arg0) {
            this.method821(false, true, (byte) 107);
        }
        if (this.field1754 != null) {
            for (int var2 = 0; var2 < this.field1754.length; var2++) {
                this.field1754[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(III)Z")
    public final boolean method839(int arg0, int arg1, int arg2) {
        field1748++;
        if (arg2 != -30600) {
            this.field1767 = 78;
        }
        if (!this.method834(arg0, (byte) -73, arg1)) {
            return false;
        } else if (this.field1758[arg0] != null && this.field1758[arg0][arg1] != null) {
            return true;
        } else if (this.field1754[arg0] == null) {
            this.method831((byte) 120, arg0);
            return this.field1754[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lrr;ZI)V")
    public class134(class268 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field1765 = arg1;
        this.field1744 = arg0;
        this.field1767 = arg2;
    }

    static {
        new class151("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }
}
