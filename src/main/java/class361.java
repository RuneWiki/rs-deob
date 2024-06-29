import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class361 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[Ljava/lang/Object;")
    public Object[] field4874 = new Object[5000];

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public volatile int field4869 = 0;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public int field4875 = 0;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public volatile int field4876 = 0;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "[B")
    public byte[] field4873 = new byte[5000];

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[F")
    public float[] field4872 = new float[5000];

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public int field4879 = 0;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field4871 = 0;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lvj;")
    public static class304 field4870 = new class304("K", "T", "K", "K");

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field4877 = 2;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field4878 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 33)
    public static void method2103(byte arg0) {
        if (arg0 <= 103) {
            field4878 = 17;
        }
        field4870 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public abstract void method1044(int arg0);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
    public abstract void method1038(int arg0, byte arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILht;)V")
    public abstract void method1046(int arg0, class409 arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IFZLna;I)V")
    public abstract void method1047(int arg0, float arg1, boolean arg2, class35 arg3, int arg4);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
    public abstract void method1048(int arg0, int arg1);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(ILht;)V")
    public abstract void method1042(int arg0, class409 arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lht;I)V")
    public abstract void method1041(class409 arg0, int arg1);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public abstract void method1039(byte arg0);
}
