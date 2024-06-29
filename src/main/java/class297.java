import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class297 extends class326 {

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "[B")
    private byte[] field3968 = new byte[512];

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public int field3975 = 0;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    public int field3979 = 1638;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
    public int field3980 = 4;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "Z")
    public boolean field3964 = true;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public int field3973 = 4;

    @OriginalMember(owner = "client!ch", name = "hb", descriptor = "I")
    public int field3983 = 4;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field3966 = 0;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "[I")
    public static int[] field3981 = new int[32];

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
    public static int field3978 = 0;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field3976 = -2;

    @OriginalMember(owner = "client!ch", name = "gb", descriptor = "[Lnt;")
    public static class134[] field3982 = new class134[14];

    @OriginalMember(owner = "client!ch", name = "ib", descriptor = "[I")
    public static int[] field3984;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ch", name = "kb", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "[S")
    private short[] field3970;

    @OriginalMember(owner = "client!ch", name = "jb", descriptor = "[S")
    private short[] field3985;

    static {
        new class206("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field3984 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 8)
    public class297() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIII)I", line = 14)
    public static final int method1672(boolean arg0, int arg1, int arg2, int arg3) {
        ++field3971;
        if (arg1 != 6536) {
            return 111;
        } else {
            class257 var4 = class80.method525(arg0, -7967, arg2);
            if (var4 == null) {
                return -1;
            } else {
                return ~arg3 <= -1 && ~var4.field3418.length < ~arg3 ? var4.field3418[arg3] : -1;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)[I", line = 43)
    public final int[] method30(byte arg0, int arg1) {
        ++field3977;
        int[] var3 = super.field4344.method130(arg1, -118);
        if (arg0 > -6) {
            field3984 = null;
        }
        if (super.field4344.field286) {
            this.method1675(var3, -101, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V", line = 66)
    public final void method65(int arg0) {
        this.field3968 = class409.method2458((byte) -117, this.field3975);
        ++field3967;
        this.method1676(-118);
        if (arg0 < -100) {
            for (int var2 = this.field3973 + -1; ~var2 <= -2; --var2) {
                short var3 = this.field3970[var2];
                if (var3 > 8 || ~var3 > 7) {
                    return;
                }
                --this.field3973;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V", line = 95)
    public static void method1673(int arg0) {
        field3984 = null;
        field3981 = null;
        field3982 = null;
        if (arg0 != 512) {
            field3981 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IIIIIII)I", line = 109)
    private final int method1674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3963;
        int var8 = arg6 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (var9 >= arg2) {
            var9 = 0;
        }
        int var11 = arg6 & 4095;
        int var12 = arg0 - 4096;
        int var13 = var9 & 255;
        int var14 = var11 + -4096;
        int var15 = class270.field3607[var11];
        int var16 = 3 & this.field3968[var10 - -arg4];
        int var17;
        if (var16 <= 1) {
            var17 = ~var16 == -1 ? arg0 + var11 : -var11 + arg0;
        } else {
            var17 = ~var16 != -3 ? -arg0 + -var11 : -arg0 + var11;
        }
        int var18 = 3 & this.field3968[var13 - -arg4];
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 == -1 ? arg0 + var14 : -var14 + arg0;
        } else {
            var19 = ~var18 == -3 ? var14 - arg0 : -arg0 + -var14;
        }
        int var20 = var17 - -((-var17 + var19) * var15 >> 12);
        int var21 = this.field3968[arg3 + var10] & 3;
        if (arg1 > -80) {
            this.method1676(124);
        }
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? -var12 + var11 : -var11 + -var12;
        } else {
            var22 = ~var21 != -1 ? -var11 + var12 : var11 - -var12;
        }
        int var23 = this.field3968[var13 - -arg3] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = var23 == 2 ? -var12 + var14 : -var12 + -var14;
        } else {
            var24 = ~var23 != -1 ? -var14 + var12 : var12 + var14;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((-var20 + var25) * arg5 >> 12) + var20;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILbt;I)V", line = 185)
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field3972;
        if (arg2 < -3) {
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    this.field3973 = arg1.method201((byte) -107);
                } else {
                    if (~arg0 != -3) {
                        if (~arg0 == -4) {
                            this.field3983 = this.field3980 = arg1.method201((byte) -108);
                            return;
                        }
                        if (~arg0 == -5) {
                            this.field3975 = arg1.method201((byte) -125);
                            return;
                        }
                        if (~arg0 == -6) {
                            this.field3983 = arg1.method201((byte) -114);
                            return;
                        }
                        if (~arg0 == -7) {
                            this.field3980 = arg1.method201((byte) -109);
                            return;
                        }
                    } else {
                        this.field3979 = arg1.method209((byte) 35);
                        if (this.field3979 < 0) {
                            this.field3970 = new short[this.field3973];
                            for (int var5 = 0; ~var5 > ~this.field3973; ++var5) {
                                this.field3970[var5] = (short) arg1.method209((byte) 35);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field3964 = ~arg1.method201((byte) -124) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([III)V", line = 310)
    public final void method1675(int[] arg0, int arg1, int arg2) {
        ++field3969;
        int var4 = class95.field1400[arg2] * this.field3980;
        if (arg1 > -33) {
            this.field3964 = true;
        }
        if (~this.field3973 != -2) {
            short var5 = this.field3970[0];
            if (~var5 < -9 || ~var5 > 7) {
                int var6 = this.field3985[0] << 12;
                int var7 = this.field3980 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field3983 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                if (var11 >= var7) {
                    var11 = 0;
                }
                int var12 = var8 & 4095;
                int var13 = class270.field3607[var12];
                int var14 = 255 & this.field3968[255 & var10];
                int var15 = this.field3968[255 & var11] & 255;
                for (int var16 = 0; ~class181.field2495 < ~var16; ++var16) {
                    int var36 = class389.field5375[var16] * this.field3983;
                    int var37 = this.method1674(var12, -87, var9, var15, var14, var13, var6 * var36 >> 12);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field3973 > var17; ++var17) {
                short var18 = this.field3970[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field3985[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field3983 * var19 >> 12;
                    int var22 = this.field3980 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    if (var24 >= var22) {
                        var24 = 0;
                    }
                    int var25 = var20 & 4095;
                    int var26 = class270.field3607[var25];
                    int var27 = this.field3968[255 & var23] & 255;
                    int var28 = 255 & this.field3968[var24 & 255];
                    if (this.field3964 && ~(this.field3973 + -1) == ~var17) {
                        for (int var29 = 0; var29 < class181.field2495; ++var29) {
                            int var30 = class389.field5375[var29] * this.field3983;
                            int var31 = this.method1674(var25, -113, var21, var28, var27, var26, var19 * var30 >> 12);
                            int var32 = (var18 * var31 >> 12) + arg0[var29];
                            arg0[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; class181.field2495 > var33; ++var33) {
                            int var34 = class389.field5375[var33] * this.field3983;
                            int var35 = this.method1674(var25, -122, var21, var28, var27, var26, var19 * var34 >> 12);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field3985[0] << 12;
            short var39 = this.field3970[0];
            int var40 = var4 * var38 >> 12;
            int var41 = this.field3980 * var38 >> 12;
            int var42 = this.field3983 * var38 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 - -1;
            int var45 = var40 & 4095;
            if (var44 >= var41) {
                var44 = 0;
            }
            int var46 = this.field3968[var43 & 255] & 255;
            int var47 = class270.field3607[var45];
            int var48 = 255 & this.field3968[255 & var44];
            if (!this.field3964) {
                for (int var49 = 0; class181.field2495 > var49; ++var49) {
                    int var50 = class389.field5375[var49] * this.field3983;
                    int var51 = this.method1674(var45, -115, var42, var48, var46, var47, var38 * var50 >> 12);
                    arg0[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; class181.field2495 > var52; ++var52) {
                    int var53 = class389.field5375[var52] * this.field3983;
                    int var54 = this.method1674(var45, -110, var42, var48, var46, var47, var38 * var53 >> 12);
                    int var55 = var39 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V", line = 493)
    private final void method1676(int arg0) {
        ++field3965;
        if (arg0 > -6) {
            this.method33(106, (class32) null, 67);
        }
        if (~this.field3979 < -1) {
            this.field3985 = new short[this.field3973];
            this.field3970 = new short[this.field3973];
            for (int var2 = 0; var2 < this.field3973; ++var2) {
                this.field3970[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field3979 / 4096.0F), (double) var2)));
                this.field3985[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3970 != null && this.field3970.length == this.field3973) {
            this.field3985 = new short[this.field3973];
            for (int var3 = 0; this.field3973 > var3; ++var3) {
                this.field3985[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }
}
