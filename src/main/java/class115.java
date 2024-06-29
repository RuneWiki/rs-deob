import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class115 implements class58 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Lla;")
    private class422 field1784;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Lla;")
    private class422 field1780;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lwv;")
    private class232 field1785;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Z")
    public static boolean field1786 = false;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Lln;")
    public static class472 field1787 = new class472(2, 4, 4, 0);

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1788 = 0;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "Lcb;")
    public static class631 field1789 = new class631(60, -1);

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1790 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Lda;")
    private class400 field1782;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[[B")
    public static byte[][] field1791;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZ)V")
    public final void method575(boolean arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field1785.field3745.method3824(class335.field4917, (byte) -51, this.field1785.field3744) + this.field1785.field3729;
            int var4 = this.field1785.field3741.method2088(this.field1785.field3734, (byte) -126, class614.field8651) + this.field1785.field3740;
            this.field1782.method2468(this.field1785.field3733, 0, this.field1785.field3736, 0, 0, var4, var3, null, this.field1785.field3743, this.field1785.field3739, this.field1785.field3734, null, null, this.field1785.field3730, this.field1785.field3728, this.field1785.field3744);
        }
        field1779++;
        if (!arg0) {
            this.method574((byte) -12);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public final void method576(int arg0) {
        field1781++;
        if (arg0 != -28886) {
            field1787 = null;
        }
        class54 var2 = class273.method1796(arg0 ^ 0x708F, this.field1784, this.field1785.field3737);
        this.field1782 = class364.field5573.method424(var2, class726.method4016(this.field1780, this.field1785.field3737), true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)Z")
    public final boolean method574(byte arg0) {
        field1783++;
        boolean var2 = true;
        if (arg0 < 96) {
            this.field1780 = null;
        }
        if (!this.field1780.method2621(this.field1785.field3737, -28975)) {
            var2 = false;
        }
        if (!this.field1784.method2621(this.field1785.field3737, -28975)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static void method922(int arg0) {
        field1791 = null;
        field1787 = null;
        if (arg0 != 2718) {
            method922(97);
        }
        field1789 = null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lla;Lla;Lwv;)V")
    public class115(class422 arg0, class422 arg1, class232 arg2) {
        this.field1784 = arg1;
        this.field1780 = arg0;
        this.field1785 = arg2;
    }
}
