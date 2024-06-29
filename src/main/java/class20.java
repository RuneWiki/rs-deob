import java.awt.Frame;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class20 implements Runnable {

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    private int field341 = 0;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Z")
    private boolean field351 = false;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Z")
    private boolean field347 = false;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    private int field358 = 0;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field342;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lth;")
    private class239 field344;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field346;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field352;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lub;")
    public static class227 field338 = class257.method1749(")1", 17263);

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lub;")
    public static class227 field343 = class257.method1749("<img=0>", 17263);

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
    public static int[] field360 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!a", name = "l", descriptor = "F")
    public static float field345;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Ln;")
    public static class138 field337;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Lbe;")
    private class74 field357;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Ljava/awt/Frame;")
    public static Frame field359;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[B")
    private byte[] field335;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
    public static int[] field348;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[[[I")
    public static int[][][] field356;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method92(int arg0) {
        field354++;
        if (arg0 != 18407) {
            return;
        }
        for (int var1 = -1; var1 < class146.field2512; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class15.field278[var1];
            }
            class225 var3 = class27.field446[var2];
            if (var3 != null) {
                class116.method733(-18677585, var3, var3.field45);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
    public final int method93(int arg0) throws IOException {
        field339++;
        if (this.field351) {
            return 0;
        } else if (arg0 == 0) {
            return this.field346.available();
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB[BI)V")
    public final void method94(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field355++;
        if (this.field351) {
            return;
        }
        if (this.field347) {
            this.field347 = false;
            throw new IOException();
        }
        if (this.field335 == null) {
            this.field335 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field335[this.field358] = arg2[arg3 + var6];
                this.field358 = (this.field358 + 1) % 5000;
                if (((this.field341 + 4900) % 5000) == this.field358) {
                    throw new IOException();
                }
            }
            if (this.field357 == null) {
                this.field357 = this.field344.method1596(3, 0, this);
            }
            if (arg1 != -24) {
                this.finalize();
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field358 == this.field341) {
                            if (this.field351) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field341;
                        if (this.field358 < this.field341) {
                            var3 = 5000 - this.field341;
                        } else {
                            var3 = this.field358 - this.field341;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field352.write(this.field335, var2, var3);
                    } catch (IOException var9) {
                        this.field347 = true;
                    }
                    this.field341 = (this.field341 + var3) % 5000;
                    try {
                        if (this.field358 == this.field341) {
                            this.field352.flush();
                        }
                    } catch (IOException var8) {
                        this.field347 = true;
                    }
                    continue;
                }
                try {
                    if (this.field346 != null) {
                        this.field346.close();
                    }
                    if (this.field352 != null) {
                        this.field352.close();
                    }
                    if (this.field342 != null) {
                        this.field342.close();
                    }
                } catch (IOException var7) {
                }
                this.field335 = null;
                break;
            }
        } catch (Exception var12) {
            class149.method949((String) null, var12, -106);
        }
        field336++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static void method95(boolean arg0) {
        field337 = null;
        field343 = null;
        field338 = null;
        if (arg0) {
            method92(18);
        }
        field359 = null;
        field360 = null;
        field348 = null;
        field356 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
    public static final void method96(int arg0, byte arg1) {
        field340++;
        int var2 = -50 / ((arg1 + 69) / 39);
        class7.field150.method1727(true, arg0);
        class96.field1681.method1727(true, arg0);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public final void method97(int arg0) {
        field350++;
        if (this.field351) {
            return;
        }
        synchronized (this) {
            this.field351 = true;
            this.notifyAll();
        }
        if (this.field357 != null) {
            while (this.field357.field1302 == 0) {
                class171.method1088(84, 1L);
            }
            if (this.field357.field1302 == 1) {
                try {
                    ((Thread) this.field357.field1299).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field357 = null;
        if (arg0 != 0) {
            this.field347 = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)I")
    public final int method98(byte arg0) throws IOException {
        field353++;
        if (this.field351) {
            return 0;
        } else {
            if (arg0 != 82) {
                this.finalize();
            }
            return this.field346.read();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[BI)V")
    public final void method99(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field349++;
        int var5 = -40 / ((38 - arg3) / 57);
        if (this.field351) {
            return;
        }
        while (arg0 > 0) {
            int var6 = this.field346.read(arg2, arg1, arg0);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg1 += var6;
            arg0 -= var6;
        }
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method97(0);
        field334++;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/net/Socket;Lth;)V")
    public class20(Socket arg0, class239 arg1) throws IOException {
        this.field342 = arg0;
        this.field344 = arg1;
        this.field342.setSoTimeout(30000);
        this.field342.setTcpNoDelay(true);
        this.field346 = this.field342.getInputStream();
        this.field352 = this.field342.getOutputStream();
    }
}
