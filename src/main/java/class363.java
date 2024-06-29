import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class363 implements Runnable {

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "Llq;")
    private class549 field5092 = new class246();

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "Llq;")
    private class549 field5098 = null;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    public static int field5096 = 0;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "J")
    public static long field5094 = -1L;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field5081 = 0;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "Lqe;")
    public static class465 field5087 = new class465(72, 0);

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "I")
    private int field5103;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
    private int field5104;

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "J")
    private long field5101;

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "J")
    private long field5106;

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "Lwj;")
    private class392 field5102;

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "Ljava/lang/String;")
    private String field5100;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "Z")
    private boolean field5079;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "Z")
    private volatile boolean field5095;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method2259(int arg0) {
        if (arg0 > -11) {
            return null;
        } else {
            field5085++;
            return this.field5100;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)I")
    public final int method2260(boolean arg0) {
        if (arg0) {
            this.field5079 = false;
        }
        field5082++;
        return this.field5103;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)I")
    public final int method2261(byte arg0) {
        field5084++;
        if (this.field5102 == null) {
            return 0;
        }
        if (arg0 >= -41) {
            this.field5098 = null;
        }
        int var2 = this.field5102.method2440(-30381);
        if (this.field5102.field5482 && this.field5102.field5477 > this.field5103) {
            return this.field5103 + 1;
        } else if (var2 >= 0 && var2 < (class555.field7777.length - 1)) {
            return this.field5102.field5474 == this.field5103 ? this.field5102.field5477 : this.field5102.field5474;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
    public final synchronized void method2262(int arg0) {
        this.field5079 = true;
        if (arg0 != 0) {
            this.field5079 = false;
        }
        field5080++;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/lang/String;JILwj;I)V")
    public final synchronized void method2263(String arg0, long arg1, int arg2, class392 arg3, int arg4) {
        field5091++;
        this.field5106 = arg1;
        this.field5103 = arg2;
        this.field5102 = arg3;
        if (arg4 != -727) {
            this.method2272(null, 53);
        }
        this.field5100 = arg0;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(Z)J")
    public final long method2264(boolean arg0) {
        field5099++;
        return arg0 ? this.field5106 : 103L;
    }

    @OriginalMember(owner = "client!uv", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field5095) {
            long var1 = class742.method4128(1);
            synchronized (this) {
                try {
                    this.field5104++;
                    if (this.field5092 instanceof class246) {
                        this.field5092.method1636(true, this.field5079);
                    } else {
                        long var4 = class742.method4128(1);
                        if (class359.field5046 == null || this.field5098 == null || this.field5098.method1647(-4332) == 0 || this.field5101 < var4 - ((long) this.field5098.method1647(-4332))) {
                            if (this.field5098 != null) {
                                this.field5079 = true;
                                this.field5098.method1642(18105);
                                this.field5098 = null;
                            }
                            if (this.field5079) {
                                class696.method3905(-94);
                                if (class359.field5046 != null) {
                                    class359.field5046.method617(0);
                                }
                            }
                            this.field5092.method1636(true, this.field5079 || class359.field5046 != null && class359.field5046.method635());
                        } else {
                            int var6 = (int) ((var4 - this.field5101) * 255L / (long) this.field5098.method1647(-4332));
                            int var7 = 255 - var6;
                            class696.method3905(-68);
                            int var8 = var6 << 24 | 0xFFFFFF;
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class359.field5046.method617(0);
                            class743 var10 = class359.field5046.method581(class206.field2956, field5105, true);
                            class359.field5046.method555(var10, (byte) 100);
                            this.field5098.method1636(true, true);
                            class359.field5046.method536();
                            var10.method86(0, 0, 0, var9, 1);
                            class359.field5046.method555(var10, (byte) 119);
                            class359.field5046.method617(0);
                            this.field5092.method1636(true, true);
                            class359.field5046.method536();
                            var10.method86(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class359.field5046 != null && !(this.field5092 instanceof class246)) {
                                class359.field5046.method582(3593);
                            }
                        } catch (class701 var18) {
                            class621.method3591(var18.getMessage() + " (Recovered) " + class345.field4858.method1939(-123), var18, (byte) -93);
                            class54.method490((byte) 125, true, 0);
                        }
                    }
                    Container var12;
                    if (class754.field10504 != null) {
                        var12 = class754.field10504;
                    } else if (class476.field6812 == null) {
                        var12 = class407.field5670;
                    } else {
                        var12 = class476.field6812;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class754.field10504 == var12) {
                        class754.field10504.getInsets();
                    }
                    this.field5079 = false;
                    class561.method3286(false);
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class742.method4128(1);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class246.method1639((long) var15, (byte) -55);
            }
        }
        field5090++;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(III)Z")
    public static final boolean method2265(int arg0, int arg1, int arg2) {
        field5083++;
        if (arg0 == 0) {
            return (arg2 & 0x70000) != 0 | class377.method2368(arg1, true, arg2) || class555.method3249(arg1, arg2, 34336);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)V")
    public final void method2266(int arg0) {
        field5088++;
        if (arg0 != 958) {
            field5094 = -67L;
        }
        this.field5095 = true;
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)I")
    public final int method2267(int arg0) {
        field5089++;
        if (arg0 != -1) {
            field5087 = null;
        }
        return this.field5104;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)Z")
    public final synchronized boolean method2268(byte arg0) {
        field5086++;
        if (arg0 != -46) {
            field5081 = 77;
        }
        return this.field5092.method1637(this.field5101, -113);
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V")
    public static void method2269(int arg0) {
        field5087 = null;
        if (arg0 != 72) {
            field5087 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "(I)Lwj;")
    public final class392 method2270(int arg0) {
        if (arg0 != 247668248) {
            this.method2264(true);
        }
        field5093++;
        return this.field5102;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lda;)V")
    public static final void method2271(class59 arg0) {
        class21.field268 = arg0;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Llq;I)V")
    public final synchronized void method2272(class549 arg0, int arg1) {
        if (arg1 != -21323) {
            this.method2259(-89);
        }
        field5097++;
        this.field5098 = this.field5092;
        this.field5092 = arg0;
        this.field5101 = class742.method4128(1);
    }
}
