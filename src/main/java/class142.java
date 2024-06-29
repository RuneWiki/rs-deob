import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class142 implements Runnable {

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Lef;")
    private class221 field2293 = new class221();

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public int field2294 = 0;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Z")
    private boolean field2295 = false;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field2296;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public final void method1010(int arg0) {
        this.field2295 = true;
        field2282++;
        class221 var2 = this.field2293;
        synchronized (this.field2293) {
            this.field2293.notifyAll();
        }
        try {
            this.field2296.join();
            if (arg0 != 100) {
                this.method1017((byte[]) null, (class263) null, -57, (byte) -28);
            }
        } catch (InterruptedException var3) {
        }
        this.field2296 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLgg;)V")
    private final void method1011(byte arg0, class198 arg1) {
        field2287++;
        class221 var3 = this.field2293;
        synchronized (this.field2293) {
            this.field2293.method1584(arg1, (byte) 110);
            this.field2294++;
            this.field2293.notifyAll();
            if (arg0 != 74) {
                this.run();
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1012(byte arg0, String arg1) {
        if (arg0 != 122) {
            field2288 = -71;
        }
        field2285++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - class108.method802(arg0 - 833, arg1.charAt(var4)));
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBI)V")
    public static final void method1013(int arg0, byte arg1, int arg2) {
        field2286++;
        class252.field4160[arg0] = arg2;
        class100 var3 = (class100) class262.field4266.method1034((long) arg0, (byte) 21);
        if (var3 == null) {
            class100 var4 = new class100(4611686018427387905L);
            class262.field4266.method1032(false, var4, (long) arg0);
        } else if (var3.field1470 != 4611686018427387905L) {
            var3.field1470 = class197.method1454((byte) -104) + 500L | 0x4000000000000000L;
        }
        if (arg1 >= -71) {
            field2288 = 98;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public static final void method1014(int arg0) {
        int[] var1 = new int[class19.field213];
        field2290++;
        if (arg0 != 32064) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class19.field213; var3++) {
            class62 var5 = class254.method1800(var3, 15017);
            if (var5.field938 >= 0 || var5.field874 >= 0) {
                var1[var2++] = var3;
            }
        }
        class178.field2883 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class178.field2883[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lii;II)Lgg;")
    public final class198 method1015(class263 arg0, int arg1, int arg2) {
        field2291++;
        class198 var4 = new class198();
        var4.field3194 = 1;
        class221 var5 = this.field2293;
        synchronized (this.field2293) {
            class198 var6 = (class198) this.field2293.method1580(32);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field2242 && var6.field3202 == arg0 && var6.field3194 == 2) {
                    var4.field1090 = false;
                    var4.field3198 = var6.field3198;
                    return var4;
                }
                var6 = (class198) this.field2293.method1583(false);
            }
        }
        var4.field3198 = arg0.method1842(0, arg2);
        var4.field1094 = true;
        if (arg1 != 2) {
            this.method1018(-58, true, (class263) null);
        }
        var4.field1090 = false;
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)I")
    public static final int method1016(int arg0) {
        field2284++;
        if ((double) class229.field3689 == 3.0D) {
            return 37;
        } else if ((double) class229.field3689 == 4.0D) {
            return 50;
        } else if ((double) class229.field3689 == 6.0D) {
            return 75;
        } else if ((double) class229.field3689 == 8.0D) {
            return 100;
        } else {
            if (arg0 != 50) {
                method1016(-80);
            }
            return 200;
        }
    }

    @OriginalMember(owner = "client!dg", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2295) {
            class221 var1 = this.field2293;
            class198 var2;
            synchronized (this.field2293) {
                var2 = (class198) this.field2293.method1581(81);
                if (var2 == null) {
                    try {
                        this.field2293.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2294--;
            }
            try {
                if (var2.field3194 == 2) {
                    var2.field3202.method1841(var2.field3198.length, var2.field3198, 30, (int) var2.field2242);
                } else if (var2.field3194 == 3) {
                    var2.field3198 = var2.field3202.method1842(0, (int) var2.field2242);
                }
            } catch (Exception var7) {
                class191.method1422(var7, (String) null, (byte) 100);
            }
            var2.field1090 = false;
        }
        field2292++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([BLii;IB)Lgg;")
    public final class198 method1017(byte[] arg0, class263 arg1, int arg2, byte arg3) {
        field2283++;
        class198 var5 = new class198();
        var5.field3194 = 2;
        if (arg3 > -111) {
            method1013(27, (byte) -121, -94);
        }
        var5.field2242 = (long) arg2;
        var5.field3198 = arg0;
        var5.field1094 = false;
        var5.field3202 = arg1;
        this.method1011((byte) 74, var5);
        return var5;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLii;)Lgg;")
    public final class198 method1018(int arg0, boolean arg1, class263 arg2) {
        class198 var4 = new class198();
        var4.field2242 = (long) arg0;
        var4.field3202 = arg2;
        field2289++;
        var4.field1094 = arg1;
        var4.field3194 = 3;
        this.method1011((byte) 74, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class142() {
        class278 var1 = class138.field2241.method53(5, this, -40);
        while (var1.field4450 == 0) {
            class43.method324(10L, -97);
        }
        if (var1.field4450 == 2) {
            throw new RuntimeException();
        }
        this.field2296 = (Thread) var1.field4449;
    }
}
