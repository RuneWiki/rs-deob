import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class149 implements Runnable {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    private int field3352 = 0;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Z")
    private boolean field3378 = false;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    private int field3380 = 0;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Z")
    private boolean field3372 = false;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Lvb;")
    private class148 field3373;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field3363;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field3359;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3358;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lhe;")
    public static class54 field3365 = class6.method58(" steht bereits auf Ihrer Freunde)2Liste(Q", false);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3355 = 0;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lhe;")
    public static class54 field3362 = class6.method58("W-=hlen Sie eine Option", false);

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "[I")
    public static int[] field3376 = new int[25];

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lhe;")
    public static class54 field3368 = class6.method58("Neuer Benutzer", false);

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Lhe;")
    private static class54 field3371 = class6.method58("Free world", false);

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lhe;")
    public static class54 field3369 = class6.method58(" loggt sich aus)3", false);

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "[[S")
    public static short[][] field3381 = new short[][] { new short[0], { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lhe;")
    public static class54 field3366 = field3371;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lte;")
    public static class137 field3357 = new class137();

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field3385 = 0;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "Lhe;")
    public static class54 field3384 = class6.method58("blinken1:", false);

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field3386 = 0;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "[[B")
    public static byte[][] field3383 = new byte[1000][];

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3387 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lgd;")
    private class46 field3353;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "[B")
    private byte[] field3367;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "[I")
    public static int[] field3370;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static void method1129(boolean arg0) {
        field3370 = null;
        field3369 = null;
        field3381 = null;
        field3357 = null;
        field3376 = null;
        field3368 = null;
        field3383 = null;
        field3366 = null;
        field3362 = null;
        field3384 = null;
        if (arg0) {
            field3381 = null;
        }
        field3365 = null;
        field3371 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public final void method1130(int arg0) {
        field3361++;
        if (this.field3372) {
            return;
        }
        synchronized (this) {
            this.field3372 = true;
            this.notifyAll();
        }
        if (this.field3353 != null) {
            while (this.field3353.field1145 == 0) {
                class50.method360(1L, 10);
            }
            if (this.field3353.field1145 == 1) {
                try {
                    ((Thread) this.field3353.field1143).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3353 = null;
        if (arg0 != -31709) {
            method1134(-79, 26, false, -55);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method1131(int arg0) {
        field3374++;
        if (field3357 != null) {
            class137 var1 = field3357;
            synchronized (field3357) {
                field3357 = null;
            }
        }
        if (arg0 >= -75) {
            method1136((byte) 113, -128);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[B)V")
    public final void method1132(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3379++;
        if (this.field3372) {
            return;
        }
        if (this.field3378) {
            this.field3378 = false;
            throw new IOException();
        }
        if (this.field3367 == null) {
            this.field3367 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg2 < 120) {
                method1136((byte) -124, 115);
            }
            while (arg0 > var6) {
                this.field3367[this.field3352] = arg3[arg1 + var6];
                this.field3352 = (this.field3352 + 1) % 5000;
                if ((this.field3380 + 4900) % 5000 == this.field3352) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field3353 == null) {
                this.field3353 = this.field3373.method1121(this, 3, 43);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)I")
    public final int method1133(int arg0) throws IOException {
        field3375++;
        int var2 = -65 / ((-arg0 - 51) / 60);
        return this.field3372 ? 0 : this.field3359.read();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZI)Lhe;")
    public static final class54 method1134(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field3377++;
        int var4 = 1;
        int var5 = arg3 / arg0;
        int var6 = 65 / ((arg1 - 51) / 60);
        while (var5 != 0) {
            var4++;
            var5 /= arg0;
        }
        int var7 = var4;
        if (arg3 < 0 || arg2) {
            var7 = var4 + 1;
        }
        byte[] var8 = new byte[var7];
        if (arg3 < 0) {
            var8[0] = 45;
        } else if (arg2) {
            var8[0] = 43;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var11 = arg3 % arg0;
            if (var11 < 0) {
                var11 = -var11;
            }
            arg3 /= arg0;
            if (var11 > 9) {
                var11 += 39;
            }
            var8[var7 - var9 - 1] = (byte) (var11 + 48);
        }
        class54 var10 = new class54();
        var10.field1325 = var7;
        var10.field1323 = var8;
        return var10;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([BIII)V")
    public final void method1135(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3360++;
        if (this.field3372) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field3359.read(arg0, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg3 -= var5;
        }
        if (arg1 <= 24) {
            field3381 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)V")
    public static final void method1136(byte arg0, int arg1) {
        field3351++;
        class7 var2 = (class7) class63.field1524.method246((byte) 117, (long) arg1);
        if (var2 == null) {
            return;
        }
        if (arg0 < 104) {
            field3357 = null;
        }
        for (int var3 = 0; var3 < var2.field218.length; var3++) {
            var2.field218[var3] = -1;
            var2.field210[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
    public static final boolean method1137(int arg0, byte arg1) {
        field3350++;
        int var2 = 31 % ((arg1 - 81) / 32);
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3354++;
        this.method1130(-31709);
    }

    @OriginalMember(owner = "client!vc", name = "run", descriptor = "()V")
    public final void run() {
        field3382++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3380 == this.field3352) {
                        if (this.field3372) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field3352 < this.field3380) {
                        var2 = 5000 - this.field3380;
                    } else {
                        var2 = this.field3352 - this.field3380;
                    }
                    var3 = this.field3380;
                }
                if (var2 > 0) {
                    try {
                        this.field3358.write(this.field3367, var3, var2);
                    } catch (IOException var9) {
                        this.field3378 = true;
                    }
                    this.field3380 = (this.field3380 + var2) % 5000;
                    try {
                        if (this.field3380 == this.field3352) {
                            this.field3358.flush();
                        }
                    } catch (IOException var8) {
                        this.field3378 = true;
                    }
                }
            }
            try {
                if (this.field3359 != null) {
                    this.field3359.close();
                }
                if (this.field3358 != null) {
                    this.field3358.close();
                }
                if (this.field3363 != null) {
                    this.field3363.close();
                }
            } catch (IOException var7) {
            }
            this.field3367 = null;
        } catch (Exception var12) {
            class48.method345(var12, -91, null);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/net/Socket;Lvb;)V")
    public class149(Socket arg0, class148 arg1) throws IOException {
        this.field3373 = arg1;
        this.field3363 = arg0;
        this.field3363.setSoTimeout(30000);
        this.field3363.setTcpNoDelay(true);
        this.field3359 = this.field3363.getInputStream();
        this.field3358 = this.field3363.getOutputStream();
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)I")
    public final int method1138(boolean arg0) throws IOException {
        if (arg0) {
            field3356++;
            return this.field3372 ? 0 : this.field3359.available();
        } else {
            return 15;
        }
    }
}
