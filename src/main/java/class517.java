import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class517 {

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "Lpr;")
    public class312 field7487 = new class312();

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "Z")
    public boolean field7493 = false;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field7489 = 1;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Ldq;")
    public static class493 field7486 = new class493(98, -2);

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field7490 = new String[200];

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public int field7491;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public int field7492;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static final void method3085(int arg0) {
        class392.field5265.method2642(arg0 ^ arg0);
        field7488++;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Z")
    public static final boolean method3086(int arg0) {
        field7485++;
        if (arg0 != 1723) {
            method3086(36);
        }
        return class2.field24 > 0;
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
    public static void method3087(int arg0) {
        field7486 = null;
        field7490 = null;
        if (arg0 != 353) {
            method3086(-28);
        }
    }
}
