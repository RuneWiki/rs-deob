import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HPYXKOFA")
public class class21 extends class23 {

    @OriginalMember(owner = "HPYXKOFA", name = "sb", descriptor = "[I")
    public int[] field759 = new int[5];

    @OriginalMember(owner = "HPYXKOFA", name = "tb", descriptor = "J")
    public long field760 = -1L;

    @OriginalMember(owner = "HPYXKOFA", name = "ub", descriptor = "Z")
    private boolean field761 = true;

    @OriginalMember(owner = "HPYXKOFA", name = "vb", descriptor = "Z")
    private boolean field762 = true;

    @OriginalMember(owner = "HPYXKOFA", name = "Fb", descriptor = "Z")
    public boolean field772 = false;

    @OriginalMember(owner = "HPYXKOFA", name = "Gb", descriptor = "Z")
    public boolean field773 = false;

    @OriginalMember(owner = "HPYXKOFA", name = "Tb", descriptor = "[I")
    public int[] field786 = new int[12];

    @OriginalMember(owner = "HPYXKOFA", name = "xb", descriptor = "LRUNMBJUO;")
    public static class51 field764 = new class51(260, false);

    @OriginalMember(owner = "HPYXKOFA", name = "rb", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "HPYXKOFA", name = "yb", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "HPYXKOFA", name = "zb", descriptor = "I")
    private int field766;

    @OriginalMember(owner = "HPYXKOFA", name = "Ab", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "HPYXKOFA", name = "Bb", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "HPYXKOFA", name = "Cb", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "HPYXKOFA", name = "Eb", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "HPYXKOFA", name = "Ib", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "HPYXKOFA", name = "Jb", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "HPYXKOFA", name = "Kb", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "HPYXKOFA", name = "Lb", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "HPYXKOFA", name = "Mb", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "HPYXKOFA", name = "Nb", descriptor = "I")
    private int field780;

    @OriginalMember(owner = "HPYXKOFA", name = "Pb", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "HPYXKOFA", name = "Qb", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "HPYXKOFA", name = "Rb", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "HPYXKOFA", name = "Sb", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "HPYXKOFA", name = "Ob", descriptor = "J")
    public long field781;

    @OriginalMember(owner = "HPYXKOFA", name = "Db", descriptor = "LNJPATAFL;")
    public class35 field770;

    @OriginalMember(owner = "HPYXKOFA", name = "wb", descriptor = "LBYABUZFP;")
    public class5 field763;

    @OriginalMember(owner = "HPYXKOFA", name = "Hb", descriptor = "Ljava/lang/String;")
    public String field774;

    @OriginalMember(owner = "HPYXKOFA", name = "a", descriptor = "(I)LNJPATAFL;")
    public final class35 method206(int arg0) {
        if (!this.field772) {
            return null;
        } else {
            class35 var2 = this.method242(9);
            if (var2 == null) {
                return null;
            } else {
                super.field818 = var2.field887;
                var2.field1026 = true;
                if (arg0 >= 9 && arg0 <= 9) {
                    if (this.field773) {
                        return var2;
                    } else {
                        if (super.field845 != -1 && super.field846 != -1) {
                            class55 var3 = class55.field1422[super.field845];
                            class35 var4 = var3.method478();
                            if (var4 != null) {
                                class35 var5 = new class35(class57.method491(super.field846, this.field766), false, true, (byte) 45, var4);
                                var5.method347(0, true, 0, -super.field849);
                                var5.method341(9566);
                                var5.method342(true, var3.field1426.field1455[super.field846]);
                                var5.field1025 = null;
                                var5.field1024 = null;
                                if (var3.field1429 != 128 || var3.field1430 != 128) {
                                    var5.method350(var3.field1429, true, var3.field1429, var3.field1430);
                                }
                                var5.method351(var3.field1432 + 64, var3.field1433 + 850, -30, -50, -30, true);
                                class35[] var6 = new class35[] { var2, var5 };
                                var2 = new class35(2, var6, 397, true);
                            }
                        }
                        if (this.field770 != null) {
                            if (client.field237 >= this.field784) {
                                this.field770 = null;
                            }
                            if (client.field237 >= this.field783 && client.field237 < this.field784) {
                                class35 var7 = this.field770;
                                var7.method347(this.field769 - super.field816, true, this.field767 - super.field815, this.field768 - this.field779);
                                if (super.field807 == 512) {
                                    var7.method345(this.field780);
                                    var7.method345(this.field780);
                                    var7.method345(this.field780);
                                } else if (super.field807 == 1024) {
                                    var7.method345(this.field780);
                                    var7.method345(this.field780);
                                } else if (super.field807 == 1536) {
                                    var7.method345(this.field780);
                                }
                                class35[] var8 = new class35[] { var2, var7 };
                                var2 = new class35(2, var8, 397, true);
                                if (super.field807 == 512) {
                                    var7.method345(this.field780);
                                } else if (super.field807 == 1024) {
                                    var7.method345(this.field780);
                                    var7.method345(this.field780);
                                } else if (super.field807 == 1536) {
                                    var7.method345(this.field780);
                                    var7.method345(this.field780);
                                    var7.method345(this.field780);
                                }
                                var7.method347(super.field816 - this.field769, true, super.field815 - this.field767, this.field779 - this.field768);
                            }
                        }
                        var2.field1026 = true;
                        return var2;
                    }
                } else {
                    throw new NullPointerException();
                }
            }
        }
    }

    @OriginalMember(owner = "HPYXKOFA", name = "c", descriptor = "(I)LNJPATAFL;")
    public final class35 method240(int arg0) {
        if (!this.field772) {
            return null;
        } else if (this.field763 != null) {
            return this.field763.method30((byte) 6);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field786[var3];
                if (var12 >= 256 && var12 < 512 && !class6.field559[var12 - 256].method177(-37409)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class45.method428(var12 - 512).method419(516, this.field758)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class35[] var4 = new class35[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field786[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class35 var10 = class6.field559[var9 - 256].method178((byte) -72);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class35 var11 = class45.method428(var9 - 512).method430((byte) 2, this.field758);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                if (arg0 != -24521) {
                    this.field761 = !this.field761;
                }
                class35 var7 = new class35(var4, 230, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field759[var8] != 0) {
                        var7.method348(client.field293[var8][0], client.field293[var8][this.field759[var8]]);
                        if (var8 == 1) {
                            var7.method348(client.field214[0], client.field214[this.field759[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "HPYXKOFA", name = "b", descriptor = "(I)Z")
    public final boolean method241(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else {
            return this.field772;
        }
    }

    @OriginalMember(owner = "HPYXKOFA", name = "d", descriptor = "(I)LNJPATAFL;")
    private final class35 method242(int arg0) {
        if (this.field763 != null) {
            int var2 = -1;
            if (super.field808 >= 0 && super.field811 == 0) {
                var2 = class58.field1453[super.field808].field1455[super.field809];
            } else if (super.field821 >= 0) {
                var2 = class58.field1453[super.field821].field1455[super.field822];
            }
            return this.field763.method28((int[]) null, -1, var2, 3);
        } else {
            long var4 = this.field781;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field808 >= 0 && super.field811 == 0) {
                class58 var10 = class58.field1453[super.field808];
                var6 = var10.field1455[super.field809];
                if (super.field821 >= 0 && super.field835 != super.field821) {
                    var7 = class58.field1453[super.field821].field1455[super.field822];
                }
                if (var10.field1462 >= 0) {
                    var8 = var10.field1462;
                    var4 += (long) (var8 - this.field786[5] << 8);
                }
                if (var10.field1463 >= 0) {
                    var9 = var10.field1463;
                    var4 += (long) (var9 - this.field786[3] << 16);
                }
            } else if (super.field821 >= 0) {
                var6 = class58.field1453[super.field821].field1455[super.field822];
            }
            class35 var11 = (class35) field764.method450(var4);
            if (arg0 >= 9 && arg0 <= 9) {
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field786[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class6.field559[var14 - 256].method175(this.field762)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class45.method428(var14 - 512).method427(-1162, this.field758)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field760 != -1L) {
                            var11 = (class35) field764.method450(this.field760);
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
                        int var19 = this.field786[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class35 var20 = class6.field559[var19 - 256].method176(false);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class35 var21 = class45.method428(var19 - 512).method425(this.field758, -33678);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class35(var15, 230, var16);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field759[var18] != 0) {
                            var11.method348(client.field293[var18][0], client.field293[var18][this.field759[var18]]);
                            if (var18 == 1) {
                                var11.method348(client.field214[0], client.field214[this.field759[var18]]);
                            }
                        }
                    }
                    var11.method341(9566);
                    var11.method351(64, 850, -30, -50, -30, true);
                    field764.method451(var4, var11, false);
                    this.field760 = var4;
                }
                if (this.field773) {
                    return var11;
                } else {
                    class35 var22 = class35.field988;
                    var22.method336(var11, class57.method491(var6, this.field766) & class57.method491(var7, this.field766), (byte) 4);
                    if (var6 != -1 && var7 != -1) {
                        var22.method343(class58.field1453[super.field808].field1459, var7, 530, var6);
                    } else if (var6 != -1) {
                        var22.method342(true, var6);
                    }
                    var22.method338(true);
                    var22.field1025 = null;
                    var22.field1024 = null;
                    return var22;
                }
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "HPYXKOFA", name = "a", descriptor = "(ILMUKVLYLC;)V")
    public final void method243(int arg0, class33 arg1) {
        arg1.field954 = 0;
        this.field758 = arg1.method292();
        this.field782 = arg1.method292();
        this.field763 = null;
        this.field771 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method292();
            if (var4 == 0) {
                this.field786[var3] = 0;
            } else {
                int var5 = arg1.method292();
                this.field786[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field786[0] == 65535) {
                    this.field763 = class5.method24(arg1.method294());
                    break;
                }
                if (this.field786[var3] >= 512 && this.field786[var3] - 512 < class45.field1217) {
                    int var11 = class45.method428(this.field786[var3] - 512).field1186;
                    if (var11 != 0) {
                        this.field771 = var11;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var10 = arg1.method292();
            if (var10 < 0 || var10 >= client.field293[var6].length) {
                var10 = 0;
            }
            this.field759[var6] = var10;
        }
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        super.field835 = arg1.method294();
        if (super.field835 == 65535) {
            super.field835 = -1;
        }
        super.field836 = arg1.method294();
        if (super.field836 == 65535) {
            super.field836 = -1;
        }
        super.field850 = arg1.method294();
        if (super.field850 == 65535) {
            super.field850 = -1;
        }
        super.field851 = arg1.method294();
        if (super.field851 == 65535) {
            super.field851 = -1;
        }
        super.field852 = arg1.method294();
        if (super.field852 == 65535) {
            super.field852 = -1;
        }
        super.field853 = arg1.method294();
        if (super.field853 == 65535) {
            super.field853 = -1;
        }
        super.field820 = arg1.method294();
        if (super.field820 == 65535) {
            super.field820 = -1;
        }
        this.field774 = class44.method417((byte) 97, class44.method414((byte) 9, arg1.method298(3)));
        this.field765 = arg1.method292();
        this.field785 = arg1.method294();
        this.field772 = true;
        this.field781 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field781 <<= 4;
            if (this.field786[var8] >= 256) {
                this.field781 += (long) (this.field786[var8] - 256);
            }
        }
        if (this.field786[0] >= 256) {
            this.field781 += (long) (this.field786[0] - 256 >> 4);
        }
        if (this.field786[1] >= 256) {
            this.field781 += (long) (this.field786[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field781 <<= 3;
            this.field781 += (long) this.field759[var9];
        }
        this.field781 <<= 1;
        this.field781 += (long) this.field758;
    }
}
