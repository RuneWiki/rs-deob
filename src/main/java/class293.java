import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class293 implements Runnable {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Z")
    private boolean field4846 = false;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Z")
    private boolean field4867 = false;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    private int field4863 = 0;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    private int field4845 = 0;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field4856;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "Lvh;")
    private class147 field4875;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field4850;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4874;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lce;")
    private static class126 field4847 = class206.method1445(-7923, "Close");

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "[Lbg;")
    public static class195[] field4868 = new class195[28];

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "[I")
    public static int[] field4857 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field4869 = 0;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "[I")
    public static int[] field4861 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "Lce;")
    public static class126 field4871 = field4847;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "F")
    public static float field4865;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Lcc;")
    public static class313 field4864;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Ld;")
    private class60 field4851;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "[B")
    private byte[] field4872;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "[[[Lma;")
    public static class5[][][] field4860;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BII)V", line = 5)
    public final void method1935(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4848++;
        if (arg3 != -1 || this.field4846) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field4850.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V", line = 28)
    public static final void method1936(int arg0, int arg1, int arg2) {
        class27.field377 = true;
        class150.field2756 = arg0;
        class301.field4997 = arg1;
        class318.field5455 = arg2;
        class152.field2786 = -1;
        class40.field637 = -1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 43)
    public final void method1937(byte arg0) {
        field4859++;
        if (this.field4846) {
            return;
        }
        this.field4850 = new class30();
        if (arg0 != 7) {
            this.method1937((byte) 46);
        }
        this.field4874 = new class163();
    }

    @OriginalMember(owner = "client!ee", name = "run", descriptor = "()V", line = 60)
    public final void run() {
        field4853++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field4863 == this.field4845) {
                        if (this.field4846) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field4845;
                    if (this.field4845 <= this.field4863) {
                        var4 = this.field4863 - this.field4845;
                    } else {
                        var4 = 5000 - this.field4845;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field4874.write(this.field4872, var3, var4);
                    } catch (IOException var12) {
                        this.field4867 = true;
                    }
                    this.field4845 = (this.field4845 + var4) % 5000;
                    try {
                        if (this.field4863 == this.field4845) {
                            this.field4874.flush();
                        }
                    } catch (IOException var11) {
                        this.field4867 = true;
                    }
                }
            }
            try {
                if (this.field4850 != null) {
                    this.field4850.close();
                }
                if (this.field4874 != null) {
                    this.field4874.close();
                }
                if (this.field4856 != null) {
                    this.field4856.close();
                }
            } catch (IOException var10) {
            }
            this.field4872 = null;
        } catch (Exception var15) {
            class54.method345((String) null, -107, var15);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)I", line = 131)
    public final int method1938(byte arg0) throws IOException {
        if (arg0 == 41) {
            field4873++;
            return this.field4846 ? 0 : this.field4850.read();
        } else {
            return -46;
        }
    }

    @OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V", line = 146)
    protected final void finalize() {
        field4870++;
        this.method1941((byte) 109);
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)I", line = 157)
    public final int method1939(byte arg0) throws IOException {
        if (arg0 != 86) {
            this.field4863 = 118;
        }
        field4852++;
        return this.field4846 ? 0 : this.field4850.available();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILcc;I)[Lie;", line = 179)
    public static final class2[] method1940(int arg0, class313 arg1, int arg2) {
        if (arg2 != 184) {
            method1943(-70);
        }
        field4866++;
        return class189.method1354(arg0, 119, arg1) ? class214.method1488(3121) : null;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/net/Socket;Lvh;)V", line = 385)
    public class293(Socket arg0, class147 arg1) throws IOException {
        this.field4856 = arg0;
        this.field4875 = arg1;
        this.field4856.setSoTimeout(30000);
        this.field4856.setTcpNoDelay(true);
        this.field4850 = this.field4856.getInputStream();
        this.field4874 = this.field4856.getOutputStream();
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V", line = 212)
    public final void method1941(byte arg0) {
        field4849++;
        if (this.field4846) {
            return;
        }
        synchronized (this) {
            this.field4846 = true;
            this.notifyAll();
        }
        if (this.field4851 != null) {
            while (this.field4851.field965 == 0) {
                class313.method2158(1L, true);
            }
            if (this.field4851.field965 == 1) {
                try {
                    ((Thread) this.field4851.field967).join();
                } catch (InterruptedException var6) {
                }
            }
        }
        this.field4851 = null;
        int var5 = -3 % ((arg0 + 10) / 55);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)V", line = 247)
    public static final void method1942(byte arg0) {
        class78.field1274.method1178(-104);
        class297.field4938.method1178(-78);
        int var1 = 106 % ((30 - arg0) / 32);
        class78.field1275.method1178(-105);
        class291.field4819.method1178(-98);
        field4855++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 264)
    public static void method1943(int arg0) {
        field4857 = null;
        if (arg0 <= 79) {
            return;
        }
        field4864 = null;
        field4860 = (class5[][][]) null;
        field4871 = null;
        field4868 = null;
        field4861 = null;
        field4847 = null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 282)
    public final void method1944(int arg0) throws IOException {
        field4844++;
        if (this.field4846) {
            return;
        }
        if (arg0 != 62) {
            this.run();
        }
        if (this.field4867) {
            this.field4867 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZI[B)V", line = 307)
    public final void method1945(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field4854++;
        if (this.field4846 || !arg1) {
            return;
        }
        if (this.field4867) {
            this.field4867 = false;
            throw new IOException();
        }
        if (this.field4872 == null) {
            this.field4872 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field4872[this.field4863] = arg3[arg2 + var6];
                this.field4863 = (this.field4863 + 1) % 5000;
                if ((this.field4845 + 4900) % 5000 == this.field4863) {
                    throw new IOException();
                }
            }
            if (this.field4851 == null) {
                this.field4851 = this.field4875.method1105(8, this, 3);
            }
            this.notifyAll();
        }
    }
}
