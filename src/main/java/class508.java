import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class508 implements Runnable {

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    private int field7464 = 0;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    private int field7469 = 0;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    private int field7462;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field7461;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "[B")
    private byte[] field7459;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field7467;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7471 = new String[] { method3889(method3888("10\u00158A")), method3889(method3888("\"r\u0015S\u0014")), method3889(method3888("10\u0015A\u000075OCA")), method3889(method3888("7)W\u0011")), method3889(method3888("10\u00159A")), method3889(method3888("10\u0015?A")), method3889(method3888("10\u0015<A")), method3889(method3888("10\u0015\u000f\u001c7t")), method3889(method3888("10\u0015>A")), method3889(method3888("10\u0015;A")) };

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Ljava/io/IOException;")
    private IOException field7457;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "[[Z")
    public static boolean[][] field7470;

    @OriginalMember(owner = "client!hl", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        try {
            field7458++;
            while (true) {
                int var2;
                synchronized (this) {
                    while (true) {
                        if (this.field7457 != null) {
                            return;
                        }
                        if (this.field7469 == 0) {
                            var2 = this.field7462 - this.field7464 - 1;
                        } else if (this.field7464 >= this.field7469) {
                            var2 = this.field7462 - this.field7464;
                        } else {
                            var2 = this.field7469 - this.field7464 - 1;
                        }
                        if (var2 > 0) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                }
                int var3;
                try {
                    var3 = this.field7461.read(this.field7459, this.field7464, var2);
                    if (var3 == -1) {
                        throw new EOFException();
                    }
                } catch (IOException var15) {
                    IOException var4 = var15;
                    synchronized (this) {
                        this.field7457 = var4;
                        return;
                    }
                }
                synchronized (this) {
                    this.field7464 = (this.field7464 + var3) % this.field7462;
                }
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field7471[7] + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[BI)I", line = 65)
    public final int method3882(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        try {
            field7456++;
            if (arg0 != -10) {
                return 102;
            } else if (arg3 >= 0 && arg1 >= 0 && (arg1 + arg3) <= arg2.length) {
                synchronized (this) {
                    int var6;
                    if (this.field7469 > this.field7464) {
                        var6 = this.field7464 + this.field7462 - this.field7469;
                    } else {
                        var6 = this.field7464 - this.field7469;
                    }
                    if (var6 < arg3) {
                        arg3 = var6;
                    }
                    if (arg3 == 0 && this.field7457 != null) {
                        throw new IOException(this.field7457.toString());
                    }
                    if (this.field7469 + arg3 > this.field7462) {
                        int var7 = this.field7462 - this.field7469;
                        class569.method4247(this.field7459, this.field7469, arg2, arg1, var7);
                        class569.method4247(this.field7459, 0, arg2, arg1 + var7, -var7 + arg3);
                    } else {
                        class569.method4247(this.field7459, this.field7469, arg2, arg1, arg3);
                    }
                    this.field7469 = (this.field7469 + arg3) % this.field7462;
                    this.notifyAll();
                    return arg3;
                }
            } else {
                throw new IOException();
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field7471[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7471[3] : field7471[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 110)
    public static void method3883(int arg0) {
        try {
            if (arg0 != 1) {
                method3884(-86, 92, (byte) -22);
            }
            field7470 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7471[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIB)B", line = 121)
    public static final byte method3884(int arg0, int arg1, byte arg2) {
        try {
            field7463++;
            if (arg2 >= -43) {
                method3884(-112, -53, (byte) 26);
            }
            if (arg1 == 9) {
                return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
            } else {
                return 0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7471[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 141)
    public final void method3885(int arg0) {
        try {
            field7465++;
            synchronized (this) {
                if (this.field7457 == null) {
                    this.field7457 = new IOException("");
                }
                this.notifyAll();
                if (arg0 != 2) {
                    this.field7459 = null;
                }
            }
            try {
                this.field7467.join();
            } catch (InterruptedException var4) {
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7471[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)Z", line = 163)
    public final boolean method3886(byte arg0, int arg1) throws IOException {
        try {
            field7468++;
            if (arg1 <= 0 || this.field7462 <= arg1) {
                throw new IOException();
            }
            synchronized (this) {
                int var4;
                if (this.field7464 < this.field7469) {
                    var4 = this.field7464 + this.field7462 - this.field7469;
                } else {
                    var4 = this.field7464 - this.field7469;
                }
                if (var4 >= arg1) {
                    int var6 = 107 % ((-arg0 - 83) / 43);
                    return true;
                } else if (this.field7457 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field7457.toString());
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field7471[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 197)
    public final void method3887(byte arg0) {
        try {
            this.field7461 = new class71();
            field7466++;
            if (arg0 != 70) {
                method3883(-115);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7471[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 221)
    public class508(InputStream arg0, int arg1) {
        try {
            this.field7462 = arg1 + 1;
            this.field7461 = arg0;
            this.field7459 = new byte[this.field7462];
            this.field7467 = new Thread(this);
            this.field7467.setDaemon(true);
            this.field7467.start();
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7471[2] + (arg0 == null ? field7471[3] : field7471[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3888(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x69);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3889(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 105;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
