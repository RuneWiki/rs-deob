import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class378 implements class590 {

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "Lub;")
    private class145 field5669;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "Lmv;")
    private class295 field5672;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
    public static int field5678 = 0;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "Lvs;")
    public static class476 field5670 = new class476();

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public static int field5681 = -1;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "Lcv;")
    public static class22 field5680;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "Lf;")
    private class256 field5675;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)Z")
    public static final boolean method2333(int arg0) {
        field5676++;
        if (class295.field4357) {
            try {
                if ((Boolean) class101.method727("showingVideoAd", -118, class551.field8116)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 3) {
            field5680 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Leda;")
    public static final class116 method2334(int arg0, int arg1) {
        field5677++;
        if (arg0 == -1) {
            return class115.field1723 && class465.field6709 <= arg1 && arg1 <= class697.field9825 ? class418.field6180[arg1 - class465.field6709] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)V")
    public static void method2335(byte arg0) {
        field5680 = null;
        field5670 = null;
        if (arg0 >= -64) {
            field5670 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)Z")
    public final boolean method941(byte arg0) {
        if (arg0 >= -15) {
            method2334(-10, 116);
        }
        field5674++;
        return this.field5672.method1818(this.field5669.field2082, 4);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZBII)V")
    public static final void method2336(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field5668++;
        class178.field2486 = 0L;
        int var5 = class38.method219(-2);
        if (arg2 >= -102) {
            field5680 = null;
        }
        if (arg4 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class332.field4821.method685()) {
            arg1 = true;
        }
        class127.method908(arg0, arg4, (byte) 106, var5, arg3, arg1);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZ)V")
    public final void method944(int arg0, boolean arg1) {
        field5671++;
        if (arg0 != -31764) {
            field5678 = 69;
        }
        if (!arg1) {
            return;
        }
        int var3 = class454.field6538 > class677.field9591 ? class454.field6538 : class677.field9591;
        int var4 = class619.field8966 >= class425.field6218 ? class619.field8966 : class425.field6218;
        int var5 = this.field5675.method50();
        int var6 = this.field5675.method43();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var4 < var9) {
            var8 = var4 * var5 / var6;
            var9 = var4;
            var10 = 0;
            var7 = (var3 - var8) / 2;
        }
        this.field5675.method1535(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public final void method940(int arg0) {
        if (arg0 == -32557) {
            this.field5675 = class201.method1305(this.field5672, true, this.field5669.field2082);
            field5679++;
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lmv;Lub;)V")
    public class378(class295 arg0, class145 arg1) {
        this.field5669 = arg1;
        this.field5672 = arg0;
    }
}
