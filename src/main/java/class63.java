import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class class63 extends class43 {

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "[I")
    public static int[] field1139 = new int[32];

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "Ljava/lang/String;")
    public static String field1146;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "[I")
    public static int[] field1148;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "Lpu;")
    public static class559 field1143;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
    public static int field1152;

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field1139[var1] = var0 + -1;
            var0 += var0;
        }
        field1146 = null;
        field1148 = new int[50];
        field1143 = new class559(5, 16);
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIII)V", line = 3)
    public class63(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field649 = (byte) arg3;
        super.field648 = arg2;
        super.field651 = arg1;
        super.field644 = arg0;
        super.field659 = (byte) arg4;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)I", line = 17)
    public static final int method678(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class368.field5159 - 1; ++var2) {
            if (arg0 < class729.field10212[var2] + class371.field5197[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class368.field5159 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BILha;Lgs;ZII)V", line = 39)
    public final void method405(byte arg0, int arg1, class58 arg2, class43 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 <= -5) {
            ++field1142;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lud;Z)Lgu;", line = 51)
    public static final class577 method679(class35 arg0, boolean arg1) {
        if (arg1) {
            method679((class35) null, true);
        }
        ++field1147;
        class109 var2 = class698.method3923(arg0, (byte) 116);
        int var3 = arg0.method244((byte) 118);
        return new class577(var2.field1776, var2.field1778, var2.field1775, var2.field1774, var2.field1779, var3);
    }

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "(B)Z", line = 66)
    public final boolean method402(byte arg0) {
        if (arg0 <= 28) {
            this.method391(-10);
        }
        ++field1140;
        return false;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Z", line = 78)
    public static final boolean method680(byte arg0) {
        ++field1141;
        try {
            class96 var1 = new class96();
            if (arg0 > -105) {
                field1139 = null;
            }
            byte[] var2 = var1.method869(14723, class380.field5303);
            class532.method3131(var2, (byte) -94);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)Z", line = 102)
    public final boolean method391(int arg0) {
        if (arg0 != 0) {
            field1143 = null;
        }
        ++field1144;
        class217 var2 = class130.method997(super.field649, super.field644 >> class440.field6142, super.field648 >> class440.field6142);
        return var2 != null && var2.field3090.field1821 ? class158.method1197(false, super.field648 >> class440.field6142, var2.field3090.method404(arg0 + 65535) - -this.method404(65535), super.field644 >> class440.field6142, super.field649) : class675.method3817(super.field649, 1, super.field648 >> class440.field6142, super.field644 >> class440.field6142);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V", line = 140)
    public static void method681(byte arg0) {
        field1139 = null;
        field1143 = null;
        field1148 = null;
        if (arg0 == -42) {
            field1146 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)Z", line = 159)
    public final boolean method403(int arg0) {
        if (arg0 != -28694) {
            method679((class35) null, false);
        }
        ++field1149;
        return class533.field7539[(super.field644 >> class440.field6142) + -class155.field2331 + class235.field3337][(super.field648 >> class440.field6142) + -class214.field3065 + class235.field3337];
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V", line = 170)
    public final void method400(int arg0) {
        if (arg0 <= 33) {
            field1143 = null;
        }
        ++field1145;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([Lbh;I)I", line = 183)
    public final int method407(class36[] arg0, int arg1) {
        int var3 = -43 % ((arg1 - -32) / 53);
        ++field1150;
        return this.method406(arg0, (byte) -114, super.field644 >> class440.field6142, super.field648 >> class440.field6142);
    }

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "(B)V", line = 193)
    public static final void method682(byte arg0) {
        if (~class587.field8271 > -1) {
            class587.field8271 = 0;
            class358.field5026 = -1;
            class320.field4554 = -1;
        }
        ++field1138;
        if (~class542.field7639 > ~class587.field8271) {
            class320.field4554 = -1;
            class358.field5026 = -1;
            class587.field8271 = class542.field7639;
        }
        int var1 = 123 % ((64 - arg0) / 59);
        if (~class590.field8288 > -1) {
            class320.field4554 = -1;
            class358.field5026 = -1;
            class590.field8288 = 0;
        }
        if (class542.field7636 < class590.field8288) {
            class320.field4554 = -1;
            class358.field5026 = -1;
            class590.field8288 = class542.field7636;
        }
    }
}
