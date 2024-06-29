import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class489 {

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lqe;")
    public static class469 field6989 = new class469(63, 6);

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "[Z")
    public static boolean[] field6991 = new boolean[100];

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "F")
    public static float field6992 = 1.0F;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!ef", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field6988++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)I", line = 15)
    public static final int method2926(int arg0) {
        field6987++;
        int var1 = 4 / ((arg0 - 19) / 62);
        return class677.field9414++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 28)
    public static final void method2927(String arg0, int arg1, int arg2) {
        field6986++;
        class150 var3 = class676.method3885(1000, arg1, arg2);
        var3.method1116(arg1 ^ 0x34);
        var3.field2344 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 39)
    public static void method2928(int arg0) {
        field6989 = null;
        if (arg0 >= -39) {
            field6991 = null;
        }
        field6991 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lpd;I)I", line = 63)
    public static final int method2929(class259 arg0, int arg1) {
        field6990++;
        if (arg1 != 6407) {
            field6989 = null;
        }
        if (class505.field7177 == arg0) {
            return 6407;
        } else if (class752.field10511 == arg0) {
            return 6408;
        } else if (class39.field413 == arg0) {
            return 6406;
        } else if (class478.field6935 == arg0) {
            return 6409;
        } else if (class683.field9458 == arg0) {
            return 6410;
        } else if (class375.field5682 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }
}
