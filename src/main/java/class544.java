import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class544 {

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field7379 = -1;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Z")
    public static boolean field7378 = false;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method3096(int arg0, int arg1, int arg2, int arg3) {
        field7381++;
        if (arg0 == arg3) {
            return arg0;
        }
        int var4 = 128 - arg1;
        int var5 = (arg0 & 0x7F) * var4 + (arg3 & 0x7F) * arg1 >> 7;
        if (arg2 != -22459) {
            field7378 = true;
        }
        int var6 = (arg0 & 0x380) * var4 + (arg3 & 0x380) * arg1 >> 7;
        int var7 = (arg0 & 0xFC00) * var4 + ((arg3 & 0xFC00) * arg1) >> 7;
        return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I", line = 27)
    public static final int method3097(int arg0, int arg1) {
        field7380++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            int var2 = -126 % ((-arg1 - 17) / 46);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 60)
    public static final String method3098(int arg0, int arg1, boolean arg2) {
        if (arg1 != 16051) {
            method3098(-57, 24, true);
        }
        field7382++;
        return arg2 && arg0 >= 0 ? class261.method1722(arg2, (byte) 107, arg0, 10) : Integer.toString(arg0);
    }
}
