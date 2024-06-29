import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class640 extends class155 {

    @OriginalMember(owner = "client!cia", name = "t", descriptor = "F")
    public static float field8809;

    @OriginalMember(owner = "client!cia", name = "m", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!cia", name = "n", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!cia", name = "o", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!cia", name = "p", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!cia", name = "q", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!cia", name = "r", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!cia", name = "s", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!cia", name = "u", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!cia", name = "v", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method250(int arg0) {
        int var2 = -95 % ((arg0 - -8) / 41);
        ++field8804;
        return true;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ZZ)V", line = 17)
    public final void method257(boolean arg0, boolean arg1) {
        if (!arg0) {
            ++field8806;
        }
    }

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "(I)V", line = 29)
    public final void method255(int arg0) {
        ++field8808;
        super.field2533.method3115(false, -25);
        if (arg0 > -119) {
            field8803 = -36;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIB)V", line = 44)
    public final void method254(int arg0, int arg1, byte arg2) {
        ++field8807;
        if (arg2 != -92) {
            field8802 = -46;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lbr;II)V", line = 54)
    public final void method259(class416 arg0, int arg1, int arg2) {
        if (arg1 > -71) {
            this.method254(-98, 88, (byte) -64);
        }
        super.field2533.method3090(arg0, (byte) -94);
        ++field8811;
        super.field2533.method3113(-3334, arg2);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IZ)V", line = 66)
    public final void method258(int arg0, boolean arg1) {
        super.field2533.method3115(true, -25);
        if (arg0 == 205) {
            ++field8805;
        }
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Lsf;)V", line = 77)
    public class640(class551 arg0) {
        super(arg0);
    }
}
