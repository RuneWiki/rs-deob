import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class class787 {

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
    public static int field10856 = 0;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field10858;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "Ltf;")
    public static class312 field10857;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V", line = 5)
    public static void method4354(byte arg0) {
        field10857 = null;
        if (arg0 != -96) {
            method4354((byte) 48);
        }
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "(B)Z", line = 28)
    public final boolean method4355(byte arg0) {
        field10858++;
        if (arg0 == 112) {
            return this.method113((byte) -41) || this.method110(arg0 + 10885) || this.method112((byte) 119);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)I")
    public abstract int method117(boolean arg0);

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
    public abstract boolean method110(int arg0);

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(B)Z")
    public abstract boolean method112(byte arg0);

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(B)V")
    public abstract void method121(byte arg0);

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)I")
    public abstract int method109(int arg0);

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "(B)Z")
    public abstract boolean method113(byte arg0);

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)Lgn;")
    public abstract class730 method111(int arg0);

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "(B)V")
    public abstract void method119(byte arg0);
}
