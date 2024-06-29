import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class297 extends class257 {

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4585 = null;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "[I")
    public static int[] field4582 = new int[64];

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "[I")
    public static int[] field4584 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIBIIIII)V", line = 4)
    public static final void method2068(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 <= 55) {
            method2068(-123, 73, -68, 65, (byte) 13, 63, -95, 30, 39, -83);
        }
        field4589++;
        if (class291.field4490 <= arg2 && arg2 <= class210.field3309 && class291.field4490 <= arg0 && class210.field3309 >= arg0 && class291.field4490 <= arg1 && class210.field3309 >= arg1 && class291.field4490 <= arg6 && class210.field3309 >= arg6 && class42.field579 <= arg9 && arg9 <= class334.field5205 && arg7 >= class42.field579 && class334.field5205 >= arg7 && arg3 >= class42.field579 && class334.field5205 >= arg3 && arg5 >= class42.field579 && arg5 <= class334.field5205) {
            class97.method684(arg6, arg8, arg1, arg2, 0, arg7, arg0, arg5, arg9, arg3);
        } else {
            class277.method1952(arg8, arg3, arg1, arg5, arg2, arg6, arg9, (byte) -128, arg7, arg0);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V", line = 26)
    public static final void method2069(byte arg0) {
        int var1 = 85 % ((46 - arg0) / 47);
        field4587++;
        class30.field447 = class142.method1060(8, 2048, 2, true, 0.4F, 4, 35, 8);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLug;)V", line = 35)
    public static final void method2070(byte arg0, class253 arg1) {
        field4588++;
        if (arg0 > -107) {
            field4584 = (int[]) null;
        }
        class24.field364 = arg1;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIII)V", line = 47)
    public static final void method2071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -31332) {
            field4584 = (int[]) null;
        }
        field4586++;
        int var6 = (arg5 - 32) * arg5 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        class204.field3232[0].method198(arg2, arg0);
        class204.field3232[1].method198(arg2, arg0 + arg5 - 16);
        int var7 = (arg5 - var6 - 32) * arg4 / (arg3 - arg5);
        if (!class109.field1458) {
            class280.method1971(arg2, arg0 + 16, 16, arg5 - 32, class10.field177);
            class280.method1971(arg2, arg0 + var7 + 16, 16, var6, class117.field1632);
            class280.method1973(arg2, arg0 + var7 + 16, var6, class205.field3244);
            class280.method1973(arg2 + 1, arg0 + 16 - -var7, var6, class205.field3244);
            class280.method1975(arg2, arg0 + var7 + 16, 16, class205.field3244);
            class280.method1975(arg2, arg0 + var7 + 17, 16, class205.field3244);
            class280.method1973(arg2 + 15, arg0 + 16 + var7, var6, class48.field634);
            class280.method1973(arg2 + 14, arg0 - -17 + var7, var6 - 1, class48.field634);
            class280.method1975(arg2, arg0 + 15 - (-var7 - var6), 16, class48.field634);
            class280.method1975(arg2 + 1, arg0 + 14 - -var7 - -var6, 15, class48.field634);
            return;
        }
        class122.method897(arg2, arg0 + 16, 16, arg5 - 32, class10.field177);
        class122.method897(arg2, var7 + arg0 + 16, 16, var6, class117.field1632);
        class122.method894(arg2, arg0 + var7 + 16, var6, class205.field3244);
        class122.method894(arg2 + 1, arg0 + 16 + var7, var6, class205.field3244);
        class122.method882(arg2, arg0 + var7 + 16, 16, class205.field3244);
        class122.method882(arg2, arg0 + var7 + 17, 16, class205.field3244);
        class122.method894(arg2 + 15, arg0 - -var7 + 16, var6, class48.field634);
        class122.method894(arg2 + 14, arg0 - (-var7 + -17), var6 - 1, class48.field634);
        class122.method882(arg2, arg0 + var6 + var7 + 15, 16, class48.field634);
        class122.method882(arg2 + 1, arg0 - -14 - -var7 - -var6, 15, class48.field634);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 104)
    public static final void method2072(byte arg0) {
        class277.field4283.method1359(68);
        class164.field2656.method1359(81);
        if (arg0 != -5) {
            method2068(89, -107, -3, -37, (byte) -3, 93, 2, 29, -118, 14);
        }
        field4583++;
        class344.field5345.method1359(124);
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V", line = 127)
    public static void method2073(int arg0) {
        if (arg0 != 6763) {
            method2071(25, -91, 3, 106, 65, 103);
        }
        field4582 = null;
        field4584 = null;
        field4585 = null;
    }
}
