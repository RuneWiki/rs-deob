import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class614 extends class641 {

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    private int field8847 = 0;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "Lefa;")
    private class322 field8853 = new class322(16);

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    private int field8860 = 0;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "Ldc;")
    private class302 field8863 = new class302();

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "J")
    private long field8865 = 0L;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "Lnr;")
    private class19 field8848;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    private int field8849;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "Z")
    private boolean field8864;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "Ldc;")
    private class302 field8861;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "Z")
    private boolean field8866;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "Loaa;")
    private class498 field8852;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "[B")
    private byte[] field8857;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    private int field8832;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "Lnr;")
    private class19 field8845;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Ljq;")
    private class346 field8829;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    private int field8830;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "Lcm;")
    private class597 field8859;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "Lefa;")
    public static class322 field8856 = new class322(16);

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "Liba;")
    public static class211 field8858 = new class211(74, 3);

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lgr;")
    private class608 field8833;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "Z")
    private boolean field8862;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "[B")
    private byte[] field8836;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)I", line = 8)
    public final int method3490(int arg0, byte arg1) {
        field8840++;
        if (arg1 >= -121) {
            return -112;
        } else {
            class597 var3 = (class597) this.field8853.method2002((byte) -119, (long) arg0);
            return var3 == null ? 0 : var3.method2646(15862);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V", line = 27)
    public final void method3491(byte arg0) {
        field8850++;
        if (this.field8861 == null || arg0 != -1 || this.method3504(0) == null) {
            return;
        }
        for (class381 var2 = this.field8863.method1904(false); var2 != null; var2 = this.field8863.method1901(108)) {
            int var3 = (int) var2.field5740;
            if (var3 < 0 || var3 >= this.field8833.field8788 || this.field8833.field8807[var3] == 0) {
                var2.method2360((byte) 66);
            } else {
                if (this.field8836[var3] == 0) {
                    this.method3492(2, var3, 1);
                }
                if (this.field8836[var3] == -1) {
                    this.method3492(2, var3, 2);
                }
                if (this.field8836[var3] == 1) {
                    var2.method2360((byte) 66);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Lcm;", line = 74)
    private final class597 method3492(int arg0, int arg1, int arg2) {
        field8855++;
        class597 var4 = (class597) this.field8853.method2002((byte) -106, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field8641 && var4.field8640) {
            var4.method2360((byte) 66);
            var4 = null;
        }
        if (arg0 != 2) {
            this.method3506(61);
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field8848 == null || this.field8836[arg1] == -1) {
                    if (this.field8852.method2838(-12)) {
                        return null;
                    }
                    var4 = this.field8852.method2851(arg1, true, true, this.field8849, (byte) 2);
                } else {
                    var4 = this.field8829.method2149(this.field8848, (byte) 114, arg1);
                }
            } else if (arg2 == 1) {
                if (this.field8848 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field8829.method2148(this.field8848, arg1, 3);
            } else if (arg2 == 2) {
                if (this.field8848 == null) {
                    throw new RuntimeException();
                }
                if (this.field8836[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field8852.method2844(-21)) {
                    return null;
                }
                var4 = this.field8852.method2851(arg1, false, true, this.field8849, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field8853.method2001(arg0 ^ 0x6F, var4, (long) arg1);
        }
        if (var4.field8640) {
            return null;
        }
        byte[] var5 = var4.method2648(117);
        if (!var4 instanceof class564) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class206.field2809.reset();
                        class206.field2809.update(var5, 0, var5.length - 2);
                        int var12 = (int) class206.field2809.getValue();
                        if (this.field8833.field8803[arg1] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field8833.field8808 == null || this.field8833.field8808[arg1] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field8833.field8808[arg1];
                        byte[] var14 = class86.method492(var5.length - 2, 0, (byte) 18, var5);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field8852.field7064 = 0;
                this.field8852.field7063 = 0;
            } catch (RuntimeException var18) {
                this.field8852.method2840(true);
                var4.method2360((byte) 66);
                if (var4.field8641 && !this.field8852.method2838(-76)) {
                    class448 var16 = this.field8852.method2851(arg1, true, true, this.field8849, (byte) 2);
                    this.field8853.method2001(arg0 ^ 0xFFFFFF8A, var16, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field8833.field8789[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field8833.field8789[arg1];
            if (this.field8848 != null) {
                this.field8829.method2147(1442, arg1, var5, this.field8848);
                if (this.field8836[arg1] != 1) {
                    this.field8847++;
                    this.field8836[arg1] = 1;
                }
            }
            if (!var4.field8641) {
                var4.method2360((byte) 66);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class206.field2809.reset();
            class206.field2809.update(var5, 0, var5.length - 2);
            int var6 = (int) class206.field2809.getValue();
            if (this.field8833.field8803[arg1] != var6) {
                throw new RuntimeException();
            }
            if (this.field8833.field8808 != null && this.field8833.field8808[arg1] != null) {
                byte[] var7 = this.field8833.field8808[arg1];
                byte[] var8 = class86.method492(var5.length - 2, 0, (byte) 18, var5);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field8833.field8789[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field8836[arg1] != 1) {
                this.field8847++;
                this.field8836[arg1] = 1;
            }
            if (!var4.field8641) {
                var4.method2360((byte) 66);
            }
            return var4;
        } catch (Exception var17) {
            this.field8836[arg1] = -1;
            var4.method2360((byte) 66);
            if (var4.field8641 && !this.field8852.method2838(arg0 ^ 0xFFFFFFAB)) {
                class448 var11 = this.field8852.method2851(arg1, true, true, this.field8849, (byte) 2);
                this.field8853.method2001(arg0 ^ 0xFFFFFF88, var11, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I", line = 340)
    public final int method3493(int arg0) {
        if (arg0 <= 14) {
            return -102;
        }
        field8846++;
        if (this.method3504(0) == null) {
            return this.field8859 == null ? 0 : this.field8859.method2646(15862);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 360)
    public static final String method3494(int arg0, long arg1) {
        field8844++;
        class288.field4175.setTime(new Date(arg1));
        int var3 = class288.field4175.get(7);
        int var4 = class288.field4175.get(5);
        int var5 = class288.field4175.get(2);
        if (arg0 != -8287) {
            method3497(-76, -55, null);
        }
        int var6 = class288.field4175.get(1);
        int var7 = class288.field4175.get(11);
        int var8 = class288.field4175.get(12);
        int var9 = class288.field4175.get(13);
        return class158.field2251[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class237.field3128[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)I", line = 387)
    public final int method3495(byte arg0) {
        field8835++;
        if (this.field8833 == null) {
            return 0;
        } else if (this.field8864) {
            class381 var2 = this.field8861.method1904(false);
            if (arg0 == 124) {
                return var2 == null ? 0 : (int) var2.field5740;
            } else {
                return -84;
            }
        } else {
            return this.field8833.field8802;
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V", line = 412)
    public static void method3496(byte arg0) {
        field8858 = null;
        field8856 = null;
        if (arg0 < 80) {
            field8856 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILgk;)Ljava/lang/String;", line = 425)
    public static final String method3497(int arg0, int arg1, class540 arg2) {
        field8839++;
        try {
            if (arg1 > -71) {
                return null;
            }
            int var3 = arg2.method3109(-2);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field7956 += class248.field3274.method288(arg2.field7952, var3, var4, 0, arg2.field7956, (byte) 124);
            return class554.method3225(-57, 0, var4, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[B", line = 455)
    public final byte[] method3498(int arg0, int arg1) {
        field8838++;
        class597 var3 = this.method3492(2, arg0, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method2648(55);
            var3.method2360((byte) 66);
            return arg1 > -47 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(B)V", line = 474)
    public final void method3499(byte arg0) {
        if (arg0 <= 22) {
            this.method3495((byte) 114);
        }
        field8842++;
        if (this.field8848 != null) {
            this.field8862 = true;
            if (this.field8861 == null) {
                this.field8861 = new class302();
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V", line = 492)
    public static final void method3500(int arg0) {
        field8843++;
        int var1 = 0;
        if (class335.field4872.method3785(class62.field996, 3)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class335.field4872.field9465) {
            var1 |= 0x40;
        }
        class441.method2609(var1, false);
        class60.field965.method2595(true, var1);
        class259.field3355.method2386(var1, 36);
        class563.field8235.method1093(var1, 83);
        class134.field1945.method3084(256, var1);
        class405.method2495((byte) -78, var1);
        int var6 = -56 / ((arg0 + 56) / 51);
        class278.method1650(-2, var1);
        class264.method1584((byte) -127, var1);
        class565.method3258(var1, (byte) 104);
        class654.method3700(-1681322014);
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(B)I", line = 541)
    public final int method3501(byte arg0) {
        field8837++;
        int var2 = 92 / ((-arg0 - 49) / 47);
        return this.field8847;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 551)
    public final void method3502(boolean arg0) {
        field8851++;
        if (this.field8861 != null) {
            if (this.method3504(0) == null) {
                return;
            }
            if (this.field8864) {
                boolean var6 = true;
                for (class381 var7 = this.field8861.method1904(false); var7 != null; var7 = this.field8861.method1901(111)) {
                    int var9 = (int) var7.field5740;
                    if (this.field8836[var9] == 0) {
                        this.method3492(2, var9, 1);
                    }
                    if (this.field8836[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2360((byte) 66);
                    }
                }
                while (this.field8833.field8807.length > this.field8860) {
                    if (this.field8833.field8807[this.field8860] == 0) {
                        this.field8860++;
                    } else {
                        if (this.field8829.field5121 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field8836[this.field8860] == 0) {
                            this.method3492(2, this.field8860, 1);
                        }
                        if (this.field8836[this.field8860] == 0) {
                            class381 var8 = new class381();
                            var8.field5740 = this.field8860;
                            var6 = false;
                            this.field8861.method1909(var8, (byte) -81);
                        }
                        this.field8860++;
                    }
                }
                if (var6) {
                    this.field8864 = false;
                    this.field8860 = 0;
                }
            } else if (this.field8862) {
                boolean var2 = true;
                for (class381 var3 = this.field8861.method1904(false); var3 != null; var3 = this.field8861.method1901(121)) {
                    int var5 = (int) var3.field5740;
                    if (this.field8836[var5] != 1) {
                        this.method3492(2, var5, 2);
                    }
                    if (this.field8836[var5] == 1) {
                        var3.method2360((byte) 66);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field8860 < this.field8833.field8807.length) {
                    if (this.field8833.field8807[this.field8860] == 0) {
                        this.field8860++;
                    } else {
                        if (this.field8852.method2844(-21)) {
                            var2 = false;
                            break;
                        }
                        if (this.field8836[this.field8860] != 1) {
                            this.method3492(2, this.field8860, 2);
                        }
                        if (this.field8836[this.field8860] != 1) {
                            class381 var4 = new class381();
                            var4.field5740 = this.field8860;
                            this.field8861.method1909(var4, (byte) -81);
                            var2 = false;
                        }
                        this.field8860++;
                    }
                }
                if (var2) {
                    this.field8862 = false;
                    this.field8860 = 0;
                }
            } else {
                this.field8861 = null;
            }
        }
        if (arg0) {
            this.method3499((byte) 87);
        }
        if (!this.field8866 || this.field8865 > class60.method371(false)) {
            return;
        }
        for (class597 var10 = (class597) this.field8853.method1993(-106); var10 != null; var10 = (class597) this.field8853.method1997(9831)) {
            if (!var10.field8640) {
                if (var10.field8643) {
                    if (!var10.field8641) {
                        throw new RuntimeException();
                    }
                    var10.method2360((byte) 66);
                } else {
                    var10.field8643 = true;
                }
            }
        }
        this.field8865 = class60.method371(false) + 1000L;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)Z", line = 734)
    public static final boolean method3503(int arg0, boolean arg1) {
        field8854++;
        if (!arg1) {
            method3500(-120);
        }
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(ILnr;Lnr;Loaa;Ljq;I[BIZ)V", line = 925)
    public class614(int arg0, class19 arg1, class19 arg2, class498 arg3, class346 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field8848 = arg1;
        this.field8849 = arg0;
        if (this.field8848 == null) {
            this.field8864 = false;
        } else {
            this.field8864 = true;
            this.field8861 = new class302();
        }
        this.field8866 = arg8;
        this.field8852 = arg3;
        this.field8857 = arg6;
        this.field8832 = arg7;
        this.field8845 = arg2;
        this.field8829 = arg4;
        this.field8830 = arg5;
        if (this.field8845 != null) {
            this.field8859 = this.field8829.method2149(this.field8845, (byte) 67, this.field8849);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Lgr;", line = 753)
    public final class608 method3504(int arg0) {
        field8841++;
        if (this.field8833 != null) {
            return this.field8833;
        }
        if (this.field8859 == null) {
            if (this.field8852.method2838(-18)) {
                return null;
            }
            this.field8859 = this.field8852.method2851(this.field8849, true, true, 255, (byte) 0);
        }
        if (arg0 != 0) {
            return null;
        } else if (this.field8859.field8640) {
            return null;
        } else {
            byte[] var2 = this.field8859.method2648(98);
            if (this.field8859 instanceof class564) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field8833 = new class608(var2, this.field8830, this.field8857);
                    if (this.field8833.field8791 != this.field8832) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field8833 = null;
                    if (this.field8852.method2838(-77)) {
                        this.field8859 = null;
                    } else {
                        this.field8859 = this.field8852.method2851(this.field8849, true, true, 255, (byte) 0);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field8833 = new class608(var2, this.field8830, this.field8857);
                } catch (RuntimeException var4) {
                    this.field8852.method2840(true);
                    this.field8833 = null;
                    if (this.field8852.method2838(-81)) {
                        this.field8859 = null;
                    } else {
                        this.field8859 = this.field8852.method2851(this.field8849, true, true, 255, (byte) 0);
                    }
                    return null;
                }
                if (this.field8845 != null) {
                    this.field8829.method2147(1442, this.field8849, var2, this.field8845);
                }
            }
            if (this.field8848 != null) {
                this.field8847 = 0;
                this.field8836 = new byte[this.field8833.field8788];
            }
            this.field8859 = null;
            return this.field8833;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V", line = 849)
    public final void method3505(byte arg0, int arg1) {
        field8834++;
        if (this.field8848 == null) {
            return;
        }
        for (class381 var3 = this.field8863.method1904(false); var3 != null; var3 = this.field8863.method1901(107)) {
            if ((long) arg1 == var3.field5740) {
                return;
            }
        }
        if (arg0 <= 108) {
            method3503(-18, false);
        }
        class381 var4 = new class381();
        var4.field5740 = arg1;
        this.field8863.method1909(var4, (byte) -81);
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)I", line = 880)
    public final int method3506(int arg0) {
        field8831++;
        if (arg0 == 0) {
            return this.field8833 == null ? 0 : this.field8833.field8802;
        } else {
            return 14;
        }
    }
}
