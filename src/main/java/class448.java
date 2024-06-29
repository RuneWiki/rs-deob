import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class448 implements Runnable {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lek;")
    private class295 field6427 = new class295();

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public int field6435 = 0;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
    private boolean field6436 = false;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field6433;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[Lre;")
    public static class359[] field6437 = new class359[29];

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Liq;")
    public static class362 field6430 = new class362("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 5)
    public final void method2777(int arg0) {
        this.field6436 = true;
        field6440++;
        class295 var2 = this.field6427;
        synchronized (this.field6427) {
            this.field6427.notifyAll();
        }
        try {
            this.field6433.join();
            int var3 = -43 % ((-arg0 - 6) / 47);
        } catch (InterruptedException var4) {
        }
        this.field6433 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLga;)V", line = 23)
    private final void method2778(boolean arg0, class229 arg1) {
        class295 var3 = this.field6427;
        synchronized (this.field6427) {
            this.field6427.method1950(-99, arg1);
            this.field6435++;
            this.field6427.notifyAll();
        }
        if (!arg0) {
            this.method2777(31);
        }
        field6426++;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)Ljava/lang/String;", line = 39)
    public static final String method2779(int arg0) {
        if (arg0 != -18504) {
            method2782(-100, -40);
        }
        field6431++;
        String var1 = "www";
        if (class237.field3389 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class292.field4086 != null) {
            var2 = "/p=" + class292.field4086;
        }
        return class384.field5425 == 1 ? "http://" + var1 + ".stellardawn.com/l=" + class271.field3836 + "/a=" + class303.field4269 + var2 + "/" : "http://" + var1 + ".runescape.com/l=" + class271.field3836 + "/a=" + class303.field4269 + var2 + "/";
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 67)
    public static void method2780(int arg0) {
        field6437 = null;
        if (arg0 != 6422) {
            method2780(35);
        }
        field6430 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIILgb;)Lga;", line = 79)
    public final class229 method2781(byte[] arg0, int arg1, int arg2, class117 arg3) {
        if (arg1 != 5) {
            method2780(-45);
        }
        field6429++;
        class229 var5 = new class229();
        var5.field3237 = arg3;
        var5.field3239 = arg0;
        var5.field4685 = (long) arg2;
        var5.field3235 = 2;
        var5.field4974 = false;
        this.method2778(true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V", line = 102)
    public static final void method2782(int arg0, int arg1) {
        field6432++;
        class20 var2 = class369.method2351((byte) 75, arg1, arg0);
        var2.method148(arg1 - 11808);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lrd;)V", line = 230)
    public class448(class185 arg0) {
        class315 var2 = arg0.method1276(this, 5, (byte) -76);
        while (var2.field4498 == 0) {
            class150.method907(10L, (byte) -32);
        }
        if (var2.field4498 == 2) {
            throw new RuntimeException();
        }
        this.field6433 = (Thread) var2.field4497;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lgb;II)Lga;", line = 116)
    public final class229 method2783(class117 arg0, int arg1, int arg2) {
        if (arg2 != -1077) {
            this.field6427 = null;
        }
        field6438++;
        class229 var4 = new class229();
        var4.field3235 = 3;
        var4.field4685 = (long) arg1;
        var4.field4974 = false;
        var4.field3237 = arg0;
        this.method2778(true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILgb;Z)Lga;", line = 136)
    public final class229 method2784(int arg0, class117 arg1, boolean arg2) {
        field6428++;
        class229 var4 = new class229();
        var4.field3235 = 1;
        class295 var5 = this.field6427;
        synchronized (this.field6427) {
            class229 var6 = (class229) this.field6427.method1949(!arg2);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field4685 && var6.field3237 == arg1 && var6.field3235 == 2) {
                    var4.field3239 = var6.field3239;
                    var4.field4971 = false;
                    return var4;
                }
                var6 = (class229) this.field6427.method1945((byte) -48);
            }
        }
        var4.field3239 = arg1.method728((byte) -120, arg0);
        var4.field4971 = arg2;
        var4.field4974 = true;
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "run", descriptor = "()V", line = 169)
    public final void run() {
        while (!this.field6436) {
            class295 var1 = this.field6427;
            class229 var2;
            synchronized (this.field6427) {
                var2 = (class229) this.field6427.method1946(4);
                if (var2 == null) {
                    try {
                        this.field6427.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field6435--;
            }
            try {
                if (var2.field3235 == 2) {
                    var2.field3237.method724(-1, var2.field3239.length, (int) var2.field4685, var2.field3239);
                } else if (var2.field3235 == 3) {
                    var2.field3239 = var2.field3237.method728((byte) -108, (int) var2.field4685);
                }
            } catch (Exception var6) {
                class422.method2663((String) null, var6, -94);
            }
            var2.field4971 = false;
        }
        field6434++;
    }
}
