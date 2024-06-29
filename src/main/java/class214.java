import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class214 {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lqs;")
    public static class605 field3017 = new class605();

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[[I")
    public static int[][] field3023 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lju;")
    public static class102 field3019 = new class102(8, 7);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IC)Z")
    public static final boolean method1412(int arg0, char arg1) {
        field3018++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (~arg1 != arg0) {
            char[] var2 = class647.field9172;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(II)V")
    public class214(int arg0, int arg1) {
        this.field3020 = arg1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method1413(int arg0) {
        if (arg0 < 38) {
            field3023 = null;
        }
        field3017 = null;
        field3019 = null;
        field3023 = null;
    }

    @OriginalMember(owner = "client!ag", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3022++;
        throw new IllegalStateException();
    }
}
