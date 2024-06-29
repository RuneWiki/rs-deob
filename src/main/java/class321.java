import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class321 extends class31 {

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    private int field5076 = 0;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Ltm;")
    private class79 field5077 = new class79(16);

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    private int field5105 = 0;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "Lc;")
    private class331 field5109 = new class331();

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "J")
    private long field5111 = 0L;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    private int field5089;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lg;")
    private class177 field5085;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "Z")
    private boolean field5106;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "Lc;")
    private class331 field5107;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "Lg;")
    private class177 field5102;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lje;")
    private class83 field5090;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    private int field5097;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Lho;")
    private class290 field5093;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    private int field5092;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Z")
    private boolean field5110;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lki;")
    private class179 field5084;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field5075 = -1;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field5086 = 0;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "S")
    public static short field5099 = 32767;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "[I")
    public static int[] field5104 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Lcg;")
    public static class49 field5091;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lon;")
    private class80 field5082;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "Z")
    private boolean field5108;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "[B")
    private byte[] field5081;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I", line = 4)
    public final int method285(int arg0, int arg1) {
        if (arg0 >= -94) {
            this.field5085 = (class177) null;
        }
        field5078++;
        class179 var3 = (class179) this.field5077.method732((long) arg1, true);
        return var3 == null ? 0 : var3.method3(0);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)I", line = 25)
    public final int method2200(int arg0) {
        field5103++;
        if (arg0 == 0) {
            return this.field5082 == null ? 0 : this.field5082.field1304;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 49)
    public final void method2201(byte arg0) {
        field5094++;
        if (arg0 != 55) {
            this.method2206(-18, false, -67);
        }
        if (this.field5085 != null) {
            this.field5108 = true;
            if (this.field5107 == null) {
                this.field5107 = new class331();
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V", line = 68)
    public final void method2202(int arg0) {
        field5080++;
        if (this.field5107 != null) {
            if (this.method289(255) == null) {
                return;
            }
            if (this.field5106) {
                boolean var2 = true;
                for (class320 var3 = this.field5107.method2297(14204); var3 != null; var3 = this.field5107.method2291(-68)) {
                    int var4 = (int) var3.field5062;
                    if (this.field5081[var4] == 0) {
                        this.method2206(1, false, var4);
                    }
                    if (this.field5081[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method2195(-1);
                    }
                }
                while (this.field5082.field1310.length > this.field5105) {
                    if (this.field5082.field1310[this.field5105] == 0) {
                        this.field5105++;
                    } else {
                        if (this.field5090.field1343 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field5081[this.field5105] == 0) {
                            this.method2206(1, false, this.field5105);
                        }
                        if (this.field5081[this.field5105] == 0) {
                            var2 = false;
                            class320 var5 = new class320();
                            var5.field5062 = (long) this.field5105;
                            this.field5107.method2303((byte) -124, var5);
                        }
                        this.field5105++;
                    }
                }
                if (var2) {
                    this.field5106 = false;
                    this.field5105 = 0;
                }
            } else if (this.field5108) {
                boolean var6 = true;
                for (class320 var7 = this.field5107.method2297(14204); var7 != null; var7 = this.field5107.method2291(-81)) {
                    int var8 = (int) var7.field5062;
                    if (this.field5081[var8] != 1) {
                        this.method2206(2, false, var8);
                    }
                    if (this.field5081[var8] == 1) {
                        var7.method2195(-1);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field5082.field1310.length > this.field5105) {
                    if (this.field5082.field1310[this.field5105] == 0) {
                        this.field5105++;
                    } else {
                        if (this.field5093.method1986(-11818)) {
                            var6 = false;
                            break;
                        }
                        if (this.field5081[this.field5105] != 1) {
                            this.method2206(2, false, this.field5105);
                        }
                        if (this.field5081[this.field5105] != 1) {
                            var6 = false;
                            class320 var9 = new class320();
                            var9.field5062 = (long) this.field5105;
                            this.field5107.method2303((byte) -124, var9);
                        }
                        this.field5105++;
                    }
                }
                if (var6) {
                    this.field5105 = 0;
                    this.field5108 = false;
                }
            } else {
                this.field5107 = null;
            }
        }
        if (arg0 >= -127) {
            this.field5082 = (class80) null;
        }
        if (!this.field5110 || class306.method2102(-289) < this.field5111) {
            return;
        }
        for (class179 var10 = (class179) this.field5077.method736(2); var10 != null; var10 = (class179) this.field5077.method727((byte) -110)) {
            if (!var10.field3029) {
                if (var10.field3028) {
                    if (!var10.field3033) {
                        throw new RuntimeException();
                    }
                    var10.method2195(-1);
                } else {
                    var10.field3028 = true;
                }
            }
        }
        this.field5111 = class306.method2102(-289) + 1000L;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Lon;", line = 249)
    public final class80 method289(int arg0) {
        field5083++;
        if (this.field5082 != null) {
            return this.field5082;
        }
        if (this.field5084 == null) {
            if (this.field5093.method1982(false)) {
                return null;
            }
            this.field5084 = this.field5093.method1977(255, true, (byte) 0, this.field5089, 50);
        }
        if (arg0 != 255) {
            this.field5097 = 115;
        }
        if (this.field5084.field3029) {
            return null;
        }
        byte[] var2 = this.field5084.method4(0);
        if (this.field5084 instanceof class1) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5082 = new class80(var2, this.field5092);
                if (this.field5082.field1308 != this.field5097) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field5082 = null;
                if (this.field5093.method1982(false)) {
                    this.field5084 = null;
                } else {
                    this.field5084 = this.field5093.method1977(255, true, (byte) 0, this.field5089, arg0 - 152);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5082 = new class80(var2, this.field5092);
            } catch (RuntimeException var6) {
                this.field5093.method1979(2);
                this.field5082 = null;
                if (this.field5093.method1982(false)) {
                    this.field5084 = null;
                } else {
                    this.field5084 = this.field5093.method1977(255, true, (byte) 0, this.field5089, 44);
                }
                return null;
            }
            if (this.field5102 != null) {
                this.field5090.method756(this.field5089, var2, this.field5102, 2);
            }
        }
        this.field5084 = null;
        if (this.field5085 != null) {
            this.field5081 = new byte[this.field5082.field1300];
            this.field5076 = 0;
        }
        return this.field5082;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V", line = 343)
    public final void method286(byte arg0, int arg1) {
        field5095++;
        if (this.field5085 == null) {
            return;
        }
        if (arg0 != 54) {
            this.method2206(-25, false, 21);
        }
        for (class320 var3 = this.field5109.method2297(14204); var3 != null; var3 = this.field5109.method2291(arg0 - 145)) {
            if (((long) arg1) == var3.field5062) {
                return;
            }
        }
        class320 var4 = new class320();
        var4.field5062 = (long) arg1;
        this.field5109.method2303((byte) -124, var4);
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 380)
    public static final void method2203(int arg0) {
        if (arg0 <= 107) {
            field5091 = (class49) null;
        }
        field5073++;
        while (class276.field4398.method30(class308.field4906, (byte) 97) >= 27) {
            int var1 = class276.field4398.method35(15, (byte) -116);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class320.field5071[var1] == null) {
                var2 = true;
                class320.field5071[var1] = new class278();
            }
            class278 var3 = class320.field5071[var1];
            class33.field468[class191.field3200++] = var1;
            var3.field2029 = class181.field3045;
            if (var3.field4413 != null && var3.field4413.method127(0)) {
                class215.method1588(var3, 16383);
            }
            int var4 = class276.field4398.method35(1, (byte) 122);
            if (var4 == 1) {
                class146.field2641[class119.field2067++] = var1;
            }
            int var5 = class114.field1923[class276.field4398.method35(3, (byte) 105)];
            if (var2) {
                var3.field1951 = var3.field1946 = var5;
            }
            int var6 = class276.field4398.method35(5, (byte) -124);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class276.field4398.method35(1, (byte) 101);
            int var8 = class276.field4398.method35(5, (byte) -7);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1908(class224.method1637(class276.field4398.method35(14, (byte) 103), (byte) 119), 24717);
            var3.method985(var3.field4413.field202, 6008);
            var3.field1979 = var3.field4413.field178;
            if (var3.field1979 == 0) {
                var3.field1946 = 0;
            }
            var3.field1962 = var3.field4413.field183;
            var3.method989(var7 == 1, (byte) 124, class218.field3632.field2034[0] + var6, var3.method987(3047), class218.field3632.field1975[0] + var8);
            if (var3.field4413.method127(0)) {
                class288.method1962(var3.field1975[0], 18913, var3.field2034[0], 0, (class205) null, class205.field3497, var3, (class97) null);
            }
        }
        class276.field4398.method32(-24310);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)[B", line = 460)
    public final byte[] method287(int arg0, byte arg1) {
        class179 var3 = this.method2206(0, false, arg0);
        field5101++;
        if (var3 == null) {
            return null;
        } else {
            int var4 = -82 / ((-arg1 - 49) / 42);
            byte[] var5 = var3.method4(0);
            var3.method2195(-1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V", line = 478)
    public final void method2204(int arg0) {
        if (arg0 != 0) {
            this.method289(-28);
        }
        field5079++;
        if (this.field5107 == null || this.method289(255) == null) {
            return;
        }
        for (class320 var2 = this.field5109.method2297(14204); var2 != null; var2 = this.field5109.method2291(-99)) {
            int var3 = (int) var2.field5062;
            if (var3 < 0 || this.field5082.field1300 <= var3 || this.field5082.field1310[var3] == 0) {
                var2.method2195(-1);
            } else {
                if (this.field5081[var3] == 0) {
                    this.method2206(1, false, var3);
                }
                if (this.field5081[var3] == -1) {
                    this.method2206(2, false, var3);
                }
                if (this.field5081[var3] == 1) {
                    var2.method2195(~arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V", line = 526)
    public static final void method2205(int arg0) {
        if (arg0 != -31100) {
            method2210(-99);
        }
        while (true) {
            class121 var1;
            class116 var3;
            do {
                var1 = (class121) class85.field1366.method2301((byte) 97);
                if (var1 == null) {
                    field5098++;
                    return;
                }
                if (var1.field2113 < 0) {
                    int var2 = -var1.field2113 - 1;
                    if (class316.field5010 == var2) {
                        var3 = class218.field3632;
                    } else {
                        var3 = class135.field2359[var2];
                    }
                } else {
                    int var4 = var1.field2113 - 1;
                    var3 = class320.field5071[var4];
                }
            } while (var3 == null);
            class97 var5 = class92.method798((byte) 104, var1.field2108);
            if (class205.field3497 >= 3) {
            }
            int var6;
            int var7;
            if (var1.field2102 == 1 || var1.field2102 == 3) {
                var6 = var5.field1549;
                var7 = var5.field1559;
            } else {
                var6 = var5.field1559;
                var7 = var5.field1549;
            }
            int var8 = var1.field2106 + (var6 + 1 >> 1);
            int var9 = (var6 >> 1) + var1.field2106;
            int var10 = (var7 + 1 >> 1) + var1.field2101;
            int var11 = var1.field2101 + (var7 >> 1);
            int[][] var12 = class137.field2487[class205.field3497];
            int var13 = var12[var8][var11] + var12[var9][var11] + var12[var9][var10] + var12[var8][var10] >> 2;
            class104 var14 = null;
            int var15 = class255.field4112[var1.field2114];
            if (var15 == 0) {
                class297 var19 = class269.method1846(class205.field3497, var1.field2106, var1.field2101);
                if (var19 != null) {
                    var14 = var19.field4741;
                }
            } else if (var15 == 1) {
                class44 var16 = class100.method870(class205.field3497, var1.field2106, var1.field2101);
                if (var16 != null) {
                    var14 = var16.field700;
                }
            } else if (var15 == 2) {
                class241 var18 = class105.method901(class205.field3497, var1.field2106, var1.field2101);
                if (var18 != null) {
                    var14 = var18.field3940;
                }
            } else if (var15 == 3) {
                class330 var17 = class132.method1085(class205.field3497, var1.field2106, var1.field2101);
                if (var17 != null) {
                    var14 = var17.field5257;
                }
            }
            if (var14 != null) {
                class336.method2337(var1.field2095 + 1, var15, var1.field2103 + 1, var1.field2106, var1.field2101, 0, class205.field3497, -1, 0, 113);
                var3.field1949 = class181.field3045 + var1.field2103;
                int var20 = var1.field2104;
                var3.field2018 = var1.field2106 * 128 + (var6 * 64);
                int var21 = var1.field2111;
                var3.field1936 = var14;
                int var22 = var1.field2107;
                int var23 = var1.field2097;
                var3.field1976 = var1.field2101 * 128 + var7 * 64;
                if (var23 > var21) {
                    int var24 = var23;
                    var23 = var21;
                    var21 = var24;
                }
                var3.field2014 = var1.field2106 + var23;
                var3.field1948 = var13;
                if (var22 < var20) {
                    int var25 = var20;
                    var20 = var22;
                    var22 = var25;
                }
                var3.field1963 = var1.field2101 + var20;
                var3.field1956 = class181.field3045 + var1.field2095;
                var3.field2021 = var1.field2106 + var21;
                var3.field2004 = var1.field2101 + var22;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZI)Lki;", line = 697)
    private final class179 method2206(int arg0, boolean arg1, int arg2) {
        field5088++;
        class179 var4 = (class179) this.field5077.method732((long) arg2, true);
        if (var4 != null && arg0 == 0 && !var4.field3033 && var4.field3029) {
            var4.method2195(-1);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field5085 == null || this.field5081[arg2] == -1) {
                    if (this.field5093.method1982(false)) {
                        return null;
                    }
                    var4 = this.field5093.method1977(this.field5089, true, (byte) 2, arg2, 100);
                } else {
                    var4 = this.field5090.method752(this.field5085, arg2, (byte) -61);
                }
            } else if (arg0 == 1) {
                if (this.field5085 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5090.method757((byte) -72, this.field5085, arg2);
            } else if (arg0 == 2) {
                if (this.field5085 == null) {
                    throw new RuntimeException();
                }
                if (this.field5081[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5093.method1986(-11818)) {
                    return null;
                }
                var4 = this.field5093.method1977(this.field5089, false, (byte) 2, arg2, 62);
            } else {
                throw new RuntimeException();
            }
            this.field5077.method725((long) arg2, var4, 1);
        }
        if (var4.field3029) {
            return null;
        }
        byte[] var5 = var4.method4(0);
        if (arg1) {
            this.field5107 = (class331) null;
        }
        if (!var4 instanceof class1) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class128.field2220.reset();
                class128.field2220.update(var5, 0, var5.length - 2);
                int var6 = (int) class128.field2220.getValue();
                if (this.field5082.field1301[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field5093.field4649 = 0;
                this.field5093.field4650 = 0;
            } catch (RuntimeException var14) {
                this.field5093.method1979(2);
                var4.method2195(-1);
                if (var4.field3033 && !this.field5093.method1982(arg1)) {
                    class286 var8 = this.field5093.method1977(this.field5089, true, (byte) 2, arg2, 77);
                    this.field5077.method725((long) arg2, var8, 1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5082.field1313[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field5082.field1313[arg2];
            if (this.field5085 != null) {
                this.field5090.method756(arg2, var5, this.field5085, 2);
                if (this.field5081[arg2] != 1) {
                    this.field5076++;
                    this.field5081[arg2] = 1;
                }
            }
            if (!var4.field3033) {
                var4.method2195(-1);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class128.field2220.reset();
            class128.field2220.update(var5, 0, var5.length - 2);
            int var9 = (int) class128.field2220.getValue();
            if (this.field5082.field1301[arg2] != var9) {
                throw new RuntimeException();
            }
            int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field5082.field1313[arg2] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field5081[arg2] != 1) {
                if (this.field5081[arg2] != 0) {
                }
                this.field5076++;
                this.field5081[arg2] = 1;
            }
            if (!var4.field3033) {
                var4.method2195(-1);
            }
            return var4;
        } catch (Exception var13) {
            this.field5081[arg2] = -1;
            var4.method2195(-1);
            if (var4.field3033 && !this.field5093.method1982(false)) {
                class286 var12 = this.field5093.method1977(this.field5089, true, (byte) 2, arg2, 39);
                this.field5077.method725((long) arg2, var12, 1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)I", line = 910)
    public final int method2207(int arg0) {
        int var2 = -68 / ((38 - arg0) / 38);
        field5100++;
        return this.field5076;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(ILg;Lg;Lho;Lje;IIZ)V", line = 1029)
    public class321(int arg0, class177 arg1, class177 arg2, class290 arg3, class83 arg4, int arg5, int arg6, boolean arg7) {
        this.field5089 = arg0;
        this.field5085 = arg1;
        if (this.field5085 == null) {
            this.field5106 = false;
        } else {
            this.field5106 = true;
            this.field5107 = new class331();
        }
        this.field5102 = arg2;
        this.field5090 = arg4;
        this.field5097 = arg6;
        this.field5093 = arg3;
        this.field5092 = arg5;
        this.field5110 = arg7;
        if (this.field5102 != null) {
            this.field5084 = this.field5090.method752(this.field5102, this.field5089, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)I", line = 922)
    public final int method2208(int arg0) {
        if (arg0 <= 25) {
            return -43;
        }
        field5087++;
        if (this.method289(255) == null) {
            return this.field5084 == null ? 0 : this.field5084.method3(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)I", line = 953)
    public final int method2209(byte arg0) {
        field5074++;
        if (this.field5082 == null) {
            return 0;
        } else if (this.field5106) {
            class320 var2 = this.field5107.method2297(14204);
            if (var2 == null) {
                return 0;
            } else {
                if (arg0 != 0) {
                    this.field5102 = (class177) null;
                }
                return (int) var2.field5062;
            }
        } else {
            return this.field5082.field1304;
        }
    }

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "(I)V", line = 985)
    public static void method2210(int arg0) {
        if (arg0 != 1) {
            field5099 = 5;
        }
        field5104 = null;
        field5091 = null;
    }
}
