import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class25 implements Runnable {

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Ldp;")
    private class514 field298 = new class514();

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
    private boolean field300 = false;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public int field299 = 0;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field303;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field304 = new String[] { method293(method292("oK|<\u0019")), method293(method292("~\u0002|WL")), method293(method292("z\u0010>~")), method293(method292("~\u0002|SL")), method293(method292("~\u0002|VL")), method293(method292("~\u0002|.\rz\f&,L")), method293(method292("~\u0002|`\u0011zM")), method293(method292("~\u0002|QL")), method293(method292("~\u0002|PL")) };

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([BIILnha;)Lffa;")
    public final class248 method287(byte[] arg0, int arg1, int arg2, class335 arg3) {
        try {
            field294++;
            class248 var5 = new class248();
            var5.field4361 = false;
            var5.field3559 = arg3;
            var5.field3556 = arg0;
            var5.field3557 = arg1;
            var5.field9630 = arg2;
            this.method290(var5, -1);
            return var5;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field304[4] + (arg0 == null ? field304[2] : field304[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field304[2] : field304[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILnha;I)Lffa;")
    public final class248 method288(int arg0, class335 arg1, int arg2) {
        try {
            field296++;
            class248 var4 = new class248();
            var4.field9630 = arg2;
            var4.field3557 = arg0;
            var4.field4361 = false;
            var4.field3559 = arg1;
            this.method290(var4, -1);
            return var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field304[3] + arg0 + ',' + (arg1 == null ? field304[2] : field304[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILnha;)Lffa;")
    public final class248 method289(int arg0, int arg1, class335 arg2) {
        try {
            field297++;
            class248 var4 = new class248();
            var4.field3557 = 1;
            class514 var5 = this.field298;
            synchronized (this.field298) {
                for (class248 var6 = (class248) this.field298.method3932((byte) -16); var6 != null; var6 = (class248) this.field298.method3939((byte) -75)) {
                    if (((long) arg1) == var6.field9630 && var6.field3559 == arg2 && var6.field3557 == 2) {
                        var4.field4364 = false;
                        var4.field3556 = var6.field3556;
                        return var4;
                    }
                }
                if (arg0 != 27616) {
                    this.field298 = null;
                }
            }
            var4.field3556 = arg2.method2694(-1543520144, arg1);
            var4.field4364 = false;
            var4.field4361 = true;
            return var4;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field304[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field304[2] : field304[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lffa;I)V")
    private final void method290(class248 arg0, int arg1) {
        try {
            if (arg1 == -1) {
                class514 var3 = this.field298;
                synchronized (this.field298) {
                    this.field298.method3937(true, arg0);
                    this.field299++;
                    this.field298.notifyAll();
                }
                field301++;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field304[1] + (arg0 == null ? field304[2] : field304[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public final void method291(byte arg0) {
        try {
            this.field300 = true;
            field302++;
            class514 var2 = this.field298;
            synchronized (this.field298) {
                this.field298.notifyAll();
            }
            try {
                this.field303.join();
            } catch (InterruptedException var4) {
            }
            if (arg0 <= 124) {
                this.method288(-7, null, 108);
            }
            this.field303 = null;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field304[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jg", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field295++;
            while (!this.field300) {
                class514 var1 = this.field298;
                class248 var2;
                synchronized (this.field298) {
                    var2 = (class248) this.field298.method3938((byte) -14);
                    if (var2 == null) {
                        try {
                            this.field298.wait();
                        } catch (InterruptedException var8) {
                        }
                        continue;
                    }
                    this.field299--;
                }
                try {
                    if (var2.field3557 == 2) {
                        var2.field3559.method2692(var2.field3556, var2.field3556.length, (int) var2.field9630, -25614);
                    } else if (var2.field3557 == 3) {
                        var2.field3556 = var2.field3559.method2694(-1543520144, (int) var2.field9630);
                    }
                } catch (Exception var7) {
                    class162.method1374(var7, null, (byte) -93);
                }
                var2.field4364 = false;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field304[6] + ')');
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lft;)V")
    public class25(class188 arg0) {
        try {
            class328 var2 = arg0.method1572(this, (byte) -68, 5);
            while (var2.field4486 == 0) {
                class449.method3474(20817, 10L);
            }
            if (var2.field4486 == 2) {
                throw new RuntimeException();
            }
            this.field303 = (Thread) var2.field4487;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field304[5] + (arg0 == null ? field304[2] : field304[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method292(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method293(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 101;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
