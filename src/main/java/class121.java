import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class121 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
    public static final void method686(byte arg0) {
        if (arg0 <= 39) {
            method686((byte) -32);
        }
        class331 var1 = class424.field6079;
        synchronized (class424.field6079) {
            class424.field6079.method2052(0);
        }
        field1610++;
    }
}
