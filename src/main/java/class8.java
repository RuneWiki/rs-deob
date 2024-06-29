import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 implements Runnable {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
    private boolean field122 = false;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    private int field136 = 0;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Z")
    private boolean field137 = false;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    private int field150 = 0;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Lwe;")
    private class147 field152;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field134;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field131;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field124;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field135 = 0;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lmb;")
    public static class84 field121 = class79.method672(true, "Ausw-=hlen");

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lmb;")
    public static class84 field126 = class79.method672(true, "logo");

    @OriginalMember(owner = "client!b", name = "x", descriptor = "Lmb;")
    public static class84 field143 = class79.method672(true, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!b", name = "y", descriptor = "Z")
    public static boolean field144 = false;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field127 = 0;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lmb;")
    public static class84 field142 = class79.method672(true, "Ignorieren");

    @OriginalMember(owner = "client!b", name = "t", descriptor = "[I")
    public static int[] field139 = new int[128];

    @OriginalMember(owner = "client!b", name = "I", descriptor = "Lmb;")
    public static class84 field153 = class79.method672(true, "bevor Sie die (WRegelversto-8 melden(W Option benutzen");

    @OriginalMember(owner = "client!b", name = "F", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field151 = new CRC32();

    @OriginalMember(owner = "client!b", name = "J", descriptor = "Lmb;")
    public static class84 field154 = class79.method672(true, "Schlie-8en");

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "Lsc;")
    public static class121 field147;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lmc;")
    private class85 field130;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[B")
    private byte[] field132;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
    public final int method37(int arg0) throws IOException {
        field145++;
        if (arg0 >= 0) {
            return 55;
        } else if (this.field122) {
            return 0;
        } else {
            return this.field131.available();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public final void method38(byte arg0) {
        field125++;
        if (this.field122 || arg0 != 61) {
            return;
        }
        synchronized (this) {
            this.field122 = true;
            this.notifyAll();
        }
        if (this.field130 != null) {
            while (this.field130.field2117 == 0) {
                class22.method149(98, 1L);
            }
            if (this.field130.field2117 == 1) {
                try {
                    ((Thread) this.field130.field2118).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field130 = null;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) throws IOException {
        field128++;
        if (this.field122) {
            return 0;
        } else if (arg0 > -8) {
            return -102;
        } else {
            return this.field131.read();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III[B)V")
    public final void method40(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 != -19746) {
            field144 = false;
        }
        field129++;
        if (this.field122) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field131.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public static final void method41(byte arg0) {
        field140++;
        class74 var1 = (class74) class115.field2758.method104((byte) 101);
        if (arg0 != -98) {
            field126 = null;
        }
        while (var1 != null) {
            if (class13.field251 != var1.field1811 || class5.field100 > var1.field1827) {
                var1.method121(false);
            } else if (class5.field100 >= var1.field1828) {
                if (var1.field1804 > 0) {
                    class103 var2 = class69.field1673[var1.field1804 - 1];
                    if (var2 != null && var2.field3549 >= 0 && var2.field3549 < 13312 && var2.field3535 >= 0 && var2.field3535 < 13312) {
                        var1.method644(class5.field100, arg0 ^ 0x10, var2.field3549, class41.method309((byte) 64, var2.field3549, var2.field3535, var1.field1811) - var1.field1794, var2.field3535);
                    }
                }
                if (var1.field1804 < 0) {
                    int var3 = -var1.field1804 - 1;
                    class62 var4;
                    if (class90.field2264 == var3) {
                        var4 = class40.field925;
                    } else {
                        var4 = class44.field978[var3];
                    }
                    if (var4 != null && var4.field3549 >= 0 && var4.field3549 < 13312 && var4.field3535 >= 0 && var4.field3535 < 13312) {
                        var1.method644(class5.field100, arg0 - 18, var4.field3549, class41.method309((byte) 64, var4.field3549, var4.field3535, var1.field1811) - var1.field1794, var4.field3535);
                    }
                }
                var1.method643(class108.field2613, arg0 + 1122);
                class133.field3173.method494(class13.field251, (int) var1.field1821, (int) var1.field1814, (int) var1.field1830, 60, var1, var1.field1812, -1, false);
            }
            var1 = (class74) class115.field2758.method107(arg0 + 96);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
    public static final boolean method42(int arg0, int arg1) {
        field120++;
        if (arg0 != -19047) {
            field135 = -50;
        }
        if (arg1 < 0) {
            return false;
        }
        int var2 = class2.field38[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 13;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILwc;)V")
    public static final void method43(int arg0, class145 arg1) {
        int var2 = -114 % ((42 - arg0) / 63);
        field146++;
        int var3 = arg1.field3563 - class5.field100;
        int var4 = arg1.field3562 * 64 + arg1.field3550 * 128;
        int var5 = arg1.field3547 * 128 + arg1.field3562 * 64;
        if (arg1.field3493 == 0) {
            arg1.field3505 = 1024;
        }
        arg1.field3535 += (var4 - arg1.field3535) / var3;
        if (arg1.field3493 == 1) {
            arg1.field3505 = 1536;
        }
        arg1.field3549 += (var5 - arg1.field3549) / var3;
        arg1.field3565 = 0;
        if (arg1.field3493 == 2) {
            arg1.field3505 = 0;
        }
        if (arg1.field3493 == 3) {
            arg1.field3505 = 512;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
    public static final void method44(int arg0, boolean arg1) {
        if (!arg1) {
            field147 = null;
        }
        field138++;
        class119.method971((byte) 113, arg0);
        class43.method319(-8808784, arg0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIB[B)V")
    public final void method45(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (arg2 != 87) {
            method42(9, 20);
        }
        field141++;
        if (this.field122) {
            return;
        }
        if (this.field137) {
            this.field137 = false;
            throw new IOException();
        }
        if (this.field132 == null) {
            this.field132 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field132[this.field136] = arg3[arg0 + var6];
                this.field136 = (this.field136 + 1) % 5000;
                if ((this.field150 + 4900) % 5000 == this.field136) {
                    throw new IOException();
                }
            }
            if (this.field130 == null) {
                this.field130 = this.field152.method1198(this, false, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!b", name = "run", descriptor = "()V")
    public final void run() {
        field123++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field150 == this.field136) {
                        if (this.field122) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field150;
                    if (this.field136 < this.field150) {
                        var3 = 5000 - this.field150;
                    } else {
                        var3 = this.field136 - this.field150;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field124.write(this.field132, var2, var3);
                    } catch (IOException var9) {
                        this.field137 = true;
                    }
                    this.field150 = (this.field150 + var3) % 5000;
                    try {
                        if (this.field150 == this.field136) {
                            this.field124.flush();
                        }
                    } catch (IOException var8) {
                        this.field137 = true;
                    }
                }
            }
            try {
                if (this.field131 != null) {
                    this.field131.close();
                }
                if (this.field124 != null) {
                    this.field124.close();
                }
                if (this.field134 != null) {
                    this.field134.close();
                }
            } catch (IOException var7) {
            }
            this.field132 = null;
        } catch (Exception var12) {
            class68.method604(20233, null, var12);
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
    public static void method46(byte arg0) {
        field142 = null;
        field143 = null;
        field153 = null;
        field154 = null;
        field151 = null;
        field121 = null;
        field147 = null;
        if (arg0 != -107) {
            method42(8, -73);
        }
        field126 = null;
        field139 = null;
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method38((byte) 61);
        field133++;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Ljava/net/Socket;Lwe;)V")
    public class8(Socket arg0, class147 arg1) throws IOException {
        this.field152 = arg1;
        this.field134 = arg0;
        this.field134.setSoTimeout(30000);
        this.field134.setTcpNoDelay(true);
        this.field131 = this.field134.getInputStream();
        this.field124 = this.field134.getOutputStream();
    }
}
