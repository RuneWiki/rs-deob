import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class136 extends class175 {

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    private int field2346 = 0;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "Z")
    private boolean field2357 = true;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "I")
    private int field2359 = 1638;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    private int field2358 = 4;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
    private int field2355 = 4;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "I")
    private int field2360 = 4;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "[B")
    private byte[] field2361 = new byte[512];

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field2343 = 0;

    @OriginalMember(owner = "client!je", name = "fb", descriptor = "Lij;")
    private static class50 field2362 = class78.method578(127, "purple:");

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "Lij;")
    public static class50 field2347 = field2362;

    @OriginalMember(owner = "client!je", name = "hb", descriptor = "Lij;")
    public static class50 field2364 = field2362;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Lkj;")
    public static class56 field2345 = new class56(4096);

    @OriginalMember(owner = "client!je", name = "lb", descriptor = "I")
    public static int field2368 = 0;

    @OriginalMember(owner = "client!je", name = "kb", descriptor = "Lij;")
    private static class50 field2367 = class78.method578(124, "Loaded wordpack");

    @OriginalMember(owner = "client!je", name = "ib", descriptor = "Lij;")
    public static class50 field2365 = field2367;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!je", name = "gb", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!je", name = "mb", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!je", name = "nb", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "[S")
    private short[] field2348;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "[S")
    private short[] field2349;

    @OriginalMember(owner = "client!je", name = "jb", descriptor = "[S")
    public static short[] field2366;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIZ)I")
    private final int method940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg0 + -4096;
        int var9 = arg1 >> 12;
        int var10 = var9 + 1;
        int var11 = arg1 & 4095;
        int var12 = var9 & 255;
        if (var10 >= arg3) {
            var10 = 0;
        }
        int var13 = var11 + -4096;
        int var14 = var10 & 255;
        ++field2354;
        if (!arg6) {
            this.field2348 = null;
        }
        int var15 = 3 & this.field2361[arg5 + var12];
        int var16 = class182.field2995[var11];
        int var17;
        if (~var15 < -2) {
            var17 = var15 == 2 ? -arg0 + var11 : -arg0 + -var11;
        } else {
            var17 = var15 == 0 ? arg0 + var11 : -var11 + arg0;
        }
        int var18 = 3 & this.field2361[arg5 + var14];
        int var19;
        if (~var18 < -2) {
            var19 = ~var18 == -3 ? -arg0 + var13 : -arg0 + -var13;
        } else {
            var19 = ~var18 == -1 ? var13 - -arg0 : -var13 + arg0;
        }
        int var20 = ((var19 - var17) * var16 >> 12) + var17;
        int var21 = 3 & this.field2361[arg2 + var12];
        int var22;
        if (~var21 >= -2) {
            var22 = var21 != 0 ? var8 - var11 : var11 - -var8;
        } else {
            var22 = var21 != 2 ? -var11 - var8 : -var8 + var11;
        }
        int var23 = 3 & this.field2361[arg2 + var14];
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 == -1 ? var8 + var13 : -var13 + var8;
        } else {
            var24 = var23 == 2 ? -var8 + var13 : -var13 - var8;
        }
        int var25 = var22 - -((var24 - var22) * var16 >> 12);
        return ((var25 - var20) * arg4 >> 12) + var20;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
    public static final void method941(boolean arg0, int arg1) {
        ++field2344;
        if (class20.field425 != null) {
            try {
                class217 var2 = new class217(4);
                var2.method1471(arg0 ? 2 : 3, (byte) 24);
                var2.method1440(-2724, arg1);
                class20.field425.method632(0, var2.field3633, 4, true);
            } catch (IOException var4) {
                try {
                    class20.field425.method630(arg1 ^ 2);
                } catch (Exception var3) {
                }
                class20.field425 = null;
                ++class133.field2319;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B[II)V")
    private final void method942(byte arg0, int[] arg1, int arg2) {
        int var4 = class29.field616[arg2] * this.field2358;
        ++field2342;
        if (arg0 >= -28) {
            this.field2361 = null;
        }
        if (this.field2360 == 1) {
            short var5 = this.field2349[0];
            int var6 = this.field2348[0] << 12;
            int var7 = this.field2358 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = var8 >> 12;
            int var10 = var9 + 1;
            int var11 = this.field2361[var9 & 255] & 255;
            int var12 = this.field2355 * var6 >> 12;
            int var13 = var8 & 4095;
            int var14 = class182.field2995[var13];
            if (~var7 >= ~var10) {
                var10 = 0;
            }
            int var15 = 255 & this.field2361[var10 & 255];
            if (this.field2357) {
                for (int var16 = 0; var16 < class211.field3514; ++var16) {
                    int var17 = class129.field2272[var16] * this.field2355;
                    int var18 = this.method940(var13, var6 * var17 >> 12, var15, var12, var14, var11, true);
                    int var19 = var5 * var18 >> 12;
                    arg1[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; ~class211.field3514 < ~var20; ++var20) {
                    int var21 = class129.field2272[var20] * this.field2355;
                    int var22 = this.method940(var13, var6 * var21 >> 12, var15, var12, var14, var11, true);
                    arg1[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field2349[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field2348[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = var25 >> 12;
                int var27 = 255 & this.field2361[var26 & 255];
                int var28 = this.field2358 * var24 >> 12;
                int var29 = var25 & 4095;
                int var30 = this.field2355 * var24 >> 12;
                int var31 = class182.field2995[var29];
                int var32 = var26 + 1;
                if (var32 >= var28) {
                    var32 = 0;
                }
                int var33 = 255 & this.field2361[var32 & 255];
                for (int var34 = 0; var34 < class211.field3514; ++var34) {
                    int var54 = class129.field2272[var34] * this.field2355;
                    int var55 = this.method940(var29, var24 * var54 >> 12, var33, var30, var31, var27, true);
                    arg1[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~var35 > ~this.field2360; ++var35) {
                short var36 = this.field2349[var35];
                if (var36 > 8 || var36 < -8) {
                    int var37 = this.field2348[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = var38 >> 12;
                    int var40 = this.field2358 * var37 >> 12;
                    int var41 = this.field2355 * var37 >> 12;
                    int var42 = var38 & 4095;
                    int var43 = class182.field2995[var42];
                    int var44 = var39 + 1;
                    int var45 = 255 & this.field2361[var39 & 255];
                    if (var44 >= var40) {
                        var44 = 0;
                    }
                    int var46 = 255 & this.field2361[var44 & 255];
                    if (this.field2357 && this.field2360 - 1 == var35) {
                        for (int var47 = 0; ~class211.field3514 < ~var47; ++var47) {
                            int var48 = class129.field2272[var47] * this.field2355;
                            int var49 = this.method940(var42, var37 * var48 >> 12, var46, var41, var43, var45, true);
                            int var50 = arg1[var47] - -(var36 * var49 >> 12);
                            arg1[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; var51 < class211.field3514; ++var51) {
                            int var52 = class129.field2272[var51] * this.field2355;
                            int var53 = this.method940(var42, var37 * var52 >> 12, var46, var41, var43, var45, true);
                            arg1[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2366 = null;
        field2364 = null;
        field2347 = null;
        field2345 = null;
        field2365 = null;
        field2362 = null;
        field2367 = null;
        if (arg0 > -35) {
            method943(105);
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        ++field2356;
        this.field2361 = class48.method358(50, this.field2346);
        this.method945(76);
        if (arg0 != 0) {
            field2364 = null;
        }
        for (int var2 = this.field2360 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field2349[var2];
            if (~var3 < -9 || var3 < -8) {
                return;
            }
            --this.field2360;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class136() {
        super(0, true);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIBI)V")
    public static final void method944(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        for (int var6 = arg1; var6 <= arg3; ++var6) {
            class155.method1090(class177.field2963[var6], arg2, arg5, 160, arg0);
        }
        int var7 = 75 / ((64 - arg4) / 53);
        ++field2351;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (!arg0) {
            this.method940(-60, 98, 121, 81, -13, 23, true);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field2358 = arg2.method1487(255);
                                }
                            } else {
                                this.field2355 = arg2.method1487(255);
                            }
                        } else {
                            this.field2346 = arg2.method1487(255);
                        }
                    } else {
                        this.field2355 = this.field2358 = arg2.method1487(255);
                    }
                } else {
                    this.field2359 = arg2.method1438(121);
                    if (this.field2359 < 0) {
                        this.field2349 = new short[this.field2360];
                        for (int var5 = 0; this.field2360 > var5; ++var5) {
                            this.field2349[var5] = (short) arg2.method1438(-121);
                        }
                    }
                }
            } else {
                this.field2360 = arg2.method1487(255);
            }
        } else {
            this.field2357 = ~arg2.method1487(255) == -2;
        }
        ++field2352;
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
    private final void method945(int arg0) {
        ++field2353;
        if (~this.field2359 < -1) {
            this.field2349 = new short[this.field2360];
            this.field2348 = new short[this.field2360];
            for (int var2 = 0; ~var2 > ~this.field2360; ++var2) {
                this.field2349[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2359 / 4096.0F), (double) var2)));
                this.field2348[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2349 != null && this.field2349.length == this.field2360) {
            this.field2348 = new short[this.field2360];
            for (int var3 = 0; ~var3 > ~this.field2360; ++var3) {
                this.field2348[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 < 40) {
            method943(126);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        if (arg1 != -27746) {
            this.method942((byte) 32, (int[]) null, -10);
        }
        ++field2350;
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            this.method942((byte) -126, var3, arg0);
        }
        return var3;
    }
}
