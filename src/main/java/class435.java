import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class435 extends class311 {

    @OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
    public static int[] field6142 = new int[256];

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public int field6140;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public int field6146;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "Lwn;")
    public static class77 field6148;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "[Z")
    public static boolean[] field6147;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)I")
    public static final int method2676(int arg0, int arg1, int arg2) {
        field6141++;
        if (arg0 == 4 || arg0 == 5) {
            return class211.field2960[arg1 & 0x3];
        } else if (arg2 == 10853) {
            return 256;
        } else {
            return -93;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static void method2677(int arg0) {
        field6147 = null;
        field6148 = null;
        if (arg0 != -9) {
            field6142 = null;
        }
        field6142 = null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static final void method2678(byte arg0) {
        field6145++;
        class113.field1744.method843(-1);
        int var1 = -41 % ((arg0 - 30) / 48);
        class204.field2903.method843(-1);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
    public static final void method2679(byte arg0) {
        field6144++;
        class279.field3801.method2522((byte) 127);
        if (arg0 >= -39) {
            field6147 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)I")
    public static final int method2680(int arg0, boolean arg1) {
        field6143++;
        return arg1 ? 29 : arg0 >>> 7;
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
            field6142[var0] = var1;
        }
    }
}
