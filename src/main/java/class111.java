import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class111 extends class75 {

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Z")
    private boolean field1992 = false;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    private int field1996 = 0;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    private int field2010 = -32768;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    private int field2007 = 0;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    private int field1991;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    private int field1986;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    private int field1984;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    private int field2012;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    private int field2001;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "Lpa;")
    private class2 field2022;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Lli;")
    public static class185 field1997 = class245.method1649(")0", 125);

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field2009 = 0;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field1990 = 0;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[I")
    public static int[] field1987 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "D")
    private double field1981;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "D")
    private double field1983;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "D")
    public double field1995;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "D")
    private double field2004;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "D")
    public double field2008;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "D")
    public double field2015;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "D")
    private double field2017;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "D")
    private double field2021;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "Luc;")
    public static class160 field2014;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "Lga;")
    private class16 field2005;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
    public final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1989++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBILhi;)[Lse;")
    public static final class10[] method772(int arg0, byte arg1, int arg2, class250 arg3) {
        if (arg1 > -102) {
            field1990 = -101;
        }
        field2013++;
        return class224.method1551(arg2, arg0, arg3, (byte) -94) ? class1.method11((byte) -124) : null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class16 arg10) {
        class98 var13 = this.method774(13236);
        field1998++;
        if (var13 != null) {
            var13.method48(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2005);
            this.field2010 = var13.method62();
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()I")
    public final int method62() {
        field2019++;
        return this.field2010;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZIII)V")
    public static final void method773(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1988++;
        if (class268.field4744 == 1) {
            class28.field471[class60.field1078 / 100].method707(class123.field2230 - 8, class97.field1820 + -8);
        }
        if (class268.field4744 == 2) {
            class28.field471[class60.field1078 / 100 + 4].method707(class123.field2230 - 8, class97.field1820 + -8);
        }
        class103.method726(2969);
        if (arg1) {
            field1987 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lic;")
    private final class98 method774(int arg0) {
        field1993++;
        class233 var2 = class255.method1728(this.field1984, (byte) 95);
        if (arg0 != 13236) {
            method773(-96, true, 42, 115, 96);
        }
        class98 var3 = var2.method1595(7208, this.field2007);
        if (var3 == null) {
            return null;
        } else {
            var3.method635(this.field1994);
            return var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lce;")
    public static final class209 method775(int arg0, int arg1) {
        field2002++;
        if (arg1 >= -118) {
            method772(53, (byte) 51, 69, (class250) null);
        }
        class209 var2 = (class209) class185.field3408.method82(-71, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class150.field2841.method1688(0, class108.method766(arg0, -23098), class272.method1861(arg0, (byte) -125));
        class209 var4 = new class209();
        if (var3 != null) {
            var4.method1474(new class118(var3), -27951);
        }
        class185.field3408.method84(85, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
    public final void method776(int arg0, int arg1) {
        this.field1995 += (double) arg0 * this.field2004;
        this.field2015 += (double) arg0 * this.field2017;
        this.field2008 += this.field1981 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2021;
        field2016++;
        this.field2021 += (double) arg0 * this.field1981;
        this.field1992 = true;
        this.field1985 = (int) (Math.atan2(this.field2004, this.field2017) * 325.949D) + 1024 & 0x7FF;
        this.field1994 = (int) (Math.atan2(this.field2021, this.field1983) * 325.949D) & arg1;
        if (this.field2022 == null) {
            return;
        }
        this.field1996 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2022.field51[this.field2007] >= this.field1996) {
                        return;
                    }
                    this.field1996 -= this.field2022.field51[this.field2007];
                    this.field2007++;
                } while (this.field2007 < this.field2022.field37.length);
                this.field2007 -= this.field2022.field47;
            } while (this.field2007 >= 0 && this.field2007 < this.field2022.field37.length);
            this.field2007 = 0;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIIII)V")
    public final void method777(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2011++;
        if (arg4 != -5493) {
            method772(-37, (byte) 102, 58, (class250) null);
        }
        if (!this.field1992) {
            double var6 = (double) (arg1 - this.field1986);
            double var8 = (double) (arg0 - this.field1991);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1995 = (double) this.field2012 * var6 / var10 + (double) this.field1986;
            this.field2008 = (double) this.field1999;
            this.field2015 = (double) this.field2012 * var8 / var10 + (double) this.field1991;
        }
        double var12 = (double) (this.field2000 + 1 - arg2);
        this.field2017 = ((double) arg0 - this.field2015) / var12;
        this.field2004 = ((double) arg1 - this.field1995) / var12;
        this.field1983 = Math.sqrt(this.field2017 * this.field2017 + this.field2004 * this.field2004);
        if (!this.field1992) {
            this.field2021 = -this.field1983 * Math.tan((double) this.field2001 * 0.02454369D);
        }
        this.field1981 = ((double) arg3 - this.field2008 - this.field2021 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public static void method778(boolean arg0) {
        field1987 = null;
        field2014 = null;
        if (arg0) {
            field1997 = null;
        }
        field1997 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIILki;I)V")
    public static final void method779(byte arg0, int arg1, int arg2, class135 arg3, int arg4) {
        field2006++;
        for (class58 var5 = (class58) class113.field2049.method1375(16259); var5 != null; var5 = (class58) class113.field2049.method1377(-19546)) {
            if (var5.field1017 == arg4 && arg2 * 128 == var5.field1032 && arg1 * 128 == var5.field1023 && var5.field1018.field2527 == arg3.field2527) {
                if (var5.field1007 != null) {
                    class90.field1744.method802(var5.field1007);
                    var5.field1007 = null;
                }
                if (var5.field1013 != null) {
                    class90.field1744.method802(var5.field1013);
                    var5.field1013 = null;
                }
                var5.method476(-125);
                return;
            }
        }
        int var6 = 57 / ((-arg0 - 58) / 36);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2018 = arg5;
        this.field2003 = arg1;
        this.field1991 = arg3;
        this.field1999 = arg4;
        this.field1992 = false;
        this.field2000 = arg6;
        this.field1986 = arg2;
        this.field1984 = arg0;
        this.field1982 = arg10;
        this.field2020 = arg9;
        this.field2012 = arg8;
        this.field2001 = arg7;
        int var12 = class255.method1728(this.field1984, (byte) 95).field4193;
        if (var12 == -1) {
            this.field2022 = null;
        } else {
            this.field2022 = class253.method1712(var12, -127);
        }
    }
}
