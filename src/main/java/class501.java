import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class501 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "[[I")
    public static int[][] field7164 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field7165 = -1;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Leq;")
    public static class209 field7161;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Ljp;", line = 10)
    public static final class354 method3012(int arg0, int arg1, int arg2) {
        field7162++;
        class354 var3 = (class354) class575.field8148.method4203(true, (long) arg1 << 32 | (long) arg0);
        if (var3 == null) {
            var3 = new class354(arg1, arg0);
            class575.field8148.method4211(var3, (byte) 25, var3.field8991);
        }
        if (arg2 != 2145997216) {
            field7164 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 31)
    public static void method3013(byte arg0) {
        field7161 = null;
        if (arg0 >= -122) {
            field7165 = -123;
        }
        field7164 = null;
    }
}
