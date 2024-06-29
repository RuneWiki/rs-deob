import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class194 extends class51 {

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "Z")
    public boolean field3304 = true;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "Lhi;")
    public static class82 field3291 = class95.method664((byte) -63, ")4");

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "Lhi;")
    public static class82 field3292 = class95.method664((byte) -57, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "Lme;")
    public static class75 field3290 = null;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "Lam;")
    public static class277 field3287 = new class277();

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "Lgh;")
    public static class238 field3303 = new class238();

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "[I")
    public int[] field3296;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "[I")
    private int[] field3298;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "[Lhi;")
    private class82[] field3297;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "[[I")
    private int[][] field3286;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public static final void method1346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3301++;
        if (arg0 < 128 || arg4 < 128 || arg0 > 13056 || arg4 > 13056) {
            class34.field523 = -1;
            class291.field4893 = -1;
            return;
        }
        int var8 = class21.method145(arg0, arg4, class297.field5058, (byte) 89) - arg2;
        int var9 = arg0 - class219.field3792;
        int var10 = var8 - class134.field2322;
        int var11 = class102.field1813[class197.field3380];
        int var12 = class102.field1819[class197.field3380];
        int var13 = arg4 - class4.field32;
        int var14 = class102.field1813[class224.field3887];
        int var15 = class102.field1819[class224.field3887];
        int var16 = var9 * var15 + var13 * var14 >> 16;
        int var17 = var13 * var15 - (var9 * var14) >> 16;
        int var19 = var10 * var12 - (var11 * var17) >> 16;
        int var20 = var10 * var11 + (var12 * var17) >> 16;
        int var22 = 80 % ((arg3 + 49) / 60);
        if (var20 < 50) {
            class291.field4893 = -1;
            class34.field523 = -1;
        } else if (class147.field2485) {
            int var23 = arg1 * 512 >> 8;
            int var24 = arg6 * 512 >> 8;
            class291.field4893 = arg5 + (var19 * var23 / var20);
            class34.field523 = var16 * var24 / var20 + arg7;
        } else {
            class291.field4893 = (var19 << 9) / var20 + arg5;
            class34.field523 = (var16 << 9) / var20 + arg7;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLbc;)Lhi;", line = 68)
    public final class82 method1347(byte arg0, class153 arg1) {
        if (arg0 >= -8) {
            field3291 = (class82) null;
        }
        class82 var3 = class253.method1820(80, 0);
        if (this.field3298 != null) {
            for (int var4 = 0; var4 < this.field3298.length; var4++) {
                var3.method525((byte) -64, this.field3297[var4]);
                var3.method525((byte) -124, class106.method731((byte) -101, this.field3286[var4], this.field3298[var4], arg1.method1103(-1, class259.field4437[this.field3298[var4]])));
            }
        }
        var3.method525((byte) -43, this.field3297[this.field3297.length - 1]);
        field3285++;
        return var3.method576(true);
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)Lhi;", line = 101)
    public final class82 method1348(int arg0) {
        field3293++;
        class82 var2 = class253.method1820(80, 0);
        if (this.field3297 == null) {
            return class199.field3398;
        }
        var2.method525((byte) -73, this.field3297[0]);
        int var3 = -3 / ((arg0 + 1) / 53);
        for (int var4 = 1; var4 < this.field3297.length; var4++) {
            var2.method525((byte) -94, class26.field348);
            var2.method525((byte) -127, this.field3297[var4]);
        }
        return var2.method576(true);
    }

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "(I)V", line = 133)
    public final void method1349(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (this.field3296 != null) {
            for (int var2 = 0; var2 < this.field3296.length; var2++) {
                this.field3296[var2] = class98.method674(this.field3296[var2], 32768);
            }
        }
        field3302++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILbc;)V", line = 158)
    private final void method1350(int arg0, int arg1, class153 arg2) {
        if (arg0 <= 45) {
            return;
        }
        if (arg1 == 1) {
            this.field3297 = arg2.method1092((byte) 118).method528(60, 112);
        } else if (arg1 == 2) {
            int var4 = arg2.method1082(-119);
            this.field3296 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3296[var5] = arg2.method1090(false);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method1082(-91);
            this.field3298 = new int[var6];
            this.field3286 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1090(false);
                this.field3298[var7] = var8;
                this.field3286[var7] = new int[class264.field4518[var8]];
                for (int var9 = 0; var9 < class264.field4518[var8]; var9++) {
                    this.field3286[var7][var9] = arg2.method1090(false);
                }
            }
        } else if (arg1 == 4) {
            this.field3304 = false;
        }
        field3299++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILtg;)V", line = 223)
    public static final void method1351(int arg0, int arg1, class93 arg2) {
        field3289++;
        if (arg2.field1690 > class212.field3708) {
            class29.method181(-128, arg2);
        } else if (arg2.field1656 >= class212.field3708) {
            class328.method2242(64, arg2);
        } else {
            class52.method369(8, arg2);
        }
        if (arg2.field1685 < 128 || arg2.field1689 < 128 || arg2.field1685 >= 13184 || arg2.field1689 >= 13184) {
            arg2.field1656 = 0;
            arg2.field1709 = -1;
            arg2.field1715 = -1;
            arg2.field1690 = 0;
            arg2.field1685 = arg2.field1723[0] * 128 + (arg2.method520(true) * 64);
            arg2.field1689 = arg2.field1720[0] * 128 + arg2.method520(true) * 64;
            arg2.method657(0);
        }
        if (class168.field2932 == arg2 && (arg2.field1685 < 1536 || arg2.field1689 < 1536 || arg2.field1685 >= 11776 || arg2.field1689 >= 11776)) {
            arg2.field1656 = 0;
            arg2.field1709 = -1;
            arg2.field1690 = 0;
            arg2.field1715 = -1;
            arg2.field1685 = arg2.field1723[0] * 128 + arg2.method520(true) * 64;
            arg2.field1689 = arg2.field1720[0] * 128 + arg2.method520(true) * 64;
            arg2.method657(0);
        }
        int var3 = 117 % ((49 - arg0) / 61);
        class308.method2123(false, arg2);
        class177.method1257(arg2, -3802);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)I", line = 280)
    public final int method1352(byte arg0, int arg1) {
        field3294++;
        int var3 = -60 % ((-arg0 - 62) / 57);
        return this.field3298 == null || arg1 < 0 || arg1 > this.field3298.length ? -1 : this.field3298[arg1];
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([ILbc;B)V", line = 322)
    public final void method1353(int[] arg0, class153 arg1, byte arg2) {
        field3305++;
        if (this.field3298 == null) {
            return;
        }
        int var4 = -5 % ((5 - arg2) / 54);
        for (int var5 = 0; var5 < this.field3298.length && var5 < arg0.length; var5++) {
            int var6 = class137.field2356[this.method1352((byte) -123, var5)];
            if (var6 > 0) {
                arg1.method1054(var6, (long) arg0[var5], (byte) 117);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILbc;)V", line = 351)
    public final void method1354(int arg0, class153 arg1) {
        field3288++;
        while (true) {
            int var3 = arg1.method1082(-99);
            if (var3 == 0) {
                if (arg0 != 18116) {
                    this.method1355(-22, -10, (byte) -50);
                }
                return;
            }
            this.method1350(arg0 - 18043, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB)I", line = 372)
    public final int method1355(int arg0, int arg1, byte arg2) {
        field3300++;
        if (this.field3298 == null || arg0 < 0 || arg0 > this.field3298.length) {
            return -1;
        } else if (this.field3286[arg0] == null || arg1 < 0 || this.field3286[arg0].length < arg1) {
            return -1;
        } else if (arg2 == -95) {
            return this.field3286[arg0][arg1];
        } else {
            return 92;
        }
    }

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "(I)I", line = 393)
    public final int method1356(int arg0) {
        field3284++;
        if (this.field3298 == null) {
            return 0;
        } else if (arg0 == 0) {
            return this.field3298.length;
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "(I)V", line = 418)
    public static void method1357(int arg0) {
        field3290 = null;
        field3287 = null;
        if (arg0 != -2010785240) {
            field3291 = (class82) null;
        }
        field3303 = null;
        field3292 = null;
        field3291 = null;
    }
}
