import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class130 {

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    private int field1836 = 0;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    private int field1837 = -1;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Laq;")
    private class90 field1834 = new class90();

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Z")
    public boolean field1845 = false;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    private int field1842;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    private int field1830;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "[[I")
    private int[][] field1835;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[Ltl;")
    private class369[] field1831;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lnq;")
    public static class268 field1829;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lnq;")
    public static class268 field1832;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lnq;")
    public static class268 field1833;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Z", line = 14)
    public static final boolean method889(int arg0, int arg1, int arg2, int arg3) {
        if (class280.method1830(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class181.method1184(var4 + 1, class375.field5354[arg0].method737(arg1, arg2) + arg3, var5 + 1) && class181.method1184(var4 + 128 - 1, class375.field5354[arg0].method737(arg1 + 1, arg2) + arg3, var5 + 1) && class181.method1184(var4 + 128 - 1, class375.field5354[arg0].method737(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class181.method1184(var4 + 1, class375.field5354[arg0].method737(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILnq;Lnq;Z)V", line = 27)
    public static final void method890(int arg0, int arg1, class268 arg2, class268 arg3, boolean arg4) {
        class150.field2128 = arg2;
        field1844++;
        class126.field1779 = arg3;
        class128.field1804 = arg4;
        class25.field459 = arg0;
        if (arg1 <= 125) {
            field1833 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 43)
    public static void method891(int arg0) {
        field1833 = null;
        if (arg0 != 1) {
            field1832 = null;
        }
        field1832 = null;
        field1829 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 56)
    public final void method892(int arg0) {
        field1838++;
        for (int var2 = 0; var2 < this.field1830; var2++) {
            this.field1835[var2] = null;
        }
        if (arg0 == -7814) {
            this.field1835 = null;
            this.field1831 = null;
            this.field1834.method644(false);
            this.field1834 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I", line = 77)
    public final int[] method893(int arg0, int arg1) {
        field1828++;
        if (arg1 != 1578) {
            this.method893(-108, -58);
        }
        if (this.field1842 == this.field1830) {
            this.field1845 = this.field1831[arg0] == null;
            this.field1831[arg0] = class160.field2239;
            return this.field1835[arg0];
        } else if (this.field1830 == 1) {
            this.field1845 = this.field1837 != arg0;
            this.field1837 = arg0;
            return this.field1835[0];
        } else {
            class369 var3 = this.field1831[arg0];
            if (var3 == null) {
                this.field1845 = true;
                if (this.field1836 >= this.field1830) {
                    class369 var4 = (class369) this.field1834.method634((byte) 40);
                    var3 = new class369(arg0, var4.field5195);
                    this.field1831[var4.field5197] = null;
                    var4.method2467((byte) -103);
                } else {
                    var3 = new class369(arg0, this.field1836);
                    this.field1836++;
                }
                this.field1831[arg0] = var3;
            } else {
                this.field1845 = false;
            }
            this.field1834.method639(var3, true);
            return this.field1835[var3.field5195];
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V", line = 145)
    public static final void method894(int arg0, byte arg1) {
        if (arg1 <= 17) {
            field1833 = null;
        }
        field1843++;
        class239 var2 = class436.method2740(4, arg0, -323285792);
        var2.method1628(14478);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V", line = 209)
    public class130(int arg0, int arg1, int arg2) {
        this.field1842 = arg1;
        this.field1830 = arg0;
        this.field1835 = new int[this.field1830][arg2];
        this.field1831 = new class369[this.field1842];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V", line = 164)
    public static final void method895(boolean arg0) {
        if (arg0) {
            class176.method1155();
            field1841++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)[[I", line = 179)
    public final int[][] method896(int arg0) {
        field1839++;
        if (this.field1842 != this.field1830) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -50 % ((-arg0 - 49) / 47);
        for (int var3 = 0; var3 < this.field1830; var3++) {
            this.field1831[var3] = class160.field2239;
        }
        return this.field1835;
    }
}
