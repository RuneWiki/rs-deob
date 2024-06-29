import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class501 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[B")
    public byte[] field7370 = new byte[5000];

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public volatile int field7373 = 0;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public int field7378 = 0;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "[Ljava/lang/Object;")
    public Object[] field7371 = new Object[5000];

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[F")
    public float[] field7372 = new float[5000];

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public int field7379 = 0;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public volatile int field7376 = 0;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Ldi;")
    public static class83 field7374 = new class83(78, -1);

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lqp;")
    public static class466 field7380 = new class466("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Ldb;")
    public static class211 field7375;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 7)
    public static void method2938(int arg0) {
        field7375 = null;
        if (arg0 != 5000) {
            method2938(-26);
        }
        field7380 = null;
        field7374 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lhg;I)V")
    public abstract void method2154(class486 arg0, int arg1);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
    public abstract void method2153(int arg0, int arg1);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)V")
    public abstract void method2164(byte arg0, int arg1);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lhg;Z)V")
    public abstract void method2158(class486 arg0, boolean arg1);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BFILta;Z)V")
    public abstract void method2155(byte arg0, float arg1, int arg2, class142 arg3, boolean arg4);

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
    public abstract void method2162(int arg0);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILhg;)V")
    public abstract void method2163(int arg0, class486 arg1);

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
    public abstract void method2156(int arg0);
}
