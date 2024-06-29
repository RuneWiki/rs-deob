import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class212 implements Runnable {

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    private int field3830 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
    private boolean field3815 = false;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    private int field3821 = 0;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Z")
    private boolean field3836 = false;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field3837;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Lbi;")
    private class66 field3825;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Ljava/io/InputStream;")
    private InputStream field3840;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3838;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "[I")
    public static int[] field3817 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Lsg;")
    private static class30 field3841 = class167.method1221((byte) 33, "cyan:");

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lsg;")
    public static class30 field3823 = field3841;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lsg;")
    public static class30 field3819 = field3841;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Lkb;")
    private class27 field3834;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "[B")
    private byte[] field3816;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public final void method1507(byte arg0) throws IOException {
        field3833++;
        if (arg0 != 115) {
            method1511((byte) 117, (class31) null, 93);
        }
        if (!this.field3836 && this.field3815) {
            this.field3815 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
    public final int method1508(int arg0) throws IOException {
        field3818++;
        if (this.field3836) {
            return 0;
        } else {
            if (arg0 != 0) {
                method1513(-94, -72, -80, false, 39, -29, (class13[]) null, (byte[]) null);
            }
            return this.field3840.available();
        }
    }

    @OriginalMember(owner = "client!u", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1516(-94);
        field3824++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BIIZ)V")
    public final void method1509(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field3827++;
        if (this.field3836) {
            return;
        }
        if (this.field3815) {
            this.field3815 = false;
            throw new IOException();
        }
        if (this.field3816 == null) {
            this.field3816 = new byte[5000];
        }
        synchronized (this) {
            if (!arg3) {
                this.finalize();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field3816[this.field3821] = arg0[arg1 + var6];
                this.field3821 = (this.field3821 + 1) % 5000;
                if (((this.field3830 + 4900) % 5000) == this.field3821) {
                    throw new IOException();
                }
            }
            if (this.field3834 == null) {
                this.field3834 = this.field3825.method592(this, -33, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BIB)V")
    public final void method1510(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field3842++;
        if (this.field3836) {
            return;
        }
        if (arg3 != -6) {
            field3841 = null;
        }
        while (arg2 > 0) {
            int var5 = this.field3840.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLdl;I)Lsg;")
    public static final class30 method1511(byte arg0, class31 arg1, int arg2) {
        field3831++;
        if (!class64.method575(arg2, client.method1498(arg1), 1) && arg1.field786 == null) {
            return null;
        }
        int var3 = -65 % ((-arg0 - 46) / 44);
        if (arg1.field754 == null || arg1.field754.length <= arg2 || arg1.field754[arg2] == null || arg1.field754[arg2].method288((byte) 121).method249(-96) == 0) {
            return class96.field1959 ? class160.method1188(new class30[] { class231.field4117, class73.method675(99, arg2) }, 0) : null;
        } else {
            return arg1.field754[arg2];
        }
    }

    @OriginalMember(owner = "client!u", name = "run", descriptor = "()V")
    public final void run() {
        field3828++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3830 == this.field3821) {
                        if (this.field3836) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field3830 <= this.field3821) {
                        var2 = this.field3821 - this.field3830;
                    } else {
                        var2 = 5000 - this.field3830;
                    }
                    var3 = this.field3830;
                }
                if (var2 > 0) {
                    try {
                        this.field3838.write(this.field3816, var3, var2);
                    } catch (IOException var9) {
                        this.field3815 = true;
                    }
                    this.field3830 = (this.field3830 + var2) % 5000;
                    try {
                        if (this.field3830 == this.field3821) {
                            this.field3838.flush();
                        }
                    } catch (IOException var8) {
                        this.field3815 = true;
                    }
                }
            }
            try {
                if (this.field3840 != null) {
                    this.field3840.close();
                }
                if (this.field3838 != null) {
                    this.field3838.close();
                }
                if (this.field3837 != null) {
                    this.field3837.close();
                }
            } catch (IOException var7) {
            }
            this.field3816 = null;
        } catch (Exception var12) {
            class93.method751(var12, (String) null, -128);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public static void method1512(byte arg0) {
        field3823 = null;
        field3817 = null;
        field3841 = null;
        if (arg0 <= -44) {
            field3819 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIZII[Lue;[B)V")
    public static final void method1513(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class13[] arg6, byte[] arg7) {
        byte var8;
        if (arg3) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field3822++;
        if (!arg3) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg4 + var10) > 0 && arg4 + var10 < 103 && arg2 + var11 > 0 && (arg2 + var11) < 103) {
                            arg6[var9].field258[arg4 + var10][arg2 + var11] = class68.method612(arg6[var9].field258[arg4 + var10][arg2 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class8 var12 = new class8(arg7);
        int var13 = 0;
        if (arg5 <= 41) {
            return;
        }
        while (var13 < var8) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class270.method1847(0, -63, var12, arg0, var14 + arg4, arg2 + var15, var13, arg3, arg1);
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public final void method1514(boolean arg0) {
        field3826++;
        if (this.field3836) {
            return;
        }
        this.field3840 = new class36();
        this.field3838 = new class272();
        if (arg0) {
            this.field3838 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I")
    public final int method1515(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field3836 = false;
        }
        field3835++;
        return this.field3836 ? 0 : this.field3840.read();
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public final void method1516(int arg0) {
        field3829++;
        if (this.field3836 || arg0 > -83) {
            return;
        }
        synchronized (this) {
            this.field3836 = true;
            this.notifyAll();
        }
        if (this.field3834 != null) {
            while (this.field3834.field493 == 0) {
                class160.method1191(1L, 0);
            }
            if (this.field3834.field493 == 1) {
                try {
                    ((Thread) this.field3834.field492).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3834 = null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljava/net/Socket;Lbi;)V")
    public class212(Socket arg0, class66 arg1) throws IOException {
        this.field3837 = arg0;
        this.field3825 = arg1;
        this.field3837.setSoTimeout(30000);
        this.field3837.setTcpNoDelay(true);
        this.field3840 = this.field3837.getInputStream();
        this.field3838 = this.field3837.getOutputStream();
    }
}
