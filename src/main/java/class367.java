import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class367 extends class352 {

    @OriginalMember(owner = "client!t", name = "i", descriptor = "[B")
    public static byte[] field5541 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lfa;")
    public static class371 field5546 = new class371(16);

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field5552 = 0;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public int field5543;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public int field5545;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public int field5551;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Z")
    public boolean field5549;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 4)
    public static void method2261(byte arg0) {
        field5546 = null;
        if (arg0 != -33) {
            field5544 = -118;
        }
        field5541 = null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 16)
    public final void method249(int arg0) {
        field5542++;
        if (arg0 <= 56) {
            this.method253(91);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)Z", line = 30)
    public final boolean method253(int arg0) {
        field5547++;
        if (arg0 > -9) {
            this.method249(-9);
        }
        return false;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 49)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        if (arg0 < -41) {
            field5550++;
            throw new IllegalStateException();
        }
    }
}
