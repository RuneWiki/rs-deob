import java.awt.event.ActionEvent;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class546 implements Runnable {

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    private int field7614 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Z")
    private boolean field7604 = false;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Z")
    private boolean field7615 = false;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    private int field7624 = 0;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Ljava/net/Socket;")
    private Socket field7622;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lvc;")
    private class316 field7616;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field7612;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7605;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    private int field7607;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lgca;")
    private class249 field7617;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Ljava/lang/String;")
    public static String field7606;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[B")
    private byte[] field7621;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
    public final int method3160(int arg0) throws IOException {
        field7620++;
        if (this.field7615) {
            return 0;
        } else {
            if (arg0 != 50) {
                this.method3169(false);
            }
            return this.field7612.read();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lda;)V")
    public static final void method3161(class59 arg0) {
        class658.field9020 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
    public final int method3162(int arg0) throws IOException {
        field7609++;
        if (this.field7615) {
            return 0;
        } else if (arg0 > -61) {
            return -63;
        } else {
            return this.field7612.available();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/Object;Lvc;I)V")
    public static final void method3163(Object arg0, class316 arg1, int arg2) {
        field7613++;
        if (arg1.field4388 == null) {
            return;
        }
        for (int var3 = arg2; var3 < 50 && arg1.field4388.peekEvent() != null; var3++) {
            class756.method4205(1L, 0);
        }
        try {
            if (arg0 != null) {
                arg1.field4388.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static void method3164(int arg0) {
        field7606 = null;
        int var1 = 59 % ((arg0 + 52) / 34);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BB)V")
    public final void method3165(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field7618++;
        if (this.field7615) {
            return;
        }
        if (this.field7604) {
            this.field7604 = false;
            throw new IOException();
        }
        if (this.field7621 == null) {
            this.field7621 = new byte[this.field7607];
        }
        if (arg3 < 94) {
            this.method3169(true);
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field7621[this.field7614] = arg2[arg1 + var6];
                this.field7614 = (this.field7614 + 1) % this.field7607;
                if (((this.field7624 - (100 - this.field7607)) % this.field7607) == this.field7614) {
                    throw new IOException();
                }
            }
            if (this.field7617 == null) {
                this.field7617 = this.field7616.method2046(2, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ea", name = "run", descriptor = "()V")
    public final void run() {
        field7611++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field7624 == this.field7614) {
                        if (this.field7615) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field7624;
                    if (this.field7614 >= this.field7624) {
                        var3 = this.field7614 - this.field7624;
                    } else {
                        var3 = this.field7607 - this.field7624;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field7605.write(this.field7621, var2, var3);
                    } catch (IOException var9) {
                        this.field7604 = true;
                    }
                    this.field7624 = (this.field7624 + var3) % this.field7607;
                    try {
                        if (this.field7624 == this.field7614) {
                            this.field7605.flush();
                        }
                    } catch (IOException var8) {
                        this.field7604 = true;
                    }
                }
            }
            try {
                if (this.field7612 != null) {
                    this.field7612.close();
                }
                if (this.field7605 != null) {
                    this.field7605.close();
                }
                if (this.field7622 != null) {
                    this.field7622.close();
                }
            } catch (IOException var7) {
            }
            this.field7621 = null;
        } catch (Exception var12) {
            class248.method1583((byte) -44, null, var12);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[BII)V")
    public final void method3166(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 >= -100) {
            return;
        }
        field7625++;
        if (this.field7615) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field7612.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field7610++;
        this.method3167((byte) 78);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public final void method3167(byte arg0) {
        field7626++;
        if (this.field7615) {
            return;
        }
        synchronized (this) {
            this.field7615 = true;
            this.notifyAll();
        }
        if (this.field7617 != null) {
            while (this.field7617.field3310 == 0) {
                class756.method4205(1L, 0);
            }
            if (this.field7617.field3310 == 1) {
                try {
                    ((Thread) this.field7617.field3311).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field7617 = null;
        if (arg0 != 78) {
            this.field7607 = 89;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    public final void method3168(int arg0) throws IOException {
        field7608++;
        if (arg0 > 63 && !this.field7615 && this.field7604) {
            this.field7604 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public final void method3169(boolean arg0) {
        if (arg0) {
            return;
        }
        field7627++;
        if (!this.field7615) {
            this.field7612 = new class128();
            this.field7605 = new class478();
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/net/Socket;Lvc;I)V")
    public class546(Socket arg0, class316 arg1, int arg2) throws IOException {
        this.field7622 = arg0;
        this.field7616 = arg1;
        this.field7622.setSoTimeout(30000);
        this.field7622.setTcpNoDelay(true);
        this.field7612 = this.field7622.getInputStream();
        this.field7605 = this.field7622.getOutputStream();
        this.field7607 = arg2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
    public static final void method3170(int arg0, boolean arg1) {
        field7619++;
        class557.field7812.method2755(249682952, 0, class557.field7812.field6543);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6532);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6507);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6509);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6528);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6557);
        if (arg0 < 36) {
            method3161(null);
        }
        class557.field7812.method2755(249682952, 0, class557.field7812.field6546);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6511);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6512);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6525);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6542);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6522);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6548);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6520);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6537);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6553);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6516);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6514);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6524);
        class203.method1234(-92);
        class557.field7812.method2755(249682952, 2, class557.field7812.field6552);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6508);
        class43.method289((byte) -108);
        class661.method3626(16711680);
        class64.field792 = true;
    }
}
