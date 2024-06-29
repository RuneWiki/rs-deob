import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class43 extends class147 {

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static volatile int field496 = 0;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field497 = 0;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Lqj;")
    public static class196 field495 = class80.method502(" <col=ffffff>", -48);

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "Lge;")
    public static class144 field490;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "[Lsc;")
    public static class212[] field501;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public static final void method218(boolean arg0) {
        class92.field1346 = new class243();
        field493++;
        if (!arg0) {
            field497 = -10;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIIII)V")
    public final void method219(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field499 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field489 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        field492++;
        this.method220(var6, var8, var7, var9, arg2, arg1);
        if (arg0 != -77) {
            this.method223(75, 34, -62, -82);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIIII)V")
    public abstract void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
    public abstract void method221(int arg0, int arg1);

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public static void method222(int arg0) {
        field501 = null;
        field490 = null;
        field495 = null;
        int var1 = -33 % ((-arg0 - 6) / 40);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
    public abstract void method223(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIII)V")
    public abstract void method224(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
    public abstract void method225(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
    public abstract void method226(int arg0, int arg1);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V")
    public abstract void method227(int arg0, int arg1, int arg2, int arg3, int arg4);
}
