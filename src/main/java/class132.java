import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class132 {

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field2218;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2213 = -1;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Los;")
    public static class309 field2214 = new class309("K", "T", "K", "K");

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method1014(byte arg0) {
        if (arg0 != 73) {
            field2213 = 113;
        }
        field2214 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)Lme;")
    public final class132 method1015(byte arg0, int arg1) {
        field2212++;
        if (arg0 != 34) {
            this.method1015((byte) -2, 71);
        }
        return new class132(this.field2216, arg1, this.field2218, this.field2215);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIII)V")
    public class132(int arg0, int arg1, int arg2, int arg3) {
        this.field2216 = arg0;
        this.field2215 = arg3;
        this.field2218 = arg2;
        this.field2217 = arg1;
    }
}
