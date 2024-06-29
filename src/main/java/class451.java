import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class451 extends class197 {

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public int field6137;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public int field6139;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public int field6136;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public int field6129;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public int field6132;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public int field6135;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public int field6127;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Lmc;")
    public static class78 field6128 = new class78(55, 0);

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field6131 = new String[100];

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Lh;")
    public static class434 field6134 = new class434(62, 6);

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "(I)I")
    public abstract int method51(int arg0);

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
    public final void method8(int arg0) {
        field6130++;
        if (arg0 <= -74) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        field6126++;
        return arg0 == 7 ? false : false;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILwm;ZLhp;Z)V")
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        field6133++;
        if (arg6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V")
    public static final void method2653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6138++;
        if (arg1 != 0) {
            method2653(39, 45, 78, -90, 85, -81);
        }
        if (arg0 == arg2) {
            class37.method274((byte) 5, arg5, arg3, arg4, arg2);
        } else if (class425.field5751 <= (arg3 - arg2) && class136.field1985 >= arg2 + arg3 && class221.field2942 <= (arg4 - arg0) && class205.field2784 >= (arg0 + arg4)) {
            class272.method1539(arg3, arg4, arg2, -1, arg5, arg0);
        } else {
            class45.method327(arg4, arg2, arg3, (byte) -120, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "(I)V")
    public static void method2654(int arg0) {
        field6131 = null;
        if (arg0 >= 31) {
            field6128 = null;
            field6134 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIII)V")
    public class451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6137 = arg1;
        this.field6139 = arg5;
        this.field6136 = arg4;
        this.field6129 = arg2;
        this.field6132 = arg0;
        this.field6135 = arg6;
        this.field6127 = arg3;
    }
}
