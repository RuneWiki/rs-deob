import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class332 extends class347 {

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "B")
    public byte field4834 = 5;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "[Lrc;")
    public static class501[] field4832 = new class501[14];

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public int field4831;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public int field4835;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public int field4837;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public int field4838;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public int field4840;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "Lqi;")
    public static class528 field4839;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Z")
    public boolean field4830;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public static void method2117(boolean arg0) {
        if (arg0) {
            method2118(true, -42);
        }
        field4839 = null;
        field4832 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
    public static final void method2118(boolean arg0, int arg1) {
        if (class119.field2122 == null) {
            class680.method3825((byte) 66);
        }
        if (arg1 != 14) {
            field4832 = null;
        }
        field4836++;
        if (arg0) {
            class119.field2122.method1884(-106);
        }
    }
}
