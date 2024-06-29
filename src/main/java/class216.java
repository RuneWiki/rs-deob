import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class216 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lhh;")
    private static class163 field3931 = class137.method1065("Free world", 17);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[Lhh;")
    public static class163[] field3929 = new class163[100];

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lhh;")
    public static class163 field3937 = class137.method1065("::clientdrop", 17);

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lhh;")
    public static class163 field3934 = field3931;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lpa;")
    public static class123 field3935;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Loh;")
    public static class79 field3932;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
    public static int[] field3933;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    public static final void method1534(int arg0, int arg1, int arg2) {
        if (class77.field1453 != arg2 && arg0 != -1) {
            class212.method1512((byte) -127, false, class77.field1453, 0, arg0, class20.field327);
            class123.field2360 = true;
        }
        field3930++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method1535(byte arg0) {
        int var1 = -104 / (-arg0 / 35);
        field3936++;
        for (int var2 = 0; var2 < class222.field4040; var2++) {
            int var3 = class124.field2392[var2];
            class126 var4 = class106.field2029[var3];
            int var5 = class33.field502.method622(true);
            if ((var5 & 0x2) != 0) {
                var5 += class33.field502.method622(true) << 8;
            }
            class209.method1500(var3, var4, var5, -16621);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public static final int method1536(int arg0, int arg1) {
        field3939++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        }
        if (arg1 > -40) {
            method1536(-73, 37);
        }
        if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method1537(boolean arg0) {
        field3933 = null;
        field3931 = null;
        field3935 = null;
        field3929 = null;
        field3932 = null;
        field3934 = null;
        field3937 = null;
        if (arg0) {
            field3934 = null;
        }
    }
}
