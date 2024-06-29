import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class70 extends class60 {

    @OriginalMember(owner = "client!om", name = "n", descriptor = "[Lsj;")
    public static class56[] field1338 = new class56[6];

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Ljf;")
    private static class229 field1333 = class212.method1457((byte) 117, "cyan:");

    @OriginalMember(owner = "client!om", name = "t", descriptor = "Ljf;")
    public static class229 field1344 = class212.method1457((byte) 100, " de votre liste noire)3");

    @OriginalMember(owner = "client!om", name = "v", descriptor = "Ljf;")
    public static class229 field1346 = field1333;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field1347 = 0;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Ljf;")
    public static class229 field1341 = field1333;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "Lek;")
    public static class185 field1335;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "[[[B")
    public static byte[][][] field1334;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method516(int arg0, byte arg1) {
        field1343++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 > -76) {
            field1339 = 38;
        }
        int var2 = class115.field2063[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1005;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(IB)I", line = 36)
    public static final int method517(int arg0, byte arg1) {
        field1345++;
        if (arg1 <= 87) {
            field1334 = (byte[][][]) ((byte[][][]) null);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 52)
    public static void method518(int arg0) {
        field1341 = null;
        field1344 = null;
        field1346 = null;
        field1334 = (byte[][][]) null;
        if (arg0 != -1) {
            method517(-51, (byte) 31);
        }
        field1338 = null;
        field1335 = null;
        field1333 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)I", line = 67)
    public static final int method519(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 120)
    public static final void method520(int arg0) {
        field1342++;
        if (arg0 != 2) {
            field1344 = (class229) null;
        }
        class93.field1685.method230(true);
        class249.field4383.method230(true);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V", line = 132)
    public static final void method521(byte arg0, int arg1) {
        class124.field2176--;
        field1340++;
        if (class124.field2176 == arg1) {
            return;
        }
        class36.method325(class150.field2584, arg1 + 1, class150.field2584, arg1, class124.field2176 - arg1);
        if (arg0 != 85) {
            field1347 = -47;
        }
        class36.method325(class143.field2498, arg1 + 1, class143.field2498, arg1, class124.field2176 - arg1);
        class36.method322(class115.field2063, arg1 + 1, class115.field2063, arg1, class124.field2176 - arg1);
        class36.method318(class267.field4579, arg1 + 1, class267.field4579, arg1, class124.field2176 - arg1);
        class36.method320(class229.field3952, arg1 + 1, class229.field3952, arg1, class124.field2176 - arg1);
        class36.method320(class18.field282, arg1 + 1, class18.field282, arg1, class124.field2176 - arg1);
    }
}
