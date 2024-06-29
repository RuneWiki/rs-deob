import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class255 implements Runnable {

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Z")
    private boolean field4576 = false;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    private int field4596 = 0;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Z")
    private boolean field4577 = false;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    private int field4590 = 0;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Lq;")
    private class81 field4593;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field4579;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Ljava/io/InputStream;")
    private InputStream field4582;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4586;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Llc;")
    private static class143 field4569 = class66.method374("Loaded wordpack", -1);

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Llc;")
    private static class143 field4570 = class66.method374("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", -1);

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "[I")
    public static int[] field4572 = new int[100];

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Llc;")
    public static class143 field4571 = field4570;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Llc;")
    public static class143 field4583 = field4569;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "[I")
    public static int[] field4574 = new int[99];

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[J")
    public static long[] field4585 = new long[100];

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "[Llc;")
    public static class143[] field4594 = new class143[200];

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "Llc;")
    public static class143 field4598 = class66.method374("Veuillez commencer par supprimer ", -1);

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "[[[I")
    public static int[][][] field4599;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lia;")
    private class181 field4575;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "Lgf;")
    public static class7 field4587;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "[B")
    private byte[] field4588;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)I")
    public final int method1679(boolean arg0) throws IOException {
        field4566++;
        if (this.field4576) {
            return 0;
        } else {
            if (arg0) {
                this.method1688(104);
            }
            return this.field4582.read();
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)I")
    public static final int method1680(int arg0, byte arg1) {
        field4567++;
        int var2 = -61 % ((55 - arg1) / 39);
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)I")
    public final int method1681(byte arg0) throws IOException {
        field4581++;
        if (this.field4576) {
            return 0;
        } else {
            if (arg0 > -120) {
                method1683((byte) -70);
            }
            return this.field4582.available();
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public final void method1682(int arg0) {
        field4580++;
        if (this.field4576) {
            return;
        }
        if (arg0 != 1) {
            field4578 = 127;
        }
        synchronized (this) {
            this.field4576 = true;
            this.notifyAll();
        }
        if (this.field4575 != null) {
            while (this.field4575.field3241 == 0) {
                class61.method347(1L, arg0);
            }
            if (this.field4575.field3241 == 1) {
                try {
                    ((Thread) this.field4575.field3239).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4575 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static void method1683(byte arg0) {
        field4585 = null;
        field4570 = null;
        field4594 = null;
        field4569 = null;
        if (arg0 != 73) {
            field4598 = null;
        }
        field4574 = null;
        field4583 = null;
        field4571 = null;
        field4599 = null;
        field4572 = null;
        field4587 = null;
        field4598 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III[B)V")
    public final void method1684(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4584++;
        if (this.field4576) {
            return;
        }
        int var5 = 125 / ((35 - arg1) / 62);
        while (arg0 > 0) {
            int var6 = this.field4582.read(arg3, arg2, arg0);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg0 -= var6;
            arg2 += var6;
        }
    }

    @OriginalMember(owner = "client!mk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4589++;
        this.method1682(1);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([BIZI)V")
    public final void method1685(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        if (arg2) {
            this.method1682(119);
        }
        field4597++;
        if (this.field4576) {
            return;
        }
        if (this.field4577) {
            this.field4577 = false;
            throw new IOException();
        }
        if (this.field4588 == null) {
            this.field4588 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field4588[this.field4590] = arg0[arg3 + var6];
                this.field4590 = (this.field4590 + 1) % 5000;
                if ((this.field4596 + 4900) % 5000 == this.field4590) {
                    throw new IOException();
                }
            }
            if (this.field4575 == null) {
                this.field4575 = this.field4593.method460(this, (byte) 68, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V")
    public final void method1686(boolean arg0) throws IOException {
        field4592++;
        if (this.field4576) {
            return;
        }
        if (!arg0) {
            method1689(72, (String) null, (Throwable) null);
        }
        if (this.field4577) {
            this.field4577 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(IB)Lbf;")
    public static final class290 method1687(int arg0, byte arg1) {
        field4573++;
        class290 var2 = (class290) class32.field544.method826((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class74.field1386.method41(-18328, 1, arg0);
        class290 var4 = new class290();
        var4.field5098 = arg0;
        if (arg1 != -77) {
            field4594 = null;
        }
        if (var3 != null) {
            var4.method1937(new class190(var3), false);
        }
        var4.method1941(arg1 ^ 0x4C);
        class32.field544.method827(-3, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!mk", name = "run", descriptor = "()V")
    public final void run() {
        field4568++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4596 == this.field4590) {
                        if (this.field4576) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field4596;
                    if (this.field4596 <= this.field4590) {
                        var3 = this.field4590 - this.field4596;
                    } else {
                        var3 = 5000 - this.field4596;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field4586.write(this.field4588, var2, var3);
                    } catch (IOException var9) {
                        this.field4577 = true;
                    }
                    this.field4596 = (this.field4596 + var3) % 5000;
                    try {
                        if (this.field4596 == this.field4590) {
                            this.field4586.flush();
                        }
                    } catch (IOException var8) {
                        this.field4577 = true;
                    }
                }
            }
            try {
                if (this.field4582 != null) {
                    this.field4582.close();
                }
                if (this.field4586 != null) {
                    this.field4586.close();
                }
                if (this.field4579 != null) {
                    this.field4579.close();
                }
            } catch (IOException var7) {
            }
            this.field4588 = null;
        } catch (Exception var12) {
            method1689(124, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public final void method1688(int arg0) {
        if (arg0 != 13) {
            this.finalize();
        }
        field4595++;
        if (!this.field4576) {
            this.field4582 = new class158();
            this.field4586 = new class123();
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1689(int arg0, String arg1, Throwable arg2) {
        field4591++;
        try {
            String var3 = "";
            if (arg0 < 64) {
                method1687(-13, (byte) -30);
            }
            if (arg2 != null) {
                var3 = class264.method1762(arg2, 32);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class8.field152.field1469 != null) {
                class181 var8 = class8.field152.method464(-85, new URL(class8.field152.field1469.getCodeBase(), "clienterror.ws?c=" + class67.field1262 + "&u=" + class194.field3594 + "&v1=" + class81.field1465 + "&v2=" + class81.field1474 + "&e=" + var7));
                while (var8.field3241 == 0) {
                    class61.method347(1L, 1);
                }
                if (var8.field3241 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3239;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Ljava/net/Socket;Lq;)V")
    public class255(Socket arg0, class81 arg1) throws IOException {
        this.field4593 = arg1;
        this.field4579 = arg0;
        this.field4579.setSoTimeout(30000);
        this.field4579.setTcpNoDelay(true);
        this.field4582 = this.field4579.getInputStream();
        this.field4586 = this.field4579.getOutputStream();
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4574[var1] = var0 / 4;
        }
        field4599 = new int[4][13][13];
    }
}
