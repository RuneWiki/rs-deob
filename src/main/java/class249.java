import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class249 extends class262 implements class448 {

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "Z")
    private boolean field3292;

    @OriginalMember(owner = "client!mn", name = "ab", descriptor = "Z")
    private boolean field3316;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "B")
    private byte field3305;

    @OriginalMember(owner = "client!mn", name = "Y", descriptor = "Z")
    private boolean field3314;

    @OriginalMember(owner = "client!mn", name = "V", descriptor = "B")
    private byte field3311;

    @OriginalMember(owner = "client!mn", name = "X", descriptor = "S")
    private short field3313;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "B")
    private byte field3293;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "Z")
    private boolean field3304;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "Le;")
    public class373 field3300;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "Li;")
    private class31 field3291;

    @OriginalMember(owner = "client!mn", name = "db", descriptor = "Lao;")
    public static class191 field3319 = new class191(0, 5);

    @OriginalMember(owner = "client!mn", name = "eb", descriptor = "Lwc;")
    public static class49 field3320 = new class49();

    @OriginalMember(owner = "client!mn", name = "fb", descriptor = "F")
    public static float field3321 = 0.0F;

    @OriginalMember(owner = "client!mn", name = "gb", descriptor = "I")
    public static int field3322 = 503;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!mn", name = "R", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!mn", name = "S", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!mn", name = "T", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!mn", name = "U", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!mn", name = "W", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!mn", name = "Z", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!mn", name = "cb", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!mn", name = "bb", descriptor = "Lgp;")
    public static class36 field3317;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILza;)V")
    public final void method44(int arg0, class287 arg1) {
        ++field3307;
        if (arg0 < 122) {
            this.field3293 = -50;
        }
        Object var3 = null;
        class31 var5;
        if (this.field3291 == null && this.field3304) {
            class190 var4 = this.method1543(true, 40, 262144, arg1);
            var5 = var4 != null ? var4.field2454 : null;
        } else {
            var5 = this.field3291;
            this.field3291 = null;
        }
        if (var5 != null) {
            class488.method2957(var5, this.field3311, super.field3515, super.field3514, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)Z")
    public final boolean method38(byte arg0) {
        if (arg0 != -89) {
            field3320 = null;
        }
        ++field3310;
        return this.field3304;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIILza;)Luu;")
    private final class190 method1543(boolean arg0, int arg1, int arg2, class287 arg3) {
        if (arg1 <= 36) {
            field3320 = null;
        }
        ++field3299;
        class70 var5 = class123.field1593.method2920(65535 & this.field3313, 19219);
        class38 var6;
        class38 var7;
        if (!this.field3314) {
            var6 = class14.field152[this.field3311];
            if (~this.field3311 > -4) {
                var7 = class14.field152[this.field3311 - -1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class14.field152[0];
            var6 = class378.field5470[this.field3311];
        }
        return var5.method416(0, var6, arg2, arg0, this.field3293, super.field3514, var7, super.field3510, arg3, super.field3515, this.field3305);
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)I")
    public final int method46(int arg0) {
        ++field3298;
        int var2 = -62 / ((-18 - arg0) / 42);
        return this.field3313 & 65535;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I")
    public final int method47(int arg0) {
        if (arg0 != -15774) {
            this.method37(-79, (class287) null, (byte) 72, -42);
        }
        ++field3294;
        return this.field3305;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(BLza;)Luc;")
    public final class23 method50(byte arg0, class287 arg1) {
        ++field3306;
        if (this.field3300 == null) {
            return null;
        } else {
            class124 var3 = arg1.method1183();
            var3.method743(super.field3515, super.field3510, super.field3514);
            if (arg0 != -112) {
                return null;
            } else {
                class23 var4 = null;
                if (this.field3292) {
                    var4 = class117.method703(1, -127);
                }
                this.field3300.method2051(var3, var4 != null ? var4.field226[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII[FFIFIII)V")
    public static final void method1544(int arg0, int arg1, int arg2, int arg3, float[] arg4, float arg5, int arg6, float arg7, int arg8, int arg9, int arg10) {
        int var11 = arg2 - arg10;
        int var12 = arg8 - arg0;
        if (arg9 == 7257) {
            ++field3297;
            int var13 = arg6 - arg1;
            float var14 = arg4[2] * (float) var13 + arg4[1] * (float) var11 + arg4[0] * (float) var12;
            float var15 = arg4[5] * (float) var13 + arg4[3] * (float) var12 + arg4[4] * (float) var11;
            float var16 = arg4[8] * (float) var13 + arg4[6] * (float) var12 + arg4[7] * (float) var11;
            float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
            if (arg7 != 1.0F) {
                var17 = arg7 * var17;
            }
            float var18 = var15 + 0.5F + arg5;
            if (arg3 != 1) {
                if (~arg3 == -3) {
                    var17 = -var17;
                    var18 = -var18;
                } else if (arg3 == 3) {
                    float var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                }
            } else {
                float var20 = var17;
                var17 = -var18;
                var18 = var20;
            }
            class107.field1451 = var17;
            class198.field2556 = var18;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lza;BI)Le;")
    private final class373 method1545(class287 arg0, byte arg1, int arg2) {
        ++field3302;
        int var4 = 66 % ((arg1 - -33) / 61);
        if (this.field3300 != null && arg0.method1191(this.field3300.method2025(), arg2) == 0) {
            return this.field3300;
        } else {
            class190 var5 = this.method1543(false, 122, arg2, arg0);
            return var5 == null ? null : var5.field2455;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIZILot;Lza;)V")
    public final void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6) {
        ++field3318;
        int var8 = -56 % ((arg0 - 61) / 47);
        if (arg5 instanceof class249) {
            class249 var9 = (class249) arg5;
            if (this.field3300 != null && var9.field3300 != null) {
                this.field3300.method2049(var9.field3300, arg4, arg2, arg1, arg3);
            }
        } else {
            if (arg5 instanceof class422) {
                class422 var10 = (class422) arg5;
                if (this.field3300 != null && var10.field6135 != null) {
                    this.field3300.method2049(var10.field6135, arg4, arg2, arg1, arg3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILza;BI)Z")
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        ++field3301;
        if (arg2 > -64) {
            this.method44(82, (class287) null);
        }
        class373 var5 = this.method1545(arg1, (byte) -128, 131072);
        if (var5 != null) {
            class124 var6 = arg1.method1183();
            var6.method743(super.field3515, super.field3510, super.field3514);
            return var5.method2026(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
    public final void method42(byte arg0) {
        this.field3316 = false;
        ++field3309;
        if (arg0 != 92) {
            this.method48((byte) -14);
        }
        if (this.field3300 != null) {
            this.field3300.method2034(-65537 & this.field3300.method2025());
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lza;Ler;IIIIZIIZ)V")
    public class249(class287 arg0, class70 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class101.method619(arg7, arg8, -5431));
        this.field3292 = arg1.field886 != 0 && !arg6;
        this.field3316 = arg9;
        this.field3305 = (byte) arg8;
        this.field3314 = arg6;
        super.field3514 = arg5;
        this.field3311 = (byte) arg2;
        this.field3313 = (short) arg1.field834;
        super.field3515 = arg3;
        this.field3293 = (byte) arg7;
        this.field3304 = arg0.method1129() && arg1.field820 && !this.field3314 && ~class319.field4256.method2058(class20.field183, 1) != -1;
        int var11 = 2048;
        if (this.field3316) {
            var11 |= 65536;
        }
        class190 var12 = this.method1543(this.field3304, 78, var11, arg0);
        if (var12 != null) {
            this.field3300 = var12.field2455;
            this.field3291 = var12.field2454;
            if (this.field3316) {
                this.field3300 = this.field3300.method2027((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public final void method45(int arg0) {
        if (arg0 != 9479) {
            this.method44(99, (class287) null);
        }
        if (this.field3300 != null) {
            this.field3300.method2013();
        }
        ++field3303;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
    public static final void method1546(int arg0, int arg1, int arg2) {
        ++field3295;
        class184 var3 = class277.method1682(arg1, arg0, -96);
        var3.method1069(true);
        var3.field2393 = arg2;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLza;)V")
    public final void method49(byte arg0, class287 arg1) {
        ++field3315;
        if (arg0 != -56) {
            this.field3291 = null;
        }
        Object var3 = null;
        class31 var5;
        if (this.field3291 == null && this.field3304) {
            class190 var4 = this.method1543(true, arg0 + 172, 262144, arg1);
            var5 = var4 != null ? var4.field2454 : null;
        } else {
            var5 = this.field3291;
            this.field3291 = null;
        }
        if (var5 != null) {
            class378.method2312(var5, this.field3311, super.field3515, super.field3514, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "(I)V")
    public static void method1547(int arg0) {
        field3317 = null;
        if (arg0 >= -15) {
            method1544(99, -91, 82, 115, (float[]) null, -0.8844171F, -66, -0.88872325F, -106, -78, 62);
        }
        field3319 = null;
        field3320 = null;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(BLza;)V")
    public final void method36(byte arg0, class287 arg1) {
        if (arg0 > -120) {
            this.field3311 = -92;
        }
        ++field3296;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBLza;)Le;")
    public final class373 method39(int arg0, byte arg1, class287 arg2) {
        ++field3290;
        if (arg1 != -54) {
            field3317 = null;
        }
        return this.method1545(arg2, (byte) -111, arg0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
    public final int method48(byte arg0) {
        ++field3308;
        return arg0 != -70 ? 15 : this.field3293;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        ++field3312;
        if (arg0 != -62) {
            this.method36((byte) -80, (class287) null);
        }
        return this.field3316;
    }
}
