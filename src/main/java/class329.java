import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class329 {

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    private int field4823 = 0;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "[Lni;")
    public class26[] field4819;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Z")
    public static boolean field4812 = true;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "J")
    private long field4817;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lni;")
    private class26 field4813;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lni;")
    private class26 field4821;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I", line = 10)
    public final int method2274(int arg0) {
        if (arg0 != 0) {
            this.method2277(66);
        }
        field4809++;
        return this.field4820;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lni;IJ)V", line = 25)
    public final void method2275(class26 arg0, int arg1, long arg2) {
        if (arg1 < 82) {
            return;
        }
        if (arg0.field298 != null) {
            arg0.method179((byte) 51);
        }
        field4811++;
        class26 var5 = this.field4819[(int) (arg2 & (long) (this.field4820 - 1))];
        arg0.field304 = arg2;
        arg0.field301 = var5;
        arg0.field298 = var5.field298;
        arg0.field298.field301 = arg0;
        arg0.field301.field298 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I", line = 50)
    public final int method2276(int arg0) {
        field4816++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field4820; var3++) {
            class26 var4 = this.field4819[var3];
            for (class26 var5 = var4.field301; var5 != var4; var5 = var5.field301) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Lni;", line = 81)
    public final class26 method2277(int arg0) {
        if (arg0 != 13292) {
            this.method2282((byte) -40);
        }
        this.field4823 = 0;
        field4818++;
        return this.method2278((byte) -119);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Lni;", line = 95)
    public final class26 method2278(byte arg0) {
        field4806++;
        if (this.field4823 > 0 && this.field4819[this.field4823 - 1] != this.field4821) {
            class26 var2 = this.field4821;
            this.field4821 = var2.field301;
            return var2;
        } else if (arg0 > -57) {
            return (class26) null;
        } else {
            class26 var3;
            do {
                if (this.field4823 >= this.field4820) {
                    return null;
                }
                var3 = this.field4819[this.field4823++].field301;
            } while (this.field4819[this.field4823 - 1] == var3);
            this.field4821 = var3.field301;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)Lni;", line = 131)
    public final class26 method2279(long arg0, int arg1) {
        field4808++;
        int var4 = -64 % ((-arg1 - 76) / 41);
        this.field4817 = arg0;
        class26 var5 = this.field4819[(int) ((long) (this.field4820 - 1) & arg0)];
        for (this.field4813 = var5.field301; this.field4813 != var5; this.field4813 = this.field4813.field301) {
            if (this.field4813.field304 == arg0) {
                class26 var6 = this.field4813;
                this.field4813 = this.field4813.field301;
                return var6;
            }
        }
        this.field4813 = null;
        return null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Lni;)I", line = 164)
    public final int method2280(int arg0, class26[] arg1) {
        field4814++;
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field4820; var4++) {
            class26 var5 = this.field4819[var4];
            for (class26 var6 = var5.field301; var6 != var5; var6 = var6.field301) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V", line = 194)
    public class329(int arg0) {
        this.field4819 = new class26[arg0];
        this.field4820 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class26 var3 = this.field4819[var2] = new class26();
            var3.field298 = var3;
            var3.field301 = var3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Lni;", line = 217)
    public final class26 method2281(byte arg0) {
        field4815++;
        if (this.field4813 == null) {
            return null;
        }
        class26 var2 = this.field4819[(int) ((long) (this.field4820 - 1) & this.field4817)];
        while (this.field4813 != var2) {
            if (this.field4813.field304 == this.field4817) {
                class26 var3 = this.field4813;
                this.field4813 = this.field4813.field301;
                return var3;
            }
            this.field4813 = this.field4813.field301;
        }
        this.field4813 = null;
        if (arg0 <= 85) {
            this.method2274(53);
        }
        return null;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V", line = 249)
    public final void method2282(byte arg0) {
        field4810++;
        int var2 = 0;
        if (arg0 >= -91) {
            return;
        }
        while (var2 < this.field4820) {
            class26 var3 = this.field4819[var2];
            while (true) {
                class26 var4 = var3.field301;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method179((byte) 51);
            }
        }
        this.field4821 = null;
        this.field4813 = null;
    }
}
