import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class147 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "[I")
    public static int[] field2326 = new int[5];

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Z")
    public static boolean field2331 = true;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Loe;")
    public static class145 field2328;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public static void method990(boolean arg0) {
        if (arg0) {
            field2332 = -111;
        }
        field2328 = null;
        field2326 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)I")
    public static final int method991(int arg0, int arg1) {
        field2329++;
        if (arg1 != -2) {
            method992(-21, -44);
        }
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)I")
    public static final int method992(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILhc;Lhc;)I")
    public static final int method993(int arg0, class235 arg1, class235 arg2) {
        int var3 = 0;
        field2330++;
        if (arg1.method1613(false, class267.field4264)) {
            var3++;
        }
        if (arg1.method1613(false, class171.field2663)) {
            var3++;
        }
        if (arg1.method1613(false, class182.field2833)) {
            var3++;
        }
        if (arg2.method1613(false, class267.field4264)) {
            var3++;
        }
        if (arg2.method1613(false, class171.field2663)) {
            var3++;
        }
        if (arg2.method1613(false, class182.field2833)) {
            var3++;
        }
        int var4 = 6 % ((arg0 - 62) / 48);
        return var3;
    }
}
