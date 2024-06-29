import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class443 {

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    private int field6121 = 0;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "Z")
    private boolean field6128 = false;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    private int field6130 = 0;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "Z")
    private boolean field6124 = false;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    private int field6105 = -1;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    private int field6132 = -1;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
    private int field6135 = -1;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public int field6119;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Loq;")
    private class230 field6110;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public int field6111;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public int field6126;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "B")
    private byte field6125;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "B")
    private byte field6118;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "Z")
    private boolean field6137;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "[B")
    public static byte[] field6129 = new byte[520];

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    private int field6106;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "I")
    private int field6133;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    private int field6134;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    private int field6141;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "Lr;")
    private class113 field6116;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "Lka;")
    private class231 field6123;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "Lju;")
    public class388 field6127;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "Laka;")
    private class413 field6138;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "Lgf;")
    private class73 field6140;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "[Z")
    private boolean[] field6103;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Laka;I)V")
    public final void method2654(class413 arg0, int arg1) {
        field6122++;
        if (arg1 != 24841) {
            this.field6121 = -123;
        }
        this.field6123 = null;
        this.field6138 = arg0;
    }

    @OriginalMember(owner = "client!wm", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field6127 != null) {
            this.field6127.method2407();
        }
        field6113++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILiaa;)V")
    public static final void method2655(int arg0, class116 arg1) {
        field6107++;
        class483.field6689.method1039(arg1, arg0);
        arg1.field1572 = arg1.field1575.field6962;
        arg1.field1575.field6962 = 0;
        class100.field1176 += arg1.field1572;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V")
    private final void method2656(int arg0, int arg1) {
        if (arg1 != 2631) {
            return;
        }
        field6112++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class286 var5 = class390.field5558.method3065(13, this.field6111);
            class286 var6 = var5;
            if (var5.field4136 != null) {
                var5 = var5.method1889(class173.field2192, false);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4159 != null) {
                if (this.field6140 != null && var5.method1896(false, this.field6140.field824)) {
                    return;
                }
                var3 = var5.method1886(27);
                if (this.field6132 != var5.field4124) {
                    var4 = var5.field4128;
                }
            } else if (var5.field4204 == -1) {
                if (var6 != null && var6.field4159 != null) {
                    if (this.field6140 != null && var6.method1896(false, this.field6140.field824)) {
                        return;
                    }
                    var3 = var6.method1886(arg1 ^ 0xA5C);
                    if (this.field6132 != var6.field4124) {
                        var4 = var6.field4128;
                    }
                } else if (var6 != null && var6.field4204 != -1 && this.field6132 != var6.field4124) {
                    var3 = var6.field4204;
                    var4 = var6.field4128;
                }
            } else if (this.field6132 != var5.field4124) {
                var3 = var5.field4204;
                var4 = var5.field4128;
            }
        }
        if (var3 == -1) {
            this.field6140 = null;
            return;
        }
        this.field6123 = null;
        if (this.field6140 == null || this.field6140.field824 != var3) {
            this.field6140 = class571.field8029.method3695(var3, (byte) -127);
        } else if (this.field6140.field818 == 0) {
            return;
        }
        if (this.field6140.field816 == null) {
            this.field6140 = null;
            return;
        }
        if (var4) {
            this.field6133 = (int) ((double) this.field6140.field816.length * Math.random());
            this.field6106 = (int) ((double) this.field6140.field817[this.field6133] * Math.random()) + 1;
        } else {
            this.field6133 = 0;
            this.field6106 = 1;
        }
        this.field6134 = this.field6133 + 1;
        if (this.field6134 < 0 || this.field6134 >= this.field6140.field816.length) {
            this.field6134 = -1;
        }
        this.field6141 = class533.field7336 - this.field6106;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLha;)V")
    public final void method2657(byte arg0, class473 arg1) {
        if (this.field6116 != null) {
            class604.method3491(this.field6116, this.field6118, this.field6110.field3470, this.field6110.field3460, this.field6103);
            this.field6103 = null;
            this.field6116 = null;
        }
        field6131++;
        if (arg0 <= 44) {
            this.field6111 = 8;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILha;)V")
    public final void method2658(int arg0, class473 arg1) {
        this.method2660((byte) -88, true, arg1, 262144, true);
        if (arg0 != 10) {
            this.field6123 = null;
        }
        field6136++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Loq;Z)V")
    private final void method2659(class230 arg0, boolean arg1) {
        field6104++;
        if (arg1) {
            this.field6116 = null;
        }
        label90: while (true) {
            if (this.field6140 == null) {
                if (this.field6124) {
                    return;
                }
                this.method2656(-1, 2631);
                if (this.field6140 == null) {
                    return;
                }
            }
            int var3 = class533.field7336 - this.field6141;
            if (var3 > 100 && this.field6140.field805 > 0) {
                int var4 = this.field6140.field816.length - this.field6140.field805;
                while (this.field6133 < var4 && var3 > this.field6140.field817[this.field6133]) {
                    var3 -= this.field6140.field817[this.field6133];
                    this.field6133++;
                }
                if (this.field6133 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field6140.field816.length; var6++) {
                        var5 += this.field6140.field817[var6];
                    }
                    var3 %= var5;
                }
                this.field6134 = this.field6133 + 1;
                if (this.field6134 >= this.field6140.field816.length) {
                    this.field6134 -= this.field6140.field805;
                    if (this.field6134 < 0 || this.field6140.field816.length <= this.field6134) {
                        this.field6134 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field6140.field817[this.field6133] >= var3) {
                            this.field6141 = class533.field7336 - var3;
                            this.field6106 = var3;
                            return;
                        }
                        class538.method3196(arg0, this.field6133, true, this.field6140);
                        var3 -= this.field6140.field817[this.field6133];
                        this.field6133++;
                        if (this.field6133 >= this.field6140.field816.length) {
                            this.field6133 -= this.field6140.field805;
                            if (this.field6133 < 0 || this.field6133 >= this.field6140.field816.length) {
                                this.field6140 = null;
                                continue label90;
                            }
                        }
                        this.field6134 = this.field6133 + 1;
                    } while (this.field6134 < this.field6140.field816.length);
                    this.field6134 -= this.field6140.field805;
                } while (this.field6134 >= 0 && this.field6134 < this.field6140.field816.length);
                this.field6134 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BZLha;IZ)Lka;")
    public final class231 method2660(byte arg0, boolean arg1, class473 arg2, int arg3, boolean arg4) {
        field6139++;
        class286 var6 = class390.field5558.method3065(-122, this.field6111);
        if (var6.field4136 != null) {
            var6 = var6.method1889(class173.field2192, false);
        }
        if (arg0 != -88) {
            this.field6124 = false;
        }
        if (var6 == null) {
            this.method2657((byte) 109, arg2);
            this.field6105 = -1;
            this.field6132 = -1;
            this.field6135 = -1;
            return null;
        }
        if (!this.field6124 && this.field6132 != var6.field4124) {
            this.field6123 = null;
            this.method2656(-1, 2631);
        }
        this.method2659(this.field6110, false);
        if (arg4) {
            boolean var7 = arg4 & this.field6137 & class688.field9602.field8538.method2315((byte) -98) != 0;
            arg4 = var7 & (this.field6135 != var6.field4124 || this.field6140 != null && class688.field9602.field8538.method2315((byte) -98) >= 2 && (this.field6133 != this.field6105 || (this.field6140.field801 || class738.field10171) && this.field6134 != this.field6133));
        }
        if (arg1 && !arg4) {
            this.field6132 = var6.field4124;
            return null;
        }
        if (arg4) {
            class604.method3491(this.field6116, this.field6118, this.field6110.field3470, this.field6110.field3460, this.field6103);
            this.field6105 = -1;
            this.field6135 = -1;
        }
        class418 var8 = class661.field9303[this.field6118];
        class418 var9;
        if (this.field6128) {
            var9 = class95.field1115[0];
        } else {
            var9 = this.field6118 >= 3 ? null : class661.field9303[this.field6118 + 1];
        }
        class231 var10 = null;
        if (this.field6140 != null) {
            if (arg4) {
                arg3 |= 0x40000;
            }
            var10 = var6.method1891(var8.method2529(this.field6110.field3460, this.field6110.field3470, (byte) -128), this.field6138, this.field6126 == 11 ? 10 : this.field6126, arg0 ^ 0x4FD1, this.field6134, this.field6106, arg2, var9, var8, arg3, this.field6133, this.field6110.field3460, this.field6140, this.field6126 == 11 ? this.field6119 + 4 : this.field6119, this.field6110.field3470);
            if (var10 == null) {
                this.field6121 = 0;
                this.field6103 = null;
                this.field6116 = null;
                this.field6130 = 0;
            } else {
                if (arg4) {
                    if (this.field6103 == null) {
                        this.field6103 = new boolean[4];
                    }
                    this.field6116 = var10.method1574(this.field6116);
                    class516.method3071(this.field6116, this.field6118, this.field6110.field3470, this.field6110.field3460, this.field6103);
                    this.field6135 = var6.field4124;
                    this.field6105 = this.field6133;
                }
                this.field6121 = var10.method1576();
                this.field6130 = var10.method1539();
            }
            this.field6123 = null;
        } else if (this.field6123 != null && arg3 == (this.field6123.method1587() & arg3) && this.field6132 == var6.field4124) {
            var10 = this.field6123;
        } else {
            if (this.field6123 != null) {
                arg3 |= this.field6123.method1587();
            }
            class452 var11 = var6.method1898(arg2, this.field6126 == 11 ? 10 : this.field6126, var9, this.field6110.field3460, arg4, false, this.field6110.field3470, var8.method2529(this.field6110.field3460, this.field6110.field3470, (byte) -128), this.field6126 == 11 ? this.field6119 + 4 : this.field6119, arg3, this.field6138, var8);
            if (var11 == null) {
                this.field6103 = null;
                this.field6130 = 0;
                this.field6123 = null;
                this.field6116 = null;
                this.field6121 = 0;
            } else {
                var10 = var11.field6304;
                this.field6123 = var11.field6304;
                if (arg4) {
                    this.field6103 = null;
                    this.field6116 = var11.field6302;
                    class516.method3071(this.field6116, this.field6118, this.field6110.field3470, this.field6110.field3460, null);
                    this.field6135 = var6.field4124;
                    this.field6105 = -1;
                }
                this.field6121 = var10.method1576();
                this.field6130 = var10.method1539();
            }
        }
        this.field6132 = var6.field4124;
        return var10;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I")
    public final int method2661(int arg0) {
        field6120++;
        if (arg0 != -16897) {
            this.method2663(-30);
        }
        return this.field6130;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public static void method2662(int arg0) {
        field6129 = null;
        int var1 = -26 / ((-arg0 - 43) / 40);
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)Z")
    public final boolean method2663(int arg0) {
        if (arg0 == 10505) {
            field6114++;
            return this.field6137;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)I")
    public final int method2664(byte arg0) {
        field6117++;
        int var2 = -63 / ((arg0 - 32) / 42);
        return this.field6121;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILoc;II)J")
    public static final long method2665(int arg0, class466 arg1, int arg2, int arg3) {
        field6109++;
        if (arg2 != 19448) {
            field6129 = null;
        }
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class286 var8 = class390.field5558.method3065(-125, arg1.method760(-27640));
        long var9 = (long) (arg3 | 0x40000000 | arg0 << 7 | arg1.method756((byte) 104) << 14 | arg1.method762(true) << 20);
        if (var8.field4137 == 0) {
            var9 |= var6;
        }
        if (var8.field4145 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg1.method760(-27640) << 32;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V")
    public final void method2666(byte arg0, int arg1) {
        int var3 = 103 / ((-arg0 - 44) / 56);
        this.field6124 = true;
        field6108++;
        this.method2656(arg1, 2631);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIZILha;Lka;Loo;)V")
    public final void method2667(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class473 arg6, class231 arg7, class12 arg8) {
        field6115++;
        if (arg2 != 1) {
            return;
        }
        class626[] var10 = arg7.method1579();
        class426[] var11 = arg7.method1543();
        if ((this.field6127 == null || this.field6127.field5531) && (var10 != null || var11 != null)) {
            class286 var12 = class390.field5558.method3065(arg2 ^ 0xFFFFFF8B, this.field6111);
            if (var12.field4136 != null) {
                var12 = var12.method1889(class173.field2192, false);
            }
            if (var12 != null) {
                this.field6127 = class388.method2408(class533.field7336, true);
            }
        }
        if (this.field6127 == null) {
            return;
        }
        arg7.method1581(arg8);
        if (arg4) {
            this.field6127.method2401(arg6, (long) class533.field7336, var10, var11, false);
        } else {
            this.field6127.method2406((long) class533.field7336);
        }
        this.field6127.method2403(this.field6125, arg3, arg1, arg0, arg5);
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lha;Lro;IIIILoq;ZI)V")
    public class443(class473 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, class230 arg6, boolean arg7, int arg8) {
        this.field6119 = arg3;
        this.field6110 = arg6;
        this.field6111 = arg1.field4124;
        this.field6128 = arg7;
        this.field6126 = arg2;
        this.field6125 = (byte) arg4;
        this.field6118 = (byte) arg5;
        this.field6137 = arg0.method206() && arg1.field4122 && !this.field6128;
        if (arg8 != -1) {
            this.field6124 = true;
        }
        this.method2656(arg8, 2631);
    }
}
