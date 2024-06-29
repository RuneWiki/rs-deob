import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class483 implements Runnable {

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    private int field7048 = 0;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "Z")
    private boolean field7042 = false;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "Z")
    private boolean field7050 = false;

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
    private int field7067 = 0;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "Ldr;")
    private class504 field7049;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field7047;

    @OriginalMember(owner = "client!bw", name = "B", descriptor = "Ljava/io/InputStream;")
    private InputStream field7069;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7058;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public static int field7062 = 1;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!bw", name = "A", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!bw", name = "C", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!bw", name = "D", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "Ll;")
    public static class16 field7052;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "Ljv;")
    private class56 field7061;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "[B")
    private byte[] field7053;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public final void method2831(byte arg0) throws IOException {
        field7060++;
        if (this.field7042) {
            return;
        }
        if (this.field7050) {
            this.field7050 = false;
            throw new IOException();
        } else if (arg0 <= 70) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public static void method2832(int arg0) {
        if (arg0 != 544) {
            field7064 = 98;
        }
        field7052 = null;
    }

    @OriginalMember(owner = "client!bw", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2839(-20828);
        field7057++;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[BIB)V")
    public final void method2833(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 >= -115) {
            return;
        }
        field7043++;
        if (this.field7042) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field7069.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Z")
    public static final boolean method2834(int arg0, int arg1, int arg2) {
        if (arg0 >= -114) {
            method2843(null, 15, -74, -98);
        }
        field7071++;
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI[BI)V")
    public final void method2835(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field7065++;
        if (this.field7042) {
            return;
        }
        if (this.field7050) {
            this.field7050 = false;
            throw new IOException();
        }
        if (this.field7053 == null) {
            this.field7053 = new byte[5000];
        }
        if (arg0 < 71) {
            this.field7069 = null;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field7053[this.field7048] = arg2[arg3 + var6];
                this.field7048 = (this.field7048 + 1) % 5000;
                if ((this.field7067 + 4900) % 5000 == this.field7048) {
                    throw new IOException();
                }
            }
            if (this.field7061 == null) {
                this.field7061 = this.field7049.method2971(this, 3, 0);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(III)Z")
    public static final boolean method2836(int arg0, int arg1, int arg2) {
        int var3 = 26 % ((47 - arg1) / 38);
        field7059++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II[B[BIIIBI)V")
    public static final void method2837(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field7044++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        int var11 = -arg5;
        int var12 = 26 % ((arg7 - 47) / 51);
        while (var11 < 0) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg4++;
                arg3[var10001] = (byte) (arg3[var10001] - arg2[arg0++]);
                int var15 = arg4++;
                arg3[var15] = (byte) (arg3[var15] - arg2[arg0++]);
                int var16 = arg4++;
                arg3[var16] = (byte) (arg3[var16] - arg2[arg0++]);
                int var17 = arg4++;
                arg3[var17] = (byte) (arg3[var17] - arg2[arg0++]);
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg4++;
                arg3[var10001] = (byte) (arg3[var10001] - arg2[arg0++]);
            }
            arg0 += arg8;
            arg4 += arg6;
            var11++;
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
    public static final void method2838(byte arg0) {
        field7045++;
        class400.field5877.method1068(0);
        int var1 = -16 % ((47 - arg0) / 32);
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
    public final void method2839(int arg0) {
        field7051++;
        if (arg0 != -20828) {
            field7052 = null;
        }
        if (this.field7042) {
            return;
        }
        synchronized (this) {
            this.field7042 = true;
            this.notifyAll();
        }
        if (this.field7061 != null) {
            while (this.field7061.field667 == 0) {
                class157.method1046(-128, 1L);
            }
            if (this.field7061.field667 == 1) {
                try {
                    ((Thread) this.field7061.field670).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field7061 = null;
    }

    @OriginalMember(owner = "client!bw", name = "run", descriptor = "()V")
    public final void run() {
        field7063++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field7067 == this.field7048) {
                        if (this.field7042) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field7048 < this.field7067) {
                        var2 = 5000 - this.field7067;
                    } else {
                        var2 = this.field7048 - this.field7067;
                    }
                    var3 = this.field7067;
                }
                if (var2 > 0) {
                    try {
                        this.field7058.write(this.field7053, var3, var2);
                    } catch (IOException var9) {
                        this.field7050 = true;
                    }
                    this.field7067 = (this.field7067 + var2) % 5000;
                    try {
                        if (this.field7067 == this.field7048) {
                            this.field7058.flush();
                        }
                    } catch (IOException var8) {
                        this.field7050 = true;
                    }
                }
            }
            try {
                if (this.field7069 != null) {
                    this.field7069.close();
                }
                if (this.field7058 != null) {
                    this.field7058.close();
                }
                if (this.field7047 != null) {
                    this.field7047.close();
                }
            } catch (IOException var7) {
            }
            this.field7053 = null;
        } catch (Exception var12) {
            class320.method1861(var12, (byte) -86, null);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2840(int arg0, int arg1, String arg2) {
        field7070++;
        int var3 = class375.field5498;
        int[] var4 = class397.field5793;
        boolean var5 = false;
        for (int var6 = arg0; var6 < var3; var6++) {
            class438 var7 = class12.field182[var4[var6]];
            if (var7 != null && class316.field4324 != var7 && var7.field6421 != null && var7.field6421.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg1 == 1) {
                    class228.field3235++;
                    class491.method2878((byte) 92, class498.field7254);
                    class481.field7027.method2307(var4[var6], -1069935832);
                    class481.field7027.method2302(-4, 0);
                } else if (arg1 == 4) {
                    class143.field2055++;
                    class491.method2878((byte) 92, class30.field396);
                    class481.field7027.method2302(-4, 0);
                    class481.field7027.method2323(var4[var6], 72);
                } else if (arg1 == 5) {
                    class491.method2878((byte) 92, class235.field3334);
                    class5.field55++;
                    class481.field7027.method2307(var4[var6], -1069935832);
                    class481.field7027.method2342(arg0 ^ 0x4A, 0);
                } else if (arg1 == 6) {
                    class491.method2878((byte) 92, class450.field6620);
                    class251.field3472++;
                    class481.field7027.method2302(-4, 0);
                    class481.field7027.method2355(arg0 + 1686288168, var4[var6]);
                } else if (arg1 == 7) {
                    class209.field2902++;
                    class491.method2878((byte) 92, class80.field1221);
                    class481.field7027.method2307(var4[var6], arg0 ^ 0xC03A1328);
                    class481.field7027.method2312((byte) -84, 0);
                }
                break;
            }
        }
        if (!var5) {
            class49.method438(class351.field5152.method2731(62, class372.field5455) + arg2, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V")
    public final void method2841(byte arg0) {
        if (arg0 >= -49) {
            this.method2839(59);
        }
        field7055++;
        if (!this.field7042) {
            this.field7069 = new class168();
            this.field7058 = new class344();
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I")
    public final int method2842(int arg0) throws IOException {
        if (arg0 == 0) {
            field7066++;
            return this.field7042 ? 0 : this.field7069.available();
        } else {
            return -78;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
    public static final byte[] method2843(Object arg0, int arg1, int arg2, int arg3) {
        field7054++;
        if (arg1 != 20969) {
            method2834(73, 48, -65);
        }
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class141.method956(arg1 - 20970, arg2, var4, arg3);
        } else if (arg0 instanceof class294) {
            class294 var5 = (class294) arg0;
            return var5.method1186(arg3, (byte) 123, arg2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)I")
    public final int method2844(int arg0) throws IOException {
        field7056++;
        int var2 = -28 % ((10 - arg0) / 41);
        return this.field7042 ? 0 : this.field7069.read();
    }

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "(I)V")
    public static final void method2845(int arg0) {
        class162 var1 = class442.field6544;
        synchronized (class442.field6544) {
            class442.field6544.method1068(0);
        }
        int var2 = 61 % ((arg0 + 17) / 36);
        field7068++;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Ljava/net/Socket;Ldr;)V")
    public class483(Socket arg0, class504 arg1) throws IOException {
        this.field7049 = arg1;
        this.field7047 = arg0;
        this.field7047.setSoTimeout(30000);
        this.field7047.setTcpNoDelay(true);
        this.field7069 = this.field7047.getInputStream();
        this.field7058 = this.field7047.getOutputStream();
    }
}
