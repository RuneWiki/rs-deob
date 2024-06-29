import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class114 extends class19 {

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "I")
    private int field1992 = -32768;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
    private int field2004 = 0;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "I")
    private int field1993 = -1;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    private int field2008 = 0;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "Z")
    private boolean field2019 = false;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    private int field1986;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    private int field2017;

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    private int field2015;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    private int field1988;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
    private int field1998;

    @OriginalMember(owner = "client!ln", name = "bb", descriptor = "Ldn;")
    private class260 field2027;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field1989 = -1;

    @OriginalMember(owner = "client!ln", name = "ab", descriptor = "Lab;")
    public static class279 field2026 = new class279(30);

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "D")
    private double field1987;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "D")
    private double field1991;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "D")
    public double field2000;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "D")
    private double field2002;

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "D")
    private double field2003;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "D")
    private double field2011;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "D")
    public double field2012;

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "D")
    public double field2021;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ln", name = "Y", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!ln", name = "Z", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ln", name = "cb", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "Lgl;")
    private class275 field1994;

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "[[B")
    public static byte[][] field2014;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "()I", line = 14)
    public final int method39() {
        field2023++;
        return this.field1992;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(IIIII)V", line = 23)
    public final void method736(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -113 % ((-arg1 - 23) / 51);
        if (!this.field2019) {
            double var7 = (double) (arg2 - this.field2015);
            double var9 = (double) (arg3 - this.field2017);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field2021 = (double) this.field2005 * var7 / var11 + (double) this.field2015;
            this.field2012 = (double) this.field2005 * var9 / var11 + (double) this.field2017;
            this.field2000 = (double) this.field1998;
        }
        field1990++;
        double var13 = (double) (this.field2009 + 1 - arg0);
        this.field2002 = ((double) arg3 - this.field2012) / var13;
        this.field2003 = ((double) arg2 - this.field2021) / var13;
        this.field2011 = Math.sqrt(this.field2003 * this.field2003 + this.field2002 * this.field2002);
        if (this.field1986 == -1) {
            this.field1987 = ((double) arg4 - this.field2000) / var13;
        } else {
            if (!this.field2019) {
                this.field1987 = -this.field2011 * Math.tan((double) this.field1986 * 0.02454369D);
            }
            this.field1991 = ((double) arg4 - this.field2000 - this.field1987 * var13) * 2.0D / (var13 * var13);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)V", line = 61)
    public static final void method737(int arg0, int arg1, int arg2) {
        if (arg0 != 19756) {
            field1989 = -111;
        }
        for (int var3 = 0; var3 < class196.field3154; var3++) {
            class101 var4 = class194.method1241(var3, false);
            if (var4 != null) {
                int var5 = var4.field1762;
                if (var5 >= 0 && !class284.field4393.method409(var5, 9)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field1775 >= 0) {
                    int var10 = var4.field1775;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg1 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class284.field4387[class49.method374(96, 127, var12)];
                } else if (var5 >= 0) {
                    var6 = class284.field4387[class49.method374(96, 127, class284.field4393.method388(var5, true))];
                } else if (var4.field1765 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field1765;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (var7 & 0x380) + (arg1 + var7 & 0xFC00) + var8;
                    var6 = class284.field4387[class49.method374(96, 127, var9)];
                }
                class94.field1686[var3 + 1] = var6;
            }
        }
        field2010++;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)Lbg;", line = 137)
    private final class309 method738(int arg0) {
        int var2 = -40 % ((56 - arg0) / 38);
        field2007++;
        class8 var3 = class87.method609(this.field1988, (byte) 94);
        class309 var4 = var3.method72(true, this.field2004, this.field1993, this.field2008);
        if (var4 == null) {
            return null;
        } else {
            var4.method145(this.field2024);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 155)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class275 arg10) {
        class309 var13 = this.method738(123);
        field1996++;
        if (var13 != null) {
            var13.method26(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1994);
            this.field1992 = var13.method39();
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZC)B", line = 171)
    public static final byte method739(boolean arg0, char arg1) {
        field2001++;
        if (arg0) {
            method744(-122, 90, true);
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([Lkl;II)V", line = 301)
    public static final void method740(class68[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class68 var4 = arg0[var3];
            if (var4 != null && var4.field1308 == arg1 && (!var4.field1429 || !client.method355(var4))) {
                if (var4.field1358 == 0) {
                    if (!var4.field1429 && client.method355(var4) && class61.field1174 != var4) {
                        continue;
                    }
                    method740(arg0, var4.field1284, -109);
                    if (var4.field1372 != null) {
                        method740(var4.field1372, var4.field1284, -66);
                    }
                    class222 var5 = (class222) class185.field3013.method303((long) var4.field1284, (byte) 106);
                    if (var5 != null) {
                        class130.method858(-1, var5.field3514);
                    }
                }
                if (var4.field1358 == 6) {
                    if (var4.field1439 != -1 || var4.field1354 != -1) {
                        boolean var6 = class199.method1273(7140, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field1354;
                        } else {
                            var7 = var4.field1439;
                        }
                        if (var7 != -1) {
                            class260 var8 = class279.method1882(25397, var7);
                            if (var8 != null) {
                                var4.field1437 += class176.field2836;
                                while (var4.field1437 > var8.field4041[var4.field1433]) {
                                    var4.field1437 -= var8.field4041[var4.field1433];
                                    var4.field1433++;
                                    if (var8.field4044.length <= var4.field1433) {
                                        var4.field1433 -= var8.field4039;
                                        if (var4.field1433 < 0 || var4.field1433 >= var8.field4044.length) {
                                            var4.field1433 = 0;
                                        }
                                    }
                                    var4.field1338 = var4.field1433 + 1;
                                    if (var8.field4044.length <= var4.field1338) {
                                        var4.field1338 -= var8.field4039;
                                        if (var4.field1338 < 0 || var4.field1338 >= var8.field4044.length) {
                                            var4.field1338 = -1;
                                        }
                                    }
                                    class317.method2183((byte) -7, var4);
                                }
                            }
                        }
                    }
                    if (var4.field1454 != 0 && !var4.field1429) {
                        int var9 = var4.field1454 >> 16;
                        int var10 = var4.field1454 << 16 >> 16;
                        int var11 = class176.field2836 * var10;
                        int var12 = class176.field2836 * var9;
                        var4.field1342 = var4.field1342 + var12 & 0x7FF;
                        var4.field1400 = var4.field1400 + var11 & 0x7FF;
                        class317.method2183((byte) -7, var4);
                    }
                }
            }
        }
        field1999++;
        if (arg2 > -41) {
            field1989 = 110;
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 650)
    public class114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2005 = arg8;
        this.field2019 = false;
        this.field1986 = arg7;
        this.field1995 = arg9;
        this.field2009 = arg6;
        this.field2017 = arg3;
        this.field2020 = arg5;
        this.field2022 = arg1;
        this.field2015 = arg2;
        this.field2006 = arg10;
        this.field1988 = arg0;
        this.field1998 = arg4;
        int var12 = class87.method609(this.field1988, (byte) 28).field177;
        if (var12 == -1) {
            this.field2027 = null;
        } else {
            this.field2027 = class279.method1882(25397, var12);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lbm;Z)I", line = 430)
    public static final int method741(class307 arg0, boolean arg1) {
        field2025++;
        int var2 = 0;
        if (!arg1) {
            return 106;
        }
        if (arg0.method2051(-128, class79.field1564)) {
            var2++;
        }
        if (arg0.method2051(62, class302.field4574)) {
            var2++;
        }
        if (arg0.method2051(-121, class99.field1750)) {
            var2++;
        }
        if (arg0.method2051(-98, class331.field5093)) {
            var2++;
        }
        if (arg0.method2051(53, class165.field2659)) {
            var2++;
        }
        if (arg0.method2051(-108, class25.field489)) {
            var2++;
        }
        if (arg0.method2051(-110, class326.field4985)) {
            var2++;
        }
        if (arg0.method2051(-103, class190.field3083)) {
            var2++;
        }
        if (arg0.method2051(-109, class68.field1306)) {
            var2++;
        }
        if (arg0.method2051(-118, class2.field42)) {
            var2++;
        }
        if (arg0.method2051(-100, class174.field2783)) {
            var2++;
        }
        if (arg0.method2051(38, class222.field3515)) {
            var2++;
        }
        if (arg0.method2051(-121, class306.field4632)) {
            var2++;
        }
        if (arg0.method2051(-101, class336.field5168)) {
            var2++;
        }
        if (arg0.method2051(-121, class135.field2269)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V", line = 522)
    public final void method742(int arg0, int arg1) {
        field1985++;
        if (this.field1986 == -1) {
            this.field2000 += (double) arg0 * this.field1987;
        } else {
            this.field2000 += this.field1991 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1987;
            this.field1987 += (double) arg0 * this.field1991;
        }
        this.field2012 += (double) arg0 * this.field2002;
        if (arg1 != 13960) {
            this.field1995 = 29;
        }
        this.field2021 += (double) arg0 * this.field2003;
        this.field2019 = true;
        this.field2013 = (int) (Math.atan2(this.field2003, this.field2002) * 325.949D) + 1024 & 0x7FF;
        this.field2024 = (int) (Math.atan2(this.field1987, this.field2011) * 325.949D) & 0x7FF;
        if (this.field2027 == null) {
            return;
        }
        this.field2004 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2004 <= this.field2027.field4041[this.field2008]) {
                        return;
                    }
                    this.field2004 -= this.field2027.field4041[this.field2008];
                    this.field2008++;
                    if (this.field2027.field4044.length <= this.field2008) {
                        this.field2008 -= this.field2027.field4039;
                        if (this.field2008 < 0 || this.field2008 >= this.field2027.field4044.length) {
                            this.field2008 = 0;
                        }
                    }
                    this.field1993 = this.field2008 + 1;
                } while (this.field1993 < this.field2027.field4044.length);
                this.field1993 -= this.field2027.field4039;
            } while (this.field1993 >= 0 && this.field2027.field4044.length > this.field1993);
            this.field1993 = -1;
        }
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V", line = 576)
    public static void method743(int arg0) {
        if (arg0 != 14718) {
            field2014 = (byte[][]) ((byte[][]) null);
        }
        field2026 = null;
        field2014 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIZ)I", line = 594)
    public static final int method744(int arg0, int arg1, boolean arg2) {
        class281 var3 = (class281) class21.field449.method303((long) arg1, (byte) 116);
        field2016++;
        if (var3 == null) {
            return -1;
        } else {
            if (arg2) {
                field1989 = -61;
            }
            return arg0 >= 0 && var3.field4327.length > arg0 ? var3.field4327[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 615)
    public static final void method745(byte arg0) {
        if (arg0 == -123) {
            class213.field3422.method1877(-29702);
            field2018++;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V", line = 636)
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1997++;
    }
}
