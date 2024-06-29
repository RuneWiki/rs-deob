import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IGCQCHAY")
public class class20 extends class47 {

    @OriginalMember(owner = "client!IGCQCHAY", name = "Ab", descriptor = "I")
    private int field775 = 42698;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Bb", descriptor = "Z")
    private boolean field776 = false;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Cb", descriptor = "[I")
    public int[] field777 = new int[5];

    @OriginalMember(owner = "client!IGCQCHAY", name = "Lb", descriptor = "Z")
    public boolean field786 = false;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Nb", descriptor = "Z")
    public boolean field788 = false;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Qb", descriptor = "[I")
    public int[] field791 = new int[12];

    @OriginalMember(owner = "client!IGCQCHAY", name = "Tb", descriptor = "J")
    public long field794 = -1L;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Ub", descriptor = "I")
    public int field795 = -1;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Vb", descriptor = "I")
    public int field796 = -1;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Wb", descriptor = "I")
    private int field797 = 8;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Rb", descriptor = "LQXKQGEKL;")
    public static class52 field792 = new class52(260, 5);

    @OriginalMember(owner = "client!IGCQCHAY", name = "ub", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!IGCQCHAY", name = "vb", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!IGCQCHAY", name = "wb", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!IGCQCHAY", name = "xb", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!IGCQCHAY", name = "yb", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Db", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Eb", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Fb", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Gb", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Hb", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Ib", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Jb", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Pb", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Sb", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Xb", descriptor = "I")
    private int field798;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Yb", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Ob", descriptor = "J")
    public long field789;

    @OriginalMember(owner = "client!IGCQCHAY", name = "zb", descriptor = "LNGYJLUVS;")
    public class37 field774;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Mb", descriptor = "LXDDMQHDR;")
    public class68 field787;

    @OriginalMember(owner = "client!IGCQCHAY", name = "Kb", descriptor = "Ljava/lang/String;")
    public String field785;

    @OriginalMember(owner = "client!IGCQCHAY", name = "a", descriptor = "(ZLRGCGKKUR;)V")
    public final void method226(boolean arg0, class53 arg1) {
        arg1.field1539 = 0;
        this.field779 = arg1.method455();
        this.field796 = arg1.method456();
        this.field795 = arg1.method456();
        this.field787 = null;
        this.field784 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method455();
            if (var4 == 0) {
                this.field791[var3] = 0;
            } else {
                int var5 = arg1.method455();
                this.field791[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field791[0] == 65535) {
                    this.field787 = class68.method585(arg1.method457());
                    break;
                }
                if (this.field791[var3] >= 512 && this.field791[var3] - 512 < class4.field54) {
                    int var13 = class4.method22(this.field791[var3] - 512).field55;
                    if (var13 != 0) {
                        this.field784 = var13;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var12 = arg1.method455();
            if (var12 < 0 || var12 >= client.field264[var6].length) {
                var12 = 0;
            }
            this.field777[var6] = var12;
        }
        super.field1402 = arg1.method457();
        if (super.field1402 == 65535) {
            super.field1402 = -1;
        }
        super.field1403 = arg1.method457();
        if (super.field1403 == 65535) {
            super.field1403 = -1;
        }
        super.field1406 = arg1.method457();
        if (super.field1406 == 65535) {
            super.field1406 = -1;
        }
        super.field1407 = arg1.method457();
        if (super.field1407 == 65535) {
            super.field1407 = -1;
        }
        super.field1408 = arg1.method457();
        if (super.field1408 == 65535) {
            super.field1408 = -1;
        }
        super.field1409 = arg1.method457();
        if (super.field1409 == 65535) {
            super.field1409 = -1;
        }
        super.field1365 = arg1.method457();
        if (super.field1365 == 65535) {
            super.field1365 = -1;
        }
        this.field785 = class55.method501(class55.method498(-39, arg1.method461(false)), false);
        this.field799 = arg1.method455();
        if (arg0) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        this.field790 = arg1.method457();
        this.field786 = true;
        this.field789 = 0L;
        int var8 = this.field791[5];
        int var9 = this.field791[9];
        this.field791[5] = var9;
        this.field791[9] = var8;
        for (int var10 = 0; var10 < 12; ++var10) {
            this.field789 <<= 4;
            if (this.field791[var10] >= 256) {
                this.field789 += (long) (this.field791[var10] - 256);
            }
        }
        if (this.field791[0] >= 256) {
            this.field789 += (long) (this.field791[0] - 256 >> 4);
        }
        if (this.field791[1] >= 256) {
            this.field789 += (long) (this.field791[1] - 256 >> 8);
        }
        this.field791[5] = var8;
        this.field791[9] = var9;
        for (int var11 = 0; var11 < 5; ++var11) {
            this.field789 <<= 3;
            this.field789 += (long) this.field777[var11];
        }
        this.field789 <<= 1;
        this.field789 += (long) this.field779;
    }

    @OriginalMember(owner = "client!IGCQCHAY", name = "c", descriptor = "(I)LNGYJLUVS;")
    private final class37 method227(int arg0) {
        if (arg0 != 4245) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field787 != null) {
            int var3 = -1;
            if (super.field1377 >= 0 && super.field1380 == 0) {
                var3 = class27.field849[super.field1377].field851[super.field1378];
            } else if (super.field1386 >= 0) {
                var3 = class27.field849[super.field1386].field851[super.field1387];
            }
            return this.field787.method584(-1, var3, this.field797, (int[]) null);
        } else {
            long var5 = this.field789;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            int var10 = -1;
            if (super.field1377 >= 0 && super.field1380 == 0) {
                class27 var11 = class27.field849[super.field1377];
                var7 = var11.field851[super.field1378];
                if (super.field1386 >= 0 && super.field1402 != super.field1386) {
                    var8 = class27.field849[super.field1386].field851[super.field1387];
                }
                if (var11.field858 >= 0) {
                    var9 = var11.field858;
                    var5 += (long) (var9 - this.field791[5] << 8);
                }
                if (var11.field859 >= 0) {
                    var10 = var11.field859;
                    var5 += (long) (var10 - this.field791[3] << 16);
                }
            } else if (super.field1386 >= 0) {
                var7 = class27.field849[super.field1386].field851[super.field1387];
            }
            class37 var12 = (class37) field792.method440(var5);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field791[var14];
                    if (var10 >= 0 && var14 == 3) {
                        var15 = var10;
                    }
                    if (var9 >= 0 && var14 == 5) {
                        var15 = var9;
                    }
                    if (var15 >= 256 && var15 < 512 && !class21.field805[var15 - 256].method232(827)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !class4.method22(var15 - 512).method18(this.field779, -948)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field794 != -1L) {
                        var12 = (class37) field792.method440(this.field794);
                    }
                    if (var12 == null) {
                        return null;
                    }
                }
            }
            if (var12 == null) {
                class37[] var16 = new class37[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field791[var18];
                    if (var10 >= 0 && var18 == 3) {
                        var20 = var10;
                    }
                    if (var9 >= 0 && var18 == 5) {
                        var20 = var9;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        class37 var21 = class21.field805[var20 - 256].method233(-15);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        class37 var22 = class4.method22(var20 - 512).method20((byte) -8, this.field779);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new class37(183, var16, var17);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field777[var19] != 0) {
                        var12.method305(client.field264[var19][0], client.field264[var19][this.field777[var19]]);
                        if (var19 == 1) {
                            var12.method305(client.field564[0], client.field564[this.field777[var19]]);
                        }
                    }
                }
                var12.method298(false);
                var12.method308(64, 850, -30, -50, -30, true);
                field792.method441(var5, var12, -501);
                this.field794 = var5;
            }
            if (this.field788) {
                return var12;
            } else {
                class37 var23 = class37.field991;
                var23.method293(class49.method428((byte) 9, var7) & class49.method428((byte) 9, var8), var12, 0);
                if (var7 != -1 && var8 != -1) {
                    var23.method300(var8, this.field775, var7, class27.field849[super.field1377].field855);
                } else if (var7 != -1) {
                    var23.method299(var7, 0);
                }
                var23.method295(this.field776);
                var23.field1027 = null;
                var23.field1026 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "client!IGCQCHAY", name = "d", descriptor = "(I)LNGYJLUVS;")
    public final class37 method228(int arg0) {
        if (!this.field786) {
            return null;
        } else if (this.field787 != null) {
            return this.field787.method587(this.field798);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field791[var3];
                if (var12 >= 256 && var12 < 512 && !class21.field805[var12 - 256].method234(2)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class4.method22(var12 - 512).method21(this.field779, false)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class37[] var4 = new class37[12];
                int var5 = 0;
                if (arg0 != 0) {
                    this.field797 = 388;
                }
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field791[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class37 var10 = class21.field805[var9 - 256].method235((byte) 38);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class37 var11 = class4.method22(var9 - 512).method24(5, this.field779);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class37 var7 = new class37(183, var4, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field777[var8] != 0) {
                        var7.method305(client.field264[var8][0], client.field264[var8][this.field777[var8]]);
                        if (var8 == 1) {
                            var7.method305(client.field564[0], client.field564[this.field777[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!IGCQCHAY", name = "a", descriptor = "(I)LNGYJLUVS;")
    public final class37 method206(int arg0) {
        if (!this.field786) {
            return null;
        } else {
            class37 var2 = this.method227(4245);
            if (arg0 != -12617) {
                this.field778 = -306;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1368 = var2.field972;
                var2.field1028 = true;
                if (this.field788) {
                    return var2;
                } else {
                    if (super.field1359 != -1 && super.field1360 != -1) {
                        class13 var3 = class13.field688[super.field1359];
                        class37 var4 = var3.method210();
                        if (var4 != null) {
                            class37 var5 = new class37(class49.method428((byte) 9, super.field1360), true, true, var4, false);
                            var5.method304(0, -super.field1363, (byte) 1, 0);
                            var5.method298(false);
                            var5.method299(var3.field692.field851[super.field1360], 0);
                            var5.field1027 = null;
                            var5.field1026 = null;
                            if (var3.field695 != 128 || var3.field696 != 128) {
                                var5.method307(var3.field695, true, var3.field695, var3.field696);
                            }
                            var5.method308(var3.field698 + 64, var3.field699 + 850, -30, -50, -30, true);
                            class37[] var6 = new class37[] { var2, var5 };
                            var2 = new class37(-426, 2, true, var6);
                        }
                    }
                    if (this.field774 != null) {
                        if (client.field247 >= this.field770) {
                            this.field774 = null;
                        }
                        if (client.field247 >= this.field769 && client.field247 < this.field770) {
                            class37 var7 = this.field774;
                            var7.method304(this.field771 - super.field1383, this.field772 - this.field793, (byte) 1, this.field773 - super.field1384);
                            if (super.field1389 == 512) {
                                var7.method302(-54);
                                var7.method302(-54);
                                var7.method302(-54);
                            } else if (super.field1389 == 1024) {
                                var7.method302(-54);
                                var7.method302(-54);
                            } else if (super.field1389 == 1536) {
                                var7.method302(-54);
                            }
                            class37[] var8 = new class37[] { var2, var7 };
                            var2 = new class37(-426, 2, true, var8);
                            if (super.field1389 == 512) {
                                var7.method302(-54);
                            } else if (super.field1389 == 1024) {
                                var7.method302(-54);
                                var7.method302(-54);
                            } else if (super.field1389 == 1536) {
                                var7.method302(-54);
                                var7.method302(-54);
                                var7.method302(-54);
                            }
                            var7.method304(super.field1383 - this.field771, this.field793 - this.field772, (byte) 1, super.field1384 - this.field773);
                        }
                    }
                    var2.field1028 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!IGCQCHAY", name = "a", descriptor = "(Z)Z")
    public final boolean method229(boolean arg0) {
        if (!arg0) {
            this.field775 = 70;
        }
        return this.field786;
    }
}
