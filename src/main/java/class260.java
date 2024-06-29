import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class260 {

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "[B")
    public static byte[] field3755;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Z)V")
    public static void method1755(boolean arg0) {
        field3755 = null;
        if (!arg0) {
            field3755 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(Z)V")
    public static final void method1756(boolean arg0) {
        if (!arg0) {
            method1759(null, -81);
        }
        field3756++;
        class58.field830.method1941((byte) 104);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILdc;)Lnia;")
    public static final class493 method1757(int arg0, class63 arg1) {
        field3753++;
        class493 var2 = new class493();
        var2.field6915 = arg1.method482(arg0 - 772611266);
        var2.field6914 = class145.field2038.method1107(true, var2.field6915);
        if (arg0 != 19594) {
            method1759(null, -3);
        }
        return var2;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
    public static final void method1758(int arg0) {
        if (arg0 == 0) {
            if (class265.field3895 == 2) {
                class280.field4069[0].method636(class690.field9610[0]);
                class280.field4069[1].method636(class690.field9610[1]);
            } else if (class265.field3895 == 3) {
                class280.field4069[0].method636(class690.field9610[0]);
                class280.field4069[1].method636(class690.field9610[1]);
                class280.field4069[2].method636(class690.field9610[2]);
            } else {
                class280.field4069[0].method636(class690.field9610[0]);
                class280.field4069[1].method636(class690.field9610[1]);
                class280.field4069[2].method636(class690.field9610[2]);
                class280.field4069[3].method636(class690.field9610[3]);
            }
        } else if (arg0 == 1) {
            if (class265.field3895 == 2) {
                class280.field4069[0].method636(class690.field9610[2]);
            } else if (class265.field3895 == 3) {
                class280.field4069[0].method636(class690.field9610[3]);
                class280.field4069[1].method636(class690.field9610[4]);
            } else {
                class280.field4069[0].method636(class690.field9610[4]);
                class280.field4069[1].method636(class690.field9610[5]);
                class280.field4069[2].method636(class690.field9610[6]);
            }
        } else if (arg0 == 2) {
            if (class265.field3895 == 2) {
                class280.field4069[0].method636(class690.field9610[3]);
                return;
            }
            if (class265.field3895 == 3) {
                class280.field4069[0].method636(class690.field9610[5]);
                return;
            }
            class280.field4069[0].method636(class690.field9610[7]);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lwq;I)I")
    public static final int method1759(class679 arg0, int arg1) {
        field3754++;
        class123 var2 = arg0.field9436;
        if (var2.field1700 != null) {
            var2 = var2.method773(class124.field1712, false);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1695;
        class32 var4 = arg0.method3084((byte) -92);
        if (arg0.field7159 == arg1 || arg0.field7165) {
            var3 = var2.field1632;
        } else if (arg0.field7159 == var4.field420 || arg0.field7159 == var4.field379 || arg0.field7159 == var4.field398 || arg0.field7159 == var4.field414) {
            var3 = var2.field1653;
        } else if (arg0.field7159 == var4.field407 || arg0.field7159 == var4.field415 || arg0.field7159 == var4.field418 || arg0.field7159 == var4.field421) {
            var3 = var2.field1625;
        }
        return var3;
    }

    static {
        int var0 = 0;
        field3755 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3755[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
