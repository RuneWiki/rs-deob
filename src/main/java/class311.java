import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class311 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field4843 = -1;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[S")
    public static short[] field4846 = new short[256];

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field4847 = -2;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/lang/Thread;")
    public static Thread field4844;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 19)
    public static void method2151(int arg0) {
        field4846 = null;
        if (arg0 != -2) {
            method2151(57);
        }
        field4844 = null;
    }
}
