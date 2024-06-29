import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class248 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lr;")
    public static class66 field4323 = class93.method641(43, ")3)3)3");

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lr;")
    private static class66 field4328 = class93.method641(43, "Loaded input handler");

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Z")
    public static boolean field4327 = false;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lr;")
    private static class66 field4325 = class93.method641(43, " is already on your ignore list)3");

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lr;")
    public static class66 field4324 = field4328;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lr;")
    public static class66 field4330 = field4325;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method1631(int arg0) {
        field4323 = null;
        if (arg0 == 988656400) {
            field4328 = null;
            field4324 = null;
            field4330 = null;
            field4325 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static final void method1632(int arg0) {
        field4326++;
        class131 var1 = class9.field95;
        synchronized (class9.field95) {
            class203.field3486++;
            class30.field452 = client.field1640;
            class170.field3021 = class111.field2148;
            class50.field896 = class156.field2774;
            class264.field4627 = class201.field3462;
            class188.field3274 = class209.field3614;
            class174.field3068 = class234.field4092;
            class184.field3222 = class96.field1859;
            class201.field3462 = 0;
        }
        if (arg0 != -1) {
            field4323 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field4329++;
        if (arg6 < 128 || arg3 < 128 || arg6 > 13056 || arg3 > 13056) {
            class243.field4243 = -1;
            class131.field2443 = -1;
            return;
        }
        if (arg7 >= -122) {
            field4328 = null;
        }
        int var8 = class45.method327(arg6, class196.field3401, arg3, false) - arg4;
        int var9 = class123.field2326[class253.field4435];
        int var10 = class123.field2326[class250.field4410];
        int var11 = arg6 - class207.field3597;
        int var12 = class123.field2314[class253.field4435];
        int var13 = var8 - class134.field2494;
        int var14 = class123.field2314[class250.field4410];
        int var15 = arg3 - class192.field3330;
        int var16 = var14 * var15 + (var10 * var11) >> 16;
        int var17 = var10 * var15 - (var11 * var14) >> 16;
        int var19 = var9 * var13 - (var12 * var17) >> 16;
        int var20 = var9 * var17 + var12 * var13 >> 16;
        if (var20 >= 50) {
            class131.field2443 = (var16 << 9) / var20 + arg2;
            class243.field4243 = (var19 << 9) / var20 + arg5;
        } else {
            class243.field4243 = -1;
            class131.field2443 = -1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lcj;II)Lpc;")
    public static final class29 method1634(class28 arg0, int arg1, int arg2) {
        field4332++;
        if (class87.method618(arg0, -1, arg1)) {
            if (arg2 != -30509) {
                field4328 = null;
            }
            return class250.method1695(arg2 + 30509);
        } else {
            return null;
        }
    }
}
