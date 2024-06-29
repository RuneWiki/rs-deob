import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class105 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lp;")
    private class125 field1793 = null;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Z")
    private boolean field1820;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Lnf;")
    private class235 field1813;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "Z")
    private boolean field1827;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "Lda;")
    public static class275 field1828 = class255.method1672(101, ")4p=");

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public static int field1829 = 0;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "[I")
    public static int[] field1832 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lma;")
    public static class105 field1800;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[Ljava/lang/Object;")
    private Object[] field1794;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1811;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Z")
    private final boolean method755(int arg0, int arg1, int arg2) {
        field1830++;
        if (!this.method786(-128)) {
            return false;
        }
        if (arg0 != 19596) {
            this.method777((byte) -5, 90, 53);
        }
        if (arg1 >= 0 && arg2 >= 0 && this.field1793.field2247.length > arg1 && arg2 < this.field1793.field2247[arg1]) {
            return true;
        } else if (class232.field4065) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZZZ)V")
    public final void method756(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field1815++;
        if (!this.method786(62)) {
            return;
        }
        if (arg1) {
            this.field1793.field2238 = null;
            this.field1793.field2237 = null;
        }
        if (arg0) {
            this.field1793.field2241 = null;
            this.field1793.field2234 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V")
    public final void method757(byte arg0, int arg1) {
        field1808++;
        if (!this.method774(0, arg1)) {
            return;
        }
        if (this.field1811 != null) {
            this.field1811[arg1] = null;
        }
        if (arg0 != 5) {
            this.method764(97);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lda;I)Z")
    public final boolean method758(class275 arg0, int arg1) {
        field1816++;
        if (!this.method786(-95)) {
            return false;
        }
        class275 var3 = arg0.method1831((byte) -119);
        if (arg1 != 127) {
            this.method761(false, 93);
        }
        int var4 = this.field1793.field2238.method349((byte) -1, var3.method1830((byte) -89));
        return this.method770((byte) 44, var4);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILda;Lda;)Z")
    public final boolean method759(int arg0, class275 arg1, class275 arg2) {
        field1807++;
        if (!this.method786(119)) {
            return false;
        }
        if (arg0 != 6715) {
            this.field1827 = true;
        }
        class275 var4 = arg1.method1831((byte) -110);
        class275 var5 = arg2.method1831((byte) -98);
        int var6 = this.field1793.field2238.method349((byte) -1, var4.method1830((byte) -89));
        if (this.method774(0, var6)) {
            int var7 = this.field1793.field2241[var6].method349((byte) -1, var5.method1830((byte) -89));
            return this.method777((byte) -60, var7, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[B")
    public final byte[] method760(int arg0, int arg1) {
        field1796++;
        if (!this.method786(46)) {
            return null;
        } else if (this.field1793.field2247.length == 1) {
            return this.method775(0, arg1, -24799);
        } else if (!this.method774(arg0, arg1)) {
            return null;
        } else if (this.field1793.field2247[arg1] == 1) {
            return this.method775(arg1, 0, -24799);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)[I")
    public final int[] method761(boolean arg0, int arg1) {
        field1798++;
        if (!this.method774(0, arg1)) {
            return null;
        }
        int[] var3 = this.field1793.field2224[arg1];
        if (var3 == null) {
            var3 = new int[this.field1793.field2225[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        if (!arg0) {
            this.field1813 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public final void method762(byte arg0) {
        field1831++;
        if (arg0 < 22) {
            field1828 = null;
        }
        if (this.field1811 != null) {
            for (int var2 = 0; var2 < this.field1811.length; var2++) {
                this.field1811[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V")
    private final void method763(int arg0, int arg1) {
        if (arg0 != -15107) {
            this.field1811 = null;
        }
        if (this.field1827) {
            this.field1794[arg1] = this.field1813.method340((byte) -34, arg1);
        } else {
            this.field1794[arg1] = class159.method1115(false, this.field1813.method340((byte) -34, arg1), false);
        }
        field1809++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
    public final int method764(int arg0) {
        field1825++;
        if (!this.method786(arg0 ^ 0x31)) {
            return 0;
        } else if (arg0 == 31) {
            int var2 = 0;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1794.length; var4++) {
                if (this.field1793.field2225[var4] > 0) {
                    var2 += 100;
                    var3 += this.method769((byte) 84, var4);
                }
            }
            if (var2 == 0) {
                return 100;
            } else {
                return var3 * 100 / var2;
            }
        } else {
            return -92;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static void method765(int arg0) {
        field1828 = null;
        field1832 = null;
        field1800 = null;
        if (arg0 != 511) {
            method765(-67);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lda;B)I")
    public final int method766(class275 arg0, byte arg1) {
        field1812++;
        if (this.method786(-106)) {
            class275 var3 = arg0.method1831((byte) -89);
            int var4 = 82 % ((arg1 + 1) / 46);
            int var5 = this.field1793.field2238.method349((byte) -1, var3.method1830((byte) -89));
            return this.method769((byte) 68, var5);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILda;)I")
    public final int method767(int arg0, class275 arg1) {
        field1806++;
        if (!this.method786(60)) {
            return -1;
        }
        class275 var3 = arg1.method1831((byte) -105);
        int var4 = this.field1793.field2238.method349((byte) -1, var3.method1830((byte) -89));
        if (arg0 == 524287) {
            return this.method774(0, var4) ? var4 : -1;
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLda;)Z")
    public final boolean method768(boolean arg0, class275 arg1) {
        field1801++;
        if (!this.method786(-98)) {
            return false;
        }
        class275 var3 = arg1.method1831((byte) -87);
        if (arg0) {
            return true;
        } else {
            int var4 = this.field1793.field2238.method349((byte) -1, var3.method1830((byte) -89));
            return var4 >= 0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)I")
    private final int method769(byte arg0, int arg1) {
        if (arg0 < 57) {
            return 59;
        }
        field1802++;
        if (this.method774(0, arg1)) {
            return this.field1794[arg1] == null ? this.field1813.method339(arg1, 117) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(BI)Z")
    public final boolean method770(byte arg0, int arg1) {
        field1810++;
        if (!this.method774(arg0 ^ 0x2C, arg1)) {
            return false;
        } else if (arg0 != 44) {
            return true;
        } else if (this.field1794[arg1] == null) {
            this.method763(-15107, arg1);
            return this.field1794[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lda;B)V")
    public final void method771(class275 arg0, byte arg1) {
        field1817++;
        if (this.method786(-128)) {
            class275 var3 = arg0.method1831((byte) -70);
            int var4 = this.field1793.field2238.method349((byte) -1, var3.method1830((byte) -89));
            this.method783(var4, -28357);
            int var5 = 89 % ((37 - arg1) / 36);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)I")
    public final int method772(int arg0) {
        field1797++;
        if (!this.method786(arg0 ^ 0xFFF00063)) {
            throw new IllegalStateException("");
        }
        if (arg0 != 1048575) {
            this.field1793 = null;
        }
        return this.field1793.field2231;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)I")
    public final int method773(boolean arg0) {
        if (arg0) {
            field1821++;
            return this.method786(-99) ? this.field1793.field2247.length : -1;
        } else {
            return -41;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)Z")
    private final boolean method774(int arg0, int arg1) {
        if (arg0 != 0) {
            return true;
        }
        field1823++;
        if (!this.method786(arg0 + 45)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field1793.field2247.length && this.field1793.field2247[arg1] != 0) {
            return true;
        } else if (class232.field4065) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)[B")
    public final byte[] method775(int arg0, int arg1, int arg2) {
        field1814++;
        return arg2 == -24799 ? this.method778(6716, (int[]) null, arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIB)Z")
    private final boolean method776(int[] arg0, int arg1, byte arg2) {
        field1805++;
        if (!this.method774(arg2 ^ 0x5A, arg1)) {
            return false;
        } else if (this.field1794[arg1] == null) {
            return false;
        } else {
            int var4 = this.field1793.field2225[arg1];
            int[] var5 = this.field1793.field2224[arg1];
            boolean var6 = true;
            if (this.field1811[arg1] == null) {
                this.field1811[arg1] = new Object[this.field1793.field2247[arg1]];
            }
            Object[] var7 = this.field1811[arg1];
            if (arg2 != 90) {
                this.method775(-49, -107, -98);
            }
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var10 = class54.method347(arg2 ^ 0x5B, this.field1794[arg1], false);
            } else {
                var10 = class54.method347(1, this.field1794[arg1], true);
                class85 var11 = new class85(var10);
                var11.method589(true, var11.field1381.length, 5, arg0);
            }
            byte[] var12;
            try {
                var12 = class169.method1161((byte) -75, var10);
            } catch (RuntimeException var31) {
                throw class86.method614(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class235.method1529(0, var10.length, var10) + "," + class235.method1529(0, var10.length - 2, var10) + "," + this.field1793.field2243[arg1] + "," + this.field1793.field2231);
            }
            if (this.field1827) {
                this.field1794[arg1] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field1820) {
                    var7[var14] = var12;
                } else {
                    var7[var14] = class159.method1115(false, var12, false);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                class85 var17 = new class85(var12);
                int[] var18 = new int[var4];
                int var19 = var32 - var4 * var16 * 4;
                var17.field1392 = var19;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        var21 += var17.method568(19845);
                        var18[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var18[var24]];
                    var18[var24] = 0;
                }
                var17.field1392 = var19;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var17.method568(arg2 ^ 0x4DDF);
                        class154.method1085(var12, var25, var23[var28], var18[var28], var27);
                        var18[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field1820) {
                        var7[var30] = var23[var29];
                    } else {
                        var7[var30] = class159.method1115(false, var23[var29], false);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BII)Z")
    public final boolean method777(byte arg0, int arg1, int arg2) {
        field1826++;
        if (arg0 != -60) {
            this.method764(-27);
        }
        if (!this.method755(arg0 + 19656, arg2, arg1)) {
            return false;
        } else if (this.field1811[arg2] != null && this.field1811[arg2][arg1] != null) {
            return true;
        } else if (this.field1794[arg2] == null) {
            this.method763(-15107, arg2);
            return this.field1794[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[III)[B")
    public final byte[] method778(int arg0, int[] arg1, int arg2, int arg3) {
        field1833++;
        if (!this.method755(19596, arg2, arg3)) {
            return null;
        }
        if (arg0 != 6716) {
            this.field1793 = null;
        }
        if (this.field1811[arg2] == null || this.field1811[arg2][arg3] == null) {
            boolean var5 = this.method776(arg1, arg2, (byte) 90);
            if (!var5) {
                this.method763(arg0 - 21823, arg2);
                boolean var6 = this.method776(arg1, arg2, (byte) 90);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class54.method347(1, this.field1811[arg2][arg3], false);
        if (this.field1820) {
            this.field1811[arg2][arg3] = null;
            if (this.field1793.field2247[arg2] == 1) {
                this.field1811[arg2] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(BI)I")
    public final int method779(byte arg0, int arg1) {
        field1819++;
        if (this.method774(0, arg1)) {
            return arg0 > -38 ? -104 : this.field1793.field2247[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(BII)[B")
    public final byte[] method780(byte arg0, int arg1, int arg2) {
        field1799++;
        if (!this.method755(19596, arg1, arg2)) {
            return null;
        }
        if (this.field1811[arg1] == null || this.field1811[arg1][arg2] == null) {
            boolean var4 = this.method776((int[]) null, arg1, (byte) 90);
            if (!var4) {
                this.method763(-15107, arg1);
                boolean var5 = this.method776((int[]) null, arg1, (byte) 90);
                if (!var5) {
                    return null;
                }
            }
        }
        int var6 = 64 / ((arg0 + 86) / 38);
        return class54.method347(1, this.field1811[arg1][arg2], false);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lda;Lda;I)[B")
    public final byte[] method781(class275 arg0, class275 arg1, int arg2) {
        field1822++;
        if (!this.method786(-100)) {
            return null;
        }
        class275 var4 = arg1.method1831((byte) -66);
        if (arg2 != 7) {
            return null;
        }
        class275 var5 = arg0.method1831((byte) -113);
        int var6 = this.field1793.field2238.method349((byte) -1, var4.method1830((byte) -89));
        if (this.method774(0, var6)) {
            int var7 = this.field1793.field2241[var6].method349((byte) -1, var5.method1830((byte) -89));
            return this.method775(var6, var7, arg2 - 24806);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Z")
    public final boolean method782(int arg0) {
        field1824++;
        if (!this.method786(-97)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1793.field2230.length; var3++) {
            int var4 = this.field1793.field2230[var3];
            if (this.field1794[var4] == null) {
                this.method763(-15107, var4);
                if (this.field1794[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)V")
    private final void method783(int arg0, int arg1) {
        if (arg1 != -28357) {
            this.method769((byte) -17, 54);
        }
        this.field1813.method337(arg0, (byte) 48);
        field1818++;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(II)Z")
    public final boolean method784(int arg0, int arg1) {
        field1795++;
        if (!this.method786(arg1 - 81)) {
            return false;
        } else if (~this.field1793.field2247.length == arg1) {
            return this.method777((byte) -60, arg0, 0);
        } else if (!this.method774(0, arg0)) {
            return false;
        } else if (this.field1793.field2247[arg0] == 1) {
            return this.method777((byte) -60, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    public static final void method785(int arg0) {
        class233.field4072.method993(109);
        field1803++;
        if (arg0 != -1) {
            method765(31);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lnf;ZZ)V")
    public class105(class235 arg0, boolean arg1, boolean arg2) {
        this.field1820 = arg2;
        this.field1813 = arg0;
        this.field1827 = arg1;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)Z")
    private final boolean method786(int arg0) {
        field1804++;
        if (this.field1793 == null) {
            this.field1793 = this.field1813.method336((byte) 0);
            if (this.field1793 == null) {
                return false;
            }
            this.field1811 = new Object[this.field1793.field2249][];
            this.field1794 = new Object[this.field1793.field2249];
        }
        int var2 = 126 % ((arg0 + 33) / 43);
        return true;
    }
}
