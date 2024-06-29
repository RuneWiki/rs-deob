import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class439 extends class323 {

    @OriginalMember(owner = "client!maa", name = "u", descriptor = "Ldr;")
    public static class675 field5528 = new class675(37, 12);

    @OriginalMember(owner = "client!maa", name = "w", descriptor = "[I")
    public static int[] field5530 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!maa", name = "y", descriptor = "Ldr;")
    public static class675 field5532 = new class675(65, 4);

    @OriginalMember(owner = "client!maa", name = "z", descriptor = "Lrr;")
    public static class337 field5533 = null;

    @OriginalMember(owner = "client!maa", name = "p", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!maa", name = "q", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!maa", name = "r", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!maa", name = "t", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!maa", name = "v", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!maa", name = "x", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!maa", name = "s", descriptor = "Lxa;")
    private class468 field5526;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)Z", line = 8)
    public final boolean method516(int arg0) {
        ++field5524;
        return !super.method516(arg0) ? false : super.field4024.method1669((byte) 111, ((class276) super.field4027).field3522);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)I", line = 19)
    public static final int method2411(int arg0, int arg1) {
        return class493.field6143 != null ? class493.field6143[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZBII)V", line = 22)
    public final void method1861(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field5523;
        int var5 = this.method1860(0) * super.field4027.field9574 / 10000;
        int[] var6 = new int[4];
        class309.field3898.method478(var6);
        class309.field3898.method403(arg2, arg3 - -2, arg2 + var5, super.field4027.field9572 + arg3);
        this.field5526.method2552(arg2, arg3 + 2, super.field4027.field9574, super.field4027.field9572);
        class309.field3898.method403(var6[0], var6[1], var6[2], var6[3]);
        int var7 = 114 % ((-83 - arg1) / 37);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V", line = 41)
    public final void method518(int arg0) {
        ++field5529;
        super.method518(arg0);
        this.field5526 = class132.method853(arg0 ^ arg0, super.field4024, ((class276) super.field4027).field3522);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIII)V", line = 54)
    public static final void method2412(int arg0, int arg1, int arg2, int arg3) {
        ++field5525;
        class234.field3033 = new byte[arg1][arg2][arg0];
        if (arg3 != 2) {
            method2414((byte) 42);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljaa;BIIII)Lhq;", line = 65)
    public static final class148 method2413(class576 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5527;
        if (arg1 < 106) {
            method2411(91, -59);
        }
        if (!arg0.field7709 && (!class182.method1084((byte) 92, arg3) || !class182.method1084((byte) -35, arg4))) {
            return !arg0.field7651 ? new class148(arg0, arg2, arg5, arg3, arg4, class560.method2979(arg3, (byte) 107), class560.method2979(arg4, (byte) 68), true) : new class148(arg0, 34037, arg2, arg5, arg3, arg4, true);
        } else {
            return new class148(arg0, 3553, arg2, arg5, arg3, arg4, true);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIZZ)V", line = 84)
    public final void method1862(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field5531;
        class309.field3898.method435(arg1 + -2, arg0, super.field4027.field9574 + 4, super.field4027.field9572 + 2, ((class276) super.field4027).field3521, 0);
        class309.field3898.method435(arg1 + -1, arg0 + 1, super.field4027.field9574 - -2, super.field4027.field9572, 0, 0);
        if (!arg3) {
            method2413((class576) null, (byte) 123, -15, 79, -29, 123);
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lpfa;Lpfa;Leo;)V", line = 96)
    public class439(class275 arg0, class275 arg1, class276 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)V", line = 104)
    public static void method2414(byte arg0) {
        field5532 = null;
        field5533 = null;
        if (arg0 <= 115) {
            field5532 = null;
        }
        field5528 = null;
        field5530 = null;
    }
}
