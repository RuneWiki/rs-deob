import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class160 {

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lbl;")
    public static class34 field2618 = new class34(0, 0);

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Lnj;")
    public static class144 field2624 = new class144(16);

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "[I")
    public static int[] field2625 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "[C")
    public static char[] field2626 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lh;")
    public static class278 field2622;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Llc;")
    public static class86 field2619;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Llc;ZLlc;)I")
    public static final int method1189(class86 arg0, boolean arg1, class86 arg2) {
        if (arg1) {
            field2622 = null;
        }
        int var3 = 0;
        if (arg2.method634(class141.field2281, 0)) {
            var3++;
        }
        if (arg2.method634(class98.field1446, 0)) {
            var3++;
        }
        if (arg2.method634(class164.field2663, 0)) {
            var3++;
        }
        field2612++;
        if (arg0.method634(class141.field2281, 0)) {
            var3++;
        }
        if (arg0.method634(class98.field1446, 0)) {
            var3++;
        }
        if (arg0.method634(class164.field2663, 0)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)Z")
    public final boolean method1190(boolean arg0) {
        if (!arg0) {
            field2618 = null;
        }
        field2615++;
        return (this.field2614 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Z")
    public final boolean method1191(int arg0) {
        field2617++;
        if (arg0 > -122) {
            method1196((byte) 98, -101);
        }
        return (this.field2614 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)Z")
    public final boolean method1192(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field2623++;
            return (this.field2614 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static void method1193(int arg0) {
        field2619 = null;
        if (arg0 >= -9) {
            return;
        }
        field2624 = null;
        field2618 = null;
        field2626 = null;
        field2622 = null;
        field2625 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIILwg;JZ)V")
    public static final void method1194(int arg0, int arg1, int arg2, int arg3, class178 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class159 var8 = new class159();
        var8.field2601 = arg4;
        var8.field2606 = arg1 * 128 + 64;
        var8.field2595 = arg2 * 128 + 64;
        var8.field2603 = arg3;
        var8.field2600 = arg5;
        if (class220.field3525[arg0][arg1][arg2] == null) {
            class220.field3525[arg0][arg1][arg2] = new class286(arg0, arg1, arg2);
        }
        class220.field3525[arg0][arg1][arg2].field4518 = var8;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)Z")
    public final boolean method1195(int arg0) {
        field2621++;
        if (arg0 == 8482) {
            return (this.field2614 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)Z")
    public static final boolean method1196(byte arg0, int arg1) {
        field2620++;
        byte var2 = 0;
        byte var3 = 0;
        if (class38.field538 == null) {
            if (class252.field4163 == null) {
                class38.field538 = new class140(512, 512);
            } else {
                class38.field538 = (class140) class252.field4163;
            }
            int[] var4 = class38.field538.field2251;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < (104 - var2 - 1); var7++) {
                int var21 = (var2 + 103 - var7) * 512 * 4 + 24628;
                for (int var22 = var3 + 1; var22 < 104 - var3 - 1; var22++) {
                    if ((class86.field1277[arg1][var22][var7] & 0x18) == 0) {
                        class272.method1883(var4, var21, 512, arg1, var22, var7);
                    }
                    if (arg1 < 3 && (class86.field1277[arg1 + 1][var22][var7] & 0x8) != 0) {
                        class272.method1883(var4, var21, 512, arg1 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class281.field4472 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class250.method1787(class58.field826, var3 + var8, var2 + var9);
                    if (var10 != 0L) {
                        class36 var12 = class134.method970((int) (var10 >>> 32) & Integer.MAX_VALUE, 0);
                        int var13 = var12.field449;
                        if (var12.field471 != null) {
                            for (int var14 = 0; var14 < var12.field471.length; var14++) {
                                if (var12.field471[var14] != -1) {
                                    class36 var15 = class134.method970(var12.field471[var14], arg0 ^ 0x25);
                                    if (var15.field449 >= 0) {
                                        var13 = var15.field449;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var9 + var2;
                            int var17 = var3 + var8;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class138.field2237[class58.field826].field1633;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var17 > 0 && (var8 - 3) < var17 && (var18[var17 - 1][var16] & 0x2C0108) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 1 && var17 < 103 && var17 < (var8 + 3) && (var18[var17 + 1][var16] & 0x2C0180) == 0) {
                                        var17++;
                                    }
                                    if (var20 == 2 && var16 > 0 && var16 > var9 - 3 && (var18[var17][var16 - 1] & 0x2C0102) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 3 && var16 < 103 && var16 < var9 + 3 && (var18[var17][var16 + 1] & 0x2C0120) == 0) {
                                        var16++;
                                    }
                                }
                            }
                            class128.field1982[class281.field4472] = var12.field477;
                            class184.field2974[class281.field4472] = var17 - var3;
                            class119.field1727[class281.field4472] = var16 - var2;
                            class281.field4472++;
                        }
                    }
                }
            }
        }
        int var23 = (int) (Math.random() * 20.0D) + 238 - (10 - ((int) (Math.random() * 20.0D) + -10 + 238 << 8)) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16);
        int var24 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        class38.field538.method989();
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class86.field1277[arg1][var3 + var26][var25 + var2] & 0x18) == 0 && !class28.method201(var25, var2, arg1, var23, var3, var24, var26, arg0 ^ 0x27)) {
                    class29.field367.method111((byte) 50);
                    return false;
                }
                if (arg1 < 3 && (class86.field1277[arg1 + 1][var3 + var26][var2 + var25] & 0x8) != 0 && !class28.method201(var25, var2, arg1 + 1, var23, var3, var24, var26, arg0 ^ 0x27)) {
                    class29.field367.method111((byte) 50);
                    return false;
                }
            }
        }
        if (arg0 == 37) {
            class252.field4163 = class38.field538;
            class29.field367.method111((byte) 50);
            class38.field538 = null;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)I")
    public static final int method1197(int arg0, byte arg1) {
        field2613++;
        if (arg1 != -77) {
            method1196((byte) -58, -19);
        }
        return arg0 & 0x3FF;
    }
}
