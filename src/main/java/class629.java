import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class629 extends class390 {

    @OriginalMember(owner = "client!naa", name = "w", descriptor = "I")
    public int field8915;

    @OriginalMember(owner = "client!naa", name = "v", descriptor = "I")
    public int field8914;

    @OriginalMember(owner = "client!naa", name = "p", descriptor = "I")
    public int field8908;

    @OriginalMember(owner = "client!naa", name = "u", descriptor = "I")
    public int field8913;

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "I")
    public int field8918;

    @OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
    public int field8911;

    @OriginalMember(owner = "client!naa", name = "q", descriptor = "Lgr;")
    public static class530 field8909 = new class530(51, 4);

    @OriginalMember(owner = "client!naa", name = "o", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!naa", name = "r", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!naa", name = "t", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!naa", name = "x", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!naa", name = "y", descriptor = "[I")
    public static int[] field8917;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V")
    public static void method3619(int arg0) {
        field8909 = null;
        if (arg0 != 51) {
            method3621(69, -102, -11, (byte) 100, 123);
        }
        field8917 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IB)V")
    public static final void method3620(int arg0, byte arg1) {
        if (arg1 < 79) {
            field8909 = null;
        }
        field8907++;
        class503 var2 = class512.method3112(2, arg0, 0);
        var2.method3074(-87);
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Leda;Lcga;IIIIIIIIIIIII)V")
    public class629(class14 arg0, class141 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field8915 = arg12;
        this.field8914 = arg14;
        this.field8908 = arg10;
        this.field8913 = arg9;
        this.field8918 = arg13;
        this.field8911 = arg11;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIBI)V")
    public static final void method3621(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field8910++;
        if (arg3 <= 45) {
            return;
        }
        for (int var5 = 0; var5 < class727.field10212; var5++) {
            Rectangle var6 = class39.field673[var5];
            if (arg2 < (var6.x + var6.width) && arg2 + arg4 > var6.x && arg0 < (var6.y + var6.height) && arg0 + arg1 > var6.y) {
                class567.field8200[var5] = true;
            }
        }
        class545.method3277(arg2, arg0, arg2 + arg4, -44, arg0 + arg1);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)Lhr;")
    public class57 method478(int arg0) {
        if (arg0 < 30) {
            field8917 = null;
        }
        field8912++;
        return class463.field6594;
    }
}
