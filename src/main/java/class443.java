import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class443 extends class145 {

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    private int field6385 = -1;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field6387 = 0;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "Lik;")
    public static class410 field6386 = new class410(500);

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "Lon;")
    public static class35 field6388 = new class35(16);

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    public static int field6390 = -1;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field6392 = " has logged out.";

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field6391 = 0;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    private int field6378;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    private int field6383;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "[I")
    private int[] field6380;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        int var4 = -87 / ((11 - arg1) / 52);
        if (~arg2 == -1) {
            this.field6385 = arg0.method1853(-51);
        }
        ++field6372;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lbi;IIIIILvj;II)V")
    public static final void method2746(class139 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class179 arg6, int arg7, int arg8) {
        ++field6376;
        int var9 = arg1 * arg1 - -(arg7 * arg7);
        if (~var9 >= ~arg2) {
            if (arg8 != -27566) {
                method2751(true, 98);
            }
            int var10 = Math.min(arg0.field2027 / 2, arg0.field2011 / 2);
            if (var9 > var10 * var10) {
                var10 -= 10;
                int var11;
                if (class184.field2675 == 4) {
                    var11 = 16383 & (int) class313.field4229;
                } else {
                    var11 = 16383 & (int) class313.field4229 + class161.field2395;
                }
                int var12 = class174.field2572[var11];
                int var13 = class174.field2564[var11];
                if (class184.field2675 != 4) {
                    var12 = var12 * 256 / (class398.field5576 + 256);
                    var13 = var13 * 256 / (class398.field5576 + 256);
                }
                int var14 = arg1 * var13 + arg7 * var12 >> 15;
                int var15 = arg7 * var13 - arg1 * var12 >> 15;
                double var16 = Math.atan2((double) var14, (double) var15);
                int var18 = (int) ((double) var10 * Math.sin(var16));
                int var19 = (int) (Math.cos(var16) * (double) var10);
                class255.field3460[arg5].method728((float) arg0.field2027 / 2.0F + (float) arg4 + (float) var18, (float) arg0.field2011 / 2.0F + (float) arg3 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
            } else {
                class398.method2443(arg7, arg1, arg6, arg4, arg3, arg8 ^ -31701, arg0, class338.field4619[arg5]);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
    public final void method1118(byte arg0) {
        ++field6379;
        super.method1118(arg0);
        this.field6380 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([III)V")
    public static final void method2747(int[] arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2748(116);
        }
        ++field6373;
        for (int var3 = 31; var3 > 0; --var3) {
            int var4 = var3 * 36;
            for (int var5 = 35; var5 > 0; --var5) {
                if (arg0[var5 - -var4] == 0 && arg0[var5 - 36 + var4 + -1] != 0) {
                    arg0[var5 - -var4] = arg2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)V")
    public final void method1117(byte arg0, int arg1, int arg2) {
        super.method1117((byte) -116, arg1, arg2);
        if (arg0 > -101) {
            method2751(true, 106);
        }
        ++field6371;
        if (this.field6385 >= 0) {
            int var4 = class255.field3462.method917((byte) 101, this.field6385).field1703 ? 64 : 128;
            this.field6380 = class255.field3462.method919(-126, var4, var4, this.field6385, false, 1.0F);
            this.field6383 = var4;
            this.field6378 = var4;
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
    public static final void method2748(int arg0) {
        class410 var1 = class348.field4722;
        synchronized (class348.field4722) {
            class348.field4722.method2539(107);
        }
        ++field6382;
        class410 var2 = class167.field2487;
        synchronized (class167.field2487) {
            class167.field2487.method2539(115);
            int var3 = 88 / ((arg0 - -25) / 53);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)I")
    public final int method1115(boolean arg0) {
        ++field6377;
        if (arg0) {
            this.method4(false, -125);
        }
        return this.field6385;
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public static void method2749(int arg0) {
        if (arg0 != 2) {
            method2746((class139) null, -48, 3, 30, 61, -102, (class179) null, 40, -90);
        }
        field6388 = null;
        field6392 = null;
        field6386 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class443() {
        super(0, false);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method2750(String arg0, byte arg1) {
        ++field6381;
        if (arg0 == null) {
            return false;
        } else {
            if (arg1 != 50) {
                field6387 = -13;
            }
            for (int var2 = 0; ~var2 > ~class275.field3702; ++var2) {
                if (arg0.equalsIgnoreCase(class101.field1494[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class192.field2772[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method4(boolean arg0, int arg1) {
        ++field6384;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (!arg0) {
            this.method4(true, 95);
        }
        if (super.field2217.field5771) {
            int var4 = this.field6383 * (~class81.field1209 != ~this.field6378 ? this.field6378 * arg1 / class81.field1209 : arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class156.field2364 != ~this.field6383) {
                for (int var8 = 0; var8 < class156.field2364; ++var8) {
                    int var9 = this.field6383 * var8 / class156.field2364;
                    int var10 = this.field6380[var4 + var9];
                    var7[var8] = class323.method2059(var10 << 4, 4080);
                    var6[var8] = class323.method2059(4080, var10 >> 4);
                    var5[var8] = class323.method2059(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class156.field2364; ++var11) {
                    int var12 = this.field6380[var4++];
                    var7[var11] = class323.method2059(var12 << 4, 4080);
                    var6[var11] = class323.method2059(var12, 65280) >> 4;
                    var5[var11] = class323.method2059(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(ZI)I")
    public static final int method2751(boolean arg0, int arg1) {
        ++field6374;
        if (!arg0) {
            method2748(-43);
        }
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }
}
