import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class200 {

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    private int field2571 = -32768;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Z")
    private boolean field2575 = false;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    private int field2588 = -1;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
    private boolean field2580 = false;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    private int field2601 = -1;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    private int field2579;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "B")
    private byte field2587;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    private int field2593;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "B")
    private byte field2592;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Z")
    private boolean field2569;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "S")
    public static short field2582 = 256;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field2594 = 104;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    private int field2564;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    private int field2581;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    private int field2589;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    private int field2595;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "Loa;")
    public static class167 field2590;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lvh;")
    public static class191 field2584;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Lj;")
    private class254 field2568;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lwp;")
    public class330 field2572;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "Lhi;")
    private class44 field2600;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lc;")
    private class507 field2567;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "[Z")
    private boolean[] field2591;

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lqa;Ljt;IIIIIIZI)V", line = 641)
    public class200(class129 arg0, class402 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field2597 = arg2;
        this.field2579 = arg7;
        this.field2565 = arg1.field5377;
        this.field2587 = (byte) arg4;
        this.field2585 = arg3;
        this.field2575 = arg8;
        this.field2593 = arg6;
        this.field2592 = (byte) arg5;
        this.field2569 = arg0.method903() && arg1.field5420 && !this.field2575;
        if (arg9 != -1) {
            this.field2580 = true;
        }
        this.method1284((byte) -21, arg9);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILqa;)V", line = 21)
    public final void method1278(int arg0, class129 arg1) {
        if (arg0 != -7278) {
            this.method1281(-16, 117, -18);
        }
        this.method1280(true, this.field2579, this.field2593, 0, 262144, true, arg1);
        field2576++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILqa;ILc;IZIB)V", line = 32)
    public final void method1279(int arg0, class129 arg1, int arg2, class507 arg3, int arg4, boolean arg5, int arg6, byte arg7) {
        field2586++;
        class473[] var9 = arg3.method493();
        if (arg7 < 85) {
            return;
        }
        class165[] var10 = arg3.method476();
        if ((this.field2572 == null || this.field2572.field4234) && (var9 != null || var10 != null)) {
            class402 var11 = class52.field715.method1164(this.field2565, 0);
            if (var11.field5419 != null) {
                var11 = var11.method2393(class198.field2555, (byte) 32);
            }
            if (var11 != null) {
                this.field2572 = new class330(class264.field3353);
            }
        }
        if (this.field2572 == null) {
            return;
        }
        if (arg5) {
            this.field2572.method1966(arg1, (long) class264.field3353, var9, var10, false);
        } else {
            this.field2572.method1964((long) class264.field3353);
        }
        this.field2572.method1974(this.field2587, arg4, arg0, arg6, arg2);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIIIZLqa;)Lc;", line = 70)
    public final class507 method1280(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class129 arg6) {
        field2570++;
        class402 var8 = class52.field715.method1164(this.field2565, arg3);
        if (var8.field5419 != null) {
            var8 = var8.method2393(class198.field2555, (byte) 32);
        }
        if (var8 == null) {
            this.method1282(arg6, (byte) 112);
            this.field2601 = this.field2564;
            this.field2588 = -1;
            return null;
        }
        if (!this.field2580 && this.field2588 != var8.field5377) {
            this.field2567 = null;
            this.method1284((byte) -21, -1);
        }
        this.method1281(arg2, arg3 - 115, arg1);
        boolean var9 = arg5 & this.field2569 & class421.field5647.method3097((byte) 117, class520.field7690) != 0;
        boolean var10 = var9 & (this.field2588 != var8.field5377 || (this.field2601 != this.field2564 || this.field2600 != null && (this.field2600.field655 || class310.field4004) && this.field2595 != this.field2564) && class421.field5647.method3097((byte) 114, class520.field7690) >= 2);
        if (arg0 && !var10) {
            this.field2588 = var8.field5377;
            this.field2601 = this.field2564;
            return null;
        }
        if (var10) {
            class24.method161(this.field2568, this.field2592, this.field2593, this.field2579, this.field2591);
        }
        class251 var11 = class92.field1285[this.field2592];
        class251 var12;
        if (this.field2575) {
            var12 = class405.field5436[0];
        } else {
            var12 = this.field2592 >= 3 ? null : class92.field1285[this.field2592 + 1];
        }
        class507 var13 = null;
        if (this.field2600 != null) {
            if (var10) {
                arg4 |= 0x40000;
            }
            var13 = var8.method2386(this.field2600, this.field2564, this.field2579, this.field2595, this.field2581, var11, var11.method1185(this.field2593, this.field2579), (byte) 108, var12, arg4, arg6, this.field2593, this.field2597 == 11 ? 10 : this.field2597, this.field2597 == 11 ? this.field2585 + 4 : this.field2585);
            if (var13 == null) {
                this.field2571 = 0;
                this.field2568 = null;
                this.field2591 = null;
            } else {
                if (var10) {
                    if (this.field2591 == null) {
                        this.field2591 = new boolean[4];
                    }
                    this.field2568 = var13.method525(this.field2568);
                    class518.method3076(this.field2568, this.field2592, arg2, arg1, this.field2591);
                }
                this.field2571 = var13.method507();
            }
            this.field2567 = null;
        } else if (this.field2567 != null && (this.field2567.method475() & arg4) == arg4 && this.field2588 == var8.field5377) {
            var13 = this.field2567;
        } else {
            if (this.field2567 != null) {
                arg4 |= this.field2567.method475();
            }
            class445 var14 = var8.method2383(this.field2593, (byte) 20, var10, arg4, var12, this.field2597 == 11 ? 10 : this.field2597, var11.method1185(this.field2593, this.field2579), this.field2579, var11, this.field2597 == 11 ? this.field2585 + 4 : this.field2585, arg6);
            if (var14 == null) {
                this.field2591 = null;
                this.field2567 = null;
                this.field2571 = 0;
                this.field2568 = null;
            } else {
                var13 = var14.field6188;
                this.field2567 = var14.field6188;
                if (var10) {
                    this.field2591 = null;
                    this.field2568 = var14.field6182;
                    class518.method3076(this.field2568, this.field2592, arg2, arg1, null);
                }
                this.field2571 = var13.method507();
            }
        }
        this.field2579 = arg1;
        this.field2593 = arg2;
        this.field2588 = var8.field5377;
        this.field2601 = this.field2564;
        return var13;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V", line = 191)
    private final void method1281(int arg0, int arg1, int arg2) {
        field2596++;
        if (arg1 > -113) {
            this.field2567 = null;
        }
        label90: while (true) {
            if (this.field2600 == null) {
                if (this.field2580) {
                    return;
                }
                this.method1284((byte) -21, -1);
                if (this.field2600 == null) {
                    return;
                }
            }
            int var4 = class264.field3353 - this.field2589;
            if (var4 > 100 && this.field2600.field657 > 0) {
                int var5 = this.field2600.field640.length - this.field2600.field657;
                while (this.field2564 < var5 && this.field2600.field647[this.field2564] < var4) {
                    var4 -= this.field2600.field647[this.field2564];
                    this.field2564++;
                }
                if (var5 <= this.field2564) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2600.field640.length; var7++) {
                        var6 += this.field2600.field647[var7];
                    }
                    var4 %= var6;
                }
                this.field2595 = this.field2564 + 1;
                if (this.field2595 >= this.field2600.field640.length) {
                    this.field2595 -= this.field2600.field657;
                    if (this.field2595 < 0 || this.field2595 >= this.field2600.field640.length) {
                        this.field2595 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field2600.field647[this.field2564]) {
                            this.field2589 = class264.field3353 - var4;
                            this.field2581 = var4;
                            return;
                        }
                        class284.method1729(arg0, this.field2564, 96, this.field2587, arg2, this.field2600, false);
                        var4 -= this.field2600.field647[this.field2564];
                        this.field2564++;
                        if (this.field2564 >= this.field2600.field640.length) {
                            this.field2564 -= this.field2600.field657;
                            if (this.field2564 < 0 || this.field2564 >= this.field2600.field640.length) {
                                this.field2600 = null;
                                continue label90;
                            }
                        }
                        this.field2595 = this.field2564 + 1;
                    } while (this.field2595 < this.field2600.field640.length);
                    this.field2595 -= this.field2600.field657;
                } while (this.field2595 >= 0 && this.field2595 < this.field2600.field640.length);
                this.field2595 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lqa;B)V", line = 290)
    public final void method1282(class129 arg0, byte arg1) {
        if (arg1 != 112) {
            field2590 = null;
        }
        field2599++;
        if (this.field2568 != null) {
            class24.method161(this.field2568, this.field2592, this.field2593, this.field2579, this.field2591);
            this.field2568 = null;
            this.field2591 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 317)
    public static final void method1283(byte arg0, String arg1, boolean arg2) {
        field2577++;
        if (arg1 == null) {
            return;
        }
        if (class104.field1424 >= 100) {
            class360.method2120(class318.field4097.method1127(class379.field4920, false), 122);
            return;
        }
        String var3 = class61.method347(arg0 + 31563, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class104.field1424; var4++) {
            String var8 = class61.method347(31608, class271.field3444[var4]);
            if (var8 != null && var8.equals(var3)) {
                class360.method2120(arg1 + class501.field7371.method1127(class379.field4920, false), 77);
                return;
            }
            if (class303.field3925[var4] != null) {
                String var9 = class61.method347(31608, class303.field3925[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class360.method2120(arg1 + class501.field7371.method1127(class379.field4920, false), arg0 + 56);
                    return;
                }
            }
        }
        int var5 = 0;
        if (arg0 != 45) {
            method1286(20, null, (byte) 8);
        }
        while (var5 < class364.field4692) {
            String var6 = class61.method347(31608, class231.field2996[var5]);
            if (var6 != null && var6.equals(var3)) {
                class360.method2120(class463.field6487.method1127(class379.field4920, false) + arg1 + class47.field680.method1127(class379.field4920, false), arg0 ^ 0x52);
                return;
            }
            if (class276.field3538[var5] != null) {
                String var7 = class61.method347(31608, class276.field3538[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class360.method2120(class463.field6487.method1127(class379.field4920, false) + arg1 + class47.field680.method1127(class379.field4920, false), 78);
                    return;
                }
            }
            var5++;
        }
        if (class61.method347(31608, class37.field573.field7630).equals(var3)) {
            class360.method2120(class344.field4374.method1127(class379.field4920, false), arg0 ^ 0x4E);
            return;
        }
        class420.method2472((byte) -101, class377.field4894);
        class418.field5563++;
        class319.field4112.method565(42, class415.method2442(arg0 ^ 0xFFFFFF86, arg1) + 1);
        class319.field4112.method597(-128, arg1);
        class319.field4112.method565(42, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V", line = 413)
    private final void method1284(byte arg0, int arg1) {
        field2574++;
        int var3 = arg1;
        if (arg0 != -21) {
            this.field2579 = 71;
        }
        boolean var4 = false;
        if (arg1 == -1) {
            class402 var5 = class52.field715.method1164(this.field2565, 0);
            class402 var6 = var5;
            if (var5.field5419 != null) {
                var5 = var5.method2393(class198.field2555, (byte) 32);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field5418 != null) {
                if (this.field2600 != null && var5.method2396((byte) -108, this.field2600.field650)) {
                    return;
                }
                var3 = var5.method2382((byte) -94);
                if (this.field2588 != var5.field5377) {
                    var4 = var5.field5380;
                }
            } else if (var5.field5390 == -1) {
                if (var6 != null && var6.field5418 != null) {
                    if (this.field2600 != null && var6.method2396((byte) -108, this.field2600.field650)) {
                        return;
                    }
                    var3 = var6.method2382((byte) -65);
                    if (this.field2588 != var6.field5377) {
                        var4 = var6.field5380;
                    }
                } else if (var6 != null && var6.field5390 != -1 && this.field2588 != var6.field5377) {
                    var3 = var6.field5390;
                    var4 = var6.field5380;
                }
            } else if (this.field2588 != var5.field5377) {
                var3 = var5.field5390;
                var4 = var5.field5380;
            }
        }
        if (var3 == -1) {
            this.field2600 = null;
            return;
        }
        this.field2567 = null;
        if (this.field2600 == null || this.field2600.field650 != var3) {
            this.field2600 = class403.field5429.method1962(var3, false);
        } else if (this.field2600.field643 == 0) {
            return;
        }
        if (this.field2600.field640 == null) {
            this.field2600 = null;
            return;
        }
        if (var4) {
            this.field2564 = (int) ((double) this.field2600.field640.length * Math.random());
            this.field2581 = (int) ((double) this.field2600.field647[this.field2564] * Math.random()) + 1;
        } else {
            this.field2581 = 1;
            this.field2564 = 0;
        }
        this.field2595 = this.field2564 + 1;
        if (this.field2595 < 0 || this.field2600.field640.length <= this.field2595) {
            this.field2595 = -1;
        }
        this.field2589 = class264.field3353 - this.field2581;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V", line = 543)
    public final void method1285(int arg0, byte arg1) {
        field2583++;
        this.field2580 = true;
        if (arg1 != -103) {
            this.method1278(109, null);
        }
        this.method1284((byte) -21, arg0);
    }

    @OriginalMember(owner = "client!uc", name = "finalize", descriptor = "()V", line = 560)
    protected final void finalize() {
        field2602++;
        if (this.field2572 != null) {
            this.field2572.method1972();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[BB)I", line = 575)
    public static final int method1286(int arg0, byte[] arg1, byte arg2) {
        if (arg2 != -81) {
            method1286(-15, null, (byte) 27);
        }
        field2598++;
        return class301.method1804(arg0, 0, arg2 + 350461293, arg1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I", line = 594)
    public final int method1287(int arg0) {
        if (arg0 != 1) {
            field2584 = null;
        }
        field2573++;
        return this.field2571;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I", line = 606)
    public static final int method1288(int arg0) {
        if (arg0 >= -49) {
            field2594 = 95;
        }
        field2578++;
        return 6;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 617)
    public static void method1289(int arg0) {
        field2584 = null;
        if (arg0 < -68) {
            field2590 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Z", line = 628)
    public final boolean method1290(int arg0) {
        int var2 = -3 % ((arg0 - 42) / 48);
        field2566++;
        return this.field2569;
    }
}
