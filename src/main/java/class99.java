import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class99 implements class258 {

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "Lsfa;")
    public static class648 field1767;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
    public static void method933(int arg0) {
        field1767 = null;
        if (arg0 != -2) {
            field1767 = null;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IB)V")
    public static final void method934(int arg0, byte arg1) {
        class453.field6461 = -1;
        class243.field3674 = arg0;
        field1765++;
        class459.field6560 = -1;
        class628.method3597((byte) -117);
        if (arg1 < 19) {
            field1767 = null;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIII)V")
    public static final void method935(int arg0, int arg1, int arg2, int arg3) {
        field1768++;
        String var4 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & arg3);
        System.out.println(var4);
        class97.method917(false, var4, false, true);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lpl;I)V")
    public static final void method936(class604 arg0, int arg1) {
        field1769++;
        boolean var2 = false;
        if (class336.field5031 == arg0.field8719 || arg0.field8755 == -1 || arg0.field8738 != 0) {
            var2 = true;
        } else {
            class138 var3 = class357.field5338.method2099(arg0.field8755, true);
            if (var3.field2445 || var3.field2431[arg0.field8677] < arg0.field8741 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field8719 - arg0.field8729;
            int var5 = class336.field5031 - arg0.field8729;
            int var6 = arg0.field8751 * 512 + arg0.method3446(0) * 256;
            int var7 = arg0.field8750 * 512 + (arg0.method3446(0) * 256);
            int var8 = arg0.field8681 * 512 + arg0.method3446(0) * 256;
            int var9 = arg0.field8711 * 512 + arg0.method3446(0) * 256;
            arg0.field9815 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
            arg0.field9806 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg0.field8778 = 0;
        if (arg0.field8712 == 0) {
            arg0.method3454(8192, 0, false);
        }
        if (arg0.field8712 == 1) {
            arg0.method3454(12288, 0, false);
        }
        if (arg1 <= 63) {
            return;
        }
        if (arg0.field8712 == 2) {
            arg0.method3454(0, 0, false);
        }
        if (arg0.field8712 == 3) {
            arg0.method3454(4096, 0, false);
        }
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(I)V")
    public class99(int arg0) {
        this.field1770 = arg0;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Lph;")
    public final class598 method474(int arg0) {
        if (arg0 == 6686) {
            field1766++;
            return class157.field2681;
        } else {
            return null;
        }
    }
}
