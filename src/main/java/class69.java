import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZQANNJZE")
public class class69 extends class12 {

    @OriginalMember(owner = "ZQANNJZE", name = "qb", descriptor = "Z")
    private boolean field1687 = false;

    @OriginalMember(owner = "ZQANNJZE", name = "rb", descriptor = "Z")
    private boolean field1688 = false;

    @OriginalMember(owner = "ZQANNJZE", name = "sb", descriptor = "Z")
    public boolean field1689 = false;

    @OriginalMember(owner = "ZQANNJZE", name = "yb", descriptor = "Z")
    private boolean field1695 = true;

    @OriginalMember(owner = "ZQANNJZE", name = "zb", descriptor = "Z")
    public boolean field1696 = false;

    @OriginalMember(owner = "ZQANNJZE", name = "Db", descriptor = "[I")
    public int[] field1700 = new int[5];

    @OriginalMember(owner = "ZQANNJZE", name = "Eb", descriptor = "I")
    public int field1701 = -1;

    @OriginalMember(owner = "ZQANNJZE", name = "Ib", descriptor = "I")
    private int field1705 = -47744;

    @OriginalMember(owner = "ZQANNJZE", name = "Kb", descriptor = "[I")
    public int[] field1707 = new int[12];

    @OriginalMember(owner = "ZQANNJZE", name = "Mb", descriptor = "I")
    public int field1709 = -1;

    @OriginalMember(owner = "ZQANNJZE", name = "Sb", descriptor = "J")
    public long field1715 = -1L;

    @OriginalMember(owner = "ZQANNJZE", name = "Tb", descriptor = "I")
    private int field1716 = 8;

    @OriginalMember(owner = "ZQANNJZE", name = "Gb", descriptor = "LZYLCKQCD;")
    public static class71 field1703 = new class71((byte) -89, 260);

    @OriginalMember(owner = "ZQANNJZE", name = "tb", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "ZQANNJZE", name = "ub", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "ZQANNJZE", name = "vb", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "ZQANNJZE", name = "wb", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "ZQANNJZE", name = "Bb", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "ZQANNJZE", name = "Cb", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "ZQANNJZE", name = "Hb", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "ZQANNJZE", name = "Jb", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "ZQANNJZE", name = "Nb", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "ZQANNJZE", name = "Ob", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "ZQANNJZE", name = "Pb", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "ZQANNJZE", name = "Qb", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "ZQANNJZE", name = "Rb", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "ZQANNJZE", name = "Ub", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "ZQANNJZE", name = "Fb", descriptor = "J")
    public long field1702;

    @OriginalMember(owner = "ZQANNJZE", name = "xb", descriptor = "LPOJFANDE;")
    public class43 field1694;

    @OriginalMember(owner = "ZQANNJZE", name = "Ab", descriptor = "LWZSDIPBR;")
    public class58 field1697;

    @OriginalMember(owner = "ZQANNJZE", name = "Lb", descriptor = "Ljava/lang/String;")
    public String field1708;

    @OriginalMember(owner = "ZQANNJZE", name = "a", descriptor = "(ILPGNBHFUF;)V")
    public final void method594(int arg0, class42 arg1) {
        arg1.field1250 = 0;
        this.field1690 = arg1.method420();
        this.field1709 = arg1.method421();
        this.field1701 = arg1.method421();
        this.field1697 = null;
        this.field1710 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method420();
            if (var4 == 0) {
                this.field1707[var3] = 0;
            } else {
                int var5 = arg1.method420();
                this.field1707[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1707[0] == 65535) {
                    this.field1697 = class58.method525(arg1.method422());
                    break;
                }
                if (this.field1707[var3] >= 512 && this.field1707[var3] - 512 < class22.field866) {
                    int var12 = class22.method290(this.field1707[var3] - 512).field867;
                    if (var12 != 0) {
                        this.field1710 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg1.method420();
            if (var11 < 0 || var11 >= client.field378[var6].length) {
                var11 = 0;
            }
            this.field1700[var6] = var11;
        }
        super.field748 = arg1.method422();
        if (super.field748 == 65535) {
            super.field748 = -1;
        }
        super.field749 = arg1.method422();
        if (super.field749 == 65535) {
            super.field749 = -1;
        }
        super.field727 = arg1.method422();
        if (super.field727 == 65535) {
            super.field727 = -1;
        }
        super.field728 = arg1.method422();
        if (super.field728 == 65535) {
            super.field728 = -1;
        }
        super.field729 = arg1.method422();
        if (arg0 < 0) {
            if (super.field729 == 65535) {
                super.field729 = -1;
            }
            super.field730 = arg1.method422();
            if (super.field730 == 65535) {
                super.field730 = -1;
            }
            super.field743 = arg1.method422();
            if (super.field743 == 65535) {
                super.field743 = -1;
            }
            this.field1708 = class68.method592((byte) 20, class68.method589(arg1.method426(true), -115));
            this.field1706 = arg1.method420();
            this.field1704 = arg1.method422();
            this.field1696 = true;
            this.field1702 = 0L;
            int var7 = this.field1707[5];
            int var8 = this.field1707[9];
            this.field1707[5] = var8;
            this.field1707[9] = var7;
            for (int var9 = 0; var9 < 12; ++var9) {
                this.field1702 <<= 4;
                if (this.field1707[var9] >= 256) {
                    this.field1702 += (long) (this.field1707[var9] - 256);
                }
            }
            if (this.field1707[0] >= 256) {
                this.field1702 += (long) (this.field1707[0] - 256 >> 4);
            }
            if (this.field1707[1] >= 256) {
                this.field1702 += (long) (this.field1707[1] - 256 >> 8);
            }
            this.field1707[5] = var7;
            this.field1707[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field1702 <<= 3;
                this.field1702 += (long) this.field1700[var10];
            }
            this.field1702 <<= 1;
            this.field1702 += (long) this.field1690;
        }
    }

    @OriginalMember(owner = "ZQANNJZE", name = "c", descriptor = "(Z)LPOJFANDE;")
    private final class43 method595(boolean arg0) {
        if (this.field1697 != null) {
            int var2 = -1;
            if (super.field737 >= 0 && super.field740 == 0) {
                var2 = class29.field1014[super.field737].field1016[super.field738];
            } else if (super.field706 >= 0) {
                var2 = class29.field1014[super.field706].field1016[super.field707];
            }
            return this.field1697.method527(11195, (int[]) null, var2, -1);
        } else {
            long var4 = this.field1702;
            if (arg0) {
                this.field1705 = 254;
            }
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field737 >= 0 && super.field740 == 0) {
                class29 var10 = class29.field1014[super.field737];
                var6 = var10.field1016[super.field738];
                if (super.field706 >= 0 && super.field748 != super.field706) {
                    var7 = class29.field1014[super.field706].field1016[super.field707];
                }
                if (var10.field1023 >= 0) {
                    var8 = var10.field1023;
                    var4 += (long) (var8 - this.field1707[5] << 8);
                }
                if (var10.field1024 >= 0) {
                    var9 = var10.field1024;
                    var4 += (long) (var9 - this.field1707[3] << 16);
                }
            } else if (super.field706 >= 0) {
                var6 = class29.field1014[super.field706].field1016[super.field707];
            }
            class43 var11 = (class43) field1703.method599(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1707[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class23.field904[var14 - 256].method303(-139)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class22.method290(var14 - 512).method289(-3952, this.field1690)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1715 != -1L) {
                        var11 = (class43) field1703.method599(this.field1715);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class43[] var15 = new class43[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1707[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class43 var20 = class23.field904[var19 - 256].method304(false);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class43 var21 = class22.method290(var19 - 512).method292(0, this.field1690);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class43(var16, -347, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1700[var18] != 0) {
                        var11.method474(client.field378[var18][0], client.field378[var18][this.field1700[var18]]);
                        if (var18 == 1) {
                            var11.method474(client.field529[0], client.field529[this.field1700[var18]]);
                        }
                    }
                }
                var11.method467(0);
                var11.method477(64, 850, -30, -50, -30, true);
                field1703.method600(var11, this.field1716, var4);
                this.field1715 = var4;
            }
            if (this.field1689) {
                return var11;
            } else {
                class43 var22 = class43.field1274;
                var22.method462(this.field1688, var11, class21.method287(var6, -13619) & class21.method287(var7, -13619));
                if (var6 != -1 && var7 != -1) {
                    var22.method469(13742, class29.field1014[super.field737].field1020, var6, var7);
                } else if (var6 != -1) {
                    var22.method468(var6, 19066);
                }
                var22.method464((byte) 3);
                var22.field1310 = null;
                var22.field1309 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "ZQANNJZE", name = "a", descriptor = "(Z)LPOJFANDE;")
    public final class43 method54(boolean arg0) {
        if (!arg0) {
            this.field1687 = !this.field1687;
        }
        if (!this.field1696) {
            return null;
        } else {
            class43 var2 = this.method595(false);
            if (var2 == null) {
                return null;
            } else {
                super.field731 = var2.field1487;
                var2.field1311 = true;
                if (this.field1689) {
                    return var2;
                } else {
                    if (super.field713 != -1 && super.field714 != -1) {
                        class6 var3 = class6.field49[super.field713];
                        class43 var4 = var3.method62();
                        if (var4 != null) {
                            class43 var5 = new class43(class21.method287(super.field714, -13619), true, false, -785, var4);
                            var5.method473(-super.field717, 0, 0, -30187);
                            var5.method467(0);
                            var5.method468(var3.field53.field1016[super.field714], 19066);
                            var5.field1310 = null;
                            var5.field1309 = null;
                            if (var3.field56 != 128 || var3.field57 != 128) {
                                var5.method476(var3.field57, true, var3.field56, var3.field56);
                            }
                            var5.method477(var3.field59 + 64, var3.field60 + 850, -30, -50, -30, true);
                            class43[] var6 = new class43[] { var2, var5 };
                            var2 = new class43(true, var6, 2, true);
                        }
                    }
                    if (this.field1694 != null) {
                        if (client.field525 >= this.field1699) {
                            this.field1694 = null;
                        }
                        if (client.field525 >= this.field1698 && client.field525 < this.field1699) {
                            class43 var7 = this.field1694;
                            var7.method473(this.field1692 - this.field1717, this.field1691 - super.field719, this.field1693 - super.field720, -30187);
                            if (super.field723 == 512) {
                                var7.method471((byte) 3);
                                var7.method471((byte) 3);
                                var7.method471((byte) 3);
                            } else if (super.field723 == 1024) {
                                var7.method471((byte) 3);
                                var7.method471((byte) 3);
                            } else if (super.field723 == 1536) {
                                var7.method471((byte) 3);
                            }
                            class43[] var8 = new class43[] { var2, var7 };
                            var2 = new class43(true, var8, 2, true);
                            if (super.field723 == 512) {
                                var7.method471((byte) 3);
                            } else if (super.field723 == 1024) {
                                var7.method471((byte) 3);
                                var7.method471((byte) 3);
                            } else if (super.field723 == 1536) {
                                var7.method471((byte) 3);
                                var7.method471((byte) 3);
                                var7.method471((byte) 3);
                            }
                            var7.method473(this.field1717 - this.field1692, super.field719 - this.field1691, super.field720 - this.field1693, -30187);
                        }
                    }
                    var2.field1311 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "ZQANNJZE", name = "a", descriptor = "(I)LPOJFANDE;")
    public final class43 method596(int arg0) {
        if (!this.field1696) {
            return null;
        } else if (this.field1697 != null) {
            return this.field1697.method528((byte) 50);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field1707[var3];
                if (var13 >= 256 && var13 < 512 && !class23.field904[var13 - 256].method305(-44232)) {
                    var2 = true;
                }
                if (var13 >= 512 && !class22.method290(var13 - 512).method296(this.field1690, 7)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class43[] var4 = new class43[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var10 = this.field1707[var6];
                    if (var10 >= 256 && var10 < 512) {
                        class43 var11 = class23.field904[var10 - 256].method306((byte) -100);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class43 var12 = class22.method290(var10 - 512).method300((byte) -94, this.field1690);
                        if (var12 != null) {
                            var4[var5++] = var12;
                        }
                    }
                }
                if (arg0 != 0) {
                    for (int var7 = 1; var7 > 0; ++var7) {
                    }
                }
                class43 var8 = new class43(var5, -347, var4);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field1700[var9] != 0) {
                        var8.method474(client.field378[var9][0], client.field378[var9][this.field1700[var9]]);
                        if (var9 == 1) {
                            var8.method474(client.field529[0], client.field529[this.field1700[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "ZQANNJZE", name = "a", descriptor = "(B)Z")
    public final boolean method263(byte arg0) {
        if (arg0 != 15) {
            this.field1695 = !this.field1695;
        }
        return this.field1696;
    }
}
