import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class182 {

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[S")
    public static short[] field2974 = new short[256];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[Lmi;")
    public static class88[] field2972;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method1197(int arg0) {
        field2974 = null;
        int var1 = 43 % ((arg0 - 60) / 44);
        field2972 = null;
    }
}
