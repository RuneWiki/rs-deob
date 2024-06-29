import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class175 extends class778 implements class362 {

    @OriginalMember(owner = "client!bka", name = "X", descriptor = "S")
    private short field2470;

    @OriginalMember(owner = "client!bka", name = "bb", descriptor = "B")
    private byte field2474;

    @OriginalMember(owner = "client!bka", name = "vb", descriptor = "B")
    private byte field2494;

    @OriginalMember(owner = "client!bka", name = "U", descriptor = "Z")
    private boolean field2467;

    @OriginalMember(owner = "client!bka", name = "W", descriptor = "Z")
    private boolean field2469;

    @OriginalMember(owner = "client!bka", name = "cb", descriptor = "Z")
    private boolean field2475;

    @OriginalMember(owner = "client!bka", name = "jb", descriptor = "Z")
    private boolean field2482;

    @OriginalMember(owner = "client!bka", name = "ab", descriptor = "Lr;")
    private class192 field2473;

    @OriginalMember(owner = "client!bka", name = "gb", descriptor = "Lka;")
    public class495 field2479;

    @OriginalMember(owner = "client!bka", name = "ob", descriptor = "Ljo;")
    public static class351 field2487 = new class351(33, 8);

    @OriginalMember(owner = "client!bka", name = "yb", descriptor = "[I")
    public static int[] field2497 = new int[2];

    @OriginalMember(owner = "client!bka", name = "R", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!bka", name = "S", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!bka", name = "T", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!bka", name = "V", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!bka", name = "Y", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!bka", name = "Z", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!bka", name = "db", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!bka", name = "eb", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!bka", name = "fb", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!bka", name = "hb", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!bka", name = "ib", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!bka", name = "lb", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!bka", name = "mb", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!bka", name = "nb", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!bka", name = "pb", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!bka", name = "qb", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!bka", name = "rb", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!bka", name = "sb", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!bka", name = "tb", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!bka", name = "ub", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!bka", name = "wb", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!bka", name = "xb", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!bka", name = "kb", descriptor = "Lpw;")
    private class733 field2483;

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method642(int arg0) {
        ++field2477;
        int var2 = -110 / ((77 - arg0) / 38);
        return this.field2482;
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(ILsf;Lha;BIIZ)V", line = 13)
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 != 0) {
            this.method1312(true, (class66) null, -83, 50);
        }
        if (arg1 instanceof class596) {
            class596 var8 = (class596) arg1;
            if (this.field2479 != null && var8.field8402 != null) {
                this.field2479.method71(var8.field8402, arg4, arg5, arg0, arg6);
            }
        } else if (arg1 instanceof class175) {
            class175 var9 = (class175) arg1;
            if (this.field2479 != null && var9.field2479 != null) {
                this.field2479.method71(var9.field2479, arg4, arg5, arg0, arg6);
            }
        }
        ++field2486;
    }

    @OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lha;Ldja;IIIIIZIIIIIIZ)V", line = 43)
    public class175(class66 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4796 == -2, class197.method1427(arg13, false, arg12));
        this.field2470 = (short) arg1.field4759;
        this.field2474 = (byte) arg13;
        super.field7711 = (byte) arg3;
        this.field2494 = (byte) arg12;
        this.field2467 = arg1.field4761 != 0 && !arg7;
        this.field2469 = arg14;
        this.field2475 = arg7;
        this.field2482 = arg0.method423() && arg1.field4831 && !this.field2475 && ~class145.field1852.field9017.method3212((byte) -124) != -1;
        int var16 = 2048;
        if (this.field2469) {
            var16 |= 65536;
        }
        class469 var17 = this.method1312(this.field2482, arg0, var16, 15);
        if (var17 != null) {
            this.field2473 = var17.field6701;
            this.field2479 = var17.field6700;
            if (this.field2469) {
                this.field2479 = this.field2479.method81((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(IZLha;I)Z", line = 79)
    public final boolean method253(int arg0, boolean arg1, class66 arg2, int arg3) {
        ++field2485;
        class495 var5 = this.method1310(arg2, 131072, -126);
        if (!arg1) {
            field2497 = null;
        }
        if (var5 != null) {
            class378 var6 = arg2.method433();
            var6.method1959(super.field7718, super.field7723, super.field7719);
            return class475.field6760 ? var5.method84(arg3, arg0, var6, false, 0, class412.field5822) : var5.method83(arg3, arg0, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lha;II)Lka;", line = 102)
    private final class495 method1310(class66 arg0, int arg1, int arg2) {
        ++field2493;
        if (arg2 > -123) {
            this.field2483 = null;
        }
        if (this.field2479 != null && arg0.method451(this.field2479.method113(), arg1) == 0) {
            return this.field2479;
        } else {
            class469 var4 = this.method1312(false, arg0, arg1, 15);
            return var4 != null ? var4.field6700 : null;
        }
    }

    @OriginalMember(owner = "client!bka", name = "e", descriptor = "(B)I", line = 125)
    public final int method1311(byte arg0) {
        if (arg0 >= -35) {
            return 90;
        } else {
            ++field2484;
            return this.field2479 == null ? 15 : this.field2479.method94() / 4;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)I", line = 138)
    public final int method646(byte arg0) {
        ++field2478;
        return arg0 != 45 ? 117 : this.field2494;
    }

    @OriginalMember(owner = "client!bka", name = "j", descriptor = "(I)I", line = 150)
    public final int method239(int arg0) {
        if (arg0 >= -9) {
            this.method1311((byte) -96);
        }
        ++field2471;
        return this.field2479 != null ? this.field2479.method67() : 0;
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lha;B)Lhq;", line = 165)
    public final class167 method258(class66 arg0, byte arg1) {
        ++field2465;
        if (this.field2479 == null) {
            return null;
        } else {
            if (arg1 != 10) {
                field2497 = null;
            }
            class378 var3 = arg0.method433();
            var3.method1959(super.field7718, super.field7723, super.field7719);
            class167 var4 = class653.method3739(0, 1, this.field2467);
            if (!class475.field6760) {
                this.field2479.method108(var3, var4.field2426[0], 0);
            } else {
                this.field2479.method91(var3, var4.field2426[0], class412.field5822, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(ZLha;II)Luf;", line = 194)
    private final class469 method1312(boolean arg0, class66 arg1, int arg2, int arg3) {
        ++field2464;
        class322 var5 = class496.field7061.method319(-124, 65535 & this.field2470);
        if (arg3 != 15) {
            this.method647(69);
        }
        class292 var6;
        class292 var7;
        if (!this.field2475) {
            var6 = class750.field10395[super.field7711];
            if (~super.field7711 <= -4) {
                var7 = null;
            } else {
                var7 = class750.field10395[super.field7711 + 1];
            }
        } else {
            var7 = class750.field10395[0];
            var6 = class311.field4628[super.field7711];
        }
        return var5.method2091(super.field7718, this.field2494 != 11 ? this.field2494 : 10, arg2, (class521) null, super.field7719, arg0, this.field2494 == 11 ? 4 - -this.field2474 : this.field2474, var7, var6, super.field7723, false, arg1);
    }

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "(B)Z", line = 224)
    public final boolean method254(byte arg0) {
        ++field2491;
        if (arg0 != 104) {
            return true;
        } else if (this.field2479 != null) {
            return !this.field2479.method68();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(ILha;)V", line = 240)
    public final void method651(int arg0, class66 arg1) {
        ++field2495;
        Object var3 = null;
        class192 var5;
        if (this.field2473 == null && this.field2482) {
            class469 var4 = this.method1312(true, arg1, 262144, 15);
            var5 = var4 != null ? var4.field6701 : null;
        } else {
            var5 = this.field2473;
            this.field2473 = null;
        }
        if (arg0 != -8836) {
            this.method253(89, false, (class66) null, -8);
        }
        if (var5 != null) {
            class12.method126(var5, super.field7711, super.field7718, super.field7719, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)I", line = 272)
    public final int method650(int arg0) {
        ++field2472;
        int var2 = 42 % ((24 - arg0) / 53);
        return 65535 & this.field2470;
    }

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(ILha;)V", line = 283)
    public final void method645(int arg0, class66 arg1) {
        int var3 = 65 / ((-72 - arg0) / 36);
        ++field2481;
        Object var4 = null;
        class192 var6;
        if (this.field2473 == null && this.field2482) {
            class469 var5 = this.method1312(true, arg1, 262144, 15);
            var6 = var5 != null ? var5.field6701 : null;
        } else {
            var6 = this.field2473;
            this.field2473 = null;
        }
        if (var6 != null) {
            class258.method1700(var6, super.field7711, super.field7718, super.field7719, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bka", name = "h", descriptor = "(I)Z", line = 311)
    public final boolean method244(int arg0) {
        int var2 = -66 % ((arg0 - -19) / 57);
        ++field2490;
        return this.field2469;
    }

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(Lha;B)Lpw;", line = 325)
    public final class733 method255(class66 arg0, byte arg1) {
        int var3 = -77 % ((arg1 - -45) / 63);
        if (this.field2483 == null) {
            this.field2483 = class302.method2004(super.field7718, super.field7719, -107, super.field7723, this.method1310(arg0, 0, -128));
        }
        ++field2488;
        return this.field2483;
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lha;I)V", line = 338)
    public final void method257(class66 arg0, int arg1) {
        ++field2466;
        if (arg1 < 60) {
            this.method258((class66) null, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!bka", name = "g", descriptor = "(I)I", line = 348)
    public final int method246(int arg0) {
        if (arg0 >= -104) {
            this.method257((class66) null, 1);
        }
        ++field2468;
        return this.field2479 == null ? 0 : this.field2479.method75();
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(Z)I", line = 362)
    public final int method643(boolean arg0) {
        if (arg0) {
            this.method1311((byte) -127);
        }
        ++field2476;
        return this.field2474;
    }

    @OriginalMember(owner = "client!bka", name = "f", descriptor = "(B)V", line = 377)
    public static void method1313(byte arg0) {
        field2487 = null;
        field2497 = null;
        if (arg0 != -73) {
            method1313((byte) 27);
        }
    }

    @OriginalMember(owner = "client!bka", name = "i", descriptor = "(I)V", line = 390)
    public final void method240(int arg0) {
        if (arg0 == -1) {
            ++field2489;
            this.field2469 = false;
            if (this.field2479 != null) {
                this.field2479.method85(this.field2479.method113() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "(I)V", line = 405)
    public final void method647(int arg0) {
        if (this.field2479 != null) {
            this.field2479.method76();
        }
        ++field2480;
        if (arg0 != 32653) {
            this.field2475 = false;
        }
    }

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(B)Z", line = 420)
    public final boolean method248(byte arg0) {
        ++field2492;
        if (arg0 != -55) {
            this.method244(76);
        }
        return this.field2479 != null ? this.field2479.method88() : false;
    }
}
