import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class305 extends class66 {

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    private int field3773 = 0;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Loj;")
    public static class543 field3770;

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lpl;Ljq;)V")
    public class305(class612 arg0, class490 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V")
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class540.field7230 != null) {
            class540.field7230[arg0][arg1] = -16777216 | arg2;
        }
        if (class180.field2320 != null) {
            class180.field2320[arg0][arg1] = (short) arg3;
        }
        if (class319.field4080 != null) {
            class319.field4080[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V")
    public final void method395(boolean arg0, int arg1) {
        if (arg1 != 6621) {
            this.field3773 = -5;
        }
        ++field3769;
        int var3 = super.field899.field2388.method2206(class593.field8327, super.field895.method160(), 2) + super.field899.field2394;
        int var4 = super.field899.field2391.method195(class316.field4060, super.field895.method166(), -98) + super.field899.field2393;
        super.field895.method2907((float) (var3 - -(super.field895.method160() / 2)), (float) (super.field895.method166() / 2 + var4), 4096, this.field3773);
        this.field3773 += ((class490) super.field899).field6483;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
    public static void method1750(int arg0) {
        field3770 = null;
        if (arg0 != 2) {
            field3772 = 89;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
    public static final void method1751(int arg0, int arg1) {
        if (arg0 != 0) {
            method1749(41, -84, 64, 0, 60);
        }
        ++field3771;
        class577.field8054.method2411(true, arg1);
    }
}
