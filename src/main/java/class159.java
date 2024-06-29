import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class159 extends class13 {

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Z")
    public boolean field2360;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "F")
    public float field2359;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "F")
    public float field2357;

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lmi;IIIIIIZ)V")
    private class159(class315 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2360 = false;
        this.field2359 = (float) arg4 / (float) arg6;
        this.field2361 = arg4;
        this.field2358 = arg3;
        this.field2357 = (float) arg3 / (float) arg5;
        this.method93(false, false);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lmi;IIIZ[I)V")
    private class159(class315 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field2361 = arg3;
        if (this.field5962 == 34037) {
            this.field2360 = false;
            this.field2357 = (float) arg2;
            this.field2359 = (float) arg3;
        } else {
            this.field2357 = this.field2359 = 1.0F;
            this.field2360 = true;
        }
        this.field2358 = arg2;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lmi;IIII[I)V")
    private class159(class315 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2358 = arg1;
        this.field2361 = arg2;
        this.method98(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field2360 = false;
        this.field2357 = (float) arg1 / (float) arg3;
        this.field2359 = (float) arg2 / (float) arg4;
        this.method93(false, false);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZI[BILmi;I)Lrh;")
    public static final class159 method990(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, class315 arg6, int arg7) {
        if (arg7 != 34037) {
            method991(-85, (int[]) null, (class315) null, true, 50, -87);
        }
        if (!arg6.field4559 && (!class449.method2617(arg3, arg7 ^ 0x9911) || !class449.method2617(arg0, 7652))) {
            return arg6.field4499 ? new class159(arg6, 34037, arg5, arg3, arg0, arg2, arg4, arg1) : new class159(arg6, arg5, arg3, arg0, class276.method1708(arg7 ^ 0x4AEB72A5, arg3), class276.method1708(1256978000, arg0), arg4, arg1);
        } else {
            return new class159(arg6, 3553, arg5, arg3, arg0, arg2, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lmi;IIIIIZ)V")
    private class159(class315 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (this.field5962 == 34037) {
            this.field2360 = false;
            this.field2357 = (float) arg4;
            this.field2359 = (float) arg5;
        } else {
            this.field2360 = true;
            this.field2357 = this.field2359 = 1.0F;
        }
        this.field2361 = arg5;
        this.field2358 = arg4;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lmi;IIIII[BI)V")
    private class159(class315 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2361 = arg3;
        this.field2358 = arg2;
        this.method96(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field2359 = (float) arg3 / (float) arg5;
        this.field2357 = (float) arg2 / (float) arg4;
        this.field2360 = false;
        this.method93(false, false);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lmi;IIIIZ[BI)V")
    private class159(class315 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2361 = arg4;
        if (this.field5962 == 34037) {
            this.field2360 = false;
            this.field2359 = (float) arg4;
            this.field2357 = (float) arg3;
        } else {
            this.field2357 = this.field2359 = 1.0F;
            this.field2360 = true;
        }
        this.field2358 = arg3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[ILmi;ZII)Lrh;")
    public static final class159 method991(int arg0, int[] arg1, class315 arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 >= -102) {
            method990(85, 17, false, -83, (byte[]) null, -51, (class315) null, -57);
        }
        if (!arg2.field4559 && (!class449.method2617(arg4, 7652) || !class449.method2617(arg5, 7652))) {
            return arg2.field4499 ? new class159(arg2, 34037, arg4, arg5, arg3, arg1) : new class159(arg2, arg4, arg5, class276.method1708(1256978000, arg4), class276.method1708(1256978000, arg5), arg1);
        } else {
            return new class159(arg2, 3553, arg4, arg5, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lmi;IBIII)Lrh;")
    public static final class159 method992(class315 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 38) {
            method990(89, -115, true, -38, (byte[]) null, -26, (class315) null, -106);
        }
        if (!arg0.field4559 && (!class449.method2617(arg5, 7652) || !class449.method2617(arg1, 7652))) {
            return arg0.field4499 ? new class159(arg0, 34037, arg3, arg4, arg5, arg1, true) : new class159(arg0, arg3, arg4, arg5, arg1, class276.method1708(1256978000, arg5), class276.method1708(1256978000, arg1), true);
        } else {
            return new class159(arg0, 3553, arg3, arg4, arg5, arg1, true);
        }
    }
}
