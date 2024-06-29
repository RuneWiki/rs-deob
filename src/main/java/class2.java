import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class2 extends class285 {

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "Lve;")
    public static class255 field27 = class87.method607(105, "overlay2");

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field31 = 0;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "Lve;")
    public static class255 field30 = class87.method607(66, ":duelfriend:");

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field35 = 0;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "Lve;")
    public static class255 field36 = class87.method607(27, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "Lve;")
    private static class255 field37 = class87.method607(26, "Loaded interfaces");

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "Lve;")
    public static class255 field32 = field37;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "Ldg;")
    public static class307 field28;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIBI)V", line = 26)
    public static final void method6(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = 19 % ((23 - arg2) / 32);
        if (class25.field392 != 0 && arg0 != 0 && class255.field4356 < 50 && arg1 != -1) {
            class25.field410[class255.field4356] = arg1;
            class124.field2054[class255.field4356] = arg0;
            class25.field406[class255.field4356] = arg3;
            class269.field4626[class255.field4356] = null;
            class255.field4357[class255.field4356] = 0;
            class255.field4356++;
        }
        field38++;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)Lve;", line = 52)
    public static final class255 method7(int arg0) {
        if (arg0 >= -67) {
            field31 = -1;
        }
        class255 var1 = class246.field4136;
        field33++;
        class255 var2 = class49.field728;
        if (class53.field831 != 0) {
            var1 = class252.field4249;
        }
        if (class135.field2245 != null) {
            var2 = class3.method14(new class255[] { class120.field2001, class135.field2245 }, (byte) -67);
        }
        return class3.method14(new class255[] { class58.field893, var1, class129.field2139, class215.method1532(class166.field2791, true), class223.field3746, class215.method1532(client.field4022, true), var2, class30.field489 }, (byte) -123);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIB)V", line = 76)
    public static final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = 0;
        class190[] var8 = class108.field1824;
        if (arg6 != -118) {
            method7(-85);
        }
        while (var8.length > var7) {
            class190 var9 = var8[var7];
            if (var9 != null && var9.field3034 == 2) {
                class247.method1705((var9.field3045 - class268.field4615 << 7) + var9.field3044, true, (var9.field3046 - class197.field3355 << 7) + var9.field3047, arg0, var9.field3038 * 2, arg2 >> 1, arg3 >> 1, arg4);
                if (class236.field3874 > -1 && class277.field4768 % 20 < 10) {
                    class127.field2095[var9.field3039].method291(arg5 + class236.field3874 - 12, class152.field2573 + arg1 + -28);
                }
            }
            var7++;
        }
        field34++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Lsa;", line = 114)
    public static final class102 method10(int arg0, int arg1) {
        class102 var2 = (class102) class310.field5288.method558((long) arg0, true);
        field29++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class101.field1707.method636(16, (byte) 124, arg0);
        class102 var4 = new class102();
        if (var3 != null) {
            var4.method789((byte) 125, new class70(var3));
        }
        class310.field5288.method555(var4, (long) arg0, arg1 ^ arg1);
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V", line = 158)
    public static void method11(int arg0) {
        field30 = null;
        field37 = null;
        field32 = null;
        field27 = null;
        field28 = null;
        field36 = null;
        if (arg0 < 69) {
            field32 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)Z")
    public abstract boolean method5(int arg0);

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method9(int arg0);
}
