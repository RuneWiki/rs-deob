import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class39 implements class46 {

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "Lrf;")
    public static class74 field728 = new class74();

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "[[I")
    public static int[][] field730 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Lhq;")
    public static class142 field729 = new class142("LIVE", 0);

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "[I")
    public static int[] field732 = new int[1000];

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "F")
    public static float field727;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "Lkf;")
    public static class230 field731;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "[Lf;")
    public static class701[] field723;

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
    public class39(int arg0) {
        this.field724 = arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public static void method446(int arg0) {
        if (arg0 != 0) {
            field729 = null;
        }
        field732 = null;
        field728 = null;
        field730 = null;
        field729 = null;
        field723 = null;
        field731 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLn;Ln;)V")
    public static final void method447(byte arg0, class17 arg1, class17 arg2) {
        field725++;
        class183.field2247++;
        class543 var3 = class299.method1780(class84.field1196, class454.field6391, 124);
        var3.field7872.method2233((byte) 73, arg1.field465);
        if (arg0 != -111) {
            return;
        }
        var3.field7872.method2261((byte) 83, arg2.field412);
        var3.field7872.method2261((byte) 80, arg2.field485);
        var3.field7872.method2256(arg1.field485, 2);
        var3.field7872.method2222(arg1.field412, -17414);
        var3.field7872.method2267(arg2.field465, -1358200824);
        class511.method3028(7482, var3);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)Lsq;")
    public final class161 method448(byte arg0) {
        field726++;
        return arg0 == 25 ? class9.field91 : null;
    }
}
