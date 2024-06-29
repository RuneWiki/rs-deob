import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class657 {

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public int field9248;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    private int field9251;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lps;")
    private class82 field9249;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public int field9247;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lnk;")
    public static class657 field9245 = new class657(0, 3, class82.field1151);

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lnk;")
    public static class657 field9252 = new class657(1, 3, class82.field1151);

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lnk;")
    public static class657 field9253 = new class657(2, 4, class82.field1147);

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lnk;")
    public static class657 field9254 = new class657(3, 1, class82.field1151);

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Lnk;")
    public static class657 field9255 = new class657(4, 2, class82.field1151);

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Lnk;")
    public static class657 field9256 = new class657(5, 3, class82.field1151);

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "Lnk;")
    private static class657 field9257 = new class657(6, 4, class82.field1151);

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field9258 = class565.method3125(-257, 16);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "Lpj;")
    public static class132 field9259;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method3642(int arg0) {
        field9255 = null;
        field9253 = null;
        field9259 = null;
        field9257 = null;
        if (arg0 != 18) {
            field9259 = null;
        }
        field9256 = null;
        field9245 = null;
        field9254 = null;
        field9252 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)[Lnk;")
    public static final class657[] method3643(byte arg0) {
        int var1 = 53 / ((arg0 + 35) / 53);
        field9244++;
        return new class657[] { field9245, field9252, field9253, field9254, field9255, field9256, field9257 };
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIILva;IILva;III)V")
    public static final void method3644(int arg0, int arg1, int arg2, class457 arg3, int arg4, int arg5, class457 arg6, int arg7, int arg8, int arg9) {
        field9250++;
        int var10 = arg3.method1438((byte) -37);
        int var11 = -56 / ((arg8 + 51) / 39);
        if (var10 == -1) {
            return;
        }
        Object var12 = null;
        class461 var13 = (class461) class472.field6600.method1986((byte) -101, (long) var10);
        if (var13 == null) {
            class543[] var14 = class543.method2982(class460.field6517, var10, 0);
            if (var14 == null) {
                return;
            }
            var13 = class630.field8790.method412(var14[0], true);
            class472.field6600.method1985(var13, (long) var10, (byte) -102);
        }
        class223.method1431(arg2 >> 1, arg0, arg9 >> 1, arg6.field509, false, 0, arg6.method1722((byte) -125) * 256, arg1, arg6.field514, arg6.field520);
        int var15 = class399.field5548[0] + arg5 - 18;
        int var16 = arg4 / 4 * 18 + var15;
        int var17 = arg7 + class399.field5548[1] - 16 - 54;
        int var18 = arg4 % 4 * 18 + var17;
        var13.method2660(var16, var18);
        if (arg3 == arg6) {
            class630.field8790.method3562(-256, 1, 18, var16 - 1, var18 + -1, 18);
        }
        class503 var19 = class532.method2943((byte) 120);
        var19.field6883 = var18 + 16;
        var19.field6877 = var18;
        var19.field6882 = arg3;
        var19.field6879 = var16 + 16;
        var19.field6881 = var16;
        class638.field9064.method3679(var19, 0);
    }

    @OriginalMember(owner = "client!nk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9246++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IILps;)V")
    private class657(int arg0, int arg1, class82 arg2) {
        this.field9248 = arg0;
        this.field9251 = arg1;
        this.field9249 = arg2;
        this.field9247 = this.field9249.field1141 * this.field9251;
        if (this.field9248 >= 16) {
            throw new RuntimeException();
        }
    }
}
