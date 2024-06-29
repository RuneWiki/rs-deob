import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class465 {

    @OriginalMember(owner = "client!os", name = "b", descriptor = "[Lji;")
    public static class635[] field6548 = new class635[37];

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[[I")
    public static int[][] field6549 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;II)Lsga;")
    public static final class74 method2782(String arg0, int arg1, int arg2) {
        field6550++;
        class74 var3;
        try {
            var3 = (class74) Class.forName("fh").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class279();
        }
        var3.field849 = arg0;
        if (arg1 > -114) {
            field6548 = null;
        }
        var3.field848 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)I")
    public static final int method2783(int arg0, int arg1) {
        return class190.field2943 == null ? 0 : class190.field2943[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
    public static void method2784(boolean arg0) {
        field6549 = null;
        if (arg0) {
            method2784(true);
        }
        field6548 = null;
    }
}
