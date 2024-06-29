import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class500 implements Runnable {

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "Lifa;")
    private class487 field6743 = new class487();

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "Z")
    private boolean field6755 = false;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public int field6758 = 0;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field6753;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "[[I")
    public static int[][] field6744 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "[I")
    public static int[] field6745;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IBI)Z", line = 5)
    public static final boolean method2809(int arg0, byte arg1, int arg2) {
        field6749++;
        if (arg1 != 11) {
            method2820(-79, null);
        }
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;I)V", line = 19)
    public static final void method2810(String arg0, boolean arg1, int arg2, String arg3, int arg4) {
        class133.method869(arg4, arg1, arg0, -1, arg3, true, -1);
        if (arg2 != -13817) {
            method2809(70, (byte) 73, 22);
        }
        field6748++;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IILvh;)Luda;", line = 31)
    public final class16 method2811(int arg0, int arg1, class403 arg2) {
        field6746++;
        class16 var4 = new class16();
        var4.field133 = 3;
        var4.field5294 = false;
        if (arg0 > -98) {
            this.method2815(-20, null, (byte) -31);
        }
        var4.field6449 = arg1;
        var4.field137 = arg2;
        this.method2814(var4, 128);
        return var4;
    }

    @OriginalMember(owner = "client!mca", name = "run", descriptor = "()V", line = 49)
    public final void run() {
        while (!this.field6755) {
            class487 var1 = this.field6743;
            class16 var2;
            synchronized (this.field6743) {
                var2 = (class16) this.field6743.method2714(0);
                if (var2 == null) {
                    try {
                        this.field6743.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field6758--;
            }
            try {
                if (var2.field133 == 2) {
                    var2.field137.method2376(true, var2.field135, var2.field135.length, (int) var2.field6449);
                } else if (var2.field133 == 3) {
                    var2.field135 = var2.field137.method2373((byte) 21, (int) var2.field6449);
                }
            } catch (Exception var6) {
                class282.method1694(null, (byte) 47, var6);
            }
            var2.field5297 = false;
        }
        field6756++;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lpq;II)Lhfa;", line = 94)
    public static final class635 method2812(class159 arg0, int arg1, int arg2) {
        field6751++;
        byte[] var3 = arg0.method1082((byte) 33, arg2);
        if (arg1 > -55) {
            method2809(-1, (byte) 59, 20);
        }
        return var3 == null ? null : new class635(var3);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Lbc;", line = 112)
    public static final class607 method2813(int arg0, int arg1) {
        field6754++;
        class607[] var2 = class668.method3703(123);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class607 var4 = var2[var3];
            if (var4.field8283 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lcr;)V", line = 485)
    public class500(class112 arg0) {
        class280 var2 = arg0.method612(5, this, (byte) -122);
        while (var2.field3773 == 0) {
            class660.method3668(-1, 10L);
        }
        if (var2.field3773 == 2) {
            throw new RuntimeException();
        }
        this.field6753 = (Thread) var2.field3772;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Luda;I)V", line = 143)
    private final void method2814(class16 arg0, int arg1) {
        class487 var3 = this.field6743;
        synchronized (this.field6743) {
            this.field6743.method2713(arg1 ^ 0xFFFFFF2E, arg0);
            if (arg1 != 128) {
                field6745 = null;
            }
            this.field6758++;
            this.field6743.notifyAll();
        }
        field6752++;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILvh;B)Luda;", line = 158)
    public final class16 method2815(int arg0, class403 arg1, byte arg2) {
        field6750++;
        if (arg2 < 12) {
            method2817((byte) 30);
        }
        class16 var4 = new class16();
        var4.field133 = 1;
        class487 var5 = this.field6743;
        synchronized (this.field6743) {
            class16 var6 = (class16) this.field6743.method2715((byte) 126);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field6449 && var6.field137 == arg1 && var6.field133 == 2) {
                    var4.field5297 = false;
                    var4.field135 = var6.field135;
                    return var4;
                }
                var6 = (class16) this.field6743.method2712(0);
            }
        }
        var4.field135 = arg1.method2373((byte) 21, arg0);
        var4.field5294 = true;
        var4.field5297 = false;
        return var4;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "([BIILvh;)Luda;", line = 199)
    public final class16 method2816(byte[] arg0, int arg1, int arg2, class403 arg3) {
        field6747++;
        if (arg2 >= -34) {
            this.field6743 = null;
        }
        class16 var5 = new class16();
        var5.field5294 = false;
        var5.field133 = 2;
        var5.field135 = arg0;
        var5.field137 = arg3;
        var5.field6449 = arg1;
        this.method2814(var5, 128);
        return var5;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V", line = 219)
    public static void method2817(byte arg0) {
        if (arg0 != -48) {
            method2817((byte) -52);
        }
        field6744 = null;
        field6745 = null;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)V", line = 232)
    public final void method2818(byte arg0) {
        field6757++;
        this.field6755 = true;
        class487 var2 = this.field6743;
        synchronized (this.field6743) {
            this.field6743.notifyAll();
        }
        if (arg0 <= 46) {
            return;
        }
        try {
            this.field6753.join();
        } catch (InterruptedException var3) {
        }
        this.field6753 = null;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIII)Z", line = 255)
    public static final boolean method2819(int arg0, int arg1, int arg2, int arg3) {
        if (!class388.method2325(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class428.field5949;
        int var5 = arg2 << class428.field5949;
        int var6 = class397.field5666[arg0].method150(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class428.field5949 - 7);
        int var8 = var6 - (0xE6 << class428.field5949 - 7);
        int var9 = var6 - (0xEE << class428.field5949 - 7);
        if (arg3 == 1) {
            if (var4 > class294.field3946) {
                if (!class38.method223(var4, var6, var5)) {
                    return false;
                }
                if (!class38.method223(var4, var6, class49.field656 + var5)) {
                    return false;
                }
                if (!class38.method223(var4, var6, class33.field327 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class38.method223(var4, var7, var5)) {
                    return false;
                }
                if (!class38.method223(var4, var7, class49.field656 + var5)) {
                    return false;
                }
                if (!class38.method223(var4, var7, class33.field327 + var5)) {
                    return false;
                }
            }
            if (!class38.method223(var4, var8, var5)) {
                return false;
            } else if (class38.method223(var4, var8, class49.field656 + var5)) {
                return class38.method223(var4, var8, class33.field327 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class99.field1212) {
                if (!class38.method223(var4, var6, class33.field327 + var5)) {
                    return false;
                }
                if (!class38.method223(class49.field656 + var4, var6, class33.field327 + var5)) {
                    return false;
                }
                if (!class38.method223(class33.field327 + var4, var6, class33.field327 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class38.method223(var4, var7, class33.field327 + var5)) {
                    return false;
                }
                if (!class38.method223(class49.field656 + var4, var7, class33.field327 + var5)) {
                    return false;
                }
                if (!class38.method223(class33.field327 + var4, var7, class33.field327 + var5)) {
                    return false;
                }
            }
            if (!class38.method223(var4, var8, class33.field327 + var5)) {
                return false;
            } else if (class38.method223(class49.field656 + var4, var8, class33.field327 + var5)) {
                return class38.method223(class33.field327 + var4, var8, class33.field327 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class294.field3946) {
                if (!class38.method223(class33.field327 + var4, var6, var5)) {
                    return false;
                }
                if (!class38.method223(class33.field327 + var4, var6, class49.field656 + var5)) {
                    return false;
                }
                if (!class38.method223(class33.field327 + var4, var6, class33.field327 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class38.method223(class33.field327 + var4, var7, var5)) {
                    return false;
                }
                if (!class38.method223(class33.field327 + var4, var7, class49.field656 + var5)) {
                    return false;
                }
                if (!class38.method223(class33.field327 + var4, var7, class33.field327 + var5)) {
                    return false;
                }
            }
            if (!class38.method223(class33.field327 + var4, var8, var5)) {
                return false;
            } else if (class38.method223(class33.field327 + var4, var8, class49.field656 + var5)) {
                return class38.method223(class33.field327 + var4, var8, class33.field327 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class99.field1212) {
                if (!class38.method223(var4, var6, var5)) {
                    return false;
                }
                if (!class38.method223(class49.field656 + var4, var6, var5)) {
                    return false;
                }
                if (!class38.method223(class33.field327 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class38.method223(var4, var7, var5)) {
                    return false;
                }
                if (!class38.method223(class49.field656 + var4, var7, var5)) {
                    return false;
                }
                if (!class38.method223(class33.field327 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class38.method223(var4, var8, var5)) {
                return false;
            } else if (class38.method223(class49.field656 + var4, var8, var5)) {
                return class38.method223(class33.field327 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class38.method223(class49.field656 + var4, var9, class49.field656 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class38.method223(var4, var8, class33.field327 + var5);
        } else if (arg3 == 32) {
            return class38.method223(class33.field327 + var4, var8, class33.field327 + var5);
        } else if (arg3 == 64) {
            return class38.method223(class33.field327 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class38.method223(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILjava/lang/String;)I", line = 470)
    public static final int method2820(int arg0, String arg1) {
        if (arg0 == 1) {
            field6759++;
            return arg1.length() + 1;
        } else {
            return 29;
        }
    }
}
