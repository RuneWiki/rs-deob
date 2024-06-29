import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class537 {

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
    public static int field7496 = 0;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "F")
    public static float field7497;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public int field7491;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public int field7492;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public int field7494;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "Lae;")
    public static class40 field7493;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "Z")
    public boolean field7490;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V", line = 12)
    public static void method3024(byte arg0) {
        field7493 = null;
        if (arg0 >= -51) {
            method3024((byte) -19);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)V", line = 22)
    public static final void method3025(boolean arg0, int arg1) {
        field7495++;
        if (class543.method3045(arg1, -29039)) {
            class308.method1916(class177.field2593[arg1], 0, -1);
            if (arg0) {
                method3024((byte) -122);
            }
        }
    }
}
