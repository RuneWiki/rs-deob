import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class344 implements Runnable {

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lig;")
    private class15 field5059 = new class15();

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Z")
    private boolean field5061 = false;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field5063 = 0;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field5065;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[Z")
    public static boolean[] field5053 = new boolean[100];

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Z")
    public static boolean field5066 = false;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lcq;II)Lpg;", line = 3)
    public final class115 method2230(class70 arg0, int arg1, int arg2) {
        field5054++;
        if (arg1 > -89) {
            this.field5059 = null;
        }
        class115 var4 = new class115();
        var4.field1558 = 1;
        class15 var5 = this.field5059;
        synchronized (this.field5059) {
            class115 var6 = (class115) this.field5059.method209(28);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field406 && var6.field1564 == arg0 && var6.field1558 == 2) {
                    var4.field1562 = var6.field1562;
                    var4.field5650 = false;
                    return var4;
                }
                var6 = (class115) this.field5059.method217(-27864);
            }
        }
        var4.field1562 = arg0.method514((byte) 110, arg2);
        var4.field5650 = false;
        var4.field5654 = true;
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLcq;)Lpg;", line = 38)
    public final class115 method2231(int arg0, byte arg1, class70 arg2) {
        if (arg1 < 19) {
            return null;
        }
        field5060++;
        class115 var4 = new class115();
        var4.field406 = (long) arg0;
        var4.field1564 = arg2;
        var4.field1558 = 3;
        var4.field5654 = false;
        this.method2233((byte) -104, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lcq;Z[BI)Lpg;", line = 58)
    public final class115 method2232(class70 arg0, boolean arg1, byte[] arg2, int arg3) {
        field5067++;
        class115 var5 = new class115();
        var5.field1564 = arg0;
        var5.field406 = (long) arg3;
        var5.field5654 = arg1;
        var5.field1562 = arg2;
        var5.field1558 = 2;
        this.method2233((byte) -105, var5);
        return var5;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLpg;)V", line = 74)
    private final void method2233(byte arg0, class115 arg1) {
        class15 var3 = this.field5059;
        synchronized (this.field5059) {
            this.field5059.method211(arg1, -32256);
            this.field5063++;
            this.field5059.notifyAll();
        }
        if (arg0 >= -63) {
            this.field5061 = false;
        }
        field5062++;
    }

    @OriginalMember(owner = "client!nb", name = "run", descriptor = "()V", line = 92)
    public final void run() {
        field5057++;
        while (!this.field5061) {
            class15 var1 = this.field5059;
            class115 var2;
            synchronized (this.field5059) {
                var2 = (class115) this.field5059.method213(0);
                if (var2 == null) {
                    try {
                        this.field5059.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5063--;
            }
            try {
                if (var2.field1558 == 2) {
                    var2.field1564.method511((int) var2.field406, var2.field1562.length, var2.field1562, (byte) -122);
                } else if (var2.field1558 == 3) {
                    var2.field1562 = var2.field1564.method514((byte) 120, (int) var2.field406);
                }
            } catch (Exception var6) {
                class365.method2331((String) null, var6, 28692);
            }
            var2.field5650 = false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 141)
    public static void method2234(byte arg0) {
        if (arg0 == -88) {
            field5053 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lgt;)V", line = 167)
    public class344(class341 arg0) {
        class350 var2 = arg0.method2213(5, this, 26744);
        while (var2.field5134 == 0) {
            class418.method2587(false, 10L);
        }
        if (var2.field5134 == 2) {
            throw new RuntimeException();
        }
        this.field5065 = (Thread) var2.field5129;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V", line = 195)
    public final void method2235(byte arg0) {
        this.field5061 = true;
        field5056++;
        class15 var2 = this.field5059;
        synchronized (this.field5059) {
            this.field5059.notifyAll();
        }
        try {
            this.field5065.join();
        } catch (InterruptedException var3) {
        }
        this.field5065 = null;
        if (arg0 != -119) {
            this.method2233((byte) -60, (class115) null);
        }
    }
}
