import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class35 implements Runnable {

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lmb;")
    private class156 field543 = new class156();

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Z")
    private boolean field550 = false;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public int field551 = 0;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field549;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Ljd;")
    public static class85 field532 = class221.method1499("underlay", (byte) 122);

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field542 = 0;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field540 = 0;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "[I")
    public static int[] field541 = new int[5];

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Ljd;")
    public static class85 field544 = class221.method1499(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) 103);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Ljb;")
    public static class255 field538;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "[[[S")
    public static short[][][] field545;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method235(int arg0) {
        field532 = null;
        field544 = null;
        field541 = null;
        field538 = null;
        if (arg0 == 15201) {
            field545 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lp;Z)V")
    private final void method236(class270 arg0, boolean arg1) {
        field539++;
        class156 var3 = this.field543;
        synchronized (this.field543) {
            if (arg1) {
                this.method239((class38) null, -31, -93);
            }
            this.field543.method1025(29642, arg0);
            this.field551++;
            this.field543.notifyAll();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
    public static final int method237(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            method235(-113);
        }
        class186 var3 = (class186) class172.field2975.method1398(arg1 ^ 0x2, (long) arg0);
        field533++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field3191.length > arg2) {
            return var3.field3191[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field550) {
            class156 var1 = this.field543;
            class270 var2;
            synchronized (this.field543) {
                var2 = (class270) this.field543.method1021(-108);
                if (var2 == null) {
                    try {
                        this.field543.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field551--;
            }
            try {
                if (var2.field4795 == 2) {
                    var2.field4797.method251((int) var2.field3509, var2.field4789, var2.field4789.length, -1288866104);
                } else if (var2.field4795 == 3) {
                    var2.field4789 = var2.field4797.method253((int) var2.field3509, -513);
                }
            } catch (Exception var7) {
                class201.method1379(var7, (String) null, 2552);
            }
            var2.field3776 = false;
        }
        field546++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lok;II)Lp;")
    public final class270 method238(class38 arg0, int arg1, int arg2) {
        field534++;
        class270 var4 = new class270();
        var4.field3509 = (long) arg1;
        var4.field4795 = 3;
        var4.field4797 = arg0;
        int var5 = 18 % ((arg2 - 59) / 58);
        var4.field3772 = false;
        this.method236(var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lok;II)Lp;")
    public final class270 method239(class38 arg0, int arg1, int arg2) {
        field535++;
        class270 var4 = new class270();
        var4.field4795 = 1;
        class156 var5 = this.field543;
        synchronized (this.field543) {
            if (arg1 != -9764) {
                return null;
            }
            class270 var7 = (class270) this.field543.method1028(17);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if (((long) arg2) == var7.field3509 && var7.field4797 == arg0 && var7.field4795 == 2) {
                    var4.field3776 = false;
                    var4.field4789 = var7.field4789;
                    return var4;
                }
                var7 = (class270) this.field543.method1030(125);
            }
        }
        var4.field4789 = arg0.method253(arg2, -513);
        var4.field3772 = true;
        var4.field3776 = false;
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILok;[BI)Lp;")
    public final class270 method240(int arg0, class38 arg1, byte[] arg2, int arg3) {
        field548++;
        class270 var5 = new class270();
        if (arg0 > -97) {
            field547 = 31;
        }
        var5.field4797 = arg1;
        var5.field4795 = 2;
        var5.field3509 = (long) arg3;
        var5.field4789 = arg2;
        var5.field3772 = false;
        this.method236(var5, false);
        return var5;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public final void method241(int arg0) {
        this.field550 = true;
        class156 var2 = this.field543;
        synchronized (this.field543) {
            this.field543.notifyAll();
        }
        try {
            this.field549.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 < 113) {
            this.field549 = null;
        }
        this.field549 = null;
        field537++;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class35() {
        class69 var1 = class107.field1882.method555(-26915, 5, this);
        while (var1.field1296 == 0) {
            class190.method1311(10L, 1);
        }
        if (var1.field1296 == 2) {
            throw new RuntimeException();
        }
        this.field549 = (Thread) var1.field1292;
    }
}
