import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class580 implements Runnable {

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Z")
    private boolean field8278 = false;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    private int field8280 = 0;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    private int field8281 = 0;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Z")
    private boolean field8261 = false;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field8265;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lae;")
    private class40 field8270;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field8272;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field8279;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "[I")
    public static int[] field8275 = new int[13];

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Leh;")
    public static class226 field8259;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Lei;")
    private class329 field8266;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Lgp;")
    public static class561 field8277;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "[B")
    private byte[] field8282;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[BZ)V", line = 5)
    public final void method3317(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field8274++;
        if (this.field8261) {
            return;
        }
        if (this.field8278) {
            this.field8278 = false;
            throw new IOException();
        }
        if (this.field8282 == null) {
            this.field8282 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field8282[this.field8280] = arg2[arg0 + var6];
                this.field8280 = (this.field8280 + 1) % 5000;
                if (((this.field8281 + 4900) % 5000) == this.field8280) {
                    throw new IOException();
                }
            }
            if (arg3) {
                this.field8270 = null;
            }
            if (this.field8266 == null) {
                this.field8266 = this.field8270.method353(this, 3, false);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 54)
    public final void method3318(byte arg0) throws IOException {
        field8262++;
        if (this.field8261) {
            return;
        }
        int var2 = 31 % ((arg0 + 6) / 32);
        if (this.field8278) {
            this.field8278 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 75)
    public final void method3319(int arg0) {
        field8269++;
        if (arg0 != 5000 || this.field8261) {
            return;
        }
        synchronized (this) {
            this.field8261 = true;
            this.notifyAll();
        }
        if (this.field8266 != null) {
            while (this.field8266.field4739 == 0) {
                class210.method1342(-73, 1L);
            }
            if (this.field8266.field4739 == 1) {
                try {
                    ((Thread) this.field8266.field4737).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field8266 = null;
    }

    @OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V", line = 110)
    protected final void finalize() {
        field8267++;
        this.method3319(5000);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)I", line = 119)
    public final int method3320(byte arg0) throws IOException {
        int var2 = -73 / ((arg0 - 73) / 44);
        field8273++;
        return this.field8261 ? 0 : this.field8272.read();
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I", line = 139)
    public final int method3321(int arg0) throws IOException {
        field8268++;
        int var2 = 109 % ((2 - arg0) / 35);
        return this.field8261 ? 0 : this.field8272.available();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III[B)V", line = 160)
    public final void method3322(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field8271++;
        if (this.field8261) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field8272.read(arg3, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg2 += var5;
        }
        if (arg0 >= -46) {
            this.field8261 = true;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V", line = 185)
    public final void method3323(byte arg0) {
        field8263++;
        if (this.field8261) {
            return;
        }
        this.field8272 = new class93();
        if (arg0 != 60) {
            this.field8266 = null;
        }
        this.field8279 = new class534();
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)V", line = 202)
    public static void method3324(byte arg0) {
        field8277 = null;
        field8259 = null;
        field8275 = null;
        if (arg0 > -52) {
            field8277 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "run", descriptor = "()V", line = 217)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field8281 == this.field8280) {
                            if (this.field8261) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field8281;
                        if (this.field8281 <= this.field8280) {
                            var3 = this.field8280 - this.field8281;
                        } else {
                            var3 = 5000 - this.field8281;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field8279.write(this.field8282, var2, var3);
                    } catch (IOException var9) {
                        this.field8278 = true;
                    }
                    this.field8281 = (this.field8281 + var3) % 5000;
                    try {
                        if (this.field8281 == this.field8280) {
                            this.field8279.flush();
                        }
                    } catch (IOException var8) {
                        this.field8278 = true;
                    }
                    continue;
                }
                try {
                    if (this.field8272 != null) {
                        this.field8272.close();
                    }
                    if (this.field8279 != null) {
                        this.field8279.close();
                    }
                    if (this.field8265 != null) {
                        this.field8265.close();
                    }
                } catch (IOException var7) {
                }
                this.field8282 = null;
                break;
            }
        } catch (Exception var12) {
            class593.method3390(null, var12, 0);
        }
        field8264++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;", line = 287)
    public static final String[] method3325(byte arg0, char arg1, String arg2) {
        field8276++;
        int var3 = class24.method241(arg1, 194, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        if (arg0 != 118) {
            return null;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/net/Socket;Lae;)V", line = 337)
    public class580(Socket arg0, class40 arg1) throws IOException {
        this.field8265 = arg0;
        this.field8270 = arg1;
        this.field8265.setSoTimeout(30000);
        this.field8265.setTcpNoDelay(true);
        this.field8272 = this.field8265.getInputStream();
        this.field8279 = this.field8265.getOutputStream();
    }
}
