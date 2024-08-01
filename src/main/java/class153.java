import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qe")
public class class153 extends RuntimeException {

    @OriginalMember(owner = "qe", name = "e", descriptor = "Ljava/lang/String;")
    public String field2915;

    @OriginalMember(owner = "qe", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2916;

    @OriginalMember(owner = "qe", name = "a", descriptor = "Llf;")
    public static class109 field2911 = class35.method275("<col=80ff00>", 2);

    @OriginalMember(owner = "qe", name = "h", descriptor = "Llf;")
    public static class109 field2918 = class35.method275("mn", 2);

    @OriginalMember(owner = "qe", name = "i", descriptor = "Llf;")
    public static class109 field2919 = class35.method275("p11_full", 2);

    @OriginalMember(owner = "qe", name = "d", descriptor = "Llf;")
    public static class109 field2914 = class35.method275(" loggt sich aus)3", 2);

    @OriginalMember(owner = "qe", name = "b", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "qe", name = "c", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "qe", name = "g", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "qe", name = "j", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "qe", name = "a", descriptor = "(III)V")
    public static final void method1048(int arg0, int arg1, int arg2) {
        field2917++;
        if (class178.field3349 != 0 && arg2 != -1) {
            class16.method111(0, -110, class178.field3349, arg2, false, class95.field1937);
            class36.field792 = true;
        }
        if (arg0 != 0) {
            method1050(29, null, null);
        }
    }

    @OriginalMember(owner = "qe", name = "a", descriptor = "(I)V")
    public static void method1049(int arg0) {
        if (arg0 != 95) {
            method1050(-60, null, null);
        }
        field2911 = null;
        field2918 = null;
        field2914 = null;
        field2919 = null;
    }

    @OriginalMember(owner = "qe", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class153(Throwable arg0, String arg1) {
        this.field2915 = arg1;
        this.field2916 = arg0;
    }

    @OriginalMember(owner = "qe", name = "a", descriptor = "(I[S[Llf;)V")
    public static final void method1050(int arg0, short[] arg1, class109[] arg2) {
        field2920++;
        class14.method93(0, arg1, arg2.length - 1, arg2, (byte) -127);
        if (arg0 != 27843) {
            method1048(29, -82, 105);
        }
    }
}
