import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class150 {

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field3037 = -1;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Led;")
    public static class43 field3039 = class191.method1219("::fps ", false);

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Led;")
    private static class43 field3040 = class191.method1219("Loading fonts )2 ", false);

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[Lig;")
    public static class80[] field3035 = new class80[256];

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Led;")
    public static class43 field3042 = field3040;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lai;")
    public static class10 field3034;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static void method929(boolean arg0) {
        field3040 = null;
        field3034 = null;
        field3039 = null;
        field3035 = null;
        if (!arg0) {
            field3039 = null;
        }
        field3042 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static final void method930(int arg0) {
        field3038++;
        class38.field723.method334(arg0 ^ 0x7A);
        int var1 = class38.field723.method330((byte) 113, 8);
        if (class95.field1864 > var1) {
            for (int var2 = var1; var2 < class95.field1864; var2++) {
                class47.field947[class17.field278++] = class158.field3202[var2];
            }
        }
        if (var1 > class95.field1864) {
            throw new RuntimeException("gnpov1");
        }
        class95.field1864 = 0;
        for (int var3 = arg0; var3 < var1; var3++) {
            int var4 = class158.field3202[var3];
            class77 var5 = class172.field3433[var4];
            int var6 = class38.field723.method330((byte) 112, 1);
            if (var6 == 0) {
                class158.field3202[class95.field1864++] = var4;
                var5.field2343 = client.field559;
            } else {
                int var7 = class38.field723.method330((byte) 64, 2);
                if (var7 == 0) {
                    class158.field3202[class95.field1864++] = var4;
                    var5.field2343 = client.field559;
                    class67.field1347[class115.field2241++] = var4;
                } else if (var7 == 1) {
                    class158.field3202[class95.field1864++] = var4;
                    var5.field2343 = client.field559;
                    int var8 = class38.field723.method330((byte) 50, 3);
                    var5.method764(false, var8, 0);
                    int var9 = class38.field723.method330((byte) 117, 1);
                    if (var9 == 1) {
                        class67.field1347[class115.field2241++] = var4;
                    }
                } else if (var7 == 2) {
                    class158.field3202[class95.field1864++] = var4;
                    var5.field2343 = client.field559;
                    int var10 = class38.field723.method330((byte) 106, 3);
                    var5.method764(true, var10, arg0);
                    int var11 = class38.field723.method330((byte) 78, 3);
                    var5.method764(true, var11, 0);
                    int var12 = class38.field723.method330((byte) 50, 1);
                    if (var12 == 1) {
                        class67.field1347[class115.field2241++] = var4;
                    }
                } else if (var7 == 3) {
                    class47.field947[class17.field278++] = var4;
                }
            }
        }
    }
}
