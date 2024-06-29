import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class85 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[Z")
    public static boolean[] field1428 = new boolean[100];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
    public static final String method599(int arg0, long arg1, int[] arg2, int arg3) {
        field1430++;
        if (arg0 != -26198) {
            field1428 = null;
        }
        if (class227.field3460 != null) {
            String var5 = class227.field3460.method1215(arg1, arg3, arg0 + 26078, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method600(byte arg0) {
        field1428 = null;
        if (arg0 != -33) {
            field1432 = 56;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZBLhc;Lpe;Lhc;)V")
    public static final void method601(boolean arg0, byte arg1, class235 arg2, class252 arg3, class235 arg4) {
        class111.field1818 = arg0;
        class258.field4128 = arg2;
        if (arg1 != -4) {
            method599(120, -47L, (int[]) null, 36);
        }
        class61.field1054 = arg4;
        field1427++;
        int var5 = class61.field1054.method1618(0) - 1;
        class31.field461 = class61.field1054.method1616(var5, -12772) + var5 * 256;
        class287.field4539 = new String[] { null, null, null, null, class162.field2535 };
        class94.field1604 = arg3;
        class55.field915 = new String[] { null, null, class65.field1093, null, null };
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)Lge;")
    public static final class72 method602(boolean arg0, int arg1) {
        class72 var2 = (class72) class204.field3185.method1887(0, (long) arg1);
        field1429++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class61.field1054.method1590(class288.method1931(arg1, 255), (byte) -25, class34.method267(arg1, (byte) 118));
        class72 var4 = new class72();
        var4.field1203 = arg1;
        if (var3 != null) {
            var4.method527((byte) 14, new class88(var3));
        }
        var4.method520(-28404);
        if (var4.field1168 != -1) {
            var4.method513(16, method602(false, var4.field1168), method602(false, var4.field1217));
        }
        if (var4.field1191 != -1) {
            var4.method515((byte) 43, method602(false, var4.field1185), method602(arg0, var4.field1191));
        }
        if (!class111.field1818 && var4.field1169) {
            var4.field1177 = class55.field915;
            var4.field1190 = false;
            var4.field1195 = class287.field4539;
            var4.field1176 = class158.field2455;
            var4.field1198 = 0;
        }
        class204.field3185.method1886(-108, (long) arg1, var4);
        if (arg0) {
            method602(false, -11);
        }
        return var4;
    }
}
