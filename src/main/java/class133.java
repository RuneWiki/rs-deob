import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class133 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    private int field2305 = 0;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    private int field2312 = 0;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    private int field2302 = 128;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    private int field2313 = 128;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public int field2303 = -1;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Z")
    public boolean field2323 = false;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    private int field2317 = 0;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lmh;")
    public static class128 field2308 = class22.method156(122, "hitmarks");

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[S")
    private short[] field2306;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[S")
    private short[] field2310;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[S")
    private short[] field2316;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "[S")
    private short[] field2324;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIJ)Z", line = 10)
    public static final boolean method882(int arg0, int arg1, int arg2, long arg3) {
        class150 var5 = class182.field3184[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2571 != null && var5.field2571.field1264 == arg3) {
            return true;
        } else if (var5.field2565 != null && var5.field2565.field2762 == arg3) {
            return true;
        } else if (var5.field2586 != null && var5.field2586.field1568 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2576; var6++) {
                if (var5.field2575[var6].field89 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 44)
    public static final void method883(int arg0, int arg1) {
        if (arg1 >= -104) {
            field2308 = (class128) null;
        }
        field2319++;
        class229 var2 = class241.method1638(9, 117, arg0);
        var2.method1566((byte) -3);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIZZI)Ldj;", line = 61)
    public static final class314 method884(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field2321++;
        if (arg1 != -23702) {
            field2308 = (class128) null;
        }
        class177 var5 = null;
        if (class313.field5280 != null) {
            var5 = new class177(arg4, class313.field5280, class134.field2328[arg4], 1000000);
        }
        class190.field3306[arg4] = class98.field1697.method286((byte) -101, arg4, class181.field3175, var5);
        if (arg0) {
            class190.field3306[arg4].method44(1338);
        }
        return new class314(class190.field3306[arg4], arg3, arg2);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 100)
    public static final void method885(int arg0) {
        if (arg0 == 5278) {
            field2325++;
            if (class254.field4382 == 5) {
                class254.field4382 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILbg;I)V", line = 115)
    private final void method886(int arg0, class194 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2318 = arg1.method1308(-109);
        } else if (arg0 == 2) {
            this.field2303 = arg1.method1308(-95);
        } else if (arg0 == 4) {
            this.field2302 = arg1.method1308(-87);
        } else if (arg0 == 5) {
            this.field2313 = arg1.method1308(arg2 ^ 0xFFFFA86A);
        } else if (arg0 == 6) {
            this.field2317 = arg1.method1308(arg2 - 22605);
        } else if (arg0 == 7) {
            this.field2312 = arg1.method1325(7627);
        } else if (arg0 == 8) {
            this.field2305 = arg1.method1325(7627);
        } else if (arg0 == 9) {
            this.field2323 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method1325(7627);
            this.field2316 = new short[var4];
            this.field2310 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2316[var5] = (short) arg1.method1308(-99);
                this.field2310[var5] = (short) arg1.method1308(-116);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method1325(7627);
            this.field2324 = new short[var6];
            this.field2306 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2306[var7] = (short) arg1.method1308(arg2 - 22581);
                this.field2324[var7] = (short) arg1.method1308(-20);
            }
        }
        if (arg2 != 22516) {
            this.method887(46, (byte) -60);
        }
        field2320++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)Lja;", line = 209)
    public final class60 method887(int arg0, byte arg1) {
        field2314++;
        class60 var3 = (class60) class156.field2676.method1836((long) this.field2311, 0);
        if (var3 == null) {
            class168 var4 = class168.method1106(class287.field4904, this.field2318, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2316 != null) {
                for (int var5 = 0; var5 < this.field2316.length; var5++) {
                    var4.method1107(this.field2316[var5], this.field2310[var5]);
                }
            }
            if (this.field2306 != null) {
                for (int var6 = 0; var6 < this.field2306.length; var6++) {
                    var4.method1108(this.field2306[var6], this.field2324[var6]);
                }
            }
            var3 = var4.method1105(this.field2312 + 64, 850 - -this.field2305, -30, -50, -30);
            class156.field2676.method1835((byte) -81, (long) this.field2311, var3);
        }
        class60 var7;
        if (this.field2303 == -1 || arg0 == -1) {
            var7 = var3.method212(true, true);
        } else {
            var7 = class167.method1091(78, this.field2303).method11(-101, arg0, var3);
        }
        if (arg1 != 118) {
            return (class60) null;
        }
        if (this.field2302 != 128 || this.field2313 != 128) {
            var7.method213(this.field2302, this.field2313, this.field2302);
        }
        if (this.field2317 != 0) {
            if (this.field2317 == 90) {
                var7.method197();
            }
            if (this.field2317 == 180) {
                var7.method189();
            }
            if (this.field2317 == 270) {
                var7.method192();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLbg;)V", line = 287)
    public final void method888(byte arg0, class194 arg1) {
        if (arg0 != 48) {
            method885(62);
        }
        field2309++;
        while (true) {
            int var3 = arg1.method1325(7627);
            if (var3 == 0) {
                return;
            }
            this.method886(var3, arg1, 22516);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ldj;Ldj;III)Lcj;", line = 312)
    public static final class305 method889(class314 arg0, class314 arg1, int arg2, int arg3, int arg4) {
        field2322++;
        if (class118.method708(-2, arg3, arg1, arg4)) {
            return arg2 == 6 ? class180.method1232((byte) 116, arg0.method2155(arg4, arg3, (byte) 70)) : (class305) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)Z", line = 326)
    public static final boolean method890(boolean arg0, int arg1) {
        field2301++;
        if (class9.field201[arg1]) {
            return true;
        } else if (class194.field3357.method2161(arg1, (byte) -121)) {
            int var2 = class194.field3357.method2146((byte) -76, arg1);
            if (var2 == 0) {
                class9.field201[arg1] = true;
                return true;
            }
            if (class200.field3508[arg1] == null) {
                class200.field3508[arg1] = new class10[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class200.field3508[arg1][var3] == null) {
                    byte[] var4 = class194.field3357.method2155(var3, arg1, (byte) 70);
                    if (var4 != null) {
                        class200.field3508[arg1][var3] = new class10();
                        class200.field3508[arg1][var3].field230 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class200.field3508[arg1][var3].method85(new class194(var4), -65536);
                        } else {
                            class200.field3508[arg1][var3].method83(-1, new class194(var4));
                        }
                    }
                }
            }
            class9.field201[arg1] = true;
            if (arg0) {
                return true;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 394)
    public static void method891(int arg0) {
        field2308 = null;
        int var1 = 38 % ((70 - arg0) / 34);
    }
}
