import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class188 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field3060;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "[I")
    public int[] field3061;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lok;Z)I", line = 21)
    public static final int method1351(class41 arg0, boolean arg1) {
        field3059++;
        return arg1 ? arg0.method275(false) + 1 : 99;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ltc;I)V", line = 32)
    public static final void method1352(class268 arg0, int arg1) {
        field3058++;
        arg0.field4333 = arg0.field4321;
        if (arg0.field4322 == 0) {
            arg0.field4302 = 0;
            return;
        }
        if (arg0.field4300 != -1 && arg0.field4292 == 0) {
            class205 var2 = class285.method2000(arg0.field4300, 4442);
            if (arg0.field4295 > 0 && var2.field3310 == 0) {
                arg0.field4302++;
                return;
            }
            if (arg0.field4295 <= 0 && var2.field3320 == 0) {
                arg0.field4302++;
                return;
            }
        }
        int var3 = arg0.field4280;
        int var4 = arg0.field4311;
        int var5 = arg0.field4341[arg0.field4322 - 1] * 128 + arg0.method1753((byte) -15) * 64;
        int var6 = arg0.field4306[arg0.field4322 - 1] * 128 + (arg0.method1753((byte) -15) * 64);
        if ((var5 - var3) > 256 || (var5 - var3) < -256 || (var6 - var4) > 256 || (var6 - var4) < -256) {
            arg0.field4311 = var6;
            arg0.field4280 = var5;
            return;
        }
        if (var3 >= var5) {
            if (var3 <= var5) {
                if (var4 < var6) {
                    arg0.field4332 = 1024;
                } else if (var6 < var4) {
                    arg0.field4332 = 0;
                }
            } else if (var6 > var4) {
                arg0.field4332 = 768;
            } else if (var6 < var4) {
                arg0.field4332 = 256;
            } else {
                arg0.field4332 = 512;
            }
        } else if (var4 < var6) {
            arg0.field4332 = 1280;
        } else if (var6 < var4) {
            arg0.field4332 = 1792;
        } else {
            arg0.field4332 = 1536;
        }
        int var7 = arg0.field4332 - arg0.field4297 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field4324;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field4298;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field4271;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field4277;
        }
        if (arg1 != 30728) {
            field3055 = -58;
        }
        if (var8 == -1) {
            var8 = arg0.field4298;
        }
        boolean var10 = true;
        arg0.field4333 = var8;
        if (arg0 instanceof class50) {
            var10 = ((class50) arg0).field758.field2234;
        }
        if (var10) {
            if (arg0.field4332 != arg0.field4297 && arg0.field4335 == -1 && arg0.field4282 != 0) {
                var9 = 2;
            }
            if (arg0.field4322 > 2) {
                var9 = 6;
            }
            if (arg0.field4322 > 3) {
                var9 = 8;
            }
            if (arg0.field4302 > 0 && arg0.field4322 > 1) {
                arg0.field4302--;
                var9 = 8;
            }
        } else {
            if (arg0.field4322 > 1) {
                var9 = 6;
            }
            if (arg0.field4322 > 2) {
                var9 = 8;
            }
            if (arg0.field4302 > 0 && arg0.field4322 > 1) {
                var9 = 8;
                arg0.field4302--;
            }
        }
        if (arg0.field4299[arg0.field4322 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var3) {
            arg0.field4280 += var9;
            if (arg0.field4280 > var5) {
                arg0.field4280 = var5;
            }
        } else if (var3 > var5) {
            arg0.field4280 -= var9;
            if (var5 > arg0.field4280) {
                arg0.field4280 = var5;
            }
        }
        if (var9 >= 8 && arg0.field4333 == arg0.field4298 && arg0.field4310 != -1) {
            arg0.field4333 = arg0.field4310;
        }
        if (var4 < var6) {
            arg0.field4311 += var9;
            if (var6 < arg0.field4311) {
                arg0.field4311 = var6;
            }
        } else if (var6 < var4) {
            arg0.field4311 -= var9;
            if (arg0.field4311 < var6) {
                arg0.field4311 = var6;
            }
        }
        if (arg0.field4280 == var5 && arg0.field4311 == var6) {
            if (arg0.field4295 > 0) {
                arg0.field4295--;
            }
            arg0.field4322--;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 248)
    public final void method1353(byte arg0) {
        field3062++;
        class54.method381(this.field3061, this.field3056, this.field3057);
        if (arg0 != -26) {
            field3055 = -11;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 263)
    protected class188() {
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/awt/Graphics;IIII)V")
    public abstract void method179(boolean arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public abstract void method178(int arg0, int arg1, Graphics arg2, byte arg3);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public abstract void method176(int arg0, byte arg1, Component arg2, int arg3);
}
