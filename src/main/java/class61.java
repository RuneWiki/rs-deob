import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class61 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lau;")
    private class692 field970 = new class692(16);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lmv;")
    private class295 field966;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lvg;")
    public static class622 field969 = new class622(6, 0);

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Liba;")
    public static class211 field977 = new class211(15, 6);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lew;")
    public static class226 field978;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method373(int arg0) {
        field977 = null;
        field978 = null;
        field969 = null;
        if (arg0 != 13240) {
            method377(null, -70, 115, 55);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public final void method374(byte arg0) {
        int var2 = 62 % ((arg0 - 26) / 33);
        field974++;
        class692 var3 = this.field970;
        synchronized (this.field970) {
            this.field970.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIILbo;)Lwa;")
    public final class319 method375(int arg0, int arg1, int arg2, int arg3, int arg4, class28 arg5) {
        if (arg1 != -1946) {
            field969 = null;
        }
        field967++;
        class130[] var7 = null;
        class702 var8 = this.method378(arg2, -102);
        if (var8.field9971 != null) {
            var7 = new class130[var8.field9971.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class676 var10 = arg5.method182(var8.field9971[var9], -2);
                var7[var9] = new class130(var10.field9526, var10.field9529, var10.field9525, var10.field9534, var10.field9523, var10.field9532, var10.field9533, var10.field9527);
            }
        }
        return new class319(var8.field9972, var7, var8.field9973, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public final void method376(int arg0, int arg1) {
        field973++;
        class692 var3 = this.field970;
        synchronized (this.field970) {
            this.field970.method3900(arg1, arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
    public static final String method377(String[] arg0, int arg1, int arg2, int arg3) {
        field972++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            int var9 = arg1;
            if (arg2 != 4) {
                return null;
            }
            while (var5 > var9) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
                var9++;
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Ldfa;")
    private final class702 method378(int arg0, int arg1) {
        field975++;
        class692 var3 = this.field970;
        class702 var4;
        synchronized (this.field970) {
            var4 = (class702) this.field970.method3901((long) arg0, -92);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field966;
        byte[] var6;
        synchronized (this.field966) {
            var6 = this.field966.method1844(29, 31330, arg0);
        }
        class702 var7 = new class702();
        if (var6 != null) {
            var7.method3935(-14532, new class540(var6));
        }
        class692 var8 = this.field970;
        synchronized (this.field970) {
            this.field970.method3894(var7, (byte) 60, (long) arg0);
            if (arg1 >= -34) {
                method377(null, -38, -18, -26);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BZ)V")
    public static final void method379(byte arg0, boolean arg1) {
        field979++;
        if (arg1 && class55.field833 != null) {
            class309.field4566 = class55.field833.field8730;
        } else {
            class309.field4566 = -1;
        }
        class507.field7162 = null;
        class87.field1348 = 0;
        class55.field833 = null;
        class574.field8343 = null;
        class55.method344();
        class55.field841.method1905(0);
        class519.field7277 = -1;
        class109.field1624 = null;
        if (arg0 != -101) {
            field978 = null;
        }
        class267.field3489 = null;
        class322.field4691 = null;
        class556.field8165 = null;
        class678.field9596 = null;
        class612.field8825 = null;
        class79.field1287 = null;
        class425.field6217 = -1;
        class480.field6872 = null;
        class162.field2284 = null;
        class55.field840 = null;
        if (class55.field834 != null) {
            class55.field834.method2755(106);
            class55.field834.method2752(36, 128, 64);
        }
        if (class55.field835 != null) {
            class55.field835.method226(64, (byte) 127, 64);
        }
        if (class55.field837 != null) {
            class55.field837.method2598(64, false);
        }
        class449.field6504.method1959(arg0 + 147, 64);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method380(int arg0) {
        field976++;
        class692 var2 = this.field970;
        synchronized (this.field970) {
            if (arg0 == 1564433289) {
                this.field970.method3890(arg0 ^ 0xA2C0A476);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILmq;IIILlt;ILu;)V")
    public static final void method381(int arg0, class71 arg1, int arg2, int arg3, int arg4, class289 arg5, int arg6, class53 arg7) {
        field971++;
        if (arg6 != 0) {
            method382(-35);
        }
        class65 var8 = new class65();
        var8.field1029 = arg4;
        var8.field1027 = arg3 << 9;
        var8.field1020 = arg0 << 9;
        if (arg5 != null) {
            var8.field1009 = arg5;
            int var9 = arg5.field4269;
            int var10 = arg5.field4197;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg5.field4269;
                var9 = arg5.field4197;
            }
            var8.field1010 = arg5.field4233 << 9;
            var8.field1033 = arg0 + var9 << 9;
            var8.field1028 = arg5.field4191;
            var8.field1012 = arg5.field4204;
            var8.field1016 = arg5.field4207;
            var8.field1042 = arg5.field4209;
            var8.field1008 = arg5.field4200;
            var8.field1039 = arg5.field4189;
            var8.field1011 = arg5.field4222;
            var8.field1035 = arg3 + var10 << 9;
            var8.field1017 = arg5.field4206;
            var8.field1030 = arg5.field4193;
            if (arg5.field4213 != null) {
                var8.field1032 = true;
                var8.method396((byte) 58);
            }
            if (var8.field1030 != null) {
                var8.field1023 = var8.field1042 + (int) (Math.random() * (double) (var8.field1011 - var8.field1042));
            }
            class111.field1644.method1909(var8, (byte) -81);
        } else if (arg7 != null) {
            var8.field1015 = arg7;
            class76 var11 = arg7.field805;
            if (var11.field1212 != null) {
                var8.field1032 = true;
                var11 = var11.method443(class308.field4545, (byte) 107);
            }
            if (var11 != null) {
                var8.field1033 = arg0 + var11.field1239 << 9;
                var8.field1035 = arg3 + var11.field1239 << 9;
                var8.field1039 = class369.method2285(arg7, 0);
                var8.field1028 = var11.field1201;
                var8.field1016 = var11.field1193;
                var8.field1010 = var11.field1177 << 9;
                var8.field1012 = var11.field1227;
                var8.field1017 = var11.field1217;
            }
            class232.field3072.method1909(var8, (byte) -81);
        } else if (arg1 != null) {
            var8.field1013 = arg1;
            var8.field1033 = arg1.method422((byte) -96) + arg0 << 9;
            var8.field1035 = arg3 + arg1.method422((byte) -42) << 9;
            var8.field1039 = class265.method1595(arg6, arg1);
            var8.field1016 = arg1.field1121;
            var8.field1012 = arg1.field1107;
            var8.field1028 = 256;
            var8.field1017 = 256;
            var8.field1010 = arg1.field1122 << 9;
            class587.field8519.method2001(arg6 - 108, var8, (long) arg1.field7405);
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
    public static final void method382(int arg0) {
        class416.field6150 = 0;
        field968++;
        int var1 = 0;
        if (arg0 != 1) {
            method382(43);
        }
        while (var1 < 2048) {
            class46.field715[var1] = null;
            class647.field9308[var1] = 1;
            class262.field3402[var1] = null;
            var1++;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lsea;ILmv;)V")
    public class61(class373 arg0, int arg1, class295 arg2) {
        this.field966 = arg2;
        this.field966.method1845(29, true);
    }
}
