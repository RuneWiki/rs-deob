import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class280 {

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Ltq;")
    private class536 field3632 = new class536(256);

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lwm;")
    private class30 field3630;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[I")
    public static int[] field3633 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Llq;)V")
    public static final void method1716(class210 arg0) {
        class398.field5275.method901(arg0.field2896, arg0.field2892 + (arg0.method747(15258) >> 1), arg0.field2900, class675.field8734);
        arg0.field2898 = class675.field8734[0];
        arg0.field2888 = class675.field8734[1];
        arg0.field2887 = class675.field8734[2];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public final void method1717(byte arg0) {
        class536 var2 = this.field3632;
        synchronized (this.field3632) {
            this.field3632.method2919(arg0 ^ 0xFFFFFFA2);
        }
        if (arg0 != -94) {
            this.method1718((byte) 19);
        }
        field3631++;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public final void method1718(byte arg0) {
        field3627++;
        class536 var2 = this.field3632;
        synchronized (this.field3632) {
            int var3 = -11 % ((arg0 + 56) / 40);
            this.field3632.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
    public static void method1719(byte arg0) {
        field3633 = null;
        if (arg0 < 31) {
            field3633 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public final void method1720(int arg0, int arg1) {
        class536 var3 = this.field3632;
        synchronized (this.field3632) {
            this.field3632.method2928(true, arg1);
            if (arg0 != -19807) {
                this.method1720(39, 29);
            }
        }
        field3629++;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Lva;")
    public final class523 method1721(int arg0, int arg1) {
        field3628++;
        class536 var3 = this.field3632;
        class523 var4;
        synchronized (this.field3632) {
            var4 = (class523) this.field3632.method2931((long) arg1, (byte) -72);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field3630;
        byte[] var6;
        synchronized (this.field3630) {
            var6 = this.field3630.method139(arg0, (byte) -94, arg1);
        }
        class523 var7 = new class523();
        if (var6 != null) {
            var7.method2879(true, new class234(var6));
        }
        class536 var8 = this.field3632;
        synchronized (this.field3632) {
            this.field3632.method2918((long) arg1, var7, 104);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lega;ILwm;)V")
    public class280(class473 arg0, int arg1, class30 arg2) {
        this.field3630 = arg2;
        this.field3630.method138(0, 26);
    }
}
