import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class533 implements Runnable {

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    private int field7439 = 0;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    private int field7446 = 0;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "Ljava/io/InputStream;")
    private InputStream field7452;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    private int field7444;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "[B")
    private byte[] field7438;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field7447;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "[[I")
    public static int[][] field7453 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Lpp;")
    public static class464 field7441 = new class464(6, -1);

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "Ljava/io/IOException;")
    private IOException field7448;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZI)Z")
    public final boolean method3009(boolean arg0, int arg1) throws IOException {
        field7449++;
        if (arg1 <= 0 || this.field7444 <= arg1) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            int var4;
            if (this.field7446 < this.field7439) {
                var4 = this.field7446 + this.field7444 - this.field7439;
            } else {
                var4 = this.field7446 - this.field7439;
            }
            if (arg0) {
                return true;
            } else if (arg1 <= var4) {
                return true;
            } else if (this.field7448 == null) {
                return false;
            } else {
                throw new IOException(this.field7448.toString());
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public final void method3010(int arg0) {
        field7451++;
        synchronized (this) {
            int var3 = 18 % ((arg0 + 44) / 52);
            if (this.field7448 == null) {
                this.field7448 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field7447.join();
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
    public static void method3011(byte arg0) {
        if (arg0 != -16) {
            method3012(null, 18, -8, -20, -105, (byte) -16, -60, -96);
        }
        field7441 = null;
        field7453 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;IIIIBII)V")
    public static final void method3012(String arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field7450++;
        class634 var8 = new class634();
        var8.field9216 = arg1;
        var8.field9214 = class310.field4553 + arg7;
        var8.field9210 = arg6;
        if (arg5 != 42) {
            return;
        }
        var8.field9220 = arg3;
        var8.field9217 = arg0;
        var8.field9218 = arg4;
        var8.field9215 = arg2;
        class519.field7205.method952((byte) 78, var8);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BZ)V")
    public static final void method3013(byte arg0, boolean arg1) {
        class144.field2229++;
        if (arg0 <= 92) {
            method3012(null, -128, 125, 16, -78, (byte) -73, -122, -56);
        }
        class624.method3537(-120, class368.field5230);
        field7440++;
        for (class553 var2 = (class553) class639.field9274.method734(0); var2 != null; var2 = (class553) class639.field9274.method736(-1)) {
            if (!var2.method912(false)) {
                var2 = (class553) class639.field9274.method734(0);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field7831 == 0) {
                class61.method489(-27920, true, arg1, var2);
            }
        }
        if (class559.field7930 != null) {
            class412.method2497(class559.field7930, 80);
            class559.field7930 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III[B)I")
    public final int method3014(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field7445++;
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg3.length) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (arg0 != 5320) {
                return 122;
            }
            int var7;
            if (this.field7446 >= this.field7439) {
                var7 = this.field7446 - this.field7439;
            } else {
                var7 = this.field7446 + this.field7444 - this.field7439;
            }
            if (arg2 > var7) {
                arg2 = var7;
            }
            if (arg2 == 0 && this.field7448 != null) {
                throw new IOException(this.field7448.toString());
            }
            if ((this.field7439 + arg2) <= this.field7444) {
                class164.method1151(this.field7438, this.field7439, arg3, arg1, arg2);
            } else {
                int var8 = this.field7444 - this.field7439;
                class164.method1151(this.field7438, this.field7439, arg3, arg1, var8);
                class164.method1151(this.field7438, 0, arg3, arg1 + var8, -var8 + arg2);
            }
            this.field7439 = (this.field7439 + arg2) % this.field7444;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!du", name = "run", descriptor = "()V")
    public final void run() {
        field7437++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7448 != null) {
                        return;
                    }
                    if (this.field7439 == 0) {
                        var2 = this.field7444 - this.field7446 - 1;
                    } else if (this.field7446 <= this.field7439) {
                        var2 = this.field7439 - this.field7446 - 1;
                    } else {
                        var2 = this.field7444 - this.field7446;
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
            int var3;
            try {
                var3 = this.field7452.read(this.field7438, this.field7446, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7448 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7446 = (this.field7446 + var3) % this.field7444;
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class533(InputStream arg0, int arg1) {
        this.field7452 = arg0;
        this.field7444 = arg1 + 1;
        this.field7438 = new byte[this.field7444];
        this.field7447 = new Thread(this);
        this.field7447.setDaemon(true);
        this.field7447.start();
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
    public final void method3015(int arg0) {
        this.field7452 = new class263();
        field7442++;
        if (arg0 != 0) {
            field7441 = null;
        }
    }
}
