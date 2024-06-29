import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class26 extends class240 {

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Ljava/lang/String;")
    public static String field424 = "Checking for updates - ";

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
    public static int[] field429 = new int[50];

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Ljava/lang/String;")
    public static String field433 = " ";

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field434 = 0;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "Ljava/lang/String;")
    public static String field436 = "Drop";

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "[I")
    public static int[] field427;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZJ)V", line = 11)
    public static final void method172(boolean arg0, long arg1) {
        field431++;
        if (arg1 != 0L && !arg0) {
            class269.field4191.method246(arg0, 1);
            class269.field4191.method760(arg1, true);
            class216.field3435++;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I", line = 28)
    public static final int method173(int arg0, int arg1) {
        field428++;
        if (arg0 != 295655336) {
            method175((byte) 57);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)Lui;", line = 43)
    public static final class266 method174(int arg0, boolean arg1) {
        field425++;
        if (!arg1) {
            method174(-78, true);
        }
        class266 var2 = (class266) class88.field1355.method1830((long) arg0, (byte) 52);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class292.field4534.method467(0, 127, arg0);
        class266 var4 = new class266(var3);
        var4.method1036(class224.field3600, (int[]) null);
        class88.field1355.method1831((long) arg0, var4, -13897);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 65)
    public static final void method175(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class30.field502[var1] = true;
        }
        if (arg0 != -113) {
            method172(true, -127L);
        }
        field432++;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V", line = 97)
    public static void method176(int arg0) {
        field424 = null;
        field436 = null;
        field427 = null;
        field433 = null;
        field429 = null;
        if (arg0 < 41) {
            field427 = (int[]) null;
        }
    }
}
