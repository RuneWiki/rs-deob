import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class155 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lvd;")
    public static class222 field2956 = class212.method1357("Benutzen Sie bitte eine andere Welt)3", 10731);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field2952 = 0;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[I")
    public static int[] field2955 = new int[4000];

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Lvd;")
    private static class222 field2963 = class212.method1357("Continue", 10731);

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Lvd;")
    public static class222 field2953 = field2963;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[Lcg;")
    public static class29[] field2961 = new class29[50];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "J")
    public static long field2962;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lbg;")
    public static class19 field2958;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I")
    public static final int method990(int arg0, int arg1, int arg2) {
        if (arg0 > -120) {
            field2962 = 6L;
        }
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        field2959++;
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Z")
    public static final boolean method991(int arg0, int arg1) {
        field2960++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 != 2) {
            method994((byte) 4);
        }
        int var2 = class131.field2535[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1007;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILba;)Z")
    public static final boolean method992(int arg0, class13 arg1) {
        field2957++;
        if (class168.field3211) {
            if (class221.method1405(arg1, (byte) -116) != 0) {
                return false;
            }
            if (arg1.field365 == 0) {
                return false;
            }
        }
        if (arg0 != 0) {
            field2958 = null;
        }
        return arg1.field305;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(III)I")
    public static final int method993(int arg0, int arg1, int arg2) {
        if (arg2 >= -90) {
            method992(45, null);
        }
        long var3 = (long) ((arg0 << 16) + arg1);
        field2964++;
        return class105.field1938 != null && class105.field1938.field2555 == var3 ? class152.field2934.field2053 * 99 / (class152.field2934.field2006.length - class105.field1938.field3936) + 1 : 0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method994(byte arg0) {
        field2958 = null;
        if (arg0 < 96) {
            return;
        }
        field2955 = null;
        field2956 = null;
        field2961 = null;
        field2963 = null;
        field2953 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(ILba;)Lba;")
    public static final class13 method995(int arg0, class13 arg1) {
        field2954++;
        int var2 = -20 / ((arg0 + 42) / 33);
        class13 var3 = class94.method602(arg1, (byte) -28);
        if (var3 == null) {
            var3 = arg1.field330;
        }
        return var3;
    }
}
