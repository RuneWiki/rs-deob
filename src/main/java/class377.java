import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class377 {

    @OriginalMember(owner = "client!om", name = "g", descriptor = "[I")
    public static int[] field5252 = new int[4];

    @OriginalMember(owner = "client!om", name = "f", descriptor = "F")
    public static float field5251;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "[B")
    public byte[] field5247;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "[S")
    public short[] field5248;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "[S")
    public short[] field5249;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "[S")
    public short[] field5250;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 4)
    public static final void method2231(String arg0, int arg1, int arg2) {
        field5246++;
        class127 var3 = class760.method4231(arg1, -874792672, 3);
        if (arg2 >= -97) {
            method2231(null, -105, 3);
        }
        var3.method1010(614);
        var3.field2090 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 19)
    public static void method2232(byte arg0) {
        field5252 = null;
        if (arg0 >= -82) {
            method2232((byte) -61);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIII)I", line = 31)
    public static final int method2233(boolean arg0, int arg1, int arg2, int arg3) {
        field5253++;
        class287 var4 = class271.method1629(arg0, arg1, (byte) -60);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 71 / ((-arg3 - 3) / 42);
            int var6 = 0;
            for (int var7 = 0; var7 < var4.field4063.length; var7++) {
                if (var4.field4061[var7] == arg2) {
                    var6 += var4.field4063[var7];
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z", line = 69)
    public static final boolean method2234(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field5254++;
            return class649.method3549(23606, arg0, arg2) | (arg2 & 0x70000) != 0 || class705.method3965(arg2, (byte) -35, arg0);
        } else {
            return false;
        }
    }
}
