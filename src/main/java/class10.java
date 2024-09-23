import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EJJAKGTE")
public class class10 extends class16 {

    @OriginalMember(owner = "EJJAKGTE", name = "rb", descriptor = "B")
    private byte field618 = 3;

    @OriginalMember(owner = "EJJAKGTE", name = "sb", descriptor = "[I")
    public int[] field619 = new int[12];

    @OriginalMember(owner = "EJJAKGTE", name = "vb", descriptor = "Z")
    private boolean field622 = true;

    @OriginalMember(owner = "EJJAKGTE", name = "xb", descriptor = "I")
    public int field624 = -1;

    @OriginalMember(owner = "EJJAKGTE", name = "zb", descriptor = "J")
    public long field626 = -1L;

    @OriginalMember(owner = "EJJAKGTE", name = "Ab", descriptor = "[I")
    public int[] field627 = new int[5];

    @OriginalMember(owner = "EJJAKGTE", name = "Bb", descriptor = "I")
    private int field628 = -64;

    @OriginalMember(owner = "EJJAKGTE", name = "Gb", descriptor = "Z")
    public boolean field633 = false;

    @OriginalMember(owner = "EJJAKGTE", name = "Mb", descriptor = "I")
    public int field639 = -1;

    @OriginalMember(owner = "EJJAKGTE", name = "Pb", descriptor = "I")
    private int field642 = -261;

    @OriginalMember(owner = "EJJAKGTE", name = "Sb", descriptor = "Z")
    public boolean field645 = false;

    @OriginalMember(owner = "EJJAKGTE", name = "Ub", descriptor = "Z")
    private boolean field647 = false;

    @OriginalMember(owner = "EJJAKGTE", name = "Vb", descriptor = "I")
    private int field648 = 1;

    @OriginalMember(owner = "EJJAKGTE", name = "Hb", descriptor = "LVNWSQIXW;")
    public static class54 field634 = new class54(260, (byte) 8);

    @OriginalMember(owner = "EJJAKGTE", name = "qb", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "EJJAKGTE", name = "ub", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "EJJAKGTE", name = "wb", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "EJJAKGTE", name = "Cb", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "EJJAKGTE", name = "Db", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "EJJAKGTE", name = "Eb", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "EJJAKGTE", name = "Ib", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "EJJAKGTE", name = "Jb", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "EJJAKGTE", name = "Kb", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "EJJAKGTE", name = "Lb", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "EJJAKGTE", name = "Nb", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "EJJAKGTE", name = "Ob", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "EJJAKGTE", name = "Qb", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "EJJAKGTE", name = "Tb", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "EJJAKGTE", name = "Wb", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "EJJAKGTE", name = "Rb", descriptor = "J")
    public long field644;

    @OriginalMember(owner = "EJJAKGTE", name = "Fb", descriptor = "LOQIGXOFQ;")
    public class35 field632;

    @OriginalMember(owner = "EJJAKGTE", name = "tb", descriptor = "LDDJHHGTJ;")
    public class6 field620;

    @OriginalMember(owner = "EJJAKGTE", name = "yb", descriptor = "Ljava/lang/String;")
    public String field625;

    @OriginalMember(owner = "EJJAKGTE", name = "b", descriptor = "(I)Z")
    public final boolean method169(int arg0) {
        while (arg0 >= 0) {
            this.field647 = !this.field647;
        }
        if (!this.field645) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "EJJAKGTE", name = "a", descriptor = "(B)LOQIGXOFQ;")
    private final class35 method170(byte arg0) {
        if (this.field620 != null) {
            int var2 = -1;
            if (super.field839 >= 0 && super.field842 == 0) {
                var2 = class58.field1560[super.field839].field1562[super.field840];
            } else if (super.field832 >= 0) {
                var2 = class58.field1560[super.field832].field1562[super.field833];
            }
            return this.field620.method158((int[]) null, 7, var2, -1);
        } else {
            long var4 = this.field644;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field839 >= 0 && super.field842 == 0) {
                class58 var10 = class58.field1560[super.field839];
                var6 = var10.field1562[super.field840];
                if (super.field832 >= 0 && super.field868 != super.field832) {
                    var7 = class58.field1560[super.field832].field1562[super.field833];
                }
                if (var10.field1569 >= 0) {
                    var8 = var10.field1569;
                    var4 += (long) (var8 - this.field619[5] << 8);
                }
                if (var10.field1570 >= 0) {
                    var9 = var10.field1570;
                    var4 += (long) (var9 - this.field619[3] << 16);
                }
            } else if (super.field832 >= 0) {
                var6 = class58.field1560[super.field832].field1562[super.field833];
            }
            class35 var11 = (class35) field634.method507(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field619[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class12.field731[var14 - 256].method186((byte) 6)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class72.method590(var14 - 512).method599(this.field649, (byte) 8)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field626 != -1L) {
                        var11 = (class35) field634.method507(this.field626);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class35[] var15 = new class35[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field619[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class35 var20 = class12.field731[var19 - 256].method187((byte) 81);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class35 var21 = class72.method590(var19 - 512).method589(0, this.field649);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class35(var16, -537, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field627[var18] != 0) {
                        var11.method405(client.field501[var18][0], client.field501[var18][this.field627[var18]]);
                        if (var18 == 1) {
                            var11.method405(client.field427[0], client.field427[this.field627[var18]]);
                        }
                    }
                }
                var11.method398(0);
                var11.method408(64, 850, -30, -50, -30, true);
                field634.method508(7, var4, var11);
                this.field626 = var4;
            }
            if (this.field633) {
                return var11;
            } else {
                class35 var22 = class35.field1201;
                if (arg0 != 38) {
                    this.field648 = 56;
                }
                var22.method393(var11, class68.method582(var6, 0) & class68.method582(var7, 0), (byte) 0);
                if (var6 != -1 && var7 != -1) {
                    var22.method400(var6, class58.field1560[super.field839].field1566, 7, var7);
                } else if (var6 != -1) {
                    var22.method399(-230, var6);
                }
                var22.method395(this.field621);
                var22.field1238 = null;
                var22.field1237 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "EJJAKGTE", name = "a", descriptor = "(Z)LOQIGXOFQ;")
    public final class35 method171(boolean arg0) {
        if (!this.field645) {
            return null;
        } else {
            class35 var2 = this.method170((byte) 38);
            if (arg0) {
                this.field648 = 325;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field857 = var2.field1710;
                var2.field1239 = true;
                if (this.field633) {
                    return var2;
                } else {
                    if (super.field859 != -1 && super.field860 != -1) {
                        class3 var3 = class3.field41[super.field859];
                        class35 var4 = var3.method18();
                        if (var4 != null) {
                            class35 var5 = new class35(class68.method582(super.field860, 0), var4, -575, false, true);
                            var5.method404(168, 0, -super.field863, 0);
                            var5.method398(0);
                            var5.method399(-230, var3.field45.field1562[super.field860]);
                            var5.field1238 = null;
                            var5.field1237 = null;
                            if (var3.field48 != 128 || var3.field49 != 128) {
                                var5.method407(var3.field49, var3.field48, false, var3.field48);
                            }
                            var5.method408(var3.field51 + 64, var3.field52 + 850, -30, -50, -30, true);
                            class35[] var6 = new class35[] { var2, var5 };
                            var2 = new class35(true, this.field628, var6, 2);
                        }
                    }
                    if (this.field632 != null) {
                        if (client.field419 >= this.field641) {
                            this.field632 = null;
                        }
                        if (client.field419 >= this.field640 && client.field419 < this.field641) {
                            class35 var7 = this.field632;
                            var7.method404(168, this.field629 - super.field844, this.field630 - this.field646, this.field631 - super.field845);
                            if (super.field854 == 512) {
                                var7.method402(717);
                                var7.method402(717);
                                var7.method402(717);
                            } else if (super.field854 == 1024) {
                                var7.method402(717);
                                var7.method402(717);
                            } else if (super.field854 == 1536) {
                                var7.method402(717);
                            }
                            class35[] var8 = new class35[] { var2, var7 };
                            var2 = new class35(true, this.field628, var8, 2);
                            if (super.field854 == 512) {
                                var7.method402(717);
                            } else if (super.field854 == 1024) {
                                var7.method402(717);
                                var7.method402(717);
                            } else if (super.field854 == 1536) {
                                var7.method402(717);
                                var7.method402(717);
                                var7.method402(717);
                            }
                            var7.method404(168, super.field844 - this.field629, this.field646 - this.field630, super.field845 - this.field631);
                        }
                    }
                    var2.field1239 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "EJJAKGTE", name = "b", descriptor = "(Z)LOQIGXOFQ;")
    public final class35 method172(boolean arg0) {
        if (!this.field645) {
            return null;
        } else if (this.field620 != null) {
            return this.field620.method163(600);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field619[var3];
                if (var13 >= 256 && var13 < 512 && !class12.field731[var13 - 256].method188(516)) {
                    var2 = true;
                }
                if (var13 >= 512 && !class72.method590(var13 - 512).method594(this.field649, this.field642)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class35[] var4 = new class35[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var10 = this.field619[var6];
                    if (var10 >= 256 && var10 < 512) {
                        class35 var11 = class12.field731[var10 - 256].method189(this.field622);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class35 var12 = class72.method590(var10 - 512).method598(this.field649, 0);
                        if (var12 != null) {
                            var4[var5++] = var12;
                        }
                    }
                }
                class35 var7 = new class35(var5, -537, var4);
                if (arg0) {
                    for (int var8 = 1; var8 > 0; ++var8) {
                    }
                }
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field627[var9] != 0) {
                        var7.method405(client.field501[var9][0], client.field501[var9][this.field627[var9]]);
                        if (var9 == 1) {
                            var7.method405(client.field427[0], client.field427[this.field627[var9]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "EJJAKGTE", name = "a", descriptor = "(ILGHHPHSRU;)V")
    public final void method173(int arg0, class14 arg1) {
        arg1.field769 = 0;
        this.field649 = arg1.method202();
        this.field639 = arg1.method203();
        this.field624 = arg1.method203();
        this.field620 = null;
        this.field623 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method202();
            if (var4 == 0) {
                this.field619[var3] = 0;
            } else {
                int var5 = arg1.method202();
                this.field619[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field619[0] == 65535) {
                    this.field620 = class6.method162(arg1.method204());
                    break;
                }
                if (this.field619[var3] >= 512 && this.field619[var3] - 512 < class72.field1719) {
                    int var11 = class72.method590(this.field619[var3] - 512).field1742;
                    if (var11 != 0) {
                        this.field623 = var11;
                    }
                }
            }
        }
        int var6 = 60 / arg0;
        for (int var7 = 0; var7 < 5; ++var7) {
            int var10 = arg1.method202();
            if (var10 < 0 || var10 >= client.field501[var7].length) {
                var10 = 0;
            }
            this.field627[var7] = var10;
        }
        super.field868 = arg1.method204();
        if (super.field868 == 65535) {
            super.field868 = -1;
        }
        super.field869 = arg1.method204();
        if (super.field869 == 65535) {
            super.field869 = -1;
        }
        super.field881 = arg1.method204();
        if (super.field881 == 65535) {
            super.field881 = -1;
        }
        super.field882 = arg1.method204();
        if (super.field882 == 65535) {
            super.field882 = -1;
        }
        super.field883 = arg1.method204();
        if (super.field883 == 65535) {
            super.field883 = -1;
        }
        super.field884 = arg1.method204();
        if (super.field884 == 65535) {
            super.field884 = -1;
        }
        super.field838 = arg1.method204();
        if (super.field838 == 65535) {
            super.field838 = -1;
        }
        this.field625 = class55.method514(class55.method511(arg1.method208(this.field618), 622), -36397);
        this.field643 = arg1.method202();
        this.field617 = arg1.method204();
        this.field645 = true;
        this.field644 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field644 <<= 4;
            if (this.field619[var8] >= 256) {
                this.field644 += (long) (this.field619[var8] - 256);
            }
        }
        if (this.field619[0] >= 256) {
            this.field644 += (long) (this.field619[0] - 256 >> 4);
        }
        if (this.field619[1] >= 256) {
            this.field644 += (long) (this.field619[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field644 <<= 3;
            this.field644 += (long) this.field627[var9];
        }
        this.field644 <<= 1;
        this.field644 += (long) this.field649;
    }
}
