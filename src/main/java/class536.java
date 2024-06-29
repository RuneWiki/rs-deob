import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class536 implements Runnable {

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    private int field7967 = 0;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    private int field7975 = 0;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    private int field7963;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field7976;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "[B")
    private byte[] field7977;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field7973;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field7972 = 0;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Ltda;")
    public static class546 field7969 = new class546(4, 1, 1, 1);

    @OriginalMember(owner = "client!go", name = "s", descriptor = "Lh;")
    public static class572 field7980 = new class572("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "Ltca;")
    public static class150 field7966;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "Ljava/io/IOException;")
    private IOException field7965;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIB[B)I")
    public final int method3245(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field7970++;
        if (arg1 < 0 || arg0 < 0 || arg3.length < arg0 + arg1) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            int var6 = -19 / ((arg2 - 61) / 35);
            int var7;
            if (this.field7967 >= this.field7975) {
                var7 = this.field7967 - this.field7975;
            } else {
                var7 = this.field7963 + this.field7967 - this.field7975;
            }
            if (var7 < arg1) {
                arg1 = var7;
            }
            if (arg1 == 0 && this.field7965 != null) {
                throw new IOException(this.field7965.toString());
            }
            if (this.field7963 >= (this.field7975 + arg1)) {
                class648.method3737(this.field7977, this.field7975, arg3, arg0, arg1);
            } else {
                int var8 = this.field7963 - this.field7975;
                class648.method3737(this.field7977, this.field7975, arg3, arg0, var8);
                class648.method3737(this.field7977, 0, arg3, arg0 + var8, -var8 + arg1);
            }
            this.field7975 = (this.field7975 + arg1) % this.field7963;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!go", name = "run", descriptor = "()V")
    public final void run() {
        field7962++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7965 != null) {
                        return;
                    }
                    if (this.field7975 == 0) {
                        var2 = this.field7963 - this.field7967 - 1;
                    } else if (this.field7967 > this.field7975) {
                        var2 = this.field7963 - this.field7967;
                    } else {
                        var2 = this.field7975 - this.field7967 - 1;
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
                var3 = this.field7976.read(this.field7977, this.field7967, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7965 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7967 = (this.field7967 + var3) % this.field7963;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V")
    public static final void method3246(boolean arg0, int arg1) {
        if (arg0 && class339.field4664 != null) {
            class215.field3163 = class339.field4664.field9348;
        } else {
            class215.field3163 = -1;
        }
        field7974++;
        class339.field4664 = null;
        class624.field9190 = 0;
        class227.field3313 = null;
        class437.field5843 = null;
        class339.method2070();
        if (arg1 != 9057) {
            return;
        }
        class339.field4681.method122((byte) 14);
        class377.field5200 = null;
        class156.field2323 = null;
        class583.field8569 = null;
        class488.field6946 = null;
        class268.field3815 = null;
        class485.field6906 = -1;
        class77.field1031 = null;
        class224.field3246 = null;
        class117.field1641 = null;
        class451.field6372 = -1;
        class540.field8089 = null;
        class339.field4676 = null;
        if (class339.field4665 != null) {
            class339.field4665.method3063(20725);
            class339.field4665.method3062(64, 36, 128);
        }
        if (class339.field4670 != null) {
            class339.field4670.method547(16581, 64, 64);
        }
        if (class339.field4666 != null) {
            class339.field4666.method1503((byte) -1, 64);
        }
        class32.field393.method2266(64, 0);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
    public static void method3247(boolean arg0) {
        field7980 = null;
        field7969 = null;
        if (!arg0) {
            field7966 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public final void method3248(int arg0) {
        synchronized (this) {
            if (arg0 != -1) {
                this.field7963 = 107;
            }
            if (this.field7965 == null) {
                this.field7965 = new IOException("");
            }
            this.notifyAll();
        }
        field7979++;
        try {
            this.field7973.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Z")
    public final boolean method3249(int arg0, int arg1) throws IOException {
        field7981++;
        if (arg1 <= 0 || arg1 >= this.field7963) {
            throw new IndexOutOfBoundsException();
        }
        int var3 = -69 % ((arg0 + 24) / 49);
        synchronized (this) {
            int var5;
            if (this.field7975 > this.field7967) {
                var5 = this.field7963 - (this.field7975 - this.field7967);
            } else {
                var5 = this.field7967 - this.field7975;
            }
            if (var5 >= arg1) {
                return true;
            } else if (this.field7965 == null) {
                return false;
            } else {
                throw new IOException(this.field7965.toString());
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class536(InputStream arg0, int arg1) {
        this.field7963 = arg1 + 1;
        this.field7976 = arg0;
        this.field7977 = new byte[this.field7963];
        this.field7973 = new Thread(this);
        this.field7973.setDaemon(true);
        this.field7973.start();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public final void method3250(byte arg0) {
        if (arg0 < -101) {
            this.field7976 = new class316();
            field7964++;
        }
    }
}
