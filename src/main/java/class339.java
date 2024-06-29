import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class339 {

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public int field4933;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public int field4932;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Lgq;")
    public class339 field4931;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "Lgs;")
    public class33 field4940;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "Lph;")
    public static class438 field4941 = new class438("LIVE", 0);

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field4942 = 0;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public int field4936;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)Ldj;")
    public final class218 method2056(boolean arg0) {
        field4943++;
        if (!arg0) {
            this.field4936 = 11;
        }
        return class74.method493(!arg0, this.field4932);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public static void method2057(byte arg0) {
        field4941 = null;
        if (arg0 != 111) {
            method2059(-32, -79, 63);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Lgq;")
    public final class339 method2058(int arg0, int arg1) {
        if (arg1 < 108) {
            return null;
        } else {
            field4935++;
            return new class339(this.field4932, arg0);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
    public static final boolean method2059(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field4942 = -117;
        }
        field4934++;
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)I")
    public static final int method2060(int arg0, int arg1) {
        return class285.field4073 == null ? 0 : class285.field4073[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(II)V")
    public class339(int arg0, int arg1) {
        this.field4933 = arg1;
        this.field4932 = arg0;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lgq;I)V")
    public class339(class339 arg0, int arg1) {
        this.field4931 = arg0;
        this.field4933 = this.field4931.field4933 + arg1;
        this.field4932 = this.field4931.field4932;
        this.field4940 = this.field4931.field4940;
    }
}
