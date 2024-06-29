import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class135 extends class110 {

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "[I")
    public static int[] field2149 = new int[256];

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field2148 = 0;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "[I")
    public static int[] field2152;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V", line = 7)
    public static final void method1007(byte arg0, boolean arg1) {
        if (arg0 != 84) {
            field2148 = -92;
        }
        field2151++;
        if (arg1 != class285.field4581) {
            class285.field4581 = arg1;
            class338.method2357(false);
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
            field2149[var0] = var1;
        }
        field2152 = new int[] { -1, -1, 1, 1 };
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I", line = 36)
    public static final int method1008(int arg0, int arg1) {
        int var2 = 1 / ((-arg0 - 48) / 45);
        field2153++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 76)
    public static void method1009(int arg0) {
        field2152 = null;
        field2149 = null;
        if (arg0 != -2) {
            method1007((byte) -101, false);
        }
    }
}
