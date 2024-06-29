import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class47 implements Runnable {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Z")
    private boolean field960 = false;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Z")
    private boolean field969 = false;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    private int field963 = 0;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    private int field979 = 0;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field976;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lda;")
    private class35 field964;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field974;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field965;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field973 = 0;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[Lka;")
    public static class109[] field967 = new class109[4];

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Loc;")
    public static class151 field977 = class137.method873(2, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "Lha;")
    private class77 field978;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "[B")
    private byte[] field972;

    @OriginalMember(owner = "client!eb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method336(-13112);
        field958++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[BI)V")
    public final void method331(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field970++;
        if (this.field969) {
            return;
        }
        if (this.field960) {
            this.field960 = false;
            throw new IOException();
        }
        if (this.field972 == null) {
            this.field972 = new byte[5000];
        }
        synchronized (this) {
            if (arg0 > 10) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field972[this.field963] = arg2[arg3 + var6];
                    this.field963 = (this.field963 + 1) % 5000;
                    if ((this.field979 + 4900) % 5000 == this.field963) {
                        throw new IOException();
                    }
                }
                if (this.field978 == null) {
                    this.field978 = this.field964.method263(this, 3, false);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field979 == this.field963) {
                            if (this.field969) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field979;
                        if (this.field963 >= this.field979) {
                            var3 = this.field963 - this.field979;
                        } else {
                            var3 = 5000 - this.field979;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field965.write(this.field972, var2, var3);
                    } catch (IOException var9) {
                        this.field960 = true;
                    }
                    this.field979 = (this.field979 + var3) % 5000;
                    try {
                        if (this.field979 == this.field963) {
                            this.field965.flush();
                        }
                    } catch (IOException var8) {
                        this.field960 = true;
                    }
                    continue;
                }
                try {
                    if (this.field974 != null) {
                        this.field974.close();
                    }
                    if (this.field965 != null) {
                        this.field965.close();
                    }
                    if (this.field976 != null) {
                        this.field976.close();
                    }
                } catch (IOException var7) {
                }
                this.field972 = null;
                break;
            }
        } catch (Exception var12) {
            class123.method746(var12, null, -12134);
        }
        field957++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method332(boolean arg0) {
        field967 = null;
        if (arg0) {
            field973 = -59;
        }
        field977 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static final void method333(byte arg0) {
        class55.field1123 = 0;
        class48.field984.field4101 = 0;
        class144.field2603 = 0;
        class117.field2108 = 0;
        class196.field3504 = -1;
        class219.field3813 = -1;
        class171.field3104 = -1;
        class22.field487 = -1;
        client.field693 = 0;
        field959++;
        class68.field1329 = 0;
        class122.field2189 = 0;
        class225.field3917 = false;
        class1.field34.field4101 = 0;
        if (arg0 != -66) {
            field967 = null;
        }
        for (int var1 = 0; var1 < class179.field3229.length; var1++) {
            if (class179.field3229[var1] != null) {
                class179.field3229[var1].field3969 = -1;
            }
        }
        for (int var2 = 0; var2 < class122.field2190.length; var2++) {
            if (class122.field2190[var2] != null) {
                class122.field2190[var2].field3969 = -1;
            }
        }
        class7.method45(true);
        class137.method871(30, (byte) 120);
        for (int var3 = 0; var3 < 100; var3++) {
            class224.field3911[var3] = true;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[BII)V")
    public final void method334(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field966++;
        if (this.field969) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field974.read(arg1, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg2 += var5;
        }
        if (arg0 != 95) {
            field961 = -24;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
    public static final void method335(boolean arg0) {
        field968++;
        int[] var1 = new int[class108.field1913];
        int var2 = 0;
        for (int var3 = 0; var3 < class108.field1913; var3++) {
            class12 var5 = class43.method311(var3, 0);
            if (var5.field223 >= 0 || var5.field217 >= 0) {
                var1[var2++] = var3;
            }
        }
        class180.field3261 = new int[var2];
        if (!arg0) {
            for (int var4 = 0; var4 < var2; var4++) {
                class180.field3261[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public final void method336(int arg0) {
        field971++;
        if (this.field969) {
            return;
        }
        synchronized (this) {
            if (arg0 != -13112) {
                this.finalize();
            }
            this.field969 = true;
            this.notifyAll();
        }
        if (this.field978 != null) {
            while (this.field978.field1501 == 0) {
                class156.method1027(0, 1L);
            }
            if (this.field978.field1501 == 1) {
                try {
                    ((Thread) this.field978.field1503).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field978 = null;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(Z)I")
    public final int method337(boolean arg0) throws IOException {
        if (arg0) {
            field956++;
            return this.field969 ? 0 : this.field974.available();
        } else {
            return -72;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static final void method338(int arg0) {
        class11.field210 = null;
        field975++;
        if (arg0 >= -29) {
            field967 = null;
        }
        class160.field2893 = null;
        class54.field1099 = null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
    public final int method339(byte arg0) throws IOException {
        field962++;
        if (this.field969) {
            return 0;
        } else {
            int var2 = 101 % ((arg0 - 48) / 54);
            return this.field974.read();
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljava/net/Socket;Lda;)V")
    public class47(Socket arg0, class35 arg1) throws IOException {
        this.field976 = arg0;
        this.field964 = arg1;
        this.field976.setSoTimeout(30000);
        this.field976.setTcpNoDelay(true);
        this.field974 = this.field976.getInputStream();
        this.field965 = this.field976.getOutputStream();
    }
}
