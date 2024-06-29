import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class77 extends class105 {

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    private int field1662 = 0;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "I")
    private int field1672 = 0;

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "I")
    private int field1675 = 0;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "[I")
    public static int[] field1663 = new int[] { 0, 0, 0, 0, -2, 0, 2, 0, -1, 0, 8, 0, 0, 0, 0, 0, 0, 3, 7, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0, 0, 2, 0, -2, 0, 4, 0, 0, 0, 0, 0, -2, 5, -2, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 7, 0, 15, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, -2, 0, 12, 0, 6, 0, 6, 0, 0, 0, 0, 0, 0, 0, 6, 6, 0, 0, 0, -1, 0, -2, 0, 0, 5, 0, 0, 0, 0, 0, -2, 1, 0, 0, 0, 0, -1, 0, 0, 6, 0, 0, -2, 3, 0, 0, 8, 0, 0, 0, 0, 2, 0, 20, 0, 0, 0, 4, 4, 0, 0, 0, 11, 0, 2, -2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 2, 0, 0, 1, 6, 0, 0, 0, 0, 0, 4, 0, 14, 0, 0, 0, 0, 6, 0, 0, 0, 0, -2, 0, 1, -2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 11, 0, 6, 6, 0, 0, -1, 3, 0, 0, -1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 6, 0, 0, 0, 0, 24, 0, 0, 0, 0, 0, 0, 4, 0, -2, 0, 0, 0, 0, 0, 0, 6, 0, -2, 0 };

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "Leh;")
    public static class47 field1670 = class195.method1282((byte) -4, "::rect_debug");

    @OriginalMember(owner = "client!id", name = "nb", descriptor = "Lpa;")
    public static class136 field1676 = new class136(64);

    @OriginalMember(owner = "client!id", name = "qb", descriptor = "I")
    public static int field1679 = 0;

    @OriginalMember(owner = "client!id", name = "rb", descriptor = "Leh;")
    public static class47 field1680 = class195.method1282((byte) -4, "Sprites geladen)3");

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    private int field1661;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    private int field1665;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
    private int field1668;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    private int field1669;

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!id", name = "ob", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!id", name = "pb", descriptor = "I")
    private int field1678;

    @OriginalMember(owner = "client!id", name = "sb", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!id", name = "tb", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
    private final void method668(int arg0, int arg1, int arg2, int arg3) {
        ++field1682;
        if (arg0 == 0) {
            int var5 = arg2 > 2048 ? arg2 + arg3 + -(arg2 * arg3 >> 12) : (arg3 + 4096) * arg2 >> 12;
            if (~var5 >= -1) {
                this.field1665 = this.field1661 = this.field1669 = arg2;
            } else {
                int var6 = arg1 * 6;
                int var7 = arg2 - -arg2 + -var5;
                int var8 = (var5 - var7 << 12) / var5;
                int var9 = var6 >> 12;
                int var11 = var6 - (var9 << 12);
                int var12 = var8 * var5 >> 12;
                int var13 = var11 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (var9 != 0) {
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 != -4) {
                                if (var9 != 4) {
                                    if (~var9 == -6) {
                                        this.field1665 = var5;
                                        this.field1669 = var15;
                                        this.field1661 = var7;
                                    }
                                } else {
                                    this.field1661 = var7;
                                    this.field1669 = var5;
                                    this.field1665 = var14;
                                }
                            } else {
                                this.field1669 = var5;
                                this.field1665 = var7;
                                this.field1661 = var15;
                            }
                        } else {
                            this.field1669 = var14;
                            this.field1665 = var7;
                            this.field1661 = var5;
                        }
                    } else {
                        this.field1665 = var15;
                        this.field1669 = var7;
                        this.field1661 = var5;
                    }
                } else {
                    this.field1661 = var14;
                    this.field1665 = var5;
                    this.field1669 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBII)V")
    private final void method669(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = 16 % ((arg1 - 40) / 54);
        ++field1673;
        int var6 = ~arg0 >= ~arg2 ? arg2 : arg0;
        int var7 = ~arg2 < ~arg0 ? arg0 : arg2;
        int var8 = arg3 >= var7 ? var7 : arg3;
        int var9 = ~arg3 >= ~var6 ? var6 : arg3;
        this.field1668 = (var8 + var9) / 2;
        int var10 = -var8 + var9;
        if (~var10 < -1) {
            if (this.field1668 > 0 && this.field1668 < 4096) {
                this.field1681 = (var10 << 12) / (this.field1668 > 2048 ? 8192 - this.field1668 * 2 : this.field1668 * 2);
            }
            int var11 = (-arg0 + var9 << 12) / var10;
            int var12 = (-arg2 + var9 << 12) / var10;
            int var13 = (-arg3 + var9 << 12) / var10;
            if (~arg0 != ~var9) {
                if (arg2 != var9) {
                    this.field1678 = arg0 != var8 ? -var11 + 20480 : var12 + 12288;
                } else {
                    this.field1678 = ~arg3 == ~var8 ? var11 + 4096 : -var13 + 12288;
                }
            } else {
                this.field1678 = ~arg2 == ~var8 ? var13 + 20480 : 4096 - var12;
            }
            this.field1678 /= 6;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILgf;Z)I")
    public static final int method670(int arg0, class61 arg1, boolean arg2) {
        ++field1674;
        if (arg1.field1242 != null && ~arg0 > ~arg1.field1242.length) {
            try {
                int[] var3 = arg1.field1242[arg0];
                if (!arg2) {
                    method671((byte) -69);
                }
                int var4 = 0;
                byte var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var3[var6++];
                    byte var8 = 0;
                    int var9 = 0;
                    if (~var7 == -1) {
                        return var4;
                    }
                    if (var7 == 15) {
                        var8 = 1;
                    }
                    if (var7 == 16) {
                        var8 = 2;
                    }
                    if (var7 == 1) {
                        var9 = class22.field443[var3[var6++]];
                    }
                    if (var7 == 17) {
                        var8 = 3;
                    }
                    if (~var7 == -3) {
                        var9 = class109.field2266[var3[var6++]];
                    }
                    if (~var7 == -4) {
                        var9 = class127.field2539[var3[var6++]];
                    }
                    if (var7 == 4) {
                        int var10 = var3[var6++] << 16;
                        int var11 = var10 + var3[var6++];
                        class61 var12 = class23.method224(var11, 484111152);
                        int var13 = var3[var6++];
                        if (~var13 != 0 && (!class87.method713(118, var13).field1582 || class99.field2096)) {
                            for (int var14 = 0; var14 < var12.field1264.length; ++var14) {
                                if (~(var13 + 1) == ~var12.field1264[var14]) {
                                    var9 += var12.field1310[var14];
                                }
                            }
                        }
                    }
                    if (~var7 == -6) {
                        var9 = class83.field1778[var3[var6++]];
                    }
                    if (~var7 == -7) {
                        var9 = class109.field2252[-1 + class109.field2266[var3[var6++]]];
                    }
                    if (var7 == 7) {
                        var9 = 100 * class83.field1778[var3[var6++]] / 46875;
                    }
                    if (var7 == 8) {
                        var9 = class123.field2489.field605;
                    }
                    if (var7 == 9) {
                        for (int var15 = 0; var15 < 25; ++var15) {
                            if (class59.field1139[var15]) {
                                var9 += class109.field2266[var15];
                            }
                        }
                    }
                    if (var7 == 10) {
                        int var16 = var3[var6++] << 16;
                        int var17 = var16 + var3[var6++];
                        class61 var18 = class23.method224(var17, 484111152);
                        int var19 = var3[var6++];
                        if (~var19 != 0 && (!class87.method713(118, var19).field1582 || class99.field2096)) {
                            for (int var20 = 0; var18.field1264.length > var20; ++var20) {
                                if (var19 - -1 == var18.field1264[var20]) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var7 == -12) {
                        var9 = class160.field3117;
                    }
                    if (var7 == 12) {
                        var9 = class41.field813;
                    }
                    if (~var7 == -14) {
                        int var21 = class83.field1778[var3[var6++]];
                        int var22 = var3[var6++];
                        var9 = ~(var21 & 1 << var22) != -1 ? 1 : 0;
                    }
                    if (~var7 == -15) {
                        int var23 = var3[var6++];
                        var9 = class159.method1091(var23, false);
                    }
                    if (var7 == 18) {
                        var9 = (class123.field2489.field3291 >> 7) + class127.field2536;
                    }
                    if (~var7 == -20) {
                        var9 = (class123.field2489.field3281 >> 7) + class34.field649;
                    }
                    if (var7 == 20) {
                        var9 = var3[var6++];
                    }
                    if (~var8 != -1) {
                        var5 = var8;
                    } else {
                        if (var5 == 0) {
                            var4 += var9;
                        }
                        if (~var5 == -2) {
                            var4 -= var9;
                        }
                        if (var5 == 2 && ~var9 != -1) {
                            var4 /= var9;
                        }
                        if (var5 == 3) {
                            var4 *= var9;
                        }
                        var5 = 0;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field1672 = (arg1.method567(arg2 + 255) << 12) / 100;
                }
            } else {
                this.field1662 = (arg1.method567(arg2 ^ 255) << 12) / 100;
            }
        } else {
            this.field1675 = arg1.method601(25640);
        }
        if (arg2 != -256) {
            field1680 = null;
        }
        ++field1677;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field1664;
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (!arg1) {
            return null;
        } else {
            if (super.field2186.field28) {
                int[][] var4 = this.method854(0, (byte) -82, arg0);
                int[] var5 = var4[2];
                int[] var6 = var4[0];
                int[] var7 = var3[0];
                int[] var8 = var4[1];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class149.field2928; ++var11) {
                    this.method669(var6[var11], (byte) -41, var8[var11], var5[var11]);
                    this.field1668 += this.field1672;
                    if (this.field1668 < 0) {
                        this.field1668 = 0;
                    }
                    this.field1678 += this.field1675;
                    this.field1681 += this.field1662;
                    if (~this.field1681 > -1) {
                        this.field1681 = 0;
                    }
                    if (~this.field1681 < -4097) {
                        this.field1681 = 4096;
                    }
                    if (this.field1668 > 4096) {
                        this.field1668 = 4096;
                    }
                    while (~this.field1678 > -1) {
                        this.field1678 += 4096;
                    }
                    while (~this.field1678 < -4097) {
                        this.field1678 -= 4096;
                    }
                    this.method668(0, this.field1678, this.field1668, this.field1681);
                    var7[var11] = this.field1665;
                    var9[var11] = this.field1661;
                    var10[var11] = this.field1669;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class77() {
        super(1, false);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
    public static void method671(byte arg0) {
        field1670 = null;
        field1676 = null;
        field1663 = null;
        if (arg0 != 102) {
            method671((byte) -89);
        }
        field1680 = null;
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
    public static final void method672(int arg0) {
        class22.field418.method658(-9462);
        ++field1671;
        int var1 = class22.field418.method655(1, 720);
        if (~var1 != -1) {
            if (arg0 != 19096) {
                field1680 = null;
            }
            int var2 = class22.field418.method655(2, 720);
            if (var2 == 0) {
                class196.field3810[class94.field1942++] = 2047;
            } else if (var2 == 1) {
                int var3 = class22.field418.method655(3, 720);
                class123.field2489.method1161(var3, false, 16437);
                int var4 = class22.field418.method655(1, arg0 ^ 18504);
                if (~var4 == -2) {
                    class196.field3810[class94.field1942++] = 2047;
                }
            } else if (~var2 == -3) {
                int var5 = class22.field418.method655(3, 720);
                class123.field2489.method1161(var5, true, arg0 ^ 2733);
                int var6 = class22.field418.method655(3, 720);
                class123.field2489.method1161(var6, true, arg0 + -2659);
                int var7 = class22.field418.method655(1, arg0 ^ 18504);
                if (~var7 == -2) {
                    class196.field3810[class94.field1942++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class22.field418.method655(7, 720);
                int var9 = class22.field418.method655(1, arg0 ^ 18504);
                if (~var9 == -2) {
                    class196.field3810[class94.field1942++] = 2047;
                }
                int var10 = class22.field418.method655(7, arg0 + -18376);
                class196.field3827 = class22.field418.method655(2, 720);
                int var11 = class22.field418.method655(1, 720);
                class123.field2489.method1156(true, var10, var11 == 1, var8);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZZZI)Lfd;")
    public static final class52 method673(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg0 != 0) {
            field1663 = null;
        }
        ++field1667;
        class62 var5 = null;
        if (class148.field2906 != null) {
            var5 = new class62(arg4, class148.field2906, class80.field1732[arg4], 1000000);
        }
        return new class52(var5, class39.field775, arg4, arg2, arg3, arg1);
    }
}
