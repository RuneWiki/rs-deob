import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class362 implements Runnable {

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    private int field5563 = 0;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    private int field5570 = 0;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    private int field5574;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field5572;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "[B")
    private byte[] field5573;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field5575;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field5561 = 10;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "Lni;")
    public static class367 field5576 = new class367(37, 8);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "Ln;")
    public static class14 field5577;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "Ljava/io/IOException;")
    private IOException field5571;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method2307(int arg0, int arg1) {
        field5565++;
        if (arg0 == 17 || arg0 == 11 || arg0 == 48 || arg0 == 30 || arg0 == 5) {
            return true;
        } else if (arg0 == 47 || arg0 == 1003) {
            return true;
        } else {
            if (arg1 != 22116) {
                method2307(-48, -57);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 29)
    public static void method2308(int arg0) {
        field5576 = null;
        if (arg0 != 1) {
            field5561 = -127;
        }
        field5577 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([BIII)I", line = 41)
    public final int method2309(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5562++;
        if (arg1 < 0 || arg3 < 0 || arg0.length < arg1 + arg3) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            int var6;
            if (this.field5570 <= this.field5563) {
                var6 = this.field5563 - this.field5570;
            } else {
                var6 = this.field5574 + this.field5563 - this.field5570;
            }
            if (var6 < arg1) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field5571 != null) {
                throw new IOException(this.field5571.toString());
            } else if (arg2 == 17039) {
                if ((this.field5570 + arg1) > this.field5574) {
                    int var8 = this.field5574 - this.field5570;
                    class192.method1299(this.field5573, this.field5570, arg0, arg3, var8);
                    class192.method1299(this.field5573, 0, arg0, arg3 + var8, -var8 + arg1);
                } else {
                    class192.method1299(this.field5573, this.field5570, arg0, arg3, arg1);
                }
                this.field5570 = (this.field5570 + arg1) % this.field5574;
                this.notifyAll();
                return arg1;
            } else {
                return 14;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)Z", line = 92)
    public final boolean method2310(byte arg0, int arg1) throws IOException {
        field5560++;
        if (arg1 <= 0 || this.field5574 <= arg1) {
            throw new IndexOutOfBoundsException();
        } else if (arg0 <= 97) {
            return false;
        } else {
            synchronized (this) {
                int var4;
                if (this.field5570 <= this.field5563) {
                    var4 = this.field5563 - this.field5570;
                } else {
                    var4 = this.field5563 + this.field5574 - this.field5570;
                }
                if (var4 >= arg1) {
                    return true;
                } else if (this.field5571 == null) {
                    return false;
                } else {
                    throw new IOException(this.field5571.toString());
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 288)
    public class362(InputStream arg0, int arg1) {
        this.field5574 = arg1 + 1;
        this.field5572 = arg0;
        this.field5573 = new byte[this.field5574];
        this.field5575 = new Thread(this);
        this.field5575.setDaemon(true);
        this.field5575.start();
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIZIIII)V", line = 129)
    public static final void method2311(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        field5567++;
        if (arg4 < 128 || arg8 < 128 || arg4 > class398.field6071 * 128 - 256 || arg8 > (class528.field7734 - 2) * 128) {
            class247.field3449[0] = class247.field3449[1] = -1;
            return;
        }
        int var10 = class352.method2264(-89, arg9, arg8, arg4) - arg1;
        class24.field346.method146(arg0, 0, 0);
        class400.field6090.method821(class24.field346);
        class400.field6090.method793(arg4, var10, arg8, class247.field3449);
        if (!arg5) {
            method2311(81, 33, -58, -99, 16, true, -42, -116, 90, -124);
        }
        class24.field346.method146(-arg0, 0, 0);
        class400.field6090.method821(class24.field346);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V", line = 153)
    public final void method2312(int arg0) {
        synchronized (this) {
            if (this.field5571 == null) {
                this.field5571 = new IOException("");
            }
            if (arg0 < 100) {
                return;
            }
            this.notifyAll();
        }
        field5564++;
        try {
            this.field5575.join();
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 179)
    public final void method2313(boolean arg0) {
        if (arg0) {
            method2314((byte) -72, 41L);
        }
        field5566++;
        this.field5572 = new class360();
    }

    @OriginalMember(owner = "client!cn", name = "run", descriptor = "()V", line = 192)
    public final void run() {
        field5569++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5571 != null) {
                        return;
                    }
                    if (this.field5570 == 0) {
                        var2 = this.field5574 - this.field5563 - 1;
                    } else if (this.field5570 < this.field5563) {
                        var2 = this.field5574 - this.field5563;
                    } else {
                        var2 = this.field5570 - this.field5563 - 1;
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
                var3 = this.field5572.read(this.field5573, this.field5563, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field5571 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field5563 = (this.field5563 + var3) % this.field5574;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 250)
    public static final String method2314(byte arg0, long arg1) {
        field5568++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 <= 64) {
                return null;
            }
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class225.field3117[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }
}
