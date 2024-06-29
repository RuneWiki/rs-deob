import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class174 extends class119 {

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field3351 = 3353893;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3345 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[I")
    public static int[] field3355 = new int[2048];

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field3353 = 0;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Lai;")
    public static class10 field3357 = class44.method278("<col=00ffff>", 113);

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[Lai;")
    public static class10[] field3356 = new class10[100];

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field3359 = 2;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Z")
    public static final boolean method1139(int arg0) {
        field3347++;
        try {
            if (arg0 != 0) {
                field3357 = null;
            }
            if (class75.field1290 == 2) {
                if (class155.field3007 == null) {
                    class155.field3007 = class8.method28(class25.field387, class122.field2348, class6.field76);
                    if (class155.field3007 == null) {
                        return false;
                    }
                }
                if (class41.field682 == null) {
                    class41.field682 = new class24(class107.field1989, class35.field553);
                }
                if (class101.field1887.method986(22050, class155.field3007, class186.field3554, arg0 - 83, class41.field682)) {
                    class101.field1887.method981(-21116);
                    class101.field1887.method976(class149.field2872, (byte) 55);
                    class101.field1887.method985(class172.field3332, -1, class155.field3007);
                    class75.field1290 = 0;
                    class155.field3007 = null;
                    class25.field387 = null;
                    class41.field682 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class101.field1887.method1000(10523);
            class75.field1290 = 0;
            class155.field3007 = null;
            class25.field387 = null;
            class41.field682 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I")
    public static final int method1140(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 31 & arg1 - 1;
        if (arg2 != 128) {
            method1143(-88, -122, -52, 65, null, -35);
        }
        field3358++;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Z")
    public static final boolean method1141(int arg0, int arg1) {
        field3352++;
        if (arg0 == -1) {
            return (arg1 >> 29 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method1142(byte arg0) {
        field3355 = null;
        field3345 = null;
        if (arg0 != -18) {
            field3351 = -110;
        }
        field3356 = null;
        field3357 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIILeh;I)V")
    public static final void method1143(int arg0, int arg1, int arg2, int arg3, class47 arg4, int arg5) {
        field3354++;
        if (arg5 != 7006) {
            field3356 = null;
        }
        class170 var6 = new class170();
        var6.field3284 = arg4.field771;
        var6.field3291 = arg2 * 128;
        var6.field3293 = arg4.field802 * 128;
        var6.field3275 = arg4.field829;
        var6.field3280 = arg3;
        var6.field3278 = arg4.field803;
        var6.field3295 = arg0 * 128;
        int var7 = arg4.field804;
        var6.field3290 = arg4.field810;
        int var8 = arg4.field792;
        if (arg1 == 1 || arg1 == 3) {
            var7 = arg4.field792;
            var8 = arg4.field804;
        }
        var6.field3279 = (arg2 + var8) * 128;
        var6.field3276 = (arg0 + var7) * 128;
        if (arg4.field788 != null) {
            var6.field3283 = arg4;
            var6.method1124(-124);
        }
        class145.field2777.method1230(var6, true);
        if (var6.field3290 != null) {
            var6.field3292 = var6.field3275 + (int) (Math.random() * (double) (var6.field3278 - var6.field3275));
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILai;)V")
    public static final void method1144(int arg0, int arg1, class10 arg2) {
        class76.field1323.method635((byte) -118, 157);
        field3348++;
        class76.field1323.method799(arg2.method62((byte) -74), 76);
        class117.field2263++;
        int var3 = 65 / ((59 - arg1) / 34);
        class76.field1323.method773(arg0, (byte) -39);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(II)V")
    public class174(int arg0, int arg1) {
        this.field3349 = arg0;
        this.field3346 = arg1;
    }
}
