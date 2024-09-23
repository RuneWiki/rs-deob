import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KWSXZIVG")
public class class29 extends class50 {

    @OriginalMember(owner = "KWSXZIVG", name = "qb", descriptor = "J")
    public long field847 = -1L;

    @OriginalMember(owner = "KWSXZIVG", name = "rb", descriptor = "Z")
    public boolean field848 = false;

    @OriginalMember(owner = "KWSXZIVG", name = "ub", descriptor = "Z")
    public boolean field851 = false;

    @OriginalMember(owner = "KWSXZIVG", name = "vb", descriptor = "I")
    private int field852 = 613;

    @OriginalMember(owner = "KWSXZIVG", name = "wb", descriptor = "Z")
    private boolean field853 = true;

    @OriginalMember(owner = "KWSXZIVG", name = "Ab", descriptor = "[I")
    public int[] field857 = new int[5];

    @OriginalMember(owner = "KWSXZIVG", name = "Cb", descriptor = "B")
    private byte field859 = 4;

    @OriginalMember(owner = "KWSXZIVG", name = "Qb", descriptor = "[I")
    public int[] field873 = new int[12];

    @OriginalMember(owner = "KWSXZIVG", name = "zb", descriptor = "LECXUVDNP;")
    public static class12 field856 = new class12(0, 260);

    @OriginalMember(owner = "KWSXZIVG", name = "ob", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "KWSXZIVG", name = "pb", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "KWSXZIVG", name = "xb", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "KWSXZIVG", name = "yb", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "KWSXZIVG", name = "Db", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "KWSXZIVG", name = "Eb", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "KWSXZIVG", name = "Fb", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "KWSXZIVG", name = "Hb", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "KWSXZIVG", name = "Ib", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "KWSXZIVG", name = "Jb", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "KWSXZIVG", name = "Kb", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "KWSXZIVG", name = "Lb", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "KWSXZIVG", name = "Mb", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "KWSXZIVG", name = "Nb", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "KWSXZIVG", name = "Ob", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "KWSXZIVG", name = "Pb", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "KWSXZIVG", name = "tb", descriptor = "J")
    public long field850;

    @OriginalMember(owner = "KWSXZIVG", name = "Bb", descriptor = "LCOIHKGSL;")
    public class6 field858;

    @OriginalMember(owner = "KWSXZIVG", name = "Gb", descriptor = "LYYHPBDED;")
    public class70 field863;

    @OriginalMember(owner = "KWSXZIVG", name = "sb", descriptor = "Ljava/lang/String;")
    public String field849;

    @OriginalMember(owner = "KWSXZIVG", name = "a", descriptor = "(BLMQZHAILV;)V")
    public final void method270(byte arg0, class33 arg1) {
        arg1.field945 = 0;
        this.field872 = arg1.method325();
        this.field870 = arg1.method325();
        this.field858 = null;
        this.field845 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method325();
            if (var4 == 0) {
                this.field873[var3] = 0;
            } else {
                int var5 = arg1.method325();
                this.field873[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field873[0] == 65535) {
                    this.field858 = class6.method171(arg1.method327());
                    break;
                }
                if (this.field873[var3] >= 512 && this.field873[var3] - 512 < class3.field41) {
                    int var10 = class3.method13(this.field873[var3] - 512).field21;
                    if (var10 != 0) {
                        this.field845 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg1.method325();
            if (var9 < 0 || var9 >= client.field189[var6].length) {
                var9 = 0;
            }
            this.field857[var6] = var9;
        }
        super.field1239 = arg1.method327();
        if (super.field1239 == 65535) {
            super.field1239 = -1;
        }
        super.field1240 = arg1.method327();
        if (super.field1240 == 65535) {
            super.field1240 = -1;
        }
        super.field1223 = arg1.method327();
        if (super.field1223 == 65535) {
            super.field1223 = -1;
        }
        super.field1224 = arg1.method327();
        if (super.field1224 == 65535) {
            super.field1224 = -1;
        }
        super.field1225 = arg1.method327();
        if (super.field1225 == 65535) {
            super.field1225 = -1;
        }
        super.field1226 = arg1.method327();
        if (super.field1226 == 65535) {
            super.field1226 = -1;
        }
        super.field1227 = arg1.method327();
        if (super.field1227 == 65535) {
            super.field1227 = -1;
        }
        this.field849 = class39.method371(class39.method368((byte) 3, arg1.method331(true)), (byte) -7);
        this.field871 = arg1.method325();
        this.field846 = arg1.method327();
        this.field851 = true;
        this.field850 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field850 <<= 4;
            if (this.field873[var7] >= 256) {
                this.field850 += (long) (this.field873[var7] - 256);
            }
        }
        if (this.field859 == arg0) {
            if (this.field873[0] >= 256) {
                this.field850 += (long) (this.field873[0] - 256 >> 4);
            }
            if (this.field873[1] >= 256) {
                this.field850 += (long) (this.field873[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field850 <<= 3;
                this.field850 += (long) this.field857[var8];
            }
            this.field850 <<= 1;
            this.field850 += (long) this.field872;
        }
    }

    @OriginalMember(owner = "KWSXZIVG", name = "b", descriptor = "(I)LYYHPBDED;")
    private final class70 method271(int arg0) {
        if (this.field858 != null) {
            int var2 = -1;
            if (super.field1234 >= 0 && super.field1237 == 0) {
                var2 = class22.field761[super.field1234].field763[super.field1235];
            } else if (super.field1246 >= 0) {
                var2 = class22.field761[super.field1246].field763[super.field1247];
            }
            return this.field858.method166(var2, false, (int[]) null, -1);
        } else {
            long var4 = this.field850;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1234 >= 0 && super.field1237 == 0) {
                class22 var10 = class22.field761[super.field1234];
                var6 = var10.field763[super.field1235];
                if (super.field1246 >= 0 && super.field1246 != super.field1239) {
                    var7 = class22.field761[super.field1246].field763[super.field1247];
                }
                if (var10.field770 >= 0) {
                    var8 = var10.field770;
                    var4 += (long) (var8 - this.field873[5] << 8);
                }
                if (var10.field771 >= 0) {
                    var9 = var10.field771;
                    var4 += (long) (var9 - this.field873[3] << 16);
                }
            } else if (super.field1246 >= 0) {
                var6 = class22.field761[super.field1246].field763[super.field1247];
            }
            class70 var11 = (class70) field856.method221(var4);
            if (arg0 != 0) {
                throw new NullPointerException();
            } else {
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field873[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class30.field881[var14 - 256].method276((byte) 5)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class3.method13(var14 - 512).method19(this.field872, 6)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field847 != -1L) {
                            var11 = (class70) field856.method221(this.field847);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class70[] var15 = new class70[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field873[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class70 var20 = class30.field881[var19 - 256].method277(710);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class70 var21 = class3.method13(var19 - 512).method11((byte) 0, this.field872);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class70(var15, 0, var16);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field857[var18] != 0) {
                            var11.method565(client.field189[var18][0], client.field189[var18][this.field857[var18]]);
                            if (var18 == 1) {
                                var11.method565(client.field125[0], client.field125[this.field857[var18]]);
                            }
                        }
                    }
                    var11.method558(895);
                    var11.method568(64, 850, -30, -50, -30, true);
                    field856.method222(var4, var11, -17668);
                    this.field847 = var4;
                }
                if (this.field848) {
                    return var11;
                } else {
                    class70 var22 = class70.field1566;
                    var22.method553((byte) 7, class60.method513(3, var6) & class60.method513(3, var7), var11);
                    if (var6 != -1 && var7 != -1) {
                        var22.method560(var7, class22.field761[super.field1234].field767, 33944, var6);
                    } else if (var6 != -1) {
                        var22.method559(var6, -682);
                    }
                    var22.method555((byte) 6);
                    var22.field1603 = null;
                    var22.field1602 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "KWSXZIVG", name = "b", descriptor = "(Z)LYYHPBDED;")
    public final class70 method272(boolean arg0) {
        if (!this.field851) {
            return null;
        } else if (this.field858 != null) {
            return this.field858.method169(-37722);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field873[var3];
                if (var12 >= 256 && var12 < 512 && !class30.field881[var12 - 256].method278(1)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class3.method13(var12 - 512).method17(this.field872, true)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class70[] var4 = new class70[12];
                int var5 = 0;
                if (!arg0) {
                    throw new NullPointerException();
                } else {
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field873[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class70 var10 = class30.field881[var9 - 256].method279(1);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class70 var11 = class3.method13(var9 - 512).method10((byte) 3, this.field872);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class70 var7 = new class70(var4, 0, var5);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field857[var8] != 0) {
                            var7.method565(client.field189[var8][0], client.field189[var8][this.field857[var8]]);
                            if (var8 == 1) {
                                var7.method565(client.field125[0], client.field125[this.field857[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "KWSXZIVG", name = "a", descriptor = "(I)Z")
    public final boolean method273(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            return this.field851;
        }
    }

    @OriginalMember(owner = "KWSXZIVG", name = "a", descriptor = "(Z)LYYHPBDED;")
    public final class70 method2(boolean arg0) {
        if (!this.field851) {
            return null;
        } else {
            class70 var2 = this.method271(0);
            if (var2 == null) {
                return null;
            } else {
                super.field1251 = var2.field2;
                if (!arg0) {
                    this.field853 = !this.field853;
                }
                var2.field1604 = true;
                if (this.field848) {
                    return var2;
                } else {
                    if (super.field1200 != -1 && super.field1201 != -1) {
                        class37 var3 = class37.field970[super.field1200];
                        class70 var4 = var3.method366();
                        if (var4 != null) {
                            class70 var5 = new class70(false, var4, (byte) -15, true, class60.method513(3, super.field1201));
                            var5.method564(-super.field1204, 0, 0, 0);
                            var5.method558(895);
                            var5.method559(var3.field974.field763[super.field1201], -682);
                            var5.field1603 = null;
                            var5.field1602 = null;
                            if (var3.field977 != 128 || var3.field978 != 128) {
                                var5.method567(this.field854, var3.field978, var3.field977, var3.field977);
                            }
                            var5.method568(var3.field980 + 64, var3.field981 + 850, -30, -50, -30, true);
                            class70[] var6 = new class70[] { var2, var5 };
                            var2 = new class70(var6, this.field852, true, 2);
                        }
                    }
                    if (this.field863 != null) {
                        if (client.field369 >= this.field869) {
                            this.field863 = null;
                        }
                        if (client.field369 >= this.field868 && client.field369 < this.field869) {
                            class70 var7 = this.field863;
                            var7.method564(this.field861 - this.field855, 0, this.field860 - super.field1206, this.field862 - super.field1207);
                            if (super.field1199 == 512) {
                                var7.method562(false);
                                var7.method562(false);
                                var7.method562(false);
                            } else if (super.field1199 == 1024) {
                                var7.method562(false);
                                var7.method562(false);
                            } else if (super.field1199 == 1536) {
                                var7.method562(false);
                            }
                            class70[] var8 = new class70[] { var2, var7 };
                            var2 = new class70(var8, this.field852, true, 2);
                            if (super.field1199 == 512) {
                                var7.method562(false);
                            } else if (super.field1199 == 1024) {
                                var7.method562(false);
                                var7.method562(false);
                            } else if (super.field1199 == 1536) {
                                var7.method562(false);
                                var7.method562(false);
                                var7.method562(false);
                            }
                            var7.method564(this.field855 - this.field861, 0, super.field1206 - this.field860, super.field1207 - this.field862);
                        }
                    }
                    var2.field1604 = true;
                    return var2;
                }
            }
        }
    }
}
