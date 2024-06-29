import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class348 {

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Lsc;")
    public static class347 field4496 = new class347();

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public int field4493;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public int field4497;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "Lsb;")
    public static class290 field4495;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "[Z")
    public static boolean[] field4498;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IFIIIIZB)[I", line = 6)
    public static final int[] method2071(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, byte arg7) {
        field4500++;
        if (arg7 != -128) {
            field4495 = null;
        }
        int[] var8 = new int[arg2];
        class230 var9 = new class230();
        var9.field2674 = arg0;
        var9.field2677 = arg6;
        var9.field2689 = arg5;
        var9.field2682 = (int) (arg1 * 4096.0F);
        var9.field2693 = arg3;
        var9.field2681 = arg4;
        var9.method87((byte) 102);
        class341.method2025(arg2, 1, (byte) -1);
        var9.method1335(0, (byte) -103, var8);
        return var8;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V", line = 35)
    public static void method2072(byte arg0) {
        field4496 = null;
        field4495 = null;
        field4498 = null;
        if (arg0 != -28) {
            method2071(69, -0.4191757F, 32, -98, -79, -104, true, (byte) 59);
        }
    }
}
