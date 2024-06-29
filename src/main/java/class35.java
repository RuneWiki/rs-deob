import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class35 {

    @OriginalMember(owner = "client!uja", name = "r", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!uja", name = "m", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!uja", name = "k", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client!uja", name = "o", descriptor = "Z")
    private boolean field406;

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!uja", name = "f", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client!uja", name = "h", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!uja", name = "g", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "[I")
    private static int[] field401 = new int[4];

    @OriginalMember(owner = "client!uja", name = "p", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!uja", name = "j", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!uja", name = "n", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!uja", name = "q", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client!uja", name = "e", descriptor = "Lhk;")
    private class107 field402;

    @OriginalMember(owner = "client!uja", name = "i", descriptor = "Lhk;")
    private static class107 field403;

    @OriginalMember(owner = "client!uja", name = "d", descriptor = "Lhk;")
    private static class107 field416;

    @OriginalMember(owner = "client!uja", name = "l", descriptor = "Lka;")
    private static class499 field407;

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "()V")
    public static void method347() {
        field407 = null;
        field403 = null;
        field416 = null;
        field401 = null;
    }

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "(Lha;Luja;)V")
    private final void method348(class63 arg0, class35 arg1) {
        class141 var3 = class108.method1007(class750.field11050, this.field408, 0, 105);
        if (var3 == null) {
            return;
        }
        arg0.method201(field401);
        arg0.method221(0, 0, this.field411, this.field411);
        arg0.method242(0, 0, this.field411, this.field411, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field406) {
                var4 = -arg1.field405;
                var5 = -arg1.field410;
                var6 = -arg1.field417;
            } else {
                var4 = this.field405 - arg1.field405;
                var5 = this.field410 - arg1.field410;
                var6 = this.field417 - arg1.field417;
            }
        }
        if (this.field415 != 0) {
            int var7 = -this.field415 & 0x3FFF;
            int var8 = class763.field11199[var7];
            int var9 = class763.field11200[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field414 != 0) {
            int var11 = -this.field414 & 0x3FFF;
            int var12 = class763.field11199[var11];
            int var13 = class763.field11200[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method166(1.0F);
        arg0.method243(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class499 var15 = arg0.method192(var3, 2048, 0, 64, 768);
        int var16 = var15.method396() - var15.method417();
        int var17 = var15.method434() - var15.method438();
        int var18 = var15.method417() + var16 / 2;
        int var19 = var15.method438() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method156(var18, var19, var20, var20);
        arg0.method254(arg0.method257());
        class486 var21 = arg0.method251();
        var21.method2465(0, 0, arg0.method155() - var15.method388());
        var15.method423(var21, null, arg0.method155(), 1);
        this.field402 = arg0.method211(0, 0, this.field411, this.field411, true);
        this.field402.method14(0, 0, 3);
        arg0.method221(field401[0], field401[1], field401[2], field401[3]);
    }

    @OriginalMember(owner = "client!uja", name = "d", descriptor = "(Lha;Luja;)Z")
    private final boolean method349(class63 arg0, class35 arg1) {
        if (this.field402 == null) {
            if (this.field409 == 0) {
                if (class418.field6601.method1417((byte) 122, this.field408)) {
                    int[] var3 = class418.field6601.method1415(this.field408, 0.7F, this.field411, this.field411, 28039, false);
                    this.field402 = arg0.method665(this.field411, this.field411, 119, 0, var3, this.field411);
                }
            } else if (this.field409 == 2) {
                this.method348(arg0, arg1);
            } else if (this.field409 == 1) {
                this.method355(arg0, arg1);
            }
        }
        return this.field402 != null;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method350(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field402 == null) {
            return;
        }
        int var8 = this.field415 - arg5 & 0x3FFF;
        int var9 = this.field414 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field400) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field400) / 2;
        if (var10 < arg4 && this.field400 + var10 > 0 && var11 < arg3 && this.field400 + var11 > 0) {
            this.field402.method994(arg1 + var11, arg2 + var10, this.field400, this.field400);
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "()V")
    public static final void method351() {
        field407 = null;
        field416 = null;
    }

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "()V")
    public final void method352() {
        this.field402 = null;
    }

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "(Lha;Luja;)Z")
    public final boolean method353(class63 arg0, class35 arg1) {
        return this.field402 != null || this.method349(arg0, arg1);
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lha;)V")
    private static final void method354(class63 arg0) {
        if (field416 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field416 = arg0.method665(128, 128, 115, 0, var2, 128);
        field403 = arg0.method665(128, 128, 109, 0, var1, 128);
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lha;Luja;)V")
    private final void method355(class63 arg0, class35 arg1) {
        method357(arg0);
        method354(arg0);
        arg0.method201(field401);
        arg0.method221(0, 0, this.field411, this.field411);
        arg0.method196();
        arg0.method242(0, 0, this.field411, this.field411, this.field412 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field406) {
                var3 = -arg1.field405;
                var4 = -arg1.field410;
                var5 = -arg1.field417;
            } else {
                var3 = arg1.field405 - this.field405;
                var4 = arg1.field410 - this.field410;
                var5 = arg1.field417 - this.field417;
            }
        }
        if (this.field415 != 0) {
            int var6 = class763.field11199[this.field415];
            int var7 = class763.field11200[this.field415];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field414 != 0) {
            int var9 = class763.field11199[this.field414];
            int var10 = class763.field11200[this.field414];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class499 var12 = field407.method394((byte) 0, 51200, true);
        var12.method431((short) 0, (short) this.field408);
        arg0.method166(1.0F);
        arg0.method243(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field411 * 1024 / (var12.method396() - var12.method417());
        if (this.field412 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method156(this.field411 / 2, this.field411 / 2, var13, var13);
        arg0.method254(arg0.method257());
        class486 var14 = arg0.method257();
        var14.method2465(0, 0, arg0.method155() - var12.method388());
        var12.method423(var14, null, 1024, 1);
        int var15 = this.field411 * 13 / 16;
        int var16 = (this.field411 - var15) / 2;
        field403.method999(var16, var16, var15, var15, 0, this.field412 | 0xFF000000, 1);
        this.field402 = arg0.method211(0, 0, this.field411, this.field411, true);
        arg0.method196();
        arg0.method242(0, 0, this.field411, this.field411, 0, 0);
        field416.method999(0, 0, this.field411, this.field411, 1, 0, 0);
        this.field402.method14(0, 0, 0);
        arg0.method221(field401[0], field401[1], field401[2], field401[3]);
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIII)Z")
    public final boolean method356(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field406) {
            this.field404 = 1073741823;
            var8 = this.field405;
            var9 = this.field410;
            var10 = this.field417;
        } else {
            int var5 = this.field405 - arg0;
            int var6 = this.field410 - arg1;
            int var7 = this.field417 - arg2;
            this.field404 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field404 == 0) {
                this.field404 = 1;
            }
            var8 = (var5 << 8) / this.field404;
            var9 = (var6 << 8) / this.field404;
            var10 = (var7 << 8) / this.field404;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field400 = this.field413 * arg3 / (this.field406 ? 1024 : this.field404);
        } else {
            this.field400 = 0;
        }
        if (this.field400 < 8) {
            this.field402 = null;
            return false;
        }
        int var12 = class90.method883((byte) 74, this.field400);
        if (var12 > arg3) {
            var12 = class663.method4812(false, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field411 != var12) {
            this.field411 = var12;
        }
        this.field415 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field414 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field402 = null;
        return true;
    }

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "(Lha;)V")
    private static final void method357(class63 arg0) {
        if (field407 != null) {
            return;
        }
        class141 var1 = new class141(580, 1104, 1);
        var1.method1310((short) 1024, (short) 32767, -61, (short) 1024, (short) 0, (short) 0, (byte) 0, (byte) 0, (short) 1024, (byte) 0);
        var1.method1307(128, 0, 0, 0);
        var1.method1307(-128, 0, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class763.field11199[var3];
            int var5 = class763.field11200[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class763.field11200[var12] >> 7;
                int var14 = class763.field11199[var12] * var4 >> 21;
                int var15 = class763.field11199[var12] * var5 >> 21;
                var1.method1307(var13, -var14, var15, 0);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1316((byte) 0, 0, (byte) 0, (byte) 0, -2, (short) 0, var8, (short) 127, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1316((byte) 0, var8, (byte) 0, (byte) 0, -2, (short) 0, var10, (short) 127, var7);
                    var1.method1316((byte) 0, var10, (byte) 0, (byte) 0, -2, (short) 0, var11, (short) 127, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1316((byte) 0, var7, (byte) 0, (byte) 0, -2, (short) 0, var8, (short) 127, 1);
            }
        }
        var1.field1997 = var1.field2013;
        var1.field1992 = null;
        var1.field2004 = null;
        var1.field1974 = null;
        field407 = arg0.method192(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field405 = arg2;
        this.field410 = arg3;
        this.field417 = arg4;
        this.field406 = arg7;
        this.field408 = arg1;
        this.field412 = arg6;
        this.field413 = arg5;
        this.field409 = arg0;
    }
}
