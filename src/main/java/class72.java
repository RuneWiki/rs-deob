import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class72 {

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Lcq;")
    public class464 field1286;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[Lww;")
    public static class729[] field1281 = new class729[4];

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[[I")
    public static int[][] field1285 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Leq;")
    public static class209 field1283;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Lkq;")
    public static class590 field1280;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public abstract void method55(int arg0);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
    public abstract void method59(int arg0, int arg1);

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)I")
    public abstract int method58(int arg0, int arg1);

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)V")
    public final void method733(int arg0, int arg1) {
        int var3 = 7 / ((60 - arg1) / 51);
        field1284++;
        if (this.method58(arg0, 11260) != 3) {
            this.method59(arg0, 3);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)I")
    public abstract int method60(int arg0);

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lcq;)V")
    public class72(class464 arg0) {
        this.field1286 = arg0;
        this.field1282 = this.method60(-3271);
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public static void method734(int arg0) {
        field1280 = null;
        int var1 = -57 / (arg0 / 47);
        field1281 = null;
        field1283 = null;
        field1285 = null;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(ILcq;)V")
    public class72(int arg0, class464 arg1) {
        this.field1286 = arg1;
        this.field1282 = arg0;
    }
}
