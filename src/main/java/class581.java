import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class581 implements Runnable {

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Z")
    private boolean field8096 = false;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    private int field8099 = 0;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Z")
    private boolean field8105 = false;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    private int field8106 = 0;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field8094;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Lgaa;")
    private class279 field8104;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field8107;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field8101;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Ljr;")
    private class441 field8087;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "[B")
    private byte[] field8089;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)I")
    public final int method3272(boolean arg0) throws IOException {
        if (!arg0) {
            method3279(73, true, 24, false);
        }
        field8095++;
        return this.field8096 ? 0 : this.field8107.read();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[BII)V")
    public final void method3273(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field8086++;
        if (arg2 != -1) {
            this.finalize();
        }
        if (this.field8096) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field8107.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public final void method3274(byte arg0) {
        field8088++;
        if (this.field8096) {
            return;
        }
        this.field8107 = new class268();
        this.field8101 = new class287();
        if (arg0 != -48) {
            this.method3274((byte) 54);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZILvaa;I)J")
    public static final long method3275(boolean arg0, int arg1, class246 arg2, int arg3) {
        field8090++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class137 var10 = class626.field9084.method1093(0, arg2.method52(-17817));
        if (!arg0) {
            return 0L;
        }
        long var11 = (long) (arg2.method57(-29185) << 14 | arg1 << 7 | arg3 | arg2.method60(1901) << 20 | 0x40000000);
        if (var10.field1749 == 0) {
            var11 |= var8;
        }
        if (var10.field1748 == 1) {
            var11 |= var4;
        }
        if (var10.field1667) {
            var11 |= var6;
        }
        return var11 | (long) arg2.method52(-17817) << 32;
    }

    @OriginalMember(owner = "client!vi", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field8106 == this.field8099) {
                            if (this.field8096) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field8106 < this.field8099) {
                            var2 = 5000 - this.field8099;
                        } else {
                            var2 = this.field8106 - this.field8099;
                        }
                        var3 = this.field8099;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field8101.write(this.field8089, var3, var2);
                    } catch (IOException var9) {
                        this.field8105 = true;
                    }
                    this.field8099 = (this.field8099 + var2) % 5000;
                    try {
                        if (this.field8106 == this.field8099) {
                            this.field8101.flush();
                        }
                    } catch (IOException var8) {
                        this.field8105 = true;
                    }
                    continue;
                }
                try {
                    if (this.field8107 != null) {
                        this.field8107.close();
                    }
                    if (this.field8101 != null) {
                        this.field8101.close();
                    }
                    if (this.field8094 != null) {
                        this.field8094.close();
                    }
                } catch (IOException var7) {
                }
                this.field8089 = null;
                break;
            }
        } catch (Exception var12) {
            class447.method2602(var12, 114, null);
        }
        field8097++;
    }

    @OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method3280(1);
        field8098++;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I[BII)V")
    public final void method3276(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field8100++;
        if (this.field8096) {
            return;
        }
        if (this.field8105) {
            this.field8105 = false;
            throw new IOException();
        }
        if (this.field8089 == null) {
            this.field8089 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field8089[this.field8106] = arg1[arg2 + var6];
                this.field8106 = (this.field8106 + 1) % 5000;
                if ((this.field8099 + 4900) % 5000 == this.field8106) {
                    throw new IOException();
                }
            }
            int var7 = -105 % ((-arg3 - 30) / 37);
            if (this.field8087 == null) {
                this.field8087 = this.field8104.method1730(3, 2, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static final void method3277(int arg0) {
        field8092++;
        if (class162.field2064) {
            return;
        }
        if (class501.field6954.field7869) {
            class568.field7951 = ((int) class568.field7951 - 17 & 0xFFFFFFF0);
        } else {
            class418.field5711 += (-class418.field5711 - 12.0F) / 2.0F;
        }
        class194.field2524 = true;
        if (arg0 != -16) {
            field8091 = -111;
        }
        class162.field2064 = true;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I")
    public final int method3278(int arg0) throws IOException {
        if (arg0 != -449) {
            field8091 = 83;
        }
        field8102++;
        return this.field8096 ? 0 : this.field8107.available();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZIZ)I")
    public static final int method3279(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (!arg1) {
            return -68;
        }
        field8093++;
        class164 var4 = class130.method695(arg3, arg2, Integer.MIN_VALUE);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && var4.field2086.length > arg0) {
            return var4.field2086[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public final void method3280(int arg0) {
        field8108++;
        if (this.field8096 || arg0 != 1) {
            return;
        }
        synchronized (this) {
            this.field8096 = true;
            this.notifyAll();
        }
        if (this.field8087 != null) {
            while (this.field8087.field6001 == 0) {
                class353.method2204(1L, 7806);
            }
            if (this.field8087.field6001 == 1) {
                try {
                    ((Thread) this.field8087.field6000).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field8087 = null;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
    public final void method3281(int arg0) throws IOException {
        if (arg0 != -25229) {
            return;
        }
        field8103++;
        if (!this.field8096 && this.field8105) {
            this.field8105 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/net/Socket;Lgaa;)V")
    public class581(Socket arg0, class279 arg1) throws IOException {
        this.field8094 = arg0;
        this.field8104 = arg1;
        this.field8094.setSoTimeout(30000);
        this.field8094.setTcpNoDelay(true);
        this.field8107 = this.field8094.getInputStream();
        this.field8101 = this.field8094.getOutputStream();
    }

    static {
        new class344("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }
}
