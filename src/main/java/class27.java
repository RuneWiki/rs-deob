import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class27 extends class21 {

    @OriginalMember(owner = "mapview!o", name = "n", descriptor = "I")
    public static volatile int field403 = 0;

    @OriginalMember(owner = "mapview!o", name = "s", descriptor = "Z")
    public static volatile boolean field408 = false;

    @OriginalMember(owner = "mapview!o", name = "t", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "mapview!o", name = "q", descriptor = "Lt;")
    public static class36 field406 = class3.method8(13631, "world");

    @OriginalMember(owner = "mapview!o", name = "r", descriptor = "Lt;")
    public static class36 field407 = class3.method8(13631, "Magic Shop");

    @OriginalMember(owner = "mapview!o", name = "v", descriptor = "Lt;")
    public static class36 field411 = class3.method8(13631, "Enter place name to find");

    @OriginalMember(owner = "mapview!o", name = "p", descriptor = "Lt;")
    public static class36 field405 = class3.method8(13631, " )2 ");

    @OriginalMember(owner = "mapview!o", name = "o", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "mapview!o", name = "u", descriptor = "Lt;")
    public class36 field410;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 21)
    public static void method160(byte arg0) {
        field406 = null;
        field405 = null;
        field411 = null;
        if (arg0 == 94) {
            field407 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Lk;Lt;Lt;Lk;I)Lm;", line = 61)
    public static final class23 method161(class19 arg0, class36 arg1, class36 arg2, class19 arg3, int arg4) {
        if (arg4 > -5) {
            field408 = true;
        }
        int var5 = arg3.method102(-1, arg2);
        int var6 = arg3.method99(arg1, 0, var5);
        return class22.method128(var5, arg3, var6, arg0, 3769);
    }

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "(I)B", line = 76)
    public static final byte method162(int arg0) {
        if (arg0 == 0) {
            return class20.field252 == null ? 0 : class20.field252[class6.field65];
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(III)B", line = 107)
    public static final byte method163(int arg0, int arg1, int arg2) {
        if (arg1 != 4032) {
            method160((byte) 57);
        }
        int var3 = arg2 >> 6;
        int var4 = arg0 >> 6;
        if (class9.field94[var4][var3] == null) {
            return 0;
        } else if (class9.field94[var4][var3].field537 == null) {
            return class9.field94[var4][var3].field536;
        } else {
            return class9.field94[var4][var3].field537[(arg0 & 0xFC0) + arg2 & 0x3F];
        }
    }
}
