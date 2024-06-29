import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class97 {

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field1775 = -2;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field1783 = -1;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lkh;")
    public static class117 field1776 = class224.method1450((byte) -95, "sl_stars");

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field1782 = 0;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lkh;")
    private static class117 field1773 = class224.method1450((byte) -23, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Lkh;")
    public static class117 field1788 = class224.method1450((byte) -105, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "Lkh;")
    public static class117 field1791 = field1773;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lge;")
    public static class71 field1772 = new class71(200);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "J")
    private long field1794;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "J")
    private long field1795;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Z")
    public boolean field1781;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "[I")
    private int[] field1778;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "[I")
    private int[] field1786;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
    public final int method656(int arg0) {
        field1777++;
        if (arg0 != 255) {
            this.method659(false, null, (byte) -110, null, 27);
        }
        return this.field1789 == -1 ? (this.field1786[11] << 5) + (this.field1778[4] << 20) + (this.field1778[0] << 25) + (this.field1786[0] << 15) + (this.field1786[8] << 10) + this.field1786[1] : class56.method429(0, this.field1789).field2012 + 305419896;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIZII)V")
    public static final void method657(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1779++;
        long var6 = class93.method640(arg2, arg0, arg5);
        if (var6 != 0L) {
            int var8 = arg1;
            int[] var9 = class83.field1561;
            int var10 = (52736 - arg5 * 512) * 4 + arg0 * 4 + 24624;
            int var11 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            int var12 = (int) var6 >> 20 & 0x3;
            class211 var13 = class48.method379(88, var11);
            int var14 = (int) var6 >> 14 & 0x1F;
            if (var6 > 0L) {
                var8 = arg4;
            }
            if (var13.field3828 == -1) {
                if (var14 == 0 || var14 == 2) {
                    if (var12 == 0) {
                        var9[var10] = var8;
                        var9[var10 + 512] = var8;
                        var9[var10 + 1024] = var8;
                        var9[var10 + 1536] = var8;
                    } else if (var12 == 1) {
                        var9[var10] = var8;
                        var9[var10 + 1] = var8;
                        var9[var10 + 2] = var8;
                        var9[var10 + 3] = var8;
                    } else if (var12 == 2) {
                        var9[var10 + 3] = var8;
                        var9[var10 + 3 + 512] = var8;
                        var9[var10 + 1024 + 3] = var8;
                        var9[var10 + 3 + 1536] = var8;
                    } else if (var12 == 3) {
                        var9[var10 + 1536] = var8;
                        var9[var10 + 1536 + 1] = var8;
                        var9[var10 + 2 + 1536] = var8;
                        var9[var10 + 1536 + 3] = var8;
                    }
                }
                if (var14 == 3) {
                    if (var12 == 0) {
                        var9[var10] = var8;
                    } else if (var12 == 1) {
                        var9[var10 + 3] = var8;
                    } else if (var12 == 2) {
                        var9[var10 + 1536 + 3] = var8;
                    } else if (var12 == 3) {
                        var9[var10 + 1536] = var8;
                    }
                }
                if (var14 == 2) {
                    if (var12 == 3) {
                        var9[var10] = var8;
                        var9[var10 + 512] = var8;
                        var9[var10 + 1024] = var8;
                        var9[var10 + 1536] = var8;
                    } else if (var12 == 0) {
                        var9[var10] = var8;
                        var9[var10 + 1] = var8;
                        var9[var10 + 2] = var8;
                        var9[var10 + 3] = var8;
                    } else if (var12 == 1) {
                        var9[var10 + 3] = var8;
                        var9[var10 + 3 + 512] = var8;
                        var9[var10 + 1024 + 3] = var8;
                        var9[var10 + 1539] = var8;
                    } else if (var12 == 2) {
                        var9[var10 + 1536] = var8;
                        var9[var10 + 1536 + 1] = var8;
                        var9[var10 + 2 + 1536] = var8;
                        var9[var10 + 1536 + 3] = var8;
                    }
                }
            } else {
                class153 var15 = class155.field2832[var13.field3828];
                if (var15 != null) {
                    int var16 = (var13.field3804 * 4 - var15.field3337) / 2;
                    int var17 = (var13.field3814 * 4 - var15.field3340) / 2;
                    var15.method1084(arg0 * 4 + var17 + 48, var16 + 48 - -((104 - arg5 - var13.field3804) * 4));
                }
            }
        }
        long var18 = client.method294(arg2, arg0, arg5);
        if (arg3) {
            method657(123, -65, -68, true, -115, 115);
        }
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class211 var23 = class48.method379(114, var22);
            if (var23.field3828 != -1) {
                class153 var24 = class155.field2832[var23.field3828];
                if (var24 != null) {
                    int var25 = (var23.field3814 * 4 - var24.field3340) / 2;
                    int var26 = (var23.field3804 * 4 - var24.field3337) / 2;
                    var24.method1084(arg0 * 4 + var25 + 48, (-arg5 + 104 + -var23.field3804) * 4 + (48 - -var26));
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                int[] var28 = class83.field1561;
                int var29 = (52736 - arg5 * 512) * 4 + arg0 * 4 + 24624;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1024 + 1] = var27;
                    var28[var29 + 512 + 2] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 1 + 512] = var27;
                    var28[var29 + 2 + 1024] = var27;
                    var28[var29 + 1536 + 3] = var27;
                }
            }
        }
        long var30 = class207.method1363(arg2, arg0, arg5);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class211 var33 = class48.method379(62, var32);
        if (var33.field3828 == -1) {
            return;
        }
        class153 var34 = class155.field2832[var33.field3828];
        if (var34 != null) {
            int var35 = (var33.field3814 * 4 - var34.field3340) / 2;
            int var36 = (var33.field3804 * 4 - var34.field3337) / 2;
            var34.method1084(arg0 * 4 + var35 + 48, (-var33.field3804 + 104 - arg5) * 4 + var36 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    private final void method658(int arg0) {
        field1784++;
        long var2 = this.field1794;
        this.field1794 = -1L;
        if (arg0 <= 0) {
            this.method656(116);
        }
        long[] var4 = class32.field760;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1794 = var4[(int) (((long) (this.field1786[var5] >> 24) ^ this.field1794) & 0xFFL)] ^ this.field1794 >>> 8;
            this.field1794 = this.field1794 >>> 8 ^ var4[(int) (((long) (this.field1786[var5] >> 16) ^ this.field1794) & 0xFFL)];
            this.field1794 = var4[(int) (((long) (this.field1786[var5] >> 8) ^ this.field1794) & 0xFFL)] ^ this.field1794 >>> 8;
            this.field1794 = this.field1794 >>> 8 ^ var4[(int) ((this.field1794 ^ (long) this.field1786[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1794 = this.field1794 >>> 8 ^ var4[(int) ((this.field1794 ^ (long) this.field1778[var6]) & 0xFFL)];
        }
        this.field1794 = this.field1794 >>> 8 ^ var4[(int) ((this.field1794 ^ (long) (this.field1781 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field1794 != var2) {
            class78.field1482.method411(var2, -2);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z[IB[II)V")
    public final void method659(boolean arg0, int[] arg1, byte arg2, int[] arg3, int arg4) {
        field1785++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class221.field3990; var7++) {
                    class69 var8 = class81.method558((byte) -12, var7);
                    if (var8 != null && !var8.field1338 && (arg0 ? 7 : 0) + var6 == var8.field1314) {
                        arg1[class217.field3953[var6]] = class40.method352(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field1778 = arg3;
        if (arg2 == -41) {
            this.field1789 = arg4;
            this.field1786 = arg1;
            this.field1781 = arg0;
            this.method658(20);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method660(byte arg0) {
        field1773 = null;
        field1788 = null;
        field1791 = null;
        field1776 = null;
        if (arg0 < -7) {
            field1772 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
    public final void method661(int arg0, boolean arg1) {
        if (arg0 <= 8) {
            field1773 = null;
        }
        this.field1781 = arg1;
        field1780++;
        this.method658(44);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)V")
    public final void method662(int arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            this.field1781 = true;
        }
        this.field1778[arg0] = arg1;
        this.method658(79);
        field1790++;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IIB)V")
    public final void method663(int arg0, int arg1, byte arg2) {
        int var4 = class217.field3953[arg1];
        field1774++;
        if (this.field1786[var4] == 0 || class81.method558((byte) -12, arg0) == null) {
            return;
        }
        this.field1786[var4] = class40.method352(Integer.MIN_VALUE, arg0);
        if (arg2 != 93) {
            this.method664(124, 126, null);
        }
        this.method658(70);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILpj;)Lcf;")
    public final class29 method664(int arg0, int arg1, class174 arg2) {
        field1787++;
        if (this.field1789 != -1) {
            return class56.method429(0, this.field1789).method738((byte) 127, arg2, arg0);
        }
        if (arg1 > -105) {
            this.method665(null, 44, 51, null, -119);
        }
        class29 var4 = (class29) class147.field2686.method412(112, this.field1794);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1786[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class81.method558((byte) -12, var15 & 0x3FFFFFFF).method483((byte) -19)) {
                        var5 = true;
                    }
                } else if (!class214.method1408((byte) 102, var15 & 0x3FFFFFFF).method1096((byte) 94, this.field1781)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class15[] var7 = new class15[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1786[var9];
                if ((var12 & 0x40000000) != 0) {
                    class15 var13 = class214.method1408((byte) 102, var12 & 0x3FFFFFFF).method1093(true, this.field1781);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class15 var14 = class81.method558((byte) -12, var12 & 0x3FFFFFFF).method481(0);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class15 var10 = new class15(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field1778[var11] < class213.field3876[var11].length) {
                    var10.method144(class11.field369[var11], class213.field3876[var11][this.field1778[var11]]);
                }
                if (this.field1778[var11] < class130.field2387[var11].length) {
                    var10.method144(class112.field2099[var11], class130.field2387[var11][this.field1778[var11]]);
                }
            }
            var4 = var10.method159(64, 768, -50, -10, -50);
            class147.field2686.method408((byte) -57, var4, this.field1794);
        }
        if (arg2 != null) {
            var4 = arg2.method1216(arg0, var4, -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lpj;IILpj;I)Lcf;")
    public final class29 method665(class174 arg0, int arg1, int arg2, class174 arg3, int arg4) {
        field1792++;
        if (this.field1789 != -1) {
            return class56.method429(0, this.field1789).method737(28500, arg2, arg0, arg3, arg1);
        }
        if (arg4 >= -77) {
            field1775 = -103;
        }
        long var6 = this.field1794;
        int[] var8 = this.field1786;
        if (arg0 != null && (arg0.field3155 >= 0 || arg0.field3154 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1786[var9];
            }
            if (arg0.field3155 >= 0) {
                if (arg0.field3155 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class40.method352(arg0.field3155, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg0.field3154 >= 0) {
                if (arg0.field3154 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class40.method352(1073741824, arg0.field3154);
                    var6 ^= var8[3];
                }
            }
        }
        class29 var10 = (class29) class78.field1482.method412(112, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class81.method558((byte) -12, var30 & 0x3FFFFFFF).method488((byte) 86)) {
                        var11 = true;
                    }
                } else if (!class214.method1408((byte) 102, var30 & 0x3FFFFFFF).method1092((byte) -36, this.field1781)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1795 != -1L) {
                    var10 = (class29) class78.field1482.method412(112, this.field1795);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class15[] var13 = new class15[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class15 var28 = class214.method1408((byte) 102, var27 & 0x3FFFFFFF).method1103(this.field1781, false);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class15 var29 = class81.method558((byte) -12, var27 & 0x3FFFFFFF).method489((byte) -116);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class154 var17 = class214.method1408((byte) 102, var16 & 0x3FFFFFFF);
                    if (var17.field2778 != null) {
                        for (int var18 = 0; var18 < var17.field2778.length; var18++) {
                            int var19 = var17.field2778[var18][0];
                            int var20 = var17.field2778[var18][1];
                            int var21 = var17.field2778[var18][2];
                            int var22 = var17.field2778[var18][3];
                            int var23 = var17.field2778[var18][5];
                            int var24 = var17.field2778[var18][4];
                            var13[var18 + 1].method154(var19, var20, var21);
                            var13[var18 + 1].method133(var22, var24, var23);
                        }
                    }
                }
                class15 var25 = new class15(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (class213.field3876[var26].length > this.field1778[var26]) {
                        var25.method144(class11.field369[var26], class213.field3876[var26][this.field1778[var26]]);
                    }
                    if (class130.field2387[var26].length > this.field1778[var26]) {
                        var25.method144(class112.field2099[var26], class130.field2387[var26][this.field1778[var26]]);
                    }
                }
                var10 = var25.method159(64, 850, -30, -50, -30);
                class78.field1482.method408((byte) -57, var10, var6);
                this.field1795 = var6;
            }
        }
        if (arg0 == null && arg3 == null) {
            return var10;
        }
        class29 var31;
        if (arg0 != null && arg3 != null) {
            var31 = arg0.method1214(arg3, arg1, arg2, var10, -127);
        } else if (arg0 == null) {
            var31 = arg3.method1211((byte) 119, arg2, var10);
        } else {
            var31 = arg0.method1211((byte) 119, arg1, var10);
        }
        return var31;
    }
}
