import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class616 extends class551 {

    @OriginalMember(owner = "client!aw", name = "Bb", descriptor = "Lwg;")
    public static class58 field8878 = new class58(8);

    @OriginalMember(owner = "client!aw", name = "Eb", descriptor = "Lim;")
    public static class353 field8881 = new class353(7, -1);

    @OriginalMember(owner = "client!aw", name = "Cb", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!aw", name = "Db", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(FI)V")
    public final void method3529(float arg0, int arg1) {
        if (arg1 > -29) {
            this.method3531(115, -0.77003944F);
        }
        ++field8879;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field7693[super.field7707++] = (byte) var3;
        super.field7693[super.field7707++] = (byte) (var3 >> 8);
        super.field7693[super.field7707++] = (byte) (var3 >> 16);
        super.field7693[super.field7707++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "(B)V")
    public static void method3530(byte arg0) {
        if (arg0 >= -104) {
            method3530((byte) 54);
        }
        field8878 = null;
        field8881 = null;
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(I)V")
    public class616(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IF)V")
    public final void method3531(int arg0, float arg1) {
        ++field8880;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field7693[super.field7707++] = (byte) (var3 >> 24);
        if (arg0 != 1448476952) {
            this.method3531(123, -0.062363848F);
        }
        super.field7693[super.field7707++] = (byte) (var3 >> 16);
        super.field7693[super.field7707++] = (byte) (var3 >> 8);
        super.field7693[super.field7707++] = (byte) var3;
    }
}
