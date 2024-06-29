import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class138 extends class145 {

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "[I")
    public int[] field1811;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "[I")
    public int[] field1812;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Lo;")
    public static class24 field1809;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Lpo;")
    public static class398 field1810;

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(II[I[I)V")
    public class138(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field1811 = arg2;
        this.field1812 = arg3;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static void method862(int arg0) {
        int var1 = -118 % ((arg0 - 76) / 50);
        field1810 = null;
        field1809 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILet;IILir;ILfu;)V")
    public static final void method863(int arg0, int arg1, class429 arg2, int arg3, int arg4, class22 arg5, int arg6, class270 arg7) {
        field1808++;
        class136 var8 = new class136();
        var8.field1792 = arg1 << 7;
        var8.field1791 = arg3 << 7;
        var8.field1779 = arg4;
        if (arg6 != -9518) {
            method862(63);
        }
        if (arg7 != null) {
            var8.field1774 = arg7;
            int var9 = arg7.field3937;
            int var10 = arg7.field4012;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg7.field3937;
                var9 = arg7.field4012;
            }
            var8.field1790 = arg7.field4015;
            var8.field1784 = arg3 + var10 << 7;
            var8.field1785 = arg7.field3963;
            var8.field1776 = arg1 + var9 << 7;
            var8.field1789 = arg7.field3974;
            var8.field1773 = arg7.field3935;
            var8.field1788 = arg7.field3936 << 7;
            var8.field1781 = arg7.field3999;
            if (arg7.field3998 != null) {
                var8.field1782 = true;
                var8.method856((byte) -121);
            }
            if (var8.field1781 != null) {
                var8.field1772 = var8.field1790 + (int) ((double) (var8.field1789 - var8.field1790) * Math.random());
            }
            class26.field317.method2657(8492, var8);
        } else if (arg2 != null) {
            var8.field1778 = arg2;
            class322 var11 = arg2.field6055;
            if (var11.field4693 != null) {
                var8.field1782 = true;
                var11 = var11.method1939(arg6 ^ 0xFFFFE48E, class163.field2413);
            }
            if (var11 != null) {
                var8.field1784 = var11.field4711 + arg3 << 7;
                var8.field1776 = var11.field4711 + arg1 << 7;
                var8.field1785 = class123.method812(arg2, arg6 ^ 0xFFFFDA84);
                var8.field1773 = var11.field4698;
                var8.field1788 = var11.field4650 << 7;
            }
            class503.field7294.method2657(8492, var8);
        } else if (arg5 != null) {
            var8.field1787 = arg5;
            var8.field1776 = arg1 + arg5.method125((byte) -98) << 7;
            var8.field1784 = arg5.method125((byte) -110) + arg3 << 7;
            var8.field1785 = class460.method2684(-116, arg5);
            var8.field1788 = arg5.field264 << 7;
            var8.field1773 = arg5.field289;
            class542.field7922.method2413((long) arg5.field3289, var8, -1);
        }
    }

    static {
        new class530("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
