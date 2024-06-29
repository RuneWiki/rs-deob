import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public abstract class class423 extends class215 {

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "[I")
    public static int[] field6154 = new int[4];

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "Lkea;")
    public static class213 field6151 = new class213(16);

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "[Lcp;")
    public static class674[] field6155 = new class674[4];

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "Lnea;")
    public static class664 field6156 = new class664(78, 6);

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[Lrc;)I")
    public final int method950(int arg0, class498[] arg1) {
        ++field6152;
        return arg0 != 65535 ? -56 : this.method1427(super.field3024 >> class310.field4593, arg1, -124, super.field3029 >> class310.field4593);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)Z")
    public final boolean method948(boolean arg0) {
        ++field6150;
        return !arg0 ? false : class260.field3949[(super.field3024 >> class310.field4593) + -class435.field6354 + class196.field2802][(super.field3029 >> class310.field4593) + -class612.field8575 + class196.field2802];
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public final void method947(int arg0) {
        ++field6153;
        int var2 = 42 % ((-44 - arg0) / 42);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "(I)Z")
    public final boolean method951(int arg0) {
        ++field6149;
        if (arg0 > -26) {
            field6155 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZLr;Lrga;IIZ)V")
    public final void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6) {
        if (arg6) {
            ++field6147;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
    public static void method2538(byte arg0) {
        field6155 = null;
        field6154 = null;
        if (arg0 != -76) {
            field6151 = null;
        }
        field6151 = null;
        field6156 = null;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIII)V")
    public class423(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field3023 = (byte) arg4;
        super.field3019 = (byte) arg3;
        super.field3029 = arg2;
        super.field3024 = arg0;
        super.field3018 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "(I)Z")
    public final boolean method952(int arg0) {
        ++field6148;
        if (arg0 >= -10) {
            return false;
        } else {
            class106 var2 = class48.method491(super.field3019, super.field3024 >> class310.field4593, super.field3029 >> class310.field4593);
            return var2 != null && var2.field1638.field6519 ? class70.method680(31530, super.field3029 >> class310.field4593, super.field3019, super.field3024 >> class310.field4593, var2.field1638.method1182(-32768) - -this.method1182(-32768)) : class252.method1682(super.field3019, super.field3024 >> class310.field4593, (byte) 7, super.field3029 >> class310.field4593);
        }
    }
}
