import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class623 implements Runnable {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    private int field8980 = 0;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    private int field8978 = 0;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field8987;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    private int field8988;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "[B")
    private byte[] field8992;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field8979;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Lim;")
    public static class353 field8994 = new class353(31, 8);

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field8996 = -1;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "[C")
    private static char[] field8995 = new char[64];

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "Luv;")
    public static class3 field8997;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "Lim;")
    public static class353 field8998;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "[I")
    public static int[] field8999;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "Ljava/io/IOException;")
    private IOException field8990;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZII)I")
    public static final int method3590(boolean arg0, boolean arg1, int arg2, int arg3) {
        field8986++;
        class164 var4 = class130.method695(arg1, arg3, Integer.MIN_VALUE);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            if (arg0) {
                field8997 = null;
            }
            for (int var6 = 0; var6 < var4.field2086.length; var6++) {
                if (var4.field2084[var6] == arg2) {
                    var5 += var4.field2086[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public final void method3591(int arg0) {
        field8983++;
        this.field8987 = new class248();
        if (arg0 < 113) {
            field8997 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Lbn;")
    public static final class371 method3592(int arg0, byte arg1) {
        int var2 = 42 / ((arg1 + 65) / 57);
        field8993++;
        class371[] var3 = class190.method1218((byte) -127);
        for (int var4 = 0; var4 < var3.length; var4++) {
            if (var3[var4].field5170 == arg0) {
                return var3[var4];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public static void method3593(int arg0) {
        field8995 = null;
        field8997 = null;
        field8994 = null;
        if (arg0 != -6165) {
            method3590(false, false, 38, -95);
        }
        field8998 = null;
        field8999 = null;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
    public static final void method3594(int arg0) {
        field8981++;
        if (arg0 != 8084) {
            return;
        }
        for (class596 var1 = (class596) class556.field7781.method3188((byte) -100); var1 != null; var1 = (class596) class556.field7781.method3182((byte) -35)) {
            if (var1.field8594 > 0) {
                var1.field8594--;
            }
            if (var1.field8594 != 0) {
                if (var1.field8591 > 0) {
                    var1.field8591--;
                }
                if (var1.field8591 == 0 && var1.field8595 >= 1 && var1.field8590 >= 1 && var1.field8595 <= class139.field1760 - 2 && var1.field8590 <= (class369.field5135 - 2) && (var1.field8588 < 0 || class601.method3458(var1.field8598, (byte) 124, var1.field8588))) {
                    class415.method2472(-1, var1.field8603, var1.field8598, var1.field8588, var1.field8602, var1.field8595, var1.field8599, var1.field8590, false);
                    var1.field8591 = -1;
                    if (var1.field8596 == var1.field8588 && var1.field8596 == -1) {
                        var1.method589(-8880);
                    } else if (var1.field8596 == var1.field8588 && var1.field8603 == var1.field8600 && var1.field8598 == var1.field8592) {
                        var1.method589(-8880);
                    }
                }
            } else if (var1.field8596 < 0 || class601.method3458(var1.field8592, (byte) 120, var1.field8596)) {
                class415.method2472(-1, var1.field8600, var1.field8592, var1.field8596, var1.field8602, var1.field8595, var1.field8599, var1.field8590, false);
                var1.method589(-8880);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "run", descriptor = "()V")
    public final void run() {
        field8991++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field8990 != null) {
                        return;
                    }
                    if (this.field8980 == 0) {
                        var2 = this.field8988 - this.field8978 - 1;
                    } else if (this.field8978 > this.field8980) {
                        var2 = this.field8988 - this.field8978;
                    } else {
                        var2 = this.field8980 - this.field8978 - 1;
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
                var3 = this.field8987.read(this.field8992, this.field8978, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field8990 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field8978 = (this.field8978 + var3) % this.field8988;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V")
    public static final void method3595(int arg0) {
        if (arg0 >= 41) {
            class31.field487 = null;
            field8984++;
            class523.field7293 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Z")
    public final boolean method3596(int arg0, int arg1) throws IOException {
        field8982++;
        if (arg1 <= ~arg0 || this.field8988 <= arg0) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            int var4;
            if (this.field8978 < this.field8980) {
                var4 = this.field8988 + this.field8978 - this.field8980;
            } else {
                var4 = this.field8978 - this.field8980;
            }
            if (var4 >= arg0) {
                return true;
            } else if (this.field8990 == null) {
                return false;
            } else {
                throw new IOException(this.field8990.toString());
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public final void method3597(byte arg0) {
        field8989++;
        synchronized (this) {
            if (this.field8990 == null) {
                this.field8990 = new IOException("");
            }
            this.notifyAll();
        }
        if (arg0 > 28) {
            try {
                this.field8979.join();
            } catch (InterruptedException var3) {
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([BBII)I")
    public final int method3598(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field8985++;
        if (arg3 < 0 || arg2 < 0 || arg2 + arg3 > arg0.length) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            int var6;
            if (this.field8978 >= this.field8980) {
                var6 = this.field8978 - this.field8980;
            } else {
                var6 = this.field8978 + this.field8988 - this.field8980;
            }
            if (arg3 > var6) {
                arg3 = var6;
            }
            if (arg3 == 0 && this.field8990 != null) {
                throw new IOException(this.field8990.toString());
            }
            if (this.field8988 >= (this.field8980 + arg3)) {
                class205.method1311(this.field8992, this.field8980, arg0, arg2, arg3);
            } else {
                int var7 = this.field8988 - this.field8980;
                class205.method1311(this.field8992, this.field8980, arg0, arg2, var7);
                class205.method1311(this.field8992, 0, arg0, arg2 + var7, -var7 + arg3);
            }
            this.field8980 = (this.field8980 + arg3) % this.field8988;
            this.notifyAll();
            if (arg1 != 28) {
                this.field8979 = null;
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class623(InputStream arg0, int arg1) {
        this.field8987 = arg0;
        this.field8988 = arg1 + 1;
        this.field8992 = new byte[this.field8988];
        this.field8979 = new Thread(this);
        this.field8979.setDaemon(true);
        this.field8979.start();
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field8995[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field8995[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field8995[var2] = (char) (var2 + 48 - 52);
        }
        field8995[62] = '+';
        field8995[63] = '/';
        field8997 = new class3(32, 6);
        field8998 = new class353(106, 2);
        field8999 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
    }
}
