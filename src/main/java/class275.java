import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class275 implements class219 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Z")
    private boolean field4703 = false;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    private int field4741 = 50;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "Lek;")
    private class185 field4738;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "Lek;")
    private class185 field4742;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "Lpc;")
    private class91 field4743;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Lpc;")
    private class91 field4725;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "[B")
    private byte[] field4733;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[B")
    private byte[] field4704;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[Z")
    private boolean[] field4700;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[B")
    private byte[] field4702;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[Z")
    private boolean[] field4707;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[B")
    private byte[] field4709;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "[S")
    private short[] field4727;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "[Z")
    private boolean[] field4726;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "[Z")
    private boolean[] field4732;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "[Z")
    private boolean[] field4722;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "[I")
    public static int[] field4713 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public static int field4730 = 0;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[I")
    public static int[] field4706 = new int[5];

    @OriginalMember(owner = "client!s", name = "K", descriptor = "Ljf;")
    public static class229 field4736 = class212.method1457((byte) 93, "hitbar_default");

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1925(int arg0) {
        if (arg0 != 3524) {
            method1936((byte) 96);
        }
        field4714++;
        for (class215 var1 = (class215) class48.field870.method2078(-102); var1 != null; var1 = (class215) class48.field870.method2080(5)) {
            class22 var2 = var1.field3692;
            if (class16.field254 != var2.field397 || var2.field375 < class199.field3475) {
                var1.method1747((byte) -108);
            } else if (class199.field3475 >= var2.field409) {
                if (var2.field371 > 0) {
                    class331 var3 = class331.field5637[var2.field371 - 1];
                    if (var3 != null && var3.field1983 >= 0 && var3.field1983 < 13312 && var3.field2028 >= 0 && var3.field2028 < 13312) {
                        var2.method212(class282.method1984((byte) -126, var3.field2028, var3.field1983, var2.field397) - var2.field398, var3.field2028, (byte) -108, var3.field1983, class199.field3475);
                    }
                }
                if (var2.field371 < 0) {
                    int var4 = -var2.field371 - 1;
                    class33 var5;
                    if (class112.field1963 == var4) {
                        var5 = class301.field5124;
                    } else {
                        var5 = class192.field3334[var4];
                    }
                    if (var5 != null && var5.field1983 >= 0 && var5.field1983 < 13312 && var5.field2028 >= 0 && var5.field2028 < 13312) {
                        var2.method212(class282.method1984((byte) -119, var5.field2028, var5.field1983, var2.field397) - var2.field398, var5.field2028, (byte) -108, var5.field1983, class199.field3475);
                    }
                }
                var2.method214(class146.field2540, 1);
                class106.method719(class16.field254, (int) var2.field400, (int) var2.field370, (int) var2.field406, 60, var2, var2.field381, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lek;Lek;Lek;IZ)V", line = 647)
    public class275(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.field4738 = arg0;
        this.field4742 = arg2;
        this.field4703 = arg4;
        this.field4741 = arg3;
        this.field4743 = new class91(this.field4741);
        if (class108.field1900) {
            this.field4725 = new class91(this.field4741);
        } else {
            this.field4725 = null;
        }
        class14 var6 = new class14(arg1.method1275(0, 0, -5211));
        int var7 = var6.method116(-1);
        this.field4733 = new byte[var7];
        this.field4704 = new byte[var7];
        this.field4700 = new boolean[var7];
        this.field4702 = new byte[var7];
        this.field4707 = new boolean[var7];
        this.field4709 = new byte[var7];
        this.field4727 = new short[var7];
        this.field4726 = new boolean[var7];
        this.field4732 = new boolean[var7];
        this.field4722 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field4700[var8] = var6.method93(false) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field4700[var9]) {
                this.field4726[var9] = var6.method93(false) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field4700[var10]) {
                this.field4707[var10] = var6.method93(false) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field4700[var11]) {
                this.field4732[var11] = var6.method93(false) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field4700[var12]) {
                this.field4722[var12] = var6.method93(false) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field4700[var13]) {
                this.field4709[var13] = var6.method98(true);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field4700[var14]) {
                this.field4704[var14] = var6.method98(true);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field4700[var15]) {
                this.field4733[var15] = var6.method98(true);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field4700[var16]) {
                this.field4702[var16] = var6.method98(true);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field4700[var17]) {
                this.field4727[var17] = (short) var6.method116(-1);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V", line = 72)
    public final void method1926(int arg0, boolean arg1) {
        this.field4703 = arg1;
        if (arg0 != 24962) {
            this.method1510(-58, 33);
        }
        this.method1927(74);
        field4716++;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 86)
    public final void method1927(int arg0) {
        this.field4743.method644(1);
        field4728++;
        if (this.field4725 != null) {
            this.field4725.method644(1);
        }
        if (arg0 <= 29) {
            this.field4733 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V", line = 106)
    public final void method1504(int arg0, int arg1) {
        boolean var3 = false;
        field4723++;
        class257.method1832((byte) 20, this.field4733[arg0] & arg1, this.field4702[arg0] & 0xFF);
        class63 var4 = this.method1934(2047, arg0);
        if (var4 != null) {
            var3 = var4.method470(3, this.field4703 || this.field4732[arg0], this.field4742, this);
        }
        if (!var3) {
            class25 var5 = this.method1929((byte) -21, arg0);
            var5.method233(false);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)[I", line = 132)
    public final int[] method1512(int arg0, byte arg1) {
        field4737++;
        if (arg1 != -111) {
            method1935((class165) null, -36, -53, -36, -95, 7);
        }
        class63 var3 = this.method1934(2047, arg0);
        return var3 == null ? null : var3.method469(this.field4742, this.field4703 || this.field4732[arg0], this, true);
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(II)I", line = 151)
    public final int method1514(int arg0, int arg1) {
        field4708++;
        if (arg0 >= -54) {
            this.field4725 = (class91) null;
        }
        return this.field4709[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(II)V", line = 171)
    public final void method1928(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method1933(-115, -32);
        }
        for (class63 var3 = (class63) this.field4743.method641((byte) -107); var3 != null; var3 = (class63) this.field4743.method646(1)) {
            if (var3.field1071) {
                var3.method472(arg1, arg0 ^ 0xFFFFEFFF);
                var3.field1071 = false;
            }
        }
        field4724++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)I", line = 200)
    public final int method1507(boolean arg0, int arg1) {
        field4744++;
        if (arg0) {
            this.method1512(3, (byte) 14);
        }
        return this.field4733[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(BI)Lln;", line = 217)
    private final class25 method1929(byte arg0, int arg1) {
        field4715++;
        class25 var3 = (class25) this.field4725.method643((long) arg1, 1649232044);
        if (var3 != null) {
            return var3;
        }
        class25 var4 = new class25(this.field4727[arg1] & 0xFFFF);
        this.field4725.method640(var4, (long) arg1, 24179);
        if (arg0 != -21) {
            this.method1934(-34, 44);
        }
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Z", line = 240)
    public final boolean method1506(int arg0, int arg1) {
        field4701++;
        return arg1 <= 47 ? false : this.field4707[arg0];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Z", line = 254)
    public final boolean method1508(byte arg0, int arg1) {
        field4719++;
        if (arg0 <= 68) {
            return true;
        } else {
            return this.field4703 || this.field4732[arg1];
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)I", line = 270)
    public final int method1510(int arg0, int arg1) {
        field4720++;
        if (arg0 != 255) {
            method1925(41);
        }
        return this.field4704[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(BI)I", line = 289)
    public final int method1509(byte arg0, int arg1) {
        if (arg0 <= 122) {
            field4706 = (int[]) null;
        }
        field4705++;
        return this.field4727[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 300)
    public static final void method1930(byte arg0) {
        field4739++;
        class26.field469.method226((byte) -118);
        if (arg0 != 57) {
            method1931((class229) null, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IB)I", line = 325)
    public final int method1515(int arg0, byte arg1) {
        field4721++;
        if (arg1 > 0) {
            this.field4732 = (boolean[]) null;
        }
        return this.field4702[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(II)Z", line = 336)
    public final boolean method1513(int arg0, int arg1) {
        if (arg1 != 14393) {
            method1931((class229) null, (byte) 66);
        }
        class63 var3 = this.method1934(2047, arg0);
        field4712++;
        return var3 == null ? false : var3.method476(this.field4742, this, (byte) -12);
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(II)Z", line = 358)
    public final boolean method1511(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field4741 = 122;
        }
        field4731++;
        return this.field4722[arg0];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljf;B)I", line = 370)
    public static final int method1931(class229 arg0, byte arg1) {
        field4735++;
        for (int var2 = 0; var2 < class299.field5097.length; var2++) {
            if (class299.field5097[var2].method1653(arg0, false)) {
                return var2;
            }
        }
        if (arg1 > -58) {
            field4713 = (int[]) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIILnf;III)V", line = 392)
    public static final void method1932(int arg0, int arg1, int arg2, class67 arg3, int arg4, int arg5, int arg6) {
        field4710++;
        int var7 = arg0 * arg0 + arg1 * arg1;
        if (var7 > 360000) {
            return;
        }
        if (arg2 != -24198) {
            field4736 = (class229) null;
        }
        int var8 = Math.min(arg3.field1258 / 2, arg3.field1295 / 2);
        if (var7 <= (var8 * var8)) {
            class113.method800(class144.field2502[arg6], -22, arg4, arg1, arg0, arg5, arg3);
            return;
        }
        int var9 = class229.field3939 + class213.field3653 & 0x7FF;
        int var10 = class227.field3896[var9];
        int var11 = var10 * 256 / (class102.field1778 + 256);
        int var12 = class227.field3911[var9];
        var8 -= 10;
        int var13 = var12 * 256 / (class102.field1778 + 256);
        int var14 = arg0 * var13 - (arg1 * var11) >> 16;
        int var15 = arg0 * var11 + arg1 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) (Math.cos(var16) * (double) var8);
        if (class108.field1900) {
            ((class326) class152.field2625[arg6]).method2194(240, 240, (arg3.field1258 / 2 + var18 + arg4) * 16, (arg5 - (var19 - (arg3.field1295 / 2))) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class159) class152.field2625[arg6]).method858(arg3.field1258 / 2 + var18 + arg4 - 10, arg5 + -10 - (-(arg3.field1295 / 2) - -var19), 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(II)V", line = 438)
    public final void method1933(int arg0, int arg1) {
        field4734++;
        int var3 = 122 / ((70 - arg0) / 37);
        this.field4741 = arg1;
        this.field4743 = new class91(this.field4741);
        if (class108.field1900) {
            this.field4725 = new class91(this.field4741);
        } else {
            this.field4725 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "(II)Lbk;", line = 459)
    private final class63 method1934(int arg0, int arg1) {
        field4718++;
        class63 var3 = (class63) this.field4743.method643((long) arg1, 1649232044);
        if (var3 != null) {
            return var3;
        }
        if (arg0 != 2047) {
            this.field4725 = (class91) null;
        }
        byte[] var4 = this.field4738.method1275(0, arg1, -5211);
        if (var4 == null) {
            return null;
        } else {
            class14 var5 = new class14(var4);
            class63 var6 = new class63(var5);
            this.field4743.method640(var6, (long) arg1, 24179);
            return var6;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lac;IIIII)V", line = 487)
    public static final void method1935(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4717++;
        if (arg0.field2845 == -1 && arg0.field2825 == null) {
            return;
        }
        int var6 = 0;
        if (arg0.field2841 < arg3) {
            var6 += arg3 - arg0.field2841;
        } else if (arg3 < arg0.field2829) {
            var6 += arg0.field2829 - arg3;
        }
        if (arg2 > arg0.field2823) {
            var6 += arg2 - arg0.field2823;
        } else if (arg2 < arg0.field2824) {
            var6 += arg0.field2824 - arg2;
        }
        if (arg0.field2826 == 0 || arg0.field2826 < var6 - 64 || class31.field531 == 0 || arg0.field2838 != arg1) {
            if (arg0.field2834 != null) {
                class104.field1816.method613(arg0.field2834);
                arg0.field2834 = null;
            }
            if (arg0.field2820 != null) {
                class104.field1816.method613(arg0.field2820);
                arg0.field2820 = null;
            }
            return;
        }
        var6 -= 64;
        if (arg4 > var6) {
            var6 = 0;
        }
        int var7 = (arg0.field2826 - var6) * class31.field531 / arg0.field2826;
        if (arg0.field2834 != null) {
            arg0.field2834.method1210(var7);
        } else if (arg0.field2845 >= 0) {
            class2 var8 = class2.method8(class289.field4945, arg0.field2845, 0);
            if (var8 != null) {
                class316 var9 = var8.method6().method2141(class225.field3845);
                class178 var10 = class178.method1220(var9, 100, var7);
                var10.method1224(-1);
                class104.field1816.method617(var10);
                arg0.field2834 = var10;
            }
        }
        if (arg0.field2820 != null) {
            arg0.field2820.method1210(var7);
            if (!arg0.field2820.method1746((byte) 53)) {
                arg0.field2820 = null;
            }
        } else if (arg0.field2825 != null && (arg0.field2847 -= arg5) <= 0) {
            int var11 = (int) ((double) arg0.field2825.length * Math.random());
            class2 var12 = class2.method8(class289.field4945, arg0.field2825[var11], 0);
            if (var12 != null) {
                class316 var13 = var12.method6().method2141(class225.field3845);
                class178 var14 = class178.method1220(var13, 100, var7);
                var14.method1224(0);
                class104.field1816.method617(var14);
                arg0.field2847 = arg0.field2842 + (int) ((double) (arg0.field2848 - arg0.field2842) * Math.random());
                arg0.field2820 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(BI)Z", line = 606)
    public final boolean method1516(byte arg0, int arg1) {
        if (arg0 < 101) {
            field4706 = (int[]) null;
        }
        field4729++;
        return this.field4726[arg1];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(FII)[I", line = 619)
    public final int[] method1505(float arg0, int arg1, int arg2) {
        field4740++;
        if (arg2 != -1) {
            return (int[]) null;
        }
        class63 var4 = this.method1934(arg2 ^ 0xFFFFF800, arg1);
        if (var4 == null) {
            return null;
        } else {
            var4.field1071 = true;
            return var4.method468(arg0, (byte) -55, this.field4742, this, this.field4703 || this.field4732[arg1]);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V", line = 636)
    public static void method1936(byte arg0) {
        field4736 = null;
        field4713 = null;
        field4706 = null;
        if (arg0 < 66) {
            method1935((class165) null, 22, -34, 120, 58, -40);
        }
    }
}
