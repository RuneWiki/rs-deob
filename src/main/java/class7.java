import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BPHJJPRI")
public class class7 extends class11 {

    @OriginalMember(owner = "client!BPHJJPRI", name = "wb", descriptor = "[I")
    public int[] field79 = new int[12];

    @OriginalMember(owner = "client!BPHJJPRI", name = "xb", descriptor = "I")
    private int field80 = 1;

    @OriginalMember(owner = "client!BPHJJPRI", name = "yb", descriptor = "I")
    public int field81 = -1;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Ab", descriptor = "I")
    private int field83 = 856;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Bb", descriptor = "Z")
    private boolean field84 = false;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Db", descriptor = "J")
    public long field86 = -1L;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Eb", descriptor = "Z")
    public boolean field87 = false;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Fb", descriptor = "I")
    private int field88 = 772;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Lb", descriptor = "I")
    public int field94 = -1;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Tb", descriptor = "[I")
    public int[] field102 = new int[5];

    @OriginalMember(owner = "client!BPHJJPRI", name = "Vb", descriptor = "Z")
    public boolean field104 = false;

    @OriginalMember(owner = "client!BPHJJPRI", name = "zb", descriptor = "LUNPPHFRC;")
    public static class60 field82 = new class60(true, 260);

    @OriginalMember(owner = "client!BPHJJPRI", name = "Rb", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Ub", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Wb", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Xb", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!BPHJJPRI", name = "sb", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "client!BPHJJPRI", name = "tb", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!BPHJJPRI", name = "ub", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Gb", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Hb", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Ib", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Jb", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Kb", descriptor = "I")
    private int field93;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Mb", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Nb", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Ob", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Pb", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Cb", descriptor = "J")
    public long field85;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Qb", descriptor = "LOJGAHFXC;")
    public class41 field99;

    @OriginalMember(owner = "client!BPHJJPRI", name = "vb", descriptor = "LQYNFXHXW;")
    public class48 field78;

    @OriginalMember(owner = "client!BPHJJPRI", name = "Sb", descriptor = "Ljava/lang/String;")
    public String field101;

    @OriginalMember(owner = "client!BPHJJPRI", name = "c", descriptor = "(I)LOJGAHFXC;")
    private final class41 method38(int arg0) {
        if (this.field78 != null) {
            int var2 = -1;
            if (super.field685 >= 0 && super.field688 == 0) {
                var2 = class14.field717[super.field685].field719[super.field686];
            } else if (super.field700 >= 0) {
                var2 = class14.field717[super.field700].field719[super.field701];
            }
            return this.field78.method513((int[]) null, 653, var2, -1);
        } else {
            long var4 = this.field85;
            while (arg0 >= 0) {
                this.field93 = -71;
            }
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field685 >= 0 && super.field688 == 0) {
                class14 var10 = class14.field717[super.field685];
                var6 = var10.field719[super.field686];
                if (super.field700 >= 0 && super.field700 != super.field697) {
                    var7 = class14.field717[super.field700].field719[super.field701];
                }
                if (var10.field726 >= 0) {
                    var8 = var10.field726;
                    var4 += (long) (var8 - this.field79[5] << 8);
                }
                if (var10.field727 >= 0) {
                    var9 = var10.field727;
                    var4 += (long) (var9 - this.field79[3] << 16);
                }
            } else if (super.field700 >= 0) {
                var6 = class14.field717[super.field700].field719[super.field701];
            }
            class41 var11 = (class41) field82.method531(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field79[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class71.field1727[var14 - 256].method589(0)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class31.method376(var14 - 512).method378(0, this.field105)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field86 != -1L) {
                        var11 = (class41) field82.method531(this.field86);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class41[] var15 = new class41[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field79[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class41 var20 = class71.field1727[var19 - 256].method590(true);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class41 var21 = class31.method376(var19 - 512).method377(this.field105, (byte) 2);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class41(var16, (byte) 112, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field102[var18] != 0) {
                        var11.method427(client.field164[var18][0], client.field164[var18][this.field102[var18]]);
                        if (var18 == 1) {
                            var11.method427(client.field632[0], client.field632[this.field102[var18]]);
                        }
                    }
                }
                var11.method420(this.field93);
                var11.method430(64, 850, -30, -50, -30, true);
                field82.method532(false, var4, var11);
                this.field86 = var4;
            }
            if (this.field104) {
                return var11;
            } else {
                class41 var22 = class41.field1185;
                var22.method415(class37.method395(var6, (byte) 1) & class37.method395(var7, (byte) 1), var11, (byte) 11);
                if (var6 != -1 && var7 != -1) {
                    var22.method422(var6, class14.field717[super.field685].field723, var7, 29445);
                } else if (var6 != -1) {
                    var22.method421(771, var6);
                }
                var22.method417(true);
                var22.field1221 = null;
                var22.field1220 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "client!BPHJJPRI", name = "a", descriptor = "(I)LOJGAHFXC;")
    public final class41 method1(int arg0) {
        if (!this.field87) {
            return null;
        } else {
            class41 var2 = this.method38(-61);
            if (arg0 <= 0) {
                this.field103 = -40;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field705 = var2.field1460;
                var2.field1222 = true;
                if (this.field104) {
                    return var2;
                } else {
                    if (super.field653 != -1 && super.field654 != -1) {
                        class67 var3 = class67.field1691[super.field653];
                        class41 var4 = var3.method582();
                        if (var4 != null) {
                            class41 var5 = new class41(class37.method395(super.field654, (byte) 1), false, true, -900, var4);
                            var5.method426(-super.field657, 0, 2, 0);
                            var5.method420(this.field93);
                            var5.method421(771, var3.field1695.field719[super.field654]);
                            var5.field1221 = null;
                            var5.field1220 = null;
                            if (var3.field1698 != 128 || var3.field1699 != 128) {
                                var5.method429(var3.field1698, this.field80, var3.field1699, var3.field1698);
                            }
                            var5.method430(var3.field1701 + 64, var3.field1702 + 850, -30, -50, -30, true);
                            class41[] var6 = new class41[] { var2, var5 };
                            var2 = new class41(true, var6, 2, true);
                        }
                    }
                    if (this.field99 != null) {
                        if (client.field598 >= this.field76) {
                            this.field99 = null;
                        }
                        if (client.field598 >= this.field75 && client.field598 < this.field76) {
                            class41 var7 = this.field99;
                            var7.method426(this.field97 - this.field106, this.field98 - super.field660, 2, this.field96 - super.field659);
                            if (super.field679 == 512) {
                                var7.method424(5);
                                var7.method424(5);
                                var7.method424(5);
                            } else if (super.field679 == 1024) {
                                var7.method424(5);
                                var7.method424(5);
                            } else if (super.field679 == 1536) {
                                var7.method424(5);
                            }
                            class41[] var8 = new class41[] { var2, var7 };
                            var2 = new class41(true, var8, 2, true);
                            if (super.field679 == 512) {
                                var7.method424(5);
                            } else if (super.field679 == 1024) {
                                var7.method424(5);
                                var7.method424(5);
                            } else if (super.field679 == 1536) {
                                var7.method424(5);
                                var7.method424(5);
                                var7.method424(5);
                            }
                            var7.method426(this.field106 - this.field97, super.field660 - this.field98, 2, super.field659 - this.field96);
                        }
                    }
                    var2.field1222 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!BPHJJPRI", name = "a", descriptor = "(ILEYMNCFMK;)V")
    public final void method39(int arg0, class18 arg1) {
        arg1.field794 = 0;
        this.field105 = arg1.method239();
        this.field81 = arg1.method240();
        this.field94 = arg1.method240();
        this.field78 = null;
        this.field100 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method239();
            if (var4 == 0) {
                this.field79[var3] = 0;
            } else {
                int var5 = arg1.method239();
                this.field79[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field79[0] == 65535) {
                    this.field78 = class48.method512(arg1.method241());
                    break;
                }
                if (this.field79[var3] >= 512 && this.field79[var3] - 512 < class31.field1041) {
                    int var12 = class31.method376(this.field79[var3] - 512).field1031;
                    if (var12 != 0) {
                        this.field100 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg1.method239();
            if (var11 < 0 || var11 >= client.field164[var6].length) {
                var11 = 0;
            }
            this.field102[var6] = var11;
        }
        super.field697 = arg1.method241();
        if (super.field697 == 65535) {
            super.field697 = -1;
        }
        super.field698 = arg1.method241();
        if (super.field698 == 65535) {
            super.field698 = -1;
        }
        super.field665 = arg1.method241();
        if (super.field665 == 65535) {
            super.field665 = -1;
        }
        super.field666 = arg1.method241();
        if (super.field666 == 65535) {
            super.field666 = -1;
        }
        super.field667 = arg1.method241();
        if (super.field667 == 65535) {
            super.field667 = -1;
        }
        super.field668 = arg1.method241();
        if (super.field668 == 65535) {
            super.field668 = -1;
        }
        super.field692 = arg1.method241();
        if (arg0 < 0) {
            if (super.field692 == 65535) {
                super.field692 = -1;
            }
            this.field101 = class32.method384(this.field84, class32.method381(arg1.method245(this.field83), (byte) 82));
            this.field95 = arg1.method239();
            this.field77 = arg1.method241();
            this.field87 = true;
            this.field85 = 0L;
            int var7 = this.field79[5];
            int var8 = this.field79[9];
            this.field79[5] = var8;
            this.field79[9] = var7;
            for (int var9 = 0; var9 < 12; ++var9) {
                this.field85 <<= 4;
                if (this.field79[var9] >= 256) {
                    this.field85 += (long) (this.field79[var9] - 256);
                }
            }
            if (this.field79[0] >= 256) {
                this.field85 += (long) (this.field79[0] - 256 >> 4);
            }
            if (this.field79[1] >= 256) {
                this.field85 += (long) (this.field79[1] - 256 >> 8);
            }
            this.field79[5] = var7;
            this.field79[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field85 <<= 3;
                this.field85 += (long) this.field102[var10];
            }
            this.field85 <<= 1;
            this.field85 += (long) this.field105;
        }
    }

    @OriginalMember(owner = "client!BPHJJPRI", name = "b", descriptor = "(I)Z")
    public final boolean method40(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field87;
    }

    @OriginalMember(owner = "client!BPHJJPRI", name = "d", descriptor = "(I)LOJGAHFXC;")
    public final class41 method41(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (!this.field87) {
            return null;
        } else if (this.field78 != null) {
            return this.field78.method514(-5);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field79[var3];
                if (var12 >= 256 && var12 < 512 && !class71.field1727[var12 - 256].method591(585)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class31.method376(var12 - 512).method375(this.field105, false)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class41[] var4 = new class41[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field79[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class41 var10 = class71.field1727[var9 - 256].method592((byte) -18);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class41 var11 = class31.method376(var9 - 512).method371(this.field105, 9);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class41 var7 = new class41(var5, (byte) 112, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field102[var8] != 0) {
                        var7.method427(client.field164[var8][0], client.field164[var8][this.field102[var8]]);
                        if (var8 == 1) {
                            var7.method427(client.field632[0], client.field632[this.field102[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }
}
