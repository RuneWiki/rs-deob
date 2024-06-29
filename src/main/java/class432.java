import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class432 {

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "F")
    public static float field6035 = 1024.0F;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field6034;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public int field6039;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public int field6040;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Lae;")
    public static class250 field6038;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 4)
    public static void method2618(int arg0) {
        if (arg0 < -63) {
            field6038 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V", line = 15)
    public static final void method2619(int arg0, int arg1) {
        field6033++;
        if (class332.field4684 == null || arg0 > class332.field4684.length) {
            class332.field4684 = new int[arg0];
        }
        if (arg1 <= 25) {
            method2618(-92);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 36)
    public static final String method2620(boolean arg0, int arg1) {
        field6037++;
        if (arg0) {
            return null;
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class281.field3974.method1839((byte) 45, class744.field10426) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class281.field3976.method1839((byte) 45, class744.field10426) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
