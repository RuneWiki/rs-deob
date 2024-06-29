import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class357 extends Exception {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "S")
    public static short field5144 = 32767;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Lqk;")
    public static class1 field5142 = new class1(12, 3);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)S", line = 4)
    public static final short method2236(int arg0, byte arg1) {
        field5143++;
        int var2 = (arg0 & 0xFFB9) >> 10;
        int var3 = (arg0 & 0x384) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        int var9 = -13 % ((arg1 + 67) / 59);
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)I", line = 32)
    public static final int method2237(int arg0, int arg1) {
        field5141++;
        if (arg0 != 127) {
            method2236(37, (byte) 116);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 53)
    public static void method2238(byte arg0) {
        if (arg0 <= 69) {
            method2237(111, 53);
        }
        field5142 = null;
    }
}
