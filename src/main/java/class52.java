import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class52 extends class248 {

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Z")
    private boolean field730 = false;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "Lca;")
    private class91 field743 = null;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    private int field747 = -1;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "Z")
    private boolean field748 = false;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    private int field757 = -32768;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    private int field752 = -1;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    private int field737;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    private int field734;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "Lqk;")
    private class57 field753;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    private int field749;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "Z")
    public static boolean field741 = true;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "[I")
    public static int[] field745 = new int[2048];

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "[I")
    public static int[] field735 = new int[100];

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Lom;")
    private class65 field731;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "[I")
    public static int[] field756;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIII)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field763++;
        this.method347(arg3, (byte) 109, arg4);
        class248 var6 = null;
        if (!this.field748) {
            if (var6 == null) {
                var6 = this.method350(true);
            }
            if (var6 == null) {
                return;
            }
            this.method349((byte) -2, var6);
        }
        if (this.field731 != null) {
            this.field731.method416(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()I")
    public final int method4() {
        field762++;
        return this.field757;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)V")
    private final void method347(int arg0, byte arg1, int arg2) {
        int var4 = -35 / ((arg1 - 28) / 58);
        field751++;
        label88: while (true) {
            if (this.field753 == null) {
                if (this.field730) {
                    return;
                }
                this.method353(-1, 0);
                if (this.field753 == null) {
                    return;
                }
            }
            int var5 = class311.field4996 - this.field761;
            if (var5 > 100 && this.field753.field830 > 0) {
                int var6 = this.field753.field850.length - this.field753.field830;
                while (this.field738 < var6 && var5 > this.field753.field828[this.field738]) {
                    var5 -= this.field753.field828[this.field738];
                    this.field738++;
                }
                if (var6 <= this.field738) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field753.field850.length; var8++) {
                        var7 += this.field753.field828[var8];
                    }
                    var5 %= var7;
                }
                this.field749 = this.field738 + 1;
                if (this.field749 >= this.field753.field850.length) {
                    this.field749 -= this.field753.field830;
                    if (this.field749 < 0 || this.field753.field850.length <= this.field749) {
                        this.field749 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var5 <= this.field753.field828[this.field738]) {
                            this.field761 = class311.field4996 - var5;
                            this.field746 = var5;
                            return;
                        }
                        class173.method1240(arg0, arg2, -9160, false, this.field753, this.field738);
                        var5 -= this.field753.field828[this.field738];
                        this.field738++;
                        if (this.field753.field850.length <= this.field738) {
                            this.field738 -= this.field753.field830;
                            if (this.field738 < 0 || this.field738 >= this.field753.field850.length) {
                                this.field753 = null;
                                continue label88;
                            }
                        }
                        this.field749 = this.field738 + 1;
                    } while (this.field753.field850.length > this.field749);
                    this.field749 -= this.field753.field830;
                } while (this.field749 >= 0 && this.field753.field850.length > this.field749);
                this.field749 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZLfe;)V")
    public static final void method348(boolean arg0, class231 arg1) {
        int var2 = arg1.field3563;
        if (arg0) {
            field756 = null;
        }
        field736++;
        if (var2 == 324) {
            if (class135.field1955 == -1) {
                class135.field1955 = arg1.field3605;
                class271.field4408 = arg1.field3638;
            }
            if (class309.field4972.field2711) {
                arg1.field3605 = class135.field1955;
            } else {
                arg1.field3605 = class271.field4408;
            }
        } else if (var2 == 325) {
            if (class135.field1955 == -1) {
                class135.field1955 = arg1.field3605;
                class271.field4408 = arg1.field3638;
            }
            if (class309.field4972.field2711) {
                arg1.field3605 = class271.field4408;
            } else {
                arg1.field3605 = class135.field1955;
            }
        } else if (var2 == 327) {
            arg1.field3651 = 150;
            arg1.field3695 = (int) (Math.sin((double) class311.field4996 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3609 = -1;
            arg1.field3675 = 5;
        } else if (var2 == 328) {
            if (class214.field3347.field31 == null) {
                arg1.field3609 = 0;
            } else {
                arg1.field3651 = 150;
                arg1.field3695 = (int) (Math.sin((double) class311.field4996 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3675 = 5;
                arg1.field3609 = ((int) class176.method1256((byte) 127, class214.field3347.field31) << 11) + 2047;
                arg1.field3669 = 0;
                arg1.field3659 = class214.field3347.field3959;
                arg1.field3631 = class214.field3347.field3946;
                arg1.field3647 = class214.field3347.field3889;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIJILom;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        field759++;
        class248 var13 = this.method350(true);
        if (var13 != null) {
            this.method349((byte) -2, var13);
            var13.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field731);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLsc;)V")
    private final void method349(byte arg0, class248 arg1) {
        field750++;
        if (arg0 != -2) {
            this.method347(81, (byte) -69, -70);
        }
        class51 var3 = (class51) arg1;
        if ((this.field731 == null || this.field731.field933) && (var3.field653 != null || var3.field665 != null)) {
            class191 var4 = class128.method822(this.field734, (byte) 120);
            if (var4.field2963 != null) {
                var4 = var4.method1340(0);
            }
            if (var4 != null) {
                this.field731 = new class65(class311.field4996, var4.field2993, var4.field3039);
            }
        }
        if (this.field731 != null) {
            this.field731.method427(var3.field653, var3.field665, false, var3.field647, var3.field649, var3.field673);
        }
        this.field748 = true;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)Lsc;")
    public final class248 method350(boolean arg0) {
        field739++;
        return arg0 ? this.method355(false, 27938) : null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)I")
    public static final int method351(int arg0, int arg1, int arg2, int arg3) {
        field732++;
        if (class8.field114 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        } else if (arg0 >= -88) {
            return 47;
        } else {
            int var6 = arg2 & 0x7F;
            int var7 = arg3;
            if (arg3 < 3 && (class74.field1121[1][var4][var5] & 0x2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = (128 - var6) * class8.field114[var7][var4][var5] + class8.field114[var7][var4 + 1][var5] * var6 >> 7;
            int var9 = (128 - var6) * class8.field114[var7][var4][var5 + 1] + class8.field114[var7][var4 + 1][var5 + 1] * var6 >> 7;
            int var10 = arg1 & 0x7F;
            return (128 - var10) * var8 + var9 * var10 >> 7;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIII)V")
    public static final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class49.field628 = arg0;
        class50.field639 = arg1;
        field758++;
        if (arg2 != 29043) {
            return;
        }
        class284.field4608 = arg5;
        class82.field1250 = arg3;
        class211.field3292 = arg4;
        if (class49.field628 >= 100) {
            int var6 = class50.field639 * 128 + 64;
            int var7 = class82.field1250 * 128 + 64;
            int var8 = method351(-114, var6, var7, class148.field2204) - class284.field4608;
            int var9 = var7 - class99.field1474;
            int var10 = var8 - class21.field279;
            int var11 = var6 - class255.field4159;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class147.field2189 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class56.field817 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 0x7FF;
            if (class147.field2189 < 128) {
                class147.field2189 = 128;
            }
            if (class147.field2189 > 383) {
                class147.field2189 = 383;
            }
        }
        class158.field2370 = 2;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V")
    private final void method353(int arg0, int arg1) {
        field742++;
        boolean var3 = false;
        int var4 = arg0;
        if (~arg0 == arg1) {
            class191 var5 = class128.method822(this.field734, (byte) -106);
            class191 var6 = var5;
            if (var5.field2963 != null) {
                var5 = var5.method1340(0);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field2972 != null) {
                if (this.field753 != null && var5.method1329(this.field753.field827, 3)) {
                    return;
                }
                var4 = var5.method1341(-1);
                if (this.field747 != var5.field3019) {
                    var3 = var5.field2994;
                }
            } else if (var5.field2985 == -1) {
                if (var6 != null && var6.field2972 != null) {
                    if (this.field753 != null && var6.method1329(this.field753.field827, 3)) {
                        return;
                    }
                    var4 = var6.method1341(-1);
                    if (this.field747 != var6.field3019) {
                        var3 = var6.field2994;
                    }
                } else if (var6 != null && var6.field2985 != -1 && this.field747 != var6.field3019) {
                    var3 = var6.field2994;
                    var4 = var6.field2985;
                }
            } else if (this.field747 != var5.field3019) {
                var3 = var5.field2994;
                var4 = var5.field2985;
            }
        }
        if (var4 == -1) {
            this.field753 = null;
            return;
        }
        if (this.field753 == null || this.field753.field827 != var4) {
            this.field753 = class174.method1241(-128, var4);
        } else if (this.field753.field839 == 0) {
            return;
        }
        if (var3) {
            this.field738 = (int) ((double) this.field753.field850.length * Math.random());
            this.field746 = (int) (Math.random() * (double) this.field753.field828[this.field738]) + 1;
        } else {
            this.field738 = 0;
            this.field746 = 1;
        }
        this.field749 = this.field738 + 1;
        if (this.field749 < 0 || this.field749 >= this.field753.field850.length) {
            this.field749 = -1;
        }
        this.field761 = class311.field4996 - this.field746;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public static void method354(byte arg0) {
        field756 = null;
        if (arg0 == -12) {
            field745 = null;
            field735 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIIIIIZLsc;)V")
    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class248 arg8) {
        this.field733 = arg3;
        this.field737 = arg5;
        this.field729 = arg1;
        this.field754 = arg4;
        this.field755 = arg2;
        this.field734 = arg0;
        if (arg8 != null) {
            this.field730 = true;
            if (arg8 instanceof class52) {
                class52 var10 = (class52) arg8;
                this.field746 = var10.field746;
                this.field753 = var10.field753;
                this.field761 = var10.field761;
                this.field738 = var10.field738;
                this.field749 = var10.field749;
            }
        }
        if (this.field730) {
            this.method353(arg6, 0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field744++;
        if (this.field731 != null) {
            this.field731.method428();
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)Lsc;")
    private final class248 method355(boolean arg0, int arg1) {
        boolean var3 = class8.field114 != class285.field4613;
        field760++;
        class191 var4 = class128.method822(this.field734, (byte) 122);
        if (arg1 != 27938) {
            this.method349((byte) -22, (class248) null);
        }
        if (var4.field2963 != null) {
            var4 = var4.method1340(0);
        }
        if (var4 == null) {
            this.field747 = -1;
            this.field752 = this.field738;
            return null;
        }
        if (!this.field730 && this.field747 != var4.field3019) {
            this.method353(-1, 0);
        }
        int var5 = this.field755 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field3039;
            var6 = var4.field2993;
        } else {
            var6 = var4.field3039;
            var7 = var4.field2993;
        }
        int var8 = (var7 + 1 >> 1) + this.field754;
        int var9 = (var7 >> 1) + this.field754;
        int var10 = (var6 >> 1) + this.field737;
        int var11 = (var6 + 1 >> 1) + this.field737;
        this.method347(var9 * 128, (byte) 89, var10 * 128);
        boolean var12 = !var3 && var4.field3032 && (this.field747 != var4.field3019 || (this.field752 != this.field738 || this.field753 != null && (this.field753.field823 || class229.field3538) && this.field749 != this.field738) && class22.field286 >= 2);
        if (arg0 && !var12) {
            this.field747 = var4.field3019;
            this.field752 = this.field738;
            return null;
        }
        int var13 = (this.field737 << 7) + (var6 << 6);
        int[][] var14 = class8.field114[this.field733];
        int var15 = (this.field754 << 7) + (var7 << 6);
        int[][] var16 = null;
        if (var3) {
            var16 = class285.field4613[0];
        } else if (this.field733 < 3) {
            var16 = class8.field114[this.field733 + 1];
        }
        int var17 = var14[var8][var10] + var14[var9][var11] + var14[var8][var11] + var14[var9][var10] >> 2;
        boolean var18 = this.field743 == null;
        class177 var19;
        if (this.field753 == null) {
            var19 = var4.method1334(var16, var15, false, var13, var18 ? class183.field2869 : this.field743, -107, var14, this.field755, this.field729, var17, var12);
        } else {
            var19 = var4.method1333(var16, var18 ? class183.field2869 : this.field743, this.field753, -32005, var12, var13, this.field746, this.field755, var14, var15, this.field738, this.field749, var17, this.field729);
        }
        if (var19 == null) {
            this.field752 = this.field738;
            this.field747 = var4.field3019;
            return null;
        } else {
            this.field752 = this.field738;
            this.field747 = var4.field3019;
            return var19.field2784;
        }
    }
}
