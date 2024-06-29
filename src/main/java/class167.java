import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class167 {

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lpe;")
    private class102 field3005 = new class102();

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Lr;")
    public static class66 field3002 = class93.method641(43, "<col=40ff00>");

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lr;")
    public static class66 field3006 = class93.method641(43, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "[Z")
    public static boolean[] field3009 = new boolean[112];

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Lpe;")
    private class102 field3010;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        if (~class144.field2635 > arg0) {
            class144.field2635 = 0;
            class214.field3684 = -1;
            class15.field196 = -1;
        }
        field2999++;
        if (class144.field2635 > class33.field500) {
            class15.field196 = -1;
            class214.field3684 = -1;
            class144.field2635 = class33.field500;
        }
        if (class192.field3323 < 0) {
            class214.field3684 = -1;
            class192.field3323 = 0;
            class15.field196 = -1;
        }
        if (class192.field3323 > class89.field1727) {
            class192.field3323 = class89.field1727;
            class15.field196 = -1;
            class214.field3684 = -1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public final void method1131(byte arg0) {
        while (true) {
            class102 var2 = this.field3005.field1997;
            if (this.field3005 == var2) {
                field3004++;
                if (arg0 > -30) {
                    return;
                }
                this.field3010 = null;
                return;
            }
            var2.method704((byte) 73);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)Lpe;")
    public final class102 method1132(int arg0) {
        class102 var2 = this.field3005.field1997;
        field3003++;
        if (this.field3005 == var2) {
            this.field3010 = null;
            return null;
        }
        this.field3010 = var2.field1997;
        if (arg0 != 1742) {
            this.method1131((byte) -63);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public static void method1133(int arg0) {
        field3002 = null;
        field3006 = null;
        if (arg0 <= -23) {
            field3009 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lpe;B)V")
    public final void method1134(class102 arg0, byte arg1) {
        if (arg0.field1992 != null) {
            arg0.method704((byte) 73);
        }
        field2997++;
        arg0.field1997 = this.field3005.field1997;
        if (arg1 != 121) {
            this.method1138(107);
        }
        arg0.field1992 = this.field3005;
        arg0.field1992.field1997 = arg0;
        arg0.field1997.field1992 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILpe;)V")
    public final void method1135(int arg0, class102 arg1) {
        field2996++;
        if (arg1.field1992 != null) {
            arg1.method704((byte) 73);
        }
        arg1.field1992 = this.field3005.field1992;
        arg1.field1997 = this.field3005;
        arg1.field1992.field1997 = arg1;
        arg1.field1997.field1992 = arg1;
        if (arg0 < 27) {
            field3002 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILta;)V")
    public static final void method1136(int arg0, class107 arg1) {
        field3000++;
        if (arg1.field2097 == 0) {
            return;
        }
        if (arg1.field2041 != -1 && arg1.field2041 < 32768) {
            class37 var2 = class178.field3112[arg1.field2041];
            if (var2 != null) {
                int var3 = arg1.field2077 - var2.field2077;
                int var4 = arg1.field2053 - var2.field2053;
                if (var3 != 0 || var4 != 0) {
                    arg1.field2049 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2041 >= 32768) {
            int var5 = arg1.field2041 - 32768;
            if (class49.field882 == var5) {
                var5 = 2047;
            }
            class45 var6 = class59.field988[var5];
            if (var6 != null) {
                int var7 = arg1.field2053 - var6.field2053;
                int var8 = arg1.field2077 - var6.field2077;
                if (var8 != 0 || var7 != 0) {
                    arg1.field2049 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2042 != 0 || arg1.field2088 != 0) && (arg1.field2095 == 0 || arg1.field2036 > 0)) {
            int var9 = -((arg1.field2042 - class3.field39 - class3.field39) * 64) - (-(arg1.field2060 * 64) - arg1.field2077) - 64;
            int var10 = (arg1.field2060 - 1) * 64 + arg1.field2053 - (-class34.field512 + -class34.field512 + arg1.field2088) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field2049 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field2042 = 0;
            arg1.field2088 = 0;
        }
        int var11 = arg1.field2049 - arg1.field2064 & 0x7FF;
        if (arg0 != 20106) {
            field3009 = null;
        }
        if (var11 == 0) {
            arg1.field2078 = 0;
            return;
        }
        arg1.field2078++;
        if (var11 > 1024) {
            arg1.field2064 -= arg1.field2097;
            boolean var12 = true;
            if (arg1.field2097 > var11 || 2048 - arg1.field2097 < var11) {
                arg1.field2064 = arg1.field2049;
                var12 = false;
            }
            if (arg1.field2046 == arg1.field2040 && (arg1.field2078 > 25 || var12)) {
                if (arg1.field2081 == -1) {
                    arg1.field2040 = arg1.field2059;
                } else {
                    arg1.field2040 = arg1.field2081;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field2064 += arg1.field2097;
            if (var11 < arg1.field2097 || (2048 - arg1.field2097) < var11) {
                arg1.field2064 = arg1.field2049;
                var13 = false;
            }
            if (arg1.field2046 == arg1.field2040 && (arg1.field2078 > 25 || var13)) {
                if (arg1.field2080 == -1) {
                    arg1.field2040 = arg1.field2059;
                } else {
                    arg1.field2040 = arg1.field2080;
                }
            }
        }
        arg1.field2064 &= 0x7FF;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lcj;II)Ljb;")
    public static final class256 method1137(class28 arg0, int arg1, int arg2) {
        field2993++;
        if (class87.method618(arg0, -1, arg2)) {
            return arg1 == 23463 ? class211.method1368((byte) -126) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)Lpe;")
    public final class102 method1138(int arg0) {
        class102 var2 = this.field3005.field1997;
        field3007++;
        if (this.field3005 == var2) {
            return null;
        } else {
            var2.method704((byte) 73);
            return arg0 == 2265 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)Lpe;")
    public final class102 method1139(int arg0) {
        field2998++;
        class102 var2 = this.field3010;
        int var3 = 75 % ((arg0 - 64) / 59);
        if (this.field3005 == var2) {
            this.field3010 = null;
            return null;
        } else {
            this.field3010 = var2.field1997;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIBII)V")
    public static final void method1140(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2994++;
        class15 var5 = (class15) class84.field1631.method1381((long) arg3, 97);
        if (var5 == null) {
            var5 = new class15();
            class84.field1631.method1380((byte) 121, var5, (long) arg3);
        }
        if (arg0 >= var5.field195.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field195.length; var8++) {
                var6[var8] = var5.field195[var8];
                var7[var8] = var5.field192[var8];
            }
            for (int var9 = var5.field195.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field192 = var7;
            var5.field195 = var6;
        }
        if (arg2 >= -11) {
            method1140(0, 82, (byte) -2, -76, 28);
        }
        var5.field195[arg0] = arg4;
        var5.field192[arg0] = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class167() {
        this.field3005.field1992 = this.field3005;
        this.field3005.field1997 = this.field3005;
    }
}
