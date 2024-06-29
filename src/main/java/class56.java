import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class56 {

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public int field932 = -1;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "[I")
    public static int[] field927 = new int[2];

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lgj;")
    public static class39 field933 = null;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I")
    public static final int method383(boolean arg0) {
        if (arg0) {
            field941 = 57;
        }
        field929++;
        return 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILag;Z)V")
    public static final void method384(int arg0, class211 arg1, boolean arg2) {
        field938++;
        int var3 = arg1.field3414 == 0 ? arg1.field3394 : arg1.field3414;
        int var4 = arg1.field3410 == 0 ? arg1.field3430 : arg1.field3410;
        class47.method337(1000, var4, arg1.field3375, arg2, class34.field519[arg1.field3375 >> 16], var3);
        if (arg0 >= -62) {
            field941 = -26;
        }
        if (arg1.field3352 != null) {
            class47.method337(1000, var4, arg1.field3375, arg2, arg1.field3352, var3);
        }
        class97 var5 = (class97) class244.field3880.method1059(0, (long) arg1.field3375);
        if (var5 != null) {
            class2.method8(var5.field1556, false, var3, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILrm;)V")
    public static final void method385(int arg0, class45 arg1) {
        field939++;
        class210 var2 = null;
        try {
            class172 var3 = arg1.method313("runescape", (byte) -78);
            int var4 = 81 % ((45 - arg0) / 46);
            while (var3.field2814 == 0) {
                class262.method1758(1L, 29552);
            }
            if (var3.field2814 == 1) {
                var2 = (class210) var3.field2817;
                class162 var5 = class274.method1834(1);
                var2.method1460(var5.field2568, 0, 0, var5.field2573);
            }
        } catch (Exception var7) {
        }
        try {
            if (var2 != null) {
                var2.method1462((byte) 76);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public static void method386(byte arg0) {
        field927 = null;
        if (arg0 < 85) {
            field941 = -107;
        }
    }
}
