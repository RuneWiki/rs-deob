import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class51 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Llq;")
    private class5 field645 = new class5();

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Llq;")
    private class5 field660 = new class5();

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Llq;")
    private class5 field662 = new class5();

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Llq;")
    private class5 field663 = new class5();

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "Lef;")
    private class385 field665 = new class385(4);

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "B")
    private byte field668 = 0;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public volatile int field671 = 0;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public volatile int field669 = 0;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "Lef;")
    private class385 field670 = new class385(8);

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "J")
    private long field666;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "Lmi;")
    private class138 field672;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Lkd;")
    private class359 field664;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public final void method288(int arg0) {
        if (arg0 < -64) {
            if (this.field664 != null) {
                this.field664.method2165(-102);
            }
            field655++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZIIB)Lmi;")
    public final class138 method289(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field661++;
        long var6 = (long) ((arg0 << 16) + arg3);
        class138 var8 = new class138();
        var8.field6254 = var6;
        var8.field5144 = arg1;
        var8.field1875 = arg4;
        if (arg2 != 31996) {
            this.method291(-50);
        }
        if (arg1) {
            if (this.method299((byte) 89) >= 20) {
                throw new RuntimeException();
            }
            this.field645.method40(var8, 17478);
        } else if (this.method294(29) < 20) {
            this.field662.method40(var8, arg2 ^ 0x38BA);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z")
    public final boolean method290(int arg0) {
        field656++;
        if (arg0 == -101) {
            return this.method299((byte) -123) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public final void method291(int arg0) {
        try {
            this.field664.method2163(true);
        } catch (Exception var2) {
        }
        field649++;
        this.field668 = (byte) ((int) ((double) arg0 * Math.random() + 1.0D));
        this.field664 = null;
        this.field671++;
        this.field669 = -1;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public final void method292(int arg0) {
        int var2 = 79 / ((46 - arg0) / 56);
        field647++;
        if (this.field664 != null) {
            this.field664.method2163(true);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILjava/lang/Class;)Lbs;")
    public static final class141 method293(int arg0, int arg1, int arg2, Class arg3) {
        class13 var4 = class277.field4216[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class466 var5 = var4.field151; var5 != null; var5 = var5.field6853) {
            class141 var6 = var5.field6862;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1895 == arg1 && var6.field1901 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)I")
    private final int method294(int arg0) {
        field654++;
        if (arg0 <= 25) {
            this.field671 = -79;
        }
        return this.field662.method48(-120) + this.field663.method48(-107);
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V")
    public final void method295(int arg0) {
        field659++;
        if (this.field664 == null) {
            return;
        }
        try {
            this.field665.field5666 = 0;
            this.field665.method2366(7, true);
            this.field665.method2337(true, 0);
            this.field664.method2164(0, (byte) -35, 4, this.field665.field5685);
            if (arg0 >= -61) {
                this.field665 = null;
            }
        } catch (IOException var3) {
            try {
                this.field664.method2163(true);
            } catch (Exception var2) {
            }
            this.field664 = null;
            this.field671++;
            this.field669 = -2;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)Z")
    public final boolean method296(boolean arg0) {
        if (this.field664 != null) {
            long var2 = class445.method2750(-27580);
            int var4 = (int) (var2 - this.field666);
            this.field666 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field667 += var4;
            if (this.field667 > 30000) {
                try {
                    this.field664.method2163(true);
                } catch (Exception var27) {
                }
                this.field664 = null;
            }
        }
        field652++;
        if (this.field664 == null) {
            return this.method299((byte) -113) == 0 && this.method294(88) == 0;
        }
        try {
            this.field664.method2167((byte) -43);
            for (class138 var5 = (class138) this.field645.method42(arg0); var5 != null; var5 = (class138) this.field645.method43(9)) {
                this.field665.field5666 = 0;
                this.field665.method2366(1, true);
                this.field665.method2337(true, (int) var5.field6254);
                this.field664.method2164(0, (byte) -35, 4, this.field665.field5685);
                this.field660.method40(var5, 17478);
            }
            for (class138 var6 = (class138) this.field662.method42(true); var6 != null; var6 = (class138) this.field662.method43(9)) {
                this.field665.field5666 = 0;
                this.field665.method2366(0, true);
                this.field665.method2337(true, (int) var6.field6254);
                this.field664.method2164(0, (byte) -35, 4, this.field665.field5685);
                this.field663.method40(var6, 17478);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field664.method2158(!arg0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field667 = 0;
                byte var9 = 0;
                if (this.field672 == null) {
                    var9 = 8;
                } else if (this.field672.field1873 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field670.field5666;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field664.method2159((byte) -128, this.field670.field5666, var10, this.field670.field5685);
                    if (this.field668 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field670.field5685[this.field670.field5666 + var11] = (byte) class339.method2073(this.field670.field5685[this.field670.field5666 + var11], this.field668);
                        }
                    }
                    this.field670.field5666 += var10;
                    if (var9 <= this.field670.field5666) {
                        if (this.field672 == null) {
                            this.field670.field5666 = 0;
                            int var12 = this.field670.method2343(255);
                            int var13 = this.field670.method2323(-47);
                            int var14 = this.field670.method2343(255);
                            int var15 = this.field670.method2354(255);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class138 var21;
                            if (var17) {
                                for (var21 = (class138) this.field663.method42(arg0); var21 != null && var21.field6254 != var18; var21 = (class138) this.field663.method43(9)) {
                                }
                            } else {
                                for (var21 = (class138) this.field660.method42(true); var21 != null && var21.field6254 != var18; var21 = (class138) this.field660.method43(9)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field672 = var21;
                            this.field672.field1871 = new class385(this.field672.field1875 + var15 + var22);
                            this.field672.field1871.method2366(var16, arg0);
                            this.field672.field1871.method2381(var15, 0);
                            this.field670.field5666 = 0;
                            this.field672.field1873 = 8;
                        } else if (this.field672.field1873 != 0) {
                            throw new IOException();
                        } else if (this.field670.field5685[0] == -1) {
                            this.field672.field1873 = 1;
                            this.field670.field5666 = 0;
                        } else {
                            this.field672 = null;
                        }
                    }
                } else {
                    int var23 = this.field672.field1871.field5685.length - this.field672.field1875;
                    int var24 = 512 - this.field672.field1873;
                    if ((var23 - this.field672.field1871.field5666) < var24) {
                        var24 = var23 - this.field672.field1871.field5666;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field664.method2159((byte) -128, this.field672.field1871.field5666, var24, this.field672.field1871.field5685);
                    if (this.field668 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field672.field1871.field5685[this.field672.field1871.field5666 + var25] = (byte) class339.method2073(this.field672.field1871.field5685[this.field672.field1871.field5666 + var25], this.field668);
                        }
                    }
                    this.field672.field1871.field5666 += var24;
                    this.field672.field1873 += var24;
                    if (this.field672.field1871.field5666 == var23) {
                        this.field672.method2627(0);
                        this.field672.field5140 = false;
                        this.field672 = null;
                    } else if (this.field672.field1873 == 512) {
                        this.field672.field1873 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field664.method2163(true);
            } catch (Exception var26) {
            }
            this.field664 = null;
            this.field671++;
            this.field669 = -2;
            return this.method299((byte) 36) == 0 && this.method294(55) == 0;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    private final void method297(byte arg0) {
        field648++;
        if (this.field664 == null || arg0 != 110) {
            return;
        }
        try {
            this.field665.field5666 = 0;
            this.field665.method2366(6, true);
            this.field665.method2337(true, 3);
            this.field664.method2164(0, (byte) -35, 4, this.field665.field5685);
        } catch (IOException var3) {
            try {
                this.field664.method2163(true);
            } catch (Exception var2) {
            }
            this.field669 = -2;
            this.field671++;
            this.field664 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)Z")
    public final boolean method298(byte arg0) {
        if (arg0 != 46) {
            method301((byte) -92, false, (class145) null);
        }
        field657++;
        return this.method294(88) >= 20;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)I")
    public final int method299(byte arg0) {
        int var2 = -70 % ((-arg0 - 69) / 42);
        field644++;
        return this.field645.method48(-95) + this.field660.method48(-89);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lkd;ZZ)V")
    public final void method300(class359 arg0, boolean arg1, boolean arg2) {
        if (this.field664 != null) {
            try {
                this.field664.method2163(!arg1);
            } catch (Exception var8) {
            }
            this.field664 = null;
        }
        field653++;
        this.field664 = arg0;
        this.method297((byte) 110);
        this.method302((byte) -118, arg2);
        this.field670.field5666 = 0;
        this.field672 = null;
        while (true) {
            class138 var4 = (class138) this.field660.method47(17795);
            if (var4 == null) {
                while (true) {
                    class138 var5 = (class138) this.field663.method47(17795);
                    if (var5 == null) {
                        if (this.field668 != 0) {
                            try {
                                this.field665.field5666 = 0;
                                this.field665.method2366(4, true);
                                this.field665.method2366(this.field668, true);
                                this.field665.method2377(0, -49);
                                this.field664.method2164(0, (byte) -35, 4, this.field665.field5685);
                            } catch (IOException var7) {
                                try {
                                    this.field664.method2163(!arg1);
                                } catch (Exception var6) {
                                }
                                this.field669 = -2;
                                this.field664 = null;
                                this.field671++;
                            }
                        }
                        this.field667 = 0;
                        this.field666 = class445.method2750(-27580);
                        if (arg1) {
                            this.method300((class359) null, false, false);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.field662.method40(var5, 17478);
                }
            }
            this.field645.method40(var4, 17478);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BZLmr;)V")
    public static final void method301(byte arg0, boolean arg1, class145 arg2) {
        field646++;
        class433 var3 = arg2.method902(arg0 + 26775);
        if (arg2.field2013 == 0) {
            arg2.field2015 = 0;
            class126.field1617 = -1;
            class331.field4949 = 0;
            return;
        }
        if (arg2.field1955 != -1 && arg2.field1935 == 0) {
            class379 var4 = class98.method629(arg2.field1955, (byte) -115);
            if (arg2.field2014 > 0 && var4.field5514 == 0) {
                arg2.field2015++;
                class126.field1617 = -1;
                class331.field4949 = 0;
                return;
            }
            if (arg2.field2014 <= 0 && var4.field5543 == 0) {
                arg2.field2015++;
                class126.field1617 = -1;
                class331.field4949 = 0;
                return;
            }
        }
        if (arg2.field1938 != -1 && arg2.field1995 <= class26.field332) {
            class195 var5 = class251.method1530(arg2.field1938, 92);
            if (var5.field2949 && var5.field2950 != -1) {
                class379 var6 = class98.method629(var5.field2950, (byte) -115);
                if (arg2.field2014 > 0 && var6.field5514 == 0) {
                    class126.field1617 = -1;
                    class331.field4949 = 0;
                    arg2.field2015++;
                    return;
                }
                if (arg2.field2014 <= 0 && var6.field5543 == 0) {
                    arg2.field2015++;
                    class331.field4949 = 0;
                    class126.field1617 = -1;
                    return;
                }
            }
        }
        int var7 = arg2.field1900;
        int var8 = arg2.field1892;
        int var9 = arg2.field2019[arg2.field2013 - 1] * 128 + arg2.method911(arg0 + 128) * 64;
        int var10 = arg2.field2018[arg2.field2013 - 1] * 128 + arg2.method911(0) * 64;
        if (var7 >= var9) {
            if (var7 <= var9) {
                if (var8 < var10) {
                    arg2.method897(8192, 16384);
                } else if (var10 < var8) {
                    arg2.method897(0, 16384);
                }
            } else if (var8 < var10) {
                arg2.method897(6144, 16384);
            } else if (var8 > var10) {
                arg2.method897(2048, 16384);
            } else {
                arg2.method897(4096, arg0 + 16512);
            }
        } else if (var10 > var8) {
            arg2.method897(10240, arg0 ^ 0xFFFFBF80);
        } else if (var10 >= var8) {
            arg2.method897(12288, arg0 + 16512);
        } else {
            arg2.method897(14336, 16384);
        }
        byte var11 = arg2.field2020[arg2.field2013 - 1];
        if (!arg1 && ((var9 - var7) > 256 || (var9 - var7) < -256 || var10 - var8 > 256 || (var10 - var8) < -256)) {
            arg2.field1900 = var9;
            arg2.field1892 = var10;
            arg2.method909(arg2.field1969, arg0 ^ 0xFFFFC07F);
            if (arg2.field2014 > 0) {
                arg2.field2014--;
            }
            arg2.field2013--;
            class126.field1617 = -1;
            class331.field4949 = 0;
            return;
        }
        int var12 = 4;
        if (arg0 != -128) {
            field658 = -76;
        }
        boolean var13 = true;
        if (arg2 instanceof class155) {
            var13 = ((class155) arg2).field2137.field4131;
        }
        if (var13) {
            int var14 = arg2.field1969 - arg2.field1971.field5324;
            if (var14 != 0 && arg2.field1956 == -1 && arg2.field1959 != 0) {
                var12 = 2;
            }
            if (!arg1 && arg2.field2013 > 2) {
                var12 = 6;
            }
            if (!arg1 && arg2.field2013 > 3) {
                var12 = 8;
            }
        } else {
            if (!arg1 && arg2.field2013 > 1) {
                var12 = 6;
            }
            if (!arg1 && arg2.field2013 > 2) {
                var12 = 8;
            }
        }
        if (arg2.field2015 > 0 && arg2.field2013 > 1) {
            arg2.field2015--;
            var12 = 8;
        }
        if (var11 == 2) {
            var12 <<= 0x1;
        } else if (var11 == 0) {
            var12 >>= 0x1;
        }
        if (var3.field6391 != -1) {
            int var15 = var12 << 7;
            if (arg2.field2013 == 1) {
                int var16 = arg2.field2012 * arg2.field2012;
                int var17 = (arg2.field1900 <= var9 ? var9 - arg2.field1900 : arg2.field1900 - var9) << 7;
                int var18 = (arg2.field1892 <= var10 ? var10 - arg2.field1892 : arg2.field1892 - var10) << 7;
                int var19 = var18 < var17 ? var17 : var18;
                int var20 = var3.field6391 * 2 * var19;
                if (var20 < var16) {
                    arg2.field2012 /= 2;
                } else if (var19 < (var16 / 2)) {
                    arg2.field2012 -= var3.field6391;
                    if (arg2.field2012 < 0) {
                        arg2.field2012 = 0;
                    }
                } else if (var15 > arg2.field2012) {
                    arg2.field2012 += var3.field6391;
                    if (arg2.field2012 > var15) {
                        arg2.field2012 = var15;
                    }
                }
            } else if (var15 > arg2.field2012) {
                arg2.field2012 += var3.field6391;
                if (arg2.field2012 > var15) {
                    arg2.field2012 = var15;
                }
            } else if (arg2.field2012 > 0) {
                arg2.field2012 -= var3.field6391;
                if (arg2.field2012 < 0) {
                    arg2.field2012 = 0;
                }
            }
            var12 = arg2.field2012 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        class331.field4949 = 0;
        if (var9 > var7) {
            class331.field4949 |= 0x4;
            arg2.field1900 += var12;
            if (arg2.field1900 > var9) {
                arg2.field1900 = var9;
            }
        } else if (var7 > var9) {
            class331.field4949 |= 0x8;
            arg2.field1900 -= var12;
            if (var9 > arg2.field1900) {
                arg2.field1900 = var9;
            }
        }
        if (var8 < var10) {
            class331.field4949 |= 0x1;
            arg2.field1892 += var12;
            if (arg2.field1892 > var10) {
                arg2.field1892 = var10;
            }
        } else if (var8 > var10) {
            class331.field4949 |= 0x2;
            arg2.field1892 -= var12;
            if (var10 > arg2.field1892) {
                arg2.field1892 = var10;
            }
        }
        if (arg2.field1900 == var9 && arg2.field1892 == var10) {
            if (arg2.field2014 > 0) {
                arg2.field2014--;
            }
            arg2.field2013--;
        }
        if (var12 < 8) {
            class126.field1617 = var11;
        } else {
            class126.field1617 = 2;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BZ)V")
    public final void method302(byte arg0, boolean arg1) {
        field650++;
        if (this.field664 == null) {
            return;
        }
        try {
            this.field665.field5666 = 0;
            if (arg0 != -118) {
                this.method299((byte) -125);
            }
            this.field665.method2366(arg1 ? 2 : 3, true);
            this.field665.method2337(true, 0);
            this.field664.method2164(0, (byte) -35, 4, this.field665.field5685);
        } catch (IOException var4) {
            try {
                this.field664.method2163(true);
            } catch (Exception var3) {
            }
            this.field669 = -2;
            this.field664 = null;
            this.field671++;
        }
    }

    static {
        new class151("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field651 = 0;
    }
}
