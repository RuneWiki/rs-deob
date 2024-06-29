import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class177 implements Runnable {

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lvg;")
    private class22 field2803 = new class22();

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public int field2814 = 0;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Z")
    private boolean field2815 = false;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field2813;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2808 = "purple:";

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "[I")
    public static int[] field2807;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "[I")
    public static int[] field2810;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILs;I)Lci;")
    public final class173 method1224(int arg0, class107 arg1, int arg2) {
        class173 var4 = new class173();
        field2811++;
        var4.field2744 = 1;
        class22 var5 = this.field2803;
        synchronized (this.field2803) {
            class173 var6 = (class173) this.field2803.method124(0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field1087 && var6.field2748 == arg1 && var6.field2744 == 2) {
                    var4.field3610 = false;
                    var4.field2745 = var6.field2745;
                    return var4;
                }
                var6 = (class173) this.field2803.method122(99);
            }
        }
        var4.field2745 = arg1.method649(true, arg2);
        var4.field3604 = true;
        if (arg0 > -54) {
            return null;
        } else {
            var4.field3610 = false;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLci;)V")
    private final void method1225(byte arg0, class173 arg1) {
        class22 var3 = this.field2803;
        synchronized (this.field2803) {
            this.field2803.method125(arg1, arg0 - 80);
            this.field2814++;
            this.field2803.notifyAll();
        }
        if (arg0 != 79) {
            field2810 = null;
        }
        field2809++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method1226(byte arg0) {
        field2807 = null;
        if (arg0 <= 101) {
            field2810 = null;
        }
        field2810 = null;
        field2808 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIIILtc;II)Lib;")
    public static final class56 method1227(boolean arg0, int arg1, int arg2, int arg3, class134 arg4, int arg5, int arg6) {
        field2812++;
        int var8 = (arg0 ? 65536 : 0) + arg2 + (arg1 << 17) + (arg3 << 19);
        long var9 = (long) arg6 * 3147483667L + (long) var8 * 3849834839L;
        class56 var11 = (class56) class189.field3067.method1693(var9, 100);
        if (var11 != null) {
            return var11;
        }
        class174.field2757 = false;
        if (arg5 != 150) {
            method1226((byte) 24);
        }
        class56 var12 = class50.method283(arg2, false, 324201584, arg3, arg1, arg0, arg6, false, arg4);
        if (var12 != null && !class174.field2757) {
            class189.field3067.method1694(true, var9, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lwb;B)V")
    public static final void method1228(class123 arg0, byte arg1) {
        field2799++;
        int var2 = arg0.field1848;
        if (var2 == 324) {
            if (class66.field835 == -1) {
                class66.field835 = arg0.field1893;
                class234.field3873 = arg0.field1797;
            }
            if (class171.field2722.field2116) {
                arg0.field1893 = class66.field835;
            } else {
                arg0.field1893 = class234.field3873;
            }
        } else if (var2 == 325) {
            if (class66.field835 == -1) {
                class66.field835 = arg0.field1893;
                class234.field3873 = arg0.field1797;
            }
            if (class171.field2722.field2116) {
                arg0.field1893 = class234.field3873;
            } else {
                arg0.field1893 = class66.field835;
            }
        } else if (var2 == 327) {
            arg0.field1804 = 150;
            arg0.field1907 = (int) (Math.sin((double) class73.field924 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1818 = -1;
            arg0.field1769 = 5;
        } else {
            int var3 = 124 / ((arg1 + 46) / 44);
            if (var2 == 328) {
                if (class286.field4571.field4208 == null) {
                    arg0.field1818 = 0;
                } else {
                    arg0.field1804 = 150;
                    arg0.field1907 = (int) (Math.sin((double) class73.field924 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field1769 = 5;
                    arg0.field1818 = ((int) class185.method1296((byte) -103, class286.field4571.field4208) << 11) + 2047;
                    arg0.field1783 = class286.field4571.field3793;
                    arg0.field1894 = 0;
                    arg0.field1900 = class286.field4571.field3750;
                    arg0.field1780 = class286.field4571.field3833;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILs;)Lci;")
    public final class173 method1229(int arg0, int arg1, class107 arg2) {
        class173 var4 = new class173();
        field2804++;
        if (arg1 != -16765) {
            return null;
        }
        var4.field3604 = false;
        var4.field2748 = arg2;
        var4.field2744 = 3;
        var4.field1087 = (long) arg0;
        this.method1225((byte) 79, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public final void method1230(byte arg0) {
        field2802++;
        this.field2815 = true;
        class22 var2 = this.field2803;
        synchronized (this.field2803) {
            int var3 = -15 / ((arg0 + 10) / 62);
            this.field2803.notifyAll();
        }
        try {
            this.field2813.join();
        } catch (InterruptedException var4) {
        }
        this.field2813 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILs;B[B)Lci;")
    public final class173 method1231(int arg0, class107 arg1, byte arg2, byte[] arg3) {
        field2800++;
        class173 var5 = new class173();
        if (arg2 != 104) {
            method1232(67, -38);
        }
        var5.field2748 = arg1;
        var5.field2745 = arg3;
        var5.field3604 = false;
        var5.field2744 = 2;
        var5.field1087 = (long) arg0;
        this.method1225((byte) 79, var5);
        return var5;
    }

    @OriginalMember(owner = "client!sj", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2815) {
            class22 var1 = this.field2803;
            class173 var2;
            synchronized (this.field2803) {
                var2 = (class173) this.field2803.method126((byte) 114);
                if (var2 == null) {
                    try {
                        this.field2803.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2814--;
            }
            try {
                if (var2.field2744 == 2) {
                    var2.field2748.method647(var2.field2745.length, (int) var2.field1087, (byte) -65, var2.field2745);
                } else if (var2.field2744 == 3) {
                    var2.field2745 = var2.field2748.method649(true, (int) var2.field1087);
                }
            } catch (Exception var6) {
                class30.method168((byte) -45, var6, (String) null);
            }
            var2.field3610 = false;
        }
        field2801++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I")
    public static final int method1232(int arg0, int arg1) {
        field2805++;
        if (arg1 >= -57) {
            method1233((byte) -122, 'W', (String) null);
        }
        return arg0 == 16711935 ? -1 : class288.method1938(true, arg0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1233(byte arg0, char arg1, String arg2) {
        int var3 = class266.method1792(-48, arg2, arg1);
        field2806++;
        int var4 = 0;
        String[] var5 = new String[var3 + 1];
        int var6 = 0;
        if (arg0 <= 80) {
            field2807 = null;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1 != arg2.charAt(var8); var8++) {
            }
            var5[var4++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var5[var3] = arg2.substring(var6);
        return var5;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class177() {
        class243 var1 = class194.field3107.method271(5, this, 2);
        while (var1.field3995 == 0) {
            class115.method752((byte) -62, 10L);
        }
        if (var1.field3995 == 2) {
            throw new RuntimeException();
        }
        this.field2813 = (Thread) var1.field3992;
    }
}
