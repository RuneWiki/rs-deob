import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class349 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field4708 = 2;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lwl;")
    public static class280 field4709 = new class280();

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lfd;")
    public static class365 field4710;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[[I")
    public static int[][] field4711;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 17)
    public static void method2041(byte arg0) {
        if (arg0 > -15) {
            method2041((byte) -53);
        }
        field4710 = null;
        field4711 = null;
        field4709 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Leh;")
    public abstract class241 method2037(int arg0);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
    public abstract void method2038(int arg0, byte arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
    public abstract int method2039(int arg0, int arg1);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[B")
    public abstract byte[] method2040(int arg0, int arg1);
}
