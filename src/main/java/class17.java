import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HDYGEGXY")
public class class17 extends class58 {

    @OriginalMember(owner = "HDYGEGXY", name = "rb", descriptor = "[I")
    public int[] field806 = new int[5];

    @OriginalMember(owner = "HDYGEGXY", name = "tb", descriptor = "Z")
    public boolean field808 = false;

    @OriginalMember(owner = "HDYGEGXY", name = "vb", descriptor = "I")
    public int field810 = -1;

    @OriginalMember(owner = "HDYGEGXY", name = "Bb", descriptor = "[I")
    public int[] field816 = new int[12];

    @OriginalMember(owner = "HDYGEGXY", name = "Fb", descriptor = "Z")
    private boolean field820 = true;

    @OriginalMember(owner = "HDYGEGXY", name = "Lb", descriptor = "Z")
    private boolean field826 = false;

    @OriginalMember(owner = "HDYGEGXY", name = "Nb", descriptor = "I")
    public int field828 = -1;

    @OriginalMember(owner = "HDYGEGXY", name = "Ob", descriptor = "Z")
    public boolean field829 = false;

    @OriginalMember(owner = "HDYGEGXY", name = "Ub", descriptor = "J")
    public long field835 = -1L;

    @OriginalMember(owner = "HDYGEGXY", name = "Vb", descriptor = "Z")
    private boolean field836 = true;

    @OriginalMember(owner = "HDYGEGXY", name = "xb", descriptor = "LZPNSJLZE;")
    public static class69 field812 = new class69(260, false);

    @OriginalMember(owner = "HDYGEGXY", name = "sb", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "HDYGEGXY", name = "ub", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "HDYGEGXY", name = "wb", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "HDYGEGXY", name = "yb", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "HDYGEGXY", name = "zb", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "HDYGEGXY", name = "Db", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "HDYGEGXY", name = "Eb", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "HDYGEGXY", name = "Gb", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "HDYGEGXY", name = "Hb", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "HDYGEGXY", name = "Ib", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "HDYGEGXY", name = "Jb", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "HDYGEGXY", name = "Mb", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "HDYGEGXY", name = "Qb", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "HDYGEGXY", name = "Rb", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "HDYGEGXY", name = "Sb", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "HDYGEGXY", name = "Tb", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "HDYGEGXY", name = "Cb", descriptor = "J")
    public long field817;

    @OriginalMember(owner = "HDYGEGXY", name = "Ab", descriptor = "LGALAVQEJ;")
    public class12 field815;

    @OriginalMember(owner = "HDYGEGXY", name = "Kb", descriptor = "LCSGBDGDY;")
    public class4 field825;

    @OriginalMember(owner = "HDYGEGXY", name = "Pb", descriptor = "Ljava/lang/String;")
    public String field830;

    @OriginalMember(owner = "HDYGEGXY", name = "c", descriptor = "(I)LCSGBDGDY;")
    private final class4 method249(int arg0) {
        if (this.field815 != null) {
            int var2 = -1;
            if (super.field1587 >= 0 && super.field1590 == 0) {
                var2 = class42.field1219[super.field1587].field1221[super.field1588];
            } else if (super.field1550 >= 0) {
                var2 = class42.field1219[super.field1550].field1221[super.field1551];
            }
            return this.field815.method205(426, var2, (int[]) null, -1);
        } else {
            long var4 = this.field817;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (arg0 != 0) {
                throw new NullPointerException();
            } else {
                if (super.field1587 >= 0 && super.field1590 == 0) {
                    class42 var10 = class42.field1219[super.field1587];
                    var6 = var10.field1221[super.field1588];
                    if (super.field1550 >= 0 && super.field1599 != super.field1550) {
                        var7 = class42.field1219[super.field1550].field1221[super.field1551];
                    }
                    if (var10.field1228 >= 0) {
                        var8 = var10.field1228;
                        var4 += (long) (var8 - this.field816[5] << 8);
                    }
                    if (var10.field1229 >= 0) {
                        var9 = var10.field1229;
                        var4 += (long) (var9 - this.field816[3] << 16);
                    }
                } else if (super.field1550 >= 0) {
                    var6 = class42.field1219[super.field1550].field1221[super.field1551];
                }
                class4 var11 = (class4) field812.method586(var4);
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field816[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class46.field1339[var14 - 256].method433(-793)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class19.method254(var14 - 512).method261(this.field809, true)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field835 != -1L) {
                            var11 = (class4) field812.method586(this.field835);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class4[] var15 = new class4[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field816[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class4 var20 = class46.field1339[var19 - 256].method434(201);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class4 var21 = class19.method254(var19 - 512).method262(this.field820, this.field809);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class4(var16, -39808, var15);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field806[var18] != 0) {
                            var11.method174(client.field175[var18][0], client.field175[var18][this.field806[var18]]);
                            if (var18 == 1) {
                                var11.method174(client.field311[0], client.field311[this.field806[var18]]);
                            }
                        }
                    }
                    var11.method167(7);
                    var11.method177(64, 850, -30, -50, -30, true);
                    field812.method587(var11, this.field811, var4);
                    this.field835 = var4;
                }
                if (this.field808) {
                    return var11;
                } else {
                    class4 var22 = class4.field564;
                    var22.method162(8, var11, class25.method285(0, var6) & class25.method285(0, var7));
                    if (var6 != -1 && var7 != -1) {
                        var22.method169(var6, class42.field1219[super.field1587].field1225, 1, var7);
                    } else if (var6 != -1) {
                        var22.method168(false, var6);
                    }
                    var22.method164(true);
                    var22.field601 = null;
                    var22.field600 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "HDYGEGXY", name = "a", descriptor = "(I)Z")
    public final boolean method250(int arg0) {
        int var2 = 2 / arg0;
        return this.field829;
    }

    @OriginalMember(owner = "HDYGEGXY", name = "a", descriptor = "(Z)LCSGBDGDY;")
    public final class4 method187(boolean arg0) {
        if (!this.field829) {
            return null;
        } else {
            class4 var2 = this.method249(this.field818);
            if (var2 == null) {
                return null;
            } else {
                super.field1606 = var2.field1685;
                var2.field602 = true;
                if (this.field808) {
                    return var2;
                } else {
                    if (super.field1553 != -1 && super.field1554 != -1) {
                        class11 var3 = class11.field698[super.field1553];
                        class4 var4 = var3.method202();
                        if (var4 != null) {
                            class4 var5 = new class4(true, class25.method285(0, super.field1554), var4, false, (byte) -45);
                            var5.method173(-super.field1557, 0, 0, 625);
                            var5.method167(7);
                            var5.method168(false, var3.field702.field1221[super.field1554]);
                            var5.field601 = null;
                            var5.field600 = null;
                            if (var3.field705 != 128 || var3.field706 != 128) {
                                var5.method176(var3.field705, var3.field706, var3.field705, 1);
                            }
                            var5.method177(var3.field708 + 64, var3.field709 + 850, -30, -50, -30, true);
                            class4[] var6 = new class4[] { var2, var5 };
                            var2 = new class4(true, 2, var6, true);
                        }
                    }
                    if (this.field825 != null) {
                        if (client.field505 >= this.field814) {
                            this.field825 = null;
                        }
                        if (client.field505 >= this.field813 && client.field505 < this.field814) {
                            class4 var7 = this.field825;
                            var7.method173(this.field823 - this.field821, this.field822 - super.field1601, this.field824 - super.field1602, 625);
                            if (super.field1581 == 512) {
                                var7.method171(322);
                                var7.method171(322);
                                var7.method171(322);
                            } else if (super.field1581 == 1024) {
                                var7.method171(322);
                                var7.method171(322);
                            } else if (super.field1581 == 1536) {
                                var7.method171(322);
                            }
                            class4[] var8 = new class4[] { var2, var7 };
                            var2 = new class4(true, 2, var8, true);
                            if (super.field1581 == 512) {
                                var7.method171(322);
                            } else if (super.field1581 == 1024) {
                                var7.method171(322);
                                var7.method171(322);
                            } else if (super.field1581 == 1536) {
                                var7.method171(322);
                                var7.method171(322);
                                var7.method171(322);
                            }
                            var7.method173(this.field821 - this.field823, super.field1601 - this.field822, super.field1602 - this.field824, 625);
                        }
                    }
                    var2.field602 = true;
                    if (!arg0) {
                        this.field836 = !this.field836;
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "HDYGEGXY", name = "d", descriptor = "(I)LCSGBDGDY;")
    public final class4 method251(int arg0) {
        if (!this.field829) {
            return null;
        } else if (this.field815 != null) {
            return this.field815.method204(-366);
        } else {
            boolean var2 = false;
            if (arg0 != -14221) {
                this.field826 = !this.field826;
            }
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field816[var3];
                if (var12 >= 256 && var12 < 512 && !class46.field1339[var12 - 256].method435(3)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class19.method254(var12 - 512).method259(this.field809, (byte) 7)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class4[] var4 = new class4[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field816[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class4 var10 = class46.field1339[var9 - 256].method436(false);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class4 var11 = class19.method254(var9 - 512).method260(this.field809, (byte) -24);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class4 var7 = new class4(var5, -39808, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field806[var8] != 0) {
                        var7.method174(client.field175[var8][0], client.field175[var8][this.field806[var8]]);
                        if (var8 == 1) {
                            var7.method174(client.field311[0], client.field311[this.field806[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "HDYGEGXY", name = "a", descriptor = "(LNHEPCMLW;Z)V")
    public final void method252(class35 arg0, boolean arg1) {
        arg0.field1107 = 0;
        this.field809 = arg0.method349();
        this.field828 = arg0.method350();
        if (!arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        this.field810 = arg0.method350();
        this.field815 = null;
        this.field827 = 0;
        for (int var4 = 0; var4 < 12; ++var4) {
            int var5 = arg0.method349();
            if (var5 == 0) {
                this.field816[var4] = 0;
            } else {
                int var6 = arg0.method349();
                this.field816[var4] = (var5 << 8) + var6;
                if (var4 == 0 && this.field816[0] == 65535) {
                    this.field815 = class12.method203(arg0.method351());
                    break;
                }
                if (this.field816[var4] >= 512 && this.field816[var4] - 512 < class19.field873) {
                    int var11 = class19.method254(this.field816[var4] - 512).field881;
                    if (var11 != 0) {
                        this.field827 = var11;
                    }
                }
            }
        }
        for (int var7 = 0; var7 < 5; ++var7) {
            int var10 = arg0.method349();
            if (var10 < 0 || var10 >= client.field175[var7].length) {
                var10 = 0;
            }
            this.field806[var7] = var10;
        }
        super.field1599 = arg0.method351();
        if (super.field1599 == 65535) {
            super.field1599 = -1;
        }
        super.field1600 = arg0.method351();
        if (super.field1600 == 65535) {
            super.field1600 = -1;
        }
        super.field1595 = arg0.method351();
        if (super.field1595 == 65535) {
            super.field1595 = -1;
        }
        super.field1596 = arg0.method351();
        if (super.field1596 == 65535) {
            super.field1596 = -1;
        }
        super.field1597 = arg0.method351();
        if (super.field1597 == 65535) {
            super.field1597 = -1;
        }
        super.field1598 = arg0.method351();
        if (super.field1598 == 65535) {
            super.field1598 = -1;
        }
        super.field1582 = arg0.method351();
        if (super.field1582 == 65535) {
            super.field1582 = -1;
        }
        this.field830 = class51.method508(class51.method505(4, arg0.method355(-584)), 0);
        this.field819 = arg0.method349();
        this.field807 = arg0.method351();
        this.field829 = true;
        this.field817 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field817 <<= 4;
            if (this.field816[var8] >= 256) {
                this.field817 += (long) (this.field816[var8] - 256);
            }
        }
        if (this.field816[0] >= 256) {
            this.field817 += (long) (this.field816[0] - 256 >> 4);
        }
        if (this.field816[1] >= 256) {
            this.field817 += (long) (this.field816[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field817 <<= 3;
            this.field817 += (long) this.field806[var9];
        }
        this.field817 <<= 1;
        this.field817 += (long) this.field809;
    }
}
