import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class72 implements Runnable {

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    private int field1857 = 0;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    private int field1850 = 0;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "Z")
    private boolean field1870 = false;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "Z")
    private boolean field1882 = false;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Ljava/net/Socket;")
    private Socket field1867;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Ljc;")
    private class57 field1869;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "Ljava/io/InputStream;")
    private InputStream field1883;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1864;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Lv;")
    public static class122 field1861 = class55.method425(-66, "Um ein neues Spielkonto zu erstellen)1 m\u001c1ssen Sie");

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1851 = -1;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field1868 = 0;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lv;")
    private static class122 field1862 = class55.method425(-56, "flash2:");

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lv;")
    private static class122 field1863 = class55.method425(-96, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!m", name = "D", descriptor = "[I")
    public static int[] field1876 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!m", name = "z", descriptor = "Lv;")
    public static class122 field1873 = class55.method425(-103, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!m", name = "B", descriptor = "Lv;")
    public static class122 field1874 = field1863;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "Lv;")
    public static class122 field1877 = field1862;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lv;")
    public static class122 field1858 = class55.method425(-101, "(U1");

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lv;")
    public static class122 field1854 = class55.method425(-94, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lqb;")
    private class98 field1848;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "[B")
    private byte[] field1875;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "[Lvb;")
    public static class124[] field1880;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 16)
    public static final void method584(byte arg0) {
        class23.field614 = 0;
        field1856++;
        int var1 = (class70.field1828.field343 >> 7) + class2.field77;
        if (arg0 < 90) {
            return;
        }
        int var2 = (class70.field1828.field349 >> 7) + class51.field1286;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class23.field614 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class23.field614 = 1;
        }
        if (class23.field614 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class23.field614 = 0;
        }
    }

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 47)
    protected final void finalize() {
        field1878++;
        this.method586(94);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljava/net/Socket;Ljc;)V", line = 468)
    public class72(Socket arg0, class57 arg1) throws IOException {
        this.field1867 = arg0;
        this.field1869 = arg1;
        this.field1867.setSoTimeout(30000);
        this.field1867.setTcpNoDelay(true);
        this.field1883 = this.field1867.getInputStream();
        this.field1864 = this.field1867.getOutputStream();
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I", line = 66)
    public final int method585(byte arg0) throws IOException {
        field1865++;
        if (arg0 >= -59) {
            this.run();
        }
        return this.field1882 ? 0 : this.field1883.read();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 92)
    public final void method586(int arg0) {
        field1849++;
        if (this.field1882) {
            return;
        }
        synchronized (this) {
            if (arg0 < 66) {
                field1877 = null;
            }
            this.field1882 = true;
            this.notifyAll();
        }
        if (this.field1848 != null) {
            while (this.field1848.field2454 == 0) {
                class30.method282((byte) -123, 1L);
            }
            if (this.field1848.field2454 == 1) {
                try {
                    ((Thread) this.field1848.field2456).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1848 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLmb;II)Lvb;", line = 132)
    public static final class124 method587(byte arg0, class74 arg1, int arg2, int arg3) {
        field1884++;
        if (arg0 < 37) {
            method591(-33);
        }
        return class21.method226(arg1, arg3, 0, arg2) ? class88.method692(false) : null;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V", line = 161)
    public static void method588(byte arg0) {
        field1854 = null;
        field1858 = null;
        field1874 = null;
        field1876 = null;
        field1880 = null;
        field1877 = null;
        int var1 = 116 / ((-arg0 - 20) / 56);
        field1863 = null;
        field1862 = null;
        field1861 = null;
        field1873 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZI[BI)V", line = 184)
    public static final void method589(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field1852++;
        if (class66.field1697 == null) {
            return;
        }
        if (class38.field992 >= 0) {
            class92.field2357 = arg2;
            if (class38.field992 == 0) {
                class28.field723 = 1;
            } else {
                int var5 = class63.method477(class38.field992, (byte) -125);
                int var6 = var5 - class80.field2090;
                class28.field723 = (var6 + 3600) / arg2;
                if (class28.field723 < 1) {
                    class28.field723 = 1;
                }
            }
            class14.field359 = arg3;
            class54.field1368 = arg1;
            class70.field1827 = arg4;
        } else if (class28.field723 == 0) {
            class61.method465(arg4, arg1, arg3, (byte) 105);
        } else {
            class70.field1827 = arg4;
            class14.field359 = arg3;
            class54.field1368 = arg1;
        }
        if (arg0 != 21951) {
            field1858 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)I", line = 230)
    public final int method590(byte arg0) throws IOException {
        int var2 = 110 % ((-arg0 - 11) / 63);
        field1881++;
        return this.field1882 ? 0 : this.field1883.available();
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 243)
    public static final void method591(int arg0) {
        field1879++;
        if (arg0 == 31960) {
            class42.field1094.method434((byte) -76);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lv;Lv;Lmb;I)[Lab;", line = 264)
    public static final class3[] method592(class122 arg0, class122 arg1, class74 arg2, int arg3) {
        field1860++;
        int var4 = arg2.method628(arg0, true);
        if (arg3 != 2) {
            method588((byte) 88);
        }
        int var5 = arg2.method605(arg1, var4, arg3 + 1034);
        return class30.method284(var4, var5, arg2, -2);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ[BI)V", line = 285)
    public final void method593(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        field1866++;
        if (!arg1) {
            method584((byte) -71);
        }
        if (this.field1882) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1883.read(arg2, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!m", name = "run", descriptor = "()V", line = 312)
    public final void run() {
        field1871++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1857 == this.field1850) {
                        if (this.field1882) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1850 <= this.field1857) {
                        var2 = this.field1857 - this.field1850;
                    } else {
                        var2 = 5000 - this.field1850;
                    }
                    var3 = this.field1850;
                }
                if (var2 > 0) {
                    try {
                        this.field1864.write(this.field1875, var3, var2);
                    } catch (IOException var9) {
                        this.field1870 = true;
                    }
                    this.field1850 = (this.field1850 + var2) % 5000;
                    try {
                        if (this.field1857 == this.field1850) {
                            this.field1864.flush();
                        }
                    } catch (IOException var8) {
                        this.field1870 = true;
                    }
                }
            }
            try {
                if (this.field1883 != null) {
                    this.field1883.close();
                }
                if (this.field1864 != null) {
                    this.field1864.close();
                }
                if (this.field1867 != null) {
                    this.field1867.close();
                }
            } catch (IOException var7) {
            }
            this.field1875 = null;
        } catch (Exception var12) {
            class84.method678(null, var12, 1);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI[BI)V", line = 393)
    public final void method594(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1859++;
        if (this.field1882) {
            return;
        }
        if (this.field1870) {
            this.field1870 = false;
            throw new IOException();
        }
        if (this.field1875 == null) {
            this.field1875 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1875[this.field1857] = arg2[arg1 + var6];
                this.field1857 = (this.field1857 + 1) % 5000;
                if ((this.field1850 + 4900) % 5000 == this.field1857) {
                    throw new IOException();
                }
            }
            if (arg0 < 110) {
                method592(null, null, null, -91);
            }
            if (this.field1848 == null) {
                this.field1848 = this.field1869.method442(3, this, false);
            }
            this.notifyAll();
        }
    }
}
