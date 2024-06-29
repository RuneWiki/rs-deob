import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class235 {

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    private int field3269 = 0;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    private int field3264 = 128;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    private int field3270 = 128;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Z")
    public boolean field3272 = false;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public int field3271 = -1;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Z")
    public boolean field3263 = false;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    private int field3275 = 0;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    private int field3284 = 0;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3279 = "wave:";

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field3283 = 0;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Luc;")
    public static class51 field3278 = new class51(4);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    private int field3282;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Ltm;")
    public static class20 field3280;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[S")
    private short[] field3266;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[S")
    private short[] field3267;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[S")
    private short[] field3268;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "[S")
    private short[] field3273;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 12)
    public static void method1523(byte arg0) {
        field3278 = null;
        if (arg0 != 0) {
            method1523((byte) -73);
        }
        field3280 = null;
        field3279 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILtj;II)Lqb;", line = 25)
    public final class257 method1524(int arg0, int arg1, int arg2, class298 arg3, int arg4, int arg5) {
        if (arg2 < 4) {
            return null;
        }
        field3281++;
        int var7 = arg1;
        class233 var8 = this.field3271 == -1 || arg5 == -1 ? null : class73.method597(this.field3271, -1);
        if (var8 != null) {
            var7 = arg1 | var8.method1517(false, arg5, (byte) 104, arg0);
        }
        if (this.field3264 != 128) {
            var7 |= 0x2;
        }
        if (this.field3270 != 128 || this.field3269 != 0) {
            var7 |= 0x5;
        }
        class51 var9 = class295.field4442;
        class257 var10;
        synchronized (class295.field4442) {
            var10 = (class257) class295.field4442.method378((byte) 28, (long) (this.field3265 |= arg3.field4492 << 29));
        }
        if (var10 == null || arg3.method465(var10.method1690(), var7) != 0) {
            if (var10 != null) {
                var7 = arg3.method436(var7, var10.method1690());
            }
            int var11 = var7;
            if (this.field3266 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field3273 != null) {
                var11 |= 0x4000;
            }
            class9 var12 = class393.method2524(class188.field2574, 0, this.field3282, (byte) -40);
            if (var12 == null) {
                return null;
            }
            var10 = arg3.method468(var12, var11, class160.field2093, this.field3284 + 64, this.field3275 - -850);
            if (this.field3266 != null) {
                for (int var13 = 0; var13 < this.field3266.length; var13++) {
                    var10.method1665(this.field3266[var13], this.field3268[var13]);
                }
            }
            if (this.field3273 != null) {
                for (int var14 = 0; var14 < this.field3273.length; var14++) {
                    var10.method1689(this.field3273[var14], this.field3267[var14]);
                }
            }
            var10.method1662(var7);
            class51 var15 = class295.field4442;
            synchronized (class295.field4442) {
                class295.field4442.method367((long) (this.field3265 |= arg3.field4492 << 29), var10, true);
            }
        }
        class257 var16 = var10.method1676((byte) 2, var7, true);
        if (var8 != null) {
            var16 = var8.method1513((byte) 2, 125, var7, 0, arg5, arg0, arg4, var16);
        }
        if (this.field3270 != 128 || this.field3264 != 128) {
            var16.method1658(this.field3270, this.field3264, this.field3270);
        }
        if (this.field3269 != 0) {
            if (this.field3269 == 90) {
                var16.method1673(4096);
            }
            if (this.field3269 == 180) {
                var16.method1673(8192);
            }
            if (this.field3269 == 270) {
                var16.method1673(12288);
            }
        }
        var16.method1662(arg1);
        return var16;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLfb;I)V", line = 147)
    private final void method1525(boolean arg0, class341 arg1, int arg2) {
        if (arg0) {
            return;
        }
        if (arg2 == 1) {
            this.field3282 = arg1.method2239(-1076227960);
        } else if (arg2 == 2) {
            this.field3271 = arg1.method2239(-1076227960);
        } else if (arg2 == 4) {
            this.field3270 = arg1.method2239(-1076227960);
        } else if (arg2 == 5) {
            this.field3264 = arg1.method2239(-1076227960);
        } else if (arg2 == 6) {
            this.field3269 = arg1.method2239(-1076227960);
        } else if (arg2 == 7) {
            this.field3284 = arg1.method2233((byte) 104);
        } else if (arg2 == 8) {
            this.field3275 = arg1.method2233((byte) 104);
        } else if (arg2 == 9) {
            this.field3272 = true;
        } else if (arg2 == 10) {
            this.field3263 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method2233((byte) 104);
            this.field3268 = new short[var4];
            this.field3266 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3266[var5] = (short) arg1.method2239(-1076227960);
                this.field3268[var5] = (short) arg1.method2239(-1076227960);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method2233((byte) 104);
            this.field3273 = new short[var6];
            this.field3267 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3273[var7] = (short) arg1.method2239(-1076227960);
                this.field3267[var7] = (short) arg1.method2239(-1076227960);
            }
        }
        field3277++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Llq;", line = 236)
    public static final class236 method1526(int arg0, int arg1, int arg2) {
        class77 var3 = class106.field1405[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1063;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILfb;)V", line = 244)
    public final void method1527(int arg0, class341 arg1) {
        while (true) {
            int var3 = arg1.method2233((byte) 104);
            if (var3 == 0) {
                int var4 = 38 % ((arg0 - 36) / 59);
                field3274++;
                return;
            }
            this.method1525(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILrr;Lrr;BZ)I", line = 266)
    public static final int method1528(int arg0, class184 arg1, class184 arg2, byte arg3, boolean arg4) {
        field3276++;
        if (arg0 == 1) {
            int var5 = arg1.field5945;
            int var6 = arg2.field5945;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 >= -122) {
            return 63;
        } else if (arg0 == 2) {
            return class387.method2510(-125, arg2.method1197(-1).field4792, class387.field5669, arg1.method1197(-1).field4792);
        } else if (arg0 == 3) {
            if (arg1.field2474.equals("-")) {
                if (arg2.field2474.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field2474.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class387.method2510(-105, arg2.field2474, class387.field5669, arg1.field2474);
            }
        } else if (arg0 == 4) {
            if (arg1.method2587(111)) {
                return arg2.method2587(118) ? 0 : 1;
            } else if (arg2.method2587(118)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg1.method2586((byte) -70)) {
                return arg2.method2586((byte) -108) ? 0 : 1;
            } else if (arg2.method2586((byte) -90)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg1.method2589((byte) -38)) {
                return arg2.method2589((byte) -38) ? 0 : 1;
            } else if (arg2.method2589((byte) -38)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 7) {
            if (arg1.method2588(90)) {
                return arg2.method2588(43) ? 0 : 1;
            } else if (arg2.method2588(59)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 8) {
            int var7 = arg1.field2466;
            int var8 = arg2.field2466;
            if (arg4) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg1.field2478 - arg2.field2478;
        }
    }
}
