import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class176 extends class79 implements class113 {

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Z")
    private boolean field2418;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Z")
    private boolean field2423;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "B")
    private byte field2419;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "S")
    private short field2407;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Z")
    private boolean field2412;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "B")
    private byte field2428;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "Z")
    private boolean field2427;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "Lss;")
    private class283 field2402;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "Lva;")
    private class327 field2436;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field2413 = 0;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field2425 = 12;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "J")
    public static long field2431 = 0L;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Lgn;")
    public static class475 field2415 = new class475(19, 3);

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field2435 = 0;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Leq;Z)V", line = 4)
    public final void method360(class134 arg0, boolean arg1) {
        ++field2406;
        Object var3 = null;
        class283 var5;
        if (this.field2402 == null && this.field2427) {
            class107 var4 = this.method1101(arg0, true, (byte) -116, 262144);
            var5 = var4 != null ? var4.field1436 : null;
        } else {
            var5 = this.field2402;
            this.field2402 = null;
        }
        if (var5 != null) {
            class458.method2666(var5, this.field2428, super.field1111, super.field1106, (boolean[]) null);
        }
        if (!arg1) {
            this.method723(-100);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I", line = 33)
    public final int method369(byte arg0) {
        ++field2429;
        if (arg0 <= 24) {
            this.field2412 = false;
        }
        return 65535 & this.field2407;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Z", line = 44)
    public final boolean method723(int arg0) {
        ++field2416;
        if (arg0 != 17774) {
            field2431 = -121L;
        }
        return this.field2412;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLeq;)V", line = 57)
    public final void method372(byte arg0, class134 arg1) {
        ++field2417;
        if (arg0 >= -49) {
            this.method359(53);
        }
        Object var3 = null;
        class283 var5;
        if (this.field2402 == null && this.field2427) {
            class107 var4 = this.method1101(arg1, true, (byte) -123, 262144);
            var5 = var4 != null ? var4.field1436 : null;
        } else {
            var5 = this.field2402;
            this.field2402 = null;
        }
        if (var5 != null) {
            class484.method2821(var5, this.field2428, super.field1111, super.field1106, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILmd;)V", line = 87)
    public static final void method1099(int arg0, class364 arg1) {
        arg1.method2217((byte) 123);
        ++field2430;
        int var2 = class156.field2047;
        if (arg0 != 262144) {
            field2413 = 105;
        }
        class313 var3 = class415.field6145 = class262.field3742[var2] = new class313();
        var3.field4262 = var2;
        int var4 = arg1.method2229(30, -1);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 16383;
        int var7 = 16383 & var4;
        var3.field4279[0] = -class455.field6637 + var6;
        var3.field2959 = (var3.field4279[0] << 7) + (var3.method1773(arg0 + -262158) << 6);
        var3.field4282[0] = var7 - class223.field3158;
        var3.field2966 = (var3.field4282[0] << 7) - -(var3.method1773(arg0 ^ -262264) << 6);
        class355.field5121 = var3.field2956 = var5;
        if (class290.field4144[var2] != null) {
            var3.method1880(class290.field4144[var2], (byte) 99);
        }
        class276.field3953 = 0;
        class330.field4790[class276.field3953++] = var2;
        class58.field903[var2] = 0;
        class141.field1849 = 0;
        for (int var8 = 1; ~var8 > -2049; ++var8) {
            if (~var2 != ~var8) {
                int var9 = arg1.method2229(18, arg0 + -262145);
                int var10 = var9 >> 16;
                int var11 = (var9 & 65488) >> 8;
                int var12 = var9 & 255;
                class223 var13 = class135.field1726[var8] = new class223();
                var13.field3154 = (var11 << 14) + (var10 << 28) + var12;
                var13.field3148 = -1;
                var13.field3153 = 0;
                var13.field3147 = false;
                class363.field5463[class141.field1849++] = var8;
                class58.field903[var8] = 0;
            }
        }
        arg1.method2227(arg0 ^ 262152);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 158)
    public final void method368(int arg0) {
        ++field2432;
        if (this.field2436 != null) {
            this.field2436.method167();
        }
        if (arg0 != 5894) {
            field2413 = 90;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Leq;Lhn;IIIIZIZ)V", line = 177)
    public class176(class134 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field7109, arg1.field7083);
        this.field2418 = arg1.field7041 != 0 && !arg6;
        super.field1106 = arg5;
        super.field1111 = arg3;
        this.field2423 = arg6;
        this.field2419 = (byte) arg7;
        this.field2407 = (short) arg1.field7046;
        this.field2412 = arg8;
        this.field2428 = (byte) arg2;
        this.field2427 = arg0.method761() && arg1.field7091 && !this.field2423 && ~class118.field1533.field6901 != -1;
        int var10 = 2048;
        if (this.field2412) {
            var10 |= 65536;
        }
        class107 var11 = this.method1101(arg0, this.field2427, (byte) -122, var10);
        if (var11 != null) {
            this.field2402 = var11.field1436;
            this.field2436 = var11.field1435;
            if (this.field2412) {
                this.field2436 = this.field2436.method194((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILeq;)Lva;", line = 211)
    private final class327 method1100(int arg0, int arg1, class134 arg2) {
        if (arg1 <= 42) {
            return null;
        } else {
            ++field2424;
            if (this.field2436 != null && ~arg2.method819(this.field2436.method200(), arg0) == -1) {
                return this.field2436;
            } else {
                class107 var4 = this.method1101(arg2, false, (byte) -127, arg0);
                return var4 == null ? null : var4.field1435;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I", line = 232)
    public final int method362(byte arg0) {
        ++field2403;
        return arg0 != -72 ? -72 : 22;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Leq;ZBI)Luq;", line = 247)
    private final class107 method1101(class134 arg0, boolean arg1, byte arg2, int arg3) {
        ++field2405;
        class486 var5 = class114.field1471.method2132((byte) 125, 65535 & this.field2407);
        class441 var6;
        class441 var7;
        if (this.field2423) {
            var6 = class459.field6685[0];
            var7 = class178.field2562[this.field2428];
        } else {
            var7 = class459.field6685[this.field2428];
            if (this.field2428 < 3) {
                var6 = class459.field6685[this.field2428 + 1];
            } else {
                var6 = null;
            }
        }
        return arg2 >= -113 ? null : var5.method2836(var6, var7, super.field1111, super.field1106, arg3, super.field1107, 22, arg1, this.field2419, arg0, (byte) 115);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILbp;IZLeq;)V", line = 279)
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        if (arg3 instanceof class176) {
            class176 var8 = (class176) arg3;
            if (this.field2436 != null && var8.field2436 != null) {
                this.field2436.method159(var8.field2436, arg4, arg1, arg0, arg5);
            }
        }
        if (arg2 != -1) {
            this.method368(9);
        }
        ++field2434;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 299)
    public final void method722(int arg0) {
        this.field2412 = false;
        if (arg0 != 0) {
            method1104((byte) 108, -93);
        }
        ++field2414;
        if (this.field2436 != null) {
            this.field2436.method197(-65537 & this.field2436.method200());
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILae;)Llk;", line = 313)
    public static final class397 method1102(int arg0, class156 arg1) {
        arg1.method941((byte) 123);
        if (arg0 <= 97) {
            field2435 = 81;
        }
        ++field2426;
        int var2 = arg1.method941((byte) 124);
        class397 var3 = class6.method47((byte) -55, var2);
        var3.field5846 = arg1.method941((byte) 124);
        int var4 = arg1.method941((byte) 123);
        for (int var5 = 0; var4 > var5; ++var5) {
            int var6 = arg1.method941((byte) 123);
            var3.method27(var6, (byte) 80, arg1);
        }
        var3.method24(255);
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V", line = 349)
    public static final void method1103(int arg0) {
        ++field2422;
        for (int var1 = arg0; var1 < 100; ++var1) {
            class61.field909[var1] = true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILeq;Z)Lva;", line = 366)
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        ++field2408;
        if (!arg2) {
            this.field2407 = -74;
        }
        return this.method1100(arg0, 47, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I", line = 377)
    public final int method359(int arg0) {
        if (arg0 != 13228) {
            return 69;
        } else {
            ++field2433;
            return this.field2419;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)I", line = 389)
    public static final int method1104(byte arg0, int arg1) {
        if (arg0 != 15) {
            return 52;
        } else {
            ++field2411;
            return arg1 & 127;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILeq;BI)Z", line = 402)
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        ++field2421;
        class327 var5 = this.method1100(131072, 58, arg1);
        if (var5 != null) {
            class33 var6 = arg1.method830();
            var6.method278(super.field1111, super.field1107, super.field1106);
            return var5.method184(arg0, arg3, var6, false);
        } else {
            int var7 = -26 % ((-23 - arg2) / 38);
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Leq;I)V", line = 424)
    public final void method361(class134 arg0, int arg1) {
        if (arg1 != -1) {
            this.method361((class134) null, -108);
        }
        ++field2404;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)Z", line = 445)
    public final boolean method371(boolean arg0) {
        if (arg0) {
            method1103(-107);
        }
        ++field2420;
        return this.field2427;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Leq;Z)Lgl;", line = 457)
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field2410;
        if (this.field2436 == null) {
            return null;
        } else {
            class33 var3 = arg0.method830();
            var3.method278(super.field1111, super.field1107, super.field1106);
            if (arg1) {
                this.field2412 = false;
            }
            class408 var4 = null;
            if (this.field2418) {
                var4 = class118.method675(-127, 1);
            }
            this.field2436.method191(var3, var4 == null ? null : var4.field5983[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JIBI)V", line = 483)
    public static final void method1105(long arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 40) {
            field2415 = null;
        }
        ++field2409;
        int var5 = ((int) arg0 & 511546) >> 14;
        int var6 = (int) arg0 >> 20 & 3;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && ~var5 != -12 && var5 != 22) {
            class230.method1404(true, true, arg3, var6, arg1, 0, 0, 0, var5);
        } else {
            class486 var8 = class114.field1471.method2132((byte) 127, var7);
            int var9;
            int var10;
            if (var6 != 0 && var6 != 2) {
                var9 = var8.field7096;
                var10 = var8.field7036;
            } else {
                var9 = var8.field7036;
                var10 = var8.field7096;
            }
            int var11 = var8.field7031;
            if (~var6 != -1) {
                var11 = (var11 << var6 & 15) - -(var11 >> -var6 + 4);
            }
            class230.method1404(true, true, arg3, 0, arg1, var10, var11, var9, 0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V", line = 527)
    public static void method1106(int arg0) {
        if (arg0 == 127) {
            field2415 = null;
        }
    }
}
