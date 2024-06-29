import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class231 {

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lhj;")
    private static class69 field4225 = class181.method1318("Loaded sprites", (byte) -109);

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lhj;")
    public static class69 field4222 = field4225;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lhj;")
    private static class69 field4221 = class181.method1318("Members only world", (byte) -111);

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Lhj;")
    public static class69 field4223 = field4221;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lka;")
    public static class243 field4224 = new class243();

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field4229 = -1;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "[Lsi;")
    public static class192[] field4228 = new class192[500];

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lhj;")
    public static class69 field4230 = class181.method1318("::fpsoff", (byte) -120);

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Z")
    public static final boolean method1648(int arg0, int arg1) {
        if (arg0 == 500) {
            field4226++;
            return (-arg1 & arg1) == arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method1649(int arg0) {
        field4230 = null;
        field4225 = null;
        field4224 = null;
        field4223 = null;
        field4221 = null;
        if (arg0 != 500) {
            field4225 = null;
        }
        field4228 = null;
        field4222 = null;
    }
}
