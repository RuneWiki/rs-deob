import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class13 extends class72 {

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public int field216 = -1;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public int field221 = -1;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public int field225 = 2;

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
    public int field229 = 5;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public int field228 = -1;

    @OriginalMember(owner = "client!c", name = "sb", descriptor = "I")
    public int field242 = -1;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    public int field226 = -1;

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "I")
    public int field241 = 99;

    @OriginalMember(owner = "client!c", name = "yb", descriptor = "Z")
    public boolean field248 = false;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "Lec;")
    public static class28 field214 = class28.method210(-46, "Earlier today");

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
    public static volatile int field230 = 0;

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "Lec;")
    public static class28 field231 = class28.method210(-46, ")3");

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "Lec;")
    public static class28 field235 = class28.method210(-46, "q8_full");

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!c", name = "tb", descriptor = "Z")
    public static boolean field243 = false;

    @OriginalMember(owner = "client!c", name = "wb", descriptor = "Lec;")
    public static class28 field246 = class28.method210(-46, "::clientdrop");

    @OriginalMember(owner = "client!c", name = "xb", descriptor = "Lec;")
    public static class28 field247 = class28.method210(-46, "@or3@");

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!c", name = "nb", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "Lea;")
    public static class26 field215;

    @OriginalMember(owner = "client!c", name = "mb", descriptor = "Lqa;")
    public static class96 field236;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "[I")
    public int[] field223;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "[I")
    private int[] field227;

    @OriginalMember(owner = "client!c", name = "ub", descriptor = "[I")
    private int[] field244;

    @OriginalMember(owner = "client!c", name = "vb", descriptor = "[I")
    public int[] field245;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLfb;I)Lfb;")
    public final class33 method68(byte arg0, class33 arg1, int arg2) {
        field224++;
        int var4 = this.field245[arg2];
        class98 var5 = class69.method541(arg0 + 251, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method283(true);
        } else if (arg0 == -128) {
            class33 var7 = arg1.method283(!var5.method702(var6, -30624));
            var7.method271(var5, var6);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BILfb;)Lfb;")
    public final class33 method69(byte arg0, int arg1, class33 arg2) {
        field238++;
        int var4 = this.field245[arg1];
        class98 var5 = class69.method541(126, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method283(true);
        }
        class98 var7 = null;
        int var8 = 0;
        if (this.field227 != null && arg1 < this.field227.length) {
            int var9 = this.field227[arg1];
            var7 = class69.method541(122, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class33 var11 = arg2.method283(!var5.method702(var6, -30624));
            var11.method271(var5, var6);
            return var11;
        }
        class33 var10 = arg2.method283(!var5.method702(var6, -30624) & !var7.method702(var8, -30624));
        if (arg0 != -86) {
            this.method76(null, -35);
        }
        var10.method271(var5, var6);
        var10.method271(var7, var8);
        return var10;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BJ)V")
    public static final void method70(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 <= -56) {
            field220++;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lud;II)V")
    private final void method71(class119 arg0, int arg1, int arg2) {
        field222++;
        if (arg1 >= -13) {
            return;
        }
        if (arg2 == 1) {
            int var9 = arg0.method879((byte) 45);
            this.field223 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field223[var10] = arg0.method903(2);
            }
            this.field245 = new int[var9];
            for (int var11 = 0; var11 < var9; var11++) {
                this.field245[var11] = arg0.method903(2);
            }
            for (int var12 = 0; var12 < var9; var12++) {
                this.field245[var12] += arg0.method903(2) << 16;
            }
        } else if (arg2 == 2) {
            this.field228 = arg0.method903(2);
        } else if (arg2 == 3) {
            int var4 = arg0.method879((byte) 45);
            this.field244 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field244[var5] = arg0.method879((byte) 45);
            }
            this.field244[var4] = 9999999;
        } else if (arg2 == 4) {
            this.field248 = true;
        } else if (arg2 == 5) {
            this.field229 = arg0.method879((byte) 45);
        } else if (arg2 == 6) {
            this.field221 = arg0.method903(2);
        } else if (arg2 == 7) {
            this.field216 = arg0.method903(2);
        } else if (arg2 == 8) {
            this.field241 = arg0.method879((byte) 45);
        } else if (arg2 == 9) {
            this.field226 = arg0.method879((byte) 45);
        } else if (arg2 == 10) {
            this.field242 = arg0.method879((byte) 45);
        } else if (arg2 == 11) {
            this.field225 = arg0.method879((byte) 45);
        } else if (arg2 == 12) {
            int var6 = arg0.method879((byte) 45);
            this.field227 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field227[var7] = arg0.method903(2);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field227[var8] += arg0.method903(2) << 16;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILfb;)Lfb;")
    public final class33 method72(int arg0, int arg1, int arg2, class33 arg3) {
        field237++;
        int var5 = this.field245[arg0];
        class98 var6 = class69.method541(arg2 ^ 0x70, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method283(true);
        }
        if (arg2 != 2) {
            this.field248 = false;
        }
        int var8 = arg1 & 0x3;
        class33 var9 = arg3.method283(!var6.method702(var7, -30624));
        if (var8 == 1) {
            var9.method275();
        } else if (var8 == 2) {
            var9.method274();
        } else if (var8 == 3) {
            var9.method284();
        }
        var9.method271(var6, var7);
        if (var8 == 1) {
            var9.method284();
        } else if (var8 == 2) {
            var9.method274();
        } else if (var8 == 3) {
            var9.method275();
        }
        return var9;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILn;)I")
    public static final int method73(int arg0, int arg1, class78 arg2) {
        field219++;
        if (arg0 != 3645) {
            method78((byte) -101);
        }
        if (arg2.field1805 == null || arg2.field1805.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg2.field1805[arg1];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var9 = class30.field650[var3[var6++]];
                }
                if (var7 == 2) {
                    var9 = class76.field1693[var3[var6++]];
                }
                if (var7 == 3) {
                    var9 = class5.field95[var3[var6++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class78 var12 = class5.method27(0, var11);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class129.method992(var13, -2).field2783 || class74.field1640)) {
                        for (int var14 = 0; var14 < var12.field1795.length; var14++) {
                            if (var13 + 1 == var12.field1795[var14]) {
                                var9 += var12.field1792[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class36.field818[var3[var6++]];
                }
                if (var7 == 6) {
                    var9 = class48.field1104[class76.field1693[var3[var6++]] - 1];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 7) {
                    var9 = class36.field818[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class37.field848.field927;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class109.field2271[var15]) {
                            var9 += class76.field1693[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class78 var18 = class5.method27(arg0 ^ 0xE3D, var17);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class129.method992(var19, -97).field2783 || class74.field1640)) {
                        for (int var20 = 0; var20 < var18.field1795.length; var20++) {
                            if (var19 + 1 == var18.field1795[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class17.field333;
                }
                if (var7 == 12) {
                    var9 = class92.field2026;
                }
                if (var7 == 13) {
                    int var21 = class36.field818[var3[var6++]];
                    int var22 = var3[var6++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var9 = class103.method726(-99, var23);
                }
                if (var7 == 18) {
                    var9 = (class37.field848.field1446 >> 7) + class18.field366;
                }
                if (var7 == 19) {
                    var9 = (class37.field848.field1501 >> 7) + class87.field1934;
                }
                if (var7 == 20) {
                    var9 = var3[var6++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var4 += var9;
                    }
                    if (var5 == 1) {
                        var4 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var5 == 3) {
                        var4 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lc;Lfb;III)Lfb;")
    public final class33 method74(class13 arg0, class33 arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field245[arg3];
        class98 var7 = class69.method541(116, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        field217++;
        if (var7 == null) {
            return arg0.method68((byte) -128, arg1, arg2);
        }
        if (arg4 != 708184976) {
            this.method72(115, -3, -112, null);
        }
        int var9 = arg0.field245[arg2];
        class98 var10 = class69.method541(125, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class33 var12 = arg1.method283(!var7.method702(var8, -30624));
            var12.method271(var7, var8);
            return var12;
        } else {
            class33 var13 = arg1.method283(!var7.method702(var8, arg4 - 708215600) & !var10.method702(var11, -30624));
            var13.method261(var7, var8, var10, var11, this.field244);
            return var13;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILfb;B)Lfb;")
    public final class33 method75(int arg0, class33 arg1, byte arg2) {
        if (arg2 != -55) {
            this.method74(null, null, -34, -45, 79);
        }
        int var4 = this.field245[arg0];
        class98 var5 = class69.method541(125, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        field233++;
        if (var5 == null) {
            return arg1.method281(true);
        } else {
            class33 var7 = arg1.method281(!var5.method702(var6, -30624));
            var7.method271(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lud;I)V")
    public final void method76(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method879((byte) 45);
            if (var3 == 0) {
                field232++;
                if (arg1 > -92) {
                    this.method77((byte) 51);
                    return;
                }
                return;
            }
            this.method71(arg0, -126, var3);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
    public final void method77(byte arg0) {
        field218++;
        if (this.field242 == -1) {
            if (this.field244 == null) {
                this.field242 = 0;
            } else {
                this.field242 = 2;
            }
        }
        if (arg0 >= -62) {
            field231 = null;
        }
        if (this.field226 != -1) {
            return;
        }
        if (this.field244 == null) {
            this.field226 = 0;
        } else {
            this.field226 = 2;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)V")
    public static void method78(byte arg0) {
        field215 = null;
        field246 = null;
        field247 = null;
        field235 = null;
        if (arg0 != 78) {
            field246 = null;
        }
        field236 = null;
        field214 = null;
        field231 = null;
    }
}
