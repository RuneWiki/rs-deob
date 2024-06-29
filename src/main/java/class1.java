import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public int field5 = 2;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public int field14 = -1;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "Z")
    public boolean field27 = false;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public int field17 = -1;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public int field26 = -1;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public int field23 = -1;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public int field15 = 99;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "Z")
    private boolean field29 = false;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    public int field34 = 5;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public int field36 = -1;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Z")
    public static boolean field12 = true;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lmh;")
    public static class128 field1 = class22.method156(123, ":assistreq:");

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[J")
    public static long[] field22 = new long[500];

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "[[B")
    public static byte[][] field33 = new byte[250][];

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "Lmh;")
    private static class128 field30 = class22.method156(127, " more options");

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lmh;")
    public static class128 field11 = class22.method156(127, "welle2:");

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "Lmh;")
    public static class128 field25 = field30;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[I")
    private int[] field19;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "[I")
    private int[] field32;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
    public int[] field7;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[I")
    public int[] field8;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "[[I")
    public int[][] field9;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method1(int arg0, int arg1, int arg2, int arg3) {
        class150 var4 = class182.field3184[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class161 var5 = var4.field2565;
        if (var5 != null) {
            var5.field2746 = var5.field2746 * arg3 / 16;
            var5.field2758 = var5.field2758 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 30)
    public static final void method2(int arg0) {
        if (arg0 != 21685) {
            method4(-114);
        }
        int[] var1 = new int[class212.field3752];
        field20++;
        int var2 = 0;
        for (int var3 = 0; var3 < class212.field3752; var3++) {
            class200 var4 = class180.method1226(false, var3);
            if (var4.field3507 >= 0 || var4.field3504 >= 0) {
                var1[var2++] = var3;
            }
        }
        class315.field5345 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class315.field5345[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLja;I)Lja;", line = 72)
    public final class60 method3(byte arg0, class60 arg1, int arg2) {
        field24++;
        int var4 = this.field8[arg2];
        class178 var5 = class38.method257(19, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method216(true, true);
        }
        class178 var7 = null;
        int var8 = 0;
        if (this.field19 != null && this.field19.length > arg2) {
            int var9 = this.field19[arg2];
            var7 = class38.method257(19, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class60 var11 = arg1.method216(!var5.method1219(var6, 255), !this.field29);
            var11.method198(var5, var6, this.field29);
            return var11;
        } else if (arg0 <= 36) {
            return (class60) null;
        } else {
            class60 var10 = arg1.method216(!var5.method1219(var6, 255) & !var7.method1219(var8, 255), !this.field29);
            var10.method198(var5, var6, this.field29);
            var10.method198(var7, var8, this.field29);
            return var10;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 118)
    public static void method4(int arg0) {
        field11 = null;
        field30 = null;
        if (arg0 == 8508) {
            field22 = null;
            field1 = null;
            field25 = null;
            field33 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 146)
    public final void method5(byte arg0) {
        if (this.field23 == -1) {
            if (this.field32 == null) {
                this.field23 = 0;
            } else {
                this.field23 = 2;
            }
        }
        field16++;
        int var2 = 16 / ((-arg0 - 8) / 40);
        if (this.field36 != -1) {
            return;
        }
        if (this.field32 == null) {
            this.field36 = 0;
        } else {
            this.field36 = 2;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILbg;)V", line = 184)
    private final void method6(int arg0, int arg1, class194 arg2) {
        field35++;
        if (arg0 == 1) {
            int var13 = arg2.method1308(-42);
            this.field7 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field7[var14] = arg2.method1308(-67);
            }
            this.field8 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field8[var15] = arg2.method1308(-48);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field8[var16] += arg2.method1308(-58) << 16;
            }
        } else if (arg0 == 2) {
            this.field26 = arg2.method1308(-49);
        } else if (arg0 == 3) {
            int var11 = arg2.method1325(7627);
            this.field32 = new int[var11 + 1];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field32[var12] = arg2.method1325(7627);
            }
            this.field32[var11] = 9999999;
        } else if (arg0 == 4) {
            this.field27 = true;
        } else if (arg0 == 5) {
            this.field34 = arg2.method1325(7627);
        } else if (arg0 == 6) {
            this.field14 = arg2.method1308(-89);
        } else if (arg0 == 7) {
            this.field17 = arg2.method1308(-37);
        } else if (arg0 == 8) {
            this.field15 = arg2.method1325(7627);
        } else if (arg0 == 9) {
            this.field23 = arg2.method1325(7627);
        } else if (arg0 == 10) {
            this.field36 = arg2.method1325(7627);
        } else if (arg0 == 11) {
            this.field5 = arg2.method1325(7627);
        } else if (arg0 == 12) {
            int var8 = arg2.method1325(7627);
            this.field19 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field19[var9] = arg2.method1308(-126);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field19[var10] = (arg2.method1308(-119) << 16) + this.field19[var10];
            }
        } else if (arg0 == 13) {
            int var4 = arg2.method1308(-17);
            this.field9 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1325(7627);
                if (var6 > 0) {
                    this.field9[var5] = new int[var6];
                    this.field9[var5][0] = arg2.method1349((byte) 91);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field9[var5][var7] = arg2.method1308(-50);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field29 = true;
        }
        if (arg1 < 113) {
            this.method8(-43, 10, true, (class60) null, (class1) null);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V", line = 340)
    public static final void method7(int arg0, int arg1, int arg2) {
        field2++;
        class275 var3 = class84.method538(arg1, arg2 + 8);
        int var4 = var3.field4766;
        int var5 = var3.field4761;
        int var6 = var3.field4758;
        if (arg2 != -7) {
            method2(-64);
        }
        int var7 = class182.field3185[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class289.method1994(var4, class34.field732[var4] & ~var8 | var8 & arg0 << var5, (byte) 70);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZLja;Laj;)Lja;", line = 401)
    public final class60 method8(int arg0, int arg1, boolean arg2, class60 arg3, class1 arg4) {
        int var6 = this.field8[arg0];
        class178 var7 = class38.method257(19, var6 >> 16);
        field13++;
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method9(arg3, 110, arg1);
        }
        int var9 = arg4.field8[arg1];
        class178 var10 = class38.method257(19, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class60 var12 = arg3.method216(!var7.method1219(var8, 255), !this.field29);
            var12.method198(var7, var8, this.field29);
            return var12;
        }
        class60 var13 = arg3.method216(!var7.method1219(var8, 255) & !var10.method1219(var11, 255), !arg4.field29 & !this.field29);
        if (!arg2) {
            this.method8(-31, -86, false, (class60) null, (class1) null);
        }
        var13.method194(var7, var8, var10, var11, this.field32, arg4.field29 | this.field29);
        return var13;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lja;II)Lja;", line = 437)
    public final class60 method9(class60 arg0, int arg1, int arg2) {
        int var4 = this.field8[arg2];
        class178 var5 = class38.method257(19, var4 >> 16);
        if (arg1 <= 108) {
            this.method10((class194) null, 37);
        }
        field31++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method216(true, true);
        } else {
            class60 var7 = arg0.method216(!var5.method1219(var6, 255), !this.field29);
            var7.method198(var5, var6, this.field29);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lbg;I)V", line = 461)
    public final void method10(class194 arg0, int arg1) {
        field10++;
        if (arg1 != -12946) {
            this.method10((class194) null, 71);
        }
        while (true) {
            int var3 = arg0.method1325(7627);
            if (var3 == 0) {
                return;
            }
            this.method6(var3, arg1 + 13066, arg0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILja;)Lja;", line = 494)
    public final class60 method11(int arg0, int arg1, class60 arg2) {
        field18++;
        if (arg0 > -28) {
            field11 = (class128) null;
        }
        int var4 = this.field8[arg1];
        class178 var5 = class38.method257(19, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method212(true, true);
        } else {
            class60 var7 = arg2.method212(!var5.method1219(var6, 255), !this.field29);
            var7.method198(var5, var6, this.field29);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIBLja;)Lja;", line = 522)
    public final class60 method12(int arg0, int arg1, byte arg2, class60 arg3) {
        field4++;
        if (arg2 < 66) {
            return (class60) null;
        }
        int var5 = this.field8[arg1];
        class178 var6 = class38.method257(19, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method216(true, true);
        }
        class60 var8 = arg3.method216(!var6.method1219(var7, 255), !this.field29);
        int var9 = arg0 & 0x3;
        if (var9 == 1) {
            var8.method192();
        } else if (var9 == 2) {
            var8.method189();
        } else if (var9 == 3) {
            var8.method197();
        }
        var8.method198(var6, var7, this.field29);
        if (var9 == 1) {
            var8.method197();
        } else if (var9 == 2) {
            var8.method189();
        } else if (var9 == 3) {
            var8.method192();
        }
        return var8;
    }
}
