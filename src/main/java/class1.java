import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 implements Runnable {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Z")
    private boolean field1 = false;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    private int field12 = 0;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Z")
    private boolean field9 = false;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    private int field27 = 0;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lj;")
    private class165 field16;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field10;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field21;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field18;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "J")
    public static long field13 = 0L;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lrk;")
    public static class270 field7 = new class270(64);

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Ljava/lang/String;")
    public static String field30 = "Loading - please wait.";

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Z")
    public static boolean field31 = false;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lsg;")
    private class163 field25;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Ljava/lang/String;")
    public static String field28;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "[B")
    private byte[] field26;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method1(byte arg0) {
        if (arg0 != 121) {
            field7 = null;
        }
        field30 = null;
        field28 = null;
        field7 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[BII)V")
    public final void method2(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field23++;
        if (this.field1) {
            return;
        }
        if (this.field9) {
            this.field9 = false;
            throw new IOException();
        }
        if (this.field26 == null) {
            this.field26 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field26[this.field12] = arg1[arg0 + var6];
                this.field12 = (this.field12 + 1) % 5000;
                if ((this.field27 + 4900) % 5000 == this.field12) {
                    throw new IOException();
                }
            }
            if (arg2 >= -98) {
                method3(-56, (byte) -15, false, 86);
            }
            if (this.field25 == null) {
                this.field25 = this.field16.method1133(3, this, (byte) 106);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBZI)V")
    public static final void method3(int arg0, byte arg1, boolean arg2, int arg3) {
        field24++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class72.field1170 = arg3;
        class133.field2128 = arg2;
        class99.field1621 = arg0;
        if (arg1 >= -23) {
            field17 = -1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI[B)V")
    public final void method4(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = -76 / ((-arg1 - 4) / 41);
        field3++;
        if (this.field1) {
            return;
        }
        while (arg0 > 0) {
            int var6 = this.field21.read(arg3, arg2, arg0);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg2 += var6;
            arg0 -= var6;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public static final void method5(int arg0, int arg1) {
        field15++;
        if (class273.field4336 == arg0) {
            return;
        }
        if (class273.field4336 == 0) {
            class153.method1066(0);
        }
        if (arg0 == 40) {
            class259.method1770(105);
        }
        if (arg0 != 40 && class43.field800 != null) {
            class43.field800.method7((byte) 18);
            class43.field800 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class33.field521 = 1;
            class11.field156 = 1;
            class205.field3283 = 0;
            class164.field2597 = 0;
            class216.field3538 = 0;
            class122.method883(true, (byte) -106);
        }
        if (arg0 == 25 || arg0 == 10) {
            class77.method542(true);
        }
        if (arg0 == 5) {
            class17.method134(118, class222.field3687);
        } else {
            class29.method251((byte) -80);
        }
        boolean var2 = class273.field4336 == 5 || class273.field4336 == 10 || class273.field4336 == 28;
        int var3 = 104 % ((63 - arg1) / 57);
        boolean var4 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (var2 != var4) {
            if (var4) {
                class148.field2389 = class229.field3787;
                if (class284.field4480 == 0) {
                    class228.method1605(2, (byte) 74);
                } else {
                    class106.method768(2, -1748, false, class168.field2665, class229.field3787, 0, 255);
                }
                class284.field4486.method1743(false, (byte) -51);
            } else {
                class228.method1605(2, (byte) 74);
                class284.field4486.method1743(true, (byte) -111);
            }
        }
        class273.field4336 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)I")
    public final int method6(int arg0) throws IOException {
        int var2 = 85 / ((-arg0 - 80) / 41);
        field22++;
        return this.field1 ? 0 : this.field21.available();
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
    public final void method7(byte arg0) {
        if (arg0 != 18) {
            field29 = -14;
        }
        field5++;
        if (this.field1) {
            return;
        }
        synchronized (this) {
            this.field1 = true;
            this.notifyAll();
        }
        if (this.field25 != null) {
            while (this.field25.field2589 == 0) {
                class43.method358(1L, false);
            }
            if (this.field25.field2589 == 1) {
                try {
                    ((Thread) this.field25.field2594).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field25 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public final void method8(int arg0) {
        field8++;
        if (this.field1) {
            return;
        }
        this.field21 = new class70();
        if (arg0 != -6) {
            this.finalize();
        }
        this.field18 = new class74();
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)I")
    public final int method9(int arg0) throws IOException {
        field11++;
        if (this.field1) {
            return 0;
        } else {
            if (arg0 != 17335) {
                field31 = true;
            }
            return this.field21.read();
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)V")
    public static final void method10(int arg0, byte arg1) {
        field4++;
        class260.field4134.method476(false, arg0);
        class68.field1132.method476(false, arg0);
        int var2 = -20 / ((arg1 + 78) / 48);
    }

    @OriginalMember(owner = "client!wf", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field27 == this.field12) {
                            if (this.field1) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field27 > this.field12) {
                            var2 = 5000 - this.field27;
                        } else {
                            var2 = this.field12 - this.field27;
                        }
                        var3 = this.field27;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field18.write(this.field26, var3, var2);
                    } catch (IOException var9) {
                        this.field9 = true;
                    }
                    this.field27 = (this.field27 + var2) % 5000;
                    try {
                        if (this.field27 == this.field12) {
                            this.field18.flush();
                        }
                    } catch (IOException var8) {
                        this.field9 = true;
                    }
                    continue;
                }
                try {
                    if (this.field21 != null) {
                        this.field21.close();
                    }
                    if (this.field18 != null) {
                        this.field18.close();
                    }
                    if (this.field10 != null) {
                        this.field10.close();
                    }
                } catch (IOException var7) {
                }
                this.field26 = null;
                break;
            }
        } catch (Exception var12) {
            class178.method1211((String) null, -122, var12);
        }
        field19++;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V")
    public final void method11(byte arg0) throws IOException {
        field2++;
        if (this.field1) {
            return;
        }
        if (this.field9) {
            this.field9 = false;
            throw new IOException();
        } else if (arg0 != -21) {
            this.field12 = 91;
        }
    }

    @OriginalMember(owner = "client!wf", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field14++;
        this.method7((byte) 18);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)I")
    public static final int method12(int arg0, int arg1, int arg2, int arg3) {
        field20++;
        if (arg2 > -65) {
            method3(1, (byte) 2, true, -37);
        }
        if ((class201.field3198[arg0][arg1][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (class201.field3198[1][arg1][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljava/net/Socket;Lj;)V")
    public class1(Socket arg0, class165 arg1) throws IOException {
        this.field16 = arg1;
        this.field10 = arg0;
        this.field10.setSoTimeout(30000);
        this.field10.setTcpNoDelay(true);
        this.field21 = this.field10.getInputStream();
        this.field18 = this.field10.getOutputStream();
    }
}
