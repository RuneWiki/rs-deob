import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 {

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Llc;")
    public static class143 field316 = class66.method374(" loggt sich aus)3", -1);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Llc;")
    public static class143 field311 = class66.method374(":clan:", -1);

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Llc;")
    public static class143 field318 = class66.method374("(U2", -1);

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field320 = -1;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Llc;")
    public static class143 field315 = class66.method374(")1", -1);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[Lu;")
    public static class223[] field319;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[Llc;I)Llc;")
    public static final class143 method133(int arg0, int arg1, class143[] arg2, int arg3) {
        field314++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class6.field89;
            }
            var4 += arg2[arg1 + var5].field2548;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class143 var10 = arg2[arg1 + var8];
            class275.method1813(var10.field2503, 0, var6, var7, var10.field2548);
            var7 += var10.field2548;
        }
        class143 var9 = new class143();
        var9.field2548 = var4;
        var9.field2503 = var6;
        return arg0 == 31887 ? var9 : null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method134(int arg0) {
        field318 = null;
        field316 = null;
        field311 = null;
        field319 = null;
        field315 = null;
        if (arg0 != 17708) {
            field318 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lvh;IZ)V")
    public static final void method135(class43 arg0, int arg1, boolean arg2) {
        field313++;
        int var3 = arg0.field732 == arg1 ? arg0.field831 : arg0.field732;
        int var4 = arg0.field765 == 0 ? arg0.field735 : arg0.field765;
        class209.method1455(true, var4, arg2, arg0.field722, var3, class223.field4045[arg0.field722 >> 16]);
        if (arg0.field885 != null) {
            class209.method1455(true, var4, arg2, arg0.field722, var3, arg0.field885);
        }
        class163 var5 = (class163) class212.field3942.method1824((long) arg0.field722, 0);
        if (var5 != null) {
            class238.method1599(var5.field2929, var4, 15, var3, arg2);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JB)V")
    public static final void method136(long arg0, byte arg1) {
        field317++;
        if (arg0 == 0L) {
            return;
        }
        class137.field2406++;
        class285.field5010.method799(arg1 ^ 0xFFFFFFCD, 103);
        if (arg1 != -86) {
            method134(21);
        }
        class285.field5010.method1243(arg0, 81);
    }
}
