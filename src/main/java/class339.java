import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class339 implements Runnable {

    @OriginalMember(owner = "client!vea", name = "m", descriptor = "I")
    private int field4812 = 0;

    @OriginalMember(owner = "client!vea", name = "q", descriptor = "I")
    private int field4816 = 0;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field4804;

    @OriginalMember(owner = "client!vea", name = "l", descriptor = "I")
    private int field4811;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "[B")
    private byte[] field4802;

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field4806;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "Z")
    public static boolean field4805 = false;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!vea", name = "i", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!vea", name = "j", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!vea", name = "k", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!vea", name = "n", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!vea", name = "o", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!vea", name = "p", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "Lgga;")
    public static class513 field4807;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "Ljava/io/IOException;")
    private IOException field4803;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V", line = 6)
    public final void method2070(int arg0) {
        field4813++;
        this.field4804 = new class738();
        int var2 = 51 / ((-arg0 - 10) / 41);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/lang/String;Lol;Z)I", line = 17)
    public static final int method2071(String arg0, class431 arg1, boolean arg2) {
        field4810++;
        if (!arg2) {
            method2073(-20);
        }
        int var3 = arg1.field5983;
        byte[] var4 = class98.method813(arg0, -16332);
        arg1.method2564(var4.length, -1655035864);
        arg1.field5983 += class528.field7367.method3966(var4, arg1.field6002, arg1.field5983, var4.length, 0, 124);
        return arg1.field5983 - var3;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)Z", line = 36)
    public final boolean method2072(int arg0, int arg1) throws IOException {
        field4809++;
        if (arg0 <= 0 || arg0 >= this.field4811) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg1 != 10033) {
                this.field4816 = -42;
            }
            int var4;
            if (this.field4812 <= this.field4816) {
                var4 = this.field4816 - this.field4812;
            } else {
                var4 = this.field4816 + this.field4811 - this.field4812;
            }
            if (var4 >= arg0) {
                return true;
            } else if (this.field4803 == null) {
                return false;
            } else {
                throw new IOException(this.field4803.toString());
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)I", line = 70)
    public static final int method2073(int arg0) {
        field4800++;
        if (arg0 >= -40) {
            method2076(110);
        }
        byte var1;
        if (class139.field2293 < 96) {
            var1 = 1;
            class713.method3967(true, 2);
        } else {
            int var2 = class686.method3874((byte) 77);
            if (var2 <= 100) {
                class565.method3294(-5550);
                var1 = 4;
            } else if (var2 <= 500) {
                var1 = 3;
                class775.method4271(255);
            } else if (var2 <= 1000) {
                class698.method3917(102);
                var1 = 2;
            } else {
                var1 = 1;
                class713.method3967(true, 2);
            }
        }
        if (class420.field5820.field9482.method2338(17539) != 0) {
            class420.field5820.method3781(class420.field5820.field9466, 89, 0);
            class636.method3625(false, 0, -21);
        }
        class95.method797(87);
        return var1;
    }

    @OriginalMember(owner = "client!vea", name = "run", descriptor = "()V", line = 132)
    public final void run() {
        field4801++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4803 != null) {
                        return;
                    }
                    if (this.field4812 == 0) {
                        var2 = this.field4811 - this.field4816 - 1;
                    } else if (this.field4816 > this.field4812) {
                        var2 = this.field4811 - this.field4816;
                    } else {
                        var2 = this.field4812 - (this.field4816 + 1);
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
                var3 = this.field4804.read(this.field4802, this.field4816, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field4803 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field4816 = (this.field4816 + var3) % this.field4811;
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)V", line = 189)
    public final void method2074(boolean arg0) {
        field4815++;
        synchronized (this) {
            if (this.field4803 == null) {
                this.field4803 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            if (arg0) {
                method2071(null, null, false);
            }
            this.field4806.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I[BIB)I", line = 209)
    public final int method2075(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field4808++;
        if (arg0 < 0 || arg2 < 0 || arg1.length < (arg0 + arg2)) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field4816 >= this.field4812) {
                var6 = this.field4816 - this.field4812;
            } else {
                var6 = this.field4811 + this.field4816 - this.field4812;
            }
            if (arg3 != -99) {
                return -68;
            }
            if (var6 < arg0) {
                arg0 = var6;
            }
            if (arg0 == 0 && this.field4803 != null) {
                throw new IOException(this.field4803.toString());
            }
            if (this.field4811 < this.field4812 + arg0) {
                int var8 = this.field4811 - this.field4812;
                class171.method1263(this.field4802, this.field4812, arg1, arg2, var8);
                class171.method1263(this.field4802, 0, arg1, arg2 + var8, -var8 + arg0);
            } else {
                class171.method1263(this.field4802, this.field4812, arg1, arg2, arg0);
            }
            this.field4812 = (this.field4812 + arg0) % this.field4811;
            this.notifyAll();
            return arg0;
        }
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V", line = 262)
    public static void method2076(int arg0) {
        if (arg0 == 0) {
            field4807 = null;
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 281)
    public class339(InputStream arg0, int arg1) {
        this.field4804 = arg0;
        this.field4811 = arg1 + 1;
        this.field4802 = new byte[this.field4811];
        this.field4806 = new Thread(this);
        this.field4806.setDaemon(true);
        this.field4806.start();
    }
}
