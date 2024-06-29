import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class390 {

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Lpp;")
    private class356 field5205 = new class356();

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Lhv;")
    private class474 field5209 = new class474();

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    private int field5208;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    private int field5206;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Ltq;")
    private class572 field5207;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[C")
    private static char[] field5201 = new char[64];

    @OriginalMember(owner = "client!li", name = "m", descriptor = "Lmfa;")
    public static class562 field5211;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "[I")
    public static int[] field5212;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLpp;J)V")
    public final void method2129(byte arg0, class356 arg1, long arg2) {
        if (this.field5208 == 0) {
            class356 var5 = this.field5209.method2766((byte) 82);
            var5.method1519((byte) 121);
            var5.method1968((byte) -86);
            if (this.field5205 == var5) {
                class356 var6 = this.field5209.method2766((byte) 82);
                var6.method1519((byte) 121);
                var6.method1968((byte) -123);
            }
        } else {
            this.field5208--;
        }
        if (arg0 < 75) {
            this.field5208 = -40;
        }
        field5210++;
        this.field5207.method3235(arg2, -1, arg1);
        this.field5209.method2765(0, arg1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static final void method2130(boolean arg0) {
        class472.field6582.method3227((byte) 39);
        if (arg0) {
            field5201 = null;
        }
        field5200++;
        class461.field6409.method2767(16993);
        class79.field814.method2767(16993);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static final void method2131(int arg0) {
        field5204++;
        if (class601.field8530.method1830(class150.field1711, 0) != 2 || arg0 > -47) {
            return;
        }
        byte var1 = (byte) (class273.field3463 - 4 & 0xFF);
        int var2 = class273.field3463 % class399.field5338;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class349.field4567; var16++) {
                class242.field3146[var3][var2][var16] = var1;
            }
        }
        if (class353.field4625 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class319.field4129[var4] = -1000000;
            class247.field3181[var4] = 1000000;
            class406.field5417[var4] = 0;
            class609.field8603[var4] = 1000000;
            class353.field4629[var4] = 0;
        }
        if (class5.field41 != 1) {
            int var15 = class363.method1995(class353.field4625, class662.field9411, -1327568407, class345.field4493);
            if ((var15 - class150.field1707) >= 3200 || (class379.field4922[class353.field4625][class345.field4493 >> 9][class662.field9411 >> 9] & 0x4) == 0) {
                return;
            }
            class375.method2059(class345.field4493 >> 9, -1, class662.field9411 >> 9, 1, false, class97.field1074);
            return;
        }
        if ((class379.field4922[class353.field4625][class377.field4914.field4641 >> 9][class377.field4914.field4647 >> 9] & 0x4) != 0) {
            class375.method2059(class377.field4914.field4641 >> 9, -1, class377.field4914.field4647 >> 9, 0, false, class97.field1074);
        }
        if (class654.field9344 >= 2560) {
            return;
        }
        int var5 = class345.field4493 >> 9;
        int var6 = class662.field9411 >> 9;
        int var7 = class377.field4914.field4641 >> 9;
        int var8 = class377.field4914.field4647 >> 9;
        int var9;
        if (var7 > var5) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && (-class399.field5338) < var9 && var9 < class399.field5338 && var10 > -class349.field4567 && var10 < class349.field4567) {
            if (var9 <= var10) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class379.field4922[class353.field4625][var5][var6] & 0x4) != 0) {
                        class375.method2059(var5, -1, var6, 1, false, class97.field1074);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var5 < var7) {
                            var5++;
                        } else if (var5 > var7) {
                            var5--;
                        }
                        var12 -= 65536;
                        if ((class379.field4922[class353.field4625][var5][var6] & 0x4) != 0) {
                            class375.method2059(var5, -1, var6, 1, false, class97.field1074);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var5 < var7) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                if ((class379.field4922[class353.field4625][var5][var6] & 0x4) != 0) {
                    class375.method2059(var5, -1, var6, 1, false, class97.field1074);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var8 > var6) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class379.field4922[class353.field4625][var5][var6] & 0x4) != 0) {
                        class375.method2059(var5, -1, var6, 1, false, class97.field1074);
                        return;
                    }
                }
            }
            return;
        }
        class150.method824(15, null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class682.field9685 + "," + class146.field1642);
        return;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public final void method2132(int arg0) {
        this.field5209.method2767(16993);
        field5202++;
        this.field5207.method3227((byte) -93);
        if (arg0 != -53) {
            method2130(false);
        }
        this.field5205 = new class356();
        this.field5208 = this.field5206;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public static void method2133(int arg0) {
        field5212 = null;
        field5211 = null;
        if (arg0 != -23549) {
            method2133(79);
        }
        field5201 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IJ)Lpp;")
    public final class356 method2134(int arg0, long arg1) {
        field5203++;
        class356 var4 = (class356) this.field5207.method3234((byte) -103, arg1);
        if (var4 != null) {
            this.field5209.method2765(0, var4);
        }
        return arg0 == -719 ? var4 : null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V")
    public class390(int arg0) {
        this.field5208 = arg0;
        this.field5206 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field5207 = new class572(var2);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field5201[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field5201[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field5201[var2] = (char) (var2 + 48 - 52);
        }
        field5201[63] = '-';
        field5201[62] = '*';
        field5211 = new class562();
        field5213 = -2;
        field5212 = new int[] { 104, 120, 136, 168 };
    }
}
