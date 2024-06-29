import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class278 {

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public int field4191;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field4195;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public int field4189;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field4190 = 0;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Ls;")
    public static class186 field4194 = new class186(60, -1);

    @OriginalMember(owner = "client!je", name = "j", descriptor = "F")
    public static float field4197;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4188;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZ)V", line = 7)
    public static final void method1749(int arg0, int arg1, boolean arg2) {
        field4192++;
        if (arg0 > -114) {
            field4188 = null;
        }
        class11 var3 = class271.method1714(arg1, 0, arg2);
        if (var3 != null) {
            var3.method1676(true);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 26)
    public static void method1750(boolean arg0) {
        field4194 = null;
        if (arg0) {
            field4188 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "toString", descriptor = "()Ljava/lang/String;", line = 43)
    public final String toString() {
        field4196++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIII)V", line = 58)
    public class278(int arg0, int arg1, int arg2, int arg3) {
        this.field4191 = arg3;
        this.field4193 = arg0;
        this.field4195 = arg2;
        this.field4189 = arg1;
    }
}
