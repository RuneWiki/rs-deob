import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class99 extends class339 {

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field1198 = 0;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "[Lf;")
    public static class532[] field1196;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "[Lsf;")
    public static class602[] field1197;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z")
    public abstract boolean method560(int arg0);

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V")
    public class99(int arg0) {
        this.field1195 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method561(boolean arg0);

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    public static final void method562(byte arg0) {
        field1194++;
        class124.field1729 = new class423[class419.field5508.method1933(-113)][];
        class651.field9139 = new class423[class419.field5508.method1933(-125)][];
        if (arg0 < -107) {
            class4.field29 = new boolean[class419.field5508.method1933(-114)];
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    public static void method563(byte arg0) {
        field1197 = null;
        if (arg0 < 63) {
            method562((byte) 12);
        }
        field1196 = null;
    }
}
