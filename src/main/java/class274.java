import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class274 extends class273 {

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    private int field4211 = 585;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "Leg;")
    public static class188 field4214 = new class188(4);

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field4219 = 127;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field4223 = 0;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "S")
    public static short field4224 = 1;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "[[Lqa;")
    public static class217[][] field4222;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "[[[I")
    public static int[][][] field4218;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "[[[Lnk;")
    public static class2[][][] field4221;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(II)I", line = 4)
    public static final int method1797(int arg0, int arg1) {
        field4215++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xF3) >> 6;
        if (arg1 < 100) {
            field4222 = (class217[][]) ((class217[][]) null);
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 55)
    public class274() {
        super(0, true);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BIII)Z", line = 63)
    public static final boolean method1798(byte[] arg0, int arg1, int arg2, int arg3) {
        field4210++;
        boolean var4 = true;
        if (arg2 != -25603) {
            field4217 = -71;
        }
        class303 var5 = new class303(arg0);
        int var6 = -1;
        label76: while (true) {
            int var7 = var5.method2025(773950960);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class17 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method2003(-11);
                                        if (var17 == 0) {
                                            continue label76;
                                        }
                                        var5.method2043((byte) -120);
                                    }
                                    int var10 = var5.method2003(arg2 ^ 0xFFFF9B8E);
                                    if (var10 == 0) {
                                        continue label76;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = (var8 & 0xFF8) >> 6;
                                    var13 = var5.method2043((byte) -107) >> 2;
                                    var14 = arg1 + var11;
                                    var15 = arg3 + var12;
                                } while (var15 <= 0);
                            } while (var14 <= 0);
                        } while (var15 >= 103);
                    } while (var14 >= 103);
                    var16 = class277.method1819((byte) -83, var6);
                } while (var13 == 22 && !class317.field4985 && var16.field214 == 0 && var16.field233 != 1 && !var16.field163);
                if (!var16.method135(0)) {
                    class255.field3990++;
                    var4 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(III)I", line = 145)
    public static final int method1799(int arg0, int arg1, int arg2) {
        field4216++;
        int var3 = arg1 + (arg2 * 57);
        int var4 = var3 << 13 ^ var3;
        if (arg0 == -2) {
            int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (var5 & 0x7FA3450) >> 19;
        } else {
            return 49;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BILgn;)V", line = 161)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field4213++;
        if (arg1 == 0) {
            this.field4211 = arg2.method1994(false);
        }
        if (arg0 <= 27) {
            method1799(53, -36, 48);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V", line = 191)
    public static void method1800(byte arg0) {
        field4222 = (class217[][]) null;
        field4218 = (int[][][]) null;
        field4214 = null;
        field4221 = (class2[][][]) null;
        if (arg0 != 60) {
            field4217 = 45;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I", line = 209)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            return (int[]) null;
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        field4212++;
        if (this.field4204.field792) {
            int var4 = class96.field1473[arg0];
            for (int var5 = 0; var5 < class27.field346; var5++) {
                int var6 = class151.field2384[var5];
                if (this.field4211 < var6 && 4096 - this.field4211 > var6 && (2048 - this.field4211) < var4 && var4 < (this.field4211 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4211);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field4211) && var6 < (this.field4211 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field4211;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4211);
                } else if (this.field4211 > var4 || (4096 - this.field4211) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4211;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4211);
                } else if (var6 >= this.field4211 && var6 <= (4096 - this.field4211)) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field4211);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }
}
