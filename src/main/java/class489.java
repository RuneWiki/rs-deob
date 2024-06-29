import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class489 extends class161 {

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "Lfn;")
    public static class52 field6893 = new class52(3, 28);

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "[I")
    public static int[] field6901 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public int field6894;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public int field6899;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public int field6902;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "J")
    public long field6891;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I", line = 5)
    public final int method972(boolean arg0) {
        if (arg0) {
            return -113;
        } else {
            field6896++;
            return this.field6894;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)J", line = 19)
    public final long method978(boolean arg0) {
        field6898++;
        return arg0 ? -110L : this.field6891;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)I", line = 31)
    public final int method976(int arg0) {
        field6892++;
        int var2 = -92 / ((5 - arg0) / 61);
        return this.field6899;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)I", line = 44)
    public final int method980(int arg0) {
        field6900++;
        return arg0 < 7 ? -73 : this.field6902;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 56)
    public static void method2872(byte arg0) {
        field6901 = null;
        if (arg0 != -9) {
            method2873((class216) null, 28, 118, -26, -98);
        }
        field6893 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lvd;IIII)V", line = 77)
    public static final void method2873(class216 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class242.method1513(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class456.field6299) {
            class242.method1513(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class242.method1513(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class205.field2946) {
            class242.method1513(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class205.field2946) {
            class242.method1513(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class456.field6299 && arg4 <= class205.field2946) {
            class242.method1513(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class242.method1513(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class456.field6299 && arg4 > 0) {
            class242.method1513(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }
}
