import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class103 extends class202 {

    @OriginalMember(owner = "client!le", name = "O", descriptor = "[I")
    public static int[] field1824 = new int[2];

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    private int field1832;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "Lac;")
    public static class188 field1835;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "Lpf;")
    public static class206 field1836;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "Lc;")
    public static class57 field1828;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "Ltg;")
    public static class75 field1825;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "Lsb;")
    public class98 field1823;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "[[[B")
    public static byte[][][] field1834;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Z")
    public final boolean method791(int arg0) {
        field1826++;
        int var2 = 0 % ((arg0 + 19) / 38);
        return this.field1832 == 115;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Llj;I)V")
    public final void method792(class216 arg0, int arg1) {
        if (arg1 != -5009) {
            field1836 = null;
        }
        field1831++;
        while (true) {
            int var3 = arg0.method1446(5350);
            if (var3 == 0) {
                return;
            }
            this.method795(arg0, arg1 + 14866, var3);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V")
    public static final void method793(boolean arg0, int arg1) {
        class28.field531 = arg0;
        if (arg1 != 0) {
            return;
        }
        field1837++;
        if (!class28.field531) {
            int var2 = class144.field2536.method1475((byte) -110);
            int var3 = class144.field2536.method1478(arg1 ^ 0xFFFFFF82);
            int var4 = class144.field2536.method1441(2);
            int var5 = (class47.field789 - class144.field2536.field3728) / 16;
            class117.field2097 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class117.field2097[var6][var14] = class144.field2536.method1466(0);
                }
            }
            int var7 = class144.field2536.method1487(118);
            int var8 = class144.field2536.method1480(-125);
            class208.field3557 = null;
            class95.field1642 = new int[var5];
            class49.field812 = new int[var5];
            class223.field3846 = null;
            class75.field1329 = new byte[var5][];
            boolean var9 = false;
            if (((var7 / 8) == 48 || var7 / 8 == 49) && (var3 / 8) == 48) {
                var9 = true;
            }
            if ((var7 / 8) == 48 && var3 / 8 == 148) {
                var9 = true;
            }
            class238.field4106 = new byte[var5][];
            class119.field2134 = new int[var5];
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= ((var3 + 6) / 8); var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (var9 && var12 == 49 || var12 == 149 || var12 == 147 || var11 == 50 || !(var11 != 49 || var12 != 47)) {
                        class49.field812[var10] = var13;
                        class95.field1642[var10] = -1;
                        class119.field2134[var10] = -1;
                    } else {
                        class49.field812[var10] = var13;
                        class95.field1642[var10] = class84.field1467.method564(class186.method1288(new class98[] { class208.field3565, class125.method930(25904, var11), class111.field1980, class125.method930(25904, var12) }, 31618), -14783);
                        class119.field2134[var10] = class84.field1467.method564(class186.method1288(new class98[] { class221.field3806, class125.method930(25904, var11), class111.field1980, class125.method930(class184.method1267(arg1, 25904), var12) }, class184.method1267(arg1, 31618)), -14783);
                    }
                    var10++;
                }
            }
            class228.method1574(var8, var4, var7, var2, false, arg1 ^ 0xFFFFFF88, var3);
            return;
        }
        int var15 = class144.field2536.method1441(2);
        int var16 = class144.field2536.method1441(2);
        int var17 = class144.field2536.method1443(arg1 + 4);
        int var18 = class144.field2536.method1441(2);
        class144.field2536.method491(-1);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class144.field2536.method483(8, 1);
                    if (var37 == 1) {
                        class156.field2847[var19][var35][var36] = class144.field2536.method483(8, 26);
                    } else {
                        class156.field2847[var19][var35][var36] = -1;
                    }
                }
            }
        }
        class144.field2536.method479((byte) 127);
        int var20 = (class47.field789 - class144.field2536.field3728) / 16;
        class117.field2097 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class117.field2097[var21][var34] = class144.field2536.method1442(-1330139880);
            }
        }
        int var22 = class144.field2536.method1478(-111);
        class223.field3846 = null;
        class208.field3557 = null;
        class49.field812 = new int[var20];
        class238.field4106 = new byte[var20][];
        class75.field1329 = new byte[var20][];
        class119.field2134 = new int[var20];
        class95.field1642 = new int[var20];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class156.field2847[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 3 & 0x7FF;
                        int var29 = var27 >> 14 & 0x3FF;
                        int var30 = (var29 / 8 << 8) + (var28 / 8);
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class49.field812[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            int var32 = var30 & 0xFF;
                            class49.field812[var23] = var30;
                            int var33 = (var30 & 0xFFBC) >> 8;
                            class95.field1642[var23] = class84.field1467.method564(class186.method1288(new class98[] { class208.field3565, class125.method930(25904, var33), class111.field1980, class125.method930(arg1 + 25904, var32) }, arg1 + 31618), -14783);
                            class119.field2134[var23] = class84.field1467.method564(class186.method1288(new class98[] { class221.field3806, class125.method930(25904, var33), class111.field1980, class125.method930(25904, var32) }, 31618), -14783);
                            var23++;
                        }
                    }
                }
            }
        }
        class228.method1574(var17, var16, var15, var18, false, arg1 - 73, var22);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(II)I")
    public static final int method794(int arg0, int arg1) {
        field1830++;
        if (arg0 != 147) {
            return 0;
        }
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Llj;II)V")
    private final void method795(class216 arg0, int arg1, int arg2) {
        if (arg1 != 9857) {
            this.method791(-9);
        }
        if (arg2 == 1) {
            this.field1832 = arg0.method1446(arg1 - 4507);
        } else if (arg2 == 2) {
            this.field1833 = arg0.method1442(-1330139880);
        } else if (arg2 == 5) {
            this.field1823 = arg0.method1445(-3);
        }
        field1827++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLsb;)V")
    public static final void method796(boolean arg0, class98 arg1) {
        field1829++;
        if (arg0) {
            field1825 = null;
        }
        for (class150 var2 = (class150) class93.field1623.method371((byte) 61); var2 != null; var2 = (class150) class93.field1623.method370(true)) {
            if (var2.field2763.method748(true, arg1)) {
                class64.field1052 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "g", descriptor = "(B)V")
    public static void method797(byte arg0) {
        field1835 = null;
        if (arg0 != -97) {
            return;
        }
        field1828 = null;
        field1825 = null;
        field1836 = null;
        field1824 = null;
        field1834 = null;
    }
}
