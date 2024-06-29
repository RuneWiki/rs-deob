import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class174 implements class232 {

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "[I")
    public static int[] field2691 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "Lok;")
    public static class266 field2692 = new class266();

    @OriginalMember(owner = "client!pha", name = "g", descriptor = "Z")
    public static boolean field2696 = false;

    @OriginalMember(owner = "client!pha", name = "h", descriptor = "F")
    public static float field2697 = 0.0F;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!pha", name = "e", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!pha", name = "f", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!pha", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field2695++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(B)V", line = 24)
    public static void method1263(byte arg0) {
        if (arg0 > -25) {
            method1265(78);
        }
        field2691 = null;
        field2692 = null;
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(B)Lqe;", line = 38)
    public static final class492 method1264(byte arg0) {
        field2694++;
        if (class117.field1801 == null || class640.field8973 == null) {
            return null;
        } else if (arg0 > -124) {
            return null;
        } else {
            class640.field8973.method1542(-1025, class117.field1801);
            class492 var1 = (class492) class640.field8973.method1543(-256);
            if (var1 == null) {
                return null;
            } else {
                class413 var2 = class117.field1786.method1231(57, var1.field6971);
                return var2 != null && var2.field5659 && var2.method2504((byte) 58, class117.field1789) ? var1 : class433.method2594(6);
            }
        }
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 68)
    public class174(String arg0, int arg1) {
        this.field2693 = arg1;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)V", line = 91)
    public static final void method1265(int arg0) {
        field2690++;
        if (class266.field3873 == 7) {
            class195.method1354((byte) -61, false);
        } else {
            class678.field9433 = class527.field7529;
            class527.field7529 = null;
            class225.method1539(false, arg0);
        }
    }
}
