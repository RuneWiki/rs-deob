import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class415 extends class340 {

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lf;")
    public class412 field6106;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field6100 = 0;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Z")
    public static boolean field6102 = false;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "B")
    public static byte field6099;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lum;")
    public static class83 field6098;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)S")
    public static final short method2598(byte arg0, int arg1) {
        field6103++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x382) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        if (arg0 != -124) {
            field6098 = null;
        }
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBIII)V")
    public static final void method2599(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class232.field3492 <= arg0 - arg3 && class36.field453 >= (arg0 + arg3) && (arg2 - arg3) >= class487.field7124 && class232.field3493 >= (arg2 + arg3)) {
            class122.method909(arg1 + 25, arg3, arg2, arg0, arg4);
        } else {
            class1.method4(arg2, false, arg4, arg0, arg3);
        }
        if (arg1 == -122) {
            field6101++;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method2600(int arg0) {
        if (arg0 >= 11) {
            field6098 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLfh;)Lrk;")
    public static final class343 method2601(byte arg0, class194 arg1) {
        if (arg0 <= 58) {
            field6100 = 90;
        }
        field6104++;
        class343 var2 = new class343();
        var2.field5116 = arg1.method1396(-109);
        var2.field5118 = class376.field5554.method1083(1, var2.field5116);
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IIIII)V")
    public static final void method2602(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6105++;
        if (arg3 == -51 && class40.field667.field4199 != 0 && arg4 != 0 && class510.field7414 < 50 && arg0 != -1) {
            class258.field4135[class510.field7414++] = new class128((byte) 2, arg0, arg4, arg2, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Ltt;II[B)V")
    public class415(class249 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6106 = class447.method2751(6406, arg0, (byte) 108, arg2, arg3, false, arg1, 6406);
        this.field6106.method437(false, (byte) -98, false);
    }
}
