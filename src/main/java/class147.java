import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Lmg;")
    private class151 field2491 = new class151();

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Z")
    private boolean field2493 = false;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public int field2501 = 0;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field2498;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Lok;")
    public static class146 field2499 = class235.method1724(-12908, "T");

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field2502 = 0;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Lok;")
    public static class146 field2503 = class235.method1724(-12908, "hint_mapmarkers");

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Lok;")
    public static class146 field2500;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Loh;")
    public static class15 field2504;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 6)
    public final void method1130(int arg0) {
        field2492++;
        this.field2493 = true;
        class151 var2 = this.field2491;
        synchronized (this.field2491) {
            if (arg0 > -97) {
                return;
            }
            this.field2491.notifyAll();
        }
        try {
            this.field2498.join();
        } catch (InterruptedException var5) {
        }
        this.field2498 = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 314)
    public class147() {
        class256 var1 = class232.field3876.method920(this, 5, 0);
        while (var1.field4265 == 0) {
            class281.method2041((byte) 114, 10L);
        }
        if (var1.field4265 == 2) {
            throw new RuntimeException();
        }
        this.field2498 = (Thread) var1.field4269;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Loe;I)V", line = 31)
    private final void method1131(class123 arg0, int arg1) {
        if (arg1 <= 34) {
            return;
        }
        field2505++;
        class151 var3 = this.field2491;
        synchronized (this.field2491) {
            this.field2491.method1195((byte) -93, arg0);
            this.field2501++;
            this.field2491.notifyAll();
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 47)
    public static void method1132(byte arg0) {
        field2504 = null;
        field2503 = null;
        field2499 = null;
        field2500 = null;
        int var1 = -62 / ((arg0 - 28) / 45);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lmd;II)Loe;", line = 59)
    public final class123 method1133(class245 arg0, int arg1, int arg2) {
        field2497++;
        class123 var4 = new class123();
        var4.field2018 = 1;
        class151 var5 = this.field2491;
        synchronized (this.field2491) {
            if (arg2 != 5) {
                return (class123) null;
            }
            class123 var6 = (class123) this.field2491.method1197(17181);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field3874 && var6.field2011 == arg0 && var6.field2018 == 2) {
                    var4.field1856 = false;
                    var4.field2006 = var6.field2006;
                    return var4;
                }
                var6 = (class123) this.field2491.method1198((byte) -127);
            }
        }
        var4.field2006 = arg0.method1777((byte) -74, arg1);
        var4.field1856 = false;
        var4.field1849 = true;
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLr;III)V", line = 95)
    public static final void method1134(boolean arg0, class264 arg1, int arg2, int arg3, int arg4) {
        field2489++;
        if (arg2 != -6) {
            field2500 = (class146) null;
        }
        int var5 = arg1.field4393;
        int var6 = arg1.field4381;
        if (arg1.field4463 == 0) {
            arg1.field4381 = arg1.field4523;
        } else if (arg1.field4463 == 1) {
            arg1.field4381 = arg3 - arg1.field4523;
        } else if (arg1.field4463 == 2) {
            arg1.field4381 = arg1.field4523 * arg3 >> 14;
        } else if (arg1.field4463 == 3) {
            if (arg1.field4536 == 2) {
                arg1.field4381 = (arg1.field4523 - 1) * arg1.field4399 + arg1.field4523 * 32;
            } else if (arg1.field4536 == 7) {
                arg1.field4381 = (arg1.field4523 - 1) * arg1.field4399 + arg1.field4523 * 12;
            }
        }
        if (arg1.field4496 == 0) {
            arg1.field4393 = arg1.field4445;
        } else if (arg1.field4496 == 1) {
            arg1.field4393 = arg4 - arg1.field4445;
        } else if (arg1.field4496 == 2) {
            arg1.field4393 = arg1.field4445 * arg4 >> 14;
        } else if (arg1.field4496 == 3) {
            if (arg1.field4536 == 2) {
                arg1.field4393 = (arg1.field4445 - 1) * arg1.field4436 + arg1.field4445 * 32;
            } else if (arg1.field4536 == 7) {
                arg1.field4393 = (arg1.field4445 - 1) * arg1.field4436 + arg1.field4445 * 115;
            }
        }
        if (arg1.field4496 == 4) {
            arg1.field4393 = arg1.field4400 * arg1.field4381 / arg1.field4549;
        }
        if (arg1.field4463 == 4) {
            arg1.field4381 = arg1.field4549 * arg1.field4393 / arg1.field4400;
        }
        if (class128.field2096 && (client.method1789(arg1) != 0 || arg1.field4536 == 0)) {
            if (arg1.field4381 < 5 && arg1.field4393 < 5) {
                arg1.field4393 = 5;
                arg1.field4381 = 5;
            } else {
                if (arg1.field4381 <= 0) {
                    arg1.field4381 = 5;
                }
                if (arg1.field4393 <= 0) {
                    arg1.field4393 = 5;
                }
            }
        }
        if (arg1.field4470 == 1337) {
            class207.field3452 = arg1;
        }
        if (arg0 && arg1.field4412 != null && (arg1.field4393 != var5 || arg1.field4381 != var6)) {
            class124 var7 = new class124();
            var7.field2031 = arg1.field4412;
            var7.field2039 = arg1;
            class158.field2667.method1258(0, var7);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBLmd;)Loe;", line = 202)
    public final class123 method1135(int arg0, byte arg1, class245 arg2) {
        field2506++;
        class123 var4 = new class123();
        var4.field2011 = arg2;
        var4.field3874 = (long) arg0;
        var4.field1849 = false;
        if (arg1 >= -11) {
            method1137((byte) -43, -25);
        }
        var4.field2018 = 3;
        this.method1131(var4, 46);
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BIILmd;)Loe;", line = 222)
    public final class123 method1136(byte[] arg0, int arg1, int arg2, class245 arg3) {
        field2495++;
        if (arg2 != -4133) {
            method1132((byte) -48);
        }
        class123 var5 = new class123();
        var5.field3874 = (long) arg1;
        var5.field2006 = arg0;
        var5.field2018 = 2;
        var5.field1849 = false;
        var5.field2011 = arg3;
        this.method1131(var5, 105);
        return var5;
    }

    @OriginalMember(owner = "client!di", name = "run", descriptor = "()V", line = 253)
    public final void run() {
        while (!this.field2493) {
            class151 var1 = this.field2491;
            class123 var2;
            synchronized (this.field2491) {
                var2 = (class123) this.field2491.method1194(false);
                if (var2 == null) {
                    try {
                        this.field2491.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2501--;
            }
            try {
                if (var2.field2018 == 2) {
                    var2.field2011.method1776((int) var2.field3874, var2.field2006, var2.field2006.length, -1);
                } else if (var2.field2018 == 3) {
                    var2.field2006 = var2.field2011.method1777((byte) -46, (int) var2.field3874);
                }
            } catch (Exception var7) {
                class245.method1771(var7, (String) null, 0);
            }
            var2.field1856 = false;
        }
        field2496++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)V", line = 337)
    public static final void method1137(byte arg0, int arg1) {
        if (arg0 > -36) {
            method1132((byte) 10);
        }
        if (class107.field1732 == arg1 && arg1 != 0) {
            class188 var2 = class200.field3348[arg1];
            var2.method512(class295.field5000);
        }
        field2494++;
    }
}
