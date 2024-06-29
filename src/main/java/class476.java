import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public abstract class class476 implements class509 {

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "Lae;")
    private class283 field6601;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "Ldda;")
    public class406 field6598;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "Lae;")
    public class283 field6603;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "Ljn;")
    public static class134 field6600 = new class134(36, -2);

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "I")
    private int field6604;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "J")
    private long field6605;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "Lda;")
    private class442 field6596;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "[I")
    public static int[] field6609;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIZ)V")
    public abstract void method995(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZ)V")
    public final void method939(int arg0, boolean arg1) {
        field6597++;
        int var3 = this.field6598.field5719.method1744(class456.field6378, this.field6598.field5723, (byte) 77) + this.field6598.field5717;
        int var4 = this.field6598.field5716.method59(0, class565.field7983, this.field6598.field5722) + this.field6598.field5715;
        this.method995(-29993, var3, var4, arg1);
        this.method997(var3, arg1, var4, 59);
        if (arg0 != 7998) {
            this.field6604 = 119;
        }
        String var5 = class409.field5750.method959(1);
        if (class683.method3903((byte) 4) - this.field6605 > 10000L) {
            var5 = var5 + " (" + class409.field5750.method967((byte) -113).method3480(arg0 ^ 0x2AD1) + ")";
        }
        this.field6596.method2645(this.field6598.field5724 + var4 + (this.field6598.field5722 / 2) + 4, this.field6598.field5720, var5, -1, arg0 - 7998, this.field6598.field5723 / 2 + var3);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)Z")
    public boolean method941(byte arg0) {
        field6599++;
        if (arg0 != -79) {
            this.method2838(false);
        }
        boolean var2 = true;
        if (!this.field6603.method1860(this.field6598.field5721, (byte) 124)) {
            var2 = false;
        }
        if (!this.field6601.method1860(this.field6598.field5721, (byte) 124)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
    public static void method2837(int arg0) {
        field6609 = null;
        field6600 = null;
        if (arg0 != 25408) {
            field6609 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lae;Lae;Ldda;)V")
    public class476(class283 arg0, class283 arg1, class406 arg2) {
        this.field6601 = arg1;
        this.field6598 = arg2;
        this.field6603 = arg0;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)I")
    public final int method2838(boolean arg0) {
        field6607++;
        if (!arg0) {
            this.method941((byte) 125);
        }
        int var2 = class409.field5750.method969(0);
        int var3 = var2 * 100;
        if (this.field6604 == var2 && var2 != 0) {
            int var4 = class409.field5750.method964(!arg0);
            if (var2 < var4) {
                long var5 = this.field6605 - class409.field5750.method968(false);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class683.method3903((byte) 4) - this.field6605) * 10000L;
                    if (var9 < var7) {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + ((long) (var2 * 100)));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field6604 = var2;
            this.field6605 = class683.method3903((byte) 4);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    public void method938(int arg0) {
        field6606++;
        class300 var2 = class397.method2445(this.field6601, (byte) -117, this.field6598.field5721);
        this.field6596 = class111.field1332.method179(var2, class279.method1823(this.field6603, this.field6598.field5721), true);
        if (arg0 < 61) {
            this.field6604 = -120;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZLha;Z)Lda;")
    public static final class442 method2839(int arg0, boolean arg1, class473 arg2, boolean arg3) {
        field6602++;
        class485 var4 = class778.method4283(arg1, arg0, arg2, (byte) 2);
        if (arg3) {
            method2839(113, true, null, false);
        }
        return var4 == null ? null : var4.field6708;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZII)V")
    public abstract void method997(int arg0, boolean arg1, int arg2, int arg3);
}
