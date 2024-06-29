import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class63 extends class89 implements class101 {

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    private int field792 = 50;

    @OriginalMember(owner = "client!il", name = "ab", descriptor = "Z")
    private boolean field824 = false;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "Llc;")
    private class175 field804;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "Llc;")
    private class175 field807;

    @OriginalMember(owner = "client!il", name = "eb", descriptor = "Lii;")
    private class227 field828;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "Lii;")
    private class227 field819;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "Lvm;")
    public static class84 field803 = new class84();

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "Z")
    public static volatile boolean field823 = false;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!il", name = "X", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!il", name = "cb", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!il", name = "db", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!il", name = "bb", descriptor = "[Laf;")
    public static class189[] field825;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZIILlc;Llc;)Lsf;", line = 5)
    public static final class115 method365(boolean arg0, int arg1, int arg2, class175 arg3, class175 arg4) {
        field801++;
        int[] var5 = arg3.method1187(arg2, (byte) 13);
        if (arg1 > -26) {
            method388((byte) 100);
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg3.method1200(arg2, 121, var5[var7]);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg4.method1200(0, 93, var9);
                } else {
                    var10 = arg4.method1200(var9, 113, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class115(arg3, arg4, arg2, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(II)V", line = 61)
    public final void method366(int arg0, int arg1) {
        field805++;
        if (arg0 != -3624) {
            field823 = false;
        }
        for (class66 var3 = (class66) this.field828.method1560(81); var3 != null; var3 = (class66) this.field828.method1567(arg0 ^ 0xE52)) {
            if (var3.field853) {
                var3.method411(arg1);
                var3.field853 = false;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 94)
    public final void method367(int arg0) {
        this.field828.method1564(85);
        if (this.field819 != null) {
            this.field819.method1564(59);
        }
        if (arg0 == 8055) {
            field815++;
            class66.field851 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BII)V", line = 110)
    public final void method368(byte arg0, int arg1, int arg2) {
        class262.method1886(this.method519((byte) -7, arg2).field1264 & 0xFF, 3, this.method519((byte) -12, arg2).field1258 & 0xFF);
        field796++;
        boolean var4 = false;
        if (arg0 != -6) {
            this.method386(true, -99);
        }
        class66 var5 = this.method382(arg2, true);
        if (var5 != null) {
            var4 = var5.method414(this, this.field804, arg1);
        }
        if (!var4) {
            class25 var6 = this.method380(arg2, (byte) -38);
            var6.method160((byte) 72);
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(II)I", line = 141)
    public final int method369(int arg0, int arg1) {
        field795++;
        if (arg1 != 0) {
            field825 = (class189[]) null;
        }
        return this.method519((byte) -127, arg0).field1275 & 0xFF;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BZ)V", line = 153)
    public final void method370(byte arg0, boolean arg1) {
        this.field824 = arg1;
        field799++;
        this.method367(8055);
        if (arg0 != -124) {
            this.method384(8, 20);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(IB)Z", line = 165)
    public final boolean method371(int arg0, byte arg1) {
        field800++;
        if (arg1 > -25) {
            method381(-92, 109);
        }
        return this.method519((byte) -116, arg0).field1268;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)I", line = 176)
    public final int method372(int arg0, byte arg1) {
        if (arg1 <= 59) {
            field823 = false;
        }
        field812++;
        return this.method519((byte) 105, arg0).field1258 & 0xFF;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IFI)[I", line = 187)
    public final int[] method373(int arg0, float arg1, int arg2) {
        if (arg0 != 208) {
            return (int[]) null;
        }
        field817++;
        class66 var4 = this.method382(arg2, true);
        if (var4 == null) {
            return null;
        } else {
            var4.field853 = true;
            return var4.method410(this, this.field804, arg1, this.field824 || this.method519((byte) -125, arg2).field1261);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lcc;I)Lcc;", line = 205)
    public static final class263 method374(class263 arg0, int arg1) {
        class263 var2 = client.method1950(arg0);
        if (arg1 >= -119) {
            method381(52, -54);
        }
        if (var2 == null) {
            var2 = arg0.field4031;
        }
        field809++;
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(II)I", line = 221)
    public final int method375(int arg0, int arg1) {
        if (arg1 != 4964) {
            this.method373(-10, -1.3376304F, -84);
        }
        field811++;
        return this.method519((byte) -110, arg0).field1272 & 0xFFFF;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IB)Z", line = 233)
    public final boolean method376(int arg0, byte arg1) {
        field826++;
        if (arg1 > -43) {
            field823 = true;
        }
        return this.field824 || this.method519((byte) 36, arg0).field1261;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)[I", line = 248)
    public final int[] method377(byte arg0, int arg1) {
        class66 var3 = this.method382(arg1, true);
        if (arg0 >= -15) {
            method390(76, 2, -96, 71, 30);
        }
        field808++;
        return var3 == null ? null : var3.method408(this, this.field804, this.field824 || this.method519((byte) -121, arg1).field1261);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)Lqe;", line = 270)
    public final class198 method378(int arg0, boolean arg1) {
        field810++;
        if (arg1) {
            return (class198) null;
        } else {
            class66 var3 = this.method382(arg0, true);
            return var3 == null ? null : var3.field848;
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(BI)I", line = 283)
    public final int method379(byte arg0, int arg1) {
        if (arg0 != -113) {
            this.method369(47, -103);
        }
        field816++;
        return this.method519((byte) 107, arg1).field1256 & 0xFF;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(IB)Llh;", line = 295)
    private final class25 method380(int arg0, byte arg1) {
        if (arg1 > -21) {
            return (class25) null;
        }
        field820++;
        class25 var3 = (class25) this.field819.method1562(0, (long) arg0);
        if (var3 == null) {
            class25 var4 = new class25(this.method519((byte) 108, arg0).field1272 & 0xFFFF);
            this.field819.method1565((long) arg0, var4, (byte) 94);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "(II)V", line = 313)
    public static final void method381(int arg0, int arg1) {
        class216.field3040 = arg0;
        class267.field4212 = 0;
        field827++;
        class224.field3177 = false;
        class283.field4440 = null;
        class96.field1252 = -1;
        class259.field3933 = -1;
        int var2 = -115 / ((arg1 - 76) / 36);
        class281.field4357 = 1;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IZ)Lb;", line = 332)
    private final class66 method382(int arg0, boolean arg1) {
        field791++;
        class66 var3 = (class66) this.field828.method1562(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field807.method1199(28815, 0, arg0);
        if (var4 == null) {
            return null;
        }
        if (!arg1) {
            this.field824 = false;
        }
        class66 var5 = new class66(new class107(var4));
        this.field828.method1565((long) arg0, var5, (byte) 65);
        return var5;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V", line = 358)
    public static void method383(int arg0) {
        if (arg0 > -21) {
            method383(95);
        }
        field803 = null;
        field825 = null;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Llc;Llc;Llc;IZ)V", line = 384)
    public class63(class175 arg0, class175 arg1, class175 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field824 = arg4;
        this.field804 = arg2;
        this.field792 = arg3;
        this.field807 = arg0;
        this.field828 = new class227(this.field792);
        if (class250.field3787) {
            this.field819 = new class227(this.field792);
        } else {
            this.field819 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(II)Z", line = 374)
    public final boolean method384(int arg0, int arg1) {
        field813++;
        if (arg0 != 16056) {
            field823 = false;
        }
        return this.method519((byte) -125, arg1).field1271;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZBIIF)Laf;", line = 405)
    public final class189 method385(boolean arg0, byte arg1, int arg2, int arg3, float arg4) {
        if (arg1 > -119) {
            return (class189) null;
        }
        field818++;
        class66 var6 = this.method382(arg3, true);
        if (var6 != null && var6.method412(this, this.field804)) {
            return arg0 ? var6.field848.method1364(arg2, arg2, this, false, (double) arg4, this.field804, -9) : var6.field848.method1369((byte) 109, (double) arg4, this.field804, this, arg2, arg2, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(ZI)V", line = 426)
    public final void method386(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        this.field792 = arg1;
        field802++;
        this.field828 = new class227(this.field792);
        if (class250.field3787) {
            this.field819 = new class227(this.field792);
        } else {
            this.field819 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)Z", line = 448)
    public final boolean method387(int arg0, int arg1) {
        if (arg0 > -35) {
            method374((class263) null, 73);
        }
        field798++;
        class66 var3 = this.method382(arg1, true);
        return var3 == null ? false : var3.method412(this, this.field804);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 465)
    public static final void method388(byte arg0) {
        if (arg0 >= -88) {
            field803 = (class84) null;
        }
        if (class138.field1928 != null) {
            class319 var1 = class138.field1928;
            synchronized (class138.field1928) {
                class138.field1928 = null;
            }
        }
        field794++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V", line = 482)
    public final void method389(int arg0, int arg1) {
        field814++;
        if (arg0 >= -64) {
            this.field792 = -26;
        }
        this.method368((byte) -6, this.field824 || this.method519((byte) 25, arg1).field1261 ? 64 : 128, arg1);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V", line = 493)
    public static final void method390(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field806++;
        for (int var5 = 0; var5 < class247.field3751; var5++) {
            if (arg3 < (class228.field3291[var5] + class17.field234[var5]) && class228.field3291[var5] < arg3 + arg4 && arg0 < (class78.field984[var5] + class115.field1625[var5]) && class78.field984[var5] < (arg0 + arg1)) {
                class285.field4483[var5] = true;
            }
        }
        if (arg2 <= 70) {
            method394(15);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)I", line = 517)
    public final int method391(boolean arg0, int arg1) {
        field793++;
        return arg0 ? -127 : this.method519((byte) 120, arg1).field1264 & 0xFF;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(BI)Z", line = 531)
    public final boolean method392(byte arg0, int arg1) {
        field822++;
        if (arg0 == 17) {
            return !this.method519((byte) -128, arg1).field1257;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V", line = 543)
    public static final void method393(byte arg0) {
        field797++;
        if (class308.field4757 == 172) {
            int var1 = class307.field4742.method661(-1);
            int var2 = (var1 & 0xF) + class112.field1591 * 2;
            int var3 = (var1 >> 4 & 0xF) + class186.field2694 * 2;
            int var4 = var3 + class307.field4742.method679(-3);
            int var5 = class307.field4742.method679(-3) + var2;
            int var6 = class307.field4742.method656(-99);
            int var7 = class307.field4742.method656(90);
            int var8 = class307.field4742.method624(14612);
            int var9 = class307.field4742.method679(-3);
            int var10 = class307.field4742.method661(-1) * 4;
            int var11 = class307.field4742.method624(14612);
            int var12 = class307.field4742.method624(14612);
            int var13 = class307.field4742.method661(-1);
            int var14 = class307.field4742.method661(-1);
            if (var13 == 255) {
                var13 = -1;
            }
            if (var3 >= 0 && var2 >= 0 && var3 < 208 && var2 < 208 && var4 >= 0 && var5 >= 0 && var4 < 208 && var5 < 208 && var8 != 65535) {
                int var15 = var2 * 64;
                int var16 = var4 * 64;
                int var17 = var5 * 64;
                int var18 = var3 * 64;
                if (var6 != 0) {
                    int var21;
                    class170 var22;
                    if (var6 >= 0) {
                        int var19 = var6 - 1;
                        int var20 = var19 & 0x7FF;
                        var21 = var19 >> 11 & 0xF;
                        var22 = class223.field3159[var20];
                    } else {
                        int var23 = -var6 - 1;
                        int var24 = var23 & 0x7FF;
                        if (class117.field1655 == var24) {
                            var22 = class118.field1664;
                        } else {
                            var22 = class328.field5009[var24];
                        }
                        var21 = (var23 & 0x7E14) >> 11;
                    }
                    if (var22 != null) {
                        class191 var25 = var22.method1102((byte) -106);
                        if (var25.field2747 != null && var25.field2747[var21] != null) {
                            var9 -= var25.field2747[var21][1];
                            int var26 = var25.field2747[var21][0];
                            int var27 = class215.field3024[var22.field2368];
                            int var28 = var25.field2747[var21][2];
                            int var29 = class215.field3017[var22.field2368];
                            int var30 = var26 * var29 + var27 * var28 >> 16;
                            int var31 = var28 * var29 - (var26 * var27) >> 16;
                            var18 += var30;
                            var15 += var31;
                        }
                    }
                }
                class3 var33 = new class3(var8, class138.field1940, var18, var15, class184.method1278(class138.field1940, -13660, var15, var18) - var9, class38.field463 + var11, class38.field463 + var12, var13, var14, var7, var10);
                var33.method13(var17, var16, var11 + class38.field463, 0, class184.method1278(class138.field1940, -13660, var17, var16) - var10);
                class31.field385.method2325(new class118(var33), (byte) 34);
            }
        } else if (class308.field4757 == 81) {
            int var146 = class307.field4742.method661(-1);
            int var147 = (var146 >> 4 & 0x7) + class186.field2694;
            int var148 = (var146 & 0x7) + class112.field1591;
            int var149 = class307.field4742.method624(14612);
            int var150 = class307.field4742.method661(-1);
            if (var149 == 65535) {
                var149 = -1;
            }
            int var151 = var150 & 0x7;
            int var152 = var150 >> 4 & 0xF;
            int var153 = class307.field4742.method661(-1);
            int var154 = class307.field4742.method661(-1);
            if (var147 >= 0 && var148 >= 0 && var147 < 104 && var148 < 104) {
                int var155 = var152 + 1;
                if (class118.field1664.field2359[0] >= (var147 - var155) && (var147 + var155) >= class118.field1664.field2359[0] && class118.field1664.field2403[0] >= (var148 - var155) && class118.field1664.field2403[0] <= var148 + var155 && class261.field3947 != 0 && var151 > 0 && class1.field6 < 50 && var149 != -1) {
                    class308.field4762[class1.field6] = var149;
                    class168.field2337[class1.field6] = var151;
                    class120.field1682[class1.field6] = var153;
                    class109.field1514[class1.field6] = null;
                    class85.field1094[class1.field6] = (var147 << 16) + (var148 << 8) + var152;
                    class269.field4246[class1.field6] = var154;
                    class1.field6++;
                }
            }
        } else if (class308.field4757 == 6) {
            int var137 = class307.field4742.method661(-1);
            int var138 = class112.field1591 + (var137 & 0x7);
            int var139 = (var137 >> 4 & 0x7) + class186.field2694;
            int var140 = class307.field4742.method624(14612);
            int var141 = class307.field4742.method661(-1);
            int var142 = class307.field4742.method624(14612);
            if (var139 >= 0 && var138 >= 0 && var139 < 104 && var138 < 104) {
                int var143 = var139 * 128 + 64;
                int var144 = var138 * 128 + 64;
                class99 var145 = new class99(var140, class138.field1940, var143, var144, class184.method1278(class138.field1940, -13660, var144, var143) - var141, var142, class38.field463);
                class104.field1345.method2325(new class180(var145), (byte) 34);
            }
        } else if (class308.field4757 == 138) {
            int var34 = class307.field4742.method652(0);
            int var35 = var34 >> 2;
            int var36 = var34 & 0x3;
            int var37 = class120.field1693[var35];
            int var38 = class307.field4742.method669(-31662);
            int var39 = ((var38 & 0x78) >> 4) + class186.field2694;
            int var40 = (var38 & 0x7) + class112.field1591;
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                class232.method1632(var40, var39, var35, -1, var36, 0, -1, class138.field1940, 0, var37);
            }
        } else if (class308.field4757 == 130) {
            int var129 = class307.field4742.method661(-1);
            int var130 = (var129 >> 4 & 0x7) + class186.field2694;
            int var131 = (var129 & 0x7) + class112.field1591;
            int var132 = class307.field4742.method661(-1);
            int var133 = var132 & 0x3;
            int var134 = var132 >> 2;
            int var135 = class120.field1693[var134];
            int var136 = class307.field4742.method655(-10505);
            if (var130 >= 0 && var131 >= 0 && var130 < 104 && var131 < 104) {
                class232.method1632(var131, var130, var134, var136, var133, 0, -1, class138.field1940, 0, var135);
            }
        } else if (class308.field4757 == 82) {
            int var41 = class307.field4742.method624(14612);
            int var42 = class307.field4742.method661(-1);
            int var43 = class112.field1591 + (var42 & 0x7);
            int var44 = class186.field2694 + (var42 >> 4 & 0x7);
            int var45 = class307.field4742.method638(-114);
            if (var44 >= 0 && var43 >= 0 && var44 < 104 && var43 < 104) {
                class187 var46 = new class187();
                var46.field2701 = var45;
                var46.field2695 = var41;
                if (class269.field4239[class138.field1940][var44][var43] == null) {
                    class269.field4239[class138.field1940][var44][var43] = new class337();
                }
                class269.field4239[class138.field1940][var44][var43].method2325(new class100(var46), (byte) 34);
                class221.method1521(-109, var44, var43);
            }
        } else if (class308.field4757 == 18) {
            int var111 = class307.field4742.method661(-1);
            int var112 = ((var111 & 0x74) >> 4) + class186.field2694;
            int var113 = (var111 & 0x7) + class112.field1591;
            int var114 = class307.field4742.method679(-3) + var112;
            int var115 = var113 + class307.field4742.method679(-3);
            int var116 = class307.field4742.method656(-86);
            int var117 = class307.field4742.method624(14612);
            int var118 = class307.field4742.method661(-1) * 4;
            int var119 = class307.field4742.method661(-1) * 4;
            int var120 = class307.field4742.method624(14612);
            int var121 = class307.field4742.method624(14612);
            int var122 = class307.field4742.method661(-1);
            if (var122 == 255) {
                var122 = -1;
            }
            int var123 = class307.field4742.method661(-1);
            if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104 && var117 != 65535) {
                int var124 = var114 * 128 + 64;
                int var125 = var112 * 128 + 64;
                int var126 = var115 * 128 + 64;
                int var127 = var113 * 128 + 64;
                class3 var128 = new class3(var117, class138.field1940, var125, var127, class184.method1278(class138.field1940, -13660, var127, var125) - var118, class38.field463 + var120, class38.field463 + var121, var122, var123, var116, var119);
                var128.method13(var126, var124, class38.field463 + var120, 0, class184.method1278(class138.field1940, -13660, var126, var124) - var119);
                class31.field385.method2325(new class118(var128), (byte) 34);
            }
        } else if (class308.field4757 == 111) {
            int var104 = class307.field4742.method652(0);
            int var105 = (var104 & 0x7) + class112.field1591;
            int var106 = (var104 >> 4 & 0x7) + class186.field2694;
            int var107 = class307.field4742.method638(-127);
            int var108 = class307.field4742.method624(14612);
            int var109 = class307.field4742.method638(-122);
            if (var106 >= 0 && var105 >= 0 && var106 < 104 && var105 < 104 && class117.field1655 != var107) {
                class187 var110 = new class187();
                var110.field2701 = var108;
                var110.field2695 = var109;
                if (class269.field4239[class138.field1940][var106][var105] == null) {
                    class269.field4239[class138.field1940][var106][var105] = new class337();
                }
                class269.field4239[class138.field1940][var106][var105].method2325(new class100(var110), (byte) 34);
                class221.method1521(-111, var106, var105);
            }
        } else {
            if (class308.field4757 == 211) {
                int var47 = class307.field4742.method656(-122);
                byte var48 = class307.field4742.method629((byte) 127);
                byte var49 = class307.field4742.method679(-3);
                int var50 = class307.field4742.method655(-10505);
                int var51 = class307.field4742.method661(-1);
                int var52 = (var51 & 0x7) + class112.field1591;
                int var53 = class186.field2694 + (var51 >> 4 & 0x7);
                int var54 = class307.field4742.method624(14612);
                byte var55 = class307.field4742.method681(4);
                byte var56 = class307.field4742.method679(-3);
                int var57 = class307.field4742.method661(-1);
                int var58 = class307.field4742.method624(14612);
                int var59 = var57 & 0x3;
                int var60 = var57 >> 2;
                if (!class250.field3787) {
                    class204.method1391(var48, var60, var54, 18149, var50, var53, var58, var55, var49, var56, var59, var47, var52);
                }
            }
            if (class308.field4757 == 137) {
                int var61 = class307.field4742.method661(-1);
                int var62 = ((var61 & 0x7D) >> 4) + class186.field2694;
                int var63 = (var61 & 0x7) + class112.field1591;
                int var64 = class307.field4742.method624(14612);
                int var65 = class307.field4742.method624(14612);
                int var66 = class307.field4742.method624(14612);
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                    class337 var67 = class269.field4239[class138.field1940][var62][var63];
                    if (var67 != null) {
                        for (class100 var68 = (class100) var67.method2331((byte) 118); var68 != null; var68 = (class100) var67.method2332(-77)) {
                            class187 var69 = var68.field1313;
                            if ((var64 & 0x7FFF) == var69.field2695 && var69.field2701 == var65) {
                                var69.field2701 = var66;
                                break;
                            }
                        }
                        class221.method1521(-119, var62, var63);
                    }
                }
            } else {
                if (arg0 > -6) {
                    method393((byte) 97);
                }
                if (class308.field4757 == 132) {
                    int var70 = class307.field4742.method661(-1);
                    int var71 = class112.field1591 * 2 + (var70 & 0xF);
                    int var72 = class186.field2694 * 2 + (var70 >> 4 & 0xF);
                    int var73 = var72 + class307.field4742.method679(-3);
                    int var74 = class307.field4742.method679(-3) + var71;
                    int var75 = class307.field4742.method656(-77);
                    int var76 = class307.field4742.method624(14612);
                    int var77 = class307.field4742.method661(-1) * 4;
                    int var78 = class307.field4742.method661(-1) * 4;
                    int var79 = class307.field4742.method624(14612);
                    int var80 = class307.field4742.method624(14612);
                    int var81 = class307.field4742.method661(-1);
                    int var82 = class307.field4742.method661(-1);
                    if (var81 == 255) {
                        var81 = -1;
                    }
                    if (var72 >= 0 && var71 >= 0 && var72 < 208 && var71 < 208 && var73 >= 0 && var74 >= 0 && var73 < 208 && var74 < 208 && var76 != 65535) {
                        int var83 = var72 * 64;
                        int var84 = var74 * 64;
                        int var85 = var73 * 64;
                        int var86 = var71 * 64;
                        class3 var87 = new class3(var76, class138.field1940, var83, var86, class184.method1278(class138.field1940, -13660, var86, var83) - var77, class38.field463 + var79, var80 + class38.field463, var81, var82, var75, var78);
                        var87.method13(var84, var85, class38.field463 + var79, 0, class184.method1278(class138.field1940, -13660, var84, var85) - var78);
                        class31.field385.method2325(new class118(var87), (byte) 34);
                    }
                } else if (class308.field4757 == 214) {
                    int var88 = class307.field4742.method624(14612);
                    int var89 = class307.field4742.method669(-31662);
                    int var90 = class186.field2694 + (var89 >> 4 & 0x7);
                    int var91 = class112.field1591 + (var89 & 0x7);
                    if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                        class337 var92 = class269.field4239[class138.field1940][var90][var91];
                        if (var92 != null) {
                            for (class100 var93 = (class100) var92.method2331((byte) 14); var93 != null; var93 = (class100) var92.method2332(-32)) {
                                if ((var88 & 0x7FFF) == var93.field1313.field2695) {
                                    var93.method2285(true);
                                    break;
                                }
                            }
                            if (var92.method2331((byte) 54) == null) {
                                class269.field4239[class138.field1940][var90][var91] = null;
                            }
                            class221.method1521(-85, var90, var91);
                        }
                    }
                } else if (class308.field4757 == 76) {
                    int var96 = class307.field4742.method652(0);
                    int var97 = var96 >> 2;
                    int var98 = class120.field1693[var97];
                    int var99 = var96 & 0x3;
                    int var100 = class307.field4742.method661(-1);
                    int var101 = class186.field2694 + ((var100 & 0x76) >> 4);
                    int var102 = (var100 & 0x7) + class112.field1591;
                    int var103 = class307.field4742.method655(-10505);
                    if (var103 == 65535) {
                        var103 = -1;
                    }
                    class148.method997(var102, var97, (byte) -82, class138.field1940, var98, var103, var101, var99);
                } else if (class308.field4757 == 213) {
                    int var94 = class307.field4742.method624(14612);
                    int var95 = class307.field4742.method661(-1);
                    class142.method951(var94, 26915).method1704((byte) -126, var95);
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V", line = 1139)
    public static final void method394(int arg0) {
        field821++;
        if (arg0 != 30675) {
            return;
        }
        while (class307.field4742.method568(-58, class132.field1817) >= 27) {
            int var1 = class307.field4742.method566(15, 0);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class223.field3159[var1] == null) {
                var2 = true;
                class223.field3159[var1] = new class184();
            }
            class184 var3 = class223.field3159[var1];
            class269.field4238[class127.field1735++] = var1;
            var3.field2422 = class38.field463;
            if (var3.field2657 != null && var3.field2657.method2022(-1)) {
                class59.method345((byte) 121, var3);
            }
            int var4 = class307.field4742.method566(1, 0);
            int var5 = class307.field4742.method566(5, 0);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class307.field4742.method566(5, 0);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class22.field304[class307.field4742.method566(3, 0)];
            if (var2) {
                var3.field2387 = var3.field2368 = var7;
            }
            var3.method1281(class120.method815(arg0 ^ 0xFFFF885E, class307.field4742.method566(14, arg0 ^ 0x77D3)), -24886);
            int var8 = class307.field4742.method566(1, 0);
            if (var8 == 1) {
                class129.field1772[class21.field278++] = var1;
            }
            var3.method1103(var3.field2657.field4420, (byte) 92);
            var3.field2375 = var3.field2657.field4421;
            var3.field2360 = var3.field2657.field4423;
            if (var3.field2360 == 0) {
                var3.field2368 = 0;
            }
            var3.method1107(class118.field1664.field2359[0] + var6, class118.field1664.field2403[0] - -var5, -1, var3.method748(false), var4 == 1);
            if (var3.field2657.method2022(-1)) {
                class300.method2116(var3.field2403[0], 4, (class109) null, var3, 0, var3.field2359[0], (class238) null, class138.field1940);
            }
        }
        class307.field4742.method569(true);
    }
}
