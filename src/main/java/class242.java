import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class242 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lnj;")
    private class144 field3850 = new class144(256);

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Lnj;")
    private class144 field3866 = new class144(256);

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Llc;")
    private class86 field3857;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Llc;")
    private class86 field3855;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3859 = 0;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field3862 = -1;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field3865 = 0;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3864 = null;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Llc;")
    public static class86 field3868;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Z")
    public static boolean field3869;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static final void method1690(int arg0) {
        if (arg0 != 1) {
            method1694(52, -56, (byte) -35);
        }
        class129.field1983.method1556((byte) 127);
        field3861++;
        class155.field2555.method1556((byte) 81);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[IZ)Lwe;")
    private final class15 method1691(int arg0, int arg1, int[] arg2, boolean arg3) {
        field3852++;
        int var5 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFB);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class15 var9 = (class15) this.field3866.method1034(var7, (byte) 21);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            if (!arg3) {
                field3865 = 23;
            }
            class74 var10 = class74.method540(this.field3855, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class15 var11 = var10.method539();
            this.field3866.method1032(false, var11, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field169.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([IIIZ)Lwe;")
    private final class15 method1692(int[] arg0, int arg1, int arg2, boolean arg3) {
        field3851++;
        int var5 = arg2 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF2);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class15 var9 = (class15) this.field3866.method1034(var7, (byte) 21);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class292 var10 = (class292) this.field3850.method1034(var7, (byte) 21);
            if (var10 == null) {
                var10 = class292.method1974(this.field3857, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3850.method1032(false, var10, var7);
            }
            class15 var11 = var10.method1980(arg0);
            if (var11 == null) {
                return null;
            } else if (arg3) {
                var10.method1922(-1);
                this.field3866.method1032(false, var11, var7);
                return var11;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI[I)Lwe;")
    public final class15 method1693(byte arg0, int arg1, int[] arg2) {
        if (arg0 > 0) {
            this.method1695(14, (int[]) null, (byte) 113);
        }
        field3854++;
        if (this.field3857.method631(-128) == 1) {
            return this.method1692(arg2, 0, arg1, true);
        } else if (this.field3857.method617((byte) 103, arg1) == 1) {
            return this.method1692(arg2, arg1, 0, true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1694(int arg0, int arg1, byte arg2) {
        field3856++;
        if (!class206.field3315) {
            return false;
        }
        if (arg2 != -70) {
            method1697(-95, -55, -48, -79, (class286[][][]) null, true);
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class113.field1631[var3] == null || class113.field1631[var3][var4] == null) {
            return false;
        }
        class131 var5 = class113.field1631[var3][var4];
        if (arg1 == -1 && var5.field2150 == 0) {
            for (int var6 = 0; var6 < class243.field3890; var6++) {
                if (class207.field3318[var6] == 39 || class207.field3318[var6] == 1004 || class207.field3318[var6] == 19 || class207.field3318[var6] == 25 || class207.field3318[var6] == 8) {
                    for (class131 var7 = class122.method891(class77.field1108[var6], (byte) -126); var7 != null; var7 = class84.method608(var7, 10177)) {
                        if (var5.field2073 == var7.field2073) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class243.field3890; var8++) {
                if (class276.field4425[var8] == arg1 && class77.field1108[var8] == var5.field2073 && (class207.field3318[var8] == 39 || class207.field3318[var8] == 1004 || class207.field3318[var8] == 19 || class207.field3318[var8] == 25 || class207.field3318[var8] == 8)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[IB)Lwe;")
    public final class15 method1695(int arg0, int[] arg1, byte arg2) {
        field3867++;
        int var4 = -46 / ((arg2 + 40) / 46);
        if (this.field3855.method631(-126) == 1) {
            return this.method1691(arg0, 0, arg1, true);
        } else if (this.field3855.method617((byte) 56, arg0) == 1) {
            return this.method1691(0, arg0, arg1, true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IC)C")
    public static final char method1696(int arg0, char arg1) {
        field3860++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else {
            int var2 = -57 % ((arg0 - 44) / 54);
            if (arg1 == 'ß') {
                return 's';
            } else if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII[[[Lkc;Z)Z")
    public static final boolean method1697(int arg0, int arg1, int arg2, int arg3, class286[][][] arg4, boolean arg5) {
        field3853++;
        byte var6 = arg5 ? 1 : (byte) (class230.field3707 & 0xFF);
        if (class105.field1533[class58.field826][arg1][arg3] == var6) {
            return false;
        } else if ((class86.field1277[class58.field826][arg1][arg3] & 0x4) == 0) {
            return false;
        } else if (arg2 > -3) {
            return false;
        } else {
            byte var7 = 0;
            class100.field1468[var7] = arg1;
            int var31 = var7 + 1;
            class154.field2542[var7] = arg3;
            class105.field1533[class58.field826][arg1][arg3] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class100.field1468[var8] & 0xFFFF;
                int var10 = class100.field1468[var8] >> 24 & 0xFF;
                int var11 = class100.field1468[var8] >> 16 & 0xFF;
                int var12 = class154.field2542[var8] & 0xFFFF;
                boolean var13 = false;
                if ((class86.field1277[class58.field826][var9][var12] & 0x4) == 0) {
                    var13 = true;
                }
                int var14 = (class154.field2542[var8] & 0xFFAECB) >> 16;
                boolean var15 = false;
                label229: for (int var16 = class58.field826 + 1; var16 <= 3; var16++) {
                    if ((class86.field1277[var16][var9][var12] & 0x8) == 0) {
                        if (var13 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field4526 != null) {
                                int var19 = class174.method1313(false, var11);
                                if (arg4[var16][var9][var12].field4526.field1462 == var19 || arg4[var16][var9][var12].field4526.field1453 == var19) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var20 = class174.method1313(false, var10);
                                    if (arg4[var16][var9][var12].field4526.field1462 == var20 || arg4[var16][var9][var12].field4526.field1453 == var20) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var21 = class174.method1313(false, var14);
                                    if (arg4[var16][var9][var12].field4526.field1462 == var21 || arg4[var16][var9][var12].field4526.field1453 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var12].field4530 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var9][var12].field4541; var22++) {
                                    int var23 = (int) (arg4[var16][var9][var12].field4530[var22].field2683 >> 14 & 0x3FL);
                                    int var24 = (int) (arg4[var16][var9][var12].field4530[var22].field2683 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var23 | var24 << 6;
                                    if (var11 == var25 || var10 != 0 && var10 == var25 || var14 != 0 && var14 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class286 var26 = arg4[var16][var9][var12];
                        if (var26 != null && var26.field4541 > 0) {
                            for (int var27 = 0; var27 < var26.field4541; var27++) {
                                class166 var28 = var26.field4530[var27];
                                if (var28.field2688 != var28.field2678 || var28.field2692 != var28.field2684) {
                                    for (int var29 = var28.field2678; var29 <= var28.field2688; var29++) {
                                        for (int var30 = var28.field2684; var30 <= var28.field2692; var30++) {
                                            class105.field1533[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class105.field1533[var16][var9][var12] = var6;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (var15) {
                    int var17 = var9 << 7;
                    if (class220.field3533[class58.field826 + 1][var9][var12] > class241.field3848[arg0]) {
                        class241.field3848[arg0] = class220.field3533[class58.field826 + 1][var9][var12];
                    }
                    if (var17 < class220.field3530[arg0]) {
                        class220.field3530[arg0] = var17;
                    } else if (var17 > class174.field2832[arg0]) {
                        class174.field2832[arg0] = var17;
                    }
                    int var18 = var12 << 7;
                    if (var18 < class3.field32[arg0]) {
                        class3.field32[arg0] = var18;
                    } else if (class159.field2604[arg0] < var18) {
                        class159.field2604[arg0] = var18;
                    }
                }
                if (!var13) {
                    if (var9 >= 1 && class105.field1533[class58.field826][var9 - 1][var12] != var6) {
                        class100.field1468[var31] = class244.method1747(class244.method1747(1179648, var9 - 1), -754974720);
                        class154.field2542[var31] = class244.method1747(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class105.field1533[class58.field826][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var9 - 1 >= 0 && class105.field1533[class58.field826][var9 - 1][var12] != var6 && (class86.field1277[class58.field826][var9][var12] & 0x4) == 0 && (class86.field1277[class58.field826][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class100.field1468[var31] = class244.method1747(1375731712, class244.method1747(var9 - 1, 1179648));
                            class154.field2542[var31] = class244.method1747(var12, 1245184);
                            class105.field1533[class58.field826][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class105.field1533[class58.field826][var9][var12] != var6) {
                            class100.field1468[var31] = class244.method1747(318767104, class244.method1747(var9, 5373952));
                            class154.field2542[var31] = class244.method1747(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class105.field1533[class58.field826][var9][var12] = var6;
                        }
                        if (var9 + 1 < 104 && class105.field1533[class58.field826][var9 + 1][var12] != var6 && (class86.field1277[class58.field826][var9][var12] & 0x4) == 0 && (class86.field1277[class58.field826][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class100.field1468[var31] = class244.method1747(class244.method1747(var9 + 1, 5373952), -1845493760);
                            class154.field2542[var31] = class244.method1747(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class105.field1533[class58.field826][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < 104 && class105.field1533[class58.field826][var9 + 1][var12] != var6) {
                        class100.field1468[var31] = class244.method1747(class244.method1747(9568256, var9 + 1), 1392508928);
                        class154.field2542[var31] = class244.method1747(9633792, var12);
                        class105.field1533[class58.field826][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class105.field1533[class58.field826][var9 - 1][var12] != var6 && (class86.field1277[class58.field826][var9][var12] & 0x4) == 0 && (class86.field1277[class58.field826][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class100.field1468[var31] = class244.method1747(301989888, class244.method1747(var9 - 1, 13762560));
                            class154.field2542[var31] = class244.method1747(13828096, var12);
                            class105.field1533[class58.field826][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class105.field1533[class58.field826][var9][var12] != var6) {
                            class100.field1468[var31] = class244.method1747(-1828716544, class244.method1747(13762560, var9));
                            class154.field2542[var31] = class244.method1747(var12, 13828096);
                            class105.field1533[class58.field826][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class105.field1533[class58.field826][var9 + 1][var12] != var6 && (class86.field1277[class58.field826][var9][var12] & 0x4) == 0 && (class86.field1277[class58.field826][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class100.field1468[var31] = class244.method1747(class244.method1747(var9 + 1, 9568256), -771751936);
                            class154.field2542[var31] = class244.method1747(9633792, var12);
                            class105.field1533[class58.field826][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class241.field3848[arg0] != -1000000) {
                class241.field3848[arg0] += 10;
                class220.field3530[arg0] -= 50;
                class174.field2832[arg0] += 50;
                class159.field2604[arg0] += 50;
                class3.field32[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method1698(byte arg0) {
        field3864 = null;
        field3868 = null;
        int var1 = 100 % ((arg0 - 60) / 56);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Llc;Llc;)V")
    public class242(class86 arg0, class86 arg1) {
        this.field3857 = arg1;
        this.field3855 = arg0;
    }
}
