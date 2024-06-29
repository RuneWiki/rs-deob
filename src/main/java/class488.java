import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public abstract class class488 {

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    private int field7389 = 0;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public int field7388 = 4;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
    private int field7391 = 4;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
    private int field7394 = 4;

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "[S")
    private short[] field7396 = new short[512];

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "I")
    private int field7398 = 4;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "[S")
    private short[] field7397;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2954(int arg0) {
        class604.field8896.method974(class300.field4401, class94.field1158.field265 ? class616.field9018 + 256 << 0 : -1, arg0);
        field7395++;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(IIIII)V", line = 478)
    public class488(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7394 = arg2;
        this.field7398 = arg4;
        this.field7389 = arg0;
        this.field7391 = arg3;
        this.field7388 = arg1;
        this.method2955(80);
        this.method2959((byte) -112);
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V", line = 27)
    private final void method2955(int arg0) {
        this.field7397 = new short[this.field7388];
        field7392++;
        for (int var2 = 0; var2 < this.field7388; var2++) {
            this.field7397[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 <= 6) {
            this.field7398 = 65;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIILjava/lang/Class;)Llba;", line = 51)
    public static final class237 method2956(int arg0, int arg1, int arg2, Class arg3) {
        class415 var4 = class526.field7777[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class639 var5 = var4.field5981; var5 != null; var5 = var5.field9291) {
            class237 var6 = var5.field9288;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3469 == arg1 && var6.field3472 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V", line = 78)
    public static final void method2957(int arg0) {
        if (arg0 != 2020) {
            method2956(14, -6, -128, null);
        }
        field7393++;
        class78.method454();
        for (int var1 = 0; var1 < 4; var1++) {
            class67.field772[var1].method481(55);
        }
        class10.method49(true);
        class151.method883((byte) 90);
        System.gc();
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIILcd;)V", line = 107)
    public static final void method2958(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        field7387++;
        class229 var5 = arg4.method513(arg2);
        int var6 = arg4.field1046 - arg4.field1067.field3126 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg4.field1016 > 25) {
                arg4.field1065 = false;
                if (arg1 < 0 && var5.field3371 != -1) {
                    arg4.field1039 = var5.field3371;
                } else if (arg1 <= 0 || var5.field3392 == -1) {
                    arg4.field1039 = var5.field3401;
                } else {
                    arg4.field1039 = var5.field3392;
                }
            } else if (!arg4.field1065 || !var5.method1494(arg4.field1039, (byte) 86)) {
                arg4.field1039 = var5.method1493(true);
                arg4.field1065 = arg4.field1039 != -1;
            }
        } else if (arg4.field1037 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class85.field984[arg0] - arg4.field1067.field3126 & 0x3FFF;
            if (arg3 == 2 && var5.field3379 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3400 != -1) {
                    arg4.field1039 = var5.field3400;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3367 != -1) {
                    arg4.field1039 = var5.field3367;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3398 == -1) {
                    arg4.field1039 = var5.field3379;
                } else {
                    arg4.field1039 = var5.field3398;
                }
            } else if (arg3 == 0 && var5.field3377 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3363 != -1) {
                    arg4.field1039 = var5.field3363;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3372 != -1) {
                    arg4.field1039 = var5.field3372;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3370 == -1) {
                    arg4.field1039 = var5.field3377;
                } else {
                    arg4.field1039 = var5.field3370;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field3391 != -1) {
                arg4.field1039 = var5.field3391;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field3358 != -1) {
                arg4.field1039 = var5.field3358;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field3393 == -1) {
                arg4.field1039 = var5.field3401;
            } else {
                arg4.field1039 = var5.field3393;
            }
            arg4.field1065 = false;
        } else if (var6 == 0 && arg4.field1016 <= 25) {
            arg4.field1065 = false;
            if (arg3 == 2 && var5.field3379 != -1) {
                arg4.field1039 = var5.field3379;
            } else if (arg3 == 0 && var5.field3377 != -1) {
                arg4.field1039 = var5.field3377;
            } else {
                arg4.field1039 = var5.field3401;
            }
        } else {
            arg4.field1065 = false;
            if (arg3 == 2 && var5.field3379 != -1) {
                if (arg1 < 0 && var5.field3395 != -1) {
                    arg4.field1039 = var5.field3395;
                } else if (arg1 <= 0 || var5.field3403 == -1) {
                    arg4.field1039 = var5.field3379;
                } else {
                    arg4.field1039 = var5.field3403;
                }
            } else if (arg3 == 0 && var5.field3377 != -1) {
                if (arg1 < 0 && var5.field3384 != -1) {
                    arg4.field1039 = var5.field3384;
                } else if (arg1 <= 0 || var5.field3385 == -1) {
                    arg4.field1039 = var5.field3377;
                } else {
                    arg4.field1039 = var5.field3385;
                }
            } else if (arg1 < 0 && var5.field3374 != -1) {
                arg4.field1039 = var5.field3374;
            } else if (arg1 <= 0 || var5.field3360 == -1) {
                arg4.field1039 = var5.field3401;
            } else {
                arg4.field1039 = var5.field3360;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)V", line = 264)
    private final void method2959(byte arg0) {
        field7386++;
        Random var2 = new Random((long) this.field7389);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field7396[var3] = (short) var3;
        }
        if (arg0 > -40) {
            this.field7388 = -99;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class296.method1832(false, var5, var2);
            short var7 = this.field7396[var6];
            this.field7396[var6] = this.field7396[var5];
            this.field7396[var5] = this.field7396[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIII)V", line = 301)
    public final void method2960(int arg0, int arg1, int arg2, int arg3) {
        field7390++;
        if (arg0 != 4095) {
            this.method203(103, 44, 88);
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method205((byte) 2);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field7388; var14++) {
                        int var15 = this.field7397[var14] << 12;
                        int var16 = this.field7391 * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field7394 * var15 >> 12;
                        int var20 = this.field7398 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field7398 * var17;
                        int var23 = this.field7391 * var21;
                        int var24 = this.field7394 * var18;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34;
                        if (var20 > var32) {
                            var34 = var32 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36;
                        if (var29 >= var16) {
                            var36 = 0;
                        } else {
                            var36 = var29 & 0xFF;
                        }
                        int var37 = var24 & 0xFFF;
                        int var38;
                        if (var26 < var19) {
                            var38 = var26 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var31 & 0xFF;
                        int var40 = class295.field4322[var37];
                        int var41 = var33 - 4096;
                        int var42 = class295.field4322[var33];
                        short var43 = this.field7396[var39];
                        int var44 = var37 - 4096;
                        short var45 = this.field7396[var34];
                        int var46 = var35 - 4096;
                        int var47 = class295.field4322[var35];
                        short var48 = this.field7396[var30 + var43];
                        short var49 = this.field7396[var30 + var45];
                        short var50 = this.field7396[var36 + var43];
                        short var51 = this.field7396[var36 + var45];
                        int var52 = class99.method578((byte) -101, this.field7396[var27 + var48], var33, var37, var35);
                        int var53 = class99.method578((byte) -98, this.field7396[var38 + var48], var33, var44, var35);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class99.method578((byte) -78, this.field7396[var27 + var50], var41, var37, var35);
                        int var56 = class99.method578((byte) 106, this.field7396[var38 + var50], var41, var44, var35);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = ((var57 - var54) * var42 >> 12) + var54;
                        int var59 = class99.method578((byte) 112, this.field7396[var27 + var49], var33, var37, var46);
                        int var60 = class99.method578((byte) 69, this.field7396[var38 + var49], var33, var44, var46);
                        int var61 = ((var60 - var59) * var40 >> 12) + var59;
                        int var62 = class99.method578((byte) -70, this.field7396[var27 + var51], var41, var37, var46);
                        int var63 = class99.method578((byte) -105, this.field7396[var38 + var51], var41, var44, var46);
                        int var64 = ((var63 - var62) * var40 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var42 >> 12);
                        this.method203(var14, 40, ((var65 - var58) * var47 >> 12) + var58);
                    }
                    this.method202(48);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
    public abstract void method205(byte arg0);

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)V")
    public abstract void method203(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)V")
    public abstract void method202(int arg0);
}
