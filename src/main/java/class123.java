import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class123 {

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    private int field1832 = 0;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    private int field1822 = -1;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lda;")
    private class212 field1828 = new class212();

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Z")
    public boolean field1836 = false;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    private int field1829;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[Lam;")
    private class317[] field1824;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    private int field1825;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "[[[I")
    private int[][][] field1827;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
    public static int[] field1818 = new int[500];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lok;")
    public static class41 field1820 = class137.method956("details", 45);

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field1826 = 0;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field1835 = -1;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)[[[I", line = 8)
    public final int[][][] method870(byte arg0) {
        field1819++;
        if (this.field1829 != this.field1825) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1825; var2++) {
            this.field1824[var2] = class134.field2000;
        }
        if (arg0 != -105) {
            method875(-23, (class112) null, (class41) null);
        }
        return this.field1827;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)Z", line = 33)
    public static final boolean method871(int arg0, boolean arg1) {
        if (!arg1) {
            field1834 = -79;
        }
        field1831++;
        return (arg0 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 56)
    public static void method872(int arg0) {
        field1820 = null;
        field1818 = null;
        if (arg0 != -32723) {
            method875(-98, (class112) null, (class41) null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 80)
    public final void method873(int arg0) {
        int var2 = 0;
        if (arg0 > -75) {
            this.field1832 = 38;
        }
        while (var2 < this.field1825) {
            this.field1827[var2][0] = null;
            this.field1827[var2][1] = null;
            this.field1827[var2][2] = null;
            this.field1827[var2] = (int[][]) null;
            var2++;
        }
        this.field1824 = null;
        field1823++;
        this.field1827 = (int[][][]) null;
        this.field1828.method1499(-3868);
        this.field1828 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lth;III)V", line = 107)
    public static final void method874(class126 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class272.field4434) {
            class308 var4 = class205.field3312[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5207 != null && var4.field5207.field1499.method889()) {
                arg0.method885(var4.field5207.field1499, 128, 0, 0, true);
            }
        }
        if (arg3 < class272.field4434) {
            class308 var5 = class205.field3312[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5207 != null && var5.field5207.field1499.method889()) {
                arg0.method885(var5.field5207.field1499, 0, 0, 128, true);
            }
        }
        if (arg2 < class272.field4434 && arg3 < class65.field996) {
            class308 var6 = class205.field3312[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5207 != null && var6.field5207.field1499.method889()) {
                arg0.method885(var6.field5207.field1499, 128, 0, 128, true);
            }
        }
        if (arg2 < class272.field4434 && arg3 > 0) {
            class308 var7 = class205.field3312[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5207 != null && var7.field5207.field1499.method889()) {
                arg0.method885(var7.field5207.field1499, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILlb;Lok;)I", line = 156)
    public static final int method875(int arg0, class112 arg1, class41 arg2) {
        field1821++;
        int var3 = arg1.field1640;
        arg1.method766(arg2.field617, 32768);
        arg1.field1640 += class186.field3041.method326(arg2.field617, arg1.field1607, 123, arg0, arg2.field660, arg1.field1640);
        return arg1.field1640 - var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)[[I", line = 171)
    public final int[][] method876(boolean arg0, int arg1) {
        if (!arg0) {
            this.method873(-35);
        }
        field1830++;
        if (this.field1829 == this.field1825) {
            this.field1836 = this.field1824[arg1] == null;
            this.field1824[arg1] = class134.field2000;
            return this.field1827[arg1];
        } else if (this.field1825 == 1) {
            this.field1836 = this.field1822 != arg1;
            this.field1822 = arg1;
            return this.field1827[0];
        } else {
            class317 var3 = this.field1824[arg1];
            if (var3 == null) {
                this.field1836 = true;
                if (this.field1825 > this.field1832) {
                    var3 = new class317(arg1, this.field1832);
                    this.field1832++;
                } else {
                    class317 var4 = (class317) this.field1828.method1504((byte) 111);
                    var3 = new class317(arg1, var4.field5360);
                    this.field1824[var4.field5357] = null;
                    var4.method418(6971);
                }
                this.field1824[arg1] = var3;
            } else {
                this.field1836 = false;
            }
            this.field1828.method1498(var3, (byte) 127);
            return this.field1827[var3.field5360];
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(III)V", line = 258)
    public class123(int arg0, int arg1, int arg2) {
        this.field1829 = arg1;
        this.field1824 = new class317[this.field1829];
        this.field1825 = arg0;
        this.field1827 = new int[this.field1825][3][arg2];
    }
}
