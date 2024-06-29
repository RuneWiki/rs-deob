import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class271 extends class175 {

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "[S")
    public static short[] field4375 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "J")
    public static long field4378 = 0L;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public static int field4373 = 2;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4381 = "Loading defaults - ";

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public int field4372;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public int field4374;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "Ljj;")
    public static class134 field4370;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "[I")
    public static int[] field4385;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    public abstract void method174(int arg0, int arg1);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)V")
    public abstract void method170(int arg0, int arg1);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)Lpb;")
    public static final class66 method1826(int arg0, byte arg1) {
        field4376++;
        class66 var2 = (class66) class125.field2096.method1839((byte) 80, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class23.field285.method940((byte) 106, class161.method1105((byte) -7, arg0), class61.method467(arg0, 122));
        if (arg1 < 91) {
            method1829(-35);
        }
        class66 var4 = new class66();
        var4.field930 = arg0;
        if (var3 != null) {
            var4.method524((byte) 30, new class264(var3));
        }
        class125.field2096.method1830((long) arg0, -84, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
    public final void method1827(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4377++;
        int var6 = this.field4371 << 3;
        int var7 = this.field4384 << 3;
        int var8 = (arg2 << 4) + (var7 & 0xF);
        if (arg0 <= 124) {
            field4380 = 106;
        }
        int var9 = (arg1 << 4) + (var6 & 0xF);
        this.method162(var6, var7, var9, var8, arg4, arg3);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)V")
    public static void method1828(int arg0) {
        field4381 = null;
        field4375 = null;
        if (arg0 == 15) {
            field4370 = null;
            field4385 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(II)V")
    public abstract void method166(int arg0, int arg1);

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "(I)I")
    public static final int method1829(int arg0) {
        field4379++;
        if (arg0 != -1) {
            field4370 = null;
        }
        if (class225.field3572 == null) {
            return -1;
        }
        while (class225.field3572.field1086 > class222.field3530) {
            if (class225.field3572.method590(class222.field3530, -2576)) {
                return class222.field3530++;
            }
            class222.field3530++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
    public abstract void method163(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IIIII)V")
    public abstract void method160(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)V")
    public abstract void method167(int arg0, int arg1, int arg2);
}
