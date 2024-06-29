import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lv;")
    private class57 field2810 = new class57();

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Z")
    private boolean field2820 = false;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public int field2822 = 0;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field2821;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[[I")
    public static int[][] field2819 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field2814 = -2;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Lsg;")
    public static class30 field2823 = class167.method1221((byte) 33, "overlay2");

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "[[[Lne;")
    public static class195[][][] field2809;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZILvd;)Lnk;")
    public final class11 method1075(boolean arg0, int arg1, class110 arg2) {
        class11 var4 = new class11();
        var4.field222 = 3;
        if (!arg0) {
            return null;
        }
        field2808++;
        var4.field198 = arg2;
        var4.field4502 = false;
        var4.field1743 = (long) arg1;
        this.method1076((byte) 23, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLnk;)V")
    private final void method1076(byte arg0, class11 arg1) {
        field2816++;
        class57 var3 = this.field2810;
        synchronized (this.field2810) {
            this.field2810.method535(arg1, (byte) -67);
            this.field2822++;
            if (arg0 != 23) {
                this.method1080((byte) 90);
            }
            this.field2810.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kj", name = "run", descriptor = "()V")
    public final void run() {
        field2813++;
        while (!this.field2820) {
            class57 var1 = this.field2810;
            class11 var2;
            synchronized (this.field2810) {
                var2 = (class11) this.field2810.method541(false);
                if (var2 == null) {
                    try {
                        this.field2810.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2822--;
            }
            try {
                if (var2.field222 == 2) {
                    var2.field198.method868(-1427226832, var2.field215, (int) var2.field1743, var2.field215.length);
                } else if (var2.field222 == 3) {
                    var2.field215 = var2.field198.method869(255, (int) var2.field1743);
                }
            } catch (Exception var6) {
                class93.method751(var6, (String) null, -34);
            }
            var2.field4506 = false;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method1077(int arg0) {
        if (arg0 != 12850) {
            method1077(-104);
        }
        field2819 = null;
        field2809 = null;
        field2823 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLvd;I[B)Lnk;")
    public final class11 method1078(boolean arg0, class110 arg1, int arg2, byte[] arg3) {
        field2818++;
        class11 var5 = new class11();
        var5.field222 = 2;
        var5.field4502 = arg0;
        var5.field1743 = (long) arg2;
        var5.field215 = arg3;
        var5.field198 = arg1;
        this.method1076((byte) 23, var5);
        return var5;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BILvd;)Lnk;")
    public final class11 method1079(byte arg0, int arg1, class110 arg2) {
        field2817++;
        class11 var4 = new class11();
        if (arg0 != 22) {
            return null;
        }
        var4.field222 = 1;
        class57 var5 = this.field2810;
        synchronized (this.field2810) {
            class11 var6 = (class11) this.field2810.method542(18844);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field1743 && var6.field198 == arg2 && var6.field222 == 2) {
                    var4.field215 = var6.field215;
                    var4.field4506 = false;
                    return var4;
                }
                var6 = (class11) this.field2810.method533(7);
            }
        }
        var4.field215 = arg2.method869(255, arg1);
        var4.field4502 = true;
        var4.field4506 = false;
        return var4;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public final void method1080(byte arg0) {
        if (arg0 != -84) {
            field2823 = null;
        }
        this.field2820 = true;
        field2812++;
        class57 var2 = this.field2810;
        synchronized (this.field2810) {
            this.field2810.notifyAll();
        }
        try {
            this.field2821.join();
        } catch (InterruptedException var3) {
        }
        this.field2821 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class147() {
        class27 var1 = class190.field3452.method592(this, -86, 5);
        while (var1.field493 == 0) {
            class160.method1191(10L, 0);
        }
        if (var1.field493 == 2) {
            throw new RuntimeException();
        }
        this.field2821 = (Thread) var1.field492;
    }
}
