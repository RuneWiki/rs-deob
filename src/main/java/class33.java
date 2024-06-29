import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class33 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field499 = 2;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Z")
    public boolean field506 = false;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public int field501 = -1;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public int field526 = -1;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public int field513 = -1;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Z")
    private boolean field525 = false;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public int field523 = -1;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public int field500 = 99;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public int field503 = -1;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public int field524 = 5;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lma;")
    public static class5 field504 = class12.method119(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) 104);

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lma;")
    public static class5 field505 = class12.method119("www)2wtrc", (byte) 89);

    @OriginalMember(owner = "client!u", name = "r", descriptor = "[Z")
    public static boolean[] field516 = new boolean[200];

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field507 = 0;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lma;")
    public static class5 field512 = class12.method119(": ", (byte) 122);

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lma;")
    public static class5 field522 = class12.method119("Benutzen", (byte) 72);

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Z")
    public static boolean field509;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[I")
    public int[] field502;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "[I")
    public static int[] field511;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "[I")
    private int[] field518;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "[I")
    private int[] field528;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "[I")
    public int[] field529;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "[[I")
    public int[][] field510;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBLkl;Lu;I)Lkl;", line = 12)
    public final class34 method219(int arg0, byte arg1, class34 arg2, class33 arg3, int arg4) {
        int var6 = this.field529[arg4];
        class282 var7 = class303.method2053(var6 >> 16, (byte) 99);
        int var8 = var6 & 0xFFFF;
        field519++;
        if (var7 == null) {
            return arg3.method226(arg2, true, arg0);
        }
        if (arg1 != 58) {
            this.method227((class34) null, (byte) 51, -97);
        }
        int var9 = arg3.field529[arg0];
        class282 var10 = class303.method2053(var9 >> 16, (byte) 107);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class34 var13 = arg2.method239(!var7.method1915((byte) -117, var8), !this.field525);
            var13.method250(var7, var8, this.field525);
            return var13;
        } else {
            class34 var12 = arg2.method239(!var7.method1915((byte) 121, var8) & !var10.method1915((byte) 126, var11), !arg3.field525 & !this.field525);
            var12.method233(var7, var8, var10, var11, this.field518, this.field525 | arg3.field525);
            return var12;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V", line = 69)
    public static final void method220(int arg0, boolean arg1) {
        field527++;
        int var2 = -97 % ((10 - arg0) / 50);
        class204.field3265 = arg1;
        if (!class204.field3265) {
            int var26 = (class171.field2625 - class200.field3184.field3610) / 16;
            class72.field1134 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var28 = 0; var28 < 4; var28++) {
                    class72.field1134[var27][var28] = class200.field3184.method1495(117);
                }
            }
            int var29 = class200.field3184.method1527(true);
            boolean var30 = false;
            int var31 = class200.field3184.method1527(true);
            int var32 = class200.field3184.method1499(false);
            int var33 = class200.field3184.method1524((byte) 71);
            if ((var29 / 8 == 48 || var29 / 8 == 49) && var33 / 8 == 48) {
                var30 = true;
            }
            int var34 = class200.field3184.method1527(true);
            class103.field1541 = (byte[][]) null;
            class111.field1657 = new byte[var26][];
            if ((var29 / 8) == 48 && var33 / 8 == 148) {
                var30 = true;
            }
            class288.field4877 = new byte[var26][];
            class41.field628 = new int[var26];
            class282.field4790 = new int[var26];
            class105.field1562 = new byte[var26][];
            class161.field2465 = new byte[var26][];
            class189.field2964 = new int[var26];
            class146.field2117 = null;
            class294.field4958 = new int[var26];
            class48.field755 = new int[var26];
            int var35 = 0;
            for (int var36 = (var29 - 6) / 8; var36 <= ((var29 + 6) / 8); var36++) {
                for (int var37 = (var33 - 6) / 8; var37 <= (var33 + 6) / 8; var37++) {
                    int var38 = (var36 << 8) + var37;
                    if (var30 && (var37 == 49 || var37 == 149 || var37 == 147 || var36 == 50 || var36 == 49 && var37 == 47)) {
                        class294.field4958[var35] = var38;
                        class189.field2964[var35] = -1;
                        class48.field755[var35] = -1;
                        class41.field628[var35] = -1;
                        class282.field4790[var35] = -1;
                    } else {
                        class294.field4958[var35] = var38;
                        class189.field2964[var35] = class86.field1302.method1346((byte) -127, class288.method1940((byte) 123, new class5[] { class129.field1934, class175.method1148(var36, false), class271.field4643, class175.method1148(var37, false) }));
                        class48.field755[var35] = class86.field1302.method1346((byte) 75, class288.method1940((byte) 117, new class5[] { class235.field3890, class175.method1148(var36, false), class271.field4643, class175.method1148(var37, false) }));
                        class41.field628[var35] = class86.field1302.method1346((byte) 119, class288.method1940((byte) 123, new class5[] { class261.field4451, class175.method1148(var36, false), class271.field4643, class175.method1148(var37, false) }));
                        class282.field4790[var35] = class86.field1302.method1346((byte) 107, class288.method1940((byte) 68, new class5[] { class35.field534, class175.method1148(var36, false), class271.field4643, class175.method1148(var37, false) }));
                    }
                    var35++;
                }
            }
            class226.method1598(var29, var33, var34, false, var31, -32769, var32);
            return;
        }
        int var3 = class200.field3184.method1498((byte) -27);
        int var4 = class200.field3184.method1527(true);
        class200.field3184.method1392(-3564);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class200.field3184.method1387(true, 1);
                    if (var8 == 1) {
                        class172.field2643[var5][var6][var7] = class200.field3184.method1387(true, 26);
                    } else {
                        class172.field2643[var5][var6][var7] = -1;
                    }
                }
            }
        }
        class200.field3184.method1391(2);
        int var9 = (class171.field2625 - class200.field3184.field3610) / 16;
        class72.field1134 = new int[var9][4];
        for (int var10 = 0; var10 < var9; var10++) {
            for (int var11 = 0; var11 < 4; var11++) {
                class72.field1134[var10][var11] = class200.field3184.method1503((byte) -125);
            }
        }
        int var12 = class200.field3184.method1524((byte) 44);
        int var13 = class200.field3184.method1498((byte) -27);
        int var14 = class200.field3184.method1544((byte) -78);
        class288.field4877 = new byte[var9][];
        class103.field1541 = (byte[][]) null;
        class282.field4790 = new int[var9];
        class41.field628 = new int[var9];
        class105.field1562 = new byte[var9][];
        class161.field2465 = new byte[var9][];
        class294.field4958 = new int[var9];
        class111.field1657 = new byte[var9][];
        class48.field755 = new int[var9];
        class189.field2964 = new int[var9];
        class146.field2117 = null;
        int var15 = 0;
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = class172.field2643[var16][var17][var18];
                    if (var19 != -1) {
                        int var20 = (var19 & 0xFFC683) >> 14;
                        int var21 = (var19 & 0x3FFE) >> 3;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < var15; var23++) {
                            if (class294.field4958[var23] == var22) {
                                var22 = -1;
                                break;
                            }
                        }
                        if (var22 != -1) {
                            class294.field4958[var15] = var22;
                            int var24 = var22 >> 8 & 0xFF;
                            int var25 = var22 & 0xFF;
                            class189.field2964[var15] = class86.field1302.method1346((byte) -120, class288.method1940((byte) 81, new class5[] { class129.field1934, class175.method1148(var24, false), class271.field4643, class175.method1148(var25, false) }));
                            class48.field755[var15] = class86.field1302.method1346((byte) -81, class288.method1940((byte) 118, new class5[] { class235.field3890, class175.method1148(var24, false), class271.field4643, class175.method1148(var25, false) }));
                            class41.field628[var15] = class86.field1302.method1346((byte) -119, class288.method1940((byte) 125, new class5[] { class261.field4451, class175.method1148(var24, false), class271.field4643, class175.method1148(var25, false) }));
                            class282.field4790[var15] = class86.field1302.method1346((byte) 124, class288.method1940((byte) 81, new class5[] { class35.field534, class175.method1148(var24, false), class271.field4643, class175.method1148(var25, false) }));
                            var15++;
                        }
                    }
                }
            }
        }
        class226.method1598(var3, var4, var13, false, var12, -32769, var14);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lii;ZI)V", line = 332)
    private final void method221(class221 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            int var4 = arg0.method1524((byte) 124);
            this.field502 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field502[var5] = arg0.method1524((byte) 89);
            }
            this.field529 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field529[var6] = arg0.method1524((byte) 105);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field529[var7] = (arg0.method1524((byte) 124) << 16) + this.field529[var7];
            }
        } else if (arg2 == 2) {
            this.field513 = arg0.method1524((byte) 108);
        } else if (arg2 == 3) {
            int var8 = arg0.method1509(!arg1);
            this.field518 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field518[var9] = arg0.method1509(true);
            }
            this.field518[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field506 = true;
        } else if (arg2 == 5) {
            this.field524 = arg0.method1509(true);
        } else if (arg2 == 6) {
            this.field501 = arg0.method1524((byte) 47);
        } else if (arg2 == 7) {
            this.field523 = arg0.method1524((byte) 38);
        } else if (arg2 == 8) {
            this.field500 = arg0.method1509(!arg1);
        } else if (arg2 == 9) {
            this.field526 = arg0.method1509(true);
        } else if (arg2 == 10) {
            this.field503 = arg0.method1509(true);
        } else if (arg2 == 11) {
            this.field499 = arg0.method1509(!arg1);
        } else if (arg2 == 12) {
            int var14 = arg0.method1509(true);
            this.field528 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field528[var15] = arg0.method1524((byte) 127);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field528[var16] = (arg0.method1524((byte) 95) << 16) + this.field528[var16];
            }
        } else if (arg2 == 13) {
            int var10 = arg0.method1524((byte) 65);
            this.field510 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method1509(true);
                if (var12 > 0) {
                    this.field510[var11] = new int[var12];
                    this.field510[var11][0] = arg0.method1497(3610);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field510[var11][var13] = arg0.method1524((byte) 114);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field525 = true;
        }
        if (arg1) {
            method222((byte) -10);
        }
        field508++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 517)
    public static void method222(byte arg0) {
        field516 = null;
        field522 = null;
        if (arg0 == -9) {
            field512 = null;
            field504 = null;
            field505 = null;
            field511 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 538)
    public static final void method223(int arg0) {
        class137.field2037++;
        if (arg0 != 10) {
            method220(41, true);
        }
        field520++;
        class147.field2127.method1389((byte) 121, 83);
        class147.field2127.method1548(false, 0L);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 557)
    public final void method224(int arg0) {
        field521++;
        int var2 = -44 / ((74 - arg0) / 43);
        if (this.field503 == -1) {
            if (this.field518 == null) {
                this.field503 = 0;
            } else {
                this.field503 = 2;
            }
        }
        if (this.field526 != -1) {
            return;
        }
        if (this.field518 == null) {
            this.field526 = 0;
        } else {
            this.field526 = 2;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BILkl;)Lkl;", line = 598)
    public final class34 method225(byte arg0, int arg1, class34 arg2) {
        int var4 = this.field529[arg1];
        class282 var5 = class303.method2053(var4 >> 16, (byte) 100);
        field515++;
        if (arg0 < 102) {
            this.field528 = (int[]) null;
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method241(true, true);
        } else {
            class34 var7 = arg2.method241(!var5.method1915((byte) -89, var6), !this.field525);
            var7.method250(var5, var6, this.field525);
            return var7;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lkl;ZI)Lkl;", line = 620)
    public final class34 method226(class34 arg0, boolean arg1, int arg2) {
        field531++;
        int var4 = this.field529[arg2];
        class282 var5 = class303.method2053(var4 >> 16, (byte) 112);
        int var6 = var4 & 0xFFFF;
        if (!arg1) {
            this.field499 = -25;
        }
        if (var5 == null) {
            return arg0.method239(true, true);
        } else {
            class34 var7 = arg0.method239(!var5.method1915((byte) 111, var6), !this.field525);
            var7.method250(var5, var6, this.field525);
            return var7;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lkl;BI)Lkl;", line = 642)
    public final class34 method227(class34 arg0, byte arg1, int arg2) {
        field530++;
        int var4 = this.field529[arg2];
        class282 var5 = class303.method2053(var4 >> 16, (byte) 94);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method239(true, true);
        }
        int var7 = -50 / ((arg1 + 61) / 34);
        class282 var8 = null;
        int var9 = 0;
        if (this.field528 != null && this.field528.length > arg2) {
            int var10 = this.field528[arg2];
            var8 = class303.method2053(var10 >> 16, (byte) 123);
            var9 = var10 & 0xFFFF;
        }
        if (var8 == null || var9 == 65535) {
            class34 var12 = arg0.method239(!var5.method1915((byte) -102, var6), !this.field525);
            var12.method250(var5, var6, this.field525);
            return var12;
        } else {
            class34 var11 = arg0.method239(!var5.method1915((byte) 81, var6) & !var8.method1915((byte) -113, var9), !this.field525);
            var11.method250(var5, var6, this.field525);
            var11.method250(var8, var9, this.field525);
            return var11;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZLkl;I)Lkl;", line = 696)
    public final class34 method228(int arg0, boolean arg1, class34 arg2, int arg3) {
        if (arg1) {
            field511 = (int[]) null;
        }
        int var5 = this.field529[arg0];
        field517++;
        class282 var6 = class303.method2053(var5 >> 16, (byte) 96);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method239(true, true);
        }
        class34 var8 = arg2.method239(!var6.method1915((byte) 117, var7), !this.field525);
        int var9 = arg3 & 0x3;
        if (var9 == 1) {
            var8.method230();
        } else if (var9 == 2) {
            var8.method240();
        } else if (var9 == 3) {
            var8.method234();
        }
        var8.method250(var6, var7, this.field525);
        if (var9 == 1) {
            var8.method234();
        } else if (var9 == 2) {
            var8.method240();
        } else if (var9 == 3) {
            var8.method230();
        }
        return var8;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lii;I)V", line = 748)
    public final void method229(class221 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                field514++;
                if (arg1 != -2) {
                    this.method229((class221) null, -61);
                }
                return;
            }
            this.method221(arg0, false, var3);
        }
    }
}
