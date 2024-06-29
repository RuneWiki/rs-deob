import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class131 {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    private int field1885 = -1;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    private int field1897 = 0;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lgj;")
    private class257 field1895 = new class257();

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Z")
    public boolean field1898 = false;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    private int field1887;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[Lfj;")
    private class266[] field1890;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "[[I")
    private int[][] field1893;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lhi;")
    public static class323 field1883 = null;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
    public static int[] field1894 = new int[2];

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "J")
    public static long field1896 = 0L;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lhi;")
    public static class323 field1888;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 5)
    public static void method898(int arg0) {
        field1888 = null;
        field1894 = null;
        field1883 = null;
        if (arg0 != 31105) {
            method898(63);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)[[I", line = 19)
    public final int[][] method899(int arg0) {
        field1884++;
        if (this.field1887 != this.field1886) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 < 49) {
            this.field1890 = (class266[]) null;
        }
        for (int var2 = 0; var2 < this.field1886; var2++) {
            this.field1890[var2] = class314.field4928;
        }
        return this.field1893;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(III)V", line = 199)
    public class131(int arg0, int arg1, int arg2) {
        this.field1887 = arg1;
        this.field1886 = arg0;
        this.field1890 = new class266[this.field1887];
        this.field1893 = new int[this.field1886][arg2];
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)Lcf;", line = 47)
    public static final class149 method900(int arg0) {
        field1891++;
        class149 var1;
        if (class272.field4317) {
            var1 = new class217(class122.field1683, class253.field4004, class110.field1518[0], class33.field392[0], class245.field3855[0], class259.field4093[0], class14.field145[0], class251.field3978);
        } else {
            var1 = new class270(class122.field1683, class253.field4004, class110.field1518[0], class33.field392[0], class245.field3855[0], class259.field4093[0], class14.field145[0], class251.field3978);
        }
        class99.method627(3735);
        if (arg0 != 2) {
            method898(102);
        }
        return var1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Z", line = 73)
    public static final boolean method901(int arg0, int arg1) {
        field1889++;
        if (arg1 > -80) {
            return true;
        } else {
            class92.field1209 = true;
            class227.field3429 = arg0 + 1 & 0xFFFF;
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V", line = 91)
    public final void method902(int arg0) {
        for (int var2 = arg0; var2 < this.field1886; var2++) {
            this.field1893[var2] = null;
        }
        this.field1893 = (int[][]) null;
        this.field1890 = null;
        this.field1895.method1811((byte) -30);
        field1882++;
        this.field1895 = null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I", line = 113)
    public final int[] method903(int arg0, int arg1) {
        if (arg1 >= -36) {
            this.field1895 = (class257) null;
        }
        field1892++;
        if (this.field1887 == this.field1886) {
            this.field1898 = this.field1890[arg0] == null;
            this.field1890[arg0] = class314.field4928;
            return this.field1893[arg0];
        } else if (this.field1886 == 1) {
            this.field1898 = this.field1885 != arg0;
            this.field1885 = arg0;
            return this.field1893[0];
        } else {
            class266 var3 = this.field1890[arg0];
            if (var3 == null) {
                this.field1898 = true;
                if (this.field1897 >= this.field1886) {
                    class266 var4 = (class266) this.field1895.method1816((byte) 119);
                    var3 = new class266(arg0, var4.field4191);
                    this.field1890[var4.field4194] = null;
                    var4.method1290(-25);
                } else {
                    var3 = new class266(arg0, this.field1897);
                    this.field1897++;
                }
                this.field1890[arg0] = var3;
            } else {
                this.field1898 = false;
            }
            this.field1895.method1810(0, var3);
            return this.field1893[var3.field4191];
        }
    }
}
