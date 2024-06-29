import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class170 {

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field2553 = 0;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "[I")
    public static int[] field2554 = new int[8];

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public static int field2557 = 0;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 4)
    public static final String method1166(long arg0, byte arg1) {
        field2555++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            if (arg1 != -128) {
                field2557 = 110;
            }
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class322.field4756[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 50)
    public static void method1167(int arg0) {
        if (arg0 >= 51) {
            field2554 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIB)Z", line = 63)
    public static final boolean method1168(int arg0, int arg1, byte arg2) {
        field2552++;
        if (arg2 != -107) {
            method1166(-105L, (byte) -31);
        }
        return class499.method2789(arg1, (byte) -39, arg0) || class564.method3121(-1, arg1, arg0);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)I", line = 74)
    public static final int method1169(int arg0, int arg1) {
        if (arg1 > -79) {
            method1166(-14L, (byte) -65);
        }
        field2558++;
        return arg0 & 0x7F;
    }
}
