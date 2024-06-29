import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class498 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lww;")
    public static class288 field6963 = new class288(1, 2);

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
    public static boolean field6966 = false;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lmg;")
    public class498 field6962;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lmg;")
    public class498 field6964;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lsba;")
    public static class558 field6967;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V", line = 3)
    public final void method3012(int arg0) {
        field6969++;
        if (this.field6962 != null && arg0 > 97) {
            this.field6962.field6964 = this.field6964;
            this.field6964.field6962 = this.field6962;
            this.field6962 = null;
            this.field6964 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ldc;I)Ldja;", line = 24)
    public static final class18 method3013(class63 arg0, int arg1) {
        if (arg1 != -9662) {
            method3014(-27);
        }
        field6968++;
        return new class18(arg0.method496(-55), arg0.method496(-126), arg0.method496(arg1 ^ 0x2580), arg0.method496(arg1 + 9542), arg0.method496(arg1 ^ 0x25A6), arg0.method496(-120), arg0.method496(-73), arg0.method496(-125), arg0.method476((byte) 125), arg0.method505((byte) -119));
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V", line = 37)
    public static void method3014(int arg0) {
        field6963 = null;
        field6967 = null;
        if (arg0 != 142) {
            field6967 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)V", line = 55)
    public static final void method3015(int arg0) {
        class334.field4717 = null;
        class90.field1261 = null;
        field6965++;
        if (arg0 >= -73) {
            field6963 = null;
        }
    }
}
