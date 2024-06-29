import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class128 extends class87 {

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "B")
    public byte field1787 = 5;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field1785 = 100;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Lwe;")
    public static class233 field1791 = null;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public int field1794;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method778(boolean arg0) {
        if (!arg0) {
            field1785 = -36;
        }
        field1793++;
        class331 var1 = class360.field5269;
        synchronized (class360.field5269) {
            class360.field5269.method2043(-72);
        }
    }
}
