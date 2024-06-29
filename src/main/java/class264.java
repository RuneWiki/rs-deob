import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class264 {

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    private int field4680 = 0;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Ldl;")
    private class31 field4693;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Lli;")
    public static class185 field4690 = class245.method1649("http:)4)4", -65);

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lli;")
    public static class185 field4689 = null;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lhi;")
    public static class250 field4684;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lua;")
    private class73 field4691;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[[[Lk;")
    public static class198[][][] field4687;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4688++;
        boolean var11;
        if (class242.field4323 > 0 && (class242.field4323 % 10) < 5) {
            var11 = true;
        } else {
            var11 = false;
        }
        int var12 = arg10 - arg5;
        if (arg9 != 15145) {
            field4689 = null;
        }
        int var13 = arg6 - arg3;
        int var14 = 983040 / arg0;
        int var15 = 983040 / arg4;
        for (int var16 = -var14; var16 < (var13 + var14); var16++) {
            int var18 = arg0 * var16 + arg1 >> 16;
            int var19 = (var16 + 1) * arg0 + arg1 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg8 + var19;
                int var22 = arg8 + var18;
                int var23 = var16 + arg3 >> 6;
                if (var23 >= 0 && var23 <= (class232.field4179.length - 1)) {
                    int[][] var24 = class232.field4179[var23];
                    for (int var25 = -var15; var25 < (var12 + var15); var25++) {
                        int var26 = arg4 * var25 + arg7 >> 16;
                        int var27 = (var25 + 1) * arg4 + arg7 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            int var29 = arg2 + var26;
                            var10000 = arg2 + var27;
                            int var31 = arg5 + var25 >> 6;
                            if (var31 >= 0 && var24.length - 1 >= var31 && var24[var31] != null) {
                                int var32 = ((arg5 + var25 & 0x3F) << 6) + (arg3 + var16 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class135 var34 = class184.method1294(var33 - 1, -28916);
                                    if (!class196.field3590[var34.field2477]) {
                                        if (var11 && class56.field957 == var34.field2477) {
                                            class39 var35 = new class39();
                                            var35.field614 = var29;
                                            var35.field615 = var34.field2477;
                                            var35.field619 = var22;
                                            class205.field3752.method1382(var35, (byte) -41);
                                        } else {
                                            class183.field3375[var34.field2477].method707(var22 - 7, var29 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class39 var17 = (class39) class205.field3752.method1375(16259); var17 != null; var17 = (class39) class205.field3752.method1377(-19546)) {
            class183.field3375[var17.field615].method707(var17.field619 - 7, var17.field614 + -7);
            class159.method1137(var17.field619, var17.field614, 15, 16776960, 128);
            class159.method1137(var17.field619, var17.field614, 7, 16777215, 256);
        }
        class205.field3752.method1383((byte) 99);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method1798(int arg0) {
        field4676++;
        if (class275.field4877 != -1) {
            class138.method984(class275.field4877, (byte) -118);
        }
        for (int var1 = 0; var1 < class185.field3410; var1++) {
            if (class44.field700[var1]) {
                class274.field4855[var1] = true;
            }
            class226.field4127[var1] = class44.field700[var1];
            class44.field700[var1] = false;
        }
        class263.field4663 = null;
        if (arg0 != -3) {
            method1801(-35);
        }
        class191.field3541 = class211.field3851;
        class223.field4094 = -1;
        class206.field3772 = -1;
        if (class275.field4877 != -1) {
            class185.field3410 = 0;
            class96.method619(0, 0, class148.field2796, -1, (byte) 121, 0, class204.field3738, 0, class275.field4877);
        }
        class159.method1141();
        class224.field4111 = 0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static final void method1799(byte arg0) {
        if (arg0 >= -117) {
            field4679 = 77;
        }
        field4675++;
        if (class108.field1941 != null || class149.field2813 != null) {
            return;
        }
        int var1 = class260.field4623;
        if (!class112.field2027) {
            if (var1 == 1 && class127.field2283 > 0) {
                short var2 = class55.field936[class127.field2283 - 1];
                if (var2 == 51 || var2 == 33 || var2 == 11 || var2 == 44 || var2 == 2 || var2 == 36 || var2 == 43 || var2 == 58 || var2 == 31 || var2 == 50 || var2 == 9 || var2 == 1001) {
                    int var3 = class49.field809[class127.field2283 - 1];
                    int var4 = class78.field1353[class127.field2283 - 1];
                    class82 var5 = class116.method805(1, var3);
                    if (class259.method1757(client.method1502(var5), -20843) || class148.method1049(client.method1502(var5), -1)) {
                        class196.field3592 = 0;
                        class266.field4714 = false;
                        if (class108.field1941 != null) {
                            class229.method1581(class108.field1941, false);
                        }
                        class108.field1941 = class116.method805(1, var3);
                        class220.field4008 = class161.field3041;
                        class236.field4223 = var4;
                        class45.field710 = class6.field136;
                        class229.method1581(class108.field1941, false);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class48.field784 == 1 && class127.field2283 > 2 || class256.method1745(class127.field2283 - 1, (byte) 84))) {
                var1 = 2;
            }
            if (var1 == 2 && class127.field2283 > 0 || class200.field3671 == 1) {
                class146.method1043(0);
            }
            if (var1 == 1 && class127.field2283 > 0 || class200.field3671 == 2) {
                class106.method751((byte) -78);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var6 = class18.field288;
            int var7 = class32.field528;
            if (var6 < (class90.field1755 - 10) || var6 > (class90.field1755 + class110.field1977 + 10) || class199.field3651 - 10 > var7 || (class97.field1815 + class199.field3651 + 10) < var7) {
                class112.field2027 = false;
                class142.method1017(class199.field3651, class90.field1755, (byte) 119, class110.field1977, class97.field1815);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var8 = class90.field1755;
        int var9 = class161.field3041;
        int var10 = class110.field1977;
        int var11 = class199.field3651;
        int var12 = -1;
        int var13 = class6.field136;
        for (int var14 = 0; var14 < class127.field2283; var14++) {
            int var15;
            if (class176.field3218) {
                var15 = ((class127.field2283 - var14 - 1) * 15) + var11 + 35;
            } else {
                var15 = (class127.field2283 - var14 - 1) * 15 + var11 + 31;
            }
            if (var8 < var9 && (var8 + var10) > var9 && var15 - 13 < var13 && var13 < (var15 + 3)) {
                var12 = var14;
            }
        }
        if (var12 != -1) {
            class113.method784(var12, (byte) 10);
        }
        class112.field2027 = false;
        class142.method1017(class199.field3651, class90.field1755, (byte) 117, class110.field1977, class97.field1815);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
    public static final void method1800(int arg0, int arg1) {
        if (class32.field527 == 0) {
            class113.field2052.method346((byte) -78, arg1);
        } else {
            class23.field381 = arg1;
        }
        if (arg0 > 49) {
            field4692++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static void method1801(int arg0) {
        field4690 = null;
        field4689 = null;
        field4687 = null;
        if (arg0 != 15) {
            method1799((byte) 120);
        }
        field4684 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Lua;")
    public final class73 method1802(byte arg0) {
        int var2 = -5 / ((arg0 + 37) / 38);
        field4683++;
        if (this.field4680 > 0 && this.field4693.field514[this.field4680 - 1] != this.field4691) {
            class73 var3 = this.field4691;
            this.field4691 = var3.field1269;
            return var3;
        }
        while (this.field4680 < this.field4693.field508) {
            class73 var4 = this.field4693.field514[this.field4680++].field1269;
            if (this.field4693.field514[this.field4680 - 1] != var4) {
                this.field4691 = var4.field1269;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)Lua;")
    public final class73 method1803(byte arg0) {
        field4682++;
        if (arg0 >= -114) {
            return null;
        } else {
            this.field4680 = 0;
            return this.method1802((byte) -128);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static final void method1804(boolean arg0) {
        class205.field3767++;
        if (arg0) {
            field4677++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)Lcg;")
    public static final class34 method1805(boolean arg0) {
        class34 var1 = new class34(class87.field1716, class210.field3839, class145.field2766[0], class249.field4418[0], class55.field940[0], class258.field4591[0], class174.field3182[0], class211.field3842);
        if (arg0) {
            field4678++;
            class269.method1827((byte) -90);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ldl;)V")
    public class264(class31 arg0) {
        this.field4693 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Luc;B)V")
    public static final void method1806(class160 arg0, byte arg1) {
        field4686++;
        class95 var2 = null;
        try {
            class29 var3 = arg0.method1155("runescape", (byte) -74);
            while (var3.field487 == 0) {
                class212.method1488(1L, -71);
            }
            if (var3.field487 == 1) {
                var2 = (class95) var3.field486;
                class118 var4 = class104.method736(-28218);
                var2.method616(false, var4.field2115, var4.field2155, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method617((byte) -110);
            }
            if (arg1 >= -69) {
                method1797(-40, 16, -62, 78, -64, -85, -12, -125, -1, 113, 25);
            }
        } catch (Exception var5) {
        }
    }
}
