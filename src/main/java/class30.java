import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 {

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lid;")
    public static class149 field449 = class60.method382("null", (byte) 39);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static volatile int field447 = -1;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "J")
    public static long field446;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lal;")
    public static class230 field445;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)V")
    public static final void method180(byte arg0, int arg1) {
        field454++;
        if (arg0 <= -127) {
            class216 var2 = class139.method972(arg1, false, 6);
            var2.method1457(0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static void method181(boolean arg0) {
        field445 = null;
        field449 = null;
        if (arg0) {
            method184(31, 25);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)I")
    public static final int method182(byte arg0) {
        field450++;
        return arg0 > -12 ? -46 : 6;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZILal;I)[Lrh;")
    public static final class46[] method183(boolean arg0, int arg1, class230 arg2, int arg3) {
        field452++;
        if (!arg0) {
            method182((byte) 45);
        }
        return class59.method371((byte) 79, arg3, arg1, arg2) ? class182.method1261(17100) : null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public static final int method184(int arg0, int arg1) {
        if (arg1 > -126) {
            field449 = null;
        }
        field448++;
        return arg0 >>> 8;
    }
}
