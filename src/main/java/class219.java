import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class219 extends class185 implements class351 {

    @OriginalMember(owner = "client!jo", name = "M", descriptor = "B")
    private byte field3220;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "S")
    private short field3201;

    @OriginalMember(owner = "client!jo", name = "S", descriptor = "B")
    private byte field3226;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "Z")
    private boolean field3210;

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "Z")
    private boolean field3216;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "Z")
    private boolean field3203;

    @OriginalMember(owner = "client!jo", name = "P", descriptor = "Z")
    private boolean field3223;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "Lc;")
    private class121 field3213;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "Lj;")
    private class377 field3202;

    @OriginalMember(owner = "client!jo", name = "O", descriptor = "[Lrp;")
    public static class299[] field3222 = new class299[16];

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "Lki;")
    public static class498 field3209 = new class498(36, 3);

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!jo", name = "L", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!jo", name = "N", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!jo", name = "Q", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!jo", name = "T", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!jo", name = "U", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V", line = 6)
    public static void method1516(int arg0) {
        field3209 = null;
        if (arg0 > -117) {
            field3209 = null;
        }
        field3222 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIILer;Lqa;IB)V", line = 19)
    public final void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6) {
        if (arg3 instanceof class219) {
            class219 var8 = (class219) arg3;
            if (this.field3213 != null && var8.field3213 != null) {
                this.field3213.method722(var8.field3213, arg1, arg2, arg5, arg0);
            }
        }
        if (arg6 > -105) {
            this.field3202 = null;
        }
        ++field3224;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)Z", line = 40)
    public final boolean method7(byte arg0) {
        if (arg0 < 1) {
            return false;
        } else {
            ++field3215;
            return this.field3223;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z", line = 51)
    public final boolean method18(int arg0) {
        ++field3227;
        if (arg0 <= 72) {
            this.method7((byte) 62);
        }
        return this.field3203;
    }

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "(B)I", line = 70)
    public static final int method1517(byte arg0) {
        ++field3221;
        if ((double) class460.field6813 == 3.0D) {
            return 37;
        } else if ((double) class460.field6813 == 4.0D) {
            return 50;
        } else if ((double) class460.field6813 == 6.0D) {
            return 75;
        } else if ((double) class460.field6813 == 8.0D) {
            return 100;
        } else {
            return arg0 > -127 ? 7 : 200;
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lqa;Lkn;IIIIZIZ)V", line = 94)
    public class219(class162 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field7657, arg1.field7630);
        super.field2749 = arg3;
        this.field3220 = (byte) arg7;
        super.field2756 = arg5;
        this.field3201 = (short) arg1.field7580;
        this.field3226 = (byte) arg2;
        this.field3210 = arg6;
        this.field3216 = arg1.field7573 != 0 && !arg6;
        this.field3203 = arg8;
        this.field3223 = arg0.method1091() && arg1.field7628 && !this.field3210 && class426.field6401.method393(class170.field2529, 1) != 0;
        int var10 = 2048;
        if (this.field3203) {
            var10 |= 65536;
        }
        class266 var11 = this.method1519(-122, this.field3223, arg0, var10);
        if (var11 != null) {
            this.field3213 = var11.field3890;
            this.field3202 = var11.field3889;
            if (this.field3203) {
                this.field3213 = this.field3213.method723((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLqa;)V", line = 129)
    public final void method10(byte arg0, class162 arg1) {
        ++field3207;
        if (arg0 != -32) {
            field3222 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILqa;B)Z", line = 141)
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field3219;
        int var5 = -1 / ((-12 - arg3) / 36);
        class121 var6 = this.method1518(104, arg2, 131072);
        if (var6 != null) {
            class414 var7 = arg2.method1115();
            var7.method913(super.field2749, super.field2751, super.field2756);
            return var6.method706(arg0, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)I", line = 163)
    public final int method20(int arg0) {
        ++field3218;
        if (arg0 != -30685) {
            this.method5((byte) 104);
        }
        return this.field3201 & 65535;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(ILqa;I)Lc;", line = 174)
    private final class121 method1518(int arg0, class162 arg1, int arg2) {
        ++field3212;
        if (this.field3213 != null && ~arg1.method1122(this.field3213.method738(), arg2) == -1) {
            return this.field3213;
        } else {
            class266 var4 = this.method1519(-117, false, arg1, arg2);
            int var5 = 17 % ((-32 - arg0) / 49);
            return var4 != null ? var4.field3890 : null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lqa;B)V", line = 194)
    public final void method14(class162 arg0, byte arg1) {
        ++field3211;
        if (arg1 == 72) {
            Object var3 = null;
            class377 var5;
            if (this.field3202 == null && this.field3223) {
                class266 var4 = this.method1519(-119, true, arg0, 262144);
                var5 = var4 != null ? var4.field3889 : null;
            } else {
                var5 = this.field3202;
                this.field3202 = null;
            }
            if (var5 != null) {
                class342.method2091(var5, this.field3226, super.field2749, super.field2756, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)I", line = 224)
    public final int method5(byte arg0) {
        ++field3214;
        if (arg0 != -65) {
            method1516(-43);
        }
        return 22;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILqa;)V", line = 237)
    public final void method11(int arg0, class162 arg1) {
        ++field3217;
        Object var3 = null;
        if (arg0 > -107) {
            this.field3216 = true;
        }
        class377 var5;
        if (this.field3202 == null && this.field3223) {
            class266 var4 = this.method1519(-119, true, arg1, 262144);
            var5 = var4 == null ? null : var4.field3889;
        } else {
            var5 = this.field3202;
            this.field3202 = null;
        }
        if (var5 != null) {
            class429.method2564(var5, this.field3226, super.field2749, super.field2756, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(ILqa;)Lnf;", line = 264)
    public final class405 method12(int arg0, class162 arg1) {
        ++field3200;
        if (this.field3213 == null) {
            return null;
        } else {
            if (arg0 < 120) {
                this.field3201 = 52;
            }
            class414 var3 = arg1.method1115();
            var3.method913(super.field2749, super.field2751, super.field2756);
            class405 var4 = null;
            if (this.field3216) {
                var4 = class75.method427(1, 0);
            }
            this.field3213.method720(var3, var4 != null ? var4.field6108[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILqa;I)Lc;", line = 292)
    public final class121 method9(int arg0, class162 arg1, int arg2) {
        ++field3228;
        return arg2 > -22 ? null : this.method1518(-90, arg1, arg0);
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)V", line = 306)
    public final void method13(byte arg0) {
        ++field3204;
        if (arg0 != -89) {
            field3205 = -46;
        }
        this.field3203 = false;
        if (this.field3213 != null) {
            this.field3213.method719(this.field3213.method738() & -65537);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)I", line = 321)
    public final int method17(int arg0) {
        int var2 = -28 / ((-41 - arg0) / 61);
        ++field3206;
        return this.field3220;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZLqa;I)Llp;", line = 339)
    private final class266 method1519(int arg0, boolean arg1, class162 arg2, int arg3) {
        ++field3225;
        if (arg0 >= -115) {
            this.field3220 = -45;
        }
        class519 var5 = class252.field3743.method2686(this.field3201 & 65535, (byte) 91);
        class35 var6;
        class35 var7;
        if (!this.field3210) {
            if (~this.field3226 <= -4) {
                var6 = null;
            } else {
                var6 = class307.field4415[this.field3226 + 1];
            }
            var7 = class307.field4415[this.field3226];
        } else {
            var6 = class307.field4415[0];
            var7 = class31.field335[this.field3226];
        }
        return var5.method3060(22, this.field3220, super.field2756, arg1, arg3, var7, super.field2751, arg2, super.field2749, var6, 114);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 372)
    public final void method15(byte arg0) {
        if (arg0 > -10) {
            this.method9(-68, (class162) null, -83);
        }
        ++field3208;
        if (this.field3213 != null) {
            this.field3213.method721();
        }
    }
}
