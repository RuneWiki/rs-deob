import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class319 extends class356 {

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Lct;")
    public class132 field4127;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field4128 = 0;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "[I")
    public static int[] field4129 = new int[2];

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field4130 = -1;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "[[I")
    public static int[][] field4131 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "Lxa;")
    public static class458 field4132;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method1793(int arg0) {
        field4129 = null;
        field4132 = null;
        int var1 = 56 / ((arg0 + 35) / 53);
        field4131 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lct;)V")
    public class319(class132 arg0) {
        this.field4127 = arg0;
    }
}
