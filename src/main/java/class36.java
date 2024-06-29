import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MDBQGDOL")
public class class36 extends class50 {

    @OriginalMember(owner = "client!MDBQGDOL", name = "sb", descriptor = "Z")
    private boolean field1054 = false;

    @OriginalMember(owner = "client!MDBQGDOL", name = "ub", descriptor = "I")
    private int field1056 = 112;

    @OriginalMember(owner = "client!MDBQGDOL", name = "vb", descriptor = "Z")
    public boolean field1057 = false;

    @OriginalMember(owner = "client!MDBQGDOL", name = "xb", descriptor = "Z")
    public boolean field1059 = false;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Eb", descriptor = "J")
    public long field1066 = -1L;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Fb", descriptor = "B")
    private byte field1067 = -60;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Ob", descriptor = "Z")
    private boolean field1076 = true;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Pb", descriptor = "I")
    public int field1077 = -1;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Qb", descriptor = "I")
    public int field1078 = -1;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Rb", descriptor = "Z")
    private boolean field1079 = true;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Sb", descriptor = "[I")
    public int[] field1080 = new int[5];

    @OriginalMember(owner = "client!MDBQGDOL", name = "Ub", descriptor = "[I")
    public int[] field1082 = new int[12];

    @OriginalMember(owner = "client!MDBQGDOL", name = "Vb", descriptor = "Z")
    private boolean field1083 = false;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Ib", descriptor = "LHARAZQMH;")
    public static class22 field1070 = new class22((byte) 5, 260);

    @OriginalMember(owner = "client!MDBQGDOL", name = "qb", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!MDBQGDOL", name = "rb", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!MDBQGDOL", name = "yb", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!MDBQGDOL", name = "zb", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Ab", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Bb", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Cb", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Db", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Gb", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Hb", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Jb", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Kb", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Lb", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Mb", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!MDBQGDOL", name = "wb", descriptor = "J")
    public long field1058;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Nb", descriptor = "LGCSAWSJV;")
    public class16 field1075;

    @OriginalMember(owner = "client!MDBQGDOL", name = "tb", descriptor = "LTQRZOVPP;")
    public class57 field1055;

    @OriginalMember(owner = "client!MDBQGDOL", name = "Tb", descriptor = "Ljava/lang/String;")
    public String field1081;

    @OriginalMember(owner = "client!MDBQGDOL", name = "b", descriptor = "(I)LGCSAWSJV;")
    public final class16 method356(int arg0) {
        if (!this.field1059) {
            return null;
        } else if (this.field1055 != null) {
            return this.field1055.method518(false);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field1082[var3];
                if (var13 >= 256 && var13 < 512 && !class9.field114[var13 - 256].method33(this.field1067)) {
                    var2 = true;
                }
                if (var13 >= 512 && !class34.method346(var13 - 512).method347(this.field1083, this.field1060)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class16[] var4 = new class16[12];
                int var5 = 0;
                if (arg0 < 5 || arg0 > 5) {
                    for (int var6 = 1; var6 > 0; ++var6) {
                    }
                }
                for (int var7 = 0; var7 < 12; ++var7) {
                    int var10 = this.field1082[var7];
                    if (var10 >= 256 && var10 < 512) {
                        class16 var11 = class9.field114[var10 - 256].method34(2);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class16 var12 = class34.method346(var10 - 512).method353(this.field1060, 349);
                        if (var12 != null) {
                            var4[var5++] = var12;
                        }
                    }
                }
                class16 var8 = new class16(var4, var5, this.field1076);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field1080[var9] != 0) {
                        var8.method274(client.field203[var9][0], client.field203[var9][this.field1080[var9]]);
                        if (var9 == 1) {
                            var8.method274(client.field565[0], client.field565[this.field1080[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!MDBQGDOL", name = "b", descriptor = "(B)LGCSAWSJV;")
    private final class16 method357(byte arg0) {
        if (this.field1055 != null) {
            int var2 = -1;
            if (super.field1300 >= 0 && super.field1303 == 0) {
                var2 = class67.field1666[super.field1300].field1668[super.field1301];
            } else if (super.field1297 >= 0) {
                var2 = class67.field1666[super.field1297].field1668[super.field1298];
            }
            return this.field1055.method520(-1, (int[]) null, var2, (byte) -112);
        } else {
            long var4 = this.field1058;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1300 >= 0 && super.field1303 == 0) {
                class67 var10 = class67.field1666[super.field1300];
                var6 = var10.field1668[super.field1301];
                if (super.field1297 >= 0 && super.field1297 != super.field1286) {
                    var7 = class67.field1666[super.field1297].field1668[super.field1298];
                }
                if (var10.field1675 >= 0) {
                    var8 = var10.field1675;
                    var4 += (long) (var8 - this.field1082[5] << 8);
                }
                if (var10.field1676 >= 0) {
                    var9 = var10.field1676;
                    var4 += (long) (var9 - this.field1082[3] << 16);
                }
            } else if (super.field1297 >= 0) {
                var6 = class67.field1666[super.field1297].field1668[super.field1298];
            }
            class16 var11 = (class16) field1070.method299(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1082[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class9.field114[var14 - 256].method31(true)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class34.method346(var14 - 512).method345((byte) -110, this.field1060)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1066 != -1L) {
                        var11 = (class16) field1070.method299(this.field1066);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class16[] var15 = new class16[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1082[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class16 var20 = class9.field114[var19 - 256].method32(true);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class16 var21 = class34.method346(var19 - 512).method343(true, this.field1060);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class16(var15, var16, this.field1076);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1080[var18] != 0) {
                        var11.method274(client.field203[var18][0], client.field203[var18][this.field1080[var18]]);
                        if (var18 == 1) {
                            var11.method274(client.field565[0], client.field565[this.field1080[var18]]);
                        }
                    }
                }
                var11.method267(-12404);
                var11.method277(64, 850, -30, -50, -30, true);
                field1070.method300((byte) 24, var4, var11);
                this.field1066 = var4;
            }
            if (this.field1057) {
                return var11;
            } else {
                class16 var22 = class16.field710;
                if (arg0 != 7) {
                    this.field1056 = 416;
                }
                var22.method262(class48.method436(this.field1079, var6) & class48.method436(this.field1079, var7), var11, this.field1054);
                if (var6 != -1 && var7 != -1) {
                    var22.method269(49910, var6, class67.field1666[super.field1300].field1672, var7);
                } else if (var6 != -1) {
                    var22.method268((byte) 81, var6);
                }
                var22.method264((byte) 6);
                var22.field746 = null;
                var22.field745 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "client!MDBQGDOL", name = "a", descriptor = "(ILCMGGUSPR;)V")
    public final void method358(int arg0, class10 arg1) {
        arg1.field646 = 0;
        this.field1060 = arg1.method194();
        this.field1077 = arg1.method195();
        this.field1078 = arg1.method195();
        this.field1055 = null;
        this.field1065 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method194();
            if (var4 == 0) {
                this.field1082[var3] = 0;
            } else {
                int var5 = arg1.method194();
                this.field1082[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1082[0] == 65535) {
                    this.field1055 = class57.method517(arg1.method196());
                    break;
                }
                if (this.field1082[var3] >= 512 && this.field1082[var3] - 512 < class34.field1006) {
                    int var12 = class34.method346(this.field1082[var3] - 512).field1013;
                    if (var12 != 0) {
                        this.field1065 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg1.method194();
            if (var11 < 0 || var11 >= client.field203[var6].length) {
                var11 = 0;
            }
            this.field1080[var6] = var11;
        }
        super.field1286 = arg1.method196();
        if (super.field1286 == 65535) {
            super.field1286 = -1;
        }
        super.field1287 = arg1.method196();
        if (super.field1287 == 65535) {
            super.field1287 = -1;
        }
        super.field1268 = arg1.method196();
        if (super.field1268 == 65535) {
            super.field1268 = -1;
        }
        super.field1269 = arg1.method196();
        if (super.field1269 == 65535) {
            super.field1269 = -1;
        }
        super.field1270 = arg1.method196();
        if (super.field1270 == 65535) {
            super.field1270 = -1;
        }
        super.field1271 = arg1.method196();
        if (super.field1271 == 65535) {
            super.field1271 = -1;
        }
        super.field1320 = arg1.method196();
        if (super.field1320 == 65535) {
            super.field1320 = -1;
        }
        this.field1081 = class71.method601(class71.method598(arg1.method200(3838), -491), 8384);
        this.field1071 = arg1.method194();
        this.field1068 = arg1.method196();
        this.field1059 = true;
        this.field1058 = 0L;
        int var7 = this.field1082[5];
        int var8 = this.field1082[9];
        this.field1082[5] = var8;
        this.field1082[9] = var7;
        for (int var9 = 0; var9 < 12; ++var9) {
            this.field1058 <<= 4;
            if (this.field1082[var9] >= 256) {
                this.field1058 += (long) (this.field1082[var9] - 256);
            }
        }
        if (arg0 != 29328) {
            this.field1056 = -1;
        }
        if (this.field1082[0] >= 256) {
            this.field1058 += (long) (this.field1082[0] - 256 >> 4);
        }
        if (this.field1082[1] >= 256) {
            this.field1058 += (long) (this.field1082[1] - 256 >> 8);
        }
        this.field1082[5] = var7;
        this.field1082[9] = var8;
        for (int var10 = 0; var10 < 5; ++var10) {
            this.field1058 <<= 3;
            this.field1058 += (long) this.field1080[var10];
        }
        this.field1058 <<= 1;
        this.field1058 += (long) this.field1060;
    }

    @OriginalMember(owner = "client!MDBQGDOL", name = "a", descriptor = "(B)Z")
    public final boolean method302(byte arg0) {
        if (arg0 != 38) {
            throw new NullPointerException();
        } else {
            return this.field1059;
        }
    }

    @OriginalMember(owner = "client!MDBQGDOL", name = "a", descriptor = "(Z)LGCSAWSJV;")
    public final class16 method8(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (!this.field1059) {
            return null;
        } else {
            class16 var2 = this.method357((byte) 7);
            if (var2 == null) {
                return null;
            } else {
                super.field1312 = var2.field11;
                var2.field747 = true;
                if (this.field1057) {
                    return var2;
                } else {
                    if (super.field1273 != -1 && super.field1274 != -1) {
                        class29 var3 = class29.field932[super.field1273];
                        class16 var4 = var3.method332();
                        if (var4 != null) {
                            class16 var5 = new class16(0, var4, true, class48.method436(this.field1079, super.field1274), false);
                            var5.method273(-super.field1277, true, 0, 0);
                            var5.method267(-12404);
                            var5.method268((byte) 81, var3.field936.field1668[super.field1274]);
                            var5.field746 = null;
                            var5.field745 = null;
                            if (var3.field939 != 128 || var3.field940 != 128) {
                                var5.method276(var3.field939, var3.field939, var3.field940, (byte) -79);
                            }
                            var5.method277(var3.field942 + 64, var3.field943 + 850, -30, -50, -30, true);
                            class16[] var6 = new class16[] { var2, var5 };
                            var2 = new class16(true, var6, -4860, 2);
                        }
                    }
                    if (this.field1075 != null) {
                        if (client.field471 >= this.field1053) {
                            this.field1075 = null;
                        }
                        if (client.field471 >= this.field1052 && client.field471 < this.field1053) {
                            class16 var7 = this.field1075;
                            var7.method273(this.field1073 - this.field1069, true, this.field1072 - super.field1305, this.field1074 - super.field1306);
                            if (super.field1278 == 512) {
                                var7.method271(false);
                                var7.method271(false);
                                var7.method271(false);
                            } else if (super.field1278 == 1024) {
                                var7.method271(false);
                                var7.method271(false);
                            } else if (super.field1278 == 1536) {
                                var7.method271(false);
                            }
                            class16[] var8 = new class16[] { var2, var7 };
                            var2 = new class16(true, var8, -4860, 2);
                            if (super.field1278 == 512) {
                                var7.method271(false);
                            } else if (super.field1278 == 1024) {
                                var7.method271(false);
                                var7.method271(false);
                            } else if (super.field1278 == 1536) {
                                var7.method271(false);
                                var7.method271(false);
                                var7.method271(false);
                            }
                            var7.method273(this.field1069 - this.field1073, true, super.field1305 - this.field1072, super.field1306 - this.field1074);
                        }
                    }
                    var2.field747 = true;
                    return var2;
                }
            }
        }
    }
}
