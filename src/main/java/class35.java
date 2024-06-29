import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class35 {

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "Lba;")
    public static class4 field439 = class14.method105((byte) -79, "Mace Shop");

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "[I")
    public static int[] field437 = new int[128];

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "Lba;")
    public static class4 field441 = class14.method105((byte) -90, "Overview");

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "Lba;")
    public static class4 field438 = class14.method105((byte) -89, "Crafting Shop");

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "Lba;")
    public static class4 field442 = class14.method105((byte) -127, "50(U");

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "Z")
    public static boolean field444 = false;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "Lna;")
    public static class27 field435 = new class27();

    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "Lba;")
    public static class4 field445 = class14.method105((byte) -127, "mapfunction");

    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "Lba;")
    public static class4 field446 = class14.method105((byte) -72, "Quest Start");

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "[B")
    public static byte[] field440;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)B", line = 15)
    public static final byte method222(int arg0) {
        if (arg0 != -18807) {
            field435 = null;
        }
        return class20.field228 == null ? 0 : class20.field228[class12.field172];
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)V", line = 29)
    public static void method223(byte arg0) {
        field439 = null;
        field438 = null;
        field441 = null;
        field440 = null;
        if (arg0 != -37) {
            return;
        }
        field445 = null;
        field435 = null;
        field442 = null;
        field437 = null;
        field446 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 48)
    public static final void method224(int arg0) {
        class24.field291 = null;
        class5.field104 = null;
        class29.field370 = null;
        class9.field149 = null;
        if (arg0 == -6063) {
            class22.field274 = null;
            class23.field281 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(JI)V", line = 82)
    public static final void method225(long arg0, int arg1) {
        if (arg0 <= 0L) {
            return;
        }
        int var3 = -79 / (arg1 / 37);
        if (arg0 % 10L == 0L) {
            class29.method180(11580, arg0 - 1L);
            class29.method180(11580, 1L);
        } else {
            class29.method180(11580, arg0);
        }
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(I)J", line = 103)
    public static final synchronized long method226(int arg0) {
        if (arg0 > -32) {
            return -126L;
        }
        long var1 = System.currentTimeMillis();
        if (class29.field360 > var1) {
            class15.field194 += class29.field360 - var1;
        }
        class29.field360 = var1;
        return class15.field194 + var1;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Lc;Lba;ZLba;)[Lf;", line = 145)
    public static final class11[] method227(class5 arg0, class4 arg1, boolean arg2, class4 arg3) {
        if (arg2) {
            method224(-50);
        }
        int var4 = arg0.method62(arg3, -25493);
        int var5 = arg0.method55(var4, (byte) -123, arg1);
        return class1.method23(arg0, 18, var4, var5);
    }
}
