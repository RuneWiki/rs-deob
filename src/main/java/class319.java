import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class319 extends class424 {

    @OriginalMember(owner = "client!un", name = "R", descriptor = "I")
    public int field4343 = 4;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "[B")
    private byte[] field4341 = new byte[512];

    @OriginalMember(owner = "client!un", name = "W", descriptor = "I")
    public int field4348 = 4;

    @OriginalMember(owner = "client!un", name = "X", descriptor = "I")
    public int field4349 = 0;

    @OriginalMember(owner = "client!un", name = "V", descriptor = "Z")
    public boolean field4347 = true;

    @OriginalMember(owner = "client!un", name = "db", descriptor = "I")
    public int field4355 = 1638;

    @OriginalMember(owner = "client!un", name = "U", descriptor = "I")
    public int field4346 = 4;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "Lhc;")
    public static class368 field4339 = new class368("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!un", name = "eb", descriptor = "Z")
    public static boolean field4356 = false;

    @OriginalMember(owner = "client!un", name = "fb", descriptor = "Z")
    public static boolean field4357 = true;

    @OriginalMember(owner = "client!un", name = "gb", descriptor = "J")
    public static long field4358 = 0L;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!un", name = "T", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!un", name = "Y", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!un", name = "Z", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!un", name = "bb", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!un", name = "ab", descriptor = "[S")
    private short[] field4352;

    @OriginalMember(owner = "client!un", name = "cb", descriptor = "[S")
    private short[] field4354;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V", line = 3)
    public static void method1945(int arg0) {
        if (arg0 != 4095) {
            field4356 = true;
        }
        field4339 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lrg;BI)V", line = 14)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field4345;
        if (arg1 != -48) {
            this.method1947(-109);
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field4348 = arg0.method2306((byte) 55);
            } else {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field4343 = this.field4346 = arg0.method2306((byte) 88);
                        return;
                    }
                    if (~arg2 == -5) {
                        this.field4349 = arg0.method2306((byte) 76);
                        return;
                    }
                    if (~arg2 == -6) {
                        this.field4343 = arg0.method2306((byte) 112);
                        return;
                    }
                    if (~arg2 == -7) {
                        this.field4346 = arg0.method2306((byte) 65);
                        return;
                    }
                } else {
                    this.field4355 = arg0.method2257((byte) 110);
                    if (this.field4355 < 0) {
                        this.field4354 = new short[this.field4348];
                        for (int var5 = 0; ~this.field4348 < ~var5; ++var5) {
                            this.field4354[var5] = (short) arg0.method2257((byte) 110);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field4347 = arg0.method2306((byte) 26) == 1;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIII)I", line = 106)
    private final int method1946(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4353;
        int var8 = arg2 >> 12;
        int var9 = var8 + 1;
        if (~var9 <= ~arg5) {
            var9 = 0;
        }
        int var10 = arg2 & 4095;
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = arg4 + -4096;
        int var14 = var10 - 4096;
        int var15 = class399.field5528[var10];
        int var16 = this.field4341[var11 - -arg6] & 3;
        int var17;
        if (var16 <= 1) {
            var17 = var16 != 0 ? -var10 + arg4 : arg4 + var10;
        } else {
            var17 = ~var16 == -3 ? -arg4 + var10 : -var10 - arg4;
        }
        int var18 = 3 & this.field4341[var12 - -arg6];
        if (arg0 < 106) {
            this.field4343 = 31;
        }
        int var19;
        if (~var18 < -2) {
            var19 = var18 == 2 ? -arg4 + var14 : -arg4 + -var14;
        } else {
            var19 = var18 == 0 ? var14 - -arg4 : arg4 - var14;
        }
        int var20 = 3 & this.field4341[arg3 + var11];
        int var21 = ((-var17 + var19) * var15 >> 12) + var17;
        int var22;
        if (~var20 < -2) {
            var22 = ~var20 != -3 ? -var10 - var13 : -var13 + var10;
        } else {
            var22 = ~var20 == -1 ? var10 + var13 : var13 - var10;
        }
        int var23 = this.field4341[arg3 + var12] & 3;
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 != -1 ? -var14 + var13 : var14 - -var13;
        } else {
            var24 = var23 == 2 ? var14 - var13 : -var14 - var13;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return var21 - -((-var21 + var25) * arg1 >> 12);
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V", line = 183)
    public final void method113(int arg0) {
        this.field4341 = class367.method2311(arg0 ^ arg0, this.field4349);
        ++field4344;
        this.method1947(2);
        for (int var2 = this.field4348 + -1; var2 >= 1; --var2) {
            short var3 = this.field4354[var2];
            if (~var3 < -9 || var3 < -8) {
                return;
            }
            --this.field4348;
        }
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V", line = 215)
    private final void method1947(int arg0) {
        ++field4342;
        if (~this.field4355 < -1) {
            this.field4352 = new short[this.field4348];
            this.field4354 = new short[this.field4348];
            for (int var2 = 0; this.field4348 > var2; ++var2) {
                this.field4354[var2] = (short) ((int) (Math.pow((double) ((float) this.field4355 / 4096.0F), (double) var2) * 4096.0D));
                this.field4352[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field4354 != null && this.field4354.length == this.field4348) {
            this.field4352 = new short[this.field4348];
            for (int var3 = 0; ~var3 > ~this.field4348; ++var3) {
                this.field4352[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 2) {
            this.field4341 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lti;)V", line = 258)
    public static final void method1948(class5 arg0) {
        for (int var1 = arg0.field52; var1 <= arg0.field47; ++var1) {
            for (int var2 = arg0.field55; var2 <= arg0.field41; ++var2) {
                class63 var3 = class341.field4617[arg0.field42][var1][var2];
                if (var3 != null) {
                    class48 var4 = var3.field853;
                    class48 var5 = null;
                    while (var4 != null) {
                        if (var4.field617 == arg0) {
                            if (var5 != null) {
                                var5.field608 = var4.field608;
                            } else {
                                var3.field853 = var4.field608;
                            }
                            var4.method397((byte) 1);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field608;
                    }
                    var3.field860 = 0;
                    for (class48 var6 = var3.field853; var6 != null; var6 = var6.field608) {
                        var3.field860 = (byte) (var3.field860 | var6.field613);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([III)V", line = 312)
    public final void method1949(int[] arg0, int arg1, int arg2) {
        ++field4351;
        if (arg2 != 4) {
            this.method113(-49);
        }
        int var4 = class409.field5711[arg1] * this.field4346;
        if (~this.field4348 == -2) {
            int var5 = this.field4352[0] << 12;
            short var6 = this.field4354[0];
            int var7 = var4 * var5 >> 12;
            int var8 = this.field4346 * var5 >> 12;
            int var9 = this.field4343 * var5 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 + 1;
            int var12 = var7 & 4095;
            if (~var11 <= ~var8) {
                var11 = 0;
            }
            int var13 = this.field4341[255 & var11] & 255;
            int var14 = 255 & this.field4341[var10 & 255];
            int var15 = class399.field5528[var12];
            if (this.field4347) {
                for (int var16 = 0; var16 < class303.field4135; ++var16) {
                    int var17 = class332.field4478[var16] * this.field4343;
                    int var18 = this.method1946(arg2 + 122, var15, var5 * var17 >> 12, var13, var12, var9, var14);
                    int var19 = var6 * var18 >> 12;
                    arg0[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; ~class303.field4135 < ~var20; ++var20) {
                    int var21 = class332.field4478[var20] * this.field4343;
                    int var22 = this.method1946(arg2 ^ 116, var15, var5 * var21 >> 12, var13, var12, var9, var14);
                    arg0[var20] = var6 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field4354[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field4352[0] << 12;
                int var25 = this.field4343 * var24 >> 12;
                int var26 = this.field4346 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 - -1;
                int var30 = var27 & 4095;
                if (var26 <= var29) {
                    var29 = 0;
                }
                int var31 = this.field4341[var29 & 255] & 255;
                int var32 = 255 & this.field4341[var28 & 255];
                int var33 = class399.field5528[var30];
                for (int var34 = 0; var34 < class303.field4135; ++var34) {
                    int var54 = class332.field4478[var34] * this.field4343;
                    int var55 = this.method1946(123, var33, var24 * var54 >> 12, var31, var30, var25, var32);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; this.field4348 > var35; ++var35) {
                short var36 = this.field4354[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field4352[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field4343 * var37 >> 12;
                    int var40 = this.field4346 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var38 & 4095;
                    if (var40 <= var42) {
                        var42 = 0;
                    }
                    int var44 = this.field4341[255 & var41] & 255;
                    int var45 = class399.field5528[var43];
                    int var46 = 255 & this.field4341[var42 & 255];
                    if (this.field4347 && this.field4348 - 1 == var35) {
                        for (int var47 = 0; var47 < class303.field4135; ++var47) {
                            int var48 = class332.field4478[var47] * this.field4343;
                            int var49 = this.method1946(126, var45, var37 * var48 >> 12, var46, var43, var39, var44);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; class303.field4135 > var51; ++var51) {
                            int var52 = class332.field4478[var51] * this.field4343;
                            int var53 = this.method1946(112, var45, var37 * var52 >> 12, var46, var43, var39, var44);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lij;I)V", line = 472)
    public static final void method1950(class316 arg0, int arg1) {
        class118.field1798 = arg0.method1909(-1, "titlebg");
        int var2 = 31 % ((-73 - arg1) / 46);
        ++field4340;
        class381.field5249 = arg0.method1909(-1, "logo");
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 503)
    public class319() {
        super(0, true);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(IB)[I", line = 529)
    public final int[] method43(int arg0, byte arg1) {
        ++field4350;
        int[] var3 = super.field5892.method783(arg0, (byte) 111);
        if (arg1 != -10) {
            method1945(13);
        }
        if (super.field5892.field1427) {
            this.method1949(var3, arg0, 4);
        }
        return var3;
    }
}
