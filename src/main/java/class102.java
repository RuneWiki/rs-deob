import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class102 extends class237 {

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "I")
    private int field1810 = 0;

    @OriginalMember(owner = "client!uaa", name = "w", descriptor = "Lsl;")
    private class427 field1814 = new class427(16);

    @OriginalMember(owner = "client!uaa", name = "N", descriptor = "I")
    private int field1831 = 0;

    @OriginalMember(owner = "client!uaa", name = "K", descriptor = "Lhga;")
    private class158 field1828 = new class158();

    @OriginalMember(owner = "client!uaa", name = "O", descriptor = "J")
    private long field1832 = 0L;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "Lfj;")
    private class610 field1806;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
    private int field1809;

    @OriginalMember(owner = "client!uaa", name = "M", descriptor = "Z")
    private boolean field1830;

    @OriginalMember(owner = "client!uaa", name = "J", descriptor = "Lhga;")
    private class158 field1827;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!uaa", name = "C", descriptor = "[B")
    private byte[] field1820;

    @OriginalMember(owner = "client!uaa", name = "P", descriptor = "Z")
    private boolean field1833;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    private int field1797;

    @OriginalMember(owner = "client!uaa", name = "x", descriptor = "Lhca;")
    private class457 field1815;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "Lue;")
    private class213 field1800;

    @OriginalMember(owner = "client!uaa", name = "D", descriptor = "Lfj;")
    private class610 field1821;

    @OriginalMember(owner = "client!uaa", name = "y", descriptor = "Lag;")
    private class637 field1816;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "I")
    public static int field1807 = 0;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "Lqfa;")
    public static class85 field1811 = new class85(22, -2);

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!uaa", name = "v", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!uaa", name = "B", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!uaa", name = "F", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!uaa", name = "G", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!uaa", name = "H", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!uaa", name = "I", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!uaa", name = "E", descriptor = "Lot;")
    private class548 field1822;

    @OriginalMember(owner = "client!uaa", name = "L", descriptor = "Z")
    private boolean field1829;

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "[B")
    private byte[] field1812;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
    public final void method942(int arg0) {
        field1801++;
        if (this.field1827 != null) {
            if (this.method953(false) == null) {
                return;
            }
            if (this.field1830) {
                boolean var2 = true;
                for (class425 var3 = this.field1827.method1224(-2); var3 != null; var3 = this.field1827.method1232(-2)) {
                    int var5 = (int) var3.field6132;
                    if (this.field1812[var5] == 0) {
                        this.method952(var5, 1, (byte) -39);
                    }
                    if (this.field1812[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2588(300);
                    }
                }
                while (this.field1822.field7791.length > this.field1831) {
                    if (this.field1822.field7791[this.field1831] == 0) {
                        this.field1831++;
                    } else {
                        if (this.field1815.field6515 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field1812[this.field1831] == 0) {
                            this.method952(this.field1831, 1, (byte) -126);
                        }
                        if (this.field1812[this.field1831] == 0) {
                            class425 var4 = new class425();
                            var4.field6132 = this.field1831;
                            var2 = false;
                            this.field1827.method1229(var4, (byte) 120);
                        }
                        this.field1831++;
                    }
                }
                if (var2) {
                    this.field1831 = 0;
                    this.field1830 = false;
                }
            } else if (this.field1829) {
                boolean var6 = true;
                for (class425 var7 = this.field1827.method1224(-2); var7 != null; var7 = this.field1827.method1232(-2)) {
                    int var9 = (int) var7.field6132;
                    if (this.field1812[var9] != 1) {
                        this.method952(var9, 2, (byte) -60);
                    }
                    if (this.field1812[var9] == 1) {
                        var7.method2588(300);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field1822.field7791.length > this.field1831) {
                    if (this.field1822.field7791[this.field1831] == 0) {
                        this.field1831++;
                    } else {
                        if (this.field1800.method1485(20)) {
                            var6 = false;
                            break;
                        }
                        if (this.field1812[this.field1831] != 1) {
                            this.method952(this.field1831, 2, (byte) -25);
                        }
                        if (this.field1812[this.field1831] != 1) {
                            class425 var8 = new class425();
                            var8.field6132 = this.field1831;
                            this.field1827.method1229(var8, (byte) 120);
                            var6 = false;
                        }
                        this.field1831++;
                    }
                }
                if (var6) {
                    this.field1831 = 0;
                    this.field1829 = false;
                }
            } else {
                this.field1827 = null;
            }
        }
        if (this.field1833 && class525.method3074((byte) -101) >= this.field1832) {
            for (class637 var10 = (class637) this.field1814.method2597((byte) 112); var10 != null; var10 = (class637) this.field1814.method2594((byte) -122)) {
                if (!var10.field9179) {
                    if (var10.field9182) {
                        if (!var10.field9180) {
                            throw new RuntimeException();
                        }
                        var10.method2588(300);
                    } else {
                        var10.field9182 = true;
                    }
                }
            }
            this.field1832 = class525.method3074((byte) -101) + 1000L;
        }
        if (arg0 >= -114) {
            this.method943(6, -59);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)V")
    public final void method943(int arg0, int arg1) {
        field1803++;
        if (this.field1806 == null) {
            return;
        }
        for (class425 var3 = this.field1828.method1224(-2); var3 != null; var3 = this.field1828.method1232(-2)) {
            if ((long) arg0 == var3.field6132) {
                return;
            }
        }
        if (arg1 != -1) {
            this.method952(-117, -85, (byte) -15);
        }
        class425 var4 = new class425();
        var4.field6132 = arg0;
        this.field1828.method1229(var4, (byte) 120);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IJII)V")
    public static final void method944(int arg0, long arg1, int arg2, int arg3) {
        if (arg2 != -18879) {
            return;
        }
        field1825++;
        int var5 = ((int) arg1 & 0x7F2E4) >> 14;
        int var6 = ((int) arg1 & 0x37D618) >> 20;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class611.method3509(arg3, var6, var5, (byte) 95, 0, true, 0, arg0, 0);
            return;
        }
        class56 var8 = class237.field3521.method3515(var7, 50);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field1238;
            var9 = var8.field1244;
        } else {
            var9 = var8.field1238;
            var10 = var8.field1244;
        }
        int var11 = var8.field1239;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class611.method3509(arg3, 0, 0, (byte) 96, var9, true, var11, arg0, var10);
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)[B")
    public final byte[] method945(int arg0, int arg1) {
        field1819++;
        class637 var3 = this.method952(arg0, 0, (byte) -68);
        if (var3 == null) {
            return null;
        }
        if (arg1 > -108) {
            this.field1806 = null;
        }
        byte[] var4 = var3.method235((byte) -107);
        var3.method2588(300);
        return var4;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
    public static void method946(int arg0) {
        if (arg0 != 0) {
            method954(65, -111, 7);
        }
        field1811 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
    public final void method947(byte arg0) {
        if (arg0 != -106) {
            this.field1821 = null;
        }
        field1802++;
        if (this.field1827 == null || this.method953(false) == null) {
            return;
        }
        for (class425 var2 = this.field1828.method1224(-2); var2 != null; var2 = this.field1828.method1232(-2)) {
            int var3 = (int) var2.field6132;
            if (var3 < 0 || var3 >= this.field1822.field7792 || this.field1822.field7791[var3] == 0) {
                var2.method2588(300);
            } else {
                if (this.field1812[var3] == 0) {
                    this.method952(var3, 1, (byte) -96);
                }
                if (this.field1812[var3] == -1) {
                    this.method952(var3, 2, (byte) -114);
                }
                if (this.field1812[var3] == 1) {
                    var2.method2588(arg0 + 406);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(Z)I")
    public final int method948(boolean arg0) {
        field1823++;
        if (arg0) {
            field1807 = -7;
        }
        return this.field1822 == null ? 0 : this.field1822.field7785;
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)V")
    public final void method949(byte arg0) {
        field1817++;
        if (this.field1806 != null && arg0 == -42) {
            this.field1829 = true;
            if (this.field1827 == null) {
                this.field1827 = new class158();
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)I")
    public final int method950(int arg0) {
        field1799++;
        int var2 = -64 % ((arg0 + 58) / 36);
        return this.field1810;
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(B)I")
    public final int method951(byte arg0) {
        field1804++;
        if (this.field1822 == null) {
            return 0;
        } else if (this.field1830) {
            class425 var2 = this.field1827.method1224(-2);
            if (arg0 != -1) {
                this.field1822 = null;
            }
            return var2 == null ? 0 : (int) var2.field6132;
        } else {
            return this.field1822.field7785;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIB)Lag;")
    private final class637 method952(int arg0, int arg1, byte arg2) {
        if (arg2 >= -23) {
            return null;
        }
        field1824++;
        class637 var4 = (class637) this.field1814.method2596((long) arg0, 59);
        if (var4 != null && arg1 == 0 && !var4.field9180 && var4.field9179) {
            var4.method2588(300);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field1806 == null || this.field1812[arg0] == -1) {
                    if (this.field1800.method1484(-76)) {
                        return null;
                    }
                    var4 = this.field1800.method1479((byte) 2, (byte) -16, arg0, true, this.field1809);
                } else {
                    var4 = this.field1815.method2743(arg0, this.field1806, 102);
                }
            } else if (arg1 == 1) {
                if (this.field1806 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1815.method2748(arg0, 72, this.field1806);
            } else if (arg1 == 2) {
                if (this.field1806 == null) {
                    throw new RuntimeException();
                }
                if (this.field1812[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1800.method1485(20)) {
                    return null;
                }
                var4 = this.field1800.method1479((byte) 2, (byte) -16, arg0, false, this.field1809);
            } else {
                throw new RuntimeException();
            }
            this.field1814.method2598(var4, (long) arg0, (byte) 8);
        }
        if (var4.field9179) {
            return null;
        }
        byte[] var5 = var4.method235((byte) -93);
        if (!(var4 instanceof class384)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class302.field4508.reset();
                class302.field4508.update(var5, 0, var5.length - 2);
                int var6 = (int) class302.field4508.getValue();
                if (this.field1822.field7777[arg0] != var6) {
                    throw new RuntimeException();
                }
                if (this.field1822.field7787 != null && this.field1822.field7787[arg0] != null) {
                    byte[] var7 = this.field1822.field7787[arg0];
                    byte[] var8 = class654.method3726(var5, 64, 0, var5.length - 2);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field1800.field3273 = 0;
                this.field1800.field3271 = 0;
            } catch (RuntimeException var17) {
                this.field1800.method1493((byte) 107);
                var4.method2588(300);
                if (var4.field9180 && !this.field1800.method1484(-97)) {
                    class4 var10 = this.field1800.method1479((byte) 2, (byte) -16, arg0, true, this.field1809);
                    this.field1814.method2598(var10, (long) arg0, (byte) 8);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1822.field7776[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field1822.field7776[arg0];
            if (this.field1806 != null) {
                this.field1815.method2745(arg0, 27022, var5, this.field1806);
                if (this.field1812[arg0] != 1) {
                    this.field1810++;
                    this.field1812[arg0] = 1;
                }
            }
            if (!var4.field9180) {
                var4.method2588(300);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class302.field4508.reset();
            class302.field4508.update(var5, 0, var5.length - 2);
            int var11 = (int) class302.field4508.getValue();
            if (this.field1822.field7777[arg0] != var11) {
                throw new RuntimeException();
            }
            if (this.field1822.field7787 != null && this.field1822.field7787[arg0] != null) {
                byte[] var12 = this.field1822.field7787[arg0];
                byte[] var13 = class654.method3726(var5, 64, 0, var5.length - 2);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1822.field7776[arg0] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field1812[arg0] != 1) {
                this.field1810++;
                this.field1812[arg0] = 1;
            }
            if (!var4.field9180) {
                var4.method2588(300);
            }
            return var4;
        } catch (Exception var18) {
            this.field1812[arg0] = -1;
            var4.method2588(300);
            if (var4.field9180 && !this.field1800.method1484(-113)) {
                class4 var16 = this.field1800.method1479((byte) 2, (byte) -16, arg0, true, this.field1809);
                this.field1814.method2598(var16, (long) arg0, (byte) 8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Lot;")
    public final class548 method953(boolean arg0) {
        if (arg0) {
            return null;
        }
        field1805++;
        if (this.field1822 != null) {
            return this.field1822;
        }
        if (this.field1816 == null) {
            if (this.field1800.method1484(-118)) {
                return null;
            }
            this.field1816 = this.field1800.method1479((byte) 0, (byte) -16, this.field1809, true, 255);
        }
        if (this.field1816.field9179) {
            return null;
        }
        byte[] var2 = this.field1816.method235((byte) -115);
        if (this.field1816 instanceof class384) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1822 = new class548(var2, this.field1797, this.field1820);
                if (this.field1822.field7780 != this.field1798) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field1822 = null;
                if (this.field1800.method1484(91)) {
                    this.field1816 = null;
                } else {
                    this.field1816 = this.field1800.method1479((byte) 0, (byte) -16, this.field1809, true, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1822 = new class548(var2, this.field1797, this.field1820);
            } catch (RuntimeException var4) {
                this.field1800.method1493((byte) 107);
                this.field1822 = null;
                if (this.field1800.method1484(125)) {
                    this.field1816 = null;
                } else {
                    this.field1816 = this.field1800.method1479((byte) 0, (byte) -16, this.field1809, true, 255);
                }
                return null;
            }
            if (this.field1821 != null) {
                this.field1815.method2745(this.field1809, 27022, var2, this.field1821);
            }
        }
        this.field1816 = null;
        if (this.field1806 != null) {
            this.field1812 = new byte[this.field1822.field7792];
            this.field1810 = 0;
        }
        return this.field1822;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(III)Z")
    public static final boolean method954(int arg0, int arg1, int arg2) {
        field1796++;
        if (arg1 != 7325) {
            method944(-86, -127L, -39, -10);
        }
        return (class678.method3814((byte) 107, arg2, arg0) | class581.method3335((byte) 90, arg0, arg2) | class32.method512((byte) -68, arg0, arg2)) & class376.method2363((byte) -66, arg0, arg2);
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(Z)V")
    public static final void method955(boolean arg0) {
        field1808++;
        class244.method1620(71);
        class614.field8933 = null;
        if (!arg0) {
            field1807 = 9;
        }
        class616.field8945 = null;
        class310.field4625 = null;
        class240.field3541 = null;
        class140.field2463 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)I")
    public final int method956(byte arg0, int arg1) {
        if (arg0 > -94) {
            this.field1806 = null;
        }
        field1813++;
        class637 var3 = (class637) this.field1814.method2596((long) arg1, 48);
        return var3 == null ? 0 : var3.method237(0);
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)I")
    public final int method957(int arg0) {
        field1826++;
        int var2 = -115 / ((2 - arg0) / 55);
        if (this.method953(false) == null) {
            return this.field1816 == null ? 0 : this.field1816.method237(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(ILfj;Lfj;Lue;Lhca;I[BIZ)V")
    public class102(int arg0, class610 arg1, class610 arg2, class213 arg3, class457 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field1806 = arg1;
        this.field1809 = arg0;
        if (this.field1806 == null) {
            this.field1830 = false;
        } else {
            this.field1830 = true;
            this.field1827 = new class158();
        }
        this.field1798 = arg7;
        this.field1820 = arg6;
        this.field1833 = arg8;
        this.field1797 = arg5;
        this.field1815 = arg4;
        this.field1800 = arg3;
        this.field1821 = arg2;
        if (this.field1821 != null) {
            this.field1816 = this.field1815.method2743(this.field1809, this.field1821, 100);
        }
    }
}
