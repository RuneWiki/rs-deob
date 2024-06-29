import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class118 implements Runnable {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Z")
    private boolean field1851 = false;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    private int field1869 = 0;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Z")
    private boolean field1865 = false;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    private int field1872 = 0;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lna;")
    private class26 field1856;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1853;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field1849;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1868;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[I")
    public static int[] field1859 = new int[25];

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field1861 = 0;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "Lqm;")
    private class233 field1862;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Z")
    public static boolean field1858;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[B")
    private byte[] field1870;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "[[I")
    public static int[][] field1871;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 7)
    public static void method913(byte arg0) {
        field1871 = (int[][]) null;
        if (arg0 <= 4) {
            method913((byte) 62);
        }
        field1859 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 19)
    public final void method914(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field1854++;
        if (!this.field1865) {
            this.field1849 = new class93();
            this.field1868 = new class78();
        }
    }

    @OriginalMember(owner = "client!el", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() {
        field1852++;
        this.method916(-25224);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)I", line = 43)
    public final int method915(int arg0) throws IOException {
        field1857++;
        if (this.field1865) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method914(-10);
            }
            return this.field1849.available();
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V", line = 59)
    public final void method916(int arg0) {
        field1867++;
        if (this.field1865) {
            return;
        }
        synchronized (this) {
            this.field1865 = true;
            this.notifyAll();
        }
        if (this.field1862 != null) {
            while (this.field1862.field3585 == 0) {
                class97.method768(1L, 47);
            }
            if (this.field1862.field3585 == 1) {
                try {
                    ((Thread) this.field1862.field3590).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1862 = null;
        if (arg0 != -25224) {
            method917(-25, 15, -104);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V", line = 96)
    public static final void method917(int arg0, int arg1, int arg2) {
        field1863++;
        int var3 = arg1;
        if (arg1 > 25) {
            var3 = 25;
        }
        arg1--;
        int var4 = class101.field1548[arg1];
        int var5 = class245.field3684[arg1];
        if (arg2 == 0) {
            class199.field3142++;
            class159.field2372.method59(72, (byte) 73);
            class159.field2372.method262((byte) 81, var3 + var3 + 3);
        }
        if (arg2 == 1) {
            class199.field3155++;
            class159.field2372.method59(80, (byte) 73);
            class159.field2372.method262((byte) 81, var3 + var3 + 3 + 14);
        }
        if (arg2 == 2) {
            class159.field2372.method59(185, (byte) 73);
            class159.field2372.method262((byte) 81, var3 + var3 + 3);
            class246.field3701++;
        }
        class261.field3868 = class245.field3684[arg0];
        class327.field5075 = class101.field1548[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class159.field2372.method251(class101.field1548[arg1] - var4, -123);
            class159.field2372.method251(class245.field3684[arg1] - var5, -123);
        }
        class159.field2372.method290(class50.field768[82] ? 1 : 0, false);
        class159.field2372.method263(var5 + class110.field1744, (byte) 105);
        class159.field2372.method303(class302.field4735 + var4, (byte) 56);
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)I", line = 159)
    public final int method918(int arg0) throws IOException {
        field1864++;
        if (arg0 != 0) {
            method917(76, 11, -93);
        }
        return this.field1865 ? 0 : this.field1849.read();
    }

    @OriginalMember(owner = "client!el", name = "run", descriptor = "()V", line = 181)
    public final void run() {
        field1855++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field1872 == this.field1869) {
                        if (this.field1865) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field1872;
                    if (this.field1872 > this.field1869) {
                        var4 = 5000 - this.field1872;
                    } else {
                        var4 = this.field1869 - this.field1872;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field1868.write(this.field1870, var3, var4);
                    } catch (IOException var12) {
                        this.field1851 = true;
                    }
                    this.field1872 = (this.field1872 + var4) % 5000;
                    try {
                        if (this.field1872 == this.field1869) {
                            this.field1868.flush();
                        }
                    } catch (IOException var11) {
                        this.field1851 = true;
                    }
                }
            }
            try {
                if (this.field1849 != null) {
                    this.field1849.close();
                }
                if (this.field1868 != null) {
                    this.field1868.close();
                }
                if (this.field1853 != null) {
                    this.field1853.close();
                }
            } catch (IOException var10) {
            }
            this.field1870 = null;
        } catch (Exception var15) {
            class50.method464((byte) 45, (String) null, var15);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I[BII)V", line = 258)
    public final void method919(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1850++;
        if (this.field1865) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1849.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
        if (arg2 != 10224) {
            method913((byte) 67);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B[BII)V", line = 287)
    public final void method920(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1866++;
        if (this.field1865) {
            return;
        }
        if (this.field1851) {
            this.field1851 = false;
            throw new IOException();
        }
        if (this.field1870 == null) {
            this.field1870 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1870[this.field1869] = arg1[arg2 + var6];
                this.field1869 = (this.field1869 + 1) % 5000;
                if ((this.field1872 + 4900) % 5000 == this.field1869) {
                    throw new IOException();
                }
            }
            if (arg0 != -76) {
                this.field1868 = (OutputStream) null;
            }
            if (this.field1862 == null) {
                this.field1862 = this.field1856.method163(3, (byte) -75, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Ljava/net/Socket;Lna;)V", line = 381)
    public class118(Socket arg0, class26 arg1) throws IOException {
        this.field1856 = arg1;
        this.field1853 = arg0;
        this.field1853.setSoTimeout(30000);
        this.field1853.setTcpNoDelay(true);
        this.field1849 = this.field1853.getInputStream();
        this.field1868 = this.field1853.getOutputStream();
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V", line = 350)
    public final void method921(int arg0) throws IOException {
        field1860++;
        if (arg0 <= 23) {
            this.method916(-62);
        }
        if (!this.field1865 && this.field1851) {
            this.field1851 = false;
            throw new IOException();
        }
    }
}
