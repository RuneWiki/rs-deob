import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class202 implements Runnable {

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Lek;")
    private class205 field2973 = new class205();

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Z")
    private boolean field2980 = false;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public int field2981 = 0;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field2979;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "[I")
    public static int[] field2977 = new int[100];

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!lm", name = "run", descriptor = "()V")
    public final void run() {
        field2970++;
        while (!this.field2980) {
            class205 var1 = this.field2973;
            class35 var2;
            synchronized (this.field2973) {
                var2 = (class35) this.field2973.method1452((byte) 23);
                if (var2 == null) {
                    try {
                        this.field2973.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2981--;
            }
            try {
                if (var2.field443 == 2) {
                    var2.field437.method1552(100, (int) var2.field2422, var2.field441.length, var2.field441);
                } else if (var2.field443 == 3) {
                    var2.field441 = var2.field437.method1555(0, (int) var2.field2422);
                }
            } catch (Exception var6) {
                class5.method27(118, (String) null, var6);
            }
            var2.field2341 = false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public final void method1424(int arg0) {
        this.field2980 = true;
        field2976++;
        class205 var2 = this.field2973;
        synchronized (this.field2973) {
            this.field2973.notifyAll();
        }
        try {
            this.field2979.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 0) {
            method1429(65);
        }
        this.field2979 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
    public static final void method1425(int arg0, int arg1) {
        field2968++;
        class101 var2 = (class101) class142.field2308.method1073(-1, (long) arg0);
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field1717.length; var3++) {
                var2.field1717[var3] = -1;
                var2.field1713[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLea;I)Lrf;")
    public final class35 method1426(byte arg0, class224 arg1, int arg2) {
        field2971++;
        class35 var4 = new class35();
        var4.field2342 = false;
        var4.field443 = 3;
        var4.field437 = arg1;
        var4.field2422 = (long) arg2;
        if (arg0 != -23) {
            this.method1426((byte) -2, (class224) null, -10);
        }
        this.method1430(var4, (byte) 119);
        return var4;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method1427(byte arg0) {
        if (arg0 >= -3) {
            field2977 = null;
        }
        field2977 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lea;BI)Lrf;")
    public final class35 method1428(class224 arg0, byte arg1, int arg2) {
        field2974++;
        class35 var4 = new class35();
        var4.field443 = 1;
        class205 var5 = this.field2973;
        synchronized (this.field2973) {
            class35 var6 = (class35) this.field2973.method1450(false);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field2422 && var6.field437 == arg0 && var6.field443 == 2) {
                    var4.field441 = var6.field441;
                    var4.field2341 = false;
                    return var4;
                }
                var6 = (class35) this.field2973.method1448(false);
            }
        }
        var4.field441 = arg0.method1555(0, arg2);
        var4.field2341 = false;
        int var8 = 63 / ((9 - arg1) / 44);
        var4.field2342 = true;
        return var4;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)Z")
    public static final boolean method1429(int arg0) {
        field2975++;
        if (class121.field1990) {
            try {
                if ((Boolean) class150.method1120(class273.field4426.field2020, false, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 21917) {
            method1427((byte) -4);
        }
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lrf;B)V")
    private final void method1430(class35 arg0, byte arg1) {
        class205 var3 = this.field2973;
        synchronized (this.field2973) {
            this.field2973.method1453(-89, arg0);
            this.field2981++;
            this.field2973.notifyAll();
            int var4 = 54 % ((arg1 - 44) / 40);
        }
        field2978++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B[BLea;I)Lrf;")
    public final class35 method1431(byte arg0, byte[] arg1, class224 arg2, int arg3) {
        field2969++;
        class35 var5 = new class35();
        var5.field2342 = false;
        var5.field441 = arg1;
        if (arg0 != 124) {
            this.field2979 = null;
        }
        var5.field2422 = (long) arg3;
        var5.field437 = arg2;
        var5.field443 = 2;
        this.method1430(var5, (byte) -90);
        return var5;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
    public class202() {
        class60 var1 = class273.field4426.method941(5, 118, this);
        while (var1.field936 == 0) {
            class155.method1130(1, 10L);
        }
        if (var1.field936 == 2) {
            throw new RuntimeException();
        }
        this.field2979 = (Thread) var1.field932;
    }
}
