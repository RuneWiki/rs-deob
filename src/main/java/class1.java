import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AGFDLNBY")
public class class1 extends class67 {

    @OriginalMember(owner = "AGFDLNBY", name = "pb", descriptor = "Z")
    private boolean field1 = true;

    @OriginalMember(owner = "AGFDLNBY", name = "tb", descriptor = "[I")
    public int[] field5 = new int[12];

    @OriginalMember(owner = "AGFDLNBY", name = "ub", descriptor = "[I")
    public int[] field6 = new int[5];

    @OriginalMember(owner = "AGFDLNBY", name = "vb", descriptor = "B")
    private byte field7 = 6;

    @OriginalMember(owner = "AGFDLNBY", name = "Cb", descriptor = "I")
    private int field14 = -489;

    @OriginalMember(owner = "AGFDLNBY", name = "Gb", descriptor = "Z")
    public boolean field18 = false;

    @OriginalMember(owner = "AGFDLNBY", name = "Nb", descriptor = "I")
    private int field25 = -131;

    @OriginalMember(owner = "AGFDLNBY", name = "Ob", descriptor = "J")
    public long field26 = -1L;

    @OriginalMember(owner = "AGFDLNBY", name = "Rb", descriptor = "Z")
    public boolean field29 = false;

    @OriginalMember(owner = "AGFDLNBY", name = "Fb", descriptor = "LGOHJFVWE;")
    public static class23 field17 = new class23((byte) -54, 260);

    @OriginalMember(owner = "AGFDLNBY", name = "yb", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "AGFDLNBY", name = "zb", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "AGFDLNBY", name = "Db", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "AGFDLNBY", name = "Eb", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "AGFDLNBY", name = "Hb", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "AGFDLNBY", name = "qb", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "AGFDLNBY", name = "Ib", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "AGFDLNBY", name = "Jb", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "AGFDLNBY", name = "Kb", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "AGFDLNBY", name = "Lb", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "AGFDLNBY", name = "Mb", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "AGFDLNBY", name = "Qb", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "AGFDLNBY", name = "sb", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "AGFDLNBY", name = "wb", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "AGFDLNBY", name = "xb", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "AGFDLNBY", name = "Pb", descriptor = "J")
    public long field27;

    @OriginalMember(owner = "AGFDLNBY", name = "rb", descriptor = "LFKIKYVJJ;")
    public class19 field3;

    @OriginalMember(owner = "AGFDLNBY", name = "Ab", descriptor = "LOIBEFFXI;")
    public class39 field12;

    @OriginalMember(owner = "AGFDLNBY", name = "Bb", descriptor = "Ljava/lang/String;")
    public String field13;

    @OriginalMember(owner = "AGFDLNBY", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        if (arg0 != 8) {
            this.field1 = !this.field1;
        }
        return this.field18;
    }

    @OriginalMember(owner = "AGFDLNBY", name = "a", descriptor = "(Z)LOIBEFFXI;")
    public final class39 method2(boolean arg0) {
        if (arg0) {
            this.field1 = !this.field1;
        }
        if (!this.field18) {
            return null;
        } else {
            class39 var2 = this.method5(0);
            if (var2 == null) {
                return null;
            } else {
                super.field1558 = var2.field1528;
                var2.field1139 = true;
                if (this.field29) {
                    return var2;
                } else {
                    if (super.field1580 != -1 && super.field1581 != -1) {
                        class27 var3 = class27.field847[super.field1580];
                        class39 var4 = var3.method233();
                        if (var4 != null) {
                            class39 var5 = new class39(false, true, var4, class55.method455(true, super.field1581), 5);
                            var5.method359(0, (byte) 4, 0, -super.field1584);
                            var5.method353(10544);
                            var5.method354(var3.field851.field165[super.field1581], this.field7);
                            var5.field1138 = null;
                            var5.field1137 = null;
                            if (var3.field854 != 128 || var3.field855 != 128) {
                                var5.method362((byte) 7, var3.field855, var3.field854, var3.field854);
                            }
                            var5.method363(var3.field857 + 64, var3.field858 + 850, -30, -50, -30, true);
                            class39[] var6 = new class39[] { var2, var5 };
                            var2 = new class39(2, var6, true, 584);
                        }
                    }
                    if (this.field12 != null) {
                        if (client.field345 >= this.field24) {
                            this.field12 = null;
                        }
                        if (client.field345 >= this.field23 && client.field345 < this.field24) {
                            class39 var7 = this.field12;
                            var7.method359(this.field11 - super.field1570, (byte) 4, this.field9 - super.field1569, this.field10 - this.field8);
                            if (super.field1562 == 512) {
                                var7.method357(true);
                                var7.method357(true);
                                var7.method357(true);
                            } else if (super.field1562 == 1024) {
                                var7.method357(true);
                                var7.method357(true);
                            } else if (super.field1562 == 1536) {
                                var7.method357(true);
                            }
                            class39[] var8 = new class39[] { var2, var7 };
                            var2 = new class39(2, var8, true, 584);
                            if (super.field1562 == 512) {
                                var7.method357(true);
                            } else if (super.field1562 == 1024) {
                                var7.method357(true);
                                var7.method357(true);
                            } else if (super.field1562 == 1536) {
                                var7.method357(true);
                                var7.method357(true);
                                var7.method357(true);
                            }
                            var7.method359(super.field1570 - this.field11, (byte) 4, super.field1569 - this.field9, this.field8 - this.field10);
                        }
                    }
                    var2.field1139 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "AGFDLNBY", name = "b", descriptor = "(I)LOIBEFFXI;")
    public final class39 method3(int arg0) {
        if (!this.field18) {
            return null;
        } else if (this.field3 != null) {
            return this.field3.method205((byte) 7);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field5[var3];
                if (var12 >= 256 && var12 < 512 && !class60.field1471[var12 - 256].method512(this.field25)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class3.method13(var12 - 512).method8((byte) 63, this.field15)) {
                    var2 = true;
                }
            }
            if (arg0 <= 0) {
                throw new NullPointerException();
            } else if (var2) {
                return null;
            } else {
                class39[] var4 = new class39[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field5[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class39 var10 = class60.field1471[var9 - 256].method513(932);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class39 var11 = class3.method13(var9 - 512).method18(false, this.field15);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class39 var7 = new class39(var4, (byte) 0, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field6[var8] != 0) {
                        var7.method360(client.field532[var8][0], client.field532[var8][this.field6[var8]]);
                        if (var8 == 1) {
                            var7.method360(client.field591[0], client.field591[this.field6[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "AGFDLNBY", name = "a", descriptor = "(ILYOXDZEVD;)V")
    public final void method4(int arg0, class68 arg1) {
        arg1.field1612 = 0;
        this.field15 = arg1.method549();
        this.field28 = arg1.method549();
        this.field3 = null;
        this.field2 = 0;
        if (arg0 > 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                int var4 = arg1.method549();
                if (var4 == 0) {
                    this.field5[var3] = 0;
                } else {
                    int var5 = arg1.method549();
                    this.field5[var3] = (var4 << 8) + var5;
                    if (var3 == 0 && this.field5[0] == 65535) {
                        this.field3 = class19.method202(arg1.method551());
                        break;
                    }
                    if (this.field5[var3] >= 512 && this.field5[var3] - 512 < class3.field62) {
                        int var10 = class3.method13(this.field5[var3] - 512).field98;
                        if (var10 != 0) {
                            this.field2 = var10;
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                int var9 = arg1.method549();
                if (var9 < 0 || var9 >= client.field532[var6].length) {
                    var9 = 0;
                }
                this.field6[var6] = var9;
            }
            super.field1586 = arg1.method551();
            if (super.field1586 == 65535) {
                super.field1586 = -1;
            }
            super.field1587 = arg1.method551();
            if (super.field1587 == 65535) {
                super.field1587 = -1;
            }
            super.field1565 = arg1.method551();
            if (super.field1565 == 65535) {
                super.field1565 = -1;
            }
            super.field1566 = arg1.method551();
            if (super.field1566 == 65535) {
                super.field1566 = -1;
            }
            super.field1567 = arg1.method551();
            if (super.field1567 == 65535) {
                super.field1567 = -1;
            }
            super.field1568 = arg1.method551();
            if (super.field1568 == 65535) {
                super.field1568 = -1;
            }
            super.field1557 = arg1.method551();
            if (super.field1557 == 65535) {
                super.field1557 = -1;
            }
            this.field13 = class21.method213(31698, class21.method210(0, arg1.method555(true)));
            this.field4 = arg1.method549();
            this.field16 = arg1.method551();
            this.field18 = true;
            this.field27 = 0L;
            for (int var7 = 0; var7 < 12; ++var7) {
                this.field27 <<= 4;
                if (this.field5[var7] >= 256) {
                    this.field27 += (long) (this.field5[var7] - 256);
                }
            }
            if (this.field5[0] >= 256) {
                this.field27 += (long) (this.field5[0] - 256 >> 4);
            }
            if (this.field5[1] >= 256) {
                this.field27 += (long) (this.field5[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field27 <<= 3;
                this.field27 += (long) this.field6[var8];
            }
            this.field27 <<= 1;
            this.field27 += (long) this.field15;
        }
    }

    @OriginalMember(owner = "AGFDLNBY", name = "c", descriptor = "(I)LOIBEFFXI;")
    private final class39 method5(int arg0) {
        if (this.field3 != null) {
            int var2 = -1;
            if (super.field1575 >= 0 && super.field1578 == 0) {
                var2 = class9.field163[super.field1575].field165[super.field1576];
            } else if (super.field1572 >= 0) {
                var2 = class9.field163[super.field1572].field165[super.field1573];
            }
            return this.field3.method208((int[]) null, var2, -837, -1);
        } else {
            long var4 = this.field27;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (arg0 != 0) {
                this.field14 = -92;
            }
            if (super.field1575 >= 0 && super.field1578 == 0) {
                class9 var10 = class9.field163[super.field1575];
                var6 = var10.field165[super.field1576];
                if (super.field1572 >= 0 && super.field1586 != super.field1572) {
                    var7 = class9.field163[super.field1572].field165[super.field1573];
                }
                if (var10.field172 >= 0) {
                    var8 = var10.field172;
                    var4 += (long) (var8 - this.field5[5] << 8);
                }
                if (var10.field173 >= 0) {
                    var9 = var10.field173;
                    var4 += (long) (var9 - this.field5[3] << 16);
                }
            } else if (super.field1572 >= 0) {
                var6 = class9.field163[super.field1572].field165[super.field1573];
            }
            class39 var11 = (class39) field17.method227(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field5[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class60.field1471[var14 - 256].method510(48283)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class3.method13(var14 - 512).method9(this.field15, 734)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field26 != -1L) {
                        var11 = (class39) field17.method227(this.field26);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class39[] var15 = new class39[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field5[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class39 var20 = class60.field1471[var19 - 256].method511(false);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class39 var21 = class3.method13(var19 - 512).method11(this.field15, 0);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class39(var15, (byte) 0, var16);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field6[var18] != 0) {
                        var11.method360(client.field532[var18][0], client.field532[var18][this.field6[var18]]);
                        if (var18 == 1) {
                            var11.method360(client.field591[0], client.field591[this.field6[var18]]);
                        }
                    }
                }
                var11.method353(10544);
                var11.method363(64, 850, -30, -50, -30, true);
                field17.method228(0, var11, var4);
                this.field26 = var4;
            }
            if (this.field29) {
                return var11;
            } else {
                class39 var22 = class39.field1101;
                var22.method348((byte) 9, class55.method455(true, var6) & class55.method455(true, var7), var11);
                if (var6 != -1 && var7 != -1) {
                    var22.method355(class9.field163[super.field1575].field169, var6, true, var7);
                } else if (var6 != -1) {
                    var22.method354(var6, this.field7);
                }
                var22.method350((byte) -85);
                var22.field1138 = null;
                var22.field1137 = null;
                return var22;
            }
        }
    }
}
