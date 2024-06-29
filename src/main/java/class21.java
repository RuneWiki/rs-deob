import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class21 implements Runnable {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    private int field486 = 0;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Z")
    private boolean field495 = false;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    private int field508 = 0;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "Z")
    private boolean field512 = false;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Led;")
    private class31 field491;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field490;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field488;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field493;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field492 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lae;")
    public static class6 field501 = class64.method474(109, "Chat panel redrawn");

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field506 = 128;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lae;")
    private static class6 field503 = class64.method474(103, "Error connecting to server)3");

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lae;")
    public static class6 field504 = field503;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lae;")
    public static class6 field505 = class64.method474(107, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!da", name = "A", descriptor = "Lae;")
    private static class6 field511 = class64.method474(114, "Username: ");

    @OriginalMember(owner = "client!da", name = "z", descriptor = "Lae;")
    public static class6 field510 = field511;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "Lp;")
    public static class95 field509 = new class95();

    @OriginalMember(owner = "client!da", name = "F", descriptor = "Lae;")
    public static class6 field516 = class64.method474(121, "runes");

    @OriginalMember(owner = "client!da", name = "G", descriptor = "Lae;")
    private static class6 field517 = class64.method474(108, "cyan:");

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field519 = 0;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Lae;")
    public static class6 field514 = field517;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lsc;")
    private class112 field498;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "Lvb;")
    public static class129 field518;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "[B")
    private byte[] field502;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "[I")
    public static int[] field515;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 6)
    public static void method205(int arg0) {
        field504 = null;
        field509 = null;
        field492 = null;
        field518 = null;
        field515 = null;
        field501 = null;
        field517 = null;
        field503 = null;
        field516 = null;
        if (arg0 == -1) {
            field514 = null;
            field505 = null;
            field511 = null;
            field510 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "run", descriptor = "()V", line = 29)
    public final void run() {
        field494++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field508 == this.field486) {
                        if (this.field495) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field486;
                    if (this.field508 < this.field486) {
                        var3 = 5000 - this.field486;
                    } else {
                        var3 = this.field508 - this.field486;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field493.write(this.field502, var2, var3);
                    } catch (IOException var9) {
                        this.field512 = true;
                    }
                    this.field486 = (this.field486 + var3) % 5000;
                    try {
                        if (this.field508 == this.field486) {
                            this.field493.flush();
                        }
                    } catch (IOException var8) {
                        this.field512 = true;
                    }
                }
            }
            try {
                if (this.field488 != null) {
                    this.field488.close();
                }
                if (this.field493 != null) {
                    this.field493.close();
                }
                if (this.field490 != null) {
                    this.field490.close();
                }
            } catch (IOException var7) {
            }
            this.field502 = null;
        } catch (Exception var12) {
            class78.method675(var12, 64, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[BII)V", line = 98)
    public final void method206(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field489++;
        if (arg3 != -22323) {
            this.run();
        }
        if (this.field495) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field488.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/net/Socket;Led;)V", line = 380)
    public class21(Socket arg0, class31 arg1) throws IOException {
        this.field491 = arg1;
        this.field490 = arg0;
        this.field490.setSoTimeout(30000);
        this.field490.setTcpNoDelay(true);
        this.field488 = this.field490.getInputStream();
        this.field493 = this.field490.getOutputStream();
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 127)
    public final void method207(int arg0) {
        field500++;
        if (this.field495) {
            return;
        }
        synchronized (this) {
            if (arg0 != -2158) {
                this.run();
            }
            this.field495 = true;
            this.notifyAll();
        }
        if (this.field498 != null) {
            while (this.field498.field2686 == 0) {
                class82.method696(3, 1L);
            }
            if (this.field498.field2686 == 1) {
                try {
                    ((Thread) this.field498.field2687).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field498 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Z", line = 163)
    public static final boolean method208(int arg0, int arg1) {
        field496++;
        if (class42.field958[arg1]) {
            return true;
        } else if (class118.field2802.method159(false, arg1)) {
            int var2 = class118.field2802.method153(arg1, (byte) -4);
            if (var2 == 0) {
                class42.field958[arg1] = true;
                return true;
            }
            if (class35.field828[arg1] == null) {
                class35.field828[arg1] = new class121[var2];
            }
            for (int var3 = arg0; var3 < var2; var3++) {
                if (class35.field828[arg1][var3] == null) {
                    byte[] var4 = class118.field2802.method160(30605, arg1, var3);
                    if (var4 != null) {
                        class35.field828[arg1][var3] = new class121();
                        class35.field828[arg1][var3].field2960 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class35.field828[arg1][var3].method983(new class77(var4), false);
                        } else {
                            class35.field828[arg1][var3].method981(new class77(var4), 4);
                        }
                    }
                }
            }
            class42.field958[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I", line = 226)
    public final int method209(int arg0) throws IOException {
        field497++;
        if (arg0 > -82) {
            this.run();
        }
        return this.field495 ? 0 : this.field488.read();
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V", line = 240)
    protected final void finalize() {
        this.method207(-2158);
        field485++;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)I", line = 248)
    public final int method210(int arg0) throws IOException {
        if (arg0 != 0) {
            field516 = null;
        }
        field499++;
        return this.field495 ? 0 : this.field488.available();
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I[BII)V", line = 275)
    public final void method211(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field513++;
        if (this.field495) {
            return;
        }
        if (this.field512) {
            this.field512 = false;
            throw new IOException();
        }
        if (this.field502 == null) {
            this.field502 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg0 == -1) {
                while (arg2 > var6) {
                    this.field502[this.field508] = arg1[arg3 + var6];
                    this.field508 = (this.field508 + 1) % 5000;
                    if ((this.field486 + 4900) % 5000 == this.field508) {
                        throw new IOException();
                    }
                    var6++;
                }
                if (this.field498 == null) {
                    this.field498 = this.field491.method280(-118, this, 3);
                }
                this.notifyAll();
            }
        }
    }
}
