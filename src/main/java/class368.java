import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class368 {

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lba;")
    public static class607 field5130 = new class607(32);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!dm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5132++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)V")
    public static final void method2258(boolean arg0, int arg1) {
        field5133++;
        class632 var2 = class641.method3699(-102, 6, arg1);
        if (!arg0) {
            method2259(-72);
        }
        var2.method3655(0);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static void method2259(int arg0) {
        if (arg0 == 32) {
            field5130 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)Z")
    public final boolean method2260(int arg0) {
        if (arg0 > -23) {
            this.method2260(127);
        }
        field5131++;
        return class609.field8765 == this | class351.field4931 == this;
    }
}
