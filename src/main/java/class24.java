import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class24 {

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "La;")
    public static class1 field222 = class3.method36("Prev page", -113);

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "La;")
    public static class1 field227 = class3.method36("details)3dat", -101);

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "[J")
    public static long[] field226 = new long[32];

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "La;")
    public static class1 field229 = class3.method36("Silk Trader", -96);

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "J")
    public static long field223;

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Lh;")
    public static class14 field224;

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "[B")
    public static byte[] field230;

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "[La;")
    public static class1[] field228;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 26)
    public static final byte[] method143(boolean arg0, Object arg1, int arg2) {
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return arg0 ? class2.method30(2889, var4) : var4;
        } else if (arg1 instanceof class3) {
            class3 var3 = (class3) arg1;
            return var3.method37((byte) -100);
        } else {
            if (arg2 != 32) {
                field223 = -89L;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Z)V", line = 71)
    public static void method144(boolean arg0) {
        field228 = null;
        if (!arg0) {
            return;
        }
        field226 = null;
        field222 = null;
        field227 = null;
        field229 = null;
        field224 = null;
        field230 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)B", line = 94)
    public static final byte method145(byte arg0) {
        if (arg0 > -84) {
            return -120;
        } else if (class2.field20 == null) {
            return 0;
        } else {
            return class2.field20[class5.field47];
        }
    }
}
