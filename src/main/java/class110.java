import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class110 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    private int field1843 = 0;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    private int field1849 = 0;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    private int field1856 = 128;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "B")
    public byte field1850 = 0;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "Z")
    public boolean field1852 = false;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public int field1853 = -1;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    private int field1855 = -1;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    private int field1847 = 0;

    @OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
    private int field1869 = 128;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "Lpi;")
    public static class342 field1862 = new class342("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!aq", name = "B", descriptor = "[I")
    public static int[] field1870 = new int[13];

    @OriginalMember(owner = "client!aq", name = "C", descriptor = "I")
    public static int field1871 = 0;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "Z")
    public static boolean field1867 = false;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "Lpi;")
    public static class342 field1864 = new class342("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "Lug;")
    public static class392 field1872 = new class392();

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    private int field1861;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "Lcn;")
    public class355 field1868;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "[S")
    private short[] field1854;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "[S")
    private short[] field1857;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "[S")
    private short[] field1859;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "[S")
    private short[] field1860;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lcu;IB)V")
    private final void method818(class145 arg0, int arg1, byte arg2) {
        field1865++;
        if (arg1 == 1) {
            this.field1861 = arg0.method1069((byte) -122);
        } else if (arg1 == 2) {
            this.field1853 = arg0.method1069((byte) -108);
        } else if (arg1 == 4) {
            this.field1869 = arg0.method1069((byte) -50);
        } else if (arg1 == 5) {
            this.field1856 = arg0.method1069((byte) -56);
        } else if (arg1 == 6) {
            this.field1843 = arg0.method1069((byte) -99);
        } else if (arg1 == 7) {
            this.field1847 = arg0.method1063((byte) 105);
        } else if (arg1 == 8) {
            this.field1849 = arg0.method1063((byte) -15);
        } else if (arg1 == 9) {
            this.field1855 = 8224;
            this.field1850 = 3;
        } else if (arg1 == 10) {
            this.field1852 = true;
        } else if (arg1 == 11) {
            this.field1850 = 1;
        } else if (arg1 == 12) {
            this.field1850 = 4;
        } else if (arg1 == 13) {
            this.field1850 = 5;
        } else if (arg1 == 14) {
            this.field1850 = 2;
            this.field1855 = arg0.method1063((byte) -40) * 256;
        } else if (arg1 == 15) {
            this.field1850 = 3;
            this.field1855 = arg0.method1069((byte) -52);
        } else if (arg1 == 16) {
            this.field1850 = 3;
            this.field1855 = arg0.method1070(arg2 - 32392);
        } else if (arg1 == 40) {
            int var6 = arg0.method1063((byte) 111);
            this.field1860 = new short[var6];
            this.field1859 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1860[var7] = (short) arg0.method1069((byte) -53);
                this.field1859[var7] = (short) arg0.method1069((byte) -21);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method1063((byte) 127);
            this.field1854 = new short[var4];
            this.field1857 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1854[var5] = (short) arg0.method1069((byte) -38);
                this.field1857[var5] = (short) arg0.method1069((byte) -95);
            }
        }
        if (arg2 != 5) {
            this.field1850 = 113;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
    public static void method819(byte arg0) {
        int var1 = -81 % ((arg0 - 44) / 53);
        field1872 = null;
        field1862 = null;
        field1870 = null;
        field1864 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
    public static final void method820(int arg0, int arg1) {
        if (arg1 != -18046) {
            field1864 = null;
        }
        field1858++;
        if (class355.method2252(arg0, -58)) {
            class245.method1592(-1, arg1 ^ 0x4602, class22.field438[arg0]);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lqf;IIIII)V")
    public static final void method821(class478 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field7132 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field7128[var6] != null) {
                arg0.field7132++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field7132; var7++) {
            long var8 = class217.field3128[arg1][arg2][arg3];
            while (var8 != 0L) {
                class459 var14 = class448.field6723[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field7128[var7] == var14.field6877) {
                    continue label50;
                }
            }
            long var10 = class217.field3128[arg1][arg4][arg5];
            while (var10 != 0L) {
                class459 var13 = class448.field6723[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field7128[var7] == var13.field6877) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field7132 - 1; var12++) {
                arg0.field7128[var12] = arg0.field7128[var12 + 1];
            }
            arg0.field7132--;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lli;BILjava/lang/String;)Lcq;")
    public static final class324 method822(class293 arg0, byte arg1, int arg2, String arg3) {
        field1851++;
        if (arg2 == 0) {
            return arg0.method1862(false, arg3);
        } else if (arg2 == 1) {
            try {
                class512.method3064(arg0.field4170, false, "openjs", new Object[] { (new URL(arg0.field4170.getCodeBase(), arg3)).toString() });
                class324 var4 = new class324();
                var4.field4940 = 1;
                return var4;
            } catch (Throwable var10) {
                class324 var5 = new class324();
                var5.field4940 = 2;
                return var5;
            }
        } else {
            if (arg1 >= -26) {
                field1870 = null;
            }
            if (arg2 == 2) {
                try {
                    arg0.field4170.getAppletContext().showDocument(new URL(arg0.field4170.getCodeBase(), arg3), "_blank");
                    class324 var6 = new class324();
                    var6.field4940 = 1;
                    return var6;
                } catch (Exception var11) {
                    class324 var7 = new class324();
                    var7.field4940 = 2;
                    return var7;
                }
            } else if (arg2 == 3) {
                try {
                    class512.method3065("loggedout", arg0.field4170, (byte) 10);
                } catch (Throwable var13) {
                }
                try {
                    arg0.field4170.getAppletContext().showDocument(new URL(arg0.field4170.getCodeBase(), arg3), "_top");
                    class324 var8 = new class324();
                    var8.field4940 = 1;
                    return var8;
                } catch (Exception var12) {
                    class324 var9 = new class324();
                    var9.field4940 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIILna;BLnt;Lqa;IIZLna;)Lc;")
    public final class121 method823(int arg0, int arg1, int arg2, int arg3, int arg4, class35 arg5, byte arg6, class147 arg7, class162 arg8, int arg9, int arg10, boolean arg11, class35 arg12) {
        field1848++;
        int var14 = 42 % ((arg6 - 33) / 62);
        return this.method827(arg5, arg0, arg1, (byte) -15, (byte) 2, arg2, arg9, arg3, arg7, arg10, arg12, arg4, arg11, arg8);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lqa;IIIIILnt;)Lc;")
    public final class121 method824(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class147 arg6) {
        if (arg4 != 1) {
            method819((byte) 31);
        }
        field1863++;
        return this.method827(null, arg2, 0, (byte) -106, (byte) 2, arg3, 0, arg5, arg6, arg1, null, 0, false, arg0);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lnt;IBLqa;III)Lc;")
    public final class121 method825(class147 arg0, int arg1, byte arg2, class162 arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 124) {
            this.method826(57, null);
        }
        field1845++;
        return this.method827(null, arg5, 0, (byte) -85, (byte) 5, arg6, 0, arg4, arg0, arg1, null, 0, false, arg3);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILcu;)V")
    public final void method826(int arg0, class145 arg1) {
        while (true) {
            int var3 = arg1.method1063((byte) -19);
            if (var3 == 0) {
                if (arg0 != -4550) {
                    field1870 = null;
                }
                field1846++;
                return;
            }
            this.method818(arg1, var3, (byte) 5);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lna;IIBBIIILnt;ILna;IZLqa;)Lc;")
    private final class121 method827(class35 arg0, int arg1, int arg2, byte arg3, byte arg4, int arg5, int arg6, int arg7, class147 arg8, int arg9, class35 arg10, int arg11, boolean arg12, class162 arg13) {
        field1866++;
        int var15 = arg7;
        class165 var16 = this.field1853 == -1 || arg9 == -1 ? null : arg8.method1137(47, this.field1853);
        boolean var17 = arg12 & this.field1850 != 0;
        if (var16 != null) {
            var15 = arg7 | var16.method1215((byte) -34, false, arg9, arg1);
        }
        if (var17) {
            var15 |= this.field1850 == 3 ? 7 : 2;
        }
        if (this.field1856 != 128) {
            var15 |= 0x2;
        }
        if (this.field1869 != 128 || this.field1843 != 0) {
            var15 |= 0x5;
        }
        class55 var18 = this.field1868.field5425;
        class121 var19;
        synchronized (this.field1868.field5425) {
            var19 = (class121) this.field1868.field5425.method494(0, (long) (this.field1844 |= arg13.field2502 << 29));
        }
        if (var19 == null || arg13.method255(var19.method889(), var15) != 0) {
            if (var19 != null) {
                var15 = arg13.method280(var15, var19.method889());
            }
            int var20 = var15;
            if (this.field1860 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field1854 != null) {
                var20 |= 0x8000;
            }
            class380 var21 = class410.method2492(0, true, this.field1868.field5415, this.field1861);
            if (var21 == null) {
                return null;
            }
            if (var21.field5736 < 13) {
                var21.method2369((byte) 100, 0);
            }
            var19 = arg13.method265(var21, var20, this.field1868.field5427, this.field1847 + 64, this.field1849 + 850);
            if (this.field1860 != null) {
                for (int var22 = 0; var22 < this.field1860.length; var22++) {
                    var19.method890(this.field1860[var22], this.field1859[var22]);
                }
            }
            if (this.field1854 != null) {
                for (int var23 = 0; var23 < this.field1854.length; var23++) {
                    var19.method933(this.field1854[var23], this.field1857[var23]);
                }
            }
            var19.method906(var15);
            class55 var24 = this.field1868.field5425;
            synchronized (this.field1868.field5425) {
                this.field1868.field5425.method485((long) (this.field1844 |= arg13.field2502 << 29), (byte) -125, var19);
            }
        }
        class121 var25 = var16 == null ? var19.method938(arg4, var15, true) : var16.method1217(arg9, arg1, 0, var19, 2190, arg5, var15, arg4);
        if (this.field1869 != 128 || this.field1856 != 128) {
            var25.method925(this.field1869, this.field1856, this.field1869);
        }
        if (arg3 >= -12) {
            return null;
        }
        if (this.field1843 != 0) {
            if (this.field1843 == 90) {
                var25.method912(4096);
            }
            if (this.field1843 == 180) {
                var25.method912(8192);
            }
            if (this.field1843 == 270) {
                var25.method912(12288);
            }
        }
        if (var17) {
            var25.method900(this.field1850, this.field1855, arg10, arg0, arg2, arg11, arg6);
        }
        var25.method906(arg7);
        return var25;
    }
}
