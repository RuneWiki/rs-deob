import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class261 {

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "F")
    public static float field4064 = 0.0F;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lpl;")
    public static class616 field4063 = new class616(16);

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "Z")
    public static boolean field4065;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
    public static void method1742(byte arg0) {
        field4063 = null;
        if (arg0 != 94) {
            field4063 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1743(int arg0, int arg1) {
        field4066++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class641.field9026.method3621(114, class467.field6804) + " (" + var2 + ")</col>";
        } else if (arg0 < 110) {
            return null;
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class641.field9028.method3621(117, class467.field6804) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public static final void method1744(int arg0) {
        class624.field8742.method3908(true);
        field4067++;
        int var1 = class624.field8742.method3905(-4, 8);
        if (class356.field5394 > var1) {
            for (int var2 = var1; var2 < class356.field5394; var2++) {
                class217.field3568[class302.field4606++] = class45.field758[var2];
            }
        }
        if (class356.field5394 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class356.field5394 = 0;
        if (arg0 < 94) {
            field4065 = true;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class45.field758[var3];
            class461 var5 = ((class53) class332.field4881.method3512(true, (long) var4)).field847;
            int var6 = class624.field8742.method3905(-4, 1);
            if (var6 == 0) {
                class45.field758[class356.field5394++] = var4;
                var5.field1635 = class165.field2538;
            } else {
                int var7 = class624.field8742.method3905(-4, 2);
                if (var7 == 0) {
                    class45.field758[class356.field5394++] = var4;
                    var5.field1635 = class165.field2538;
                    class83.field1224[class49.field808++] = var4;
                } else if (var7 == 1) {
                    class45.field758[class356.field5394++] = var4;
                    var5.field1635 = class165.field2538;
                    int var8 = class624.field8742.method3905(-4, 3);
                    var5.method2824(-761903127, 1, var8);
                    int var9 = class624.field8742.method3905(-4, 1);
                    if (var9 == 1) {
                        class83.field1224[class49.field808++] = var4;
                    }
                } else if (var7 == 2) {
                    class45.field758[class356.field5394++] = var4;
                    var5.field1635 = class165.field2538;
                    if (class624.field8742.method3905(-4, 1) == 1) {
                        int var10 = class624.field8742.method3905(-4, 3);
                        var5.method2824(-761903127, 2, var10);
                        int var11 = class624.field8742.method3905(-4, 3);
                        var5.method2824(-761903127, 2, var11);
                    } else {
                        int var12 = class624.field8742.method3905(-4, 3);
                        var5.method2824(-761903127, 0, var12);
                    }
                    int var13 = class624.field8742.method3905(-4, 1);
                    if (var13 == 1) {
                        class83.field1224[class49.field808++] = var4;
                    }
                } else if (var7 == 3) {
                    class217.field3568[class302.field4606++] = var4;
                }
            }
        }
    }
}
