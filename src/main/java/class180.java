import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class180 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1217(int arg0, int arg1, byte arg2) {
        if (arg2 >= -89) {
            return false;
        } else {
            field2554++;
            return (arg0 & 0x8000) != 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
    public static final int method1218(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        field2553++;
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xB3333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg1 >= -114) {
            method1219(-117);
        }
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)I")
    public static final int method1219(int arg0) {
        field2552++;
        if (arg0 != 5100) {
            method1218(-124, 42);
        }
        return class64.method657(false, 4071);
    }
}
