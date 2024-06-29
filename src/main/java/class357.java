import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class357 implements Runnable {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
    private boolean field4559 = false;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "Z")
    private boolean field4573 = false;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    private int field4571 = 0;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    private int field4577 = 0;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field4572;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "Lgh;")
    private class546 field4580;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "Ljava/io/InputStream;")
    private InputStream field4581;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4562;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    private int field4579;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "Lpia;")
    public static class94 field4582 = new class94(57, 7);

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "Lsb;")
    private class290 field4564;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "[B")
    private byte[] field4561;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)Z", line = 9)
    public static final boolean method2097(int arg0, byte arg1, int arg2) {
        field4563++;
        if (arg1 > -16) {
            field4582 = null;
        }
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ljava/net/Socket;Lgh;I)V", line = 422)
    public class357(Socket arg0, class546 arg1, int arg2) throws IOException {
        this.field4572 = arg0;
        this.field4580 = arg1;
        this.field4572.setSoTimeout(30000);
        this.field4572.setTcpNoDelay(true);
        this.field4581 = this.field4572.getInputStream();
        this.field4562 = this.field4572.getOutputStream();
        this.field4579 = arg2;
    }

    @OriginalMember(owner = "client!ws", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() {
        this.method2099((byte) -125);
        field4578++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)I", line = 34)
    public final int method2098(byte arg0) throws IOException {
        if (arg0 > -126) {
            this.method2099((byte) -107);
        }
        field4575++;
        return this.field4573 ? 0 : this.field4581.read();
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V", line = 48)
    public final void method2099(byte arg0) {
        field4570++;
        if (this.field4573) {
            return;
        }
        if (arg0 >= -101) {
            this.field4571 = -39;
        }
        synchronized (this) {
            this.field4573 = true;
            this.notifyAll();
        }
        if (this.field4564 != null) {
            while (this.field4564.field3573 == 0) {
                class524.method3076(1, 1L);
            }
            if (this.field4564.field3573 == 1) {
                try {
                    ((Thread) this.field4564.field3577).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4564 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 84)
    public static void method2100(int arg0) {
        if (arg0 > -52) {
            field4583 = 16;
        }
        field4582 = null;
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)V", line = 95)
    public final void method2101(byte arg0) {
        field4566++;
        if (this.field4573) {
            return;
        }
        if (arg0 < 14) {
            this.run();
        }
        this.field4581 = new class297();
        this.field4562 = new class108();
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(B)I", line = 115)
    public final int method2102(byte arg0) throws IOException {
        field4567++;
        if (this.field4573) {
            return 0;
        } else {
            if (arg0 != -121) {
                this.field4579 = -57;
            }
            return this.field4581.available();
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([BIII)V", line = 131)
    public final void method2103(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4568++;
        if (this.field4573) {
            return;
        }
        if (this.field4559) {
            this.field4559 = false;
            throw new IOException();
        }
        int var5 = -69 % ((arg1 - 69) / 57);
        if (this.field4561 == null) {
            this.field4561 = new byte[this.field4579];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg2; var7++) {
                this.field4561[this.field4571] = arg0[arg3 + var7];
                this.field4571 = (this.field4571 + 1) % this.field4579;
                if ((this.field4579 + this.field4577 - 100) % this.field4579 == this.field4571) {
                    throw new IOException();
                }
            }
            if (this.field4564 == null) {
                this.field4564 = this.field4580.method3215(3, this, 2);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I[BZI)V", line = 187)
    public final void method2104(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        if (arg2) {
            this.method2101((byte) -11);
        }
        field4574++;
        if (this.field4573) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field4581.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V", line = 213)
    public final void method2105(boolean arg0) throws IOException {
        field4560++;
        if (this.field4573) {
            return;
        }
        if (this.field4559) {
            this.field4559 = false;
            throw new IOException();
        } else if (arg0) {
            this.field4577 = 29;
        }
    }

    @OriginalMember(owner = "client!ws", name = "run", descriptor = "()V", line = 235)
    public final void run() {
        field4576++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4577 == this.field4571) {
                        if (this.field4573) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field4577 > this.field4571) {
                        var2 = this.field4579 - this.field4577;
                    } else {
                        var2 = this.field4571 - this.field4577;
                    }
                    var3 = this.field4577;
                }
                if (var2 > 0) {
                    try {
                        this.field4562.write(this.field4561, var3, var2);
                    } catch (IOException var9) {
                        this.field4559 = true;
                    }
                    this.field4577 = (this.field4577 + var2) % this.field4579;
                    try {
                        if (this.field4577 == this.field4571) {
                            this.field4562.flush();
                        }
                    } catch (IOException var8) {
                        this.field4559 = true;
                    }
                }
            }
            try {
                if (this.field4581 != null) {
                    this.field4581.close();
                }
                if (this.field4562 != null) {
                    this.field4562.close();
                }
                if (this.field4572 != null) {
                    this.field4572.close();
                }
            } catch (IOException var7) {
            }
            this.field4561 = null;
        } catch (Exception var12) {
            class151.method936(null, var12, 67);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILefa;[I)V", line = 306)
    public static final void method2106(int arg0, int arg1, class183 arg2, int[] arg3) {
        field4569++;
        if (arg1 < 97) {
            return;
        }
        if (arg2.field7152 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field7152.length; var5++) {
                if (arg2.field7152[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field7145 != -1) {
                class25 var6 = class637.field9158.method1905(111, arg2.field7145);
                int var7 = var6.field250;
                if (var7 == 1) {
                    arg2.field7161 = 0;
                    arg2.field7115 = 0;
                    arg2.field7132 = arg0;
                    arg2.field7074 = 1;
                    arg2.field7089 = 0;
                    if (!arg2.field7108) {
                        class629.method3607(arg2, var6, -127, arg2.field7089);
                    }
                }
                if (var7 == 2) {
                    arg2.field7161 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg2.field7152 == null || arg2.field7152[var9] == -1 || class637.field9158.method1905(81, arg3[var9]).field272 >= class637.field9158.method1905(114, arg2.field7152[var9]).field272) {
                arg2.field7152 = arg3;
                arg2.field7132 = arg0;
                break;
            }
        }
        if (var8) {
            arg2.field7152 = arg3;
            arg2.field7132 = arg0;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([BB)Ljava/lang/String;", line = 395)
    public static final String method2107(byte[] arg0, byte arg1) {
        field4565++;
        if (arg1 <= 126) {
            method2107(null, (byte) -64);
        }
        return class78.method553(0, arg0, arg0.length, -1);
    }
}
