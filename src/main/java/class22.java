import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GPPDQFCV")
public class class22 extends class61 {

    @OriginalMember(owner = "GPPDQFCV", name = "sb", descriptor = "I")
    private int field954 = 1;

    @OriginalMember(owner = "GPPDQFCV", name = "Bb", descriptor = "I")
    private int field963 = -130;

    @OriginalMember(owner = "GPPDQFCV", name = "Cb", descriptor = "Z")
    public boolean field964 = false;

    @OriginalMember(owner = "GPPDQFCV", name = "Ib", descriptor = "Z")
    public boolean field970 = false;

    @OriginalMember(owner = "GPPDQFCV", name = "Jb", descriptor = "J")
    public long field971 = -1L;

    @OriginalMember(owner = "GPPDQFCV", name = "Mb", descriptor = "[I")
    public int[] field974 = new int[5];

    @OriginalMember(owner = "GPPDQFCV", name = "Nb", descriptor = "[I")
    public int[] field975 = new int[12];

    @OriginalMember(owner = "GPPDQFCV", name = "Kb", descriptor = "LASORKPAH;")
    public static class2 field972 = new class2(48975, 260);

    @OriginalMember(owner = "GPPDQFCV", name = "qb", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "GPPDQFCV", name = "ub", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "GPPDQFCV", name = "vb", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "GPPDQFCV", name = "wb", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "GPPDQFCV", name = "xb", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "GPPDQFCV", name = "yb", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "GPPDQFCV", name = "zb", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "GPPDQFCV", name = "Ab", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "GPPDQFCV", name = "Db", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "GPPDQFCV", name = "Eb", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "GPPDQFCV", name = "Fb", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "GPPDQFCV", name = "Gb", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "GPPDQFCV", name = "Ob", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "GPPDQFCV", name = "Pb", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "GPPDQFCV", name = "Qb", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "GPPDQFCV", name = "tb", descriptor = "J")
    public long field955;

    @OriginalMember(owner = "GPPDQFCV", name = "Hb", descriptor = "LGFYXEFQY;")
    public class21 field969;

    @OriginalMember(owner = "GPPDQFCV", name = "rb", descriptor = "LBXXPAJNW;")
    public class4 field953;

    @OriginalMember(owner = "GPPDQFCV", name = "Lb", descriptor = "Ljava/lang/String;")
    public String field973;

    @OriginalMember(owner = "GPPDQFCV", name = "a", descriptor = "(B)LGFYXEFQY;")
    public final class21 method366(byte arg0) {
        if (!this.field970) {
            return null;
        } else if (this.field953 != null) {
            return this.field953.method25(21774);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field975[var3];
                if (var12 >= 256 && var12 < 512 && !class29.field1052[var12 - 256].method386((byte) -45)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class52.method489(var12 - 512).method488(this.field960, (byte) 4)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class21[] var4 = new class21[12];
                int var5 = 0;
                if (arg0 != -1) {
                    throw new NullPointerException();
                } else {
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field975[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class21 var10 = class29.field1052[var9 - 256].method387((byte) -87);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class21 var11 = class52.method489(var9 - 512).method497(this.field960, (byte) 4);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class21 var7 = new class21(var4, 3729, var5);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field974[var8] != 0) {
                            var7.method355(client.field531[var8][0], client.field531[var8][this.field974[var8]]);
                            if (var8 == 1) {
                                var7.method355(client.field416[0], client.field416[this.field974[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "GPPDQFCV", name = "a", descriptor = "(I)LGFYXEFQY;")
    public final class21 method294(int arg0) {
        if (!this.field970) {
            return null;
        } else {
            class21 var2 = this.method369(-130);
            if (arg0 <= 0) {
                throw new NullPointerException();
            } else if (var2 == null) {
                return null;
            } else {
                super.field1569 = var2.field848;
                var2.field918 = true;
                if (this.field964) {
                    return var2;
                } else {
                    if (super.field1536 != -1 && super.field1537 != -1) {
                        class63 var3 = class63.field1588[super.field1536];
                        class21 var4 = var3.method564();
                        if (var4 != null) {
                            class21 var5 = new class21((byte) 72, class14.method282(super.field1537, false), var4, true, false);
                            var5.method354(29182, 0, -super.field1540, 0);
                            var5.method348(false);
                            var5.method349(90, var3.field1592.field1197[super.field1537]);
                            var5.field917 = null;
                            var5.field916 = null;
                            if (var3.field1595 != 128 || var3.field1596 != 128) {
                                var5.method357((byte) -10, var3.field1595, var3.field1595, var3.field1596);
                            }
                            var5.method358(var3.field1598 + 64, var3.field1599 + 850, -30, -50, -30, true);
                            class21[] var6 = new class21[] { var2, var5 };
                            var2 = new class21(true, 2, var6, this.field954);
                        }
                    }
                    if (this.field969 != null) {
                        if (client.field329 >= this.field977) {
                            this.field969 = null;
                        }
                        if (client.field329 >= this.field976 && client.field329 < this.field977) {
                            class21 var7 = this.field969;
                            var7.method354(29182, this.field966 - super.field1570, this.field967 - this.field961, this.field968 - super.field1571);
                            if (super.field1550 == 512) {
                                var7.method352((byte) -119);
                                var7.method352((byte) -119);
                                var7.method352((byte) -119);
                            } else if (super.field1550 == 1024) {
                                var7.method352((byte) -119);
                                var7.method352((byte) -119);
                            } else if (super.field1550 == 1536) {
                                var7.method352((byte) -119);
                            }
                            class21[] var8 = new class21[] { var2, var7 };
                            var2 = new class21(true, 2, var8, this.field954);
                            if (super.field1550 == 512) {
                                var7.method352((byte) -119);
                            } else if (super.field1550 == 1024) {
                                var7.method352((byte) -119);
                                var7.method352((byte) -119);
                            } else if (super.field1550 == 1536) {
                                var7.method352((byte) -119);
                                var7.method352((byte) -119);
                                var7.method352((byte) -119);
                            }
                            var7.method354(29182, super.field1570 - this.field966, this.field961 - this.field967, super.field1571 - this.field968);
                        }
                    }
                    var2.field918 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "GPPDQFCV", name = "a", descriptor = "(LCKBTFRZM;I)V")
    public final void method367(class5 arg0, int arg1) {
        arg0.field123 = 0;
        this.field960 = arg0.method44();
        if (arg1 < 0) {
            this.field952 = arg0.method44();
            this.field953 = null;
            this.field978 = 0;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var4 = arg0.method44();
                if (var4 == 0) {
                    this.field975[var3] = 0;
                } else {
                    int var5 = arg0.method44();
                    this.field975[var3] = (var4 << 8) + var5;
                    if (var3 == 0 && this.field975[0] == 65535) {
                        this.field953 = class4.method31(arg0.method46());
                        break;
                    }
                    if (this.field975[var3] >= 512 && this.field975[var3] - 512 < class52.field1323) {
                        int var10 = class52.method489(this.field975[var3] - 512).field1327;
                        if (var10 != 0) {
                            this.field978 = var10;
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                int var9 = arg0.method44();
                if (var9 < 0 || var9 >= client.field531[var6].length) {
                    var9 = 0;
                }
                this.field974[var6] = var9;
            }
            super.field1525 = arg0.method46();
            if (super.field1525 == 65535) {
                super.field1525 = -1;
            }
            super.field1526 = arg0.method46();
            if (super.field1526 == 65535) {
                super.field1526 = -1;
            }
            super.field1576 = arg0.method46();
            if (super.field1576 == 65535) {
                super.field1576 = -1;
            }
            super.field1577 = arg0.method46();
            if (super.field1577 == 65535) {
                super.field1577 = -1;
            }
            super.field1578 = arg0.method46();
            if (super.field1578 == 65535) {
                super.field1578 = -1;
            }
            super.field1579 = arg0.method46();
            if (super.field1579 == 65535) {
                super.field1579 = -1;
            }
            super.field1556 = arg0.method46();
            if (super.field1556 == 65535) {
                super.field1556 = -1;
            }
            this.field973 = class31.method392(class31.method389((byte) -71, arg0.method50(0)), false);
            this.field962 = arg0.method44();
            this.field965 = arg0.method46();
            this.field970 = true;
            this.field955 = 0L;
            for (int var7 = 0; var7 < 12; ++var7) {
                this.field955 <<= 4;
                if (this.field975[var7] >= 256) {
                    this.field955 += (long) (this.field975[var7] - 256);
                }
            }
            if (this.field975[0] >= 256) {
                this.field955 += (long) (this.field975[0] - 256 >> 4);
            }
            if (this.field975[1] >= 256) {
                this.field955 += (long) (this.field975[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field955 <<= 3;
                this.field955 += (long) this.field974[var8];
            }
            this.field955 <<= 1;
            this.field955 += (long) this.field960;
        }
    }

    @OriginalMember(owner = "GPPDQFCV", name = "b", descriptor = "(I)Z")
    public final boolean method368(int arg0) {
        if (arg0 != -32976) {
            throw new NullPointerException();
        } else {
            return this.field970;
        }
    }

    @OriginalMember(owner = "GPPDQFCV", name = "d", descriptor = "(I)LGFYXEFQY;")
    private final class21 method369(int arg0) {
        if (this.field953 != null) {
            int var2 = -1;
            if (super.field1542 >= 0 && super.field1545 == 0) {
                var2 = class39.field1195[super.field1542].field1197[super.field1543];
            } else if (super.field1573 >= 0) {
                var2 = class39.field1195[super.field1573].field1197[super.field1574];
            }
            return this.field953.method26((byte) 5, var2, -1, (int[]) null);
        } else {
            long var4 = this.field955;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1542 >= 0 && super.field1545 == 0) {
                class39 var10 = class39.field1195[super.field1542];
                var6 = var10.field1197[super.field1543];
                if (super.field1573 >= 0 && super.field1573 != super.field1525) {
                    var7 = class39.field1195[super.field1573].field1197[super.field1574];
                }
                if (var10.field1204 >= 0) {
                    var8 = var10.field1204;
                    var4 += (long) (var8 - this.field975[5] << 8);
                }
                if (var10.field1205 >= 0) {
                    var9 = var10.field1205;
                    var4 += (long) (var9 - this.field975[3] << 16);
                }
            } else if (super.field1573 >= 0) {
                var6 = class39.field1195[super.field1573].field1197[super.field1574];
            }
            class21 var11 = (class21) field972.method1(var4);
            if (arg0 >= 0) {
                throw new NullPointerException();
            } else {
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field975[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class29.field1052[var14 - 256].method384(0)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class52.method489(var14 - 512).method500(0, this.field960)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field971 != -1L) {
                            var11 = (class21) field972.method1(this.field971);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class21[] var15 = new class21[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field975[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class21 var20 = class29.field1052[var19 - 256].method385(-630);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class21 var21 = class52.method489(var19 - 512).method495(this.field960, (byte) -17);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class21(var15, 3729, var16);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field974[var18] != 0) {
                            var11.method355(client.field531[var18][0], client.field531[var18][this.field974[var18]]);
                            if (var18 == 1) {
                                var11.method355(client.field416[0], client.field416[this.field974[var18]]);
                            }
                        }
                    }
                    var11.method348(false);
                    var11.method358(64, 850, -30, -50, -30, true);
                    field972.method2(23574, var4, var11);
                    this.field971 = var4;
                }
                if (this.field964) {
                    return var11;
                } else {
                    class21 var22 = class21.field880;
                    var22.method343(0, class14.method282(var6, false) & class14.method282(var7, false), var11);
                    if (var6 != -1 && var7 != -1) {
                        var22.method350(class39.field1195[super.field1542].field1201, var6, 0, var7);
                    } else if (var6 != -1) {
                        var22.method349(90, var6);
                    }
                    var22.method345(0);
                    var22.field917 = null;
                    var22.field916 = null;
                    return var22;
                }
            }
        }
    }
}
