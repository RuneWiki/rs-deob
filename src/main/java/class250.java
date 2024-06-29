import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class250 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lcc;")
    public static class209 field4500 = class95.method669(94, ":assistreq:");

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lcc;")
    public static class209 field4501 = class95.method669(91, ":trade:");

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4502 = 0;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Z")
    public static boolean field4505 = false;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method1733(int arg0) {
        field4500 = null;
        field4501 = null;
        if (arg0 != 50) {
            method1735(119, -27, 18, -117);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Z")
    public static final boolean method1734(int arg0) {
        field4503++;
        if (arg0 > -61) {
            return true;
        }
        try {
            return class218.method1529(-129);
        } catch (IOException var4) {
            class64.method475(50);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class254.field4590 + "," + class110.field2225 + "," + class164.field2975 + " - " + class112.field2253 + "," + (class223.field4069.field1548[0] + class174.field3178) + "," + (class223.field4069.field1567[0] + class245.field4444) + " - ";
            for (int var3 = 0; class112.field2253 > var3 && var3 < 50; var3++) {
                var2 = var2 + client.field2818.field2108[var3] + ",";
            }
            class78.method548((byte) -17, var2, var5);
            class94.method657(false);
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V")
    public static final void method1735(int arg0, int arg1, int arg2, int arg3) {
        field4504++;
        class195 var4 = class178.method1229(arg0, 11, 48);
        var4.method1338(arg1);
        var4.field3511 = arg2;
        var4.field3503 = arg3;
    }
}
