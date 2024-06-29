import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class240 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Lok;")
    private static class41 field3836 = class137.method956("Please remove ", 45);

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Lok;")
    public static class41 field3837 = field3836;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Lok;")
    public static class41 field3839 = field3836;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "[Lok;")
    public static class41[] field3843 = new class41[8];

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lok;")
    public static class41 field3842 = class137.method956("W-=hlen Sie eine Option", 45);

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Lji;")
    public static class154 field3845;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBI)V", line = 8)
    public static final void method1719(int arg0, byte arg1, int arg2) {
        field3841++;
        class46 var3 = class195.method1396(12, arg0, false);
        var3.method337(0);
        if (arg1 != 56) {
            field3842 = (class41) null;
        }
        var3.field721 = arg2;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([Lok;[SI)V", line = 25)
    public static final void method1720(class41[] arg0, short[] arg1, int arg2) {
        class232.method1652(arg2, arg0.length - 1, arg1, true, arg0);
        field3840++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)Lqi;", line = 33)
    public static final class232 method1721(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field5193; var4++) {
            class232 var5 = var3.field5201[var4];
            if ((var5.field3672 >> 29 & 0x3L) == 2L && var5.field3668 == arg1 && var5.field3665 == arg2) {
                class238.method1707(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 59)
    public static void method1722(int arg0) {
        field3843 = null;
        field3836 = null;
        if (arg0 >= -89) {
            field3837 = (class41) null;
        }
        field3839 = null;
        field3845 = null;
        field3842 = null;
        field3837 = null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 83)
    public static final void method1723(int arg0) {
        field3844++;
        class110.field1556 = null;
        int var1 = -119 % ((54 - arg0) / 32);
        class169.field2684 = null;
        class255.field4099 = null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(III)I", line = 113)
    public static final int method1724(int arg0, int arg1, int arg2) {
        field3846++;
        int var3 = arg0;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }
}
