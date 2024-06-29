import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class417 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Lpq;")
    public static class159 field5814;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII)V")
    public static final void method2423(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 << 3;
        int var5 = arg3 << 3;
        int var6 = arg1 << 3;
        field5813++;
        if (arg0 < 123) {
            field5814 = null;
        }
        class283.field3826 = var6;
        if (class42.field546 == 2) {
            class261.field3603 = var4;
            class336.field4947 = var6;
            class253.field3493 = var5;
        }
        class620.field8432 = var4;
        class425.method2455(1024);
        class308.field4137 = true;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lu;I)V")
    public static final void method2424(class69 arg0, int arg1) {
        field5816++;
        if (class483.field6542) {
            return;
        }
        arg0.method175(arg1 ^ 0x778F);
        if (arg1 != 3) {
            field5814 = null;
        }
        class179.field2242--;
    }

    @OriginalMember(owner = "client!fo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5817++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
    public static void method2425(byte arg0) {
        field5814 = null;
        if (arg0 != -25) {
            field5814 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(IIII)V")
    public static final void method2426(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 3) {
            field5815++;
            class645.field9140 = new byte[arg3][arg2][arg1];
        }
    }
}
