import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AHUILQJH")
public class class1 extends class69 {

    @OriginalMember(owner = "AHUILQJH", name = "rb", descriptor = "Z")
    private boolean field2 = true;

    @OriginalMember(owner = "AHUILQJH", name = "sb", descriptor = "J")
    public long field3 = -1L;

    @OriginalMember(owner = "AHUILQJH", name = "tb", descriptor = "[I")
    public int[] field4 = new int[5];

    @OriginalMember(owner = "AHUILQJH", name = "yb", descriptor = "I")
    private int field9 = 3;

    @OriginalMember(owner = "AHUILQJH", name = "Db", descriptor = "Z")
    public boolean field14 = false;

    @OriginalMember(owner = "AHUILQJH", name = "Fb", descriptor = "[I")
    public int[] field16 = new int[12];

    @OriginalMember(owner = "AHUILQJH", name = "Gb", descriptor = "Z")
    public boolean field17 = false;

    @OriginalMember(owner = "AHUILQJH", name = "Hb", descriptor = "I")
    private int field18 = 9;

    @OriginalMember(owner = "AHUILQJH", name = "qb", descriptor = "LCZWVRQJW;")
    public static class4 field1 = new class4(false, 260);

    @OriginalMember(owner = "AHUILQJH", name = "zb", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "AHUILQJH", name = "Ab", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "AHUILQJH", name = "Bb", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "AHUILQJH", name = "Cb", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "AHUILQJH", name = "Eb", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "AHUILQJH", name = "Kb", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "AHUILQJH", name = "Mb", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "AHUILQJH", name = "Nb", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "AHUILQJH", name = "Ob", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "AHUILQJH", name = "Pb", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "AHUILQJH", name = "Qb", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "AHUILQJH", name = "Rb", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "AHUILQJH", name = "ub", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "AHUILQJH", name = "vb", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "AHUILQJH", name = "wb", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "AHUILQJH", name = "Lb", descriptor = "J")
    public long field22;

    @OriginalMember(owner = "AHUILQJH", name = "xb", descriptor = "LHEQROJXW;")
    public class27 field8;

    @OriginalMember(owner = "AHUILQJH", name = "Jb", descriptor = "LZNUYRYPY;")
    public class71 field20;

    @OriginalMember(owner = "AHUILQJH", name = "Ib", descriptor = "Ljava/lang/String;")
    public String field19;

    @OriginalMember(owner = "AHUILQJH", name = "a", descriptor = "(I)LHEQROJXW;")
    public final class27 method1(int arg0) {
        if (!this.field17) {
            return null;
        } else {
            class27 var2 = this.method2((byte) 6);
            if (arg0 >= 8 && arg0 <= 8) {
                if (var2 == null) {
                    return null;
                } else {
                    super.field1656 = var2.field741;
                    var2.field883 = true;
                    if (this.field14) {
                        return var2;
                    } else {
                        if (super.field1661 != -1 && super.field1662 != -1) {
                            class57 var3 = class57.field1384[super.field1661];
                            class27 var4 = var3.method539();
                            if (var4 != null) {
                                class27 var5 = new class27(-167, false, true, class56.method536(super.field1662, 9643), var4);
                                var5.method335(-super.field1665, 21528, 0, 0);
                                var5.method329(true);
                                var5.method330(var3.field1388.field1610[super.field1662], 0);
                                var5.field882 = null;
                                var5.field881 = null;
                                if (var3.field1391 != 128 || var3.field1392 != 128) {
                                    var5.method338(var3.field1392, 24701, var3.field1391, var3.field1391);
                                }
                                var5.method339(var3.field1394 + 64, var3.field1395 + 850, -30, -50, -30, true);
                                class27[] var6 = new class27[] { var2, var5 };
                                var2 = new class27(true, 2, var6, true);
                            }
                        }
                        if (this.field8 != null) {
                            if (client.field246 >= this.field11) {
                                this.field8 = null;
                            }
                            if (client.field246 >= this.field10 && client.field246 < this.field11) {
                                class27 var7 = this.field8;
                                var7.method335(this.field6 - this.field15, 21528, this.field7 - super.field1644, this.field5 - super.field1643);
                                if (super.field1687 == 512) {
                                    var7.method333(27080);
                                    var7.method333(27080);
                                    var7.method333(27080);
                                } else if (super.field1687 == 1024) {
                                    var7.method333(27080);
                                    var7.method333(27080);
                                } else if (super.field1687 == 1536) {
                                    var7.method333(27080);
                                }
                                class27[] var8 = new class27[] { var2, var7 };
                                var2 = new class27(true, 2, var8, true);
                                if (super.field1687 == 512) {
                                    var7.method333(27080);
                                } else if (super.field1687 == 1024) {
                                    var7.method333(27080);
                                    var7.method333(27080);
                                } else if (super.field1687 == 1536) {
                                    var7.method333(27080);
                                    var7.method333(27080);
                                    var7.method333(27080);
                                }
                                var7.method335(this.field15 - this.field6, 21528, super.field1644 - this.field7, super.field1643 - this.field5);
                            }
                        }
                        var2.field883 = true;
                        return var2;
                    }
                }
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "AHUILQJH", name = "a", descriptor = "(B)LHEQROJXW;")
    private final class27 method2(byte arg0) {
        if (this.field20 != null) {
            int var2 = -1;
            if (super.field1689 >= 0 && super.field1692 == 0) {
                var2 = class66.field1608[super.field1689].field1610[super.field1690];
            } else if (super.field1647 >= 0) {
                var2 = class66.field1608[super.field1647].field1610[super.field1648];
            }
            return this.field20.method586(0, (int[]) null, -1, var2);
        } else {
            long var4 = this.field22;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1689 >= 0 && super.field1692 == 0) {
                class66 var10 = class66.field1608[super.field1689];
                var6 = var10.field1610[super.field1690];
                if (super.field1647 >= 0 && super.field1654 != super.field1647) {
                    var7 = class66.field1608[super.field1647].field1610[super.field1648];
                }
                if (var10.field1617 >= 0) {
                    var8 = var10.field1617;
                    var4 += (long) (var8 - this.field16[5] << 8);
                }
                if (var10.field1618 >= 0) {
                    var9 = var10.field1618;
                    var4 += (long) (var9 - this.field16[3] << 16);
                }
            } else if (super.field1647 >= 0) {
                var6 = class66.field1608[super.field1647].field1610[super.field1648];
            }
            class27 var11 = (class27) field1.method152(var4);
            if (arg0 != 6) {
                this.field18 = -107;
            }
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field16[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class68.field1633[var14 - 256].method570(-852)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class32.method380(var14 - 512).method386(this.field27, (byte) 66)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field3 != -1L) {
                        var11 = (class27) field1.method152(this.field3);
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
                    int var19 = this.field16[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class27 var20 = class68.field1633[var19 - 256].method571(173);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class27 var21 = class32.method380(var19 - 512).method376(this.field27, 8);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class27((byte) 6, var16, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field4[var18] != 0) {
                        var11.method336(client.field243[var18][0], client.field243[var18][this.field4[var18]]);
                        if (var18 == 1) {
                            var11.method336(client.field425[0], client.field425[this.field4[var18]]);
                        }
                    }
                }
                var11.method329(true);
                var11.method339(64, 850, -30, -50, -30, true);
                field1.method153(var11, true, var4);
                this.field3 = var4;
            }
            if (this.field14) {
                return var11;
            } else {
                class27 var22 = class27.field845;
                var22.method324(class56.method536(var6, 9643) & class56.method536(var7, 9643), 0, var11);
                if (var6 != -1 && var7 != -1) {
                    var22.method331(var6, class66.field1608[super.field1689].field1614, var7, true);
                } else if (var6 != -1) {
                    var22.method330(var6, 0);
                }
                var22.method326((byte) -109);
                var22.field882 = null;
                var22.field881 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "AHUILQJH", name = "a", descriptor = "(Z)Z")
    public final boolean method3(boolean arg0) {
        if (arg0) {
            this.field2 = !this.field2;
        }
        return this.field17;
    }

    @OriginalMember(owner = "AHUILQJH", name = "a", descriptor = "(LLDILQFVA;I)V")
    public final void method4(class34 arg0, int arg1) {
        arg0.field1073 = 0;
        this.field27 = arg0.method402();
        this.field21 = arg0.method402();
        this.field20 = null;
        this.field13 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method402();
            if (var4 == 0) {
                this.field16[var3] = 0;
            } else {
                int var5 = arg0.method402();
                this.field16[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field16[0] == 65535) {
                    this.field20 = class71.method589(arg0.method404());
                    break;
                }
                if (this.field16[var3] >= 512 && this.field16[var3] - 512 < class32.field1004) {
                    int var10 = class32.method380(this.field16[var3] - 512).field1023;
                    if (var10 != 0) {
                        this.field13 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg0.method402();
            if (var9 < 0 || var9 >= client.field243[var6].length) {
                var9 = 0;
            }
            this.field4[var6] = var9;
        }
        super.field1654 = arg0.method404();
        if (super.field1654 == 65535) {
            super.field1654 = -1;
        }
        super.field1655 = arg0.method404();
        if (super.field1655 == 65535) {
            super.field1655 = -1;
        }
        super.field1675 = arg0.method404();
        if (super.field1675 == 65535) {
            super.field1675 = -1;
        }
        super.field1676 = arg0.method404();
        if (super.field1676 == 65535) {
            super.field1676 = -1;
        }
        super.field1677 = arg0.method404();
        if (super.field1677 == 65535) {
            super.field1677 = -1;
        }
        super.field1678 = arg0.method404();
        if (super.field1678 == 65535) {
            super.field1678 = -1;
        }
        super.field1680 = arg0.method404();
        if (super.field1680 == 65535) {
            super.field1680 = -1;
        }
        this.field19 = class20.method272(false, class20.method269(arg0.method408(0), -898));
        this.field12 = arg0.method402();
        this.field28 = arg0.method404();
        this.field17 = true;
        this.field22 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field22 <<= 4;
            if (this.field16[var7] >= 256) {
                this.field22 += (long) (this.field16[var7] - 256);
            }
        }
        if (this.field16[0] >= 256) {
            this.field22 += (long) (this.field16[0] - 256 >> 4);
        }
        if (this.field16[1] >= 256) {
            this.field22 += (long) (this.field16[1] - 256 >> 8);
        }
        for (int var8 = 0; var8 < 5; ++var8) {
            this.field22 <<= 3;
            this.field22 += (long) this.field4[var8];
        }
        this.field22 <<= 1;
        this.field22 += (long) this.field27;
        if (arg1 < 8 || arg1 > 8) {
            this.field9 = -166;
        }
    }

    @OriginalMember(owner = "AHUILQJH", name = "b", descriptor = "(B)LHEQROJXW;")
    public final class27 method5(byte arg0) {
        if (!this.field17) {
            return null;
        } else if (this.field20 != null) {
            return this.field20.method590(3);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field16[var3];
                if (var12 >= 256 && var12 < 512 && !class68.field1633[var12 - 256].method572(false)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class32.method380(var12 - 512).method385(this.field27, false)) {
                    var2 = true;
                }
            }
            if (arg0 != -114) {
                throw new NullPointerException();
            } else if (var2) {
                return null;
            } else {
                class27[] var4 = new class27[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field16[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class27 var10 = class68.field1633[var9 - 256].method573(true);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class27 var11 = class32.method380(var9 - 512).method378(this.field27, true);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class27 var7 = new class27((byte) 6, var5, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field4[var8] != 0) {
                        var7.method336(client.field243[var8][0], client.field243[var8][this.field4[var8]]);
                        if (var8 == 1) {
                            var7.method336(client.field425[0], client.field425[this.field4[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }
}
