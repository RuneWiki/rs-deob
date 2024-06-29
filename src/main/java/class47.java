import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class47 extends class60 implements class116 {

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "Laf;")
    public class110 field608;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "Z")
    private boolean field621;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!dt", name = "E", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!dt", name = "F", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!dt", name = "K", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!dt", name = "L", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!dt", name = "M", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!dt", name = "N", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "Lqp;")
    public static class302 field611;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBII)I")
    public static final int method247(int arg0, byte arg1, int arg2, int arg3) {
        ++field626;
        if (arg2 == arg3) {
            return arg3;
        } else if (arg1 <= 58) {
            return -92;
        } else {
            int var4 = 128 - arg0;
            int var5 = (arg2 & 127) * arg0 + (arg3 & 127) * var4 >> 7;
            int var6 = (896 & arg2) * arg0 + (arg3 & 896) * var4 >> 7;
            int var7 = (arg2 & 64512) * arg0 + (arg3 & 64512) * var4 >> 7;
            return var6 & 896 | 64512 & var7 | var5 & 127;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)I")
    public final int method26(byte arg0) {
        if (arg0 != 73) {
            return -104;
        } else {
            ++field617;
            return this.field608.field1341;
        }
    }

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)V")
    public final void method32(int arg0) {
        ++field607;
        if (arg0 == -2) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lve;B)V")
    public static final void method248(class331 arg0, byte arg1) {
        arg0.method2016(116);
        ++field614;
        int var2 = class61.field760;
        class198 var3 = class19.field258 = class46.field596[var2] = new class198();
        var3.field2457 = var2;
        int var4 = arg0.method2017(-28, 30);
        if (arg1 < 5) {
            field625 = -112;
        }
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 268430430) >> 14;
        var3.field2539[0] = -class93.field1163 + var6;
        int var7 = var4 & 16383;
        var3.field1008 = (var3.field2539[0] << 7) - -(var3.method1012(false) << 6);
        var3.field2536[0] = -class349.field5023 + var7;
        var3.field1005 = (var3.field2536[0] << 7) - -(var3.method1012(false) << 6);
        class100.field1217 = var3.field994 = var5;
        if (class360.field5176[var2] != null) {
            var3.method1078(class360.field5176[var2], true);
        }
        class438.field6286 = 0;
        class79.field944[class438.field6286++] = var2;
        class42.field513[var2] = 0;
        class188.field2549 = 0;
        for (int var8 = 1; var8 < 2048; ++var8) {
            if (var2 != var8) {
                int var9 = arg0.method2017(-45, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 255;
                int var12 = var9 & 255;
                class138.field1671[var8] = (var10 << 28) + (var11 << 14) + var12;
                class456.field6431[var8] = 0;
                class210.field2904[var8] = -1;
                class66.field825[class188.field2549++] = var8;
                class42.field513[var8] = 0;
            }
        }
        arg0.method2006((byte) 123);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILoj;)V")
    public final void method20(int arg0, class280 arg1) {
        this.field608.method528(arg1, 131072);
        if (arg0 != 5744) {
            this.field621 = true;
        }
        ++field619;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILoj;II)Z")
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        ++field613;
        class352 var5 = this.field608.method529(false, 99, arg1, super.field750, super.field749, 65536, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg3 != -6085) {
                this.method23(21, 15, false, (class78) null, -96, (byte) 60, (class280) null);
            }
            class327 var6 = arg1.method1456();
            var6.method553(super.field749, super.field748, super.field750);
            return var5.method1695(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lph;III[Z)Z")
    public static final boolean method249(class125 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class398.field5667 != class361.field5208) {
            int var6 = class443.field6329[arg1].method1857(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class443 var8 = class443.field6329[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1857(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1871(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1864(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(ILoj;)V")
    public final void method27(int arg0, class280 arg1) {
        ++field624;
        class352 var3 = this.field608.method529(true, arg0 ^ 104, arg1, super.field750, super.field749, 131072, true);
        if (var3 != null) {
            this.field608.method532((byte) -90, var3, false, super.field750 >> 7, super.field750 >> 7, super.field749 >> 7, super.field749 >> 7, arg1);
        }
        if (arg0 != 0) {
            field625 = 74;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (arg0 >= 41) {
            ++field615;
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Loj;Lcu;IIIIIZII)V")
    public class47(class280 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field5944, arg1.field5988);
        this.field608 = new class110(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field621 = arg1.field5990 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZLa;IBLoj;)V")
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        ++field610;
        if (arg5 != -65) {
            field611 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(ILoj;)Lmg;")
    public final class451 method19(int arg0, class280 arg1) {
        ++field612;
        class352 var3 = this.field608.method529(true, 68, arg1, super.field750, super.field749, 1024, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 95) {
                method249((class125) null, 26, 112, 126, (boolean[]) null);
            }
            class327 var4 = arg1.method1456();
            var4.method553(super.field749, super.field748, super.field750);
            class451 var5 = null;
            if (this.field621) {
                var5 = class134.method638(762096108, 1);
            }
            if (this.field608.field1331 == null) {
                var3.method1716(var4, var5 != null ? var5.field6379[0] : null, 0);
            } else {
                class46 var6 = this.field608.field1331.method2272();
                arg1.method1463(var3, var6, var4, var5 != null ? var5.field6379[0] : null, 0);
            }
            this.field608.method532((byte) -108, var3, true, super.field750 >> 7, super.field750 >> 7, super.field749 >> 7, super.field749 >> 7, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(ILoj;)V")
    public final void method18(int arg0, class280 arg1) {
        this.field608.method523(-27426, arg1);
        int var3 = -110 % ((62 - arg0) / 63);
        ++field620;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILoj;B)Lqh;")
    public final class352 method21(int arg0, class280 arg1, byte arg2) {
        ++field623;
        return arg2 != -98 ? null : this.field608.method529(false, arg2 ^ -32, arg1, 0, 0, arg0, false);
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)I")
    public final int method31(byte arg0) {
        int var2 = 46 % ((arg0 - -23) / 35);
        ++field616;
        return this.field608.field1333;
    }

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)Z")
    public final boolean method33(int arg0) {
        if (arg0 != 1957) {
            field611 = null;
        }
        ++field609;
        return false;
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V")
    public static final void method250(byte arg0) {
        int var1 = 112 / ((arg0 - 66) / 55);
        class101.field1227 = new class401(8);
        ++field606;
        class188.field2554 = 0;
        for (class380 var2 = (class380) class224.field3110.method2334(-102); var2 != null; var2 = (class380) class224.field3110.method2340(-107)) {
            var2.method2280();
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)Z")
    public final boolean method22(int arg0) {
        ++field622;
        if (arg0 > -32) {
            this.method18(80, (class280) null);
        }
        return this.field608.method524(10);
    }

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "(I)V")
    public static void method251(int arg0) {
        field611 = null;
        if (arg0 != 17822) {
            field611 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)I")
    public final int method16(boolean arg0) {
        if (arg0) {
            return 39;
        } else {
            ++field618;
            return this.field608.field1346;
        }
    }
}
