import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class736 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Z")
    public boolean field10172;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field10175 = 1403;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field10180 = -1;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field10181 = 0;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "F")
    public static float field10182;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field10176;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Lrh;")
    public class268 field10173;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "Lrh;")
    public class268 field10178;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Lcv;")
    public static class569 field10177;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "Z")
    public boolean field10174;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)Z")
    public final boolean method4109(boolean arg0) {
        field10179++;
        if (!arg0) {
            field10177 = null;
        }
        return this.field10174 && !this.field10172;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    public static void method4110(byte arg0) {
        if (arg0 != 90) {
            field10181 = -111;
        }
        field10177 = null;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Z)V")
    public class736(boolean arg0) {
        this.field10172 = arg0;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
    public final void method4111(byte arg0) {
        int var2 = -101 / ((71 - arg0) / 45);
        field10176++;
        if (this.field10173 != null) {
            this.field10173.method588(false);
        }
        this.field10174 = false;
    }
}
