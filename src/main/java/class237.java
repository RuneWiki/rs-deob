import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public abstract class class237 {

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "Z")
    public static boolean field3174 = false;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "[Ltp;")
    public static class533[] field3176 = new class533[100];

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public static int field3179 = 0;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "Ljj;")
    public static class117 field3177;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)Z")
    public abstract boolean method1517(int arg0, int arg1);

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
    public static void method1518(int arg0) {
        field3177 = null;
        field3176 = null;
        if (arg0 > -108) {
            method1521((byte) 85);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
    public abstract void method1519(byte arg0);

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)Lkia;")
    public abstract class620 method1520(byte arg0);

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(B)V")
    public static final void method1521(byte arg0) {
        field3175++;
        class452.field6394.method406(((float) class557.field7812.field6510.method1695(false) * 0.1F + 0.7F) * 1.1523438F);
        class452.field6394.method390(class178.field2392, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class452.field6394.method418(class697.field9594, -1, 0);
        if (arg0 != 126) {
            method1521((byte) -21);
        }
        class452.field6394.method405(class687.field9393);
    }

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "(B)V")
    public abstract void method1522(byte arg0);
}
