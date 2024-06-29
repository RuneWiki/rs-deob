import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class285 implements Runnable {

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    private int field4781 = 0;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    private int field4771 = 0;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Z")
    private boolean field4791 = false;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Z")
    private boolean field4794 = false;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Lll;")
    private class156 field4787;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field4780;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field4774;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4772;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Lih;")
    public static class32 field4793 = new class32();

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field4795 = -1;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lim;")
    private class180 field4783;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lfd;")
    public static class242 field4786;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[B")
    private byte[] field4777;

    @OriginalMember(owner = "client!ma", name = "run", descriptor = "()V", line = 12)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label86: {
                    synchronized (this) {
                        label87: {
                            if (this.field4781 == this.field4771) {
                                if (this.field4791) {
                                    break label87;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            var3 = this.field4781;
                            if (this.field4781 > this.field4771) {
                                var4 = 5000 - this.field4781;
                            } else {
                                var4 = this.field4771 - this.field4781;
                            }
                            break label86;
                        }
                    }
                    try {
                        if (this.field4774 != null) {
                            this.field4774.close();
                        }
                        if (this.field4772 != null) {
                            this.field4772.close();
                        }
                        if (this.field4780 != null) {
                            this.field4780.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field4777 = null;
                    break;
                }
                if (var4 > 0) {
                    try {
                        this.field4772.write(this.field4777, var3, var4);
                    } catch (IOException var12) {
                        this.field4794 = true;
                    }
                    this.field4781 = (this.field4781 + var4) % 5000;
                    try {
                        if (this.field4781 == this.field4771) {
                            this.field4772.flush();
                        }
                    } catch (IOException var11) {
                        this.field4794 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class302.method2124((String) null, var15, (byte) 103);
        }
        field4785++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIBIIII)V", line = 75)
    public static final void method2010(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 - arg4) >= class225.field3572 && class27.field454 >= arg5 + arg4 && class80.field1259 <= arg1 - arg4 && class117.field1840 >= arg1 + arg4) {
            class1.method6(arg6, arg0, arg1, true, arg3, arg4, arg5);
        } else {
            class89.method699(arg3, (byte) 109, arg1, arg4, arg6, arg0, arg5);
        }
        field4776++;
        if (arg2 > -107) {
            field4795 = 89;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[B)V", line = 95)
    public final void method2011(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 != -18455) {
            return;
        }
        field4779++;
        if (this.field4791) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field4774.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I", line = 121)
    public final int method2012(int arg0) throws IOException {
        field4770++;
        if (arg0 != 0) {
            this.method2018(43);
        }
        return this.field4791 ? 0 : this.field4774.read();
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 141)
    public static void method2013(int arg0) {
        if (arg0 != 0) {
            field4793 = (class32) null;
        }
        field4793 = null;
        field4786 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI[BI)V", line = 154)
    public final void method2014(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4792++;
        if (this.field4791) {
            return;
        }
        if (this.field4794) {
            this.field4794 = false;
            throw new IOException();
        }
        if (this.field4777 == null) {
            this.field4777 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field4777[this.field4771] = arg2[arg1 + var6];
                this.field4771 = (this.field4771 + 1) % 5000;
                if (((this.field4781 + 4900) % 5000) == this.field4771) {
                    throw new IOException();
                }
            }
            if (this.field4783 == null) {
                this.field4783 = this.field4787.method1054(0, 3, this);
            }
            if (arg0) {
                field4793 = (class32) null;
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljava/net/Socket;Lll;)V", line = 416)
    public class285(Socket arg0, class156 arg1) throws IOException {
        this.field4787 = arg1;
        this.field4780 = arg0;
        this.field4780.setSoTimeout(30000);
        this.field4780.setTcpNoDelay(true);
        this.field4774 = this.field4780.getInputStream();
        this.field4772 = this.field4780.getOutputStream();
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 212)
    protected final void finalize() {
        this.method2018(14821);
        field4775++;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)I", line = 220)
    public final int method2015(int arg0) throws IOException {
        field4782++;
        if (arg0 != -18358) {
            this.field4783 = (class180) null;
        }
        return this.field4791 ? 0 : this.field4774.available();
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V", line = 235)
    public final void method2016(int arg0) throws IOException {
        int var2 = -97 % ((52 - arg0) / 50);
        field4773++;
        if (!this.field4791 && this.field4794) {
            this.field4794 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 255)
    public final void method2017(boolean arg0) {
        field4788++;
        if (arg0) {
            method2019((int[]) null, 19, 31, -15, 103, 77);
        }
        if (!this.field4791) {
            this.field4774 = new class61();
            this.field4772 = new class262();
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V", line = 275)
    public final void method2018(int arg0) {
        field4784++;
        if (arg0 != 14821) {
            this.method2018(6);
        }
        if (this.field4791) {
            return;
        }
        synchronized (this) {
            this.field4791 = true;
            this.notifyAll();
        }
        if (this.field4783 != null) {
            while (this.field4783.field2811 == 0) {
                class126.method862(1L, 64);
            }
            if (this.field4783.field2811 == 1) {
                try {
                    ((Thread) this.field4783.field2812).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field4783 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIIII)V", line = 316)
    public static final void method2019(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class55 var6 = class36.field585[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class136 var7 = var6.field896;
        if (var7 != null) {
            int var8 = var7.field2087;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class213 var10 = var6.field882;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3303;
        int var12 = var10.field3304;
        int var13 = var10.field3318;
        int var14 = var10.field3313;
        int[] var15 = class113.field1780[var11];
        int[] var16 = class104.field1666[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILtk;IIZI)V", line = 430)
    public static final void method2020(int arg0, class249 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4789++;
        if (class101.field1624 >= 50 || arg1.field4072 == null || arg5 >= arg1.field4072.length || arg1.field4072[arg5] == null) {
            return;
        }
        int var6 = arg1.field4072[arg5][0];
        int var7 = var6 >> 8;
        if (arg1.field4072[arg5].length > 1) {
            int var8 = (int) ((double) arg1.field4072[arg5].length * Math.random());
            if (var8 > 0) {
                var7 = arg1.field4072[arg5][var8];
            }
        }
        int var9 = var6 >> 5 & 0x7;
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg4) {
                class98.method732(var9, var7, 0, -799);
            }
        } else if (class42.field696 != 0) {
            class186.field2891[class101.field1624] = var7;
            class10.field128[class101.field1624] = var9;
            int var11 = (arg0 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            class26.field437[class101.field1624] = 0;
            class13.field194[class101.field1624] = null;
            class98.field1603[class101.field1624] = (var11 << 8) + (var12 << 16) + var10;
            if (arg2 != 183921384) {
                field4786 = (class242) null;
            }
            class101.field1624++;
        }
    }
}
