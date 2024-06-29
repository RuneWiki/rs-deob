import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ua")
public class class39 {

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "I")
    public static volatile int field496 = -1;

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "Lu;")
    public static class38 field498 = class9.method45(-41, "Makeover Mage");

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "Lu;")
    public static class38 field499 = class9.method45(-41, "Spinning Wheel");

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "Lu;")
    public static class38 field497 = class9.method45(-41, "sprites");

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 5)
    public static final Object method247(int arg0, byte[] arg1, boolean arg2) {
        if (arg0 >= -32) {
            method250((byte) -65);
        }
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class30.field362) {
            try {
                class10 var3 = (class10) Class.forName("la").getDeclaredConstructor().newInstance();
                var3.method57(arg1, (byte) 81);
                return var3;
            } catch (Throwable var5) {
                class30.field362 = true;
            }
        }
        return arg2 ? mapview.method139(0, arg1) : arg1;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(B)Lra;", line = 56)
    public static final class34 method248(byte arg0) {
        if (arg0 > -115) {
            return (class34) null;
        }
        try {
            return (class34) Class.forName("ta").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class26();
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(I)V", line = 73)
    public static void method249(int arg0) {
        if (arg0 != -1) {
            field498 = null;
        }
        field497 = null;
        field498 = null;
        field499 = null;
    }

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(B)J", line = 93)
    public static final synchronized long method250(byte arg0) {
        if (arg0 != -121) {
            method250((byte) -69);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class11.field108) {
            class19.field180 += class11.field108 - var1;
        }
        class11.field108 = var1;
        return class19.field180 + var1;
    }
}
