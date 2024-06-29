import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class237 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Lok;")
    public static class41 field3800 = class137.method956("<col=ffb000>", 45);

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field3802 = 0;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field3801 = 100;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "[I")
    public static int[] field3804 = new int[100];

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field3805 = -1;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)Z", line = 9)
    public static final boolean method1699(byte arg0, int arg1) {
        if (arg0 >= -41) {
            field3801 = 44;
        }
        field3803++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 29)
    public static void method1700(boolean arg0) {
        if (!arg0) {
            field3804 = (int[]) null;
        }
        field3804 = null;
        field3800 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z", line = 59)
    public static final boolean method1701(int arg0, int arg1, int arg2) {
        class171 var3 = class234.method1684(arg1 ^ 0x983, arg2);
        field3799++;
        if (~arg0 == arg1) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method1233(arg0, -11);
    }
}
