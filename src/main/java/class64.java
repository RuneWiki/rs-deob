import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class64 implements Runnable {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lqe;")
    private class298 field932 = new class298();

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field940 = 0;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Z")
    private boolean field948 = false;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field937;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
    public static int[] field938 = new int[25];

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lka;")
    public static class279 field945 = null;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lbc;")
    public static class302 field942;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lmh;")
    public static class65 field947;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[[[B")
    public static byte[][][] field939;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILmh;I)[Ltb;", line = 5)
    public static final class199[] method442(int arg0, int arg1, class65 arg2, int arg3) {
        if (arg3 != -29202) {
            method442(-19, 53, (class65) null, -116);
        }
        field934++;
        return class10.method40(arg1, true, arg0, arg2) ? class46.method333(255) : null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZLal;)Luf;", line = 21)
    public final class177 method443(int arg0, boolean arg1, class134 arg2) {
        field951++;
        class177 var4 = new class177();
        var4.field3585 = arg1;
        var4.field41 = (long) arg0;
        var4.field2879 = arg2;
        var4.field2875 = 3;
        this.method448(var4, -18695);
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "run", descriptor = "()V", line = 36)
    public final void run() {
        while (!this.field948) {
            class298 var1 = this.field932;
            class177 var2;
            synchronized (this.field932) {
                var2 = (class177) this.field932.method2059(false);
                if (var2 == null) {
                    try {
                        this.field932.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field940--;
            }
            try {
                if (var2.field2875 == 2) {
                    var2.field2879.method940((int) var2.field41, -18728, var2.field2869, var2.field2869.length);
                } else if (var2.field2875 == 3) {
                    var2.field2869 = var2.field2879.method943(3, (int) var2.field41);
                }
            } catch (Exception var7) {
                class104.method719((String) null, var7, false);
            }
            var2.field3590 = false;
        }
        field943++;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 326)
    public class64() {
        class182 var1 = class138.field2065.method1479(this, 65, 5);
        while (var1.field2948 == 0) {
            class300.method2068(126, 10L);
        }
        if (var1.field2948 == 2) {
            throw new RuntimeException();
        }
        this.field937 = (Thread) var1.field2945;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BLal;I)Luf;", line = 84)
    public final class177 method444(int arg0, byte[] arg1, class134 arg2, int arg3) {
        field941++;
        if (arg3 != -3) {
            field942 = (class302) null;
        }
        class177 var5 = new class177();
        var5.field2875 = 2;
        var5.field2869 = arg1;
        var5.field41 = (long) arg0;
        var5.field3585 = false;
        var5.field2879 = arg2;
        this.method448(var5, -18695);
        return var5;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZI)V", line = 117)
    public static final void method445(int arg0, boolean arg1, int arg2) {
        field944++;
        if (class98.field1432 < 2 && class101.field1445 == 0 && !class128.field1901 || !arg1) {
            return;
        }
        class41 var3;
        if (class101.field1445 == 1 && class98.field1432 < 2) {
            var3 = class187.method1346(new class41[] { class18.field237, class143.field2187, class74.field1096, class75.field1115 }, 0);
        } else if (class128.field1901 && class98.field1432 < 2) {
            var3 = class187.method1346(new class41[] { class94.field1389, class143.field2187, class126.field1871, class75.field1115 }, 0);
        } else {
            var3 = class129.method901(class98.field1432 - 1, 3975);
        }
        if (class98.field1432 > 2) {
            var3 = class187.method1346(new class41[] { var3, class78.field1153, class1.method4(class98.field1432 - 2, (byte) 88), class311.field5240 }, 0);
        }
        int var4 = class140.field2165.method1804(var3, arg0 + 4, arg2 + 15, 16777215, 0, class88.field1293, class117.field1704);
        class67.method492(!arg1, arg2, arg0 + 4, var4 + class140.field2165.method1794(var3), 15);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILbc;)Z", line = 146)
    public static final boolean method446(int arg0, class302 arg1) {
        if (arg0 < 121) {
            field938 = (int[]) null;
        }
        field936++;
        if (arg1.field5029 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field5029.length; var2++) {
            int var3 = class152.method1080(var2, -15400, arg1);
            int var4 = arg1.field4929[var2];
            if (arg1.field5029[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field5029[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field5029[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILal;I)Luf;", line = 209)
    public final class177 method447(int arg0, class134 arg1, int arg2) {
        class177 var4 = new class177();
        field952++;
        var4.field2875 = 1;
        class298 var5 = this.field932;
        synchronized (this.field932) {
            class177 var6 = (class177) this.field932.method2057(77);
            while (true) {
                if (var6 == null) {
                    if (arg0 != -3404) {
                        field939 = (byte[][][]) ((byte[][][]) null);
                    }
                    break;
                }
                if ((long) arg2 == var6.field41 && var6.field2879 == arg1 && var6.field2875 == 2) {
                    var4.field3590 = false;
                    var4.field2869 = var6.field2869;
                    return var4;
                }
                var6 = (class177) this.field932.method2058(false);
            }
        }
        var4.field2869 = arg1.method943(3, arg2);
        var4.field3590 = false;
        var4.field3585 = true;
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Luf;I)V", line = 243)
    private final void method448(class177 arg0, int arg1) {
        if (arg1 != -18695) {
            field938 = (int[]) null;
        }
        class298 var3 = this.field932;
        synchronized (this.field932) {
            this.field932.method2055(arg0, 38);
            this.field940++;
            this.field932.notifyAll();
        }
        field949++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V", line = 273)
    public static final void method449(boolean arg0, byte arg1) {
        field946++;
        if (arg0 == class33.field506) {
            return;
        }
        class33.field506 = arg0;
        class160.method1134((byte) -94);
        if (arg1 <= 69) {
            field938 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 295)
    public final void method450(boolean arg0) {
        this.field948 = true;
        class298 var2 = this.field932;
        synchronized (this.field932) {
            this.field932.notifyAll();
        }
        if (arg0) {
            return;
        }
        field935++;
        try {
            this.field937.join();
        } catch (InterruptedException var5) {
        }
        this.field937 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 314)
    public static void method451(int arg0) {
        field938 = null;
        field942 = null;
        if (arg0 == -3) {
            field945 = null;
            field939 = (byte[][][]) null;
            field947 = null;
        }
    }
}
