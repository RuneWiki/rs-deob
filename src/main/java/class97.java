import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class97 extends class110 {

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    private int field1451 = 0;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    private int field1458 = 0;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    private int field1461 = 0;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "Lhb;")
    public static class318 field1452 = new class318(64);

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "[I")
    public static int[] field1462 = new int[4096];

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "Z")
    public static boolean field1467 = true;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "Ljava/lang/String;")
    public static String field1468 = "slide:";

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "Lhb;")
    public static class318 field1460 = new class318(2);

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "Lbk;")
    public static class157 field1457;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "Llm;")
    public static class210 field1448;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILre;I)V", line = 4)
    public final void method44(int arg0, class263 arg1, int arg2) {
        field1454++;
        if (arg2 > -37) {
            this.field1450 = -14;
        }
        if (arg0 == 0) {
            this.field1451 = arg1.method1845((byte) -124);
        } else if (arg0 == 1) {
            this.field1458 = (arg1.method1810((byte) 100) << 12) / 100;
        } else if (arg0 == 2) {
            this.field1461 = (arg1.method1810((byte) 110) << 12) / 100;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V", line = 50)
    public static final void method684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class44 var7 = new class44();
        var7.field544 = arg1 / 128;
        var7.field548 = arg2 / 128;
        var7.field551 = arg3 / 128;
        var7.field540 = arg4 / 128;
        var7.field536 = arg0;
        var7.field559 = arg1;
        var7.field537 = arg2;
        var7.field552 = arg3;
        var7.field538 = arg4;
        var7.field562 = arg5;
        var7.field533 = arg6;
        class154.field2314[class302.field4616++] = var7;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIII)V", line = 70)
    private final void method685(byte arg0, int arg1, int arg2, int arg3) {
        field1465++;
        int var5 = arg2 <= arg1 ? arg1 : arg2;
        int var6 = var5 < arg3 ? arg3 : var5;
        int var7 = arg1 > arg2 ? arg2 : arg1;
        int var8 = var7 <= arg3 ? var7 : arg3;
        this.field1463 = (var8 + var6) / 2;
        int var9 = var6 - var8;
        if (arg0 != -11) {
            return;
        }
        if (this.field1463 > 0 && this.field1463 < 4096) {
            this.field1450 = (var9 << 12) / (this.field1463 <= 2048 ? this.field1463 * 2 : 8192 - (this.field1463 * 2));
        } else {
            this.field1450 = 0;
        }
        if (var9 <= 0) {
            this.field1466 = 0;
            return;
        }
        int var10 = (var6 - arg1 << 12) / var9;
        int var11 = (var6 - arg2 << 12) / var9;
        int var12 = (var6 - arg3 << 12) / var9;
        if (arg2 == var6) {
            this.field1466 = arg1 == var8 ? var12 + 20480 : 4096 - var10;
        } else if (arg1 == var6) {
            this.field1466 = arg3 == var8 ? var11 + 4096 : -var12 + 12288;
        } else {
            this.field1466 = arg2 == var8 ? var10 + 12288 : -var11 + 20480;
        }
        this.field1466 /= 6;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)[[I", line = 125)
    public final int[][] method445(int arg0, boolean arg1) {
        if (arg1) {
            this.method685((byte) 97, -98, 45, 80);
        }
        field1459++;
        int[][] var3 = this.field1701.method1477((byte) 55, arg0);
        if (this.field1701.field3255) {
            int[][] var4 = this.method770(arg0, (byte) 52, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class124.field1936; var11++) {
                this.method685((byte) -11, var5[var11], var8[var11], var6[var11]);
                this.field1450 += this.field1458;
                this.field1463 += this.field1461;
                if (this.field1463 < 0) {
                    this.field1463 = 0;
                }
                if (this.field1450 < 0) {
                    this.field1450 = 0;
                }
                if (this.field1450 > 4096) {
                    this.field1450 = 4096;
                }
                for (this.field1466 += this.field1451; this.field1466 < 0; this.field1466 += 4096) {
                }
                while (this.field1466 > 4096) {
                    this.field1466 -= 4096;
                }
                if (this.field1463 > 4096) {
                    this.field1463 = 4096;
                }
                this.method686(this.field1466, this.field1450, this.field1463, true);
                var7[var11] = this.field1464;
                var9[var11] = this.field1456;
                var10[var11] = this.field1455;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIZ)V", line = 195)
    private final void method686(int arg0, int arg1, int arg2, boolean arg3) {
        field1449++;
        if (!arg3) {
            this.field1451 = -31;
        }
        int var5 = arg2 <= 2048 ? (arg1 + 4096) * arg2 >> 12 : arg1 + arg2 - (arg1 * arg2 >> 12);
        if (var5 <= 0) {
            this.field1464 = this.field1456 = this.field1455 = arg2;
            return;
        }
        int var6 = arg0 * 6;
        int var7 = arg2 + arg2 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var10 = var6 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var7 + var13;
        if (var9 == 0) {
            this.field1464 = var5;
            this.field1456 = var15;
            this.field1455 = var7;
        } else if (var9 == 1) {
            this.field1456 = var5;
            this.field1455 = var7;
            this.field1464 = var14;
        } else if (var9 == 2) {
            this.field1456 = var5;
            this.field1455 = var15;
            this.field1464 = var7;
        } else if (var9 == 3) {
            this.field1455 = var5;
            this.field1456 = var14;
            this.field1464 = var7;
        } else if (var9 == 4) {
            this.field1455 = var5;
            this.field1464 = var15;
            this.field1456 = var7;
        } else if (var9 == 5) {
            this.field1456 = var7;
            this.field1455 = var14;
            this.field1464 = var5;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 297)
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 301)
    public static final void method687(int arg0, String arg1, boolean arg2) {
        field1447++;
        if (arg2) {
            if (class117.field1817 && class274.field4207) {
                try {
                    class25.method166(class274.field4200.field3963, new Object[] { (new URL(class124.field1939.getCodeBase(), arg1)).toString() }, "openjs", -20052);
                    return;
                } catch (Throwable var8) {
                }
            }
            try {
                class124.field1939.getAppletContext().showDocument(new URL(class124.field1939.getCodeBase(), arg1), "_blank");
            } catch (Exception var6) {
            }
        } else {
            try {
                class124.field1939.getAppletContext().showDocument(new URL(class124.field1939.getCodeBase(), arg1), "_top");
            } catch (Exception var7) {
            }
        }
        if (arg0 != 3) {
            method688(25);
        }
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V", line = 351)
    public static void method688(int arg0) {
        field1460 = null;
        if (arg0 != 0) {
            return;
        }
        field1452 = null;
        field1462 = null;
        field1457 = null;
        field1448 = null;
        field1468 = null;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)I", line = 373)
    public static final int method689(int arg0, int arg1) {
        field1469++;
        if (arg0 <= 21) {
            return 30;
        } else if (arg1 == 16711935) {
            return -1;
        } else {
            return class279.method1945((byte) 123, arg1);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Z", line = 402)
    public static final boolean method690(boolean arg0, int arg1) {
        if (!arg0) {
            field1467 = false;
        }
        field1453++;
        byte var2 = 0;
        byte var3 = 0;
        if (class158.field2372 == null) {
            if (class117.field1817 || class271.field4157 == null) {
                class158.field2372 = new class127(512, 512);
            } else {
                class158.field2372 = (class127) class271.field4157;
            }
            int[] var4 = class158.field2372.field1983;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < 104 - var2 - 1; var7++) {
                int var8 = ((var2 + 103 - var7) * 2048) + 24628;
                for (int var9 = var3 + 1; var9 < 104 - var3 - 1; var9++) {
                    if ((class179.field2645[arg1][var9][var7] & 0x18) == 0) {
                        class125.method917(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class179.field2645[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class125.method917(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class74.field963 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class316.method2165(class180.field2697, var10 + var3, var2 + var11);
                    if (var12 != 0L) {
                        class22 var14 = class284.method1980((int) (var12 >>> 32) & Integer.MAX_VALUE, (byte) 123);
                        int var15 = var14.field318;
                        if (var14.field336 != null) {
                            for (int var16 = 0; var16 < var14.field336.length; var16++) {
                                if (var14.field336[var16] != -1) {
                                    class22 var17 = class284.method1980(var14.field336[var16], (byte) 102);
                                    if (var17.field318 >= 0) {
                                        var15 = var17.field318;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var10 + var3;
                            int var19 = var2 + var11;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class325.field4896[class180.field2697].field2857;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var18 > (var10 - 3) && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && var18 < var10 + 3 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var19 > var11 - 3 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var19 < var11 + 3 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class191.field2846[class74.field963] = var14.field331;
                            class3.field22[class74.field963] = var18 - var3;
                            class258.field3903[class74.field963] = var19 - var2;
                            class74.field963++;
                        }
                    }
                }
            }
        }
        class158.field2372.method943();
        int var23 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 16) + 238 - 10;
        int var24 = (((int) (Math.random() * 20.0D)) + 238) - 10 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class179.field2645[arg1][var3 + var26][var25 + var2] & 0x18) == 0 && !class128.method952(var25, var3, var26, (byte) 76, var2, var23, arg1, var24)) {
                    if (class117.field1817) {
                        class46.field577 = null;
                    } else {
                        class171.field2574.method1474(0);
                    }
                    return false;
                }
                if (arg1 < 3 && (class179.field2645[arg1 + 1][var3 + var26][var25 + var2] & 0x8) != 0 && !class128.method952(var25, var3, var26, (byte) 76, var2, var23, arg1 + 1, var24)) {
                    if (class117.field1817) {
                        class46.field577 = null;
                    } else {
                        class171.field2574.method1474(0);
                    }
                    return false;
                }
            }
        }
        if (class117.field1817) {
            int[] var27 = class158.field2372.field1983;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class271.field4157 = new class303(class158.field2372);
        } else {
            class271.field4157 = class158.field2372;
        }
        if (class117.field1817) {
            class46.field577 = null;
        } else {
            class171.field2574.method1474(0);
        }
        class158.field2372 = null;
        return true;
    }
}
