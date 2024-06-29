import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 extends class16 {

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "[I")
    public static int[] field2054 = new int[256];

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field2059 = 0;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "Lje;")
    public static class67 field2061;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "[I")
    public static int[] field2063;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Lje;")
    private static class67 field2064;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "Lje;")
    public static class67 field2062;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "Lje;")
    public static class67 field2067;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "Lob;")
    public static class99 field2065;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "Lje;")
    public static class67 field2070;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "Lje;")
    public static class67 field2068;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "Lob;")
    public static class99 field2069;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "B")
    public byte field2052;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "Lje;")
    public class67 field2066;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ld;I)V")
    public static final void method676(class22 arg0, int arg1) {
        if (arg0.field407 != null) {
            arg0.field407.field371 = 0;
        }
        field2053++;
        if (arg1 > -118) {
            field2065 = null;
        }
        arg0.field408 = false;
        for (class22 var2 = arg0.method159(); var2 != null; var2 = arg0.method153()) {
            method676(var2, -119);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)V")
    public static final void method677(int arg0, byte arg1, int arg2) {
        field2060++;
        if (class69.field1419 < 2 && class134.field3027 == 0 && !class38.field691) {
            return;
        }
        class67 var3;
        if (class134.field3027 == 1 && class69.field1419 < 2) {
            var3 = class49.method314(new class67[] { class86.field1901, class117.field2645, class3.field41, class61.field1221 }, 0);
        } else if (class38.field691 && class69.field1419 < 2) {
            var3 = class49.method314(new class67[] { class41.field777, class117.field2645, class142.field3255, class61.field1221 }, 0);
        } else {
            var3 = class37.method235((byte) 1, class69.field1419 - 1);
        }
        if (class69.field1419 > 2) {
            var3 = class49.method314(new class67[] { var3, class3.field33, class60.method420(class69.field1419 - 2, 28498), class80.field1762 }, 0);
        }
        if (arg1 < -54) {
            class89.field1976.method784(var3, arg2 + 4, arg0 + 15, 16777215, 0, class34.field627 / 1000);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
    public static void method678(byte arg0) {
        field2063 = null;
        field2062 = null;
        field2068 = null;
        field2054 = null;
        field2061 = null;
        field2067 = null;
        field2065 = null;
        field2070 = null;
        field2064 = null;
        field2069 = null;
        int var1 = -98 / ((arg0 + 23) / 60);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBILua;IZ)V")
    public static final void method679(int arg0, int arg1, byte arg2, int arg3, class140 arg4, int arg5, boolean arg6) {
        field2055++;
        long var7 = (long) ((arg0 << 16) + arg3);
        class120 var9 = (class120) class84.field1857.method1119(28254, var7);
        if (arg5 != -1772316688 || var9 != null) {
            return;
        }
        class120 var10 = (class120) class118.field2663.method1119(arg5 + 1772344942, var7);
        if (var10 != null) {
            return;
        }
        class120 var11 = (class120) class145.field3339.method1119(28254, var7);
        if (var11 == null) {
            if (!arg6) {
                class120 var12 = (class120) class18.field330.method1119(arg5 + 1772344942, var7);
                if (var12 != null) {
                    return;
                }
            }
            class120 var13 = new class120();
            var13.field2697 = arg4;
            var13.field2706 = arg2;
            var13.field2707 = arg1;
            if (arg6) {
                class84.field1857.method1115(var7, var13, arg5 ^ 0x965C97F1);
                class97.field2163++;
            } else {
                class88.field1944.method824(var13, 1);
                class145.field3339.method1115(var7, var13, arg5 ^ 0x965C97F1);
                class145.field3350++;
            }
        } else if (arg6) {
            var11.method192((byte) -66);
            class84.field1857.method1115(var7, var11, arg5 + 1772316689);
            class97.field2163++;
            class145.field3350--;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2054[var0] = var1;
        }
        field2061 = class85.method592(255, "Unerwartete Antwort vom Anmelde)2Server)3");
        field2063 = new int[128];
        field2064 = class85.method592(255, "Press (Wrecover a locked account(W on front page)3");
        field2062 = class85.method592(255, "null");
        field2067 = field2064;
        field2065 = new class99(50);
        field2070 = class85.method592(255, ")2");
        field2071 = -1;
        field2068 = class85.method592(255, "da dieser Computer gegen unsere ");
        field2069 = new class99(64);
    }
}
