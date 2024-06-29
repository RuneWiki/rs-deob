import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class428 extends class116 implements class503 {

    @OriginalMember(owner = "client!ou", name = "J", descriptor = "Z")
    private boolean field6278;

    @OriginalMember(owner = "client!ou", name = "L", descriptor = "S")
    private short field6280;

    @OriginalMember(owner = "client!ou", name = "T", descriptor = "B")
    private byte field6287;

    @OriginalMember(owner = "client!ou", name = "H", descriptor = "Z")
    private boolean field6276;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "B")
    private byte field6263;

    @OriginalMember(owner = "client!ou", name = "N", descriptor = "B")
    private byte field6282;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "Z")
    private boolean field6274;

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "Z")
    private boolean field6279;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "Lba;")
    private class263 field6262;

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "Lt;")
    public class471 field6272;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "Z")
    public static boolean field6264 = false;

    @OriginalMember(owner = "client!ou", name = "W", descriptor = "[I")
    public static int[] field6290 = new int[32];

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!ou", name = "M", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!ou", name = "P", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!ou", name = "Q", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!ou", name = "R", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!ou", name = "S", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!ou", name = "U", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!ou", name = "V", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!ou", name = "X", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lya;B)Lmf;")
    public final class289 method484(class38 arg0, byte arg1) {
        if (arg1 <= 111) {
            return null;
        } else {
            ++field6285;
            if (this.field6272 == null) {
                return null;
            } else {
                class122 var3 = arg0.method280();
                var3.method182(super.field1732, super.field1734, super.field1735);
                class289 var4 = null;
                if (this.field6276) {
                    var4 = class165.method1099(true, 1);
                }
                this.field6272.method397(var3, var4 == null ? null : var4.field4009[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lya;II)Lt;")
    private final class471 method2530(class38 arg0, int arg1, int arg2) {
        ++field6283;
        if (this.field6272 != null && arg0.method257(this.field6272.method372(), arg2) == 0) {
            return this.field6272;
        } else {
            if (arg1 != 0) {
                this.field6279 = true;
            }
            class329 var4 = this.method2532(arg2, arg0, (byte) -46, false);
            return var4 == null ? null : var4.field4492;
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(ILya;)V")
    public final void method493(int arg0, class38 arg1) {
        if (arg0 >= -114) {
            this.method488((byte) -88, (class38) null, 102);
        }
        ++field6261;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
    public final int method496(int arg0) {
        ++field6281;
        int var2 = -121 / ((-4 - arg0) / 61);
        return this.field6263;
    }

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "(I)I")
    public final int method2531(int arg0) {
        ++field6269;
        if (arg0 != 65535) {
            this.field6263 = 14;
        }
        return this.field6272 == null ? 15 : this.field6272.method389() / 4;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZILya;I)Z")
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        if (!arg0) {
            this.field6262 = null;
        }
        ++field6273;
        class471 var5 = this.method2530(arg2, 0, 131072);
        if (var5 != null) {
            class122 var6 = arg2.method280();
            var6.method182(super.field1732, super.field1734, super.field1735);
            return var5.method391(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)Z")
    public final boolean method489(int arg0) {
        int var2 = 25 % ((23 - arg0) / 62);
        ++field6289;
        return this.field6279;
    }

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "(I)V")
    public final void method495(int arg0) {
        ++field6268;
        this.field6274 = false;
        if (arg0 > -104) {
            this.method486(103, (class38) null);
        }
        if (this.field6272 != null) {
            this.field6272.method402(this.field6272.method372() & -65537);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILya;BZ)Lso;")
    private final class329 method2532(int arg0, class38 arg1, byte arg2, boolean arg3) {
        ++field6271;
        if (arg2 != -46) {
            this.field6272 = null;
        }
        class220 var5 = class78.field1141.method2103(this.field6280 & 65535, true);
        class142 var6;
        class142 var7;
        if (!this.field6278) {
            if (this.field6282 < 3) {
                var6 = class385.field5608[this.field6282 + 1];
            } else {
                var6 = null;
            }
            var7 = class385.field5608[this.field6282];
        } else {
            var7 = class89.field1302[this.field6282];
            var6 = class385.field5608[0];
        }
        return var5.method1377(arg1, var7, this.field6263 != 11 ? this.field6287 : this.field6287 + 4, arg2 + -4689, super.field1732, arg3, var6, super.field1734, super.field1735, arg0, this.field6263 == 11 ? 10 : this.field6263);
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(ILya;)V")
    public final void method486(int arg0, class38 arg1) {
        ++field6265;
        Object var3 = null;
        if (arg0 == 9229) {
            class263 var5;
            if (this.field6262 == null && this.field6279) {
                class329 var4 = this.method2532(262144, arg1, (byte) -46, true);
                var5 = var4 == null ? null : var4.field4490;
            } else {
                var5 = this.field6262;
                this.field6262 = null;
            }
            if (var5 != null) {
                class195.method1212(var5, this.field6282, super.field1732, super.field1735, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lya;Ljo;IIIIIZIIIIIIZ)V")
    public class428(class38 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3086 == 1, class22.method136(arg12, (byte) 120, arg13));
        this.field6278 = arg7;
        this.field6280 = (short) arg1.field3110;
        this.field6287 = (byte) arg13;
        this.field6276 = ~arg1.field3119 != -1 && !arg7;
        this.field6263 = (byte) arg12;
        this.field6282 = (byte) arg3;
        this.field6274 = arg14;
        this.field6279 = arg0.method314() && arg1.field3073 && !this.field6278 && class20.field269.method3085(class152.field2332, (byte) -38) != 0;
        int var16 = 2048;
        if (this.field6274) {
            var16 |= 65536;
        }
        class329 var17 = this.method2532(var16, arg0, (byte) -46, this.field6279);
        if (var17 != null) {
            this.field6262 = var17.field4490;
            this.field6272 = var17.field4492;
            if (this.field6274) {
                this.field6272 = this.field6272.method381((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILya;)V")
    public final void method482(int arg0, class38 arg1) {
        ++field6266;
        if (arg0 >= -56) {
            this.field6278 = false;
        }
        Object var3 = null;
        class263 var5;
        if (this.field6262 == null && this.field6279) {
            class329 var4 = this.method2532(262144, arg1, (byte) -46, true);
            var5 = var4 != null ? var4.field4490 : null;
        } else {
            var5 = this.field6262;
            this.field6262 = null;
        }
        if (var5 != null) {
            class365.method2203(var5, this.field6282, super.field1732, super.field1735, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(Z)V")
    public static void method2533(boolean arg0) {
        field6290 = null;
        if (arg0) {
            method2534(11, -2, -100, -38, -111);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lya;IZLij;III)V")
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        ++field6277;
        if (arg3 instanceof class60) {
            class60 var8 = (class60) arg3;
            if (this.field6272 != null && var8.field749 != null) {
                this.field6272.method375(var8.field749, arg1, arg5, arg4, arg2);
            }
        } else if (arg3 instanceof class428) {
            class428 var9 = (class428) arg3;
            if (this.field6272 != null && var9.field6272 != null) {
                this.field6272.method375(var9.field6272, arg1, arg5, arg4, arg2);
            }
        }
        if (arg6 != -1) {
            this.method2530((class38) null, -128, 110);
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    public final void method485(int arg0) {
        if (arg0 >= -92) {
            this.field6276 = false;
        }
        ++field6284;
        if (this.field6272 != null) {
            this.field6272.method371();
        }
    }

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "(I)Z")
    public final boolean method492(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field6291;
            return this.field6274;
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(Z)I")
    public final int method792(boolean arg0) {
        ++field6267;
        if (!arg0) {
            return -52;
        } else {
            return this.field6272 != null ? this.field6272.method380() : 0;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BLya;I)Lt;")
    public final class471 method488(byte arg0, class38 arg1, int arg2) {
        ++field6288;
        if (arg0 != 124) {
            this.field6278 = true;
        }
        return this.method2530(arg1, arg0 ^ 124, arg2);
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)I")
    public final int method499(int arg0) {
        ++field6286;
        if (arg0 != -15561) {
            method2534(-74, -95, 90, -67, 74);
        }
        return this.field6287;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIII)V")
    public static final void method2534(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6270;
        class97 var5 = class348.method2064(arg1, arg0, arg0 + 108);
        var5.method712((byte) -84);
        var5.field1471 = arg3;
        var5.field1472 = arg4;
        var5.field1468 = arg2;
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)I")
    public final int method490(int arg0) {
        ++field6275;
        return arg0 != -29679 ? 81 : this.field6280 & 65535;
    }
}
