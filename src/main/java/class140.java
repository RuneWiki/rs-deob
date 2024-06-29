import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class140 {

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "Lgba;")
    private class358 field1782 = new class358();

    @OriginalMember(owner = "client!gw", name = "u", descriptor = "Lgba;")
    private class358 field1785 = new class358();

    @OriginalMember(owner = "client!gw", name = "w", descriptor = "Lgba;")
    private class358 field1787 = new class358();

    @OriginalMember(owner = "client!gw", name = "y", descriptor = "Lgba;")
    private class358 field1789 = new class358();

    @OriginalMember(owner = "client!gw", name = "D", descriptor = "Lge;")
    private class551 field1793 = new class551(4);

    @OriginalMember(owner = "client!gw", name = "H", descriptor = "I")
    public volatile int field1797 = 0;

    @OriginalMember(owner = "client!gw", name = "F", descriptor = "I")
    public volatile int field1795 = 0;

    @OriginalMember(owner = "client!gw", name = "G", descriptor = "B")
    private byte field1796 = 0;

    @OriginalMember(owner = "client!gw", name = "E", descriptor = "Lge;")
    private class551 field1794 = new class551(8);

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "Lim;")
    public static class353 field1779 = new class353(33, 2);

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "Luv;")
    public static class3 field1783 = new class3(34, 7);

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "Lbe;")
    public static class189 field1784 = new class189();

    @OriginalMember(owner = "client!gw", name = "v", descriptor = "Lvt;")
    public static class344 field1786 = new class344("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "I")
    private int field1790;

    @OriginalMember(owner = "client!gw", name = "A", descriptor = "J")
    private long field1791;

    @OriginalMember(owner = "client!gw", name = "I", descriptor = "Lfca;")
    private class135 field1798;

    @OriginalMember(owner = "client!gw", name = "B", descriptor = "Lvi;")
    private class581 field1792;

    @OriginalMember(owner = "client!gw", name = "x", descriptor = "[I")
    public static int[] field1788;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)V")
    public final void method738(boolean arg0, int arg1) {
        if (arg1 != -2) {
            this.method754((byte) -64, true, null);
        }
        field1769++;
        if (this.field1792 == null) {
            return;
        }
        try {
            this.field1793.field7707 = 0;
            this.field1793.method3060(arg0 ? 2 : 3, -25098);
            this.field1793.method3047((byte) -12, 0);
            this.field1792.method3276(4, this.field1793.field7693, 0, arg1 ^ 0xFFFFFF97);
        } catch (IOException var4) {
            try {
                this.field1792.method3280(1);
            } catch (Exception var3) {
            }
            this.field1797++;
            this.field1792 = null;
            this.field1795 = -2;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)Lbb;")
    public static final class381 method739(int arg0, int arg1) {
        field1766++;
        class381 var2 = (class381) class337.field4706.method323((long) arg0, -19814);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class494.field6888.method2054(true, 1, arg0);
        class381 var4 = new class381();
        var4.field5330 = arg0;
        if (var3 != null) {
            var4.method2320(2, new class551(var3));
        }
        var4.method2321((byte) 114);
        if (~var4.field5331 == arg1 && class164.field2081.method3476((long) arg0, (byte) 28) == null) {
            class164.field2081.method3475(-112, new class147(class146.field1897), (long) arg0);
            class360.field5022[class146.field1897++] = var4;
        }
        class337.field4706.method316((long) arg0, (byte) -119, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z")
    public final boolean method740(int arg0) {
        int var2 = 99 / ((arg0 - 9) / 32);
        field1781++;
        return this.method750((byte) -82) >= 20;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
    public static void method741(byte arg0) {
        field1779 = null;
        field1788 = null;
        field1786 = null;
        if (arg0 <= 55) {
            method748(77, false);
        }
        field1784 = null;
        field1783 = null;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
    public final void method742(int arg0) {
        try {
            this.field1792.method3280(arg0);
        } catch (Exception var2) {
        }
        field1772++;
        this.field1797++;
        this.field1792 = null;
        this.field1795 = -1;
        this.field1796 = (byte) ((int) (Math.random() * 255.0D + (double) arg0));
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)I")
    private final int method743(byte arg0) {
        field1765++;
        if (arg0 != -27) {
            this.field1792 = null;
        }
        return this.field1787.method2220(arg0 + 27) + this.field1789.method2220(0);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)V")
    public final void method744(boolean arg0) {
        field1777++;
        if (this.field1792 != null) {
            this.field1792.method3280(1);
        }
        if (!arg0) {
            field1784 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)V")
    public final void method745(byte arg0) {
        if (this.field1792 != null) {
            this.field1792.method3274((byte) -48);
        }
        if (arg0 != 30) {
            this.field1795 = 50;
        }
        field1774++;
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)Z")
    public final boolean method746(int arg0) {
        field1776++;
        if (arg0 != 20) {
            this.field1789 = null;
        }
        return this.method743((byte) -27) >= 20;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(Z)V")
    private final void method747(boolean arg0) {
        if (arg0) {
            return;
        }
        field1768++;
        if (this.field1792 == null) {
            return;
        }
        try {
            this.field1793.field7707 = 0;
            this.field1793.method3060(6, -25098);
            this.field1793.method3047((byte) -12, 3);
            this.field1792.method3276(4, this.field1793.field7693, 0, 113);
        } catch (IOException var3) {
            try {
                this.field1792.method3280(1);
            } catch (Exception var2) {
            }
            this.field1797++;
            this.field1792 = null;
            this.field1795 = -2;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V")
    public static final void method748(int arg0, boolean arg1) {
        field1780++;
        class610.field8774.method320(arg0, -306674912);
        class583.field8437.method320(arg0, -306674912);
        class276.field3592.method320(arg0, -306674912);
        if (arg1) {
            method741((byte) 68);
        }
        class280.field3670.method320(arg0, -306674912);
        class628.field9150.method320(arg0, -306674912);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BIIZI)Lfca;")
    public final class135 method749(byte arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1767++;
        long var6 = (long) ((arg1 << 16) + arg2);
        class135 var8 = new class135();
        var8.field2728 = arg3;
        var8.field1646 = arg0;
        var8.field7830 = var6;
        if (arg4 != -2057161616) {
            this.field1798 = null;
        }
        if (arg3) {
            if (this.method750((byte) -120) >= 20) {
                throw new RuntimeException();
            }
            this.field1782.method2228((byte) 91, var8);
        } else if (this.method743((byte) -27) < 20) {
            this.field1787.method2228((byte) 123, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(B)I")
    public final int method750(byte arg0) {
        if (arg0 >= -73) {
            this.field1795 = -43;
        }
        field1773++;
        return this.field1782.method2220(0) + this.field1785.method2220(0);
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)V")
    public final void method751(int arg0) {
        field1775++;
        if (this.field1792 == null) {
            return;
        }
        try {
            this.field1793.field7707 = 0;
            if (arg0 != -2) {
                this.method753((byte) 118);
            }
            this.field1793.method3060(7, -25098);
            this.field1793.method3047((byte) -12, 0);
            this.field1792.method3276(4, this.field1793.field7693, 0, 69);
        } catch (IOException var3) {
            try {
                this.field1792.method3280(1);
            } catch (Exception var2) {
            }
            this.field1792 = null;
            this.field1797++;
            this.field1795 = -2;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZZII)V")
    public static final void method752(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        class50.method275(arg4, arg1, (byte) 112, class447.field6332.length - 1, arg2, arg0, arg3);
        field1770++;
        class331.field4578 = 0;
        class497.field6922 = null;
    }

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "(B)Z")
    public final boolean method753(byte arg0) {
        field1778++;
        if (this.field1792 != null) {
            long var2 = class348.method2175(-116);
            int var4 = (int) (var2 - this.field1791);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1791 = var2;
            this.field1790 += var4;
            if (this.field1790 > 30000) {
                try {
                    this.field1792.method3280(1);
                } catch (Exception var27) {
                }
                this.field1792 = null;
            }
        }
        if (this.field1792 == null) {
            return this.method750((byte) -75) == 0 && this.method743((byte) -27) == 0;
        }
        try {
            this.field1792.method3281(-25229);
            for (class135 var5 = (class135) this.field1782.method2222((byte) -94); var5 != null; var5 = (class135) this.field1782.method2225(68)) {
                this.field1793.field7707 = 0;
                this.field1793.method3060(1, -25098);
                this.field1793.method3047((byte) -12, (int) var5.field7830);
                this.field1792.method3276(4, this.field1793.field7693, 0, 106);
                this.field1785.method2228((byte) 111, var5);
            }
            if (arg0 >= -38) {
                this.method745((byte) 67);
            }
            for (class135 var6 = (class135) this.field1787.method2222((byte) -118); var6 != null; var6 = (class135) this.field1787.method2225(123)) {
                this.field1793.field7707 = 0;
                this.field1793.method3060(0, -25098);
                this.field1793.method3047((byte) -12, (int) var6.field7830);
                this.field1792.method3276(4, this.field1793.field7693, 0, 98);
                this.field1789.method2228((byte) 103, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1792.method3278(-449);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1790 = 0;
                byte var9 = 0;
                if (this.field1798 == null) {
                    var9 = 8;
                } else if (this.field1798.field1651 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field1798.field1649.field7693.length - this.field1798.field1646;
                    int var11 = 512 - this.field1798.field1651;
                    if (var10 - this.field1798.field1649.field7707 < var11) {
                        var11 = var10 - this.field1798.field1649.field7707;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field1792.method3273(this.field1798.field1649.field7707, this.field1798.field1649.field7693, -1, var11);
                    if (this.field1796 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1798.field1649.field7693[this.field1798.field1649.field7707 + var12] = (byte) class426.method2502(this.field1798.field1649.field7693[this.field1798.field1649.field7707 + var12], this.field1796);
                        }
                    }
                    this.field1798.field1649.field7707 += var11;
                    this.field1798.field1651 += var11;
                    if (this.field1798.field1649.field7707 == var10) {
                        this.field1798.method3149(-18724);
                        this.field1798.field2732 = false;
                        this.field1798 = null;
                    } else if (this.field1798.field1651 == 512) {
                        this.field1798.field1651 = 0;
                    }
                } else {
                    int var13 = var9 - this.field1794.field7707;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field1792.method3273(this.field1794.field7707, this.field1794.field7693, -1, var13);
                    if (this.field1796 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field1794.field7693[this.field1794.field7707 + var14] = (byte) class426.method2502(this.field1794.field7693[this.field1794.field7707 + var14], this.field1796);
                        }
                    }
                    this.field1794.field7707 += var13;
                    if (var9 <= this.field1794.field7707) {
                        if (this.field1798 == null) {
                            this.field1794.field7707 = 0;
                            int var15 = this.field1794.method3045(-128);
                            int var16 = this.field1794.method3090(-120);
                            int var17 = this.field1794.method3045(-127);
                            int var18 = this.field1794.method3048(-4);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class135 var24;
                            if (var20) {
                                for (var24 = (class135) this.field1789.method2222((byte) -54); var24 != null && var24.field7830 != var21; var24 = (class135) this.field1789.method2225(53)) {
                                }
                            } else {
                                for (var24 = (class135) this.field1785.method2222((byte) -76); var24 != null && var24.field7830 != var21; var24 = (class135) this.field1785.method2225(29)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field1798 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field1798.field1649 = new class551(var18 + var25 + this.field1798.field1646);
                            this.field1798.field1649.method3060(var19, -25098);
                            this.field1798.field1649.method3071(-114, var18);
                            this.field1794.field7707 = 0;
                            this.field1798.field1651 = 8;
                        } else if (this.field1798.field1651 != 0) {
                            throw new IOException();
                        } else if (this.field1794.field7693[0] == -1) {
                            this.field1798.field1651 = 1;
                            this.field1794.field7707 = 0;
                        } else {
                            this.field1798 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1792.method3280(1);
            } catch (Exception var26) {
            }
            this.field1795 = -2;
            this.field1792 = null;
            this.field1797++;
            return this.method750((byte) -81) == 0 && this.method743((byte) -27) == 0;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BZLvi;)V")
    public final void method754(byte arg0, boolean arg1, class581 arg2) {
        if (this.field1792 != null) {
            try {
                this.field1792.method3280(1);
            } catch (Exception var8) {
            }
            this.field1792 = null;
        }
        field1771++;
        this.field1792 = arg2;
        this.method747(false);
        this.method738(arg1, -2);
        this.field1794.field7707 = 0;
        if (arg0 != 61) {
            field1788 = null;
        }
        this.field1798 = null;
        while (true) {
            class135 var4 = (class135) this.field1785.method2226(arg0 - 61);
            if (var4 == null) {
                while (true) {
                    class135 var5 = (class135) this.field1789.method2226(0);
                    if (var5 == null) {
                        if (this.field1796 != 0) {
                            try {
                                this.field1793.field7707 = 0;
                                this.field1793.method3060(4, -25098);
                                this.field1793.method3060(this.field1796, -25098);
                                this.field1793.method3042(0, 119);
                                this.field1792.method3276(4, this.field1793.field7693, 0, -93);
                            } catch (IOException var7) {
                                try {
                                    this.field1792.method3280(1);
                                } catch (Exception var6) {
                                }
                                this.field1797++;
                                this.field1795 = -2;
                                this.field1792 = null;
                            }
                        }
                        this.field1790 = 0;
                        this.field1791 = class348.method2175(arg0 - 189);
                        return;
                    }
                    this.field1787.method2228((byte) 98, var5);
                }
            }
            this.field1782.method2228((byte) 62, var4);
        }
    }
}
