import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class301 extends class128 {

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public int field4775 = 12800;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "Z")
    public boolean field4793 = true;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public int field4785 = -1;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public int field4783 = 0;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public int field4798 = 12800;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public int field4797 = -1;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public int field4782 = 0;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "Ljava/lang/String;")
    public String field4796;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public int field4780;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "Ljava/lang/String;")
    public String field4776;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "Llh;")
    public class58 field4795;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "[I")
    public static int[] field4784 = new int[4096];

    @OriginalMember(owner = "client!c", name = "P", descriptor = "[I")
    public static int[] field4791 = new int[2000];

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "Lgh;")
    public static class33 field4788;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IIB)Z")
    public final boolean method2011(int arg0, int[] arg1, int arg2, byte arg3) {
        field4789++;
        for (class292 var5 = (class292) this.field4795.method369((byte) -87); var5 != null; var5 = (class292) this.field4795.method362(false)) {
            if (var5.method1964((byte) -105, arg0, arg2)) {
                var5.method1960(arg1, 1, arg2, arg0);
                return true;
            }
        }
        int var6 = -123 / ((-arg3 - 15) / 55);
        return false;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static final void method2012(byte arg0) {
        field4781++;
        int var1 = 114 % ((arg0 + 23) / 57);
        class2.field1.method948((byte) 58);
        class145.field1998.method948((byte) 58);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([IIII)Z")
    public final boolean method2013(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.method2017(-84, -27, -66);
        }
        field4794++;
        for (class292 var5 = (class292) this.field4795.method369((byte) -92); var5 != null; var5 = (class292) this.field4795.method362(false)) {
            if (var5.method1963((byte) 49, arg3, arg1)) {
                var5.method1958(arg3, arg0, 102, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public static void method2014(int arg0) {
        field4791 = null;
        field4788 = null;
        int var1 = 30 % ((arg0 - 68) / 33);
        field4784 = null;
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public final void method2015(int arg0) {
        this.field4798 = 12800;
        this.field4775 = 12800;
        if (arg0 != -24084) {
            return;
        }
        this.field4782 = 0;
        this.field4783 = 0;
        for (class292 var2 = (class292) this.field4795.method369((byte) -114); var2 != null; var2 = (class292) this.field4795.method362(false)) {
            if (var2.field4659 < this.field4798) {
                this.field4798 = var2.field4659;
            }
            if (var2.field4669 < this.field4775) {
                this.field4775 = var2.field4669;
            }
            if (var2.field4649 > this.field4782) {
                this.field4782 = var2.field4649;
            }
            if (this.field4783 < var2.field4662) {
                this.field4783 = var2.field4662;
            }
        }
        field4792++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[IIB)Z")
    public final boolean method2016(int arg0, int arg1, int[] arg2, int arg3, byte arg4) {
        field4779++;
        for (class292 var6 = (class292) this.field4795.method369((byte) -91); var6 != null; var6 = (class292) this.field4795.method362(false)) {
            if (var6.method1961(arg1, arg3, -128, arg0)) {
                var6.method1958(arg0, arg2, -123, arg3);
                return true;
            }
        }
        if (arg4 > -90) {
            field4784 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
    public final boolean method2017(int arg0, int arg1, int arg2) {
        field4790++;
        if (arg1 != 0) {
            this.method2015(78);
        }
        for (class292 var4 = (class292) this.field4795.method369((byte) -111); var4 != null; var4 = (class292) this.field4795.method362(false)) {
            if (var4.method1963((byte) 51, arg2, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
    public static final void method2018(int arg0, int arg1, int arg2) {
        field4787++;
        class39 var3 = class149.method935(-101, arg1, arg0);
        var3.method261(0);
        var3.field598 = arg2;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class301(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4796 = arg2;
        this.field4780 = arg3;
        this.field4776 = arg1;
        this.field4793 = arg5;
        this.field4785 = arg6;
        this.field4797 = arg4;
        if (this.field4785 == 255) {
            this.field4785 = 0;
        }
        this.field4778 = arg0;
        this.field4795 = new class58();
    }
}
