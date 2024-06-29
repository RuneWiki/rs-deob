import jagex3.jagmisc.jagmisc;
import java.awt.Rectangle;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class655 implements Runnable {

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Lat;")
    private class398 field9376 = new class398();

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field9371;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9381 = new String[] { method4782(method4781("&`\u000e%n")), method4782(method4781("2!\u000eH;")), method4782(method4781("'zL\n")), method4782(method4781("&`\u000e$n")), method4782(method4781("&`\u000e\u00143''")), method4782(method4781("&`\u000e\"n")), method4782(method4781("&`\u000e'n")), method4782(method4781("&`\u000e#n")), method4782(method4781("&`\u000eZ/'fTXn")) };

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "Lch;")
    public static class490 field9378;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;I)Leea;")
    public final class140 method4776(String arg0, int arg1) {
        try {
            field9377++;
            if (this.field9371 == null) {
                throw new IllegalStateException("");
            } else if (arg0 == null) {
                throw new IllegalArgumentException("");
            } else {
                class140 var3 = new class140(arg0);
                this.method4779(arg1 ^ arg1, var3);
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9381[6] + (arg0 == null ? field9381[2] : field9381[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public final void method4777(int arg0) {
        try {
            field9373++;
            if (this.field9371 != null) {
                this.method4779(arg0 - 1, new class568());
                try {
                    this.field9371.join();
                } catch (InterruptedException var3) {
                }
                if (arg0 != 1) {
                    this.run();
                }
                this.field9371 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9381[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field9372++;
            while (true) {
                class398 var1 = this.field9376;
                class140 var3;
                synchronized (this.field9376) {
                    class568 var2;
                    for (var2 = this.field9376.method3219(-69); var2 == null; var2 = this.field9376.method3219(-74)) {
                        try {
                            this.field9376.wait();
                        } catch (InterruptedException var9) {
                        }
                    }
                    if (!(var2 instanceof class140)) {
                        return;
                    }
                    var3 = (class140) var2;
                }
                int var5;
                try {
                    byte[] var4 = InetAddress.getByName(var3.field1954).getAddress();
                    var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
                } catch (Throwable var10) {
                    var5 = 1000;
                }
                var3.field1960 = var5;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field9381[4] + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
    public static void method4778(byte arg0) {
        try {
            if (arg0 != -9) {
                method4778((byte) -27);
            }
            field9378 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9381[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILac;)V")
    private final void method4779(int arg0, class568 arg1) {
        try {
            field9374++;
            class398 var3 = this.field9376;
            synchronized (this.field9376) {
                this.field9376.method3220(arg1, arg0 + arg0);
                this.field9376.notify();
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9381[7] + arg0 + ',' + (arg1 == null ? field9381[2] : field9381[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
    public class655() {
        try {
            this.field9371 = new Thread(this);
            this.field9371.setDaemon(true);
            this.field9371.start();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9381[8] + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZI[Ljava/awt/Rectangle;)V")
    public static final void method4780(boolean arg0, int arg1, Rectangle[] arg2) throws class146 {
        try {
            field9380++;
            if (class184.field2931 == 1) {
                class761.field11182.method256(arg2, arg1, class776.field11329, class633.field9093);
            } else {
                class761.field11182.method256(arg2, arg1, 0, 0);
            }
            if (arg0) {
                field9379 = -76;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9381[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9381[2] : field9381[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4781(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4782(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
