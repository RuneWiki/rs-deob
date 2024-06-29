import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class298 {

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Ljava/lang/String;")
    public String field4339;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public int field4337;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field4334 = 0;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "[J")
    public static long[] field4341 = new long[100];

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lgn;")
    public static class475 field4340 = new class475(21, 2);

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "F")
    public static float field4333;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Leq;")
    public static class134 field4343;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Ldh;")
    public static class201 field4335;

    @OriginalMember(owner = "client!ci", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4342++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method1805(byte arg0) {
        field4335 = null;
        field4340 = null;
        field4341 = null;
        field4343 = null;
        if (arg0 != 39) {
            method1807(-53, 19);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILts;)V")
    public static final void method1806(int arg0, class356 arg1) {
        if (arg0 == 0) {
            field4332++;
            if (arg1.field5170 == 5 && arg1.field5174 != -1) {
                class492.method2964(class481.field6937, -114, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    public static final void method1807(int arg0, int arg1) {
        field4338++;
        int var2 = class263.field3748 - field4334;
        if (var2 >= 100) {
            class306.field4454 = 1;
        } else if (arg1 == -23785) {
            int var3 = (int) class473.field6841;
            if (var3 < class247.field3540 >> 8) {
                var3 = class247.field3540 >> 8;
            }
            if (class179.field2584[4] && var3 < class242.field3473[4] + 128) {
                var3 = class242.field3473[4] + 128;
            }
            int var4 = (int) class506.field7722 + class413.field6113 & 0x3FFF;
            class64.method451(var4, class356.field5150, arg0, (var3 >> 3) * 3 + 600 << 0, class103.method620(class355.field5121, class415.field6145.field2966, (byte) 20, class415.field6145.field2959) - 50, var3, class318.field4665, (byte) 13);
            float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
            class432.field6338 = (int) ((float) (class432.field6338 - class330.field4794) * var5 + (float) class330.field4794);
            class282.field4026 = (int) ((float) (class282.field4026 - class312.field4537) * var5 + (float) class312.field4537);
            class205.field2843 = (int) ((float) (class205.field2843 - class28.field487) * var5 + (float) class28.field487);
            class317.field4653 = (int) ((float) (class317.field4653 - class67.field999) * var5 + (float) class67.field999);
            int var6 = class21.field284 - class494.field7536;
            if (var6 > 8192) {
                var6 -= 16384;
            } else if (var6 < -8192) {
                var6 += 16384;
            }
            class21.field284 = (int) ((float) var6 * var5 + (float) class494.field7536);
            class21.field284 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)Lvg;")
    public static final class37 method1808(int arg0, int arg1) {
        if (arg0 != 26504) {
            return null;
        }
        field4336++;
        class37 var2 = (class37) class280.field3989.method2322(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class336.field4868.method1470(4, 0, arg1);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class37 var4 = class327.method1963(0, var3);
            class280.field3989.method2320(var4, (long) arg1, 2592);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class298(String arg0, int arg1) {
        this.field4339 = arg0;
        this.field4337 = arg1;
    }
}
