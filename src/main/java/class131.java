import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class131 extends class272 {

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Lmm;")
    public class168 field1712;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "Lwl;")
    public class258 field1711;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "Ldk;")
    public static class326 field1710 = new class326("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public int field1716;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIB)V")
    public static final void method821(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -81) {
            method823(-125);
        }
        field1709++;
        if (arg1 == 1010) {
            class290.method1817(class238.field3573, arg2, arg0);
        } else if (arg1 == 1001) {
            class290.method1817(class337.field4903, arg2, arg0);
        } else if (arg1 == 1009) {
            class290.method1817(class86.field1047, arg2, arg0);
        } else if (arg1 == 1006) {
            class290.method1817(class66.field844, arg2, arg0);
        } else if (arg1 == 1002) {
            class290.method1817(class312.field4418, arg2, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public final void method822(int arg0) {
        this.field1707 = this.field1712.field2457;
        this.field1717 = this.field1712.field2455;
        field1708++;
        this.field1713 = this.field1712.field2452;
        if (this.field1712.field2453 != null) {
            this.field1712.field2453.method1016(this.field1711.field3773, this.field1711.field3788, this.field1711.field3775, class146.field2114);
        }
        this.field1714 = class146.field2114[2];
        if (arg0 == 21403) {
            this.field1716 = class146.field2114[0];
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    public static void method823(int arg0) {
        field1710 = null;
        if (arg0 <= 42) {
            field1710 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lmm;Lg;)V")
    public class131(class168 arg0, class97 arg1) {
        this.field1712 = arg0;
        this.field1711 = class452.method2641(arg0.field2456, 2);
        this.method822(21403);
    }
}
