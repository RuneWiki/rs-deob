import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MVRUIIXW")
public class class36 extends class71 {

    @OriginalMember(owner = "client!MVRUIIXW", name = "tb", descriptor = "Z")
    public boolean field998 = false;

    @OriginalMember(owner = "client!MVRUIIXW", name = "vb", descriptor = "Z")
    private boolean field1000 = true;

    @OriginalMember(owner = "client!MVRUIIXW", name = "xb", descriptor = "I")
    private int field1002 = -289;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Ab", descriptor = "J")
    public long field1005 = -1L;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Bb", descriptor = "Z")
    private boolean field1006 = true;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Gb", descriptor = "I")
    private int field1011 = 5;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Hb", descriptor = "[I")
    public int[] field1012 = new int[5];

    @OriginalMember(owner = "client!MVRUIIXW", name = "Ib", descriptor = "I")
    public int field1013 = -1;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Jb", descriptor = "Z")
    private boolean field1014 = true;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Kb", descriptor = "I")
    public int field1015 = -1;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Qb", descriptor = "Z")
    public boolean field1021 = false;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Rb", descriptor = "[I")
    public int[] field1022 = new int[12];

    @OriginalMember(owner = "client!MVRUIIXW", name = "Ub", descriptor = "Z")
    private boolean field1025 = false;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Vb", descriptor = "Z")
    private boolean field1026 = true;

    @OriginalMember(owner = "client!MVRUIIXW", name = "zb", descriptor = "LACKKZISC;")
    public static class1 field1004 = new class1(false, 260);

    @OriginalMember(owner = "client!MVRUIIXW", name = "wb", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!MVRUIIXW", name = "yb", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Cb", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Db", descriptor = "I")
    public int field1008;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Eb", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Fb", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Lb", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Mb", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Nb", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Ob", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Sb", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!MVRUIIXW", name = "ob", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!MVRUIIXW", name = "pb", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "client!MVRUIIXW", name = "qb", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!MVRUIIXW", name = "rb", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Tb", descriptor = "J")
    public long field1024;

    @OriginalMember(owner = "client!MVRUIIXW", name = "Pb", descriptor = "LEKQCVRVG;")
    public class14 field1020;

    @OriginalMember(owner = "client!MVRUIIXW", name = "sb", descriptor = "LWRJMHIDY;")
    public class61 field997;

    @OriginalMember(owner = "client!MVRUIIXW", name = "ub", descriptor = "Ljava/lang/String;")
    public String field999;

    @OriginalMember(owner = "client!MVRUIIXW", name = "b", descriptor = "(I)LWRJMHIDY;")
    public final class61 method309(int arg0) {
        while (arg0 >= 0) {
            this.field1000 = !this.field1000;
        }
        if (!this.field1021) {
            return null;
        } else if (this.field1020 != null) {
            return this.field1020.method200(53);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1022[var3];
                if (var12 >= 256 && var12 < 512 && !class35.field986[var12 - 256].method307(-986)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class51.method433(var12 - 512).method437(3, this.field1001)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class61[] var4 = new class61[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1022[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class61 var10 = class35.field986[var9 - 256].method308(-911);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class61 var11 = class51.method433(var9 - 512).method428((byte) 2, this.field1001);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class61 var7 = new class61(var4, var5, this.field1014);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1012[var8] != 0) {
                        var7.method480(client.field146[var8][0], client.field146[var8][this.field1012[var8]]);
                        if (var8 == 1) {
                            var7.method480(client.field530[0], client.field530[this.field1012[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!MVRUIIXW", name = "a", descriptor = "(Z)LWRJMHIDY;")
    public final class61 method174(boolean arg0) {
        if (!this.field1021) {
            return null;
        } else {
            class61 var2 = this.method310(true);
            if (var2 == null) {
                return null;
            } else {
                super.field1730 = var2.field726;
                if (arg0) {
                    throw new NullPointerException();
                } else {
                    var2.field1479 = true;
                    if (this.field998) {
                        return var2;
                    } else {
                        if (super.field1736 != -1 && super.field1737 != -1) {
                            class55 var3 = class55.field1321[super.field1736];
                            class61 var4 = var3.method444();
                            if (var4 != null) {
                                class61 var5 = new class61(var4, true, false, class44.method338(super.field1737, (byte) 6), (byte) 0);
                                var5.method479(0, true, 0, -super.field1740);
                                var5.method473(39018);
                                var5.method474(false, var3.field1325.field965[super.field1737]);
                                var5.field1478 = null;
                                var5.field1477 = null;
                                if (var3.field1328 != 128 || var3.field1329 != 128) {
                                    var5.method482(this.field1026, var3.field1328, var3.field1328, var3.field1329);
                                }
                                var5.method483(var3.field1331 + 64, var3.field1332 + 850, -30, -50, -30, true);
                                class61[] var6 = new class61[] { var2, var5 };
                                var2 = new class61(-8047, true, 2, var6);
                            }
                        }
                        if (this.field997 != null) {
                            if (client.field399 >= this.field1019) {
                                this.field997 = null;
                            }
                            if (client.field399 >= this.field1018 && client.field399 < this.field1019) {
                                class61 var7 = this.field997;
                                var7.method479(this.field996 - super.field1703, true, this.field994 - super.field1702, this.field995 - this.field1023);
                                if (super.field1742 == 512) {
                                    var7.method477(1);
                                    var7.method477(1);
                                    var7.method477(1);
                                } else if (super.field1742 == 1024) {
                                    var7.method477(1);
                                    var7.method477(1);
                                } else if (super.field1742 == 1536) {
                                    var7.method477(1);
                                }
                                class61[] var8 = new class61[] { var2, var7 };
                                var2 = new class61(-8047, true, 2, var8);
                                if (super.field1742 == 512) {
                                    var7.method477(1);
                                } else if (super.field1742 == 1024) {
                                    var7.method477(1);
                                    var7.method477(1);
                                } else if (super.field1742 == 1536) {
                                    var7.method477(1);
                                    var7.method477(1);
                                    var7.method477(1);
                                }
                                var7.method479(super.field1703 - this.field996, true, super.field1702 - this.field994, this.field1023 - this.field995);
                            }
                        }
                        var2.field1479 = true;
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!MVRUIIXW", name = "b", descriptor = "(Z)LWRJMHIDY;")
    private final class61 method310(boolean arg0) {
        if (this.field1020 != null) {
            int var2 = -1;
            if (super.field1743 >= 0 && super.field1746 == 0) {
                var2 = class33.field963[super.field1743].field965[super.field1744];
            } else if (super.field1731 >= 0) {
                var2 = class33.field963[super.field1731].field965[super.field1732];
            }
            return this.field1020.method198(false, var2, -1, (int[]) null);
        } else {
            long var4 = this.field1024;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (!arg0) {
                throw new NullPointerException();
            } else {
                if (super.field1743 >= 0 && super.field1746 == 0) {
                    class33 var10 = class33.field963[super.field1743];
                    var6 = var10.field965[super.field1744];
                    if (super.field1731 >= 0 && super.field1731 != super.field1711) {
                        var7 = class33.field963[super.field1731].field965[super.field1732];
                    }
                    if (var10.field972 >= 0) {
                        var8 = var10.field972;
                        var4 += (long) (var8 - this.field1022[5] << 8);
                    }
                    if (var10.field973 >= 0) {
                        var9 = var10.field973;
                        var4 += (long) (var9 - this.field1022[3] << 16);
                    }
                } else if (super.field1731 >= 0) {
                    var6 = class33.field963[super.field1731].field965[super.field1732];
                }
                class61 var11 = (class61) field1004.method1(var4);
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field1022[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class35.field986[var14 - 256].method305(this.field1011)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class51.method433(var14 - 512).method431(this.field1001, 19340)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field1005 != -1L) {
                            var11 = (class61) field1004.method1(this.field1005);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class61[] var15 = new class61[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field1022[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class61 var20 = class35.field986[var19 - 256].method306(this.field1025);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class61 var21 = class51.method433(var19 - 512).method438(this.field1001, (byte) -50);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class61(var15, var16, this.field1014);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field1012[var18] != 0) {
                            var11.method480(client.field146[var18][0], client.field146[var18][this.field1012[var18]]);
                            if (var18 == 1) {
                                var11.method480(client.field530[0], client.field530[this.field1012[var18]]);
                            }
                        }
                    }
                    var11.method473(39018);
                    var11.method483(64, 850, -30, -50, -30, true);
                    field1004.method2(this.field1003, var4, var11);
                    this.field1005 = var4;
                }
                if (this.field998) {
                    return var11;
                } else {
                    class61 var22 = class61.field1442;
                    var22.method468(class44.method338(var6, (byte) 6) & class44.method338(var7, (byte) 6), var11, -104);
                    if (var6 != -1 && var7 != -1) {
                        var22.method475(0, var6, class33.field963[super.field1743].field969, var7);
                    } else if (var6 != -1) {
                        var22.method474(false, var6);
                    }
                    var22.method470(false);
                    var22.field1478 = null;
                    var22.field1477 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "client!MVRUIIXW", name = "a", descriptor = "(B)Z")
    public final boolean method228(byte arg0) {
        if (arg0 != 43) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field1021;
    }

    @OriginalMember(owner = "client!MVRUIIXW", name = "a", descriptor = "(LRSWRPCHR;Z)V")
    public final void method311(class50 arg0, boolean arg1) {
        arg0.field1225 = 0;
        this.field1001 = arg0.method388();
        this.field1013 = arg0.method389();
        if (arg1) {
            this.field1015 = arg0.method389();
            this.field1020 = null;
            this.field1016 = 0;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var4 = arg0.method388();
                if (var4 == 0) {
                    this.field1022[var3] = 0;
                } else {
                    int var5 = arg0.method388();
                    this.field1022[var3] = (var4 << 8) + var5;
                    if (var3 == 0 && this.field1022[0] == 65535) {
                        this.field1020 = class14.method199(arg0.method390());
                        break;
                    }
                    if (this.field1022[var3] >= 512 && this.field1022[var3] - 512 < class51.field1270) {
                        int var12 = class51.method433(this.field1022[var3] - 512).field1291;
                        if (var12 != 0) {
                            this.field1016 = var12;
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                int var11 = arg0.method388();
                if (var11 < 0 || var11 >= client.field146[var6].length) {
                    var11 = 0;
                }
                this.field1012[var6] = var11;
            }
            super.field1711 = arg0.method390();
            if (super.field1711 == 65535) {
                super.field1711 = -1;
            }
            super.field1712 = arg0.method390();
            if (super.field1712 == 65535) {
                super.field1712 = -1;
            }
            super.field1724 = arg0.method390();
            if (super.field1724 == 65535) {
                super.field1724 = -1;
            }
            super.field1725 = arg0.method390();
            if (super.field1725 == 65535) {
                super.field1725 = -1;
            }
            super.field1726 = arg0.method390();
            if (super.field1726 == 65535) {
                super.field1726 = -1;
            }
            super.field1727 = arg0.method390();
            if (super.field1727 == 65535) {
                super.field1727 = -1;
            }
            super.field1706 = arg0.method390();
            if (super.field1706 == 65535) {
                super.field1706 = -1;
            }
            this.field999 = class9.method172((byte) -32, class9.method169(false, arg0.method394(false)));
            this.field1017 = arg0.method388();
            this.field993 = arg0.method390();
            this.field1021 = true;
            this.field1024 = 0L;
            int var7 = this.field1022[5];
            int var8 = this.field1022[9];
            this.field1022[5] = var8;
            this.field1022[9] = var7;
            for (int var9 = 0; var9 < 12; ++var9) {
                this.field1024 <<= 4;
                if (this.field1022[var9] >= 256) {
                    this.field1024 += (long) (this.field1022[var9] - 256);
                }
            }
            if (this.field1022[0] >= 256) {
                this.field1024 += (long) (this.field1022[0] - 256 >> 4);
            }
            if (this.field1022[1] >= 256) {
                this.field1024 += (long) (this.field1022[1] - 256 >> 8);
            }
            this.field1022[5] = var7;
            this.field1022[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field1024 <<= 3;
                this.field1024 += (long) this.field1012[var10];
            }
            this.field1024 <<= 1;
            this.field1024 += (long) this.field1001;
        }
    }
}
