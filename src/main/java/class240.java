import java.awt.Point;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class240 implements Runnable {

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    private int field3607 = 0;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    private int field3609 = 0;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field3596;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    private int field3605;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "[B")
    private byte[] field3611;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Ljava/lang/Thread;")
    private Thread field3612;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Z")
    public static boolean field3599 = false;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3598 = "";

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "[[I")
    public static int[][] field3608 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field3593 = -1;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Ljp;")
    public static class55 field3610 = new class55(64, 1);

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Lpu;")
    public static class179 field3613 = new class179("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "F")
    public static float field3601;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Ljava/io/IOException;")
    private IOException field3604;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
    public static final int method1612(int arg0, int arg1, int arg2) {
        field3594++;
        if (arg0 != 13523) {
            return 94;
        }
        int var3 = class503.method3001(arg2 + 91923, arg1 + 45365, (byte) -81, 4) + (class503.method3001(arg2 + 37821, arg1 - -10294, (byte) -81, 2) - 128 >> 1) + (class503.method3001(arg2, arg1, (byte) -81, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V")
    public static final void method1613(int arg0, boolean arg1) {
        field3600++;
        if (!class40.field667.field4197) {
            arg0 = -1;
        }
        if (class384.field5654 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class36 var2 = class256.field4117.method3110((byte) -4, arg0);
            class309 var3 = var2.method234(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class122.field1844.method462(17, var3.method2042(), var3.method2043(), class342.field5114, var3.method2032(), new Point(var2.field445, var2.field456));
                class384.field5654 = arg0;
            }
        }
        if (arg0 == -1 && class384.field5654 != -1) {
            class122.field1844.method462(17, null, -1, class342.field5114, -1, new Point());
            class384.field5654 = -1;
        }
        if (!arg1) {
            field3613 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(IZ)Z")
    public final boolean method1614(int arg0, boolean arg1) throws IOException {
        field3606++;
        if (arg0 <= 0 || this.field3605 <= arg0) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            int var4;
            if (this.field3607 <= this.field3609) {
                var4 = this.field3609 - this.field3607;
            } else {
                var4 = this.field3605 + this.field3609 - this.field3607;
            }
            if (arg1) {
                method1612(-106, 120, 12);
            }
            if (var4 >= arg0) {
                return true;
            } else if (this.field3604 == null) {
                return false;
            } else {
                throw new IOException(this.field3604.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "run", descriptor = "()V")
    public final void run() {
        field3595++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3604 != null) {
                        return;
                    }
                    if (this.field3607 == 0) {
                        var2 = this.field3605 - this.field3609 - 1;
                    } else if (this.field3609 <= this.field3607) {
                        var2 = this.field3607 - this.field3609 - 1;
                    } else {
                        var2 = this.field3605 - this.field3609;
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
                var3 = this.field3596.read(this.field3611, this.field3609, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3604 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3609 = (this.field3609 + var3) % this.field3605;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method1615(int arg0) {
        field3598 = null;
        if (arg0 != 6) {
            method1612(-99, -127, 37);
        }
        field3610 = null;
        field3608 = null;
        field3613 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[BI)I")
    public final int method1616(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3603++;
        if (arg0 > -109) {
            field3598 = null;
        }
        if (arg1 < 0 || arg3 < 0 || arg2.length < (arg3 + arg1)) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            int var6;
            if (this.field3609 < this.field3607) {
                var6 = this.field3609 + this.field3605 - this.field3607;
            } else {
                var6 = this.field3609 - this.field3607;
            }
            if (arg1 > var6) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field3604 != null) {
                throw new IOException(this.field3604.toString());
            }
            if (this.field3605 >= (this.field3607 + arg1)) {
                class325.method2131(this.field3611, this.field3607, arg2, arg3, arg1);
            } else {
                int var7 = this.field3605 - this.field3607;
                class325.method2131(this.field3611, this.field3607, arg2, arg3, var7);
                class325.method2131(this.field3611, 0, arg2, arg3 + var7, -var7 + arg1);
            }
            this.field3607 = (this.field3607 + arg1) % this.field3605;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public final void method1617(byte arg0) {
        int var2 = 18 % ((-arg0 - 78) / 36);
        field3597++;
        synchronized (this) {
            if (this.field3604 == null) {
                this.field3604 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3612.join();
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public final void method1618(int arg0) {
        this.field3596 = new class381();
        field3602++;
        if (arg0 != 4) {
            method1612(-65, 5, 88);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class240(InputStream arg0, int arg1) {
        this.field3596 = arg0;
        this.field3605 = arg1 + 1;
        this.field3611 = new byte[this.field3605];
        this.field3612 = new Thread(this);
        this.field3612.setDaemon(true);
        this.field3612.start();
    }
}
