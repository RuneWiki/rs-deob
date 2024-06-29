import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class27 {

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Z")
    public boolean field386;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[[I")
    public static int[][] field387 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Leu;")
    public class175 field380;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Leu;")
    public class175 field381;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Llp;")
    public static class69 field385;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Z")
    public boolean field384;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
    public final boolean method261(int arg0) {
        if (arg0 == 4) {
            field383++;
            return this.field384 && !this.field386;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static void method262(int arg0) {
        if (arg0 >= 119) {
            field387 = null;
            field385 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method263(byte arg0) {
        field382++;
        if (this.field380 != null) {
            this.field380.method231((byte) -105);
        }
        if (arg0 < -38) {
            this.field384 = false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Z)V")
    public class27(boolean arg0) {
        this.field386 = arg0;
    }
}
