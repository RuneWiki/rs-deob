import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class35 {

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public int field526 = -1;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[I")
    private int[] field531 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Z")
    public boolean field535 = false;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Z")
    public static boolean field517 = true;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Ldf;")
    public static class51 field528 = null;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Ldf;")
    private static class51 field529 = class46.method233(" is already on your ignore list)3", 100);

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Ldf;")
    public static class51 field533 = field529;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "[I")
    public static int[] field537 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
    private int[] field530;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[S")
    private short[] field519;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "[S")
    private short[] field527;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "[S")
    private short[] field536;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "[S")
    private short[] field539;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZLdf;)V")
    public static final void method172(int arg0, boolean arg1, class51 arg2) {
        field521++;
        class51 var3 = arg2.method280((byte) -89).method304((byte) -92);
        boolean var4 = arg1;
        for (int var5 = 0; var5 < class86.field1444; var5++) {
            class103 var6 = class66.field1055[class75.field1195[var5]];
            if (var6 != null && var6.field1711 != null && var6.field1711.method292(true, var3)) {
                class202.method1403(var6.field4336[0], false, 2, 0, class44.field706.field4343[0], 0, 1, var6.field4343[0], class44.field706.field4336[0], 1, 0, 2);
                if (arg0 == 1) {
                    class95.field1575.method424((byte) 102, 31);
                    class131.field2188++;
                    class95.field1575.method892(class75.field1195[var5], (byte) 122);
                } else if (arg0 == 4) {
                    class95.field1575.method424((byte) 95, 55);
                    class202.field3394++;
                    class95.field1575.method895(-94, class75.field1195[var5]);
                } else if (arg0 == 5) {
                    class95.field1575.method424((byte) 119, 3);
                    class121.field2022++;
                    class95.field1575.method889((byte) 71, class75.field1195[var5]);
                } else if (arg0 == 6) {
                    class95.field1575.method424((byte) 86, 59);
                    class95.field1575.method892(class75.field1195[var5], (byte) 56);
                    class265.field4639++;
                } else if (arg0 == 7) {
                    class204.field3409++;
                    class95.field1575.method424((byte) 81, 243);
                    class95.field1575.method889((byte) 105, class75.field1195[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class147.method1064(class20.method104(-89, new class51[] { class41.field652, var3 }), class43.field696, (byte) 126, 0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Z")
    public final boolean method173(int arg0) {
        field525++;
        if (this.field530 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field530.length; var3++) {
            if (!class45.field723.method807(this.field530[var3], 0, -123)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
    public static final void method174(int arg0, boolean arg1) {
        if (arg0 < 42) {
            field533 = null;
        }
        class100.field1657 = arg1;
        if (class100.field1657) {
            int var2 = class97.field1622.method890((byte) -83);
            int var3 = class97.field1622.method914(-91);
            class97.field1622.method427(false);
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class97.field1622.method428(1, (byte) -118);
                        if (var24 == 1) {
                            class106.field1748[var4][var22][var23] = class97.field1622.method428(26, (byte) -115);
                        } else {
                            class106.field1748[var4][var22][var23] = -1;
                        }
                    }
                }
            }
            class97.field1622.method431(98048);
            int var5 = (class70.field1128 - class97.field1622.field2026) / 16;
            class120.field1992 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class120.field1992[var6][var21] = class97.field1622.method894(255);
                }
            }
            int var7 = class97.field1622.method876(false);
            int var8 = class97.field1622.method890((byte) -83);
            int var9 = class97.field1622.method906(9147);
            class257.field4498 = new byte[var5][];
            class39.field612 = null;
            class181.field2989 = new int[var5];
            class101.field1681 = new int[var5];
            class9.field95 = new int[var5];
            class105.field1732 = new byte[var5][];
            int var10 = 0;
            class234.field4071 = null;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class106.field1748[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 14 & 0x3FF;
                            int var16 = var14 >> 3 & 0x7FF;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class101.field1681[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                int var19 = var17 >> 8 & 0xFF;
                                class101.field1681[var10] = var17;
                                int var20 = var17 & 0xFF;
                                class9.field95[var10] = class143.field2392.method810(class20.method104(-15, new class51[] { class203.field3395, class51.method311(var19, 10), class159.field2607, class51.method311(var20, 10) }), -1);
                                class181.field2989[var10] = class143.field2392.method810(class20.method104(112, new class51[] { class171.field2804, class51.method311(var19, 10), class159.field2607, class51.method311(var20, 10) }), -1);
                                var10++;
                            }
                        }
                    }
                }
            }
            class92.method699(var9, var8, var7, var2, false, var3, false);
        } else {
            int var25 = (class70.field1128 - class97.field1622.field2026) / 16;
            class120.field1992 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class120.field1992[var26][var37] = class97.field1622.method908((byte) -112);
                }
            }
            int var27 = class97.field1622.method914(-64);
            int var28 = class97.field1622.method914(45);
            int var29 = class97.field1622.method901((byte) -4);
            boolean var30 = false;
            int var31 = class97.field1622.method876(false);
            int var32 = class97.field1622.method914(90);
            class9.field95 = new int[var25];
            if ((var27 / 8 == 48 || (var27 / 8) == 49) && (var31 / 8) == 48) {
                var30 = true;
            }
            class105.field1732 = new byte[var25][];
            class257.field4498 = new byte[var25][];
            class181.field2989 = new int[var25];
            class234.field4071 = null;
            if (var27 / 8 == 48 && var31 / 8 == 148) {
                var30 = true;
            }
            class101.field1681 = new int[var25];
            int var33 = 0;
            class39.field612 = null;
            for (int var34 = (var27 - 6) / 8; var34 <= ((var27 + 6) / 8); var34++) {
                for (int var35 = (var31 - 6) / 8; var35 <= (var31 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var30 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class101.field1681[var33] = var36;
                        class9.field95[var33] = -1;
                        class181.field2989[var33] = -1;
                    } else {
                        class101.field1681[var33] = var36;
                        class9.field95[var33] = class143.field2392.method810(class20.method104(25, new class51[] { class203.field3395, class51.method311(var34, 10), class159.field2607, class51.method311(var35, 10) }), -1);
                        class181.field2989[var33] = class143.field2392.method810(class20.method104(-120, new class51[] { class171.field2804, class51.method311(var34, 10), class159.field2607, class51.method311(var35, 10) }), -1);
                    }
                    var33++;
                }
            }
            class92.method699(var29, var32, var28, var27, false, var31, false);
        }
        field520++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Llb;Z)V")
    public final void method175(class121 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method897(114);
            if (var3 == 0) {
                field524++;
                if (arg1) {
                    method179(true, (class158[]) null, (class158[]) null, (class158[]) null, (class254[]) null, (class111) null, (class158[]) null);
                    return;
                }
                return;
            }
            this.method181(-95, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public static final void method176(int arg0, int arg1) {
        field523++;
        class167 var2 = class208.method1430(arg0, arg1, (byte) -117);
        var2.method1166((byte) -73);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Z")
    public final boolean method177(byte arg0) {
        field532++;
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != 42) {
            field537 = null;
        }
        while (var3 < 5) {
            if (this.field531[var3] != -1 && !class45.field723.method807(this.field531[var3], 0, -125)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static void method178(byte arg0) {
        field529 = null;
        field533 = null;
        field537 = null;
        field528 = null;
        if (arg0 != 107) {
            method179(true, (class158[]) null, (class158[]) null, (class158[]) null, (class254[]) null, (class111) null, (class158[]) null);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z[Ljg;[Ljg;[Ljg;[Lg;Lu;[Ljg;)V")
    public static final void method179(boolean arg0, class158[] arg1, class158[] arg2, class158[] arg3, class254[] arg4, class111 arg5, class158[] arg6) {
        class50.field797 = arg4;
        class264.field4620 = arg1;
        class138.field2322 = arg3;
        class146.field2441 = arg2;
        class183.field3027 = arg5;
        class34.field514 = arg6;
        class141.field2367.method1708(2);
        if (!arg0) {
            field529 = null;
        }
        int var7 = class183.field3027.method810(class37.field569, -1);
        int[] var8 = class183.field3027.method831(-128, var7);
        field515++;
        for (int var9 = 0; var9 < var8.length; var9++) {
            class141.field2367.method1709(-108, class20.method101(7071, new class121(class183.field3027.method828(var7, (byte) 116, var8[var9]))));
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
    public static final void method180(boolean arg0, int arg1) {
        field518++;
        if (class247.field4276 == null) {
            return;
        }
        try {
            if (arg1 != -28603) {
                field537 = null;
            }
            class121 var2 = new class121(4);
            var2.method919(-4742, arg0 ? 2 : 3);
            var2.method883(0, (byte) 114);
            class247.field4276.method840(0, -782, var2.field2014, 4);
        } catch (IOException var4) {
            try {
                class247.field4276.method838(arg1 ^ 0x6FC7);
            } catch (Exception var3) {
            }
            class22.field332++;
            class247.field4276 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILlb;I)V")
    private final void method181(int arg0, class121 arg1, int arg2) {
        field538++;
        if (arg2 == 1) {
            this.field526 = arg1.method897(-31);
        } else if (arg2 == 2) {
            int var4 = arg1.method897(-68);
            this.field530 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field530[var5] = arg1.method876(false);
            }
        } else if (arg2 == 3) {
            this.field535 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method897(-118);
            this.field519 = new short[var6];
            this.field539 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field539[var7] = (short) arg1.method876(false);
                this.field519[var7] = (short) arg1.method876(false);
            }
        } else if (arg2 == 41) {
            int var8 = arg1.method897(-75);
            this.field536 = new short[var8];
            this.field527 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field527[var9] = (short) arg1.method876(false);
                this.field536[var9] = (short) arg1.method876(false);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field531[arg2 - 60] = arg1.method876(false);
        }
        if (arg0 > -58) {
            field516 = -4;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lma;")
    public final class178 method182(int arg0) {
        if (arg0 <= 19) {
            this.method181(69, (class121) null, 71);
        }
        field522++;
        class178[] var2 = new class178[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field531[var4] != -1) {
                var2[var3++] = class178.method1267(class45.field723, this.field531[var4], 0);
            }
        }
        class178 var5 = new class178(var2, var3);
        if (this.field539 != null) {
            for (int var6 = 0; var6 < this.field539.length; var6++) {
                var5.method1260(this.field539[var6], this.field519[var6]);
            }
        }
        if (this.field527 != null) {
            for (int var7 = 0; var7 < this.field527.length; var7++) {
                var5.method1245(this.field527[var7], this.field536[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lma;")
    public final class178 method183(int arg0) {
        field534++;
        if (this.field530 == null) {
            return null;
        }
        class178[] var2 = new class178[this.field530.length];
        int var3 = 0;
        int var4 = 86 / ((arg0 + 33) / 39);
        while (this.field530.length > var3) {
            var2[var3] = class178.method1267(class45.field723, this.field530[var3], 0);
            var3++;
        }
        class178 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class178(var2, var2.length);
        }
        if (this.field539 != null) {
            for (int var6 = 0; var6 < this.field539.length; var6++) {
                var5.method1260(this.field539[var6], this.field519[var6]);
            }
        }
        if (this.field527 != null) {
            for (int var7 = 0; var7 < this.field527.length; var7++) {
                var5.method1245(this.field527[var7], this.field536[var7]);
            }
        }
        return var5;
    }
}
