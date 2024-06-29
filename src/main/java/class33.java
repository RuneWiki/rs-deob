import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class class33 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "Lwt;")
    public static class194 field537 = new class194("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field540 = -1;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "J")
    public static long field541 = 0L;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIII)V")
    public abstract void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lgs;)V")
    public abstract void method266(class33 arg0);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public abstract void method267(int arg0);

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public abstract void method268(int arg0);

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
    public static void method269(int arg0) {
        if (arg0 > 89) {
            field537 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)V")
    public abstract void method270(int arg0);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III[I)V")
    public abstract void method271(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([I)V")
    public abstract void method272(int[] arg0);

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(III[I)V")
    public abstract void method273(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "()V")
    public abstract void method274();

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)V")
    public abstract void method275(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V")
    public abstract void method276(int arg0);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZIZ)V")
    public static final void method277(boolean arg0, int arg1, boolean arg2) {
        field539++;
        if (arg2) {
            class453.field6590++;
            class238.method1441(true);
        }
        if (arg0) {
            class318.field4678++;
            class252.method1581(125);
        }
        int var3 = -41 / ((arg1 + 20) / 48);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(III)V")
    public abstract void method278(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
    public abstract void method279(int arg0);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILhe;)V")
    public static final void method280(int arg0, class239 arg1) {
        field538++;
        class49.field755 = arg1;
        if (arg0 != -4924) {
            method269(-12);
        }
    }
}
