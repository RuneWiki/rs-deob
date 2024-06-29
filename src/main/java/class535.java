import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class535 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    private int field7261 = 0;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    private int field7263 = -1;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    private int field7275 = 0;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Z")
    private boolean field7274 = false;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    private int field7264 = -1;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "Z")
    private boolean field7296 = false;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    private int field7295 = -1;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "Lwea;")
    private class167 field7284;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public int field7283;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "B")
    private byte field7292;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "B")
    private byte field7268;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public int field7278;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public int field7293;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Z")
    private boolean field7270;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "[J")
    public static long[] field7290 = new long[32];

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "Ljw;")
    public static class581 field7287 = new class581(4, 7);

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    private int field7279;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    private int field7281;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    private int field7288;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    private int field7297;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "Lr;")
    private class195 field7285;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Lvq;")
    private class489 field7266;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "Lka;")
    private class500 field7299;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Lhj;")
    private class596 field7271;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Lsp;")
    public class663 field7277;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "[Z")
    private boolean[] field7294;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLha;ZIZ)Lka;", line = 3)
    public final class500 method3054(boolean arg0, class65 arg1, boolean arg2, int arg3, boolean arg4) {
        field7276++;
        class589 var6 = class350.field5132.method3732((byte) 83, this.field7278);
        if (var6.field7865 != null) {
            var6 = var6.method3290(1, class382.field5602);
        }
        if (var6 == null) {
            this.method3063(13959, arg1);
            this.field7264 = -1;
            this.field7263 = -1;
            this.field7295 = -1;
            return null;
        }
        if (!this.field7296 && this.field7263 != var6.field7856) {
            this.field7299 = null;
            this.method3059(-1, -1);
        }
        this.method3058(this.field7284, 1);
        if (arg2) {
            boolean var7 = arg2 & this.field7270 & class712.field9959.field1319.method2854(21) != 0;
            arg2 = var7 & (this.field7295 != var6.field7856 || this.field7266 != null && class712.field9959.field1319.method2854(77) >= 2 && (this.field7297 != this.field7264 || (this.field7266.field6777 || class423.field6046) && this.field7297 != this.field7279));
        }
        if (arg4 && !arg2) {
            this.field7263 = var6.field7856;
            return null;
        }
        if (arg2) {
            class786.method4347(this.field7285, this.field7268, this.field7284.field2257, this.field7284.field2259, this.field7294);
            this.field7295 = -1;
            this.field7264 = -1;
        }
        class296 var8 = class528.field7227[this.field7268];
        if (!arg0) {
            this.field7294 = null;
        }
        class296 var9;
        if (this.field7274) {
            var9 = class412.field5933[0];
        } else {
            var9 = this.field7268 >= 3 ? null : class528.field7227[this.field7268 + 1];
        }
        class500 var10 = null;
        if (this.field7266 != null) {
            if (arg2) {
                arg3 |= 0x40000;
            }
            var10 = var6.method3289(this.field7283 == 11 ? 10 : this.field7283, this.field7266, (byte) -54, arg3, this.field7283 == 11 ? this.field7293 + 4 : this.field7293, var9, this.field7284.field2257, this.field7271, this.field7279, this.field7297, var8, this.field7284.field2259, var8.method1882(this.field7284.field2259, 0, this.field7284.field2257), this.field7288, arg1);
            if (var10 == null) {
                this.field7285 = null;
                this.field7275 = 0;
                this.field7261 = 0;
                this.field7294 = null;
            } else {
                if (arg2) {
                    if (this.field7294 == null) {
                        this.field7294 = new boolean[4];
                    }
                    this.field7285 = var10.method322(this.field7285);
                    class167.method1203(this.field7285, this.field7268, this.field7284.field2257, this.field7284.field2259, this.field7294);
                    this.field7295 = var6.field7856;
                    this.field7264 = this.field7297;
                }
                this.field7275 = var10.method335();
                this.field7261 = var10.method339();
            }
            this.field7299 = null;
        } else if (this.field7299 != null && arg3 == (arg3 & this.field7299.method325()) && this.field7263 == var6.field7856) {
            var10 = this.field7299;
        } else {
            if (this.field7299 != null) {
                arg3 |= this.field7299.method325();
            }
            class218 var11 = var6.method3279(var8.method1882(this.field7284.field2259, 0, this.field7284.field2257), var9, this.field7283 == 11 ? this.field7293 + 4 : this.field7293, var8, this.field7271, this.field7283 == 11 ? 10 : this.field7283, arg3, arg2, this.field7284.field2257, (byte) 53, this.field7284.field2259, arg1);
            if (var11 == null) {
                this.field7261 = 0;
                this.field7275 = 0;
                this.field7285 = null;
                this.field7299 = null;
                this.field7294 = null;
            } else {
                var10 = var11.field2909;
                this.field7299 = var11.field2909;
                if (arg2) {
                    this.field7285 = var11.field2908;
                    this.field7294 = null;
                    class167.method1203(this.field7285, this.field7268, this.field7284.field2257, this.field7284.field2259, null);
                    this.field7295 = var6.field7856;
                    this.field7264 = -1;
                }
                this.field7275 = var10.method335();
                this.field7261 = var10.method339();
            }
        }
        this.field7263 = var6.field7856;
        return var10;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLwc;[II)V", line = 142)
    public static final void method3055(byte arg0, class73 arg1, int[] arg2, int arg3) {
        if (arg0 <= 8) {
            method3062(true);
        }
        field7272++;
        if (arg1.field1799 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field1799.length; var5++) {
                if (arg1.field1799[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field1827 != -1) {
                class489 var6 = class6.field65.method1034(arg1.field1827, 0);
                int var7 = var6.field6786;
                if (var7 == 1) {
                    arg1.field1817 = 0;
                    arg1.field1829 = arg3;
                    arg1.field1806 = 0;
                    arg1.field1870 = 1;
                    arg1.field1795 = 0;
                    if (!arg1.field1823) {
                        class586.method3259(arg1, 0, var6, arg1.field1795);
                    }
                }
                if (var7 == 2) {
                    arg1.field1817 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg2.length; var9++) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg1.field1799 == null || arg1.field1799[var9] == -1 || class6.field65.method1034(arg2[var9], 0).field6778 >= class6.field65.method1034(arg1.field1799[var9], 0).field6778) {
                arg1.field1799 = arg2;
                arg1.field1829 = arg3;
                break;
            }
        }
        if (var8) {
            arg1.field1829 = arg3;
            arg1.field1799 = arg2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)I", line = 233)
    public final int method3056(byte arg0) {
        field7291++;
        int var2 = 5 % ((arg0 + 43) / 62);
        return this.field7275;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lha;Lpu;IIIILwea;ZI)V", line = 659)
    public class535(class65 arg0, class589 arg1, int arg2, int arg3, int arg4, int arg5, class167 arg6, boolean arg7, int arg8) {
        this.field7284 = arg6;
        this.field7274 = arg7;
        this.field7283 = arg2;
        this.field7292 = (byte) arg4;
        this.field7268 = (byte) arg5;
        this.field7278 = arg1.field7856;
        this.field7293 = arg3;
        this.field7270 = arg0.method484() && arg1.field7942 && !this.field7274;
        if (arg8 != -1) {
            this.field7296 = true;
        }
        this.method3059(-1, arg8);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I", line = 250)
    public final int method3057(byte arg0) {
        if (arg0 < 109) {
            this.field7261 = -87;
        }
        field7273++;
        return this.field7261;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lwea;I)V", line = 261)
    private final void method3058(class167 arg0, int arg1) {
        if (arg1 != 1) {
            this.finalize();
        }
        field7269++;
        label92: while (true) {
            if (this.field7266 == null) {
                if (this.field7296) {
                    return;
                }
                this.method3059(-1, -1);
                if (this.field7266 == null) {
                    return;
                }
            }
            int var3 = class100.field1401 - this.field7281;
            if (var3 > 100 && this.field7266.field6789 > 0) {
                int var4 = this.field7266.field6775.length - this.field7266.field6789;
                while (var4 > this.field7297 && var3 > this.field7266.field6773[this.field7297]) {
                    var3 -= this.field7266.field6773[this.field7297];
                    this.field7297++;
                }
                if (this.field7297 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field7266.field6775.length; var6++) {
                        var5 += this.field7266.field6773[var6];
                    }
                    var3 %= var5;
                }
                this.field7279 = this.field7297 + 1;
                if (this.field7279 >= this.field7266.field6775.length) {
                    this.field7279 -= this.field7266.field6789;
                    if (this.field7279 < 0 || this.field7266.field6775.length <= this.field7279) {
                        this.field7279 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field7266.field6773[this.field7297] >= var3) {
                            this.field7288 = var3;
                            this.field7281 = class100.field1401 - var3;
                            return;
                        }
                        class586.method3259(arg0, 0, this.field7266, this.field7297);
                        var3 -= this.field7266.field6773[this.field7297];
                        this.field7297++;
                        if (this.field7297 >= this.field7266.field6775.length) {
                            this.field7297 -= this.field7266.field6789;
                            if (this.field7297 < 0 || this.field7266.field6775.length <= this.field7297) {
                                this.field7266 = null;
                                continue label92;
                            }
                        }
                        this.field7279 = this.field7297 + 1;
                    } while (this.field7266.field6775.length > this.field7279);
                    this.field7279 -= this.field7266.field6789;
                } while (this.field7279 >= 0 && this.field7266.field6775.length > this.field7279);
                this.field7279 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V", line = 364)
    private final void method3059(int arg0, int arg1) {
        field7289++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class589 var5 = class350.field5132.method3732((byte) 44, this.field7278);
            class589 var6 = var5;
            if (var5.field7865 != null) {
                var5 = var5.method3290(arg0 + 2, class382.field5602);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field7861 != null) {
                if (this.field7266 != null && var5.method3295(4, this.field7266.field6784)) {
                    return;
                }
                var3 = var5.method3291(arg0 - 31734);
                if (this.field7263 != var5.field7856) {
                    var4 = var5.field7946;
                }
            } else if (var5.field7851 == -1) {
                if (var6 != null && var6.field7861 != null) {
                    if (this.field7266 != null && var6.method3295(-24, this.field7266.field6784)) {
                        return;
                    }
                    var3 = var6.method3291(-31735);
                    if (this.field7263 != var6.field7856) {
                        var4 = var6.field7946;
                    }
                } else if (var6 != null && var6.field7851 != -1 && this.field7263 != var6.field7856) {
                    var3 = var6.field7851;
                    var4 = var6.field7946;
                }
            } else if (this.field7263 != var5.field7856) {
                var4 = var5.field7946;
                var3 = var5.field7851;
            }
        }
        if (var3 == -1) {
            this.field7266 = null;
            return;
        }
        this.field7299 = null;
        if (this.field7266 == null || this.field7266.field6784 != var3) {
            this.field7266 = class6.field65.method1034(var3, 0);
        } else if (this.field7266.field6786 == 0) {
            return;
        }
        if (this.field7266.field6775 == null) {
            this.field7266 = null;
            return;
        }
        if (var4) {
            this.field7297 = (int) ((double) this.field7266.field6775.length * Math.random());
            this.field7288 = (int) ((double) this.field7266.field6773[this.field7297] * Math.random()) + 1;
        } else {
            this.field7297 = 0;
            this.field7288 = 1;
        }
        this.field7279 = this.field7297 - arg0;
        if (this.field7279 < 0 || this.field7279 >= this.field7266.field6775.length) {
            this.field7279 = -1;
        }
        this.field7281 = class100.field1401 - this.field7288;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILhj;)V", line = 491)
    public final void method3060(int arg0, class596 arg1) {
        field7298++;
        this.field7299 = null;
        this.field7271 = arg1;
        if (arg0 != -1090) {
            this.field7295 = 24;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lha;ZIIIILuu;Lka;B)V", line = 504)
    public final void method3061(class65 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class303 arg6, class500 arg7, byte arg8) {
        if (arg8 < 79) {
            return;
        }
        field7267++;
        class577[] var10 = arg7.method341();
        class263[] var11 = arg7.method308();
        if ((this.field7277 == null || this.field7277.field9163) && (var10 != null || var11 != null)) {
            class589 var12 = class350.field5132.method3732((byte) 47, this.field7278);
            if (var12.field7865 != null) {
                var12 = var12.method3290(1, class382.field5602);
            }
            if (var12 != null) {
                this.field7277 = class663.method3670(class100.field1401, true);
            }
        }
        if (this.field7277 == null) {
            return;
        }
        arg7.method296(arg6);
        if (arg1) {
            this.field7277.method3664(arg0, (long) class100.field1401, var10, var11, false);
        } else {
            this.field7277.method3661((long) class100.field1401);
        }
        this.field7277.method3668(this.field7292, arg5, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 546)
    public static void method3062(boolean arg0) {
        field7290 = null;
        if (arg0) {
            field7290 = null;
        }
        field7287 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILha;)V", line = 559)
    public final void method3063(int arg0, class65 arg1) {
        if (this.field7285 != null) {
            class786.method4347(this.field7285, this.field7268, this.field7284.field2257, this.field7284.field2259, this.field7294);
            this.field7294 = null;
            this.field7285 = null;
        }
        if (arg0 != 13959) {
            this.field7294 = null;
        }
        field7265++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V", line = 576)
    public final void method3064(int arg0, boolean arg1) {
        field7286++;
        if (arg1) {
            this.method3065(-121);
        }
        this.field7296 = true;
        this.method3059(-1, arg0);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Z", line = 597)
    public final boolean method3065(int arg0) {
        if (arg0 != -1) {
            method3062(false);
        }
        field7280++;
        return this.field7270;
    }

    @OriginalMember(owner = "client!ek", name = "finalize", descriptor = "()V", line = 610)
    protected final void finalize() {
        if (this.field7277 != null) {
            this.field7277.method3669();
        }
        field7262++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLha;)V", line = 623)
    public final void method3066(byte arg0, class65 arg1) {
        field7282++;
        this.method3054(true, arg1, true, 262144, true);
        if (arg0 >= -118) {
            this.field7294 = null;
        }
    }
}
