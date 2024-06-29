import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class463 {

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public int field6725;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field6719 = 0;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
    public static int[] field6721 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Liu;")
    public static class390 field6716 = new class390(65, -2);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIIII)V", line = 9)
    public static final void method2717(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        field6722++;
        int var6 = arg5 - 334;
        if (arg3 < 102) {
            field6724 = -75;
        }
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class42.field638 - class112.field1469) * var6 / 100 + class112.field1469;
        if (var7 < class267.field3767) {
            var7 = class267.field3767;
        } else if (var7 > class286.field4087) {
            var7 = class286.field4087;
        }
        int var8 = arg5 * var7 * 512 / (arg4 * 334);
        if (class441.field6439 > var8) {
            short var9 = class441.field6439;
            var7 = arg4 * var9 * 334 / (arg5 * 512);
            if (var7 > class286.field4087) {
                var7 = class286.field4087;
                int var10 = arg5 * var7 * 512 / (var9 * 334);
                int var11 = (arg4 - var10) / 2;
                if (arg1) {
                    class481.field6937.method836();
                    class481.field6937.method801(-6625, var11, arg2, -16777216, arg0, arg5);
                    class481.field6937.method801(-6625, var11, arg2, -16777216, arg0 + arg4 - var11, arg5);
                }
                arg4 -= var11 * 2;
                arg0 += var11;
            }
        } else if (var8 > class315.field4623) {
            short var12 = class315.field4623;
            var7 = arg4 * var12 * 334 / (arg5 * 512);
            if (class267.field3767 > var7) {
                var7 = class267.field3767;
                int var13 = var12 * 334 * arg4 / (var7 * 512);
                int var14 = (arg5 - var13) / 2;
                if (arg1) {
                    class481.field6937.method836();
                    class481.field6937.method801(-6625, arg4, arg2, -16777216, arg0, var14);
                    class481.field6937.method801(-6625, arg4, arg2 + arg5 - var14, -16777216, arg0, var14);
                }
                arg2 += var14;
                arg5 -= var14 * 2;
            }
        }
        class115.field1483 = (short) arg4;
        class212.field3007 = arg0;
        class87.field1201 = (short) arg5;
        class22.field295 = arg5 * var7 / 334;
        class237.field3319 = arg2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)[Lak;", line = 105)
    public static final class222[] method2718(byte arg0) {
        if (arg0 == -118) {
            field6717++;
            return new class222[] { class144.field1866, class310.field4517, class167.field2195, class153.field1963, class293.field4178, class38.field581, class381.field5680, class75.field1065, class6.field97, class226.field3186, class37.field569, class358.field5313, class423.field6254, class210.field2960 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)I", line = 116)
    public final int method2719(byte arg0) {
        field6720++;
        int var2 = -102 % ((-arg0 - 62) / 38);
        return this.field6725;
    }

    @OriginalMember(owner = "client!ag", name = "toString", descriptor = "()Ljava/lang/String;", line = 127)
    public final String toString() {
        field6718++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 149)
    public static void method2720(int arg0) {
        field6716 = null;
        field6721 = null;
        if (arg0 != 0) {
            method2720(55);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 166)
    public class463(String arg0, int arg1) {
        this.field6725 = arg1;
    }
}
