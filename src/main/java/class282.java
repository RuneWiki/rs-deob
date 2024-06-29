import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class282 {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "[B")
    public static byte[] field4416 = new byte[520];

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "[Z")
    public static boolean[] field4415 = new boolean[100];

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "[Laj;")
    public static class1[] field4419 = new class1[2048];

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lpk;")
    public static class120 field4418;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "[I")
    public static int[] field4417;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 8)
    public static void method1983(byte arg0) {
        field4418 = null;
        field4417 = null;
        field4416 = null;
        if (arg0 != 88) {
            method1984(73, -7L);
        }
        field4415 = null;
        field4419 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IJ)V", line = 27)
    public static final void method1984(int arg0, long arg1) {
        field4421++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 > -55) {
            field4416 = (byte[]) null;
        }
        for (int var3 = 0; var3 < class321.field5024; var3++) {
            if (class158.field2587[var3] == arg1) {
                class214.field3346++;
                class321.field5024--;
                for (int var4 = var3; var4 < class321.field5024; var4++) {
                    class158.field2587[var4] = class158.field2587[var4 + 1];
                    class197.field3030[var4] = class197.field3030[var4 + 1];
                    class176.field2817[var4] = class176.field2817[var4 + 1];
                }
                class11.field254 = class200.field3060;
                class209.field3305.method1808((byte) -74, 65);
                class209.field3305.method59(arg1, false);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 85)
    public static final void method1985(int arg0) {
        field4420++;
        try {
            if (class182.field2882 == 1) {
                int var1 = class20.field370.method1435(7745);
                if (var1 > 0 && class20.field370.method1442((byte) -59)) {
                    int var2 = var1 - class68.field1035;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class20.field370.method1418(var2, (byte) 127);
                    return;
                }
                class20.field370.method1431(-285256665);
                class20.field370.method1409(64);
                if (class13.field284 == null) {
                    class182.field2882 = 0;
                } else {
                    class182.field2882 = 2;
                }
                class216.field3357 = null;
                class198.field3046 = null;
            }
            if (arg0 != 0) {
                method1984(-70, 74L);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class20.field370.method1431(arg0 ^ 0xEEFF5427);
            class182.field2882 = 0;
            class13.field284 = null;
            class198.field3046 = null;
            class216.field3357 = null;
        }
    }
}
