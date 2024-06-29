import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class196 implements Runnable {

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lwd;")
    private class65 field3601 = new class65();

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Z")
    private boolean field3604 = false;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public int field3606 = 0;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field3605;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field3592 = 0;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Lni;")
    public static class20 field3596;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[Z")
    public static boolean[] field3590;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILn;[BI)Lkj;")
    public final class149 method1401(int arg0, class242 arg1, byte[] arg2, int arg3) {
        field3593++;
        class149 var5 = new class149();
        var5.field4706 = false;
        var5.field2825 = arg2;
        var5.field2823 = 2;
        var5.field3318 = (long) arg0;
        var5.field2826 = arg1;
        this.method1406(var5, arg3 - 107);
        if (arg3 != 1) {
            field3590 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)V")
    public static final void method1402(int arg0, byte arg1) {
        field3594++;
        class240.field4277.method85((byte) 75, arg0);
        class81.field1407.method85((byte) 75, arg0);
        int var2 = -109 / ((arg1 - 45) / 39);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method1403(byte arg0) {
        if (arg0 == -123) {
            field3596 = null;
            field3590 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ln;IB)Lkj;")
    public final class149 method1404(class242 arg0, int arg1, byte arg2) {
        int var4 = 84 / ((69 - arg2) / 47);
        field3599++;
        class149 var5 = new class149();
        var5.field3318 = (long) arg1;
        var5.field2823 = 3;
        var5.field4706 = false;
        var5.field2826 = arg0;
        this.method1406(var5, -120);
        return var5;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static final void method1405(int arg0) {
        if (arg0 > -18) {
            method1403((byte) -80);
        }
        class5.field128.method86(0);
        field3598++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lkj;I)V")
    private final void method1406(class149 arg0, int arg1) {
        field3591++;
        if (arg1 > -35) {
            this.field3606 = 62;
        }
        class65 var3 = this.field3601;
        synchronized (this.field3601) {
            this.field3601.method436((byte) -86, arg0);
            this.field3606++;
            this.field3601.notifyAll();
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
    public final void method1407(byte arg0) {
        field3595++;
        this.field3604 = true;
        class65 var2 = this.field3601;
        synchronized (this.field3601) {
            this.field3601.notifyAll();
        }
        try {
            if (arg0 != -109) {
                this.method1401(77, (class242) null, (byte[]) null, -63);
            }
            this.field3605.join();
        } catch (InterruptedException var3) {
        }
        this.field3605 = null;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static final void method1408(int arg0) {
        int var1 = class142.field2669.method581(8, 7);
        field3603++;
        if (var1 < class17.field281) {
            for (int var2 = var1; var2 < class17.field281; var2++) {
                class158.field3003[class280.field4961++] = class174.field3187[var2];
            }
        }
        if (class17.field281 < var1) {
            throw new RuntimeException("gppov1");
        }
        class17.field281 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class174.field3187[var3];
            class188 var5 = class93.field1774[var4];
            int var6 = class142.field2669.method581(1, 7);
            if (var6 == 0) {
                class174.field3187[class17.field281++] = var4;
                var5.field2710 = class211.field3851;
            } else {
                int var7 = class142.field2669.method581(2, 7);
                if (var7 == 0) {
                    class174.field3187[class17.field281++] = var4;
                    var5.field2710 = class211.field3851;
                    class80.field1404[class148.field2789++] = var4;
                } else if (var7 == 1) {
                    class174.field3187[class17.field281++] = var4;
                    var5.field2710 = class211.field3851;
                    int var8 = class142.field2669.method581(3, 7);
                    var5.method1021(var8, false, 1);
                    int var9 = class142.field2669.method581(1, 7);
                    if (var9 == 1) {
                        class80.field1404[class148.field2789++] = var4;
                    }
                } else if (var7 == 2) {
                    class174.field3187[class17.field281++] = var4;
                    var5.field2710 = class211.field3851;
                    int var10 = class142.field2669.method581(3, 7);
                    var5.method1021(var10, true, 1);
                    int var11 = class142.field2669.method581(3, 7);
                    var5.method1021(var11, true, 1);
                    int var12 = class142.field2669.method581(1, 7);
                    if (var12 == 1) {
                        class80.field1404[class148.field2789++] = var4;
                    }
                } else if (var7 == 3) {
                    class158.field3003[class280.field4961++] = var4;
                }
            }
        }
        if (arg0 >= -34) {
            method1408(-50);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZILn;)Lkj;")
    public final class149 method1409(boolean arg0, int arg1, class242 arg2) {
        class149 var4 = new class149();
        var4.field2823 = 1;
        field3597++;
        class65 var5 = this.field3601;
        synchronized (this.field3601) {
            class149 var6 = (class149) this.field3601.method437(10);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field3318 && var6.field2826 == arg2 && var6.field2823 == 2) {
                    var4.field2825 = var6.field2825;
                    var4.field4709 = false;
                    return var4;
                }
                var6 = (class149) this.field3601.method439(5439);
            }
        }
        var4.field2825 = arg2.method1638(arg1, (byte) -97);
        var4.field4706 = true;
        if (!arg0) {
            method1403((byte) 28);
        }
        var4.field4709 = false;
        return var4;
    }

    @OriginalMember(owner = "client!gj", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field3604) {
            class65 var1 = this.field3601;
            class149 var2;
            synchronized (this.field3601) {
                var2 = (class149) this.field3601.method441((byte) -15);
                if (var2 == null) {
                    try {
                        this.field3601.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field3606--;
            }
            try {
                if (var2.field2823 == 2) {
                    var2.field2826.method1639((int) var2.field3318, var2.field2825.length, 6, var2.field2825);
                } else if (var2.field2823 == 3) {
                    var2.field2825 = var2.field2826.method1638((int) var2.field3318, (byte) -123);
                }
            } catch (Exception var7) {
                class3.method33((String) null, var7, (byte) 120);
            }
            var2.field4709 = false;
        }
        field3602++;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class196() {
        class29 var1 = class124.field2238.method1152(this, (byte) -47, 5);
        while (var1.field487 == 0) {
            class212.method1488(10L, -113);
        }
        if (var1.field487 == 2) {
            throw new RuntimeException();
        }
        this.field3605 = (Thread) var1.field486;
    }
}
