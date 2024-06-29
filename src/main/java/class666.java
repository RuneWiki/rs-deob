import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public abstract class class666 {

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "Lkj;")
    public static class527 field9548 = new class527(11, 3);

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "Lqfa;")
    public static class85 field9549 = new class85(34, -2);

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Z")
    public abstract boolean method1934(byte arg0);

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)Z")
    public final boolean method3772(int arg0) {
        if (arg0 < 62) {
            field9549 = null;
        }
        field9547++;
        return this.method1924(81) || this.method1934((byte) -40) || this.method1925(-102);
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)Z")
    public abstract boolean method1924(int arg0);

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V")
    public static void method3773(byte arg0) {
        field9548 = null;
        field9549 = null;
        if (arg0 != -116) {
            field9548 = null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)V")
    public abstract void method1930(boolean arg0);

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)Z")
    public abstract boolean method1925(int arg0);

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)I")
    public abstract int method1931(int arg0);

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "(I)I")
    public abstract int method1936(int arg0);

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(B)Lnm;")
    public abstract class441 method1933(byte arg0);

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "(I)V")
    public abstract void method1929(int arg0);
}
