import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class46 implements Runnable {

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Z")
    private boolean field716 = false;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    private int field723 = 0;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    private int field721 = 0;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Z")
    private boolean field710 = false;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lej;")
    private class142 field714;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field711;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field709;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field715;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Lvb;")
    public static class247 field724 = new class247();

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Lrg;")
    public static class210 field726 = new class210();

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Z")
    public static boolean field732 = false;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lni;")
    private class118 field725;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "Lo;")
    public static class175 field731;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "[B")
    private byte[] field722;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method311(byte arg0) {
        field724 = null;
        field726 = null;
        field731 = null;
        if (arg0 > -7) {
            method311((byte) 11);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)I")
    public final int method312(byte arg0) throws IOException {
        field719++;
        if (arg0 == -40) {
            return this.field716 ? 0 : this.field709.read();
        } else {
            return 51;
        }
    }

    @OriginalMember(owner = "client!ng", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method313(-45);
        field708++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public final void method313(int arg0) {
        field718++;
        if (this.field716) {
            return;
        }
        synchronized (this) {
            this.field716 = true;
            int var3 = 13 % ((arg0 - 18) / 57);
            this.notifyAll();
        }
        if (this.field725 != null) {
            while (this.field725.field1933 == 0) {
                class95.method632(true, 1L);
            }
            if (this.field725.field1933 == 1) {
                try {
                    ((Thread) this.field725.field1935).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field725 = null;
    }

    @OriginalMember(owner = "client!ng", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field723 == this.field721) {
                            if (this.field716) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field723;
                        if (this.field721 < this.field723) {
                            var3 = 5000 - this.field723;
                        } else {
                            var3 = this.field721 - this.field723;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field715.write(this.field722, var2, var3);
                    } catch (IOException var9) {
                        this.field710 = true;
                    }
                    this.field723 = (this.field723 + var3) % 5000;
                    try {
                        if (this.field723 == this.field721) {
                            this.field715.flush();
                        }
                    } catch (IOException var8) {
                        this.field710 = true;
                    }
                    continue;
                }
                try {
                    if (this.field709 != null) {
                        this.field709.close();
                    }
                    if (this.field715 != null) {
                        this.field715.close();
                    }
                    if (this.field711 != null) {
                        this.field711.close();
                    }
                } catch (IOException var7) {
                }
                this.field722 = null;
                break;
            }
        } catch (Exception var12) {
            class83.method565(var12, (String) null, 127);
        }
        field712++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
    public static final int method314(int arg0, int arg1) {
        if (arg1 != 0) {
            field729 = -26;
        }
        field720++;
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)I")
    public final int method315(byte arg0) throws IOException {
        if (arg0 == -120) {
            field713++;
            return this.field716 ? 0 : this.field709.available();
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB[BI)V")
    public final void method316(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field717++;
        int var5 = -12 / ((3 - arg1) / 47);
        if (this.field716) {
            return;
        }
        while (arg3 > 0) {
            int var6 = this.field709.read(arg2, arg0, arg3);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 -= var6;
            arg0 += var6;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[BI)V")
    public final void method317(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field727++;
        if (this.field716) {
            return;
        }
        if (this.field710) {
            this.field710 = false;
            throw new IOException();
        }
        if (this.field722 == null) {
            this.field722 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 110 / ((arg1 + 63) / 57);
            for (int var7 = 0; var7 < arg0; var7++) {
                this.field722[this.field721] = arg2[arg3 + var7];
                this.field721 = (this.field721 + 1) % 5000;
                if ((this.field723 + 4900) % 5000 == this.field721) {
                    throw new IOException();
                }
            }
            if (this.field725 == null) {
                this.field725 = this.field714.method918(3, 0, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Ljava/net/Socket;Lej;)V")
    public class46(Socket arg0, class142 arg1) throws IOException {
        this.field714 = arg1;
        this.field711 = arg0;
        this.field711.setSoTimeout(30000);
        this.field711.setTcpNoDelay(true);
        this.field709 = this.field711.getInputStream();
        this.field715 = this.field711.getOutputStream();
    }
}
