import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class243 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3951 = null;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "S")
    public static short field3954 = 320;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "[J")
    public static long[] field3962 = new long[500];

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    public static int[] field3958 = new int[32];

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3965 = "Loading title screen - ";

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field3949;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public int field3956;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public int field3961;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "[B")
    public byte[] field3953;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "[B")
    public byte[] field3964;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[I")
    public static int[] field3963;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)J")
    public static final long method1680(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        return var3 == null || var3.field144 == null ? 0L : var3.field144.field2146;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)I")
    public static final int method1681(int arg0, int arg1) {
        if (arg0 != 0) {
            field3963 = null;
        }
        field3952++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static final void method1682(int arg0) {
        field3960++;
        class167.field2617.method1888(110);
        if (arg0 > -25) {
            method1682(10);
        }
        class150.field2361.method1888(-30);
        class268.field4281.method1888(-70);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method1683(byte arg0) {
        field3958 = null;
        if (arg0 == 111) {
            field3951 = null;
            field3965 = null;
            field3962 = null;
            field3963 = null;
        }
    }
}
