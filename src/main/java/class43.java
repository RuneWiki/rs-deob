import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PASMQFXV")
public class class43 extends class58 {

    @OriginalMember(owner = "PASMQFXV", name = "sb", descriptor = "I")
    private int field1097 = -938;

    @OriginalMember(owner = "PASMQFXV", name = "tb", descriptor = "[I")
    public int[] field1098 = new int[12];

    @OriginalMember(owner = "PASMQFXV", name = "zb", descriptor = "Z")
    private boolean field1104 = false;

    @OriginalMember(owner = "PASMQFXV", name = "Ab", descriptor = "Z")
    public boolean field1105 = false;

    @OriginalMember(owner = "PASMQFXV", name = "Db", descriptor = "B")
    private byte field1108 = 1;

    @OriginalMember(owner = "PASMQFXV", name = "Eb", descriptor = "J")
    public long field1109 = -1L;

    @OriginalMember(owner = "PASMQFXV", name = "Mb", descriptor = "Z")
    public boolean field1117 = false;

    @OriginalMember(owner = "PASMQFXV", name = "Nb", descriptor = "[I")
    public int[] field1118 = new int[5];

    @OriginalMember(owner = "PASMQFXV", name = "Ob", descriptor = "B")
    private byte field1119 = 2;

    @OriginalMember(owner = "PASMQFXV", name = "Rb", descriptor = "LHGKRJZKS;")
    public static class24 field1122 = new class24(0, 260);

    @OriginalMember(owner = "PASMQFXV", name = "qb", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "PASMQFXV", name = "ub", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "PASMQFXV", name = "vb", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "PASMQFXV", name = "wb", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "PASMQFXV", name = "xb", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "PASMQFXV", name = "yb", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "PASMQFXV", name = "Bb", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "PASMQFXV", name = "Cb", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "PASMQFXV", name = "Gb", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "PASMQFXV", name = "Hb", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "PASMQFXV", name = "Ib", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "PASMQFXV", name = "Jb", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "PASMQFXV", name = "Kb", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "PASMQFXV", name = "Pb", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "PASMQFXV", name = "Qb", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "PASMQFXV", name = "rb", descriptor = "J")
    public long field1096;

    @OriginalMember(owner = "PASMQFXV", name = "Fb", descriptor = "LLPTCUHOU;")
    public class36 field1110;

    @OriginalMember(owner = "PASMQFXV", name = "Lb", descriptor = "LVHYCWIPJ;")
    public class53 field1116;

    @OriginalMember(owner = "PASMQFXV", name = "pb", descriptor = "Ljava/lang/String;")
    public String field1094;

    @OriginalMember(owner = "PASMQFXV", name = "a", descriptor = "(B)Z")
    public final boolean method404(byte arg0) {
        if (arg0 != 4) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field1105;
    }

    @OriginalMember(owner = "PASMQFXV", name = "a", descriptor = "(I)LVHYCWIPJ;")
    public final class53 method217(int arg0) {
        if (!this.field1105) {
            return null;
        } else {
            class53 var2 = this.method407(-938);
            if (var2 == null) {
                return null;
            } else {
                super.field1482 = var2.field1124;
                var2.field1412 = true;
                if (this.field1117) {
                    return var2;
                } else {
                    if (super.field1490 != -1 && super.field1491 != -1) {
                        class64 var3 = class64.field1620[super.field1490];
                        class53 var4 = var3.method579();
                        if (var4 != null) {
                            class53 var5 = new class53((byte) 9, class51.method489(super.field1491, this.field1108), true, false, var4);
                            var5.method513(0, 0, 0, -super.field1494);
                            var5.method507(0);
                            var5.method508(999, var3.field1624.field1540[super.field1491]);
                            var5.field1411 = null;
                            var5.field1410 = null;
                            if (var3.field1627 != 128 || var3.field1628 != 128) {
                                var5.method516(this.field1104, var3.field1627, var3.field1627, var3.field1628);
                            }
                            var5.method517(var3.field1630 + 64, var3.field1631 + 850, -30, -50, -30, true);
                            class53[] var6 = new class53[] { var2, var5 };
                            var2 = new class53(2, true, 7, var6);
                        }
                    }
                    if (this.field1116 != null) {
                        if (client.field332 >= this.field1112) {
                            this.field1116 = null;
                        }
                        if (client.field332 >= this.field1111 && client.field332 < this.field1112) {
                            class53 var7 = this.field1116;
                            var7.method513(0, this.field1115 - super.field1507, this.field1113 - super.field1506, this.field1114 - this.field1120);
                            if (super.field1502 == 512) {
                                var7.method511(true);
                                var7.method511(true);
                                var7.method511(true);
                            } else if (super.field1502 == 1024) {
                                var7.method511(true);
                                var7.method511(true);
                            } else if (super.field1502 == 1536) {
                                var7.method511(true);
                            }
                            class53[] var8 = new class53[] { var2, var7 };
                            var2 = new class53(2, true, 7, var8);
                            if (super.field1502 == 512) {
                                var7.method511(true);
                            } else if (super.field1502 == 1024) {
                                var7.method511(true);
                                var7.method511(true);
                            } else if (super.field1502 == 1536) {
                                var7.method511(true);
                                var7.method511(true);
                                var7.method511(true);
                            }
                            var7.method513(0, super.field1507 - this.field1115, super.field1506 - this.field1113, this.field1120 - this.field1114);
                        }
                    }
                    var2.field1412 = true;
                    if (arg0 < 0) {
                        return var2;
                    } else {
                        throw new NullPointerException();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PASMQFXV", name = "a", descriptor = "(ILGLMIQHJI;)V")
    public final void method405(int arg0, class21 arg1) {
        arg1.field818 = 0;
        this.field1107 = arg1.method244();
        this.field1106 = arg1.method244();
        this.field1110 = null;
        this.field1103 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method244();
            if (var4 == 0) {
                this.field1098[var3] = 0;
            } else {
                int var5 = arg1.method244();
                this.field1098[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1098[0] == 65535) {
                    this.field1110 = class36.method380(arg1.method246());
                    break;
                }
                if (this.field1098[var3] >= 512 && this.field1098[var3] - 512 < class2.field6) {
                    int var11 = class2.method4(this.field1098[var3] - 512).field48;
                    if (var11 != 0) {
                        this.field1103 = var11;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var10 = arg1.method244();
            if (var10 < 0 || var10 >= client.field415[var6].length) {
                var10 = 0;
            }
            this.field1118[var6] = var10;
        }
        super.field1484 = arg1.method246();
        if (super.field1484 == 65535) {
            super.field1484 = -1;
        }
        super.field1485 = arg1.method246();
        if (super.field1485 == 65535) {
            super.field1485 = -1;
        }
        super.field1516 = arg1.method246();
        if (super.field1516 == 65535) {
            super.field1516 = -1;
        }
        super.field1517 = arg1.method246();
        if (super.field1517 == 65535) {
            super.field1517 = -1;
        }
        super.field1518 = arg1.method246();
        if (super.field1518 == 65535) {
            super.field1518 = -1;
        }
        super.field1519 = arg1.method246();
        if (super.field1519 == 65535) {
            super.field1519 = -1;
        }
        super.field1520 = arg1.method246();
        if (super.field1520 == 65535) {
            super.field1520 = -1;
        }
        this.field1094 = class70.method587(class70.method584(arg1.method250(true), 803), true);
        this.field1121 = arg1.method244();
        this.field1095 = arg1.method246();
        this.field1105 = true;
        this.field1096 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field1096 <<= 4;
            if (this.field1098[var7] >= 256) {
                this.field1096 += (long) (this.field1098[var7] - 256);
            }
        }
        if (arg0 != 0) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        if (this.field1098[0] >= 256) {
            this.field1096 += (long) (this.field1098[0] - 256 >> 4);
        }
        if (this.field1098[1] >= 256) {
            this.field1096 += (long) (this.field1098[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field1096 <<= 3;
            this.field1096 += (long) this.field1118[var9];
        }
        this.field1096 <<= 1;
        this.field1096 += (long) this.field1107;
    }

    @OriginalMember(owner = "PASMQFXV", name = "b", descriptor = "(I)LVHYCWIPJ;")
    public final class53 method406(int arg0) {
        if (!this.field1105) {
            return null;
        } else if (this.field1110 != null) {
            return this.field1110.method378(0);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1098[var3];
                if (var12 >= 256 && var12 < 512 && !class18.field779[var12 - 256].method225(0)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class2.method4(var12 - 512).method8(true, this.field1107)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class53[] var4 = new class53[12];
                if (arg0 != -23473) {
                    throw new NullPointerException();
                } else {
                    int var5 = 0;
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field1098[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class53 var10 = class18.field779[var9 - 256].method226(0);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class53 var11 = class2.method4(var9 - 512).method9(14858, this.field1107);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class53 var7 = new class53(var5, var4, -11616);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field1118[var8] != 0) {
                            var7.method514(client.field415[var8][0], client.field415[var8][this.field1118[var8]]);
                            if (var8 == 1) {
                                var7.method514(client.field315[0], client.field315[this.field1118[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "PASMQFXV", name = "c", descriptor = "(I)LVHYCWIPJ;")
    private final class53 method407(int arg0) {
        while (arg0 >= 0) {
            this.field1104 = !this.field1104;
        }
        if (this.field1110 != null) {
            int var2 = -1;
            if (super.field1524 >= 0 && super.field1527 == 0) {
                var2 = class59.field1538[super.field1524].field1540[super.field1525];
            } else if (super.field1533 >= 0) {
                var2 = class59.field1538[super.field1533].field1540[super.field1534];
            }
            return this.field1110.method382((int[]) null, -1, 14442, var2);
        } else {
            long var4 = this.field1096;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1524 >= 0 && super.field1527 == 0) {
                class59 var10 = class59.field1538[super.field1524];
                var6 = var10.field1540[super.field1525];
                if (super.field1533 >= 0 && super.field1533 != super.field1484) {
                    var7 = class59.field1538[super.field1533].field1540[super.field1534];
                }
                if (var10.field1547 >= 0) {
                    var8 = var10.field1547;
                    var4 += (long) (var8 - this.field1098[5] << 8);
                }
                if (var10.field1548 >= 0) {
                    var9 = var10.field1548;
                    var4 += (long) (var9 - this.field1098[3] << 16);
                }
            } else if (super.field1533 >= 0) {
                var6 = class59.field1538[super.field1533].field1540[super.field1534];
            }
            class53 var11 = (class53) field1122.method285(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1098[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class18.field779[var14 - 256].method223(this.field1119)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class2.method4(var14 - 512).method10((byte) 116, this.field1107)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1109 != -1L) {
                        var11 = (class53) field1122.method285(this.field1109);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class53[] var15 = new class53[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1098[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class53 var20 = class18.field779[var19 - 256].method224((byte) 4);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class53 var21 = class2.method4(var19 - 512).method2(false, this.field1107);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class53(var16, var15, -11616);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1118[var18] != 0) {
                        var11.method514(client.field415[var18][0], client.field415[var18][this.field1118[var18]]);
                        if (var18 == 1) {
                            var11.method514(client.field315[0], client.field315[this.field1118[var18]]);
                        }
                    }
                }
                var11.method507(0);
                var11.method517(64, 850, -30, -50, -30, true);
                field1122.method286(-43932, var4, var11);
                this.field1109 = var4;
            }
            if (this.field1117) {
                return var11;
            } else {
                class53 var22 = class53.field1374;
                var22.method502(var11, class51.method489(var6, this.field1108) & class51.method489(var7, this.field1108), 9);
                if (var6 != -1 && var7 != -1) {
                    var22.method509(false, var6, class59.field1538[super.field1524].field1544, var7);
                } else if (var6 != -1) {
                    var22.method508(999, var6);
                }
                var22.method504(43085);
                var22.field1411 = null;
                var22.field1410 = null;
                return var22;
            }
        }
    }
}
