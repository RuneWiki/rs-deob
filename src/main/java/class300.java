import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class class300 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lke;")
    public static class256 field5167 = class316.method2202("floorshadows", 27626);

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "[Lrb;")
    public static class144[] field5172 = new class144[2048];

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lke;")
    public static class256 field5173 = class316.method2202(")2", 27626);

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lke;")
    public static class256 field5175 = class316.method2202("<br>(X", 27626);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
    public static int[] field5169;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 17)
    public static void method2096(boolean arg0) {
        if (!arg0) {
            field5169 = (int[]) null;
        }
        field5175 = null;
        field5169 = null;
        field5173 = null;
        field5172 = null;
        field5167 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIILrd;Lla;I)V", line = 31)
    public static final void method2097(int arg0, int arg1, int arg2, int arg3, class135 arg4, class188 arg5, int arg6) {
        field5170++;
        if (arg4 == null) {
            return;
        }
        int var7 = class289.field5001 + class215.field3839 & 0x7FF;
        int var8 = Math.max(arg5.field3391 / 2, arg5.field3343 / 2) + 10;
        int var9 = arg6 * arg6 + (arg2 * arg2);
        if (var8 * var8 < var9 || arg0 != -904) {
            return;
        }
        int var10 = class136.field2366[var7];
        int var11 = class136.field2372[var7];
        int var12 = var10 * 256 / (class162.field2880 + 256);
        int var13 = var11 * 256 / (class162.field2880 + 256);
        int var14 = arg2 * var12 + arg6 * var13 >> 16;
        int var15 = arg2 * var13 - (arg6 * var12) >> 16;
        if (class253.field4323) {
            ((class87) arg4).method636(arg5.field3391 / 2 + var14 + arg3 - (arg4.field2351 / 2), arg1 - -(arg5.field3343 / 2) + -(arg4.field2354 / 2) + -var15, (class87) arg5.method1359(false, (byte) -126));
        } else {
            ((class227) arg4).method1557(var14 + (arg3 + (arg5.field3391 / 2)) - arg4.field2351 / 2, arg1 - -(arg5.field3343 / 2) - (var15 - -(arg4.field2354 / 2)), arg5.field3359, arg5.field3386);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 83)
    public static final void method2098(int arg0, int arg1) {
        class208.method1470((byte) -24);
        field5171++;
        class83.method614(116);
        if (arg0 < 98) {
            field5172 = (class144[]) null;
        }
        int var2 = class223.method1533(arg1, 0).field1685;
        if (var2 == 0) {
            return;
        }
        int var3 = class97.field1741[arg1];
        if (var2 == 6) {
            class282.field4903 = var3;
        }
        if (var2 == 9) {
            class166.field2940 = var3;
        }
        if (var2 == 5) {
            class154.field2747 = var3;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lsg;Lsg;Z)V", line = 114)
    public static final void method2099(class163 arg0, class163 arg1, boolean arg2) {
        if (arg2) {
            method2096(true);
        }
        field5174++;
        if (arg0.field2894 != null) {
            arg0.method1199(21966);
        }
        arg0.field2893 = arg1;
        arg0.field2894 = arg1.field2894;
        arg0.field2894.field2893 = arg0;
        arg0.field2893.field2894 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method883(Component arg0, int arg1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method882(int arg0, Component arg1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)I")
    public abstract int method881(int arg0);
}
