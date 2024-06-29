import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class249 {

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
    public int[] field3444;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "[I")
    public int[] field3443;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lng;")
    public static class190 field3445 = new class190(64);

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field3453 = -1;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field3454 = 12;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Z")
    public static boolean field3451 = true;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "[I")
    public static int[] field3455;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "[Lsm;")
    public static class156[] field3456;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 4)
    public static void method1548(byte arg0) {
        field3455 = null;
        field3456 = null;
        if (arg0 >= -47) {
            field3455 = null;
        }
        field3445 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)I", line = 18)
    public static final int method1549(int arg0, boolean arg1) {
        field3447++;
        if (arg1) {
            return -113;
        } else {
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V", line = 44)
    public static final void method1550(byte arg0) {
        if (arg0 != 26) {
            method1548((byte) -6);
        }
        field3448++;
        if (class275.field3728 <= 0) {
            class60.field844 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class173.field2458.length; var2++) {
            if (class173.field2458[var2].startsWith("--> ")) {
                var1++;
                if (class275.field3728 == var1) {
                    class60.field844 = class173.field2458[var2].substring(4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V", line = 83)
    public class249(int arg0) {
        this.field3449 = arg0;
        this.field3444 = new int[this.field3449];
        this.field3443 = new int[this.field3449];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 94)
    public static final void method1551(int arg0) {
        class20.field259.method1243(1000);
        if (arg0 == -1298479124) {
            field3446++;
        }
    }
}
