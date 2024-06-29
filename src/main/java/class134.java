import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public abstract class class134 extends class98 {

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "Z")
    public volatile boolean field2403 = true;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "Lmb;")
    public static class96 field2407 = class243.method1708("sch-Utteln:", (byte) 124);

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field2405 = 1;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "Z")
    public static boolean field2412 = false;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "Lmb;")
    public static class96 field2409 = class243.method1708("runes", (byte) 110);

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "Lmb;")
    public static class96 field2404 = class243.method1708("<img=0>", (byte) 92);

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "[I")
    public static int[] field2402 = new int[50];

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "[I")
    public static int[] field2413 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "Z")
    public boolean field2400;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "Z")
    public boolean field2410;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "[I")
    public static int[] field2411;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lwk;I)I")
    public static final int method1003(class47 arg0, int arg1) {
        field2399++;
        int var2 = arg0.field813;
        int var3 = -21 / ((9 - arg1) / 59);
        if (arg0.field4573 == arg0.field4515) {
            var2 = arg0.field827;
        } else if (arg0.field4573 == arg0.field4555) {
            var2 = arg0.field797;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILej;III)V")
    public static final void method1004(int arg0, int arg1, class38 arg2, int arg3, int arg4, int arg5) {
        field2398++;
        if (arg2.field649 == -1 && arg2.field662 == null) {
            return;
        }
        int var6 = 0;
        if (arg2.field646 < arg3) {
            var6 += arg3 - arg2.field646;
        } else if (arg3 < arg2.field647) {
            var6 += arg2.field647 - arg3;
        }
        if (arg1 > arg2.field644) {
            var6 += arg1 - arg2.field644;
        } else if (arg1 < arg2.field663) {
            var6 += arg2.field663 - arg1;
        }
        if (arg2.field659 == 0 || (var6 - 64) > arg2.field659 || class5.field100 == 0 || arg2.field661 != arg4) {
            if (arg2.field671 != null) {
                class120.field2228.method1550(arg2.field671);
                arg2.field671 = null;
            }
            if (arg2.field667 != null) {
                class120.field2228.method1550(arg2.field667);
                arg2.field667 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg2.field659 - var6) * class5.field100 / arg2.field659;
        if (arg2.field671 != null) {
            arg2.field671.method521(var7);
        } else if (arg2.field649 >= 0) {
            class113 var8 = class113.method886(class178.field3077, arg2.field649, 0);
            if (var8 != null) {
                class131 var9 = var8.method887().method988(class44.field750);
                class72 var10 = class72.method496(var9, 100, var7);
                var10.method527(-1);
                class120.field2228.method1554(var10);
                arg2.field671 = var10;
            }
        }
        if (arg2.field667 != null) {
            arg2.field667.method521(var7);
            if (!arg2.field667.method1740((byte) 69)) {
                arg2.field667 = null;
            }
        } else if (arg2.field662 != null && (arg2.field651 -= arg5) <= 0) {
            int var11 = (int) ((double) arg2.field662.length * Math.random());
            class113 var12 = class113.method886(class178.field3077, arg2.field662[var11], 0);
            if (var12 != null) {
                class131 var13 = var12.method887().method988(class44.field750);
                class72 var14 = class72.method496(var13, 100, var7);
                var14.method527(0);
                class120.field2228.method1554(var14);
                arg2.field667 = var14;
                arg2.field651 = (int) ((double) (arg2.field658 - arg2.field668) * Math.random()) + arg2.field668;
            }
        }
        int var15 = -90 / ((-arg0 - 19) / 42);
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
    public static void method1005(int arg0) {
        field2409 = null;
        field2407 = null;
        field2411 = null;
        if (arg0 != 100) {
            method1004(-72, 65, (class38) null, 60, 10, 62);
        }
        field2404 = null;
        field2402 = null;
        field2413 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLff;)V")
    public static final void method1006(byte arg0, class3 arg1) {
        if (arg0 >= -1) {
            field2404 = null;
        }
        field2401++;
        class61.field1045 = arg1;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)[B")
    public abstract byte[] method397(int arg0);

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)I")
    public abstract int method394(int arg0);
}
