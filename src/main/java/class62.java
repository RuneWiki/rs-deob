import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class62 {

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Lbd;")
    public static class44 field1084 = new class44("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "[I")
    public static int[] field1087 = new int[4096];

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "[I")
    public static int[] field1085;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 4)
    public static void method515(int arg0) {
        field1085 = null;
        field1087 = null;
        field1084 = null;
        if (arg0 < 109) {
            method515(106);
        }
    }
}
