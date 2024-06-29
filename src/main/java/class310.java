import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class310 extends class80 {

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "Lcd;")
    public static class208 field4693 = new class208("", 14);

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "[[I")
    public static int[][] field4696 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
    public static int field4697 = -1;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "[[[Lak;")
    public static class234[][][] field4698;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(IZ)I", line = 4)
    public static final int method1979(int arg0, boolean arg1) {
        field4694++;
        return arg1 ? -116 : arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 15)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)[I", line = 18)
    public final int[] method25(int arg0, int arg1) {
        field4695++;
        return arg1 == -16828 ? class460.field6860 : null;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V", line = 29)
    public static void method1980(int arg0) {
        field4698 = null;
        field4696 = null;
        field4693 = null;
        if (arg0 != 7) {
            method1979(39, false);
        }
    }
}
