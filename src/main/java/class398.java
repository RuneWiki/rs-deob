import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class398 implements class249 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5826 = new Rectangle[100];

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[[Z")
    public static boolean[][] field5831;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
    public static int[] field5832;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[S")
    public static short[] field5830;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Ln;")
    public static class362 field5829;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIILje;)V")
    public static final void method2380(boolean arg0, int arg1, int arg2, class178 arg3) {
        if (!class432.field6152) {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class24.method214(arg3, var4, -1402);
                if (var8 != null) {
                    class344.method2117((long) (var4 + 1), 1006, true, class19.method187(var4, arg0, arg3), arg3.field2565, var8, -8, arg3.field2534, arg3.field2605, false, arg3.field2631);
                    class17.field222++;
                }
            }
            String var5 = class140.method969(arg3, 11481);
            if (var5 != null) {
                class461.field6508++;
                class344.method2117(0L, 30, true, arg3.field2632, arg3.field2565, var5, -8, arg3.field2534, arg3.field2605, false, arg3.field2631);
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class24.method214(arg3, var6, -1402);
                if (var7 != null) {
                    class17.field222++;
                    class344.method2117((long) (var6 + 1), 50, true, class19.method187(var6, false, arg3), arg3.field2565, var7, -8, arg3.field2534, arg3.field2605, false, arg3.field2631);
                }
            }
            if (client.method2777(arg3).method1215(-108)) {
                class122.field1677++;
                if (arg3.field2654 == null) {
                    class344.method2117(0L, 13, true, -1, "", class226.field3275.method2036(class4.field85, (byte) -21), -8, arg3.field2534, arg3.field2605, false, arg3.field2631);
                } else {
                    class344.method2117(0L, 13, true, -1, "", arg3.field2654, -8, arg3.field2534, arg3.field2605, false, arg3.field2631);
                }
            }
        } else if (client.method2777(arg3).method1210(1) && (class197.field2960 & 0x20) != 0) {
            class344.method2117(0L, 46, true, class186.field2830, class357.field5428 + " -> " + arg3.field2565, class184.field2803, -8, arg3.field2534, arg3.field2605, false, arg3.field2631);
            class285.field4351++;
        }
        field5827++;
        if (arg0) {
            method2382(-101);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBILui;ZII)V")
    public static final void method2381(int arg0, byte arg1, int arg2, class451 arg3, boolean arg4, int arg5, int arg6) {
        field5828++;
        class372.field5600 = arg0;
        class415.field5986 = arg3;
        class268.field3968 = arg6;
        class346.field5283 = arg4;
        class479.field6747 = arg2;
        class338.field5076 = arg5;
        if (arg1 <= 100) {
            field5831 = null;
        }
        class428.field6110 = 1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(J[III)Ljava/lang/String;")
    public final String method1588(long arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 != -3569) {
            field5826 = null;
        }
        field5825++;
        if (arg2 == 0) {
            class480 var6 = class324.field4867.method1715(arg1[0], (byte) 117);
            return var6.method2815((int) arg0, 5);
        } else if (arg2 == 1 || arg2 == 10) {
            class184 var7 = class23.field309.method2364((byte) 118, (int) arg0);
            return var7.field2722;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class324.field4867.method1715(arg1[0], (byte) 112).method2815((int) arg0, arg3 + 3574);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method2382(int arg0) {
        field5831 = null;
        field5832 = null;
        field5826 = null;
        field5829 = null;
        field5830 = null;
        if (arg0 != 5) {
            method2382(104);
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field5826[var0] = new Rectangle();
        }
        field5831 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };
        field5832 = new int[4096];
        field5830 = new short[256];
    }
}
