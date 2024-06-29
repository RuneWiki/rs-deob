import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class512 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    private int field6838;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lne;")
    private class294 field6842;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field6841;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public int field6844;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lea;")
    public static class512 field6843 = new class512(0, 3, class294.field4164);

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lea;")
    public static class512 field6845 = new class512(1, 3, class294.field4164);

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Lea;")
    public static class512 field6846 = new class512(2, 4, class294.field4160);

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lea;")
    public static class512 field6847 = new class512(3, 1, class294.field4164);

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lea;")
    public static class512 field6848 = new class512(4, 2, class294.field4164);

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lea;")
    public static class512 field6849 = new class512(5, 3, class294.field4164);

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lea;")
    private static class512 field6850 = new class512(6, 4, class294.field4164);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field6851 = class364.method2153((byte) -37, 16);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;BZLjava/lang/String;)V")
    public static final void method2848(String arg0, byte arg1, boolean arg2, String arg3) {
        class679.field9577 = arg2;
        class449.field6163 = arg0;
        field6836++;
        class509.field6793 = arg3;
        if (!class679.field9577 && class173.field2675 != 3 && (class449.field6163.equals("") || class509.field6793.equals(""))) {
            class218.method1384((byte) -128, 3);
            return;
        }
        class627.field8464 = false;
        if (class173.field2675 != 1) {
            class625.field8358 = 0;
            class371.field5014 = -1;
        }
        class218.method1384((byte) -128, -3);
        class3.field30 = 0;
        class139.field2251 = 1;
        class276.field3863 = 0;
        if (arg1 != -115) {
            field6850 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)[Lea;")
    public static final class512[] method2849(byte arg0) {
        field6839++;
        return arg0 == -114 ? new class512[] { field6843, field6845, field6846, field6847, field6848, field6849, field6850 } : null;
    }

    @OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6840++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IILne;)V")
    private class512(int arg0, int arg1, class294 arg2) {
        this.field6838 = arg1;
        this.field6842 = arg2;
        this.field6841 = arg0;
        this.field6844 = this.field6842.field4155 * this.field6838;
        if (this.field6841 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static void method2850(byte arg0) {
        field6845 = null;
        field6847 = null;
        field6848 = null;
        field6849 = null;
        field6843 = null;
        field6846 = null;
        if (arg0 == -50) {
            field6850 = null;
        }
    }
}
