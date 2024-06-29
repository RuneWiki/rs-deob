import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BSQIIHOT")
public class class6 extends class27 {

    @OriginalMember(owner = "client!BSQIIHOT", name = "pb", descriptor = "I")
    public int field88 = -1;

    @OriginalMember(owner = "client!BSQIIHOT", name = "qb", descriptor = "Z")
    public boolean field89 = false;

    @OriginalMember(owner = "client!BSQIIHOT", name = "tb", descriptor = "Z")
    public boolean field92 = false;

    @OriginalMember(owner = "client!BSQIIHOT", name = "vb", descriptor = "[I")
    public int[] field94 = new int[12];

    @OriginalMember(owner = "client!BSQIIHOT", name = "xb", descriptor = "[I")
    public int[] field96 = new int[5];

    @OriginalMember(owner = "client!BSQIIHOT", name = "zb", descriptor = "Z")
    private boolean field98 = true;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Ab", descriptor = "I")
    public int field99 = -1;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Cb", descriptor = "Z")
    private boolean field101 = false;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Jb", descriptor = "J")
    public long field108 = -1L;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Lb", descriptor = "I")
    private int field110 = 587;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Rb", descriptor = "I")
    private int field116 = 503;

    @OriginalMember(owner = "client!BSQIIHOT", name = "rb", descriptor = "LWUMSOEQS;")
    public static class65 field90 = new class65((byte) 5, 260);

    @OriginalMember(owner = "client!BSQIIHOT", name = "Bb", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Db", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Eb", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Fb", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Hb", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Ib", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Kb", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Mb", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Nb", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Ob", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Pb", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Qb", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!BSQIIHOT", name = "sb", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!BSQIIHOT", name = "wb", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!BSQIIHOT", name = "yb", descriptor = "J")
    public long field97;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Sb", descriptor = "LLQFHJGYA;")
    public class30 field117;

    @OriginalMember(owner = "client!BSQIIHOT", name = "Gb", descriptor = "LPDVZPZLT;")
    public class42 field105;

    @OriginalMember(owner = "client!BSQIIHOT", name = "ub", descriptor = "Ljava/lang/String;")
    public String field93;

    @OriginalMember(owner = "client!BSQIIHOT", name = "a", descriptor = "(Z)LPDVZPZLT;")
    private final class42 method40(boolean arg0) {
        if (this.field117 != null) {
            int var2 = -1;
            if (super.field933 >= 0 && super.field936 == 0) {
                var2 = class28.field952[super.field933].field954[super.field934];
            } else if (super.field946 >= 0) {
                var2 = class28.field952[super.field946].field954[super.field947];
            }
            return this.field117.method317((int[]) null, (byte) -57, var2, -1);
        } else {
            long var4 = this.field97;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field933 >= 0 && super.field936 == 0) {
                class28 var10 = class28.field952[super.field933];
                var6 = var10.field954[super.field934];
                if (super.field946 >= 0 && super.field946 != super.field942) {
                    var7 = class28.field952[super.field946].field954[super.field947];
                }
                if (var10.field961 >= 0) {
                    var8 = var10.field961;
                    var4 += (long) (var8 - this.field94[5] << 8);
                }
                if (var10.field962 >= 0) {
                    var9 = var10.field962;
                    var4 += (long) (var9 - this.field94[3] << 16);
                }
            } else if (super.field946 >= 0) {
                var6 = class28.field952[super.field946].field954[super.field947];
            }
            class42 var11 = (class42) field90.method586(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field94[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class33.field1044[var14 - 256].method337(0)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class3.method11(var14 - 512).method15(this.field95, true)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field108 != -1L) {
                        var11 = (class42) field90.method586(this.field108);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class42[] var15 = new class42[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field94[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class42 var20 = class33.field1044[var19 - 256].method338(true);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class42 var21 = class3.method11(var19 - 512).method6(0, this.field95);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class42(var15, var16, 0);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field96[var18] != 0) {
                        var11.method428(client.field514[var18][0], client.field514[var18][this.field96[var18]]);
                        if (var18 == 1) {
                            var11.method428(client.field489[0], client.field489[this.field96[var18]]);
                        }
                    }
                }
                var11.method421(0);
                var11.method431(64, 850, -30, -50, -30, true);
                field90.method587(0, var4, var11);
                this.field108 = var4;
            }
            if (this.field92) {
                return var11;
            } else {
                class42 var22 = class42.field1292;
                if (arg0) {
                    this.field98 = !this.field98;
                }
                var22.method416(0, class71.method602(var6, true) & class71.method602(var7, true), var11);
                if (var6 != -1 && var7 != -1) {
                    var22.method423(true, var6, var7, class28.field952[super.field933].field958);
                } else if (var6 != -1) {
                    var22.method422(0, var6);
                }
                var22.method418(false);
                var22.field1328 = null;
                var22.field1327 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "client!BSQIIHOT", name = "c", descriptor = "(B)Z")
    public final boolean method1(byte arg0) {
        if (arg0 != 9) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field89;
    }

    @OriginalMember(owner = "client!BSQIIHOT", name = "a", descriptor = "(I)LPDVZPZLT;")
    public final class42 method41(int arg0) {
        if (!this.field89) {
            return null;
        } else if (this.field117 != null) {
            return this.field117.method321(this.field110);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field94[var3];
                if (var12 >= 256 && var12 < 512 && !class33.field1044[var12 - 256].method339(319)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class3.method11(var12 - 512).method16(this.field95, this.field116)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class42[] var4 = new class42[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field94[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class42 var10 = class33.field1044[var9 - 256].method340(0);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class42 var11 = class3.method11(var9 - 512).method9(this.field95, (byte) -80);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                if (arg0 != 38010) {
                    throw new NullPointerException();
                } else {
                    class42 var7 = new class42(var4, var5, 0);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field96[var8] != 0) {
                            var7.method428(client.field514[var8][0], client.field514[var8][this.field96[var8]]);
                            if (var8 == 1) {
                                var7.method428(client.field489[0], client.field489[this.field96[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!BSQIIHOT", name = "a", descriptor = "(LMVHXDWGI;I)V")
    public final void method42(class38 arg0, int arg1) {
        arg0.field1161 = 0;
        this.field95 = arg0.method357();
        this.field88 = arg0.method358();
        this.field99 = arg0.method358();
        this.field117 = null;
        this.field100 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method357();
            if (var4 == 0) {
                this.field94[var3] = 0;
            } else {
                int var5 = arg0.method357();
                this.field94[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field94[0] == 65535) {
                    this.field117 = class30.method315(arg0.method359());
                    break;
                }
                if (this.field94[var3] >= 512 && this.field94[var3] - 512 < class3.field48) {
                    int var12 = class3.method11(this.field94[var3] - 512).field49;
                    if (var12 != 0) {
                        this.field100 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg0.method357();
            if (var11 < 0 || var11 >= client.field514[var6].length) {
                var11 = 0;
            }
            this.field96[var6] = var11;
        }
        super.field942 = arg0.method359();
        if (super.field942 == 65535) {
            super.field942 = -1;
        }
        super.field943 = arg0.method359();
        if (super.field943 == 65535) {
            super.field943 = -1;
        }
        super.field915 = arg0.method359();
        if (super.field915 == 65535) {
            super.field915 = -1;
        }
        super.field916 = arg0.method359();
        if (super.field916 == 65535) {
            super.field916 = -1;
        }
        super.field917 = arg0.method359();
        if (super.field917 == 65535) {
            super.field917 = -1;
        }
        super.field918 = arg0.method359();
        if (super.field918 == 65535) {
            super.field918 = -1;
        }
        super.field928 = arg0.method359();
        if (super.field928 == 65535) {
            super.field928 = -1;
        }
        this.field93 = class58.method551(class58.method548(arg0.method363(0), 13452), 0);
        this.field109 = arg0.method357();
        this.field111 = arg0.method359();
        this.field89 = true;
        this.field97 = 0L;
        if (arg1 == -46903) {
            int var7 = this.field94[5];
            int var8 = this.field94[9];
            this.field94[5] = var8;
            this.field94[9] = var7;
            for (int var9 = 0; var9 < 12; ++var9) {
                this.field97 <<= 4;
                if (this.field94[var9] >= 256) {
                    this.field97 += (long) (this.field94[var9] - 256);
                }
            }
            if (this.field94[0] >= 256) {
                this.field97 += (long) (this.field94[0] - 256 >> 4);
            }
            if (this.field94[1] >= 256) {
                this.field97 += (long) (this.field94[1] - 256 >> 8);
            }
            this.field94[5] = var7;
            this.field94[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field97 <<= 3;
                this.field97 += (long) this.field96[var10];
            }
            this.field97 <<= 1;
            this.field97 += (long) this.field95;
        }
    }

    @OriginalMember(owner = "client!BSQIIHOT", name = "a", descriptor = "(B)LPDVZPZLT;")
    public final class42 method3(byte arg0) {
        if (!this.field89) {
            return null;
        } else {
            class42 var2 = this.method40(false);
            if (var2 == null) {
                return null;
            } else {
                super.field894 = var2.field1695;
                var2.field1329 = true;
                if (this.field92) {
                    return var2;
                } else {
                    if (super.field900 != -1 && super.field901 != -1) {
                        class34 var3 = class34.field1053[super.field900];
                        class42 var4 = var3.method343();
                        if (var4 != null) {
                            class42 var5 = new class42(var4, true, class71.method602(super.field901, true), 0, false);
                            var5.method427(0, 0, -super.field904, 0);
                            var5.method421(0);
                            var5.method422(0, var3.field1057.field954[super.field901]);
                            var5.field1328 = null;
                            var5.field1327 = null;
                            if (var3.field1060 != 128 || var3.field1061 != 128) {
                                var5.method430(var3.field1060, var3.field1061, var3.field1060, (byte) 6);
                            }
                            var5.method431(var3.field1063 + 64, var3.field1064 + 850, -30, -50, -30, true);
                            class42[] var6 = new class42[] { var2, var5 };
                            var2 = new class42(7, var6, true, 2);
                        }
                    }
                    if (this.field105 != null) {
                        if (client.field502 >= this.field107) {
                            this.field105 = null;
                        }
                        if (client.field502 >= this.field106 && client.field502 < this.field107) {
                            class42 var7 = this.field105;
                            var7.method427(0, this.field104 - super.field939, this.field103 - this.field91, this.field102 - super.field938);
                            if (super.field927 == 512) {
                                var7.method425(9);
                                var7.method425(9);
                                var7.method425(9);
                            } else if (super.field927 == 1024) {
                                var7.method425(9);
                                var7.method425(9);
                            } else if (super.field927 == 1536) {
                                var7.method425(9);
                            }
                            class42[] var8 = new class42[] { var2, var7 };
                            var2 = new class42(7, var8, true, 2);
                            if (super.field927 == 512) {
                                var7.method425(9);
                            } else if (super.field927 == 1024) {
                                var7.method425(9);
                                var7.method425(9);
                            } else if (super.field927 == 1536) {
                                var7.method425(9);
                                var7.method425(9);
                                var7.method425(9);
                            }
                            var7.method427(0, super.field939 - this.field104, this.field91 - this.field103, super.field938 - this.field102);
                        }
                    }
                    var2.field1329 = true;
                    if (arg0 != 6) {
                        this.field101 = !this.field101;
                    }
                    return var2;
                }
            }
        }
    }
}
