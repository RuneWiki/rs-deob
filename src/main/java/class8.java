import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DEHYKQII")
public class class8 extends class21 {

    @OriginalMember(owner = "client!DEHYKQII", name = "qb", descriptor = "Z")
    private boolean field601 = true;

    @OriginalMember(owner = "client!DEHYKQII", name = "sb", descriptor = "[I")
    public int[] field603 = new int[5];

    @OriginalMember(owner = "client!DEHYKQII", name = "ub", descriptor = "[I")
    public int[] field605 = new int[12];

    @OriginalMember(owner = "client!DEHYKQII", name = "vb", descriptor = "I")
    private int field606 = 41952;

    @OriginalMember(owner = "client!DEHYKQII", name = "zb", descriptor = "Z")
    public boolean field610 = false;

    @OriginalMember(owner = "client!DEHYKQII", name = "Cb", descriptor = "Z")
    public boolean field613 = false;

    @OriginalMember(owner = "client!DEHYKQII", name = "Pb", descriptor = "I")
    public int field626 = -1;

    @OriginalMember(owner = "client!DEHYKQII", name = "Qb", descriptor = "J")
    public long field627 = -1L;

    @OriginalMember(owner = "client!DEHYKQII", name = "Rb", descriptor = "I")
    public int field628 = -1;

    @OriginalMember(owner = "client!DEHYKQII", name = "Sb", descriptor = "I")
    private int field629 = 12272;

    @OriginalMember(owner = "client!DEHYKQII", name = "Bb", descriptor = "LJGECYJMS;")
    public static class22 field612 = new class22(260, -11885);

    @OriginalMember(owner = "client!DEHYKQII", name = "pb", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!DEHYKQII", name = "rb", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!DEHYKQII", name = "tb", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!DEHYKQII", name = "wb", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!DEHYKQII", name = "xb", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!DEHYKQII", name = "yb", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!DEHYKQII", name = "Db", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!DEHYKQII", name = "Fb", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "client!DEHYKQII", name = "Gb", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!DEHYKQII", name = "Hb", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!DEHYKQII", name = "Ib", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!DEHYKQII", name = "Kb", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!DEHYKQII", name = "Lb", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!DEHYKQII", name = "Mb", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!DEHYKQII", name = "Nb", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!DEHYKQII", name = "Ab", descriptor = "J")
    public long field611;

    @OriginalMember(owner = "client!DEHYKQII", name = "Jb", descriptor = "LKDWDYCIL;")
    public class25 field620;

    @OriginalMember(owner = "client!DEHYKQII", name = "Ob", descriptor = "LYANZSPIT;")
    public class66 field625;

    @OriginalMember(owner = "client!DEHYKQII", name = "Eb", descriptor = "Ljava/lang/String;")
    public String field615;

    @OriginalMember(owner = "client!DEHYKQII", name = "c", descriptor = "(I)LKDWDYCIL;")
    public final class25 method184(int arg0) {
        if (!this.field613) {
            return null;
        } else if (this.field625 != null) {
            return this.field625.method564(2);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field605[var3];
                if (var13 >= 256 && var13 < 512 && !class9.field635[var13 - 256].method193(this.field616)) {
                    var2 = true;
                }
                if (var13 >= 512 && !class67.method575(var13 - 512).method569(this.field604, 219)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class25[] var4 = new class25[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var10 = this.field605[var6];
                    if (var10 >= 256 && var10 < 512) {
                        class25 var11 = class9.field635[var10 - 256].method194(0);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class25 var12 = class67.method575(var10 - 512).method576(this.field604, false);
                        if (var12 != null) {
                            var4[var5++] = var12;
                        }
                    }
                }
                class25 var7 = new class25(var4, var5, this.field629);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field603[var8] != 0) {
                        var7.method260(client.field274[var8][0], client.field274[var8][this.field603[var8]]);
                        if (var8 == 1) {
                            var7.method260(client.field563[0], client.field563[this.field603[var8]]);
                        }
                    }
                }
                if (arg0 != 0) {
                    for (int var9 = 1; var9 > 0; ++var9) {
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!DEHYKQII", name = "a", descriptor = "(I)LKDWDYCIL;")
    public final class25 method185(int arg0) {
        if (!this.field613) {
            return null;
        } else {
            class25 var2 = this.method186(778);
            if (var2 == null) {
                return null;
            } else {
                super.field790 = var2.field758;
                if (arg0 != 9) {
                    this.field601 = !this.field601;
                }
                var2.field908 = true;
                if (this.field610) {
                    return var2;
                } else {
                    if (super.field818 != -1 && super.field819 != -1) {
                        class45 var3 = class45.field1307[super.field818];
                        class25 var4 = var3.method413();
                        if (var4 != null) {
                            class25 var5 = new class25((byte) -48, false, var4, class48.method423(super.field819, this.field606), true);
                            var5.method259(0, true, -super.field822, 0);
                            var5.method253(0);
                            var5.method254(var3.field1311.field984[super.field819], 151);
                            var5.field907 = null;
                            var5.field906 = null;
                            if (var3.field1314 != 128 || var3.field1315 != 128) {
                                var5.method262((byte) 3, var3.field1314, var3.field1314, var3.field1315);
                            }
                            var5.method263(var3.field1317 + 64, var3.field1318 + 850, -30, -50, -30, true);
                            class25[] var6 = new class25[] { var2, var5 };
                            var2 = new class25(var6, 2, true, -234);
                        }
                    }
                    if (this.field620 != null) {
                        if (client.field291 >= this.field609) {
                            this.field620 = null;
                        }
                        if (client.field291 >= this.field608 && client.field291 < this.field609) {
                            class25 var7 = this.field620;
                            var7.method259(this.field617 - super.field830, true, this.field618 - this.field614, this.field619 - super.field831);
                            if (super.field780 == 512) {
                                var7.method257(true);
                                var7.method257(true);
                                var7.method257(true);
                            } else if (super.field780 == 1024) {
                                var7.method257(true);
                                var7.method257(true);
                            } else if (super.field780 == 1536) {
                                var7.method257(true);
                            }
                            class25[] var8 = new class25[] { var2, var7 };
                            var2 = new class25(var8, 2, true, -234);
                            if (super.field780 == 512) {
                                var7.method257(true);
                            } else if (super.field780 == 1024) {
                                var7.method257(true);
                                var7.method257(true);
                            } else if (super.field780 == 1536) {
                                var7.method257(true);
                                var7.method257(true);
                                var7.method257(true);
                            }
                            var7.method259(super.field830 - this.field617, true, this.field614 - this.field618, super.field831 - this.field619);
                        }
                    }
                    var2.field908 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!DEHYKQII", name = "d", descriptor = "(I)LKDWDYCIL;")
    private final class25 method186(int arg0) {
        if (this.field625 != null) {
            int var2 = -1;
            if (super.field813 >= 0 && super.field816 == 0) {
                var2 = class30.field982[super.field813].field984[super.field814];
            } else if (super.field808 >= 0) {
                var2 = class30.field982[super.field808].field984[super.field809];
            }
            return this.field625.method561((int[]) null, var2, 4318, -1);
        } else {
            long var4 = this.field611;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (arg0 <= 0) {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            if (super.field813 >= 0 && super.field816 == 0) {
                class30 var11 = class30.field982[super.field813];
                var6 = var11.field984[super.field814];
                if (super.field808 >= 0 && super.field808 != super.field788) {
                    var7 = class30.field982[super.field808].field984[super.field809];
                }
                if (var11.field991 >= 0) {
                    var8 = var11.field991;
                    var4 += (long) (var8 - this.field605[5] << 8);
                }
                if (var11.field992 >= 0) {
                    var9 = var11.field992;
                    var4 += (long) (var9 - this.field605[3] << 16);
                }
            } else if (super.field808 >= 0) {
                var6 = class30.field982[super.field808].field984[super.field809];
            }
            class25 var12 = (class25) field612.method230(var4);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field605[var14];
                    if (var9 >= 0 && var14 == 3) {
                        var15 = var9;
                    }
                    if (var8 >= 0 && var14 == 5) {
                        var15 = var8;
                    }
                    if (var15 >= 256 && var15 < 512 && !class9.field635[var15 - 256].method191(2)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !class67.method575(var15 - 512).method579(this.field604, 0)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field627 != -1L) {
                        var12 = (class25) field612.method230(this.field627);
                    }
                    if (var12 == null) {
                        return null;
                    }
                }
            }
            if (var12 == null) {
                class25[] var16 = new class25[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field605[var18];
                    if (var9 >= 0 && var18 == 3) {
                        var20 = var9;
                    }
                    if (var8 >= 0 && var18 == 5) {
                        var20 = var8;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        class25 var21 = class9.field635[var20 - 256].method192(false);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        class25 var22 = class67.method575(var20 - 512).method578(this.field604, (byte) 8);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new class25(var16, var17, this.field629);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field603[var19] != 0) {
                        var12.method260(client.field274[var19][0], client.field274[var19][this.field603[var19]]);
                        if (var19 == 1) {
                            var12.method260(client.field563[0], client.field563[this.field603[var19]]);
                        }
                    }
                }
                var12.method253(0);
                var12.method263(64, 850, -30, -50, -30, true);
                field612.method231(var4, 811, var12);
                this.field627 = var4;
            }
            if (this.field610) {
                return var12;
            } else {
                class25 var23 = class25.field871;
                var23.method248(class48.method423(var6, this.field606) & class48.method423(var7, this.field606), (byte) 0, var12);
                if (var6 != -1 && var7 != -1) {
                    var23.method255(var7, 16750, var6, class30.field982[super.field813].field988);
                } else if (var6 != -1) {
                    var23.method254(var6, 151);
                }
                var23.method250(-705);
                var23.field907 = null;
                var23.field906 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "client!DEHYKQII", name = "a", descriptor = "(ILTQYMAXSO;)V")
    public final void method187(int arg0, class53 arg1) {
        arg1.field1457 = 0;
        this.field604 = arg1.method468();
        this.field626 = arg1.method469();
        this.field628 = arg1.method469();
        this.field625 = null;
        this.field600 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method468();
            if (var4 == 0) {
                this.field605[var3] = 0;
            } else {
                int var5 = arg1.method468();
                this.field605[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field605[0] == 65535) {
                    this.field625 = class66.method563(arg1.method470());
                    break;
                }
                if (this.field605[var3] >= 512 && this.field605[var3] - 512 < class67.field1682) {
                    int var13 = class67.method575(this.field605[var3] - 512).field1710;
                    if (var13 != 0) {
                        this.field600 = var13;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var12 = arg1.method468();
            if (var12 < 0 || var12 >= client.field274[var6].length) {
                var12 = 0;
            }
            this.field603[var6] = var12;
        }
        super.field788 = arg1.method470();
        if (super.field788 == 65535) {
            super.field788 = -1;
        }
        super.field789 = arg1.method470();
        if (super.field789 == 65535) {
            super.field789 = -1;
        }
        super.field823 = arg1.method470();
        if (super.field823 == 65535) {
            super.field823 = -1;
        }
        super.field824 = arg1.method470();
        if (super.field824 == 65535) {
            super.field824 = -1;
        }
        super.field825 = arg1.method470();
        if (super.field825 == 65535) {
            super.field825 = -1;
        }
        super.field826 = arg1.method470();
        if (super.field826 == 65535) {
            super.field826 = -1;
        }
        super.field783 = arg1.method470();
        if (super.field783 == 65535) {
            super.field783 = -1;
        }
        this.field615 = class41.method409(-354, class41.method406(arg1.method474(0), (byte) 1));
        this.field607 = arg1.method468();
        if (arg0 != -5329) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        this.field602 = arg1.method470();
        this.field613 = true;
        this.field611 = 0L;
        int var8 = this.field605[5];
        int var9 = this.field605[9];
        this.field605[5] = var9;
        this.field605[9] = var8;
        for (int var10 = 0; var10 < 12; ++var10) {
            this.field611 <<= 4;
            if (this.field605[var10] >= 256) {
                this.field611 += (long) (this.field605[var10] - 256);
            }
        }
        if (this.field605[0] >= 256) {
            this.field611 += (long) (this.field605[0] - 256 >> 4);
        }
        if (this.field605[1] >= 256) {
            this.field611 += (long) (this.field605[1] - 256 >> 8);
        }
        this.field605[5] = var8;
        this.field605[9] = var9;
        for (int var11 = 0; var11 < 5; ++var11) {
            this.field611 <<= 3;
            this.field611 += (long) this.field603[var11];
        }
        this.field611 <<= 1;
        this.field611 += (long) this.field604;
    }

    @OriginalMember(owner = "client!DEHYKQII", name = "a", descriptor = "(Z)Z")
    public final boolean method188(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            return this.field613;
        }
    }
}
