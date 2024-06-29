import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class242 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 3)
    public static final void method1505(String arg0, int arg1, int arg2) {
        class203.field2585++;
        field3114++;
        class650 var3 = class314.method1837(class296.field3845, true, class625.field8727);
        var3.field8928.method1141(class663.method3588(0, arg0) + 1, -110);
        var3.field8928.method1134(111955568, arg1);
        var3.field8928.method1110(arg0, -30452);
        int var4 = -55 % ((56 - arg2) / 48);
        class108.method745(var3, -99);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method524(boolean arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[B)V")
    public abstract void method525(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)[B")
    public abstract byte[] method526(int arg0, int arg1, int arg2);
}
