import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class210 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lpi;")
    public static class340 field2708 = new class340(88, 2);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[I")
    public static int[] field2711;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method1353(byte arg0) {
        int var1 = 54 / ((76 - arg0) / 36);
        field2711 = null;
        field2708 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Lab;")
    public abstract class228 method715(byte arg0);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)I")
    public abstract int method721(byte arg0);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public abstract void method724(int arg0);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Z")
    public abstract boolean method720(int arg0);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Z")
    public abstract boolean method729(int arg0);

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Z")
    public final boolean method1354(int arg0) {
        field2709++;
        if (arg0 != 10158) {
            field2711 = null;
        }
        return this.method727((byte) -81) || this.method720(54) || this.method729(125);
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)I")
    public abstract int method717(byte arg0);

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(B)Z")
    public abstract boolean method727(byte arg0);

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(B)V")
    public abstract void method718(byte arg0);
}
