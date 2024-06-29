import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class148 {

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public int field2289;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "F")
    public float field2287;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public int field2283;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "F")
    public float field2291;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "F")
    public float field2294;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field2293 = -1;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "[Lwa;")
    public static class284[] field2285;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 6)
    public static void method1016(byte arg0) {
        field2285 = null;
        if (arg0 < 7) {
            field2285 = (class284[]) null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLtb;)V", line = 17)
    public static final void method1017(byte arg0, class189 arg1) {
        if (arg0 < 108) {
            field2293 = -104;
        }
        field2288++;
        if (class203.field3335 == arg1.field2990 || arg1.field3044 == -1 || arg1.field3005 != 0 || (arg1.field3054 + 1) > class119.method858(true, arg1.field3044).field3075[arg1.field3009]) {
            int var2 = arg1.field2990 - arg1.field3036;
            int var3 = class203.field3335 - arg1.field3036;
            int var4 = arg1.field3019 * 128 + arg1.field3012 * 64;
            int var5 = arg1.field3012 * 64 + arg1.field3000 * 128;
            int var6 = arg1.field3014 * 128 + (arg1.field3012 * 64);
            arg1.field3027 = ((var2 - var3) * var4 + var3 * var6) / var2;
            int var7 = arg1.field3040 * 128 + (arg1.field3012 * 64);
            arg1.field3021 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg1.field3018 == 0) {
            arg1.field3037 = 1024;
        }
        arg1.field3016 = 0;
        if (arg1.field3018 == 1) {
            arg1.field3037 = 1536;
        }
        if (arg1.field3018 == 2) {
            arg1.field3037 = 0;
        }
        if (arg1.field3018 == 3) {
            arg1.field3037 = 512;
        }
        arg1.field3008 = arg1.field3037;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IJ)Luf;", line = 75)
    public static final class168 method1018(int arg0, long arg1) {
        class56.field728.setTime(new Date(arg1));
        field2284++;
        int var3 = class56.field728.get(7);
        if (arg0 != 10) {
            field2285 = (class284[]) null;
        }
        int var4 = class56.field728.get(5);
        int var5 = class56.field728.get(2);
        int var6 = class56.field728.get(1);
        int var7 = class56.field728.get(11);
        int var8 = class56.field728.get(12);
        int var9 = class56.field728.get(13);
        return class134.method938((byte) -124, new class168[] { class8.field109[var3 - 1], class83.field1264, class169.method1228(var4 / 10, 0), class169.method1228(var4 % 10, 0), class149.field2310, class293.field4949[var5], class149.field2310, class169.method1228(var6, 0), class92.field1422, class169.method1228(var7 / 10, 0), class169.method1228(var7 % 10, 0), class95.field1517, class169.method1228(var8 / 10, 0), class169.method1228(var8 % 10, 0), class95.field1517, class169.method1228(var9 / 10, 0), class169.method1228(var9 % 10, 0), class25.field301 });
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/lang/String;)Luf;", line = 101)
    public static final class168 method1019(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        field2290++;
        int var3 = var2.length;
        if (arg0 != -1720) {
            method1017((byte) -112, (class189) null);
        }
        class168 var4 = new class168();
        int var5 = 0;
        var4.field2716 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field2716[var4.field2692++] = (byte) (var7 + var6 * 43 - 48 - 1720);
            } else if (var6 != 0) {
                var4.field2716[var4.field2692++] = (byte) var6;
            }
        }
        var4.method1201((byte) -98);
        return var4.method1209((byte) -109);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIIIZI)Z", line = 158)
    public static final boolean method1020(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class145.field2251[var12][var13] = 0;
                class22.field276[var12][var13] = 99999999;
            }
        }
        class145.field2251[arg11][arg5] = 99;
        field2281++;
        class22.field276[arg11][arg5] = 0;
        int var14 = arg11;
        class240.field3899[arg4] = arg11;
        int var16 = arg5;
        int var15 = arg4 + 1;
        class263.field4456[arg4] = arg5;
        int var17 = 0;
        boolean var18 = false;
        int[][] var19 = class140.field2176[class79.field1127].field4317;
        while (var15 != var17) {
            var16 = class263.field4456[var17];
            var14 = class240.field3899[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg2 == var14 && arg1 == var16) {
                var18 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class140.field2176[class79.field1127].method1739(arg2, arg1, arg7, 0, var14, arg0 - 1, var16, 1)) {
                    var18 = true;
                    break;
                }
                if (arg0 < 10 && class140.field2176[class79.field1127].method1741(arg0 - 1, false, 1, arg2, arg7, arg1, var16, var14)) {
                    var18 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg9 != 0 && class140.field2176[class79.field1127].method1733(arg1, (byte) 103, 1, arg9, arg3, arg2, var14, arg6, var16)) {
                var18 = true;
                break;
            }
            int var20 = class22.field276[var14][var16] + 1;
            if (var14 > 0 && class145.field2251[var14 - 1][var16] == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0) {
                class240.field3899[var15] = var14 - 1;
                class263.field4456[var15] = var16;
                class145.field2251[var14 - 1][var16] = 2;
                var15 = var15 + 1 & 0xFFF;
                class22.field276[var14 - 1][var16] = var20;
            }
            if (var14 < 103 && class145.field2251[var14 + 1][var16] == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0) {
                class240.field3899[var15] = var14 + 1;
                class263.field4456[var15] = var16;
                class145.field2251[var14 + 1][var16] = 8;
                class22.field276[var14 + 1][var16] = var20;
                var15 = var15 + 1 & 0xFFF;
            }
            if (var16 > 0 && class145.field2251[var14][var16 - 1] == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class240.field3899[var15] = var14;
                class263.field4456[var15] = var16 - 1;
                class145.field2251[var14][var16 - 1] = 1;
                class22.field276[var14][var16 - 1] = var20;
                var15 = var15 + 1 & 0xFFF;
            }
            if (var16 < 103 && class145.field2251[var14][var16 + 1] == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class240.field3899[var15] = var14;
                class263.field4456[var15] = var16 + 1;
                var15 = var15 + 1 & 0xFFF;
                class145.field2251[var14][var16 + 1] = 4;
                class22.field276[var14][var16 + 1] = var20;
            }
            if (var14 > 0 && var16 > 0 && class145.field2251[var14 - 1][var16 - 1] == 0 && (var19[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class240.field3899[var15] = var14 - 1;
                class263.field4456[var15] = var16 - 1;
                class145.field2251[var14 - 1][var16 - 1] = 3;
                class22.field276[var14 - 1][var16 - 1] = var20;
                var15 = var15 + 1 & 0xFFF;
            }
            if (var14 < 103 && var16 > 0 && class145.field2251[var14 + 1][var16 - 1] == 0 && (var19[var14 + 1][var16 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class240.field3899[var15] = var14 + 1;
                class263.field4456[var15] = var16 - 1;
                class145.field2251[var14 + 1][var16 - 1] = 9;
                var15 = var15 + 1 & 0xFFF;
                class22.field276[var14 + 1][var16 - 1] = var20;
            }
            if (var14 > 0 && var16 < 103 && class145.field2251[var14 - 1][var16 + 1] == 0 && (var19[var14 - 1][var16 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class240.field3899[var15] = var14 - 1;
                class263.field4456[var15] = var16 + 1;
                var15 = var15 + 1 & 0xFFF;
                class145.field2251[var14 - 1][var16 + 1] = 6;
                class22.field276[var14 - 1][var16 + 1] = var20;
            }
            if (var14 < 103 && var16 < 103 && class145.field2251[var14 + 1][var16 + 1] == 0 && (var19[var14 + 1][var16 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class240.field3899[var15] = var14 + 1;
                class263.field4456[var15] = var16 + 1;
                class145.field2251[var14 + 1][var16 + 1] = 12;
                class22.field276[var14 + 1][var16 + 1] = var20;
                var15 = var15 + 1 & 0xFFF;
            }
        }
        class8.field104 = 0;
        if (!var18) {
            if (!arg10) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg2 - var22; var24 <= (arg2 + var22); var24++) {
                for (int var25 = arg1 - var22; var25 <= (arg1 + var22); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class22.field276[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg2) {
                            var26 = arg2 - var24;
                        } else if (var24 > (arg2 + arg6 - 1)) {
                            var26 = var24 - arg6 - (arg2 - 1);
                        }
                        int var27 = 0;
                        if (var25 < arg1) {
                            var27 = arg1 - var25;
                        } else if (var25 > (arg1 + arg9 - 1)) {
                            var27 = var25 + 1 - arg9 - arg1;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && class22.field276[var24][var25] < var23) {
                            var23 = class22.field276[var24][var25];
                            var16 = var25;
                            var21 = var28;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg11 == var14 && arg5 == var16) {
                return false;
            }
            class8.field104 = 1;
        }
        byte var29 = 0;
        class240.field3899[var29] = var14;
        int var32 = var29 + 1;
        class263.field4456[var29] = var16;
        int var30;
        int var31 = var30 = class145.field2251[var14][var16];
        while (arg11 != var14 || arg5 != var16) {
            if (var30 != var31) {
                class240.field3899[var32] = var14;
                class263.field4456[var32++] = var16;
                var30 = var31;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class145.field2251[var14][var16];
        }
        if (var32 > 0) {
            class138.method952((byte) 49, var32, arg8);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILuf;)Lla;", line = 437)
    public static final class175 method1021(int arg0, class168 arg1) {
        field2292++;
        for (class175 var2 = (class175) class140.field2163.method442(65293); var2 != null; var2 = (class175) class140.field2163.method440(3)) {
            if (var2.field2826.method1170(arg1, (byte) -68)) {
                return var2;
            }
        }
        if (arg0 <= 19) {
            method1019(-126, (String) null);
        }
        return null;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 466)
    public class148() {
        this.field2289 = 0;
        this.field2282 = -60;
        this.field2287 = 0.69921875F;
        this.field2283 = -50;
        this.field2291 = 1.2F;
        this.field2294 = 1.1523438F;
        this.field2295 = class34.field390;
        this.field2286 = -50;
        this.field2279 = class34.field396;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lj;)V", line = 481)
    public class148(class153 arg0) {
        int var2 = arg0.method1042((byte) -36);
        if ((var2 & 0x1) == 0) {
            this.field2279 = class34.field396;
        } else {
            this.field2279 = arg0.method1089((byte) -14);
        }
        if ((var2 & 0x2) == 0) {
            this.field2294 = 1.1523438F;
        } else {
            this.field2294 = (float) arg0.method1069(103) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2287 = 0.69921875F;
        } else {
            this.field2287 = (float) arg0.method1069(90) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2291 = 1.2F;
        } else {
            this.field2291 = (float) arg0.method1069(87) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2286 = -50;
            this.field2283 = -50;
            this.field2282 = -60;
        } else {
            this.field2286 = arg0.method1081((byte) 126);
            this.field2282 = arg0.method1081((byte) 121);
            this.field2283 = arg0.method1081((byte) 111);
        }
        if ((var2 & 0x20) == 0) {
            this.field2295 = class34.field390;
        } else {
            this.field2295 = arg0.method1089((byte) -14);
        }
        if ((var2 & 0x40) == 0) {
            this.field2289 = 0;
        } else {
            this.field2289 = arg0.method1069(121);
        }
    }
}
