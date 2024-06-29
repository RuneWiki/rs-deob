import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class355 implements Runnable {

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Lso;")
    private class330 field4744 = new class330();

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public int field4750 = 0;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Z")
    private boolean field4752 = false;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field4751;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lfo;")
    public static class361 field4743;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLir;)V")
    public static final void method2083(byte arg0, class22 arg1) {
        field4742++;
        class325 var2 = (class325) class193.field2491.method970(12);
        int var3 = -77 / ((-arg0 - 34) / 60);
        while (var2 != null) {
            if (var2.field4312 == arg1) {
                if (var2.field4314 != null) {
                    class465.field6928.method1114(var2.field4314);
                    var2.field4314 = null;
                }
                var2.method2674(true);
                return;
            }
            var2 = (class325) class193.field2491.method976((byte) 102);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public final void method2084(int arg0) {
        field4740++;
        this.field4752 = true;
        if (arg0 != 5) {
            this.field4744 = null;
        }
        class330 var2 = this.field4744;
        synchronized (this.field4744) {
            this.field4744.notifyAll();
        }
        try {
            this.field4751.join();
        } catch (InterruptedException var3) {
        }
        this.field4751 = null;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public static final void method2085(int arg0) {
        if (arg0 >= -16) {
            method2083((byte) 110, null);
        }
        field4746++;
        class136.field1816.method3045(48);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lvs;IZ)Lnu;")
    public final class421 method2086(class420 arg0, int arg1, boolean arg2) {
        field4739++;
        class421 var4 = new class421();
        var4.field6109 = 3;
        var4.field7348 = arg1;
        var4.field6111 = arg0;
        var4.field1863 = arg2;
        this.method2091(var4, (byte) -125);
        return var4;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB[BLvs;)Lnu;")
    public final class421 method2087(int arg0, byte arg1, byte[] arg2, class420 arg3) {
        field4747++;
        class421 var5 = new class421();
        var5.field6117 = arg2;
        if (arg1 != -104) {
            method2090(-97, null, 34);
        }
        var5.field7348 = arg0;
        var5.field1863 = false;
        var5.field6109 = 2;
        var5.field6111 = arg3;
        this.method2091(var5, (byte) -117);
        return var5;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
    public static void method2088(int arg0) {
        field4743 = null;
        if (arg0 != -3) {
            method2088(-5);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILvs;)Lnu;")
    public final class421 method2089(int arg0, int arg1, class420 arg2) {
        field4748++;
        class421 var4 = new class421();
        var4.field6109 = arg1;
        class330 var5 = this.field4744;
        synchronized (this.field4744) {
            class421 var6 = (class421) this.field4744.method1937(false);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field7348 && var6.field6111 == arg2 && var6.field6109 == 2) {
                    var4.field6117 = var6.field6117;
                    var4.field1861 = false;
                    return var4;
                }
                var6 = (class421) this.field4744.method1932(~arg1);
            }
        }
        var4.field6117 = arg2.method2598(10372, arg0);
        var4.field1861 = false;
        var4.field1863 = true;
        return var4;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[Ljk;I)V")
    public static final void method2090(int arg0, class450[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length; var3++) {
            class450 var4 = arg1[var3];
            if (var4 != null && var4.field6550 == arg0 && !client.method1249(var4)) {
                if (var4.field6686 == 0) {
                    method2090(var4.field6558, arg1, 0);
                    if (var4.field6643 != null) {
                        method2090(var4.field6558, var4.field6643, arg2);
                    }
                    class360 var5 = (class360) class152.field1989.method295((long) var4.field6558, -101);
                    if (var5 != null) {
                        class140.method865(var5.field4886, 6);
                    }
                }
                if (var4.field6686 == 6 && var4.field6702 != -1) {
                    class260 var6 = class7.field97.method2951(var4.field6702, arg2 ^ 0xFFFFCA3B);
                    if (var6 != null) {
                        var4.field6590 += class123.field1594;
                        while (var4.field6590 > var6.field3489[var4.field6575]) {
                            var4.field6590 -= var6.field3489[var4.field6575];
                            var4.field6575++;
                            if (var4.field6575 >= var6.field3474.length) {
                                var4.field6575 -= var6.field3482;
                                if (var4.field6575 < 0 || var4.field6575 >= var6.field3474.length) {
                                    var4.field6575 = 0;
                                }
                            }
                            var4.field6577 = var4.field6575 + 1;
                            if (var6.field3474.length <= var4.field6577) {
                                var4.field6577 -= var6.field3482;
                                if (var4.field6577 < 0 || var4.field6577 >= var6.field3474.length) {
                                    var4.field6577 = -1;
                                }
                            }
                            class413.method2521(var4, false);
                        }
                    }
                }
            }
        }
        field4745++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lnu;B)V")
    private final void method2091(class421 arg0, byte arg1) {
        class330 var3 = this.field4744;
        synchronized (this.field4744) {
            this.field4744.method1938(true, arg0);
            this.field4750++;
            this.field4744.notifyAll();
            int var4 = 25 / ((-arg1 - 38) / 47);
        }
        field4738++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static final void method2092(byte arg0) {
        class5.method30(0);
        int var1 = -69 / ((arg0 - 53) / 63);
        field4749++;
        class466.method2847(false);
    }

    @OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
    public final void run() {
        field4741++;
        while (!this.field4752) {
            class330 var1 = this.field4744;
            class421 var2;
            synchronized (this.field4744) {
                var2 = (class421) this.field4744.method1934((byte) 83);
                if (var2 == null) {
                    try {
                        this.field4744.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4750--;
            }
            try {
                if (var2.field6109 == 2) {
                    var2.field6111.method2595((int) var2.field7348, var2.field6117, var2.field6117.length, 82);
                } else if (var2.field6109 == 3) {
                    var2.field6117 = var2.field6111.method2598(10372, (int) var2.field7348);
                }
            } catch (Exception var6) {
                client.method1256(var6, -2020, null);
            }
            var2.field1861 = false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lfq;)V")
    public class355(class137 arg0) {
        class236 var2 = arg0.method838(this, 5, (byte) -106);
        while (var2.field3149 == 0) {
            class316.method1873(10L, false);
        }
        if (var2.field3149 == 2) {
            throw new RuntimeException();
        }
        this.field4751 = (Thread) var2.field3151;
    }
}
