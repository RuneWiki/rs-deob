import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class212 extends class156 {

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "Ljava/lang/Object;")
    private Object field3645;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "Lr;")
    public static class66 field3640 = class93.method641(43, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "Lr;")
    public static class66 field3639 = class93.method641(43, "<img=1>");

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "Lr;")
    public static class66 field3641 = class93.method641(43, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "Z")
    public static boolean field3647 = true;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "Lr;")
    private static class66 field3649 = class93.method641(43, "Discard");

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "Lr;")
    public static class66 field3642 = field3649;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "[Loi;")
    public static class56[] field3648;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)Z")
    public final boolean method104(int arg0) {
        field3635++;
        int var2 = -40 % ((-arg0 - 43) / 62);
        return false;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
    public static void method1370(int arg0) {
        field3641 = null;
        field3642 = null;
        field3649 = null;
        field3639 = null;
        field3640 = null;
        if (arg0 != -840517817) {
            method1370(43);
        }
        field3648 = null;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(II)I")
    public static final int method1371(int arg0, int arg1) {
        field3643++;
        if (arg1 != -840517817) {
            method1371(71, 80);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method103(int arg0) {
        if (arg0 >= -49) {
            return null;
        } else {
            field3646++;
            return this.field3645;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[Lr;)Lr;")
    public static final class66 method1372(int arg0, class66[] arg1) {
        field3644++;
        if (arg0 > arg1.length) {
            throw new IllegalArgumentException();
        }
        return class256.method1714(true, 0, arg1, arg1.length);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class212(Object arg0) {
        this.field3645 = arg0;
    }
}
