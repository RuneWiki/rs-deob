import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class51 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Ljava/lang/String;")
    public static String field707 = " has logged out.";

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field709 = -1;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[S")
    public static short[] field712 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    public static int[] field708 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)[B")
    public abstract byte[] method374(byte arg0);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static final void method375(int arg0) {
        class136.field1985.method1420(-1);
        field711++;
        class125.field1858.method1420(arg0 + 10303);
        if (arg0 == -10304) {
            class53.field729.method1420(-1);
            class149.field2212.method1420(-1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Lrb;")
    public static final class268 method376(int arg0) {
        field705++;
        if (arg0 != -23163) {
            method376(46);
        }
        try {
            return (class268) Class.forName("ub").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[B)V")
    public abstract void method377(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method378(byte arg0) {
        field707 = null;
        field712 = null;
        if (arg0 != 59) {
            method376(-40);
        }
        field708 = null;
    }
}
