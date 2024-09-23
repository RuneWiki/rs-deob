import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FHQGDDHF")
public class class23 extends class61 {

    @OriginalMember(owner = "FHQGDDHF", name = "zb", descriptor = "Z")
    public boolean field734 = false;

    @OriginalMember(owner = "FHQGDDHF", name = "Ab", descriptor = "Z")
    private boolean field735 = false;

    @OriginalMember(owner = "FHQGDDHF", name = "Bb", descriptor = "J")
    public long field736 = -1L;

    @OriginalMember(owner = "FHQGDDHF", name = "Jb", descriptor = "[I")
    public int[] field744 = new int[5];

    @OriginalMember(owner = "FHQGDDHF", name = "Mb", descriptor = "[I")
    public int[] field747 = new int[12];

    @OriginalMember(owner = "FHQGDDHF", name = "Qb", descriptor = "Z")
    public boolean field751 = false;

    @OriginalMember(owner = "FHQGDDHF", name = "Pb", descriptor = "LLSQNLJTA;")
    public static class42 field750 = new class42(260, (byte) 17);

    @OriginalMember(owner = "FHQGDDHF", name = "rb", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "FHQGDDHF", name = "sb", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "FHQGDDHF", name = "tb", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "FHQGDDHF", name = "ub", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "FHQGDDHF", name = "vb", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "FHQGDDHF", name = "wb", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "FHQGDDHF", name = "Cb", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "FHQGDDHF", name = "Db", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "FHQGDDHF", name = "Eb", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "FHQGDDHF", name = "Fb", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "FHQGDDHF", name = "Gb", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "FHQGDDHF", name = "Ib", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "FHQGDDHF", name = "Kb", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "FHQGDDHF", name = "Lb", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "FHQGDDHF", name = "Ob", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "FHQGDDHF", name = "Hb", descriptor = "J")
    public long field742;

    @OriginalMember(owner = "FHQGDDHF", name = "xb", descriptor = "LLFTMDGKK;")
    public class37 field732;

    @OriginalMember(owner = "FHQGDDHF", name = "Nb", descriptor = "LOMIIKHIV;")
    public class47 field748;

    @OriginalMember(owner = "FHQGDDHF", name = "yb", descriptor = "Ljava/lang/String;")
    public String field733;

    @OriginalMember(owner = "FHQGDDHF", name = "c", descriptor = "(Z)LLFTMDGKK;")
    public final class37 method293(boolean arg0) {
        if (!this.field751) {
            return null;
        } else if (this.field748 != null) {
            return this.field748.method449((byte) 6);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field747[var3];
                if (var12 >= 256 && var12 < 512 && !class51.field1311[var12 - 256].method467(7)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class34.method329(var12 - 512).method327(this.field727, -18391)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class37[] var4 = new class37[12];
                if (!arg0) {
                    throw new NullPointerException();
                } else {
                    int var5 = 0;
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field747[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class37 var10 = class51.field1311[var9 - 256].method468((byte) 113);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class37 var11 = class34.method329(var9 - 512).method325(-40130, this.field727);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class37 var7 = new class37(var5, 698, var4);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field744[var8] != 0) {
                            var7.method355(client.field449[var8][0], client.field449[var8][this.field744[var8]]);
                            if (var8 == 1) {
                                var7.method355(client.field369[0], client.field369[this.field744[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "FHQGDDHF", name = "d", descriptor = "(Z)LLFTMDGKK;")
    private final class37 method294(boolean arg0) {
        if (this.field748 != null) {
            int var2 = -1;
            if (super.field1571 >= 0 && super.field1574 == 0) {
                var2 = class32.field816[super.field1571].field818[super.field1572];
            } else if (super.field1578 >= 0) {
                var2 = class32.field816[super.field1578].field818[super.field1579];
            }
            return this.field748.method445((int[]) null, true, -1, var2);
        } else {
            long var4 = this.field742;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1571 >= 0 && super.field1574 == 0) {
                class32 var10 = class32.field816[super.field1571];
                var6 = var10.field818[super.field1572];
                if (super.field1578 >= 0 && super.field1578 != super.field1566) {
                    var7 = class32.field816[super.field1578].field818[super.field1579];
                }
                if (var10.field825 >= 0) {
                    var8 = var10.field825;
                    var4 += (long) (var8 - this.field747[5] << 8);
                }
                if (var10.field826 >= 0) {
                    var9 = var10.field826;
                    var4 += (long) (var9 - this.field747[3] << 16);
                }
            } else if (super.field1578 >= 0) {
                var6 = class32.field816[super.field1578].field818[super.field1579];
            }
            class37 var11 = (class37) field750.method369(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field747[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class51.field1311[var14 - 256].method465(506)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class34.method329(var14 - 512).method335(this.field727, (byte) 6)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field736 != -1L) {
                        var11 = (class37) field750.method369(this.field736);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class37[] var15 = new class37[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field747[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class37 var20 = class51.field1311[var19 - 256].method466(18165);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class37 var21 = class34.method329(var19 - 512).method331(this.field727, (byte) 0);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class37(var16, 698, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field744[var18] != 0) {
                        var11.method355(client.field449[var18][0], client.field449[var18][this.field744[var18]]);
                        if (var18 == 1) {
                            var11.method355(client.field369[0], client.field369[this.field744[var18]]);
                        }
                    }
                }
                var11.method348(false);
                var11.method358(64, 850, -30, -50, -30, true);
                field750.method370(var11, 0, var4);
                this.field736 = var4;
            }
            if (this.field734) {
                return var11;
            } else {
                class37 var22 = class37.field962;
                if (!arg0) {
                    throw new NullPointerException();
                } else {
                    var22.method343(var11, class7.method17(var6, false) & class7.method17(var7, false), 7);
                    if (var6 != -1 && var7 != -1) {
                        var22.method350(class32.field816[super.field1571].field822, 460, var7, var6);
                    } else if (var6 != -1) {
                        var22.method349(var6, (byte) 89);
                    }
                    var22.method345(false);
                    var22.field999 = null;
                    var22.field998 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "FHQGDDHF", name = "a", descriptor = "(LCFARFRSG;I)V")
    public final void method295(class8 arg0, int arg1) {
        arg0.field72 = 0;
        this.field727 = arg0.method30();
        this.field743 = arg0.method30();
        this.field748 = null;
        this.field749 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method30();
            if (var4 == 0) {
                this.field747[var3] = 0;
            } else {
                int var5 = arg0.method30();
                this.field747[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field747[0] == 65535) {
                    this.field748 = class47.method444(arg0.method32());
                    break;
                }
                if (this.field747[var3] >= 512 && this.field747[var3] - 512 < class34.field894) {
                    int var10 = class34.method329(this.field747[var3] - 512).field891;
                    if (var10 != 0) {
                        this.field749 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg0.method30();
            if (var9 < 0 || var9 >= client.field449[var6].length) {
                var9 = 0;
            }
            this.field744[var6] = var9;
        }
        super.field1566 = arg0.method32();
        if (super.field1566 == 65535) {
            super.field1566 = -1;
        }
        super.field1567 = arg0.method32();
        if (super.field1567 == 65535) {
            super.field1567 = -1;
        }
        super.field1538 = arg0.method32();
        if (super.field1538 == 65535) {
            super.field1538 = -1;
        }
        super.field1539 = arg0.method32();
        if (super.field1539 == 65535) {
            super.field1539 = -1;
        }
        super.field1540 = arg0.method32();
        if (super.field1540 == 65535) {
            super.field1540 = -1;
        }
        super.field1541 = arg0.method32();
        if (super.field1541 == 65535) {
            super.field1541 = -1;
        }
        super.field1542 = arg0.method32();
        if (super.field1542 == 65535) {
            super.field1542 = -1;
        }
        this.field733 = class71.method591(1, class71.method588(arg0.method36((byte) -111), (byte) -66));
        this.field726 = arg0.method30();
        this.field728 = arg0.method32();
        this.field751 = true;
        this.field742 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field742 <<= 4;
            if (this.field747[var7] >= 256) {
                this.field742 += (long) (this.field747[var7] - 256);
            }
        }
        if (this.field747[0] >= 256) {
            this.field742 += (long) (this.field747[0] - 256 >> 4);
        }
        if (this.field747[1] >= 256) {
            this.field742 += (long) (this.field747[1] - 256 >> 8);
        }
        for (int var8 = 0; var8 < 5; ++var8) {
            this.field742 <<= 3;
            this.field742 += (long) this.field744[var8];
        }
        if (arg1 < 0) {
            this.field742 <<= 1;
            this.field742 += (long) this.field727;
        }
    }

    @OriginalMember(owner = "FHQGDDHF", name = "b", descriptor = "(Z)Z")
    public final boolean method2(boolean arg0) {
        if (arg0) {
            this.field735 = !this.field735;
        }
        return this.field751;
    }

    @OriginalMember(owner = "FHQGDDHF", name = "a", descriptor = "(I)LLFTMDGKK;")
    public final class37 method1(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (!this.field751) {
            return null;
        } else {
            class37 var2 = this.method294(true);
            if (var2 == null) {
                return null;
            } else {
                super.field1563 = var2.field582;
                var2.field1000 = true;
                if (this.field734) {
                    return var2;
                } else {
                    if (super.field1527 != -1 && super.field1528 != -1) {
                        class4 var3 = class4.field15[super.field1527];
                        class37 var4 = var3.method11();
                        if (var4 != null) {
                            class37 var5 = new class37(class7.method17(super.field1528, false), true, var4, false, false);
                            var5.method354(-super.field1531, (byte) 24, 0, 0);
                            var5.method348(false);
                            var5.method349(var3.field19.field818[super.field1528], (byte) 89);
                            var5.field999 = null;
                            var5.field998 = null;
                            if (var3.field22 != 128 || var3.field23 != 128) {
                                var5.method357(5, var3.field23, var3.field22, var3.field22);
                            }
                            var5.method358(var3.field25 + 64, var3.field26 + 850, -30, -50, -30, true);
                            class37[] var6 = new class37[] { var2, var5 };
                            var2 = new class37(true, var6, false, 2);
                        }
                    }
                    if (this.field732 != null) {
                        if (client.field183 >= this.field746) {
                            this.field732 = null;
                        }
                        if (client.field183 >= this.field745 && client.field183 < this.field746) {
                            class37 var7 = this.field732;
                            var7.method354(this.field730 - this.field741, (byte) 24, this.field729 - super.field1555, this.field731 - super.field1556);
                            if (super.field1561 == 512) {
                                var7.method352(-542);
                                var7.method352(-542);
                                var7.method352(-542);
                            } else if (super.field1561 == 1024) {
                                var7.method352(-542);
                                var7.method352(-542);
                            } else if (super.field1561 == 1536) {
                                var7.method352(-542);
                            }
                            class37[] var8 = new class37[] { var2, var7 };
                            var2 = new class37(true, var8, false, 2);
                            if (super.field1561 == 512) {
                                var7.method352(-542);
                            } else if (super.field1561 == 1024) {
                                var7.method352(-542);
                                var7.method352(-542);
                            } else if (super.field1561 == 1536) {
                                var7.method352(-542);
                                var7.method352(-542);
                                var7.method352(-542);
                            }
                            var7.method354(this.field741 - this.field730, (byte) 24, super.field1555 - this.field729, super.field1556 - this.field731);
                        }
                    }
                    var2.field1000 = true;
                    return var2;
                }
            }
        }
    }
}
