import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class276 {

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Lae;")
    public class276 field3722;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lmk;")
    public class156 field3711;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field3712 = -50;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field3716 = 0;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public int field3727;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lrk;")
    public static class427 field3723;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[Z")
    public static boolean[] field3719;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[[B")
    public static byte[][] field3714;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)V")
    public static final void method1767(int arg0, int arg1, byte arg2) {
        field3713++;
        class450 var3 = class59.method540(12, arg1, 1000);
        var3.method2800(256);
        if (arg2 > 66) {
            var3.field6498 = arg0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
    public static final int method1768(int arg0, int arg1) {
        return class122.field1712 == null ? 0 : class122.field1712[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method1769(byte arg0) {
        field3719 = null;
        field3723 = null;
        int var1 = -103 % ((arg0 - 63) / 48);
        field3714 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method1770(int arg0) {
        if (arg0 <= 122) {
            field3714 = null;
        }
        class430.field6116.method2539(72);
        field3726++;
        class89.field1330.method2539(117);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)V")
    public static final void method1771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class360.field4896 = arg4;
        class265.field3565 = arg0;
        if (arg2 != 3072) {
            return;
        }
        field3724++;
        class83.field1218 = arg5;
        class183.field2667 = arg3;
        class19.field371 = arg1;
        if (class83.field1218 >= 100) {
            int var6 = class360.field4896 * 128 + 64;
            int var7 = class19.field371 * 128 + 64;
            int var8 = class22.method281(1, class69.field1046, var7, var6) - class183.field2667;
            int var9 = var6 - class356.field4842;
            int var10 = var8 - class443.field6389;
            int var11 = var7 - class374.field5261;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class167.field2488 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class286.field3837 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class167.field2488 < 1024) {
                class167.field2488 = 1024;
            }
            if (class167.field2488 > 3072) {
                class167.field2488 = 3072;
            }
        }
        class184.field2675 = 2;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z")
    public static final boolean method1772(int arg0) {
        field3725++;
        if (class229.field3182 == 0) {
            if (arg0 != -25972) {
                field3712 = 26;
            }
            return class258.field3484.method2511(58);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
    public class276(int arg0, int arg1) {
        this.field3715 = arg0;
        this.field3710 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lae;I)V")
    public class276(class276 arg0, int arg1) {
        this.field3722 = arg0;
        this.field3711 = this.field3722.field3711;
        this.field3715 = this.field3722.field3715;
        this.field3710 = this.field3722.field3710 + arg1;
    }
}
