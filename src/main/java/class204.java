import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class204 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    private int field3359 = 4;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[S")
    private short[] field3363 = new short[512];

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    private int field3362 = 0;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    private int field3369 = 4;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    private int field3370 = 4;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public int field3373 = 4;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lph;")
    public static class229 field3360 = class266.method1858("l", 0);

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Ljava/lang/Thread;")
    public static Thread field3364;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[S")
    private short[] field3358;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 7)
    private final void method1425(boolean arg0) {
        field3365++;
        if (!arg0) {
            this.field3358 = new short[this.field3373];
            for (int var2 = 0; var2 < this.field3373; var2++) {
                this.field3358[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lsi;Lsi;I)I", line = 33)
    public static final int method1426(class66 arg0, class66 arg1, int arg2) {
        field3366++;
        int var3 = 0;
        if (arg1.method494(class107.field1818, false)) {
            var3++;
        }
        if (arg1.method494(class17.field242, false)) {
            var3++;
        }
        if (arg1.method494(class5.field62, false)) {
            var3++;
        }
        if (arg0.method494(class107.field1818, false)) {
            var3++;
        }
        if (arg0.method494(class17.field242, false)) {
            var3++;
        }
        if (arg0.method494(class5.field62, false)) {
            var3++;
        }
        if (arg2 != -24975) {
            field3364 = (Thread) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 66)
    private final void method1427(int arg0) {
        Random var2 = new Random((long) this.field3362);
        field3368++;
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3363[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 != -930495712) {
            return;
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class113.method861(var5, (byte) -24, var2);
            short var7 = this.field3363[var6];
            this.field3363[var6] = this.field3363[var5];
            this.field3363[var5] = this.field3363[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZJ)V", line = 114)
    public static final void method1428(boolean arg0, long arg1) {
        field3367++;
        class121.field2033.field2670 = 0;
        class121.field2033.method1188(-98, 7);
        class121.field2033.method1208((byte) -6, arg1);
        class4.field42 = -3;
        class228.field3751 = 0;
        class211.field3490 = 1;
        class263.field4404 = 0;
        if (!arg0) {
            field3360 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIIIIIII)V", line = 132)
    public static final void method1429(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3371++;
        int var8 = -77 / ((-arg0 - 57) / 40);
        if (arg2 < 0 || arg4 < 0 || arg2 >= 103 || arg4 >= 103) {
            return;
        }
        if (arg3 == 0) {
            class207 var9 = class301.method2023(arg5, arg2, arg4);
            if (var9 != null) {
                int var10 = (int) (var9.field3414 >>> 32) & Integer.MAX_VALUE;
                if (arg6 == 2) {
                    var9.field3416 = new class27(var10, 2, arg1 + 4, arg5, arg2, arg4, arg7, false, var9.field3416);
                    var9.field3403 = new class27(var10, 2, arg1 + 1 & 0x3, arg5, arg2, arg4, arg7, false, var9.field3403);
                } else {
                    var9.field3416 = new class27(var10, arg6, arg1, arg5, arg2, arg4, arg7, false, var9.field3416);
                }
            }
        }
        if (arg3 == 1) {
            class88 var11 = class235.method1667(arg5, arg2, arg4);
            if (var11 != null) {
                int var12 = Integer.MAX_VALUE & (int) (var11.field1502 >>> 32);
                if (arg6 == 4 || arg6 == 5) {
                    var11.field1494 = new class27(var12, 4, arg1, arg5, arg2, arg4, arg7, false, var11.field1494);
                } else if (arg6 == 6) {
                    var11.field1494 = new class27(var12, 4, arg1 + 4, arg5, arg2, arg4, arg7, false, var11.field1494);
                } else if (arg6 == 7) {
                    var11.field1494 = new class27(var12, 4, (arg1 + 2 & 0x3) + 4, arg5, arg2, arg4, arg7, false, var11.field1494);
                } else if (arg6 == 8) {
                    var11.field1494 = new class27(var12, 4, arg1 + 4, arg5, arg2, arg4, arg7, false, var11.field1494);
                    var11.field1489 = new class27(var12, 4, (arg1 + 2 & 0x3) + 4, arg5, arg2, arg4, arg7, false, var11.field1489);
                }
            }
        }
        if (arg3 == 2) {
            if (arg6 == 11) {
                arg6 = 10;
            }
            class152 var13 = class149.method1086(arg5, arg2, arg4);
            if (var13 != null) {
                var13.field2461 = new class27(Integer.MAX_VALUE & (int) (var13.field2479 >>> 32), arg6, arg1, arg5, arg2, arg4, arg7, false, var13.field2461);
            }
        }
        if (arg3 == 3) {
            class162 var14 = class184.method1299(arg5, arg2, arg4);
            if (var14 != null) {
                var14.field2607 = new class27(Integer.MAX_VALUE & (int) (var14.field2615 >>> 32), 22, arg1, arg5, arg2, arg4, arg7, false, var14.field2607);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIII)V", line = 430)
    public class204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3362 = arg0;
        this.field3370 = arg2;
        this.field3359 = arg3;
        this.field3373 = arg1;
        this.field3369 = arg4;
        this.method1425(false);
        this.method1427(-930495712);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V", line = 243)
    public final void method1430(int arg0, int arg1, int arg2, int arg3) {
        field3372++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg2];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg3; var9++) {
            var8[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var6[var10] = (var10 << 12) / arg2;
        }
        if (arg0 != 6960) {
            method1429((byte) 19, -78, 25, -75, 91, 80, 29, -24);
        }
        this.method490(arg0 ^ 0xFFFFE4BD);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field3373; var14++) {
                        int var15 = this.field3358[var14] << 12;
                        int var16 = var6[var11] * var15 >> 12;
                        int var17 = var8[var12] * var15 >> 12;
                        int var18 = this.field3369 * var16;
                        int var19 = this.field3369 * var15 >> 12;
                        int var20 = this.field3359 * var17;
                        int var21 = var18 >> 12;
                        int var22 = this.field3370 * var15 >> 12;
                        int var23 = var18 & 0xFFF;
                        int var24 = var21 + 1;
                        int var25 = this.field3359 * var15 >> 12;
                        int var26 = var5[var13] * var15 >> 12;
                        int var27 = var23 - 4096;
                        int var28 = class165.field2697[var23];
                        int var29 = this.field3370 * var26;
                        int var30;
                        if (var19 <= var24) {
                            var30 = 0;
                        } else {
                            var30 = var24 & 0xFF;
                        }
                        int var31 = var21 & 0xFF;
                        short var32 = this.field3363[var30];
                        int var33 = var29 >> 12;
                        int var34 = var33 + 1;
                        short var35 = this.field3363[var31];
                        int var36 = var20 >> 12;
                        int var37 = var20 & 0xFFF;
                        int var38 = class165.field2697[var37];
                        int var39;
                        if (var22 > var34) {
                            var39 = var34 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = var36 + 1;
                        int var41 = var36 & 0xFF;
                        short var42 = this.field3363[var35 + var41];
                        int var43 = var29 & 0xFFF;
                        int var44 = class165.field2697[var43];
                        int var45 = var43 - 4096;
                        int var46 = var33 & 0xFF;
                        int var47;
                        if (var40 < var25) {
                            var47 = var40 & 0xFF;
                        } else {
                            var47 = 0;
                        }
                        short var48 = this.field3363[var41 + var32];
                        int var49 = var37 - 4096;
                        short var50 = this.field3363[var32 + var47];
                        short var51 = this.field3363[var35 + var47];
                        int var52 = class330.method2259(this.field3363[var46 + var42], var43, var23, var37, 63);
                        int var53 = class330.method2259(this.field3363[var39 + var42], var45, var23, var37, 63);
                        int var54 = ((var53 - var52) * var44 >> 12) + var52;
                        int var55 = class330.method2259(this.field3363[var46 + var51], var43, var23, var49, arg0 ^ 0x1B0F);
                        int var56 = class330.method2259(this.field3363[var39 + var51], var45, var23, var49, 63);
                        int var57 = ((var56 - var55) * var44 >> 12) + var55;
                        int var58 = class330.method2259(this.field3363[var46 + var48], var43, var27, var37, 63);
                        int var59 = class330.method2259(this.field3363[var39 + var48], var45, var27, var37, arg0 ^ 0x1B0F);
                        int var60 = ((var57 - var54) * var38 >> 12) + var54;
                        int var61 = ((var59 - var58) * var44 >> 12) + var58;
                        int var62 = class330.method2259(this.field3363[var46 + var50], var43, var27, var49, 63);
                        int var63 = class330.method2259(this.field3363[var39 + var50], var45, var27, var49, 63);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var38 >> 12);
                        this.method486(((var65 - var60) * var28 >> 12) + var60, var14, -13897);
                    }
                    this.method487(-1331241396);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V", line = 408)
    public static void method1431(int arg0) {
        field3360 = null;
        field3364 = null;
        if (arg0 < 73) {
            field3364 = (Thread) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public abstract void method486(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public abstract void method490(int arg0);

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public abstract void method487(int arg0);
}
