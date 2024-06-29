import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class201 {

    @OriginalMember(owner = "client!co", name = "b", descriptor = "Z")
    private boolean field3040 = false;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    private int field3039 = -32768;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "Z")
    private boolean field3057 = false;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    private int field3073 = -1;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    private int field3047 = -1;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    private int field3066;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "B")
    private byte field3069;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    private int field3051;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "B")
    private byte field3061;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "Z")
    private boolean field3070;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "[Lso;")
    public static class187[] field3056 = new class187[0];

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    private int field3043;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    private int field3044;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    private int field3062;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "I")
    private int field3072;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "Lpp;")
    private class356 field3068;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "Lns;")
    private class57 field3054;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Lhn;")
    public class59 field3055;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "Lfq;")
    private class87 field3048;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "[Z")
    private boolean[] field3071;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public static final void method1360(byte arg0) {
        field3042++;
        if (arg0 < 95) {
            method1360((byte) 113);
        }
        class400 var1 = class475.field6651;
        synchronized (class475.field6651) {
            class475.field6651.method2388(124);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method1361(int arg0) {
        if (arg0 != -101) {
            field3056 = null;
        }
        field3056 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
    private final void method1362(int arg0, int arg1) {
        field3060++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class271 var5 = class206.field3124.method338((byte) 97, this.field3063);
            class271 var6 = var5;
            if (var5.field4015 != null) {
                var5 = var5.method1759(class315.field4736, true);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4031 != null) {
                if (this.field3068 != null && var5.method1766((byte) 113, this.field3068.field5416)) {
                    return;
                }
                var3 = var5.method1772((byte) 5);
                if (this.field3073 != var5.field4043) {
                    var4 = var5.field4076;
                }
            } else if (var5.field4024 == -1) {
                if (var6 != null && var6.field4031 != null) {
                    if (this.field3068 != null && var6.method1766((byte) 109, this.field3068.field5416)) {
                        return;
                    }
                    var3 = var6.method1772((byte) 5);
                    if (this.field3073 != var6.field4043) {
                        var4 = var6.field4076;
                    }
                } else if (var6 != null && var6.field4024 != -1 && this.field3073 != var6.field4043) {
                    var3 = var6.field4024;
                    var4 = var6.field4076;
                }
            } else if (this.field3073 != var5.field4043) {
                var4 = var5.field4076;
                var3 = var5.field4024;
            }
        }
        if (var3 == -1) {
            this.field3068 = null;
            return;
        }
        this.field3054 = null;
        if (this.field3068 == null || this.field3068.field5416 != var3) {
            this.field3068 = class170.field2423.method1586(var3, (byte) 36);
        } else if (this.field3068.field5415 == 0) {
            return;
        }
        if (this.field3068.field5389 == null) {
            this.field3068 = null;
            return;
        }
        if (var4) {
            this.field3043 = (int) ((double) this.field3068.field5389.length * Math.random());
            this.field3062 = ((int) ((double) this.field3068.field5421[this.field3043] * Math.random())) + 1;
        } else {
            this.field3043 = 0;
            this.field3062 = 1;
        }
        if (arg0 != -27917) {
            field3056 = null;
        }
        this.field3072 = this.field3043 + 1;
        if (this.field3072 < 0 || this.field3072 >= this.field3068.field5389.length) {
            this.field3072 = -1;
        }
        this.field3044 = class452.field6418 - this.field3062;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILtq;)V")
    public final void method1363(int arg0, class63 arg1) {
        field3045++;
        if (this.field3048 != null) {
            class299.method1868(this.field3048, this.field3061, this.field3066, this.field3051, this.field3071);
            this.field3071 = null;
            this.field3048 = null;
        }
        if (arg0 != -1) {
            method1360((byte) -53);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ltq;Lns;IIIIZI)V")
    public final void method1364(class63 arg0, class57 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field3050++;
        class275[] var9 = arg1.method430();
        class493[] var10 = arg1.method428();
        if ((this.field3055 == null || this.field3055.field819) && (var9 != null || var10 != null)) {
            class271 var11 = class206.field3124.method338((byte) 123, this.field3063);
            if (var11.field4015 != null) {
                var11 = var11.method1759(class315.field4736, true);
            }
            if (var11 != null) {
                this.field3055 = new class59(class452.field6418);
            }
        }
        if (this.field3055 != null) {
            if (arg6) {
                this.field3055.method466(arg0, (long) class452.field6418, var9, var10, false);
            } else {
                this.field3055.method464((long) class452.field6418);
            }
            this.field3055.method463(this.field3069, arg3, arg5, arg2, arg4);
        }
        if (arg7 != -16777216) {
            this.field3044 = -48;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(II)V")
    public final void method1365(int arg0, int arg1) {
        field3049++;
        this.field3057 = true;
        if (arg0 > -47) {
            this.field3057 = false;
        }
        this.method1362(-27917, arg1);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ltq;ILje;)V")
    public static final void method1366(class63 arg0, int arg1, class178 arg2) {
        field3059++;
        boolean var3 = class23.field309.method2365(arg0, arg2.field2647, arg2.field2652, arg2.field2576, arg2.field2605, 1, arg2.field2610 | 0xFF000000, arg2.field2556 ? class472.field6622.field3833 : null) == null;
        if (arg1 <= 11) {
            field3056 = null;
        }
        if (var3) {
            class475.field6646.method2453((byte) -128, new class357(arg2.field2605, arg2.field2652, arg2.field2647, arg2.field2610 | 0xFF000000, arg2.field2576, arg2.field2556));
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
    private final void method1367(int arg0, int arg1, int arg2) {
        int var4 = -18 % ((53 - arg0) / 32);
        field3041++;
        label88: while (true) {
            if (this.field3068 == null) {
                if (this.field3057) {
                    return;
                }
                this.method1362(-27917, -1);
                if (this.field3068 == null) {
                    return;
                }
            }
            int var5 = class452.field6418 - this.field3044;
            if (var5 > 100 && this.field3068.field5414 > 0) {
                int var6 = this.field3068.field5389.length - this.field3068.field5414;
                while (this.field3043 < var6 && this.field3068.field5421[this.field3043] < var5) {
                    var5 -= this.field3068.field5421[this.field3043];
                    this.field3043++;
                }
                if (var6 <= this.field3043) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field3068.field5389.length; var8++) {
                        var7 += this.field3068.field5421[var8];
                    }
                    var5 %= var7;
                }
                this.field3072 = this.field3043 + 1;
                if (this.field3072 >= this.field3068.field5389.length) {
                    this.field3072 -= this.field3068.field5414;
                    if (this.field3072 < 0 || this.field3072 >= this.field3068.field5389.length) {
                        this.field3072 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var5 <= this.field3068.field5421[this.field3043]) {
                            this.field3062 = var5;
                            this.field3044 = class452.field6418 - var5;
                            return;
                        }
                        class210.method1416(this.field3043, arg1, false, this.field3069, this.field3068, 15806, arg2);
                        var5 -= this.field3068.field5421[this.field3043];
                        this.field3043++;
                        if (this.field3043 >= this.field3068.field5389.length) {
                            this.field3043 -= this.field3068.field5414;
                            if (this.field3043 < 0 || this.field3043 >= this.field3068.field5389.length) {
                                this.field3068 = null;
                                continue label88;
                            }
                        }
                        this.field3072 = this.field3043 + 1;
                    } while (this.field3068.field5389.length > this.field3072);
                    this.field3072 -= this.field3068.field5414;
                } while (this.field3072 >= 0 && this.field3072 < this.field3068.field5389.length);
                this.field3072 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BLtq;)V")
    public final void method1368(byte arg0, class63 arg1) {
        int var3 = -55 / ((arg0 + 21) / 40);
        field3067++;
        this.method1369(true, this.field3051, arg1, -12, true, this.field3066, 131072);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZILtq;IZII)Lns;")
    public final class57 method1369(boolean arg0, int arg1, class63 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3052++;
        class271 var8 = class206.field3124.method338((byte) 125, this.field3063);
        if (var8.field4015 != null) {
            var8 = var8.method1759(class315.field4736, true);
        }
        if (var8 == null) {
            this.method1363(-1, arg2);
            this.field3073 = -1;
            this.field3047 = this.field3043;
            return null;
        }
        if (!this.field3057 && this.field3073 != var8.field4043) {
            this.field3054 = null;
            this.method1362(arg3 ^ 0x6D07, -1);
        }
        this.method1367(arg3 ^ 0x57, arg5, arg1);
        boolean var9 = arg0 & this.field3070 & class337.field5038.field3952 != 0;
        boolean var10 = var9 & (this.field3073 != var8.field4043 || (this.field3047 != this.field3043 || this.field3068 != null && (this.field3068.field5399 || class155.field2162) && this.field3072 != this.field3043) && class337.field5038.field3952 >= 2);
        if (arg4 && !var10) {
            this.field3073 = var8.field4043;
            this.field3047 = this.field3043;
            return null;
        }
        if (arg3 != -12) {
            this.field3048 = null;
        }
        if (var10) {
            class299.method1868(this.field3048, this.field3061, this.field3066, this.field3051, this.field3071);
        }
        class48 var11 = class479.field6745[this.field3061];
        class48 var12;
        if (this.field3040) {
            var12 = class483.field6781[0];
        } else {
            var12 = this.field3061 >= 3 ? null : class479.field6745[this.field3061 + 1];
        }
        class57 var13 = null;
        if (this.field3068 != null) {
            if (var10) {
                arg6 |= 0x20000;
            }
            var13 = var8.method1767(this.field3062, this.field3051, this.field3066, var12, this.field3068, arg6, this.field3064 == 11 ? 10 : this.field3064, var11.method204(this.field3066, this.field3051), arg2, var11, this.field3072, this.field3064 == 11 ? this.field3065 + 4 : this.field3065, this.field3043, 124);
            if (var13 == null) {
                this.field3071 = null;
                this.field3048 = null;
                this.field3039 = 0;
            } else {
                if (var10) {
                    if (this.field3071 == null) {
                        this.field3071 = new boolean[4];
                    }
                    this.field3048 = var13.method408(this.field3048);
                    class373.method2309(this.field3048, this.field3061, arg5, arg1, this.field3071);
                }
                this.field3039 = var13.method400();
            }
            this.field3054 = null;
        } else if (this.field3054 != null && (arg6 & this.field3054.method402()) == arg6 && this.field3073 == var8.field4043) {
            var13 = this.field3054;
        } else {
            if (this.field3054 != null) {
                arg6 |= this.field3054.method402();
            }
            class447 var14 = var8.method1773(arg6, this.field3051, var11, this.field3066, arg2, this.field3064 == 11 ? 10 : this.field3064, (byte) -71, var10, var12, this.field3064 == 11 ? this.field3065 + 4 : this.field3065, var11.method204(this.field3066, this.field3051));
            if (var14 == null) {
                this.field3054 = null;
                this.field3039 = 0;
                this.field3048 = null;
                this.field3071 = null;
            } else {
                var13 = var14.field6334;
                this.field3054 = var14.field6334;
                if (var10) {
                    this.field3048 = var14.field6337;
                    this.field3071 = null;
                    class373.method2309(this.field3048, this.field3061, arg5, arg1, (boolean[]) null);
                }
                this.field3039 = var13.method400();
            }
        }
        this.field3066 = arg5;
        this.field3047 = this.field3043;
        this.field3051 = arg1;
        this.field3073 = var8.field4043;
        return var13;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)Z")
    public final boolean method1370(int arg0) {
        field3046++;
        int var2 = -100 / ((62 - arg0) / 32);
        return this.field3070;
    }

    @OriginalMember(owner = "client!co", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3055 != null) {
            this.field3055.method456();
        }
        field3053++;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)I")
    public final int method1371(int arg0) {
        field3058++;
        if (arg0 != 1) {
            this.field3062 = -108;
        }
        return this.field3039;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ltq;Lvc;IIIIIIZI)V")
    public class201(class63 arg0, class271 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field3066 = arg6;
        this.field3064 = arg2;
        this.field3069 = (byte) arg4;
        this.field3040 = arg8;
        this.field3065 = arg3;
        this.field3063 = arg1.field4043;
        this.field3051 = arg7;
        this.field3061 = (byte) arg5;
        this.field3070 = arg0.method581() && arg1.field4087 && !this.field3040;
        if (arg9 != -1) {
            this.field3057 = true;
        }
        this.method1362(-27917, arg9);
    }
}
