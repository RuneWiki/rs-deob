import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class106 {

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "[I")
    public int[] field1373;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "[I")
    public int[] field1374;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Luv;")
    public static class3 field1375 = new class3(22, 5);

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "Luv;")
    public static class3 field1376 = new class3(31, 6);

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "Lge;")
    public static class551 field1377;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "[Lha;")
    public static class116[] field1370;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIILuq;I)Lem;")
    public static final class600 method579(int arg0, int arg1, int arg2, int arg3, class313 arg4, int arg5) {
        field1372++;
        if (arg0 < 31) {
            field1376 = null;
        }
        if (!arg4.field4227 && (!class506.method2832(arg3, 3) || !class506.method2832(arg5, 3))) {
            return arg4.field4243 ? new class600(arg4, 34037, arg2, arg1, arg3, arg5, true) : new class600(arg4, arg2, arg1, arg3, arg5, class468.method2685(arg3, false), class468.method2685(arg5, false), true);
        } else {
            return new class600(arg4, 3553, arg2, arg1, arg3, arg5, true);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method580(int arg0) {
        if (arg0 >= 115) {
            field1375 = null;
            field1376 = null;
            field1370 = null;
            field1377 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
    public class106(int arg0) {
        this.field1371 = arg0;
        this.field1373 = new int[this.field1371];
        this.field1374 = new int[this.field1371];
    }
}
