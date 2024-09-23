import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TKIWGAGO")
public class class54 extends class12 {

    @OriginalMember(owner = "TKIWGAGO", name = "qb", descriptor = "Z")
    public boolean field1342 = false;

    @OriginalMember(owner = "TKIWGAGO", name = "rb", descriptor = "B")
    private byte field1343 = 0;

    @OriginalMember(owner = "TKIWGAGO", name = "sb", descriptor = "B")
    private byte field1344 = -125;

    @OriginalMember(owner = "TKIWGAGO", name = "Ab", descriptor = "B")
    private byte field1352 = 55;

    @OriginalMember(owner = "TKIWGAGO", name = "Bb", descriptor = "I")
    private int field1353 = -630;

    @OriginalMember(owner = "TKIWGAGO", name = "Cb", descriptor = "[I")
    public int[] field1354 = new int[5];

    @OriginalMember(owner = "TKIWGAGO", name = "Db", descriptor = "J")
    public long field1355 = -1L;

    @OriginalMember(owner = "TKIWGAGO", name = "Fb", descriptor = "I")
    private int field1357 = 123;

    @OriginalMember(owner = "TKIWGAGO", name = "Gb", descriptor = "Z")
    private boolean field1358 = false;

    @OriginalMember(owner = "TKIWGAGO", name = "Lb", descriptor = "Z")
    public boolean field1363 = false;

    @OriginalMember(owner = "TKIWGAGO", name = "Rb", descriptor = "[I")
    public int[] field1369 = new int[12];

    @OriginalMember(owner = "TKIWGAGO", name = "Sb", descriptor = "LGOPFMRDJ;")
    public static class22 field1370 = new class22(639, 260);

    @OriginalMember(owner = "TKIWGAGO", name = "tb", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "TKIWGAGO", name = "ub", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "TKIWGAGO", name = "vb", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "TKIWGAGO", name = "wb", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "TKIWGAGO", name = "xb", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "TKIWGAGO", name = "yb", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "TKIWGAGO", name = "zb", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "TKIWGAGO", name = "Hb", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "TKIWGAGO", name = "Jb", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "TKIWGAGO", name = "Kb", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "TKIWGAGO", name = "Mb", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "TKIWGAGO", name = "Nb", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "TKIWGAGO", name = "Ob", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "TKIWGAGO", name = "Tb", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "TKIWGAGO", name = "Ub", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "TKIWGAGO", name = "Qb", descriptor = "J")
    public long field1368;

    @OriginalMember(owner = "TKIWGAGO", name = "Eb", descriptor = "LFWGUGZKU;")
    public class19 field1356;

    @OriginalMember(owner = "TKIWGAGO", name = "Pb", descriptor = "LITSMSHJO;")
    public class27 field1367;

    @OriginalMember(owner = "TKIWGAGO", name = "Ib", descriptor = "Ljava/lang/String;")
    public String field1360;

    @OriginalMember(owner = "TKIWGAGO", name = "b", descriptor = "(Z)Z")
    public final boolean method1(boolean arg0) {
        if (arg0) {
            this.field1353 = 356;
        }
        return this.field1342;
    }

    @OriginalMember(owner = "TKIWGAGO", name = "a", descriptor = "(B)LITSMSHJO;")
    public final class27 method423(byte arg0) {
        if (!this.field1342) {
            return null;
        } else if (this.field1356 != null) {
            return this.field1356.method213(7);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field1369[var3];
                if (var13 >= 256 && var13 < 512 && !class5.field52[var13 - 256].method25(this.field1353)) {
                    var2 = true;
                }
                if (var13 >= 512 && !class57.method437(var13 - 512).method431(this.field1362, false)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class27[] var4 = new class27[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var10 = this.field1369[var6];
                    if (var10 >= 256 && var10 < 512) {
                        class27 var11 = class5.field52[var10 - 256].method26((byte) 30);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class27 var12 = class57.method437(var10 - 512).method432((byte) 88, this.field1362);
                        if (var12 != null) {
                            var4[var5++] = var12;
                        }
                    }
                }
                class27 var7 = new class27(var4, true, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1354[var8] != 0) {
                        var7.method252(client.field408[var8][0], client.field408[var8][this.field1354[var8]]);
                        if (var8 == 1) {
                            var7.method252(client.field434[0], client.field434[this.field1354[var8]]);
                        }
                    }
                }
                if (this.field1343 != arg0) {
                    for (int var9 = 1; var9 > 0; ++var9) {
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "TKIWGAGO", name = "b", descriptor = "(I)LITSMSHJO;")
    private final class27 method424(int arg0) {
        if (this.field1356 != null) {
            int var2 = -1;
            if (super.field607 >= 0 && super.field610 == 0) {
                var2 = class24.field813[super.field607].field815[super.field608];
            } else if (super.field612 >= 0) {
                var2 = class24.field813[super.field612].field815[super.field613];
            }
            return this.field1356.method212(this.field1344, var2, (int[]) null, -1);
        } else {
            long var4 = this.field1368;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (arg0 != -23990) {
                this.field1357 = 5;
            }
            if (super.field607 >= 0 && super.field610 == 0) {
                class24 var10 = class24.field813[super.field607];
                var6 = var10.field815[super.field608];
                if (super.field612 >= 0 && super.field616 != super.field612) {
                    var7 = class24.field813[super.field612].field815[super.field613];
                }
                if (var10.field822 >= 0) {
                    var8 = var10.field822;
                    var4 += (long) (var8 - this.field1369[5] << 8);
                }
                if (var10.field823 >= 0) {
                    var9 = var10.field823;
                    var4 += (long) (var9 - this.field1369[3] << 16);
                }
            } else if (super.field612 >= 0) {
                var6 = class24.field813[super.field612].field815[super.field613];
            }
            class27 var11 = (class27) field1370.method220(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1369[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class5.field52[var14 - 256].method23(false)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class57.method437(var14 - 512).method430(-989, this.field1362)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1355 != -1L) {
                        var11 = (class27) field1370.method220(this.field1355);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class27[] var15 = new class27[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1369[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class27 var20 = class5.field52[var19 - 256].method24(0);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class27 var21 = class57.method437(var19 - 512).method438(this.field1362, 7);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class27(var15, true, var16);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1354[var18] != 0) {
                        var11.method252(client.field408[var18][0], client.field408[var18][this.field1354[var18]]);
                        if (var18 == 1) {
                            var11.method252(client.field434[0], client.field434[this.field1354[var18]]);
                        }
                    }
                }
                var11.method245(0);
                var11.method255(64, 850, -30, -50, -30, true);
                field1370.method221(var4, this.field1352, var11);
                this.field1355 = var4;
            }
            if (this.field1363) {
                return var11;
            } else {
                class27 var22 = class27.field858;
                var22.method240(var11, 5, class49.method401(var6, 0) & class49.method401(var7, 0));
                if (var6 != -1 && var7 != -1) {
                    var22.method247(var6, class24.field813[super.field607].field819, true, var7);
                } else if (var6 != -1) {
                    var22.method246(-1851, var6);
                }
                var22.method242(-407);
                var22.field895 = null;
                var22.field894 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "TKIWGAGO", name = "a", descriptor = "(Z)LITSMSHJO;")
    public final class27 method2(boolean arg0) {
        if (!this.field1342) {
            return null;
        } else {
            class27 var2 = this.method424(-23990);
            if (var2 == null) {
                return null;
            } else {
                super.field604 = var2.field1340;
                var2.field896 = true;
                if (this.field1363) {
                    return var2;
                } else {
                    if (super.field632 != -1 && super.field633 != -1) {
                        class17 var3 = class17.field725[super.field632];
                        class27 var4 = var3.method206();
                        if (var4 != null) {
                            class27 var5 = new class27(var4, class49.method401(super.field633, 0), false, (byte) 85, true);
                            var5.method251(231, 0, 0, -super.field636);
                            var5.method245(0);
                            var5.method246(-1851, var3.field729.field815[super.field633]);
                            var5.field895 = null;
                            var5.field894 = null;
                            if (var3.field732 != 128 || var3.field733 != 128) {
                                var5.method254(var3.field732, var3.field732, var3.field733, 619);
                            }
                            var5.method255(var3.field735 + 64, var3.field736 + 850, -30, -50, -30, true);
                            class27[] var6 = new class27[] { var2, var5 };
                            var2 = new class27(0, true, var6, 2);
                        }
                    }
                    if (this.field1367 != null) {
                        if (client.field330 >= this.field1372) {
                            this.field1367 = null;
                        }
                        if (client.field330 >= this.field1371 && client.field330 < this.field1372) {
                            class27 var7 = this.field1367;
                            var7.method251(231, this.field1364 - super.field587, this.field1366 - super.field588, this.field1365 - this.field1359);
                            if (super.field603 == 512) {
                                var7.method249(true);
                                var7.method249(true);
                                var7.method249(true);
                            } else if (super.field603 == 1024) {
                                var7.method249(true);
                                var7.method249(true);
                            } else if (super.field603 == 1536) {
                                var7.method249(true);
                            }
                            class27[] var8 = new class27[] { var2, var7 };
                            var2 = new class27(0, true, var8, 2);
                            if (super.field603 == 512) {
                                var7.method249(true);
                            } else if (super.field603 == 1024) {
                                var7.method249(true);
                                var7.method249(true);
                            } else if (super.field603 == 1536) {
                                var7.method249(true);
                                var7.method249(true);
                                var7.method249(true);
                            }
                            var7.method251(231, super.field587 - this.field1364, super.field588 - this.field1366, this.field1359 - this.field1365);
                        }
                    }
                    var2.field896 = true;
                    if (!arg0) {
                        for (int var9 = 1; var9 > 0; ++var9) {
                        }
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "TKIWGAGO", name = "a", descriptor = "(LXQPFGONL;Z)V")
    public final void method425(class62 arg0, boolean arg1) {
        arg0.field1542 = 0;
        this.field1362 = arg0.method478();
        this.field1347 = arg0.method478();
        this.field1356 = null;
        this.field1361 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method478();
            if (var4 == 0) {
                this.field1369[var3] = 0;
            } else {
                int var5 = arg0.method478();
                this.field1369[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1369[0] == 65535) {
                    this.field1356 = class19.method210(arg0.method480());
                    break;
                }
                if (this.field1369[var3] >= 512 && this.field1369[var3] - 512 < class57.field1424) {
                    int var10 = class57.method437(this.field1369[var3] - 512).field1437;
                    if (var10 != 0) {
                        this.field1361 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg0.method478();
            if (var9 < 0 || var9 >= client.field408[var6].length) {
                var9 = 0;
            }
            this.field1354[var6] = var9;
        }
        super.field616 = arg0.method480();
        if (super.field616 == 65535) {
            super.field616 = -1;
        }
        super.field617 = arg0.method480();
        if (super.field617 == 65535) {
            super.field617 = -1;
        }
        super.field593 = arg0.method480();
        if (super.field593 == 65535) {
            super.field593 = -1;
        }
        super.field594 = arg0.method480();
        if (super.field594 == 65535) {
            super.field594 = -1;
        }
        super.field595 = arg0.method480();
        if (super.field595 == 65535) {
            super.field595 = -1;
        }
        super.field596 = arg0.method480();
        if (super.field596 == 65535) {
            super.field596 = -1;
        }
        super.field605 = arg0.method480();
        if (super.field605 == 65535) {
            super.field605 = -1;
        }
        this.field1360 = class20.method218(-670, class20.method215(7, arg0.method484((byte) 17)));
        if (!arg1) {
            this.field1346 = arg0.method478();
            this.field1345 = arg0.method480();
            this.field1342 = true;
            this.field1368 = 0L;
            for (int var7 = 0; var7 < 12; ++var7) {
                this.field1368 <<= 4;
                if (this.field1369[var7] >= 256) {
                    this.field1368 += (long) (this.field1369[var7] - 256);
                }
            }
            if (this.field1369[0] >= 256) {
                this.field1368 += (long) (this.field1369[0] - 256 >> 4);
            }
            if (this.field1369[1] >= 256) {
                this.field1368 += (long) (this.field1369[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field1368 <<= 3;
                this.field1368 += (long) this.field1354[var8];
            }
            this.field1368 <<= 1;
            this.field1368 += (long) this.field1362;
        }
    }
}
