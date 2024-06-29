import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class13 implements Runnable {

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    private int field272 = 0;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Z")
    private boolean field259 = false;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    private int field281 = 0;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
    private boolean field269 = false;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field263;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lcc;")
    private class15 field275;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "Ljava/io/InputStream;")
    private InputStream field282;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field286;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field283 = 0;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Z")
    public static boolean field278 = false;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lie;")
    public static class53 field262 = new class53();

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Lke;")
    public static class65 field289 = class1.method17(" @whi@(X", -121);

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "Lke;")
    public static class65 field292 = class1.method17("::fpsoff", -112);

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "Lke;")
    private static class65 field293 = class1.method17("Friends", -121);

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "Lke;")
    public static class65 field291 = class1.method17("Wen m-Ochten Sie entfernen?", -119);

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "Lke;")
    public static class65 field287 = field293;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "Lmb;")
    public static class73 field288 = new class73(5000);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Ldc;")
    public static class21 field264;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lf;")
    private class34 field280;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "Ljd;")
    public static class58 field290;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "[B")
    private byte[] field267;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 7)
    public final void method73(int arg0) {
        field266++;
        if (this.field259) {
            return;
        }
        synchronized (this) {
            this.field259 = true;
            if (arg0 < 67) {
                this.finalize();
            }
            this.notifyAll();
        }
        if (this.field280 != null) {
            while (this.field280.field875 == 0) {
                class58.method498(1L, 10);
            }
            if (this.field280.field875 == 1) {
                try {
                    ((Thread) this.field280.field878).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field280 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lge;B)V", line = 43)
    public static final void method74(class41 arg0, byte arg1) {
        if (arg0.field1106 == 0) {
            arg0.field1052 = 1024;
        }
        arg0.field1080 = 0;
        if (arg1 != -106) {
            return;
        }
        int var2 = arg0.field1071 - class76.field2028;
        if (arg0.field1106 == 1) {
            arg0.field1052 = 1536;
        }
        field268++;
        if (arg0.field1106 == 2) {
            arg0.field1052 = 0;
        }
        if (arg0.field1106 == 3) {
            arg0.field1052 = 512;
        }
        int var3 = arg0.field1091 * 128 + arg0.field1069 * 64;
        arg0.field1067 += (var3 - arg0.field1067) / var2;
        int var4 = arg0.field1104 * 128 + arg0.field1069 * 64;
        arg0.field1070 += (var4 - arg0.field1070) / var2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[Lke;)[Lke;", line = 82)
    public static final class65[] method75(int arg0, class65[] arg1) {
        field270++;
        class65[] var2 = new class65[arg0];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class21.method172(-72, new class65[] { class39.method320(var3, (byte) -36), class33.field850 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class21.method172(-103, new class65[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I", line = 112)
    public final int method76(int arg0) throws IOException {
        field260++;
        if (this.field259) {
            return 0;
        } else if (arg0 == 64) {
            return this.field282.read();
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 127)
    public static final void method77(byte arg0) {
        if (arg0 < 11) {
            field277 = -37;
        }
        field258++;
        if (class41.field1065 && class32.field828 != class19.field462) {
            class78.method683(class32.field833.field1097[0], class83.field2184, class1.field5, class32.field833.field1105[0], false, class19.field462);
        } else if (class33.field871 != class19.field462) {
            class33.field871 = class19.field462;
            class58.method480(class19.field462, -20094);
        }
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V", line = 155)
    protected final void finalize() {
        this.method73(104);
        field274++;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V", line = 165)
    public static void method78(int arg0) {
        field293 = null;
        if (arg0 > -95) {
            method75(-26, null);
        }
        field292 = null;
        field289 = null;
        field264 = null;
        field288 = null;
        field291 = null;
        field290 = null;
        field287 = null;
        field262 = null;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 186)
    public static final void method79(byte arg0) {
        class75.field2003++;
        field276++;
        class56.field1453.method642(49, false);
        if (class66.field1767 != -1) {
            class24.method195(true, class66.field1767);
            class128.field3089 = true;
            field278 = false;
            class116.field2910 = true;
            class66.field1767 = -1;
        }
        if (class117.field2939 != -1) {
            class24.method195(true, class117.field2939);
            class39.field996 = true;
            class117.field2939 = -1;
            field278 = false;
        }
        if (arg0 >= -53) {
            field265 = -83;
        }
        if (class10.field213 != -1) {
            class24.method195(true, class10.field213);
            class10.field213 = -1;
            class75.method663((byte) -123, 30);
        }
        if (class102.field2644 != -1) {
            class24.method195(true, class102.field2644);
            class102.field2644 = -1;
        }
        if (class93.field2472 != -1) {
            class24.method195(true, class93.field2472);
            class93.field2472 = -1;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZI)I", line = 237)
    public static final int method80(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            return -63;
        }
        int var4 = arg1 & 0x3;
        field273++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I", line = 263)
    public final int method81(int arg0) throws IOException {
        field279++;
        if (this.field259) {
            return 0;
        } else if (arg0 == -22925) {
            return this.field282.available();
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III[B)V", line = 278)
    public final void method82(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field285++;
        if (this.field259) {
            return;
        }
        if (this.field269) {
            this.field269 = false;
            throw new IOException();
        }
        int var5 = 30 / ((-arg1 - 28) / 62);
        if (this.field267 == null) {
            this.field267 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg0; var7++) {
                this.field267[this.field281] = arg3[arg2 + var7];
                this.field281 = (this.field281 + 1) % 5000;
                if ((this.field272 + 4900) % 5000 == this.field281) {
                    throw new IOException();
                }
            }
            if (this.field280 == null) {
                this.field280 = this.field275.method95((byte) 21, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/net/Socket;Lcc;)V", line = 552)
    public class13(Socket arg0, class15 arg1) throws IOException {
        this.field263 = arg0;
        this.field275 = arg1;
        this.field263.setSoTimeout(30000);
        this.field263.setTcpNoDelay(true);
        this.field282 = this.field263.getInputStream();
        this.field286 = this.field263.getOutputStream();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BIII)V", line = 336)
    public final void method83(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 != -15520) {
            field290 = null;
        }
        field271++;
        if (this.field259) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field282.read(arg0, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIZ)Lke;", line = 375)
    public static final class65 method84(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field284++;
        int var4 = arg2 / arg0;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg0;
            var5++;
        }
        int var6 = var5;
        if (arg2 < 0 || arg3) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        int var8 = -17 / ((arg1 - 46) / 41);
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = arg2 % arg0;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            arg2 /= arg0;
            var7[var6 - var9 - 1] = (byte) (var11 + 48);
        }
        class65 var10 = new class65();
        var10.field1733 = var6;
        var10.field1702 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!ca", name = "run", descriptor = "()V", line = 456)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field281 == this.field272) {
                            if (this.field259) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field272;
                        if (this.field281 >= this.field272) {
                            var3 = this.field281 - this.field272;
                        } else {
                            var3 = 5000 - this.field272;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field286.write(this.field267, var2, var3);
                    } catch (IOException var9) {
                        this.field269 = true;
                    }
                    this.field272 = (this.field272 + var3) % 5000;
                    try {
                        if (this.field281 == this.field272) {
                            this.field286.flush();
                        }
                    } catch (IOException var8) {
                        this.field269 = true;
                    }
                    continue;
                }
                try {
                    if (this.field282 != null) {
                        this.field282.close();
                    }
                    if (this.field286 != null) {
                        this.field286.close();
                    }
                    if (this.field263 != null) {
                        this.field263.close();
                    }
                } catch (IOException var7) {
                }
                this.field267 = null;
                break;
            }
        } catch (Exception var12) {
            class129.method1015(-111, var12, null);
        }
        field257++;
    }
}
