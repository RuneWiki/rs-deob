import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class219 implements Runnable {

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Z")
    private boolean field3714 = false;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Z")
    private boolean field3718 = false;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    private int field3726 = 0;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    private int field3715 = 0;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "Ljk;")
    private class58 field3733;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "Ljava/net/Socket;")
    private Socket field3728;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "Ljava/io/InputStream;")
    private InputStream field3729;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3724;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lrk;")
    public static class20 field3706 = null;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Lda;")
    public static class275 field3719 = class255.method1672(97, ")3");

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lda;")
    private static class275 field3713 = class255.method1672(103, "wishes to trade with you)3");

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Z")
    public static boolean field3717 = false;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "[S")
    public static short[] field3707 = new short[256];

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "Lda;")
    public static class275 field3723 = field3713;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "Llg;")
    private class266 field3727;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "Z")
    public static boolean field3734;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "[B")
    private byte[] field3732;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)I")
    public final int method1399(boolean arg0) throws IOException {
        field3725++;
        if (arg0) {
            method1411(116, 98);
        }
        return this.field3718 ? 0 : this.field3729.read();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BIII)V")
    public final void method1400(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3721++;
        if (this.field3718) {
            return;
        }
        if (this.field3714) {
            this.field3714 = false;
            throw new IOException();
        }
        if (this.field3732 == null) {
            this.field3732 = new byte[5000];
        }
        if (arg2 != 5000) {
            method1409(113, -66);
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field3732[this.field3715] = arg0[arg1 + var6];
                this.field3715 = (this.field3715 + 1) % 5000;
                if ((this.field3726 + 4900) % 5000 == this.field3715) {
                    throw new IOException();
                }
            }
            if (this.field3727 == null) {
                this.field3727 = this.field3733.method368((byte) -128, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V")
    public static final void method1401(byte arg0, int arg1) {
        field3731++;
        class32.field484 = arg1;
        class29.field446 = 50;
        if (arg0 != -78) {
            field3734 = false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public final void method1402(int arg0) {
        field3720++;
        if (this.field3718) {
            return;
        }
        synchronized (this) {
            this.field3718 = true;
            this.notifyAll();
        }
        if (this.field3727 != null) {
            while (this.field3727.field4623 == 0) {
                class250.method1640(1L, 105);
            }
            if (this.field3727.field4623 == 1) {
                try {
                    ((Thread) this.field3727.field4625).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3727 = null;
        if (arg0 != 1) {
            field3723 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static final void method1403(int arg0) {
        class86.field1454.method987((byte) 6);
        if (arg0 != 9) {
            method1407(-104, (class58) null);
        }
        class82.field1331.method987((byte) 83);
        class44.field744.method987((byte) -112);
        field3735++;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)I")
    public final int method1404(int arg0) throws IOException {
        if (arg0 == -1048) {
            field3711++;
            return this.field3718 ? 0 : this.field3729.available();
        } else {
            return 6;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
    public final void method1405(int arg0) throws IOException {
        field3716++;
        if (this.field3718) {
            return;
        }
        if (arg0 >= -71) {
            method1403(14);
        }
        if (this.field3714) {
            this.field3714 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3712++;
        this.method1402(1);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[BII)V")
    public final void method1406(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3736++;
        if (this.field3718) {
            return;
        }
        if (arg3 >= -94) {
            this.field3728 = null;
        }
        while (arg2 > 0) {
            int var5 = this.field3729.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjk;)V")
    public static final void method1407(int arg0, class58 arg1) {
        field3709++;
        class254 var2 = null;
        try {
            class266 var3 = arg1.method362((byte) -75, "runescape");
            while (var3.field4623 == 0) {
                class250.method1640(1L, 116);
            }
            if (~var3.field4623 == arg0) {
                var2 = (class254) var3.field4625;
                class85 var4 = class216.method1394(0);
                var2.method1668(0, false, var4.field1392, var4.field1381);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1665(true);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
    public static void method1408(int arg0) {
        field3719 = null;
        field3723 = null;
        field3713 = null;
        field3707 = null;
        field3706 = null;
        if (arg0 != 50) {
            field3713 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
    public static final void method1409(int arg0, int arg1) {
        field3730++;
        class31.method183(65);
        class152.method1076((byte) 25);
        int var2 = class251.method1655(arg0, (byte) 98).field3017;
        if (var2 == 0) {
            return;
        }
        if (arg1 != -20144) {
            field3707 = null;
        }
        int var3 = class218.field3698[arg0];
        if (var2 == 5) {
            class3.field31 = var3;
        }
        if (var2 == 9) {
            class29.field444 = var3;
        }
        if (var2 == 6) {
            class78.field1295 = var3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public final void method1410(byte arg0) {
        field3737++;
        if (this.field3718) {
            return;
        }
        this.field3729 = new class30();
        this.field3724 = new class267();
        if (arg0 != 52) {
            method1408(-94);
        }
    }

    @OriginalMember(owner = "client!mg", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3726 == this.field3715) {
                            if (this.field3718) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field3715 < this.field3726) {
                            var2 = 5000 - this.field3726;
                        } else {
                            var2 = this.field3715 - this.field3726;
                        }
                        var3 = this.field3726;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field3724.write(this.field3732, var3, var2);
                    } catch (IOException var9) {
                        this.field3714 = true;
                    }
                    this.field3726 = (this.field3726 + var2) % 5000;
                    try {
                        if (this.field3726 == this.field3715) {
                            this.field3724.flush();
                        }
                    } catch (IOException var8) {
                        this.field3714 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3729 != null) {
                        this.field3729.close();
                    }
                    if (this.field3724 != null) {
                        this.field3724.close();
                    }
                    if (this.field3728 != null) {
                        this.field3728.close();
                    }
                } catch (IOException var7) {
                }
                this.field3732 = null;
                break;
            }
        } catch (Exception var12) {
            class1.method1(var12, (String) null, false);
        }
        field3722++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)Z")
    public static final boolean method1411(int arg0, int arg1) {
        if (arg0 == 0) {
            field3708++;
            return (arg1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/net/Socket;Ljk;)V")
    public class219(Socket arg0, class58 arg1) throws IOException {
        this.field3733 = arg1;
        this.field3728 = arg0;
        this.field3728.setSoTimeout(30000);
        this.field3728.setTcpNoDelay(true);
        this.field3729 = this.field3728.getInputStream();
        this.field3724 = this.field3728.getOutputStream();
    }
}
