import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class150 implements Runnable {

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    private int field3715 = 0;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    private int field3704 = 0;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "Z")
    private boolean field3723 = false;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "Z")
    private boolean field3729 = false;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field3700;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "Lhb;")
    private class50 field3727;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "Ljava/io/InputStream;")
    private InputStream field3730;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3709;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Loc;")
    public static class99 field3705 = class48.method402((byte) -104, "Chat panel redrawn");

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field3714 = 0;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Loc;")
    private static class99 field3710 = class48.method402((byte) -104, "Loaded wordpack");

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Loc;")
    private static class99 field3716 = class48.method402((byte) -104, " has logged in)3");

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Loc;")
    public static class99 field3706 = field3710;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Loc;")
    public static class99 field3711 = class48.method402((byte) -104, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!we", name = "z", descriptor = "Loc;")
    public static class99 field3725 = field3716;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Loc;")
    private static class99 field3722 = class48.method402((byte) -104, "FULL");

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Loc;")
    public static class99 field3721 = field3722;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "Loc;")
    public static class99 field3731 = class48.method402((byte) -104, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Ldf;")
    private class28 field3718;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "Lef;")
    public static class35 field3726;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "[B")
    private byte[] field3707;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
    public static final void method1210(int arg0, int arg1) {
        if (class11.field259 == 0) {
            class46.field1131.method1099(arg1, (byte) 62);
        } else {
            class142.field3512 = arg1;
        }
        field3720++;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I")
    public final int method1211(byte arg0) throws IOException {
        field3717++;
        if (arg0 >= -48) {
            field3731 = null;
        }
        return this.field3729 ? 0 : this.field3730.read();
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static final void method1212(byte arg0) {
        class88.method742(class119.field2923, 107);
        field3713++;
        if (class36.field916 != -1) {
            class88.method742(class36.field916, 110);
        }
        class143.field3566 = 0;
        class46.field1129.method874((byte) -103);
        class33.field794 = class40.method336(class33.field794);
        class96.method787();
        class31.method270(765, 0, 503, -9247, 0, 0, class119.field2923);
        if (class36.field916 != -1) {
            class31.method270(765, 0, 503, -9247, 0, 0, class36.field916);
        }
        if (class55.field1432) {
            class126.method1030(false);
        } else {
            class100.method861(false);
            class70.method611((byte) -16);
        }
        try {
            if (arg0 != -125) {
                field3722 = null;
            }
            Graphics var1 = class5.field99.getGraphics();
            class46.field1129.method109(0, 0, 0, var1);
        } catch (Exception var2) {
            class5.field99.repaint();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLib;Loc;)I")
    public static final int method1213(boolean arg0, class57 arg1, class99 arg2) {
        field3719++;
        if (!arg0) {
            field3706 = null;
        }
        int var3 = arg1.field1477;
        arg1.method500(arg2.field2391, arg0);
        arg1.field1477 += class54.field1306.method964(arg1.field1469, arg2.field2391, arg1.field1477, 0, arg2.field2394, (byte) 100);
        return arg1.field1477 - var3;
    }

    @OriginalMember(owner = "client!we", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1215(false);
        field3703++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ[BI)V")
    public final void method1214(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        field3712++;
        if (this.field3729) {
            return;
        }
        if (this.field3723) {
            this.field3723 = false;
            throw new IOException();
        }
        if (this.field3707 == null) {
            this.field3707 = new byte[5000];
        }
        synchronized (this) {
            if (!arg1) {
                this.finalize();
            }
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field3707[this.field3715] = arg2[arg0 + var6];
                this.field3715 = (this.field3715 + 1) % 5000;
                if ((this.field3704 + 4900) % 5000 == this.field3715) {
                    throw new IOException();
                }
            }
            if (this.field3718 == null) {
                this.field3718 = this.field3727.method424((byte) 51, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public final void method1215(boolean arg0) {
        if (arg0) {
            return;
        }
        field3708++;
        if (this.field3729) {
            return;
        }
        synchronized (this) {
            this.field3729 = true;
            this.notifyAll();
        }
        if (this.field3718 != null) {
            while (this.field3718.field688 == 0) {
                class57.method509(-126, 1L);
            }
            if (this.field3718.field688 == 1) {
                try {
                    ((Thread) this.field3718.field685).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3718 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I")
    public final int method1216(int arg0) throws IOException {
        field3702++;
        if (this.field3729) {
            return 0;
        } else {
            if (arg0 != -12320) {
                this.field3723 = false;
            }
            return this.field3730.available();
        }
    }

    @OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
    public final void run() {
        field3724++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3715 == this.field3704) {
                        if (this.field3729) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field3704;
                    if (this.field3704 > this.field3715) {
                        var3 = 5000 - this.field3704;
                    } else {
                        var3 = this.field3715 - this.field3704;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field3709.write(this.field3707, var2, var3);
                    } catch (IOException var9) {
                        this.field3723 = true;
                    }
                    this.field3704 = (this.field3704 + var3) % 5000;
                    try {
                        if (this.field3715 == this.field3704) {
                            this.field3709.flush();
                        }
                    } catch (IOException var8) {
                        this.field3723 = true;
                    }
                }
            }
            try {
                if (this.field3730 != null) {
                    this.field3730.close();
                }
                if (this.field3709 != null) {
                    this.field3709.close();
                }
                if (this.field3700 != null) {
                    this.field3700.close();
                }
            } catch (IOException var7) {
            }
            this.field3707 = null;
        } catch (Exception var12) {
            class72.method659(var12, (byte) 121, null);
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
    public static void method1217(byte arg0) {
        field3711 = null;
        if (arg0 != 71) {
            method1217((byte) 63);
        }
        field3706 = null;
        field3705 = null;
        field3725 = null;
        field3726 = null;
        field3731 = null;
        field3710 = null;
        field3722 = null;
        field3721 = null;
        field3716 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[BII)V")
    public final void method1218(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3701++;
        if (this.field3729) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field3730.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg3 -= var5;
        }
        if (arg2 != -12219) {
            this.field3729 = false;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/net/Socket;Lhb;)V")
    public class150(Socket arg0, class50 arg1) throws IOException {
        this.field3700 = arg0;
        this.field3727 = arg1;
        this.field3700.setSoTimeout(30000);
        this.field3700.setTcpNoDelay(true);
        this.field3730 = this.field3700.getInputStream();
        this.field3709 = this.field3700.getOutputStream();
    }
}
