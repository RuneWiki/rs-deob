import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[Llp;")
    public static class267[] field246 = new class267[14];

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method191(byte arg0) {
        field246 = null;
        if (arg0 >= -122) {
            method191((byte) -97);
        }
    }
}
