import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class429 implements Runnable {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    private int field6140 = 0;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Z")
    private boolean field6152 = false;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "Z")
    private boolean field6158 = false;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    private int field6144 = 0;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lwd;")
    private class248 field6151;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field6161;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field6160;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6153;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "Lwo;")
    public static class690 field6159 = new class690(105, 12);

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field6162 = 0;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lnga;")
    private class477 field6142;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[B")
    private byte[] field6139;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method2573(byte arg0) {
        int var1 = 62 % ((38 - arg0) / 36);
        field6159 = null;
    }

    @OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2579(31088);
        field6157++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public final void method2574(boolean arg0) throws IOException {
        field6154++;
        if (!arg0 && !this.field6152 && this.field6158) {
            this.field6158 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2575(byte arg0, String arg1) {
        field6141++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        if (arg0 >= -55) {
            method2573((byte) -46);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([BBII)V")
    public final void method2576(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field6145++;
        if (arg1 >= -72) {
            this.finalize();
        }
        if (this.field6152) {
            return;
        }
        if (this.field6158) {
            this.field6158 = false;
            throw new IOException();
        }
        if (this.field6139 == null) {
            this.field6139 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field6139[this.field6144] = arg0[arg2 + var6];
                this.field6144 = (this.field6144 + 1) % 5000;
                if ((this.field6140 + 4900) % 5000 == this.field6144) {
                    throw new IOException();
                }
            }
            if (this.field6142 == null) {
                this.field6142 = this.field6151.method1521(this, 3, 99);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
    public final int method2577(int arg0) throws IOException {
        if (arg0 <= 87) {
            method2573((byte) 100);
        }
        field6155++;
        return this.field6152 ? 0 : this.field6160.read();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2578(String arg0, byte arg1) {
        field6143++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class49.method545(arg0.charAt(var4), true) - var3;
        }
        if (arg1 <= 101) {
            field6162 = -37;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public final void method2579(int arg0) {
        field6146++;
        if (this.field6152) {
            return;
        }
        synchronized (this) {
            this.field6152 = true;
            this.notifyAll();
            if (arg0 != 31088) {
                this.field6158 = false;
            }
        }
        if (this.field6142 != null) {
            while (this.field6142.field6693 == 0) {
                class151.method974((byte) -102, 1L);
            }
            if (this.field6142.field6693 == 1) {
                try {
                    ((Thread) this.field6142.field6695).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field6142 = null;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public final void method2580(int arg0) {
        field6147++;
        if (arg0 >= 58 && !this.field6152) {
            this.field6160 = new class578();
            this.field6153 = new class306();
        }
    }

    @OriginalMember(owner = "client!qg", name = "run", descriptor = "()V")
    public final void run() {
        field6150++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field6144 == this.field6140) {
                        if (this.field6152) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field6140;
                    if (this.field6144 >= this.field6140) {
                        var3 = this.field6144 - this.field6140;
                    } else {
                        var3 = 5000 - this.field6140;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field6153.write(this.field6139, var2, var3);
                    } catch (IOException var9) {
                        this.field6158 = true;
                    }
                    this.field6140 = (this.field6140 + var3) % 5000;
                    try {
                        if (this.field6144 == this.field6140) {
                            this.field6153.flush();
                        }
                    } catch (IOException var8) {
                        this.field6158 = true;
                    }
                }
            }
            try {
                if (this.field6160 != null) {
                    this.field6160.close();
                }
                if (this.field6153 != null) {
                    this.field6153.close();
                }
                if (this.field6161 != null) {
                    this.field6161.close();
                }
            } catch (IOException var7) {
            }
            this.field6139 = null;
        } catch (Exception var12) {
            class544.method3184(23383, null, var12);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI[BI)V")
    public final void method2581(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6156++;
        if (this.field6152) {
            return;
        }
        if (arg0 > -85) {
            method2573((byte) 23);
        }
        while (arg3 > 0) {
            int var5 = this.field6160.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)I")
    public final int method2582(boolean arg0) throws IOException {
        field6148++;
        if (this.field6152) {
            return 0;
        } else {
            if (arg0) {
                this.field6161 = null;
            }
            return this.field6160.available();
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/net/Socket;Lwd;)V")
    public class429(Socket arg0, class248 arg1) throws IOException {
        this.field6151 = arg1;
        this.field6161 = arg0;
        this.field6161.setSoTimeout(30000);
        this.field6161.setTcpNoDelay(true);
        this.field6160 = this.field6161.getInputStream();
        this.field6153 = this.field6161.getOutputStream();
    }
}
