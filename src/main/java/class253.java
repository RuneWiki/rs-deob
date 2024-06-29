import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class253 extends class190 {

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "Lqe;")
    public class168 field4381;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "Lqe;")
    private static class168 field4375 = class66.method448("Please remove ", 8);

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "[S")
    public static short[] field4372 = new short[256];

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "J")
    public static long field4374 = 0L;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "[I")
    public static int[] field4380 = new int[128];

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "Lqe;")
    public static class168 field4383 = field4375;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "Lqe;")
    public static class168 field4371 = field4375;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "Z")
    public static boolean field4382 = true;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field4376 = 0;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public static void method1669(byte arg0) {
        field4371 = null;
        field4380 = null;
        field4372 = null;
        field4375 = null;
        field4383 = null;
        int var1 = 70 / ((-arg0 - 83) / 33);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lqe;I)V")
    public static final void method1670(class168 arg0, int arg1) {
        field4384++;
        class172.field2989 = arg0;
        if (class205.field3559.field4088 == null) {
            return;
        }
        try {
            class168 var2 = class96.field1509.method1087(class205.field3559.field4088, (byte) 13);
            class168 var3 = class139.field2466.method1087(class205.field3559.field4088, (byte) 13);
            class168 var4 = class50.method347(2, new class168[] { var2, class236.field4037, arg0, class96.field1508, var3 });
            class168 var5;
            if (arg0.method1109((byte) 80) == 0) {
                var5 = class50.method347(2, new class168[] { var4, class145.field2537 });
            } else {
                var5 = class50.method347(2, new class168[] { var4, class171.field2980, class135.method913(class59.method407(-41) + 94608000000L, arg1 ^ 0xFFFF976B), class198.field3419, class170.method1131(113, 94608000L) });
            }
            class50.method347(2, new class168[] { class255.field4427, var5, class17.field152 }).method1119(class205.field3559.field4088, 0);
            if (arg1 != -26840) {
                method1669((byte) -64);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class253() {
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)Z")
    public static final boolean method1671(int arg0, byte arg1) {
        if (arg1 >= -21) {
            return false;
        } else {
            field4377++;
            return (arg0 >> 29 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)V")
    public static final void method1672(byte arg0, int arg1, int arg2) {
        class110 var3 = class117.method802(arg0 + 116, arg1);
        field4378++;
        int var4 = var3.field1759;
        if (arg0 != -116) {
            return;
        }
        int var5 = var3.field1757;
        int var6 = class179.field3151[var4 - var5];
        if (arg2 < 0 || arg2 > var6) {
            arg2 = 0;
        }
        int var7 = var6 << var5;
        int var8 = var3.field1764;
        class125.method853(var8, class92.field1441[var8] & ~var7 | var7 & arg2 << var5, arg0 ^ 0xFFFFFF93);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lqe;)V")
    public class253(class168 arg0) {
        this.field4381 = arg0;
    }
}
