import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class292 implements Runnable {

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Loe;")
    private class65 field4786 = new class65();

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field4789 = 0;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Z")
    private boolean field4794 = false;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field4792;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field4785 = 127;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field4791 = 0;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4784 = "green:";

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field4790 = 0;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[I")
    public static int[] field4783;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method2018(int arg0) {
        field4784 = null;
        field4783 = null;
        int var1 = 45 % ((arg0 + 57) / 37);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IBLbi;)Lrj;")
    public final class15 method2019(int arg0, byte arg1, class27 arg2) {
        field4780++;
        class15 var4 = new class15();
        int var5 = 30 / ((-arg1 - 42) / 60);
        var4.field307 = arg2;
        var4.field303 = 3;
        var4.field2570 = (long) arg0;
        var4.field1106 = false;
        this.method2021((byte) 30, var4);
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lbi;II)Lrj;")
    public final class15 method2020(class27 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method2023(11, 33, (byte[]) null, (class27) null);
        }
        class15 var4 = new class15();
        field4788++;
        var4.field303 = 1;
        class65 var5 = this.field4786;
        synchronized (this.field4786) {
            class15 var6 = (class15) this.field4786.method452(1576);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg1 == var6.field2570 && var6.field307 == arg0 && var6.field303 == 2) {
                    var4.field1114 = false;
                    var4.field310 = var6.field310;
                    return var4;
                }
                var6 = (class15) this.field4786.method448(631244930);
            }
        }
        var4.field310 = arg0.method175(117, arg1);
        var4.field1114 = false;
        var4.field1106 = true;
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLrj;)V")
    private final void method2021(byte arg0, class15 arg1) {
        class65 var3 = this.field4786;
        synchronized (this.field4786) {
            this.field4786.method449((byte) -64, arg1);
            this.field4789++;
            this.field4786.notifyAll();
        }
        field4782++;
        if (arg0 < 15) {
            this.method2022(8);
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
    public final void method2022(int arg0) {
        field4787++;
        this.field4794 = true;
        class65 var2 = this.field4786;
        synchronized (this.field4786) {
            this.field4786.notifyAll();
            if (arg0 != 0) {
                field4785 = -100;
            }
        }
        try {
            this.field4792.join();
        } catch (InterruptedException var3) {
        }
        this.field4792 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II[BLbi;)Lrj;")
    public final class15 method2023(int arg0, int arg1, byte[] arg2, class27 arg3) {
        field4793++;
        class15 var5 = new class15();
        var5.field1106 = false;
        var5.field307 = arg3;
        var5.field310 = arg2;
        var5.field2570 = (long) arg0;
        var5.field303 = arg1;
        this.method2021((byte) 32, var5);
        return var5;
    }

    @OriginalMember(owner = "client!em", name = "run", descriptor = "()V")
    public final void run() {
        field4781++;
        while (!this.field4794) {
            class65 var1 = this.field4786;
            class15 var2;
            synchronized (this.field4786) {
                var2 = (class15) this.field4786.method451(-66);
                if (var2 == null) {
                    try {
                        this.field4786.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4789--;
            }
            try {
                if (var2.field303 == 2) {
                    var2.field307.method177(var2.field310.length, (int) var2.field2570, var2.field310, (byte) -94);
                } else if (var2.field303 == 3) {
                    var2.field310 = var2.field307.method175(76, (int) var2.field2570);
                }
            } catch (Exception var6) {
                class84.method595(14117, (String) null, var6);
            }
            var2.field1114 = false;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
    public class292() {
        class191 var1 = class142.field2344.method583((byte) 112, this, 5);
        while (var1.field3091 == 0) {
            class28.method182(10L, true);
        }
        if (var1.field3091 == 2) {
            throw new RuntimeException();
        }
        this.field4792 = (Thread) var1.field3089;
    }
}
