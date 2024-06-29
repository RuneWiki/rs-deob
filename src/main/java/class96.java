import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class96 extends class263 {

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "[B")
    private byte[] field1481 = new byte[512];

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "Z")
    public boolean field1491 = true;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
    public int field1498 = 0;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    public int field1497 = 4;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public int field1493 = 4;

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "I")
    public int field1502 = 4;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public int field1487 = 1638;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "[Lfe;")
    public static class152[] field1495 = new class152[0];

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    public static int field1488 = 0;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
    public static int field1496 = 0;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "Ldp;")
    public static class347 field1492 = new class347("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    public static int field1501 = -1;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "[S")
    private short[] field1484;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "[S")
    private short[] field1490;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public final void method748(byte arg0) {
        ++field1500;
        this.field1481 = class372.method2213(this.field1498, (byte) -85);
        this.method749((byte) 73);
        if (arg0 != 110) {
            method752(-104);
        }
        for (int var2 = this.field1493 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field1484[var2];
            if (var3 > 8) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field1493;
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
    private final void method749(byte arg0) {
        if (arg0 >= 6) {
            if (this.field1487 > 0) {
                this.field1490 = new short[this.field1493];
                this.field1484 = new short[this.field1493];
                for (int var2 = 0; ~var2 > ~this.field1493; ++var2) {
                    this.field1484[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1487 / 4096.0F), (double) var2)));
                    this.field1490[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field1484 != null && this.field1484.length == this.field1493) {
                this.field1490 = new short[this.field1493];
                for (int var3 = 0; ~this.field1493 < ~var3; ++var3) {
                    this.field1490[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field1494;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[II)V")
    public final void method750(int arg0, int[] arg1, int arg2) {
        ++field1483;
        int var4 = class170.field2509[arg2] * this.field1502;
        if (arg0 > -99) {
            this.method750(-4, (int[]) null, -86);
        }
        if (~this.field1493 != -2) {
            short var5 = this.field1484[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field1490[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field1497 * var6 >> 12;
                int var9 = this.field1502 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 + 1;
                if (~var9 >= ~var11) {
                    var11 = 0;
                }
                int var12 = var7 & 4095;
                int var13 = this.field1481[var11 & 255] & 255;
                int var14 = class512.field7507[var12];
                int var15 = 255 & this.field1481[255 & var10];
                for (int var16 = 0; var16 < class367.field5597; ++var16) {
                    int var36 = class379.field5711[var16] * this.field1497;
                    int var37 = this.method751(var12, var13, var15, var14, var8, 255, var6 * var36 >> 12);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field1493 > var17; ++var17) {
                short var18 = this.field1484[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field1490[var17] << 12;
                    int var20 = this.field1497 * var19 >> 12;
                    int var21 = this.field1502 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = var23 + 1;
                    if (~var24 <= ~var21) {
                        var24 = 0;
                    }
                    int var25 = var22 & 4095;
                    int var26 = class512.field7507[var25];
                    int var27 = 255 & this.field1481[255 & var23];
                    int var28 = this.field1481[var24 & 255] & 255;
                    if (this.field1491 && ~(this.field1493 + -1) == ~var17) {
                        for (int var29 = 0; var29 < class367.field5597; ++var29) {
                            int var30 = class379.field5711[var29] * this.field1497;
                            int var31 = this.method751(var25, var28, var27, var26, var20, 255, var19 * var30 >> 12);
                            int var32 = arg1[var29] - -(var18 * var31 >> 12);
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; class367.field5597 > var33; ++var33) {
                            int var34 = class379.field5711[var33] * this.field1497;
                            int var35 = this.method751(var25, var28, var27, var26, var20, 255, var19 * var34 >> 12);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field1490[0] << 12;
            short var39 = this.field1484[0];
            int var40 = var4 * var38 >> 12;
            int var41 = this.field1502 * var38 >> 12;
            int var42 = this.field1497 * var38 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            int var45 = var40 & 4095;
            if (var44 >= var41) {
                var44 = 0;
            }
            int var46 = this.field1481[255 & var44] & 255;
            int var47 = this.field1481[var43 & 255] & 255;
            int var48 = class512.field7507[var45];
            if (!this.field1491) {
                for (int var49 = 0; var49 < class367.field5597; ++var49) {
                    int var50 = class379.field5711[var49] * this.field1497;
                    int var51 = this.method751(var45, var46, var47, var48, var42, 255, var38 * var50 >> 12);
                    arg1[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~var52 > ~class367.field5597; ++var52) {
                    int var53 = class379.field5711[var52] * this.field1497;
                    int var54 = this.method751(var45, var46, var47, var48, var42, 255, var38 * var53 >> 12);
                    int var55 = var39 * var54 >> 12;
                    arg1[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field1502 = arg2.method2765(96);
                                }
                            } else {
                                this.field1497 = arg2.method2765(68);
                            }
                        } else {
                            this.field1498 = arg2.method2765(110);
                        }
                    } else {
                        this.field1497 = this.field1502 = arg2.method2765(74);
                    }
                } else {
                    this.field1487 = arg2.method2745(-1);
                    if (~this.field1487 > -1) {
                        this.field1484 = new short[this.field1493];
                        for (int var5 = 0; this.field1493 > var5; ++var5) {
                            this.field1484[var5] = (short) arg2.method2745(-1);
                        }
                    }
                }
            } else {
                this.field1493 = arg2.method2765(119);
            }
        } else {
            this.field1491 = ~arg2.method2765(52) == -2;
        }
        if (arg1) {
            ++field1489;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field1485;
        if (arg1 <= 40) {
            field1492 = null;
        }
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            this.method750(-117, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIII)I")
    private final int method751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1486;
        int var8 = arg6 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & arg5;
        if (arg4 <= var9) {
            var9 = 0;
        }
        int var11 = arg6 & 4095;
        int var12 = var9 & 255;
        int var13 = var11 - 4096;
        int var14 = arg0 + -4096;
        int var15 = class512.field7507[var11];
        int var16 = 3 & this.field1481[arg2 + var10];
        int var17;
        if (var16 > 1) {
            var17 = ~var16 != -3 ? -arg0 + -var11 : -arg0 + var11;
        } else {
            var17 = var16 != 0 ? -var11 + arg0 : arg0 + var11;
        }
        int var18 = this.field1481[var12 - -arg2] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 == -1 ? arg0 + var13 : arg0 - var13;
        } else {
            var19 = var18 == 2 ? -arg0 + var13 : -var13 - arg0;
        }
        int var20 = var17 - -((-var17 + var19) * var15 >> 12);
        int var21 = 3 & this.field1481[arg1 + var10];
        int var22;
        if (~var21 >= -2) {
            var22 = ~var21 != -1 ? -var11 + var14 : var11 - -var14;
        } else {
            var22 = var21 == 2 ? -var14 + var11 : -var11 + -var14;
        }
        int var23 = this.field1481[arg1 + var12] & 3;
        int var24;
        if (~var23 >= -2) {
            var24 = var23 != 0 ? -var13 + var14 : var13 + var14;
        } else {
            var24 = ~var23 == -3 ? -var14 + var13 : -var13 + -var14;
        }
        int var25 = var22 - -((-var22 + var24) * var15 >> 12);
        return ((var25 - var20) * arg3 >> 12) + var20;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
    public static void method752(int arg0) {
        field1495 = null;
        if (arg0 != -13175) {
            method756(100, 13);
        }
        field1492 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)I")
    public static final int method753(boolean arg0, int arg1) {
        ++field1503;
        if (!arg0) {
            field1496 = 67;
        }
        if (~arg1 != -6407) {
            if (arg1 == 6409) {
                return 1;
            } else if (arg1 != 32841) {
                if (arg1 != 6410) {
                    if (~arg1 == -6408) {
                        return 3;
                    } else if (arg1 == 6408) {
                        return 4;
                    } else {
                        throw new IllegalArgumentException("");
                    }
                } else {
                    return 2;
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[I[Ljava/lang/Object;IB)V")
    public static final void method754(int arg0, int[] arg1, Object[] arg2, int arg3, byte arg4) {
        if (arg3 < arg0) {
            int var5 = (arg3 - -arg0) / 2;
            int var6 = arg3;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg3; ~arg0 < ~var10; ++var10) {
                if (~((var10 & var9) + var7) < ~arg1[var10]) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method754(var6 + -1, arg1, arg2, arg3, (byte) 118);
            method754(arg0, arg1, arg2, var6 + 1, (byte) 118);
        }
        if (arg4 != 118) {
            field1496 = 42;
        }
        ++field1499;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(IBI)V")
    public static final void method755(int arg0, byte arg1, int arg2) {
        ++field1480;
        class506 var3 = class14.method185(-1304589728, arg2, 13);
        if (arg1 < -3) {
            var3.method2992(0);
            var3.field7442 = arg0;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)I")
    public static final int method756(int arg0, int arg1) {
        if (arg0 != -4084) {
            method754(37, (int[]) null, (Object[]) null, -60, (byte) 11);
        }
        ++field1482;
        return arg1 & 1023;
    }
}
