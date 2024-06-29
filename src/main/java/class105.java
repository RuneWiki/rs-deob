import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class105 extends class124 {

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "Z")
    private boolean field1750 = true;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    private int field1748 = 4096;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "Z")
    public static boolean field1749 = false;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "Le;")
    public static class191 field1752 = class54.method368("Mitglieder)2Welt", 2047);

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "Le;")
    public static class191 field1754 = class54.method368("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 2047);

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "Le;")
    public static class191 field1756 = class54.method368("m", 2047);

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "Z")
    public static boolean field1757 = true;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "J")
    public static long field1761;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)V")
    public static final void method674(int arg0) {
        ++field1751;
        if (class130.field2166 != -1) {
            class92.method564(class130.field2166, -1);
        }
        for (int var1 = arg0; var1 < class239.field4257; ++var1) {
            if (class189.field3324[var1]) {
                class87.field1428[var1] = true;
            }
            class132.field2209[var1] = class189.field3324[var1];
            class189.field3324[var1] = false;
        }
        class90.field1473 = class135.field2267;
        class19.field268 = -1;
        class67.field1163 = null;
        class154.field2652 = -1;
        if (~class130.field2166 != 0) {
            class239.field4257 = 0;
            class97.method603(0, -1, class200.field3584, 21990, 0, 0, 0, class190.field3337, class130.field2166);
        }
        class7.method38();
        class182.field3138 = 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public static final void method675(int arg0, int arg1) {
        class269.field4743.method990(106, arg0);
        if (arg1 == -2252) {
            ++field1753;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class105() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method676(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != -176531519) {
            return false;
        } else {
            boolean var4 = true;
            class225 var5 = new class225(arg1);
            ++field1758;
            int var6 = -1;
            label72: while (true) {
                int var7 = var5.method1564((byte) 85);
                if (var7 == 0) {
                    return var4;
                }
                var6 += var7;
                int var8 = 0;
                boolean var9 = false;
                while (true) {
                    int var14;
                    class102 var16;
                    do {
                        int var13;
                        int var15;
                        do {
                            do {
                                do {
                                    do {
                                        while (var9) {
                                            int var17 = var5.method1577(false);
                                            if (~var17 == -1) {
                                                continue label72;
                                            }
                                            var5.method1580(-73);
                                        }
                                        int var10 = var5.method1577(false);
                                        if (~var10 == -1) {
                                            continue label72;
                                        }
                                        var8 += var10 + -1;
                                        int var11 = var8 & 63;
                                        int var12 = (4057 & var8) >> 6;
                                        var13 = arg0 + var12;
                                        var14 = var5.method1580(-99) >> 2;
                                        var15 = arg2 + var11;
                                    } while (~var13 >= -1);
                                } while (~var15 >= -1);
                            } while (var13 >= 103);
                        } while (~var15 <= -104);
                        var16 = class31.method216(var6, (byte) 125);
                    } while (var14 == 22 && !class225.field4029 && var16.field1654 == 0 && var16.field1679 != 1 && !var16.field1682);
                    var9 = true;
                    if (!var16.method645(false)) {
                        ++class47.field839;
                        var4 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field1760;
        int[][] var3 = super.field2053.method1775((byte) -111, arg0);
        if (super.field2053.field4558) {
            int[] var4 = this.method844(0, 45, arg0 + -1 & class181.field3119);
            int[] var5 = this.method844(0, 109, arg0);
            int[] var6 = this.method844(0, arg1 + 110, arg0 + 1 & class181.field3119);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class64.field1132 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1748;
                int var12 = (var5[class8.field82 & var10 + 1] + -var5[var10 + -1 & class8.field82]) * this.field1748;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var20 = var11 / var17;
                    var19 = var12 / var17;
                }
                if (this.field1750) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var8[var10] = var19;
                var7[var10] = var20;
                var9[var10] = var18;
            }
        }
        if (arg1 != -7) {
            field1754 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)V")
    public static final void method677(int arg0) {
        ++field1755;
        if (arg0 >= -90) {
            method674(122);
        }
        int var1 = class261.field4625.length;
        for (int var2 = 0; var2 < var1; ++var2) {
            if (class261.field4625[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; class95.field1541 > var4; ++var4) {
                    if (class235.field4179[var4] == class154.field2642[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class235.field4179[class95.field1541] = class154.field2642[var2];
                    var3 = class95.field1541++;
                }
                int var5 = 0;
                class225 var6 = new class225(class261.field4625[var2]);
                while (~class261.field4625[var2].length < ~var6.field3996 && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method1593(true);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 63;
                    int var11 = (var8 & 8182) >> 7;
                    int var12 = (class154.field2642[var2] >> 8) * 64 + -class225.field4061 - -var11;
                    int var13 = (class154.field2642[var2] & 255) * 64 + -class193.field3474 + var10;
                    class184 var14 = class135.method904(-115, var6.method1593(true));
                    if (class115.field1901[var7] == null && (var14.field3222 & 1) > 0 && ~class252.field4461 == ~var9 && ~var12 <= -1 && var12 - -var14.field3208 < 104 && ~var13 <= -1 && ~(var13 - -var14.field3208) > -105) {
                        class115.field1901[var7] = new class156();
                        class156 var15 = class115.field1901[var7];
                        class256.field4542[class197.field3514++] = var7;
                        var15.field2663 = var14;
                        var15.field2992 = class135.field2267;
                        var15.method1185(1, var15.field2663.field3208);
                        var15.field2960 = var15.field2663.field3170;
                        var15.field2970 = var15.field2663.field3214;
                        if (var15.field2960 == 0) {
                            var15.field2999 = 0;
                        }
                        var15.field2974 = var15.field2663.field3213;
                        var15.field3007 = var15.field2663.field3186;
                        var15.field2969 = var15.field2663.field3227;
                        var15.field2995 = var15.field2663.field3181;
                        var15.field3012 = var15.field2663.field3163;
                        var15.field3011 = var15.field2663.field3202;
                        var15.method1184(true, var12, 3, var13, var15.method490((byte) -4));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field1750 = arg1.method1580(-61) == 1;
            }
        } else {
            this.field1748 = arg1.method1593(true);
        }
        ++field1759;
        if (!arg2) {
            method679((byte) 12);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)Lob;")
    public static final class269 method678(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class269 var4 = var3.field3553;
            var3.field3553 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
    public static void method679(byte arg0) {
        field1754 = null;
        field1756 = null;
        if (arg0 == 110) {
            field1752 = null;
        }
    }
}
