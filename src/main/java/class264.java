import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class264 extends class332 implements class83 {

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "Z")
    private boolean field3427;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "Z")
    private boolean field3428;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "B")
    private byte field3426;

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "S")
    private short field3437;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "B")
    private byte field3424;

    @OriginalMember(owner = "client!uk", name = "mb", descriptor = "Z")
    private boolean field3449;

    @OriginalMember(owner = "client!uk", name = "fb", descriptor = "Z")
    private boolean field3442;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "Lda;")
    public class395 field3417;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "Lha;")
    private class425 field3429;

    @OriginalMember(owner = "client!uk", name = "hb", descriptor = "Lvg;")
    public static class622 field3444 = new class622(58, 8);

    @OriginalMember(owner = "client!uk", name = "lb", descriptor = "Lkk;")
    public static class238 field3448 = new class238();

    @OriginalMember(owner = "client!uk", name = "qb", descriptor = "[I")
    public static int[] field3453 = new int[5];

    @OriginalMember(owner = "client!uk", name = "ob", descriptor = "I")
    public static int field3451 = 0;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!uk", name = "bb", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!uk", name = "cb", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!uk", name = "db", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!uk", name = "eb", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!uk", name = "gb", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!uk", name = "ib", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!uk", name = "jb", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!uk", name = "kb", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!uk", name = "nb", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!uk", name = "pb", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "Lifa;")
    private class62 field3433;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZILjava/lang/String;)Z", line = 5)
    public static final boolean method1582(int arg0, boolean arg1, int arg2, String arg3) {
        ++field3432;
        if (arg0 >= 2 && ~arg0 >= -37) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = arg2;
            int var7 = arg3.length();
            for (int var8 = 0; var7 > var8; ++var8) {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg1) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && ~var9 >= -91) {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || var9 > 'z') {
                        return false;
                    }
                    var11 = var9 - 'W';
                }
                if (arg0 <= var11) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 - -var11;
                if (~(var10 / arg0) != ~var6) {
                    return false;
                }
                var6 = var10;
                var5 = true;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "(I)Z", line = 76)
    public final boolean method270(int arg0) {
        ++field3440;
        if (arg0 > -42) {
            field3452 = -7;
        }
        return true;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lr;Z)V", line = 87)
    public final void method265(class98 arg0, boolean arg1) {
        ++field3423;
        if (arg1) {
            Object var3 = null;
            class425 var5;
            if (this.field3429 == null && this.field3442) {
                class193 var4 = this.method1585(262144, true, 108, arg0);
                var5 = var4 != null ? var4.field2595 : null;
            } else {
                var5 = this.field3429;
                this.field3429 = null;
            }
            if (var5 != null) {
                class91.method508(var5, super.field7900, super.field7895, super.field7896, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(B)V", line = 116)
    public final void method315(byte arg0) {
        this.field3428 = false;
        ++field3415;
        if (this.field3417 != null) {
            this.field3417.method1017(-65537 & this.field3417.method1027());
        }
        if (arg0 <= 101) {
            this.method264(13);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIZLr;)Z", line = 131)
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        ++field3436;
        class395 var5 = this.method1586(131072, arg3, 0);
        if (var5 != null) {
            class151 var6 = arg3.method682();
            var6.method883(super.field7895, super.field7894, super.field7896);
            return !class384.field5767 ? var5.method1026(arg0, arg1, var6, false) : var5.method1022(arg0, arg1, var6, false, class515.field7222);
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)I", line = 153)
    public final int method271(boolean arg0) {
        if (arg0) {
            method1584((byte) 60, 33);
        }
        ++field3416;
        return this.field3417 != null ? this.field3417.method1007() : 0;
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)I", line = 165)
    public final int method258(int arg0) {
        ++field3447;
        if (arg0 != -1) {
            this.field3428 = true;
        }
        return this.field3417 != null ? this.field3417.method1018() : 0;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Lr;I)V", line = 176)
    public final void method259(class98 arg0, int arg1) {
        ++field3430;
        if (arg1 != 11771) {
            field3452 = -36;
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)Z", line = 189)
    public final boolean method274(int arg0) {
        ++field3425;
        if (arg0 != -1510217528) {
            method1587((byte) 120, 67, 7);
        }
        return this.field3417 != null ? this.field3417.method1024() : false;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lr;Llt;IIIIIZIIZ)V", line = 204)
    public class264(class98 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class129.method918(arg9, false, arg8));
        this.field3427 = arg7;
        super.field7896 = arg6;
        super.field7895 = arg4;
        this.field3428 = arg10;
        this.field3426 = (byte) arg8;
        this.field3437 = (short) arg1.field4224;
        this.field3424 = (byte) arg9;
        this.field3449 = ~arg1.field4250 != -1 && !arg7;
        this.field3442 = arg0.method671() && arg1.field4219 && !this.field3427 && ~class335.field4872.method3786(class62.field996, false) != -1;
        int var12 = 2048;
        if (this.field3428) {
            var12 |= 65536;
        }
        class193 var13 = this.method1585(var12, this.field3442, 101, arg0);
        if (var13 != null) {
            this.field3417 = var13.field2594;
            this.field3429 = var13.field2595;
            if (this.field3428) {
                this.field3417 = this.field3417.method1038((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)V", line = 236)
    public static void method1583(byte arg0) {
        int var1 = -91 % ((arg0 - -9) / 40);
        field3448 = null;
        field3453 = null;
        field3444 = null;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)I", line = 247)
    public final int method277(byte arg0) {
        ++field3441;
        return arg0 != 95 ? 98 : 65535 & this.field3437;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLr;)V", line = 258)
    public final void method273(byte arg0, class98 arg1) {
        ++field3431;
        Object var3 = null;
        class425 var5;
        if (this.field3429 == null && this.field3442) {
            class193 var4 = this.method1585(262144, true, 125, arg1);
            var5 = var4 == null ? null : var4.field2595;
        } else {
            var5 = this.field3429;
            this.field3429 = null;
        }
        int var6 = -32 % ((arg0 - 2) / 56);
        if (var5 != null) {
            class445.method2628(var5, super.field7900, super.field7895, super.field7896, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I", line = 287)
    public final int method264(int arg0) {
        if (arg0 != -5273) {
            return 90;
        } else {
            ++field3420;
            return this.field3426;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)Z", line = 299)
    public final boolean method266(int arg0) {
        if (arg0 != 28107) {
            return false;
        } else {
            ++field3445;
            return this.field3442;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILr;ILcaa;ZII)V", line = 310)
    public final void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 > 24) {
            if (!(arg3 instanceof class264)) {
                if (arg3 instanceof class188) {
                    class188 var8 = (class188) arg3;
                    if (this.field3417 != null && var8.field2534 != null) {
                        this.field3417.method1055(var8.field2534, arg2, arg0, arg6, arg4);
                    }
                }
            } else {
                class264 var9 = (class264) arg3;
                if (this.field3417 != null && var9.field3417 != null) {
                    this.field3417.method1055(var9.field3417, arg2, arg0, arg6, arg4);
                }
            }
            ++field3439;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)V", line = 343)
    public static final void method1584(byte arg0, int arg1) {
        class701.field9962 = arg1;
        ++field3434;
        class692 var2 = class495.field7010;
        synchronized (class495.field7010) {
            if (arg0 >= -120) {
                return;
            }
            class495.field7010.method3890(-1);
        }
        class692 var3 = class449.field6502;
        synchronized (class449.field6502) {
            class449.field6502.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 360)
    public final void method276(int arg0) {
        if (this.field3417 != null) {
            this.field3417.method1016();
        }
        ++field3422;
        if (arg0 < 63) {
            this.field3428 = false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(Z)Z", line = 375)
    public final boolean method309(boolean arg0) {
        ++field3443;
        if (!arg0) {
            this.field3417 = null;
        }
        return this.field3428;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZILr;)Ldg;", line = 396)
    private final class193 method1585(int arg0, boolean arg1, int arg2, class98 arg3) {
        if (arg2 < 78) {
            method1583((byte) -50);
        }
        ++field3435;
        class289 var5 = class60.field965.method2596(0, 65535 & this.field3437);
        class682 var6;
        class682 var7;
        if (!this.field3427) {
            var6 = class262.field3404[super.field7900];
            if (~super.field7900 <= -4) {
                var7 = null;
            } else {
                var7 = class262.field3404[super.field7900 + 1];
            }
        } else {
            var6 = class383.field5753[super.field7900];
            var7 = class262.field3404[0];
        }
        return var5.method1781(this.field3424, var6, 19886, arg0, var7, super.field7894, this.field3426, super.field7896, arg1, arg3, super.field7895);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lr;I)Lhr;", line = 428)
    public final class218 method272(class98 arg0, int arg1) {
        ++field3421;
        if (this.field3417 == null) {
            return null;
        } else if (arg1 != -1) {
            return null;
        } else {
            class151 var3 = arg0.method682();
            var3.method883(super.field7895, super.field7894, super.field7896);
            class218 var4 = null;
            if (this.field3449) {
                var4 = class187.method1237(1, (byte) 68);
            }
            if (!class384.field5767) {
                this.field3417.method1054(var3, var4 != null ? var4.field2902[0] : null, 0);
            } else {
                this.field3417.method1030(var3, var4 != null ? var4.field2902[0] : null, class515.field7222, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(Lr;I)Lifa;", line = 458)
    public final class62 method268(class98 arg0, int arg1) {
        ++field3438;
        if (this.field3433 == null) {
            this.field3433 = class249.method1513(super.field7896, super.field7894, this.method1586(0, arg0, 0), 2, super.field7895);
        }
        if (arg1 != 0) {
            this.field3429 = null;
        }
        return this.field3433;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I", line = 472)
    public final int method263(byte arg0) {
        ++field3446;
        if (arg0 < 10) {
            method1583((byte) 34);
        }
        return this.field3424;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILr;I)Lda;", line = 485)
    private final class395 method1586(int arg0, class98 arg1, int arg2) {
        ++field3419;
        if (this.field3417 != null && arg1.method706(this.field3417.method1027(), arg0) == 0) {
            return this.field3417;
        } else {
            if (arg2 != 0) {
                field3448 = null;
            }
            class193 var4 = this.method1585(arg0, false, 104, arg1);
            return var4 != null ? var4.field2594 : null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BII)Z", line = 505)
    public static final boolean method1587(byte arg0, int arg1, int arg2) {
        ++field3418;
        if (!class5.method20(-1, arg1, arg2)) {
            return false;
        } else if (class174.method1197(arg2, arg1, 18610) | ~(45056 & arg2) != -1 | class97.method606(arg2, -126, arg1)) {
            return true;
        } else {
            if (arg0 != 95) {
                method1582(92, true, -3, (String) null);
            }
            return (class53.method313(118, arg1, arg2) | class582.method3338(arg2, 13419, arg1)) & ~(arg1 & 55) == -1;
        }
    }
}
