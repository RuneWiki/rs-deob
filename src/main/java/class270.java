import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class270 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lvh;")
    private class53 field4819 = new class53((byte[]) null);

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[B")
    private static byte[] field4827 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    private int field4826;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "J")
    private long field4825;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[I")
    private int[] field4820;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[I")
    private int[] field4821;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    public int[] field4822;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
    private int[] field4824;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()I", line = 3)
    public final int method1918() {
        return this.field4820.length;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([B)V", line = 6)
    public final void method1919(byte[] arg0) {
        this.field4819.field1168 = arg0;
        this.field4819.field1142 = 10;
        int var2 = this.field4819.method468(28214);
        this.field4823 = this.field4819.method468(28214);
        this.field4826 = 500000;
        this.field4824 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field4819.method453(1);
            int var5 = this.field4819.method453(1);
            if (var4 == 1297379947) {
                this.field4824[var3] = this.field4819.field1142;
                var3++;
            }
            this.field4819.field1142 += var5;
        }
        this.field4825 = 0L;
        this.field4820 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field4820[var6] = this.field4824[var6];
        }
        this.field4822 = new int[var2];
        this.field4821 = new int[var2];
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "()V", line = 59)
    public final void method1920() {
        this.field4819.field1168 = null;
        this.field4824 = null;
        this.field4820 = null;
        this.field4822 = null;
        this.field4821 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 71)
    public final void method1921(int arg0) {
        int var2 = this.field4819.method454(78);
        this.field4822[arg0] += var2;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "()I", line = 76)
    public final int method1922() {
        int var1 = this.field4820.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4820[var4] >= 0 && this.field4822[var4] < var3) {
                var2 = var4;
                var3 = this.field4822[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)J", line = 101)
    public final long method1923(int arg0) {
        return (long) this.field4826 * (long) arg0 + this.field4825;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V", line = 104)
    public final void method1924(int arg0) {
        this.field4819.field1142 = this.field4820[arg0];
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)I", line = 109)
    private final int method1925(int arg0) {
        byte var2 = this.field4819.field1168[this.field4819.field1142];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4821[arg0] = var3;
            this.field4819.field1142++;
        } else {
            var3 = this.field4821[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1927(arg0, var3);
        }
        int var4 = this.field4819.method454(123);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4819.field1168[this.field4819.field1142] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4819.field1142++;
                this.field4821[arg0] = var5;
                return this.method1927(arg0, var5);
            }
        }
        this.field4819.field1142 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)I", line = 151)
    public final int method1926(int arg0) {
        return this.method1925(arg0);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I", line = 159)
    private final int method1927(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4827[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4819.method483(-108) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4819.method483(-123) << 16;
            }
            return var8;
        }
        int var3 = this.field4819.method483(-101);
        int var4 = this.field4819.method454(80);
        if (var3 == 47) {
            this.field4819.field1142 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4819.method461((byte) 125);
            var4 -= 3;
            int var6 = this.field4822[arg0];
            this.field4825 += (long) (this.field4826 - var5) * (long) var6;
            this.field4826 = var5;
            this.field4819.field1142 += var4;
            return 2;
        } else {
            this.field4819.field1142 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(J)V", line = 201)
    public final void method1928(long arg0) {
        this.field4825 = arg0;
        int var3 = this.field4820.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4822[var4] = 0;
            this.field4821[var4] = 0;
            this.field4819.field1142 = this.field4824[var4];
            this.method1921(var4);
            this.field4820[var4] = this.field4819.field1142;
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "()V", line = 219)
    public final void method1929() {
        this.field4819.field1142 = -1;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "()Z", line = 226)
    public final boolean method1930() {
        int var1 = this.field4820.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4820[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "()Z", line = 240)
    public final boolean method1931() {
        return this.field4819.field1168 != null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 264)
    public class270() {
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([B)V", line = 266)
    public class270(byte[] arg0) {
        this.method1919(arg0);
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "()V", line = 249)
    public static void method1932() {
        field4827 = null;
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V", line = 254)
    public final void method1933(int arg0) {
        this.field4820[arg0] = this.field4819.field1142;
    }
}
