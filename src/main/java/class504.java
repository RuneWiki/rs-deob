import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class504 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Luq;")
    private class313 field7007;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public int field7010;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Luv;")
    public static class3 field7012 = new class3(21, 7);

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "[[I")
    public static int[][] field7013 = new int[6][];

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lbn;")
    public static class371 field7014 = new class371(7, 0, 1, 1);

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Ljn;")
    public static class491 field7015 = new class491();

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static void method2816(byte arg0) {
        if (arg0 != -82) {
            method2817(-96, -75, -93, 95);
        }
        field7015 = null;
        field7014 = null;
        field7013 = null;
        field7012 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2817(int arg0, int arg1, int arg2, int arg3) {
        if (class250.method1528(arg0, arg1, arg2)) {
            int var4 = arg1 << class400.field5480;
            int var5 = arg2 << class400.field5480;
            return class155.method836(var4 + 1, class501.field6947[arg0].method1031(arg1, arg2) + arg3, var5 + 1) && class155.method836(class456.field6523 + var4 - 1, class501.field6947[arg0].method1031(arg1 + 1, arg2) + arg3, var5 + 1) && class155.method836(class456.field6523 + var4 - 1, class501.field6947[arg0].method1031(arg1 + 1, arg2 + 1) + arg3, class456.field6523 + var5 - 1) && class155.method836(var4 + 1, class501.field6947[arg0].method1031(arg1, arg2 + 1) + arg3, class456.field6523 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lud;ILr;IIB)V")
    public static final void method2818(class119 arg0, int arg1, class521 arg2, int arg3, int arg4, byte arg5) {
        field7006++;
        if (arg5 != 105) {
            field7015 = null;
        }
        if (arg2 != null) {
            arg0.method651(arg2.method1590(), arg2.method1565(), arg3, arg1, arg2.method1561(), arg4, arg2.method1579(), arg2.method1563(), -1, arg2.method1597(), arg2.method1592());
        }
    }

    @OriginalMember(owner = "client!qj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7007.method1916(29252, this.field7010);
        field7009++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
    public static final int method2819(int arg0, int arg1) {
        field7008++;
        int var2 = -22 / ((-arg1 - 72) / 46);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Luq;II)V")
    public class504(class313 arg0, int arg1, int arg2) {
        this.field7007 = arg0;
        this.field7010 = arg2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)V")
    public static final void method2820(int arg0, byte arg1) {
        field7011++;
        if (arg1 < 85) {
            method2817(14, 52, 83, 83);
        }
        class632 var2 = class641.method3699(-125, 1, arg0);
        var2.method3655(0);
    }
}
