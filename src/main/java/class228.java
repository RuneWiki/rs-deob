import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class228 {

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Z")
    public boolean field3918 = true;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public int field3923;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public int field3931;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Leg;")
    public static class37 field3907 = class174.method1167("Examiner", 91);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Leg;")
    private static class37 field3905 = class174.method1167("Wed", 82);

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Leg;")
    public static class37 field3912 = class174.method1167("<)4col>", 109);

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Leg;")
    private static class37 field3914 = class174.method1167("Fri", 123);

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Leg;")
    private static class37 field3922 = class174.method1167("Sun", -93);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Leg;")
    private static class37 field3906 = class174.method1167("Loading )2 please wait)3", -50);

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Leg;")
    public static class37 field3910 = class174.method1167("", 99);

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Leg;")
    public static class37 field3915 = class174.method1167("underlay", 118);

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Leg;")
    private static class37 field3920 = class174.method1167("Mon", 127);

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Leg;")
    private static class37 field3916 = class174.method1167("Sat", -27);

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Leg;")
    private static class37 field3919 = class174.method1167("Tue", 98);

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Leg;")
    private static class37 field3930 = class174.method1167("Thu", 84);

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[Leg;")
    public static class37[] field3917 = new class37[] { field3922, field3920, field3919, field3905, field3930, field3914, field3916 };

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Leg;")
    public static class37 field3926 = field3906;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[[[I")
    public static int[][][] field3925;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static final void method1582(boolean arg0) {
        class213.field3677.method1403(45);
        class144.field2448.method1403(45);
        class113.field1923.method1403(45);
        field3913++;
        if (!arg0) {
            method1583(62, (class101) null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjl;)V")
    public static final void method1583(int arg0, class101 arg1) {
        class139.field2372 = arg1;
        if (arg0 != -10) {
            field3912 = null;
        }
        field3928++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method1584(byte arg0) {
        field3919 = null;
        field3922 = null;
        field3914 = null;
        field3906 = null;
        field3907 = null;
        field3925 = null;
        field3916 = null;
        field3917 = null;
        if (arg0 < 53) {
            return;
        }
        field3915 = null;
        field3910 = null;
        field3926 = null;
        field3920 = null;
        field3912 = null;
        field3905 = null;
        field3930 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(JIZZ)Leg;")
    public static final class37 method1585(long arg0, int arg1, boolean arg2, boolean arg3) {
        field3911++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        long var5 = arg0 / (long) arg1;
        int var7 = 1;
        while (var5 != 0L) {
            var5 /= (long) arg1;
            var7++;
        }
        int var8 = var7;
        if (arg0 < 0L || arg3) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg3) {
            var9[0] = 43;
        }
        int var10 = 0;
        if (arg2) {
            method1583(110, (class101) null);
        }
        while (var7 > var10) {
            int var12 = (int) (arg0 % (long) arg1);
            arg0 /= (long) arg1;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
            var10++;
        }
        class37 var11 = new class37();
        var11.field599 = var9;
        var11.field576 = var8;
        return var11;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIB)I")
    public static final int method1586(int arg0, int arg1, int arg2, byte arg3) {
        field3909++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            if (arg3 != -19) {
                method1586(-79, -60, -6, (byte) 92);
            }
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3923 = arg5;
        this.field3931 = arg3;
        this.field3918 = arg6;
        this.field3929 = arg0;
        this.field3908 = arg1;
        this.field3927 = arg4;
        this.field3904 = arg2;
    }
}
