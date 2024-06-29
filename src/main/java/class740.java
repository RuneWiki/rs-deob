import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class740 {

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Ljava/lang/String;")
    private String field10897 = field10909[5];

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10909 = new String[] { method5399(method5398("Bn[lm")), method5399(method5398("Bn[om")), method5399(method5398("Bn[cm")), method5399(method5398("Bn[bm")), method5399(method5398("Bn[`m")), method5399(method5398("K~\u0019H")), method5399(method5398("Bn[im")), method5399(method5398("^%[\n8")), method5399(method5398("Bn[mm")), method5399(method5398("Bn[nm")), method5399(method5398("Bn[em")), method5399(method5398("Bn[gm")), method5399(method5398("Bn[fm")), method5399(method5398("Bn[am")), method5399(method5398("Bn[hm")) };

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lhl;")
    public static class556 field10891 = new class556(118, -2);

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
    public static int[] field10908 = new int[500];

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "C")
    public char field10888;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "C")
    public char field10904;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field10885;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field10886;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field10887;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field10889;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field10890;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field10892;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field10893;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field10894;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field10895;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    private int field10896;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field10898;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    private int field10899;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field10900;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field10903;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field10906;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lqr;")
    private class69 field10905;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field10901;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Ljava/lang/String;")
    public static String field10907;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "[Ls;")
    public static class293[] field10902;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB)Z", line = 14)
    public static final boolean method5385(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 <= 98) {
                return true;
            } else {
                field10906++;
                return (arg0 & 0x800) != 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10909[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V", line = 25)
    private final void method5386(byte arg0) {
        try {
            if (this.field10901 instanceof class69) {
                class69 var2 = (class69) this.field10901;
                this.field10905 = new class69(var2.method731(-91));
                for (class525 var3 = (class525) var2.method735(0); var3 != null; var3 = (class525) var2.method734((byte) -50)) {
                    class419 var4 = new class419(var3.field7740, (int) var3.field8252);
                    this.field10905.method738(var4, class546.method4056((byte) -120, var3.field7740), -12002);
                }
            } else {
                String[] var5 = (String[]) this.field10901;
                this.field10905 = new class69(class90.method883((byte) 35, var5.length));
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        class419 var7 = new class419(var5[var6], var6);
                        this.field10905.method738(var7, class546.method4056((byte) -114, var5[var6]), -12002);
                    }
                }
            }
            field10894++;
            if (arg0 > 0) {
                field10907 = null;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field10909[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V", line = 76)
    public static void method5387(byte arg0) {
        try {
            field10907 = null;
            field10908 = null;
            int var1 = 39 / ((-arg0 - 32) / 41);
            field10902 = null;
            field10891 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10909[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 88)
    public static final void method5388(int arg0) {
        try {
            field10903++;
            if (~class623.field8996.field6356.method4838(true) == arg0 && class673.field9554 != class262.field4264) {
                class796.method5716(class586.field8499, false, -65, 12, class608.field8762);
            } else {
                class518.method3885(arg0 ^ 0xFFFFAA3D, class662.field9437);
                if (class760.field11176 != class673.field9554) {
                    class716.method5186(2);
                }
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10909[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 108)
    public final boolean method5389(String arg0, int arg1) {
        try {
            field10887++;
            if (this.field10901 == null) {
                return false;
            }
            if (this.field10905 == null) {
                this.method5386((byte) -56);
            }
            class419 var3 = (class419) this.field10905.method737((byte) -39, class546.method4056((byte) -114, arg0));
            if (arg1 < 60) {
                this.method5386((byte) -24);
            }
            while (var3 != null) {
                if (var3.field6627.equals(arg0)) {
                    return true;
                }
                var3 = (class419) this.field10905.method739(true);
            }
            return false;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10909[6] + (arg0 == null ? field10909[5] : field10909[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 139)
    private final void method5390(int arg0) {
        try {
            field10889++;
            if (arg0 != 0) {
                method5391((byte) 107);
            }
            if ((this.field10901 instanceof class69)) {
                class69 var5 = (class69) this.field10901;
                this.field10905 = new class69(var5.method731(arg0 + 41));
                for (class272 var6 = (class272) var5.method735(0); var6 != null; var6 = (class272) var5.method734((byte) -50)) {
                    class272 var7 = new class272((int) var6.field8252);
                    this.field10905.method738(var7, (long) var6.field4377, -12002);
                }
            } else {
                Integer[] var2 = (Integer[]) this.field10901;
                this.field10905 = new class69(class90.method883((byte) 107, var2.length));
                for (int var3 = 0; var3 < var2.length; var3++) {
                    if (var2[var3] != null) {
                        class272 var4 = new class272(var3);
                        this.field10905.method738(var4, (long) var2[var3], -12002);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field10909[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I", line = 187)
    public static final int method5391(byte arg0) {
        try {
            field10895++;
            int var1 = 121 / ((arg0 + 77) / 48);
            return class184.field2931 == 1 ? class413.field6569 : class705.field10114;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10909[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)I", line = 205)
    public final int method5392(int arg0, byte arg1) {
        try {
            field10900++;
            if (this.field10901 == null) {
                return this.field10896;
            }
            if (arg1 != 105) {
                this.field10901 = null;
            }
            if ((this.field10901 instanceof class69)) {
                class272 var5 = (class272) ((class69) this.field10901).method737((byte) -39, (long) arg0);
                return var5 == null ? this.field10896 : var5.field4377;
            }
            Integer[] var3 = (Integer[]) this.field10901;
            if (arg0 >= 0 && arg0 < var3.length) {
                Integer var4 = var3[arg0];
                return var4 == null ? this.field10896 : var4;
            } else {
                return this.field10896;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field10909[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Ljava/lang/String;", line = 247)
    public final String method5393(int arg0, int arg1) {
        try {
            int var3 = 65 / ((arg1 - 70) / 49);
            field10886++;
            if (this.field10901 == null) {
                return this.field10897;
            } else if ((this.field10901 instanceof class69)) {
                class525 var6 = (class525) ((class69) this.field10901).method737((byte) -39, (long) arg0);
                return var6 == null ? this.field10897 : var6.field7740;
            } else {
                String[] var4 = (String[]) this.field10901;
                if (arg0 >= 0 && var4.length > arg0) {
                    String var5 = var4[arg0];
                    return var5 == null ? this.field10897 : var5;
                } else {
                    return this.field10897;
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10909[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Z", line = 286)
    public final boolean method5394(int arg0, int arg1) {
        try {
            field10892++;
            if (this.field10901 == null) {
                return false;
            }
            if (arg0 != 3) {
                field10885 = -16;
            }
            if (this.field10905 == null) {
                this.method5390(arg0 - 3);
            }
            class272 var3 = (class272) this.field10905.method737((byte) -39, (long) arg1);
            return var3 != null;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10909[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLwq;)V", line = 310)
    public final void method5395(byte arg0, class176 arg1) {
        try {
            while (true) {
                int var3 = arg1.method1645((byte) -112);
                if (var3 == 0) {
                    field10890++;
                    if (arg0 >= -66) {
                        field10907 = null;
                        return;
                    }
                    return;
                }
                this.method5397(-79, var3, arg1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10909[8] + arg0 + ',' + (arg1 == null ? field10909[5] : field10909[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)I", line = 330)
    public final int method5396(byte arg0) {
        try {
            field10893++;
            if (arg0 != 18) {
                this.method5390(-116);
            }
            return this.field10899;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10909[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILwq;)V", line = 341)
    private final void method5397(int arg0, int arg1, class176 arg2) {
        try {
            int var4 = 62 / ((arg0 - 59) / 44);
            if (arg1 == 1) {
                this.field10904 = class423.method3359(-6826, arg2.method1672(127));
            } else if (arg1 == 2) {
                this.field10888 = class423.method3359(-6826, arg2.method1672(108));
            } else if (arg1 == 3) {
                this.field10897 = arg2.method1635((byte) 77);
            } else if (arg1 == 4) {
                this.field10896 = arg2.method1622(-18712);
            } else if (arg1 == 5 || arg1 == 6) {
                this.field10899 = arg2.method1687((byte) -91);
                class69 var5 = new class69(class90.method883((byte) 57, this.field10899));
                for (int var6 = 0; var6 < this.field10899; var6++) {
                    int var7 = arg2.method1622(-18712);
                    class568 var8;
                    if (arg1 == 5) {
                        var8 = new class525(arg2.method1635((byte) 95));
                    } else {
                        var8 = new class272(arg2.method1622(-18712));
                    }
                    var5.method738(var8, (long) var7, -12002);
                }
                this.field10901 = var5;
            } else if (arg1 == 7) {
                int var13 = arg2.method1687((byte) -107);
                this.field10899 = arg2.method1687((byte) -74);
                String[] var14 = new String[var13];
                for (int var15 = 0; var15 < this.field10899; var15++) {
                    int var16 = arg2.method1687((byte) -97);
                    var14[var16] = arg2.method1635((byte) 124);
                }
                this.field10901 = var14;
            } else if (arg1 == 8) {
                int var9 = arg2.method1687((byte) -85);
                this.field10899 = arg2.method1687((byte) -118);
                Integer[] var10 = new Integer[var9];
                for (int var11 = 0; var11 < this.field10899; var11++) {
                    int var12 = arg2.method1687((byte) -46);
                    var10[var12] = Integer.valueOf(arg2.method1622(-18712));
                }
                this.field10901 = var10;
            }
            field10898++;
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field10909[12] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10909[5] : field10909[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5398(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5399(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 11;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
