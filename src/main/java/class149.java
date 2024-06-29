import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class149 {

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Lgq;")
    private class540 field1822 = new class540();

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Lgq;")
    private class540 field1842 = new class540();

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lgq;")
    private class540 field1844 = new class540();

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lgq;")
    private class540 field1845 = new class540();

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lib;")
    private class163 field1849 = new class163(4);

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public volatile int field1850 = 0;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "B")
    private byte field1851 = 0;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public volatile int field1853 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lib;")
    private class163 field1852 = new class163(8);

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field1855 = new String[] { method1264(method1263("zV0vF")), method1264(method1263("o\rr4")), method1264(method1263("b\u001f0\u0015\u0013")), method1264(method1263("b\u001f0\u001d\u0013")), method1264(method1263("b\u001f0\u0010\u0013")), method1264(method1263("b\u001f0\u0012\u0013")), method1264(method1263("b\u001f0\u0014\u0013")), method1264(method1263("b\u001f0\u001c\u0013")), method1264(method1263("b\u001f0\u0013\u0013")), method1264(method1263("b\u001f0\u001a\u0013")), method1264(method1263("b\u001f0\u0016\u0013")), method1264(method1263("b\u001f0\u0017\u0013")), method1264(method1263("b\u001f0\u001f\u0013")), method1264(method1263("b\u001f0\n\u0013")), method1264(method1263("b\u001f0\u0019\u0013")), method1264(method1263("b\u001f0\u001e\u0013")), method1264(method1263("b\u001f0\u001b\u0013")), method1264(method1263("b\u001f0\b\u0013")), method1264(method1263("b\u001f0\t\u0013")), method1264(method1263("b\u001f0\u0011\u0013")) };

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lvaa;")
    public static class494 field1834 = new class494(4, 1);

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field1840 = -1;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    private int field1847;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "J")
    private long field1846;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lbu;")
    public static class21 field1830;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Liea;")
    private class504 field1848;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "Lih;")
    private class727 field1854;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z", line = 13)
    public static final boolean method1245(int arg0, int arg1, int arg2) {
        try {
            if (arg2 != -16777216) {
                method1245(104, -18, 78);
            }
            field1833++;
            return (arg0 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1855[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)Z", line = 25)
    public final boolean method1246(int arg0) {
        try {
            field1821++;
            if (arg0 == 0) {
                return this.method1257(-7952) >= 20;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1855[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)Z", line = 37)
    public final boolean method1247(int arg0) {
        try {
            int var2 = 19 / ((arg0 - 51) / 50);
            field1839++;
            return this.method1252(1) >= 20;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1855[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V", line = 48)
    public final void method1248(int arg0) {
        try {
            field1843++;
            if (arg0 != -13) {
                this.method1258((byte) 53);
            }
            if (this.field1848 != null) {
                this.field1848.method3795(arg0 ^ 0xFFFFFFD2);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1855[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V", line = 62)
    public final void method1249(int arg0) {
        try {
            if (this.field1848 != null) {
                this.field1848.method3802((byte) -73);
            }
            field1827++;
            if (arg0 != 0) {
                this.method1255(null, true, 79);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1855[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Z", line = 75)
    public final boolean method1250(int arg0) {
        try {
            if (this.field1848 != null) {
                long var2 = class430.method3299(97);
                int var4 = (int) (var2 - this.field1846);
                if (var4 > 200) {
                    var4 = 200;
                }
                this.field1846 = var2;
                this.field1847 += var4;
                if (this.field1847 > 30000) {
                    try {
                        this.field1848.method3795(54);
                    } catch (Exception var28) {
                    }
                    this.field1848 = null;
                }
            }
            field1829++;
            if (this.field1848 == null) {
                return this.method1252(1) == 0 && this.method1257(arg0 - 8152) == 0;
            }
            try {
                this.field1848.method3797(-106);
                for (class727 var5 = (class727) this.field1822.method4068(false); var5 != null; var5 = (class727) this.field1822.method4072(-127)) {
                    this.field1849.field2201 = 0;
                    this.field1849.method1428((byte) -24, 1);
                    this.field1849.method1448(-128, (int) var5.field533);
                    this.field1848.method3799(0, this.field1849.field2209, 4, (byte) -125);
                    this.field1842.method4067((byte) 45, var5);
                }
                if (arg0 != 200) {
                    this.field1848 = null;
                }
                for (class727 var6 = (class727) this.field1844.method4068(false); var6 != null; var6 = (class727) this.field1844.method4072(-87)) {
                    this.field1849.field2201 = 0;
                    this.field1849.method1428((byte) -24, 0);
                    this.field1849.method1448(-128, (int) var6.field533);
                    this.field1848.method3799(0, this.field1849.field2209, 4, (byte) -120);
                    this.field1845.method4067((byte) 100, var6);
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = this.field1848.method3798(30000);
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    this.field1847 = 0;
                    byte var9 = 0;
                    if (this.field1854 == null) {
                        var9 = 8;
                    } else if (this.field1854.field10539 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - this.field1852.field2201;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        this.field1848.method3800(this.field1852.field2209, var10, false, this.field1852.field2201);
                        if (this.field1851 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                this.field1852.field2209[this.field1852.field2201 + var11] = (byte) class219.method1916(this.field1852.field2209[this.field1852.field2201 + var11], this.field1851);
                            }
                        }
                        this.field1852.field2201 += var10;
                        if (var9 <= this.field1852.field2201) {
                            if (this.field1854 == null) {
                                this.field1852.field2201 = 0;
                                int var12 = this.field1852.method1455((byte) 62);
                                int var13 = this.field1852.method1445((byte) 121);
                                int var14 = this.field1852.method1455((byte) 62);
                                int var15 = this.field1852.method1453((byte) 91);
                                int var16 = var14 & 0x7F;
                                boolean var17 = (var14 & 0x80) != 0;
                                long var18 = (long) ((var12 << 16) + var13);
                                Object var20 = null;
                                class727 var21;
                                if (var17) {
                                    for (var21 = (class727) this.field1845.method4068(false); var21 != null && var21.field533 != var18; var21 = (class727) this.field1845.method4072(arg0 - 321)) {
                                    }
                                } else {
                                    for (var21 = (class727) this.field1842.method4068(false); var21 != null && var21.field533 != var18; var21 = (class727) this.field1842.method4072(arg0 - 311)) {
                                    }
                                }
                                if (var21 == null) {
                                    throw new IOException();
                                }
                                int var22 = var16 == 0 ? 5 : 9;
                                this.field1854 = var21;
                                this.field1854.field10547 = new class163(var15 + var22 + this.field1854.field10543);
                                this.field1854.field10547.method1428((byte) -24, var16);
                                this.field1854.field10547.method1412(true, var15);
                                this.field1852.field2201 = 0;
                                this.field1854.field10539 = 8;
                            } else if (this.field1854.field10539 != 0) {
                                throw new IOException();
                            } else if (this.field1852.field2209[0] == -1) {
                                this.field1852.field2201 = 0;
                                this.field1854.field10539 = 1;
                            } else {
                                this.field1854 = null;
                            }
                        }
                    } else {
                        int var23 = this.field1854.field10547.field2209.length - this.field1854.field10543;
                        int var24 = 512 - this.field1854.field10539;
                        if (var23 - this.field1854.field10547.field2201 < var24) {
                            var24 = var23 - this.field1854.field10547.field2201;
                        }
                        if (var8 < var24) {
                            var24 = var8;
                        }
                        this.field1848.method3800(this.field1854.field10547.field2209, var24, false, this.field1854.field10547.field2201);
                        if (this.field1851 != 0) {
                            for (int var25 = 0; var25 < var24; var25++) {
                                this.field1854.field10547.field2209[this.field1854.field10547.field2201 + var25] = (byte) class219.method1916(this.field1854.field10547.field2209[this.field1854.field10547.field2201 + var25], this.field1851);
                            }
                        }
                        this.field1854.field10547.field2201 += var24;
                        this.field1854.field10539 += var24;
                        if (this.field1854.field10547.field2201 == var23) {
                            this.field1854.method362((byte) 72);
                            this.field1854.field8473 = false;
                            this.field1854 = null;
                        } else if (this.field1854.field10539 == 512) {
                            this.field1854.field10539 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var29) {
                try {
                    this.field1848.method3795(70);
                } catch (Exception var27) {
                }
                this.field1853 = -2;
                this.field1850++;
                this.field1848 = null;
                return this.method1252(1) == 0 && this.method1257(arg0 - 8152) == 0;
            }
        } catch (RuntimeException var30) {
            throw class759.method5498(var30, field1855[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V", line = 359)
    public static void method1251(byte arg0) {
        try {
            field1834 = null;
            field1830 = null;
            if (arg0 >= -2) {
                field1830 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1855[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)I", line = 376)
    public final int method1252(int arg0) {
        try {
            field1841++;
            return arg0 == 1 ? this.field1822.method4071(-50) + this.field1842.method4071(-74) : 17;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1855[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V", line = 388)
    private final void method1253(byte arg0) {
        try {
            field1837++;
            if (arg0 < -61 && this.field1848 != null) {
                try {
                    this.field1849.field2201 = 0;
                    this.field1849.method1428((byte) -24, 6);
                    this.field1849.method1448(-127, 3);
                    this.field1848.method3799(0, this.field1849.field2209, 4, (byte) -48);
                } catch (IOException var4) {
                    try {
                        this.field1848.method3795(97);
                    } catch (Exception var3) {
                    }
                    this.field1850++;
                    this.field1853 = -2;
                    this.field1848 = null;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1855[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BZ)V", line = 416)
    public final void method1254(byte arg0, boolean arg1) {
        try {
            field1832++;
            if (this.field1848 != null) {
                try {
                    this.field1849.field2201 = 0;
                    this.field1849.method1428((byte) -24, arg1 ? 2 : 3);
                    if (arg0 != 1) {
                        this.field1822 = null;
                    }
                    this.field1849.method1448(arg0 - 129, 0);
                    this.field1848.method3799(0, this.field1849.field2209, 4, (byte) -67);
                } catch (IOException var5) {
                    try {
                        this.field1848.method3795(32);
                    } catch (Exception var4) {
                    }
                    this.field1853 = -2;
                    this.field1848 = null;
                    this.field1850++;
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1855[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Liea;ZI)V", line = 444)
    public final void method1255(class504 arg0, boolean arg1, int arg2) {
        try {
            field1835++;
            if (this.field1848 != null) {
                try {
                    this.field1848.method3795(40);
                } catch (Exception var9) {
                }
                this.field1848 = null;
            }
            this.field1848 = arg0;
            this.method1253((byte) -100);
            this.method1254((byte) 1, arg1);
            this.field1852.field2201 = 0;
            this.field1854 = null;
            while (true) {
                class727 var4 = (class727) this.field1842.method4064(-21877);
                if (var4 == null) {
                    while (true) {
                        class727 var5 = (class727) this.field1845.method4064(-21877);
                        if (var5 == null) {
                            if (this.field1851 != 0) {
                                try {
                                    this.field1849.field2201 = 0;
                                    this.field1849.method1428((byte) -24, 4);
                                    this.field1849.method1428((byte) -24, this.field1851);
                                    this.field1849.method1406(0, 380332136);
                                    this.field1848.method3799(0, this.field1849.field2209, 4, (byte) -89);
                                } catch (IOException var8) {
                                    try {
                                        this.field1848.method3795(70);
                                    } catch (Exception var7) {
                                    }
                                    this.field1850++;
                                    this.field1853 = -2;
                                    this.field1848 = null;
                                }
                            }
                            if (arg2 == 28323) {
                                this.field1847 = 0;
                                this.field1846 = class430.method3299(arg2 - 28206);
                                return;
                            } else {
                                return;
                            }
                        }
                        this.field1844.method4067((byte) 35, var5);
                    }
                }
                this.field1822.method4067((byte) -121, var4);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field1855[2] + (arg0 == null ? field1855[1] : field1855[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 514)
    public static final void method1256(byte arg0) {
        try {
            if (arg0 > -49) {
                method1245(126, 122, -121);
            }
            field1825++;
            for (class326 var1 = (class326) class115.field1368.method3863((byte) 64); var1 != null; var1 = (class326) class115.field1368.method3862(-353)) {
                if (var1.field5149) {
                    var1.method1824(1);
                } else {
                    var1.field5134 = true;
                    if (var1.field5136 >= 0 && var1.field5148 >= 0 && class648.field9378 > var1.field5136 && class659.field9506 > var1.field5148) {
                        class64.method454(-14496, var1);
                    }
                }
            }
            for (class326 var2 = (class326) class403.field6017.method3863((byte) 64); var2 != null; var2 = (class326) class403.field6017.method3862(-353)) {
                if (var2.field5149) {
                    var2.method1824(1);
                } else {
                    var2.field5134 = true;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1855[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)I", line = 559)
    private final int method1257(int arg0) {
        try {
            if (arg0 == -7952) {
                field1836++;
                return this.field1844.method4071(-107) + this.field1845.method4071(-49);
            } else {
                return -117;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1855[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 570)
    public final void method1258(byte arg0) {
        try {
            try {
                this.field1848.method3795(106);
            } catch (Exception var3) {
            }
            field1826++;
            if (arg0 != 44) {
                this.method1246(10);
            }
            this.field1851 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field1848 = null;
            this.field1853 = -1;
            this.field1850++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1855[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIIIB)Lih;", line = 588)
    public final class727 method1259(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            field1823++;
            long var6 = (long) ((arg1 << 16) + arg3);
            class727 var8 = new class727();
            var8.field8479 = arg0;
            if (arg2 != 8133) {
                field1834 = null;
            }
            var8.field533 = var6;
            var8.field10543 = arg4;
            if (arg0) {
                if (this.method1252(arg2 - 8132) >= 20) {
                    throw new RuntimeException();
                }
                this.field1822.method4067((byte) 36, var8);
            } else if (this.method1257(-7952) < 20) {
                this.field1844.method4067((byte) -97, var8);
            } else {
                throw new RuntimeException();
            }
            return var8;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field1855[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)V", line = 630)
    public final void method1260(int arg0) {
        try {
            field1838++;
            if (this.field1848 != null) {
                try {
                    this.field1849.field2201 = 0;
                    this.field1849.method1428((byte) -24, 7);
                    this.field1849.method1448(-127, 0);
                    this.field1848.method3799(arg0, this.field1849.field2209, 4, (byte) -106);
                } catch (IOException var4) {
                    try {
                        this.field1848.method3795(81);
                    } catch (Exception var3) {
                    }
                    this.field1850++;
                    this.field1853 = -2;
                    this.field1848 = null;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1855[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)V", line = 661)
    public static final void method1261(byte arg0, int arg1) {
        try {
            int var2 = -1 / ((-arg0 - 57) / 54);
            field1824++;
            if (arg1 < 0 || arg1 > 2) {
                arg1 = 0;
            }
            class222.field3408 = arg1;
            class784.field11420 = new class619[class211.field3243[class222.field3408] + 1];
            class139.field1657 = 0;
            class648.field9382 = 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1855[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLha;)V", line = 681)
    public static final void method1262(byte arg0, class66 arg1) {
        try {
            field1828++;
            int var2 = 0;
            int var3 = 0;
            if (class235.field3549) {
                var2 = class398.method3141(1);
                var3 = class779.method5635((byte) 32);
            }
            int var4 = class476.field6905 + var2;
            int var5 = class668.field9704 + var3;
            int var6 = class371.field5655;
            int var7 = class387.field5849 - 3;
            byte var8 = 20;
            class669.method4922(class387.field5849, class668.field9704 + var3, class371.field5655, (byte) -127, arg1, class309.field4871.method2616(false, class167.field2300), var8, class476.field6905 + var2);
            if (arg0 > -104) {
                method1251((byte) -19);
            }
            int var9 = class606.field8875.method401(16428) + var2;
            int var10 = class606.field8875.method391((byte) 94) + var3;
            if (class514.field7425) {
                int var11 = 0;
                for (class655 var12 = (class655) class492.field7058.method4068(false); var12 != null; var12 = (class655) class492.field7058.method4072(-52)) {
                    int var13 = var11 * 16 + (var5 + var8 + 13);
                    if (var9 > (class476.field6905 + var2) && var9 < class371.field5655 + var2 + class476.field6905 && var13 - 13 < var10 && var10 < var13 + 4 && (var12.field9459 > 1 || ((class417) var12.field9457.field7916.field529).field6142)) {
                        arg1.method556(class476.field6905 + var2, var13 + -12, class371.field5655, 16, 255 - class5.field45 << 24 | class344.field5362, 1);
                    }
                    var11++;
                }
                if (class381.field5783 != null) {
                    class669.method4922(class259.field3999, class80.field903, class662.field9570, (byte) -127, arg1, class381.field5783.field9460, var8, class348.field5390);
                    int var14 = 0;
                    for (class417 var15 = (class417) class381.field5783.field9457.method4068(false); var15 != null; var15 = (class417) class381.field5783.field9457.method4072(-54)) {
                        int var16 = var8 + class80.field903 + (var14 * 16) + 13;
                        if (class348.field5390 < var9 && var9 < class662.field9570 + class348.field5390 && var16 - 13 < var10 && var10 < var16 + 4 && var15.field6142) {
                            arg1.method556(class348.field5390, var16 - 12, class662.field9570, 16, 255 - class5.field45 << 24 | class344.field5362, 1);
                        }
                        var14++;
                    }
                    class683.method5010(class259.field3999, arg1, class348.field5390, var8, class80.field903, class662.field9570, 0);
                }
            } else {
                int var17 = 0;
                for (class417 var18 = (class417) class728.field10549.method3863((byte) 64); var18 != null; var18 = (class417) class728.field10549.method3862(-353)) {
                    int var19 = var5 + var8 + ((class593.field8707 + -1 + -var17) * 16) + 13;
                    if (var9 > class476.field6905 + var2 && class476.field6905 + class371.field5655 + var2 > var9 && (var19 - 13) < var10 && var10 < var19 + 4 && var18.field6142) {
                        arg1.method556(class476.field6905 + var2, var19 + -12, class371.field5655, 16, class344.field5362 | 255 - class5.field45 << 24, 1);
                    }
                    var17++;
                }
            }
            class683.method5010(class387.field5849, arg1, class476.field6905 + var2, var8, class668.field9704 + var3, class371.field5655, 0);
            if (class514.field7425) {
                int var20 = 0;
                for (class655 var21 = (class655) class492.field7058.method4068(false); var21 != null; var21 = (class655) class492.field7058.method4072(-117)) {
                    int var22 = class668.field9704 + var3 + var8 + var20 * 16 + 13;
                    var20++;
                    if (var21.field9459 == 1) {
                        class108.method952(0, class387.field5849, class476.field6905 + var2, class371.field5655, class208.field3192 | 0xFF000000, var10, class376.field5737 | 0xFF000000, var9, (class417) var21.field9457.field7916.field529, var22, arg1, class668.field9704 + var3);
                    } else {
                        class340.method2828(class387.field5849, var22, -10070, class668.field9704 + var3, class376.field5737 | 0xFF000000, var9, var10, var21, class476.field6905 + var2, arg1, class371.field5655, class208.field3192 | 0xFF000000);
                    }
                }
                if (class381.field5783 != null) {
                    int var23 = 0;
                    for (class417 var24 = (class417) class381.field5783.field9457.method4068(false); var24 != null; var24 = (class417) class381.field5783.field9457.method4072(-46)) {
                        int var25 = var23 * 16 + class80.field903 + var8 + 13;
                        var23++;
                        class108.method952(0, class259.field3999, class348.field5390, class662.field9570, class208.field3192 | 0xFF000000, var10, class376.field5737 | 0xFF000000, var9, var24, var25, arg1, class80.field903);
                    }
                    class321.method2721(class662.field9570, class80.field903, (byte) -124, class259.field3999, class348.field5390);
                }
            } else {
                int var26 = 0;
                for (class417 var27 = (class417) class728.field10549.method3863((byte) 64); var27 != null; var27 = (class417) class728.field10549.method3862(-353)) {
                    int var28 = (class593.field8707 - var26 - 1) * 16 + (var5 + var8 + 13);
                    class108.method952(0, var7, var4, var6, class208.field3192 | 0xFF000000, var10, class376.field5737 | 0xFF000000, var9, var27, var28, arg1, var5);
                    var26++;
                }
            }
            class321.method2721(class371.field5655, class668.field9704 + var3, (byte) 57, class387.field5849, class476.field6905 + var2);
        } catch (RuntimeException var30) {
            throw class759.method5498(var30, field1855[13] + arg0 + ',' + (arg1 == null ? field1855[1] : field1855[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1263(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1264(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
