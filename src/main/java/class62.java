import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class62 extends class686 {

    @OriginalMember(owner = "client!ifa", name = "x", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field850;

    @OriginalMember(owner = "client!ifa", name = "v", descriptor = "I")
    public static int field848 = 0;

    @OriginalMember(owner = "client!ifa", name = "s", descriptor = "Z")
    public static boolean field845 = false;

    @OriginalMember(owner = "client!ifa", name = "t", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ifa", name = "u", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ifa", name = "w", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ifa", name = "y", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!ifa", name = "A", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIILcg;)V")
    public static final void method523(int arg0, int arg1, int arg2, int arg3, class11 arg4) {
        arg4.field114.method2353(arg2, (byte) -86);
        field849++;
        if (arg3 != 1) {
            field848 = 76;
        }
        arg4.field114.method2386(arg1, 1103587288);
        arg4.field114.method2386(arg0, 1103587288);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
    public static final void method524(byte arg0) {
        field852++;
        class641.field8919.method2085((byte) 9);
        class126.field1630.method2085((byte) 9);
        for (class57 var1 = (class57) class658.field9176.method2090(true); var1 != null; var1 = (class57) class658.field9176.method2088(-152)) {
            int var18 = var1.field776;
            if (var18 < 1000) {
                var1.method2438((byte) 110);
                if (var18 == 19 || var18 == 60 || var18 == 22 || var18 == 21 || var18 == 6 || var18 == 17 || var18 == 50) {
                    class126.field1630.method2087(var1, -106);
                } else {
                    class641.field8919.method2087(var1, 9);
                }
            }
        }
        class641.field8919.method2084(28957, class658.field9176);
        if (arg0 != -77) {
            method526(54, 81, -124);
        }
        class126.field1630.method2084(28957, class658.field9176);
        if (class291.field3758 <= 1) {
            class218.field2855 = null;
        } else if (class465.field6070 && class390.field4990.method3168(arg0 ^ 0xFFFFFEB3, 81) && class291.field3758 > 2) {
            class218.field2855 = (class57) class658.field9176.field4702.field5497.field5497;
        } else {
            class218.field2855 = (class57) class658.field9176.field4702.field5497;
        }
        int var2 = -1;
        class252 var3 = (class252) class700.field9768.method2090(true);
        if (var3 != null) {
            var2 = var3.method324(arg0 ^ 0x4D);
        }
        if (!class594.field8025) {
            if (var2 == 0 && (class457.field5994 == 1 && class291.field3758 > 2 || class52.method461(false))) {
                var2 = 2;
            }
            if (var2 == 2 && class291.field3758 > 0 && var3 != null) {
                if (class655.field9114 == null && class210.field2710 == 0) {
                    class424.method2443((byte) 102, var3.method320(-115), var3.method323(-5));
                } else {
                    class362.field4679 = 2;
                }
            }
            if (var2 == 0 && class291.field3758 > 0) {
                class94.method721(82);
            }
            if (class655.field9114 == null && class210.field2710 == 0) {
                class362.field4679 = 0;
                class592.field8017 = null;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class691.field9440.method2214(-2703);
            int var5 = class691.field9440.method2208(30114);
            if (var4 < (class399.field5100 - 10) || class399.field5100 + class238.field3206 + 10 < var4 || var5 < (class630.field8791 - 10) || var5 > class630.field8791 - (-class539.field7003 - 10)) {
                class345.method1985((byte) 0);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class399.field5100;
        int var7 = class630.field8791;
        int var8 = class238.field3206;
        int var9 = var3.method323(-5);
        int var10 = var3.method320(-117);
        int var11 = -1;
        for (int var12 = 0; var12 < class291.field3758; var12++) {
            if (class288.field3723) {
                int var16 = (class291.field3758 - var12 - 1) * 16 + var7 + 33;
                if (var6 < var9 && (var6 + var8) > var9 && var10 > var16 - 13 && (var16 + 4) > var10) {
                    var11 = var12;
                }
            } else {
                int var17 = var7 + ((-var12 + class291.field3758 + -1) * 16) + 31;
                if (var9 > var6 && var6 + var8 > var9 && var10 > (var17 - 13) && (var17 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class141 var14 = new class141(class658.field9176);
            for (class57 var15 = (class57) var14.method1069(arg0 ^ 0xFFFFBA46); var15 != null; var15 = (class57) var14.method1066(true)) {
                if (var11 == var13) {
                    class559.method2993(-22678, var10, var9, var15);
                }
                var13++;
            }
        }
        class345.method1985((byte) 0);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILpl;)V")
    public static final void method525(int arg0, class215 arg1) {
        field853++;
        arg1.field2767 = null;
        int var2 = arg1.field2770.length;
        if (arg0 <= 15) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field2770[var3].field1404 = false;
        }
        class365[] var4 = class274.field3603;
        synchronized (class274.field3603) {
            if (class274.field3603.length > var2 && class388.field4972[var2] < 200) {
                class274.field3603[var2].method2104((byte) -22, arg1);
                int var10002 = class388.field4972[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)V")
    public static final void method526(int arg0, int arg1, int arg2) {
        class530 var3 = class483.field6438[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6879 != null) {
            var3.field6879 = null;
        }
        if (var3.field6886 != null) {
            var3.field6886 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V")
    public final void method527(int arg0) {
        this.field850.method1949();
        if (arg0 > -46) {
            this.field850 = null;
        }
        field846++;
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(I)V")
    public class62(int arg0) {
        this.field850 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "(I)I")
    public static final int method528(int arg0) {
        if (arg0 != 2) {
            method528(-78);
        }
        field851++;
        if (class114.field1483 == null) {
            return class265.field3555 ? 2 : 1;
        } else {
            return 3;
        }
    }
}
