import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class91 {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[J")
    public static long[] field1315 = new long[1000];

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "[I")
    public static int[] field1320 = new int[5];

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "[Z")
    public static boolean[] field1322 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Lke;")
    public static class218 field1321;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILjava/util/Random;)I", line = 24)
    public static final int method640(int arg0, int arg1, Random arg2) {
        field1317++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class150.method1036(-8, arg1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else if (arg0 < 6) {
            return 57;
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class175.method1255(arg1, var4, false);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 59)
    public static final void method641(int arg0, int arg1) {
        class60.field862.method138(arg1, arg0 - 1);
        if (arg0 != 1) {
            method644(-113, -1, -41, -102, -111);
        }
        field1318++;
        class2.field19.method138(arg1, 0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIBI)V", line = 73)
    public static final void method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg8 >= -66) {
            method644(-117, 62, -12, -54, -33);
        }
        class125 var10 = null;
        field1313++;
        for (class125 var11 = (class125) class286.field4645.method1495(-312); var11 != null; var11 = (class125) class286.field4645.method1501(65)) {
            if (var11.field1859 == arg9 && var11.field1865 == arg7 && var11.field1867 == arg0 && var11.field1854 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class125();
            var10.field1865 = arg7;
            var10.field1859 = arg9;
            var10.field1854 = arg6;
            var10.field1867 = arg0;
            class245.method1749(var10, 18583);
            class286.field4645.method1503(var10, (byte) -79);
        }
        var10.field1866 = arg2;
        var10.field1855 = arg1;
        var10.field1849 = arg5;
        var10.field1860 = arg3;
        var10.field1853 = arg4;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V", line = 120)
    public static void method643(boolean arg0) {
        field1321 = null;
        field1315 = null;
        field1322 = null;
        if (arg0) {
            field1320 = (int[]) null;
        }
        field1320 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V", line = 135)
    public static final void method644(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1323++;
        if (class167.field2661 == 1) {
            class199.field3202[class301.field4878 / 100].method83(class282.field4583 - 8, class148.field2299 + -8);
        }
        if (arg0 == 8) {
            if (class167.field2661 == 2) {
                class199.field3202[class301.field4878 / 100 + 4].method83(class282.field4583 - 8, class148.field2299 - 8);
            }
            class109.method736(arg0 - 416295009);
        }
    }
}
