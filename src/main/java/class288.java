import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class288 extends class130 {

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "[I")
    public static int[] field4951 = new int[32];

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "[J")
    public static long[] field4949 = new long[32];

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "[I")
    public static int[] field4947 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ai", name = "kb", descriptor = "Ltl;")
    public static class59 field4955 = class85.method639("<col=ffffff>", 9588);

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!ai", name = "lb", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "Ljava/lang/String;")
    public static String field4954;

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "[[B")
    public static byte[][] field4953;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "[[[I")
    public static int[][][] field4942;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)[[I", line = 8)
    public final int[][] method87(int arg0, int arg1) {
        field4945++;
        int[][] var3 = this.field4786.method1427(arg0 + 7523, arg1);
        if (this.field4786.field3297 && this.method958((byte) -23)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg1 % this.field2144 * this.field2144;
            for (int var8 = 0; var8 < class56.field835; var8++) {
                int var9 = this.field2147[var7 + (var8 % this.field2148)];
                var6[var8] = class93.method680(4080, var9 << 4);
                var4[var8] = class93.method680(var9, 65280) >> 4;
                var5[var8] = class93.method680(var9 >> 12, 4080);
            }
        }
        if (arg0 != -7523) {
            field4955 = (class59) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZIILsf;)V", line = 52)
    public static final void method2001(int arg0, boolean arg1, int arg2, int arg3, class180 arg4) {
        field4952++;
        if (!arg1) {
            method2001(113, false, -121, 70, (class180) null);
        }
        for (class308 var5 = (class308) class27.field357.method536(2); var5 != null; var5 = (class308) class27.field357.method533(24)) {
            if (var5.field5237 == arg0 && (arg3 * 128) == var5.field5235 && arg2 * 128 == var5.field5210 && var5.field5240.field2981 == arg4.field2981) {
                if (var5.field5205 != null) {
                    class222.field3596.method369(var5.field5205);
                    var5.field5205 = null;
                }
                if (var5.field5225 != null) {
                    class222.field3596.method369(var5.field5225);
                    var5.field5225 = null;
                }
                var5.method2000(-119);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)V", line = 91)
    public static final void method2002(int arg0) {
        field4943++;
        if (~class184.field3090 == arg0) {
            if (class90.field1402 == class16.field204 && class84.field1315 == class248.field4135) {
                class184.field3090 = 0;
                class58.method448(24848, class231.field3803 - 1);
            }
        } else if (class90.field1402 == class231.field3794 && class84.field1315 == class149.field2444) {
            class184.field3090 = 0;
            class58.method448(24848, class231.field3803 - 1);
        } else {
            class184.field3090 = 2;
            class16.field204 = class231.field3794;
            class248.field4135 = class149.field2444;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ltl;IILtl;)V", line = 144)
    public static final void method2003(class59 arg0, int arg1, int arg2, class59 arg3) {
        int var4 = -104 / ((-arg2 - 63) / 54);
        field4946++;
        class200.method1439(arg3, arg0, -1, (class59) null, 46, arg1);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIII)V", line = 159)
    public static final void method2004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg3 + arg6;
        int var9 = arg2 - arg3;
        field4950++;
        for (int var10 = arg6; var10 < var8; var10++) {
            class174.method1283(7, arg0, class163.field2662[var10], arg1, arg7);
        }
        int var11 = arg1 + arg3;
        int var12 = 27 / ((12 - arg4) / 57);
        for (int var13 = arg2; var13 > var9; var13--) {
            class174.method1283(7, arg0, class163.field2662[var13], arg1, arg7);
        }
        int var14 = arg7 - arg3;
        for (int var15 = var8; var15 <= var9; var15++) {
            int[] var16 = class163.field2662[var15];
            class174.method1283(7, arg0, var16, arg1, var11);
            class174.method1283(7, arg5, var16, var11, var14);
            class174.method1283(7, arg0, var16, var14, arg7);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4951[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)V", line = 216)
    public static void method2005(boolean arg0) {
        if (!arg0) {
            field4949 = (long[]) null;
        }
        field4951 = null;
        field4949 = null;
        field4954 = null;
        field4942 = (int[][][]) null;
        field4955 = null;
        field4947 = null;
        field4953 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BII)V", line = 235)
    public static final void method2006(byte arg0, int arg1, int arg2) {
        field4948++;
        if (class231.field3803 < 2 && class11.field138 == 0 && !class219.field3556) {
            return;
        }
        if (arg0 <= 55) {
            field4942 = (int[][][]) ((int[][][]) null);
        }
        class59 var3;
        if (class11.field138 == 1 && class231.field3803 < 2) {
            var3 = class233.method1630(new class59[] { class146.field2385, class299.field5120, class211.field3464, class88.field1387 }, -2883);
        } else if (class219.field3556 && class231.field3803 < 2) {
            var3 = class233.method1630(new class59[] { class249.field4141, class299.field5120, class231.field3792, class88.field1387 }, -2883);
        } else {
            var3 = class224.method1546(class231.field3803 - 1, (byte) 115);
        }
        if (class231.field3803 > 2) {
            var3 = class233.method1630(new class59[] { var3, class255.field4228, class81.method619((byte) -82, class231.field3803 - 2), class311.field5285 }, -2883);
        }
        int var4 = class251.field4187.method710(var3, arg1 + 4, arg2 - -15, 16777215, 0, class260.field4334, field4944);
        class120.method895(class251.field4187.method705(var3) + var4, (byte) 1, arg2, 15, arg1 + 4);
    }
}
