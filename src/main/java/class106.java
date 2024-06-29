import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class106 {

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "Llj;")
    private class59 field1775 = new class59();

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "Llj;")
    private class59 field1783 = new class59();

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "Llj;")
    private class59 field1785 = new class59();

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "Llj;")
    private class59 field1786 = new class59();

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "Lco;")
    private class268 field1788 = new class268(4);

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "I")
    public volatile int field1791 = 0;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "I")
    public volatile int field1793 = 0;

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "B")
    private byte field1792 = 0;

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "Lco;")
    private class268 field1794 = new class268(8);

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field1769 = 2;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "J")
    private long field1790;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "Lii;")
    private class474 field1795;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "Lvi;")
    private class580 field1787;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "Lrl;")
    public static class633 field1780;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)I")
    public static final int method893(byte arg0) {
        field1771++;
        class395 var1 = class461.field6670;
        synchronized (class461.field6670) {
            if (arg0 != 46) {
                method894(-14);
            }
            return class461.field6670.method2393((byte) 122);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method894(int arg0) {
        field1780 = null;
        if (arg0 != 255) {
            method893((byte) 69);
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)Z")
    public final boolean method895(int arg0) {
        if (arg0 < 60) {
            return false;
        } else {
            field1781++;
            return this.method900(false) >= 20;
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)I")
    public final int method896(int arg0) {
        if (arg0 != 8) {
            this.method897(123, false);
        }
        field1768++;
        return this.field1775.method476(0) + this.field1783.method476(0);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V")
    public final void method897(int arg0, boolean arg1) {
        if (arg0 > -11) {
            this.field1791 = 34;
        }
        field1764++;
        if (this.field1787 == null) {
            return;
        }
        try {
            this.field1788.field3913 = 0;
            this.field1788.method1710(arg1 ? 2 : 3, 65);
            this.field1788.method1715(0, (byte) 127);
            this.field1787.method3317(0, 4, this.field1788.field3952, false);
        } catch (IOException var4) {
            try {
                this.field1787.method3319(5000);
            } catch (Exception var3) {
            }
            this.field1787 = null;
            this.field1791++;
            this.field1793 = -2;
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)Z")
    public final boolean method898(byte arg0) {
        field1779++;
        if (arg0 != -112) {
            this.field1787 = null;
        }
        return this.method896(arg0 ^ 0xFFFFFF98) >= 20;
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V")
    public final void method899(int arg0) {
        if (this.field1787 != null) {
            this.field1787.method3319(arg0 ^ 0xFFFFEC13);
        }
        field1770++;
        if (arg0 != -101) {
            this.field1795 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)I")
    private final int method900(boolean arg0) {
        if (arg0) {
            return 113;
        } else {
            field1767++;
            return this.field1785.method476(0) + this.field1786.method476(0);
        }
    }

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "(I)V")
    public final void method901(int arg0) {
        field1766++;
        try {
            this.field1787.method3319(arg0 - 9943);
        } catch (Exception var2) {
        }
        this.field1791++;
        this.field1793 = -1;
        this.field1792 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1787 = null;
        if (arg0 != 14943) {
            this.method901(-111);
        }
    }

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)V")
    private final void method902(int arg0) {
        field1778++;
        if (this.field1787 == null) {
            return;
        }
        try {
            this.field1788.field3913 = 0;
            this.field1788.method1710(6, 23);
            this.field1788.method1715(3, (byte) -36);
            this.field1787.method3317(0, arg0, this.field1788.field3952, false);
        } catch (IOException var3) {
            try {
                this.field1787.method3319(arg0 + 4996);
            } catch (Exception var2) {
            }
            this.field1791++;
            this.field1793 = -2;
            this.field1787 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "(I)Z")
    public final boolean method903(int arg0) {
        field1765++;
        if (this.field1787 != null) {
            long var2 = class508.method2860(false);
            int var4 = (int) (var2 - this.field1790);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1790 = var2;
            this.field1789 += var4;
            if (this.field1789 > 30000) {
                try {
                    this.field1787.method3319(arg0 + 5001);
                } catch (Exception var27) {
                }
                this.field1787 = null;
            }
        }
        if (this.field1787 == null) {
            return this.method896(8) == 0 && this.method900(false) == 0;
        }
        if (arg0 != -1) {
            this.method906(41);
        }
        try {
            this.field1787.method3318((byte) 112);
            for (class474 var5 = (class474) this.field1775.method475(-124); var5 != null; var5 = (class474) this.field1775.method480(arg0 ^ 0x6C)) {
                this.field1788.field3913 = 0;
                this.field1788.method1710(1, 31);
                this.field1788.method1715((int) var5.field6471, (byte) -29);
                this.field1787.method3317(0, 4, this.field1788.field3952, false);
                this.field1783.method477(var5, false);
            }
            for (class474 var6 = (class474) this.field1785.method475(118); var6 != null; var6 = (class474) this.field1785.method480(-38)) {
                this.field1788.field3913 = 0;
                this.field1788.method1710(0, 60);
                this.field1788.method1715((int) var6.field6471, (byte) -110);
                this.field1787.method3317(0, 4, this.field1788.field3952, false);
                this.field1786.method477(var6, false);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1787.method3321(-112);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1789 = 0;
                byte var9 = 0;
                if (this.field1795 == null) {
                    var9 = 8;
                } else if (this.field1795.field6788 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field1795.field6792.field3952.length - this.field1795.field6789;
                    int var11 = 512 - this.field1795.field6788;
                    if (var11 > var10 - this.field1795.field6792.field3913) {
                        var11 = var10 - this.field1795.field6792.field3913;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field1787.method3322(arg0 - 116, var11, this.field1795.field6792.field3913, this.field1795.field6792.field3952);
                    if (this.field1792 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1795.field6792.field3952[this.field1795.field6792.field3913 + var12] = (byte) class631.method3567(this.field1795.field6792.field3952[this.field1795.field6792.field3913 + var12], this.field1792);
                        }
                    }
                    this.field1795.field6792.field3913 += var11;
                    this.field1795.field6788 += var11;
                    if (this.field1795.field6792.field3913 == var10) {
                        this.field1795.method2619(true);
                        this.field1795.field6814 = false;
                        this.field1795 = null;
                    } else if (this.field1795.field6788 == 512) {
                        this.field1795.field6788 = 0;
                    }
                } else {
                    int var13 = var9 - this.field1794.field3913;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field1787.method3322(arg0 - 53, var13, this.field1794.field3913, this.field1794.field3952);
                    if (this.field1792 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field1794.field3952[this.field1794.field3913 + var14] = (byte) class631.method3567(this.field1794.field3952[this.field1794.field3913 + var14], this.field1792);
                        }
                    }
                    this.field1794.field3913 += var13;
                    if (var9 <= this.field1794.field3913) {
                        if (this.field1795 == null) {
                            this.field1794.field3913 = 0;
                            int var15 = this.field1794.method1738(255);
                            int var16 = this.field1794.method1745(32132);
                            int var17 = this.field1794.method1738(255);
                            int var18 = this.field1794.method1748(97);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class474 var24;
                            if (var20) {
                                for (var24 = (class474) this.field1786.method475(96); var24 != null && var24.field6471 != var21; var24 = (class474) this.field1786.method480(arg0 - 112)) {
                                }
                            } else {
                                for (var24 = (class474) this.field1783.method475(99); var24 != null && var24.field6471 != var21; var24 = (class474) this.field1783.method480(-125)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field1795 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field1795.field6792 = new class268(this.field1795.field6789 + var18 + var25);
                            this.field1795.field6792.method1710(var19, 47);
                            this.field1795.field6792.method1702(var18, false);
                            this.field1795.field6788 = 8;
                            this.field1794.field3913 = 0;
                        } else if (this.field1795.field6788 != 0) {
                            throw new IOException();
                        } else if (this.field1794.field3952[0] == -1) {
                            this.field1795.field6788 = 1;
                            this.field1794.field3913 = 0;
                        } else {
                            this.field1795 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1787.method3319(5000);
            } catch (Exception var26) {
            }
            this.field1793 = -2;
            this.field1787 = null;
            this.field1791++;
            return this.method896(8) == 0 && this.method900(false) == 0;
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)V")
    public final void method904(byte arg0) {
        if (arg0 <= 74) {
            this.field1791 = 109;
        }
        field1776++;
        if (this.field1787 != null) {
            this.field1787.method3323((byte) 60);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lvi;ZI)V")
    public final void method905(class580 arg0, boolean arg1, int arg2) {
        if (this.field1787 != null) {
            try {
                this.field1787.method3319(5000);
            } catch (Exception var8) {
            }
            this.field1787 = null;
        }
        field1784++;
        this.field1787 = arg0;
        this.method902(4);
        this.method897(-73, arg1);
        this.field1794.field3913 = 0;
        this.field1795 = null;
        while (true) {
            class474 var4 = (class474) this.field1783.method472(true);
            if (var4 == null) {
                while (true) {
                    class474 var5 = (class474) this.field1786.method472(true);
                    if (var5 == null) {
                        if (this.field1792 != 0) {
                            try {
                                this.field1788.field3913 = 0;
                                this.field1788.method1710(4, 112);
                                this.field1788.method1710(this.field1792, 68);
                                this.field1788.method1699(true, 0);
                                this.field1787.method3317(0, 4, this.field1788.field3952, false);
                            } catch (IOException var7) {
                                try {
                                    this.field1787.method3319(5000);
                                } catch (Exception var6) {
                                }
                                this.field1787 = null;
                                this.field1791++;
                                this.field1793 = -2;
                            }
                        }
                        this.field1789 = 0;
                        this.field1790 = class508.method2860(false);
                        if (arg2 == -30001) {
                            return;
                        } else {
                            this.field1775 = null;
                            return;
                        }
                    }
                    this.field1785.method477(var5, false);
                }
            }
            this.field1775.method477(var4, false);
        }
    }

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "(I)V")
    public final void method906(int arg0) {
        field1782++;
        if (this.field1787 == null) {
            return;
        }
        try {
            this.field1788.field3913 = 0;
            this.field1788.method1710(7, 92);
            this.field1788.method1715(0, (byte) 126);
            this.field1787.method3317(0, 4, this.field1788.field3952, false);
            if (arg0 <= 34) {
                method893((byte) -114);
            }
        } catch (IOException var3) {
            try {
                this.field1787.method3319(5000);
            } catch (Exception var2) {
            }
            this.field1793 = -2;
            this.field1787 = null;
            this.field1791++;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLoh;)Loh;")
    public static final class549 method907(byte arg0, class549 arg1) {
        if (arg0 < 57) {
            return null;
        }
        field1773++;
        if (arg1.field7637 != -1) {
            return class495.method2822((byte) -106, arg1.field7637);
        }
        int var2 = arg1.field7734 >>> 16;
        class305 var3 = new class305(class639.field9274);
        for (class553 var4 = (class553) var3.method1900(-1); var4 != null; var4 = (class553) var3.method1901((byte) 57)) {
            if (var4.field7827 == var2) {
                return class495.method2822((byte) -119, (int) var4.field1798);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IBZII)Lii;")
    public final class474 method908(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field1772++;
        if (arg0 != 512) {
            this.method897(-6, false);
        }
        long var6 = (long) ((arg3 << 16) + arg4);
        class474 var8 = new class474();
        var8.field6789 = arg1;
        var8.field6471 = var6;
        var8.field6811 = arg2;
        if (arg2) {
            if (this.method896(8) >= 20) {
                throw new RuntimeException();
            }
            this.field1775.method477(var8, false);
        } else if (this.method900(false) < 20) {
            this.field1785.method477(var8, false);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }
}
