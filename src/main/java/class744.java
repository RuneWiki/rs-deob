import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class744 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Z")
    public static volatile boolean field10236 = true;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Lgw;")
    public static class690 field10235 = new class690(8);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field10234;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII)V")
    public abstract void method875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[I)V")
    public abstract void method881(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
    public abstract void method905(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public abstract void method896(int arg0);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static final void method4143(byte arg0) {
        field10234++;
        int var1 = 105 / ((arg0 - 24) / 60);
        class346 var2 = class299.method1976(0, 15, 0);
        var2.method2208(-1719);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public abstract void method890(int arg0);

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
    public static void method4144(int arg0) {
        if (arg0 != 15) {
            method4143((byte) -33);
        }
        field10235 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
    public abstract void method889();

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
    public abstract void method898(int arg0);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([I)V")
    public abstract void method894(int[] arg0);

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III[I)V")
    public abstract void method899(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
    public abstract void method882(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()Lih;")
    public abstract class744 method906();

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(III[I)V")
    public abstract void method907(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    public abstract void method895(int arg0);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lih;)V")
    public abstract void method900(class744 arg0);

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public abstract void method880(int arg0);

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
    public abstract void method902(int arg0);
}
