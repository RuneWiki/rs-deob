import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class342 implements Runnable {

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Lem;")
    private class434 field5340 = new class434();

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public int field5341 = 0;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Z")
    private boolean field5343 = false;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field5344;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Lbi;")
    public static class104 field5333 = new class104(48, -1);

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "[I")
    public static int[] field5337 = new int[13];

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IBLbh;)Lis;")
    public final class74 method2267(int arg0, byte arg1, class307 arg2) {
        field5335++;
        if (arg1 != 107) {
            this.method2272((byte) 29, 87, null);
        }
        class74 var4 = new class74();
        var4.field1113 = 1;
        class434 var5 = this.field5340;
        synchronized (this.field5340) {
            class74 var6 = (class74) this.field5340.method2732(34);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field5226 && var6.field1109 == arg2 && var6.field1113 == 2) {
                    var4.field4368 = false;
                    var4.field1111 = var6.field1111;
                    return var4;
                }
                var6 = (class74) this.field5340.method2729(120);
            }
        }
        var4.field1111 = arg2.method2069(520, arg0);
        var4.field4369 = true;
        var4.field4368 = false;
        return var4;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public static void method2268(byte arg0) {
        field5333 = null;
        if (arg0 != -24) {
            method2268((byte) 101);
        }
        field5337 = null;
    }

    @OriginalMember(owner = "client!dp", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field5343) {
            class434 var1 = this.field5340;
            class74 var2;
            synchronized (this.field5340) {
                var2 = (class74) this.field5340.method2735((byte) -114);
                if (var2 == null) {
                    try {
                        this.field5340.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5341--;
            }
            try {
                if (var2.field1113 == 2) {
                    var2.field1109.method2067((int) var2.field5226, 2050602952, var2.field1111.length, var2.field1111);
                } else if (var2.field1113 == 3) {
                    var2.field1111 = var2.field1109.method2069(520, (int) var2.field5226);
                }
            } catch (Exception var6) {
                class80.method575(var6, null, (byte) -89);
            }
            var2.field4368 = false;
        }
        field5336++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILis;)V")
    private final void method2269(int arg0, class74 arg1) {
        class434 var3 = this.field5340;
        synchronized (this.field5340) {
            this.field5340.method2731(arg1, (byte) 49);
            this.field5341++;
            this.field5340.notifyAll();
            if (arg0 != 27797) {
                this.run();
            }
        }
        field5339++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public final void method2270(int arg0) {
        field5342++;
        this.field5343 = true;
        class434 var2 = this.field5340;
        synchronized (this.field5340) {
            this.field5340.notifyAll();
        }
        if (arg0 != 0) {
            return;
        }
        try {
            this.field5344.join();
        } catch (InterruptedException var3) {
        }
        this.field5344 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lbh;II[B)Lis;")
    public final class74 method2271(class307 arg0, int arg1, int arg2, byte[] arg3) {
        field5338++;
        if (arg2 > -59) {
            return null;
        }
        class74 var5 = new class74();
        var5.field1111 = arg3;
        var5.field4369 = false;
        var5.field1109 = arg0;
        var5.field5226 = arg1;
        var5.field1113 = 2;
        this.method2269(27797, var5);
        return var5;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BILbh;)Lis;")
    public final class74 method2272(byte arg0, int arg1, class307 arg2) {
        field5334++;
        class74 var4 = new class74();
        var4.field1113 = 3;
        var4.field5226 = arg1;
        var4.field4369 = false;
        var4.field1109 = arg2;
        if (arg0 == 111) {
            this.method2269(27797, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lpb;)V")
    public class342(class2 arg0) {
        class495 var2 = arg0.method7(this, (byte) 115, 5);
        while (var2.field7458 == 0) {
            class208.method1464((byte) -67, 10L);
        }
        if (var2.field7458 == 2) {
            throw new RuntimeException();
        }
        this.field5344 = (Thread) var2.field7462;
    }

    static {
        new class213("Player ", "Spieler ", "Joueur ", "Jogador ");
    }
}
