import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class class33 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lmd;")
    public static class220 field659 = null;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field665 = -1;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "Lqk;")
    public static class207 field668 = class24.method212(255, "settings=");

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
    public abstract void method247(int arg0, int arg1);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
    public static void method248(boolean arg0) {
        if (arg0) {
            field659 = null;
            field668 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
    public abstract void method249(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field664++;
        if (arg8 != -15488) {
            return;
        }
        int var9 = arg5 - arg7;
        int var10 = arg4 - arg6;
        int var11 = (arg3 - arg2 << 16) / var9;
        int var12 = (arg0 - arg1 << 16) / var10;
        class263.method1819(0, arg1, arg4, arg5, arg6, 0, arg7, var12, (byte) -107, var11, arg2);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)Lwd;")
    public static final class22 method251(int arg0, int arg1) {
        class22 var2 = (class22) class141.field2445.method1387((long) arg1, arg0 ^ 0x7C);
        field660++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class173.field3116.method705(class232.method1658(arg0 - 26, arg1), class180.method1282(255, arg1), -1);
        class22 var4 = new class22();
        var4.field375 = arg1;
        if (var3 != null) {
            var4.method143(new class149(var3), true);
        }
        var4.method131(5844);
        if (!class22.field416 && var4.field355) {
            var4.field425 = null;
        }
        if (arg0 != 0) {
            method251(69, 20);
        }
        if (var4.field431) {
            var4.field393 = 0;
            var4.field388 = false;
        }
        class141.field2445.method1385((long) arg1, var4, (byte) -128);
        return var4;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)Lqk;")
    public static final class207 method252(int arg0, int arg1) {
        field670++;
        if (arg1 < arg0) {
            return class105.method757(false, new class207[] { class97.field1708, class262.method1815(arg1, (byte) -100), class269.field4767 });
        } else if (arg1 < 10000000) {
            return class105.method757(false, new class207[] { class79.field1433, class262.method1815(arg1 / 1000, (byte) -105), class124.field2140, class269.field4767 });
        } else {
            return class105.method757(false, new class207[] { class278.field4879, class262.method1815(arg1 / 1000000, (byte) 14), class56.field1046, class269.field4767 });
        }
    }
}
