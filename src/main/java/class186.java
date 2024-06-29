import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class186 {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    private int field3303 = 4;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public int field3301 = 4;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "[S")
    private short[] field3308 = new short[512];

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    private int field3309 = 4;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field3306 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    private int field3298 = 4;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "[Loh;")
    public static class258[] field3313 = new class258[100];

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field3307 = 127;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lgb;")
    public static class213 field3300;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[S")
    private short[] field3302;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lvh;", line = 17)
    public static final class61 method1256(byte arg0, int arg1) {
        if (arg0 < 108) {
            method1257(26);
        }
        field3311++;
        class61 var2 = (class61) class51.field819.method1159((byte) 123, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class251.field4325.method1453(class285.method2002(arg1, true), (byte) -36, class91.method679(arg1, -26276));
        class61 var4 = new class61();
        var4.field1089 = arg1;
        if (var3 != null) {
            var4.method478(-104, new class235(var3));
        }
        var4.method470(true);
        if (var4.field1027 != -1) {
            var4.method474(method1256((byte) 110, var4.field1027), method1256((byte) 110, var4.field1018), true);
        }
        if (var4.field1048 != -1) {
            var4.method472(method1256((byte) 114, var4.field1054), true, method1256((byte) 110, var4.field1048));
        }
        if (!class122.field2170 && var4.field1052) {
            var4.field1024 = 0;
            var4.field1014 = false;
            var4.field1066 = null;
            var4.field1038 = null;
            var4.field1053 = class5.field75;
        }
        class51.field819.method1163(var4, -1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 61)
    public static void method1257(int arg0) {
        field3300 = null;
        int var1 = -53 / ((37 - arg0) / 32);
        field3313 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 76)
    private final void method1258(boolean arg0) {
        Random var2 = new Random((long) this.field3306);
        if (arg0) {
            method1265(-6);
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3308[var3] = (short) var3;
        }
        field3312++;
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class285.method1996(1, var2, var5);
            short var7 = this.field3308[var6];
            this.field3308[var6] = this.field3308[var5];
            this.field3308[var5] = this.field3308[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V", line = 116)
    public static final void method1259(int arg0, int arg1, int arg2) {
        field3299++;
        if (arg0 != 5638) {
            field3307 = -63;
        }
        class286 var3 = class48.method389(arg1, 1, 10738);
        var3.method2017(-28);
        var3.field4932 = arg2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 133)
    public static final void method1260(byte arg0) {
        for (int var1 = 0; var1 < class164.field2768; var1++) {
            class167 var2 = class176.method1214(120, var1);
            if (var2 != null && var2.field2832 == 0) {
                class12.field157[var1] = 0;
                class227.field3917[var1] = 0;
            }
        }
        field3314++;
        class103.field1875 = new class144(16);
        if (arg0 > -84) {
            method1256((byte) -24, -9);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIB)V", line = 164)
    public final void method1261(int arg0, int arg1, int arg2, byte arg3) {
        field3315++;
        if (arg3 != 19) {
            this.method1261(35, -10, -5, (byte) -35);
        }
        int[] var5 = new int[arg2];
        for (int var6 = 0; var6 < arg2; var6++) {
            var5[var6] = (var6 << 12) / arg2;
        }
        int[] var7 = new int[arg0];
        int[] var8 = new int[arg1];
        for (int var9 = 0; var9 < arg1; var9++) {
            var8[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method1264(-92);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field3301; var14++) {
                        int var15 = this.field3302[var14] << 12;
                        int var16 = this.field3309 * var15 >> 12;
                        int var17 = var8[var12] * var15 >> 12;
                        int var18 = this.field3309 * var17;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = this.field3303 * var19;
                        int var21 = this.field3303 * var15 >> 12;
                        int var22 = var20 >> 12;
                        int var23 = this.field3298 * var15 >> 12;
                        int var24 = var22 + 1;
                        int var25 = var22 & 0xFF;
                        int var26;
                        if (var24 < var21) {
                            var26 = var24 & 0xFF;
                        } else {
                            var26 = 0;
                        }
                        int var27 = var20 & 0xFFF;
                        int var28 = var27 - 4096;
                        int var29 = class265.field4625[var27];
                        int var30 = var18 >> 12;
                        int var31 = var18 & 0xFFF;
                        int var32 = class265.field4625[var31];
                        int var33 = var30 + 1;
                        int var34 = var7[var11] * var15 >> 12;
                        int var35 = var30 & 0xFF;
                        int var36;
                        if (var16 > var33) {
                            var36 = var33 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = this.field3298 * var34;
                        int var38 = var31 - 4096;
                        int var39 = var37 >> 12;
                        int var40 = var37 & 0xFFF;
                        int var41 = var40 - 4096;
                        int var42 = class265.field4625[var40];
                        int var43 = var39 + 1;
                        int var44 = var39 & 0xFF;
                        int var45;
                        if (var23 > var43) {
                            var45 = var43 & 0xFF;
                        } else {
                            var45 = 0;
                        }
                        short var46 = this.field3308[var44];
                        short var47 = this.field3308[var36 + var46];
                        short var48 = this.field3308[var35 + var46];
                        short var49 = this.field3308[var45];
                        short var50 = this.field3308[var36 + var49];
                        short var51 = this.field3308[var35 + var49];
                        int var52 = class84.method608(var31, var27, var40, this.field3308[var25 + var48], false);
                        int var53 = class84.method608(var31, var28, var40, this.field3308[var26 + var48], false);
                        int var54 = ((var53 - var52) * var29 >> 12) + var52;
                        int var55 = class84.method608(var38, var27, var40, this.field3308[var25 + var47], false);
                        int var56 = class84.method608(var38, var28, var40, this.field3308[var26 + var47], false);
                        int var57 = ((var56 - var55) * var29 >> 12) + var55;
                        int var58 = class84.method608(var31, var27, var41, this.field3308[var25 + var51], false);
                        int var59 = ((var57 - var54) * var32 >> 12) + var54;
                        int var60 = class84.method608(var31, var28, var41, this.field3308[var26 + var51], false);
                        int var61 = var58 + ((var60 - var58) * var29 >> 12);
                        int var62 = class84.method608(var38, var27, var41, this.field3308[var25 + var50], false);
                        int var63 = class84.method608(var38, var28, var41, this.field3308[var26 + var50], false);
                        int var64 = ((var63 - var62) * var29 >> 12) + var62;
                        int var65 = ((var64 - var61) * var32 >> 12) + var61;
                        this.method1267(4, var14, ((var65 - var59) * var42 >> 12) + var59);
                    }
                    this.method1266((byte) 82);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIB)V", line = 330)
    public static final void method1262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg2 >= 0 && arg1 >= 0 && arg2 < 103 && arg1 < 103) {
            if (arg3 == 0) {
                class23 var8 = class219.method1488(arg0, arg2, arg1);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field298 >>> 32);
                    if (arg5 == 2) {
                        var8.field291 = new class43(var9, 2, arg6 + 4, arg0, arg2, arg1, arg4, false, var8.field291);
                        var8.field289 = new class43(var9, 2, arg6 + 1 & 0x3, arg0, arg2, arg1, arg4, false, var8.field289);
                    } else {
                        var8.field291 = new class43(var9, arg5, arg6, arg0, arg2, arg1, arg4, false, var8.field291);
                    }
                }
            }
            if (arg3 == 1) {
                class263 var10 = class217.method1469(arg0, arg2, arg1);
                if (var10 != null) {
                    int var11 = (int) (var10.field4584 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 4 || arg5 == 5) {
                        var10.field4566 = new class43(var11, 4, arg6, arg0, arg2, arg1, arg4, false, var10.field4566);
                    } else if (arg5 == 6) {
                        var10.field4566 = new class43(var11, 4, arg6 + 4, arg0, arg2, arg1, arg4, false, var10.field4566);
                    } else if (arg5 == 7) {
                        var10.field4566 = new class43(var11, 4, (arg6 + 2 & 0x3) + 4, arg0, arg2, arg1, arg4, false, var10.field4566);
                    } else if (arg5 == 8) {
                        var10.field4566 = new class43(var11, 4, arg6 + 4, arg0, arg2, arg1, arg4, false, var10.field4566);
                        var10.field4573 = new class43(var11, 4, (arg6 + 2 & 0x3) + 4, arg0, arg2, arg1, arg4, false, var10.field4573);
                    }
                }
            }
            if (arg3 == 2) {
                class219 var12 = class3.method21(arg0, arg2, arg1);
                if (arg5 == 11) {
                    arg5 = 10;
                }
                if (var12 != null) {
                    var12.field3801 = new class43(Integer.MAX_VALUE & (int) (var12.field3795 >>> 32), arg5, arg6, arg0, arg2, arg1, arg4, false, var12.field3801);
                }
            }
            if (arg3 == 3) {
                class250 var13 = class56.method437(arg0, arg2, arg1);
                if (var13 != null) {
                    var13.field4310 = new class43((int) (var13.field4306 >>> 32) & Integer.MAX_VALUE, 22, arg6, arg0, arg2, arg1, arg4, false, var13.field4310);
                }
            }
        }
        field3305++;
        if (arg7 != -61) {
            method1257(111);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIIII)V", line = 492)
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3301 = arg1;
        this.field3306 = arg0;
        this.field3298 = arg4;
        this.field3309 = arg3;
        this.field3303 = arg2;
        this.method1263((byte) -18);
        this.method1258(false);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 426)
    private final void method1263(byte arg0) {
        field3304++;
        this.field3302 = new short[this.field3301];
        for (int var2 = 0; var2 < this.field3301; var2++) {
            this.field3302[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != -18) {
            this.method1263((byte) 19);
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V", line = 469)
    public static final void method1265(int arg0) {
        int var1 = 50 / ((arg0 + 68) / 55);
        class173.field3095.method1161(99);
        field3310++;
        class38.field504.method1161(109);
        class159.field2712.method1161(-48);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public abstract void method1264(int arg0);

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
    public abstract void method1266(byte arg0);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)V")
    public abstract void method1267(int arg0, int arg1, int arg2);
}
