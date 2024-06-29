import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class284 {

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public int field4886;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "[S")
    public short[] field4884;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[S")
    public short[] field4878;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[B")
    public byte[] field4885;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "[I")
    public int[] field4880;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[Lcd;")
    public class64[] field4887;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lcd;")
    public static class64 field4881 = class44.method335((byte) 71, ")1o");

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[Lfk;")
    public static class41[] field4888 = new class41[2048];

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 18)
    public static void method1971(boolean arg0) {
        field4888 = null;
        if (arg0) {
            field4881 = (class64) null;
        }
        field4881 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)I", line = 29)
    public final int method1972(int arg0, byte arg1) {
        if (arg1 != 15) {
            this.method1972(-32, (byte) -120);
        }
        field4882++;
        return this.field4885[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z", line = 51)
    public final boolean method1973(int arg0, int arg1) {
        field4879++;
        if (arg1 != 4) {
            this.field4878 = (short[]) null;
        }
        return (this.field4885[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V", line = 71)
    public class284(int arg0) {
        this.field4886 = arg0;
        this.field4884 = new short[this.field4886];
        this.field4878 = new short[this.field4886];
        this.field4885 = new byte[this.field4886];
        this.field4880 = new int[this.field4886];
        this.field4887 = new class64[this.field4886];
    }
}
