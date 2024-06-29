import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class18 implements Runnable {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Z")
    private boolean field257 = false;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    private int field265 = 0;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Z")
    private boolean field271 = false;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    private int field279 = 0;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field278;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Lqn;")
    private class70 field260;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field270;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field280;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field263 = 52;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "[I")
    public static int[] field281 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "J")
    public static long field272;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "Leba;")
    private class615 field276;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "[B")
    private byte[] field259;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 4)
    public final void method140(int arg0) {
        field268++;
        if (this.field257) {
            return;
        }
        synchronized (this) {
            this.field257 = true;
            if (arg0 > -124) {
                method145(null, null, 10);
            }
            this.notifyAll();
        }
        if (this.field276 != null) {
            while (this.field276.field8321 == 0) {
                class438.method2636(true, 1L);
            }
            if (this.field276.field8321 == 1) {
                try {
                    ((Thread) this.field276.field8318).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field276 = null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/net/Socket;Lqn;I)V", line = 437)
    public class18(Socket arg0, class70 arg1, int arg2) throws IOException {
        this.field278 = arg0;
        this.field260 = arg1;
        this.field278.setSoTimeout(30000);
        this.field278.setTcpNoDelay(true);
        this.field270 = this.field278.getInputStream();
        this.field280 = this.field278.getOutputStream();
        this.field277 = arg2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III[B)V", line = 46)
    public final void method141(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field258++;
        if (this.field257) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field270.read(arg3, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg2 -= var5;
        }
        if (arg1 != 233224196) {
            this.field277 = 88;
        }
    }

    @OriginalMember(owner = "client!qk", name = "run", descriptor = "()V", line = 73)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field279 == this.field265) {
                            if (this.field257) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field279 >= this.field265) {
                            var2 = this.field279 - this.field265;
                        } else {
                            var2 = this.field277 - this.field265;
                        }
                        var3 = this.field265;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field280.write(this.field259, var3, var2);
                    } catch (IOException var9) {
                        this.field271 = true;
                    }
                    this.field265 = (this.field265 + var2) % this.field277;
                    try {
                        if (this.field279 == this.field265) {
                            this.field280.flush();
                        }
                    } catch (IOException var8) {
                        this.field271 = true;
                    }
                    continue;
                }
                try {
                    if (this.field270 != null) {
                        this.field270.close();
                    }
                    if (this.field280 != null) {
                        this.field280.close();
                    }
                    if (this.field278 != null) {
                        this.field278.close();
                    }
                } catch (IOException var7) {
                }
                this.field259 = null;
                break;
            }
        } catch (Exception var12) {
            class664.method3681((byte) 101, null, var12);
        }
        field274++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[BII)V", line = 144)
    public final void method142(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field264++;
        if (this.field257) {
            return;
        }
        if (this.field271) {
            this.field271 = false;
            throw new IOException();
        }
        if (this.field259 == null) {
            this.field259 = new byte[this.field277];
        }
        synchronized (this) {
            for (int var6 = arg3; var6 < arg0; var6++) {
                this.field259[this.field279] = arg1[arg2 + var6];
                this.field279 = (this.field279 + 1) % this.field277;
                if (((this.field277 + this.field265 - 100) % this.field277) == this.field279) {
                    throw new IOException();
                }
            }
            if (this.field276 == null) {
                this.field276 = this.field260.method623(this, 3, arg3 ^ 0xFFFFE9BF);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I", line = 194)
    public final int method143(byte arg0) throws IOException {
        field266++;
        if (this.field257) {
            return 0;
        } else if (arg0 == 87) {
            return this.field270.read();
        } else {
            return 77;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 211)
    public final void method144(boolean arg0) {
        field282++;
        if (arg0) {
            this.field277 = -1;
        }
        if (!this.field257) {
            this.field270 = new class710();
            this.field280 = new class386();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lvw;Ljp;I)Lae;", line = 236)
    public static final class265 method145(class322 arg0, class376 arg1, int arg2) {
        if (arg2 <= 19) {
            return null;
        }
        field261++;
        class265 var3 = new class265(arg0);
        int var4 = arg1.method2398(-1372747256);
        boolean var5 = (var4 & 0x1) != 0;
        boolean var6 = (var4 & 0x2) != 0;
        boolean var7 = (var4 & 0x4) != 0;
        boolean var8 = (var4 & 0x8) != 0;
        if (var5) {
            var3.field3923[0] = arg1.method2359(-1);
            var3.field3928[0] = arg1.method2359(-1);
            if (arg0.field4667 != -1 || arg0.field4688 != -1) {
                var3.field3923[1] = arg1.method2359(-1);
                var3.field3928[1] = arg1.method2359(-1);
            }
            if (arg0.field4624 != -1 || arg0.field4673 != -1) {
                var3.field3923[2] = arg1.method2359(-1);
                var3.field3928[2] = arg1.method2359(-1);
            }
        }
        if (var6) {
            var3.field3922[0] = arg1.method2359(-1);
            var3.field3927[0] = arg1.method2359(-1);
            if (arg0.field4646 != -1 || arg0.field4681 != -1) {
                var3.field3922[1] = arg1.method2359(-1);
                var3.field3927[1] = arg1.method2359(-1);
            }
        }
        if (var7) {
            int var9 = arg1.method2359(-1);
            int[] var10 = new int[] { class440.method2643(15, var9), class440.method2643(var9 >> 4, 15), class440.method2643(15, var9 >> 8), class440.method2643(15, var9 >> 12) };
            for (int var11 = 0; var11 < 4; var11++) {
                if (var10[var11] != 15) {
                    var3.field3926[var10[var11]] = (short) arg1.method2359(-1);
                }
            }
        }
        if (var8) {
            int var12 = arg1.method2398(-1372747256);
            int[] var13 = new int[] { class440.method2643(var12, 15), class440.method2643(253, var12) >> 4 };
            for (int var14 = 0; var14 < 2; var14++) {
                if (var13[var14] != 15) {
                    var3.field3929[var13[var14]] = (short) arg1.method2359(-1);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z", line = 345)
    public static final boolean method146(int arg0, int arg1) {
        field275++;
        if (~arg0 == arg1 || arg0 == 45 || arg0 == 50 || arg0 == 9 || arg0 == 25) {
            return true;
        } else {
            return arg0 == 5 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V", line = 359)
    public static void method147(boolean arg0) {
        field281 = null;
        if (!arg0) {
            method145(null, null, 74);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)I", line = 371)
    public final int method148(byte arg0) throws IOException {
        field262++;
        if (this.field257) {
            return 0;
        } else {
            if (arg0 != 33) {
                field272 = 13L;
            }
            return this.field270.available();
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 387)
    public final void method149(int arg0) throws IOException {
        field267++;
        if (this.field257) {
            return;
        }
        int var2 = 47 / ((-arg0 - 19) / 59);
        if (this.field271) {
            this.field271 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V", line = 408)
    protected final void finalize() {
        field273++;
        this.method140(-126);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 424)
    public static final void method150(int arg0) {
        class397.field5830 = arg0;
        field269++;
        class39.field623 = -1;
        class187.method1298("", class652.field9041.equals(""), 0, class652.field9041, true);
    }
}
