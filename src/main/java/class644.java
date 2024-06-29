import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class644 implements class419 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "Lpfa;")
    private class275 field8730;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "Ljava/lang/String;")
    private String field8733;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "Ldr;")
    public static class675 field8732 = new class675(34, 4);

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "Ldr;")
    public static class675 field8736 = new class675(69, 6);

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "[I")
    public static int[] field8740;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Z")
    public static final boolean method3602(int arg0, int arg1, int arg2) {
        if (arg0 != 393216) {
            field8736 = null;
        }
        field8739++;
        return class638.method3584(arg2, arg1, 13896) | (arg1 & 0x60000) != 0 || class211.method1237(arg2, (byte) 91, arg1);
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
    public static final void method3603(int arg0) {
        field8735++;
        class560.field6992 = true;
        if (arg0 != 2048) {
            method3602(115, -26, -35);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I")
    public final int method909(int arg0) {
        field8738++;
        if (this.field8730.method1638(this.field8733, 0)) {
            return 100;
        } else {
            if (arg0 != -1038) {
                method3603(111);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
    public static void method3604(int arg0) {
        field8736 = null;
        field8732 = null;
        field8740 = null;
        if (arg0 != -2061) {
            field8736 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
    public static final void method3605(byte arg0) {
        class638.field8648 = 0;
        if (arg0 != -123) {
            method3603(53);
        }
        field8734++;
        class345.field4438.method1913((byte) 126);
        class367.field4752 = false;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)Ldda;")
    public final class354 method908(byte arg0) {
        int var2 = -25 / ((26 - arg0) / 46);
        field8737++;
        return class354.field4572;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
    public static final void method3606(boolean arg0) {
        field8731++;
        class149.field1788 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            class171.field2000[var1] = null;
            class183.field2154[var1] = 1;
            class232.field3014[var1] = null;
        }
        if (arg0) {
            method3602(102, 57, 117);
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lpfa;Ljava/lang/String;)V")
    public class644(class275 arg0, String arg1) {
        this.field8730 = arg0;
        this.field8733 = arg1;
    }
}
