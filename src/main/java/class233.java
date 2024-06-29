import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class233 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3716 = 0;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Z")
    public static boolean field3722 = false;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "[I")
    public static int[] field3724 = new int[2000];

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3721 = 0;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3720 = 1;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field3728 = 0;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I", line = 7)
    public static final int method1673(int arg0, int arg1) {
        field3727++;
        if (arg1 != 0) {
            field3724 = (int[]) null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 32)
    public static void method1674(byte arg0) {
        field3724 = null;
        if (arg0 >= -113) {
            field3717 = 55;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([BI)Lml;", line = 42)
    public static final class143 method1675(byte[] arg0, int arg1) {
        field3718++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 < 123) {
            method1677(-80);
        }
        class143 var2;
        if (class186.field2991) {
            var2 = new class67(arg0, class163.field2657, class162.field2647, class244.field3885, class21.field316, class3.field20);
        } else {
            var2 = new class104(arg0, class163.field2657, class162.field2647, class244.field3885, class21.field316, class3.field20);
        }
        class17.method115((byte) -126);
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lkb;ILkb;)V", line = 80)
    public static final void method1676(class39 arg0, int arg1, class39 arg2) {
        class74.field958 = arg0;
        if (arg1 != 0) {
            field3728 = 19;
        }
        class71.field923 = arg2;
        field3725++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 103)
    public static final void method1677(int arg0) {
        if (arg0 > -83) {
            return;
        }
        int[] var1 = new int[class239.field3786];
        int var2 = 0;
        field3723++;
        for (int var3 = 0; var3 < class239.field3786; var3++) {
            class74 var4 = class31.method198(false, var3);
            if (var4.field964 >= 0 || var4.field993 >= 0) {
                var1[var2++] = var3;
            }
        }
        class17.field228 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class17.field228[var5] = var1[var5];
        }
    }
}
