import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class351 extends class272 {

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lus;")
    public static class1 field5084 = new class1(99, 7);

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Ljava/lang/String;")
    public String field5079;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "[C")
    public char[] field5076;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "[C")
    public char[] field5082;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "[I")
    public int[] field5072;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "[I")
    public int[] field5080;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V")
    public static final void method2190(byte arg0) {
        class476.field6690 = 0;
        field5081++;
        class160.field2365.method2838((byte) 109);
        class160.field2365.method2845(class125.field1637, (byte) 37);
        class476.field6690++;
        if (arg0 != 26) {
            field5084 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLrp;I)V")
    private final void method2191(byte arg0, class276 arg1, int arg2) {
        if (arg2 == 1) {
            this.field5079 = arg1.method1750(-96);
        } else if (arg2 == 2) {
            int var4 = arg1.method1701(arg0 ^ 0xFFFFA5CB);
            this.field5076 = new char[var4];
            this.field5072 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5072[var5] = arg1.method1729(65280);
                byte var6 = arg1.method1715((byte) 87);
                this.field5076[var5] = var6 == 0 ? 0 : class313.method1930(0, var6);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method1701(-23121);
            this.field5080 = new int[var7];
            this.field5082 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5080[var8] = arg1.method1729(65280);
                byte var9 = arg1.method1715((byte) -72);
                this.field5082[var8] = var9 == 0 ? 0 : class313.method1930(0, var9);
            }
        }
        if (arg0 != 100) {
            this.method2196(-71);
        }
        field5073++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lrp;B)V")
    public final void method2192(class276 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                field5071++;
                int var4 = -78 / ((-arg1 - 28) / 46);
                return;
            }
            this.method2191((byte) 100, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IC)I")
    public final int method2193(int arg0, char arg1) {
        field5078++;
        if (this.field5080 == null) {
            return -1;
        }
        if (arg0 != 27449) {
            this.field5080 = null;
        }
        for (int var3 = 0; var3 < this.field5080.length; var3++) {
            if (this.field5082[var3] == arg1) {
                return this.field5080[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method2194(int arg0, Random arg1, int arg2) {
        field5075++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class449.method2617(arg2, 7652)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = 81 % ((arg0 + 71) / 34);
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var5;
            do {
                var5 = arg1.nextInt();
            } while (var4 <= var5);
            return class428.method2514(arg2, 121, var5);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lbj;B)V")
    public static final void method2195(class146 arg0, byte arg1) {
        field5074++;
        boolean var2 = false;
        if (class353.field5090 == arg0.field2148 || arg0.field2080 == -1 || arg0.field2094 != 0) {
            var2 = true;
        } else {
            class153 var3 = class64.field836.method2081(arg0.field2080, 0);
            if (var3.field2264 || (arg0.field2141 + 1) > var3.field2275[arg0.field2134]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field2148 - arg0.field2111;
            int var5 = class353.field5090 - arg0.field2111;
            int var6 = arg0.field2137 * 128 + (arg0.method918(false) * 64);
            int var7 = arg0.field2085 * 128 + arg0.method918(false) * 64;
            int var8 = arg0.field2131 * 128 + arg0.method918(false) * 64;
            int var9 = arg0.field2117 * 128 + arg0.method918(false) * 64;
            arg0.field4331 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field4317 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        if (arg1 != -24) {
            field5084 = null;
        }
        arg0.field2162 = 0;
        if (arg0.field2132 == 0) {
            arg0.method914(arg1 + 108, 8192);
        }
        if (arg0.field2132 == 1) {
            arg0.method914(arg1 + 93, 12288);
        }
        if (arg0.field2132 == 2) {
            arg0.method914(108, 0);
        }
        if (arg0.field2132 == 3) {
            arg0.method914(127, 4096);
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public final void method2196(int arg0) {
        if (arg0 <= 66) {
            this.method2191((byte) -71, (class276) null, 49);
        }
        if (this.field5080 != null) {
            for (int var2 = 0; var2 < this.field5080.length; var2++) {
                this.field5080[var2] = class248.method1549(this.field5080[var2], 32768);
            }
        }
        field5083++;
        if (this.field5072 != null) {
            for (int var3 = 0; var3 < this.field5072.length; var3++) {
                this.field5072[var3] = class248.method1549(this.field5072[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(B)V")
    public static void method2197(byte arg0) {
        if (arg0 == -70) {
            field5084 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IC)I")
    public final int method2198(int arg0, char arg1) {
        field5077++;
        if (this.field5072 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5072.length; var3++) {
            if (this.field5076[var3] == arg1) {
                return this.field5072[var3];
            }
        }
        return arg0 >= -59 ? 35 : -1;
    }
}
