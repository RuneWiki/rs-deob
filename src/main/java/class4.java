import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CHKMTWJC")
public class class4 extends class34 {

    @OriginalMember(owner = "CHKMTWJC", name = "rb", descriptor = "Z")
    private boolean field93 = false;

    @OriginalMember(owner = "CHKMTWJC", name = "tb", descriptor = "I")
    public int field95 = -1;

    @OriginalMember(owner = "CHKMTWJC", name = "vb", descriptor = "I")
    public int field97 = -1;

    @OriginalMember(owner = "CHKMTWJC", name = "wb", descriptor = "Z")
    public boolean field98 = false;

    @OriginalMember(owner = "CHKMTWJC", name = "xb", descriptor = "[I")
    public int[] field99 = new int[12];

    @OriginalMember(owner = "CHKMTWJC", name = "yb", descriptor = "Z")
    private boolean field100 = true;

    @OriginalMember(owner = "CHKMTWJC", name = "Ab", descriptor = "J")
    public long field102 = -1L;

    @OriginalMember(owner = "CHKMTWJC", name = "Bb", descriptor = "[I")
    public int[] field103 = new int[5];

    @OriginalMember(owner = "CHKMTWJC", name = "Cb", descriptor = "Z")
    public boolean field104 = false;

    @OriginalMember(owner = "CHKMTWJC", name = "Jb", descriptor = "Z")
    private boolean field111 = false;

    @OriginalMember(owner = "CHKMTWJC", name = "Kb", descriptor = "B")
    private byte field112 = 1;

    @OriginalMember(owner = "CHKMTWJC", name = "sb", descriptor = "LUECXVCCS;")
    public static class55 field94 = new class55(260, (byte) -2);

    @OriginalMember(owner = "CHKMTWJC", name = "zb", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "CHKMTWJC", name = "Eb", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "CHKMTWJC", name = "Fb", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "CHKMTWJC", name = "Gb", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "CHKMTWJC", name = "Hb", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "CHKMTWJC", name = "Ib", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "CHKMTWJC", name = "Nb", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "CHKMTWJC", name = "Ob", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "CHKMTWJC", name = "Pb", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "CHKMTWJC", name = "Qb", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "CHKMTWJC", name = "Rb", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "CHKMTWJC", name = "Sb", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "CHKMTWJC", name = "Tb", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "CHKMTWJC", name = "ub", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "CHKMTWJC", name = "Mb", descriptor = "J")
    public long field114;

    @OriginalMember(owner = "CHKMTWJC", name = "Ub", descriptor = "LCADBNSXE;")
    public class3 field122;

    @OriginalMember(owner = "CHKMTWJC", name = "Db", descriptor = "LVWKJSKWX;")
    public class60 field105;

    @OriginalMember(owner = "CHKMTWJC", name = "Lb", descriptor = "Ljava/lang/String;")
    public String field113;

    @OriginalMember(owner = "CHKMTWJC", name = "a", descriptor = "(Z)Z")
    public final boolean method38(boolean arg0) {
        if (arg0) {
            this.field100 = !this.field100;
        }
        return this.field98;
    }

    @OriginalMember(owner = "CHKMTWJC", name = "c", descriptor = "(I)LCADBNSXE;")
    public final class3 method39(int arg0) {
        if (!this.field98) {
            return null;
        } else if (this.field105 != null) {
            return this.field105.method575((byte) -72);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field99[var3];
                if (var12 >= 256 && var12 < 512 && !class32.field1115[var12 - 256].method340(369)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class40.method418(var12 - 512).method415(-33646, this.field116)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class3[] var4 = new class3[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field99[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class3 var10 = class32.field1115[var9 - 256].method341((byte) 9);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class3 var11 = class40.method418(var9 - 512).method410(-336, this.field116);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                if (arg0 <= 0) {
                    throw new NullPointerException();
                } else {
                    class3 var7 = new class3(var4, var5, 337);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field103[var8] != 0) {
                            var7.method25(client.field324[var8][0], client.field324[var8][this.field103[var8]]);
                            if (var8 == 1) {
                                var7.method25(client.field425[0], client.field425[this.field103[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "CHKMTWJC", name = "a", descriptor = "(I)LCADBNSXE;")
    public final class3 method40(int arg0) {
        if (!this.field98) {
            return null;
        } else {
            class3 var2 = this.method41(this.field111);
            if (var2 == null) {
                return null;
            } else {
                super.field1187 = var2.field945;
                if (arg0 >= 0) {
                    throw new NullPointerException();
                } else {
                    var2.field59 = true;
                    if (this.field104) {
                        return var2;
                    } else {
                        if (super.field1133 != -1 && super.field1134 != -1) {
                            class64 var3 = class64.field1665[super.field1133];
                            class3 var4 = var3.method589();
                            if (var4 != null) {
                                class3 var5 = new class3(false, class8.method215(false, super.field1134), var4, this.field112, true);
                                var5.method24(-super.field1137, 0, 1, 0);
                                var5.method18(false);
                                var5.method19(var3.field1669.field1572[super.field1134], (byte) -62);
                                var5.field58 = null;
                                var5.field57 = null;
                                if (var3.field1672 != 128 || var3.field1673 != 128) {
                                    var5.method27(var3.field1672, 0, var3.field1673, var3.field1672);
                                }
                                var5.method28(var3.field1675 + 64, var3.field1676 + 850, -30, -50, -30, true);
                                class3[] var6 = new class3[] { var2, var5 };
                                var2 = new class3(true, 6, var6, 2);
                            }
                        }
                        if (this.field122 != null) {
                            if (client.field502 >= this.field118) {
                                this.field122 = null;
                            }
                            if (client.field502 >= this.field117 && client.field502 < this.field118) {
                                class3 var7 = this.field122;
                                var7.method24(this.field120 - this.field96, this.field121 - super.field1153, 1, this.field119 - super.field1152);
                                if (super.field1158 == 512) {
                                    var7.method22((byte) -62);
                                    var7.method22((byte) -62);
                                    var7.method22((byte) -62);
                                } else if (super.field1158 == 1024) {
                                    var7.method22((byte) -62);
                                    var7.method22((byte) -62);
                                } else if (super.field1158 == 1536) {
                                    var7.method22((byte) -62);
                                }
                                class3[] var8 = new class3[] { var2, var7 };
                                var2 = new class3(true, 6, var8, 2);
                                if (super.field1158 == 512) {
                                    var7.method22((byte) -62);
                                } else if (super.field1158 == 1024) {
                                    var7.method22((byte) -62);
                                    var7.method22((byte) -62);
                                } else if (super.field1158 == 1536) {
                                    var7.method22((byte) -62);
                                    var7.method22((byte) -62);
                                    var7.method22((byte) -62);
                                }
                                var7.method24(this.field96 - this.field120, super.field1153 - this.field121, 1, super.field1152 - this.field119);
                            }
                        }
                        var2.field59 = true;
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "CHKMTWJC", name = "b", descriptor = "(Z)LCADBNSXE;")
    private final class3 method41(boolean arg0) {
        if (this.field105 != null) {
            int var2 = -1;
            if (super.field1182 >= 0 && super.field1185 == 0) {
                var2 = class58.field1570[super.field1182].field1572[super.field1183];
            } else if (super.field1155 >= 0) {
                var2 = class58.field1570[super.field1155].field1572[super.field1156];
            }
            return this.field105.method572(119, -1, var2, (int[]) null);
        } else {
            long var4 = this.field114;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (arg0) {
                throw new NullPointerException();
            } else {
                if (super.field1182 >= 0 && super.field1185 == 0) {
                    class58 var10 = class58.field1570[super.field1182];
                    var6 = var10.field1572[super.field1183];
                    if (super.field1155 >= 0 && super.field1155 != super.field1148) {
                        var7 = class58.field1570[super.field1155].field1572[super.field1156];
                    }
                    if (var10.field1579 >= 0) {
                        var8 = var10.field1579;
                        var4 += (long) (var8 - this.field99[5] << 8);
                    }
                    if (var10.field1580 >= 0) {
                        var9 = var10.field1580;
                        var4 += (long) (var9 - this.field99[3] << 16);
                    }
                } else if (super.field1155 >= 0) {
                    var6 = class58.field1570[super.field1155].field1572[super.field1156];
                }
                class3 var11 = (class3) field94.method538(var4);
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field99[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class32.field1115[var14 - 256].method338(-908)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class40.method418(var14 - 512).method409((byte) 108, this.field116)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field102 != -1L) {
                            var11 = (class3) field94.method538(this.field102);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class3[] var15 = new class3[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field99[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class3 var20 = class32.field1115[var19 - 256].method339(0);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class3 var21 = class40.method418(var19 - 512).method411(0, this.field116);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class3(var15, var16, 337);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field103[var18] != 0) {
                            var11.method25(client.field324[var18][0], client.field324[var18][this.field103[var18]]);
                            if (var18 == 1) {
                                var11.method25(client.field425[0], client.field425[this.field103[var18]]);
                            }
                        }
                    }
                    var11.method18(false);
                    var11.method28(64, 850, -30, -50, -30, true);
                    field94.method539(var11, -488, var4);
                    this.field102 = var4;
                }
                if (this.field104) {
                    return var11;
                } else {
                    class3 var22 = class3.field22;
                    var22.method13(0, var11, class8.method215(false, var6) & class8.method215(false, var7));
                    if (var6 != -1 && var7 != -1) {
                        var22.method20(var6, var7, (byte) 4, class58.field1570[super.field1182].field1576);
                    } else if (var6 != -1) {
                        var22.method19(var6, (byte) -62);
                    }
                    var22.method15(1);
                    var22.field58 = null;
                    var22.field57 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "CHKMTWJC", name = "a", descriptor = "(BLMLYYHULT;)V")
    public final void method42(byte arg0, class30 arg1) {
        arg1.field1092 = 0;
        this.field116 = arg1.method296();
        this.field97 = arg1.method297();
        this.field95 = arg1.method297();
        this.field105 = null;
        this.field110 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method296();
            if (var4 == 0) {
                this.field99[var3] = 0;
            } else {
                int var5 = arg1.method296();
                this.field99[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field99[0] == 65535) {
                    this.field105 = class60.method574(arg1.method298());
                    break;
                }
                if (this.field99[var3] >= 512 && this.field99[var3] - 512 < class40.field1260) {
                    int var12 = class40.method418(this.field99[var3] - 512).field1254;
                    if (var12 != 0) {
                        this.field110 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg1.method296();
            if (var11 < 0 || var11 >= client.field324[var6].length) {
                var11 = 0;
            }
            this.field103[var6] = var11;
        }
        if (arg0 != 121) {
            this.field100 = !this.field100;
        }
        super.field1148 = arg1.method298();
        if (super.field1148 == 65535) {
            super.field1148 = -1;
        }
        super.field1149 = arg1.method298();
        if (super.field1149 == 65535) {
            super.field1149 = -1;
        }
        super.field1159 = arg1.method298();
        if (super.field1159 == 65535) {
            super.field1159 = -1;
        }
        super.field1160 = arg1.method298();
        if (super.field1160 == 65535) {
            super.field1160 = -1;
        }
        super.field1161 = arg1.method298();
        if (super.field1161 == 65535) {
            super.field1161 = -1;
        }
        super.field1162 = arg1.method298();
        if (super.field1162 == 65535) {
            super.field1162 = -1;
        }
        super.field1181 = arg1.method298();
        if (super.field1181 == 65535) {
            super.field1181 = -1;
        }
        this.field113 = class63.method585(class63.method582((byte) 57, arg1.method302((byte) 2)), 0);
        this.field115 = arg1.method296();
        this.field101 = arg1.method298();
        this.field98 = true;
        this.field114 = 0L;
        int var7 = this.field99[5];
        int var8 = this.field99[9];
        this.field99[5] = var8;
        this.field99[9] = var7;
        for (int var9 = 0; var9 < 12; ++var9) {
            this.field114 <<= 4;
            if (this.field99[var9] >= 256) {
                this.field114 += (long) (this.field99[var9] - 256);
            }
        }
        if (this.field99[0] >= 256) {
            this.field114 += (long) (this.field99[0] - 256 >> 4);
        }
        if (this.field99[1] >= 256) {
            this.field114 += (long) (this.field99[1] - 256 >> 8);
        }
        this.field99[5] = var7;
        this.field99[9] = var8;
        for (int var10 = 0; var10 < 5; ++var10) {
            this.field114 <<= 3;
            this.field114 += (long) this.field103[var10];
        }
        this.field114 <<= 1;
        this.field114 += (long) this.field116;
    }
}
