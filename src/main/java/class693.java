import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class693 extends class435 {

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public int field9831 = 0;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "Lgd;")
    public static class346 field9846 = new class346();

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field9848 = -2;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "Leq;")
    public static class335 field9849 = new class335();

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public int field9817;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public int field9820;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public int field9822;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public int field9824;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public int field9825;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public int field9827;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public int field9829;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public int field9830;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public int field9835;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public int field9837;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public int field9838;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public int field9841;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public int field9844;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "Lnf;")
    public class119 field9826;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "Lhw;")
    public class270 field9836;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "Lvo;")
    public static class345 field9819;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "Lee;")
    public class459 field9834;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "Lee;")
    public class459 field9842;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Llc;")
    public class652 field9818;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "Llc;")
    public class652 field9843;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "Ld;")
    public class88 field9845;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "Ltk;")
    public class95 field9823;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "Ltk;")
    public class95 field9840;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
    public boolean field9828;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Z")
    public boolean field9832;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "Z")
    public boolean field9847;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[I")
    public int[] field9821;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 4)
    public static void method3907(int arg0) {
        field9846 = null;
        field9819 = null;
        field9849 = null;
        if (arg0 != Integer.MIN_VALUE) {
            method3910(4);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 17)
    public final void method3908(int arg0) {
        field9839++;
        int var2 = this.field9822;
        boolean var3 = this.field9832;
        if (this.field9826 != null) {
            class119 var4 = this.field9826.method969(class230.field3404, 92);
            if (var4 == null) {
                this.field9844 = 0;
                this.field9825 = 0;
                this.field9847 = false;
                this.field9832 = false;
                this.field9829 = 0;
                this.field9822 = -1;
                this.field9824 = 0;
                this.field9821 = null;
                this.field9835 = 256;
                this.field9830 = 256;
            } else {
                this.field9835 = var4.field1929;
                this.field9830 = var4.field1880;
                this.field9847 = var4.field1970;
                this.field9844 = var4.field1943;
                this.field9832 = var4.field1916;
                this.field9829 = var4.field1966;
                this.field9822 = var4.field1931;
                this.field9821 = var4.field1945;
                this.field9825 = var4.field1935;
                this.field9824 = var4.field1902 << 9;
            }
        } else if (this.field9845 != null) {
            int var5 = class177.method1290(-14715, this.field9845);
            if (var2 != var5) {
                this.field9822 = var5;
                class528 var6 = this.field9845.field1309;
                if (var6.field7758 != null) {
                    var6 = var6.method3110(class230.field3404, false);
                }
                if (var6 == null) {
                    this.field9832 = this.field9845.field1309.field7739;
                    this.field9830 = 256;
                    this.field9835 = 256;
                    this.field9825 = this.field9824 = 0;
                } else {
                    this.field9824 = var6.field7749 << 9;
                    this.field9832 = var6.field7739;
                    this.field9830 = var6.field7792;
                    this.field9835 = var6.field7748;
                    this.field9825 = var6.field7765;
                }
            }
        } else if (this.field9836 != null) {
            this.field9822 = class3.method19(true, this.field9836);
            this.field9835 = 256;
            this.field9832 = this.field9836.field3858;
            this.field9830 = 256;
            this.field9825 = this.field9836.field3854;
            this.field9824 = this.field9836.field3868 << 9;
        }
        if (arg0 <= 37) {
            method3910(-79);
        }
        if (this.field9822 == var2 && var3 == this.field9832) {
            return;
        }
        if (this.field9843 == null) {
            return;
        }
        class387.field5675.method3092(this.field9843);
        this.field9834 = null;
        this.field9840 = null;
        this.field9843 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lwv;Ljava/lang/Object;B)V", line = 134)
    public static final void method3909(class705 arg0, Object arg1, byte arg2) {
        field9816++;
        if (arg0.field9970 == null) {
            return;
        }
        if (arg2 != -85) {
            field9846 = null;
        }
        for (int var3 = 0; var3 < 50 && arg0.field9970.peekEvent() != null; var3++) {
            class564.method3300((byte) 108, 1L);
        }
        try {
            if (arg1 != null) {
                arg0.field9970.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 165)
    public static final void method3910(int arg0) {
        field9833++;
        if (arg0 > -118) {
            method3910(75);
        }
        for (int var1 = 0; var1 < class222.field3314; var1++) {
            class105 var2 = class428.field6114[var1];
            if (var2.field1745 == 3) {
                if (var2.field1744 == null) {
                    var2.field1742 = Integer.MIN_VALUE;
                } else {
                    class387.field5675.method3092(var2.field1744);
                }
            }
        }
    }
}
