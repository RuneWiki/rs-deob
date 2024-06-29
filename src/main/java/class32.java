import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class32 {

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    private int field494 = 0;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[Lna;")
    private class119[] field485;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Z")
    public static boolean field482 = false;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lai;")
    public static class10 field478 = class44.method278("Benutzername: ", 111);

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Lai;")
    private static class10 field490 = class44.method278("To play on this world move to a free area first)3", 97);

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lai;")
    public static class10 field483 = field490;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "J")
    private long field484;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lna;")
    private class119 field480;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lna;")
    private class119 field493;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Ljc;")
    public static class85 field486;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lna;")
    public final class119 method208(int arg0) {
        field476++;
        if (this.field480 == null) {
            return null;
        }
        class119 var2 = this.field485[(int) (this.field484 & (long) (this.field492 - 1))];
        while (this.field480 != var2) {
            if (this.field480.field2291 == this.field484) {
                class119 var3 = this.field480;
                this.field480 = this.field480.field2287;
                return var3;
            }
            this.field480 = this.field480.field2287;
        }
        if (arg0 != 0) {
            field482 = true;
        }
        this.field480 = null;
        return null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I[Lna;)I")
    public final int method209(int arg0, class119[] arg1) {
        field479++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field492; var4++) {
            class119 var5 = this.field485[var4];
            for (class119 var6 = var5.field2287; var6 != var5; var6 = var6.field2287) {
                arg1[var3++] = var6;
            }
        }
        if (arg0 != 14349) {
            this.field480 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
    public static final void method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field475++;
        int var6 = (arg3 - 32) * arg3 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        class184.field3492[0].method1134(arg2, arg1);
        class184.field3492[1].method1134(arg2, arg1 + arg3 - 16);
        int var7 = (arg3 - var6 - 32) * arg4 / (arg5 - arg3);
        class62.method412(arg2, arg1 + 16, 16, arg3 - 32, class146.field2795);
        class62.method412(arg2, arg1 + var7 + 16, 16, var6, class24.field363);
        class62.method404(arg2, arg1 + var7 + 16, var6, class191.field3626);
        class62.method404(arg2 + 1, arg1 + 16 + var7, var6, class191.field3626);
        class62.method415(arg2, var7 + arg1 + 16, 16, class191.field3626);
        class62.method415(arg2, var7 + arg1 + 17, 16, class191.field3626);
        class62.method404(arg2 + 15, arg1 + 16 + var7, var6, class174.field3351);
        class62.method404(arg2 + 14, arg1 + var7 - -17, arg0 + var6, class174.field3351);
        class62.method415(arg2, arg1 + var7 + var6 + 15, 16, class174.field3351);
        class62.method415(arg2 + 1, arg1 + var7 + var6 + 14, 15, class174.field3351);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static void method211(int arg0) {
        field490 = null;
        if (arg0 != -16) {
            field482 = true;
        }
        field478 = null;
        field483 = null;
        field486 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Lna;")
    public final class119 method212(byte arg0) {
        this.field494 = 0;
        field488++;
        int var2 = -18 % ((arg0 + 47) / 60);
        return this.method215((byte) 34);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)Lna;")
    public final class119 method213(int arg0, long arg1) {
        field477++;
        this.field484 = arg1;
        class119 var4 = this.field485[(int) (arg1 & (long) (this.field492 - 1))];
        for (this.field480 = var4.field2287; this.field480 != var4; this.field480 = this.field480.field2287) {
            if (this.field480.field2291 == arg1) {
                class119 var6 = this.field480;
                this.field480 = this.field480.field2287;
                return var6;
            }
        }
        this.field480 = null;
        int var5 = -60 % ((arg0 - 56) / 62);
        return null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lna;BJ)V")
    public final void method214(class119 arg0, byte arg1, long arg2) {
        field489++;
        if (arg0.field2295 != null) {
            arg0.method848(false);
        }
        class119 var5 = this.field485[(int) ((long) (this.field492 - 1) & arg2)];
        arg0.field2287 = var5;
        if (arg1 > 100) {
            arg0.field2295 = var5.field2295;
            arg0.field2295.field2287 = arg0;
            arg0.field2291 = arg2;
            arg0.field2287.field2295 = arg0;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Lna;")
    public final class119 method215(byte arg0) {
        field487++;
        if (this.field494 > 0 && this.field485[this.field494 - 1] != this.field493) {
            class119 var2 = this.field493;
            this.field493 = var2.field2287;
            return var2;
        } else if (arg0 == 34) {
            while (this.field494 < this.field492) {
                class119 var3 = this.field485[this.field494++].field2287;
                if (this.field485[this.field494 - 1] != var3) {
                    this.field493 = var3.field2287;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)I")
    public final int method216(byte arg0) {
        if (arg0 <= 118) {
            this.field493 = null;
        }
        field481++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field492; var3++) {
            class119 var4 = this.field485[var3];
            for (class119 var5 = var4.field2287; var5 != var4; var5 = var5.field2287) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V")
    public class32(int arg0) {
        this.field492 = arg0;
        this.field485 = new class119[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class119 var3 = this.field485[var2] = new class119();
            var3.field2295 = var3;
            var3.field2287 = var3;
        }
    }
}
