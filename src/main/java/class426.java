import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class426 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lkn;")
    public static class442 field6083 = new class442();

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field6084 = 0;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field6085 = 0;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field6087 = -1;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
    public static void method2663(boolean arg0) {
        if (arg0) {
            method2663(false);
        }
        field6083 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILbr;II)V")
    public static final void method2664(int arg0, class223 arg1, int arg2, int arg3) {
        field6088++;
        class226 var4 = arg1.method1567((byte) 122, class59.field786);
        if (var4 == null) {
            return;
        }
        int var5 = 21 / ((57 - arg3) / 56);
        class59.field786.method937(arg2, arg0, arg1.field3250 + arg2, arg1.field3282 + arg0);
        if (class259.field3833 >= 3) {
            class59.field786.method871(-16777216, var4, arg2, arg0);
        } else {
            class366.field5235.method1773((float) arg1.field3250 / 2.0F + (float) arg2, (float) arg1.field3282 / 2.0F + (float) arg0, 4096, (int) (-class358.field5176) & 0x3FFF << 2, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V")
    public static final void method2665(int arg0, int arg1, int arg2) {
        field6086++;
        class276 var3 = class264.method1816((byte) -106, arg2, arg1);
        var3.method1876((byte) -123);
        var3.field3986 = arg0;
    }

    static {
        new class349(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }
}
