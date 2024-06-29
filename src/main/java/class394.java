import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class394 extends class627 {

    @OriginalMember(owner = "client!bga", name = "p", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "I")
    public static int field5489 = -50;

    @OriginalMember(owner = "client!bga", name = "n", descriptor = "[I")
    public static int[] field5492 = new int[128];

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!bga", name = "m", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!bga", name = "o", descriptor = "Lkha;")
    public static class687 field5493;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/awt/Canvas;Ld;II)Lha;")
    public static final class454 method2346(Canvas arg0, class96 arg1, int arg2, int arg3) {
        if (arg3 > -98) {
            return null;
        } else {
            field5490++;
            return new class357(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IZI)V")
    public static final void method2347(int arg0, boolean arg1, int arg2) {
        field5488++;
        if (!arg1) {
            field5492 = null;
        }
        class548 var3 = class696.method3872(arg2, 17, -1633381944);
        var3.method3130(104);
        var3.field7725 = arg0;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
    public static void method2348(int arg0) {
        field5493 = null;
        field5492 = null;
        if (arg0 <= 101) {
            method2348(-127);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lkha;IIIIJZI)V")
    public static final void method2349(class687 arg0, int arg1, int arg2, int arg3, int arg4, long arg5, boolean arg6, int arg7) {
        class55.field799 = null;
        class669.field9155 = arg5;
        class74.field991 = arg2;
        class714.field10062 = 10000;
        field5491++;
        class189.field2478 = arg1;
        class98.field1225 = arg7;
        class130.field1562 = arg3;
        class379.field5303 = arg0;
        if (arg4 < -113) {
            class244.field3142 = 1;
            class646.field8905 = arg6;
        }
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "()V")
    public class394() {
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(I)V")
    public class394(int arg0) {
        this.field5494 = arg0;
    }

    static {
        for (int var0 = 0; var0 < field5492.length; var0++) {
            field5492[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field5492[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field5492[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field5492[var3] = var3 + 52 - 48;
        }
        field5492[45] = field5492[47] = 63;
        field5492[42] = field5492[43] = 62;
    }
}
