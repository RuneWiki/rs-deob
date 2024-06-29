import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class115 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Z")
    public static boolean field1514 = false;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field1516 = 0;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "[I")
    public static int[] field1518 = new int[1];

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static void method760(byte arg0) {
        field1518 = null;
        int var1 = 79 % ((arg0 + 87) / 32);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I")
    public static final int method761(int arg0, int arg1) {
        field1515++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        int var8 = 44 / ((-arg0 - 35) / 61);
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
    public static final void method762(byte arg0) {
        field1517++;
        int var1 = 20 / ((47 - arg0) / 50);
        class13 var2 = null;
        try {
            var2 = class739.method4133(-106, "2");
            class611 var3 = new class611(class223.field2875 * 6 + 3);
            var3.method3393(1, -89);
            var3.method3423(class223.field2875, 1571862888);
            for (int var4 = 0; var4 < class161.field2024.length; var4++) {
                if (class633.field8794[var4]) {
                    var3.method3423(var4, 1571862888);
                    var3.method3384(1571862888, class161.field2024[var4]);
                }
            }
            var2.method53(var3.field8529, 4657, 0, var3.field8520);
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method51(true);
            }
        } catch (Exception var5) {
        }
        class322.field4325 = class538.method2963(-47);
        class711.field9923 = false;
    }
}
