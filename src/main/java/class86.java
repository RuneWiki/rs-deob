import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class86 extends class135 {

    @OriginalMember(owner = "client!li", name = "lb", descriptor = "Z")
    private boolean field1269 = true;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    private int field1256 = 4;

    @OriginalMember(owner = "client!li", name = "fb", descriptor = "[B")
    private byte[] field1263 = new byte[512];

    @OriginalMember(owner = "client!li", name = "db", descriptor = "I")
    private int field1261 = 0;

    @OriginalMember(owner = "client!li", name = "ob", descriptor = "I")
    private int field1272 = 4;

    @OriginalMember(owner = "client!li", name = "tb", descriptor = "I")
    private int field1277 = 1638;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    private int field1254 = 4;

    @OriginalMember(owner = "client!li", name = "nb", descriptor = "[Z")
    public static boolean[] field1271 = new boolean[100];

    @OriginalMember(owner = "client!li", name = "rb", descriptor = "I")
    public static int field1275 = 0;

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "Lqj;")
    public static class196 field1262 = class80.method502("document)3cookie=(R", -48);

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!li", name = "gb", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!li", name = "hb", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!li", name = "ib", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!li", name = "jb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!li", name = "pb", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!li", name = "qb", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!li", name = "sb", descriptor = "Lbk;")
    public static class136 field1276;

    @OriginalMember(owner = "client!li", name = "kb", descriptor = "[S")
    private short[] field1268;

    @OriginalMember(owner = "client!li", name = "mb", descriptor = "[S")
    private short[] field1270;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            this.method536(8, -25, -63, 97, -19, -13, 97);
        }
        ++field1258;
        int[] var3 = super.field1954.method110(arg0, -123);
        if (super.field1954.field244) {
            this.method540(false, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class86() {
        super(0, true);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        ++field1253;
        this.field1263 = class238.method1596(122, this.field1261);
        this.method539((byte) -117);
        int var2 = this.field1256 + -1;
        if (arg0 != -85) {
            method542(32);
        }
        while (~var2 <= -2) {
            short var3 = this.field1270[var2];
            if (var3 > 8 || ~var3 > 7) {
                return;
            }
            --this.field1256;
            --var2;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIII)I")
    private final int method536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1265;
        int var8 = arg0 + -4096;
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        int var11 = var9 & 255;
        int var12 = arg4 & 4095;
        if (arg6 <= var10) {
            var10 = 0;
        }
        if (arg3 >= -61) {
            method542(12);
        }
        int var13 = var12 + -4096;
        int var14 = class125.field1775[var12];
        int var15 = var10 & 255;
        int var16 = this.field1263[arg5 + var11] & 3;
        int var17;
        if (var16 <= 1) {
            var17 = ~var16 == -1 ? arg0 + var12 : -var12 + arg0;
        } else {
            var17 = ~var16 != -3 ? -arg0 + -var12 : -arg0 + var12;
        }
        int var18 = 3 & this.field1263[var15 - -arg5];
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg0 + var13 : -var13 + arg0;
        } else {
            var19 = ~var18 != -3 ? -var13 - arg0 : -arg0 + var13;
        }
        int var20 = ((-var17 + var19) * var14 >> 12) + var17;
        int var21 = 3 & this.field1263[arg2 + var11];
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var12 - var8 : -var8 + -var12;
        } else {
            var22 = var21 == 0 ? var12 - -var8 : var8 - var12;
        }
        int var23 = this.field1263[arg2 + var15] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = var23 == 2 ? -var8 + var13 : -var13 - var8;
        } else {
            var24 = var23 == 0 ? var8 + var13 : -var13 + var8;
        }
        int var25 = ((var24 - var22) * var14 >> 12) + var22;
        return ((var25 - var20) * arg1 >> 12) + var20;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public static final void method537(int arg0) {
        if (arg0 == 3) {
            ++field1266;
            class58.field789.method717(-16555);
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(II)I")
    public static final int method538(int arg0, int arg1) {
        ++field1259;
        if (arg1 > -1) {
            field1273 = 80;
        }
        return arg0 & 1023;
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(B)V")
    private final void method539(byte arg0) {
        if (arg0 >= -91) {
            this.field1272 = 47;
        }
        if (this.field1277 > 0) {
            this.field1270 = new short[this.field1256];
            this.field1268 = new short[this.field1256];
            for (int var2 = 0; ~var2 > ~this.field1256; ++var2) {
                this.field1270[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1277 / 4096.0F), (double) var2)));
                this.field1268[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1270 != null && this.field1270.length == this.field1256) {
            this.field1268 = new short[this.field1256];
            for (int var3 = 0; var3 < this.field1256; ++var3) {
                this.field1268[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field1274;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field1272 = arg0.method367(arg2 ^ -16232);
                                }
                            } else {
                                this.field1254 = arg0.method367(arg2 ^ -16232);
                            }
                        } else {
                            this.field1261 = arg0.method367(1);
                        }
                    } else {
                        this.field1254 = this.field1272 = arg0.method367(1);
                    }
                } else {
                    this.field1277 = arg0.method338((byte) 101);
                    if (this.field1277 < 0) {
                        this.field1270 = new short[this.field1256];
                        for (int var5 = 0; this.field1256 > var5; ++var5) {
                            this.field1270[var5] = (short) arg0.method338((byte) -21);
                        }
                    }
                }
            } else {
                this.field1256 = arg0.method367(arg2 + 16232);
            }
        } else {
            this.field1269 = arg0.method367(1) == 1;
        }
        if (arg2 != -16231) {
            this.field1270 = null;
        }
        ++field1257;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z[II)V")
    private final void method540(boolean arg0, int[] arg1, int arg2) {
        ++field1267;
        int var4 = class123.field1756[arg2] * this.field1272;
        if (arg0) {
            this.field1270 = null;
        }
        if (~this.field1256 != -2) {
            short var5 = this.field1270[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field1268[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field1254 * var6 >> 12;
                int var9 = this.field1272 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = 255 & this.field1263[var10 & 255];
                int var12 = var7 & 4095;
                int var13 = class125.field1775[var12];
                int var14 = var10 - -1;
                if (~var9 >= ~var14) {
                    var14 = 0;
                }
                int var15 = this.field1263[var14 & 255] & 255;
                for (int var16 = 0; ~var16 > ~class131.field1862; ++var16) {
                    int var36 = class82.field1189[var16] * this.field1254;
                    int var37 = this.method536(var12, var13, var15, -123, var6 * var36 >> 12, var11, var8);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; var17 < this.field1256; ++var17) {
                short var18 = this.field1270[var17];
                if (~var18 < -9 || var18 < -8) {
                    int var19 = this.field1268[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = var20 >> 12;
                    int var22 = var21 + 1;
                    int var23 = this.field1272 * var19 >> 12;
                    int var24 = this.field1254 * var19 >> 12;
                    int var25 = this.field1263[var21 & 255] & 255;
                    if (var23 <= var22) {
                        var22 = 0;
                    }
                    int var26 = var20 & 4095;
                    int var27 = this.field1263[255 & var22] & 255;
                    int var28 = class125.field1775[var26];
                    if (this.field1269 && this.field1256 + -1 == var17) {
                        for (int var29 = 0; class131.field1862 > var29; ++var29) {
                            int var30 = class82.field1189[var29] * this.field1254;
                            int var31 = this.method536(var26, var28, var27, -74, var19 * var30 >> 12, var25, var24);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class131.field1862; ++var33) {
                            int var34 = class82.field1189[var33] * this.field1254;
                            int var35 = this.method536(var26, var28, var27, -121, var19 * var34 >> 12, var25, var24);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field1270[0];
            int var39 = this.field1268[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = var40 >> 12;
            int var42 = this.field1272 * var39 >> 12;
            int var43 = 255 & this.field1263[255 & var41];
            int var44 = this.field1254 * var39 >> 12;
            int var45 = var41 + 1;
            if (~var45 <= ~var42) {
                var45 = 0;
            }
            int var46 = var40 & 4095;
            int var47 = this.field1263[255 & var45] & 255;
            int var48 = class125.field1775[var46];
            if (!this.field1269) {
                for (int var49 = 0; ~class131.field1862 < ~var49; ++var49) {
                    int var50 = class82.field1189[var49] * this.field1254;
                    int var51 = this.method536(var46, var48, var47, -114, var39 * var50 >> 12, var43, var44);
                    arg1[var49] = var38 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~class131.field1862 < ~var52; ++var52) {
                    int var53 = class82.field1189[var52] * this.field1254;
                    int var54 = this.method536(var46, var48, var47, -66, var39 * var53 >> 12, var43, var44);
                    int var55 = var38 * var54 >> 12;
                    arg1[var52] = 2048 - -(var55 >> 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(B)V")
    public static final void method541(byte arg0) {
        if (class105.field1522 != null) {
            class154 var1 = class105.field1522;
            synchronized (class105.field1522) {
                class105.field1522 = null;
            }
        }
        ++field1260;
        int var2 = -34 % ((arg0 - -10) / 61);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    public static void method542(int arg0) {
        field1271 = null;
        if (arg0 == -32508) {
            field1276 = null;
            field1262 = null;
        }
    }
}
