import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public abstract class class239 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "Leq;")
    public static class116 field3245 = new class116();

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "Lcj;")
    public static class412 field3248;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "[[B")
    public static byte[][] field3252;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILbo;ZLbo;IIIIII)V", line = 17)
    public static final void method1526(int arg0, class433 arg1, boolean arg2, class433 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3250++;
        int var10 = arg3.method791(-39);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class11 var12 = (class11) class330.field4714.method2049(-53, (long) var10);
        if (var12 == null) {
            class145[] var13 = class145.method865(class92.field1012, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class218.field2991.method955(var13[0], true);
            class330.field4714.method2046((long) var10, 0, var12);
        }
        class55.method321(arg6, arg1.field1311, arg7, arg4 >> 1, arg1.field1304, arg1.method786((byte) 70) * 64, arg0 >> 1, 0, (byte) 105);
        int var14 = arg5 - (18 - class33.field313[0]);
        int var15 = class33.field313[1] + arg8 - 54 - 16;
        int var16 = arg9 / 4 * 18 + var14;
        int var17 = arg9 % 4 * 18 + var15;
        if (!arg2) {
            method1526(36, (class433) null, false, (class433) null, -7, 64, 17, -72, 103, 32);
        }
        var12.method90(var16, var17);
        if (arg1 == arg3) {
            class218.field2991.method1149(-256, (byte) 82, var17 - 1, var16 - 1, 18, 18);
        }
        class213 var18 = class137.method819((byte) -30);
        var18.field2910 = var17;
        var18.field2912 = var16 + 16;
        var18.field2904 = var17 + 16;
        var18.field2917 = var16;
        var18.field2911 = arg3;
        class204.field2796.method1605(var18, -14638);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 69)
    public static void method1527(int arg0) {
        field3248 = null;
        field3245 = null;
        field3252 = null;
        if (arg0 != 2427) {
            field3252 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBLjava/util/Random;)I", line = 85)
    public static final int method1529(int arg0, byte arg1, Random arg2) {
        field3246++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class436.method2710(arg0, (byte) -15)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg1 != -96) {
                method1529(-74, (byte) -33, (Random) null);
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class373.method2343(arg0, 30426, var4);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lqe;I)Lqe;")
    public abstract class274 method1528(class274 arg0, int arg1);
}
