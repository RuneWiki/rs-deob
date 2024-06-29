import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class214 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    private int field3328 = 0;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    private int field3336 = 128;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    private int field3327 = 0;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    private int field3342 = 128;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "Z")
    public boolean field3343 = false;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public int field3338 = -1;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "Z")
    public boolean field3346 = false;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    private int field3345 = 0;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Lke;")
    public static class106 field3335 = new class106(64);

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "[Z")
    public static boolean[] field3349 = new boolean[200];

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "Laj;")
    public static class1 field3347;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[S")
    private short[] field3330;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "[S")
    private short[] field3332;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[S")
    private short[] field3333;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "[S")
    private short[] field3340;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLim;)V")
    public final void method1495(byte arg0, class170 arg1) {
        while (true) {
            int var3 = arg1.method1218(-121);
            if (var3 == 0) {
                field3344++;
                if (arg0 != 31) {
                    this.field3338 = -58;
                    return;
                }
                return;
            }
            this.method1499(var3, arg1, -110);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lva;Lki;IBI)V")
    public static final void method1496(class138 arg0, class152 arg1, int arg2, byte arg3, int arg4) {
        field3329++;
        if (arg1.field2249 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg1.field2249.length];
            for (int var7 = 0; var7 < var6.length / 2; var7++) {
                int var9 = arg0.field1986 - arg1.field2249[var7 * 2 + 1];
                int var10 = arg1.field2249[var7 * 2] + arg0.field1996;
                int var11 = var6[var7 * 2] = (class207.field3249 - class207.field3260) * (var10 - class207.field3252) / (class207.field3250 - class207.field3252) + class207.field3260;
                int var12 = var6[var7 * 2 + 1] = (class207.field3257 - class207.field3259) * (var9 - class207.field3248) / (class207.field3251 - class207.field3248) + class207.field3259;
                if (class207.field3260 < var11 && class207.field3249 > var11 && class207.field3259 < var12 && class207.field3257 > var12) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class246.method1759(var6, arg1.field2255, arg1.field2255 >>> 24);
            for (int var8 = 0; var8 < (var6.length / 2 - 1); var8++) {
                class151.method1025(var6[var8 * 2], var6[var8 * 2 + 1], var6[(var8 + 1) * 2], var6[(var8 + 1) * 2 + 1], arg1.field2258, arg1.field2258 >>> 24);
            }
            class151.method1025(var6[var6.length - 2], var6[var6.length - 1], var6[0], var6[1], arg1.field2258, arg1.field2258 >>> 24);
        } else if (arg0.field1993) {
            return;
        }
        class68 var13 = new class68(arg0);
        class91 var14 = null;
        if (arg1.field2241 != -1) {
            if (arg0.field1985 && arg1.field2252 != -1) {
                var14 = (class91) arg1.method1052(-28744, true, true);
            } else {
                var14 = (class91) arg1.method1052(-28744, false, true);
            }
            if (var14 != null) {
                if (class99.field1490 > 0 && (class19.field255 != -1 && class19.field255 == arg0.field1987 || class181.field2855 != -1 && class181.field2855 == arg1.field2262)) {
                    int var15;
                    if (class124.field1785 <= 50) {
                        var15 = class124.field1785 * 3;
                    } else {
                        var15 = (100 - class124.field1785) * 3;
                    }
                    class151.method1022(arg0.field1991, arg0.field1989, var14.field2946 / 2 + 7, 16776960, var15);
                    class151.method1022(arg0.field1991, arg0.field1989, var14.field2946 / 2 + 5, 16776960, var15);
                    class151.method1022(arg0.field1991, arg0.field1989, var14.field2946 / 2 + 3, 16776960, var15);
                    class151.method1022(arg0.field1991, arg0.field1989, var14.field2946 / 2 + 1, 16776960, var15);
                    class151.method1022(arg0.field1991, arg0.field1989, var14.field2946 / 2, 16776960, var15);
                }
                var14.method621(arg0.field1991 - (var14.field2946 >> 1), -(var14.field2952 >> 1) + arg0.field1989);
                var13.field1022 = arg0.field1991 + arg2 - (var14.field2946 >> 1);
                var13.field1012 = arg0.field1989 + arg4 - (var14.field2952 >> 1);
                var13.field1007 = (var14.field2952 >> 1) + arg4 + arg0.field1989;
                var13.field1024 = arg0.field1991 + (var14.field2946 >> 1) + arg2;
            }
        }
        if (arg1.field2243 != null) {
            if (var14 == null) {
                class192.method1346(1, true, arg0, arg1, 0, var13, arg2, arg4);
            } else {
                class192.method1346(1, false, arg0, arg1, (var14.field2952 >> 1) + 5, var13, arg2, arg4);
            }
        }
        if (arg3 > -112) {
            return;
        }
        if (var13.method450(class50.field633, -1, class71.field1042) && arg1.field2245 != null) {
            if (arg1.field2245[4] != null) {
                class28.method142(arg1.field2259, 105, arg1.field2245[4], 0, (short) 1008, (long) arg0.field1987, arg1.field2262, -1);
            }
            if (arg1.field2245[3] != null) {
                class28.method142(arg1.field2259, 102, arg1.field2245[3], 0, (short) 1006, (long) arg0.field1987, arg1.field2262, -1);
            }
            if (arg1.field2245[2] != null) {
                class28.method142(arg1.field2259, 71, arg1.field2245[2], 0, (short) 1012, (long) arg0.field1987, arg1.field2262, -1);
            }
            if (arg1.field2245[1] != null) {
                class28.method142(arg1.field2259, -89, arg1.field2245[1], 0, (short) 1010, (long) arg0.field1987, arg1.field2262, -1);
            }
            if (arg1.field2245[0] != null) {
                class28.method142(arg1.field2259, -116, arg1.field2245[0], 0, (short) 1002, (long) arg0.field1987, arg1.field2262, -1);
            }
        }
        class249.field4048.method1540(var13, (byte) -120);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method1497(int arg0) {
        field3347 = null;
        if (arg0 == -1) {
            field3349 = null;
            field3335 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)V")
    public static final void method1498(int arg0, int arg1, byte arg2) {
        field3350++;
        class181 var3 = class95.method652(1, (byte) 34, arg1);
        var3.method1285((byte) 64);
        var3.field2847 = arg0;
        int var4 = -85 / ((arg2 - 24) / 58);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILim;I)V")
    private final void method1499(int arg0, class170 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3341 = arg1.method1186((byte) -58);
        } else if (arg0 == 2) {
            this.field3338 = arg1.method1186((byte) -74);
        } else if (arg0 == 4) {
            this.field3336 = arg1.method1186((byte) -81);
        } else if (arg0 == 5) {
            this.field3342 = arg1.method1186((byte) -105);
        } else if (arg0 == 6) {
            this.field3327 = arg1.method1186((byte) -94);
        } else if (arg0 == 7) {
            this.field3345 = arg1.method1218(120);
        } else if (arg0 == 8) {
            this.field3328 = arg1.method1218(112);
        } else if (arg0 == 9) {
            this.field3343 = true;
        } else if (arg0 == 10) {
            this.field3346 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method1218(117);
            this.field3332 = new short[var4];
            this.field3340 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3332[var5] = (short) arg1.method1186((byte) -107);
                this.field3340[var5] = (short) arg1.method1186((byte) -118);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method1218(67);
            this.field3333 = new short[var6];
            this.field3330 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3333[var7] = (short) arg1.method1186((byte) -35);
                this.field3330[var7] = (short) arg1.method1186((byte) -71);
            }
        }
        field3334++;
        int var8 = 127 % ((arg2 + 25) / 61);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIB)Lli;")
    public final class208 method1500(int arg0, int arg1, int arg2, byte arg3) {
        class208 var5 = (class208) class206.field3233.method1517((long) this.field3348, (byte) 35);
        field3339++;
        if (var5 == null) {
            class141 var6 = class141.method909(class71.field1043, this.field3341, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field3332 != null) {
                for (int var7 = 0; var7 < this.field3332.length; var7++) {
                    var6.method886(this.field3332[var7], this.field3340[var7]);
                }
            }
            if (this.field3333 != null) {
                for (int var8 = 0; var8 < this.field3333.length; var8++) {
                    var6.method898(this.field3333[var8], this.field3330[var8]);
                }
            }
            var5 = var6.method916(this.field3345 + 64, 850 - -this.field3328, -30, -50, -30);
            class206.field3233.method1518(var5, (long) this.field3348, (byte) 75);
        }
        class208 var9;
        if (this.field3338 == -1 || arg1 == -1) {
            var9 = var5.method345(true, true, true);
        } else {
            var9 = class174.method1241(67, this.field3338).method367(arg2, arg0, arg1, 98, var5);
        }
        if (arg3 > -34) {
            this.field3333 = null;
        }
        if (this.field3336 != 128 || this.field3342 != 128) {
            var9.method324(this.field3336, this.field3342, this.field3336);
        }
        if (this.field3327 != 0) {
            if (this.field3327 == 90) {
                var9.method316();
            }
            if (this.field3327 == 180) {
                var9.method341();
            }
            if (this.field3327 == 270) {
                var9.method311();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)Lck;")
    public static final class226 method1501(int arg0, byte arg1) {
        field3331++;
        class226 var2 = (class226) class110.field1595.method707((long) arg0, (byte) 111);
        if (arg1 != -59) {
            field3335 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class139.field1997.method501(-2, arg0, 11);
        class226 var4 = new class226();
        if (var3 != null) {
            var4.method1600(127, new class170(var3));
        }
        class110.field1595.method712(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(CB)Z")
    public static final boolean method1502(char arg0, byte arg1) {
        if (arg1 != 43) {
            method1497(-12);
        }
        field3337++;
        return arg0 >= '0' && arg0 <= '9';
    }
}
