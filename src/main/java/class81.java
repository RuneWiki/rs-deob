import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class81 extends class243 {

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    private int field1399 = 4;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "Z")
    private boolean field1404 = true;

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "I")
    private int field1413 = 4;

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "[B")
    private byte[] field1414 = new byte[512];

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
    private int field1408 = 1638;

    @OriginalMember(owner = "client!cc", name = "rb", descriptor = "I")
    private int field1417 = 4;

    @OriginalMember(owner = "client!cc", name = "tb", descriptor = "I")
    private int field1419 = 0;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    public static int field1403 = 0;

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "Z")
    public static boolean field1409 = false;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!cc", name = "pb", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!cc", name = "sb", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "Lwa;")
    public static class135 field1411;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "Lnh;")
    public static class57 field1401;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "[S")
    private short[] field1405;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "[S")
    private short[] field1406;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([IBI)V")
    private final void method469(int[] arg0, byte arg1, int arg2) {
        ++field1416;
        int var4 = class148.field2582[arg2] * this.field1417;
        if (arg1 != 32) {
            this.field1404 = true;
        }
        if (this.field1413 != 1) {
            short var5 = this.field1405[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field1406[0] << 12;
                int var7 = this.field1417 * var6 >> 12;
                int var8 = this.field1399 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var9 & 4095;
                int var12 = 255 & this.field1414[var10 & 255];
                int var13 = class212.field3581[var11];
                int var14 = var10 + 1;
                if (~var7 >= ~var14) {
                    var14 = 0;
                }
                int var15 = this.field1414[var14 & 255] & 255;
                for (int var16 = 0; ~var16 > ~class212.field3586; ++var16) {
                    int var36 = class212.field3585[var16] * this.field1399;
                    int var37 = this.method474((byte) 83, var11, var13, var12, var15, var8, var6 * var36 >> 12);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; var17 < this.field1413; ++var17) {
                short var18 = this.field1405[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field1406[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field1399 * var19 >> 12;
                    int var22 = var20 >> 12;
                    int var23 = var20 & 4095;
                    int var24 = class212.field3581[var23];
                    int var25 = 255 & this.field1414[255 & var22];
                    int var26 = var22 - -1;
                    int var27 = this.field1417 * var19 >> 12;
                    if (~var26 <= ~var27) {
                        var26 = 0;
                    }
                    int var28 = 255 & this.field1414[var26 & 255];
                    if (this.field1404 && ~(this.field1413 - 1) == ~var17) {
                        for (int var29 = 0; class212.field3586 > var29; ++var29) {
                            int var30 = class212.field3585[var29] * this.field1399;
                            int var31 = this.method474((byte) 57, var23, var24, var25, var28, var21, var19 * var30 >> 12);
                            int var32 = (var18 * var31 >> 12) + arg0[var29];
                            arg0[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; var33 < class212.field3586; ++var33) {
                            int var34 = class212.field3585[var33] * this.field1399;
                            int var35 = this.method474((byte) 64, var23, var24, var25, var28, var21, var19 * var34 >> 12);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field1405[0];
            int var39 = this.field1406[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = var40 >> 12;
            int var42 = this.field1417 * var39 >> 12;
            int var43 = var41 + 1;
            int var44 = var40 & 4095;
            int var45 = this.field1399 * var39 >> 12;
            int var46 = this.field1414[var41 & 255] & 255;
            if (~var43 <= ~var42) {
                var43 = 0;
            }
            int var47 = this.field1414[255 & var43] & 255;
            int var48 = class212.field3581[var44];
            if (!this.field1404) {
                for (int var49 = 0; class212.field3586 > var49; ++var49) {
                    int var50 = class212.field3585[var49] * this.field1399;
                    int var51 = this.method474((byte) -115, var44, var48, var46, var47, var45, var39 * var50 >> 12);
                    arg0[var49] = var38 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; class212.field3586 > var52; ++var52) {
                    int var53 = class212.field3585[var52] * this.field1399;
                    int var54 = this.method474((byte) -96, var44, var48, var46, var47, var45, var39 * var53 >> 12);
                    int var55 = var38 * var54 >> 12;
                    arg0[var52] = 2048 - -(var55 >> 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZILue;)V")
    public static final void method470(boolean arg0, int arg1, class182 arg2) {
        ++field1398;
        int var3 = arg2.field3106;
        int var4 = (int) arg2.field1113;
        arg2.method369(arg1 + 125);
        if (arg0) {
            class108.method672(var3, (byte) 116);
        }
        class172.method1097(65535, var3);
        class105 var5 = class27.method137(var4, -954490064);
        if (var5 != null) {
            class198.method1268(122, var5);
        }
        class94.field1631 = 0;
        field1409 = false;
        class103.method630((byte) 120, class96.field1667, class25.field415, class186.field3165, class69.field1219);
        if (class116.field2131 != arg1) {
            class7.method27(1, class116.field2131, false);
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V")
    private final void method471(int arg0) {
        if (~this.field1408 < -1) {
            this.field1405 = new short[this.field1413];
            this.field1406 = new short[this.field1413];
            for (int var2 = 0; ~this.field1413 < ~var2; ++var2) {
                this.field1405[var2] = (short) ((int) (Math.pow((double) ((float) this.field1408 / 4096.0F), (double) var2) * 4096.0D));
                this.field1406[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1405 != null && this.field1405.length == this.field1413) {
            this.field1406 = new short[this.field1413];
            for (int var3 = 0; var3 < this.field1413; ++var3) {
                this.field1406[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != -11224) {
            this.field1405 = null;
        }
        ++field1415;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)Z")
    public static final boolean method472(int arg0, int arg1) {
        ++field1402;
        if (arg0 != 3) {
            return false;
        } else {
            return ~arg1 <= -98 && ~arg1 >= -123 || arg1 >= 65 && arg1 <= 90;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class81() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field1400;
        if (arg1) {
            field1411 = null;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field1413 = arg0.method1471(255);
            } else {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field1399 = this.field1417 = arg0.method1471(255);
                        return;
                    }
                    if (arg2 == 4) {
                        this.field1419 = arg0.method1471(255);
                        return;
                    }
                    if (arg2 == 5) {
                        this.field1399 = arg0.method1471(255);
                        return;
                    }
                    if (~arg2 == -7) {
                        this.field1417 = arg0.method1471(255);
                        return;
                    }
                } else {
                    this.field1408 = arg0.method1433(126);
                    if (this.field1408 < 0) {
                        this.field1405 = new short[this.field1413];
                        for (int var5 = 0; var5 < this.field1413; ++var5) {
                            this.field1405[var5] = (short) arg0.method1433(118);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field1404 = ~arg0.method1471(255) == -2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
    public static void method473(byte arg0) {
        field1411 = null;
        if (arg0 > 39) {
            field1401 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BIIIIII)I")
    private final int method474(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1412;
        int var8 = arg1 - 4096;
        int var9 = arg6 >> 12;
        int var10 = var9 - -1;
        if (~arg5 >= ~var10) {
            var10 = 0;
        }
        int var11 = var9 & 255;
        int var12 = var10 & 255;
        int var13 = this.field1414[arg3 + var11] & 3;
        int var14 = arg6 & 4095;
        int var15;
        if (var13 > 1) {
            var15 = ~var13 != -3 ? -arg1 + -var14 : -arg1 + var14;
        } else {
            var15 = ~var13 != -1 ? arg1 - var14 : arg1 + var14;
        }
        int var16 = var14 + -4096;
        int var17 = 3 & this.field1414[arg3 + var12];
        int var18 = class212.field3581[var14];
        int var19;
        if (var17 <= 1) {
            var19 = ~var17 != -1 ? -var16 + arg1 : arg1 + var16;
        } else {
            var19 = var17 != 2 ? -arg1 + -var16 : var16 - arg1;
        }
        int var20 = var15 - -((var19 - var15) * var18 >> 12);
        int var21 = this.field1414[arg4 + var11] & 3;
        int var22 = -16 / ((-11 - arg0) / 60);
        int var23;
        if (var21 > 1) {
            var23 = ~var21 != -3 ? -var8 + -var14 : -var8 + var14;
        } else {
            var23 = ~var21 == -1 ? var8 + var14 : -var14 + var8;
        }
        int var24 = this.field1414[arg4 + var12] & 3;
        int var25;
        if (var24 > 1) {
            var25 = var24 == 2 ? -var8 + var16 : -var8 + -var16;
        } else {
            var25 = var24 == 0 ? var16 - -var8 : -var16 + var8;
        }
        int var26 = ((-var23 + var25) * var18 >> 12) + var23;
        return ((var26 - var20) * arg2 >> 12) + var20;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field1407;
        int[] var3 = super.field4215.method984(arg1, 0);
        int var4 = -54 % ((arg0 - -15) / 51);
        if (super.field4215.field2707) {
            this.method469(var3, (byte) 32, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        this.field1414 = class87.method520(255, this.field1419);
        this.method471(-11224);
        ++field1410;
        if (arg0) {
            this.method81((class226) null, true, 78);
        }
        for (int var2 = this.field1413 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field1405[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field1413;
        }
    }
}
