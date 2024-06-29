import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IOPHRJNF")
public class class22 extends class20 {

    @OriginalMember(owner = "client!IOPHRJNF", name = "ub", descriptor = "I")
    public int field930 = -1;

    @OriginalMember(owner = "client!IOPHRJNF", name = "wb", descriptor = "I")
    private int field932 = 122;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Bb", descriptor = "B")
    private byte field937 = 7;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Cb", descriptor = "I")
    public int field938 = -1;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Db", descriptor = "[I")
    public int[] field939 = new int[12];

    @OriginalMember(owner = "client!IOPHRJNF", name = "Eb", descriptor = "J")
    public long field940 = -1L;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Lb", descriptor = "Z")
    public boolean field947 = false;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Mb", descriptor = "[I")
    public int[] field948 = new int[5];

    @OriginalMember(owner = "client!IOPHRJNF", name = "Qb", descriptor = "Z")
    public boolean field952 = false;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Tb", descriptor = "I")
    private int field955 = -347;

    @OriginalMember(owner = "client!IOPHRJNF", name = "sb", descriptor = "LRYXFUVWJ;")
    public static class48 field928 = new class48(260, -268);

    @OriginalMember(owner = "client!IOPHRJNF", name = "rb", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!IOPHRJNF", name = "tb", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!IOPHRJNF", name = "vb", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!IOPHRJNF", name = "xb", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!IOPHRJNF", name = "yb", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!IOPHRJNF", name = "zb", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Hb", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Ib", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Jb", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Kb", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Nb", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Ob", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Pb", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Sb", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Ub", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Gb", descriptor = "J")
    public long field942;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Fb", descriptor = "LSHKUIFHF;")
    public class49 field941;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Ab", descriptor = "LXBVYIDUH;")
    public class65 field936;

    @OriginalMember(owner = "client!IOPHRJNF", name = "Rb", descriptor = "Ljava/lang/String;")
    public String field953;

    @OriginalMember(owner = "client!IOPHRJNF", name = "b", descriptor = "(Z)LXBVYIDUH;")
    private final class65 method319(boolean arg0) {
        if (!arg0) {
            this.field955 = -33;
        }
        if (this.field941 != null) {
            int var2 = -1;
            if (super.field869 >= 0 && super.field872 == 0) {
                var2 = class50.field1392[super.field869].field1394[super.field870];
            } else if (super.field880 >= 0) {
                var2 = class50.field1392[super.field880].field1394[super.field881];
            }
            return this.field941.method502(-1, 1, var2, (int[]) null);
        } else {
            long var4 = this.field942;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field869 >= 0 && super.field872 == 0) {
                class50 var10 = class50.field1392[super.field869];
                var6 = var10.field1394[super.field870];
                if (super.field880 >= 0 && super.field880 != super.field862) {
                    var7 = class50.field1392[super.field880].field1394[super.field881];
                }
                if (var10.field1401 >= 0) {
                    var8 = var10.field1401;
                    var4 += (long) (var8 - this.field939[5] << 8);
                }
                if (var10.field1402 >= 0) {
                    var9 = var10.field1402;
                    var4 += (long) (var9 - this.field939[3] << 16);
                }
            } else if (super.field880 >= 0) {
                var6 = class50.field1392[super.field880].field1394[super.field881];
            }
            class65 var11 = (class65) field928.method495(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field939[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class39.field1112[var14 - 256].method365(-422)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class45.method456(var14 - 512).method460(0, this.field954)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field940 != -1L) {
                        var11 = (class65) field928.method495(this.field940);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class65[] var15 = new class65[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field939[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class65 var20 = class39.field1112[var19 - 256].method366((byte) 107);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class65 var21 = class45.method456(var19 - 512).method450((byte) 0, this.field954);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class65(var15, 273, var16);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field948[var18] != 0) {
                        var11.method555(client.field615[var18][0], client.field615[var18][this.field948[var18]]);
                        if (var18 == 1) {
                            var11.method555(client.field315[0], client.field315[this.field948[var18]]);
                        }
                    }
                }
                var11.method548((byte) 77);
                var11.method558(64, 850, -30, -50, -30, true);
                field928.method496(true, var11, var4);
                this.field940 = var4;
            }
            if (this.field947) {
                return var11;
            } else {
                class65 var22 = class65.field1591;
                var22.method543(-906, var11, class6.method115(this.field937, var6) & class6.method115(this.field937, var7));
                if (var6 != -1 && var7 != -1) {
                    var22.method550(var7, -648, var6, class50.field1392[super.field869].field1398);
                } else if (var6 != -1) {
                    var22.method549(true, var6);
                }
                var22.method545(3);
                var22.field1627 = null;
                var22.field1626 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "client!IOPHRJNF", name = "a", descriptor = "(B)LXBVYIDUH;")
    public final class65 method39(byte arg0) {
        if (!this.field952) {
            return null;
        } else {
            class65 var2 = this.method319(true);
            if (var2 == null) {
                return null;
            } else {
                super.field918 = var2.field1025;
                if (arg0 == 3) {
                    boolean var3 = false;
                    var2.field1628 = true;
                    if (this.field947) {
                        return var2;
                    } else {
                        if (super.field888 != -1 && super.field889 != -1) {
                            class9 var4 = class9.field662[super.field888];
                            class65 var5 = var4.method299();
                            if (var5 != null) {
                                class65 var6 = new class65(class6.method115(this.field937, super.field889), (byte) 9, true, false, var5);
                                var6.method554(0, 0, 0, -super.field892);
                                var6.method548((byte) 77);
                                var6.method549(true, var4.field666.field1394[super.field889]);
                                var6.field1627 = null;
                                var6.field1626 = null;
                                if (var4.field669 != 128 || var4.field670 != 128) {
                                    var6.method557(0, var4.field670, var4.field669, var4.field669);
                                }
                                var6.method558(var4.field672 + 64, var4.field673 + 850, -30, -50, -30, true);
                                class65[] var7 = new class65[] { var2, var6 };
                                var2 = new class65(true, 2, var7, false);
                            }
                        }
                        if (this.field936 != null) {
                            if (client.field564 >= this.field951) {
                                this.field936 = null;
                            }
                            if (client.field564 >= this.field950 && client.field564 < this.field951) {
                                class65 var8 = this.field936;
                                var8.method554(this.field935 - super.field885, 0, this.field933 - super.field884, this.field934 - this.field929);
                                if (super.field903 == 512) {
                                    var8.method552(216);
                                    var8.method552(216);
                                    var8.method552(216);
                                } else if (super.field903 == 1024) {
                                    var8.method552(216);
                                    var8.method552(216);
                                } else if (super.field903 == 1536) {
                                    var8.method552(216);
                                }
                                class65[] var9 = new class65[] { var2, var8 };
                                var2 = new class65(true, 2, var9, false);
                                if (super.field903 == 512) {
                                    var8.method552(216);
                                } else if (super.field903 == 1024) {
                                    var8.method552(216);
                                    var8.method552(216);
                                } else if (super.field903 == 1536) {
                                    var8.method552(216);
                                    var8.method552(216);
                                    var8.method552(216);
                                }
                                var8.method554(super.field885 - this.field935, 0, super.field884 - this.field933, this.field929 - this.field934);
                            }
                        }
                        var2.field1628 = true;
                        return var2;
                    }
                } else {
                    throw new NullPointerException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!IOPHRJNF", name = "c", descriptor = "(Z)LXBVYIDUH;")
    public final class65 method320(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field952) {
            return null;
        } else if (this.field941 != null) {
            return this.field941.method499((byte) 44);
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < 12; ++var4) {
                int var13 = this.field939[var4];
                if (var13 >= 256 && var13 < 512 && !class39.field1112[var13 - 256].method367(-8240)) {
                    var3 = true;
                }
                if (var13 >= 512 && !class45.method456(var13 - 512).method455((byte) 2, this.field954)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            } else {
                class65[] var5 = new class65[12];
                int var6 = 0;
                for (int var7 = 0; var7 < 12; ++var7) {
                    int var10 = this.field939[var7];
                    if (var10 >= 256 && var10 < 512) {
                        class65 var11 = class39.field1112[var10 - 256].method368(this.field949);
                        if (var11 != null) {
                            var5[var6++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class65 var12 = class45.method456(var10 - 512).method448(this.field954, 2);
                        if (var12 != null) {
                            var5[var6++] = var12;
                        }
                    }
                }
                class65 var8 = new class65(var5, 273, var6);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field948[var9] != 0) {
                        var8.method555(client.field615[var9][0], client.field615[var9][this.field948[var9]]);
                        if (var9 == 1) {
                            var8.method555(client.field315[0], client.field315[this.field948[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!IOPHRJNF", name = "a", descriptor = "(I)Z")
    public final boolean method41(int arg0) {
        int var2 = 16 / arg0;
        return this.field952;
    }

    @OriginalMember(owner = "client!IOPHRJNF", name = "a", descriptor = "(BLBFQIDHPO;)V")
    public final void method321(byte arg0, class3 arg1) {
        arg1.field50 = 0;
        this.field954 = arg1.method54();
        this.field930 = arg1.method55();
        this.field938 = arg1.method55();
        this.field941 = null;
        this.field927 = 0;
        if (arg0 == 5) {
            for (int var3 = 0; var3 < 12; ++var3) {
                int var4 = arg1.method54();
                if (var4 == 0) {
                    this.field939[var3] = 0;
                } else {
                    int var5 = arg1.method54();
                    this.field939[var3] = (var4 << 8) + var5;
                    if (var3 == 0 && this.field939[0] == 65535) {
                        this.field941 = class49.method501(arg1.method56());
                        break;
                    }
                    if (this.field939[var3] >= 512 && this.field939[var3] - 512 < class45.field1287) {
                        int var12 = class45.method456(this.field939[var3] - 512).field1270;
                        if (var12 != 0) {
                            this.field927 = var12;
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                int var11 = arg1.method54();
                if (var11 < 0 || var11 >= client.field615[var6].length) {
                    var11 = 0;
                }
                this.field948[var6] = var11;
            }
            super.field862 = arg1.method56();
            if (super.field862 == 65535) {
                super.field862 = -1;
            }
            super.field863 = arg1.method56();
            if (super.field863 == 65535) {
                super.field863 = -1;
            }
            super.field864 = arg1.method56();
            if (super.field864 == 65535) {
                super.field864 = -1;
            }
            super.field865 = arg1.method56();
            if (super.field865 == 65535) {
                super.field865 = -1;
            }
            super.field866 = arg1.method56();
            if (super.field866 == 65535) {
                super.field866 = -1;
            }
            super.field867 = arg1.method56();
            if (super.field867 == 65535) {
                super.field867 = -1;
            }
            super.field907 = arg1.method56();
            if (super.field907 == 65535) {
                super.field907 = -1;
            }
            this.field953 = class29.method327(class29.method324(true, arg1.method60(true)), (byte) 58);
            this.field956 = arg1.method54();
            this.field931 = arg1.method56();
            this.field952 = true;
            this.field942 = 0L;
            int var7 = this.field939[5];
            int var8 = this.field939[9];
            this.field939[5] = var8;
            this.field939[9] = var7;
            for (int var9 = 0; var9 < 12; ++var9) {
                this.field942 <<= 4;
                if (this.field939[var9] >= 256) {
                    this.field942 += (long) (this.field939[var9] - 256);
                }
            }
            if (this.field939[0] >= 256) {
                this.field942 += (long) (this.field939[0] - 256 >> 4);
            }
            if (this.field939[1] >= 256) {
                this.field942 += (long) (this.field939[1] - 256 >> 8);
            }
            this.field939[5] = var7;
            this.field939[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field942 <<= 3;
                this.field942 += (long) this.field948[var10];
            }
            this.field942 <<= 1;
            this.field942 += (long) this.field954;
        }
    }
}
