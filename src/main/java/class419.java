import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class419 implements Runnable {

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "Z")
    private boolean field5261 = false;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    private int field5268 = 0;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "Z")
    private boolean field5273 = false;

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "I")
    private int field5271 = 0;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "Lrj;")
    private class648 field5263;

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "Ljava/net/Socket;")
    private Socket field5280;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field5264;

    @OriginalMember(owner = "client!rfa", name = "w", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5277;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "Lwea;")
    public static class259 field5270 = new class259(0, 1);

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "[Lcv;")
    public static class635[] field5272 = new class635[35];

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "Ldt;")
    public static class223 field5255;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "Lvfa;")
    private class264 field5259;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "Lvfa;")
    public static class264 field5260;

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "Ltw;")
    public static class588 field5274;

    @OriginalMember(owner = "client!rfa", name = "x", descriptor = "[B")
    private byte[] field5278;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V", line = 6)
    public static final void method2230(int arg0, int arg1, int arg2) {
        field5269++;
        int var3 = class546.field7269.method3269((byte) 99, class83.field1132.method476((byte) 71, class250.field3068));
        for (class145 var4 = (class145) class1.field7.method237(arg2 + 11488); var4 != null; var4 = (class145) class1.field7.method245((byte) 88)) {
            int var8 = class199.method1205(arg2 + 36709, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        if (arg2 != -11387) {
            field5272 = null;
        }
        int var5 = class463.field5904 * 16 + 21;
        int var6 = arg0 - var3 / 2;
        if (var3 + var6 > class523.field7111) {
            var6 = class523.field7111 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (class244.field3022 < arg1 + var5) {
            var7 = class244.field3022 - var5;
        }
        class219.field2680 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class672.field9461 = var3;
        class50.field720 = (class9.field186 ? 26 : 22) + class463.field5904 * 16;
        class84.field1188 = true;
        class88.field1231 = var7;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)I", line = 58)
    public final int method2231(int arg0) throws IOException {
        field5258++;
        if (arg0 != 12410) {
            this.field5277 = null;
        }
        return this.field5261 ? 0 : this.field5264.read();
    }

    @OriginalMember(owner = "client!rfa", name = "run", descriptor = "()V", line = 73)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field5271 == this.field5268) {
                            if (this.field5261) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field5268;
                        if (this.field5271 >= this.field5268) {
                            var3 = this.field5271 - this.field5268;
                        } else {
                            var3 = 5000 - this.field5268;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field5277.write(this.field5278, var2, var3);
                    } catch (IOException var9) {
                        this.field5273 = true;
                    }
                    this.field5268 = (this.field5268 + var3) % 5000;
                    try {
                        if (this.field5271 == this.field5268) {
                            this.field5277.flush();
                        }
                    } catch (IOException var8) {
                        this.field5273 = true;
                    }
                    continue;
                }
                try {
                    if (this.field5264 != null) {
                        this.field5264.close();
                    }
                    if (this.field5277 != null) {
                        this.field5277.close();
                    }
                    if (this.field5280 != null) {
                        this.field5280.close();
                    }
                } catch (IOException var7) {
                }
                this.field5278 = null;
                break;
            }
        } catch (Exception var12) {
            class106.method597(null, -2, var12);
        }
        field5257++;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V", line = 143)
    public final void method2232(int arg0) {
        field5265++;
        if (this.field5261) {
            return;
        }
        this.field5264 = new class558();
        if (arg0 != 35) {
            field5274 = null;
        }
        this.field5277 = new class348();
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IJ)V", line = 165)
    public static final void method2233(int arg0, long arg1) {
        field5275++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class233.method1400(arg1 - 1L, (byte) -103);
            class233.method1400(1L, (byte) -122);
        } else {
            class233.method1400(arg1, (byte) -90);
        }
        if (arg0 != -28448) {
            method2235(49);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Ljava/net/Socket;Lrj;)V", line = 392)
    public class419(Socket arg0, class648 arg1) throws IOException {
        this.field5263 = arg1;
        this.field5280 = arg0;
        this.field5280.setSoTimeout(30000);
        this.field5280.setTcpNoDelay(true);
        this.field5264 = this.field5280.getInputStream();
        this.field5277 = this.field5280.getOutputStream();
    }

    @OriginalMember(owner = "client!rfa", name = "finalize", descriptor = "()V", line = 190)
    protected final void finalize() {
        this.method2237((byte) 61);
        field5256++;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[BII)V", line = 198)
    public final void method2234(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field5276++;
        if (this.field5261) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field5264.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg2 -= var5;
        }
        if (arg3 != 14216) {
            this.field5280 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)V", line = 231)
    public static void method2235(int arg0) {
        field5270 = null;
        if (arg0 != 0) {
            method2230(-8, -40, 90);
        }
        field5260 = null;
        field5255 = null;
        field5274 = null;
        field5272 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIB[B)V", line = 251)
    public final void method2236(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field5262++;
        if (this.field5261) {
            return;
        }
        if (this.field5273) {
            this.field5273 = false;
            throw new IOException();
        }
        if (this.field5278 == null) {
            this.field5278 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field5278[this.field5271] = arg3[arg1 + var6];
                this.field5271 = (this.field5271 + 1) % 5000;
                if ((this.field5268 + 4900) % 5000 == this.field5271) {
                    throw new IOException();
                }
            }
            if (arg2 > -36) {
                this.finalize();
            }
            if (this.field5259 == null) {
                this.field5259 = this.field5263.method3626(3, this, 0);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V", line = 310)
    public final void method2237(byte arg0) {
        field5279++;
        if (this.field5261) {
            return;
        }
        synchronized (this) {
            this.field5261 = true;
            if (arg0 != 61) {
                return;
            }
            this.notifyAll();
        }
        if (this.field5259 != null) {
            while (this.field5259.field3358 == 0) {
                method2233(-28448, 1L);
            }
            if (this.field5259.field3358 == 1) {
                try {
                    ((Thread) this.field5259.field3356).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field5259 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)V", line = 348)
    public final void method2238(byte arg0) throws IOException {
        if (arg0 != 17) {
            this.field5278 = null;
        }
        field5267++;
        if (!this.field5261 && this.field5273) {
            this.field5273 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)I", line = 372)
    public final int method2239(int arg0) throws IOException {
        field5266++;
        if (this.field5261) {
            return 0;
        } else if (arg0 == -22874) {
            return this.field5264.available();
        } else {
            return 112;
        }
    }
}
