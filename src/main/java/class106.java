import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class106 extends class84 {

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    private int field1536 = 4;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    private int field1543 = 4;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "[B")
    private byte[] field1542 = new byte[512];

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    private int field1554 = 0;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    private int field1551 = 4;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    private int field1547 = 1638;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "Z")
    private boolean field1545 = true;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field1539 = 0;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    public static int field1546 = 0;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "[Lil;")
    public static class165[] field1552 = new class165[14];

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "Llc;")
    public static class86 field1541;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "[S")
    private short[] field1550;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "[S")
    private short[] field1553;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(I)V")
    private final void method786(int arg0) {
        if (arg0 > 34) {
            ++field1556;
            if (this.field1547 > 0) {
                this.field1553 = new short[this.field1543];
                this.field1550 = new short[this.field1543];
                for (int var2 = 0; ~var2 > ~this.field1543; ++var2) {
                    this.field1553[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1547 / 4096.0F), (double) var2)));
                    this.field1550[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field1553 != null && this.field1553.length == this.field1543) {
                this.field1550 = new short[this.field1543];
                for (int var3 = 0; ~var3 > ~this.field1543; ++var3) {
                    this.field1550[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "(I)V")
    public static void method787(int arg0) {
        if (arg0 == -906055252) {
            field1541 = null;
            field1552 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZIIZILmf;I)Lsi;")
    public static final class204 method788(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, class10 arg5, int arg6) {
        ++field1555;
        int var8 = (arg4 << 17) + (arg6 << 19) + arg1 - -(!arg3 ? 0 : 65536);
        long var9 = (long) arg2 * 3147483667L + (long) var8 * 3849834839L;
        class204 var11 = (class204) class45.field651.method1553(var9, (byte) -92);
        if (var11 != null) {
            return var11;
        } else {
            class47.field682 = false;
            class204 var12 = class50.method387(arg3, arg2, (byte) -54, false, arg5, arg6, arg4, arg0, arg1);
            if (var12 != null && !class47.field682) {
                class45.field651.method1551(var12, 0, var9);
            }
            return var12;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)I")
    private final int method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1538;
        int var8 = arg6 - 4096;
        int var9 = arg4 >> 12;
        int var10 = var9 - -1;
        int var11 = arg4 & 4095;
        int var12 = class244.field3956[var11];
        int var13 = var9 & 255;
        int var14 = this.field1542[arg0 + var13] & 3;
        int var15 = var11 - 4096;
        int var16;
        if (var14 <= 1) {
            var16 = var14 != 0 ? arg6 - var11 : arg6 + var11;
        } else {
            var16 = ~var14 != -3 ? -arg6 + -var11 : var11 - arg6;
        }
        int var17 = -98 / ((arg3 - -20) / 60);
        if (~var10 <= ~arg2) {
            var10 = 0;
        }
        int var18 = var10 & 255;
        int var19 = this.field1542[arg0 + var18] & 3;
        int var20;
        if (~var19 >= -2) {
            var20 = ~var19 != -1 ? -var15 + arg6 : arg6 + var15;
        } else {
            var20 = var19 != 2 ? -arg6 + -var15 : -arg6 + var15;
        }
        int var21 = this.field1542[arg1 + var13] & 3;
        int var22 = ((-var16 + var20) * var12 >> 12) + var16;
        int var23;
        if (~var21 < -2) {
            var23 = var21 != 2 ? -var8 + -var11 : -var8 + var11;
        } else {
            var23 = ~var21 == -1 ? var8 + var11 : var8 - var11;
        }
        int var24 = this.field1542[var18 - -arg1] & 3;
        int var25;
        if (~var24 < -2) {
            var25 = ~var24 == -3 ? var15 - var8 : -var15 - var8;
        } else {
            var25 = var24 != 0 ? -var15 + var8 : var15 - -var8;
        }
        int var26 = ((var25 - var23) * var12 >> 12) + var23;
        return ((-var22 + var26) * arg5 >> 12) + var22;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
    public static final void method790(int arg0, int arg1) {
        class229.field3685.method1548(arg1, 0);
        ++field1540;
        if (arg0 >= -35) {
            field1539 = 124;
        }
        class109.field1577.method1548(arg1, 0);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class106() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(III)Lib;")
    public static final class156 method791(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class156 var4 = var3.field4532;
            var3.field4532 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field1551 = arg0.method1111(255);
                                }
                            } else {
                                this.field1536 = arg0.method1111(255);
                            }
                        } else {
                            this.field1554 = arg0.method1111(255);
                        }
                    } else {
                        this.field1536 = this.field1551 = arg0.method1111(255);
                    }
                } else {
                    this.field1547 = arg0.method1090(12107);
                    if (this.field1547 < 0) {
                        this.field1553 = new short[this.field1543];
                        for (int var5 = 0; ~this.field1543 < ~var5; ++var5) {
                            this.field1553[var5] = (short) arg0.method1090(12107);
                        }
                    }
                }
            } else {
                this.field1543 = arg0.method1111(255);
            }
        } else {
            this.field1545 = ~arg0.method1111(255) == -2;
        }
        if (arg1 <= 87) {
            this.method789(121, 106, 18, 107, 31, -115, -124);
        }
        ++field1549;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([III)V")
    private final void method792(int[] arg0, int arg1, int arg2) {
        if (arg2 == 1638) {
            int var4 = class26.field301[arg1] * this.field1551;
            ++field1544;
            if (~this.field1543 == -2) {
                short var5 = this.field1553[0];
                int var6 = this.field1550[0] << 12;
                int var7 = this.field1536 * var6 >> 12;
                int var8 = this.field1551 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                if (var8 <= var11) {
                    var11 = 0;
                }
                int var12 = var9 & 4095;
                int var13 = class244.field3956[var12];
                int var14 = 255 & this.field1542[var11 & 255];
                int var15 = 255 & this.field1542[255 & var10];
                if (!this.field1545) {
                    for (int var16 = 0; ~class20.field221 < ~var16; ++var16) {
                        int var17 = class184.field2967[var16] * this.field1536;
                        int var18 = this.method789(var15, var14, var7, 110, var6 * var17 >> 12, var13, var12);
                        arg0[var16] = var5 * var18 >> 12;
                    }
                } else {
                    for (int var19 = 0; class20.field221 > var19; ++var19) {
                        int var20 = class184.field2967[var19] * this.field1536;
                        int var21 = this.method789(var15, var14, var7, -121, var6 * var20 >> 12, var13, var12);
                        int var22 = var5 * var21 >> 12;
                        arg0[var19] = (var22 >> 1) + 2048;
                    }
                }
            } else {
                short var23 = this.field1553[0];
                if (~var23 < -9 || var23 < -8) {
                    int var24 = this.field1550[0] << 12;
                    int var25 = this.field1536 * var24 >> 12;
                    int var26 = this.field1551 * var24 >> 12;
                    int var27 = var4 * var24 >> 12;
                    int var28 = var27 >> 12;
                    int var29 = var27 & 4095;
                    int var30 = var28 - -1;
                    int var31 = 255 & this.field1542[var28 & 255];
                    if (~var26 >= ~var30) {
                        var30 = 0;
                    }
                    int var32 = class244.field3956[var29];
                    int var33 = 255 & this.field1542[255 & var30];
                    for (int var34 = 0; ~class20.field221 < ~var34; ++var34) {
                        int var54 = class184.field2967[var34] * this.field1536;
                        int var55 = this.method789(var31, var33, var25, -122, var24 * var54 >> 12, var32, var29);
                        arg0[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; ~var35 > ~this.field1543; ++var35) {
                    short var36 = this.field1553[var35];
                    if (var36 > 8 || var36 < -8) {
                        int var37 = this.field1550[var35] << 12;
                        int var38 = var4 * var37 >> 12;
                        int var39 = var38 >> 12;
                        int var40 = this.field1536 * var37 >> 12;
                        int var41 = this.field1542[255 & var39] & 255;
                        int var42 = var38 & 4095;
                        int var43 = class244.field3956[var42];
                        int var44 = var39 - -1;
                        int var45 = this.field1551 * var37 >> 12;
                        if (~var45 >= ~var44) {
                            var44 = 0;
                        }
                        int var46 = this.field1542[255 & var44] & 255;
                        if (this.field1545 && ~(this.field1543 + -1) == ~var35) {
                            for (int var47 = 0; ~class20.field221 < ~var47; ++var47) {
                                int var48 = class184.field2967[var47] * this.field1536;
                                int var49 = this.method789(var41, var46, var40, arg2 + -1585, var37 * var48 >> 12, var43, var42);
                                int var50 = (var36 * var49 >> 12) + arg0[var47];
                                arg0[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; var51 < class20.field221; ++var51) {
                                int var52 = class184.field2967[var51] * this.field1536;
                                int var53 = this.method789(var41, var46, var40, -112, var37 * var52 >> 12, var43, var42);
                                arg0[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        if (arg0 > -125) {
            return null;
        } else {
            int[] var3 = super.field1228.method1627(-1, arg1);
            ++field1548;
            if (super.field1228.field3651) {
                this.method792(var3, arg1, 1638);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        ++field1557;
        this.field1542 = class265.method1850(this.field1554, arg0);
        this.method786(123);
        for (int var2 = this.field1543 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field1553[var2];
            if (var3 > 8 || ~var3 > 7) {
                return;
            }
            --this.field1543;
        }
    }
}
