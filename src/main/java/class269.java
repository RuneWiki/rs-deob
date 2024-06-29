import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class269 extends class43 {

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    private int field4289 = -1;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    private int field4294 = -32768;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "Z")
    private boolean field4293 = false;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "Lch;")
    private class290 field4302 = null;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
    private int field4315 = -1;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    private int field4299;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    private int field4295;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    private int field4287;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    private int field4313;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    private int field4286;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    private int field4301;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "Lfb;")
    private class30 field4303;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    private int field4308;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    private int field4305;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    private int field4307;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    private int field4291;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "Loh;")
    public static class281 field4300 = new class281(50);

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "Lri;")
    private class67 field4316;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "[I")
    public static int[] field4314;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "[[[Lwj;")
    public static class6[][][] field4298;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method1810(String arg0, boolean arg1) {
        field4296++;
        int var2 = class140.method947(arg0, (byte) -79);
        if (var2 == -1) {
            return "";
        } else {
            if (arg1) {
                field4298 = null;
            }
            return class50.method376(" ", 0, class93.field1596.field3242[var2], "<br>");
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1813(arg3, arg4, (byte) 68);
        field4309++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lg;IZZIZLg;)I")
    public static final int method1811(class284 arg0, int arg1, boolean arg2, boolean arg3, int arg4, boolean arg5, class284 arg6) {
        field4292++;
        int var7 = class157.method1066(arg4, arg5, arg6, arg0, arg2);
        if (var7 != 0) {
            return arg5 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = class157.method1066(arg1, arg3, arg6, arg0, arg2);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZ)Lji;")
    private final class43 method1812(byte arg0, boolean arg1) {
        field4288++;
        boolean var3 = class66.field1107 != class5.field60;
        class193 var4 = class69.method501(0, this.field4313);
        int var5 = var4.field2994;
        if (var4.field2997 != null) {
            var4 = var4.method1297(false);
        }
        if (var4 == null) {
            return null;
        }
        if (class167.field2613 != 0 && this.field4293 && (this.field4303 == null || this.field4303 != null && this.field4303.field436 != var4.field2994)) {
            int var6 = var4.field2994;
            if (var4.field2994 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field4303 = null;
            } else {
                this.field4303 = class148.method996(-57, var6);
            }
            if (this.field4303 != null) {
                if (var4.field3015 && this.field4303.field418 != -1) {
                    this.field4308 = (int) (Math.random() * (double) this.field4303.field439.length);
                    this.field4307 -= (int) (Math.random() * (double) this.field4303.field423[this.field4308]);
                } else {
                    this.field4308 = 0;
                    this.field4307 = class192.field2978 - 1;
                }
            }
        }
        int var7 = this.field4301 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field3063;
            var8 = var4.field3028;
        } else {
            var8 = var4.field3063;
            var9 = var4.field3028;
        }
        int var10 = (var8 >> 1) + this.field4295;
        int var11 = (var9 >> 1) + this.field4287;
        int var12 = (var8 + 1 >> 1) + this.field4295;
        int var13 = (var9 + 1 >> 1) + this.field4287;
        this.method1813(var10 * 128, var11 * 128, (byte) 68);
        boolean var14 = !var3 && var4.field3049 && (this.field4315 != var4.field3024 || (this.field4308 != this.field4289 || this.field4303 != null && (this.field4303.field437 || class240.field3909) && this.field4308 != this.field4305) && class190.field2948 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class66.field1107[this.field4299];
        int var16 = var15[var10][var11] + var15[var10][var13] + var15[var12][var11] + var15[var12][var13] >> 2;
        int var17 = (this.field4295 << 7) + (var8 << 6);
        int var18 = (this.field4287 << 7) + (var9 << 6);
        int[][] var19 = null;
        if (var3) {
            var19 = class5.field60[0];
        } else if (this.field4299 < 3) {
            var19 = class66.field1107[this.field4299 + 1];
        }
        boolean var20 = this.field4302 == null;
        class24 var21;
        if (this.field4303 == null) {
            var21 = var4.method1298(var17, var16, this.field4286, this.field4301, false, var18, arg0 - 7, var14, var20 ? class38.field538 : this.field4302, var15, var19);
        } else {
            var21 = var4.method1302(var15, var16, var17, this.field4291, var20 ? class38.field538 : this.field4302, this.field4301, this.field4305, var18, this.field4303, var19, this.field4308, this.field4286, var14, true);
        }
        if (var21 == null) {
            return null;
        } else {
            if (arg0 != 7) {
                this.field4295 = -75;
            }
            return var21.field328;
        }
    }

    @OriginalMember(owner = "client!kl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4304++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)V")
    private final void method1813(int arg0, int arg1, byte arg2) {
        field4312++;
        if (arg2 != 68) {
            field4300 = null;
        }
        if (this.field4303 == null) {
            return;
        }
        int var4 = class192.field2978 - this.field4307;
        if (var4 > 100 && this.field4303.field418 > 0) {
            int var5 = this.field4303.field439.length - this.field4303.field418;
            while (this.field4308 < var5 && var4 > this.field4303.field423[this.field4308]) {
                var4 -= this.field4303.field423[this.field4308];
                this.field4308++;
            }
            if (this.field4308 >= var5) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field4303.field439.length; var7++) {
                    var6 += this.field4303.field423[var7];
                }
                var4 %= var6;
            }
            this.field4305 = this.field4308 + 1;
            if (this.field4303.field439.length <= this.field4305) {
                this.field4305 -= this.field4303.field418;
                if (this.field4305 < 0 || this.field4305 >= this.field4303.field439.length) {
                    this.field4305 = -1;
                }
            }
        }
        while (this.field4303.field423[this.field4308] < var4) {
            class52.method390(false, this.field4303, this.field4308, 107, arg1, arg0);
            var4 -= this.field4303.field423[this.field4308];
            this.field4308++;
            if (this.field4303.field439.length <= this.field4308) {
                this.field4308 -= this.field4303.field418;
                if (this.field4308 < 0 || this.field4308 >= this.field4303.field439.length) {
                    this.field4303 = null;
                    break;
                }
            }
            this.field4305 = this.field4308 + 1;
            if (this.field4305 >= this.field4303.field439.length) {
                this.field4305 -= this.field4303.field418;
                if (this.field4305 < 0 || this.field4305 >= this.field4303.field439.length) {
                    this.field4305 = -1;
                }
            }
        }
        this.field4307 = class192.field2978 - var4;
        this.field4291 = var4;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBIIII)V")
    public static final void method1814(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class128.field2019 = arg4;
        field4306++;
        class65.field1100 = arg0;
        class293.field4610 = arg3;
        class110.field1804 = arg5;
        class53.field808 = arg2;
        if (arg1 <= 126) {
            field4298 = null;
        }
        if (class65.field1100 >= 100) {
            int var6 = class293.field4610 * 128 + 64;
            int var7 = class128.field2019 * 128 + 64;
            int var8 = class34.method269(class240.field3892, var7, var6, 103) - class53.field808;
            int var9 = var6 - class219.field3375;
            int var10 = var8 - class170.field2653;
            int var11 = var7 - class293.field4624;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class62.field1066 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class83.field1408 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 0x7FF;
            if (class62.field1066 < 128) {
                class62.field1066 = 128;
            }
            if (class62.field1066 > 383) {
                class62.field1066 = 383;
            }
        }
        class259.field4130 = 2;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method1815(int arg0) {
        field4300 = null;
        if (arg0 > -55) {
            field4298 = null;
        }
        field4314 = null;
        field4298 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIIJILri;)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class67 arg10) {
        field4310++;
        class43 var13 = this.method1816(0);
        if (var13 != null) {
            var13.method100(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4316);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Lji;")
    public final class43 method1816(int arg0) {
        field4290++;
        if (arg0 != 0) {
            this.field4315 = -11;
        }
        return this.method1812((byte) 7, false);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(JZZ)V")
    public static final void method1817(long arg0, boolean arg1, boolean arg2) {
        field4311++;
        if (arg0 == 0L) {
            return;
        }
        if (class268.field4284 >= 100) {
            class81.method579(-1, "", 0, class101.field1692);
            return;
        }
        String var4 = class28.method222(-256, arg0);
        for (int var5 = 0; var5 < class268.field4284; var5++) {
            if (class106.field1766[var5] == arg0) {
                class81.method579(-1, "", 0, var4 + class20.field297);
                return;
            }
        }
        if (arg1) {
            return;
        }
        for (int var6 = 0; var6 < class166.field2604; var6++) {
            if (class173.field2718[var6] == arg0) {
                class81.method579(-1, "", 0, class254.field4066 + var4 + class173.field2717);
                return;
            }
        }
        if (var4.equals(class283.field4473.field3803)) {
            class81.method579(-1, "", 0, class204.field3187);
            return;
        }
        class106.field1766[class268.field4284] = arg0;
        class48.field695++;
        class212.field3288[class268.field4284] = class253.method1728(arg0, (byte) -100);
        class138.field2117[class268.field4284++] = arg2;
        class15.field235 = class275.field4392;
        client.field2435.method536((byte) -104, 196);
        client.field2435.method638(arg0, arg1);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()I")
    public final int method102() {
        field4297++;
        return this.field4294;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(IIIIIIIZLji;)V")
    public class269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class43 arg8) {
        this.field4299 = arg3;
        this.field4295 = arg4;
        this.field4287 = arg5;
        this.field4313 = arg0;
        this.field4286 = arg1;
        this.field4301 = arg2;
        if (arg6 != -1) {
            this.field4303 = class148.method996(-126, arg6);
            this.field4308 = 0;
            if (this.field4303.field439.length > 1) {
                this.field4305 = 1;
            } else {
                this.field4305 = 0;
            }
            this.field4307 = class192.field2978 - 1;
            this.field4291 = 1;
            if (this.field4303.field450 == 0 && arg8 != null && arg8 instanceof class269) {
                class269 var10 = (class269) arg8;
                if (this.field4303 == var10.field4303) {
                    this.field4308 = var10.field4308;
                    this.field4291 = var10.field4291;
                    this.field4307 = var10.field4307;
                    this.field4305 = var10.field4305;
                    return;
                }
            }
            if (arg7 && this.field4303.field418 != -1) {
                this.field4308 = (int) (Math.random() * (double) this.field4303.field439.length);
                this.field4305 = this.field4308 + 1;
                if (this.field4303.field439.length <= this.field4305) {
                    this.field4305 -= this.field4303.field418;
                    if (this.field4305 < 0 || this.field4303.field439.length <= this.field4305) {
                        this.field4305 = -1;
                    }
                }
                this.field4291 = (int) (Math.random() * (double) this.field4303.field423[this.field4308]) + 1;
                this.field4307 = class192.field2978 - this.field4291;
            }
        }
        if (arg8 == null) {
            class193 var11 = class69.method501(0, this.field4313);
            if (var11.field2997 != null) {
                this.field4293 = true;
                return;
            }
        }
    }
}
