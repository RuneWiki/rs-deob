import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Z")
    private boolean field467 = false;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    private int field460 = 0;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Z")
    private boolean field471 = false;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    private int field474 = 0;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lb;")
    private class81 field470;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field463;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "Ljava/io/InputStream;")
    private InputStream field481;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field478;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Ljd;")
    public static class85 field458 = class221.method1499("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", (byte) 112);

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Ljd;")
    public static class85 field464 = class221.method1499(" ", (byte) -86);

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Z")
    public static boolean field475 = true;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Lpa;")
    public static class204 field472 = new class204(16);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "Ljb;")
    public static class255 field482;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Lge;")
    public static class68 field477;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lhj;")
    private class69 field459;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "[B")
    private byte[] field483;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
    public static int[] field479;

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method218(121);
        field469++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public static final void method211(int arg0, int arg1) {
        class114.field2051 = new int[arg1];
        class142.field2454 = new int[arg1];
        class5.field60 = new int[arg1];
        field461++;
        class182.field3107 = new int[arg1];
        class215.field3775 = new int[arg1];
        if (arg0 != 0) {
            method211(-74, -24);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)I")
    public final int method212(byte arg0) throws IOException {
        int var2 = -52 / ((arg0 + 77) / 44);
        field466++;
        return this.field471 ? 0 : this.field481.available();
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)I")
    public final int method213(int arg0) throws IOException {
        if (arg0 != -1588) {
            this.field467 = true;
        }
        field462++;
        return this.field471 ? 0 : this.field481.read();
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field474 == this.field460) {
                            if (this.field471) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field460;
                        if (this.field460 > this.field474) {
                            var3 = 5000 - this.field460;
                        } else {
                            var3 = this.field474 - this.field460;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field478.write(this.field483, var2, var3);
                    } catch (IOException var9) {
                        this.field467 = true;
                    }
                    this.field460 = (this.field460 + var3) % 5000;
                    try {
                        if (this.field474 == this.field460) {
                            this.field478.flush();
                        }
                    } catch (IOException var8) {
                        this.field467 = true;
                    }
                    continue;
                }
                try {
                    if (this.field481 != null) {
                        this.field481.close();
                    }
                    if (this.field478 != null) {
                        this.field478.close();
                    }
                    if (this.field463 != null) {
                        this.field463.close();
                    }
                } catch (IOException var7) {
                }
                this.field483 = null;
                break;
            }
        } catch (Exception var12) {
            class201.method1379(var12, (String) null, 2552);
        }
        field476++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BIIB)V")
    public final void method214(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field465++;
        if (this.field471) {
            return;
        }
        if (this.field467) {
            this.field467 = false;
            throw new IOException();
        }
        if (this.field483 == null) {
            this.field483 = new byte[5000];
        }
        synchronized (this) {
            if (arg3 == 15) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field483[this.field474] = arg0[arg2 + var6];
                    this.field474 = (this.field474 + 1) % 5000;
                    if ((this.field460 + 4900) % 5000 == this.field474) {
                        throw new IOException();
                    }
                }
                if (this.field459 == null) {
                    this.field459 = this.field470.method555(-26915, 3, this);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static void method215(byte arg0) {
        field472 = null;
        field477 = null;
        field464 = null;
        field482 = null;
        if (arg0 >= -85) {
            field482 = null;
        }
        field479 = null;
        field458 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BIII)V")
    public final void method216(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field468++;
        if (arg3 != 0 || this.field471) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field481.read(arg0, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lee;")
    public static final class266 method217(boolean arg0) {
        field473++;
        byte[] var1 = class178.field3060[0];
        if (!arg0) {
            return null;
        }
        int var2 = class30.field443[0] * class244.field4165[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class2.field20[class135.method899(255, var1[var4])];
        }
        class266 var5 = new class266(class251.field4331, class229.field3961, class246.field4200[0], class121.field2134[0], class30.field443[0], class244.field4165[0], var3);
        class47.method322(-29493);
        return var5;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public final void method218(int arg0) {
        field480++;
        if (this.field471) {
            return;
        }
        synchronized (this) {
            this.field471 = true;
            this.notifyAll();
        }
        if (this.field459 != null) {
            while (this.field459.field1296 == 0) {
                class190.method1311(1L, 1);
            }
            if (this.field459.field1296 == 1) {
                try {
                    ((Thread) this.field459.field1292).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field459 = null;
        if (arg0 <= 120) {
            this.field459 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/net/Socket;Lb;)V")
    public class31(Socket arg0, class81 arg1) throws IOException {
        this.field470 = arg1;
        this.field463 = arg0;
        this.field463.setSoTimeout(30000);
        this.field463.setTcpNoDelay(true);
        this.field481 = this.field463.getInputStream();
        this.field478 = this.field463.getOutputStream();
    }
}
