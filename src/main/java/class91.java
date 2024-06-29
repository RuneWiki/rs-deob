import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class91 extends class124 {

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    private int field1478 = 0;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "[B")
    private byte[] field1482 = new byte[512];

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "Z")
    private boolean field1488 = true;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    private int field1481 = 4;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    private int field1479 = 4;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    private int field1490 = 1638;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    private int field1492 = 4;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Lwd;")
    public static class97 field1475 = new class97(32);

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lef;")
    public static class175 field1494 = new class175();

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "Le;")
    public static class191 field1497 = class54.method368("<col=ff0000>", 2047);

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "Le;")
    private static class191 field1498 = class54.method368("flash1:", 2047);

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "Le;")
    public static class191 field1499 = field1498;

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "Le;")
    public static class191 field1500 = field1498;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    public static int field1495 = 0;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "Lng;")
    public static class121 field1496;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "[S")
    private short[] field1477;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "[S")
    private short[] field1487;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI[I)V")
    private final void method551(byte arg0, int arg1, int[] arg2) {
        ++field1484;
        int var4 = class236.field4202[arg1] * this.field1479;
        if (arg0 != 66) {
            this.field1492 = 68;
        }
        if (this.field1492 != 1) {
            short var5 = this.field1477[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field1487[0] << 12;
                int var7 = this.field1479 * var6 >> 12;
                int var8 = this.field1481 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = this.field1482[255 & var10] & 255;
                int var12 = var10 - -1;
                int var13 = var9 & 4095;
                int var14 = class69.field1223[var13];
                if (var7 <= var12) {
                    var12 = 0;
                }
                int var15 = 255 & this.field1482[var12 & 255];
                for (int var16 = 0; ~class64.field1132 < ~var16; ++var16) {
                    int var36 = class257.field4559[var16] * this.field1481;
                    int var37 = this.method554(var13, var15, 104, var14, var11, var8, var6 * var36 >> 12);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; var17 < this.field1492; ++var17) {
                short var18 = this.field1477[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field1487[var17] << 12;
                    int var20 = this.field1481 * var19 >> 12;
                    int var21 = this.field1479 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = var23 - -1;
                    if (~var21 >= ~var24) {
                        var24 = 0;
                    }
                    int var25 = this.field1482[255 & var23] & 255;
                    int var26 = var22 & 4095;
                    int var27 = class69.field1223[var26];
                    int var28 = this.field1482[var24 & 255] & 255;
                    if (this.field1488 && this.field1492 + -1 == var17) {
                        for (int var29 = 0; class64.field1132 > var29; ++var29) {
                            int var30 = class257.field4559[var29] * this.field1481;
                            int var31 = this.method554(var26, var28, -112, var27, var25, var20, var19 * var30 >> 12);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class64.field1132; ++var33) {
                            int var34 = class257.field4559[var33] * this.field1481;
                            int var35 = this.method554(var26, var28, 98, var27, var25, var20, var19 * var34 >> 12);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field1487[0] << 12;
            int var39 = var4 * var38 >> 12;
            int var40 = this.field1481 * var38 >> 12;
            int var41 = this.field1479 * var38 >> 12;
            int var42 = var39 >> 12;
            int var43 = this.field1482[255 & var42] & 255;
            int var44 = var42 - -1;
            int var45 = var39 & 4095;
            if (~var44 <= ~var41) {
                var44 = 0;
            }
            int var46 = class69.field1223[var45];
            short var47 = this.field1477[0];
            int var48 = this.field1482[var44 & 255] & 255;
            if (!this.field1488) {
                for (int var49 = 0; var49 < class64.field1132; ++var49) {
                    int var50 = class257.field4559[var49] * this.field1481;
                    int var51 = this.method554(var45, var48, arg0 ^ 10, var46, var43, var40, var38 * var50 >> 12);
                    arg2[var49] = var47 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; var52 < class64.field1132; ++var52) {
                    int var53 = class257.field4559[var52] * this.field1481;
                    int var54 = this.method554(var45, var48, -118, var46, var43, var40, var38 * var53 >> 12);
                    int var55 = var47 * var54 >> 12;
                    arg2[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (arg2) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field1479 = arg1.method1580(-122);
                                    }
                                } else {
                                    this.field1481 = arg1.method1580(-113);
                                }
                            } else {
                                this.field1478 = arg1.method1580(-109);
                            }
                        } else {
                            this.field1481 = this.field1479 = arg1.method1580(-66);
                        }
                    } else {
                        this.field1490 = arg1.method1568(115);
                        if (this.field1490 < 0) {
                            this.field1477 = new short[this.field1492];
                            for (int var5 = 0; this.field1492 > var5; ++var5) {
                                this.field1477[var5] = (short) arg1.method1568(120);
                            }
                        }
                    }
                } else {
                    this.field1492 = arg1.method1580(-41);
                }
            } else {
                this.field1488 = arg1.method1580(-86) == 1;
            }
            ++field1476;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IB)V")
    public static final void method552(int arg0, byte arg1) {
        ++field1483;
        if (arg1 > 16) {
            class20.field273.method990(121, arg0);
            class262.field4647.method990(66, arg0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
    public static final int method553(int arg0, int arg1) {
        if (arg1 <= 51) {
            method553(64, -37);
        }
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 16;
            var2 += 16;
        }
        ++field1493;
        if (~arg0 <= -257) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 1;
            ++var2;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIII)I")
    private final int method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1489;
        int var8 = arg0 - 4096;
        int var9 = arg6 >> 12;
        int var10 = var9 + 1;
        int var11 = arg6 & 4095;
        if (~arg5 >= ~var10) {
            var10 = 0;
        }
        int var12 = var9 & 255;
        int var13 = var11 - 4096;
        int var14 = class69.field1223[var11];
        int var15 = 3 & this.field1482[var12 - -arg4];
        int var16;
        if (var15 <= 1) {
            var16 = ~var15 == -1 ? var11 - -arg0 : -var11 + arg0;
        } else {
            var16 = ~var15 == -3 ? var11 - arg0 : -var11 - arg0;
        }
        int var17 = var10 & 255;
        int var18 = this.field1482[arg4 + var17] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = ~var18 != -3 ? -arg0 + -var13 : -arg0 + var13;
        } else {
            var19 = ~var18 != -1 ? -var13 + arg0 : arg0 + var13;
        }
        int var20 = 3 & this.field1482[arg1 + var12];
        int var21 = ((var19 - var16) * var14 >> 12) + var16;
        int var22 = -117 / ((arg2 - -45) / 58);
        int var23;
        if (~var20 >= -2) {
            var23 = var20 != 0 ? -var11 + var8 : var8 + var11;
        } else {
            var23 = ~var20 != -3 ? -var8 + -var11 : var11 - var8;
        }
        int var24 = this.field1482[arg1 + var17] & 3;
        int var25;
        if (var24 <= 1) {
            var25 = ~var24 != -1 ? var8 - var13 : var8 + var13;
        } else {
            var25 = var24 == 2 ? -var8 + var13 : -var8 + -var13;
        }
        int var26 = var23 - -((var25 - var23) * var14 >> 12);
        return var21 - -((-var21 + var26) * arg3 >> 12);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field1485;
        if (arg0 <= 68) {
            this.field1479 = 70;
        }
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            this.method551((byte) 66, arg1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)I")
    public static final int method555(byte arg0) {
        if (arg0 >= -37) {
            return 34;
        } else {
            ++field1491;
            return class185.field3232;
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        ++field1480;
        this.field1482 = class35.method247(this.field1478, 16);
        this.method557(24555);
        for (int var2 = this.field1492 + arg0; ~var2 <= -2; --var2) {
            short var3 = this.field1477[var2];
            if (~var3 < -9 || var3 < -8) {
                return;
            }
            --this.field1492;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
    public static void method556(byte arg0) {
        field1497 = null;
        field1496 = null;
        field1498 = null;
        if (arg0 == 39) {
            field1500 = null;
            field1499 = null;
            field1494 = null;
            field1475 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V")
    private final void method557(int arg0) {
        ++field1486;
        if (arg0 != 24555) {
            field1495 = -51;
        }
        if (this.field1490 > 0) {
            this.field1487 = new short[this.field1492];
            this.field1477 = new short[this.field1492];
            for (int var2 = 0; ~this.field1492 < ~var2; ++var2) {
                this.field1477[var2] = (short) ((int) (Math.pow((double) ((float) this.field1490 / 4096.0F), (double) var2) * 4096.0D));
                this.field1487[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1477 != null && this.field1477.length == this.field1492) {
            this.field1487 = new short[this.field1492];
            for (int var3 = 0; var3 < this.field1492; ++var3) {
                this.field1487[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }
}
