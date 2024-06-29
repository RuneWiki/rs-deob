import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class209 extends class153 {

    @OriginalMember(owner = "client!va", name = "Sb", descriptor = "Lhi;")
    public static class82 field3678 = class95.method664((byte) -83, "logo");

    @OriginalMember(owner = "client!va", name = "Rb", descriptor = "Lhi;")
    private static class82 field3677 = class95.method664((byte) -87, " from your ignore list first)3");

    @OriginalMember(owner = "client!va", name = "Wb", descriptor = "[F")
    public static float[] field3682 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!va", name = "Pb", descriptor = "Lhi;")
    public static class82 field3675 = field3677;

    @OriginalMember(owner = "client!va", name = "Xb", descriptor = "Lhi;")
    public static class82 field3683 = class95.method664((byte) -27, " ");

    @OriginalMember(owner = "client!va", name = "Vb", descriptor = "I")
    public static int field3681 = 1;

    @OriginalMember(owner = "client!va", name = "Eb", descriptor = "Lhi;")
    public static class82 field3664 = class95.method664((byte) -82, " weitere Optionen");

    @OriginalMember(owner = "client!va", name = "Ob", descriptor = "I")
    public static int field3674 = 0;

    @OriginalMember(owner = "client!va", name = "Db", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!va", name = "Fb", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!va", name = "Gb", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!va", name = "Hb", descriptor = "I")
    private int field3667;

    @OriginalMember(owner = "client!va", name = "Ib", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!va", name = "Lb", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!va", name = "Mb", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!va", name = "Nb", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!va", name = "Tb", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!va", name = "Ub", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!va", name = "Yb", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!va", name = "Zb", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!va", name = "ac", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!va", name = "bc", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!va", name = "Qb", descriptor = "Lum;")
    public static class222 field3676;

    @OriginalMember(owner = "client!va", name = "Jb", descriptor = "Lai;")
    private class262 field3669;

    @OriginalMember(owner = "client!va", name = "Kb", descriptor = "Lhi;")
    public static class82 field3670;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "(I)V", line = 8)
    public final void method1495(int arg0) {
        this.field3667 = this.field2611 * 8;
        field3685++;
        if (arg0 > -62) {
            method1498(-79, -107, 118, 38, 46, -58);
        }
    }

    @OriginalMember(owner = "client!va", name = "x", descriptor = "(I)V", line = 20)
    public static final void method1496(int arg0) {
        class277.field4660 = new class75[class93.field1695.method1597(-1)][];
        field3679++;
        if (arg0 >= 4) {
            class69.field1086 = new boolean[class93.field1695.method1597(-1)];
        }
    }

    @OriginalMember(owner = "client!va", name = "p", descriptor = "(II)I", line = 32)
    public final int method1497(int arg0, int arg1) {
        if (arg0 != 128) {
            field3682 = (float[]) null;
        }
        field3680++;
        return arg1 * 8 - this.field3667;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIII)Z", line = 42)
    public static final boolean method1498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class286.field4816[arg0][var8][var9] == -class14.field109) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class245.field4255[arg0][arg1][arg3] + arg5;
            if (!class160.method1163(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class160.method1163(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class160.method1163(var10, var12, var14)) {
                return false;
            } else if (class160.method1163(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class305.method2107(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class160.method1163(var6 + 1, class245.field4255[arg0][arg1][arg3] + arg5, var7 + 1) && class160.method1163(var6 + 128 - 1, class245.field4255[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class160.method1163(var6 + 128 - 1, class245.field4255[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class160.method1163(var6 + 1, class245.field4255[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(BI)I", line = 126)
    public final int method1499(byte arg0, int arg1) {
        field3665++;
        int var3 = this.field3667 >> 3;
        int var4 = 8 - (this.field3667 & 0x7);
        this.field3667 += arg1;
        int var5 = 0;
        while (var4 < arg1) {
            var5 += (class311.field5316[var4] & this.field2598[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6 = 36 % ((57 - arg0) / 44);
        int var7;
        if (arg1 == var4) {
            var7 = (this.field2598[var3] & class311.field5316[var4]) + var5;
        } else {
            var7 = (this.field2598[var3] >> var4 - arg1 & class311.field5316[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!va", name = "y", descriptor = "(I)V", line = 156)
    public static final void method1500(int arg0) {
        class181 var1 = (class181) class68.field1055.method1936(16173);
        field3687++;
        while (var1 != null) {
            if (var1.field3099 == -1) {
                var1.field3082 = 0;
                class183.method1270(var1, (byte) 109);
            } else {
                var1.method961((byte) 74);
            }
            var1 = (class181) class68.field1055.method1926((byte) 90);
        }
        int var2 = -103 % ((-arg0 - 86) / 37);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([II)V", line = 180)
    public final void method1501(int[] arg0, int arg1) {
        this.field3669 = new class262(arg0);
        field3666++;
        if (arg1 < 31) {
            this.method1506(-73);
        }
    }

    @OriginalMember(owner = "client!va", name = "z", descriptor = "(I)V", line = 191)
    public static final void method1502(int arg0) {
        field3671++;
        if (!class187.field3153) {
            class135.field2333[0] = 1007;
            if (class238.field4147 != 0) {
                class45.field775 = class222.field3838;
                class27.field360 = class231.field3980;
            } else if (class229.field3953 == 0) {
                class45.field775 = class211.field3702;
                class27.field360 = class202.field3471;
            } else {
                class45.field775 = class166.field2904;
                class27.field360 = class255.field4394;
            }
            class309.field5262 = 1;
            class327.field5589[0] = class93.field1682;
            class157.field2727[0] = class129.field2247;
        }
        class295.method2036((long) class212.field3708);
        if (class255.field4382 != -1) {
            class150.method1034(arg0 ^ 0x9C5, class255.field4382);
        }
        for (int var1 = 0; var1 < class254.field4381; var1++) {
            if (class276.field4639[var1]) {
                class302.field5151[var1] = true;
            }
            class198.field3389[var1] = class276.field4639[var1];
            class276.field4639[var1] = false;
        }
        class279.field4685 = null;
        class281.field4729 = -1;
        class5.field45 = -1;
        if (class147.field2485) {
            class74.field1131 = true;
        }
        class133.field2311 = null;
        if (arg0 != 13923) {
            return;
        }
        class287.field4829 = class212.field3708;
        if (class255.field4382 != -1) {
            class254.field4381 = 0;
            class163.method1172(0, class255.field4382, 0, -1, class180.field3078, class260.field4462, 0, 0, (byte) -127);
        }
        if (class147.field2485) {
            class116.method790();
        } else {
            class320.method2208();
        }
        class160.method1161(24909);
        if (class187.field3153) {
            class135.method924(-25101);
        } else if (class133.field2311 != null) {
            class99.method681(class193.field3261, class113.field2038, class133.field2311, (byte) 121);
        } else if (class5.field45 != -1) {
            class99.method681(class5.field45, class281.field4729, (class75) null, (byte) 109);
        }
        if (class207.field3620 == 3) {
            for (int var2 = 0; var2 < class254.field4381; var2++) {
                if (class198.field3389[var2]) {
                    if (class147.field2485) {
                        class116.method795(class290.field4880[var2], class25.field339[var2], class191.field3214[var2], class117.field2058[var2], 16711935, 128);
                    } else {
                        class320.method2199(class290.field4880[var2], class25.field339[var2], class191.field3214[var2], class117.field2058[var2], 16711935, 128);
                    }
                } else if (class302.field5151[var2]) {
                    if (class147.field2485) {
                        class116.method795(class290.field4880[var2], class25.field339[var2], class191.field3214[var2], class117.field2058[var2], 16711680, 128);
                    } else {
                        class320.method2199(class290.field4880[var2], class25.field339[var2], class191.field3214[var2], class117.field2058[var2], 16711680, 128);
                    }
                }
            }
        }
        class227.method1619(30586, class168.field2932.field1689, class243.field4229, class297.field5058, class168.field2932.field1685);
        class243.field4229 = 0;
    }

    @OriginalMember(owner = "client!va", name = "A", descriptor = "(I)I", line = 318)
    public final int method1503(int arg0) {
        field3673++;
        if (arg0 < 107) {
            this.field3669 = (class262) null;
        }
        return this.field2598[this.field2611++] - this.field3669.method1865(7) & 0xFF;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V", line = 336)
    public class209(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!va", name = "q", descriptor = "(II)V", line = 346)
    public final void method1504(int arg0, int arg1) {
        this.field2598[this.field2611++] = (byte) (this.field3669.method1865(7) + arg0);
        field3668++;
        if (arg1 != -1) {
            field3681 = 91;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([BIIB)V", line = 357)
    public final void method1505(byte[] arg0, int arg1, int arg2, byte arg3) {
        field3686++;
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[arg2 + var5] = (byte) (this.field2598[this.field2611++] - this.field3669.method1865(7));
        }
        if (arg3 != -58) {
            this.field3667 = 9;
        }
    }

    @OriginalMember(owner = "client!va", name = "B", descriptor = "(I)V", line = 400)
    public final void method1506(int arg0) {
        if (arg0 >= -31) {
            field3683 = (class82) null;
        }
        field3672++;
        this.field2611 = (this.field3667 + 7) / 8;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZB)V", line = 411)
    public static final void method1507(boolean arg0, byte arg1) {
        field3663++;
        if ((class168.field2932.field1685 >> 7) == class111.field2008 && (class168.field2932.field1689 >> 7) == class38.field634) {
            class111.field2008 = 0;
        }
        int var2 = class297.field5054;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class81 var4;
            long var5;
            if (arg0) {
                var4 = class168.field2932;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class310.field5292[var3] << 32;
                var4 = class29.field405[class310.field5292[var3]];
            }
            if (var4 != null && var4.method516(0)) {
                int var7 = var4.field1685 >> 7;
                int var8 = var4.field1689 >> 7;
                var4.field1408 = false;
                if ((class244.field4232 && class297.field5054 > 200 || class297.field5054 > 50) && !arg0 && var4.field1703 == var4.field1668) {
                    var4.field1408 = true;
                }
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field1397 == null || var4.field1413 > class212.field3708 || var4.field1398 <= class212.field3708) {
                        if (var4.method520(true) == 1 && (var4.field1685 & 0x7F) == 64 && (var4.field1689 & 0x7F) == 64) {
                            if (class34.field532[var7][var8] == class47.field789) {
                                continue;
                            }
                            class34.field532[var7][var8] = class47.field789;
                        }
                        var4.field1657 = class21.method145(var4.field1685, var4.field1689, class297.field5058, (byte) 27);
                        class321.method2224(class297.field5058, var4.field1685, var4.field1689, var4.field1657, (var4.method520(true) - 1) * 64 + 60, var4, var4.field1704, var5, var4.field1705);
                    } else {
                        var4.field1408 = false;
                        var4.field1657 = class21.method145(var4.field1685, var4.field1689, class297.field5058, (byte) -120);
                        class80.method509(class297.field5058, var4.field1685, var4.field1689, var4.field1657, var4, var4.field1704, var5, var4.field1376, var4.field1410, var4.field1383, var4.field1386);
                    }
                }
            }
        }
        if (arg1 != 60) {
            method1502(8);
        }
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(B)V", line = 505)
    public static void method1508(byte arg0) {
        field3677 = null;
        field3678 = null;
        field3664 = null;
        int var1 = -113 / ((arg0 - 78) / 32);
        field3683 = null;
        field3676 = null;
        field3682 = null;
        field3675 = null;
        field3670 = null;
    }
}
