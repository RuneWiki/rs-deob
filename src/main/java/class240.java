import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class240 {

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lik;")
    public static class259 field3732 = new class259(64);

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3737 = "Loaded wordpack";

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "J")
    public long field3734;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lfj;")
    public class240 field3736;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Lfj;")
    public class240 field3739;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Ltd;")
    public static class241 field3735;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Z", line = 7)
    public final boolean method1700(int arg0) {
        field3729++;
        if (arg0 != 0) {
            method1706(12, -85, -106);
        }
        return this.field3736 != null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 22)
    public final void method1701(int arg0) {
        field3738++;
        if (arg0 <= -76 && this.field3736 != null) {
            this.field3736.field3739 = this.field3739;
            this.field3739.field3736 = this.field3736;
            this.field3736 = null;
            this.field3739 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)Lbl;", line = 41)
    public static final class312 method1702(byte arg0, int arg1) {
        field3730++;
        class312 var2 = (class312) class245.field3781.method1830((long) arg1, (byte) 52);
        if (arg0 != -98) {
            method1703((byte) 44, -80, 74);
        }
        if (var2 != null) {
            return var2;
        }
        class312 var3 = class95.method679(class312.field4905, arg1, class84.field1245, false, -27477);
        if (var3 != null) {
            class245.field3781.method1831((long) arg1, var3, -13897);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BII)V", line = 62)
    public static final void method1703(byte arg0, int arg1, int arg2) {
        field3731++;
        class4 var3 = class67.method510(1, 1, arg2);
        var3.method14(24710);
        var3.field20 = arg1;
        if (arg0 != -40) {
            field3732 = (class259) null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V", line = 86)
    public static void method1704(int arg0) {
        field3737 = null;
        if (arg0 != -4) {
            field3732 = (class259) null;
        }
        field3732 = null;
        field3735 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIZI)V", line = 101)
    public static final void method1705(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class176.field2770 = 0L;
        field3727++;
        boolean var5 = false;
        int var6 = class242.method1719(0);
        if (arg1 == 3 || var6 == 3) {
            arg3 = true;
        }
        if (arg1 <= 0 == var6 > 0) {
            var5 = true;
        }
        if (class325.field5042.startsWith("mac") && arg1 > 0) {
            arg3 = true;
        }
        if (arg3 && arg1 > 0) {
            var5 = true;
        }
        class145.method1098(var5, arg4, arg1, arg0, var6, arg2, arg3);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)I", line = 133)
    public static final int method1706(int arg0, int arg1, int arg2) {
        field3733++;
        if (arg0 != 64) {
            method1706(-40, -41, -14);
        }
        int var3 = arg1 >> 31 & arg2 - 1;
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }
}
