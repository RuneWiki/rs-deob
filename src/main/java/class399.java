import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class399 {

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Lvo;")
    private class345 field5772;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lvo;")
    private class345 field5769;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lcv;")
    private class22 field5765;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lvo;")
    public static class345 field5766;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lvo;")
    public static class345 field5771;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lll;")
    public static class490 field5763;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lf;")
    public static class257[] field5770;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Lcv;", line = 11)
    private final class22 method2422(byte arg0) {
        if (arg0 > -93) {
            return null;
        }
        if (this.field5765 == null) {
            this.field5765 = new class22();
        }
        field5764++;
        return this.field5765;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BI)Z", line = 26)
    public static final boolean method2423(byte[] arg0, int arg1) {
        field5773++;
        class465 var2 = new class465(arg0);
        int var3 = var2.method2705(-127);
        if (arg1 <= 92) {
            field5763 = null;
        }
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method2705(-26) == 1;
        if (var4) {
            class121.method977(false, var2);
        }
        class244.method1571(var2, (byte) 38);
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V", line = 52)
    public static final void method2424(byte arg0) {
        field5767++;
        if (class237.field3503) {
            return;
        }
        class479.method2806(class608.field8743, 21357);
        if (arg0 == 42) {
            if (class667.field9371 != null) {
                class479.method2806(class667.field9371, arg0 + 21315);
            }
            class237.field3503 = true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lan;B)Lgs;", line = 77)
    public final class389 method2425(class169 arg0, byte arg1) {
        field5768++;
        if (arg0 == null) {
            return null;
        }
        class696 var3 = arg0.method726(-17);
        if (class258.field3707 == var3) {
            return new class360((class153) arg0);
        }
        if (arg1 != -98) {
            field5766 = null;
        }
        if (class152.field2540 == var3) {
            return new class405(this.method2422((byte) -122), (class433) arg0);
        } else if (class126.field2066 == var3) {
            return new class210(this.field5769, (class609) arg0);
        } else if (class694.field9863 == var3) {
            return new class43(this.field5769, (class695) arg0);
        } else if (class37.field491 == var3) {
            return new class562(this.field5769, this.field5772, (class533) arg0);
        } else if (class583.field8543 == var3) {
            return new class228(this.field5769, this.field5772, (class340) arg0);
        } else if (class584.field8558 == var3) {
            return new class572(this.field5769, this.field5772, (class199) arg0);
        } else if (class329.field4557 == var3) {
            return new class132(this.field5769, this.field5772, (class96) arg0);
        } else if (class333.field4636 == var3) {
            return new class248(this.field5769, (class352) arg0);
        } else if (class484.field6905 == var3) {
            return new class549(this.field5769, this.field5772, (class580) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 129)
    public static void method2426(int arg0) {
        if (arg0 < 103) {
            field5770 = null;
        }
        field5771 = null;
        field5763 = null;
        field5770 = null;
        field5766 = null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lvo;Lvo;)V", line = 142)
    public class399(class345 arg0, class345 arg1) {
        this.field5772 = arg1;
        this.field5769 = arg0;
    }
}
