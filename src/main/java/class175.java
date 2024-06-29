import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class175 {

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "[I")
    private int[] field2442 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "Lkg;")
    public static class275 field2443 = new class275(104, 6);

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "Leo;")
    public static class300 field2446 = new class300();

    @OriginalMember(owner = "client!tca", name = "q", descriptor = "[I")
    public static int[] field2456 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!tca", name = "p", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "Ljf;")
    public class218 field2441;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "[I")
    private int[] field2447;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "[S")
    private short[] field2440;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "[S")
    private short[] field2444;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "[S")
    private short[] field2445;

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "[S")
    private short[] field2454;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lsl;I)V")
    public final void method1198(class461 arg0, int arg1) {
        field2449++;
        while (true) {
            int var3 = arg0.method2600((byte) -125);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    this.field2454 = null;
                    return;
                }
            }
            this.method1204((byte) -65, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Llga;")
    public final class714 method1199(int arg0) {
        field2450++;
        if (arg0 < 100) {
            this.method1203(-113);
        }
        if (this.field2447 == null) {
            return null;
        }
        class714[] var2 = new class714[this.field2447.length];
        class547 var3 = this.field2441.field2940;
        synchronized (this.field2441.field2940) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field2447.length) {
                    break;
                }
                var2[var4] = class637.method3572(this.field2441.field2940, this.field2447[var4], 4, 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field2447.length; var5++) {
            if (var2[var5].field9927 < 13) {
                var2[var5].method3989(2, -95);
            }
        }
        class714 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class714(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field2444 != null) {
            for (int var7 = 0; var7 < this.field2444.length; var7++) {
                var6.method3984(this.field2445[var7], 124, this.field2444[var7]);
            }
        }
        if (this.field2454 != null) {
            for (int var8 = 0; var8 < this.field2454.length; var8++) {
                var6.method3997(this.field2440[var8], 0, this.field2454[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)Z")
    public final boolean method1200(int arg0) {
        field2448++;
        boolean var2 = true;
        class547 var3 = this.field2441.field2940;
        synchronized (this.field2441.field2940) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field2442[var4] != -1 && !this.field2441.field2940.method3157(0, arg0 + 1, this.field2442[var4])) {
                    var2 = false;
                }
            }
            return arg0 == -1 ? var2 : false;
        }
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)Llga;")
    public final class714 method1201(int arg0) {
        field2453++;
        class714[] var2 = new class714[5];
        int var3 = 0;
        class547 var4 = this.field2441.field2940;
        synchronized (this.field2441.field2940) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field2442[var5] != -1) {
                    var2[var3++] = class637.method3572(this.field2441.field2940, this.field2442[var5], 4, 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field9927 < 13) {
                var2[var6].method3989(2, -118);
            }
        }
        if (arg0 != 14514) {
            this.method1200(-116);
        }
        class714 var7 = new class714(var2, var3);
        if (this.field2444 != null) {
            for (int var8 = 0; var8 < this.field2444.length; var8++) {
                var7.method3984(this.field2445[var8], 126, this.field2444[var8]);
            }
        }
        if (this.field2454 != null) {
            for (int var9 = 0; var9 < this.field2454.length; var9++) {
                var7.method3997(this.field2440[var9], 0, this.field2454[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "(I)V")
    public static void method1202(int arg0) {
        field2443 = null;
        field2456 = null;
        field2446 = null;
        if (arg0 > -18) {
            method1202(87);
        }
    }

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "(I)Z")
    public final boolean method1203(int arg0) {
        field2452++;
        if (this.field2447 == null) {
            return true;
        }
        boolean var2 = true;
        class547 var3 = this.field2441.field2940;
        synchronized (this.field2441.field2940) {
            for (int var4 = arg0; var4 < this.field2447.length; var4++) {
                if (!this.field2441.field2940.method3157(0, 0, this.field2447[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLsl;I)V")
    private final void method1204(byte arg0, class461 arg1, int arg2) {
        if (arg0 > -62) {
            this.method1201(-41);
        }
        if (arg2 == 1) {
            arg1.method2600((byte) -125);
        } else if (arg2 == 2) {
            int var8 = arg1.method2600((byte) -128);
            this.field2447 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2447[var9] = arg1.method2566(-2);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var4 = arg1.method2600((byte) -128);
                this.field2444 = new short[var4];
                this.field2445 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2444[var5] = (short) arg1.method2566(-2);
                    this.field2445[var5] = (short) arg1.method2566(-2);
                }
            } else if (arg2 == 41) {
                int var6 = arg1.method2600((byte) -126);
                this.field2440 = new short[var6];
                this.field2454 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2454[var7] = (short) arg1.method2566(-2);
                    this.field2440[var7] = (short) arg1.method2566(-2);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field2442[arg2 - 60] = arg1.method2566(-2);
            }
        }
        field2451++;
    }
}
