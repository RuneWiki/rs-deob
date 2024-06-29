import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class129 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Lea;")
    private class46 field2386 = new class46();

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Lmb;")
    public static class132 field2388 = class166.method1092("Anmelde)2Zeitlimit -Uberschritten)3", 122);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method843(byte arg0) {
        if (arg0 != -99) {
            field2389 = 25;
        }
        field2388 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZLpb;Lpb;Z)V")
    public static final void method844(int arg0, boolean arg1, class165 arg2, class165 arg3, boolean arg4) {
        field2393++;
        class195.field3625 = arg3;
        class32.field497 = arg2;
        class230.field4148 = arg1;
        class1.field4 = arg4;
        class41.field666 = new class174(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILea;)V")
    public final void method845(int arg0, class46 arg1) {
        field2391++;
        if (arg1.field794 != null) {
            arg1.method306((byte) 101);
        }
        arg1.field786 = this.field2386;
        arg1.field794 = this.field2386.field794;
        arg1.field794.field786 = arg1;
        if (arg0 != 4521) {
            field2388 = null;
        }
        arg1.field786.field794 = arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static final void method846(int arg0) {
        class235.field4241.method778((byte) 95);
        field2384++;
        if (arg0 >= -127) {
            field2388 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILea;)V")
    public final void method847(int arg0, class46 arg1) {
        int var3 = 24 / ((38 - arg0) / 42);
        if (arg1.field794 != null) {
            arg1.method306((byte) -106);
        }
        arg1.field786 = this.field2386.field786;
        arg1.field794 = this.field2386;
        arg1.field794.field786 = arg1;
        arg1.field786.field794 = arg1;
        field2390++;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)Lea;")
    public final class46 method848(int arg0) {
        class46 var2 = this.field2386.field786;
        field2395++;
        if (this.field2386 == var2) {
            return null;
        } else {
            if (arg0 != 0) {
                field2388 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public static final void method849(boolean arg0) {
        if (!arg0) {
            method846(83);
        }
        if (class151.field2765 < class53.field902) {
            class151.field2765 += class151.field2765 / 30.0D;
            if (class151.field2765 > class53.field902) {
                class151.field2765 = class53.field902;
            }
            class31.method222(110);
        } else if (class151.field2765 > class53.field902) {
            class151.field2765 -= class151.field2765 / 30.0D;
            if (class151.field2765 < class53.field902) {
                class151.field2765 = class53.field902;
            }
            class31.method222(121);
        }
        if (class196.field3641 != -1 && class210.field3862 != -1) {
            int var1 = class196.field3641 - class157.field2858;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class210.field3862 - class56.field953;
            class157.field2858 -= -var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class210.field3862 = -1;
                class196.field3641 = -1;
            }
            class56.field953 += var2;
            class31.method222(100);
        }
        field2394++;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
    public static final void method850(byte arg0) {
        field2385++;
        class47.field810.method106(0, 0);
        class108.field2050.method106(382, 0);
        class174.field3253.method530(382 - class174.field3253.field1484 / 2, 18);
        if (arg0 <= 1) {
            field2389 = 100;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class129() {
        this.field2386.field786 = this.field2386;
        this.field2386.field794 = this.field2386;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z")
    public static final boolean method851(int arg0, int arg1) {
        field2396++;
        if (arg0 != 0) {
            field2389 = -25;
        }
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZZBZI)Loc;")
    public static final class155 method852(boolean arg0, boolean arg1, byte arg2, boolean arg3, int arg4) {
        if (arg2 != -6) {
            method851(-54, -26);
        }
        field2392++;
        class214 var5 = null;
        if (class70.field1164 != null) {
            var5 = new class214(arg4, class70.field1164, class122.field2271[arg4], 1000000);
        }
        return new class155(var5, class134.field2518, arg4, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)Lea;")
    public final class46 method853(int arg0) {
        class46 var2 = this.field2386.field786;
        if (arg0 >= -27) {
            method849(false);
        }
        field2387++;
        if (this.field2386 == var2) {
            return null;
        } else {
            var2.method306((byte) 62);
            return var2;
        }
    }
}
