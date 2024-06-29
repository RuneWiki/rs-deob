import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class150 implements Runnable {

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    private int field2069 = 0;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    private int field2076 = 0;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field2068;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "[B")
    private byte[] field2063;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field2071;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Lwn;")
    public static class583 field2065 = new class583(7500);

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    public static int field2078 = -1;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "[S")
    public static short[] field2079 = new short[256];

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field2070;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Z", line = 5)
    public final boolean method960(int arg0, int arg1) throws IOException {
        if (arg1 != 6749) {
            this.field2076 = 6;
        }
        field2073++;
        if (arg0 <= 0 || this.field2066 <= arg0) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field2076 > this.field2069) {
                var4 = this.field2069 + this.field2066 - this.field2076;
            } else {
                var4 = this.field2069 - this.field2076;
            }
            if (arg0 <= var4) {
                return true;
            } else if (this.field2070 == null) {
                return false;
            } else {
                throw new IOException(this.field2070.toString());
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V", line = 38)
    public final void method961(boolean arg0) {
        field2062++;
        if (arg0) {
            field2078 = 73;
        }
        this.field2068 = new class423();
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IZ[BI)I", line = 50)
    public final int method962(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        field2075++;
        if (arg3 < 0 || arg0 < 0 || arg0 + arg3 > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field2076 > this.field2069) {
                var6 = this.field2069 + this.field2066 - this.field2076;
            } else {
                var6 = this.field2069 - this.field2076;
            }
            if (arg3 > var6) {
                arg3 = var6;
            }
            if (arg3 == 0 && this.field2070 != null) {
                throw new IOException(this.field2070.toString());
            }
            if (this.field2066 < (this.field2076 + arg3)) {
                int var7 = this.field2066 - this.field2076;
                class34.method245(this.field2063, this.field2076, arg2, arg0, var7);
                class34.method245(this.field2063, 0, arg2, arg0 + var7, -var7 + arg3);
            } else {
                class34.method245(this.field2063, this.field2076, arg2, arg0, arg3);
            }
            this.field2076 = (this.field2076 + arg3) % this.field2066;
            if (arg1) {
                this.notifyAll();
                return arg3;
            } else {
                return 86;
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "run", descriptor = "()V", line = 96)
    public final void run() {
        field2064++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2070 != null) {
                        return;
                    }
                    if (this.field2076 == 0) {
                        var2 = this.field2066 - this.field2069 - 1;
                    } else if (this.field2076 >= this.field2069) {
                        var2 = this.field2076 - this.field2069 - 1;
                    } else {
                        var2 = this.field2066 - this.field2069;
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
                var3 = this.field2068.read(this.field2063, this.field2069, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2070 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2069 = (this.field2069 + var3) % this.field2066;
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 159)
    public static void method963(int arg0) {
        field2079 = null;
        if (arg0 != 0) {
            field2065 = null;
        }
        field2065 = null;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 234)
    public class150(InputStream arg0, int arg1) {
        this.field2066 = arg1 + 1;
        this.field2068 = arg0;
        this.field2063 = new byte[this.field2066];
        this.field2071 = new Thread(this);
        this.field2071.setDaemon(true);
        this.field2071.start();
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lpaa;I)V", line = 177)
    public static final void method964(class712 arg0, int arg1) {
        int var2 = -100 % ((arg1 + 50) / 48);
        field2072++;
        if (arg0.field10039 == 5 && arg0.field9953 != -1) {
            class22.method124(-16777216, arg0, class96.field1401);
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V", line = 192)
    public final void method965(int arg0) {
        synchronized (this) {
            if (this.field2070 == null) {
                this.field2070 = new IOException("");
            }
            if (arg0 != 0) {
                return;
            }
            this.notifyAll();
        }
        field2074++;
        try {
            this.field2071.join();
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)V", line = 213)
    public static final void method966(byte arg0, int arg1) {
        if (arg0 > -99) {
            method966((byte) -98, -28);
        }
        field2067++;
        if (class736.field10292 == 0) {
            class336.field4314.method2301((byte) -36, arg1);
        } else {
            class470.field6423 = arg1;
        }
    }
}
