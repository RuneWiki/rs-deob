import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class185 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
    public static int[] field2546 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field2545 = 0;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field2549 = 1;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
    public static int[] field2547 = new int[50];

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Lfm;")
    public static class53 field2551 = new class53(64);

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "[C")
    public static char[] field2555 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2554 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Z")
    public static boolean field2558 = true;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
    public static int[] field2557 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "Z")
    public static boolean field2559 = false;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "[[B")
    public static byte[][] field2553;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBII)I", line = 12)
    public static final int method1299(int arg0, byte arg1, int arg2, int arg3) {
        field2550++;
        if (arg1 < 105) {
            return -69;
        } else if (arg3 <= arg0) {
            return (arg0 > arg2 ? arg2 : arg0);
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)V", line = 28)
    public static final void method1300(int arg0, byte arg1) {
        if (arg1 >= 89) {
            field2552++;
            class153.field2126.method720(arg0, 1088);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIZ)I", line = 64)
    public static final int method1301(int arg0, int arg1, int arg2, boolean arg3) {
        field2548++;
        class113 var4 = (class113) class255.field3648.method111(51, (long) arg2);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        int var6 = 0;
        if (arg0 != -1283) {
            method1302(-103);
        }
        while (var6 < var4.field1541.length) {
            if (var4.field1541[var6] >= 0 && class63.field824 > var4.field1541[var6]) {
                class198 var7 = class115.method854((byte) 93, var4.field1541[var6]);
                if (var7.field2793 != null) {
                    class336 var8 = (class336) var7.field2793.method111(37, (long) arg1);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field1546[var6] * var8.field5063;
                        } else {
                            var5 += var8.field5063;
                        }
                    }
                }
            }
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 119)
    public static void method1302(int arg0) {
        if (arg0 != 120) {
            return;
        }
        field2547 = null;
        field2554 = null;
        field2553 = (byte[][]) null;
        field2551 = null;
        field2557 = null;
        field2546 = null;
        field2555 = null;
    }
}
