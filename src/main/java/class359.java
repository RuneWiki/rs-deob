import java.awt.Color;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class359 implements Runnable {

    @OriginalMember(owner = "client!as", name = "f", descriptor = "Z")
    private boolean field5313 = false;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    private int field5324 = 0;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "Z")
    private boolean field5310 = false;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    private int field5320 = 0;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "Lde;")
    private class364 field5325;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field5328;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "Ljava/io/InputStream;")
    private InputStream field5331;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5327;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5312 = "green:";

    @OriginalMember(owner = "client!as", name = "z", descriptor = "Ljava/lang/String;")
    public static String field5333 = "flash1:";

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Lvc;")
    private class225 field5321;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "[B")
    private byte[] field5332;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "[I")
    public static int[] field5323;

    @OriginalMember(owner = "client!as", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2360((byte) -32);
        field5308++;
    }

    @OriginalMember(owner = "client!as", name = "run", descriptor = "()V")
    public final void run() {
        field5329++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field5324 == this.field5320) {
                        if (this.field5310) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field5320;
                    if (this.field5324 >= this.field5320) {
                        var3 = this.field5324 - this.field5320;
                    } else {
                        var3 = 5000 - this.field5320;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field5327.write(this.field5332, var2, var3);
                    } catch (IOException var9) {
                        this.field5313 = true;
                    }
                    this.field5320 = (this.field5320 + var3) % 5000;
                    try {
                        if (this.field5324 == this.field5320) {
                            this.field5327.flush();
                        }
                    } catch (IOException var8) {
                        this.field5313 = true;
                    }
                }
            }
            try {
                if (this.field5331 != null) {
                    this.field5331.close();
                }
                if (this.field5327 != null) {
                    this.field5327.close();
                }
                if (this.field5328 != null) {
                    this.field5328.close();
                }
            } catch (IOException var7) {
            }
            this.field5332 = null;
        } catch (Exception var12) {
            class266.method1780(1, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
    public static final void method2358(int arg0, int arg1, int arg2) {
        field5330++;
        class100.field1325[arg2] = arg0;
        if (arg1 != -1) {
            field5323 = null;
        }
        class283 var3 = (class283) class377.field5517.method2826(false, (long) arg2);
        if (var3 == null) {
            class283 var4 = new class283(class98.method768((byte) -84) + 500L);
            class377.field5517.method2815(arg1, (long) arg2, var4);
        } else {
            var3.field4288 = class98.method768((byte) 26) + 500L;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)I")
    public final int method2359(boolean arg0) throws IOException {
        if (arg0) {
            field5311++;
            return this.field5310 ? 0 : this.field5331.available();
        } else {
            return -45;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
    public final void method2360(byte arg0) {
        field5319++;
        if (this.field5310) {
            return;
        }
        synchronized (this) {
            int var3 = 29 % ((arg0 - 19) / 48);
            this.field5310 = true;
            this.notifyAll();
        }
        if (this.field5321 != null) {
            while (this.field5321.field3104 == 0) {
                class31.method245(1L, -100);
            }
            if (this.field5321.field3104 == 1) {
                try {
                    ((Thread) this.field5321.field3105).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field5321 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static final void method2361(int arg0) {
        if (arg0 != 15816) {
            method2364(-120);
        }
        class169.method1128(67, class422.field6138);
        field5326++;
        class274.method1810(class422.field6138, 0);
        if (class303.field4554 != null) {
            class303.field4554.method595(-29701, class422.field6138);
        }
        class195.field2701.method2556(-19821);
        class422.field6138.setBackground(Color.black);
        class264.field3892 = -1;
        class27.method226(class422.field6138, (byte) 68);
        class223.method1457(class422.field6138, 24);
        if (class303.field4554 != null) {
            class303.field4554.method588((byte) -76, class422.field6138);
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
    public final int method2362(int arg0) throws IOException {
        field5317++;
        if (this.field5310) {
            return 0;
        } else {
            if (arg0 != 27648) {
                this.field5327 = null;
            }
            return this.field5331.read();
        }
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
    public final void method2363(int arg0) {
        if (arg0 != -974) {
            field5322 = -55;
        }
        field5315++;
        if (!this.field5310) {
            this.field5331 = new class78();
            this.field5327 = new class210();
        }
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V")
    public static void method2364(int arg0) {
        field5323 = null;
        if (arg0 > -45) {
            field5314 = 68;
        }
        field5312 = null;
        field5333 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "([BIII)V")
    public final void method2365(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5318++;
        if (this.field5310) {
            return;
        }
        if (this.field5313) {
            this.field5313 = false;
            throw new IOException();
        }
        if (this.field5332 == null) {
            this.field5332 = new byte[5000];
        }
        synchronized (this) {
            if (arg2 != 5000) {
                this.finalize();
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field5332[this.field5324] = arg0[arg3 + var6];
                this.field5324 = (this.field5324 + 1) % 5000;
                if (((this.field5320 + 4900) % 5000) == this.field5324) {
                    throw new IOException();
                }
            }
            if (this.field5321 == null) {
                this.field5321 = this.field5325.method2397(this, false, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "([BIII)V")
    public final void method2366(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5309++;
        if (this.field5310) {
            return;
        }
        if (arg1 != 0) {
            this.field5310 = true;
        }
        while (arg3 > 0) {
            int var5 = this.field5331.read(arg0, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V")
    public final void method2367(int arg0) throws IOException {
        field5316++;
        if (arg0 >= -114) {
            this.field5328 = null;
        }
        if (!this.field5310 && this.field5313) {
            this.field5313 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Ljava/net/Socket;Lde;)V")
    public class359(Socket arg0, class364 arg1) throws IOException {
        this.field5325 = arg1;
        this.field5328 = arg0;
        this.field5328.setSoTimeout(30000);
        this.field5328.setTcpNoDelay(true);
        this.field5331 = this.field5328.getInputStream();
        this.field5327 = this.field5328.getOutputStream();
    }
}
