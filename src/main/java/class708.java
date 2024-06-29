import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class708 extends class126 {

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public int field9827;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "[[I")
    public static int[][] field9829 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field9828 = 0;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "Lul;")
    public static class486 field9831 = new class486("", 17);

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lada;Loe;IIIIIIIIIIIIII)V", line = 8)
    public class708(class267 arg0, class15 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field9827 = arg15;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lsha;I)Lsha;", line = 16)
    public static final class115 method3991(class115 arg0, int arg1) {
        field9826++;
        if (arg0.field1436 != -1) {
            return class384.method2387(false, arg0.field1436);
        }
        int var2 = arg0.field1446 >>> 16;
        if (arg1 != 2) {
            method3991(null, -29);
        }
        class58 var3 = new class58(class278.field3993);
        for (class610 var4 = (class610) var3.method479((byte) 116); var4 != null; var4 = (class610) var3.method476(-1)) {
            if (var4.field8600 == var2) {
                return class384.method2387(false, (int) var4.field762);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lof;", line = 46)
    public final class475 method473(int arg0) {
        if (arg0 == 6) {
            field9830++;
            return class696.field9705;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 63)
    public static void method3992(boolean arg0) {
        if (arg0) {
            field9831 = null;
            field9829 = null;
        }
    }
}
