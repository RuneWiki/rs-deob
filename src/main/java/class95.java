import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class95 {

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Z")
    private boolean field1504;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "[I")
    private static int[] field1509 = new int[4];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lmc;")
    private class201 field1507;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lih;")
    private static class208 field1501;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[B")
    private static byte[] field1498;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lcf;)V")
    private final void method606(class95 arg0) {
        method607();
        method614();
        this.field1507 = new class279(this.field1503, this.field1503);
        class111.method723(field1509);
        this.field1507.method1272();
        class249.method1623();
        class111.method702(0, 0, this.field1503, this.field1503, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field1504) {
                var2 = -arg0.field1508;
                var3 = -arg0.field1502;
                var4 = -arg0.field1505;
            } else {
                var2 = this.field1508 - arg0.field1508;
                var3 = this.field1502 - arg0.field1502;
                var4 = this.field1505 - arg0.field1505;
            }
        }
        if (this.field1511 != 0) {
            int var5 = class249.field3767[this.field1511];
            int var6 = class249.field3781[this.field1511];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field1506 != 0) {
            int var8 = this.field1506 - 1024 & 0x7FF;
            int var9 = class249.field3767[var8];
            int var10 = class249.field3781[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class193.method1209(field1501.field3121, 0, field1501.field3102, (short) class249.field3775.method1308(this.field1499, -8604));
        class29 var12 = field1501.method1312(64, 512, -var2, -var3, -var4);
        int var13 = var12.method108() - var12.method99();
        int var14 = var12.method176() - var12.method81();
        if (var13 > var14) {
            int var15 = this.field1497 == 0 ? (var13 << 9) / this.field1503 : (var13 * 16 << 9) / (this.field1503 * 13);
            var12.method184(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field1497 == 0 ? (var14 << 9) / this.field1503 : (var14 * 16 << 9) / (this.field1503 * 13);
            var12.method184(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field1497 == 0) {
            for (int var17 = 0; var17 < class111.field1716.length; var17++) {
                if (class111.field1716[var17] != 0) {
                    class111.field1716[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method612();
            this.method617();
        }
        class273.field4109.method1077(-74);
        class111.method703(field1509);
        class249.method1623();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
    private static final void method607() {
        if (field1501 != null) {
            return;
        }
        class208 var0 = field1501 = new class208(260, 480, 0);
        int[] var1 = var0.field3096;
        int[] var2 = var0.field3144;
        int[] var3 = var0.field3097;
        int[] var4 = var0.field3119;
        int[] var5 = var0.field3107;
        int[] var6 = var0.field3116;
        var0.field3143 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class249.field3767[var8] >> 1;
            int var10 = class249.field3781[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class249.field3781[var17] >> 9;
                int var19 = (class249.field3767[var17] >> 1) * var9 >> 23;
                int var20 = (class249.field3767[var17] >> 1) * var10 >> 23;
                var1[var0.field3143] = var20;
                var2[var0.field3143] = var18;
                var3[var0.field3143] = -var19;
                var0.field3143++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field3102] = 0;
                var5[var0.field3102] = var13;
                var6[var0.field3102] = var12;
                var0.field3102++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field3102] = var13;
                    var5[var0.field3102] = var15;
                    var6[var0.field3102] = var12;
                    var0.field3102++;
                    var4[var0.field3102] = var15;
                    var5[var0.field3102] = var16;
                    var6[var0.field3102] = var12;
                    var0.field3102++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field3102] = var12;
                var5[var0.field3102] = var13;
                var6[var0.field3102] = 1;
                var0.field3102++;
            }
        }
        var0.field3110 = var0.field3143;
        var0.field3130 = null;
        var0.field3100 = null;
        var0.field3112 = null;
        var0.field3109 = null;
        var0.field3142 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIILcf;)V")
    public final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6) {
        int var8 = this.field1511 - arg4 & 0x7FF;
        int var9 = this.field1506 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field1500) / 2 + var10;
        int var13 = (arg2 - this.field1500) / 2 + var11;
        if (var12 < arg3 && this.field1500 + var12 > 0 && var13 < arg2 && this.field1500 + var13 > 0 && this.method613(arg6)) {
            this.field1507.method1283(arg0 + var13, arg1 + var12, this.field1500, this.field1500);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()V")
    public static void method609() {
        field1501 = null;
        field1498 = null;
        field1509 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Lcf;)V")
    private final void method610(class95 arg0) {
        class208 var2 = class208.method1332(class38.field522, this.field1499, 0);
        if (var2 == null) {
            return;
        }
        this.field1507 = new class201(this.field1503, this.field1503);
        class111.method723(field1509);
        this.field1507.method1272();
        class249.method1623();
        class111.method702(0, 0, this.field1503, this.field1503, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field1504) {
                var3 = -arg0.field1508;
                var4 = -arg0.field1502;
                var5 = -arg0.field1505;
            } else {
                var3 = this.field1508 - arg0.field1508;
                var4 = this.field1502 - arg0.field1502;
                var5 = this.field1505 - arg0.field1505;
            }
        }
        if (this.field1511 != 0) {
            int var6 = class249.field3767[this.field1511];
            int var7 = class249.field3781[this.field1511];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1506 != 0) {
            int var9 = this.field1506 - 1024 & 0x7FF;
            int var10 = class249.field3767[var9];
            int var11 = class249.field3781[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class29 var13 = var2.method1312(64, 768, -var3, -var4, -var5);
        int var14 = var13.method108() - var13.method99();
        int var15 = var13.method176() - var13.method81();
        int var16 = var13.method99() + var14 / 2;
        int var17 = var13.method81() + var15 / 2;
        if (var14 > var15) {
            var13.method184(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field1503);
        } else {
            var13.method184(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field1503);
        }
        class273.field4109.method1077(-91);
        class111.method703(field1509);
        class249.method1623();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method611(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field1498[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()V")
    private final void method612() {
        int var1 = this.field1503 * 3 / 32;
        int var3 = this.field1503 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class111.field1719 * var1 + var1;
        int var8 = class111.field1719 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class111.field1715) {
            var4 = var3 - (var1 + var3 - class111.field1715);
        }
        if (var1 < class111.field1714) {
            int var11 = class111.field1714 - var1;
            var4 -= var11;
            var7 += class111.field1719 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class111.field1722) {
            int var12 = var1 + var3 - class111.field1722;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class111.field1721) {
            int var13 = class111.field1721 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method615(class111.field1716, 0, this.field1497, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(Lcf;)Z")
    private final boolean method613(class95 arg0) {
        if (this.field1507 == null) {
            if (this.field1496 == 0) {
                this.field1507 = class249.field3775.method1311(-108, this.field1503, class249.field3771, this.field1499, true);
            } else if (this.field1496 == 2) {
                this.method610(arg0);
            } else if (this.field1496 == 1) {
                this.method606(arg0);
            }
        }
        return this.field1507 != null;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "()V")
    private static final void method614() {
        if (field1498 != null) {
            return;
        }
        field1498 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field1498[var4 + var6] = field1498[var4 + var9] = field1498[var5 + var6] = field1498[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method615(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field1498[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "()V")
    private final void method616() {
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "()V")
    private final void method617() {
        int var1 = this.field1503;
        int var2 = this.field1503;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class111.field1719 - var1;
        if (var2 > class111.field1715) {
            var2 -= var2 - class111.field1715;
        }
        if (class111.field1714 > 0) {
            int var9 = class111.field1714;
            var2 -= var9;
            var7 += class111.field1719 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class111.field1722) {
            int var10 = var1 - class111.field1722;
            var1 -= var10;
            var8 += var10;
        }
        if (class111.field1721 > 0) {
            int var11 = class111.field1721;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method611(class111.field1716, this.field1497, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!cf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method616();
        super.finalize();
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1508 = arg2;
        this.field1502 = arg3;
        this.field1505 = arg4;
        this.field1504 = arg7;
        this.field1499 = arg1;
        this.field1497 = arg6;
        this.field1510 = arg5;
        this.field1496 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)Z")
    public final boolean method618(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1504) {
            this.field1495 = 1073741823;
            var8 = this.field1508;
            var9 = this.field1502;
            var10 = this.field1505;
        } else {
            int var5 = this.field1508 - arg0;
            int var6 = this.field1502 - arg1;
            int var7 = this.field1505 - arg2;
            this.field1495 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1495 == 0) {
                this.field1495 = 1;
            }
            var8 = (var5 << 8) / this.field1495;
            var9 = (var6 << 8) / this.field1495;
            var10 = (var7 << 8) / this.field1495;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1500 = this.field1510 * arg3 / (this.field1504 ? 1024 : this.field1495);
        } else {
            this.field1500 = 0;
        }
        if (this.field1500 < 8) {
            this.method616();
            this.field1507 = null;
            return false;
        }
        int var12 = class20.method132(this.field1500, (byte) 85);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1503 != var12) {
            this.field1503 = var12;
        }
        this.field1511 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field1506 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field1507 = null;
        return true;
    }
}
