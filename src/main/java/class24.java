import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class24 extends class232 {

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    private int field354 = -32768;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Ljava/lang/String;")
    public static String field341 = "Created gameworld";

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "[I")
    public static int[] field348 = new int[] { 0, 12, 6, 6, 0, -2, -2, 0, 0, 0, 0, 3, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, 0, -1, 8, 10, 0, 1, 0, 0, 2, 1, 3, 0, 0, 0, -1, -1, 0, 0, 7, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 4, 15, 9, 0, 0, 0, 0, 0, 5, 0, 0, 0, -2, 0, -1, 0, 0, 0, 2, 0, -1, 0, 0, 7, 6, 3, 0, 0, -1, -1, 6, 10, -2, 0, 0, -2, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 14, 11, 0, 0, 14, 0, 0, 0, 0, 0, 3, 3, 0, 2, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 17, 0, 0, 0, 0, 0, 0, 8, 0, -1, 8, 8, 0, 7, 8, 0, 0, -2, 8, 4, 8, 1, 0, -1, 0, 6, 0, 1, 2, 6, 0, 6, 0, 0, 4, 0, 0, 0, 5, 0, -1, 0, 20, 1, 0, -1, 3, 0, 0, 4, -2, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, 12, 0, 0, 0, 0, 0, 0, 0, 6, 0, 28, 5, 0, 0, 8, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, -2, 0, 0, 0, 0, 0, 0, 7, 15, 12, 10, 12, 2, 0, -2, 2, 0, 0, 0, 0, 0, 0, -1, 0, 6 };

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Ljava/lang/String;")
    public static String field343 = "Cancel";

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field345 = -1;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field349 = 0;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Lkb;")
    public static class39 field347;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V", line = 4)
    public static final void method148(int arg0, int arg1) {
        if (arg0 != 0) {
            field344 = -73;
        }
        class50.field690 = 1000 / arg1;
        field352++;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)I", line = 25)
    public static int method149(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V", line = 32)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field340++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 39)
    public static void method151(int arg0) {
        field341 = null;
        if (arg0 != 0) {
            field351 = -66;
        }
        field348 = null;
        field343 = null;
        field347 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()I", line = 60)
    public final int method152() {
        field353++;
        return this.field354;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIIIJILll;)V", line = 83)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class167 arg10) {
        class134 var13 = class31.method198(false, this.field342).method489(0, (class80) null, this.field338, false, (class303) null, 0, -1);
        field346++;
        if (var13 != null) {
            var13.method153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field354 = var13.method152();
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIZIIIIB)V", line = 103)
    public static final void method154(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field339++;
        int var10 = arg2 - arg3;
        int var11 = arg0 - arg6;
        if (arg9 != 2) {
            method151(-51);
        }
        int var12 = (arg8 - arg1 << 16) / var10;
        int var13 = (arg5 - arg7 << 16) / var11;
        class87.method632(var12, arg0, arg7, arg1, 0, arg4, arg3, arg2, var13, 0, arg6, -21890);
    }
}
