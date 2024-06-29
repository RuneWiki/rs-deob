import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class680 {

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "I")
    public int field9661;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "Leea;")
    public static class680 field9660 = new class680(1);

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "Leea;")
    public static class680 field9662 = new class680(2);

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "Leea;")
    public static class680 field9663 = new class680(4);

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "Leea;")
    public static class680 field9664 = new class680(1);

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "Leea;")
    public static class680 field9665 = new class680(2);

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "Leea;")
    public static class680 field9666 = new class680(4);

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "Leea;")
    public static class680 field9667 = new class680(2);

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "Leea;")
    public static class680 field9668 = new class680(4);

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "Ljj;")
    public static class398 field9669 = new class398(9, 7);

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "F")
    public static float field9670;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!eea", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field9659++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V", line = 15)
    public static void method3756(int arg0) {
        field9662 = null;
        field9666 = null;
        if (arg0 != 4) {
            field9664 = null;
        }
        field9663 = null;
        field9664 = null;
        field9668 = null;
        field9667 = null;
        field9669 = null;
        field9665 = null;
        field9660 = null;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V", line = 33)
    private class680(int arg0) {
        this.field9661 = arg0;
    }
}
