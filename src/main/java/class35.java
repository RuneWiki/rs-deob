import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class35 extends class184 {

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    private int field490 = -32768;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    private int field507 = -1;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lfc;")
    private class148 field491 = null;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    private int field495 = -1;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "Z")
    private boolean field518 = false;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lpb;")
    private class167 field499;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field509 = -1;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field487 = 0;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Z")
    public static boolean field506 = false;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "Lgh;")
    private class32 field516;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lcj;")
    public static class74 field502;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method228(arg4, arg3, 3091);
        field515++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)I")
    public static final int method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg1;
            arg1 = var7;
        }
        field513++;
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (arg4 != 12897) {
            return 91;
        } else if (var8 == 1) {
            return 7 + 1 - arg6 - arg5;
        } else if (var8 == 2) {
            return 1 + 7 - arg3 - arg1;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)V")
    private final void method228(int arg0, int arg1, int arg2) {
        if (arg2 != 3091) {
            method229(true);
        }
        field517++;
        if (this.field499 == null) {
            return;
        }
        int var4 = class266.field4301 - this.field501;
        if (var4 > 100 && this.field499.field2725 > 0) {
            int var5 = this.field499.field2736.length - this.field499.field2725;
            while (this.field514 < var5 && var4 > this.field499.field2751[this.field514]) {
                var4 -= this.field499.field2751[this.field514];
                this.field514++;
            }
            if (var5 <= this.field514) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field499.field2736.length; var7++) {
                    var6 += this.field499.field2751[var7];
                }
                var4 %= var6;
            }
            this.field503 = this.field514 + 1;
            if (this.field503 >= this.field499.field2736.length) {
                this.field503 -= this.field499.field2725;
                if (this.field503 < 0 || this.field499.field2736.length <= this.field503) {
                    this.field503 = -1;
                }
            }
        }
        while (var4 > this.field499.field2751[this.field514]) {
            class112.method786(arg0, this.field499, this.field514, arg1, (byte) -16, false);
            var4 -= this.field499.field2751[this.field514];
            this.field514++;
            if (this.field499.field2736.length <= this.field514) {
                this.field514 -= this.field499.field2725;
                if (this.field514 < 0 || this.field514 >= this.field499.field2736.length) {
                    this.field499 = null;
                    break;
                }
            }
            this.field503 = this.field514 + 1;
            if (this.field503 >= this.field499.field2736.length) {
                this.field503 -= this.field499.field2725;
                if (this.field503 < 0 || this.field499.field2736.length <= this.field503) {
                    this.field503 = -1;
                }
            }
        }
        this.field501 = class266.field4301 - var4;
        this.field493 = var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()I")
    public final int method110() {
        field497++;
        return this.field490;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIJILgh;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class32 arg10) {
        field498++;
        class184 var13 = this.method233(true);
        if (var13 != null) {
            var13.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field516);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V")
    public static void method229(boolean arg0) {
        field502 = null;
        if (!arg0) {
            field504 = -111;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Ltb;")
    private final class184 method230(int arg0, boolean arg1) {
        field494++;
        boolean var3 = class95.field1642 != class78.field1342;
        class206 var4 = class10.method64(64, this.field512);
        int var5 = var4.field3400;
        if (var4.field3373 != null) {
            var4 = var4.method1375((byte) 93);
        }
        if (var4 == null) {
            return null;
        }
        if (class185.field3002 != 0 && this.field518 && (this.field499 == null || this.field499 != null && this.field499.field2732 != var4.field3400)) {
            int var6 = var4.field3400;
            if (var4.field3400 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field499 = null;
            } else {
                this.field499 = class105.method714(var6, (byte) 93);
            }
            if (this.field499 != null) {
                if (var4.field3395 && this.field499.field2725 != -1) {
                    this.field514 = (int) ((double) this.field499.field2736.length * Math.random());
                    this.field501 -= (int) (Math.random() * (double) this.field499.field2751[this.field514]);
                } else {
                    this.field501 = class266.field4301 - 1;
                    this.field514 = 0;
                }
            }
        }
        int var7 = this.field510 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field3404;
            var8 = var4.field3377;
        } else {
            var8 = var4.field3404;
            var9 = var4.field3377;
        }
        int var10 = (var9 >> 1) + this.field500;
        int var11 = (arg0 + var9 >> 1) + this.field500;
        int var12 = (var8 >> 1) + this.field489;
        int var13 = this.field489 + (var8 + 1 >> 1);
        this.method228(var12 * 128, var10 * 128, 3091);
        boolean var14 = !var3 && var4.field3421 && (this.field507 != var4.field3384 || (this.field514 != this.field495 || this.field499 != null && (this.field499.field2748 || class261.field4255) && this.field514 != this.field503) && class24.field379 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class95.field1642[this.field496];
        int var16 = (this.field489 << 7) + (var8 << 6);
        int var17 = var15[var10][var12] + var15[var11][var13] + var15[var11][var12] + var15[var10][var13] >> 2;
        int[][] var18 = null;
        int var19 = (this.field500 << 7) + (var9 << 6);
        if (var3) {
            var18 = class78.field1342[0];
        } else if (this.field496 < 3) {
            var18 = class95.field1642[this.field496 + 1];
        }
        boolean var20 = this.field491 == null;
        class160 var21;
        if (this.field499 == null) {
            var21 = var4.method1374(var17, -24050, var16, this.field511, var20 ? class2.field27 : this.field491, var14, var18, var15, false, this.field510, var19);
        } else {
            var21 = var4.method1373(var16, (byte) 112, this.field503, this.field511, var14, this.field499, this.field493, var17, this.field514, this.field510, var20 ? class2.field27 : this.field491, var18, var15, var19);
        }
        return var21 == null ? null : var21.field2667;
    }

    @OriginalMember(owner = "client!cd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field508++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
    public static final void method231(int arg0, int arg1) {
        field492++;
        if (arg0 < 0) {
            method229(false);
        }
        class55 var2 = class62.method395(9, arg1, (byte) -66);
        var2.method341((byte) 62);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method232(String arg0, boolean arg1) {
        if (arg1) {
            method227(-84, 69, -90, 13, -113, 113, -22);
        }
        field486++;
        System.out.println("Error: " + class254.method1682(-83, arg0, "\n", "%0a"));
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Z)Ltb;")
    public final class184 method233(boolean arg0) {
        field505++;
        if (!arg0) {
            this.field496 = -69;
        }
        return this.method230(1, false);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIIIZLtb;)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class184 arg8) {
        this.field510 = arg2;
        this.field489 = arg5;
        this.field511 = arg1;
        this.field500 = arg4;
        this.field512 = arg0;
        this.field496 = arg3;
        if (arg6 != -1) {
            this.field499 = class105.method714(arg6, (byte) 78);
            this.field514 = 0;
            if (this.field499.field2736.length > 1) {
                this.field503 = 1;
            } else {
                this.field503 = 0;
            }
            this.field493 = 1;
            this.field501 = class266.field4301 - 1;
            if (this.field499.field2742 == 0 && arg8 != null && arg8 instanceof class35) {
                class35 var10 = (class35) arg8;
                if (this.field499 == var10.field499) {
                    this.field493 = var10.field493;
                    this.field501 = var10.field501;
                    this.field503 = var10.field503;
                    this.field514 = var10.field514;
                    return;
                }
            }
            if (arg7 && this.field499.field2725 != -1) {
                this.field514 = (int) ((double) this.field499.field2736.length * Math.random());
                this.field503 = this.field514 + 1;
                if (this.field503 >= this.field499.field2736.length) {
                    this.field503 -= this.field499.field2725;
                    if (this.field503 < 0 || this.field503 >= this.field499.field2736.length) {
                        this.field503 = -1;
                    }
                }
                this.field493 = (int) (Math.random() * (double) this.field499.field2751[this.field514]) + 1;
                this.field501 = class266.field4301 - this.field493;
            }
        }
        if (arg8 == null) {
            class206 var11 = class10.method64(64, this.field512);
            if (var11.field3373 != null) {
                this.field518 = true;
                return;
            }
        }
    }
}
