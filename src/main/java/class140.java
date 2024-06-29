import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class140 implements Runnable {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Z")
    private boolean field3473 = false;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    private int field3482 = 0;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Z")
    private boolean field3498 = false;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    private int field3491 = 0;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Lw;")
    private class148 field3497;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "Ljava/net/Socket;")
    private Socket field3494;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field3486;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3478;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lkd;")
    private static class73 field3468 = class126.method1070((byte) -66, "Please try again)3");

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Z")
    public static volatile boolean field3479 = true;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Lkd;")
    public static class73 field3484 = class126.method1070((byte) -66, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lkd;")
    private static class73 field3470 = class126.method1070((byte) -66, "Too many connections from your address)3");

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Lkd;")
    public static class73 field3488 = field3468;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lkd;")
    public static class73 field3493 = class126.method1070((byte) -66, "<br>");

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Lkd;")
    public static class73 field3495 = field3470;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "[I")
    public static int[] field3483 = new int[5];

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Lq;")
    public static class111 field3487;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Ljc;")
    public static class65 field3471;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Ljc;")
    private class65 field3480;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "[B")
    private byte[] field3489;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public final void method1135(int arg0) {
        field3481++;
        if (arg0 > -101) {
            field3495 = null;
        }
        if (this.field3473) {
            return;
        }
        synchronized (this) {
            this.field3473 = true;
            this.notifyAll();
        }
        if (this.field3480 != null) {
            while (this.field3480.field1695 == 0) {
                class112.method913(1, 1L);
            }
            if (this.field3480.field1695 == 1) {
                try {
                    ((Thread) this.field3480.field1693).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3480 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)I")
    public final int method1136(int arg0) throws IOException {
        field3476++;
        if (arg0 != 0) {
            method1141(-65, null, (byte) -7);
        }
        return this.field3473 ? 0 : this.field3486.available();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BZI)V")
    public final void method1137(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field3485++;
        if (arg2) {
            field3468 = null;
        }
        if (this.field3473) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field3486.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
    public static final boolean method1138(int arg0, int arg1) {
        field3490++;
        if (arg0 < arg1) {
            return false;
        }
        int var2 = class74.field1921[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 49;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
    public final int method1139(int arg0) throws IOException {
        field3475++;
        if (this.field3473) {
            return 0;
        } else {
            if (arg0 != -5440) {
                method1138(-4, 78);
            }
            return this.field3486.read();
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lr;IIII)V")
    public static final void method1140(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3492++;
        if (class73.field1901 == arg0 || class129.field3262 >= 400) {
            return;
        }
        class73 var5;
        if (arg0.field2994 == 0) {
            var5 = class32.method258(-127, new class73[] { arg0.field3025, class72.method599(class73.field1901.field3002, -1, arg0.field3002), class36.field1001, class105.field2611, class78.method676(arg0.field3002, -65), class60.field1585 });
        } else {
            var5 = class32.method258(-94, new class73[] { arg0.field3025, class36.field1001, class34.field922, class78.method676(arg0.field2994, -85), class60.field1585 });
        }
        if (class103.field2567 == 1) {
            class119.field3032++;
            class80.method684(class32.method258(arg2 + 15827, new class73[] { class5.field192, class53.field1425, var5 }), false, 28, class87.field2189, arg4, arg1, arg3);
        } else if (!class50.field1329) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class13.field415[var6] != null) {
                    class36.field990++;
                    int var7 = 0;
                    short var8 = 0;
                    if (class13.field415[var6].method615(class50.field1364, 60)) {
                        if (arg0.field3002 > class73.field1901.field3002) {
                            var8 = 2000;
                        }
                        if (class73.field1901.field3011 != 0 && arg0.field3011 != 0) {
                            if (class73.field1901.field3011 == arg0.field3011) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class119.field3051[var6]) {
                        var8 = 2000;
                    }
                    if (var6 == 0) {
                        var7 = var8 + 55;
                    }
                    if (var6 == 1) {
                        var7 = var8 + 13;
                    }
                    if (var6 == 2) {
                        var7 = var8 + 45;
                    }
                    if (var6 == 3) {
                        var7 = var8 + 3;
                    }
                    if (var6 == 4) {
                        var7 = var8 + 36;
                    }
                    class80.method684(class32.method258(arg2 ^ 0x3E50, new class73[] { client.field615, var5 }), false, var7, class13.field415[var6], arg4, arg1, arg3);
                }
            }
        } else if ((class94.field2392 & 0x8) == 8) {
            class14.field441++;
            class80.method684(class32.method258(-101, new class73[] { class121.field3102, class53.field1425, var5 }), false, 54, class57.field1511, arg4, arg1, arg3);
        }
        if (arg2 != -15891) {
            field3483 = null;
        }
        for (int var9 = 0; var9 < class129.field3262; var9++) {
            if (class74.field1921[var9] == 48) {
                class54.field1440[var9] = class32.method258(class79.method679(arg2, 15977), new class73[] { class139.field3446, class136.field3382, client.field615, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILq;B)Lde;")
    public static final class27 method1141(int arg0, class111 arg1, byte arg2) {
        field3496++;
        if (class112.method912(arg1, (byte) 99, arg0)) {
            int var3 = 51 % ((arg2 - 45) / 46);
            return class122.method1043((byte) -80);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILq;)Z")
    public static final boolean method1142(int arg0, int arg1, int arg2, class111 arg3) {
        field3472++;
        byte[] var4 = arg3.method898((byte) -52, arg1, arg0);
        if (arg2 >= -115) {
            field3493 = null;
        }
        if (var4 == null) {
            return false;
        } else {
            class136.method1111((byte) -124, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[BI)V")
    public final void method1143(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3469++;
        if (this.field3473) {
            return;
        }
        if (this.field3498) {
            this.field3498 = false;
            throw new IOException();
        }
        if (arg0 != 5000) {
            method1141(11, null, (byte) -23);
        }
        if (this.field3489 == null) {
            this.field3489 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field3489[this.field3491] = arg2[arg1 + var6];
                this.field3491 = (this.field3491 + 1) % 5000;
                if ((this.field3482 + 4900) % 5000 == this.field3491) {
                    throw new IOException();
                }
            }
            if (this.field3480 == null) {
                this.field3480 = this.field3497.method1176(3, this, (byte) -59);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ud", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3491 == this.field3482) {
                            if (this.field3473) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field3491 >= this.field3482) {
                            var2 = this.field3491 - this.field3482;
                        } else {
                            var2 = 5000 - this.field3482;
                        }
                        var3 = this.field3482;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field3478.write(this.field3489, var3, var2);
                    } catch (IOException var9) {
                        this.field3498 = true;
                    }
                    this.field3482 = (this.field3482 + var2) % 5000;
                    try {
                        if (this.field3491 == this.field3482) {
                            this.field3478.flush();
                        }
                    } catch (IOException var8) {
                        this.field3498 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3486 != null) {
                        this.field3486.close();
                    }
                    if (this.field3478 != null) {
                        this.field3478.close();
                    }
                    if (this.field3494 != null) {
                        this.field3494.close();
                    }
                } catch (IOException var7) {
                }
                this.field3489 = null;
                break;
            }
        } catch (Exception var12) {
            class111.method894(null, var12, (byte) 2);
        }
        field3477++;
    }

    @OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3499++;
        this.method1135(-117);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILua;Lpe;)V")
    public static final void method1144(int arg0, int arg1, class137 arg2, class109 arg3) {
        field3474++;
        class3 var4 = new class3();
        var4.field3522 = arg1;
        var4.field167 = arg2;
        if (arg0 != -8089) {
            return;
        }
        var4.field158 = arg3;
        var4.field162 = 1;
        class61 var5 = class1.field67;
        synchronized (class1.field67) {
            class1.field67.method519(var4, 13017);
        }
        class72.method598((byte) 124);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public static void method1145(int arg0) {
        field3487 = null;
        field3471 = null;
        if (arg0 != 1) {
            field3487 = null;
        }
        field3493 = null;
        field3468 = null;
        field3484 = null;
        field3470 = null;
        field3483 = null;
        field3488 = null;
        field3495 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/net/Socket;Lw;)V")
    public class140(Socket arg0, class148 arg1) throws IOException {
        this.field3497 = arg1;
        this.field3494 = arg0;
        this.field3494.setSoTimeout(30000);
        this.field3494.setTcpNoDelay(true);
        this.field3486 = this.field3494.getInputStream();
        this.field3478 = this.field3494.getOutputStream();
    }
}
