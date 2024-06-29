import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class271 extends class61 {

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public int field4793;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public int field4790;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public int field4787;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public int field4789;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "[I")
    public static int[] field4783 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "Z")
    public static boolean field4786 = false;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "Leb;")
    public static class230 field4785 = class68.method589(0, " weitere Optionen");

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "Lkk;")
    public static class223 field4782;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "[Z")
    public static boolean[] field4794;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Z")
    public final boolean method1851(int arg0, int arg1, int arg2) {
        field4781++;
        if (arg2 == 255) {
            return this.field4789 <= arg1 && arg1 <= this.field4787 && this.field4793 <= arg0 && this.field4790 >= arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)I")
    public static final int method1852(int arg0, boolean arg1) {
        if (!arg1) {
            field4794 = null;
        }
        field4780++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static final void method1853(boolean arg0) {
        field4792++;
        class153.field2747.method978(-127, 56);
        class153.field2747.method170((byte) 126, class55.method444((byte) 123));
        if (!arg0) {
            method1854(88);
        }
        class163.field2896++;
        class153.field2747.method181(-20053, class180.field3155);
        class153.field2747.method181(-20053, class135.field2434);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public static void method1854(int arg0) {
        field4783 = null;
        field4785 = null;
        field4794 = null;
        if (arg0 != 67108863) {
            method1854(45);
        }
        field4782 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(III)Lah;")
    public static final class265 method1855(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class265 var4 = var3.field4065;
            var3.field4065 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIII)V")
    public class271(int arg0, int arg1, int arg2, int arg3) {
        this.field4793 = arg1;
        this.field4790 = arg3;
        this.field4787 = arg2;
        this.field4789 = arg0;
    }
}
