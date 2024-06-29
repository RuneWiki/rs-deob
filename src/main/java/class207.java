import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class207 implements Runnable {

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Z")
    private boolean field3453 = false;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "Z")
    private boolean field3471 = false;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    private int field3468 = 0;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    private int field3473 = 0;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lvb;")
    private class131 field3445;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field3458;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field3452;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3467;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
    public static int[] field3450 = new int[256];

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field3462 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lvh;")
    public static class108 field3449;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Llk;")
    private class174 field3466;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "[B")
    private byte[] field3460;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[Lid;")
    public static class100[] field3455;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
    public final int method1377(int arg0) throws IOException {
        field3464++;
        int var2 = 71 % ((arg0 - 72) / 33);
        return this.field3453 ? 0 : this.field3452.read();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)Lqd;")
    public static final class161 method1378(int arg0, byte arg1) {
        field3469++;
        class161 var2 = (class161) class159.field2664.method57((long) arg0, -64);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field1015.method746(arg0, (byte) -128, 16);
        class161 var4 = new class161();
        if (var3 != null) {
            var4.method1092((byte) -124, new class101(var3));
        }
        if (arg1 < 39) {
            method1379((byte) 123, (class288) null);
        }
        class159.field2664.method62(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLnh;)I")
    public static final int method1379(byte arg0, class288 arg1) {
        field3448++;
        int var2 = arg1.field4597;
        class37 var3 = arg1.method533(-1);
        if (arg0 != -95) {
            method1379((byte) -82, (class288) null);
        }
        if (arg1.field1421 == var3.field531) {
            var2 = arg1.field4583;
        } else if (arg1.field1421 == var3.field540 || arg1.field1421 == var3.field534 || arg1.field1421 == var3.field549 || arg1.field1421 == var3.field519) {
            var2 = arg1.field4587;
        } else if (arg1.field1421 == var3.field551 || arg1.field1421 == var3.field525 || arg1.field1421 == var3.field542 || arg1.field1421 == var3.field541) {
            var2 = arg1.field4576;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public final void method1380(boolean arg0) {
        field3444++;
        if (this.field3453) {
            return;
        }
        synchronized (this) {
            this.field3453 = arg0;
            this.notifyAll();
        }
        if (this.field3466 != null) {
            while (this.field3466.field2857 == 0) {
                class245.method1636(false, 1L);
            }
            if (this.field3466.field2857 == 1) {
                try {
                    ((Thread) this.field3466.field2859).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3466 = null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
    public static void method1381(boolean arg0) {
        field3455 = null;
        field3450 = null;
        field3449 = null;
        if (arg0) {
            method1389((String) null, 101);
        }
    }

    @OriginalMember(owner = "client!wc", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3473 == this.field3468) {
                            if (this.field3453) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3468;
                        if (this.field3468 <= this.field3473) {
                            var3 = this.field3473 - this.field3468;
                        } else {
                            var3 = 5000 - this.field3468;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3467.write(this.field3460, var2, var3);
                    } catch (IOException var9) {
                        this.field3471 = true;
                    }
                    this.field3468 = (this.field3468 + var3) % 5000;
                    try {
                        if (this.field3473 == this.field3468) {
                            this.field3467.flush();
                        }
                    } catch (IOException var8) {
                        this.field3471 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3452 != null) {
                        this.field3452.close();
                    }
                    if (this.field3467 != null) {
                        this.field3467.close();
                    }
                    if (this.field3458 != null) {
                        this.field3458.close();
                    }
                } catch (IOException var7) {
                }
                this.field3460 = null;
                break;
            }
        } catch (Exception var12) {
            class254.method1684(122, var12, (String) null);
        }
        field3446++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BIIB)V")
    public final void method1382(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field3454++;
        if (arg3 >= -27 || this.field3453) {
            return;
        }
        if (this.field3471) {
            this.field3471 = false;
            throw new IOException();
        }
        if (this.field3460 == null) {
            this.field3460 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field3460[this.field3473] = arg0[arg2 + var6];
                this.field3473 = (this.field3473 + 1) % 5000;
                if (((this.field3468 + 4900) % 5000) == this.field3473) {
                    throw new IOException();
                }
            }
            if (this.field3466 == null) {
                this.field3466 = this.field3445.method917(3, (byte) 122, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public final void method1383(byte arg0) {
        field3463++;
        if (this.field3453) {
            return;
        }
        this.field3452 = new class190();
        if (arg0 != -42) {
            field3455 = null;
        }
        this.field3467 = new class263();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)I")
    public static final int method1384(int arg0, boolean arg1) {
        if (arg1) {
            return 2;
        } else {
            field3456++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public final void method1385(int arg0) throws IOException {
        field3459++;
        if (!this.field3453 && arg0 == 30186 && this.field3471) {
            this.field3471 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Z)I")
    public final int method1386(boolean arg0) throws IOException {
        field3472++;
        if (arg0) {
            return this.field3453 ? 0 : this.field3452.available();
        } else {
            return -4;
        }
    }

    @OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1380(true);
        field3470++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLvh;II)Lfc;")
    public static final class148 method1387(byte arg0, class108 arg1, int arg2, int arg3) {
        field3457++;
        if (class127.method876(arg3, arg1, arg2, -8635)) {
            if (arg0 >= -43) {
                field3455 = null;
            }
            return class210.method1409(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Llc;")
    public static final class290 method1388(int arg0, int arg1) {
        field3451++;
        class290 var2 = (class290) class163.field2694.method57((long) arg1, -78);
        if (var2 != null) {
            return var2;
        }
        int var3 = -82 % ((arg0 - 24) / 55);
        byte[] var4 = class78.field1336.method746(arg1, (byte) -128, 30);
        class290 var5 = new class290();
        if (var4 != null) {
            var5.method1956(arg1, new class101(var4), false);
        }
        class163.field2694.method62(0, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1389(String arg0, int arg1) {
        field3465++;
        int var2 = arg0.length();
        if (arg1 != 29779) {
            field3455 = null;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) - (var3 - (long) arg0.charAt(var5));
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[BZ)V")
    public final void method1390(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field3447++;
        if (this.field3453) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field3452.read(arg2, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg1 += var5;
        }
        if (!arg3) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/net/Socket;Lvb;)V")
    public class207(Socket arg0, class131 arg1) throws IOException {
        this.field3445 = arg1;
        this.field3458 = arg0;
        this.field3458.setSoTimeout(30000);
        this.field3458.setTcpNoDelay(true);
        this.field3452 = this.field3458.getInputStream();
        this.field3467 = this.field3458.getOutputStream();
    }
}
