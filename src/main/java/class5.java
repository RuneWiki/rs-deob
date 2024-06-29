import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Ljava/lang/String;")
    public static String field66 = "Allocating memory";

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field70 = 0;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lbc;")
    public static class282 field63;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lbc;")
    public static class282 field68;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I")
    public static int method26(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static void method27(boolean arg0) {
        field68 = null;
        field66 = null;
        field63 = null;
        if (arg0) {
            method28((class282) null, false);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lbc;Z)V")
    public static final void method28(class282 arg0, boolean arg1) {
        field64++;
        class245.field3561 = arg0;
        class198.field2822 = class245.field3561.method1874((byte) 18, 4);
        if (!arg1) {
            method30(76, 108);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Z")
    public static final boolean method29(int arg0, byte arg1) {
        field65++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 != -37) {
            field67 = -41;
        }
        int var2 = class190.field2749[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1001;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V")
    public static final void method30(int arg0, int arg1) {
        class133 var2 = class6.field94[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class133 var4 = class6.field94[var3][arg0][arg1] = class6.field94[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1938--;
                for (int var5 = 0; var5 < var4.field1934; var5++) {
                    class243 var6 = var4.field1930[var5];
                    if ((var6.field3539 >> 29 & 0x3L) == 2L && var6.field3540 == arg0 && var6.field3527 == arg1) {
                        var6.field3534--;
                    }
                }
            }
        }
        if (class6.field94[0][arg0][arg1] == null) {
            class6.field94[0][arg0][arg1] = new class133(0, arg0, arg1);
        }
        class6.field94[0][arg0][arg1].field1936 = var2;
        class6.field94[3][arg0][arg1] = null;
    }
}
