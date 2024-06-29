import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class228 extends class535 {

    @OriginalMember(owner = "client!vu", name = "G", descriptor = "I")
    private int field3429;

    @OriginalMember(owner = "client!vu", name = "F", descriptor = "S")
    public static short field3428 = 256;

    @OriginalMember(owner = "client!vu", name = "P", descriptor = "[I")
    public static int[] field3437;

    @OriginalMember(owner = "client!vu", name = "O", descriptor = "Lqv;")
    public static class316 field3436;

    @OriginalMember(owner = "client!vu", name = "H", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!vu", name = "I", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!vu", name = "K", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!vu", name = "L", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!vu", name = "M", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!vu", name = "N", descriptor = "I")
    public static int field3435;

    static {
        new class44(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field3437 = new int[13];
        field3436 = new class316(105, 5);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILwn;I)V", line = 4)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg0 == 0) {
            this.field3429 = (arg1.method3072((byte) -124) << 12) / 255;
        }
        if (arg2 != -6232) {
            this.method60(-34, (class519) null, -14);
        }
        ++field3433;
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(I)V", line = 32)
    public class228(int arg0) {
        super(0, true);
        this.field3429 = 4096;
        this.field3429 = arg0;
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V", line = 46)
    public class228() {
        this(4096);
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V", line = 49)
    public static void method1527(int arg0) {
        field3436 = null;
        field3437 = null;
        if (arg0 < 8) {
            field3437 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZLqt;)V", line = 60)
    public static final void method1528(boolean arg0, class459 arg1) {
        ++field3434;
        class276.field4124.method2480(arg0, arg1.method2728((byte) 24));
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIII)V", line = 68)
    public static final void method1529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3430;
        int var7 = -arg1 + arg2;
        int var8 = arg1 + arg3;
        for (int var9 = arg3; var9 < var8; ++var9) {
            class479.method2839(arg0, arg4, class271.field4078[var9], arg5 + 11, arg6);
        }
        int var10 = arg1 + arg4;
        for (int var11 = arg2; ~var11 < ~var7; --var11) {
            class479.method2839(arg0, arg4, class271.field4078[var11], 73, arg6);
        }
        int var12 = -arg1 + arg0;
        if (arg5 != 105) {
            field3428 = -123;
        }
        for (int var13 = var8; var7 >= var13; ++var13) {
            int[] var14 = class271.field4078[var13];
            class479.method2839(var10, arg4, var14, arg5 ^ 18, arg6);
            class479.method2839(arg0, var12, var14, 120, arg6);
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)[I", line = 127)
    public final int[] method65(int arg0, int arg1) {
        ++field3432;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (arg1 != 1) {
            this.method65(-83, 91);
        }
        if (super.field7885.field2086) {
            class282.method1821(var3, 0, class174.field2597, this.field3429);
        }
        return var3;
    }
}
