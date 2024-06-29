import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class186 {

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "Lrk;")
    private class419 field2821;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "[I")
    public static int[] field2817 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "Lqu;")
    public static class364 field2816 = new class364(23, -1);

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "Z")
    public static boolean field2824 = false;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "Ljd;")
    private class496 field2822;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lrk;I)V")
    public final void method1220(class419 arg0, int arg1) {
        field2820++;
        if (arg1 != 23) {
            this.field2821 = null;
        }
        this.field2821 = arg0;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZ)V")
    public static final void method1221(int arg0, boolean arg1) {
        field2818++;
        if (arg1 && class113.field1419 != null) {
            class4.field43 = class113.field1419.field651;
        } else {
            class4.field43 = -1;
        }
        class113.field1419 = null;
        class436.field6426 = 0;
        class34.field391 = null;
        class384.field5622 = null;
        class113.method686();
        class113.field1428.method2499(0);
        class292.field4277 = null;
        class576.field8507 = null;
        class71.field833 = null;
        class377.field5543 = null;
        class64.field747 = null;
        class53.field639 = -1;
        class325.field4809 = null;
        class17.field147 = arg0;
        class328.field4851 = null;
        class150.field1925 = null;
        class523.field7755 = null;
        class113.field1431 = null;
        if (class113.field1420 != null) {
            class113.field1420.method1214((byte) -58);
            class113.field1420.method1217(128, 64, arg0 + 84);
        }
        if (class113.field1418 != null) {
            class113.field1418.method1718(64, 64, 126);
        }
        if (class113.field1421 != null) {
            class113.field1421.method2010(64, true);
        }
        class23.field200.method2976(true, 64);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)Ljd;")
    public final class496 method1222(byte arg0) {
        field2819++;
        class496 var2 = this.field2821.field6029.field7469;
        if (this.field2821.field6029 == var2) {
            this.field2822 = null;
            return null;
        } else {
            this.field2822 = var2.field7469;
            int var3 = -31 / ((-arg0 - 22) / 41);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
    public static void method1223(int arg0) {
        field2817 = null;
        if (arg0 != -24602) {
            method1223(-82);
        }
        field2816 = null;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)Ljd;")
    public final class496 method1224(int arg0) {
        if (arg0 != 16711680) {
            method1223(-34);
        }
        field2823++;
        class496 var2 = this.field2822;
        if (this.field2821.field6029 == var2) {
            this.field2822 = null;
            return null;
        } else {
            this.field2822 = var2.field7469;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V")
    public class186() {
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lrk;)V")
    public class186(class419 arg0) {
        this.field2821 = arg0;
    }
}
