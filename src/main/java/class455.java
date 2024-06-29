import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class455 implements Runnable {

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Z")
    private boolean field6430 = false;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    private int field6432 = 0;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Z")
    private boolean field6434 = false;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    private int field6441 = 0;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field6443;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Llp;")
    private class331 field6436;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field6440;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6427;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lqo;")
    private class21 field6429;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "[B")
    private byte[] field6438;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[Lkt;")
    public static class138[] field6428;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public final void method2761(byte arg0) {
        field6444++;
        if (this.field6434) {
            return;
        }
        synchronized (this) {
            if (arg0 <= 21) {
                return;
            }
            this.field6434 = true;
            this.notifyAll();
        }
        if (this.field6429 != null) {
            while (this.field6429.field202 == 0) {
                class236.method1513(true, 1L);
            }
            if (this.field6429.field202 == 1) {
                try {
                    ((Thread) this.field6429.field201).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field6429 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)I")
    public final int method2762(int arg0) throws IOException {
        field6439++;
        if (this.field6434) {
            return 0;
        } else {
            if (arg0 != 13074) {
                this.field6427 = null;
            }
            return this.field6440.available();
        }
    }

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
    public final void run() {
        field6435++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field6441 == this.field6432) {
                        if (this.field6434) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field6432;
                    if (this.field6432 <= this.field6441) {
                        var3 = this.field6441 - this.field6432;
                    } else {
                        var3 = 5000 - this.field6432;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field6427.write(this.field6438, var2, var3);
                    } catch (IOException var9) {
                        this.field6430 = true;
                    }
                    this.field6432 = (this.field6432 + var3) % 5000;
                    try {
                        if (this.field6441 == this.field6432) {
                            this.field6427.flush();
                        }
                    } catch (IOException var8) {
                        this.field6430 = true;
                    }
                }
            }
            try {
                if (this.field6440 != null) {
                    this.field6440.close();
                }
                if (this.field6427 != null) {
                    this.field6427.close();
                }
                if (this.field6443 != null) {
                    this.field6443.close();
                }
            } catch (IOException var7) {
            }
            this.field6438 = null;
        } catch (Exception var12) {
            class378.method2255(var12, null, -74);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)I")
    public final int method2763(boolean arg0) throws IOException {
        if (arg0) {
            field6431++;
            return this.field6434 ? 0 : this.field6440.read();
        } else {
            return -124;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public final void method2764(byte arg0) throws IOException {
        if (arg0 != -98) {
            return;
        }
        field6437++;
        if (!this.field6434 && this.field6430) {
            this.field6430 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)V")
    public final void method2765(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field6426++;
        if (this.field6434) {
            return;
        }
        if (this.field6430) {
            this.field6430 = false;
            throw new IOException();
        }
        if (this.field6438 == null) {
            this.field6438 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 118 / ((arg0 - 13) / 60);
            for (int var7 = 0; var7 < arg2; var7++) {
                this.field6438[this.field6441] = arg3[arg1 + var7];
                this.field6441 = (this.field6441 + 1) % 5000;
                if (((this.field6432 + 4900) % 5000) == this.field6441) {
                    throw new IOException();
                }
            }
            if (this.field6429 == null) {
                this.field6429 = this.field6436.method2004(1406, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
    public static final void method2766(byte arg0) {
        class389.field5376 = new class583(class137.field1958.method3408(78, class63.field795), "", class574.field8454, 1001, -1, 0L, 0, 0, true, false);
        if (arg0 != -111) {
            method2768(55, (byte) 12, 33);
        }
        field6425++;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public final void method2767(int arg0) {
        field6433++;
        if (!this.field6434 && arg0 == 0) {
            this.field6440 = new class104();
            this.field6427 = new class185();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBI)V")
    public static final void method2768(int arg0, byte arg1, int arg2) {
        field6423++;
        if (arg1 > -25) {
            method2766((byte) 45);
        }
        class221 var3 = class65.method413(16, arg0, (byte) -96);
        var3.method1426((byte) 28);
        var3.field3214 = arg2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[BII)V")
    public final void method2769(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6442++;
        if (this.field6434 || arg2 != -2) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field6440.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2761((byte) 51);
        field6424++;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljava/net/Socket;Llp;)V")
    public class455(Socket arg0, class331 arg1) throws IOException {
        this.field6443 = arg0;
        this.field6436 = arg1;
        this.field6443.setSoTimeout(30000);
        this.field6443.setTcpNoDelay(true);
        this.field6440 = this.field6443.getInputStream();
        this.field6427 = this.field6443.getOutputStream();
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V")
    public static void method2770(boolean arg0) {
        if (!arg0) {
            field6428 = null;
        }
        field6428 = null;
    }
}
