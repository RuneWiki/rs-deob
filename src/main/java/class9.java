import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 implements Runnable {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Z")
    private boolean field211 = false;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    private int field216 = 0;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Z")
    private boolean field217 = false;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    private int field233 = 0;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Ldf;")
    private class28 field231;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field232;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field215;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field227;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lpe;")
    public static class109 field221 = class141.method1120(":tradereq:", 0);

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field219 = 1;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "[Lve;")
    public static class151[] field222 = new class151[50];

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Lpe;")
    public static class109 field228 = class141.method1120(" <col=00ff80>", 0);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lcf;")
    private class21 field214;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[B")
    private byte[] field218;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BII[B)V")
    public final void method80(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = -86 / ((arg0 - 49) / 43);
        field224++;
        if (this.field217) {
            return;
        }
        while (arg2 > 0) {
            int var6 = this.field215.read(arg3, arg1, arg2);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg1 += var6;
            arg2 -= var6;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)I")
    public final int method81(byte arg0) throws IOException {
        if (arg0 >= 0) {
            method84((byte) 96);
        }
        field225++;
        return this.field217 ? 0 : this.field215.available();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLna;)V")
    public static final void method82(byte arg0, class91 arg1) {
        field229++;
        class16.field410 = arg1;
        if (arg0 >= -122) {
            method85(85, false);
        }
        class104.field2208 = class16.field410.method754(16, (byte) 55);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
    public final void method83(byte arg0) {
        field226++;
        if (this.field217) {
            return;
        }
        synchronized (this) {
            this.field217 = true;
            if (arg0 != -114) {
                return;
            }
            this.notifyAll();
        }
        if (this.field214 != null) {
            while (this.field214.field513 == 0) {
                class99.method797(1L, false);
            }
            if (this.field214.field513 == 1) {
                try {
                    ((Thread) this.field214.field514).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field214 = null;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
    public static void method84(byte arg0) {
        int var1 = -71 / ((-arg0 - 16) / 37);
        field221 = null;
        field222 = null;
        field228 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)V")
    public static final void method85(int arg0, boolean arg1) {
        field230++;
        int var2 = 0;
        if (arg0 != -16150) {
            return;
        }
        while (var2 < class131.field2885) {
            class108 var3 = class52.field1067[class139.field3035[var2]];
            int var4 = (class139.field3035[var2] << 14) + 536870912;
            if (var3 != null && var3.method426(false) && var3.field2265.field2455 == arg1 && var3.field2265.method937(-1)) {
                int var5 = var3.field3094 >> 7;
                int var6 = var3.field3106 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    label65: {
                        if (var3.field3071 == 1 && (var3.field3094 & 0x7F) == 64 && (var3.field3106 & 0x7F) == 64) {
                            if (class64.field1314[var5][var6] == class93.field2000) {
                                break label65;
                            }
                            class64.field1314[var5][var6] = class93.field2000;
                        }
                        if (!var3.field2265.field2465) {
                            var4 += Integer.MIN_VALUE;
                        }
                        class147.field3201.method660(class75.field1513, var3.field3094, var3.field3106, class126.method1019(var3.field3071 * 64 + var3.field3106 - 64, var3.field3094 - 64 - -(var3.field3071 * 64), 1, class75.field1513), var3.field3071 * 64 + 60 - 64, var3, var3.field3114, var4, var3.field3102);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field220++;
        this.method83((byte) -114);
    }

    @OriginalMember(owner = "client!ba", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field233 == this.field216) {
                            if (this.field217) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field216;
                        if (this.field216 <= this.field233) {
                            var3 = this.field233 - this.field216;
                        } else {
                            var3 = 5000 - this.field216;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field227.write(this.field218, var2, var3);
                    } catch (IOException var9) {
                        this.field211 = true;
                    }
                    this.field216 = (this.field216 + var3) % 5000;
                    try {
                        if (this.field233 == this.field216) {
                            this.field227.flush();
                        }
                    } catch (IOException var8) {
                        this.field211 = true;
                    }
                    continue;
                }
                try {
                    if (this.field215 != null) {
                        this.field215.close();
                    }
                    if (this.field227 != null) {
                        this.field227.close();
                    }
                    if (this.field232 != null) {
                        this.field232.close();
                    }
                } catch (IOException var7) {
                }
                this.field218 = null;
                break;
            }
        } catch (Exception var12) {
            class112.method921(null, false, var12);
        }
        field213++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)I")
    public final int method86(int arg0) throws IOException {
        if (arg0 >= -25) {
            this.field233 = -90;
        }
        field223++;
        return this.field217 ? 0 : this.field215.read();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BII)V")
    public final void method87(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field212++;
        if (this.field217) {
            return;
        }
        if (this.field211) {
            this.field211 = false;
            throw new IOException();
        }
        if (this.field218 == null) {
            this.field218 = new byte[5000];
        }
        synchronized (this) {
            if (arg0 >= -78) {
                this.run();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field218[this.field233] = arg1[arg3 + var6];
                this.field233 = (this.field233 + 1) % 5000;
                if ((this.field216 + 4900) % 5000 == this.field233) {
                    throw new IOException();
                }
            }
            if (this.field214 == null) {
                this.field214 = this.field231.method252(3, (byte) 34, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Ljava/net/Socket;Ldf;)V")
    public class9(Socket arg0, class28 arg1) throws IOException {
        this.field231 = arg1;
        this.field232 = arg0;
        this.field232.setSoTimeout(30000);
        this.field232.setTcpNoDelay(true);
        this.field215 = this.field232.getInputStream();
        this.field227 = this.field232.getOutputStream();
    }
}
