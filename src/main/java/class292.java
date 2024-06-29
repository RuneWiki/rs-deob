import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class292 extends class393 {

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field4222 = 0;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "[I")
    public static int[] field4226 = new int[256];

    @OriginalMember(owner = "client!es", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4225 = "green:";

    @OriginalMember(owner = "client!es", name = "B", descriptor = "Lwe;")
    public static class24 field4237;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public int field4229;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "[I")
    public int[] field4224;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "[I")
    public int[] field4227;

    @OriginalMember(owner = "client!es", name = "C", descriptor = "[I")
    public int[] field4238;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "[Lor;")
    public class296[] field4234;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "[Lor;")
    public class296[] field4236;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "[[[B")
    public byte[][][] field4223;

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
            field4226[var0] = var1;
        }
        field4237 = new class24(20);
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V", line = 3)
    public static void method1871(int arg0) {
        int var1 = 92 / ((84 - arg0) / 39);
        field4226 = null;
        field4225 = null;
        field4237 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V", line = 22)
    public static final void method1872(int arg0, int arg1, int arg2) {
        field4235++;
        int var3 = 117 / ((61 - arg2) / 41);
        class52.field762 = new class24(arg0);
        class220.field3136 = new class24(arg1);
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V", line = 42)
    public static final void method1873(int arg0) {
        if (arg0 != 19560) {
            method1875(-37, -56, false, true, -24);
        }
        field4233++;
        if (class190.field2652 == null) {
            return;
        }
        if (class190.field2652.field4259 == 1) {
            class190.field2652 = null;
            return;
        }
        if (class190.field2652.field4259 == 2) {
            class11.method80(class313.field4478, class161.field2101, (byte) -124, 2);
            class190.field2652 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II)V", line = 75)
    public static final void method1874(int arg0, int arg1) {
        field4232++;
        class328.field4707.method215(arg0 ^ arg0, arg1);
        class16.field177.method215(0, arg1);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZZI)Lsm;", line = 87)
    public static final class158 method1875(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field4228++;
        class158 var5 = new class158();
        var5.field2074 = arg1;
        var5.field2075 = arg0;
        class269.field3933.method956(arg3, (long) arg4, var5);
        class451.method2822((byte) -69, arg0);
        class249 var6 = class107.method746(arg4, -24);
        if (var6 != null) {
            class392.method2564(-96, var6);
        }
        if (class371.field5518 != null) {
            class392.method2564(-100, class371.field5518);
            class371.field5518 = null;
        }
        class165.method1027(124);
        if (var6 != null) {
            class272.method1743(73, var6, !arg2);
        }
        if (!arg2) {
            class365.method2391(arg0);
        }
        if (!arg2 && class404.field6020 != -1) {
            class116.method813(class404.field6020, 4095, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lhp;Z)V", line = 126)
    public static final void method1876(class88 arg0, boolean arg1) {
        field4239++;
        if (!arg1) {
            method1873(-22);
        }
        class248.field3456 = arg0;
    }
}
