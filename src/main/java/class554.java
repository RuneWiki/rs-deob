import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public abstract class class554 {

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "B")
    public static byte field7579;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public int field7581;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public int field7583;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public int field7584;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "[I")
    public static int[] field7586;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "[[Z")
    public static boolean[][] field7580;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method3105(byte arg0) {
        field7591++;
        if (arg0 <= 57) {
            method3106(-40);
        }
        return (this.field7581 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V", line = 21)
    public static void method3106(int arg0) {
        field7586 = null;
        if (arg0 != 4) {
            method3109(null, -54, null);
        }
        field7580 = null;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)Z", line = 32)
    public final boolean method3107(int arg0) {
        field7585++;
        if (arg0 == -26022) {
            return (this.field7581 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)Z", line = 43)
    public final boolean method3108(int arg0) {
        field7589++;
        if (arg0 == 3) {
            return (this.field7581 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "([[BILm;)V", line = 55)
    public static final void method3109(byte[][] arg0, int arg1, class110 arg2) {
        field7588++;
        if (arg1 != 26821) {
            return;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field7066; var4++) {
            class155.method1031(-101);
            for (int var5 = 0; var5 < (class588.field8082 >> 3); var5++) {
                for (int var6 = 0; var6 < class12.field113 >> 3; var6++) {
                    int var7 = class185.field2273[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x36421DE) >> 24;
                        if (!arg2.field7070 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = (var7 & 0xFFF850) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class339.field4957.length; var13++) {
                                if (class339.field4957[var13] == var12 && arg0[var13] != null) {
                                    class138 var14 = new class138(arg0[var13]);
                                    arg2.method2928(var5 * 8, var10, var14, var11, var4, var9, arg1 ^ 0xFFFFC5B9, class624.field8489, var8, var6 * 8);
                                    arg2.method593(var10, var4, var3[0] == -1 ? var3 : null, var6 * 8, class9.field103, var5 * 8, true, var14, var8, var9, var11);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class397.field5668 = class603.field8243.method2898(-27611, var3[2], var3[0], class502.field6772, var3[1], var3[3]);
            class487.field6572 = var3[4];
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)Z", line = 136)
    public static final boolean method3110(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field7590++;
            return class179.field2242 > 0;
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)Z", line = 150)
    public final boolean method3111(byte arg0) {
        field7587++;
        int var2 = 25 % ((11 - arg0) / 44);
        return (this.field7581 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILqe;I)V", line = 162)
    public static final void method3112(int arg0, class122 arg1, int arg2) {
        field7582++;
        boolean var3 = arg1.method752(0, 1) == 1;
        if (var3) {
            class276.field3745[class72.field937++] = arg2;
        }
        int var4 = arg1.method752(0, arg0);
        class519 var5 = class292.field3912[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field7185 = false;
            } else if (class224.field2907 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class124 var6 = class142.field1807[arg2] = new class124();
                var6.field1599 = (class186.field2280 + var5.field516[0] >> 6) + ((var5.field3925 << 28) + (var5.field526[0] + class253.field3490 >> 6 << 14));
                if (var5.field7167 == -1) {
                    var6.field1602 = var5.field421.method1120(arg0 ^ 0x3);
                } else {
                    var6.field1602 = var5.field7167;
                }
                var6.field1598 = var5.field7158;
                var6.field1600 = var5.field430;
                if (var5.field7190 > 0) {
                    class473.method2655(var5, 0);
                }
                class292.field3912[arg2] = null;
                if (arg1.method752(0, 1) != 0) {
                    class566.method3199(arg2, arg1, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method752(0, 3);
            int var8 = var5.field526[0];
            int var9 = var5.field516[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field7181 = var8;
                var5.field7156 = var9;
                var5.field7185 = true;
            } else {
                var5.method2962(class536.field7370[arg2], var8, (byte) -93, var9);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method752(0, 4);
            int var11 = var5.field526[0];
            int var12 = var5.field516[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field7185 = true;
                var5.field7156 = var12;
                var5.field7181 = var11;
            } else {
                var5.method2962(class536.field7370[arg2], var11, (byte) -62, var12);
            }
        } else {
            int var13 = arg1.method752(0, 1);
            if (var13 == 0) {
                int var14 = arg1.method752(0, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field526[0] + var16;
                int var19 = var5.field516[0] + var17;
                if (var3) {
                    var5.field7181 = var18;
                    var5.field7185 = true;
                    var5.field7156 = var19;
                } else {
                    var5.method2962(class536.field7370[arg2], var18, (byte) -107, var19);
                }
                var5.field3925 = (byte) (var5.field3925 + var15 & 0x3);
                if (class224.field2907 == arg2) {
                    class432.field5993 = var5.field3925;
                }
            } else {
                int var20 = arg1.method752(0, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field526[0] + class253.field3490 + var22 & 0x3FFF) - class253.field3490;
                int var25 = (class186.field2280 + var23 + var5.field516[0] & 0x3FFF) - class186.field2280;
                if (var3) {
                    var5.field7185 = true;
                    var5.field7156 = var25;
                    var5.field7181 = var24;
                } else {
                    var5.method2962(class536.field7370[arg2], var24, (byte) 111, var25);
                }
                var5.field3925 = (byte) (var5.field3925 + var21 & 0x3);
                if (class224.field2907 == arg2) {
                    class432.field5993 = var5.field3925;
                }
            }
        }
    }
}
