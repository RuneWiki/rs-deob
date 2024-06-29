import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class638 {

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "[S")
    private static short[] field8788 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field8793 = 0;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "[S")
    private static short[] field8795 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "[S")
    private static short[] field8798 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "[[S")
    public static short[][] field8792 = new short[][] { field8795, field8798, field8788 };

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "Lkg;")
    public static class275 field8789 = new class275(112, -1);

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "[Lot;")
    public static class592[] field8801 = new class592[1024];

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "Lfia;")
    public static class577 field8800 = new class577(0, 2, 2, 1);

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "F")
    public static float field8796;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "Leha;")
    public static class91 field8797;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 7)
    public static final void method3575(int arg0) {
        field8791++;
        int var1 = -78 % ((arg0 + 63) / 50);
        class300.method1794(-1, 0, 255);
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V", line = 17)
    public static final void method3576(int arg0) {
        field8790++;
        if (class748.field10451.field10412.method1806((byte) 122) == 0 && class472.field6329 != class440.field5865) {
            class295.method1773((byte) -107, false, class21.field384, 11, class409.field5196);
            return;
        }
        class295.method1770(class386.field4930, -110);
        if (arg0 != 28805) {
            method3578(null, 49);
        }
        if (class472.field6329 != class445.field5923) {
            class582.method3316((byte) -94);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 38)
    public static void method3577(byte arg0) {
        field8788 = null;
        field8795 = null;
        field8801 = null;
        if (arg0 != -34) {
            method3577((byte) -114);
        }
        field8792 = null;
        field8789 = null;
        field8800 = null;
        field8797 = null;
        field8798 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 63)
    public static final int method3578(String arg0, int arg1) {
        field8799++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 == 7390) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = arg0.charAt(var4) + (var3 << 5) - var3;
            }
            return var3;
        } else {
            return -122;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "([J[IB)V", line = 88)
    public static final void method3579(long[] arg0, int[] arg1, byte arg2) {
        int var3 = -119 % ((9 - arg2) / 56);
        class55.method401(1, 0, arg0.length - 1, arg0, arg1);
        field8794++;
    }
}
