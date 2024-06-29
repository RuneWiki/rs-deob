import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class237 extends class71 {

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "J")
    public long field3753;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "[Z")
    public static boolean[] field3748 = new boolean[100];

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "S")
    public static short field3751 = 256;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field3746 = 0;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "Z")
    public static boolean field3757 = true;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "J")
    public static long field3747 = 0L;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "[B")
    public static byte[] field3755;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "[I")
    public static int[] field3749;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "[[B")
    public static byte[][] field3750;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1688(boolean arg0) {
        field3748 = null;
        field3750 = (byte[][]) null;
        if (arg0) {
            field3755 = (byte[]) null;
        }
        field3749 = null;
        field3755 = null;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 35)
    public class237() {
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[B)Z", line = 42)
    public static final boolean method1689(int arg0, byte[] arg1) {
        field3754++;
        class192 var2 = new class192(arg1);
        int var3 = var2.method1399(-1172389784);
        if (var3 != 1) {
            return false;
        }
        if (arg0 < 73) {
            field3749 = (int[]) null;
        }
        boolean var4 = var2.method1399(-1172389784) == 1;
        if (var4) {
            class251.method1769((byte) 97, var2);
        }
        class343.method2367(-53, var2);
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(J)V", line = 68)
    public class237(long arg0) {
        this.field3753 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(CI)Z", line = 78)
    public static final boolean method1690(char arg0, int arg1) {
        if (arg1 == 1) {
            field3756++;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }
}
