import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CXEZIPRQ")
public class class8 extends class23 {

    @OriginalMember(owner = "CXEZIPRQ", name = "vb", descriptor = "[I")
    public int[] field537 = new int[5];

    @OriginalMember(owner = "CXEZIPRQ", name = "zb", descriptor = "[I")
    public int[] field541 = new int[12];

    @OriginalMember(owner = "CXEZIPRQ", name = "Bb", descriptor = "I")
    private int field543 = -7539;

    @OriginalMember(owner = "CXEZIPRQ", name = "Fb", descriptor = "Z")
    public boolean field547 = false;

    @OriginalMember(owner = "CXEZIPRQ", name = "Gb", descriptor = "Z")
    public boolean field548 = false;

    @OriginalMember(owner = "CXEZIPRQ", name = "Ib", descriptor = "Z")
    private boolean field550 = true;

    @OriginalMember(owner = "CXEZIPRQ", name = "Jb", descriptor = "J")
    public long field551 = -1L;

    @OriginalMember(owner = "CXEZIPRQ", name = "xb", descriptor = "LQQBOAQZB;")
    public static class50 field539 = new class50(3, 260);

    @OriginalMember(owner = "CXEZIPRQ", name = "tb", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "CXEZIPRQ", name = "ub", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "CXEZIPRQ", name = "wb", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "CXEZIPRQ", name = "yb", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "CXEZIPRQ", name = "Ab", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "CXEZIPRQ", name = "Cb", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "CXEZIPRQ", name = "Db", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "CXEZIPRQ", name = "Eb", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "CXEZIPRQ", name = "Hb", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "CXEZIPRQ", name = "Kb", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "CXEZIPRQ", name = "Lb", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "CXEZIPRQ", name = "Mb", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "CXEZIPRQ", name = "Nb", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "CXEZIPRQ", name = "Ob", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "CXEZIPRQ", name = "Pb", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "CXEZIPRQ", name = "Qb", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "CXEZIPRQ", name = "sb", descriptor = "J")
    public long field534;

    @OriginalMember(owner = "CXEZIPRQ", name = "Rb", descriptor = "LDHUPIIUL;")
    public class10 field559;

    @OriginalMember(owner = "CXEZIPRQ", name = "rb", descriptor = "LDOBKXCMM;")
    public class14 field533;

    @OriginalMember(owner = "CXEZIPRQ", name = "qb", descriptor = "Ljava/lang/String;")
    public String field532;

    @OriginalMember(owner = "CXEZIPRQ", name = "b", descriptor = "(B)Z")
    public final boolean method161(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field543 = -240;
        }
        return this.field547;
    }

    @OriginalMember(owner = "CXEZIPRQ", name = "a", descriptor = "(I)LDHUPIIUL;")
    public final class10 method162(int arg0) {
        if (!this.field547) {
            return null;
        } else if (this.field533 != null) {
            return this.field533.method236(0);
        } else {
            boolean var2 = false;
            if (arg0 >= this.field538 && arg0 <= this.field538) {
                for (int var3 = 0; var3 < 12; ++var3) {
                    int var12 = this.field541[var3];
                    if (var12 >= 256 && var12 < 512 && !class21.field843[var12 - 256].method261(false)) {
                        var2 = true;
                    }
                    if (var12 >= 512 && !class27.method286(var12 - 512).method289(this.field546, (byte) 4)) {
                        var2 = true;
                    }
                }
                if (var2) {
                    return null;
                } else {
                    class10[] var4 = new class10[12];
                    int var5 = 0;
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field541[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class10 var10 = class21.field843[var9 - 256].method262((byte) 3);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class10 var11 = class27.method286(var9 - 512).method279(this.field546, false);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class10 var7 = new class10(17776, var4, var5);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field537[var8] != 0) {
                            var7.method205(client.field433[var8][0], client.field433[var8][this.field537[var8]]);
                            if (var8 == 1) {
                                var7.method205(client.field345[0], client.field345[this.field537[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "CXEZIPRQ", name = "a", descriptor = "(LINLHDAGO;Z)V")
    public final void method163(class29 arg0, boolean arg1) {
        arg0.field1107 = 0;
        this.field546 = arg0.method308();
        this.field542 = arg0.method308();
        this.field533 = null;
        this.field549 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method308();
            if (var4 == 0) {
                this.field541[var3] = 0;
            } else {
                int var5 = arg0.method308();
                this.field541[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field541[0] == 65535) {
                    this.field533 = class14.method239(arg0.method310());
                    break;
                }
                if (this.field541[var3] >= 512 && this.field541[var3] - 512 < class27.field1010) {
                    int var10 = class27.method286(this.field541[var3] - 512).field1007;
                    if (var10 != 0) {
                        this.field549 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg0.method308();
            if (var9 < 0 || var9 >= client.field433[var6].length) {
                var9 = 0;
            }
            this.field537[var6] = var9;
        }
        if (!arg1) {
            this.field550 = !this.field550;
        }
        super.field860 = arg0.method310();
        if (super.field860 == 65535) {
            super.field860 = -1;
        }
        super.field861 = arg0.method310();
        if (super.field861 == 65535) {
            super.field861 = -1;
        }
        super.field891 = arg0.method310();
        if (super.field891 == 65535) {
            super.field891 = -1;
        }
        super.field892 = arg0.method310();
        if (super.field892 == 65535) {
            super.field892 = -1;
        }
        super.field893 = arg0.method310();
        if (super.field893 == 65535) {
            super.field893 = -1;
        }
        super.field894 = arg0.method310();
        if (super.field894 == 65535) {
            super.field894 = -1;
        }
        super.field867 = arg0.method310();
        if (super.field867 == 65535) {
            super.field867 = -1;
        }
        this.field532 = class55.method473(false, class55.method470(arg0.method314((byte) -119), (byte) 8));
        this.field536 = arg0.method308();
        this.field535 = arg0.method310();
        this.field547 = true;
        this.field534 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field534 <<= 4;
            if (this.field541[var7] >= 256) {
                this.field534 += (long) (this.field541[var7] - 256);
            }
        }
        if (this.field541[0] >= 256) {
            this.field534 += (long) (this.field541[0] - 256 >> 4);
        }
        if (this.field541[1] >= 256) {
            this.field534 += (long) (this.field541[1] - 256 >> 8);
        }
        for (int var8 = 0; var8 < 5; ++var8) {
            this.field534 <<= 3;
            this.field534 += (long) this.field537[var8];
        }
        this.field534 <<= 1;
        this.field534 += (long) this.field546;
    }

    @OriginalMember(owner = "CXEZIPRQ", name = "b", descriptor = "(I)LDHUPIIUL;")
    private final class10 method164(int arg0) {
        if (this.field533 != null) {
            int var2 = -1;
            if (super.field898 >= 0 && super.field901 == 0) {
                var2 = class26.field949[super.field898].field951[super.field899];
            } else if (super.field878 >= 0) {
                var2 = class26.field949[super.field878].field951[super.field879];
            }
            return this.field533.method237(-1, (int[]) null, var2, 623);
        } else {
            long var4 = this.field534;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field898 >= 0 && super.field901 == 0) {
                class26 var10 = class26.field949[super.field898];
                var6 = var10.field951[super.field899];
                if (super.field878 >= 0 && super.field878 != super.field860) {
                    var7 = class26.field949[super.field878].field951[super.field879];
                }
                if (var10.field958 >= 0) {
                    var8 = var10.field958;
                    var4 += (long) (var8 - this.field541[5] << 8);
                }
                if (var10.field959 >= 0) {
                    var9 = var10.field959;
                    var4 += (long) (var9 - this.field541[3] << 16);
                }
            } else if (super.field878 >= 0) {
                var6 = class26.field949[super.field878].field951[super.field879];
            }
            class10 var11 = (class10) field539.method421(var4);
            if (arg0 != 0) {
                for (int var12 = 1; var12 > 0; ++var12) {
                }
            }
            if (var11 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field541[var14];
                    if (var9 >= 0 && var14 == 3) {
                        var15 = var9;
                    }
                    if (var8 >= 0 && var14 == 5) {
                        var15 = var8;
                    }
                    if (var15 >= 256 && var15 < 512 && !class21.field843[var15 - 256].method259((byte) 1)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !class27.method286(var15 - 512).method283(this.field546, (byte) 9)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field551 != -1L) {
                        var11 = (class10) field539.method421(this.field551);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class10[] var16 = new class10[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field541[var18];
                    if (var9 >= 0 && var18 == 3) {
                        var20 = var9;
                    }
                    if (var8 >= 0 && var18 == 5) {
                        var20 = var8;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        class10 var21 = class21.field843[var20 - 256].method260(7);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        class10 var22 = class27.method286(var20 - 512).method287(this.field546, -215);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var11 = new class10(17776, var16, var17);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field537[var19] != 0) {
                        var11.method205(client.field433[var19][0], client.field433[var19][this.field537[var19]]);
                        if (var19 == 1) {
                            var11.method205(client.field345[0], client.field345[this.field537[var19]]);
                        }
                    }
                }
                var11.method198(-390);
                var11.method208(64, 850, -30, -50, -30, true);
                field539.method422(true, var11, var4);
                this.field551 = var4;
            }
            if (this.field548) {
                return var11;
            } else {
                class10 var23 = class10.field612;
                var23.method193(8, var11, class5.method16(var6, true) & class5.method16(var7, true));
                if (var6 != -1 && var7 != -1) {
                    var23.method200(class26.field949[super.field898].field955, var6, var7, (byte) 1);
                } else if (var6 != -1) {
                    var23.method199(var6, 0);
                }
                var23.method195(1);
                var23.field649 = null;
                var23.field648 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "CXEZIPRQ", name = "a", descriptor = "(B)LDHUPIIUL;")
    public final class10 method159(byte arg0) {
        if (!this.field547) {
            return null;
        } else {
            class10 var2 = this.method164(0);
            if (var2 == null) {
                return null;
            } else {
                super.field912 = var2.field789;
                if (arg0 != 5) {
                    throw new NullPointerException();
                } else {
                    var2.field650 = true;
                    if (this.field548) {
                        return var2;
                    } else {
                        if (super.field905 != -1 && super.field906 != -1) {
                            class70 var3 = class70.field1694[super.field905];
                            class10 var4 = var3.method582();
                            if (var4 != null) {
                                class10 var5 = new class10(var4, false, class5.method16(super.field906, true), 878, true);
                                var5.method204(0, 0, 0, -super.field909);
                                var5.method198(-390);
                                var5.method199(var3.field1698.field951[super.field906], 0);
                                var5.field649 = null;
                                var5.field648 = null;
                                if (var3.field1701 != 128 || var3.field1702 != 128) {
                                    var5.method207(-592, var3.field1701, var3.field1702, var3.field1701);
                                }
                                var5.method208(var3.field1704 + 64, var3.field1705 + 850, -30, -50, -30, true);
                                class10[] var6 = new class10[] { var2, var5 };
                                var2 = new class10(true, 0, 2, var6);
                            }
                        }
                        if (this.field559 != null) {
                            if (client.field341 >= this.field545) {
                                this.field559 = null;
                            }
                            if (client.field341 >= this.field544 && client.field341 < this.field545) {
                                class10 var7 = this.field559;
                                var7.method204(this.field556 - super.field885, 0, this.field558 - super.field886, this.field557 - this.field540);
                                if (super.field883 == 512) {
                                    var7.method202(true);
                                    var7.method202(true);
                                    var7.method202(true);
                                } else if (super.field883 == 1024) {
                                    var7.method202(true);
                                    var7.method202(true);
                                } else if (super.field883 == 1536) {
                                    var7.method202(true);
                                }
                                class10[] var8 = new class10[] { var2, var7 };
                                var2 = new class10(true, 0, 2, var8);
                                if (super.field883 == 512) {
                                    var7.method202(true);
                                } else if (super.field883 == 1024) {
                                    var7.method202(true);
                                    var7.method202(true);
                                } else if (super.field883 == 1536) {
                                    var7.method202(true);
                                    var7.method202(true);
                                    var7.method202(true);
                                }
                                var7.method204(super.field885 - this.field556, 0, super.field886 - this.field558, this.field540 - this.field557);
                            }
                        }
                        var2.field650 = true;
                        return var2;
                    }
                }
            }
        }
    }
}
