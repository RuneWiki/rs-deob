import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class239 extends class372 {

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public int field3292 = -1;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lec;")
    public static class40 field3290 = new class40("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Lss;")
    public static class140 field3297 = new class140(7, 6);

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Ljava/lang/String;")
    public String field3291;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Ljava/lang/String;")
    public String field3294;

    static {
        new class40("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILg;)V", line = 3)
    public static final void method1313(int arg0, class470 arg1) {
        class20.field280 = arg1.method2761(0, "titlebg");
        ++field3293;
        int var2 = -86 / ((26 - arg0) / 58);
        class58.field735 = arg1.method2761(0, "logo");
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)V", line = 24)
    public static final void method1314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3296;
        int var7 = arg4 + arg5;
        if (arg6 != -27997) {
            field3290 = null;
        }
        int var8 = arg1 - arg4;
        for (int var9 = arg5; var9 < var7; ++var9) {
            class270.method1633(class240.field3303[var9], arg0, arg2, arg3, 127);
        }
        for (int var10 = arg1; ~var10 < ~var8; --var10) {
            class270.method1633(class240.field3303[var10], arg0, arg2, arg3, 116);
        }
        int var11 = -arg4 + arg0;
        int var12 = arg3 + arg4;
        for (int var13 = var7; ~var8 <= ~var13; ++var13) {
            int[] var14 = class240.field3303[var13];
            class270.method1633(var14, var12, arg2, arg3, 111);
            class270.method1633(var14, arg0, arg2, var11, 113);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)Lr;", line = 68)
    public final class69 method1315(byte arg0) {
        if (arg0 < 62) {
            return null;
        } else {
            ++field3295;
            return class188.field2540[super.field5330];
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lpt;Lpt;Z)V", line = 79)
    public static final void method1316(class147 arg0, class147 arg1, boolean arg2) {
        ++field3298;
        if (arg1.field1777 != null) {
            arg1.method702((byte) -114);
        }
        arg1.field1779 = arg0;
        arg1.field1777 = arg0.field1777;
        arg1.field1777.field1779 = arg1;
        if (!arg2) {
            method1317(98);
        }
        arg1.field1779.field1777 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V", line = 106)
    public static void method1317(int arg0) {
        field3290 = null;
        field3297 = null;
        if (arg0 != 30469) {
            method1317(127);
        }
    }
}
