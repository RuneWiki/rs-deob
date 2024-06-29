import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class295 implements Runnable {

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    private int field4472 = 0;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "Z")
    private boolean field4470 = false;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    private int field4473 = 0;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Z")
    private boolean field4463 = false;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Ljava/net/Socket;")
    private Socket field4462;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "Lhf;")
    private class260 field4467;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "Ljava/io/InputStream;")
    private InputStream field4477;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4483;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "[F")
    public static float[] field4469 = new float[4];

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "Loe;")
    public static class127 field4474 = new class127(18, 5);

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "Z")
    public static boolean field4478 = false;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "Lkb;")
    public static class467 field4482 = new class467(8);

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "Z")
    public static boolean field4488 = false;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4486 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "Loe;")
    public static class127 field4490 = new class127(26, 2);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "Llf;")
    public static class151 field4487;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "Luu;")
    private class180 field4484;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "Lwa;")
    public static class418 field4485;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "Lit;")
    public static class439 field4480;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "[B")
    private byte[] field4466;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([BIII)V", line = 3)
    public final void method1787(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4471++;
        if (this.field4463) {
            return;
        }
        if (this.field4470) {
            this.field4470 = false;
            throw new IOException();
        }
        if (arg2 != 4900) {
            this.field4470 = false;
        }
        if (this.field4466 == null) {
            this.field4466 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field4466[this.field4472] = arg0[arg1 + var6];
                this.field4472 = (this.field4472 + 1) % 5000;
                if (((this.field4473 + 4900) % 5000) == this.field4472) {
                    throw new IOException();
                }
            }
            if (this.field4484 == null) {
                this.field4484 = this.field4467.method1579(3, this, 2);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[BI)V", line = 57)
    public final void method1788(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4481++;
        if (this.field4463) {
            return;
        }
        if (arg0 != -13205) {
            method1793(30);
        }
        while (arg3 > 0) {
            int var5 = this.field4477.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I", line = 89)
    public final int method1789(int arg0) throws IOException {
        field4468++;
        if (this.field4463) {
            return 0;
        } else {
            if (arg0 != 27683) {
                this.method1790((byte) 53);
            }
            return this.field4477.available();
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 109)
    public final void method1790(byte arg0) {
        field4476++;
        if (this.field4463) {
            return;
        }
        if (arg0 != 50) {
            field4469 = null;
        }
        this.field4477 = new class379();
        this.field4483 = new class300();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z", line = 124)
    public static final boolean method1791(int arg0, int arg1, int arg2) {
        field4475++;
        if (arg1 != 0) {
            field4474 = null;
        }
        return ((arg2 & 0x2000) != 0 | class264.method1609(876, arg2, arg0) | class143.method940(24662, arg2, arg0)) & client.method1171(-117, arg2, arg0);
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/net/Socket;Lhf;)V", line = 341)
    public class295(Socket arg0, class260 arg1) throws IOException {
        this.field4462 = arg0;
        this.field4467 = arg1;
        this.field4462.setSoTimeout(30000);
        this.field4462.setTcpNoDelay(true);
        this.field4477 = this.field4462.getInputStream();
        this.field4483 = this.field4462.getOutputStream();
    }

    @OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V", line = 142)
    protected final void finalize() {
        this.method1795((byte) 125);
        field4465++;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)I", line = 150)
    public final int method1792(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method1790((byte) -70);
        }
        field4489++;
        return this.field4463 ? 0 : this.field4477.read();
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V", line = 167)
    public static void method1793(int arg0) {
        field4482 = null;
        field4490 = null;
        field4485 = null;
        field4487 = null;
        if (arg0 != 5) {
            method1793(113);
        }
        field4480 = null;
        field4469 = null;
        field4474 = null;
        field4486 = null;
    }

    @OriginalMember(owner = "client!bn", name = "run", descriptor = "()V", line = 190)
    public final void run() {
        field4464++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4473 == this.field4472) {
                        if (this.field4463) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field4472 >= this.field4473) {
                        var2 = this.field4472 - this.field4473;
                    } else {
                        var2 = 5000 - this.field4473;
                    }
                    var3 = this.field4473;
                }
                if (var2 > 0) {
                    try {
                        this.field4483.write(this.field4466, var3, var2);
                    } catch (IOException var9) {
                        this.field4470 = true;
                    }
                    this.field4473 = (this.field4473 + var2) % 5000;
                    try {
                        if (this.field4473 == this.field4472) {
                            this.field4483.flush();
                        }
                    } catch (IOException var8) {
                        this.field4470 = true;
                    }
                }
            }
            try {
                if (this.field4477 != null) {
                    this.field4477.close();
                }
                if (this.field4483 != null) {
                    this.field4483.close();
                }
                if (this.field4462 != null) {
                    this.field4462.close();
                }
            } catch (IOException var7) {
            }
            this.field4466 = null;
        } catch (Exception var12) {
            class32.method177(var12, (byte) -51, null);
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V", line = 261)
    public final void method1794(byte arg0) throws IOException {
        field4461++;
        int var2 = -114 / ((arg0 - 39) / 39);
        if (!this.field4463 && this.field4470) {
            this.field4470 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V", line = 296)
    public final void method1795(byte arg0) {
        field4479++;
        if (this.field4463) {
            return;
        }
        if (arg0 <= 121) {
            this.field4473 = -89;
        }
        synchronized (this) {
            this.field4463 = true;
            this.notifyAll();
        }
        if (this.field4484 != null) {
            while (this.field4484.field2802 == 0) {
                class414.method2437(1L, (byte) -122);
            }
            if (this.field4484.field2802 == 1) {
                try {
                    ((Thread) this.field4484.field2803).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4484 = null;
    }
}
