import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class474 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lhn;")
    private class509 field7014 = new class509(64);

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public int field7026 = 0;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lfo;")
    private class361 field7019;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public int field7024;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lqh;")
    public static class50 field7027 = new class50(32);

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lho;")
    public static class103 field7030 = new class103(75, 3);

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Ljk;")
    public static class450 field7033;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[[B")
    public static byte[][] field7031;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIIIIIBI)V")
    public static final void method2889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte arg12, int arg13) {
        field7016++;
        if (class152.field1993 == null) {
            return;
        }
        class96 var15;
        if (arg13 >= 0) {
            int var14 = arg13 - 1;
            var15 = class339.field4484[var14];
        } else {
            int var16 = -arg13 - 1;
            if (class308.field4121 == var16) {
                var15 = class96.field1170;
            } else {
                var15 = class29.field272[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        class70 var17 = class123.field1593.method2920(arg9, 19219);
        int var18;
        int var19;
        if (arg5 == 1 || arg5 == 3) {
            var18 = var17.field865;
            var19 = var17.field857;
        } else {
            var18 = var17.field857;
            var19 = var17.field865;
        }
        if (arg12 >= -77) {
            field7034 = 120;
        }
        int var20 = (var19 >> 1) + arg4;
        int var21 = (var19 + 1 >> 1) + arg4;
        int var22 = arg11 + (var18 >> 1);
        int var23 = (var18 + 1 >> 1) + arg11;
        class38 var24 = class152.field1993[arg10];
        int var25 = var24.method217(var20, var22) + var24.method217(var21, var22) + var24.method217(var20, var23) + var24.method217(var21, var23) >> 2;
        class211 var26 = new class211();
        var26.field2829 = arg11;
        var26.field2832 = var15.field3695;
        var26.field2817 = class532.field7836 + arg6;
        var26.field2828 = arg4;
        if (arg8 > arg7) {
            int var27 = arg8;
            arg8 = arg7;
            arg7 = var27;
        }
        var26.field2818 = arg5;
        var26.field2822 = class532.field7836 + arg2;
        var26.field2815 = arg9;
        var26.field2833 = arg3;
        var26.field2819 = arg4 + arg8;
        if (arg1 < arg0) {
            int var28 = arg0;
            arg0 = arg1;
            arg1 = var28;
        }
        var26.field2824 = arg4 + arg7;
        var26.field2830 = (var26.field2829 << 7) + (var18 << 6);
        var26.field2825 = arg0 + arg11;
        var26.field2816 = var25;
        var26.field2821 = (var26.field2828 << 7) + (var19 << 6);
        var26.field2826 = arg1 + arg11;
        class126.field1627.method975(0, var26);
        var15.field1252 = var26;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V")
    public static final void method2890(int arg0, byte arg1) {
        class57.field679 = arg0;
        field7015++;
        int var2 = -79 % ((arg1 - 16) / 48);
        class220.field2973.method3045(48);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static final void method2891(boolean arg0) {
        if (class334.method1948((byte) 86)) {
            if (class176.field2278 == null) {
                class328.method1928(7806);
            }
            class99.field1362 = 0;
            class366.field5009 = true;
            try {
                class155.field2033 = class216.field2949.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        field7020++;
        if (!arg0) {
            method2891(true);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZBII)I")
    public static final int method2892(boolean arg0, byte arg1, int arg2, int arg3) {
        field7013++;
        if (arg1 != -116) {
            method2894(-57);
        }
        class327 var4 = class457.method2813(arg2, arg0, -89);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && arg3 < var4.field4350.length) {
            return var4.field4350[arg3];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2893(long arg0, int arg1) {
        field7028++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 <= 18) {
                return null;
            }
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class498.field7254[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method2894(int arg0) {
        field7030 = null;
        field7033 = null;
        field7031 = null;
        field7027 = null;
        if (arg0 != 0) {
            method2891(true);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lvt;")
    public final class200 method2895(int arg0, int arg1) {
        field7018++;
        class509 var3 = this.field7014;
        class200 var4;
        synchronized (this.field7014) {
            var4 = (class200) this.field7014.method3032(3589, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 < 0) {
            field7027 = null;
        }
        class361 var5 = this.field7019;
        byte[] var6;
        synchronized (this.field7019) {
            var6 = this.field7019.method2130(4, arg1, -125);
        }
        class200 var7 = new class200();
        var7.field2678 = this;
        var7.field2666 = arg1;
        if (var6 != null) {
            var7.method1290(22355, new class396(var6));
        }
        var7.method1289(true);
        class509 var8 = this.field7014;
        synchronized (this.field7014) {
            this.field7014.method3046((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lql;Lza;BLqr;)V")
    public static final void method2896(class519 arg0, class287 arg1, byte arg2, class48 arg3) {
        field7021++;
        class24 var4 = arg3.method281(arg1, (byte) -127);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method150();
        if (arg2 != 105) {
            method2890(-65, (byte) -80);
        }
        if (var4.method146() > var5) {
            var5 = var4.method146();
        }
        byte var6 = 10;
        int var7 = arg0.field7645;
        int var8 = arg0.field7650;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field520 != null) {
            var9 = class328.field4362.method1064((byte) 117, null, null, class376.field5103, arg3.field520);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class376.field5103[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class357.field4870.method886(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class357.field4870.method889() + (class357.field4870.method885() / 2);
        }
        int var15 = var5 / 2 + arg0.field7645;
        int var16 = arg0.field7650;
        if (var7 < (class416.field6016 + var5)) {
            var7 = class416.field6016;
            var15 = var10 / 2 + var5 / 2 + class416.field6016 + var6 + 5;
        } else if ((class416.field6017 - var5) < var7) {
            var15 = class416.field6017 - (var5 / 2) - (var6 - -(var10 / 2)) - 5;
            var7 = class416.field6017 - var5;
        }
        if (var8 < class416.field6012 + var5) {
            var8 = class416.field6012;
            var16 = class416.field6012 - (-(var5 / 2) - var6);
        } else if (var8 > class416.field6007 - var5) {
            var8 = class416.field6007 - var5;
            var16 = class416.field6007 - (var5 / 2) - (var6 + var11);
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg0.field7645), (double) (var8 - arg0.field7650)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method140((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field520 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var20 = var10 + var18 + 10;
            var21 = var9 * class357.field4870.method889() + var16 + 3;
            if (arg3.field528 != 0) {
                arg1.method1717(var20 - var18, var18, var21 - var16, arg3.field528, -22794, var16);
            }
            if (arg3.field534 != 0) {
                arg1.method1721(var18, var21 - var16, true, var16, arg3.field534, var20 - var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class376.field5103[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class357.field4870.method887(arg1, var23, var15, var16, arg3.field519, true);
                var16 += class357.field4870.method889();
            }
        }
        if (arg3.field536 == -1 && arg3.field520 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class320 var25 = new class320(arg0);
        var25.field4263 = var21;
        var25.field4270 = var19;
        var25.field4266 = var8 - var24;
        var25.field4262 = var18;
        var25.field4273 = var7 + var24;
        var25.field4269 = var20;
        var25.field4267 = var8 + var24;
        var25.field4264 = var7 - var24;
        class342.field4590.method975(0, var25);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public final void method2897(int arg0, int arg1) {
        class509 var3 = this.field7014;
        synchronized (this.field7014) {
            this.field7014.method3036(arg0, (byte) -72);
            int var4 = -73 / ((-arg1 - 66) / 40);
        }
        field7023++;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public final void method2898(boolean arg0) {
        if (arg0) {
            this.field7014 = null;
        }
        class509 var2 = this.field7014;
        synchronized (this.field7014) {
            this.field7014.method3045(48);
        }
        field7022++;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ld;ILfo;)V")
    public class474(class104 arg0, int arg1, class361 arg2) {
        this.field7019 = arg2;
        this.field7024 = this.field7019.method2136(-46, 4);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public final void method2899(byte arg0) {
        field7017++;
        if (arg0 >= -120) {
            this.field7019 = null;
        }
        class509 var2 = this.field7014;
        synchronized (this.field7014) {
            this.field7014.method3034((byte) 86);
        }
    }

    static {
        new class305("Ok", "Okay", "OK", "Ok");
        field7032 = 0;
        field7033 = null;
        field7031 = new byte[1000][];
        field7034 = -1;
    }
}
