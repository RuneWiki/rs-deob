import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class20 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lga;")
    public static class70 field257 = new class70("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Z")
    public static boolean field259 = false;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 4)
    public static void method218(int arg0) {
        if (arg0 != 4) {
            method220(62);
        }
        field257 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I", line = 15)
    public static final int method219(int arg0) {
        field256++;
        if (arg0 <= 51) {
            field259 = true;
        }
        return class114.field1404;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 36)
    public static final void method220(int arg0) {
        field258++;
        if (arg0 < -89) {
            class153.field1863 = true;
        }
    }
}
