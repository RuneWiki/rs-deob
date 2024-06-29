import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class510 {

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Ldu;")
    public static class242 field7557;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lvl;")
    public static class11 field7558;

    static {
        new class530("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field7557 = new class242(0, 2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 3)
    public static void method3045(boolean arg0) {
        if (arg0) {
            field7558 = null;
            field7557 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V", line = 14)
    public static final void method3046(boolean arg0) {
        field7556++;
        class471.field6567++;
        class61.method498(class56.field710, 1);
        class30.field357.method2376((byte) 122, class334.method1996((byte) -104));
        if (!arg0) {
            method3047(117, 5, 78, 80, 15, 42, -39, 18, 106);
        }
        class30.field357.method2372(class147.field1956, 6);
        class30.field357.method2372(class273.field4048, 20);
        class30.field357.method2376((byte) 122, class4.field81.field1413);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIII)Z", line = 31)
    public static final boolean method3047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7555++;
        if (arg7 <= 32) {
            method3047(-126, 85, -12, 23, 83, 69, 100, 59, 93);
        }
        if ((arg4 + arg5) > arg3 && (arg3 + arg6) > arg4) {
            return arg8 < (arg0 + arg2) && arg1 + arg8 > arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public abstract void method120(int arg0);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILza;ILge;IZI)V")
    public abstract void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILza;I)Z")
    public abstract boolean method129(int arg0, int arg1, class290 arg2, int arg3);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lza;B)Lkf;")
    public abstract class170 method126(class290 arg0, byte arg1);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lza;I)V")
    public abstract void method130(class290 arg0, int arg1);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Z")
    public abstract boolean method118(byte arg0);
}
