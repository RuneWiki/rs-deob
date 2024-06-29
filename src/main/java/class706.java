import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class706 extends class287 {

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Lju;")
    public static class102 field9851 = new class102(71, 2);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "[[[J")
    public static long[][][] field9852;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method3972(int arg0) {
        field9851 = null;
        if (arg0 == 9468) {
            field9852 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public static final void method3973(int arg0) {
        if (arg0 != 12201) {
            field9852 = null;
        }
        field9849++;
        class334.method1933();
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
    public static final void method3974(int arg0) {
        class202.field2911.method3210(false);
        field9850++;
        if (arg0 > -53) {
            method3972(47);
        }
    }
}
