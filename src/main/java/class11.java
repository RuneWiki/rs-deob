import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class11 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[Lp;")
    public static class163[] field143 = new class163[4];

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field147 = 0;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field154 = 2;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field146 = -1;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Ldc;")
    public static class37 field145 = class185.method1233((byte) 86, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Ldc;")
    private static class37 field151 = class185.method1233((byte) 86, "Please wait)3)3)3");

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Ldc;")
    public static class37 field149 = class185.method1233((byte) 86, "Abbrechen");

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Ldc;")
    public static class37 field150 = field151;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Z")
    public static boolean field158 = false;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Ldc;")
    private static class37 field159 = class185.method1233((byte) 86, "green:");

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Ldc;")
    public static class37 field148 = field159;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Ldc;")
    public static class37 field157 = field159;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[[I")
    public static int[][] field156;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)V")
    public static final void method70(int arg0, boolean arg1) {
        field152++;
        class108.method707((byte) -123);
        class232.field4239++;
        if (class232.field4239 < 50 && !arg1) {
            return;
        }
        if (arg0 != 56) {
            method70(-92, true);
        }
        class232.field4239 = 0;
        if (class41.field846 || class180.field3352 == null) {
            return;
        }
        class135.field2497++;
        class49.field970.method1503(56, 2976);
        try {
            class180.field3352.method558(30000, class49.field970.field526, 0, class49.field970.field502);
            class49.field970.field526 = 0;
        } catch (IOException var2) {
            class41.field846 = true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public static final void method71(int arg0, int arg1) {
        if (arg1 >= -106) {
            field145 = null;
        }
        if (class95.field1661 == null || class95.field1661.length < arg0) {
            class95.field1661 = new int[arg0];
        }
        field153++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method72(int arg0) {
        field156 = null;
        field151 = null;
        field149 = null;
        field145 = null;
        field159 = null;
        field143 = null;
        field150 = null;
        field148 = null;
        if (arg0 >= -94) {
            method70(-96, false);
        }
        field157 = null;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static final void method73(int arg0) {
        if (arg0 != 11980) {
            method70(2, false);
        }
        field144++;
        for (int var1 = 0; var1 < 100; var1++) {
            class211.field3948[var1] = true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public static final void method74(int arg0) {
        field155++;
        for (int var1 = -1; var1 < class76.field1342; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class9.field122[var1];
            }
            class123 var6 = class8.field107[var5];
            if (var6 != null && var6.field3470 > 0) {
                var6.field3470--;
                if (var6.field3470 == 0) {
                    var6.field3501 = null;
                }
            }
        }
        for (int var2 = arg0; var2 < class95.field1669; var2++) {
            int var3 = class92.field1579[var2];
            class66 var4 = class70.field1262[var3];
            if (var4 != null && var4.field3470 > 0) {
                var4.field3470--;
                if (var4.field3470 == 0) {
                    var4.field3501 = null;
                }
            }
        }
    }
}
