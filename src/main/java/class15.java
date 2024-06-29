import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 {

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    private int field306 = 0;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[Lme;")
    private class88[] field298;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field286 = 0;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Z")
    public static boolean field297 = false;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Ltd;")
    public static class136 field287 = class145.method1172("http:)4)4www)3runescape)3com", 45);

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Ltd;")
    private static class136 field294 = class145.method1172("Loading)3)3)3", 45);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[I")
    public static int[] field290 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field303 = 0;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Ltd;")
    public static class136 field301 = class145.method1172("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 45);

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Ltd;")
    public static class136 field309 = field294;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Lpf;")
    public static class110 field304 = new class110(5000);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "J")
    private long field288;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lme;")
    private class88 field291;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Lme;")
    private class88 field308;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
    public static int[] field310;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
    public static byte[][][] field300;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Lme;")
    public final class88 method104(int arg0) {
        field307++;
        if (arg0 <= 16) {
            field286 = -105;
        }
        if (this.field306 > 0 && this.field298[this.field306 - 1] != this.field308) {
            class88 var2 = this.field308;
            this.field308 = var2.field2085;
            return var2;
        }
        while (this.field306 < this.field293) {
            class88 var3 = this.field298[this.field306++].field2085;
            if (this.field298[this.field306 - 1] != var3) {
                this.field308 = var3.field2085;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method105(int arg0) {
        field290 = null;
        if (arg0 != 15) {
            field304 = null;
        }
        field287 = null;
        field300 = null;
        field294 = null;
        field304 = null;
        field301 = null;
        field310 = null;
        field309 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)Ljc;")
    public static final class65 method106(byte arg0, int arg1) {
        field299++;
        class65 var2 = (class65) class99.field2391.method1162((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class33.field754.method669(arg1, 16, -14);
        class65 var4 = new class65();
        if (var3 != null) {
            var4.method489(-1, new class127(var3));
        }
        if (arg0 > -31) {
            field301 = null;
        }
        class99.field2391.method1164((long) arg1, var4, (byte) 127);
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lme;")
    public final class88 method107(byte arg0) {
        field295++;
        if (arg0 > -111) {
            return null;
        } else {
            this.field306 = 0;
            return this.method104(52);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Lme;")
    public final class88 method108(int arg0) {
        field296++;
        int var2 = -21 / ((29 - arg0) / 50);
        if (this.field291 == null) {
            return null;
        }
        class88 var3 = this.field298[(int) ((long) (this.field293 - 1) & this.field288)];
        while (this.field291 != var3) {
            if (this.field291.field2090 == this.field288) {
                class88 var4 = this.field291;
                this.field291 = this.field291.field2085;
                return var4;
            }
            this.field291 = this.field291.field2085;
        }
        this.field291 = null;
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IJ)Lme;")
    public final class88 method109(int arg0, long arg1) {
        field292++;
        this.field288 = arg1;
        class88 var4 = this.field298[(int) ((long) (this.field293 - 1) & arg1)];
        for (this.field291 = var4.field2085; this.field291 != var4; this.field291 = this.field291.field2085) {
            if (this.field291.field2090 == arg1) {
                class88 var5 = this.field291;
                this.field291 = this.field291.field2085;
                return var5;
            }
        }
        if (arg0 < 30) {
            return null;
        } else {
            this.field291 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILbb;IIB)V")
    public static final void method110(int arg0, int arg1, class10 arg2, int arg3, int arg4, byte arg5) {
        if (arg5 >= -79) {
            return;
        }
        field305++;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 4225 || var6 >= 90000) {
            class24.method213(arg2, arg3, false, arg1, arg0, arg4);
            return;
        }
        int var7 = class151.field3467 + class141.field3269 & 0x7FF;
        int var8 = class103.field2452[var7];
        int var9 = class103.field2456[var7];
        int var10 = var9 * 256 / (class109.field2572 + 256);
        int var11 = var8 * 256 / (class109.field2572 + 256);
        int var12 = arg0 * var11 + arg1 * var10 >> 16;
        int var13 = arg1 * var11 - arg0 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class119.field2716.method55(arg3 + var16 + 4 + 94 - 10, arg4 - 20 + 83 + -var17, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static final void method111(byte arg0) {
        class147.field3416 = 0;
        class127.field2958 = -1;
        class9.field163 = -1;
        class3.field48 = 0;
        class14.field274 = 0;
        class49.field1094 = -1;
        class96.field2267 = false;
        field304.field2995 = 0;
        class101.field2425 = -1;
        class4.field70.field2995 = 0;
        class11.field179 = 0;
        class18.field369 = 0;
        class19.field398 = 0;
        for (int var1 = 0; var1 < class154.field3518.length; var1++) {
            if (class154.field3518[var1] != null) {
                class154.field3518[var1].field3587 = -1;
            }
        }
        for (int var2 = 0; var2 < class122.field2846.length; var2++) {
            if (class122.field2846[var2] != null) {
                class122.field2846[var2].field3587 = -1;
            }
        }
        field302++;
        class133.method1072((byte) 28);
        class73.method534((byte) 73, 30);
        if (arg0 != -21) {
            field301 = null;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            class154.field3511[var3] = true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lme;BJ)V")
    public final void method112(class88 arg0, byte arg1, long arg2) {
        if (arg1 != 3) {
            method113(14);
        }
        if (arg0.field2087 != null) {
            arg0.method674(32);
        }
        field311++;
        class88 var5 = this.field298[(int) (arg2 & (long) (this.field293 - 1))];
        arg0.field2085 = var5;
        arg0.field2090 = arg2;
        arg0.field2087 = var5.field2087;
        arg0.field2087.field2085 = arg0;
        arg0.field2085.field2087 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public static final void method113(int arg0) {
        for (class16 var1 = (class16) class41.field958.method512(arg0); var1 != null; var1 = (class16) class41.field958.method520((byte) 125)) {
            if (var1.field320 > 0) {
                var1.field320--;
            }
            if (var1.field320 != 0) {
                if (var1.field317 > 0) {
                    var1.field317--;
                }
                if (var1.field317 == 0 && var1.field328 >= 1 && var1.field315 >= 1 && var1.field328 <= 102 && var1.field315 <= 102 && (var1.field318 < 0 || class143.method1163(var1.field323, var1.field318, (byte) -73))) {
                    class89.method678(var1.field324, var1.field328, -107, var1.field312, var1.field315, var1.field323, var1.field325, var1.field318);
                    var1.field317 = -1;
                    if (var1.field329 == var1.field318 && var1.field329 == -1) {
                        var1.method674(arg0 + 32);
                    } else if (var1.field329 == var1.field318 && var1.field313 == var1.field312 && var1.field323 == var1.field316) {
                        var1.method674(32);
                    }
                }
            } else if (var1.field329 < 0 || class143.method1163(var1.field316, var1.field329, (byte) -106)) {
                class89.method678(var1.field324, var1.field328, arg0 ^ 0xFFFFFF8E, var1.field313, var1.field315, var1.field316, var1.field325, var1.field329);
                var1.method674(32);
            }
        }
        field289++;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
    public class15(int arg0) {
        this.field298 = new class88[arg0];
        this.field293 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class88 var3 = this.field298[var2] = new class88();
            var3.field2087 = var3;
            var3.field2085 = var3;
        }
    }
}
