import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class111 extends class98 {

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Lde;")
    private class109 field1983 = null;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    private int field2000 = -1;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    private int field1985 = -32768;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "Z")
    private boolean field1998 = false;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    private int field2008 = -1;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    private int field1981;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    private int field2004;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    private int field1988;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    private int field1997;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    private int field2012;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    private int field1996;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Ljb;")
    private class270 field1982;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    private int field1986;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    private int field1987;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Loa;")
    public static class99 field1991 = class221.method1463(2844, "Mem:");

    @OriginalMember(owner = "client!th", name = "w", descriptor = "[[B")
    public static byte[][] field1994 = new byte[50][];

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Loa;")
    public static class99 field1989 = class221.method1463(2844, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!th", name = "E", descriptor = "Lng;")
    public static class76 field2002 = new class76();

    @OriginalMember(owner = "client!th", name = "S", descriptor = "Loa;")
    public static class99 field2015 = class221.method1463(2844, "::clientjs5drop");

    @OriginalMember(owner = "client!th", name = "U", descriptor = "Loa;")
    public static class99 field2017 = class221.method1463(2844, "Chargement de la liste des serveurs");

    @OriginalMember(owner = "client!th", name = "T", descriptor = "Loa;")
    public static class99 field2016 = class221.method1463(2844, "Connect-B au serveur de mise -9 jour");

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "Lkg;")
    private class136 field2006;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "Ltg;")
    public static class182 field2014;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "[[[B")
    public static byte[][][] field2001;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static final void method762(int arg0) {
        class248.field4269.method1813(-1);
        if (arg0 <= 39) {
            method767(58);
        }
        field2003++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)V")
    private final void method763(int arg0, byte arg1, int arg2) {
        if (this.field1982 != null) {
            int var4 = class56.field926 - this.field1987;
            if (var4 > 100 && this.field1982.field4771 > 0) {
                int var5 = this.field1982.field4740.length - this.field1982.field4771;
                while (this.field1986 < var5 && var4 > this.field1982.field4749[this.field1986]) {
                    var4 -= this.field1982.field4749[this.field1986];
                    this.field1986++;
                }
                if (var5 <= this.field1986) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1982.field4740.length; var7++) {
                        var6 += this.field1982.field4749[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (this.field1982.field4749[this.field1986] >= var4) {
                            break label62;
                        }
                        class250.method1621(arg0, this.field1986, arg2, 60, false, this.field1982);
                        var4 -= this.field1982.field4749[this.field1986];
                        this.field1986++;
                    } while (this.field1986 < this.field1982.field4740.length);
                    this.field1986 -= this.field1982.field4771;
                } while (this.field1986 >= 0 && this.field1986 < this.field1982.field4740.length);
                this.field1982 = null;
            }
            this.field1987 = class56.field926 - var4;
        }
        if (arg1 >= -35) {
            method768((class261) null, (byte) -101);
        }
        field2011++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)Luk;")
    private final class98 method764(boolean arg0, int arg1) {
        field1992++;
        boolean var3 = class189.field3337 != class112.field2025;
        class153 var4 = class247.method1601(26012, this.field1981);
        if (var4.field2696 != null) {
            var4 = var4.method1023(-113);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field2004 & 0x3;
        if (arg1 != -28669) {
            return null;
        }
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field2704;
            var6 = var4.field2717;
        } else {
            var6 = var4.field2704;
            var7 = var4.field2717;
        }
        int var8 = (var7 + 1 >> 1) + this.field1988;
        int var9 = this.field1997 + (var6 >> 1);
        int var10 = (var7 >> 1) + this.field1988;
        int var11 = (var6 + 1 >> 1) + this.field1997;
        this.method763(var10 * 128, (byte) -77, var9 * 128);
        boolean var12 = !var3 && var4.field2743 && (this.field2008 != var4.field2709 || this.field2000 != this.field1986 && class221.field3838 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class189.field3337[this.field2012];
        int var14 = var13[var8][var9] + var13[var10][var9] + var13[var8][var11] + var13[var10][var11] >> 2;
        int var15 = (this.field1988 << 7) + (var7 << 6);
        int[][] var16 = null;
        boolean var17 = this.field1983 == null;
        if (var3) {
            var16 = class112.field2025[0];
        } else if (this.field2012 < 3) {
            var16 = class189.field3337[this.field2012 + 1];
        }
        int var18 = (this.field1997 << 7) + (var6 << 6);
        class268 var19;
        if (this.field1982 == null) {
            var19 = var4.method1025(3202, var16, var13, var17 ? class256.field4417 : this.field1983, this.field2004, var12, var15, var18, var14, this.field1996, false);
        } else {
            var19 = var4.method1026(var18, var17 ? class256.field4417 : this.field1983, var15, this.field1982, this.field2004, this.field1996, var14, var13, var12, var16, this.field1986, -10);
        }
        return var19 == null ? null : var19.field4718;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method763(arg3, (byte) -86, arg4);
        class98 var6 = null;
        field1990++;
        if (!this.field1998) {
            if (var6 == null) {
                var6 = this.method769(-13913);
            }
            if (var6 == null) {
                return;
            }
            this.method765(var6, -1);
        }
        if (this.field2006 != null) {
            this.field2006.method922(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Luk;I)V")
    private final void method765(class98 arg0, int arg1) {
        field1995++;
        class27 var3 = (class27) arg0;
        if (arg1 != -1) {
            return;
        }
        if ((this.field2006 == null || this.field2006.field2374) && (var3.field451 != null || var3.field472 != null)) {
            class153 var4 = class247.method1601(26012, this.field1981);
            if (var4.field2696 != null) {
                var4 = var4.method1023(-113);
            }
            if (var4 != null) {
                this.field2006 = new class136(class56.field926, var4.field2717, var4.field2704);
            }
        }
        if (this.field2006 != null) {
            this.field2006.method928(var3.field451, var3.field472, false, var3.field462, var3.field455, var3.field469);
        }
        this.field1998 = true;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIII)I")
    public static final int method766(byte arg0, int arg1, int arg2, int arg3) {
        field2007++;
        if (arg0 != 71) {
            field1994 = null;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field2006 != null) {
            this.field2006.method931();
        }
        field2013++;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public static void method767(int arg0) {
        field2016 = null;
        field2015 = null;
        if (arg0 != -6931) {
            return;
        }
        field2002 = null;
        field1991 = null;
        field1989 = null;
        field1994 = null;
        field2014 = null;
        field2017 = null;
        field2001 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lik;B)Leg;")
    public static final class228 method768(class261 arg0, byte arg1) {
        field2005++;
        arg0.method1693((byte) 106);
        int var2 = 55 / ((arg1 - 15) / 37);
        int var3 = arg0.method1693((byte) -92);
        class228 var4 = class11.method72(-116, var3);
        var4.field3937 = arg0.method1693((byte) 54);
        int var5 = arg0.method1693((byte) 92);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg0.method1693((byte) 44);
            var4.method18(var7, arg0, -7618);
        }
        var4.method278(-8);
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()I")
    public final int method226() {
        field1993++;
        return this.field1985;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIJILkg;)V")
    public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class136 arg10) {
        field1999++;
        class98 var13 = this.method769(-13913);
        if (var13 != null) {
            this.method765(var13, -1);
            var13.method233(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2006);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIIIZLuk;)V")
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class98 arg8) {
        this.field1981 = arg0;
        this.field2004 = arg2;
        this.field1988 = arg4;
        this.field1997 = arg5;
        this.field2012 = arg3;
        this.field1996 = arg1;
        if (arg6 != -1) {
            this.field1982 = class38.method297(132, arg6);
            this.field1986 = 0;
            this.field1987 = class56.field926 - 1;
            if (this.field1982.field4746 == 0 && arg8 != null && arg8 instanceof class111) {
                class111 var10 = (class111) arg8;
                if (this.field1982 == var10.field1982) {
                    this.field1986 = var10.field1986;
                    this.field1987 = var10.field1987;
                    return;
                }
            }
            if (arg7 && this.field1982.field4771 != -1) {
                this.field1986 = (int) (Math.random() * (double) this.field1982.field4740.length);
                this.field1987 -= (int) ((double) this.field1982.field4749[this.field1986] * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)Luk;")
    private final class98 method769(int arg0) {
        field1984++;
        return arg0 == -13913 ? this.method764(false, arg0 - 14756) : null;
    }
}
