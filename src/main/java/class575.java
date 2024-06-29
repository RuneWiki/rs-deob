import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class575 implements Runnable {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lhs;")
    private class126 field8348 = new class329();

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Lhs;")
    private class126 field8370 = null;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lvg;")
    public static class622 field8351 = new class622(60, -1);

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    private int field8365;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    private int field8366;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "J")
    private long field8367;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "J")
    private long field8371;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Lpaa;")
    private class580 field8369;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Ljava/lang/String;")
    private String field8368;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Z")
    private volatile boolean field8349;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Z")
    private boolean field8363;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I", line = 5)
    public final int method3306(int arg0) {
        field8352++;
        if (this.field8369 == null) {
            return 0;
        }
        int var2 = this.field8369.method3331((byte) -127);
        if (this.field8369.field8425 && this.field8365 < this.field8369.field8417) {
            return this.field8365 + 1;
        } else if (arg0 != 46) {
            return -103;
        } else if (var2 >= 0 && var2 < (class80.field1292.length - 1)) {
            return this.field8369.field8422 == this.field8365 ? this.field8369.field8417 : this.field8369.field8422;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(JLjava/lang/String;Lpaa;II)V", line = 34)
    public final synchronized void method3307(long arg0, String arg1, class580 arg2, int arg3, int arg4) {
        int var7 = 16 % ((-arg3 - 17) / 37);
        this.field8367 = arg0;
        this.field8369 = arg2;
        this.field8365 = arg4;
        this.field8368 = arg1;
        field8354++;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)J", line = 47)
    public final long method3308(int arg0) {
        field8357++;
        if (arg0 != -1) {
            this.method3306(-109);
        }
        return this.field8367;
    }

    @OriginalMember(owner = "client!pd", name = "run", descriptor = "()V", line = 58)
    public final void run() {
        while (!this.field8349) {
            long var1 = class60.method371(false);
            synchronized (this) {
                try {
                    if (this.field8348 instanceof class329) {
                        this.field8348.method901(this.field8363, true);
                    } else {
                        this.field8366++;
                        long var4 = class60.method371(false);
                        if (class332.field4821 == null || this.field8370 == null || this.field8370.method903(32342) == 0 || this.field8371 < var4 - ((long) this.field8370.method903(32342))) {
                            if (this.field8370 != null) {
                                this.field8363 = true;
                                this.field8370.method905(true);
                                this.field8370 = null;
                            }
                            if (this.field8363) {
                                class549.method3204(false);
                                if (class332.field4821 != null) {
                                    class332.field4821.method646(0);
                                }
                            }
                            this.field8348.method901(this.field8363 || class332.field4821 != null && class332.field4821.method663(), true);
                        } else {
                            int var6 = (int) ((var4 - this.field8371) * 255L / (long) this.field8370.method903(32342));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            class549.method3204(false);
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class332.field4821.method646(0);
                            class256 var10 = class332.field4821.method631(class454.field6538, class425.field6218, true);
                            class332.field4821.method712(var10, (byte) -65);
                            this.field8370.method901(true, true);
                            class332.field4821.method662();
                            var10.method49(0, 0, 0, var8, 1);
                            class332.field4821.method712(var10, (byte) -65);
                            class332.field4821.method646(0);
                            this.field8348.method901(true, true);
                            class332.field4821.method662();
                            var10.method49(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class332.field4821 != null && !(this.field8348 instanceof class329)) {
                                class332.field4821.method655();
                            }
                        } catch (class232 var17) {
                            class118.method869(var17, (byte) -128, var17.getMessage() + " (Recovered) " + class420.field6187.method567(-94));
                            class409.method2509(512, 0);
                        }
                    }
                    this.field8363 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class60.method371(false);
            int var14 = (int) (var1 + 20L - var12);
            if (var14 > 0) {
                class687.method3846((long) var14, 77);
            }
        }
        field8358++;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)I", line = 152)
    public final int method3309(int arg0) {
        field8360++;
        if (arg0 != 255) {
            this.method3306(-100);
        }
        return this.field8366;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Ljava/lang/String;", line = 164)
    public final String method3310(byte arg0) {
        if (arg0 > -64) {
            return null;
        } else {
            field8355++;
            return this.field8368;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V", line = 175)
    public final synchronized void method3311(boolean arg0) {
        field8362++;
        this.field8363 = true;
        if (arg0) {
            this.method3312(false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)I", line = 186)
    public final int method3312(boolean arg0) {
        field8350++;
        return arg0 ? this.field8365 : -6;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILps;)V", line = 197)
    public static final void method3313(int arg0, int arg1, int arg2, class5 arg3) {
        if (class240.field3164) {
            class278 var4 = class2.field21 == -1 ? null : class141.field2041.method1503(true, class2.field21);
            if (client.method564(arg3).method453((byte) 2) && (class282.field3771 & 0x20) != 0 && (var4 == null || arg3.method28(class2.field21, -24, var4.field3615) != var4.field3615)) {
                class153.field2172++;
                class621.method3581(class697.field9824, arg3.field65, 46, 0L, arg3.field53, (byte) 127, class372.field5508 + " -> " + arg3.field119, false, arg3.field59, class142.field2061, true);
            }
        }
        field8353++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class566.method3262(arg3, (byte) 92, var5);
            if (var9 != null) {
                class215.field2884++;
                class621.method3581(var9, arg3.field65, 1008, (long) (var5 + 1), arg3.field53, (byte) 127, arg3.field119, false, arg3.field59, class281.method1666(var5, -132, arg3), true);
            }
        }
        String var6 = class234.method1443(125, arg3);
        if (var6 != null) {
            class311.field4587++;
            class621.method3581(var6, arg3.field65, 2, 0L, arg3.field53, (byte) 127, arg3.field119, false, arg3.field59, arg3.field81, true);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class566.method3262(arg3, (byte) 92, var7);
            if (var8 != null) {
                class621.method3581(var8, arg3.field65, 15, (long) (var7 + 1), arg3.field53, (byte) 127, arg3.field119, false, arg3.field59, class281.method1666(var7, -132, arg3), true);
                class215.field2884++;
            }
        }
        if (client.method564(arg3).method451(0)) {
            class537.field7889++;
            if (arg3.field35 == null) {
                class621.method3581(class279.field3634.method1654(-89, class262.field3401), arg3.field65, 23, 0L, arg3.field53, (byte) 127, "", false, arg3.field59, -1, true);
            } else {
                class621.method3581(arg3.field35, arg3.field65, 23, 0L, arg3.field53, (byte) 127, "", false, arg3.field59, -1, true);
            }
        }
        if (arg0 >= -7) {
            field8351 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)V", line = 274)
    public static void method3314(boolean arg0) {
        field8351 = null;
        if (arg0) {
            method3314(false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 288)
    public final void method3315(int arg0) {
        int var2 = 122 % ((arg0 + 42) / 47);
        this.field8349 = true;
        field8361++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lhs;I)V", line = 298)
    public final synchronized void method3316(class126 arg0, int arg1) {
        if (arg1 >= -25) {
            this.method3307(-40L, null, null, 123, 6);
        }
        this.field8370 = this.field8348;
        field8359++;
        this.field8348 = arg0;
        this.field8371 = class60.method371(false);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)Z", line = 313)
    public final synchronized boolean method3317(byte arg0) {
        field8364++;
        if (arg0 <= 5) {
            this.field8369 = null;
        }
        return this.field8348.method904(true, this.field8371);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)Lpaa;", line = 324)
    public final class580 method3318(byte arg0) {
        if (arg0 >= -98) {
            this.method3307(10L, null, null, -107, 117);
        }
        field8356++;
        return this.field8369;
    }
}
