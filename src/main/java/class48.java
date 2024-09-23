import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MTFZASIN")
public class class48 extends class15 {

    @OriginalMember(owner = "MTFZASIN", name = "tb", descriptor = "I")
    private int field1217 = 2;

    @OriginalMember(owner = "MTFZASIN", name = "vb", descriptor = "[I")
    public int[] field1219 = new int[5];

    @OriginalMember(owner = "MTFZASIN", name = "wb", descriptor = "B")
    private byte field1220 = 23;

    @OriginalMember(owner = "MTFZASIN", name = "zb", descriptor = "Z")
    public boolean field1223 = false;

    @OriginalMember(owner = "MTFZASIN", name = "Fb", descriptor = "I")
    private int field1229 = 831;

    @OriginalMember(owner = "MTFZASIN", name = "Hb", descriptor = "Z")
    public boolean field1231 = false;

    @OriginalMember(owner = "MTFZASIN", name = "Mb", descriptor = "[I")
    public int[] field1236 = new int[12];

    @OriginalMember(owner = "MTFZASIN", name = "Qb", descriptor = "I")
    private int field1240 = 4006;

    @OriginalMember(owner = "MTFZASIN", name = "Rb", descriptor = "J")
    public long field1241 = -1L;

    @OriginalMember(owner = "MTFZASIN", name = "Ub", descriptor = "I")
    public int field1244 = -1;

    @OriginalMember(owner = "MTFZASIN", name = "Vb", descriptor = "I")
    public int field1245 = -1;

    @OriginalMember(owner = "MTFZASIN", name = "Nb", descriptor = "LDMOAMUBS;")
    public static class14 field1237 = new class14(260, true);

    @OriginalMember(owner = "MTFZASIN", name = "rb", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "MTFZASIN", name = "sb", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "MTFZASIN", name = "xb", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "MTFZASIN", name = "Ab", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "MTFZASIN", name = "Bb", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "MTFZASIN", name = "Cb", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "MTFZASIN", name = "Db", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "MTFZASIN", name = "Eb", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "MTFZASIN", name = "Gb", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "MTFZASIN", name = "Ib", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "MTFZASIN", name = "Jb", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "MTFZASIN", name = "Kb", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "MTFZASIN", name = "Ob", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "MTFZASIN", name = "Sb", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "MTFZASIN", name = "Tb", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "MTFZASIN", name = "ub", descriptor = "J")
    public long field1218;

    @OriginalMember(owner = "MTFZASIN", name = "yb", descriptor = "LKFUEEJVZ;")
    public class33 field1222;

    @OriginalMember(owner = "MTFZASIN", name = "Lb", descriptor = "LVYUQHOMO;")
    public class66 field1235;

    @OriginalMember(owner = "MTFZASIN", name = "Pb", descriptor = "Ljava/lang/String;")
    public String field1239;

    @OriginalMember(owner = "MTFZASIN", name = "b", descriptor = "(Z)LVYUQHOMO;")
    private final class66 method321(boolean arg0) {
        if (this.field1222 != null) {
            int var2 = -1;
            if (super.field686 >= 0 && super.field689 == 0) {
                var2 = class45.field1187[super.field686].field1189[super.field687];
            } else if (super.field723 >= 0) {
                var2 = class45.field1187[super.field723].field1189[super.field724];
            }
            return this.field1222.method264(var2, (int[]) null, -1, 2);
        } else {
            long var4 = this.field1218;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field686 >= 0 && super.field689 == 0) {
                class45 var10 = class45.field1187[super.field686];
                var6 = var10.field1189[super.field687];
                if (super.field723 >= 0 && super.field736 != super.field723) {
                    var7 = class45.field1187[super.field723].field1189[super.field724];
                }
                if (var10.field1196 >= 0) {
                    var8 = var10.field1196;
                    var4 += (long) (var8 - this.field1236[5] << 8);
                }
                if (var10.field1197 >= 0) {
                    var9 = var10.field1197;
                    var4 += (long) (var9 - this.field1236[3] << 16);
                }
            } else if (super.field723 >= 0) {
                var6 = class45.field1187[super.field723].field1189[super.field724];
            }
            class66 var11 = (class66) field1237.method193(var4);
            if (!arg0) {
                this.field1229 = -86;
            }
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1236[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class7.field79[var14 - 256].method19(this.field1238)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class22.method237(var14 - 512).method228(9, this.field1221)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1241 != -1L) {
                        var11 = (class66) field1237.method193(this.field1241);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class66[] var15 = new class66[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1236[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class66 var20 = class7.field79[var19 - 256].method20((byte) 7);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class66 var21 = class22.method237(var19 - 512).method234(this.field1221, (byte) -103);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class66(var15, this.field1240, var16);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1219[var18] != 0) {
                        var11.method421(client.field336[var18][0], client.field336[var18][this.field1219[var18]]);
                        if (var18 == 1) {
                            var11.method421(client.field390[0], client.field390[this.field1219[var18]]);
                        }
                    }
                }
                var11.method414((byte) 56);
                var11.method424(64, 850, -30, -50, -30, true);
                field1237.method194(var4, (byte) -80, var11);
                this.field1241 = var4;
            }
            if (this.field1231) {
                return var11;
            } else {
                class66 var22 = class66.field1474;
                var22.method409((byte) 118, var11, class2.method11((byte) 85, var6) & class2.method11((byte) 85, var7));
                if (var6 != -1 && var7 != -1) {
                    var22.method416(class45.field1187[super.field686].field1193, var7, 29038, var6);
                } else if (var6 != -1) {
                    var22.method415(var6, 3);
                }
                var22.method411(true);
                var22.field1511 = null;
                var22.field1510 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "MTFZASIN", name = "a", descriptor = "(BLXGRGMPUQ;)V")
    public final void method322(byte arg0, class69 arg1) {
        arg1.field1652 = 0;
        this.field1221 = arg1.method465();
        this.field1245 = arg1.method466();
        this.field1244 = arg1.method466();
        this.field1222 = null;
        this.field1215 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method465();
            if (var4 == 0) {
                this.field1236[var3] = 0;
            } else {
                int var5 = arg1.method465();
                this.field1236[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1236[0] == 65535) {
                    this.field1222 = class33.method267(arg1.method467());
                    break;
                }
                if (this.field1236[var3] >= 512 && this.field1236[var3] - 512 < class22.field855) {
                    int var10 = class22.method237(this.field1236[var3] - 512).field866;
                    if (var10 != 0) {
                        this.field1215 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg1.method465();
            if (var9 < 0 || var9 >= client.field336[var6].length) {
                var9 = 0;
            }
            this.field1219[var6] = var9;
        }
        super.field736 = arg1.method467();
        if (super.field736 == 65535) {
            super.field736 = -1;
        }
        super.field737 = arg1.method467();
        if (super.field737 == 65535) {
            super.field737 = -1;
        }
        super.field699 = arg1.method467();
        if (super.field699 == 65535) {
            super.field699 = -1;
        }
        super.field700 = arg1.method467();
        if (arg0 == -104) {
            if (super.field700 == 65535) {
                super.field700 = -1;
            }
            super.field701 = arg1.method467();
            if (super.field701 == 65535) {
                super.field701 = -1;
            }
            super.field702 = arg1.method467();
            if (super.field702 == 65535) {
                super.field702 = -1;
            }
            super.field735 = arg1.method467();
            if (super.field735 == 65535) {
                super.field735 = -1;
            }
            this.field1239 = class11.method41(class11.method38(this.field1217, arg1.method471(0)), 42484);
            this.field1228 = arg1.method465();
            this.field1216 = arg1.method467();
            this.field1223 = true;
            this.field1218 = 0L;
            for (int var7 = 0; var7 < 12; ++var7) {
                this.field1218 <<= 4;
                if (this.field1236[var7] >= 256) {
                    this.field1218 += (long) (this.field1236[var7] - 256);
                }
            }
            if (this.field1236[0] >= 256) {
                this.field1218 += (long) (this.field1236[0] - 256 >> 4);
            }
            if (this.field1236[1] >= 256) {
                this.field1218 += (long) (this.field1236[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field1218 <<= 3;
                this.field1218 += (long) this.field1219[var8];
            }
            this.field1218 <<= 1;
            this.field1218 += (long) this.field1221;
        }
    }

    @OriginalMember(owner = "MTFZASIN", name = "a", descriptor = "(I)LVYUQHOMO;")
    public final class66 method13(int arg0) {
        if (!this.field1223) {
            return null;
        } else {
            class66 var2 = this.method321(true);
            if (var2 == null) {
                return null;
            } else {
                super.field739 = var2.field935;
                int var3 = 15 / arg0;
                var2.field1512 = true;
                if (this.field1231) {
                    return var2;
                } else {
                    if (super.field717 != -1 && super.field718 != -1) {
                        class6 var4 = class6.field61[super.field717];
                        class66 var5 = var4.method16();
                        if (var5 != null) {
                            class66 var6 = new class66(true, class2.method11((byte) 85, super.field718), var5, this.field1220, false);
                            var6.method420(0, -super.field721, 0, (byte) -122);
                            var6.method414((byte) 56);
                            var6.method415(var4.field65.field1189[super.field718], 3);
                            var6.field1511 = null;
                            var6.field1510 = null;
                            if (var4.field68 != 128 || var4.field69 != 128) {
                                var6.method423(var4.field68, var4.field69, var4.field68, 0);
                            }
                            var6.method424(var4.field71 + 64, var4.field72 + 850, -30, -50, -30, true);
                            class66[] var7 = new class66[] { var2, var6 };
                            var2 = new class66(true, 2, 20, var7);
                        }
                    }
                    if (this.field1235 != null) {
                        if (client.field572 >= this.field1243) {
                            this.field1235 = null;
                        }
                        if (client.field572 >= this.field1242 && client.field572 < this.field1243) {
                            class66 var8 = this.field1235;
                            var8.method420(this.field1234 - super.field732, this.field1233 - this.field1230, this.field1232 - super.field731, (byte) -122);
                            if (super.field716 == 512) {
                                var8.method418((byte) 2);
                                var8.method418((byte) 2);
                                var8.method418((byte) 2);
                            } else if (super.field716 == 1024) {
                                var8.method418((byte) 2);
                                var8.method418((byte) 2);
                            } else if (super.field716 == 1536) {
                                var8.method418((byte) 2);
                            }
                            class66[] var9 = new class66[] { var2, var8 };
                            var2 = new class66(true, 2, 20, var9);
                            if (super.field716 == 512) {
                                var8.method418((byte) 2);
                            } else if (super.field716 == 1024) {
                                var8.method418((byte) 2);
                                var8.method418((byte) 2);
                            } else if (super.field716 == 1536) {
                                var8.method418((byte) 2);
                                var8.method418((byte) 2);
                                var8.method418((byte) 2);
                            }
                            var8.method420(super.field732 - this.field1234, this.field1230 - this.field1233, super.field731 - this.field1232, (byte) -122);
                        }
                    }
                    var2.field1512 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "MTFZASIN", name = "b", descriptor = "(I)Z")
    public final boolean method192(int arg0) {
        if (arg0 != -22030) {
            throw new NullPointerException();
        } else {
            return this.field1223;
        }
    }

    @OriginalMember(owner = "MTFZASIN", name = "a", descriptor = "(B)LVYUQHOMO;")
    public final class66 method323(byte arg0) {
        if (!this.field1223) {
            return null;
        } else if (this.field1222 != null) {
            return this.field1222.method263(true);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field1236[var3];
                if (var13 >= 256 && var13 < 512 && !class7.field79[var13 - 256].method21(259)) {
                    var2 = true;
                }
                if (var13 >= 512 && !class22.method237(var13 - 512).method231(false, this.field1221)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class66[] var4 = new class66[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var10 = this.field1236[var6];
                    if (var10 >= 256 && var10 < 512) {
                        class66 var11 = class7.field79[var10 - 256].method22((byte) 7);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class66 var12 = class22.method237(var10 - 512).method233(-36730, this.field1221);
                        if (var12 != null) {
                            var4[var5++] = var12;
                        }
                    }
                }
                class66 var7 = new class66(var4, this.field1240, var5);
                if (arg0 == 8) {
                    boolean var8 = false;
                    for (int var9 = 0; var9 < 5; ++var9) {
                        if (this.field1219[var9] != 0) {
                            var7.method421(client.field336[var9][0], client.field336[var9][this.field1219[var9]]);
                            if (var9 == 1) {
                                var7.method421(client.field390[0], client.field390[this.field1219[var9]]);
                            }
                        }
                    }
                    return var7;
                } else {
                    throw new NullPointerException();
                }
            }
        }
    }
}
