import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class311 extends class126 {

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    private int field5236 = -32768;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    private int field5252 = 0;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "Z")
    public boolean field5260 = false;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    private int field5256 = 0;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public int field5233;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public int field5249;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    private int field5248;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public int field5238;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public int field5247;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "Lrk;")
    private class205 field5254;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field5231 = 0;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Lok;")
    private static class41 field5235 = class137.method956(" more options", 45);

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Lok;")
    public static class41 field5245 = class137.method956("Lade Schrifts-=tze )2 ", 45);

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field5251 = 0;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "Lok;")
    public static class41 field5240 = field5235;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "Lok;")
    public static class41 field5250 = class137.method956("0", 45);

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Lok;")
    public static class41 field5242 = class137.method956("<col=ff0000>", 45);

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "Lok;")
    public static class41 field5261 = class137.method956(":trade:", 45);

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lcm;B)V", line = 4)
    public static final void method2151(class258 arg0, byte arg1) {
        field5237++;
        arg0.field4125 = false;
        if (arg0.field4122 != null) {
            arg0.field4122.field677 = 0;
        }
        if (arg1 > 58) {
            for (class258 var2 = arg0.method1070(); var2 != null; var2 = arg0.method1075()) {
                method2151(var2, (byte) 89);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILok;)V", line = 26)
    public static final void method2152(int arg0, class41 arg1) {
        class92.field1332 = arg1;
        field5244++;
        if (class138.field2065.field3390 == null) {
            return;
        }
        if (arg0 != 65482) {
            method2153(-73, -18);
        }
        try {
            class41 var2 = class156.field2469.method273(class138.field2065.field3390, -14711);
            class41 var3 = class27.field395.method273(class138.field2065.field3390, -14711);
            class41 var4 = class187.method1346(new class41[] { var2, class186.field3028, arg1, class35.field521, var3 }, 0);
            class41 var5;
            if (arg1.method275(false) == 0) {
                var5 = class187.method1346(new class41[] { var4, class119.field1753 }, 0);
            } else {
                var5 = class187.method1346(new class41[] { var4, class77.field1139, class294.method2037((byte) 85, class247.method1762(arg0 ^ 0xB514) + 94608000000L), class113.field1671, class136.method951(94608000L, (byte) -124) }, 0);
            }
            class187.method1346(new class41[] { class212.field3407, var5, class160.field2529 }, 0).method312(class138.field2065.field3390, (byte) -54);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)Lok;", line = 66)
    public static final class41 method2153(int arg0, int arg1) {
        int var2 = -57 / ((arg1 - 90) / 34);
        field5253++;
        return class187.method1346(new class41[] { class1.method4(arg0 >> 24 & 0xFF, (byte) 49), class66.field1005, class1.method4(arg0 >> 16 & 0xFF, (byte) 114), class66.field1005, class1.method4((arg0 & 0xFFCA) >> 8, (byte) 56), class66.field1005, class1.method4(arg0 & 0xFF, (byte) 87) }, 0);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)I", line = 83)
    public static final int method2154(int arg0, byte arg1) {
        field5243++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = 50 % ((22 - arg1) / 40);
        int var5 = (arg0 * var3 >> 12) + 40960;
        return var2 * var5 >> 12;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)I", line = 110)
    public static final int method2155(int arg0, int arg1) {
        if (arg1 > -80) {
            method2152(-102, (class41) null);
        }
        field5234++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)Ljc;", line = 124)
    private final class287 method2156(byte arg0) {
        field5232++;
        class222 var2 = class5.method15(this.field5248, false);
        class287 var3;
        if (this.field5260) {
            var3 = var2.method1589(-82, -1);
        } else {
            var3 = var2.method1589(-95, this.field5252);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 10) {
                method2154(53, (byte) -36);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(IIIIIII)V", line = 270)
    public class311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5233 = arg2;
        this.field5255 = arg1;
        this.field5249 = arg3;
        this.field5248 = arg0;
        this.field5238 = arg4;
        this.field5247 = arg5 + arg6;
        int var8 = class5.method15(this.field5248, false).field3545;
        if (var8 == -1) {
            this.field5260 = true;
        } else {
            this.field5260 = false;
            this.field5254 = class285.method2000(var8, 4442);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V", line = 165)
    public final void method2157(byte arg0, int arg1) {
        field5239++;
        if (this.field5260) {
            return;
        }
        if (arg0 != 93) {
            this.method125();
        }
        this.field5256 += arg1;
        while (this.field5254.field3331[this.field5252] < this.field5256) {
            this.field5256 -= this.field5254.field3331[this.field5252];
            this.field5252++;
            if (this.field5252 >= this.field5254.field3323.length) {
                this.field5260 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()I", line = 213)
    public final int method125() {
        field5241++;
        return this.field5236;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 231)
    public static void method2158(int arg0) {
        field5242 = null;
        field5235 = null;
        field5261 = null;
        field5245 = null;
        field5250 = null;
        if (arg0 == -32768) {
            field5240 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIJ)V", line = 249)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class287 var11 = this.method2156((byte) 126);
        field5246++;
        if (var11 != null) {
            var11.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field5236 = var11.method125();
        }
    }
}
