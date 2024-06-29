import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class326 extends class287 {

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "[Lnk;")
    public class326[] field5106;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "Z")
    public boolean field5121;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "Ljava/lang/String;")
    public static String field5119 = "Started 3d Library";

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    public static int field5120 = 0;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
    public static int field5123 = 3;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public int field5116;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "Lqj;")
    public class225 field5112;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "Lug;")
    public static class253 field5115;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Lqc;")
    public class342 field5104;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZLvl;)V", line = 6)
    public void method98(int arg0, boolean arg1, class6 arg2) {
        field5109++;
        if (arg1) {
            field5115 = (class253) null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)I", line = 24)
    public int method825(byte arg0) {
        field5126++;
        return arg0 <= 56 ? 35 : -1;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)I", line = 40)
    public int method351(int arg0) {
        field5113++;
        return arg0 == -32489 ? -1 : 84;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)[[I", line = 58)
    public int[][] method253(int arg0, byte arg1) {
        int var3 = 21 / ((60 - arg1) / 51);
        field5114++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)[I", line = 70)
    public final int[] method2287(int arg0, int arg1, int arg2) {
        field5124++;
        if (arg2 != -3896) {
            this.field5106 = (class326[]) null;
        }
        return this.field5106[arg0].field5121 ? this.field5106[arg0].method103(-38, arg1) : this.field5106[arg0].method253(arg1, (byte) 115)[0];
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BZ)V", line = 93)
    public static final void method2288(byte arg0, boolean arg1) {
        if (arg0 != 14) {
            method2292((byte) 117);
        }
        field5105++;
        if (class134.field1971 != arg1) {
            class134.field1971 = arg1;
            class206.method1521(-80);
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V", line = 114)
    public void method350(byte arg0) {
        if (arg0 != -64) {
            return;
        }
        if (this.field5121) {
            this.field5112.method1656(-11962);
            this.field5112 = null;
        } else {
            this.field5104.method2364(86);
            this.field5104 = null;
        }
        field5118++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIZI)V", line = 140)
    public static final void method2289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field5107++;
        if (arg1 < 128 || arg5 < 128 || arg1 > 13056 || arg5 > 13056) {
            class113.field1585 = -1;
            class315.field4923 = -1;
            return;
        }
        int var8 = class320.method2245((byte) -86, arg5, class154.field2392, arg1) - arg0;
        int var9 = arg5 - class317.field5018;
        int var10 = class31.field467[class185.field2999];
        int var11 = class31.field451[class293.field4536];
        int var12 = class31.field451[class185.field2999];
        int var13 = var8 - class43.field588;
        int var14 = class31.field467[class293.field4536];
        int var15 = arg1 - class295.field4572;
        if (!arg6) {
            field5108 = 104;
        }
        int var16 = var9 * var10 + var12 * var15 >> 16;
        int var17 = var9 * var12 - (var10 * var15) >> 16;
        int var19 = var11 * var13 - var14 * var17 >> 16;
        int var20 = var11 * var17 + var13 * var14 >> 16;
        if (var20 < 50) {
            class315.field4923 = -1;
            class113.field1585 = -1;
        } else if (class109.field1458) {
            int var22 = arg2 * 512 >> 8;
            int var23 = arg7 * 512 >> 8;
            class113.field1585 = arg3 + (var19 * var23 / var20);
            class315.field4923 = var16 * var22 / var20 + arg4;
        } else {
            class113.field1585 = (var19 << 9) / var20 + arg3;
            class315.field4923 = arg4 + ((var16 << 9) / var20);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lv;)V", line = 205)
    public static final void method2290(class263 arg0) {
        for (int var1 = arg0.field4124; var1 <= arg0.field4115; var1++) {
            for (int var2 = arg0.field4127; var2 <= arg0.field4126; var2++) {
                class124 var3 = class83.field1138[arg0.field4132][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1798; var4++) {
                        if (var3.field1783[var4] == arg0) {
                            var3.field1798--;
                            for (int var5 = var4; var5 < var3.field1798; var5++) {
                                var3.field1783[var5] = var3.field1783[var5 + 1];
                                var3.field1784[var5] = var3.field1784[var5 + 1];
                            }
                            var3.field1783[var3.field1798] = null;
                            break;
                        }
                    }
                    var3.field1791 = 0;
                    for (int var6 = 0; var6 < var3.field1798; var6++) {
                        var3.field1791 |= var3.field1784[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[I", line = 262)
    public int[] method103(int arg0, int arg1) {
        field5122++;
        if (arg0 >= -25) {
            this.method350((byte) -20);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)V", line = 273)
    public static final void method2291(boolean arg0, int arg1) {
        class231.field3609 = (byte[][][]) null;
        class56.field776 = (byte[][][]) null;
        class232.field3629 = (int[][][]) null;
        class265.field4147 = (int[][][]) null;
        class343.field5332 = null;
        class193.field3075 = (byte[][][]) null;
        field5117++;
        if (arg0 && class136.field2174 != null) {
            class216.field3402 = class136.field2174.field4559;
        } else {
            class216.field3402 = -1;
        }
        class68.field962 = (byte[][][]) null;
        class261.field4101 = null;
        class212.field3348 = (int[][][]) null;
        class174.field2860 = (byte[][][]) null;
        class2.field22 = 0;
        class136.field2174 = null;
        class204.field3237.method27((byte) 74);
        class198.field3167 = -1;
        class275.field4241 = -1;
        class132.field1945 = null;
        class79.field1085 = null;
        class22.field338 = null;
        class259.field4077 = null;
        class257.field4058 = null;
        class303.field4680 = null;
        class344.field5348 = null;
        class295.field4577 = null;
        if (arg1 > 79) {
            class153.field2367 = null;
            class39.field560 = null;
            class278.field4290 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IZ)V", line = 314)
    public class326(int arg0, boolean arg1) {
        this.field5106 = new class326[arg0];
        this.field5121 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V", line = 329)
    public static void method2292(byte arg0) {
        field5119 = null;
        field5115 = null;
        if (arg0 != -45) {
            method2290((class263) null);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)[[I", line = 353)
    public final int[][] method2293(int arg0, int arg1, int arg2) {
        field5110++;
        if (arg0 != -15033) {
            this.method103(-63, 70);
        }
        if (this.field5106[arg2].field5121) {
            int[] var4 = this.field5106[arg2].method103(-55, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5106[arg2].method253(arg1, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)V", line = 393)
    public final void method2294(int arg0, byte arg1, int arg2) {
        field5111++;
        if (arg1 <= 80) {
            return;
        }
        int var4 = this.field5116 == 255 ? arg0 : this.field5116;
        if (this.field5121) {
            this.field5112 = new class225(var4, arg0, arg2);
        } else {
            this.field5104 = new class342(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(B)V", line = 419)
    public void method99(byte arg0) {
        if (arg0 != 31) {
            field5115 = (class253) null;
        }
        field5125++;
    }
}
