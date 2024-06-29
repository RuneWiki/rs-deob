import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class279 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[Z")
    public static boolean[] field4123 = new boolean[8];

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4128 = 0;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Z")
    public static boolean field4126 = true;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Loi;")
    public static class53 field4124;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4125;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)Lwo;")
    public abstract class533 method865(int arg0);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public abstract void method864(int arg0);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
    public abstract boolean method870(int arg0, int arg1);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public abstract void method872(int arg0);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z")
    public static final boolean method1743(int arg0, int arg1, int arg2) {
        if (arg0 != 8) {
            field4125 = null;
        }
        field4127++;
        return class375.method2190((byte) 84, arg1, arg2) & class431.method2551((byte) 20, arg2, arg1);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public static void method1744(int arg0) {
        if (arg0 <= 97) {
            method1743(-119, 120, -50);
        }
        field4125 = null;
        field4123 = null;
        field4124 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Loi;Z)I")
    public static final int method1745(class53 arg0, boolean arg1) {
        field4129++;
        int var2 = 0;
        if (arg0.method424(0, class10.field143)) {
            var2++;
        }
        if (arg1) {
            method1745(null, false);
        }
        if (arg0.method424(0, class380.field5369)) {
            var2++;
        }
        return var2;
    }
}
