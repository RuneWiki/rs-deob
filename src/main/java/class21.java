import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HHCKFJEO")
public class class21 extends class5 {

    @OriginalMember(owner = "HHCKFJEO", name = "qb", descriptor = "Z")
    private boolean field776 = false;

    @OriginalMember(owner = "HHCKFJEO", name = "rb", descriptor = "Z")
    private boolean field777 = true;

    @OriginalMember(owner = "HHCKFJEO", name = "sb", descriptor = "[I")
    public int[] field778 = new int[5];

    @OriginalMember(owner = "HHCKFJEO", name = "ub", descriptor = "I")
    public int field780 = -1;

    @OriginalMember(owner = "HHCKFJEO", name = "vb", descriptor = "J")
    public long field781 = -1L;

    @OriginalMember(owner = "HHCKFJEO", name = "wb", descriptor = "Z")
    public boolean field782 = false;

    @OriginalMember(owner = "HHCKFJEO", name = "Bb", descriptor = "I")
    public int field787 = -1;

    @OriginalMember(owner = "HHCKFJEO", name = "Fb", descriptor = "Z")
    private boolean field791 = true;

    @OriginalMember(owner = "HHCKFJEO", name = "Gb", descriptor = "Z")
    private boolean field792 = true;

    @OriginalMember(owner = "HHCKFJEO", name = "Pb", descriptor = "[I")
    public int[] field801 = new int[12];

    @OriginalMember(owner = "HHCKFJEO", name = "Sb", descriptor = "Z")
    public boolean field804 = false;

    @OriginalMember(owner = "HHCKFJEO", name = "Eb", descriptor = "LRPWOWYDL;")
    public static class51 field790 = new class51(0, 260);

    @OriginalMember(owner = "HHCKFJEO", name = "tb", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "HHCKFJEO", name = "xb", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "HHCKFJEO", name = "yb", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "HHCKFJEO", name = "zb", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "HHCKFJEO", name = "Db", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "HHCKFJEO", name = "Hb", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "HHCKFJEO", name = "Ib", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "HHCKFJEO", name = "Jb", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "HHCKFJEO", name = "Kb", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "HHCKFJEO", name = "Lb", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "HHCKFJEO", name = "Mb", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "HHCKFJEO", name = "Nb", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "HHCKFJEO", name = "Ob", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "HHCKFJEO", name = "Qb", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "HHCKFJEO", name = "Ub", descriptor = "I")
    private int field806;

    @OriginalMember(owner = "HHCKFJEO", name = "Cb", descriptor = "J")
    public long field788;

    @OriginalMember(owner = "HHCKFJEO", name = "Rb", descriptor = "LHEKJNUPL;")
    public class20 field803;

    @OriginalMember(owner = "HHCKFJEO", name = "Ab", descriptor = "LSNMMQNPZ;")
    public class55 field786;

    @OriginalMember(owner = "HHCKFJEO", name = "Tb", descriptor = "Ljava/lang/String;")
    public String field805;

    @OriginalMember(owner = "HHCKFJEO", name = "a", descriptor = "(I)LSNMMQNPZ;")
    public final class55 method275(int arg0) {
        if (!this.field804) {
            return null;
        } else if (this.field803 != null) {
            return this.field803.method270(true);
        } else {
            boolean var2 = false;
            if (arg0 != 8) {
                this.field806 = 38;
            }
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field801[var3];
                if (var12 >= 256 && var12 < 512 && !class9.field617[var12 - 256].method173(713)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class26.method293(var12 - 512).method285(this.field802, true)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class55[] var4 = new class55[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field801[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class55 var10 = class9.field617[var9 - 256].method174(false);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class55 var11 = class26.method293(var9 - 512).method294(this.field802, (byte) 3);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class55 var7 = new class55(var5, false, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field778[var8] != 0) {
                        var7.method432(client.field377[var8][0], client.field377[var8][this.field778[var8]]);
                        if (var8 == 1) {
                            var7.method432(client.field511[0], client.field511[this.field778[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "HHCKFJEO", name = "a", descriptor = "(Z)Z")
    public final boolean method20(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field804;
    }

    @OriginalMember(owner = "HHCKFJEO", name = "a", descriptor = "(B)LSNMMQNPZ;")
    public final class55 method175(byte arg0) {
        if (!this.field804) {
            return null;
        } else {
            class55 var2 = this.method276((byte) 74);
            if (var2 == null) {
                return null;
            } else {
                super.field84 = var2.field1628;
                var2.field1371 = true;
                if (arg0 != 5) {
                    this.field776 = !this.field776;
                }
                if (this.field782) {
                    return var2;
                } else {
                    if (super.field59 != -1 && super.field60 != -1) {
                        class37 var3 = class37.field1137[super.field59];
                        class55 var4 = var3.method351();
                        if (var4 != null) {
                            class55 var5 = new class55(var4, 707, false, true, class39.method356((byte) 68, super.field60));
                            var5.method431(0, -super.field63, false, 0);
                            var5.method425(false);
                            var5.method426(var3.field1141.field1729[super.field60], (byte) 1);
                            var5.field1370 = null;
                            var5.field1369 = null;
                            if (var3.field1144 != 128 || var3.field1145 != 128) {
                                var5.method434(2985, var3.field1144, var3.field1144, var3.field1145);
                            }
                            var5.method435(var3.field1147 + 64, var3.field1148 + 850, -30, -50, -30, true);
                            class55[] var6 = new class55[] { var2, var5 };
                            var2 = new class55(false, true, 2, var6);
                        }
                    }
                    if (this.field786 != null) {
                        if (client.field438 >= this.field799) {
                            this.field786 = null;
                        }
                        if (client.field438 >= this.field798 && client.field438 < this.field799) {
                            class55 var7 = this.field786;
                            var7.method431(this.field783 - super.field102, this.field784 - this.field789, false, this.field785 - super.field103);
                            if (super.field74 == 512) {
                                var7.method429(3);
                                var7.method429(3);
                                var7.method429(3);
                            } else if (super.field74 == 1024) {
                                var7.method429(3);
                                var7.method429(3);
                            } else if (super.field74 == 1536) {
                                var7.method429(3);
                            }
                            class55[] var8 = new class55[] { var2, var7 };
                            var2 = new class55(false, true, 2, var8);
                            if (super.field74 == 512) {
                                var7.method429(3);
                            } else if (super.field74 == 1024) {
                                var7.method429(3);
                                var7.method429(3);
                            } else if (super.field74 == 1536) {
                                var7.method429(3);
                                var7.method429(3);
                                var7.method429(3);
                            }
                            var7.method431(super.field102 - this.field783, this.field789 - this.field784, false, super.field103 - this.field785);
                        }
                    }
                    var2.field1371 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "HHCKFJEO", name = "c", descriptor = "(B)LSNMMQNPZ;")
    private final class55 method276(byte arg0) {
        if (this.field803 != null) {
            int var2 = -1;
            if (super.field90 >= 0 && super.field93 == 0) {
                var2 = class71.field1727[super.field90].field1729[super.field91];
            } else if (super.field49 >= 0) {
                var2 = class71.field1727[super.field49].field1729[super.field50];
            }
            return this.field803.method268(this.field792, var2, (int[]) null, -1);
        } else {
            long var4 = this.field788;
            if (arg0 != 74) {
                this.field777 = !this.field777;
            }
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field90 >= 0 && super.field93 == 0) {
                class71 var10 = class71.field1727[super.field90];
                var6 = var10.field1729[super.field91];
                if (super.field49 >= 0 && super.field66 != super.field49) {
                    var7 = class71.field1727[super.field49].field1729[super.field50];
                }
                if (var10.field1736 >= 0) {
                    var8 = var10.field1736;
                    var4 += (long) (var8 - this.field801[5] << 8);
                }
                if (var10.field1737 >= 0) {
                    var9 = var10.field1737;
                    var4 += (long) (var9 - this.field801[3] << 16);
                }
            } else if (super.field49 >= 0) {
                var6 = class71.field1727[super.field49].field1729[super.field50];
            }
            class55 var11 = (class55) field790.method401(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field801[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class9.field617[var14 - 256].method171(-980)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class26.method293(var14 - 512).method296(this.field802, (byte) 6)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field781 != -1L) {
                        var11 = (class55) field790.method401(this.field781);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class55[] var15 = new class55[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field801[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class55 var20 = class9.field617[var19 - 256].method172(40);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class55 var21 = class26.method293(var19 - 512).method291(true, this.field802);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class55(var16, false, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field778[var18] != 0) {
                        var11.method432(client.field377[var18][0], client.field377[var18][this.field778[var18]]);
                        if (var18 == 1) {
                            var11.method432(client.field511[0], client.field511[this.field778[var18]]);
                        }
                    }
                }
                var11.method425(false);
                var11.method435(64, 850, -30, -50, -30, true);
                field790.method402((byte) 124, var4, var11);
                this.field781 = var4;
            }
            if (this.field782) {
                return var11;
            } else {
                class55 var22 = class55.field1333;
                var22.method420(var11, (byte) 38, class39.method356((byte) 68, var6) & class39.method356((byte) 68, var7));
                if (var6 != -1 && var7 != -1) {
                    var22.method427(var7, class71.field1727[super.field90].field1733, 4, var6);
                } else if (var6 != -1) {
                    var22.method426(var6, (byte) 1);
                }
                var22.method422(4);
                var22.field1370 = null;
                var22.field1369 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "HHCKFJEO", name = "a", descriptor = "(LDNRIFKTO;I)V")
    public final void method277(class11 arg0, int arg1) {
        arg0.field643 = 0;
        this.field802 = arg0.method189();
        this.field787 = arg0.method190();
        this.field780 = arg0.method190();
        if (arg1 == 0) {
            this.field803 = null;
            this.field779 = 0;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var4 = arg0.method189();
                if (var4 == 0) {
                    this.field801[var3] = 0;
                } else {
                    int var5 = arg0.method189();
                    this.field801[var3] = (var4 << 8) + var5;
                    if (var3 == 0 && this.field801[0] == 65535) {
                        this.field803 = class20.method273(arg0.method191());
                        break;
                    }
                    if (this.field801[var3] >= 512 && this.field801[var3] - 512 < class26.field887) {
                        int var10 = class26.method293(this.field801[var3] - 512).field850;
                        if (var10 != 0) {
                            this.field779 = var10;
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                int var9 = arg0.method189();
                if (var9 < 0 || var9 >= client.field377[var6].length) {
                    var9 = 0;
                }
                this.field778[var6] = var9;
            }
            super.field66 = arg0.method191();
            if (super.field66 == 65535) {
                super.field66 = -1;
            }
            super.field67 = arg0.method191();
            if (super.field67 == 65535) {
                super.field67 = -1;
            }
            super.field55 = arg0.method191();
            if (super.field55 == 65535) {
                super.field55 = -1;
            }
            super.field56 = arg0.method191();
            if (super.field56 == 65535) {
                super.field56 = -1;
            }
            super.field57 = arg0.method191();
            if (super.field57 == 65535) {
                super.field57 = -1;
            }
            super.field58 = arg0.method191();
            if (super.field58 == 65535) {
                super.field58 = -1;
            }
            super.field100 = arg0.method191();
            if (super.field100 == 65535) {
                super.field100 = -1;
            }
            this.field805 = class25.method282(49845, class25.method279(this.field791, arg0.method195(0)));
            this.field800 = arg0.method189();
            this.field793 = arg0.method191();
            this.field804 = true;
            this.field788 = 0L;
            for (int var7 = 0; var7 < 12; ++var7) {
                this.field788 <<= 4;
                if (this.field801[var7] >= 256) {
                    this.field788 += (long) (this.field801[var7] - 256);
                }
            }
            if (this.field801[0] >= 256) {
                this.field788 += (long) (this.field801[0] - 256 >> 4);
            }
            if (this.field801[1] >= 256) {
                this.field788 += (long) (this.field801[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field788 <<= 3;
                this.field788 += (long) this.field778[var8];
            }
            this.field788 <<= 1;
            this.field788 += (long) this.field802;
        }
    }
}
