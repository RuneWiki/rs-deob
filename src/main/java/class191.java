import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class191 implements Runnable {

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    private int field2735 = 0;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Z")
    private boolean field2737 = false;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "Z")
    private boolean field2744 = false;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    private int field2738 = 0;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field2739;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "Lne;")
    private class76 field2743;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field2742;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2734;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "Lwe;")
    public static class24 field2750;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "[[I")
    public static int[][] field2752;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "[I")
    public static int[] field2756;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "Lbc;")
    private class285 field2754;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "[B")
    private byte[] field2732;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "[Lwn;")
    public static class77[] field2751;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public static void method1320(byte arg0) {
        field2750 = null;
        if (arg0 <= 37) {
            field2750 = null;
        }
        field2756 = null;
        field2751 = null;
        field2752 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
    public static final void method1321(int arg0, int arg1) {
        field2755++;
        if (class98.field1383 == arg0) {
            return;
        }
        if (class98.field1383 == 0) {
            class282.method1767(28070);
        }
        if (arg0 == arg1) {
            class19.method114(0);
        }
        if (arg0 != 40 && class186.field2680 != null) {
            class186.field2680.method1324(116);
            class186.field2680 = null;
        }
        if (class98.field1383 == 25 || class98.field1383 == 28) {
            class453.field6506.field4299 = 2;
            class263.field3618.field4299 = 2;
            class356.field4772.field4299 = 2;
            class344.field4652.field4299 = 2;
            class337.field4557.field4299 = 2;
            class72.field1059.field4299 = 2;
            class452.field6501.field4299 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class70.field980 = 1;
            class379.field5232 = 0;
            class186.field2690 = 1;
            class127.field1918 = 0;
            class143.field2087 = 0;
            class387.method2383(true, false);
            class453.field6506.field4299 = 1;
            class263.field3618.field4299 = 1;
            class356.field4772.field4299 = 1;
            class344.field4652.field4299 = 1;
            class337.field4557.field4299 = 1;
            class72.field1059.field4299 = 1;
            class452.field6501.field4299 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class399.method2473((byte) 112);
        }
        if (arg0 == 5) {
            class448.method2783(-128, class112.field1726, class354.field4765);
        } else {
            class387.method2386((byte) 21);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class98.field1383 == 5 || class98.field1383 == 10 || class98.field1383 == 28;
        if (var2 != var3) {
            if (var2) {
                class354.field4762 = class255.field3559;
                if (class1.field2 == 0) {
                    class277.method1745(2, arg1 ^ 0xFFFFFFAC);
                } else {
                    class80.method647(class255.field3559, (byte) 105, 0, 255, false, 2, class2.field14);
                }
                class19.field258.method538(false, -41);
            } else {
                class277.method1745(2, -122);
                class19.field258.method538(true, arg1 - 90);
                if (class394.field5477 != null) {
                    class394.field5477.method284((byte) 34);
                    class394.field5477 = null;
                }
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class354.field4765.method191();
        }
        class98.field1383 = arg0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public final void method1322(int arg0) throws IOException {
        field2733++;
        if (this.field2737) {
            return;
        }
        if (this.field2744) {
            this.field2744 = false;
            throw new IOException();
        } else if (arg0 != -22670) {
            field2750 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2746++;
        this.method1324(112);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
    public final void method1323(int arg0) {
        field2745++;
        if (this.field2737) {
            return;
        }
        if (arg0 != -1) {
            this.finalize();
        }
        this.field2742 = new class393();
        this.field2734 = new class1();
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
    public final void method1324(int arg0) {
        field2753++;
        if (this.field2737) {
            return;
        }
        synchronized (this) {
            this.field2737 = true;
            if (arg0 < 101) {
                this.method1323(35);
            }
            this.notifyAll();
        }
        if (this.field2754 != null) {
            while (this.field2754.field3875 == 0) {
                class328.method1999(0, 1L);
            }
            if (this.field2754.field3875 == 1) {
                try {
                    ((Thread) this.field2754.field3871).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2754 = null;
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)I")
    public final int method1325(int arg0) throws IOException {
        if (arg0 != 0) {
            this.run();
        }
        field2748++;
        return this.field2737 ? 0 : this.field2742.available();
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([BBII)V")
    public final void method1326(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field2741++;
        if (arg1 != 120) {
            this.field2737 = false;
        }
        if (this.field2737) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field2742.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V")
    public static final void method1327(int arg0) {
        field2749++;
        if (class354.field4763) {
            return;
        }
        class354.field4763 = true;
        if (arg0 != -500) {
            method1320((byte) 25);
        }
        class68.field964 = true;
        if (class229.field3214) {
            class332.field4483 = (float) ((int) class332.field4483 + 191 & 0xFFFFFF80);
        } else {
            class359.field4972 += (24.0F - class359.field4972) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[BII)V")
    public final void method1328(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2740++;
        if (this.field2737 || arg3 != 3) {
            return;
        }
        if (this.field2744) {
            this.field2744 = false;
            throw new IOException();
        }
        if (this.field2732 == null) {
            this.field2732 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2732[this.field2738] = arg1[arg0 + var6];
                this.field2738 = (this.field2738 + 1) % 5000;
                if ((this.field2735 + 4900) % 5000 == this.field2738) {
                    throw new IOException();
                }
            }
            if (this.field2754 == null) {
                this.field2754 = this.field2743.method586(this, (byte) 103, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/net/Socket;Lne;)V")
    public class191(Socket arg0, class76 arg1) throws IOException {
        this.field2739 = arg0;
        this.field2743 = arg1;
        this.field2739.setSoTimeout(30000);
        this.field2739.setTcpNoDelay(true);
        this.field2742 = this.field2739.getInputStream();
        this.field2734 = this.field2739.getOutputStream();
    }

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)I")
    public final int method1329(int arg0) throws IOException {
        field2747++;
        if (arg0 == -19824) {
            return this.field2737 ? 0 : this.field2742.read();
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!cr", name = "run", descriptor = "()V")
    public final void run() {
        field2736++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2738 == this.field2735) {
                        if (this.field2737) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field2735;
                    if (this.field2735 > this.field2738) {
                        var3 = 5000 - this.field2735;
                    } else {
                        var3 = this.field2738 - this.field2735;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field2734.write(this.field2732, var2, var3);
                    } catch (IOException var9) {
                        this.field2744 = true;
                    }
                    this.field2735 = (this.field2735 + var3) % 5000;
                    try {
                        if (this.field2738 == this.field2735) {
                            this.field2734.flush();
                        }
                    } catch (IOException var8) {
                        this.field2744 = true;
                    }
                }
            }
            try {
                if (this.field2742 != null) {
                    this.field2742.close();
                }
                if (this.field2734 != null) {
                    this.field2734.close();
                }
                if (this.field2739 != null) {
                    this.field2739.close();
                }
            } catch (IOException var7) {
            }
            this.field2732 = null;
        } catch (Exception var12) {
            class48.method399((byte) 86, var12, (String) null);
        }
    }

    static {
        new class368((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
        field2750 = new class24();
        field2752 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
        field2756 = new int[2];
    }
}
