import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class247 implements Runnable {

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Z")
    private boolean field4005 = false;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    private int field3999 = 0;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    private int field4010 = 0;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Z")
    private boolean field4011 = false;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "Lpb;")
    private class2 field4021;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field4001;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "Ljava/io/InputStream;")
    private InputStream field4018;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4007;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field4006 = 0;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Lqu;")
    public static class219 field4015 = new class219(32, 8);

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "Lss;")
    public static class213 field4019 = new class213("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field4022 = 0;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "Z")
    public static boolean field4024 = false;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Ljl;")
    private class495 field4000;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "[B")
    private byte[] field4004;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "[Lo;")
    public static class139[] field4025;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BBI)V")
    public final void method1706(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        int var5 = 67 / ((arg2 + 64) / 42);
        field4003++;
        if (this.field4005) {
            return;
        }
        while (arg3 > 0) {
            int var6 = this.field4018.read(arg1, arg0, arg3);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg0 += var6;
            arg3 -= var6;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BII)V")
    public final void method1707(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4014++;
        if (this.field4005 || arg0 > -42) {
            return;
        }
        if (this.field4011) {
            this.field4011 = false;
            throw new IOException();
        }
        if (this.field4004 == null) {
            this.field4004 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field4004[this.field3999] = arg1[arg3 + var6];
                this.field3999 = (this.field3999 + 1) % 5000;
                if (((this.field4010 + 4900) % 5000) == this.field3999) {
                    throw new IOException();
                }
            }
            if (this.field4000 == null) {
                this.field4000 = this.field4021.method7(this, (byte) 108, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public final void method1708(int arg0) {
        field4012++;
        if (!this.field4005 && arg0 == 5000) {
            this.field4018 = new class241();
            this.field4007 = new class360();
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public final void method1709(int arg0) throws IOException {
        field4016++;
        if (this.field4005) {
            return;
        }
        if (this.field4011) {
            this.field4011 = false;
            throw new IOException();
        } else if (arg0 != 0) {
            this.method1708(72);
        }
    }

    @OriginalMember(owner = "client!hl", name = "run", descriptor = "()V")
    public final void run() {
        field4017++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4010 == this.field3999) {
                        if (this.field4005) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field3999 >= this.field4010) {
                        var2 = this.field3999 - this.field4010;
                    } else {
                        var2 = 5000 - this.field4010;
                    }
                    var3 = this.field4010;
                }
                if (var2 > 0) {
                    try {
                        this.field4007.write(this.field4004, var3, var2);
                    } catch (IOException var9) {
                        this.field4011 = true;
                    }
                    this.field4010 = (this.field4010 + var2) % 5000;
                    try {
                        if (this.field4010 == this.field3999) {
                            this.field4007.flush();
                        }
                    } catch (IOException var8) {
                        this.field4011 = true;
                    }
                }
            }
            try {
                if (this.field4018 != null) {
                    this.field4018.close();
                }
                if (this.field4007 != null) {
                    this.field4007.close();
                }
                if (this.field4001 != null) {
                    this.field4001.close();
                }
            } catch (IOException var7) {
            }
            this.field4004 = null;
        } catch (Exception var12) {
            class80.method575(var12, null, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
    public static void method1710(int arg0) {
        field4019 = null;
        field4015 = null;
        int var1 = -59 / ((-arg0 - 25) / 47);
        field4025 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public final void method1711(byte arg0) {
        field4013++;
        if (this.field4005) {
            return;
        }
        synchronized (this) {
            this.field4005 = true;
            this.notifyAll();
        }
        int var3 = -98 % ((67 - arg0) / 35);
        if (this.field4000 != null) {
            while (this.field4000.field7458 == 0) {
                class208.method1464((byte) -127, 1L);
            }
            if (this.field4000.field7458 == 1) {
                try {
                    ((Thread) this.field4000.field7462).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field4000 = null;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)I")
    public final int method1712(int arg0) throws IOException {
        field4008++;
        if (arg0 != 0) {
            this.field4018 = null;
        }
        return this.field4005 ? 0 : this.field4018.available();
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)V")
    public static final void method1713(int arg0) {
        class454.field7026 = arg0;
        class148.field1999 = 0;
        field4009++;
        class535.field7842 = -1;
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)I")
    public final int method1714(int arg0) throws IOException {
        field4020++;
        if (this.field4005) {
            return 0;
        } else {
            if (arg0 < 83) {
                field4022 = 41;
            }
            return this.field4018.read();
        }
    }

    @OriginalMember(owner = "client!hl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1711((byte) 108);
        field4002++;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/net/Socket;Lpb;)V")
    public class247(Socket arg0, class2 arg1) throws IOException {
        this.field4021 = arg1;
        this.field4001 = arg0;
        this.field4001.setSoTimeout(30000);
        this.field4001.setTcpNoDelay(true);
        this.field4018 = this.field4001.getInputStream();
        this.field4007 = this.field4001.getOutputStream();
    }
}
