import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class121 extends Canvas {

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field2047;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lmh;")
    public static class128 field2040 = class22.method156(122, "<)4col>");

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field2046 = 0;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Z")
    public static boolean field2039 = true;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "[I")
    public static int[] field2053 = new int[256];

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "F")
    public static float field2054;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Luc;")
    public static class180 field2041;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
    public static boolean field2042;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[I")
    public static int[] field2052;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "[[[B")
    public static byte[][][] field2048;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 6)
    public static final void method736(byte arg0) {
        class118.field1997 &= 0x7FF;
        if (arg0 != 75) {
            method740(false, -8);
        }
        int var1 = class253.field4367 >> 7;
        field2045++;
        if (class115.field1945 < 128) {
            class115.field1945 = 128;
        }
        if (class115.field1945 > 383) {
            class115.field1945 = 383;
        }
        int var2 = class164.field2822 >> 7;
        int var3 = class64.method427(class253.field4367, class164.field2822, class133.field2315, (byte) 127);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class133.field2315;
                    if (var7 < 3 && (class301.field5117[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class250.field4334[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class208.field3648 < var9) {
            class208.field3648 += (var9 - class208.field3648) / 24;
        } else if (class208.field3648 > var9) {
            class208.field3648 += (var9 - class208.field3648) / 80;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 91)
    public static void method737(byte arg0) {
        field2048 = (byte[][][]) null;
        field2041 = null;
        int var1 = 124 / ((-arg0 - 46) / 53);
        field2052 = null;
        field2040 = null;
        field2053 = null;
    }

    @OriginalMember(owner = "client!ad", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 110)
    public final void paint(Graphics arg0) {
        this.field2047.paint(arg0);
        field2049++;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 121)
    public class121(Component arg0) {
        this.field2047 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILdj;ILdj;I)Lue;", line = 130)
    public static final class14 method738(int arg0, class314 arg1, int arg2, class314 arg3, int arg4) {
        field2043++;
        if (class118.method708(arg2 ^ 0x45D3, arg4, arg1, arg0)) {
            if (arg2 != -17875) {
                field2039 = true;
            }
            return class96.method601(18, arg3.method2155(arg0, arg4, (byte) 70));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ldj;ILdj;)I", line = 145)
    public static final int method739(class314 arg0, int arg1, class314 arg2) {
        field2044++;
        int var3 = 0;
        if (arg0.method2157(103, class281.field4859)) {
            var3++;
        }
        if (arg0.method2157(72, class91.field1554)) {
            var3++;
        }
        if (arg1 <= 98) {
            return 9;
        }
        if (arg0.method2157(80, class256.field4399)) {
            var3++;
        }
        if (arg2.method2157(85, class281.field4859)) {
            var3++;
        }
        if (arg2.method2157(60, class91.field1554)) {
            var3++;
        }
        if (arg2.method2157(116, class256.field4399)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 182)
    public final void update(Graphics arg0) {
        this.field2047.update(arg0);
        field2050++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)Z", line = 197)
    public static final boolean method740(boolean arg0, int arg1) {
        field2055++;
        if (!arg0) {
            return true;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILmh;B)V", line = 226)
    public static final void method741(int arg0, class128 arg1, byte arg2) {
        if (arg2 >= -11) {
            field2042 = false;
        }
        class229 var3 = class241.method1638(2, 119, arg0);
        field2051++;
        var3.method1574(3199);
        var3.field3991 = arg1;
    }
}
