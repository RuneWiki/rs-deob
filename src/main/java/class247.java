import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class247 implements Runnable {

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
    private int field3522 = 0;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "I")
    private int field3530 = 0;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field3523;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "I")
    private int field3524;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "[B")
    private byte[] field3526;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field3518;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "Z")
    public static boolean field3517 = false;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "Llha;")
    public static class649 field3521;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "Ljava/io/IOException;")
    private IOException field3525;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V", line = 5)
    public static void method1658(int arg0) {
        field3521 = null;
        if (arg0 <= 70) {
            method1659((byte) 50, null);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLha;)V", line = 20)
    public static final void method1659(byte arg0, class66 arg1) {
        if (arg0 != 83) {
            method1664(21, null, null, null, null);
        }
        for (class24 var2 = (class24) class497.field7071.method2033(0); var2 != null; var2 = (class24) class497.field7071.method2025((byte) -88)) {
            if (var2.field363) {
                var2.method178(arg1);
            }
        }
        field3528++;
    }

    @OriginalMember(owner = "client!kea", name = "run", descriptor = "()V", line = 41)
    public final void run() {
        field3516++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3525 != null) {
                        return;
                    }
                    if (this.field3530 == 0) {
                        var2 = this.field3524 - (this.field3522 + 1);
                    } else if (this.field3522 > this.field3530) {
                        var2 = this.field3524 - this.field3522;
                    } else {
                        var2 = this.field3530 - this.field3522 - 1;
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
                var3 = this.field3523.read(this.field3526, this.field3522, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3525 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3522 = (this.field3522 + var3) % this.field3524;
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[BII)I", line = 98)
    public final int method1660(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3520++;
        if (arg3 >= -82) {
            this.field3518 = null;
        }
        if (arg2 < 0 || arg0 < 0 || arg1.length < arg0 + arg2) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field3522 < this.field3530) {
                var6 = this.field3524 + this.field3522 - this.field3530;
            } else {
                var6 = this.field3522 - this.field3530;
            }
            if (var6 < arg2) {
                arg2 = var6;
            }
            if (arg2 == 0 && this.field3525 != null) {
                throw new IOException(this.field3525.toString());
            }
            if ((this.field3530 + arg2) <= this.field3524) {
                class42.method288(this.field3526, this.field3530, arg1, arg0, arg2);
            } else {
                int var7 = this.field3524 - this.field3530;
                class42.method288(this.field3526, this.field3530, arg1, arg0, var7);
                class42.method288(this.field3526, 0, arg1, arg0 + var7, -var7 + arg2);
            }
            this.field3530 = (this.field3530 + arg2) % this.field3524;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZI)Z", line = 141)
    public static final boolean method1661(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3515++;
            return (arg2 & 0x20) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)Z", line = 162)
    public final boolean method1662(int arg0, byte arg1) throws IOException {
        field3529++;
        if (arg0 <= 0 || this.field3524 <= arg0) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg1 < 97) {
                method1658(19);
            }
            int var4;
            if (this.field3522 >= this.field3530) {
                var4 = this.field3522 - this.field3530;
            } else {
                var4 = this.field3524 + this.field3522 - this.field3530;
            }
            if (arg0 <= var4) {
                return true;
            } else if (this.field3525 == null) {
                return false;
            } else {
                throw new IOException(this.field3525.toString());
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V", line = 193)
    public final void method1663(byte arg0) {
        this.field3523 = new class54();
        if (arg0 >= -107) {
            this.field3526 = null;
        }
        field3519++;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[ILts;[I[I)V", line = 204)
    public static final void method1664(int arg0, int[] arg1, class559 arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg2.field6432.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field6432[var9] = null;
                    } else {
                        class129 var10 = class203.field2975.method1931((byte) -81, var6);
                        int var11 = var10.field1679;
                        class61 var12 = arg2.field6432[var9];
                        if (var12 != null) {
                            if (var12.field837 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field6432[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field835 = 0;
                                    var12.field834 = var8;
                                    var12.field832 = 0;
                                    var12.field833 = 0;
                                    var12.field836 = 1;
                                    if (!arg2.field6430) {
                                        class524.method3048((byte) 17, 0, arg2, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field832 = 0;
                                }
                            } else if (var10.field1667 >= class203.field2975.method1931((byte) -81, var12.field837).field1667) {
                                var12 = arg2.field6432[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class61 var13 = arg2.field6432[var9] = new class61();
                            var13.field834 = var8;
                            var13.field836 = 1;
                            var13.field833 = 0;
                            var13.field837 = var6;
                            var13.field835 = 0;
                            var13.field832 = 0;
                            if (!arg2.field6430) {
                                class524.method3048((byte) 17, 0, arg2, var10);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field3527++;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V", line = 304)
    public final void method1665(int arg0) {
        synchronized (this) {
            if (arg0 >= -39) {
                return;
            }
            if (this.field3525 == null) {
                this.field3525 = new IOException("");
            }
            this.notifyAll();
        }
        field3531++;
        try {
            this.field3518.join();
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 330)
    public class247(InputStream arg0, int arg1) {
        this.field3523 = arg0;
        this.field3524 = arg1 + 1;
        this.field3526 = new byte[this.field3524];
        this.field3518 = new Thread(this);
        this.field3518.setDaemon(true);
        this.field3518.start();
    }
}
