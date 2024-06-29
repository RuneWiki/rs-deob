import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class245 {

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public int field3868 = 0;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Z")
    public boolean field3874 = false;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field3875 = 0;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field3869 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Z")
    public static boolean field3863 = true;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Z")
    public static boolean field3872 = true;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "F")
    public static float field3864;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lwj;")
    public static class302 field3865;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lfd;")
    public class306 field3876;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3877;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3873;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)I", line = 5)
    public static final int method1750(int arg0, boolean arg1) {
        if (!arg1) {
            method1750(119, true);
        }
        field3871++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILak;I)[Lrg;", line = 21)
    public static final class326[] method1751(int arg0, class172 arg1, int arg2) {
        if (arg0 != 0) {
            method1750(-96, false);
        }
        field3867++;
        return class284.method2041(arg1, 18, arg2) ? class166.method1219(arg0 + 99) : null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Lvh;", line = 37)
    public static final class144 method1752(int arg0, byte arg1) {
        if (arg1 <= 100) {
            return (class144) null;
        }
        class144 var2 = (class144) class318.field4944.method755((long) arg0, false);
        field3866++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field509.method1287(arg0, 26, -1);
        class144 var4 = new class144();
        if (var3 != null) {
            var4.method1064((byte) 61, new class44(var3));
        }
        class318.field4944.method750(var4, (long) arg0, -18339);
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZJ)V", line = 61)
    public static final void method1753(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0) {
                method1752(32, (byte) 58);
            }
        } catch (InterruptedException var4) {
        }
        field3870++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 84)
    public static void method1754(int arg0) {
        field3877 = null;
        if (arg0 <= 43) {
            method1752(-31, (byte) 106);
        }
        field3865 = null;
    }
}
