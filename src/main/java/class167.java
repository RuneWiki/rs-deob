import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class167 {

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "Lrp;")
    private class288 field2587 = new class288(64);

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Llt;")
    private class458 field2588;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Llg;")
    public static class274 field2590 = new class274(128);

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field2593 = -1;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2592;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
    public static int[] field2591;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "[I")
    public static int[] field2594;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public static final void method1049(boolean arg0) {
        class455.field6977 = 0;
        field2586++;
        int var1 = (class286.field4329.field3218 >> 7) + class381.field5550;
        int var2 = (class286.field4329.field3222 >> 7) + class320.field4827;
        if (arg0) {
            method1054(-54, -127, -35, null);
        }
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class455.field6977 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class455.field6977 = 1;
        }
        if (class455.field6977 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class455.field6977 = 0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public final void method1050(byte arg0) {
        if (arg0 < 104) {
            method1049(false);
        }
        field2580++;
        class288 var2 = this.field2587;
        synchronized (this.field2587) {
            this.field2587.method1761(-127);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V")
    public final void method1051(byte arg0, int arg1) {
        field2583++;
        class288 var3 = this.field2587;
        synchronized (this.field2587) {
            if (arg0 != -68) {
                this.method1055(false);
            }
            this.field2587.method1760(arg1, arg0 ^ 0xFFFF8902);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Lmd;")
    public final class365 method1052(int arg0, int arg1) {
        field2589++;
        class288 var3 = this.field2587;
        class365 var4;
        synchronized (this.field2587) {
            var4 = (class365) this.field2587.method1752(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 30350) {
            method1053((byte) -31);
        }
        byte[] var5 = this.field2588.method2715(arg0, 16, false);
        class365 var6 = new class365();
        if (var5 != null) {
            var6.method2206((byte) -97, new class40(var5));
        }
        class288 var7 = this.field2587;
        synchronized (this.field2587) {
            this.field2587.method1758(arg1 - 30349, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public static void method1053(byte arg0) {
        if (arg0 != 54) {
            method1053((byte) -117);
        }
        field2594 = null;
        field2591 = null;
        field2592 = null;
        field2590 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILsi;)V")
    public static final void method1054(int arg0, int arg1, int arg2, class376 arg3) {
        class268 var4 = class18.method95(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field4042 = arg3;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
    public final void method1055(boolean arg0) {
        if (arg0) {
            method1054(-86, -128, 125, null);
        }
        class288 var2 = this.field2587;
        synchronized (this.field2587) {
            this.field2587.method1749((byte) 123);
        }
        field2585++;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lcm;ILlt;)V")
    public class167(class491 arg0, int arg1, class458 arg2) {
        this.field2588 = arg2;
        if (this.field2588 == null) {
            this.field2584 = 0;
        } else {
            this.field2584 = this.field2588.method2726((byte) 113, 16);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBII)I")
    public static final int method1056(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -121) {
            return 93;
        }
        field2582++;
        if (arg2 > arg3) {
            return arg2;
        } else if (arg0 >= arg3) {
            return arg3;
        } else {
            return arg0;
        }
    }
}
