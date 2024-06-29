import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class554 extends class69 {

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "Lae;")
    public class40 field7716 = new class40();

    @OriginalMember(owner = "client!eba", name = "B", descriptor = "Lch;")
    public class218 field7721 = new class218();

    @OriginalMember(owner = "client!eba", name = "y", descriptor = "Ldt;")
    private class223 field7718;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!eba", name = "A", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "([III)V", line = 3)
    public final void method412(int[] arg0, int arg1, int arg2) {
        field7713++;
        this.field7721.method412(arg0, arg1, arg2);
        for (class346 var4 = (class346) this.field7716.method237(101); var4 != null; var4 = (class346) this.field7716.method245((byte) 65)) {
            if (!this.field7718.method1318((byte) 84, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field4430) {
                        this.method3058(arg0, var4, var5 + var6, var5, var6, 0);
                        var4.field4430 -= var5;
                        break;
                    }
                    this.method3058(arg0, var4, var5 + var6, var4.field4430, var6, 0);
                    var5 -= var4.field4430;
                    var6 += var4.field4430;
                } while (!this.field7718.method1322(arg0, var4, var6, var5, -1908521944));
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "()I", line = 48)
    public final int method415() {
        field7711++;
        return 0;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBLhb;)V", line = 58)
    private final void method3053(int arg0, byte arg1, class346 arg2) {
        if ((this.field7718.field2749[arg2.field4427] & 0x4) != 0 && arg2.field4445 < 0) {
            int var4 = this.field7718.field2745[arg2.field4427] / class392.field4942;
            int var5 = (var4 + 1048575 - arg2.field4435) / var4;
            arg2.field4435 = arg0 * var4 + arg2.field4435 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field7718.field2770[arg2.field4427] == 0) {
                    arg2.field4448 = class519.method2836(arg2.field4431, arg2.field4448.method2820(), arg2.field4448.method2826(), arg2.field4448.method2814());
                } else {
                    arg2.field4448 = class519.method2836(arg2.field4431, arg2.field4448.method2820(), 0, arg2.field4448.method2814());
                    this.field7718.method1333(8, arg2, arg2.field4429.field5362[arg2.field4441] < 0);
                }
                if (arg2.field4429.field5362[arg2.field4441] < 0) {
                    arg2.field4448.method2841(-1);
                }
                arg0 = arg2.field4435 / var4;
            }
        }
        field7709++;
        if (arg1 < 38) {
            this.field7721 = null;
        }
        arg2.field4448.method410(arg0);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BII)Z", line = 98)
    public static final boolean method3054(byte arg0, int arg1, int arg2) {
        if (arg0 < 23) {
            return true;
        } else {
            field7708++;
            return false;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIII)V", line = 110)
    public static final void method3055(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class301.field3698.field6633 * arg1 >> 8;
        field7714++;
        if (var4 != 0 && arg3 != -1) {
            class627.method3447(false, 0, var4, class36.field496, (byte) -12, arg3);
            class639.field8989 = true;
        }
        if (arg0 == 6567) {
            ;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "()Lpn;", line = 132)
    public final class69 method409() {
        field7715++;
        class346 var1 = (class346) this.field7716.method237(118);
        if (var1 == null) {
            return null;
        } else if (var1.field4448 == null) {
            return this.method413();
        } else {
            return var1.field4448;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V", line = 149)
    public final void method410(int arg0) {
        field7720++;
        this.field7721.method410(arg0);
        for (class346 var2 = (class346) this.field7716.method237(115); var2 != null; var2 = (class346) this.field7716.method245((byte) 70)) {
            if (!this.field7718.method1318((byte) 84, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field4430 >= var3) {
                        this.method3053(var3, (byte) 61, var2);
                        var2.field4430 -= var3;
                        break;
                    }
                    this.method3053(var2.field4430, (byte) 122, var2);
                    var3 -= var2.field4430;
                } while (!this.field7718.method1322(null, var2, 0, var3, -1908521944));
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z[IIIIIII)Z", line = 185)
    public static final boolean method3056(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class278.field3478 < arg4) {
            arg4 = class278.field3478;
        }
        field7710++;
        if (arg6 < 0) {
            arg6 = 0;
        }
        if (arg6 >= arg4) {
            return true;
        }
        int var8 = arg2 * arg6 + arg5;
        int var9 = arg4 - arg6 >> 2;
        int var10 = arg6 + arg3 - 1;
        if (class653.field9212 == 1) {
            class160.field2109 += var9;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var15 = arg4 - arg6 & 0x3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            return arg0;
                        }
                        var10++;
                        if (var8 < arg1[var10]) {
                            arg1[var10] = var8;
                        }
                        var8 += arg2;
                    }
                }
                var10++;
                if (arg1[var10] > var8) {
                    arg1[var10] = var8;
                }
                int var16 = arg2 + var8;
                var10++;
                if (var16 < arg1[var10]) {
                    arg1[var10] = var16;
                }
                int var17 = arg2 + var16;
                var10++;
                if (arg1[var10] > var17) {
                    arg1[var10] = var17;
                }
                int var18 = arg2 + var17;
                var10++;
                if (arg1[var10] > var18) {
                    arg1[var10] = var18;
                }
                var8 = arg2 + var18;
            }
        } else {
            var8 -= 15360;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var11 = arg4 - arg6 & 0x3;
                    while (true) {
                        var11--;
                        if (var11 < 0) {
                            return arg0;
                        }
                        var10++;
                        if (arg1[var10] > var8) {
                            return false;
                        }
                        var8 += arg2;
                    }
                }
                var10++;
                if (arg1[var10] > var8) {
                    return false;
                }
                int var12 = arg2 + var8;
                var10++;
                if (arg1[var10] > var12) {
                    return false;
                }
                int var13 = arg2 + var12;
                var10++;
                if (var13 < arg1[var10]) {
                    return false;
                }
                int var14 = arg2 + var13;
                int var10000 = ~var14;
                var10++;
                if (var10000 > ~arg1[var10]) {
                    return false;
                }
                var8 = arg2 + var14;
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)V", line = 281)
    public static final void method3057(int arg0, int arg1) {
        if (arg0 != -1) {
            method3057(22, 76);
        }
        field7719++;
        class592 var2 = class61.method371(4, arg1, (byte) 118);
        var2.method3253(0);
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Ldt;)V", line = 386)
    public class554(class223 arg0) {
        this.field7718 = arg0;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "([ILhb;IIII)V", line = 302)
    private final void method3058(int[] arg0, class346 arg1, int arg2, int arg3, int arg4, int arg5) {
        if ((this.field7718.field2749[arg1.field4427] & 0x4) != 0 && arg1.field4445 < 0) {
            int var7 = this.field7718.field2745[arg1.field4427] / class392.field4942;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field4435) / var7;
                if (arg3 < var8) {
                    arg1.field4435 += arg3 * var7;
                    break;
                }
                arg1.field4448.method412(arg0, arg4, var8);
                arg1.field4435 += var7 * var8 - 1048576;
                arg4 += var8;
                arg3 -= var8;
                int var9 = class392.field4942 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class519 var11 = arg1.field4448;
                if (this.field7718.field2770[arg1.field4427] == 0) {
                    arg1.field4448 = class519.method2836(arg1.field4431, var11.method2820(), var11.method2826(), var11.method2814());
                } else {
                    arg1.field4448 = class519.method2836(arg1.field4431, var11.method2820(), 0, var11.method2814());
                    this.field7718.method1333(8, arg1, arg1.field4429.field5362[arg1.field4441] < 0);
                    arg1.field4448.method2813(var9, var11.method2826());
                }
                if (arg1.field4429.field5362[arg1.field4441] < 0) {
                    arg1.field4448.method2841(-1);
                }
                var11.method2837(var9);
                var11.method412(arg0, arg4, arg2 - arg4);
                if (var11.method2843()) {
                    this.field7721.method1296(var11);
                }
            }
        }
        field7712++;
        arg1.field4448.method412(arg0, arg4, arg3);
        if (arg5 != 0) {
            method3054((byte) 54, -2, -37);
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "()Lpn;", line = 364)
    public final class69 method413() {
        field7717++;
        class346 var1;
        do {
            var1 = (class346) this.field7716.method245((byte) 81);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4448 == null);
        return var1.field4448;
    }
}
