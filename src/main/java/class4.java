import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class34 {

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    private final int field51;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    private final int field46;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    private final int field50;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    private final int field52;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lob;")
    public static class141 field42 = null;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Lob;")
    private static class141 field48 = class175.method1195(40, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Lob;")
    public static class141 field43 = field48;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lob;")
    public static class141 field45 = null;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "[I")
    public static int[] field44 = new int[128];

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Lob;")
    public static class141 field49 = class175.method1195(40, "hint_mapedge");

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lob;")
    public static class141 field55 = class175.method1195(40, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Lob;")
    public static class141 field54 = class175.method1195(40, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "[Lkc;")
    public static class102[] field40;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static final void method20(int arg0) {
        ++field56;
        if (~class50.field966 < -1) {
            class32.method238((byte) -122);
        } else {
            if (arg0 != 25005) {
                field48 = null;
            }
            class156.method1086(40, (byte) 35);
            class116.field2229 = class29.field562;
            class29.field562 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lkc;IIILra;II)V")
    public static final void method21(class102 arg0, int arg1, int arg2, int arg3, class170 arg4, int arg5, int arg6) {
        ++field41;
        if (arg0 != null) {
            int var7 = 2047 & class96.field1901 + class214.field4084;
            int var8 = Math.max(arg4.field3299 / 2, arg4.field3284 / 2) - -10;
            if (arg1 >= -61) {
                field48 = null;
            }
            int var9 = arg3 * arg3 + arg6 * arg6;
            if (var8 * var8 >= var9) {
                int var10 = class44.field854[var7];
                int var11 = class44.field843[var7];
                int var12 = var10 * 256 / (class116.field2225 + 256);
                int var13 = var11 * 256 / (class116.field2225 + 256);
                int var14 = arg3 * var13 + -(arg6 * var12) >> 16;
                int var15 = arg3 * var12 + arg6 * var13 >> 16;
                arg0.method666(arg4.field3299 / 2 + arg2 + var15 + -(arg0.field1987 / 2), arg4.field3284 / 2 + -var14 + -(arg0.field1982 / 2) + arg5, arg4.field3347, arg4.field3362);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)V")
    public final void method22(int arg0, int arg1, boolean arg2) {
        ++field57;
        if (!arg2) {
            field55 = null;
        }
        int var4 = this.field46 * arg1 >> 12;
        int var5 = this.field50 * arg1 >> 12;
        int var6 = this.field51 * arg0 >> 12;
        int var7 = this.field52 * arg0 >> 12;
        class174.method1193(var4, var7, var6, super.field697, var5, -23302);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIZLpe;II)V")
    public static final void method23(boolean arg0, int arg1, boolean arg2, class154 arg3, int arg4, int arg5) {
        class180.field3542 = arg1;
        if (arg2) {
            class202.field3820 = 1;
            class54.field1041 = arg5;
            class53.field1006 = arg4;
            class119.field2322 = arg3;
            ++field47;
            class182.field3585 = arg0;
            class22.field398 = 10000;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)V")
    public final void method24(int arg0, byte arg1, int arg2) {
        ++field59;
        if (arg1 != 114) {
            method25(52);
        }
        int var4 = this.field52 * arg2 >> 12;
        int var5 = this.field51 * arg2 >> 12;
        int var6 = this.field50 * arg0 >> 12;
        int var7 = this.field46 * arg0 >> 12;
        class204.method1350(var5, -118, var4, var6, super.field689, super.field697, super.field686, var7);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIIII)V")
    public class4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field51 = arg2;
        this.field46 = arg3;
        this.field50 = arg1;
        this.field52 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static void method25(int arg0) {
        field42 = null;
        field55 = null;
        if (arg0 <= 89) {
            method25(-9);
        }
        field48 = null;
        field44 = null;
        field45 = null;
        field54 = null;
        field43 = null;
        field40 = null;
        field49 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIB)I")
    public static final int method26(int arg0, int arg1, int arg2, byte arg3) {
        ++field53;
        int var4 = arg1 / arg0;
        int var5 = arg1 & arg0 - 1;
        int var6 = arg2 / arg0;
        int var7 = class63.method419(var6, var4, (byte) -100);
        int var8 = arg0 - 1 & arg2;
        int var9 = class63.method419(var6, var4 + 1, (byte) -100);
        int var10 = class63.method419(var6 + 1, var4, (byte) -100);
        if (arg3 != 97) {
            return 86;
        } else {
            int var11 = class63.method419(var6 + 1, var4 + 1, (byte) -100);
            int var12 = class197.method1326(1024, var9, var5, arg0, var7);
            int var13 = class197.method1326(1024, var11, var5, arg0, var10);
            return class197.method1326(arg3 ^ 1121, var13, var8, arg0, var12);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
    public final void method27(byte arg0, int arg1, int arg2) {
        if (arg0 == 94) {
            ++field58;
        }
    }
}
