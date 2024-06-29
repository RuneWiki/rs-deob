import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class185 implements Runnable {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Z")
    private boolean field2664 = false;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Z")
    private boolean field2668 = false;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    private int field2663 = 0;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    private int field2686 = 0;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field2671;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lsi;")
    private class56 field2667;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field2678;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2679;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "[I")
    public static int[] field2682 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field2675 = 0;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "J")
    public static long field2670 = 0L;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Lbc;")
    public static class282 field2685;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lbd;")
    private class81 field2669;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "[B")
    private byte[] field2684;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public final void method1199(int arg0) {
        if (arg0 >= -26) {
            return;
        }
        field2687++;
        if (this.field2664) {
            return;
        }
        synchronized (this) {
            this.field2664 = true;
            this.notifyAll();
        }
        if (this.field2669 != null) {
            while (this.field2669.field960 == 0) {
                class247.method1595(1L, (byte) -83);
            }
            if (this.field2669.field960 == 1) {
                try {
                    ((Thread) this.field2669.field958).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2669 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZIB)I")
    public static final int method1200(int arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 <= 34) {
            method1200(28, true, 63, (byte) 59);
        }
        class94 var4 = (class94) class224.field3161.method1895((long) arg0, -116);
        field2665++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field1260.length; var6++) {
            if (var4.field1260[var6] >= 0 && var4.field1260[var6] < class95.field1270) {
                class229 var7 = class36.method224(var4.field1260[var6], 47);
                if (var7.field3277 != null) {
                    class138 var8 = (class138) var7.field3277.method1895((long) arg2, -128);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field1255[var6] * var8.field2013;
                        } else {
                            var5 += var8.field2013;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILbc;)I")
    public static final int method1201(int arg0, class282 arg1) {
        field2672++;
        int var2 = arg0;
        if (arg1.method1842(class140.field2029, arg0 - 5012)) {
            var2 = arg0 + 1;
        }
        if (arg1.method1842(class265.field3827, -5012)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
    public final int method1202(byte arg0) throws IOException {
        field2683++;
        int var2 = -24 % ((arg0 + 5) / 58);
        return this.field2664 ? 0 : this.field2678.available();
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static void method1203(int arg0) {
        field2682 = null;
        if (arg0 != 3175) {
            field2685 = null;
        }
        field2685 = null;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public final void method1204(int arg0) {
        field2660++;
        if (!this.field2664) {
            this.field2678 = new class156();
            int var2 = 101 / ((arg0 + 25) / 59);
            this.field2679 = new class210();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BIZI)V")
    public final void method1205(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        field2680++;
        if (this.field2664) {
            return;
        }
        if (arg2) {
            method1207(51, -96, -61, 46, true);
        }
        while (arg1 > 0) {
            int var5 = this.field2678.read(arg0, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!tb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2686 == this.field2663) {
                            if (this.field2664) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field2686 >= this.field2663) {
                            var2 = this.field2686 - this.field2663;
                        } else {
                            var2 = 5000 - this.field2663;
                        }
                        var3 = this.field2663;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field2679.write(this.field2684, var3, var2);
                    } catch (IOException var9) {
                        this.field2668 = true;
                    }
                    this.field2663 = (this.field2663 + var2) % 5000;
                    try {
                        if (this.field2686 == this.field2663) {
                            this.field2679.flush();
                        }
                    } catch (IOException var8) {
                        this.field2668 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2678 != null) {
                        this.field2678.close();
                    }
                    if (this.field2679 != null) {
                        this.field2679.close();
                    }
                    if (this.field2671 != null) {
                        this.field2671.close();
                    }
                } catch (IOException var7) {
                }
                this.field2684 = null;
                break;
            }
        } catch (Exception var12) {
            class142.method918(-1, var12, (String) null);
        }
        field2677++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BIBI)V")
    public final void method1206(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field2676++;
        if (this.field2664) {
            return;
        }
        if (this.field2668) {
            this.field2668 = false;
            throw new IOException();
        }
        if (this.field2684 == null) {
            this.field2684 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field2684[this.field2686] = arg0[arg3 + var6];
                this.field2686 = (this.field2686 + 1) % 5000;
                if ((this.field2663 + 4900) % 5000 == this.field2686) {
                    throw new IOException();
                }
            }
            if (arg2 != -43) {
                this.field2667 = null;
            }
            if (this.field2669 == null) {
                this.field2669 = this.field2667.method341(arg2 + 11612, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class268.field3922 = arg1;
        class97.field1292 = arg2;
        class46.field547 = arg3;
        class74.field889 = new class133[arg0][class268.field3922][class97.field1292];
        class180.field2550 = new int[arg0][class268.field3922 + 1][class97.field1292 + 1];
        if (arg4) {
            class133.field1943 = new class133[1][class268.field3922][class97.field1292];
            class91.field1244 = new int[class268.field3922][class97.field1292];
            class220.field3122 = new int[1][class268.field3922 + 1][class97.field1292 + 1];
        } else {
            class133.field1943 = null;
            class91.field1244 = null;
            class220.field3122 = null;
        }
        class189.method1245(false);
        class181.field2577 = new class232[500];
        class193.field2775 = 0;
        class53.field617 = new class232[500];
        class161.field2318 = 0;
        class272.field3985 = new int[arg0][class268.field3922 + 1][class97.field1292 + 1];
        class293.field4632 = new class243[5000];
        class200.field2845 = 0;
        class222.field3140 = new class243[100];
        class252.field3642 = new boolean[class46.field547 + class46.field547 + 1][class46.field547 + class46.field547 + 1];
        class41.field503 = new boolean[class46.field547 + class46.field547 + 2][class46.field547 + class46.field547 + 2];
        class214.field2986 = new byte[arg0][class268.field3922][class97.field1292];
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static final void method1208(byte arg0) {
        field2674++;
        if (class24.field291 > 0) {
            class233.method1517((byte) 120);
        } else {
            class77.field923 = class117.field1637;
            class117.field1637 = null;
            class17.method105(40, (byte) -105);
            int var1 = 92 % ((arg0 + 41) / 59);
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)I")
    public final int method1209(byte arg0) throws IOException {
        field2666++;
        if (this.field2664) {
            return 0;
        } else {
            if (arg0 != 100) {
                this.field2679 = null;
            }
            return this.field2678.read();
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V")
    public final void method1210(byte arg0) throws IOException {
        field2681++;
        if (this.field2664) {
            return;
        }
        if (arg0 >= -73) {
            method1207(41, -125, -54, -42, false);
        }
        if (this.field2668) {
            this.field2668 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILbc;I)Z")
    public static final boolean method1211(int arg0, class282 arg1, int arg2) {
        field2662++;
        if (arg0 != 0) {
            return false;
        }
        byte[] var3 = arg1.method1863((byte) 86, arg2);
        if (var3 == null) {
            return false;
        } else {
            class73.method451(var3, (byte) 93);
            return true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1199(-85);
        field2673++;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/net/Socket;Lsi;)V")
    public class185(Socket arg0, class56 arg1) throws IOException {
        this.field2671 = arg0;
        this.field2667 = arg1;
        this.field2671.setSoTimeout(30000);
        this.field2671.setTcpNoDelay(true);
        this.field2678 = this.field2671.getInputStream();
        this.field2679 = this.field2671.getOutputStream();
    }
}
