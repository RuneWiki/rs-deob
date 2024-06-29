import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class24 {

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lid;")
    private class92 field389;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[S")
    public static short[] field390 = new short[] { 30, 58, 29, 45, 37, 16, 1, 50 };

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Li;")
    private static class88 field391 = class208.method1425(105, "Loaded interfaces");

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Li;")
    public static class88 field392 = field391;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Lid;")
    public static class92 field388 = new class92(16);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Li;")
    public static class88 field393 = class208.method1425(105, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Li;")
    private static class88 field394 = class208.method1425(105, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Li;")
    public static class88 field395 = field394;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IJLnc;)V")
    public final void method130(int arg0, long arg1, class145 arg2) {
        if (arg0 == 37) {
            field382++;
            this.field389.method664(arg1, new class101(arg2), false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static final void method131(boolean arg0) {
        if (arg0) {
            class62.field1137 = class154.field2981;
            class29.field489 = class78.field1416;
        } else {
            class62.field1137 = class145.field2723;
            class29.field489 = class14.field211;
        }
        class11.field152 = class29.field489.length;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static void method132(byte arg0) {
        field394 = null;
        field388 = null;
        field395 = null;
        field391 = null;
        field390 = null;
        field393 = null;
        if (arg0 < -58) {
            field392 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V")
    public class24(int arg0) {
        this.field389 = new class92(arg0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZJ)V")
    public final void method133(boolean arg0, long arg1) {
        this.field389.method667(true, arg1);
        if (!arg0) {
            field385++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public final void method134(int arg0) {
        this.field389.method671(126);
        field386++;
        if (arg0 != 50) {
            method131(true);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IJ)Lnc;")
    public final class145 method135(int arg0, long arg1) {
        if (arg0 >= -96) {
            return null;
        } else {
            field387++;
            class101 var4 = (class101) this.field389.method666(arg1, 0);
            return var4 == null ? null : var4.field1831;
        }
    }
}
