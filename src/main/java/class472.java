import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class472 {

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    private int field7216 = -1;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Z")
    private boolean field7225 = false;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "Z")
    private boolean field7237 = false;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    private int field7226 = -32768;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    private int field7242 = -1;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public int field7232;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "B")
    private byte field7236;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "B")
    private byte field7231;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    private int field7228;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    private int field7247;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public int field7233;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public int field7227;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Z")
    private boolean field7219;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Lco;")
    public static class450 field7217 = new class450();

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    private int field7229;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    private int field7230;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    private int field7244;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    private int field7249;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lbn;")
    public class356 field7222;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lhg;")
    private class363 field7220;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "Liv;")
    public static class433 field7240;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "Lst;")
    public static class479 field7235;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "Li;")
    private class521 field7245;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "Le;")
    private class536 field7239;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "[Z")
    private boolean[] field7223;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
    public static final void method2933(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg0 << 3;
        int var6 = arg3 << 3;
        field7214++;
        class388.field5918 = var6;
        if (class334.field5222 == 2) {
            class387.field5912 = var6;
            class253.field4106 = var4;
            class220.field3723 = var5;
        }
        class135.field1824 = var5;
        int var7 = 19 % ((arg2 - 48) / 39);
        class62.method457(3047);
        class528.field7774 = true;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static void method2934(byte arg0) {
        field7235 = null;
        field7240 = null;
        field7217 = null;
        if (arg0 < 9) {
            field7217 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
    public static final void method2935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7243++;
        if (arg5 != 7974) {
            field7240 = null;
        }
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg2 * arg2;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class280.method1888(arg4 - arg2, arg2 + arg4, (byte) 82, class103.field1521[arg3], arg1);
        int var20 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var21 = arg3 - var7;
            int var22 = arg3 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class280.method1888(var24, var23, (byte) 82, class103.field1521[var21], arg1);
            class280.method1888(var24, var23, (byte) 82, class103.field1521[var22], arg1);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V")
    private final void method2936(int arg0, int arg1, byte arg2) {
        if (arg2 != 84) {
            method2933(69, 62, -43, 59);
        }
        field7238++;
        label92: while (true) {
            if (this.field7220 == null) {
                if (this.field7225) {
                    return;
                }
                this.method2942(-1, -101);
                if (this.field7220 == null) {
                    return;
                }
            }
            int var4 = class88.field1278 - this.field7229;
            if (var4 > 100 && this.field7220.field5617 > 0) {
                int var5 = this.field7220.field5623.length - this.field7220.field5617;
                while (var5 > this.field7249 && this.field7220.field5599[this.field7249] < var4) {
                    var4 -= this.field7220.field5599[this.field7249];
                    this.field7249++;
                }
                if (this.field7249 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field7220.field5623.length; var7++) {
                        var6 += this.field7220.field5599[var7];
                    }
                    var4 %= var6;
                }
                this.field7244 = this.field7249 + 1;
                if (this.field7244 >= this.field7220.field5623.length) {
                    this.field7244 -= this.field7220.field5617;
                    if (this.field7244 < 0 || this.field7244 >= this.field7220.field5623.length) {
                        this.field7244 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field7220.field5599[this.field7249]) {
                            this.field7229 = class88.field1278 - var4;
                            this.field7230 = var4;
                            return;
                        }
                        class35.method217((byte) -44, false, this.field7249, this.field7220, arg0, arg1, this.field7231);
                        var4 -= this.field7220.field5599[this.field7249];
                        this.field7249++;
                        if (this.field7220.field5623.length <= this.field7249) {
                            this.field7249 -= this.field7220.field5617;
                            if (this.field7249 < 0 || this.field7249 >= this.field7220.field5623.length) {
                                this.field7220 = null;
                                continue label92;
                            }
                        }
                        this.field7244 = this.field7249 + 1;
                    } while (this.field7244 < this.field7220.field5623.length);
                    this.field7244 -= this.field7220.field5617;
                } while (this.field7244 >= 0 && this.field7220.field5623.length > this.field7244);
                this.field7244 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field7222 != null) {
            this.field7222.method2356();
        }
        field7248++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)I")
    public final int method2937(boolean arg0) {
        field7218++;
        if (arg0) {
            this.field7233 = -24;
        }
        return this.field7226;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILza;)V")
    public final void method2938(int arg0, class497 arg1) {
        this.method2945(this.field7228, 262144, true, (byte) -7, this.field7247, true, arg1);
        if (arg0 < -1) {
            field7241++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
    public final void method2939(byte arg0, int arg1) {
        this.field7225 = true;
        int var3 = -1 % ((arg0 + 3) / 55);
        field7215++;
        this.method2942(arg1, 13);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILza;Le;IIZ)V")
    public final void method2940(int arg0, int arg1, int arg2, class497 arg3, class536 arg4, int arg5, int arg6, boolean arg7) {
        field7224++;
        class293[] var9 = arg4.method292();
        if (arg5 > -112) {
            this.field7223 = null;
        }
        class100[] var10 = arg4.method326();
        if ((this.field7222 == null || this.field7222.field5518) && (var9 != null || var10 != null)) {
            class156 var11 = class454.field7029.method3002(-1, this.field7233);
            if (var11.field2134 != null) {
                var11 = var11.method962((byte) 100, class96.field1394);
            }
            if (var11 != null) {
                this.field7222 = new class356(class88.field1278);
            }
        }
        if (this.field7222 == null) {
            return;
        }
        if (arg7) {
            this.field7222.method2352(arg3, (long) class88.field1278, var9, var10, false);
        } else {
            this.field7222.method2357((long) class88.field1278);
        }
        this.field7222.method2349(this.field7231, arg1, arg0, arg2, arg6);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLza;)V")
    public final void method2941(boolean arg0, class497 arg1) {
        if (arg0) {
            return;
        }
        field7246++;
        if (this.field7245 != null) {
            class220.method1611(this.field7245, this.field7236, this.field7247, this.field7228, this.field7223);
            this.field7245 = null;
            this.field7223 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    private final void method2942(int arg0, int arg1) {
        field7234++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class156 var5 = class454.field7029.method3002(-1, this.field7233);
            class156 var6 = var5;
            if (var5.field2134 != null) {
                var5 = var5.method962((byte) 91, class96.field1394);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field2075 != null) {
                if (this.field7220 != null && var5.method960(this.field7220.field5611, (byte) -118)) {
                    return;
                }
                var3 = var5.method965((byte) -103);
                if (this.field7216 != var5.field2082) {
                    var4 = var5.field2126;
                }
            } else if (var5.field2071 == -1) {
                if (var6 != null && var6.field2075 != null) {
                    if (this.field7220 != null && var6.method960(this.field7220.field5611, (byte) -120)) {
                        return;
                    }
                    var3 = var6.method965((byte) -128);
                    if (this.field7216 != var6.field2082) {
                        var4 = var6.field2126;
                    }
                } else if (var6 != null && var6.field2071 != -1 && this.field7216 != var6.field2082) {
                    var4 = var6.field2126;
                    var3 = var6.field2071;
                }
            } else if (this.field7216 != var5.field2082) {
                var4 = var5.field2126;
                var3 = var5.field2071;
            }
        }
        if (var3 == -1) {
            this.field7220 = null;
            return;
        }
        int var7 = -18 % ((arg1 + 45) / 35);
        this.field7239 = null;
        if (this.field7220 == null || this.field7220.field5611 != var3) {
            this.field7220 = class388.field5915.method1703(var3, -12536);
        } else if (this.field7220.field5621 == 0) {
            return;
        }
        if (this.field7220.field5623 == null) {
            this.field7220 = null;
            return;
        }
        if (var4) {
            this.field7249 = (int) ((double) this.field7220.field5623.length * Math.random());
            this.field7230 = (int) ((double) this.field7220.field5599[this.field7249] * Math.random()) + 1;
        } else {
            this.field7230 = 1;
            this.field7249 = 0;
        }
        this.field7244 = this.field7249 + 1;
        if (this.field7244 < 0 || this.field7220.field5623.length <= this.field7244) {
            this.field7244 = -1;
        }
        this.field7229 = class88.field1278 - this.field7230;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2943(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static final void method2944(int arg0) {
        class109.field1556 = arg0;
        for (int var1 = 0; var1 < class252.field4075; var1++) {
            for (int var2 = 0; var2 < class131.field1773; var2++) {
                if (class217.field3699[arg0][var1][var2] == null) {
                    class217.field3699[arg0][var1][var2] = new class409(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZBIZLza;)Le;")
    public final class536 method2945(int arg0, int arg1, boolean arg2, byte arg3, int arg4, boolean arg5, class497 arg6) {
        field7221++;
        class156 var8 = class454.field7029.method3002(-1, this.field7233);
        if (var8.field2134 != null) {
            var8 = var8.method962((byte) 52, class96.field1394);
        }
        if (var8 == null) {
            this.method2941(false, arg6);
            this.field7216 = -1;
            this.field7242 = this.field7249;
            return null;
        }
        if (!this.field7225 && this.field7216 != var8.field2082) {
            this.field7239 = null;
            this.method2942(-1, -85);
        }
        this.method2936(arg4, arg0, (byte) 84);
        if (arg3 != -7) {
            return null;
        }
        boolean var9 = arg5 & this.field7219 & class141.field1911.method2603((byte) 107, class452.field7013) != 0;
        boolean var10 = var9 & (this.field7216 != var8.field2082 || (this.field7249 != this.field7242 || this.field7220 != null && (this.field7220.field5625 || class84.field1230) && this.field7249 != this.field7244) && class141.field1911.method2603((byte) 4, class452.field7013) >= 2);
        if (arg2 && !var10) {
            this.field7216 = var8.field2082;
            this.field7242 = this.field7249;
            return null;
        }
        if (var10) {
            class220.method1611(this.field7245, this.field7236, this.field7247, this.field7228, this.field7223);
        }
        class223 var11 = class53.field732[this.field7236];
        class223 var12;
        if (this.field7237) {
            var12 = class244.field3956[0];
        } else {
            var12 = this.field7236 >= 3 ? null : class53.field732[this.field7236 + 1];
        }
        class536 var13 = null;
        if (this.field7220 != null) {
            if (var10) {
                arg1 |= 0x40000;
            }
            var13 = var8.method950(this.field7249, var11, this.field7228, this.field7244, this.field7230, var11.method692(this.field7247, this.field7228), this.field7247, arg1, this.field7220, (byte) 3, arg6, var12, this.field7227 == 11 ? this.field7232 + 4 : this.field7232, this.field7227 == 11 ? 10 : this.field7227);
            if (var13 == null) {
                this.field7223 = null;
                this.field7226 = 0;
                this.field7245 = null;
            } else {
                if (var10) {
                    if (this.field7223 == null) {
                        this.field7223 = new boolean[4];
                    }
                    this.field7245 = var13.method330(this.field7245);
                    class174.method1090(this.field7245, this.field7236, arg4, arg0, this.field7223);
                }
                this.field7226 = var13.method305();
            }
            this.field7239 = null;
        } else if (this.field7239 != null && (this.field7239.method308() & arg1) == arg1 && this.field7216 == var8.field2082) {
            var13 = this.field7239;
        } else {
            if (this.field7239 != null) {
                arg1 |= this.field7239.method308();
            }
            class445 var14 = var8.method958(var10, var11.method692(this.field7247, this.field7228), this.field7228, arg1, var12, this.field7227 == 11 ? 10 : this.field7227, this.field7247, (byte) -102, var11, arg6, this.field7227 == 11 ? this.field7232 + 4 : this.field7232);
            if (var14 == null) {
                this.field7223 = null;
                this.field7245 = null;
                this.field7239 = null;
                this.field7226 = 0;
            } else {
                var13 = var14.field6911;
                this.field7239 = var14.field6911;
                if (var10) {
                    this.field7223 = null;
                    this.field7245 = var14.field6913;
                    class174.method1090(this.field7245, this.field7236, arg4, arg0, null);
                }
                this.field7226 = var13.method305();
            }
        }
        this.field7242 = this.field7249;
        this.field7247 = arg4;
        this.field7228 = arg0;
        this.field7216 = var8.field2082;
        return var13;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Z")
    public final boolean method2946(int arg0) {
        if (arg0 < 102) {
            this.field7249 = -126;
        }
        field7213++;
        return this.field7219;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lza;Loq;IIIIIIZI)V")
    public class472(class497 arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field7232 = arg3;
        this.field7236 = (byte) arg5;
        this.field7231 = (byte) arg4;
        this.field7237 = arg8;
        this.field7228 = arg7;
        this.field7247 = arg6;
        this.field7233 = arg1.field2082;
        this.field7227 = arg2;
        this.field7219 = arg0.method1279() && arg1.field2122 && !this.field7237;
        if (arg9 != -1) {
            this.field7225 = true;
        }
        this.method2942(arg9, 53);
    }
}
