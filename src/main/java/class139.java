import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class139 {

    @OriginalMember(owner = "client!faa", name = "s", descriptor = "I")
    private int field1981 = 0;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "I")
    public int field1978;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "[Lrp;")
    public class401[] field1964;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "Ljava/util/Random;")
    public static Random field1963 = new Random();

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
    public static int field1976 = -1;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field1970 = 2;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "F")
    public static float field1975;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "J")
    private long field1967;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "Lrp;")
    private class401 field1966;

    @OriginalMember(owner = "client!faa", name = "t", descriptor = "Lrp;")
    private class401 field1982;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
    public static void method967(int arg0) {
        field1963 = null;
        if (arg0 != 10094) {
            field1970 = -55;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(JLrp;I)V")
    public final void method968(long arg0, class401 arg1, int arg2) {
        field1977++;
        if (arg1.field5621 != null) {
            arg1.method2340(-77);
        }
        class401 var5 = this.field1964[(int) ((long) (this.field1978 + arg2) & arg0)];
        arg1.field5621 = var5.field5621;
        arg1.field5625 = var5;
        arg1.field5621.field5625 = arg1;
        arg1.field5623 = arg0;
        arg1.field5625.field5621 = arg1;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)I")
    public final int method969(byte arg0) {
        if (arg0 >= -103) {
            this.method974(66);
        }
        field1980++;
        return this.field1978;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(BJ)Lrp;")
    public final class401 method970(byte arg0, long arg1) {
        field1971++;
        this.field1967 = arg1;
        if (arg0 != 89) {
            return null;
        }
        class401 var4 = this.field1964[(int) ((long) (this.field1978 - 1) & arg1)];
        for (this.field1966 = var4.field5625; this.field1966 != var4; this.field1966 = this.field1966.field5625) {
            if (this.field1966.field5623 == arg1) {
                class401 var5 = this.field1966;
                this.field1966 = this.field1966.field5625;
                return var5;
            }
        }
        this.field1966 = null;
        return null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "([Lrp;I)I")
    public final int method971(class401[] arg0, int arg1) {
        if (arg1 != -30302) {
            this.field1982 = null;
        }
        field1972++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1978; var4++) {
            class401 var5 = this.field1964[var4];
            for (class401 var6 = var5.field5625; var6 != var5; var6 = var6.field5625) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)I")
    public final int method972(int arg0) {
        field1973++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field1978; var3++) {
            class401 var4 = this.field1964[var3];
            class401 var5 = var4.field5625;
            while (var4 != var5) {
                var5 = var5.field5625;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IB)V")
    public static final void method973(int arg0, byte arg1) {
        class165.method1154(32);
        field1965++;
        int var2 = 44 / ((66 - arg1) / 56);
        int var3 = class59.field667.method2904(27366, arg0).field6103;
        if (var3 == 0) {
            return;
        }
        int var4 = class578.field8156.field1671[arg0];
        if (var3 == 6) {
            class205.field2871 = var4;
        }
        if (var3 == 5) {
            class141.field2008 = var4;
        }
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)V")
    public final void method974(int arg0) {
        if (arg0 != -20470) {
            return;
        }
        for (int var2 = 0; var2 < this.field1978; var2++) {
            class401 var3 = this.field1964[var2];
            while (true) {
                class401 var4 = var3.field5625;
                if (var3 == var4) {
                    break;
                }
                var4.method2340(124);
            }
        }
        field1969++;
        this.field1966 = null;
        this.field1982 = null;
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)Lrp;")
    public final class401 method975(int arg0) {
        field1968++;
        if (~this.field1981 < arg0 && this.field1964[this.field1981 - 1] != this.field1982) {
            class401 var2 = this.field1982;
            this.field1982 = var2.field5625;
            return var2;
        }
        while (this.field1978 > this.field1981) {
            class401 var3 = this.field1964[this.field1981++].field5625;
            if (this.field1964[this.field1981 - 1] != var3) {
                this.field1982 = var3.field5625;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)Lrp;")
    public final class401 method976(byte arg0) {
        field1974++;
        if (this.field1966 == null) {
            return null;
        } else if (arg0 == -81) {
            class401 var2 = this.field1964[(int) (this.field1967 & (long) (this.field1978 - 1))];
            while (this.field1966 != var2) {
                if (this.field1966.field5623 == this.field1967) {
                    class401 var3 = this.field1966;
                    this.field1966 = this.field1966.field5625;
                    return var3;
                }
                this.field1966 = this.field1966.field5625;
            }
            this.field1966 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "(I)Lrp;")
    public final class401 method977(int arg0) {
        field1979++;
        this.field1981 = arg0;
        return this.method975(~arg0);
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(I)V")
    public class139(int arg0) {
        this.field1978 = arg0;
        this.field1964 = new class401[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class401 var3 = this.field1964[var2] = new class401();
            var3.field5621 = var3;
            var3.field5625 = var3;
        }
    }
}
