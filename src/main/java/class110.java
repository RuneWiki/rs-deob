import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class110 extends class262 {

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    private int field1764 = 0;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    private int field1773 = 8192;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    private int field1777 = 2048;

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "I")
    private int field1782 = 2048;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    private int field1767 = 12288;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
    private int field1780 = 0;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    private int field1779 = 4096;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "Lok;")
    public static class146 field1770 = class235.method1724(-12908, "huffman");

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "[I")
    public static int[] field1778 = new int[32];

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "[I")
    public static int[] field1775 = new int[5];

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "[Z")
    public static boolean[] field1763;

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 29)
    public class110() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V", line = 14)
    public final void method43(int arg0) {
        if (arg0 == -2) {
            class73.method543((byte) -87);
            field1769++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBLr;)I", line = 35)
    public static final int method746(int arg0, byte arg1, class264 arg2) {
        int var3 = 47 / ((-arg1 - 14) / 62);
        field1776++;
        if (arg2.field4427 == null || arg0 >= arg2.field4427.length) {
            return -2;
        }
        try {
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            int[] var7 = arg2.field4427[arg0];
            while (true) {
                int var8 = var7[var4++];
                byte var9 = 0;
                int var10 = 0;
                if (var8 == 0) {
                    return var5;
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 1) {
                    var10 = class32.field615[var7[var4++]];
                }
                if (var8 == 2) {
                    var10 = class211.field3491[var7[var4++]];
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 3) {
                    var10 = class183.field3060[var7[var4++]];
                }
                if (var8 == 4) {
                    int var11 = var7[var4++] << 16;
                    int var12 = var11 + var7[var4++];
                    class264 var13 = class98.method680(var12, false);
                    int var14 = var7[var4++];
                    if (var14 != -1 && (!class84.method589(false, var14).field4151 || class202.field3366)) {
                        for (int var15 = 0; var15 < var13.field4437.length; var15++) {
                            if (var14 + 1 == var13.field4437[var15]) {
                                var10 += var13.field4492[var15];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var10 = class75.field1221[var7[var4++]];
                }
                if (var8 == 6) {
                    var10 = class35.field650[class211.field3491[var7[var4++]] - 1];
                }
                if (var8 == 7) {
                    var10 = class75.field1221[var7[var4++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var10 = class102.field1639.field3900;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class79.field1271[var16]) {
                            var10 += class211.field3491[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var7[var4++] << 16;
                    int var18 = var17 + var7[var4++];
                    class264 var19 = class98.method680(var18, false);
                    int var20 = var7[var4++];
                    if (var20 != -1 && (!class84.method589(false, var20).field4151 || class202.field3366)) {
                        for (int var21 = 0; var21 < var19.field4437.length; var21++) {
                            if (var20 + 1 == var19.field4437[var21]) {
                                var10 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var10 = class128.field2086;
                }
                if (var8 == 12) {
                    var10 = class18.field362;
                }
                if (var8 == 13) {
                    int var22 = class75.field1221[var7[var4++]];
                    int var23 = var7[var4++];
                    var10 = (var22 & 0x1 << var23) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var7[var4++];
                    var10 = class75.method549(var24, 18);
                }
                if (var8 == 18) {
                    var10 = (class102.field1639.field5409 >> 7) + class15.field300;
                }
                if (var8 == 19) {
                    var10 = (class102.field1639.field5380 >> 7) + class201.field3357;
                }
                if (var8 == 20) {
                    var10 = var7[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var10;
                    }
                    if (var6 == 1) {
                        var5 -= var10;
                    }
                    if (var6 == 2 && var10 != 0) {
                        var5 /= var10;
                    }
                    if (var6 == 3) {
                        var5 *= var10;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var26) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BZ)V", line = 240)
    public static final void method747(byte arg0, boolean arg1) {
        if (class300.field5075 == null) {
            class300.field5075 = new byte[4][104][104];
        }
        field1781++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class300.field5075[var2][var3][var4] = arg0;
                }
            }
        }
        if (!arg1) {
            method747((byte) -40, true);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lwe;II)V", line = 289)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field1774++;
        if (arg1 != 2048) {
            method746(118, (byte) -37, (class264) null);
        }
        if (arg2 == 0) {
            this.field1777 = arg0.method379(-2);
        } else if (arg2 == 1) {
            this.field1764 = arg0.method379(-2);
        } else if (arg2 == 2) {
            this.field1780 = arg0.method379(-2);
        } else if (arg2 == 3) {
            this.field1782 = arg0.method379(-2);
        } else if (arg2 == 4) {
            this.field1767 = arg0.method379(-2);
        } else if (arg2 == 5) {
            this.field1779 = arg0.method379(-2);
        } else if (arg2 == 6) {
            this.field1773 = arg0.method379(-2);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)Z", line = 368)
    private final boolean method748(int arg0, int arg1, int arg2) {
        field1768++;
        int var4 = (arg0 + arg2) * this.field1767 >> 12;
        if (arg1 != 363278156) {
            this.field1767 = -75;
        }
        int var5 = class15.field309[(var4 * 255 & 0xFF1CA) >> 12];
        int var6 = (var5 << 12) / this.field1767;
        int var7 = (var6 << 12) / this.field1773;
        int var8 = this.field1779 * var7 >> 12;
        return (arg0 - arg2) < var8 && arg0 - arg2 > -var8;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)[I", line = 397)
    public final int[] method38(int arg0, byte arg1) {
        field1771++;
        if (arg1 >= -85) {
            return (int[]) null;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 84);
        if (this.field4350.field3333) {
            int var4 = class312.field5326[arg0] - 2048;
            for (int var5 = 0; var5 < class98.field1598; var5++) {
                int var6 = class210.field3485[var5] - 2048;
                int var7 = this.field1777 + var6;
                int var8 = var6 + this.field1780;
                int var9 = var7 >= -2048 ? var7 : var7 + 4096;
                int var10 = var9 > 2048 ? var9 - 4096 : var9;
                int var11 = var8 >= -2048 ? var8 : var8 + 4096;
                int var12 = this.field1764 + var4;
                int var13 = var12 >= -2048 ? var12 : var12 + 4096;
                int var14 = var13 > 2048 ? var13 - 4096 : var13;
                int var15 = this.field1782 + var4;
                int var16 = var15 < -2048 ? var15 + 4096 : var15;
                int var17 = var16 > 2048 ? var16 - 4096 : var16;
                int var18 = var11 <= 2048 ? var11 : var11 - 4096;
                var3[var5] = this.method750((byte) -102, var10, var14) || this.method748(var17, 363278156, var18) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V", line = 448)
    public static void method749(int arg0) {
        field1770 = null;
        field1763 = null;
        field1775 = null;
        field1778 = null;
        if (arg0 != 0) {
            field1763 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)Z", line = 466)
    private final boolean method750(byte arg0, int arg1, int arg2) {
        field1772++;
        int var4 = (arg2 - arg1) * this.field1767 >> 12;
        int var5 = class15.field309[(var4 * 255 & 0xFF976) >> 12];
        int var6 = (var5 << 12) / this.field1767;
        int var7 = 93 / ((15 - arg0) / 48);
        int var8 = (var6 << 12) / this.field1773;
        int var9 = this.field1779 * var8 >> 12;
        return var9 > (arg1 + arg2) && arg1 + arg2 > -var9;
    }
}
