import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class637 extends class28 {

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "Ldw;")
    public class676 field8702;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
    public static int field8699 = 0;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
    public static int field8701 = 1;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!jw", name = "r", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "Lbr;")
    public static class224 field8698;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "[Lxa;")
    public static class424[] field8700;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIII)V")
    public static final void method3469(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8703++;
        class298.field3995 = arg3;
        class19.field169 = arg2;
        class398.field5676 = arg4;
        class609.field8313 = arg1;
        if (arg0 <= 3) {
            field8699 = -63;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)V")
    public static void method3470(byte arg0) {
        field8700 = null;
        field8698 = null;
        if (arg0 > -45) {
            field8699 = -114;
        }
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Ldw;)V")
    public class637(class676 arg0) {
        this.field8702 = arg0;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
    public static final void method3471(int arg0) {
        field8696++;
        class389.method2326((byte) 118, class632.field8580);
        class55.field779++;
        if (arg0 != 1) {
            method3470((byte) 20);
        }
        class253.field3491.method915(class545.field7473, 1502242504);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IC)I")
    public static final int method3472(int arg0, char arg1) {
        field8697++;
        return arg0 >= ~arg1 && arg1 < class419.field5842.length ? class419.field5842[arg1] : -1;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIZ)I")
    public static final int method3473(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method3472(7, '\u0011');
        }
        field8695++;
        int var3 = class348.method2177(arg0 - 1, 133981816, arg1 - 1) + class348.method2177(arg0 - 1, 133981816, arg1 + 1) - (-class348.method2177(arg0 + 1, 133981816, arg1 - 1) + -class348.method2177(arg0 - -1, 133981816, arg1 + 1));
        int var4 = class348.method2177(arg0, 133981816, arg1 - 1) + class348.method2177(arg0, 133981816, arg1 + 1) + (class348.method2177(arg0 + -1, 133981816, arg1) - -class348.method2177(arg0 + 1, 133981816, arg1));
        int var5 = class348.method2177(arg0, 133981816, arg1);
        return var3 / 16 + var5 / 4 + (var4 / 8);
    }
}
