import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 implements Runnable {

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Lng;")
    private class79 field691 = new class79();

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public int field693 = 0;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Z")
    private boolean field696 = false;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field695;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field686 = 0;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lnf;")
    public static class162 field683 = new class162(50);

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Z")
    public static boolean field697 = false;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lel;")
    public static class213 field692;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBLkb;)Lfb;")
    public final class30 method357(int arg0, byte arg1, class54 arg2) {
        class30 var4 = new class30();
        field688++;
        var4.field499 = 1;
        class79 var5 = this.field691;
        synchronized (this.field691) {
            class30 var6 = (class30) this.field691.method620((byte) 127);
            while (true) {
                if (var6 == null) {
                    if (arg1 != -111) {
                        this.field696 = true;
                    }
                    break;
                }
                if (((long) arg0) == var6.field3237 && var6.field506 == arg2 && var6.field499 == 2) {
                    var4.field1264 = false;
                    var4.field503 = var6.field503;
                    return var4;
                }
                var6 = (class30) this.field691.method626((byte) 116);
            }
        }
        var4.field503 = arg2.method458(arg1 ^ 0xFFFFFF96, arg0);
        var4.field1266 = true;
        var4.field1264 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Lnl;")
    public static final class98 method358(int arg0, byte arg1) {
        if (arg1 == 124) {
            field685++;
            return class179.field2759 && arg0 >= class193.field3026 && arg0 <= class85.field1265 ? class211.field3251[arg0 - class193.field3026] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public final void method359(int arg0) {
        this.field696 = true;
        field682++;
        class79 var2 = this.field691;
        synchronized (this.field691) {
            if (arg0 != -3) {
                field683 = null;
            }
            this.field691.notifyAll();
        }
        try {
            this.field695.join();
        } catch (InterruptedException var3) {
        }
        this.field695 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
    public static final void method360(int arg0, int arg1, int arg2) {
        field687++;
        class69 var3 = class255.method1723((byte) 32, arg0, arg1);
        var3.method556((byte) -113);
        var3.field1091 = arg2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lkb;II[B)Lfb;")
    public final class30 method361(class54 arg0, int arg1, int arg2, byte[] arg3) {
        field681++;
        class30 var5 = new class30();
        var5.field503 = arg3;
        var5.field1266 = false;
        var5.field499 = 2;
        var5.field506 = arg0;
        var5.field3237 = (long) arg2;
        this.method366(var5, true);
        if (arg1 > -108) {
            method365((short) -4, 22, (byte) 104, -120L, (String) null, (String) null, 56, -112);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IB)I")
    public static final int method362(int arg0, byte arg1) {
        field689++;
        class250 var2 = class263.method1768(arg0, (byte) -46);
        if (arg1 >= -117) {
            return 85;
        }
        int var3 = var2.field4001;
        int var4 = var2.field4004;
        int var5 = var2.field4005;
        int var6 = class64.field1006[var5 - var3];
        return class257.field4090[var4] >> var3 & var6;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    public static void method363(boolean arg0) {
        if (!arg0) {
            method358(76, (byte) 101);
        }
        field692 = null;
        field683 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lkb;II)Lfb;")
    public final class30 method364(class54 arg0, int arg1, int arg2) {
        field690++;
        if (arg2 <= 98) {
            this.field695 = null;
        }
        class30 var4 = new class30();
        var4.field499 = 3;
        var4.field3237 = (long) arg1;
        var4.field1266 = false;
        var4.field506 = arg0;
        this.method366(var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(SIBJLjava/lang/String;Ljava/lang/String;II)V")
    public static final void method365(short arg0, int arg1, byte arg2, long arg3, String arg4, String arg5, int arg6, int arg7) {
        field694++;
        if (class207.field3185 || arg2 != -89 || class14.field174 >= 500) {
            return;
        }
        class68.field1082[class14.field174] = arg5;
        class148.field2196[class14.field174] = arg4;
        class166.field2518[class14.field174] = arg1 == -1 ? class114.field1755 : arg1;
        class86.field1282[class14.field174] = arg0;
        class266.field4210[class14.field174] = arg3;
        class49.field803[class14.field174] = arg7;
        class240.field3812[class14.field174] = arg6;
        class14.field174++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lfb;Z)V")
    private final void method366(class30 arg0, boolean arg1) {
        class79 var3 = this.field691;
        synchronized (this.field691) {
            this.field691.method621(arg0, (byte) -81);
            if (!arg1) {
                this.field693 = 108;
            }
            this.field693++;
            this.field691.notifyAll();
        }
        field684++;
    }

    @OriginalMember(owner = "client!ok", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field696) {
            class79 var1 = this.field691;
            class30 var2;
            synchronized (this.field691) {
                var2 = (class30) this.field691.method617((byte) 114);
                if (var2 == null) {
                    try {
                        this.field691.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field693--;
            }
            try {
                if (var2.field499 == 2) {
                    var2.field506.method460(8, (int) var2.field3237, var2.field503.length, var2.field503);
                } else if (var2.field499 == 3) {
                    var2.field503 = var2.field506.method458(7, (int) var2.field3237);
                }
            } catch (Exception var7) {
                class79.method624((String) null, var7, 0);
            }
            var2.field1264 = false;
        }
        field680++;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class41() {
        class139 var1 = class123.field1863.method25(false, this, 5);
        while (var1.field2082 == 0) {
            class122.method922(10L, (byte) -123);
        }
        if (var1.field2082 == 2) {
            throw new RuntimeException();
        }
        this.field695 = (Thread) var1.field2080;
    }
}
