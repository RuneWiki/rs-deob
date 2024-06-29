import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class420 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "[J")
    public static long[] field6106 = new long[256];

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field6109 = 0;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
    public static int[] field6107 = new int[14];

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "[Lao;")
    public static class280[] field6108 = new class280[4];

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "Z")
    public static boolean field6110;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "Ll;")
    public static class315 field6111;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ltj;)V")
    public static final void method2646(class298 arg0) {
        for (int var1 = class346.field5155; var1 < class134.field1752; var1++) {
            for (int var2 = 0; var2 < class108.field1421; var2++) {
                for (int var3 = 0; var3 < class186.field2554; var3++) {
                    class77 var4 = class106.field1405[var1][var2][var3];
                    if (var4 != null) {
                        class400 var5 = var4.field1067;
                        class400 var6 = var4.field1087;
                        if (var5 != null && var5.method107((byte) 121)) {
                            class27.method227(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method107((byte) 126)) {
                                class27.method227(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method112(0, arg0, (byte) 127, 0, false, var5, 0);
                                var6.method114(2);
                            }
                            var5.method114(2);
                        }
                        for (class356 var7 = var4.field1064; var7 != null; var7 = var7.field5275) {
                            class407 var9 = var7.field5274;
                            if (var9 != null && var9.method107((byte) 127)) {
                                class27.method227(arg0, var9, var1, var2, var3, var9.field5924 + 1 - var9.field5917, var9.field5920 - var9.field5918 + 1);
                                var9.method114(2);
                            }
                        }
                        class441 var8 = var4.field1079;
                        if (var8 != null && var8.method107((byte) 127)) {
                            class387.method2511(arg0, var8, var1, var2, var3);
                            var8.method114(2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
    public static void method2647(byte arg0) {
        int var1 = -44 % ((7 - arg0) / 60);
        field6106 = null;
        field6107 = null;
        field6108 = null;
        field6111 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6106[var0] = var1;
        }
        field6110 = false;
    }
}
