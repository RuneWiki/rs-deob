import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class429 extends class476 {

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public int field6226;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field6224 = 0;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "Ldk;")
    public static class421 field6227;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(B)V")
    public static void method2557(byte arg0) {
        field6227 = null;
        if (arg0 < 53) {
            method2557((byte) -122);
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(II)V")
    public class429(int arg0, int arg1) {
        this.field6228 = arg1;
        this.field6226 = arg0;
    }
}
