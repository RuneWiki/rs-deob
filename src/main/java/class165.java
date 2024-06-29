import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class165 {

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Lth;")
    private class288 field1836 = new class288();

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "Lth;")
    private class288 field1843 = new class288();

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Lth;")
    private class288 field1847 = new class288();

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "Lth;")
    private class288 field1849 = new class288();

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Lnp;")
    private class115 field1851 = new class115(4);

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "B")
    private byte field1856 = 0;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public volatile int field1854 = 0;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public volatile int field1855 = 0;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "Lnp;")
    private class115 field1857 = new class115(8);

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "Lie;")
    public static class117 field1838 = new class117(8);

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "[I")
    public static int[] field1848 = new int[1];

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    private int field1853;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "J")
    private long field1852;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "Lnu;")
    private class356 field1858;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "Lvea;")
    private class408 field1850;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method892(int arg0, boolean arg1) {
        field1844++;
        if (this.field1850 == null) {
            return;
        }
        try {
            if (arg0 > -86) {
                method896((byte) 121);
            }
            this.field1851.field1218 = 0;
            this.field1851.method658(arg1 ? 2 : 3, (byte) 101);
            this.field1851.method624(0, (byte) -99);
            this.field1850.method2281(4, this.field1851.field1269, (byte) -114, 0);
        } catch (IOException var4) {
            try {
                this.field1850.method2287(6780);
            } catch (Exception var3) {
            }
            this.field1850 = null;
            this.field1854++;
            this.field1855 = -2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V", line = 31)
    public final void method893(boolean arg0) {
        field1840++;
        if (arg0) {
            this.field1854 = -42;
        }
        if (this.field1850 != null) {
            this.field1850.method2282((byte) -87);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Z", line = 46)
    public final boolean method894(byte arg0) {
        field1832++;
        if (this.field1850 != null) {
            long var2 = class557.method3157(arg0 - 95);
            int var4 = (int) (var2 - this.field1852);
            this.field1852 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1853 += var4;
            if (this.field1853 > 30000) {
                try {
                    this.field1850.method2287(6780);
                } catch (Exception var27) {
                }
                this.field1850 = null;
            }
        }
        if (this.field1850 == null) {
            return this.method895((byte) -55) == 0 && this.method897((byte) 0) == 0;
        }
        try {
            this.field1850.method2288(0);
            for (class356 var5 = (class356) this.field1836.method1677(arg0 ^ 0x6F); var5 != null; var5 = (class356) this.field1836.method1681(112)) {
                this.field1851.field1218 = 0;
                this.field1851.method658(1, (byte) 91);
                this.field1851.method624((int) var5.field8693, (byte) -95);
                this.field1850.method2281(4, this.field1851.field1269, (byte) -101, 0);
                this.field1843.method1680(26, var5);
            }
            for (class356 var6 = (class356) this.field1847.method1677(-126); var6 != null; var6 = (class356) this.field1847.method1681(109)) {
                this.field1851.field1218 = 0;
                this.field1851.method658(0, (byte) 117);
                this.field1851.method624((int) var6.field8693, (byte) -104);
                this.field1850.method2281(4, this.field1851.field1269, (byte) -119, 0);
                this.field1849.method1680(120, var6);
            }
            int var7 = 0;
            if (arg0 != -18) {
                this.method898(false, 62, null);
            }
            while (var7 < 100) {
                int var8 = this.field1850.method2284(5000);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1853 = 0;
                byte var9 = 0;
                if (this.field1858 == null) {
                    var9 = 8;
                } else if (this.field1858.field4785 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field1857.field1218;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field1850.method2283(this.field1857.field1218, arg0 ^ 0x11, this.field1857.field1269, var10);
                    if (this.field1856 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field1857.field1269[this.field1857.field1218 + var11] = (byte) class2.method13(this.field1857.field1269[this.field1857.field1218 + var11], this.field1856);
                        }
                    }
                    this.field1857.field1218 += var10;
                    if (var9 <= this.field1857.field1218) {
                        if (this.field1858 == null) {
                            this.field1857.field1218 = 0;
                            int var12 = this.field1857.method620((byte) -127);
                            int var13 = this.field1857.method643((byte) -77);
                            int var14 = this.field1857.method620((byte) 0);
                            int var15 = this.field1857.method631(false);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class356 var21;
                            if (var17) {
                                for (var21 = (class356) this.field1849.method1677(arg0 + 71); var21 != null && var21.field8693 != var18; var21 = (class356) this.field1849.method1681(arg0 + 90)) {
                                }
                            } else {
                                for (var21 = (class356) this.field1843.method1677(-86); var21 != null && var21.field8693 != var18; var21 = (class356) this.field1843.method1681(93)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field1858 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field1858.field4783 = new class115(this.field1858.field4778 + var22 + var15);
                            this.field1858.field4783.method658(var16, (byte) 84);
                            this.field1858.field4783.method660((byte) 91, var15);
                            this.field1857.field1218 = 0;
                            this.field1858.field4785 = 8;
                        } else if (this.field1858.field4785 != 0) {
                            throw new IOException();
                        } else if (this.field1857.field1269[0] == -1) {
                            this.field1857.field1218 = 0;
                            this.field1858.field4785 = 1;
                        } else {
                            this.field1858 = null;
                        }
                    }
                } else {
                    int var23 = this.field1858.field4783.field1269.length - this.field1858.field4778;
                    int var24 = 512 - this.field1858.field4785;
                    if (var24 > (var23 - this.field1858.field4783.field1218)) {
                        var24 = var23 - this.field1858.field4783.field1218;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field1850.method2283(this.field1858.field4783.field1218, -1, this.field1858.field4783.field1269, var24);
                    if (this.field1856 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field1858.field4783.field1269[this.field1858.field4783.field1218 + var25] = (byte) class2.method13(this.field1858.field4783.field1269[this.field1858.field4783.field1218 + var25], this.field1856);
                        }
                    }
                    this.field1858.field4785 += var24;
                    this.field1858.field4783.field1218 += var24;
                    if (this.field1858.field4783.field1218 == var23) {
                        this.field1858.method3443(arg0 + 143);
                        this.field1858.field2767 = false;
                        this.field1858 = null;
                    } else if (this.field1858.field4785 == 512) {
                        this.field1858.field4785 = 0;
                    }
                }
                var7++;
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1850.method2287(arg0 + 6798);
            } catch (Exception var26) {
            }
            this.field1850 = null;
            this.field1854++;
            this.field1855 = -2;
            return this.method895((byte) -55) == 0 && this.method897((byte) 0) == 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)I", line = 323)
    public final int method895(byte arg0) {
        field1846++;
        if (arg0 != -55) {
            this.field1855 = -112;
        }
        return this.field1836.method1675((byte) -93) + this.field1843.method1675((byte) -93);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V", line = 342)
    public static final void method896(byte arg0) {
        class287[] var1 = class594.field8381;
        synchronized (class594.field8381) {
            if (arg0 != 20) {
                field1838 = null;
            }
            int var2 = 0;
            while (true) {
                if (class594.field8381.length <= var2) {
                    break;
                }
                class594.field8381[var2] = new class287();
                class436.field6146[var2] = 0;
                var2++;
            }
        }
        field1833++;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)I", line = 367)
    private final int method897(byte arg0) {
        if (arg0 == 0) {
            field1839++;
            return this.field1847.method1675((byte) -93) + this.field1849.method1675((byte) -93);
        } else {
            return -32;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZILvea;)V", line = 378)
    public final void method898(boolean arg0, int arg1, class408 arg2) {
        if (this.field1850 != null) {
            try {
                this.field1850.method2287(6780);
            } catch (Exception var8) {
            }
            this.field1850 = null;
        }
        field1834++;
        this.field1850 = arg2;
        this.method904(arg1 ^ arg1);
        this.method892(-104, arg0);
        this.field1857.field1218 = 0;
        this.field1858 = null;
        while (true) {
            class356 var4 = (class356) this.field1843.method1678(true);
            if (var4 == null) {
                while (true) {
                    class356 var5 = (class356) this.field1849.method1678(true);
                    if (var5 == null) {
                        if (this.field1856 != 0) {
                            try {
                                this.field1851.field1218 = 0;
                                this.field1851.method658(4, (byte) 82);
                                this.field1851.method658(this.field1856, (byte) 74);
                                this.field1851.method645(-672168216, 0);
                                this.field1850.method2281(4, this.field1851.field1269, (byte) -87, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field1850.method2287(6780);
                                } catch (Exception var6) {
                                }
                                this.field1855 = -2;
                                this.field1854++;
                                this.field1850 = null;
                            }
                        }
                        this.field1853 = 0;
                        this.field1852 = class557.method3157(-61);
                        return;
                    }
                    this.field1847.method1680(arg1 ^ 0x5F, var5);
                }
            }
            this.field1836.method1680(83, var4);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 445)
    public static void method899(int arg0) {
        if (arg0 > -74) {
            method896((byte) 74);
        }
        field1848 = null;
        field1838 = null;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)V", line = 456)
    public final void method900(byte arg0) {
        field1835++;
        if (this.field1850 == null || arg0 != -120) {
            return;
        }
        try {
            this.field1851.field1218 = 0;
            this.field1851.method658(7, (byte) 98);
            this.field1851.method624(0, (byte) -111);
            this.field1850.method2281(4, this.field1851.field1269, (byte) -108, 0);
        } catch (IOException var3) {
            try {
                this.field1850.method2287(arg0 ^ 0xFFFFE5F4);
            } catch (Exception var2) {
            }
            this.field1850 = null;
            this.field1854++;
            this.field1855 = -2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V", line = 485)
    public final void method901(boolean arg0) {
        if (this.field1850 != null) {
            this.field1850.method2287(6780);
        }
        if (!arg0) {
            field1831++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(Z)Z", line = 505)
    public final boolean method902(boolean arg0) {
        field1830++;
        if (arg0) {
            this.method898(true, -111, null);
        }
        return this.method897((byte) 0) >= 20;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IBIZI)Lnu;", line = 516)
    public final class356 method903(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field1837++;
        if (arg0 != 21423) {
            return null;
        }
        long var6 = (long) ((arg4 << 16) + arg2);
        class356 var8 = new class356();
        var8.field8693 = var6;
        var8.field2770 = arg3;
        var8.field4778 = arg1;
        if (arg3) {
            if (this.method895((byte) -55) >= 20) {
                throw new RuntimeException();
            }
            this.field1836.method1680(arg0 ^ 0x53AA, var8);
        } else if (this.method897((byte) 0) < 20) {
            this.field1847.method1680(37, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 558)
    private final void method904(int arg0) {
        field1842++;
        if (this.field1850 == null) {
            return;
        }
        try {
            this.field1851.field1218 = 0;
            this.field1851.method658(6, (byte) 106);
            this.field1851.method624(3, (byte) -123);
            this.field1850.method2281(4, this.field1851.field1269, (byte) -90, arg0);
        } catch (IOException var3) {
            try {
                this.field1850.method2287(6780);
            } catch (Exception var2) {
            }
            this.field1855 = -2;
            this.field1850 = null;
            this.field1854++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V", line = 586)
    public final void method905(int arg0) {
        field1841++;
        try {
            this.field1850.method2287(6780);
        } catch (Exception var2) {
        }
        this.field1854++;
        this.field1855 = -1;
        this.field1850 = null;
        this.field1856 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0 < 68) {
            method899(-128);
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Z", line = 604)
    public final boolean method906(int arg0) {
        field1845++;
        if (arg0 != -21) {
            method899(126);
        }
        return this.method895((byte) -55) >= 20;
    }
}
