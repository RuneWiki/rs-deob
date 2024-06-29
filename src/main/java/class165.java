import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class165 implements Runnable {

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lwf;")
    private class88 field2434 = new class88();

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Z")
    private boolean field2436 = false;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field2435 = 0;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field2437;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lki;")
    public static class498 field2429 = new class498(46, 8);

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Llt;")
    public static class475 field2433;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Llt;")
    public static class475 field2438;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lrt;")
    public static class150 field2424;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lic;")
    public static class491 field2439;

    static {
        new class475(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field2433 = new class475("scroll:", "scrollen:", "déroulement:", "rolagem:");
        field2438 = new class475("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLoc;I)Lbq;", line = 4)
    public final class189 method1146(byte arg0, class135 arg1, int arg2) {
        field2430++;
        class189 var4 = new class189();
        var4.field3936 = arg2;
        var4.field2796 = arg1;
        var4.field2795 = 3;
        var4.field7047 = false;
        this.method1152(var4, true);
        if (arg0 > -24) {
            this.run();
        }
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 24)
    public final void method1147(int arg0) {
        field2425++;
        this.field2436 = true;
        class88 var2 = this.field2434;
        synchronized (this.field2434) {
            this.field2434.notifyAll();
        }
        try {
            this.field2437.join();
            if (arg0 != 2) {
                this.field2434 = null;
            }
        } catch (InterruptedException var3) {
        }
        this.field2437 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILoc;I)Lbq;", line = 46)
    public final class189 method1148(int arg0, class135 arg1, int arg2) {
        field2431++;
        class189 var4 = new class189();
        var4.field2795 = 1;
        class88 var5 = this.field2434;
        synchronized (this.field2434) {
            if (arg2 != -18101) {
                return null;
            }
            class189 var7 = (class189) this.field2434.method514((byte) 111);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if (((long) arg0) == var7.field3936 && var7.field2796 == arg1 && var7.field2795 == 2) {
                    var4.field7045 = false;
                    var4.field2794 = var7.field2794;
                    return var4;
                }
                var7 = (class189) this.field2434.method517((byte) -119);
            }
        }
        var4.field2794 = arg1.method893(255, arg0);
        var4.field7045 = false;
        var4.field7047 = true;
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 81)
    public static final void method1149(int arg0) {
        field2428++;
        if (arg0 != -128 || class154.field2280) {
            return;
        }
        class264.field3869 = true;
        class154.field2280 = true;
        if (class426.field6401.field1013) {
            class382.field5792 = ((int) class382.field5792 - 65 & 0xFFFFFF80);
        } else {
            class450.field6707 += (-class450.field6707 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!kf", name = "run", descriptor = "()V", line = 105)
    public final void run() {
        while (!this.field2436) {
            class88 var1 = this.field2434;
            class189 var2;
            synchronized (this.field2434) {
                var2 = (class189) this.field2434.method511(95);
                if (var2 == null) {
                    try {
                        this.field2434.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2435--;
            }
            try {
                if (var2.field2795 == 2) {
                    var2.field2796.method895(var2.field2794.length, var2.field2794, (byte) -114, (int) var2.field3936);
                } else if (var2.field2795 == 3) {
                    var2.field2794 = var2.field2796.method893(255, (int) var2.field3936);
                }
            } catch (Exception var7) {
                class235.method1598(var7, null, (byte) 69);
            }
            var2.field7045 = false;
        }
        field2426++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 150)
    public static void method1150(byte arg0) {
        field2433 = null;
        field2424 = null;
        field2429 = null;
        if (arg0 >= -46) {
            method1150((byte) -109);
        }
        field2438 = null;
        field2439 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[BBLoc;)Lbq;", line = 175)
    public final class189 method1151(int arg0, byte[] arg1, byte arg2, class135 arg3) {
        field2423++;
        class189 var5 = new class189();
        var5.field2794 = arg1;
        var5.field7047 = false;
        var5.field3936 = arg0;
        var5.field2796 = arg3;
        var5.field2795 = 2;
        this.method1152(var5, true);
        if (arg2 > -27) {
            field2429 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lbq;Z)V", line = 196)
    private final void method1152(class189 arg0, boolean arg1) {
        class88 var3 = this.field2434;
        synchronized (this.field2434) {
            this.field2434.method518(0, arg0);
            this.field2435++;
            this.field2434.notifyAll();
        }
        field2432++;
        if (!arg1) {
            field2439 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lji;)V", line = 225)
    public class165(class432 arg0) {
        class281 var2 = arg0.method2595(this, 5, 78);
        while (var2.field4032 == 0) {
            class246.method1659((byte) 117, 10L);
        }
        if (var2.field4032 == 2) {
            throw new RuntimeException();
        }
        this.field2437 = (Thread) var2.field4030;
    }
}
