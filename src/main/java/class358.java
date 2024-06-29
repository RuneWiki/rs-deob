import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class358 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)I", line = 6)
    public static final int method2262(boolean arg0, int arg1) {
        field5027++;
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAA) >>> 1);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        if (arg0) {
            return 50;
        } else {
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Z", line = 26)
    public static final boolean method2263(int arg0, int arg1, int arg2) {
        if (arg0 != 1064779144) {
            field5029 = -84;
        }
        field5024++;
        return class600.method3494((byte) -52, arg1, arg2) & class161.method1217(arg2, (byte) -53, arg1);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lso;I)Llc;", line = 37)
    public static final class673 method2264(class494 arg0, int arg1) {
        field5025++;
        class673 var2 = new class673();
        if (arg1 == 2) {
            var2.field9374 = arg0.method2998(true);
            var2.field9381 = class204.field3172.method3795(var2.field9374, (byte) 93);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)I", line = 54)
    public static final int method2265(int arg0, int arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1 != 255) {
            method2263(101, -56, -13);
        }
        field5026++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
