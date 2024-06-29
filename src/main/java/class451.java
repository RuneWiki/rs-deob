import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class451 implements Runnable {

    @OriginalMember(owner = "client!np", name = "l", descriptor = "Lpw;")
    private class649 field6301 = new class649();

    @OriginalMember(owner = "client!np", name = "m", descriptor = "Z")
    private boolean field6302 = false;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public int field6304 = 0;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field6303;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "Z")
    public static boolean field6291 = false;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Z")
    public static boolean field6295 = false;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "J")
    public static long field6293 = 0L;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "[Lgm;")
    public static class109[] field6299 = new class109[75];

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field6300;

    // $FF: synthetic field
    @OriginalMember(owner = "client!np", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field6305;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public final void method2584(int arg0) {
        field6290++;
        this.field6302 = true;
        class649 var2 = this.field6301;
        synchronized (this.field6301) {
            if (arg0 != -3) {
                this.method2584(-29);
            }
            this.field6301.notifyAll();
        }
        try {
            this.field6303.join();
        } catch (InterruptedException var3) {
        }
        this.field6303 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILfo;[BI)Lifa;")
    public final class390 method2585(int arg0, class476 arg1, byte[] arg2, int arg3) {
        field6297++;
        class390 var5 = new class390();
        var5.field9188 = false;
        var5.field5467 = 2;
        var5.field9371 = arg0;
        var5.field5468 = arg1;
        var5.field5469 = arg2;
        if (arg3 >= -125) {
            return null;
        } else {
            this.method2589(3, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
    public static final void method2586(byte arg0) {
        field6296++;
        if (arg0 != -41) {
            method2587((byte) -72);
        }
        for (class296 var1 = (class296) class19.field278.method1270((byte) -25); var1 != null; var1 = (class296) class19.field278.method1282(0)) {
            if (class658.field9266 == null) {
                var1.method2971(arg0 ^ 0xFFFFFFD6);
            } else if (var1.field4436 <= class239.field3440) {
                int var14 = class469.field6565[var1.field4424];
                if (var14 == 0) {
                    class86 var15 = class171.method1170(var1.field4432, var1.field4433, var1.field4423);
                    if (var15 instanceof class563) {
                        class533.method2944(var1.field4432, var1.field4433, var1.field4423);
                        class563 var16 = (class563) var15;
                        if (var16.field7606 != null) {
                            class346.method2065(var1.field4432, var1.field4433, var1.field4423, var16.field7606, null);
                        }
                    }
                } else if (var14 == 1) {
                    class404 var17 = class493.method2759(var1.field4432, var1.field4433, var1.field4423);
                    if (var17 instanceof class411) {
                        class381.method2205(var1.field4432, var1.field4433, var1.field4423);
                        class411 var18 = (class411) var17;
                        if (var18.field5817 != null) {
                            class520.method2883(var1.field4432, var1.field4433, var1.field4423, var18.field5817, null);
                        }
                    }
                } else if (var14 == 2) {
                    class39 var19 = class410.method2344(var1.field4432, var1.field4433, var1.field4423, field6305 == null ? (field6305 = method2591("uq")) : field6305);
                    if (var19 instanceof class68) {
                        class385.method2213(var1.field4432, var1.field4433, var1.field4423, field6305 == null ? (field6305 = method2591("uq")) : field6305);
                        class68 var20 = (class68) var19;
                        if (var20.field937 != null) {
                            class580.method3224(var20.field937, false);
                        }
                    }
                } else if (var14 == 3) {
                    class348 var21 = class237.method1497(var1.field4432, var1.field4433, var1.field4423);
                    if (var21 instanceof class72) {
                        class316.method1937(var1.field4432, var1.field4433, var1.field4423);
                        class72 var22 = (class72) var21;
                        if (var22.field996 != null) {
                            class57.method499(var1.field4432, var1.field4433, var1.field4423, var22.field996);
                        }
                    }
                }
                var1.method2971(1);
            } else if (class239.field3440 == var1.field4425) {
                int var2 = class469.field6565[var1.field4424];
                if (var2 == 0) {
                    class86 var12 = class171.method1170(var1.field4432, var1.field4433, var1.field4423);
                    if (var12 instanceof class563) {
                        var1.method2971(1);
                    } else if (class108.method815(var1.field4432, var1.field4433, var1.field4423) == null) {
                        class563 var13 = new class563(var1.field4424, var1.field4417, var1.field4428, var1.field4434, var1.field4430, var12);
                        class346.method2065(var1.field4432, var1.field4433, var1.field4423, var13, null);
                    } else {
                        var1.method2971(1);
                    }
                } else if (var2 == 1) {
                    class404 var3 = class493.method2759(var1.field4432, var1.field4433, var1.field4423);
                    if (var3 instanceof class411) {
                        var1.method2971(1);
                    } else if (class313.method1921(var1.field4432, var1.field4433, var1.field4423) == null) {
                        class411 var4 = new class411(var1.field4424, var1.field4417, var1.field4428, var1.field4434, var1.field4430, var3);
                        class520.method2883(var1.field4432, var1.field4433, var1.field4423, var4, null);
                    } else {
                        var1.method2971(1);
                    }
                } else if (var2 == 2) {
                    class39 var7 = class410.method2344(var1.field4432, var1.field4433, var1.field4423, field6305 == null ? (field6305 = method2591("uq")) : field6305);
                    if (var7 instanceof class68) {
                        var1.method2971(1);
                    } else {
                        class385.method2213(var1.field4432, var1.field4433, var1.field4423, field6305 == null ? (field6305 = method2591("uq")) : field6305);
                        class620 var8 = class164.field2499.method2013(var1.field4429, false);
                        int var9;
                        int var10;
                        if (var1.field4417 == 1 || var1.field4417 == 3) {
                            var9 = var8.field8566;
                            var10 = var8.field8582;
                        } else {
                            var9 = var8.field8582;
                            var10 = var8.field8566;
                        }
                        class68 var11 = new class68(var1.field4424, var1.field4417, var1.field4432, var1.field4428, var1.field4434, var1.field4430, var1.field4433, var1.field4433 + var9 - 1, var1.field4423, var1.field4423 - (1 - var10), var7);
                        class580.method3224(var11, false);
                    }
                } else if (var2 == 3) {
                    class348 var5 = class237.method1497(var1.field4432, var1.field4433, var1.field4423);
                    if (var5 instanceof class72) {
                        var1.method2971(arg0 + 42);
                    } else {
                        class72 var6 = new class72(var1.field4428, var1.field4434, var1.field4430, var5);
                        class57.method499(var1.field4432, var1.field4433, var1.field4423, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
    public static void method2587(byte arg0) {
        if (arg0 <= 8) {
            field6295 = true;
        }
        field6299 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IBLfo;)Lifa;")
    public final class390 method2588(int arg0, byte arg1, class476 arg2) {
        field6294++;
        class390 var4 = new class390();
        var4.field9188 = false;
        var4.field5468 = arg2;
        var4.field5467 = 3;
        var4.field9371 = arg0;
        this.method2589(3, var4);
        if (arg1 != 3) {
            this.field6301 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILifa;)V")
    private final void method2589(int arg0, class390 arg1) {
        field6298++;
        class649 var3 = this.field6301;
        synchronized (this.field6301) {
            if (arg0 == 3) {
                this.field6301.method3615(-31531, arg1);
                this.field6304++;
                this.field6301.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lfo;IB)Lifa;")
    public final class390 method2590(class476 arg0, int arg1, byte arg2) {
        field6300++;
        class390 var4 = new class390();
        var4.field5467 = 1;
        class649 var5 = this.field6301;
        synchronized (this.field6301) {
            int var6 = -122 / ((15 - arg2) / 56);
            class390 var7 = (class390) this.field6301.method3611(255);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if (((long) arg1) == var7.field9371 && var7.field5468 == arg0 && var7.field5467 == 2) {
                    var4.field9187 = false;
                    var4.field5469 = var7.field5469;
                    return var4;
                }
                var7 = (class390) this.field6301.method3610(-30295);
            }
        }
        var4.field5469 = arg0.method2708(-127, arg1);
        var4.field9187 = false;
        var4.field9188 = true;
        return var4;
    }

    @OriginalMember(owner = "client!np", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field6302) {
            class649 var1 = this.field6301;
            class390 var2;
            synchronized (this.field6301) {
                var2 = (class390) this.field6301.method3613(-118);
                if (var2 == null) {
                    try {
                        this.field6301.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field6304--;
            }
            try {
                if (var2.field5467 == 2) {
                    var2.field5468.method2706(var2.field5469, var2.field5469.length, (byte) 86, (int) var2.field9371);
                } else if (var2.field5467 == 3) {
                    var2.field5469 = var2.field5468.method2708(-127, (int) var2.field9371);
                }
            } catch (Exception var7) {
                class139.method985((byte) -115, null, var7);
            }
            var2.field9187 = false;
        }
        field6292++;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Ltt;)V")
    public class451(class79 arg0) {
        class260 var2 = arg0.method625(5, this, (byte) -94);
        while (var2.field3702 == 0) {
            class419.method2390(126, 10L);
        }
        if (var2.field3702 == 2) {
            throw new RuntimeException();
        }
        this.field6303 = (Thread) var2.field3706;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2591(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
