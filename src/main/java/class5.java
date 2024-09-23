import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AWOZVMFS")
public class class5 extends class3 {

    @OriginalMember(owner = "AWOZVMFS", name = "sb", descriptor = "I")
    public int field109 = -1;

    @OriginalMember(owner = "AWOZVMFS", name = "ub", descriptor = "Z")
    private boolean field111 = true;

    @OriginalMember(owner = "AWOZVMFS", name = "vb", descriptor = "[I")
    public int[] field112 = new int[5];

    @OriginalMember(owner = "AWOZVMFS", name = "wb", descriptor = "Z")
    public boolean field113 = false;

    @OriginalMember(owner = "AWOZVMFS", name = "Fb", descriptor = "[I")
    public int[] field122 = new int[12];

    @OriginalMember(owner = "AWOZVMFS", name = "Lb", descriptor = "B")
    private byte field128 = 29;

    @OriginalMember(owner = "AWOZVMFS", name = "Ob", descriptor = "J")
    public long field131 = -1L;

    @OriginalMember(owner = "AWOZVMFS", name = "Pb", descriptor = "Z")
    public boolean field132 = false;

    @OriginalMember(owner = "AWOZVMFS", name = "Rb", descriptor = "I")
    public int field134 = -1;

    @OriginalMember(owner = "AWOZVMFS", name = "Qb", descriptor = "LDSMCVRKW;")
    public static class15 field133 = new class15((byte) 7, 260);

    @OriginalMember(owner = "AWOZVMFS", name = "qb", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "AWOZVMFS", name = "rb", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "AWOZVMFS", name = "xb", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "AWOZVMFS", name = "yb", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "AWOZVMFS", name = "zb", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "AWOZVMFS", name = "Ab", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "AWOZVMFS", name = "Bb", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "AWOZVMFS", name = "Cb", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "AWOZVMFS", name = "Db", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "AWOZVMFS", name = "Eb", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "AWOZVMFS", name = "Gb", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "AWOZVMFS", name = "Hb", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "AWOZVMFS", name = "Ib", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "AWOZVMFS", name = "Nb", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "AWOZVMFS", name = "tb", descriptor = "J")
    public long field110;

    @OriginalMember(owner = "AWOZVMFS", name = "Jb", descriptor = "LKBEXSZSN;")
    public class31 field126;

    @OriginalMember(owner = "AWOZVMFS", name = "Kb", descriptor = "LNPWLDXJE;")
    public class37 field127;

    @OriginalMember(owner = "AWOZVMFS", name = "Mb", descriptor = "Ljava/lang/String;")
    public String field129;

    @OriginalMember(owner = "AWOZVMFS", name = "a", descriptor = "(Z)Z")
    public final boolean method10(boolean arg0) {
        if (!arg0) {
            this.field111 = !this.field111;
        }
        return this.field132;
    }

    @OriginalMember(owner = "AWOZVMFS", name = "b", descriptor = "(B)LKBEXSZSN;")
    private final class31 method25(byte arg0) {
        if (arg0 != 9) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field127 != null) {
            int var3 = -1;
            if (super.field47 >= 0 && super.field50 == 0) {
                var3 = class41.field1184[super.field47].field1186[super.field48];
            } else if (super.field43 >= 0) {
                var3 = class41.field1184[super.field43].field1186[super.field44];
            }
            return this.field127.method388(var3, -1, (int[]) null, true);
        } else {
            long var5 = this.field110;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            int var10 = -1;
            if (super.field47 >= 0 && super.field50 == 0) {
                class41 var11 = class41.field1184[super.field47];
                var7 = var11.field1186[super.field48];
                if (super.field43 >= 0 && super.field70 != super.field43) {
                    var8 = class41.field1184[super.field43].field1186[super.field44];
                }
                if (var11.field1193 >= 0) {
                    var9 = var11.field1193;
                    var5 += (long) (var9 - this.field122[5] << 8);
                }
                if (var11.field1194 >= 0) {
                    var10 = var11.field1194;
                    var5 += (long) (var10 - this.field122[3] << 16);
                }
            } else if (super.field43 >= 0) {
                var7 = class41.field1184[super.field43].field1186[super.field44];
            }
            class31 var12 = (class31) field133.method197(var5);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field122[var14];
                    if (var10 >= 0 && var14 == 3) {
                        var15 = var10;
                    }
                    if (var9 >= 0 && var14 == 5) {
                        var15 = var9;
                    }
                    if (var15 >= 256 && var15 < 512 && !class54.field1357[var15 - 256].method455(false)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !class67.method526(var15 - 512).method517(true, this.field119)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field131 != -1L) {
                        var12 = (class31) field133.method197(this.field131);
                    }
                    if (var12 == null) {
                        return null;
                    }
                }
            }
            if (var12 == null) {
                class31[] var16 = new class31[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field122[var18];
                    if (var10 >= 0 && var18 == 3) {
                        var20 = var10;
                    }
                    if (var9 >= 0 && var18 == 5) {
                        var20 = var9;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        class31 var21 = class54.field1357[var20 - 256].method456((byte) 9);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        class31 var22 = class67.method526(var20 - 512).method522(0, this.field119);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new class31(var17, var16, 5);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field112[var19] != 0) {
                        var12.method353(client.field457[var19][0], client.field457[var19][this.field112[var19]]);
                        if (var19 == 1) {
                            var12.method353(client.field603[0], client.field603[this.field112[var19]]);
                        }
                    }
                }
                var12.method346(311);
                var12.method356(64, 850, -30, -50, -30, true);
                field133.method198((byte) 7, var5, var12);
                this.field131 = var5;
            }
            if (this.field113) {
                return var12;
            } else {
                class31 var23 = class31.field996;
                var23.method341(true, var12, class25.method309(var7, false) & class25.method309(var8, false));
                if (var7 != -1 && var8 != -1) {
                    var23.method348(18849, class41.field1184[super.field47].field1190, var8, var7);
                } else if (var7 != -1) {
                    var23.method347(-486, var7);
                }
                var23.method343(0);
                var23.field1032 = null;
                var23.field1031 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "AWOZVMFS", name = "b", descriptor = "(I)LKBEXSZSN;")
    public final class31 method26(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field132) {
            return null;
        } else if (this.field127 != null) {
            return this.field127.method390(false);
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < 12; ++var4) {
                int var13 = this.field122[var4];
                if (var13 >= 256 && var13 < 512 && !class54.field1357[var13 - 256].method457(4732)) {
                    var3 = true;
                }
                if (var13 >= 512 && !class67.method526(var13 - 512).method515(this.field119, -11073)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            } else {
                class31[] var5 = new class31[12];
                int var6 = 0;
                for (int var7 = 0; var7 < 12; ++var7) {
                    int var10 = this.field122[var7];
                    if (var10 >= 256 && var10 < 512) {
                        class31 var11 = class54.field1357[var10 - 256].method458(-732);
                        if (var11 != null) {
                            var5[var6++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class31 var12 = class67.method526(var10 - 512).method525(8, this.field119);
                        if (var12 != null) {
                            var5[var6++] = var12;
                        }
                    }
                }
                class31 var8 = new class31(var6, var5, 5);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field112[var9] != 0) {
                        var8.method353(client.field457[var9][0], client.field457[var9][this.field112[var9]]);
                        if (var9 == 1) {
                            var8.method353(client.field603[0], client.field603[this.field112[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "AWOZVMFS", name = "a", descriptor = "(LEILHLJCE;I)V")
    public final void method27(class17 arg0, int arg1) {
        arg0.field779 = 0;
        this.field119 = arg0.method224();
        this.field134 = arg0.method225();
        this.field109 = arg0.method225();
        this.field127 = null;
        this.field130 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method224();
            if (var4 == 0) {
                this.field122[var3] = 0;
            } else {
                int var5 = arg0.method224();
                this.field122[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field122[0] == 65535) {
                    this.field127 = class37.method393(arg0.method226());
                    break;
                }
                if (this.field122[var3] >= 512 && this.field122[var3] - 512 < class67.field1534) {
                    int var13 = class67.method526(this.field122[var3] - 512).field1500;
                    if (var13 != 0) {
                        this.field130 = var13;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var12 = arg0.method224();
            if (var12 < 0 || var12 >= client.field457[var6].length) {
                var12 = 0;
            }
            this.field112[var6] = var12;
        }
        super.field70 = arg0.method226();
        if (super.field70 == 65535) {
            super.field70 = -1;
        }
        super.field71 = arg0.method226();
        if (super.field71 == 65535) {
            super.field71 = -1;
        }
        super.field20 = arg0.method226();
        if (super.field20 == 65535) {
            super.field20 = -1;
        }
        super.field21 = arg0.method226();
        if (super.field21 == 65535) {
            super.field21 = -1;
        }
        super.field22 = arg0.method226();
        if (super.field22 == 65535) {
            super.field22 = -1;
        }
        super.field23 = arg0.method226();
        if (super.field23 == 65535) {
            super.field23 = -1;
        }
        super.field18 = arg0.method226();
        if (super.field18 == 65535) {
            super.field18 = -1;
        }
        this.field129 = class33.method370(false, class33.method367(0, arg0.method230(true)));
        this.field121 = arg0.method224();
        this.field114 = arg0.method226();
        this.field132 = true;
        this.field110 = 0L;
        int var7 = this.field122[5];
        int var8 = this.field122[9];
        this.field122[5] = var8;
        this.field122[9] = var7;
        for (int var9 = 0; var9 < 12; ++var9) {
            this.field110 <<= 4;
            if (this.field122[var9] >= 256) {
                this.field110 += (long) (this.field122[var9] - 256);
            }
        }
        if (this.field122[0] >= 256) {
            this.field110 += (long) (this.field122[0] - 256 >> 4);
        }
        if (this.field122[1] >= 256) {
            this.field110 += (long) (this.field122[1] - 256 >> 8);
        }
        this.field122[5] = var7;
        this.field122[9] = var8;
        for (int var10 = 0; var10 < 5; ++var10) {
            this.field110 <<= 3;
            this.field110 += (long) this.field112[var10];
        }
        this.field110 <<= 1;
        int var11 = 36 / arg1;
        this.field110 += (long) this.field119;
    }

    @OriginalMember(owner = "AWOZVMFS", name = "a", descriptor = "(I)LKBEXSZSN;")
    public final class31 method28(int arg0) {
        if (!this.field132) {
            return null;
        } else {
            class31 var2 = this.method25((byte) 9);
            if (var2 == null) {
                return null;
            } else {
                super.field36 = var2.field1489;
                if (arg0 != 0) {
                    for (int var3 = 1; var3 > 0; ++var3) {
                    }
                }
                var2.field1033 = true;
                if (this.field113) {
                    return var2;
                } else {
                    if (super.field27 != -1 && super.field28 != -1) {
                        class55 var4 = class55.field1367[super.field27];
                        class31 var5 = var4.method461();
                        if (var5 != null) {
                            class31 var6 = new class31(false, 777, class25.method309(super.field28, false), var5, true);
                            var6.method352(-super.field31, 0, 8, 0);
                            var6.method346(311);
                            var6.method347(-486, var4.field1371.field1186[super.field28]);
                            var6.field1032 = null;
                            var6.field1031 = null;
                            if (var4.field1374 != 128 || var4.field1375 != 128) {
                                var6.method355(this.field128, var4.field1374, var4.field1375, var4.field1374);
                            }
                            var6.method356(var4.field1377 + 64, var4.field1378 + 850, -30, -50, -30, true);
                            class31[] var7 = new class31[] { var2, var6 };
                            var2 = new class31(var7, 2, true, false);
                        }
                    }
                    if (this.field126 != null) {
                        if (client.field553 >= this.field108) {
                            this.field126 = null;
                        }
                        if (client.field553 >= this.field107 && client.field553 < this.field108) {
                            class31 var8 = this.field126;
                            var8.method352(this.field124 - this.field120, this.field123 - super.field67, 8, this.field125 - super.field68);
                            if (super.field66 == 512) {
                                var8.method350(25816);
                                var8.method350(25816);
                                var8.method350(25816);
                            } else if (super.field66 == 1024) {
                                var8.method350(25816);
                                var8.method350(25816);
                            } else if (super.field66 == 1536) {
                                var8.method350(25816);
                            }
                            class31[] var9 = new class31[] { var2, var8 };
                            var2 = new class31(var9, 2, true, false);
                            if (super.field66 == 512) {
                                var8.method350(25816);
                            } else if (super.field66 == 1024) {
                                var8.method350(25816);
                                var8.method350(25816);
                            } else if (super.field66 == 1536) {
                                var8.method350(25816);
                                var8.method350(25816);
                                var8.method350(25816);
                            }
                            var8.method352(this.field120 - this.field124, super.field67 - this.field123, 8, super.field68 - this.field125);
                        }
                    }
                    var2.field1033 = true;
                    return var2;
                }
            }
        }
    }
}
