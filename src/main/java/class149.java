import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class149 {

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Lan;")
    private class22 field1839 = new class22();

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "Lan;")
    private class22 field1845 = new class22();

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "Lan;")
    private class22 field1847 = new class22();

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "Lan;")
    private class22 field1848 = new class22();

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "Lun;")
    private class389 field1849 = new class389(4);

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "B")
    private byte field1855 = 0;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public volatile int field1856 = 0;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public volatile int field1853 = 0;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "Lun;")
    private class389 field1854 = new class389(8);

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1826 = 0;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Z")
    public static boolean field1828 = false;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lwa;")
    public static class566 field1827 = class189.method1169((byte) 39);

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1835 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    private int field1852;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "J")
    private long field1850;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "Lqg;")
    private class429 field1851;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "Lcga;")
    private class447 field1857;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static final void method955(byte arg0) {
        field1834++;
        while (class29.field617.method28(class283.field3848, (byte) 53) >= 15) {
            int var1 = class29.field617.method25(15, 255);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class633 var3 = (class633) class522.field7662.method3678((long) var1, -127);
            if (var3 == null) {
                class557 var4 = new class557();
                var4.field2664 = var1;
                var3 = new class633(var4);
                class522.field7662.method3670((long) var1, var3, (byte) 127);
                class671.field9657[class59.field928++] = var3;
                var2 = true;
            }
            class557 var5 = var3.field9097;
            class600.field8658[class99.field1332++] = var1;
            var5.field2606 = class543.field7882;
            if (var5.field8052 != null && var5.field8052.method1878((byte) 98)) {
                class164.method1036(var5, (byte) -50);
            }
            int var6 = class29.field617.method25(1, 255);
            if (var6 == 1) {
                class182.field2229[class677.field9710++] = var1;
            }
            int var7 = class29.field617.method25(2, 255);
            int var8 = class29.field617.method25(5, 255);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = class29.field617.method25(3, 255) + 4 << 11 & 0x3E9F;
            int var10 = class29.field617.method25(5, 255);
            if (var10 > 15) {
                var10 -= 32;
            }
            int var11 = class29.field617.method25(1, 255);
            var5.method3251(class206.field2477.method1949(124, class29.field617.method25(14, 255)), 0);
            var5.method1279((byte) 87, var5.field8052.field4318);
            var5.field2616 = var5.field8052.field4259 << 3;
            if (var2) {
                var5.method1293((byte) -62, true, var9);
            }
            var5.method3253((byte) -102, var5.method1284((byte) -124), class206.field2472.field2686[0] + var8, class206.field2472.field2689[0] + var10, var11 == 1, var7);
            if (var5.field8052.method1878((byte) 98)) {
                class679.method3852(var5.field2689[0], (byte) -113, 0, var5, var5.field532, var5.field2686[0], null, null);
            }
        }
        if (arg0 <= -12) {
            class29.field617.method32((byte) -123);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method956(int arg0) {
        field1827 = null;
        if (arg0 != 0) {
            method967(-36, -19, 66, -98, 1, 13, 115, -110);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)V")
    public final void method957(boolean arg0, int arg1) {
        field1825++;
        if (this.field1851 == null) {
            return;
        }
        if (arg1 != 23431) {
            field1827 = null;
        }
        try {
            this.field1849.field5195 = 0;
            this.field1849.method2281((byte) 58, arg0 ? 2 : 3);
            this.field1849.method2217((byte) -42, 0);
            this.field1851.method2576(this.field1849.field5205, (byte) -110, 0, 4);
        } catch (IOException var4) {
            try {
                this.field1851.method2579(arg1 ^ 0x22F7);
            } catch (Exception var3) {
            }
            this.field1856++;
            this.field1853 = -2;
            this.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)I")
    public final int method958(int arg0) {
        int var2 = -68 / ((arg0 + 33) / 52);
        field1829++;
        return this.field1839.method350((byte) 120) + this.field1845.method350((byte) 81);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)Z")
    public final boolean method959(int arg0) {
        field1832++;
        if (arg0 == 8) {
            return this.method966(1724) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public final void method960(byte arg0) {
        try {
            this.field1851.method2579(31088);
        } catch (Exception var3) {
        }
        field1837++;
        int var2 = 126 % ((arg0 - 72) / 49);
        this.field1851 = null;
        this.field1855 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1853 = -1;
        this.field1856++;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public final void method961(int arg0) {
        if (this.field1851 != null) {
            this.field1851.method2580(103);
        }
        field1836++;
        if (arg0 != 0) {
            this.field1845 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
    public final void method962(int arg0) {
        if (this.field1851 != null) {
            this.field1851.method2579(31088);
        }
        field1842++;
        if (arg0 > -61) {
            field1826 = 53;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BZLqg;)V")
    public final void method963(byte arg0, boolean arg1, class429 arg2) {
        field1831++;
        if (this.field1851 != null) {
            try {
                this.field1851.method2579(31088);
            } catch (Exception var9) {
            }
            this.field1851 = null;
        }
        this.field1851 = arg2;
        this.method971(3);
        this.method957(arg1, 23431);
        this.field1854.field5195 = 0;
        this.field1857 = null;
        while (true) {
            class447 var4 = (class447) this.field1845.method352((byte) 115);
            if (var4 == null) {
                int var5 = 47 / ((31 - arg0) / 62);
                while (true) {
                    class447 var6 = (class447) this.field1848.method352((byte) 115);
                    if (var6 == null) {
                        if (this.field1855 != 0) {
                            try {
                                this.field1849.field5195 = 0;
                                this.field1849.method2281((byte) 58, 4);
                                this.field1849.method2281((byte) 58, this.field1855);
                                this.field1849.method2261((byte) 47, 0);
                                this.field1851.method2576(this.field1849.field5205, (byte) -126, 0, 4);
                            } catch (IOException var8) {
                                try {
                                    this.field1851.method2579(31088);
                                } catch (Exception var7) {
                                }
                                this.field1853 = -2;
                                this.field1856++;
                                this.field1851 = null;
                            }
                        }
                        this.field1852 = 0;
                        this.field1850 = class301.method1787((byte) 50);
                        return;
                    }
                    this.field1847.method345(var6, -1);
                }
            }
            this.field1839.method345(var4, -1);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)Z")
    public final boolean method964(byte arg0) {
        field1846++;
        if (arg0 <= 30) {
            return false;
        } else {
            return this.method958(-98) >= 20;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII[B)Ljava/lang/String;")
    public static final String method965(byte arg0, int arg1, int arg2, byte[] arg3) {
        field1824++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        if (arg0 != -107) {
            return null;
        }
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg3[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class661.field9379[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)I")
    private final int method966(int arg0) {
        field1843++;
        if (arg0 != 1724) {
            this.method959(69);
        }
        return this.field1847.method350((byte) 96) + this.field1848.method350((byte) 72);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 18648) {
            return;
        }
        field1833++;
        if (arg0 == arg7) {
            class543.method3182(arg6, arg3, arg1, 31110, arg5, arg7, arg2);
        } else if (class587.field8513 <= (arg5 - arg7) && (arg5 + arg7) <= class221.field2866 && class598.field8632 <= arg3 - arg0 && class288.field3883 >= (arg3 + arg0)) {
            class430.method2586(arg6, arg5, (byte) -18, arg1, arg0, arg2, arg3, arg7);
        } else {
            class375.method2181(arg6, arg1, arg2, arg0, -1553984318, arg5, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V")
    public final void method968(byte arg0) {
        field1830++;
        if (this.field1851 == null) {
            return;
        }
        try {
            this.field1849.field5195 = 0;
            this.field1849.method2281((byte) 58, 7);
            int var2 = -22 / ((arg0 - 78) / 37);
            this.field1849.method2217((byte) -42, 0);
            this.field1851.method2576(this.field1849.field5205, (byte) -112, 0, 4);
        } catch (IOException var4) {
            try {
                this.field1851.method2579(31088);
            } catch (Exception var3) {
            }
            this.field1853 = -2;
            this.field1856++;
            this.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZBB)Lcga;")
    public final class447 method969(int arg0, int arg1, boolean arg2, byte arg3, byte arg4) {
        field1844++;
        long var6 = (long) ((arg1 << 16) + arg0);
        class447 var8 = new class447();
        var8.field2555 = arg2;
        var8.field2006 = var6;
        var8.field6328 = arg4;
        if (arg3 != 82) {
            this.field1847 = null;
        }
        if (arg2) {
            if (this.method958(-85) >= 20) {
                throw new RuntimeException();
            }
            this.field1839.method345(var8, arg3 ^ 0xFFFFFFAD);
        } else if (this.method966(arg3 + 1642) < 20) {
            this.field1847.method345(var8, -1);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)Z")
    public final boolean method970(int arg0) {
        if (this.field1851 != null) {
            long var2 = class301.method1787((byte) -75);
            int var4 = (int) (var2 - this.field1850);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1850 = var2;
            this.field1852 += var4;
            if (this.field1852 > 30000) {
                try {
                    this.field1851.method2579(arg0 + 31088);
                } catch (Exception var27) {
                }
                this.field1851 = null;
            }
        }
        field1841++;
        if (this.field1851 == null) {
            return this.method958(-101) == 0 && this.method966(1724) == 0;
        }
        try {
            this.field1851.method2574(false);
            for (class447 var5 = (class447) this.field1839.method347(arg0); var5 != null; var5 = (class447) this.field1839.method344((byte) 24)) {
                this.field1849.field5195 = 0;
                this.field1849.method2281((byte) 58, 1);
                this.field1849.method2217((byte) -42, (int) var5.field2006);
                this.field1851.method2576(this.field1849.field5205, (byte) -84, 0, 4);
                this.field1845.method345(var5, -1);
            }
            for (class447 var6 = (class447) this.field1847.method347(0); var6 != null; var6 = (class447) this.field1847.method344((byte) 24)) {
                this.field1849.field5195 = 0;
                this.field1849.method2281((byte) 58, 0);
                this.field1849.method2217((byte) -42, (int) var6.field2006);
                this.field1851.method2576(this.field1849.field5205, (byte) -81, 0, 4);
                this.field1848.method345(var6, -1);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1851.method2582(false);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1852 = 0;
                byte var9 = 0;
                if (this.field1857 == null) {
                    var9 = 8;
                } else if (this.field1857.field6331 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field1857.field6330.field5205.length - this.field1857.field6328;
                    int var11 = 512 - this.field1857.field6331;
                    if ((var10 - this.field1857.field6330.field5195) < var11) {
                        var11 = var10 - this.field1857.field6330.field5195;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field1851.method2581((byte) -95, this.field1857.field6330.field5195, this.field1857.field6330.field5205, var11);
                    if (this.field1855 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1857.field6330.field5205[this.field1857.field6330.field5195 + var12] = (byte) class570.method3340(this.field1857.field6330.field5205[this.field1857.field6330.field5195 + var12], this.field1855);
                        }
                    }
                    this.field1857.field6330.field5195 += var11;
                    this.field1857.field6331 += var11;
                    if (this.field1857.field6330.field5195 == var10) {
                        this.field1857.method1037(arg0 ^ 0xFFFFFFBC);
                        this.field1857.field2557 = false;
                        this.field1857 = null;
                    } else if (this.field1857.field6331 == 512) {
                        this.field1857.field6331 = 0;
                    }
                } else {
                    int var13 = var9 - this.field1854.field5195;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field1851.method2581((byte) -98, this.field1854.field5195, this.field1854.field5205, var13);
                    if (this.field1855 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field1854.field5205[this.field1854.field5195 + var14] = (byte) class570.method3340(this.field1854.field5205[this.field1854.field5195 + var14], this.field1855);
                        }
                    }
                    this.field1854.field5195 += var13;
                    if (this.field1854.field5195 >= var9) {
                        if (this.field1857 == null) {
                            this.field1854.field5195 = 0;
                            int var15 = this.field1854.method2229(255);
                            int var16 = this.field1854.method2260(-73);
                            int var17 = this.field1854.method2229(255);
                            int var18 = this.field1854.method2255(255);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class447 var24;
                            if (var20) {
                                for (var24 = (class447) this.field1848.method347(0); var24 != null && var24.field2006 != var21; var24 = (class447) this.field1848.method344((byte) 24)) {
                                }
                            } else {
                                for (var24 = (class447) this.field1845.method347(arg0); var24 != null && var24.field2006 != var21; var24 = (class447) this.field1845.method344((byte) 24)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field1857 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field1857.field6330 = new class389(this.field1857.field6328 + var25 + var18);
                            this.field1857.field6330.method2281((byte) 58, var19);
                            this.field1857.field6330.method2233((byte) 61, var18);
                            this.field1857.field6331 = 8;
                            this.field1854.field5195 = 0;
                        } else if (this.field1857.field6331 != 0) {
                            throw new IOException();
                        } else if (this.field1854.field5205[0] == -1) {
                            this.field1854.field5195 = 0;
                            this.field1857.field6331 = 1;
                        } else {
                            this.field1857 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1851.method2579(arg0 + 31088);
            } catch (Exception var26) {
            }
            this.field1851 = null;
            this.field1856++;
            this.field1853 = -2;
            return this.method958(arg0 ^ 0x3C) == 0 && this.method966(1724) == 0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V")
    private final void method971(int arg0) {
        field1838++;
        if (this.field1851 == null) {
            return;
        }
        try {
            this.field1849.field5195 = 0;
            this.field1849.method2281((byte) 58, 6);
            this.field1849.method2217((byte) -42, arg0);
            this.field1851.method2576(this.field1849.field5205, (byte) -98, 0, 4);
        } catch (IOException var3) {
            try {
                this.field1851.method2579(31088);
            } catch (Exception var2) {
            }
            this.field1856++;
            this.field1853 = -2;
            this.field1851 = null;
        }
    }
}
