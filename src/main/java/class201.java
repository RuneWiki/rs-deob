import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class201 {

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public int field2820 = 0;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[S")
    public static short[] field2816 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field2823 = 2301979;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "F")
    public static float field2821;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLwf;IIIIII)V", line = 10)
    public static final void method1472(byte arg0, class333 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class193.field2667) {
            class181.field2481 = 32;
        } else {
            class181.field2481 = 0;
        }
        field2815++;
        class193.field2667 = false;
        if (class42.field521 != 0) {
            if (arg3 <= arg4 && (arg3 + 16) > arg4 && arg2 >= arg6 && arg2 < (arg6 + 16)) {
                arg1.field5134 -= 4;
                class142.method1097(41, arg1);
            } else if (arg3 <= arg4 && arg3 + 16 > arg4 && (arg6 + arg7 - 16) <= arg2 && arg6 + arg7 > arg2) {
                arg1.field5134 += 4;
                class142.method1097(-118, arg1);
            } else if ((arg3 - class181.field2481) <= arg4 && arg4 < arg3 + class181.field2481 + 16 && arg2 >= arg6 + 16 && arg2 < arg6 + arg7 - 16) {
                int var8 = (arg7 - 32) * arg7 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - arg6 - var8 / 2 - 16;
                int var10 = arg7 - var8 - 32;
                arg1.field5134 = (arg5 - arg7) * var9 / var10;
                class142.method1097(-121, arg1);
                class193.field2667 = true;
            }
        }
        int var11 = 64 % ((arg0 - 62) / 32);
        if (class152.field2136 == 0) {
            return;
        }
        int var12 = arg1.field5056;
        if ((arg3 - var12) <= arg4 && arg6 <= arg2 && arg4 < (arg3 + 16) && arg2 <= (arg6 + arg7)) {
            arg1.field5134 += class152.field2136 * 45;
            class142.method1097(-119, arg1);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lfd;BI)V", line = 84)
    private final void method1473(class299 arg0, byte arg1, int arg2) {
        field2819++;
        if (arg1 != 94) {
            field2821 = 1.1128678F;
        }
        if (arg2 == 5) {
            this.field2820 = arg0.method2083((byte) -95);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V", line = 103)
    public static void method1474(boolean arg0) {
        if (arg0) {
            field2816 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIBIII)V", line = 116)
    public static final void method1475(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2817++;
        if (arg0 == arg7) {
            class345.method2393(arg0, arg3, arg6, arg1, (byte) 84, arg2, arg5);
            return;
        }
        if (arg2 - arg0 >= class245.field3574 && class321.field4722 >= arg0 + arg2 && arg6 - arg7 >= class207.field2937 && arg6 + arg7 <= class25.field292) {
            class40.method290(arg4 - 75, arg2, arg5, arg3, arg6, arg0, arg1, arg7);
        } else {
            class17.method124(arg1, arg3, arg2, arg7, arg6, arg4 - 10466, arg0, arg5);
        }
        if (arg4 != 75) {
            method1475(-23, -127, -74, 66, (byte) -74, 10, 23, -35);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;)J", line = 140)
    public static final long method1476(int arg0, String arg1) {
        long var2 = 0L;
        if (arg0 >= -116) {
            return 71L;
        }
        field2818++;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (1 - (97 - var6));
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lfd;I)V", line = 192)
    public final void method1477(class299 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2096((byte) -122);
            if (var3 == 0) {
                field2822++;
                if (arg1 < 13) {
                    method1472((byte) 103, (class333) null, -1, 115, -22, -89, 77, -39);
                }
                return;
            }
            this.method1473(arg0, (byte) 94, var3);
        }
    }
}
