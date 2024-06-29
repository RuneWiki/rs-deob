import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class439 {

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field6815 = 0;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "[S")
    public static short[] field6817 = new short[256];

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Ljl;")
    public static class495 field6818;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Lks;")
    public static final class323 method2786(int arg0, int arg1) {
        field6816++;
        class323 var2 = (class323) class523.field7733.method2191((byte) -73, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class377.field5793.method1004(0, false, arg1);
        if (arg0 != -29401) {
            method2789(-12, -117, -88);
        }
        class323 var4 = new class323();
        if (var3 != null) {
            var4.method2161((byte) 127, new class208(var3));
        }
        var4.method2162(16724696);
        class523.field7733.method2188(-128, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method2787(int arg0) {
        if (arg0 != 0) {
            method2788(null, 33, 105);
        }
        field6818 = null;
        field6817 = null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2788(String arg0, int arg1, int arg2) {
        field6814++;
        int var3 = class234.field3861;
        int[] var4 = class21.field245;
        boolean var5 = false;
        if (arg2 != 30687) {
            field6817 = null;
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class350 var7 = class264.field4276[var4[var6]];
            if (var7 != null && class358.field5565 != var7 && var7.field5443 != null && var7.field5443.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg1 == 1) {
                    class449.field6960++;
                    class81.method578((byte) 66, class432.field6533);
                    class170.field2488.method1444(-1, 0);
                    class170.field2488.method1442(4499, var4[var6]);
                } else if (arg1 == 4) {
                    class59.field940++;
                    class81.method578((byte) 66, class259.field4187);
                    class170.field2488.method1468(arg2 - 30559, 0);
                    class170.field2488.method1437(var4[var6], 0);
                } else if (arg1 == 5) {
                    class81.method578((byte) 66, class88.field1270);
                    class306.field4808++;
                    class170.field2488.method1433(0, arg2 ^ 0xFFFF8864);
                    class170.field2488.method1437(var4[var6], 0);
                } else if (arg1 == 6) {
                    class73.field1102++;
                    class81.method578((byte) 66, class169.field2469);
                    class170.field2488.method1437(var4[var6], 0);
                    class170.field2488.method1433(0, 94);
                } else if (arg1 == 7) {
                    class81.method578((byte) 66, class154.field2056);
                    class201.field3053++;
                    class170.field2488.method1419(arg2 ^ 0xFFFFAF82, var4[var6]);
                    class170.field2488.method1468(128, 0);
                }
                break;
            }
        }
        if (!var5) {
            class295.method1988(class489.field7407.method1583(arg2 - 30562, class12.field131) + arg0, arg2 - 30687);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)Z")
    public static final boolean method2789(int arg0, int arg1, int arg2) {
        field6813++;
        return arg0 <= 40 ? false : (class46.method337(arg1, true, arg2) | class486.method2982(-1, arg1, arg2) | class416.method2663(arg1, arg2, 115)) & class205.method1405(arg1, arg2, (byte) -128);
    }
}
