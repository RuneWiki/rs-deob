import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SOKVSBIO")
public class class51 extends class37 {

    @OriginalMember(owner = "client!SOKVSBIO", name = "ob", descriptor = "Z")
    public boolean field1406 = false;

    @OriginalMember(owner = "client!SOKVSBIO", name = "rb", descriptor = "Z")
    public boolean field1409 = false;

    @OriginalMember(owner = "client!SOKVSBIO", name = "sb", descriptor = "[I")
    public int[] field1410 = new int[12];

    @OriginalMember(owner = "client!SOKVSBIO", name = "yb", descriptor = "I")
    public int field1416 = -1;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Db", descriptor = "[I")
    public int[] field1421 = new int[5];

    @OriginalMember(owner = "client!SOKVSBIO", name = "Eb", descriptor = "J")
    public long field1422 = -1L;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Nb", descriptor = "I")
    public int field1431 = -1;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Ob", descriptor = "I")
    private int field1432 = 224;

    @OriginalMember(owner = "client!SOKVSBIO", name = "xb", descriptor = "LTHJKANXW;")
    public static class54 field1415 = new class54(260, false);

    @OriginalMember(owner = "client!SOKVSBIO", name = "qb", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!SOKVSBIO", name = "tb", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!SOKVSBIO", name = "ub", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!SOKVSBIO", name = "vb", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!SOKVSBIO", name = "zb", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Ab", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Bb", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Cb", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Gb", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Ib", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Jb", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Kb", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Lb", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Mb", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!SOKVSBIO", name = "pb", descriptor = "J")
    public long field1407;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Hb", descriptor = "LYGGALXYD;")
    public class64 field1425;

    @OriginalMember(owner = "client!SOKVSBIO", name = "wb", descriptor = "LCYPZUKMB;")
    public class8 field1414;

    @OriginalMember(owner = "client!SOKVSBIO", name = "Fb", descriptor = "Ljava/lang/String;")
    public String field1423;

    @OriginalMember(owner = "client!SOKVSBIO", name = "a", descriptor = "(LLBBVYYXO;I)V")
    public final void method526(class32 arg0, int arg1) {
        arg0.field1032 = 0;
        this.field1417 = arg0.method369();
        this.field1431 = arg0.method370();
        this.field1416 = arg0.method370();
        this.field1425 = null;
        this.field1424 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method369();
            if (var4 == 0) {
                this.field1410[var3] = 0;
            } else {
                int var5 = arg0.method369();
                this.field1410[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1410[0] == 65535) {
                    this.field1425 = class64.method575(arg0.method371());
                    break;
                }
                if (this.field1410[var3] >= 512 && this.field1410[var3] - 512 < class60.field1507) {
                    int var12 = class60.method554(this.field1410[var3] - 512).field1501;
                    if (var12 != 0) {
                        this.field1424 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg0.method369();
            if (var11 < 0 || var11 >= client.field151[var6].length) {
                var11 = 0;
            }
            this.field1421[var6] = var11;
        }
        super.field1146 = arg0.method371();
        if (super.field1146 == 65535) {
            super.field1146 = -1;
        }
        super.field1147 = arg0.method371();
        if (super.field1147 == 65535) {
            super.field1147 = -1;
        }
        super.field1138 = arg0.method371();
        if (super.field1138 == 65535) {
            super.field1138 = -1;
        }
        super.field1139 = arg0.method371();
        if (super.field1139 == 65535) {
            super.field1139 = -1;
        }
        super.field1140 = arg0.method371();
        if (super.field1140 == 65535) {
            super.field1140 = -1;
        }
        super.field1141 = arg0.method371();
        if (super.field1141 == 65535) {
            super.field1141 = -1;
        }
        super.field1157 = arg0.method371();
        if (super.field1157 == 65535) {
            super.field1157 = -1;
        }
        this.field1423 = class40.method444(true, class40.method441(359, arg0.method375(true)));
        this.field1408 = arg0.method369();
        this.field1430 = arg0.method371();
        this.field1406 = true;
        this.field1407 = 0L;
        int var7 = this.field1410[5];
        int var8 = this.field1410[9];
        this.field1410[5] = var8;
        this.field1410[9] = var7;
        for (int var9 = 0; var9 < 12; ++var9) {
            this.field1407 <<= 4;
            if (this.field1410[var9] >= 256) {
                this.field1407 += (long) (this.field1410[var9] - 256);
            }
        }
        if (this.field1410[0] >= 256) {
            this.field1407 += (long) (this.field1410[0] - 256 >> 4);
        }
        if (this.field1410[1] >= 256) {
            this.field1407 += (long) (this.field1410[1] - 256 >> 8);
        }
        this.field1410[5] = var7;
        if (arg1 > 0) {
            this.field1410[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field1407 <<= 3;
                this.field1407 += (long) this.field1421[var10];
            }
            this.field1407 <<= 1;
            this.field1407 += (long) this.field1417;
        }
    }

    @OriginalMember(owner = "client!SOKVSBIO", name = "a", descriptor = "(I)Z")
    public final boolean method429(int arg0) {
        if (arg0 != 21781) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field1406;
    }

    @OriginalMember(owner = "client!SOKVSBIO", name = "a", descriptor = "(Z)LCYPZUKMB;")
    private final class8 method527(boolean arg0) {
        if (this.field1425 != null) {
            int var2 = -1;
            if (super.field1173 >= 0 && super.field1176 == 0) {
                var2 = class15.field837[super.field1173].field839[super.field1174];
            } else if (super.field1160 >= 0) {
                var2 = class15.field837[super.field1160].field839[super.field1161];
            }
            return this.field1425.method569(-1, (byte) 0, var2, (int[]) null);
        } else {
            long var4 = this.field1407;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1173 >= 0 && super.field1176 == 0) {
                class15 var10 = class15.field837[super.field1173];
                var6 = var10.field839[super.field1174];
                if (super.field1160 >= 0 && super.field1160 != super.field1146) {
                    var7 = class15.field837[super.field1160].field839[super.field1161];
                }
                if (var10.field846 >= 0) {
                    var8 = var10.field846;
                    var4 += (long) (var8 - this.field1410[5] << 8);
                }
                if (var10.field847 >= 0) {
                    var9 = var10.field847;
                    var4 += (long) (var9 - this.field1410[3] << 16);
                }
            } else if (super.field1160 >= 0) {
                var6 = class15.field837[super.field1160].field839[super.field1161];
            }
            class8 var11 = (class8) field1415.method529(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1410[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class7.field604[var14 - 256].method188(0)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class60.method554(var14 - 512).method550(976, this.field1417)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1422 != -1L) {
                        var11 = (class8) field1415.method529(this.field1422);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class8[] var15 = new class8[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1410[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class8 var20 = class7.field604[var19 - 256].method189(18390);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class8 var21 = class60.method554(var19 - 512).method559((byte) -34, this.field1417);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class8(var15, 3, var16);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1421[var18] != 0) {
                        var11.method210(client.field151[var18][0], client.field151[var18][this.field1421[var18]]);
                        if (var18 == 1) {
                            var11.method210(client.field299[0], client.field299[this.field1421[var18]]);
                        }
                    }
                }
                var11.method203(166);
                var11.method213(64, 850, -30, -50, -30, true);
                field1415.method530(var4, true, var11);
                this.field1422 = var4;
            }
            if (this.field1409) {
                return var11;
            } else {
                class8 var22 = class8.field615;
                if (!arg0) {
                    throw new NullPointerException();
                } else {
                    var22.method198(940, class46.method469(var6, true) & class46.method469(var7, true), var11);
                    if (var6 != -1 && var7 != -1) {
                        var22.method205(var6, var7, -40256, class15.field837[super.field1173].field843);
                    } else if (var6 != -1) {
                        var22.method204(257, var6);
                    }
                    var22.method200((byte) 50);
                    var22.field651 = null;
                    var22.field650 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "client!SOKVSBIO", name = "b", descriptor = "(Z)LCYPZUKMB;")
    public final class8 method528(boolean arg0) {
        if (!this.field1406) {
            return null;
        } else if (this.field1425 != null) {
            return this.field1425.method571(-384);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1410[var3];
                if (var12 >= 256 && var12 < 512 && !class7.field604[var12 - 256].method190(2)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class60.method554(var12 - 512).method561(this.field1417, 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class8[] var4 = new class8[12];
                if (!arg0) {
                    this.field1432 = -499;
                }
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1410[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class8 var10 = class7.field604[var9 - 256].method191(709);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class8 var11 = class60.method554(var9 - 512).method549((byte) 9, this.field1417);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class8 var7 = new class8(var4, 3, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1421[var8] != 0) {
                        var7.method210(client.field151[var8][0], client.field151[var8][this.field1421[var8]]);
                        if (var8 == 1) {
                            var7.method210(client.field299[0], client.field299[this.field1421[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!SOKVSBIO", name = "a", descriptor = "(B)LCYPZUKMB;")
    public final class8 method2(byte arg0) {
        if (!this.field1406) {
            return null;
        } else {
            class8 var2 = this.method527(true);
            if (var2 == null) {
                return null;
            } else {
                super.field1151 = var2.field1436;
                var2.field652 = true;
                if (this.field1409) {
                    return var2;
                } else {
                    if (super.field1126 != -1 && super.field1127 != -1) {
                        class4 var3 = class4.field43[super.field1126];
                        class8 var4 = var3.method9();
                        if (var4 != null) {
                            class8 var5 = new class8(class46.method469(super.field1127, true), var4, false, false, true);
                            var5.method209(0, -super.field1130, false, 0);
                            var5.method203(166);
                            var5.method204(257, var3.field47.field839[super.field1127]);
                            var5.field651 = null;
                            var5.field650 = null;
                            if (var3.field50 != 128 || var3.field51 != 128) {
                                var5.method212(var3.field50, -39776, var3.field51, var3.field50);
                            }
                            var5.method213(var3.field53 + 64, var3.field54 + 850, -30, -50, -30, true);
                            class8[] var6 = new class8[] { var2, var5 };
                            var2 = new class8(153, true, 2, var6);
                        }
                    }
                    if (this.field1414 != null) {
                        if (client.field174 >= this.field1420) {
                            this.field1414 = null;
                        }
                        if (client.field174 >= this.field1419 && client.field174 < this.field1420) {
                            class8 var7 = this.field1414;
                            var7.method209(this.field1411 - super.field1134, this.field1412 - this.field1418, false, this.field1413 - super.field1135);
                            if (super.field1148 == 512) {
                                var7.method207((byte) 93);
                                var7.method207((byte) 93);
                                var7.method207((byte) 93);
                            } else if (super.field1148 == 1024) {
                                var7.method207((byte) 93);
                                var7.method207((byte) 93);
                            } else if (super.field1148 == 1536) {
                                var7.method207((byte) 93);
                            }
                            class8[] var8 = new class8[] { var2, var7 };
                            var2 = new class8(153, true, 2, var8);
                            if (super.field1148 == 512) {
                                var7.method207((byte) 93);
                            } else if (super.field1148 == 1024) {
                                var7.method207((byte) 93);
                                var7.method207((byte) 93);
                            } else if (super.field1148 == 1536) {
                                var7.method207((byte) 93);
                                var7.method207((byte) 93);
                                var7.method207((byte) 93);
                            }
                            var7.method209(super.field1134 - this.field1411, this.field1418 - this.field1412, false, super.field1135 - this.field1413);
                        }
                    }
                    var2.field652 = true;
                    if (arg0 != -99) {
                        throw new NullPointerException();
                    } else {
                        return var2;
                    }
                }
            }
        }
    }
}
