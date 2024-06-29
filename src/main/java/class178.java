import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class178 extends class215 {

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    private int field2826 = 1638;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    private int field2817 = 4;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "[B")
    private byte[] field2825 = new byte[512];

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    private int field2828 = 0;

    @OriginalMember(owner = "client!qg", name = "jb", descriptor = "I")
    private int field2838 = 4;

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "Z")
    private boolean field2836 = true;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    private int field2831 = 4;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2823 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field2830 = "Hidden";

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field2827 = " from your ignore list first.";

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "[I")
    public static int[] field2832 = new int[2048];

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!qg", name = "kb", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!qg", name = "mb", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!qg", name = "nb", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "Leh;")
    public static class137 field2837;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "[S")
    private short[] field2834;

    @OriginalMember(owner = "client!qg", name = "lb", descriptor = "[S")
    private short[] field2840;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)V")
    public static void method1234(int arg0) {
        field2837 = null;
        field2830 = null;
        field2832 = null;
        field2827 = null;
        if (arg0 != 851105452) {
            field2830 = null;
        }
        field2823 = null;
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)V")
    private final void method1235(int arg0) {
        if (~this.field2826 < arg0) {
            this.field2840 = new short[this.field2838];
            this.field2834 = new short[this.field2838];
            for (int var2 = 0; var2 < this.field2838; ++var2) {
                this.field2840[var2] = (short) ((int) (Math.pow((double) ((float) this.field2826 / 4096.0F), (double) var2) * 4096.0D));
                this.field2834[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2840 != null && this.field2840.length == this.field2838) {
            this.field2834 = new short[this.field2838];
            for (int var3 = 0; var3 < this.field2838; ++var3) {
                this.field2834[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field2819;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method1236(boolean arg0, int arg1, int arg2) {
        ++field2824;
        if (arg2 <= 15) {
            method1240(100);
        }
        return arg0 && ~arg1 <= -1 ? class278.method1850(10, 123, arg1, arg0) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class178() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field2839;
        if (arg1 != 255) {
            this.field2826 = -92;
        }
        int[] var3 = super.field3445.method1755(arg0, (byte) 127);
        if (super.field3445.field4163) {
            this.method1243(arg0, false, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg0 == 1521146348) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (arg1 != 4) {
                                if (~arg1 != -6) {
                                    if (~arg1 == -7) {
                                        this.field2817 = arg2.method584(255);
                                    }
                                } else {
                                    this.field2831 = arg2.method584(arg0 + -1521146093);
                                }
                            } else {
                                this.field2828 = arg2.method584(arg0 ^ 1521146131);
                            }
                        } else {
                            this.field2831 = this.field2817 = arg2.method584(arg0 ^ 1521146131);
                        }
                    } else {
                        this.field2826 = arg2.method564(-91);
                        if (~this.field2826 > -1) {
                            this.field2840 = new short[this.field2838];
                            for (int var5 = 0; ~var5 > ~this.field2838; ++var5) {
                                this.field2840[var5] = (short) arg2.method564(-97);
                            }
                        }
                    }
                } else {
                    this.field2838 = arg2.method584(255);
                }
            } else {
                this.field2836 = ~arg2.method584(255) == -2;
            }
            ++field2841;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        ++field2842;
        this.field2825 = class292.method1962((byte) 1, this.field2828);
        this.method1235(-1);
        for (int var2 = this.field2838 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field2840[var2];
            if (var3 > 8 || ~var3 > 7) {
                break;
            }
            --this.field2838;
        }
        if (arg0 != -49) {
            this.method45(72, 67, (class96) null);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lga;Leh;Leh;BLeh;)Z")
    public static final boolean method1237(class155 arg0, class137 arg1, class137 arg2, byte arg3, class137 arg4) {
        if (arg3 != -26) {
            return false;
        } else {
            class67.field848 = arg0;
            class23.field309 = arg2;
            ++field2821;
            class191.field3079 = arg4;
            class153.field2376 = arg1;
            return true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIBII)I")
    private final int method1238(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field2816;
        int var8 = arg1 + -4096;
        int var9 = arg5 >> 12;
        int var10 = var9 + 1;
        if (~arg6 >= ~var10) {
            var10 = 0;
        }
        int var11 = var9 & 255;
        int var12 = this.field2825[var11 - -arg0] & 3;
        int var13 = arg5 & 4095;
        int var14;
        if (var12 <= 1) {
            var14 = ~var12 == -1 ? arg1 + var13 : -var13 + arg1;
        } else {
            var14 = var12 == 2 ? -arg1 + var13 : -arg1 + -var13;
        }
        if (arg4 <= 85) {
            this.method1235(-49);
        }
        int var15 = var10 & 255;
        int var16 = this.field2825[arg0 + var15] & 3;
        int var17 = class120.field1705[var13];
        int var18 = var13 + -4096;
        int var19;
        if (var16 <= 1) {
            var19 = ~var16 != -1 ? arg1 - var18 : arg1 + var18;
        } else {
            var19 = var16 != 2 ? -arg1 + -var18 : var18 - arg1;
        }
        int var20 = 3 & this.field2825[arg3 + var11];
        int var21 = ((-var14 + var19) * var17 >> 12) + var14;
        int var22;
        if (~var20 >= -2) {
            var22 = var20 != 0 ? -var13 + var8 : var8 + var13;
        } else {
            var22 = ~var20 == -3 ? -var8 + var13 : -var13 - var8;
        }
        int var23 = 3 & this.field2825[arg3 + var15];
        int var24;
        if (~var23 >= -2) {
            var24 = ~var23 != -1 ? var8 - var18 : var8 + var18;
        } else {
            var24 = var23 == 2 ? -var8 + var18 : -var8 + -var18;
        }
        int var25 = ((-var22 + var24) * var17 >> 12) + var22;
        return ((-var21 + var25) * arg2 >> 12) + var21;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIILpb;IJIIII)Z")
    public static final boolean method1239(int arg0, int arg1, int arg2, int arg3, class264 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class255.method1746(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(I)V")
    public static final void method1240(int arg0) {
        if (class129.field2069 == 2) {
            if (~class98.field1297 == ~class95.field1207 && class273.field4369 == class200.field3168) {
                class129.field2069 = 0;
                if (class44.field570 && class36.field467[81] && class34.field437 > 2) {
                    class160.method1115(-14724, class34.field437 + -2);
                } else {
                    class160.method1115(-14724, class34.field437 - 1);
                }
            }
        } else if (~class98.field1297 == ~class107.field1449 && class273.field4369 == class214.field3435) {
            class129.field2069 = 0;
            if (class44.field570 && class36.field467[81] && class34.field437 > 2) {
                class160.method1115(-14724, class34.field437 - 2);
            } else {
                class160.method1115(-14724, class34.field437 + -1);
            }
        } else {
            class200.field3168 = class214.field3435;
            class129.field2069 = 2;
            class95.field1207 = class107.field1449;
        }
        if (arg0 != 4095) {
            field2833 = -64;
        }
        ++field2822;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static final void method1241(boolean arg0) {
        ++field2835;
        int var1 = class209.field3343.length;
        int var2 = 0;
        if (!arg0) {
            while (~var1 < ~var2) {
                if (class209.field3343[var2] != null) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class170.field2701; ++var4) {
                        if (class86.field1056[var2] == class77.field959[var4]) {
                            var3 = var4;
                            break;
                        }
                    }
                    if (~var3 == 0) {
                        class77.field959[class170.field2701] = class86.field1056[var2];
                        var3 = class170.field2701++;
                    }
                    int var5 = 0;
                    class96 var6 = new class96(class209.field3343[var2]);
                    while (~class209.field3343[var2].length < ~var6.field1228 && var5 < 511) {
                        int var7 = var3 | var5++ << 6;
                        int var8 = var6.method549(255);
                        int var9 = var8 >> 14;
                        int var10 = var8 & 63;
                        int var11 = (255 & class86.field1056[var2]) * 64 + -class181.field2883 + var10;
                        int var12 = 63 & var8 >> 7;
                        int var13 = (class86.field1056[var2] >> 8) * 64 + -class167.field2683 + var12;
                        class188 var14 = class130.method888(0, var6.method549(255));
                        if (class265.field4273[var7] == null && ~(1 & var14.field3019) < -1 && class126.field2025 == var9 && var13 >= 0 && var14.field3034 + var13 < 104 && var11 >= 0 && var14.field3034 + var11 < 104) {
                            class265.field4273[var7] = new class200();
                            class200 var15 = class265.field4273[var7];
                            class11.field121[class134.field2122++] = var7;
                            var15.field3797 = class73.field924;
                            var15.method1396((byte) 101, var14);
                            var15.method1634(-1, var15.field3166.field3034);
                            var15.field3835 = var15.field3751 = class45.field580[var15.field3166.field3035];
                            var15.field3769 = var15.field3166.field3008;
                            var15.field3740 = var15.field3166.field3032;
                            if (~var15.field3769 == -1) {
                                var15.field3751 = 0;
                            }
                            var15.method1635(var11, 42, var15.method1638(-6377), true, var13);
                        }
                    }
                }
                ++var2;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1242(byte arg0, long arg1) {
        ++field2829;
        int var3 = -121 / ((64 - arg0) / 36);
        return class124.method815(arg1, (byte) -54);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ[I)V")
    private final void method1243(int arg0, boolean arg1, int[] arg2) {
        ++field2820;
        if (!arg1) {
            int var4 = class76.field956[arg0] * this.field2817;
            if (~this.field2838 != -2) {
                short var5 = this.field2840[0];
                if (var5 > 8 || var5 < -8) {
                    int var6 = this.field2834[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = var7 >> 12;
                    int var9 = var7 & 4095;
                    int var10 = var8 - -1;
                    int var11 = 255 & this.field2825[255 & var8];
                    int var12 = class120.field1705[var9];
                    int var13 = this.field2817 * var6 >> 12;
                    if (var10 >= var13) {
                        var10 = 0;
                    }
                    int var14 = this.field2831 * var6 >> 12;
                    int var15 = this.field2825[255 & var10] & 255;
                    for (int var16 = 0; var16 < class244.field4015; ++var16) {
                        int var36 = class166.field2657[var16] * this.field2831;
                        int var37 = this.method1238(var11, var9, var12, var15, (byte) 88, var6 * var36 >> 12, var14);
                        arg2[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field2838; ++var17) {
                    short var18 = this.field2840[var17];
                    if (var18 > 8 || var18 < -8) {
                        int var19 = this.field2834[var17] << 12;
                        int var20 = var4 * var19 >> 12;
                        int var21 = this.field2817 * var19 >> 12;
                        int var22 = this.field2831 * var19 >> 12;
                        int var23 = var20 >> 12;
                        int var24 = var20 & 4095;
                        int var25 = var23 + 1;
                        int var26 = 255 & this.field2825[var23 & 255];
                        int var27 = class120.field1705[var24];
                        if (~var21 >= ~var25) {
                            var25 = 0;
                        }
                        int var28 = 255 & this.field2825[255 & var25];
                        if (this.field2836 && ~(this.field2838 + -1) == ~var17) {
                            for (int var29 = 0; ~class244.field4015 < ~var29; ++var29) {
                                int var30 = class166.field2657[var29] * this.field2831;
                                int var31 = this.method1238(var26, var24, var27, var28, (byte) 88, var19 * var30 >> 12, var22);
                                int var32 = arg2[var29] - -(var18 * var31 >> 12);
                                arg2[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~class244.field4015; ++var33) {
                                int var34 = class166.field2657[var33] * this.field2831;
                                int var35 = this.method1238(var26, var24, var27, var28, (byte) 124, var19 * var34 >> 12, var22);
                                arg2[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field2834[0] << 12;
                int var39 = this.field2831 * var38 >> 12;
                int var40 = this.field2817 * var38 >> 12;
                short var41 = this.field2840[0];
                int var42 = var4 * var38 >> 12;
                int var43 = var42 >> 12;
                int var44 = var42 & 4095;
                int var45 = this.field2825[255 & var43] & 255;
                int var46 = class120.field1705[var44];
                int var47 = var43 + 1;
                if (~var40 >= ~var47) {
                    var47 = 0;
                }
                int var48 = 255 & this.field2825[var47 & 255];
                if (!this.field2836) {
                    for (int var49 = 0; ~var49 > ~class244.field4015; ++var49) {
                        int var50 = class166.field2657[var49] * this.field2831;
                        int var51 = this.method1238(var45, var44, var46, var48, (byte) 103, var38 * var50 >> 12, var39);
                        arg2[var49] = var41 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; ~class244.field4015 < ~var52; ++var52) {
                        int var53 = class166.field2657[var52] * this.field2831;
                        int var54 = this.method1238(var45, var44, var46, var48, (byte) 121, var38 * var53 >> 12, var39);
                        int var55 = var41 * var54 >> 12;
                        arg2[var52] = (var55 >> 1) + 2048;
                    }
                }
            }
        }
    }
}
