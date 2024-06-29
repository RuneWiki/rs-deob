import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class327 implements class104 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Lsea;")
    private class648 field4434;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "Lec;")
    private class213 field4435;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "Lgca;")
    public static class227 field4437 = new class227();

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "Lem;")
    public static class206 field4441 = new class206(63, -1);

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field4442 = 0;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "Lf;")
    private class702 field4438;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    public static void method1951(int arg0) {
        field4437 = null;
        field4441 = null;
        if (arg0 != 63) {
            field4437 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Z")
    public final boolean method475(byte arg0) {
        field4439++;
        if (arg0 != -90) {
            method1951(-103);
        }
        return this.field4434.method3623(-93, this.field4435.field2985);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public final void method476(int arg0) {
        field4440++;
        if (arg0 != -12935) {
            field4437 = null;
        }
        this.field4438 = class65.method554(this.field4435.field2985, this.field4434, 3);
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lsea;Lec;)V")
    public class327(class648 arg0, class213 arg1) {
        this.field4434 = arg0;
        this.field4435 = arg1;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZZ)V")
    public final void method647(boolean arg0, boolean arg1) {
        field4436++;
        if (!arg1 || !arg0) {
            return;
        }
        int var3 = class222.field3096 <= class178.field2581 ? class178.field2581 : class222.field3096;
        int var4 = class340.field4553 <= class157.field2277 ? class157.field2277 : class340.field4553;
        int var5 = this.field4438.method1660();
        int var6 = this.field4438.method1661();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var4 < var9) {
            var9 = var4;
            var8 = var4 * var5 / var6;
            var10 = 0;
            var7 = (var3 - var8) / 2;
        }
        this.field4438.method3932(var7, var10, var8, var9);
    }
}
