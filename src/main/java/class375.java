import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class375 implements Runnable {

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "Z")
    private boolean field5178 = false;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "Z")
    private boolean field5182 = false;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    private int field5167 = 0;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    private int field5177 = 0;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field5184;

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "Lml;")
    private class241 field5187;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field5185;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5168;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "[Lrk;")
    public static class25[] field5173 = new class25[128];

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "F")
    public static float field5172;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "Lcc;")
    private class474 field5183;

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "[B")
    private byte[] field5188;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IBIII)V", line = 3)
    public static final void method2302(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class425.field5751 <= arg4 && arg4 <= class136.field1985) {
            int var5 = class309.method1706(class221.field2942, arg2, 6798, class205.field2784);
            int var6 = class309.method1706(class221.field2942, arg0, 6798, class205.field2784);
            class94.method593(var6, var5, 1891003047, arg3, arg4);
        }
        int var7 = -14 / ((arg1 - 42) / 35);
        field5170++;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V", line = 22)
    public final void method2303(byte arg0) throws IOException {
        field5176++;
        if (this.field5182) {
            return;
        }
        if (this.field5178) {
            this.field5178 = false;
            throw new IOException();
        } else if (arg0 <= 10) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V", line = 45)
    protected final void finalize() {
        field5181++;
        this.method2310(-107);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "([BIII)V", line = 60)
    public final void method2304(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5186++;
        if (this.field5182) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field5185.read(arg0, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg3 += var5;
        }
        if (arg2 != 1) {
            method2307((class84) null, 31, -99, -125);
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Ljava/net/Socket;Lml;)V", line = 388)
    public class375(Socket arg0, class241 arg1) throws IOException {
        this.field5184 = arg0;
        this.field5187 = arg1;
        this.field5184.setSoTimeout(30000);
        this.field5184.setTcpNoDelay(true);
        this.field5185 = this.field5184.getInputStream();
        this.field5168 = this.field5184.getOutputStream();
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 92)
    public static void method2305(int arg0) {
        field5173 = null;
        if (arg0 != -31103) {
            method2307((class84) null, 18, 67, 9);
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)I", line = 102)
    public final int method2306(int arg0) throws IOException {
        if (arg0 != 1) {
            method2305(56);
        }
        field5169++;
        return this.field5182 ? 0 : this.field5185.available();
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lhc;III)V", line = 122)
    public static final void method2307(class84 arg0, int arg1, int arg2, int arg3) {
        long var4 = class132.field1943[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field1100 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field1107[arg0.field1100++] = class276.field3652[var8 - 1];
            var6 += 16L;
        }
        for (int var9 = arg0.field1100; var9 < 4; var9++) {
            arg0.field1107[var9] = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZII[B)V", line = 152)
    public final void method2308(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5174++;
        if (this.field5182) {
            return;
        }
        if (this.field5178) {
            this.field5178 = false;
            throw new IOException();
        }
        if (this.field5188 == null) {
            this.field5188 = new byte[5000];
        }
        synchronized (this) {
            if (arg0) {
                this.field5168 = null;
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field5188[this.field5177] = arg3[arg1 + var6];
                this.field5177 = (this.field5177 + 1) % 5000;
                if ((this.field5167 + 4900) % 5000 == this.field5177) {
                    throw new IOException();
                }
            }
            if (this.field5183 == null) {
                this.field5183 = this.field5187.method1351(3, 7000, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)V", line = 203)
    public static final void method2309(byte arg0) {
        field5171++;
        int[] var1 = new int[class175.field2385.field3658];
        int var2 = 0;
        for (int var3 = 0; var3 < class175.field2385.field3658; var3++) {
            class443 var6 = class175.field2385.method1557(var3, 21992);
            if (var6.field5961 >= 0 || var6.field6019 >= 0) {
                var1[var2++] = var3;
            }
        }
        class413.field5652 = new int[var2];
        int var4 = -92 % ((arg0 + 17) / 60);
        for (int var5 = 0; var5 < var2; var5++) {
            class413.field5652[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V", line = 240)
    public final void method2310(int arg0) {
        field5180++;
        if (this.field5182) {
            return;
        }
        synchronized (this) {
            if (arg0 > -78) {
                this.field5168 = null;
            }
            this.field5182 = true;
            this.notifyAll();
        }
        if (this.field5183 != null) {
            while (this.field5183.field6534 == 0) {
                class374.method2298(-28114, 1L);
            }
            if (this.field5183.field6534 == 1) {
                try {
                    ((Thread) this.field5183.field6529).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5183 = null;
    }

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)I", line = 279)
    public final int method2311(int arg0) throws IOException {
        field5179++;
        if (this.field5182) {
            return 0;
        } else if (arg0 == 1) {
            return this.field5185.read();
        } else {
            return 46;
        }
    }

    @OriginalMember(owner = "client!iu", name = "run", descriptor = "()V", line = 300)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field5177 == this.field5167) {
                            if (this.field5182) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field5167 <= this.field5177) {
                            var2 = this.field5177 - this.field5167;
                        } else {
                            var2 = 5000 - this.field5167;
                        }
                        var3 = this.field5167;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field5168.write(this.field5188, var3, var2);
                    } catch (IOException var9) {
                        this.field5178 = true;
                    }
                    this.field5167 = (this.field5167 + var2) % 5000;
                    try {
                        if (this.field5177 == this.field5167) {
                            this.field5168.flush();
                        }
                    } catch (IOException var8) {
                        this.field5178 = true;
                    }
                    continue;
                }
                try {
                    if (this.field5185 != null) {
                        this.field5185.close();
                    }
                    if (this.field5168 != null) {
                        this.field5168.close();
                    }
                    if (this.field5184 != null) {
                        this.field5184.close();
                    }
                } catch (IOException var7) {
                }
                this.field5188 = null;
                break;
            }
        } catch (Exception var12) {
            class228.method1278(var12, (String) null, -30116);
        }
        field5189++;
    }

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V", line = 373)
    public final void method2312(int arg0) {
        field5175++;
        if (this.field5182) {
            return;
        }
        this.field5185 = new class38();
        this.field5168 = new class39();
        if (arg0 != 5000) {
            this.field5167 = -95;
        }
    }
}
