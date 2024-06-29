import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class306 extends class529 {

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    private int field3933;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "Lqi;")
    public static class669 field3931 = new class669(2, 2);

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "Z")
    public static boolean field3936 = false;

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "F")
    public static float field3937;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBLtn;)V", line = 4)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field3935;
        if (~arg0 == -1) {
            this.field3933 = (arg2.method1094(255) << 12) / 255;
        }
        if (arg1 < 45) {
            this.method190(-96, (byte) 102, (class179) null);
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I)V", line = 32)
    public class306(int arg0) {
        super(0, true);
        this.field3933 = 4096;
        this.field3933 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)[I", line = 40)
    public final int[] method191(int arg0, byte arg1) {
        ++field3932;
        int[] var3 = super.field7456.method1635(arg0, -81);
        int var4 = -112 / ((arg1 - 27) / 49);
        if (super.field7456.field3449) {
            class617.method3388(var3, 0, class304.field3909, this.field3933);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V", line = 62)
    public static final void method1802(int arg0) {
        class102.field1258 = -1;
        class333.field4292 = -1;
        if (arg0 < -86) {
            ++field3934;
            class721.field10159 = -1;
            class67.field886 = 0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)V", line = 80)
    public static void method1803(int arg0) {
        if (arg0 != -1) {
            method1802(27);
        }
        field3931 = null;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V", line = 91)
    public class306() {
        this(4096);
    }
}
