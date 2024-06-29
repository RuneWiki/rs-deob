import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class327 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Z")
    public static boolean field4709 = false;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lpn;")
    public static class72 field4710 = new class72(35, 4);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lga;")
    public static class301 field4708;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[[I")
    public static int[][] field4711;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
    public abstract void method561();

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lbd;)V")
    public abstract void method559(class327 arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
    public abstract void method550(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([I)V")
    public abstract void method551(int[] arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public abstract void method552(int arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static void method1986(int arg0) {
        field4710 = null;
        field4708 = null;
        field4711 = null;
        if (arg0 != 35) {
            method1986(-82);
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public abstract void method554(int arg0);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public abstract void method560(int arg0);

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public abstract void method558(int arg0);

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public abstract void method555(int arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III[I)V")
    public abstract void method557(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)V")
    public abstract void method553(int arg0, int arg1, int arg2);
}
