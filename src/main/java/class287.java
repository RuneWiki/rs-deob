import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class287 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lcba;")
    private class513 field4270;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    private int field4289;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lsl;")
    private class427 field4272;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Z")
    public static boolean field4274 = false;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[I")
    public static int[] field4277;

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
    public class287(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1900(long arg0, int arg1) {
        field4273++;
        class239 var4 = (class239) this.field4272.method2596(arg0, 114);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1236(-5346);
        int var6 = 114 / ((arg1 - 27) / 39);
        if (var5 == null) {
            var4.method2588(300);
            var4.method3813(-126);
            this.field4284 += var4.field3534;
            return null;
        }
        if (var4.method1239(true)) {
            class160 var7 = new class160(var5, var4.field3534);
            this.field4272.method2598(var7, var4.field6132, (byte) 8);
            this.field4270.method3023((byte) 63, var7);
            var7.field9628 = 0L;
            var4.method2588(300);
            var4.method3813(73);
        } else {
            this.field4270.method3023((byte) 48, var4);
            var4.field9628 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)I")
    public final int method1901(int arg0) {
        if (arg0 >= -126) {
            return 15;
        } else {
            field4285++;
            return this.field4289;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)I")
    public final int method1902(int arg0) {
        field4282++;
        int var2 = 0;
        if (arg0 > -123) {
            this.field4272 = null;
        }
        for (class239 var3 = (class239) this.field4270.method3024(5572); var3 != null; var3 = (class239) this.field4270.method3026(0)) {
            if (!var3.method1239(true)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)I")
    public final int method1903(int arg0) {
        if (arg0 != 0) {
            this.method1907((byte) 120);
        }
        field4281++;
        return this.field4284;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
    public final void method1904(Object arg0, long arg1, int arg2) {
        field4283++;
        if (arg2 != -1) {
            field4278 = -48;
        }
        this.method1909((byte) 69, arg1, arg0, 1);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLuk;)V")
    private final void method1905(byte arg0, class239 arg1) {
        field4275++;
        if (arg1 != null) {
            arg1.method2588(300);
            arg1.method3813(-125);
            this.field4284 += arg1.field3534;
        }
        int var3 = -78 % ((arg0 - 52) / 38);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1906(byte arg0) {
        field4276++;
        class239 var2 = (class239) this.field4272.method2597((byte) 124);
        if (arg0 != -103) {
            this.field4289 = -29;
        }
        while (var2 != null) {
            Object var3 = var2.method1236(arg0 - 5243);
            if (var3 != null) {
                return var3;
            }
            class239 var4 = var2;
            var2 = (class239) this.field4272.method2594((byte) -122);
            var4.method2588(300);
            var4.method3813(33);
            this.field4284 += var4.field3534;
        }
        return null;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1907(byte arg0) {
        field4286++;
        class239 var2 = (class239) this.field4272.method2594((byte) -122);
        while (var2 != null) {
            Object var4 = var2.method1236(-5346);
            if (var4 != null) {
                return var4;
            }
            class239 var5 = var2;
            var2 = (class239) this.field4272.method2594((byte) -122);
            var5.method2588(300);
            var5.method3813(-111);
            this.field4284 += var5.field3534;
        }
        int var3 = 40 % ((44 - arg0) / 42);
        return null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V")
    public final void method1908(int arg0, byte arg1) {
        field4288++;
        if (class257.field3793 != null) {
            for (class239 var3 = (class239) this.field4270.method3024(5572); var3 != null; var3 = (class239) this.field4270.method3026(arg1 + 11)) {
                if (var3.method1239(true)) {
                    if (var3.method1236(-5346) == null) {
                        var3.method2588(arg1 ^ 0xFFFFFED9);
                        var3.method3813(arg1 + 137);
                        this.field4284++;
                    }
                } else if ((++var3.field9628) > ((long) arg0)) {
                    class239 var4 = class257.field3793.method2252(var3, (byte) 124);
                    this.field4272.method2598(var4, var3.field6132, (byte) 8);
                    class216.method1503(var4, (byte) 69, var3);
                    var3.method2588(300);
                    var3.method3813(69);
                }
            }
        }
        if (arg1 != -11) {
            this.method1902(-118);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BJLjava/lang/Object;I)V")
    public final void method1909(byte arg0, long arg1, Object arg2, int arg3) {
        field4271++;
        if (this.field4289 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method1911((byte) 52, arg1);
        this.field4284 -= arg3;
        while (this.field4284 < 0) {
            class239 var7 = (class239) this.field4270.method3027(arg0 ^ 0x45);
            this.method1905((byte) 8, var7);
        }
        class160 var6 = new class160(arg2, arg3);
        this.field4272.method2598(var6, arg1, (byte) 8);
        if (arg0 != 69) {
            this.method1907((byte) 112);
        }
        this.field4270.method3023((byte) 117, var6);
        var6.field9628 = 0L;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    public static void method1910(int arg0) {
        field4277 = null;
        if (arg0 != 0) {
            field4278 = -2;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BJ)V")
    private final void method1911(byte arg0, long arg1) {
        field4279++;
        class239 var4 = (class239) this.field4272.method2596(arg1, 74);
        this.method1905((byte) 8, var4);
        if (arg0 != 52) {
            this.method1901(107);
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)V")
    public final void method1912(int arg0) {
        field4287++;
        for (class239 var2 = (class239) this.field4270.method3024(arg0 ^ 0xFFFFE3CC); var2 != null; var2 = (class239) this.field4270.method3026(0)) {
            if (var2.method1239(true)) {
                var2.method2588(300);
                var2.method3813(47);
                this.field4284 += var2.field3534;
            }
        }
        if (arg0 != -2552) {
            this.field4284 = -111;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public final void method1913(boolean arg0) {
        this.field4270.method3021(-28912);
        field4280++;
        this.field4272.method2600((byte) -114);
        this.field4284 = this.field4289;
        if (!arg0) {
            field4277 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(II)V")
    public class287(int arg0, int arg1) {
        this.field4270 = new class513();
        this.field4289 = arg0;
        this.field4284 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && arg1 > var3; var3 += var3) {
        }
        this.field4272 = new class427(var3);
    }
}
