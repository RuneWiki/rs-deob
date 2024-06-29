import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class511 implements Runnable {

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    private int field7200 = 0;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    private int field7208 = 0;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    private int field7201;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field7203;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "[B")
    private byte[] field7206;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field7211;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "Lff;")
    public static class296 field7212;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "Ljava/io/IOException;")
    private IOException field7204;

    @OriginalMember(owner = "client!vda", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field7210++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7204 != null) {
                        return;
                    }
                    if (this.field7200 == 0) {
                        var2 = this.field7201 - this.field7208 - 1;
                    } else if (this.field7208 > this.field7200) {
                        var2 = this.field7201 - this.field7208;
                    } else {
                        var2 = this.field7200 - this.field7208 - 1;
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
                var3 = this.field7203.read(this.field7206, this.field7208, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7204 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7208 = (this.field7208 + var3) % this.field7201;
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V", line = 60)
    public static void method2938(int arg0) {
        field7212 = null;
        if (arg0 != 0) {
            method2944((byte) 107);
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V", line = 70)
    public final void method2939(int arg0) {
        field7207++;
        if (arg0 != 0) {
            this.method2939(-60);
        }
        this.field7203 = new class557();
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V", line = 82)
    public final void method2940(int arg0) {
        field7202++;
        synchronized (this) {
            if (this.field7204 == null) {
                this.field7204 = new IOException("");
            }
            this.notifyAll();
            if (arg0 >= -91) {
                this.field7203 = null;
            }
        }
        try {
            this.field7211.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 238)
    public class511(InputStream arg0, int arg1) {
        this.field7201 = arg1 + 1;
        this.field7203 = arg0;
        this.field7206 = new byte[this.field7201];
        this.field7211 = new Thread(this);
        this.field7211.setDaemon(true);
        this.field7211.start();
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)V", line = 111)
    public static final void method2941(boolean arg0) {
        field7213++;
        class223.field2944.method346(class223.field2944.field637, 1, false);
        class223.field2944.method346(class223.field2944.field619, 1, false);
        class223.field2944.method346(class223.field2944.field596, 2, false);
        class223.field2944.method346(class223.field2944.field588, 2, false);
        class223.field2944.method346(class223.field2944.field610, 1, false);
        class223.field2944.method346(class223.field2944.field591, 1, false);
        class223.field2944.method346(class223.field2944.field620, 1, false);
        class223.field2944.method346(class223.field2944.field622, 1, false);
        class223.field2944.method346(class223.field2944.field611, 1, false);
        class223.field2944.method346(class223.field2944.field621, 1, false);
        class223.field2944.method346(class223.field2944.field628, 1, false);
        class223.field2944.method346(class223.field2944.field602, 1, !arg0);
        class223.field2944.method346(class223.field2944.field604, 0, false);
        class223.field2944.method346(class223.field2944.field585, 1, false);
        class223.field2944.method346(class223.field2944.field618, 0, false);
        class223.field2944.method346(class223.field2944.field631, 0, false);
        class223.field2944.method346(class223.field2944.field615, 1, false);
        class223.field2944.method346(class223.field2944.field612, 0, false);
        class223.field2944.method346(class223.field2944.field594, 0, false);
        class87.method613(-18535);
        class223.field2944.method346(class223.field2944.field626, 1, false);
        class223.field2944.method346(class223.field2944.field609, 3, !arg0);
        class681.method3687((byte) 96);
        class37.method328((byte) -45);
        class315.field4051 = arg0;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(III[B)I", line = 145)
    public final int method2942(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field7205++;
        if (arg1 < 0 || arg0 < 0 || arg0 + arg1 > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field7200 <= this.field7208) {
                var6 = this.field7208 - this.field7200;
            } else {
                var6 = this.field7201 + this.field7208 - this.field7200;
            }
            if (var6 < arg1) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field7204 != null) {
                throw new IOException(this.field7204.toString());
            }
            if (arg2 < 77) {
                field7212 = null;
            }
            if (this.field7201 < (this.field7200 + arg1)) {
                int var7 = this.field7201 - this.field7200;
                class617.method3389(this.field7206, this.field7200, arg3, arg0, var7);
                class617.method3389(this.field7206, 0, arg3, arg0 + var7, -var7 + arg1);
            } else {
                class617.method3389(this.field7206, this.field7200, arg3, arg0, arg1);
            }
            this.field7200 = (this.field7200 + arg1) % this.field7201;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)Z", line = 192)
    public final boolean method2943(int arg0, boolean arg1) throws IOException {
        if (!arg1) {
            return true;
        }
        field7214++;
        if (arg0 <= 0 || this.field7201 <= arg0) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field7208 < this.field7200) {
                var4 = this.field7208 + this.field7201 - this.field7200;
            } else {
                var4 = this.field7208 - this.field7200;
            }
            if (var4 >= arg0) {
                return true;
            } else if (this.field7204 == null) {
                return false;
            } else {
                throw new IOException(this.field7204.toString());
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V", line = 227)
    public static final void method2944(byte arg0) {
        field7209++;
        class494.field6991 = new class718(class586.field8129.method3261(class416.field5920, (byte) 82), "", class105.field1289, 1001, -1, 0L, 0, 0, true, false, 0L, true);
        if (arg0 != 122) {
            field7212 = null;
        }
    }
}
