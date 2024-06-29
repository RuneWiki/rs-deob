import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class30 extends RuntimeException {

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field353;

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "Ljava/lang/String;")
    public String field350;

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "Ll;")
    public static class21 field349 = class28.method185(-20839, "Kebab Seller");

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "Ll;")
    public static class21 field348 = class28.method185(-20839, "Anvil");

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Ll;")
    public static class21 field352 = class28.method185(-20839, "Spice Shop");

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "Ll;")
    public static class21 field354 = class28.method185(-20839, "Mace Shop");

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "J")
    public static volatile long field351 = 0L;

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "[I")
    public static int[] field355;

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "[I")
    public static int[] field356;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Ll;Ll;BLka;)[Lk;", line = 27)
    public static final class19[] method191(class21 arg0, class21 arg1, byte arg2, class20 arg3) {
        if (arg2 > -93) {
            method194((byte) 104);
        }
        int var4 = arg3.method92((byte) 4, arg1);
        int var5 = arg3.method94(arg0, var4, -467);
        return class31.method195(var4, var5, (byte) -105, arg3);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)V", line = 49)
    public static void method192(int arg0) {
        field356 = null;
        field354 = null;
        field349 = null;
        if (arg0 < 102) {
            field348 = null;
        }
        field352 = null;
        field355 = null;
        field348 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IBLka;I)Z", line = 73)
    public static final boolean method193(int arg0, byte arg1, class20 arg2, int arg3) {
        if (arg1 < 95) {
            return false;
        }
        byte[] var4 = arg2.method88(arg0, (byte) -49, arg3);
        if (var4 == null) {
            return false;
        } else {
            class21.method111(var4, 31649);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 120)
    public class30(Throwable arg0, String arg1) {
        this.field353 = arg0;
        this.field350 = arg1;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(B)V", line = 137)
    public static final void method194(byte arg0) {
        int var1 = 126 % ((44 - arg0) / 52);
        if (class29.field342 != null) {
            class27 var2 = class29.field342;
            synchronized (class29.field342) {
                class29.field342 = null;
            }
        }
    }
}
