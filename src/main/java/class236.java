import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class236 extends class240 {

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lcd;")
    public static class64 field3982 = class44.method335((byte) 71, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "Lcd;")
    private static class64 field3980 = class44.method335((byte) 71, "<col=ff3000>");

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "Lcd;")
    public static class64 field3983 = class44.method335((byte) 71, "name_icons");

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "Lcd;")
    public static class64 field3989 = class44.method335((byte) 71, "Benutzen");

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "Lrb;")
    public static class211 field3987;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "[I")
    public static int[] field3985;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(III)Lcd;", line = 9)
    public static final class64 method1687(int arg0, int arg1, int arg2) {
        if (arg1 != 30404) {
            field3987 = (class211) null;
        }
        int var3 = arg0 - arg2;
        field3986++;
        if (var3 < -9) {
            return class234.field3953;
        } else if (var3 < -6) {
            return field3980;
        } else if (var3 < -3) {
            return class275.field4719;
        } else if (var3 < 0) {
            return class315.field5338;
        } else if (var3 > 9) {
            return class117.field2142;
        } else if (var3 > 6) {
            return class97.field1767;
        } else if (var3 <= 3) {
            return var3 <= 0 ? class295.field5071 : class81.field1502;
        } else {
            return class36.field587;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[I", line = 71)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            return (int[]) null;
        }
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int[] var4 = this.method1745(arg1, 0, (byte) 109);
            int[] var5 = this.method1745(arg1, 1, (byte) 122);
            int[] var6 = this.method1745(arg1, 2, (byte) 112);
            for (int var7 = 0; var7 < class169.field2936; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        field3988++;
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 121)
    public class236() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[[I", line = 126)
    public final int[][] method286(byte arg0, int arg1) {
        if (arg0 < 34) {
            return (int[][]) ((int[][]) null);
        }
        field3992++;
        int[][] var3 = this.field4095.method1797(arg1, -57);
        if (this.field4095.field4355) {
            int[] var4 = this.method1745(arg1, 2, (byte) 104);
            int[][] var5 = this.method1746(30, arg1, 0);
            int[][] var6 = this.method1746(-125, arg1, 1);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var3[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var6[1];
            int[] var14 = var5[2];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class169.field2936; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var10[var16] = var9[var16];
                    var8[var16] = var11[var16];
                    var7[var16] = var14[var16];
                } else if (var17 == 0) {
                    var10[var16] = var12[var16];
                    var8[var16] = var13[var16];
                    var7[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var10[var16] = var9[var16] * var17 + (var12[var16] * var18) >> 12;
                    var8[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var7[var16] = var14[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILkh;)V", line = 207)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 == 2) {
            field3990++;
            if (arg1 == 0) {
                this.field4113 = arg2.method152((byte) -121) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)Lcd;", line = 220)
    public static final class64 method1688(int arg0, int arg1) {
        if (arg0 != 28471) {
            return (class64) null;
        }
        field3981++;
        if (arg1 >= 100000) {
            return arg1 >= 10000000 ? class104.method768(new class64[] { class198.field3379, class310.method2149(arg1 / 1000000, (byte) -32), class138.field2448, class163.field2874 }, false) : class104.method768(new class64[] { class72.field1390, class310.method2149(arg1 / 1000, (byte) 119), class6.field159, class163.field2874 }, false);
        } else {
            return class104.method768(new class64[] { class287.field4911, class310.method2149(arg1, (byte) -91), class163.field2874 }, false);
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)V", line = 248)
    public static void method1689(byte arg0) {
        field3985 = null;
        field3987 = null;
        field3982 = null;
        field3983 = null;
        field3989 = null;
        if (arg0 != -48) {
            method1687(-126, 127, 81);
        }
        field3980 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)I", line = 273)
    public static final int method1690(byte arg0, int arg1) {
        if (arg0 == 38) {
            field3993++;
            return (arg1 & 0x1C268D) >> 18;
        } else {
            return -116;
        }
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V", line = 291)
    public static final void method1691(int arg0) {
        int var1 = class244.field4247;
        field3991++;
        int var2 = class190.field3262;
        int var3 = class313.field5300;
        if (arg0 < 62) {
            method1689((byte) -35);
        }
        int var4 = class253.field4415;
        int var5 = 6116423;
        if (class123.field2216) {
            class21.method208(var1, var2, var3, var4, var5);
            class21.method208(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class21.method212(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        } else {
            class210.method1469(var1, var2, var3, var4, var5);
            class210.method1469(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class210.method1468(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        }
        class75.field1419.method1269(class28.field452, var1 + 3, var2 + 14, var5, -1);
        int var6 = class281.field4835;
        int var7 = class188.field3213;
        for (int var8 = 0; var8 < class220.field3736; var8++) {
            int var9 = (class220.field3736 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var6 < (var1 + var3) && var7 > var9 - 13 && (var9 + 3) > var7) {
                var10 = 16776960;
            }
            class75.field1419.method1269(class253.method1809(false, var8), var1 + 3, var9, var10, 0);
        }
        class56.method431((byte) 60, class244.field4247, class313.field5300, class190.field3262, class253.field4415);
    }
}
