import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class474 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)Z", line = 5)
    public final boolean method2667(boolean arg0) {
        field6336++;
        if (arg0) {
            return this.method1105(false) || this.method1109(27726) || this.method1103((byte) 71);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Lhca;")
    public abstract class458 method1107(byte arg0);

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I")
    public abstract int method1110(byte arg0);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
    public abstract int method1113(int arg0);

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public abstract void method1106(int arg0);

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Z")
    public abstract boolean method1109(int arg0);

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
    public abstract void method1104(int arg0);

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)Z")
    public abstract boolean method1103(byte arg0);

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)Z")
    public abstract boolean method1105(boolean arg0);
}
