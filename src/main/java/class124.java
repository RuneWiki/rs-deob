import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class124 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field2887 = 0;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lec;")
    private static class32 field2884 = class73.method594("FULL", true);

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lf;")
    public static class36 field2888 = null;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[I")
    public static int[] field2885 = new int[5];

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Lec;")
    private static class32 field2896 = class73.method594("scroll:", true);

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "[I")
    public static int[] field2894 = new int[100];

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lec;")
    public static class32 field2886 = field2896;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lec;")
    public static class32 field2893 = field2896;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lec;")
    public static class32 field2891 = field2884;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lec;")
    public static class32 field2899 = class73.method594("Angreifen", true);

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lec;")
    public static class32 field2898 = class73.method594("M", true);

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lga;")
    public static class44 field2889;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "[I")
    public static int[] field2892;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI[B)I")
    public static final int method975(byte arg0, int arg1, byte[] arg2) {
        field2897++;
        if (arg0 < 109) {
            field2885 = null;
        }
        return class144.method1082(arg1, 0, 25274, arg2);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
    public static final void method976(int arg0, int arg1, int arg2) {
        field2895++;
        if (class119.field2851 < 2 && class125.field2915 == 0 && !class151.field3470) {
            return;
        }
        class32 var3;
        if (~class125.field2915 == arg2 && class119.field2851 < 2) {
            var3 = class52.method403(new class32[] { class41.field966, class114.field2653, class50.field1149, class56.field1301 }, (byte) -20);
        } else if (class151.field3470 && class119.field2851 < 2) {
            var3 = class52.method403(new class32[] { class147.field3355, class114.field2653, class14.field234, class56.field1301 }, (byte) -20);
        } else {
            var3 = class111.method880(true, class119.field2851 - 1);
        }
        if (class119.field2851 > 2) {
            var3 = class52.method403(new class32[] { var3, class34.field712, class159.method1230(class119.field2851 - 2, arg2 + 2), class117.field2799 }, (byte) -20);
        }
        class38.field914.method781(var3, arg1 + 4, arg0 + 15, 16777215, 0, class140.field3219 / 1000);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIZ)Lec;")
    public static final class32 method977(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = 1;
        field2890++;
        int var5 = arg2 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = arg1; var8 < var4; var8++) {
            int var10 = arg2 % arg0;
            arg2 /= arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class32 var9 = new class32();
        var9.field674 = var6;
        var9.field618 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method978(byte arg0) {
        field2896 = null;
        field2891 = null;
        field2893 = null;
        field2884 = null;
        field2885 = null;
        field2888 = null;
        field2886 = null;
        if (arg0 != 54) {
            method976(-79, -109, 126);
        }
        field2894 = null;
        field2889 = null;
        field2898 = null;
        field2892 = null;
        field2899 = null;
    }
}
