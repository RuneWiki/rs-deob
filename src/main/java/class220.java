import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class220 {

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    private int field2956 = -1;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Z")
    private boolean field2962 = true;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    private int field2942;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[Ljf;")
    private class95[] field2946;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    private int field2948;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[Ljf;")
    private class95[] field2949;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Ljf;")
    private class95 field2953;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    private int field2954;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Llg;")
    private class20 field2944;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "[Llg;")
    public static class20[] field2943;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[[[I")
    public static int[][][] field2959;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lpj;")
    public static final class393 method1186(byte arg0, int arg1) {
        field2958++;
        class114 var2 = class396.field5700;
        class393 var3;
        synchronized (class396.field5700) {
            var3 = (class393) class396.field5700.method616(arg0 - 3, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class297.field4041.method1687(class47.method219(arg0 ^ 0xFFFFFFCB, arg1), class116.method622(arg0 ^ 0x1A, arg1), 255);
        class393 var5 = new class393();
        var5.field5670 = arg1;
        if (var4 != null) {
            var5.method2448((byte) 108, new class250(var4));
        }
        if (arg0 != -110) {
            method1193(41);
        }
        class114 var6 = class396.field5700;
        synchronized (class396.field5700) {
            class396.field5700.method615((byte) -120, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1187(byte arg0) {
        if (arg0 <= 119) {
            method1187((byte) 82);
        }
        field2959 = null;
        field2943 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public final void method1188(byte arg0) {
        if (this.field2946 != null) {
            for (int var2 = 0; var2 < this.field2946.length; var2++) {
                this.field2946[var2].method519();
            }
        }
        field2952++;
        if (arg0 == 126) {
            this.field2944 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILvm;I)Z")
    public final boolean method1189(int arg0, class322 arg1, int arg2) {
        int var4 = 68 / ((arg0 + 73) / 36);
        if (this.field2956 != arg2) {
            this.field2956 = arg2;
            int var5 = class322.method1853(114, arg2);
            if (arg2 < var5) {
                var5 = class23.method123(11362, arg2);
            }
            if (var5 > 512) {
                var5 = 512;
            }
            if (this.field2960 != var5) {
                this.field2960 = var5;
                this.field2944 = null;
            }
            if (this.field2946 != null) {
                this.field2954 = 0;
                int[] var6 = new int[this.field2946.length];
                for (int var7 = 0; var7 < this.field2946.length; var7++) {
                    class95 var8 = this.field2946[var7];
                    if (var8.method521(this.field2947, this.field2950, this.field2948, this.field2956)) {
                        var6[this.field2954] = var8.field1107;
                        this.field2949[this.field2954++] = var8;
                    }
                }
                class291.method1719(var6, -10382, 0, this.field2954 - 1, this.field2949);
            }
            this.field2962 = true;
        }
        field2955++;
        boolean var9 = false;
        if (this.field2962) {
            this.field2962 = false;
            for (int var10 = this.field2954 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field2949[var10].method516(arg1, this.field2953);
                this.field2962 |= !var11;
                var9 |= var11;
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILvm;IBIIIIII)V")
    public final void method1190(int arg0, class322 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 51) {
            this.method1188((byte) -110);
        }
        field2961++;
        int var11 = arg4 + arg7 & 0x3FFF;
        if (this.field2942 == -1) {
            arg1.method1614(arg0, arg8, arg6, arg5, arg9, 0);
        } else {
            class75 var12 = class333.field4429.method1660(this.field2942, (byte) -115);
            if (this.field2944 == null && class333.field4429.method1665(this.field2942, (byte) -125)) {
                int[] var13 = var12.field834 ? class333.field4429.method1662(false, this.field2960, this.field2960, 28861, 0.7F, this.field2942) : class333.field4429.method1659(0.7F, this.field2942, false, this.field2960, this.field2960, 21196);
                this.field2944 = arg1.method1637(var13, 0, this.field2960, this.field2960, this.field2960);
            }
            if (!var12.field834) {
                arg1.method1614(arg0, arg8, arg6, arg5, arg9, 0);
            }
            if (this.field2944 != null) {
                int var14 = var12.field834 ? 0 : 1;
                int var15 = arg2 * arg5 / -4096;
                int var16;
                for (var16 = (arg6 - arg5) / 2 + (arg5 * var11 / 4096); var16 > arg5; var16 -= arg5) {
                }
                while (var15 > arg5) {
                    var15 -= arg5;
                }
                while (var16 < 0) {
                    var16 += arg5;
                }
                while (var15 < 0) {
                    var15 += arg5;
                }
                for (int var17 = var16 - arg5; var17 < arg6; var17 += arg5) {
                    for (int var18 = var15 - arg5; var18 < arg5; var18 += arg5) {
                        this.field2944.method110(arg0 + var17, arg8 + var18, arg5, arg5, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field2954 - 1; var19 >= 0; var19--) {
            this.field2949[var19].method518(arg1, arg0, arg8, arg6, arg5, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lds;IZII)V")
    public static final void method1191(class225 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            field2959 = null;
        }
        field2951++;
        for (class319 var5 = (class319) class98.field1158.method814((byte) 90); var5 != null; var5 = (class319) class98.field1158.method827(33)) {
            if (var5.field4242 == arg4 && arg3 * 128 == var5.field4261 && (arg1 * 128) == var5.field4249 && var5.field4251.field3051 == arg0.field3051) {
                if (var5.field4246 != null) {
                    class374.field5265.method2213(var5.field4246);
                    var5.field4246 = null;
                }
                if (var5.field4265 != null) {
                    class374.field5265.method2213(var5.field4265);
                    var5.field4265 = null;
                }
                var5.method1967(-1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)V")
    public static final void method1192(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2963++;
        class281.field3857.field3389 = 0;
        int var5 = 33 % ((68 - arg2) / 45);
        class281.field3857.method1386(-222840624, 20);
        class281.field3857.method1386(-222840624, arg0);
        class281.field3857.method1386(-222840624, arg4);
        class281.field3857.method1346(124, arg1);
        class281.field3857.method1346(119, arg3);
        class351.field4913 = 1;
        class428.field6286 = 0;
        class309.field4181 = 0;
        class388.field5529 = -3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static final void method1193(int arg0) {
        field2957++;
        if (arg0 >= 27) {
            class162.field2073.method613(true);
            class321.field4295.method613(true);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)I")
    public static final int method1194(int arg0, boolean arg1) {
        field2945++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg1) {
            method1191((class225) null, 22, false, -31, -124);
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I[Ljf;IIII)V")
    public class220(int arg0, class95[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2947 = arg3;
        this.field2942 = arg0;
        this.field2946 = arg1;
        this.field2948 = arg5;
        this.field2950 = arg4;
        if (arg1 == null) {
            this.field2953 = null;
            this.field2949 = null;
        } else {
            this.field2949 = new class95[arg1.length];
            this.field2953 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
