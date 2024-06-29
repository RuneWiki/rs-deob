import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class308 implements Runnable {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    private int field4355 = 0;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Z")
    private boolean field4359 = false;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    private int field4366 = 0;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Z")
    private boolean field4369 = false;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Lge;")
    private class711 field4373;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field4360;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field4361;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4371;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    private int field4358;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Ltaa;")
    public static class409 field4367 = new class409(0);

    @OriginalMember(owner = "client!le", name = "w", descriptor = "[I")
    public static int[] field4377 = new int[14];

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Ltj;")
    private class197 field4356;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "[B")
    private byte[] field4370;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)I", line = 4)
    public final int method1945(boolean arg0) throws IOException {
        field4357++;
        if (arg0) {
            return -108;
        } else if (this.field4359) {
            return 0;
        } else {
            return this.field4361.read();
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 20)
    public final void method1946(int arg0) throws IOException {
        field4374++;
        if (arg0 != 1) {
            this.field4358 = -39;
        }
        if (!this.field4359 && this.field4369) {
            this.field4369 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 45)
    public final void method1947(int arg0) {
        field4368++;
        if (!this.field4359 && arg0 == 0) {
            this.field4361 = new class350();
            this.field4371 = new class32();
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/net/Socket;Lge;I)V", line = 297)
    public class308(Socket arg0, class711 arg1, int arg2) throws IOException {
        this.field4373 = arg1;
        this.field4360 = arg0;
        this.field4360.setSoTimeout(30000);
        this.field4360.setTcpNoDelay(true);
        this.field4361 = this.field4360.getInputStream();
        this.field4371 = this.field4360.getOutputStream();
        this.field4358 = arg2;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB[B)V", line = 63)
    public final void method1948(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field4375++;
        if (arg2 != 12 || this.field4359) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field4361.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V", line = 101)
    protected final void finalize() {
        this.method1953((byte) 13);
        field4364++;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 111)
    public static void method1949(int arg0) {
        if (arg0 != 23618) {
            field4367 = null;
        }
        field4367 = null;
        field4377 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[BII)V", line = 126)
    public final void method1950(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4362++;
        if (this.field4359) {
            return;
        }
        if (this.field4369) {
            this.field4369 = false;
            throw new IOException();
        }
        if (this.field4370 == null) {
            this.field4370 = new byte[this.field4358];
        }
        synchronized (this) {
            if (arg3 == 5000) {
                for (int var6 = 0; var6 < arg2; var6++) {
                    this.field4370[this.field4366] = arg1[arg0 + var6];
                    this.field4366 = (this.field4366 + 1) % this.field4358;
                    if ((this.field4355 + this.field4358 - 100) % this.field4358 == this.field4366) {
                        throw new IOException();
                    }
                }
                if (this.field4356 == null) {
                    this.field4356 = this.field4373.method4056(this, arg3 ^ 0x13ED, 3);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "run", descriptor = "()V", line = 177)
    public final void run() {
        field4365++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4366 == this.field4355) {
                        if (this.field4359) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field4355;
                    if (this.field4366 >= this.field4355) {
                        var3 = this.field4366 - this.field4355;
                    } else {
                        var3 = this.field4358 - this.field4355;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field4371.write(this.field4370, var2, var3);
                    } catch (IOException var9) {
                        this.field4369 = true;
                    }
                    this.field4355 = (this.field4355 + var3) % this.field4358;
                    try {
                        if (this.field4366 == this.field4355) {
                            this.field4371.flush();
                        }
                    } catch (IOException var8) {
                        this.field4369 = true;
                    }
                }
            }
            try {
                if (this.field4361 != null) {
                    this.field4361.close();
                }
                if (this.field4371 != null) {
                    this.field4371.close();
                }
                if (this.field4360 != null) {
                    this.field4360.close();
                }
            } catch (IOException var7) {
            }
            this.field4370 = null;
        } catch (Exception var12) {
            class326.method2072(-3753, var12, null);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I", line = 256)
    public final int method1951(byte arg0) throws IOException {
        field4372++;
        if (this.field4359) {
            return 0;
        } else {
            int var2 = -118 / ((arg0 - 58) / 60);
            return this.field4361.available();
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILvd;ZIIII)V", line = 269)
    public static final void method1952(int arg0, class39 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 1) {
            return;
        }
        if (arg0 <= 0) {
            class187.method1308(arg4, arg1, arg3, arg2, arg6, 0);
        } else {
            class758.field10600 = arg4;
            class706.field9945 = arg2;
            class152.field2350 = 1;
            class581.field8257 = arg6;
            class2.field18 = null;
            class347.field5018 = arg3;
            class354.field5152 = arg1;
            class242.field3529 = class520.field7449.method2148((byte) 14) / arg0;
            if (class242.field3529 < 1) {
                class242.field3529 = 1;
            }
        }
        field4376++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V", line = 311)
    public final void method1953(byte arg0) {
        field4363++;
        if (this.field4359) {
            return;
        }
        synchronized (this) {
            if (arg0 != 13) {
                return;
            }
            this.field4359 = true;
            this.notifyAll();
        }
        if (this.field4356 != null) {
            while (this.field4356.field2986 == 0) {
                class277.method1759(1L, -111);
            }
            if (this.field4356.field2986 == 1) {
                try {
                    ((Thread) this.field4356.field2990).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field4356 = null;
    }
}
