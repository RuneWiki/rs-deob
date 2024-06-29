import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class212 extends class167 {

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    private int field3844 = 1638;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "Z")
    private boolean field3849 = true;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    private int field3847 = 0;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    private int field3852 = 4;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "[B")
    private byte[] field3853 = new byte[512];

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    private int field3854 = 4;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    private int field3846 = 4;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "Lkh;")
    public static class117 field3855 = class224.method1450((byte) 115, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "Lkh;")
    public static class117 field3857 = class224.method1450((byte) 115, "sch-Utteln:");

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "Lkh;")
    public static class117 field3860 = class224.method1450((byte) 3, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "[I")
    public static int[] field3862 = new int[1000];

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    public static int field3858 = 1;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "[S")
    private short[] field3856;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "[S")
    private short[] field3861;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIBIIII)I")
    private final int method1391(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3843;
        int var8 = arg5 + -4096;
        int var9 = -33 % ((-21 - arg2) / 60);
        int var10 = arg6 >> 12;
        int var11 = var10 - -1;
        int var12 = var10 & 255;
        if (~var11 <= ~arg1) {
            var11 = 0;
        }
        int var13 = 3 & this.field3853[var12 - -arg4];
        int var14 = var11 & 255;
        int var15 = arg6 & 4095;
        int var16;
        if (~var13 >= -2) {
            var16 = var13 == 0 ? var15 - -arg5 : -var15 + arg5;
        } else {
            var16 = var13 != 2 ? -arg5 + -var15 : -arg5 + var15;
        }
        int var17 = class155.field2829[var15];
        int var18 = this.field3853[arg4 + var14] & 3;
        int var19 = var15 + -4096;
        int var20;
        if (~var18 >= -2) {
            var20 = ~var18 != -1 ? -var19 + arg5 : arg5 + var19;
        } else {
            var20 = var18 == 2 ? -arg5 + var19 : -arg5 + -var19;
        }
        int var21 = 3 & this.field3853[arg0 + var12];
        int var22 = ((-var16 + var20) * var17 >> 12) + var16;
        int var23;
        if (var21 <= 1) {
            var23 = ~var21 == -1 ? var8 + var15 : var8 - var15;
        } else {
            var23 = var21 != 2 ? -var8 + -var15 : -var8 + var15;
        }
        int var24 = this.field3853[var14 - -arg0] & 3;
        int var25;
        if (~var24 >= -2) {
            var25 = var24 == 0 ? var8 + var19 : -var19 + var8;
        } else {
            var25 = var24 == 2 ? -var8 + var19 : -var8 + -var19;
        }
        int var26 = var23 - -((var25 - var23) * var17 >> 12);
        return ((var26 - var22) * arg3 >> 12) + var22;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static void method1392(boolean arg0) {
        field3862 = null;
        field3860 = null;
        if (!arg0) {
            method1393(87);
        }
        field3857 = null;
        field3855 = null;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
    public static final void method1393(int arg0) {
        ++field3848;
        if (class207.field3717 != null) {
            class207.field3717.method748((byte) -84);
            class207.field3717 = null;
        }
        class156.method1110(0);
        class28.method239();
        for (int var1 = 0; var1 < 4; ++var1) {
            class173.field3123[var1].method17(-1);
        }
        class53.method405((byte) -91);
        System.gc();
        class26.method232(arg0, (byte) 75);
        class115.field2137 = false;
        class184.field3304 = -1;
        class54.method419(-417);
        class94.method647(10, (byte) 61);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (arg0 != -96) {
            this.field3853 = null;
        }
        ++field3850;
        if (super.field3013.field4085) {
            this.method1394(var3, (byte) -6, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([IBI)V")
    private final void method1394(int[] arg0, byte arg1, int arg2) {
        int var4 = class143.field2583[arg2] * this.field3854;
        ++field3851;
        if (arg1 != -6) {
            method1392(false);
        }
        if (~this.field3852 == -2) {
            int var5 = this.field3856[0] << 12;
            int var6 = this.field3846 * var5 >> 12;
            int var7 = var4 * var5 >> 12;
            short var8 = this.field3861[0];
            int var9 = var7 >> 12;
            int var10 = 255 & this.field3853[255 & var9];
            int var11 = var9 + 1;
            int var12 = this.field3854 * var5 >> 12;
            if (var11 >= var12) {
                var11 = 0;
            }
            int var13 = this.field3853[var11 & 255] & 255;
            int var14 = var7 & 4095;
            int var15 = class155.field2829[var14];
            if (this.field3849) {
                for (int var16 = 0; ~var16 > ~class115.field2146; ++var16) {
                    int var17 = class70.field1350[var16] * this.field3846;
                    int var18 = this.method1391(var13, var6, (byte) -100, var15, var10, var14, var5 * var17 >> 12);
                    int var19 = var8 * var18 >> 12;
                    arg0[var16] = 2048 - -(var19 >> 1);
                }
            } else {
                for (int var20 = 0; class115.field2146 > var20; ++var20) {
                    int var21 = class70.field1350[var20] * this.field3846;
                    int var22 = this.method1391(var13, var6, (byte) -114, var15, var10, var14, var5 * var21 >> 12);
                    arg0[var20] = var8 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field3861[0];
            if (~var23 < -9 || var23 < -8) {
                int var24 = this.field3856[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field3854 * var24 >> 12;
                int var27 = var25 >> 12;
                int var28 = var27 - -1;
                if (~var28 <= ~var26) {
                    var28 = 0;
                }
                int var29 = 255 & this.field3853[var28 & 255];
                int var30 = this.field3853[255 & var27] & 255;
                int var31 = this.field3846 * var24 >> 12;
                int var32 = var25 & 4095;
                int var33 = class155.field2829[var32];
                for (int var34 = 0; var34 < class115.field2146; ++var34) {
                    int var54 = class70.field1350[var34] * this.field3846;
                    int var55 = this.method1391(var29, var31, (byte) -119, var33, var30, var32, var24 * var54 >> 12);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field3852; ++var35) {
                short var36 = this.field3861[var35];
                if (var36 > 8 || ~var36 > 7) {
                    int var37 = this.field3856[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field3854 * var37 >> 12;
                    int var40 = var38 >> 12;
                    int var41 = this.field3846 * var37 >> 12;
                    int var42 = var38 & 4095;
                    int var43 = class155.field2829[var42];
                    int var44 = this.field3853[255 & var40] & 255;
                    int var45 = var40 - -1;
                    if (var45 >= var39) {
                        var45 = 0;
                    }
                    int var46 = this.field3853[255 & var45] & 255;
                    if (this.field3849 && ~(this.field3852 - 1) == ~var35) {
                        for (int var47 = 0; class115.field2146 > var47; ++var47) {
                            int var48 = class70.field1350[var47] * this.field3846;
                            int var49 = this.method1391(var46, var41, (byte) 43, var43, var44, var42, var37 * var48 >> 12);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; var51 < class115.field2146; ++var51) {
                            int var52 = class70.field1350[var51] * this.field3846;
                            int var53 = this.method1391(var46, var41, (byte) -114, var43, var44, var42, var37 * var52 >> 12);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class212() {
        super(0, true);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field3854 = arg0.method998(84);
                                }
                            } else {
                                this.field3846 = arg0.method998(86);
                            }
                        } else {
                            this.field3847 = arg0.method998(113);
                        }
                    } else {
                        this.field3846 = this.field3854 = arg0.method998(108);
                    }
                } else {
                    this.field3844 = arg0.method1035(-104);
                    if (~this.field3844 > -1) {
                        this.field3861 = new short[this.field3852];
                        for (int var5 = 0; ~this.field3852 < ~var5; ++var5) {
                            this.field3861[var5] = (short) arg0.method1035(-114);
                        }
                    }
                }
            } else {
                this.field3852 = arg0.method998(80);
            }
        } else {
            this.field3849 = arg0.method998(74) == 1;
        }
        if (arg1) {
            this.field3856 = null;
        }
        ++field3845;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(B)V")
    public static final void method1395(byte arg0) {
        ++field3863;
        if (arg0 >= 39) {
            if (class128.field2361 == null || class60.field1218 == null) {
                class128.field2361 = new int[256];
                class60.field1218 = new int[256];
                for (int var1 = 0; var1 < 256; ++var1) {
                    double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                    class128.field2361[var1] = (int) (Math.sin(var2) * 4096.0D);
                    class60.field1218[var1] = (int) (Math.cos(var2) * 4096.0D);
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        this.field3853 = class128.method874(255, this.field3847);
        this.method1396(-6495);
        int var2 = this.field3852 + -1;
        int var3 = 2 % ((arg0 - -18) / 59);
        while (var2 >= 1) {
            short var4 = this.field3861[var2];
            if (~var4 < -9 || var4 < -8) {
                break;
            }
            --this.field3852;
            --var2;
        }
        ++field3864;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    private final void method1396(int arg0) {
        if (this.field3844 > 0) {
            this.field3856 = new short[this.field3852];
            this.field3861 = new short[this.field3852];
            for (int var2 = 0; var2 < this.field3852; ++var2) {
                this.field3861[var2] = (short) ((int) (Math.pow((double) ((float) this.field3844 / 4096.0F), (double) var2) * 4096.0D));
                this.field3856[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3861 != null && this.field3861.length == this.field3852) {
            this.field3856 = new short[this.field3852];
            for (int var3 = 0; this.field3852 > var3; ++var3) {
                this.field3856[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != -6495) {
            this.field3856 = null;
        }
        ++field3859;
    }
}
