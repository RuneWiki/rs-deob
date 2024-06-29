import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class394 {

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "Laf;")
    private class39 field5602 = new class39(256);

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "Lae;")
    private class283 field5603;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "[I")
    public static int[] field5600 = new int[14];

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "Lul;")
    public static class486 field5597 = new class486("", 12);

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
    public final void method2427(int arg0) {
        class39 var2 = this.field5602;
        synchronized (this.field5602) {
            this.field5602.method319(-128);
        }
        if (arg0 != 26) {
            method2432(null, 124, -11, null, -119, -39, 110, false);
        }
        field5601++;
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
    public static void method2428(int arg0) {
        field5600 = null;
        if (arg0 != 34037) {
            method2428(-101);
        }
        field5597 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)Lqh;")
    public final class80 method2429(int arg0, int arg1) {
        field5596++;
        class39 var3 = this.field5602;
        class80 var4;
        synchronized (this.field5602) {
            var4 = (class80) this.field5602.method312(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field5603;
        byte[] var6;
        synchronized (this.field5603) {
            var6 = this.field5603.method1849(arg0, (byte) 75, 26);
            if (arg1 < 83) {
                this.field5603 = null;
            }
        }
        class80 var7 = new class80();
        if (var6 != null) {
            var7.method571(-65, new class511(var6));
        }
        class39 var8 = this.field5602;
        synchronized (this.field5602) {
            this.field5602.method305(var7, (long) arg0, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z)V")
    public final void method2430(boolean arg0) {
        if (!arg0) {
            return;
        }
        field5599++;
        class39 var2 = this.field5602;
        synchronized (this.field5602) {
            this.field5602.method314(-2);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)V")
    public final void method2431(byte arg0, int arg1) {
        class39 var3 = this.field5602;
        synchronized (this.field5602) {
            this.field5602.method308(arg0 - 35, arg1);
        }
        field5604++;
        if (arg0 != 34) {
            method2428(-40);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "([IIILpq;IIIZ)Liq;")
    public static final class227 method2432(int[] arg0, int arg1, int arg2, class194 arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field5598++;
        if (arg4 != -7072) {
            method2432(null, 15, 107, null, 40, -92, 14, false);
        }
        if (!arg3.field2735 && (!class65.method506(arg1, arg4 + 37512) || !class65.method506(arg6, 30440))) {
            return arg3.field2736 ? new class227(arg3, 34037, arg1, arg6, arg7, arg0, arg2, arg5) : new class227(arg3, arg1, arg6, class179.method1142(arg1, 106), class179.method1142(arg6, arg4 ^ 0xFFFFE427), arg0);
        } else {
            return new class227(arg3, 3553, arg1, arg6, arg7, arg0, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljk;ILae;)V")
    public class394(class788 arg0, int arg1, class283 arg2) {
        this.field5603 = arg2;
        this.field5603.method1867(26, (byte) 49);
    }
}
