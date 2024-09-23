import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SJUCHLXH")
public class class49 extends class5 {

    @OriginalMember(owner = "SJUCHLXH", name = "sb", descriptor = "I")
    private int field1285 = 25292;

    @OriginalMember(owner = "SJUCHLXH", name = "tb", descriptor = "[I")
    public int[] field1286 = new int[12];

    @OriginalMember(owner = "SJUCHLXH", name = "ub", descriptor = "Z")
    public boolean field1287 = false;

    @OriginalMember(owner = "SJUCHLXH", name = "yb", descriptor = "Z")
    public boolean field1291 = false;

    @OriginalMember(owner = "SJUCHLXH", name = "Ab", descriptor = "Z")
    private boolean field1293 = true;

    @OriginalMember(owner = "SJUCHLXH", name = "Bb", descriptor = "B")
    private byte field1294 = 1;

    @OriginalMember(owner = "SJUCHLXH", name = "Kb", descriptor = "J")
    public long field1303 = -1L;

    @OriginalMember(owner = "SJUCHLXH", name = "Mb", descriptor = "I")
    private int field1305 = 3;

    @OriginalMember(owner = "SJUCHLXH", name = "Sb", descriptor = "[I")
    public int[] field1311 = new int[5];

    @OriginalMember(owner = "SJUCHLXH", name = "Cb", descriptor = "LWMYPWVZI;")
    public static class62 field1295 = new class62(260, 267);

    @OriginalMember(owner = "SJUCHLXH", name = "vb", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "SJUCHLXH", name = "wb", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "SJUCHLXH", name = "xb", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "SJUCHLXH", name = "zb", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "SJUCHLXH", name = "Eb", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "SJUCHLXH", name = "Fb", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "SJUCHLXH", name = "Gb", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "SJUCHLXH", name = "Hb", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "SJUCHLXH", name = "Ib", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "SJUCHLXH", name = "Lb", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "SJUCHLXH", name = "Nb", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "SJUCHLXH", name = "Ob", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "SJUCHLXH", name = "Pb", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "SJUCHLXH", name = "Tb", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "SJUCHLXH", name = "Ub", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "SJUCHLXH", name = "Vb", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "SJUCHLXH", name = "Rb", descriptor = "J")
    public long field1310;

    @OriginalMember(owner = "SJUCHLXH", name = "Db", descriptor = "LWHKCNEXD;")
    public class60 field1296;

    @OriginalMember(owner = "SJUCHLXH", name = "Qb", descriptor = "LYABPKWWG;")
    public class67 field1309;

    @OriginalMember(owner = "SJUCHLXH", name = "Jb", descriptor = "Ljava/lang/String;")
    public String field1302;

    @OriginalMember(owner = "SJUCHLXH", name = "a", descriptor = "(ILIMUIZRAF;)V")
    public final void method452(int arg0, class24 arg1) {
        arg1.field832 = 0;
        this.field1304 = arg1.method238();
        this.field1292 = arg1.method238();
        this.field1296 = null;
        this.field1288 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method238();
            if (var4 == 0) {
                this.field1286[var3] = 0;
            } else {
                int var5 = arg1.method238();
                this.field1286[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1286[0] == 65535) {
                    this.field1296 = class60.method521(arg1.method240());
                    break;
                }
                if (this.field1286[var3] >= 512 && this.field1286[var3] - 512 < class46.field1162) {
                    int var11 = class46.method438(this.field1286[var3] - 512).field1163;
                    if (var11 != 0) {
                        this.field1288 = var11;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var10 = arg1.method238();
            if (var10 < 0 || var10 >= client.field202[var6].length) {
                var10 = 0;
            }
            this.field1311[var6] = var10;
        }
        super.field90 = arg1.method240();
        if (super.field90 == 65535) {
            super.field90 = -1;
        }
        super.field91 = arg1.method240();
        if (super.field91 == 65535) {
            super.field91 = -1;
        }
        super.field73 = arg1.method240();
        if (super.field73 == 65535) {
            super.field73 = -1;
        }
        super.field74 = arg1.method240();
        if (super.field74 == 65535) {
            super.field74 = -1;
        }
        super.field75 = arg1.method240();
        if (super.field75 == 65535) {
            super.field75 = -1;
        }
        super.field76 = arg1.method240();
        if (super.field76 == 65535) {
            super.field76 = -1;
        }
        super.field89 = arg1.method240();
        if (super.field89 == 65535) {
            super.field89 = -1;
        }
        this.field1302 = class31.method322(true, class31.method319(-602, arg1.method244((byte) 0)));
        this.field1301 = arg1.method238();
        this.field1314 = arg1.method240();
        this.field1287 = true;
        this.field1310 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field1310 <<= 4;
            if (this.field1286[var7] >= 256) {
                this.field1310 += (long) (this.field1286[var7] - 256);
            }
        }
        if (arg0 <= 0) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        if (this.field1286[0] >= 256) {
            this.field1310 += (long) (this.field1286[0] - 256 >> 4);
        }
        if (this.field1286[1] >= 256) {
            this.field1310 += (long) (this.field1286[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field1310 <<= 3;
            this.field1310 += (long) this.field1311[var9];
        }
        this.field1310 <<= 1;
        this.field1310 += (long) this.field1304;
    }

    @OriginalMember(owner = "SJUCHLXH", name = "b", descriptor = "(I)Z")
    public final boolean method21(int arg0) {
        if (arg0 != 0) {
            this.field1305 = 93;
        }
        return this.field1287;
    }

    @OriginalMember(owner = "SJUCHLXH", name = "a", descriptor = "(B)LYABPKWWG;")
    public final class67 method453(byte arg0) {
        if (!this.field1287) {
            return null;
        } else if (this.field1296 != null) {
            return this.field1296.method522((byte) -127);
        } else {
            boolean var2 = false;
            if (this.field1294 != arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            for (int var4 = 0; var4 < 12; ++var4) {
                int var13 = this.field1286[var4];
                if (var13 >= 256 && var13 < 512 && !class6.field101[var13 - 256].method26(this.field1285)) {
                    var2 = true;
                }
                if (var13 >= 512 && !class46.method438(var13 - 512).method437(0, this.field1304)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class67[] var5 = new class67[12];
                int var6 = 0;
                for (int var7 = 0; var7 < 12; ++var7) {
                    int var10 = this.field1286[var7];
                    if (var10 >= 256 && var10 < 512) {
                        class67 var11 = class6.field101[var10 - 256].method27(this.field1305);
                        if (var11 != null) {
                            var5[var6++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class67 var12 = class46.method438(var10 - 512).method435(164, this.field1304);
                        if (var12 != null) {
                            var5[var6++] = var12;
                        }
                    }
                }
                class67 var8 = new class67(var5, true, var6);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field1311[var9] != 0) {
                        var8.method562(client.field202[var9][0], client.field202[var9][this.field1311[var9]]);
                        if (var9 == 1) {
                            var8.method562(client.field475[0], client.field475[this.field1311[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "SJUCHLXH", name = "a", descriptor = "(Z)LYABPKWWG;")
    public final class67 method16(boolean arg0) {
        if (!this.field1287) {
            return null;
        } else {
            class67 var2 = this.method454(0);
            if (!arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (var2 == null) {
                return null;
            } else {
                super.field57 = var2.field37;
                var2.field1648 = true;
                if (this.field1291) {
                    return var2;
                } else {
                    if (super.field82 != -1 && super.field83 != -1) {
                        class9 var4 = class9.field136[super.field82];
                        class67 var5 = var4.method32();
                        if (var5 != null) {
                            class67 var6 = new class67(660, var5, class22.method219(super.field83, true), true, false);
                            var6.method561(0, 0, -super.field86, 7);
                            var6.method555((byte) 45);
                            var6.method556(598, var4.field140.field1707[super.field83]);
                            var6.field1647 = null;
                            var6.field1646 = null;
                            if (var4.field143 != 128 || var4.field144 != 128) {
                                var6.method564(var4.field144, var4.field143, (byte) -46, var4.field143);
                            }
                            var6.method565(var4.field146 + 64, var4.field147 + 850, -30, -50, -30, true);
                            class67[] var7 = new class67[] { var2, var6 };
                            var2 = new class67(2, var7, 0, true);
                        }
                    }
                    if (this.field1309 != null) {
                        if (client.field609 >= this.field1290) {
                            this.field1309 = null;
                        }
                        if (client.field609 >= this.field1289 && client.field609 < this.field1290) {
                            class67 var8 = this.field1309;
                            var8.method561(this.field1308 - super.field52, this.field1306 - super.field51, this.field1307 - this.field1312, 7);
                            if (super.field95 == 512) {
                                var8.method559(0);
                                var8.method559(0);
                                var8.method559(0);
                            } else if (super.field95 == 1024) {
                                var8.method559(0);
                                var8.method559(0);
                            } else if (super.field95 == 1536) {
                                var8.method559(0);
                            }
                            class67[] var9 = new class67[] { var2, var8 };
                            var2 = new class67(2, var9, 0, true);
                            if (super.field95 == 512) {
                                var8.method559(0);
                            } else if (super.field95 == 1024) {
                                var8.method559(0);
                                var8.method559(0);
                            } else if (super.field95 == 1536) {
                                var8.method559(0);
                                var8.method559(0);
                                var8.method559(0);
                            }
                            var8.method561(super.field52 - this.field1308, super.field51 - this.field1306, this.field1312 - this.field1307, 7);
                        }
                    }
                    var2.field1648 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "SJUCHLXH", name = "c", descriptor = "(I)LYABPKWWG;")
    private final class67 method454(int arg0) {
        if (this.field1296 != null) {
            int var2 = -1;
            if (super.field41 >= 0 && super.field44 == 0) {
                var2 = class71.field1705[super.field41].field1707[super.field42];
            } else if (super.field67 >= 0) {
                var2 = class71.field1705[super.field67].field1707[super.field68];
            }
            return this.field1296.method520((int[]) null, false, var2, -1);
        } else {
            long var4 = this.field1310;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field41 >= 0 && super.field44 == 0) {
                class71 var10 = class71.field1705[super.field41];
                var6 = var10.field1707[super.field42];
                if (super.field67 >= 0 && super.field90 != super.field67) {
                    var7 = class71.field1705[super.field67].field1707[super.field68];
                }
                if (var10.field1714 >= 0) {
                    var8 = var10.field1714;
                    var4 += (long) (var8 - this.field1286[5] << 8);
                }
                if (var10.field1715 >= 0) {
                    var9 = var10.field1715;
                    var4 += (long) (var9 - this.field1286[3] << 16);
                }
            } else if (super.field67 >= 0) {
                var6 = class71.field1705[super.field67].field1707[super.field68];
            }
            class67 var11 = (class67) field1295.method525(var4);
            if (arg0 != 0) {
                for (int var12 = 1; var12 > 0; ++var12) {
                }
            }
            if (var11 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field1286[var14];
                    if (var9 >= 0 && var14 == 3) {
                        var15 = var9;
                    }
                    if (var8 >= 0 && var14 == 5) {
                        var15 = var8;
                    }
                    if (var15 >= 256 && var15 < 512 && !class6.field101[var15 - 256].method24(989)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !class46.method438(var15 - 512).method440(-760, this.field1304)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field1303 != -1L) {
                        var11 = (class67) field1295.method525(this.field1303);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class67[] var16 = new class67[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field1286[var18];
                    if (var9 >= 0 && var18 == 3) {
                        var20 = var9;
                    }
                    if (var8 >= 0 && var18 == 5) {
                        var20 = var8;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        class67 var21 = class6.field101[var20 - 256].method25(true);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        class67 var22 = class46.method438(var20 - 512).method443(this.field1313, this.field1304);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var11 = new class67(var16, true, var17);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field1311[var19] != 0) {
                        var11.method562(client.field202[var19][0], client.field202[var19][this.field1311[var19]]);
                        if (var19 == 1) {
                            var11.method562(client.field475[0], client.field475[this.field1311[var19]]);
                        }
                    }
                }
                var11.method555((byte) 45);
                var11.method565(64, 850, -30, -50, -30, true);
                field1295.method526(var4, 5, var11);
                this.field1303 = var4;
            }
            if (this.field1291) {
                return var11;
            } else {
                class67 var23 = class67.field1610;
                var23.method550(var11, -509, class22.method219(var6, true) & class22.method219(var7, true));
                if (var6 != -1 && var7 != -1) {
                    var23.method557(class71.field1705[super.field41].field1711, var7, true, var6);
                } else if (var6 != -1) {
                    var23.method556(598, var6);
                }
                var23.method552(0);
                var23.field1647 = null;
                var23.field1646 = null;
                return var23;
            }
        }
    }
}
