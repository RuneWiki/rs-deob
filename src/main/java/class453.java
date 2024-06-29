import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class453 implements Runnable {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    private int field6612 = 0;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    private int field6625 = 0;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    private int field6621;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field6619;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[B")
    private byte[] field6616;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field6623;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lqu;")
    public static class364 field6615 = new class364(13, 8);

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field6622 = 0;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Ljava/io/IOException;")
    private IOException field6610;

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field6613++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6610 != null) {
                        return;
                    }
                    if (this.field6612 == 0) {
                        var2 = this.field6621 - this.field6625 - 1;
                    } else if (this.field6625 > this.field6612) {
                        var2 = this.field6621 - this.field6625;
                    } else {
                        var2 = this.field6612 - this.field6625 - 1;
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
                var3 = this.field6619.read(this.field6616, this.field6625, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6610 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6625 = (this.field6625 + var3) % this.field6621;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 65)
    public final void method2725(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field6620++;
        synchronized (this) {
            if (this.field6610 == null) {
                this.field6610 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field6623.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 86)
    public final void method2726(int arg0) {
        this.field6619 = new class29();
        if (arg0 < 126) {
            this.field6625 = 52;
        }
        field6614++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III[B)I", line = 98)
    public final int method2727(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 != 7041) {
            return -34;
        }
        field6617++;
        if (arg1 < 0 || arg0 < 0 || arg3.length < arg0 + arg1) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            int var6;
            if (this.field6625 < this.field6612) {
                var6 = this.field6621 + this.field6625 - this.field6612;
            } else {
                var6 = this.field6625 - this.field6612;
            }
            if (var6 < arg1) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field6610 != null) {
                throw new IOException(this.field6610.toString());
            }
            if (this.field6621 >= (this.field6612 + arg1)) {
                class473.method2883(this.field6616, this.field6612, arg3, arg0, arg1);
            } else {
                int var7 = this.field6621 - this.field6612;
                class473.method2883(this.field6616, this.field6612, arg3, arg0, var7);
                class473.method2883(this.field6616, 0, arg3, arg0 + var7, -var7 + arg1);
            }
            this.field6612 = (this.field6612 + arg1) % this.field6621;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 255)
    public class453(InputStream arg0, int arg1) {
        this.field6621 = arg1 + 1;
        this.field6619 = arg0;
        this.field6616 = new byte[this.field6621];
        this.field6623 = new Thread(this);
        this.field6623.setDaemon(true);
        this.field6623.start();
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILhca;)V", line = 151)
    public static final void method2728(int arg0, int arg1, int arg2, class179 arg3) {
        field6611++;
        if (arg3.field1024 == arg2 && arg2 != -1) {
            class224 var4 = class470.field7205.method3498(false, arg2);
            int var5 = var4.field3301;
            if (var5 == 1) {
                arg3.field1008 = 0;
                arg3.field1079 = arg0;
                arg3.field999 = 1;
                arg3.field998 = 0;
                arg3.field1057 = 0;
                class295.method1830(arg3.field1057, arg3.field3463, (byte) 60, arg3.field3457, var4, class239.field3493 == arg3, arg3.field3464);
            }
            if (var5 == 2) {
                arg3.field998 = 0;
            }
        } else if (arg2 == -1 || arg3.field1024 == -1 || class470.field7205.method3498(false, arg2).field3308 >= class470.field7205.method3498(false, arg3.field1024).field3308) {
            arg3.field1079 = arg0;
            arg3.field1008 = 0;
            arg3.field1057 = 0;
            arg3.field1024 = arg2;
            arg3.field1097 = arg3.field1091;
            arg3.field999 = 1;
            arg3.field998 = 0;
            if (arg3.field1024 != -1) {
                class295.method1830(arg3.field1057, arg3.field3463, (byte) -110, arg3.field3457, class470.field7205.method3498(false, arg3.field1024), class239.field3493 == arg3, arg3.field3464);
            }
        }
        if (arg1 <= 56) {
            field6622 = 52;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Z", line = 208)
    public final boolean method2729(int arg0, byte arg1) throws IOException {
        if (arg1 < 69) {
            return false;
        }
        field6618++;
        if (arg0 <= 0 || this.field6621 <= arg0) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            int var4;
            if (this.field6625 < this.field6612) {
                var4 = this.field6625 + this.field6621 - this.field6612;
            } else {
                var4 = this.field6625 - this.field6612;
            }
            if (var4 >= arg0) {
                return true;
            } else if (this.field6610 == null) {
                return false;
            } else {
                throw new IOException(this.field6610.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V", line = 243)
    public static void method2730(int arg0) {
        field6615 = null;
        if (arg0 != 0) {
            method2728(68, 81, 49, null);
        }
    }
}
