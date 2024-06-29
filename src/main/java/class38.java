import java.awt.Container;
import java.awt.Insets;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class38 {

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Ljd;")
    public static class86 field900 = class122.method868(": ", true);

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Ljd;")
    public static class86 field903 = class122.method868(")1u1)1m", true);

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Ljd;")
    private static class86 field904 = class122.method868("Loading wordpack )2 ", true);

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field897 = -1;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljd;")
    public static class86 field898 = field904;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field905 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lwj;")
    public static class6 field901;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIIIZI)V")
    public static final void method319(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field899++;
        if (arg1 == 3) {
            method319(true, class42.field949, 25, -1, arg4, true, -1);
            return;
        }
        Container var7;
        if (class88.field1746 != null) {
            var7 = class88.field1746;
        } else if (class138.field2627 == null) {
            var7 = class157.field2954.field4514;
        } else {
            var7 = class138.field2627;
        }
        class255.field4540 = var7.getSize().width;
        class200.field3571 = var7.getSize().height;
        if (class138.field2627 == var7) {
            Insets var8 = class138.field2627.getInsets();
            class200.field3571 -= var8.top + var8.bottom;
            class255.field4540 -= var8.left + var8.right;
        }
        if (arg1 < 2) {
            class248.field4414 = 503;
            class213.field3858 = 0;
            class4.field53 = 765;
            class183.field3263 = (class255.field4540 - 765) / 2;
        } else {
            class4.field53 = class255.field4540;
            class213.field3858 = 0;
            class183.field3263 = 0;
            class248.field4414 = class200.field3571;
        }
        if (arg0) {
            class232.method1609(class50.field1057, false);
            class179.method1255(0, class50.field1057);
            if (class218.field3918 != null) {
                class218.field3918.method190(class50.field1057, (byte) -22);
            }
            class98.field1942.method264(86);
            class160.method1167((byte) 70, class50.field1057);
            class39.method325(class50.field1057, -122);
            if (class218.field3918 != null) {
                class218.field3918.method192(class50.field1057, false);
            }
        } else {
            class50.field1057.setSize(class4.field53, class248.field4414);
            if (class138.field2627 == var7) {
                Insets var9 = class138.field2627.getInsets();
                class50.field1057.setLocation(var9.left + class183.field3263, class213.field3858 + var9.top);
            } else {
                class50.field1057.setLocation(class183.field3263, class213.field3858);
            }
        }
        if (arg1 > 0) {
            method319(true, 0, 25, -1, arg4, true, -1);
            return;
        }
        if (arg2 != 25) {
            method323(-86);
        }
        if (class178.field3225 != -1) {
            class241.method1651(true, (byte) 66);
        }
        if (class248.field4415 != null && (class84.field1634 == 30 || class84.field1634 == 25)) {
            class115.method813(-56);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class21.field540[var10] = true;
        }
        class136.field2603 = true;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(JB)Ljd;")
    public static final class86 method320(long arg0, byte arg1) {
        field893++;
        class195.field3503.setTime(new Date(arg0));
        int var3 = class195.field3503.get(7);
        int var4 = -115 % ((arg1 - 69) / 49);
        int var5 = class195.field3503.get(5);
        int var6 = class195.field3503.get(2);
        int var7 = class195.field3503.get(1);
        int var8 = class195.field3503.get(11);
        int var9 = class195.field3503.get(12);
        int var10 = class195.field3503.get(13);
        return class109.method783(2, new class86[] { class80.field1573[var3 - 1], class253.field4499, class4.method26(false, var5 / 10), class4.method26(false, var5 % 10), class252.field4472, class194.field3475[var6], class252.field4472, class4.method26(false, var7), class127.field2458, class4.method26(false, var8 / 10), class4.method26(false, var8 % 10), class130.field2480, class4.method26(false, var9 / 10), class4.method26(false, var9 % 10), class130.field2480, class4.method26(false, var10 / 10), class4.method26(false, var10 % 10), class188.field3336 });
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljd;I)Ljd;")
    public static final class86 method321(class86 arg0, int arg1) {
        field896++;
        int var2 = class160.method1165(123, arg0);
        return ~var2 == arg1 ? class75.field1500 : class106.field2030.field1170[var2].method594(arg1 + 3883, class200.field3552, class142.field2692);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjd;)I")
    public static final int method322(int arg0, class86 arg1) {
        field902++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class97.field1928; var2++) {
            if (arg1.method631(12508, class100.field1957[var2])) {
                return var2;
            }
        }
        if (arg0 != -29602) {
            method319(true, -118, -63, -21, -6, false, -37);
        }
        return -1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method323(int arg0) {
        if (arg0 > -94) {
            return;
        }
        field903 = null;
        field904 = null;
        field901 = null;
        field898 = null;
        field900 = null;
    }
}
