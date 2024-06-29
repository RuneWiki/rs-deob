import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class237 implements Runnable {

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    private int field3596 = 0;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Z")
    private boolean field3615 = false;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    private int field3605 = 0;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Z")
    private boolean field3617 = false;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field3606;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lvl;")
    private class6 field3601;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field3598;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3600;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3608 = " more options";

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3603 = "shake:";

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Z")
    public static boolean field3595 = false;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lch;")
    private class208 field3616;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
    public static boolean field3607;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "[B")
    private byte[] field3613;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I", line = 10)
    public final int method1648(int arg0) throws IOException {
        if (arg0 == 0) {
            field3604++;
            return this.field3615 ? 0 : this.field3598.available();
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V", line = 24)
    protected final void finalize() {
        field3618++;
        this.method1653(-19746);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 37)
    public final void method1649(int arg0) throws IOException {
        field3602++;
        if (this.field3615) {
            return;
        }
        if (this.field3617) {
            this.field3617 = false;
            throw new IOException();
        } else if (arg0 != -28307) {
            this.field3600 = (OutputStream) null;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 60)
    public final void method1650(int arg0) {
        if (arg0 != -1) {
            method1652(-113);
        }
        field3610++;
        if (!this.field3615) {
            this.field3598 = new class278();
            this.field3600 = new class30();
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/net/Socket;Lvl;)V", line = 341)
    public class237(Socket arg0, class6 arg1) throws IOException {
        this.field3606 = arg0;
        this.field3601 = arg1;
        this.field3606.setSoTimeout(30000);
        this.field3606.setTcpNoDelay(true);
        this.field3598 = this.field3606.getInputStream();
        this.field3600 = this.field3606.getOutputStream();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[BB)V", line = 85)
    public final void method1651(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        if (arg3 > -25) {
            return;
        }
        field3611++;
        if (this.field3615) {
            return;
        }
        if (this.field3617) {
            this.field3617 = false;
            throw new IOException();
        }
        if (this.field3613 == null) {
            this.field3613 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field3613[this.field3605] = arg2[arg0 + var6];
                this.field3605 = (this.field3605 + 1) % 5000;
                if (((this.field3596 + 4900) % 5000) == this.field3605) {
                    throw new IOException();
                }
            }
            if (this.field3616 == null) {
                this.field3616 = this.field3601.method57(this, (byte) 9, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 141)
    public static void method1652(int arg0) {
        field3603 = null;
        if (arg0 == 0) {
            field3608 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 157)
    public final void method1653(int arg0) {
        field3597++;
        if (this.field3615) {
            return;
        }
        synchronized (this) {
            this.field3615 = true;
            this.notifyAll();
        }
        if (this.field3616 != null) {
            while (this.field3616.field3185 == 0) {
                class324.method2252(-24861, 1L);
            }
            if (this.field3616.field3185 == 1) {
                try {
                    ((Thread) this.field3616.field3186).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field3616 = null;
        if (arg0 != -19746) {
            field3608 = (String) null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lth;B)V", line = 197)
    public static final void method1654(class270 arg0, byte arg1) {
        field3594++;
        if (arg1 != 77) {
            field3609 = -105;
        }
        class239 var2 = (class239) class173.field2788.method1716(-1, class49.method374(arg0.field4218, -1));
        if (var2 == null) {
            class83.method635((class76) null, arg0.field4676[0], arg0, 104, 0, class265.field4112, (class32) null, arg0.field4744[0]);
        } else {
            var2.method1665(-84);
        }
    }

    @OriginalMember(owner = "client!e", name = "run", descriptor = "()V", line = 213)
    public final void run() {
        field3619++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field3605 == this.field3596) {
                        if (this.field3615) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field3596;
                    if (this.field3605 >= this.field3596) {
                        var4 = this.field3605 - this.field3596;
                    } else {
                        var4 = 5000 - this.field3596;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field3600.write(this.field3613, var3, var4);
                    } catch (IOException var12) {
                        this.field3617 = true;
                    }
                    this.field3596 = (this.field3596 + var4) % 5000;
                    try {
                        if (this.field3605 == this.field3596) {
                            this.field3600.flush();
                        }
                    } catch (IOException var11) {
                        this.field3617 = true;
                    }
                }
            }
            try {
                if (this.field3598 != null) {
                    this.field3598.close();
                }
                if (this.field3600 != null) {
                    this.field3600.close();
                }
                if (this.field3606 != null) {
                    this.field3606.close();
                }
            } catch (IOException var10) {
            }
            this.field3613 = null;
        } catch (Exception var15) {
            class189.method1401(true, var15, (String) null);
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)I", line = 289)
    public final int method1655(int arg0) throws IOException {
        field3614++;
        if (this.field3615) {
            return 0;
        } else if (arg0 == 0) {
            return this.field3598.read();
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZI[B)V", line = 309)
    public final void method1656(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field3612++;
        if (!arg1) {
            field3609 = -126;
        }
        if (this.field3615) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field3598.read(arg3, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg2 += var5;
        }
    }
}
