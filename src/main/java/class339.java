import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class339 extends class311 implements class232 {

    @OriginalMember(owner = "client!ew", name = "t", descriptor = "S")
    private short field5161;

    @OriginalMember(owner = "client!ew", name = "F", descriptor = "B")
    private byte field5173;

    @OriginalMember(owner = "client!ew", name = "N", descriptor = "Z")
    private boolean field5180;

    @OriginalMember(owner = "client!ew", name = "P", descriptor = "Z")
    private boolean field5182;

    @OriginalMember(owner = "client!ew", name = "G", descriptor = "Z")
    private boolean field5174;

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "B")
    private byte field5165;

    @OriginalMember(owner = "client!ew", name = "Y", descriptor = "Z")
    private boolean field5191;

    @OriginalMember(owner = "client!ew", name = "J", descriptor = "Lc;")
    private class121 field5177;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "Lj;")
    private class377 field5167;

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "Z")
    public static boolean field5160 = false;

    @OriginalMember(owner = "client!ew", name = "U", descriptor = "[I")
    public static int[] field5187 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ew", name = "Q", descriptor = "Lko;")
    public static class348 field5183 = new class348();

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!ew", name = "v", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!ew", name = "C", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!ew", name = "D", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!ew", name = "E", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!ew", name = "H", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!ew", name = "I", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!ew", name = "L", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!ew", name = "M", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!ew", name = "O", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ew", name = "R", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!ew", name = "S", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!ew", name = "T", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!ew", name = "V", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!ew", name = "W", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!ew", name = "X", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ew", name = "A", descriptor = "Ljava/lang/Object;")
    public static Object field5168;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "(I)V", line = 7)
    public static void method2214(int arg0) {
        field5168 = null;
        if (arg0 != -29303) {
            method2215(95, (String) null);
        }
        field5187 = null;
        field5183 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Z", line = 25)
    public final boolean method377(int arg0) {
        if (arg0 >= -27) {
            this.field5161 = 97;
        }
        ++field5172;
        return this.field5191;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lqa;I)V", line = 41)
    public final void method374(class162 arg0, int arg1) {
        if (arg1 != 28339) {
            method2214(-9);
        }
        ++field5166;
        Object var3 = null;
        class377 var5;
        if (this.field5167 == null && this.field5191) {
            class505 var4 = this.method2216(true, 262144, (byte) 122, arg0);
            var5 = var4 == null ? null : var4.field7405;
        } else {
            var5 = this.field5167;
            this.field5167 = null;
        }
        if (var5 != null) {
            class393.method2457(var5, this.field5173, super.field4456, super.field4457, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIILqa;)Z", line = 68)
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        ++field5171;
        class121 var5 = this.method2219(arg3, (byte) -59, 131072);
        if (var5 != null) {
            class413 var6 = arg3.method439();
            var6.method1008(super.field4456, super.field4451, super.field4457);
            return var5.method909(arg2, arg0, var6, false);
        } else {
            return arg1 != -1 ? false : false;
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lqa;Lbo;IIIIZIZ)V", line = 93)
    public class339(class162 arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field7534, arg1.field7493);
        this.field5161 = (short) arg1.field7483;
        this.field5173 = (byte) arg2;
        this.field5180 = arg6;
        super.field4457 = arg5;
        this.field5182 = arg8;
        super.field4456 = arg3;
        this.field5174 = ~arg1.field7491 != -1 && !arg6;
        this.field5165 = (byte) arg7;
        this.field5191 = arg0.method481() && arg1.field7489 && !this.field5180 && ~class397.field5830.method56((byte) -122, class399.field5865) != -1;
        int var10 = 2048;
        if (this.field5182) {
            var10 |= 65536;
        }
        class505 var11 = this.method2216(this.field5191, var10, (byte) 120, arg0);
        if (var11 != null) {
            this.field5177 = var11.field7408;
            this.field5167 = var11.field7405;
            if (this.field5182) {
                this.field5177 = this.field5177.method881((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(Lqa;I)V", line = 125)
    public final void method373(class162 arg0, int arg1) {
        ++field5175;
        if (arg1 != -2304) {
            this.field5174 = true;
        }
        Object var3 = null;
        class377 var5;
        if (this.field5167 == null && this.field5191) {
            class505 var4 = this.method2216(true, 262144, (byte) 125, arg0);
            var5 = var4 == null ? null : var4.field7405;
        } else {
            var5 = this.field5167;
            this.field5167 = null;
        }
        if (var5 != null) {
            class434.method2623(var5, this.field5173, super.field4456, super.field4457, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(Lqa;I)V", line = 153)
    public final void method126(class162 arg0, int arg1) {
        if (arg1 >= -43) {
            this.field5177 = null;
        }
        ++field5185;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILjava/lang/String;)V", line = 163)
    public static final void method2215(int arg0, String arg1) {
        ++field5188;
        if (arg1 != null) {
            if (arg0 == 1) {
                if (arg1.startsWith("*")) {
                    arg1 = arg1.substring(1);
                }
                String var2 = class343.method2237(arg1, (byte) -57);
                if (var2 != null) {
                    for (int var3 = 0; ~class424.field6218 < ~var3; ++var3) {
                        String var4 = class469.field6908[var3];
                        if (var4.startsWith("*")) {
                            var4 = var4.substring(1);
                        }
                        String var5 = class343.method2237(var4, (byte) -57);
                        if (var5 != null && var5.equals(var2)) {
                            --class424.field6218;
                            for (int var6 = var3; class424.field6218 > var6; ++var6) {
                                class469.field6908[var6] = class469.field6908[var6 + 1];
                                class332.field5102[var6] = class332.field5102[var6 + 1];
                                class222.field3219[var6] = class222.field3219[var6 + 1];
                                class227.field3331[var6] = class227.field3331[var6 + 1];
                                class410.field6043[var6] = class410.field6043[var6 - -1];
                                class56.field816[var6] = class56.field816[var6 + 1];
                            }
                            ++class333.field5112;
                            class92.field1521 = class285.field4130;
                            class114.method841(false, class456.field6741);
                            class86.field1436.method1923((byte) 62, class8.method57(-128, arg1));
                            class86.field1436.method1882((byte) 26, arg1);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)I", line = 228)
    public final int method375(int arg0) {
        if (arg0 != -13015) {
            return 37;
        } else {
            ++field5164;
            return this.field5165;
        }
    }

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)V", line = 239)
    public final void method117(int arg0) {
        if (arg0 <= -127) {
            ++field5176;
            this.field5182 = false;
            if (this.field5177 != null) {
                this.field5177.method894(this.field5177.method915() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZIBLqa;)Lrl;", line = 254)
    private final class505 method2216(boolean arg0, int arg1, byte arg2, class162 arg3) {
        ++field5179;
        if (arg2 <= 119) {
            this.method121(-47);
        }
        class510 var5 = class246.field3567.method609(107, 65535 & this.field5161);
        class35 var6;
        class35 var7;
        if (!this.field5180) {
            var6 = class145.field2135[this.field5173];
            if (this.field5173 < 3) {
                var7 = class145.field2135[this.field5173 + 1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class62.field1063[this.field5173];
            var7 = class145.field2135[0];
        }
        return var5.method3016(arg3, var7, super.field4451, 22, super.field4456, this.field5165, arg0, (byte) -121, super.field4457, arg1, var6);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IZIIIZFI)[I", line = 288)
    public static final int[] method2217(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, float arg6, int arg7) {
        ++field5163;
        int[] var8 = new int[arg0];
        class371 var9 = new class371();
        var9.field5554 = arg4;
        var9.field5556 = arg1;
        var9.field5559 = arg7;
        var9.field5551 = (int) (arg6 * 4096.0F);
        var9.field5548 = arg3;
        var9.field5558 = arg2;
        var9.method771(arg5);
        class367.method2363(arg0, arg5, 1);
        var9.method2376(-111, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILqa;IZLha;I)V", line = 311)
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        ++field5181;
        if (arg5 instanceof class339) {
            class339 var8 = (class339) arg5;
            if (this.field5177 != null && var8.field5177 != null) {
                this.field5177.method907(var8.field5177, arg1, arg0, arg6, arg4);
            }
        }
        if (arg3 <= 5) {
            field5183 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILqa;)Lc;", line = 333)
    public final class121 method381(int arg0, int arg1, class162 arg2) {
        if (arg0 != 1584) {
            return null;
        } else {
            ++field5189;
            return this.method2219(arg2, (byte) -71, arg1);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)I", line = 345)
    public final int method379(byte arg0) {
        ++field5190;
        return arg0 != -96 ? 76 : 65535 & this.field5161;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILir;)V", line = 359)
    public static final void method2218(int arg0, class22 arg1) {
        if (!(arg1 instanceof class13)) {
            if (arg1 instanceof class62) {
                class62 var2 = (class62) arg1;
                class42.method323((byte) 127, class95.field1558.field5538 != var2.field5538, var2);
            }
        } else {
            class13 var3 = (class13) arg1;
            if (var3.field210 != null) {
                class268.method1714(~class95.field1558.field5538 != ~var3.field5538, -30, var3);
            }
        }
        ++field5169;
        int var4 = -87 / ((arg0 - -44) / 59);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lqa;BI)Lc;", line = 389)
    private final class121 method2219(class162 arg0, byte arg1, int arg2) {
        ++field5170;
        if (arg1 > -56) {
            return null;
        } else if (this.field5177 != null && ~arg0.method518(this.field5177.method915(), arg2) == -1) {
            return this.field5177;
        } else {
            class505 var4 = this.method2216(false, arg2, (byte) 125, arg0);
            return var4 != null ? var4.field7408 : null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILqa;)Lbw;", line = 410)
    public final class482 method114(int arg0, class162 arg1) {
        ++field5178;
        if (this.field5177 == null) {
            return null;
        } else {
            class413 var3 = arg1.method439();
            var3.method1008(super.field4456, super.field4451, super.field4457);
            class482 var4 = null;
            if (this.field5174) {
                var4 = class410.method2537((byte) -101, 1);
            }
            this.field5177.method910(var3, var4 != null ? var4.field7079[0] : null, 0);
            if (arg0 != -6796) {
                this.method380(true);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V", line = 441)
    public final void method376(int arg0) {
        if (this.field5177 != null) {
            this.field5177.method891();
        }
        if (arg0 != 16931) {
            this.method114(-6, (class162) null);
        }
        ++field5186;
    }

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "(I)Z", line = 456)
    public final boolean method121(int arg0) {
        if (arg0 != 26923) {
            this.field5177 = null;
        }
        ++field5184;
        return this.field5182;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)I", line = 467)
    public final int method380(boolean arg0) {
        ++field5162;
        return !arg0 ? 36 : 22;
    }
}
