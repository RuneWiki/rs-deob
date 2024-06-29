import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class137 implements class48 {

    @OriginalMember(owner = "client!v", name = "l", descriptor = "La;")
    private class1 field3288 = new class1();

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    private int field3294 = 0;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "D")
    private double field3296 = 1.0D;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    private int field3298 = 128;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Lge;")
    private class47 field3295;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    private int field3297;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "[Lhb;")
    private class51[] field3289;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lrd;")
    private static class117 field3278 = class95.method812("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", (byte) 8);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lrd;")
    public static class117 field3280 = field3278;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lrd;")
    public static class117 field3293 = class95.method812("Null", (byte) 8);

    @OriginalMember(owner = "client!v", name = "p", descriptor = "[I")
    public static int[] field3292 = new int[2048];

    @OriginalMember(owner = "client!v", name = "g", descriptor = "La;")
    public static class1 field3283 = new class1();

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field3300 = 0;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Lrd;")
    public static class117 field3301 = class95.method812("Konfig geladen)3", (byte) 8);

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Lrd;")
    public static class117 field3304 = class95.method812(" loggt sich aus)3", (byte) 8);

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Lrd;")
    public static class117 field3303 = class95.method812("Freund hinzuf-Ugen", (byte) 8);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "Lcd;")
    public static class19 field3305;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Lge;")
    public static class47 field3299;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Z")
    public static boolean field3285;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZD)V")
    public final void method1112(boolean arg0, double arg1) {
        this.field3296 = arg1;
        field3286++;
        if (!arg0) {
            field3293 = null;
        }
        this.method1117(-15113);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static final void method1113(boolean arg0) {
        field3277++;
        class7.field173.method766(5);
        if (!arg0) {
            method1113(false);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)Z")
    public final boolean method535(int arg0, byte arg1) {
        if (arg1 != 89) {
            this.method1117(77);
        }
        field3287++;
        return this.field3298 == 64;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(II)V")
    public final void method1114(int arg0, int arg1) {
        field3290++;
        for (int var3 = 0; var3 < this.field3289.length; var3++) {
            class51 var4 = this.field3289[var3];
            if (var4 != null && var4.field1447 != 0 && var4.field1443) {
                var4.method557(arg1);
                var4.field1443 = false;
            }
        }
        if (arg0 != 383) {
            field3305 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static final void method1115(int arg0) {
        if (class49.field1435[96]) {
            class102.field2580 += (-class102.field2580 - 24) / 2;
        } else if (class49.field1435[97]) {
            class102.field2580 += (24 - class102.field2580) / 2;
        } else {
            class102.field2580 /= 2;
        }
        class132.field3172 = class102.field2580 / arg0 + class132.field3172 & 0x7FF;
        field3282++;
        if (class49.field1435[98]) {
            class147.field3587 += (12 - class147.field3587) / 2;
        } else if (class49.field1435[99]) {
            class147.field3587 += (-class147.field3587 - 12) / 2;
        } else {
            class147.field3587 /= 2;
        }
        class74.field2060 += class147.field3587 / 2;
        int var1 = class144.field3516.field751 + class59.field1667;
        if (class74.field2060 < 128) {
            class74.field2060 = 128;
        }
        int var2 = class144.field3516.field717 + class121.field2966;
        if (class74.field2060 > 383) {
            class74.field2060 = 383;
        }
        if (class64.field1829 - var2 < -500 || class64.field1829 - var2 > 500 || class107.field2660 - var1 < -500 || class107.field2660 - var1 > 500) {
            class107.field2660 = var1;
            class64.field1829 = var2;
        }
        int var3 = 0;
        if (class107.field2660 != var1) {
            class107.field2660 += (var1 - class107.field2660) / 16;
        }
        if (class64.field1829 != var2) {
            class64.field1829 += (var2 - class64.field1829) / 16;
        }
        int var4 = class64.field1829 >> 7;
        int var5 = class107.field2660 >> 7;
        int var6 = class133.method1091(class120.field2940, class107.field2660, (byte) 117, class64.field1829);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class120.field2940;
                    if (var9 < 3 && (class124.field3002[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class14.field272[var9][var7][var8];
                    if (var10 > var3) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class105.field2614) {
            class105.field2614 += (var11 - class105.field2614) / 24;
        } else if (var11 < class105.field2614) {
            class105.field2614 += (var11 - class105.field2614) / 80;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static void method1116(int arg0) {
        field3305 = null;
        field3283 = null;
        field3304 = null;
        field3293 = null;
        if (arg0 != 24) {
            return;
        }
        field3292 = null;
        field3301 = null;
        field3278 = null;
        field3299 = null;
        field3280 = null;
        field3303 = null;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)I")
    public final int method537(int arg0, int arg1) {
        if (arg0 > -21) {
            field3292 = null;
        }
        field3284++;
        return this.field3289[arg1] == null ? 0 : this.field3289[arg1].field1442;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z")
    public final boolean method536(int arg0, int arg1) {
        field3279++;
        if (arg1 != 6473) {
            this.field3289 = null;
        }
        return this.field3289[arg0].field1441;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[I")
    public final int[] method534(int arg0, int arg1) {
        if (arg1 != -10086) {
            field3305 = null;
        }
        class51 var3 = this.field3289[arg0];
        field3291++;
        if (var3 != null) {
            if (var3.field1446 != null) {
                this.field3288.method4(var3, false);
                var3.field1443 = true;
                return var3.field1446;
            }
            boolean var4 = var3.method558(this.field3296, this.field3298, this.field3295);
            if (var4) {
                if (this.field3294 == 0) {
                    class51 var5 = (class51) this.field3288.method12((byte) 48);
                    var5.method560();
                } else {
                    this.field3294--;
                }
                this.field3288.method4(var3, false);
                var3.field1443 = true;
                return var3.field1446;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public final void method1117(int arg0) {
        field3281++;
        for (int var2 = 0; var2 < this.field3289.length; var2++) {
            if (this.field3289[var2] != null) {
                this.field3289[var2].method560();
            }
        }
        if (arg0 != -15113) {
            this.field3294 = 85;
        }
        this.field3288 = new class1();
        this.field3294 = this.field3297;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lge;Lge;IDI)V")
    public class137(class47 arg0, class47 arg1, int arg2, double arg3, int arg4) {
        this.field3298 = arg4;
        this.field3295 = arg1;
        this.field3296 = arg3;
        this.field3297 = arg2;
        this.field3294 = this.field3297;
        int[] var7 = arg0.method529(false, 0);
        int var8 = var7.length;
        this.field3289 = new class51[arg0.method519((byte) -128, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class14 var10 = new class14(arg0.method526((byte) 114, 0, var7[var9]));
            this.field3289[var7[var9]] = new class51(var10);
        }
    }
}
