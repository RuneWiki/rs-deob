import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class736 extends class461 {

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "Lde;")
    public static class534 field10231 = new class534(8);

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public static int field10230;

    @OriginalMember(owner = "client!fm", name = "Gb", descriptor = "I")
    public static int field10232;

    @OriginalMember(owner = "client!fm", name = "Hb", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!fm", name = "Ib", descriptor = "I")
    public static int field10234;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(FB)V")
    public final void method4102(float arg0, byte arg1) {
        if (arg1 == -56) {
            ++field10233;
            int var3 = Stream.floatToRawIntBits(arg0);
            super.field6180[super.field6193++] = (byte) (var3 >> 24);
            super.field6180[super.field6193++] = (byte) (var3 >> 16);
            super.field6180[super.field6193++] = (byte) (var3 >> 8);
            super.field6180[super.field6193++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(I)V")
    public class736(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "(I)V")
    public static void method4103(int arg0) {
        field10231 = null;
        if (arg0 != 752534248) {
            field10230 = 71;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IF)V")
    public final void method4104(int arg0, float arg1) {
        ++field10232;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field6180[super.field6193++] = (byte) var3;
        super.field6180[super.field6193++] = (byte) (var3 >> 8);
        super.field6180[super.field6193++] = (byte) (var3 >> 16);
        if (arg0 == 1482486504) {
            super.field6180[super.field6193++] = (byte) (var3 >> 24);
        }
    }
}
