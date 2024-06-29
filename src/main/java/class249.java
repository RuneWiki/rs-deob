import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class249 implements Runnable {

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    private int field3462 = 0;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    private int field3470 = 0;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3469;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    private int field3465;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "[B")
    private byte[] field3468;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field3467;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "Liv;")
    public static class65 field3474;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "Ljava/io/IOException;")
    private IOException field3464;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "[I")
    public static int[] field3473;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public static void method1612(int arg0) {
        field3473 = null;
        field3474 = null;
        if (arg0 != 1) {
            field3474 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
    public static final void method1613(int arg0, int arg1) {
        class452 var2 = class443.field6672[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class452 var4 = class443.field6672[var3][arg0][arg1] = class443.field6672[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field6811--;
                for (class384 var5 = var4.field6814; var5 != null; var5 = var5.field5834) {
                    class140 var6 = var5.field5832;
                    if (var6.field1868 == arg0 && var6.field1863 == arg1) {
                        var6.field1866--;
                    }
                }
            }
        }
        if (class443.field6672[0][arg0][arg1] == null) {
            class443.field6672[0][arg0][arg1] = new class452(0, arg0, arg1);
            class443.field6672[0][arg0][arg1].field6810 = 1;
        }
        class443.field6672[0][arg0][arg1].field6795 = var2;
        class443.field6672[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!uv", name = "run", descriptor = "()V")
    public final void run() {
        field3471++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3464 != null) {
                        return;
                    }
                    if (this.field3462 < this.field3470) {
                        var2 = this.field3465 + this.field3462 - this.field3470;
                    } else {
                        var2 = this.field3462 - this.field3470;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                if ((this.field3470 + var2) > this.field3465) {
                    int var3 = this.field3465 - this.field3470;
                    this.field3469.write(this.field3468, this.field3470, var3);
                    this.field3469.write(this.field3468, 0, var2 - var3);
                } else {
                    this.field3469.write(this.field3468, this.field3470, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3464 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3470 = (this.field3470 + var2) % this.field3465;
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I[BII)V")
    public final void method1614(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 <= 93) {
            return;
        }
        field3466++;
        if (arg0 < 0 || arg3 < 0 || (arg0 + arg3) > arg1.length) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (this.field3464 != null) {
                throw new IOException(this.field3464.toString());
            }
            int var6;
            if (this.field3470 <= this.field3462) {
                var6 = this.field3465 + this.field3470 - this.field3462 - 1;
            } else {
                var6 = this.field3470 - this.field3462 - 1;
            }
            if (var6 < arg0) {
                throw new IOException("");
            }
            if (this.field3465 < this.field3462 + arg0) {
                int var7 = this.field3465 - this.field3462;
                class192.method1299(arg1, arg3, this.field3468, this.field3462, var7);
                class192.method1299(arg1, arg3 + var7, this.field3468, 0, arg0 - var7);
            } else {
                class192.method1299(arg1, arg3, this.field3468, this.field3462, arg0);
            }
            this.field3462 = (this.field3462 + arg0) % this.field3465;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
    public final void method1615(boolean arg0) {
        this.field3469 = new class79();
        field3460++;
        if (!arg0) {
            this.field3468 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
    public final void method1616(int arg0) {
        if (arg0 != -11323) {
            return;
        }
        synchronized (this) {
            if (this.field3464 == null) {
                this.field3464 = new IOException("");
            }
            this.notifyAll();
        }
        field3461++;
        try {
            this.field3467.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class249(OutputStream arg0, int arg1) {
        this.field3469 = arg0;
        this.field3465 = arg1 + 1;
        this.field3468 = new byte[this.field3465];
        this.field3467 = new Thread(this);
        this.field3467.setDaemon(true);
        this.field3467.start();
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BIILga;)V")
    public static final void method1617(byte arg0, int arg1, int arg2, class282 arg3) {
        int var4 = -50 % ((-arg0 - 9) / 56);
        if (class44.field641) {
            class205 var5 = class364.field5591 == -1 ? null : class83.field1218.method3118(class364.field5591, -13676);
            if (client.method1348(arg3).method2701(1) && (class144.field1922 & 0x20) != 0 && (var5 == null || arg3.method1803(var5.field2727, (byte) -33, class364.field5591) != var5.field2727)) {
                class24.method227(false, 58, arg3.field4029, (byte) 95, true, class466.field6947 + " -> " + arg3.field4116, arg3.field4012, class48.field691, class468.field7001, 0L, arg3.field4031);
                class348.field5376++;
            }
        } else {
            for (int var6 = 9; var6 >= 5; var6--) {
                String var10 = class131.method892(var6, (byte) 26, arg3);
                if (var10 != null) {
                    class71.field989++;
                    class24.method227(false, 1006, arg3.field4029, (byte) 73, true, arg3.field4116, arg3.field4012, class331.method2142(arg3, var6, (byte) 101), var10, (long) (var6 + 1), arg3.field4031);
                }
            }
            String var7 = class470.method2819((byte) 125, arg3);
            if (var7 != null) {
                class24.method227(false, 10, arg3.field4029, (byte) 126, true, arg3.field4116, arg3.field4012, arg3.field4137, var7, 0L, arg3.field4031);
                class109.field1528++;
            }
            for (int var8 = 4; var8 >= 0; var8--) {
                String var9 = class131.method892(var8, (byte) 26, arg3);
                if (var9 != null) {
                    class71.field989++;
                    class24.method227(false, 45, arg3.field4029, (byte) 123, true, arg3.field4116, arg3.field4012, class331.method2142(arg3, var8, (byte) 95), var9, (long) (var8 + 1), arg3.field4031);
                }
            }
            if (client.method1348(arg3).method2698(1661101682)) {
                class194.field2590++;
                if (arg3.field4025 == null) {
                    class24.method227(false, 60, arg3.field4029, (byte) 113, true, "", arg3.field4012, -1, class134.field1795.method2705((byte) 69, class257.field3556), 0L, arg3.field4031);
                } else {
                    class24.method227(false, 60, arg3.field4029, (byte) -43, true, "", arg3.field4012, -1, arg3.field4025, 0L, arg3.field4031);
                }
            }
        }
        field3463++;
    }

    static {
        new class446("Player ", "Spieler ", "Joueur ", "Jogador ");
        field3474 = new class65("stellardawn", 1);
    }
}
