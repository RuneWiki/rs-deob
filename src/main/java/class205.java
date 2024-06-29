import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class205 implements Runnable {

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    private int field3676 = 0;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Z")
    private boolean field3674 = false;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    private int field3678 = 0;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "Z")
    private boolean field3686 = false;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lfb;")
    private class29 field3670;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Ljava/net/Socket;")
    private Socket field3677;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field3667;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3664;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3662 = 0;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3665 = 0;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lid;")
    public static class149 field3668 = class60.method382("Librairie 3D d-Bmarr-Be", (byte) 42);

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Lid;")
    public static class149 field3684 = class60.method382("blinken3:", (byte) 25);

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lid;")
    public static class149 field3679 = class60.method382(")4", (byte) 118);

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field3685 = 0;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lid;")
    public static class149 field3683 = class60.method382("Sprites charg-Bs", (byte) 125);

    @OriginalMember(owner = "client!se", name = "A", descriptor = "Lid;")
    public static class149 field3688 = class60.method382("Angreifen", (byte) 73);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Ldj;")
    private class187 field3675;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "[B")
    private byte[] field3689;

    @OriginalMember(owner = "client!se", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3678 == this.field3676) {
                            if (this.field3674) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field3676 >= this.field3678) {
                            var2 = this.field3676 - this.field3678;
                        } else {
                            var2 = 5000 - this.field3678;
                        }
                        var3 = this.field3678;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field3664.write(this.field3689, var3, var2);
                    } catch (IOException var9) {
                        this.field3686 = true;
                    }
                    this.field3678 = (this.field3678 + var2) % 5000;
                    try {
                        if (this.field3678 == this.field3676) {
                            this.field3664.flush();
                        }
                    } catch (IOException var8) {
                        this.field3686 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3667 != null) {
                        this.field3667.close();
                    }
                    if (this.field3664 != null) {
                        this.field3664.close();
                    }
                    if (this.field3677 != null) {
                        this.field3677.close();
                    }
                } catch (IOException var7) {
                }
                this.field3689 = null;
                break;
            }
        } catch (Exception var12) {
            class100.method720(var12, (String) null, 1);
        }
        field3681++;
    }

    @OriginalMember(owner = "client!se", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1398((byte) 126);
        field3687++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)I")
    public final int method1392(int arg0) throws IOException {
        int var2 = -100 % ((arg0 - 60) / 37);
        field3680++;
        return this.field3674 ? 0 : this.field3667.available();
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public final void method1393(int arg0) throws IOException {
        field3669++;
        if (arg0 != 5000) {
            this.field3677 = null;
        }
        if (!this.field3674 && this.field3686) {
            this.field3686 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public final void method1394(int arg0) {
        if (arg0 != 3) {
            return;
        }
        field3663++;
        if (!this.field3674) {
            this.field3667 = new class211();
            this.field3664 = new class94();
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B[BII)V")
    public final void method1395(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != -115) {
            field3684 = null;
        }
        field3673++;
        if (this.field3674) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field3667.read(arg1, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public static final void method1396(int arg0, int arg1, int arg2) {
        field3690++;
        class219 var3 = class15.method94(31473, arg0);
        int var4 = var3.field3860;
        int var5 = var3.field3866;
        int var6 = var3.field3865;
        int var7 = class232.field4080[var6 - var4];
        if (arg1 > arg2 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var4;
        class170.method1223(112, var5, arg2 << var4 & var8 | class115.field1953[var5] & ~var8);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)I")
    public final int method1397(int arg0) throws IOException {
        if (arg0 != 17506) {
            field3685 = 78;
        }
        field3682++;
        return this.field3674 ? 0 : this.field3667.read();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public final void method1398(byte arg0) {
        field3672++;
        if (this.field3674) {
            return;
        }
        synchronized (this) {
            this.field3674 = true;
            int var3 = 56 / ((arg0 - 56) / 53);
            this.notifyAll();
        }
        if (this.field3675 != null) {
            while (this.field3675.field3358 == 0) {
                class151.method1074(-107, 1L);
            }
            if (this.field3675.field3358 == 1) {
                try {
                    ((Thread) this.field3675.field3357).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field3675 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZBIIZ)V")
    public static final void method1399(boolean arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        int var5 = 109 / ((40 - arg1) / 38);
        class96.method703(0, arg3, class108.field1877.length - 1, arg2, arg4, false, arg0);
        field3671++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[BIB)V")
    public final void method1400(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field3666++;
        if (this.field3674) {
            return;
        }
        if (this.field3686) {
            this.field3686 = false;
            throw new IOException();
        }
        if (this.field3689 == null) {
            this.field3689 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field3689[this.field3676] = arg1[arg0 + var6];
                this.field3676 = (this.field3676 + 1) % 5000;
                if (((this.field3678 + 4900) % 5000) == this.field3676) {
                    throw new IOException();
                }
            }
            if (arg3 <= 59) {
                method1396(100, -37, -9);
            }
            if (this.field3675 == null) {
                this.field3675 = this.field3670.method175(2, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
    public static void method1401(int arg0) {
        field3668 = null;
        field3688 = null;
        field3679 = null;
        if (arg0 >= -3) {
            method1399(false, (byte) 114, -29, -113, false);
        }
        field3683 = null;
        field3684 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljava/net/Socket;Lfb;)V")
    public class205(Socket arg0, class29 arg1) throws IOException {
        this.field3670 = arg1;
        this.field3677 = arg0;
        this.field3677.setSoTimeout(30000);
        this.field3677.setTcpNoDelay(true);
        this.field3667 = this.field3677.getInputStream();
        this.field3664 = this.field3677.getOutputStream();
    }
}
