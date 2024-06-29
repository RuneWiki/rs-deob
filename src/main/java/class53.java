import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class53 implements Runnable {

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lji;")
    private class40 field1118 = new class40();

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Z")
    private boolean field1125 = false;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public int field1124 = 0;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field1127;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field1120 = -1;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Lue;")
    public static class86 field1128;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILkb;I)Lfb;")
    public final class29 method333(int arg0, class51 arg1, int arg2) {
        field1121++;
        if (arg0 != -3715) {
            field1128 = null;
        }
        class29 var4 = new class29();
        var4.field741 = arg1;
        var4.field3647 = (long) arg2;
        var4.field734 = 3;
        var4.field3436 = false;
        this.method340(var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public final void method334(int arg0) {
        this.field1125 = true;
        field1122++;
        class40 var2 = this.field1118;
        synchronized (this.field1118) {
            this.field1118.notifyAll();
        }
        try {
            if (arg0 < 34) {
                return;
            }
            this.field1127.join();
        } catch (InterruptedException var3) {
        }
        this.field1127 = null;
    }

    @OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field1125) {
            class40 var1 = this.field1118;
            class29 var2;
            synchronized (this.field1118) {
                var2 = (class29) this.field1118.method255(0);
                if (var2 == null) {
                    try {
                        this.field1118.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field1124--;
            }
            try {
                if (var2.field734 == 2) {
                    var2.field741.method325((int) var2.field3647, -114, var2.field737, var2.field737.length);
                } else if (var2.field734 == 3) {
                    var2.field737 = var2.field741.method326((int) var2.field3647, true);
                }
            } catch (Exception var7) {
                class137.method899(var7, (String) null, 46);
            }
            var2.field3427 = false;
        }
        field1119++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
    public static final int method335(int arg0, int arg1) {
        if (arg0 >= -16) {
            method338(87, 100, -101, -109, 25);
        }
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xF3333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        field1130++;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BBLkb;I)Lfb;")
    public final class29 method336(byte[] arg0, byte arg1, class51 arg2, int arg3) {
        field1123++;
        int var5 = -30 / ((arg1 - 10) / 60);
        class29 var6 = new class29();
        var6.field734 = 2;
        var6.field737 = arg0;
        var6.field741 = arg2;
        var6.field3647 = (long) arg3;
        var6.field3436 = false;
        this.method340(var6, true);
        return var6;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILkb;B)Lfb;")
    public final class29 method337(int arg0, class51 arg1, byte arg2) {
        field1117++;
        class29 var4 = new class29();
        var4.field734 = 1;
        class40 var5 = this.field1118;
        synchronized (this.field1118) {
            class29 var6 = (class29) this.field1118.method250(0);
            while (true) {
                if (var6 == null) {
                    if (arg2 != 40) {
                        this.method336((byte[]) null, (byte) 111, (class51) null, 18);
                    }
                    break;
                }
                if (((long) arg0) == var6.field3647 && var6.field741 == arg1 && var6.field734 == 2) {
                    var4.field3427 = false;
                    var4.field737 = var6.field737;
                    return var4;
                }
                var6 = (class29) this.field1118.method251((byte) -17);
            }
        }
        var4.field737 = arg1.method326(arg0, true);
        var4.field3427 = false;
        var4.field3436 = true;
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)V")
    public static final void method338(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg1 != 2) {
            return;
        }
        while (class257.field4471 > var5) {
            if (arg0 < class185.field3350[var5] + class216.field3835[var5] && (arg0 + arg4) > class185.field3350[var5] && class115.field2155[var5] + class119.field2217[var5] > arg3 && arg2 + arg3 > class115.field2155[var5]) {
                class21.field629[var5] = true;
            }
            var5++;
        }
        field1115++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method339(int arg0) {
        field1128 = null;
        int var1 = 97 / ((-arg0 - 55) / 63);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lfb;Z)V")
    private final void method340(class29 arg0, boolean arg1) {
        class40 var3 = this.field1118;
        synchronized (this.field1118) {
            this.field1118.method253(arg0, (byte) 13);
            if (!arg1) {
                this.method340((class29) null, false);
            }
            this.field1124++;
            this.field1118.notifyAll();
        }
        field1126++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)[Lbb;")
    public static final class88[] method341(byte arg0) {
        field1129++;
        if (arg0 > -28) {
            method338(-66, -98, -5, 121, 33);
        }
        class88[] var1 = new class88[class31.field781];
        for (int var2 = 0; var2 < class31.field781; var2++) {
            var1[var2] = new class88(class240.field4200, class2.field46, class198.field3584[var2], class46.field1003[var2], class198.field3583[var2], class181.field3289[var2], class191.field3425[var2], class103.field1965);
        }
        class14.method111(0);
        return var1;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class53() {
        class235 var1 = class95.field1867.method1724((byte) 99, 5, this);
        while (var1.field4114 == 0) {
            class215.method1457(10L, (byte) 126);
        }
        if (var1.field4114 == 2) {
            throw new RuntimeException();
        }
        this.field1127 = (Thread) var1.field4117;
    }
}
