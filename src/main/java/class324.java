import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class324 extends class184 {

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Lsf;")
    public class108 field5532;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "[[I")
    public static int[][] field5523 = new int[104][104];

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "Z")
    public static boolean field5527 = false;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field5528 = 0;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "Lsf;")
    public static class108 field5530 = class140.method973(255, "(U4");

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Lsf;")
    public static class108 field5524 = class140.method973(255, "null");

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "Lsf;")
    public static class108 field5529 = class140.method973(255, ")2");

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Ldh;")
    public static class171 field5531;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)I", line = 9)
    public static final int method2225(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field5525++;
        if (arg2 == var4) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 41)
    public static void method2226(int arg0) {
        field5529 = null;
        field5523 = (int[][]) null;
        field5531 = null;
        if (arg0 != -3608) {
            method2225(-120, -102, 38, -50);
        }
        field5524 = null;
        field5530 = null;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 69)
    public class324() {
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lsf;)V", line = 78)
    public class324(class108 arg0) {
        this.field5532 = arg0;
    }
}
