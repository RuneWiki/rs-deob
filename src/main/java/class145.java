import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class145 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[[I")
    public static int[][] field2698 = new int[104][104];

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Z")
    public static boolean field2699 = false;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[S")
    public static short[] field2703 = new short[256];

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lmb;")
    private static class132 field2706 = class166.method1092("No reply from loginserver)3", 115);

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[I")
    public static int[] field2702 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field2710 = -1;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lmb;")
    public static class132 field2708 = class166.method1092("Fertigkeit)2", 124);

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lmb;")
    public static class132 field2711 = field2706;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lii;I)Lii;")
    public static final class96 method972(class96 arg0, int arg1) {
        field2700++;
        int var2 = class24.method172(class170.method1113(arg0, (byte) -50), -13042);
        if (var2 == 0) {
            return null;
        }
        if (arg1 >= -46) {
            method974(78, null);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class158.method1029((byte) -100, arg0.field1776);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
    public static final boolean method973(int arg0, int arg1, int arg2) {
        int var3 = class24.field348[arg0][arg1][arg2];
        if (-class33.field520 == var3) {
            return false;
        } else if (class33.field520 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class136.method928(var4 + 1, class78.field1364[arg0][arg1][arg2], var5 + 1) && class136.method928(var4 + 128 - 1, class78.field1364[arg0][arg1 + 1][arg2], var5 + 1) && class136.method928(var4 + 128 - 1, class78.field1364[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class136.method928(var4 + 1, class78.field1364[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class24.field348[arg0][arg1][arg2] = class33.field520;
                return true;
            } else {
                class24.field348[arg0][arg1][arg2] = -class33.field520;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILpb;)V")
    public static final void method974(int arg0, class165 arg1) {
        class127.field2360 = arg1;
        field2701++;
        if (arg0 != 3449) {
            field2703 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
    public static final int method975(int arg0, int arg1) {
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg0 != 1185900324) {
            method973(78, -110, 55);
        }
        int var4 = var3 | var3 >>> 4;
        field2704++;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method976(byte arg0) {
        field2698 = null;
        field2711 = null;
        if (arg0 == -83) {
            field2702 = null;
            field2708 = null;
            field2703 = null;
            field2706 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public static final void method977(byte arg0) {
        if (arg0 != 58) {
            return;
        }
        field2705++;
        for (class226 var1 = (class226) class84.field1462.method119(true); var1 != null; var1 = (class226) class84.field1462.method125((byte) -119)) {
            if (var1.field4083 == -1) {
                var1.field4093 = 0;
                class4.method20(var1, false);
            } else {
                var1.method995((byte) -12);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
    public static final void method978(int arg0, int arg1, int arg2) {
        if (arg1 != 390667664) {
            method978(75, -18, -56);
        }
        long var3 = (long) ((arg0 << 16) + arg2);
        field2709++;
        class198 var5 = (class198) class25.field409.method806(-1, var3);
        if (var5 != null) {
            class104.field1948.method847(97, var5);
        }
    }
}
