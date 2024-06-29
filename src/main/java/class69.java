import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class class69 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
    public static boolean field965 = false;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field964 = 0;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static volatile int field968 = 0;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lma;")
    public static class5 field963 = new class5();

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Z")
    public static boolean field969 = false;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 27)
    public static void method544(int arg0) {
        if (arg0 <= 69) {
            field968 = 78;
        }
        field963 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V", line = 44)
    public static final void method545(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field967++;
        class34 var5 = class91.method656(arg1, arg0 - 2, 8);
        var5.method307(-19063);
        var5.field497 = arg3;
        var5.field500 = arg4;
        var5.field502 = arg2;
        if (arg0 != 0) {
            method544(30);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
    public abstract void method541(int arg0, int arg1);

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[B")
    public abstract byte[] method542(int arg0, int arg1);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)Luc;")
    public abstract class14 method543(boolean arg0);

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(II)I")
    public abstract int method546(int arg0, int arg1);
}
