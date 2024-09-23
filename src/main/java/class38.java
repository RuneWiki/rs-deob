import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LAKHMHBY")
public class class38 extends class50 {

    @OriginalMember(owner = "LAKHMHBY", name = "sb", descriptor = "Z")
    public boolean field1092 = false;

    @OriginalMember(owner = "LAKHMHBY", name = "vb", descriptor = "[I")
    public int[] field1095 = new int[12];

    @OriginalMember(owner = "LAKHMHBY", name = "yb", descriptor = "J")
    public long field1098 = -1L;

    @OriginalMember(owner = "LAKHMHBY", name = "Jb", descriptor = "I")
    private int field1109 = 50;

    @OriginalMember(owner = "LAKHMHBY", name = "Nb", descriptor = "[I")
    public int[] field1113 = new int[5];

    @OriginalMember(owner = "LAKHMHBY", name = "Pb", descriptor = "Z")
    public boolean field1115 = false;

    @OriginalMember(owner = "LAKHMHBY", name = "wb", descriptor = "LHPFNYARJ;")
    public static class25 field1096 = new class25((byte) 41, 260);

    @OriginalMember(owner = "LAKHMHBY", name = "qb", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "LAKHMHBY", name = "rb", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "LAKHMHBY", name = "tb", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "LAKHMHBY", name = "ub", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "LAKHMHBY", name = "zb", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "LAKHMHBY", name = "Ab", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "LAKHMHBY", name = "Bb", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "LAKHMHBY", name = "Cb", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "LAKHMHBY", name = "Db", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "LAKHMHBY", name = "Eb", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "LAKHMHBY", name = "Fb", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "LAKHMHBY", name = "Gb", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "LAKHMHBY", name = "Ib", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "LAKHMHBY", name = "Kb", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "LAKHMHBY", name = "Lb", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "LAKHMHBY", name = "Mb", descriptor = "J")
    public long field1112;

    @OriginalMember(owner = "LAKHMHBY", name = "xb", descriptor = "LHQFMWUSH;")
    public class26 field1097;

    @OriginalMember(owner = "LAKHMHBY", name = "Hb", descriptor = "LKPUOCBCE;")
    public class35 field1107;

    @OriginalMember(owner = "LAKHMHBY", name = "Ob", descriptor = "Ljava/lang/String;")
    public String field1114;

    @OriginalMember(owner = "LAKHMHBY", name = "b", descriptor = "(I)Z")
    public final boolean method12(int arg0) {
        if (arg0 != 0) {
            this.field1109 = -175;
        }
        return this.field1092;
    }

    @OriginalMember(owner = "LAKHMHBY", name = "b", descriptor = "(B)LKPUOCBCE;")
    public final class35 method408(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
            if (!this.field1092) {
                return null;
            } else if (this.field1097 != null) {
                return this.field1097.method307(false);
            } else {
                boolean var3 = false;
                for (int var4 = 0; var4 < 12; ++var4) {
                    int var13 = this.field1095[var4];
                    if (var13 >= 256 && var13 < 512 && !class43.field1177[var13 - 256].method421((byte) 4)) {
                        var3 = true;
                    }
                    if (var13 >= 512 && !class24.method293(var13 - 512).method291(0, this.field1103)) {
                        var3 = true;
                    }
                }
                if (var3) {
                    return null;
                } else {
                    class35[] var5 = new class35[12];
                    int var6 = 0;
                    for (int var7 = 0; var7 < 12; ++var7) {
                        int var10 = this.field1095[var7];
                        if (var10 >= 256 && var10 < 512) {
                            class35 var11 = class43.field1177[var10 - 256].method422(10940);
                            if (var11 != null) {
                                var5[var6++] = var11;
                            }
                        }
                        if (var10 >= 512) {
                            class35 var12 = class24.method293(var10 - 512).method297(this.field1103, (byte) -88);
                            if (var12 != null) {
                                var5[var6++] = var12;
                            }
                        }
                    }
                    class35 var8 = new class35(false, var6, var5);
                    for (int var9 = 0; var9 < 5; ++var9) {
                        if (this.field1113[var9] != 0) {
                            var8.method393(client.field83[var9][0], client.field83[var9][this.field1113[var9]]);
                            if (var9 == 1) {
                                var8.method393(client.field240[0], client.field240[this.field1113[var9]]);
                            }
                        }
                    }
                    return var8;
                }
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "LAKHMHBY", name = "a", descriptor = "(I)LKPUOCBCE;")
    public final class35 method11(int arg0) {
        if (!this.field1092) {
            return null;
        } else {
            class35 var2 = this.method409(0);
            if (var2 == null) {
                return null;
            } else {
                super.field1325 = var2.field1593;
                var2.field1043 = true;
                if (this.field1115) {
                    return var2;
                } else {
                    if (super.field1336 != -1 && super.field1337 != -1) {
                        class21 var3 = class21.field703[super.field1336];
                        class35 var4 = var3.method231();
                        if (var4 != null) {
                            class35 var5 = new class35(class71.method585(super.field1337, 2), false, var4, true, 271);
                            var5.method392(0, 0, -super.field1340, 340);
                            var5.method386(9);
                            var5.method387(var3.field707.field1160[super.field1337], -599);
                            var5.field1042 = null;
                            var5.field1041 = null;
                            if (var3.field710 != 128 || var3.field711 != 128) {
                                var5.method395(-49478, var3.field710, var3.field711, var3.field710);
                            }
                            var5.method396(var3.field713 + 64, var3.field714 + 850, -30, -50, -30, true);
                            class35[] var6 = new class35[] { var2, var5 };
                            var2 = new class35(true, var6, 2, 1);
                        }
                    }
                    if (this.field1107 != null) {
                        if (client.field487 >= this.field1094) {
                            this.field1107 = null;
                        }
                        if (client.field487 >= this.field1093 && client.field487 < this.field1094) {
                            class35 var7 = this.field1107;
                            var7.method392(this.field1106 - super.field1327, this.field1104 - super.field1326, this.field1105 - this.field1111, 340);
                            if (super.field1370 == 512) {
                                var7.method390((byte) 4);
                                var7.method390((byte) 4);
                                var7.method390((byte) 4);
                            } else if (super.field1370 == 1024) {
                                var7.method390((byte) 4);
                                var7.method390((byte) 4);
                            } else if (super.field1370 == 1536) {
                                var7.method390((byte) 4);
                            }
                            class35[] var8 = new class35[] { var2, var7 };
                            var2 = new class35(true, var8, 2, 1);
                            if (super.field1370 == 512) {
                                var7.method390((byte) 4);
                            } else if (super.field1370 == 1024) {
                                var7.method390((byte) 4);
                                var7.method390((byte) 4);
                            } else if (super.field1370 == 1536) {
                                var7.method390((byte) 4);
                                var7.method390((byte) 4);
                                var7.method390((byte) 4);
                            }
                            var7.method392(super.field1327 - this.field1106, super.field1326 - this.field1104, this.field1111 - this.field1105, 340);
                        }
                    }
                    var2.field1043 = true;
                    if (arg0 != 8) {
                        throw new NullPointerException();
                    } else {
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "LAKHMHBY", name = "c", descriptor = "(I)LKPUOCBCE;")
    private final class35 method409(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field1097 != null) {
            int var2 = -1;
            if (super.field1319 >= 0 && super.field1322 == 0) {
                var2 = class42.field1158[super.field1319].field1160[super.field1320];
            } else if (super.field1332 >= 0) {
                var2 = class42.field1158[super.field1332].field1160[super.field1333];
            }
            return this.field1097.method305(-1, (int[]) null, 0, var2);
        } else {
            long var4 = this.field1112;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1319 >= 0 && super.field1322 == 0) {
                class42 var10 = class42.field1158[super.field1319];
                var6 = var10.field1160[super.field1320];
                if (super.field1332 >= 0 && super.field1353 != super.field1332) {
                    var7 = class42.field1158[super.field1332].field1160[super.field1333];
                }
                if (var10.field1167 >= 0) {
                    var8 = var10.field1167;
                    var4 += (long) (var8 - this.field1095[5] << 8);
                }
                if (var10.field1168 >= 0) {
                    var9 = var10.field1168;
                    var4 += (long) (var9 - this.field1095[3] << 16);
                }
            } else if (super.field1332 >= 0) {
                var6 = class42.field1158[super.field1332].field1160[super.field1333];
            }
            class35 var11 = (class35) field1096.method302(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1095[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class43.field1177[var14 - 256].method419(0)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class24.method293(var14 - 512).method294((byte) 0, this.field1103)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1098 != -1L) {
                        var11 = (class35) field1096.method302(this.field1098);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class35[] var15 = new class35[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1095[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class35 var20 = class43.field1177[var19 - 256].method420(3246);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class35 var21 = class24.method293(var19 - 512).method289(8, this.field1103);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class35(false, var16, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1113[var18] != 0) {
                        var11.method393(client.field83[var18][0], client.field83[var18][this.field1113[var18]]);
                        if (var18 == 1) {
                            var11.method393(client.field240[0], client.field240[this.field1113[var18]]);
                        }
                    }
                }
                var11.method386(9);
                var11.method396(64, 850, -30, -50, -30, true);
                field1096.method303(var4, -15, var11);
                this.field1098 = var4;
            }
            if (this.field1115) {
                return var11;
            } else {
                class35 var22 = class35.field1005;
                var22.method381(class71.method585(var6, 2) & class71.method585(var7, 2), var11, 517);
                if (var6 != -1 && var7 != -1) {
                    var22.method388(class42.field1158[super.field1319].field1164, true, var6, var7);
                } else if (var6 != -1) {
                    var22.method387(var6, -599);
                }
                var22.method383((byte) 8);
                var22.field1042 = null;
                var22.field1041 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "LAKHMHBY", name = "a", descriptor = "(BLXOUQUKZW;)V")
    public final void method410(byte arg0, class62 arg1) {
        arg1.field1579 = 0;
        this.field1103 = arg1.method521();
        this.field1090 = arg1.method521();
        this.field1097 = null;
        this.field1091 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method521();
            if (var4 == 0) {
                this.field1095[var3] = 0;
            } else {
                int var5 = arg1.method521();
                this.field1095[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1095[0] == 65535) {
                    this.field1097 = class26.method309(arg1.method523());
                    break;
                }
                if (this.field1095[var3] >= 512 && this.field1095[var3] - 512 < class24.field849) {
                    int var11 = class24.method293(this.field1095[var3] - 512).field834;
                    if (var11 != 0) {
                        this.field1091 = var11;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var10 = arg1.method521();
            if (var10 < 0 || var10 >= client.field83[var6].length) {
                var10 = 0;
            }
            this.field1113[var6] = var10;
        }
        super.field1353 = arg1.method523();
        if (super.field1353 == 65535) {
            super.field1353 = -1;
        }
        super.field1354 = arg1.method523();
        if (super.field1354 == 65535) {
            super.field1354 = -1;
        }
        super.field1364 = arg1.method523();
        if (super.field1364 == 65535) {
            super.field1364 = -1;
        }
        super.field1365 = arg1.method523();
        if (super.field1365 == 65535) {
            super.field1365 = -1;
        }
        super.field1366 = arg1.method523();
        if (super.field1366 == 65535) {
            super.field1366 = -1;
        }
        super.field1367 = arg1.method523();
        if (super.field1367 == 65535) {
            super.field1367 = -1;
        }
        super.field1343 = arg1.method523();
        if (super.field1343 == 65535) {
            super.field1343 = -1;
        }
        this.field1114 = class67.method567(-550, class67.method564(arg1.method527(-651), true));
        this.field1108 = arg1.method521();
        if (arg0 != 73) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        this.field1110 = arg1.method523();
        this.field1092 = true;
        this.field1112 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field1112 <<= 4;
            if (this.field1095[var8] >= 256) {
                this.field1112 += (long) (this.field1095[var8] - 256);
            }
        }
        if (this.field1095[0] >= 256) {
            this.field1112 += (long) (this.field1095[0] - 256 >> 4);
        }
        if (this.field1095[1] >= 256) {
            this.field1112 += (long) (this.field1095[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field1112 <<= 3;
            this.field1112 += (long) this.field1113[var9];
        }
        this.field1112 <<= 1;
        this.field1112 += (long) this.field1103;
    }
}
