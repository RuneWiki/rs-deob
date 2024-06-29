import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class101 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
    public static int[] field1734 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1736 = 0;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1737 = "";

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I", line = 3)
    public static final int method859(int arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0xD5555555);
        field1735++;
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        if (arg0 == -1265031166) {
            int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 19)
    public static void method860(int arg0) {
        field1737 = null;
        field1734 = null;
        if (arg0 >= -118) {
            method860(66);
        }
    }
}
