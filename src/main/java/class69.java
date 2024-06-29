import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class69 {

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "Lqs;")
    public static class559 field1243 = new class559();

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "Lnea;")
    public static class664 field1244 = new class664(96, 6);

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "Lgaa;")
    public static class267 field1245 = new class267();

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V", line = 26)
    public static void method678(byte arg0) {
        if (arg0 > 103) {
            field1245 = null;
            field1244 = null;
            field1243 = null;
        }
    }
}
