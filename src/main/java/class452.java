import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class452 implements Runnable {

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    private int field6727 = 0;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    private int field6717 = 0;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
    private int field6731;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6723;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "[B")
    private byte[] field6732;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field6722;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "[Laj;")
    public static class209[] field6725 = new class209[30];

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "Ljp;")
    public static class55 field6721 = new class55(54, 0);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "Ljava/io/IOException;")
    private IOException field6719;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "[S")
    public static short[] field6718;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZ)V")
    public static final void method2768(int arg0, boolean arg1) {
        field6729++;
        if (class406.field6002.length() == 0) {
            return;
        }
        class442.method2733("--> " + class406.field6002, arg0 ^ 0xFFFFFB92);
        if (arg0 != -1126) {
            method2772(83);
        }
        class481.method2904(false, (byte) 6, class406.field6002, arg1);
        class489.field7141 = 0;
        class517.field7509 = 0;
        class406.field6002 = "";
    }

    @OriginalMember(owner = "client!ev", name = "run", descriptor = "()V")
    public final void run() {
        field6730++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6719 != null) {
                        return;
                    }
                    if (this.field6717 >= this.field6727) {
                        var2 = this.field6717 - this.field6727;
                    } else {
                        var2 = this.field6731 + this.field6717 - this.field6727;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                if ((this.field6727 + var2) <= this.field6731) {
                    this.field6723.write(this.field6732, this.field6727, var2);
                } else {
                    int var3 = this.field6731 - this.field6727;
                    this.field6723.write(this.field6732, this.field6727, var3);
                    this.field6723.write(this.field6732, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6719 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6727 = (this.field6727 + var2) % this.field6731;
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static final void method2769(int arg0) {
        class162.field2454 = null;
        class276.field4341 = null;
        client.field7545 = null;
        class307.field4691 = null;
        if (arg0 != -16501) {
            method2769(-87);
        }
        class171.field2626 = null;
        class364.field5369 = null;
        class192.field2955 = null;
        class437.field6502 = null;
        class397.field5855 = null;
        field6724++;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
    public final void method2770(boolean arg0) {
        field6728++;
        this.field6723 = new class182();
        if (!arg0) {
            field6718 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II[BI)V")
    public final void method2771(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6716++;
        if (arg0 < 0 || arg3 < 0 || arg2.length < arg0 + arg3) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (this.field6719 != null) {
                throw new IOException(this.field6719.toString());
            }
            if (arg1 > -87) {
                method2768(116, true);
            }
            int var6;
            if (this.field6717 < this.field6727) {
                var6 = this.field6727 - this.field6717 - 1;
            } else {
                var6 = this.field6727 + this.field6731 - this.field6717 - 1;
            }
            if (arg0 > var6) {
                throw new IOException("");
            }
            if (this.field6717 + arg0 > this.field6731) {
                int var7 = this.field6731 - this.field6717;
                class325.method2131(arg2, arg3, this.field6732, this.field6717, var7);
                class325.method2131(arg2, arg3 + var7, this.field6732, 0, arg0 - var7);
            } else {
                class325.method2131(arg2, arg3, this.field6732, this.field6717, arg0);
            }
            this.field6717 = (this.field6717 + arg0) % this.field6731;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
    public static void method2772(int arg0) {
        field6718 = null;
        if (arg0 >= -62) {
            field6725 = null;
        }
        field6725 = null;
        field6721 = null;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class452(OutputStream arg0, int arg1) {
        this.field6731 = arg1 + 1;
        this.field6723 = arg0;
        this.field6732 = new byte[this.field6731];
        this.field6722 = new Thread(this);
        this.field6722.setDaemon(true);
        this.field6722.start();
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V")
    public final void method2773(int arg0) {
        if (arg0 >= -50) {
            this.field6719 = null;
        }
        synchronized (this) {
            if (this.field6719 == null) {
                this.field6719 = new IOException("");
            }
            this.notifyAll();
        }
        field6720++;
        try {
            this.field6722.join();
        } catch (InterruptedException var3) {
        }
    }
}
