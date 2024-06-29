import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class404 {

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Z")
    public static boolean field5765 = false;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z", line = 11)
    public final boolean method2451(int arg0) {
        field5763++;
        if (arg0 != 3791) {
            field5765 = false;
        }
        return this.method2454(-19704) || this.method2450(123) || this.method2457(-20117);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lla;B)V", line = 30)
    public static final void method2455(class423 arg0, byte arg1) {
        class548.field7958 = arg0;
        if (arg1 != -38) {
            field5765 = false;
        }
        field5764++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
    public abstract boolean method2450(int arg0);

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)I")
    public abstract int method2452(int arg0);

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public abstract void method2453(int arg0);

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)Z")
    public abstract boolean method2454(int arg0);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Lrg;")
    public abstract class553 method2456(byte arg0);

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)Z")
    public abstract boolean method2457(int arg0);

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
    public abstract void method2458(int arg0);

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "(I)I")
    public abstract int method2459(int arg0);
}
