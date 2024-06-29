import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class376 {

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lvs;")
    private class470 field5491 = new class470();

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Ljava/lang/String;")
    public String field5488;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5501 = new String[] { method2984(method2983(" QBh\u0019")), method2984(method2983(" QBl\u0019")), method2984(method2983(" QBk\u0019")), method2984(method2983(" QBn\u0019")), method2984(method2983(" QBb\u0019")), method2984(method2983("/M\u0000F")), method2984(method2983(" QBm\u0019")), method2984(method2983(":\u0016B\u0004L")), method2984(method2983(" QBi\u0019")), method2984(method2983(" QB`\u0019")), method2984(method2983(" QB\u0016X/Q\u0018\u0014\u0019")), method2984(method2983(" QBc\u0019")) };

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    private volatile int field5498;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Lf;")
    private class19 field5497;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[Llt;")
    public static class182[] field5495;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public static final int method2973(int arg0, int arg1) {
        try {
            field5499++;
            int var2 = 40 % ((14 - arg0) / 37);
            return arg1 >>> 7;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5501[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Z")
    public final boolean method2974(int arg0) {
        try {
            if (arg0 < 121) {
                this.field5498 = -32;
            }
            field5487++;
            return this.field5498 == 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5501[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Lvk;")
    public final class651 method2975(int arg0) {
        try {
            field5489++;
            Object var2 = null;
            class470 var3 = this.field5491;
            synchronized (this.field5491) {
                if (arg0 != -1) {
                    this.field5497 = null;
                }
                class651 var4 = this.field5491.method3617(false);
                var4.method4736(0);
                this.field5498--;
                return var4;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5501[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lf;B)V")
    public final void method2976(class19 arg0, byte arg1) {
        try {
            int var3 = 104 % ((-arg1 - 3) / 51);
            field5490++;
            this.field5497 = arg0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5501[9] + (arg0 == null ? field5501[5] : field5501[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method2977(byte arg0) {
        try {
            field5495 = null;
            if (arg0 != -24) {
                field5500 = 79;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5501[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lrfa;B)V")
    public final void method2978(class202 arg0, byte arg1) {
        try {
            field5493++;
            arg0.field2976 = true;
            int var3 = -47 % ((arg1 - 34) / 58);
            class470 var4 = this.field5491;
            synchronized (this.field5491) {
                this.field5491.method3618(arg0, 106);
                this.field5498++;
            }
            if (this.field5497 != null) {
                class19 var5 = this.field5497;
                synchronized (this.field5497) {
                    this.field5497.notify();
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5501[11] + (arg0 == null ? field5501[5] : field5501[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILs;)V")
    public static final void method2979(int arg0, class751 arg1) {
        class107.field1413[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILrfa;)V")
    public final void method2980(int arg0, class202 arg1) {
        try {
            field5496++;
            arg1.field2976 = false;
            class470 var3 = this.field5491;
            synchronized (this.field5491) {
                int var4 = 51 % ((1 - arg0) / 35);
                this.field5491.method3618(arg1, 126);
                this.field5498++;
            }
            if (this.field5497 != null) {
                class19 var5 = this.field5497;
                synchronized (this.field5497) {
                    this.field5497.notify();
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5501[8] + arg0 + ',' + (arg1 == null ? field5501[5] : field5501[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjia;)V")
    public final void method2981(byte arg0, class257 arg1) {
        try {
            int var3 = -6 / ((arg0 + 10) / 60);
            class470 var4 = this.field5491;
            synchronized (this.field5491) {
                this.field5491.method3618(arg1, 74);
                this.field5498++;
            }
            field5492++;
            if (this.field5497 != null) {
                class19 var5 = this.field5497;
                synchronized (this.field5497) {
                    this.field5497.notify();
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5501[6] + arg0 + ',' + (arg1 == null ? field5501[5] : field5501[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
    public static final void method2982(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field5486++;
            if (arg4 == 9532) {
                for (int var5 = 0; var5 < class153.field1962; var5++) {
                    Rectangle var6 = class353.field5107[var5];
                    if (var6.x + var6.width > arg2 && var6.x < arg1 + arg2 && (var6.y + var6.height) > arg3 && var6.y < (arg0 + arg3)) {
                        class752.field10742[var5] = true;
                    }
                }
                class232.method1925(arg3, arg2, arg0 + arg3, arg2 - -arg1, (byte) -106);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5501[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class376(String arg0) {
        try {
            this.field5488 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5501[10] + (arg0 == null ? field5501[5] : field5501[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2983(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2984(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
