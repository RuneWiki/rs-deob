import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class135 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field3052 = 0;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public int field3054 = 0;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lhe;")
    public static class54 field3057 = class6.method58("VOLL", false);

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Lhe;")
    private static class54 field3069 = class6.method58("Login", false);

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lhe;")
    private static class54 field3060 = class6.method58("You can(Wt add yourself to your own friend list", false);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lhe;")
    public static class54 field3051 = field3069;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Lhe;")
    public static class54 field3066 = field3060;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lod;")
    public static class101 field3067;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lhd;")
    public class53 field3055;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lhd;")
    public class53 field3058;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
    public static final int method1009(int arg0, int arg1) {
        field3068++;
        if (arg0 != 14423) {
            method1010(66, (byte) -6);
        }
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Luc;")
    public static final class142 method1010(int arg0, byte arg1) {
        field3059++;
        class142 var2 = (class142) class24.field658.method991((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class48.field1161.method266(12, (byte) 99, arg0);
        class142 var4 = new class142();
        if (var3 != null) {
            var4.method1100((byte) -59, new class83(var3));
        }
        var4.method1097(0);
        class24.field658.method990(true, (long) arg0, var4);
        if (arg1 > -108) {
            method1011(-35, -38L);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IJ)Lhe;")
    public static final class54 method1011(int arg0, long arg1) {
        field3065++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (arg0 != -5) {
                method1009(-85, -16);
            }
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class132.field2982[(int) (var8 - arg1 * 37L)];
            }
            class54 var7 = new class54();
            var7.field1323 = var6;
            var7.field1325 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static final void method1012(int arg0) {
        class124.field2858.method992(0);
        field3061++;
        class4.field135.method992(0);
        client.field602.method992(arg0 - 2);
        if (arg0 != 2) {
            method1009(-99, 27);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)I")
    public static final int method1013(int arg0, int arg1) {
        int var2 = 0;
        field3062++;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        int var3 = -51 % ((-arg1 - 72) / 37);
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method1014(byte arg0) {
        field3060 = null;
        field3069 = null;
        field3066 = null;
        field3051 = null;
        field3067 = null;
        field3057 = null;
        if (arg0 >= -124) {
            field3051 = null;
        }
    }
}
