import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class351 extends class465 {

    @OriginalMember(owner = "client!ij", name = "Pb", descriptor = "[I")
    public static int[] field4937 = new int[200];

    @OriginalMember(owner = "client!ij", name = "Ob", descriptor = "Ljn;")
    public static class117 field4936 = new class117(10);

    @OriginalMember(owner = "client!ij", name = "Mb", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ij", name = "Nb", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZF)V")
    public final void method2129(boolean arg0, float arg1) {
        if (arg0) {
            this.method2130(-1.2169781F, false);
        }
        ++field4934;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field6719[super.field6710++] = (byte) var3;
        super.field6719[super.field6710++] = (byte) (var3 >> 8);
        super.field6719[super.field6710++] = (byte) (var3 >> 16);
        super.field6719[super.field6710++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(FZ)V")
    public final void method2130(float arg0, boolean arg1) {
        ++field4935;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field6719[super.field6710++] = (byte) (var3 >> 24);
        super.field6719[super.field6710++] = (byte) (var3 >> 16);
        if (arg1) {
            this.method2130(-1.7546228F, false);
        }
        super.field6719[super.field6710++] = (byte) (var3 >> 8);
        super.field6719[super.field6710++] = (byte) var3;
    }

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "(B)V")
    public static void method2131(byte arg0) {
        field4936 = null;
        if (arg0 == -114) {
            field4937 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(I)V")
    public class351(int arg0) {
        super(arg0);
    }
}
