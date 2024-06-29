import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class278 implements Runnable {

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Z")
    private boolean field3765 = false;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    private int field3774 = 0;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "Z")
    private boolean field3773 = false;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    private int field3785 = 0;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Llh;")
    private class450 field3784;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "Ljava/net/Socket;")
    private Socket field3780;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field3770;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3762;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "[I")
    public static int[] field3764 = new int[64];

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "Ldj;")
    private class304 field3778;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "[B")
    private byte[] field3761;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1527(int arg0) {
        field3777++;
        if (arg0 != -4993) {
            method1527(-106);
        }
        if (class17.field162 == null) {
            return;
        }
        while (true) {
            while (class393.field5657 < class5.field41.length) {
                class156 var1 = class5.field41[class393.field5657];
                if (var1 != null && var1.field1974 == -1) {
                    if (class212.field2877 == null) {
                        class212.field2877 = class17.field162.method1323(104, var1.field1983);
                    }
                    int var2 = class212.field2877.field867;
                    if (var2 == -1) {
                        return;
                    }
                    class393.field5657++;
                    class212.field2877 = null;
                    var1.field1974 = var2;
                } else {
                    class393.field5657++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 45)
    public static final void method1528(String arg0, byte arg1) {
        field3781++;
        int var2 = -56 / ((arg1 + 32) / 61);
        if (class27.field263 != null) {
            class119.field1479++;
            class281.field3857.method295(20579, 185);
            class281.field3857.method1386(-222840624, class75.method426(28555, arg0));
            class281.field3857.method1343(arg0, 22608);
        }
    }

    @OriginalMember(owner = "client!qp", name = "run", descriptor = "()V", line = 66)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3785 == this.field3774) {
                            if (this.field3765) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3774;
                        if (this.field3774 > this.field3785) {
                            var3 = 5000 - this.field3774;
                        } else {
                            var3 = this.field3785 - this.field3774;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3762.write(this.field3761, var2, var3);
                    } catch (IOException var9) {
                        this.field3773 = true;
                    }
                    this.field3774 = (this.field3774 + var3) % 5000;
                    try {
                        if (this.field3785 == this.field3774) {
                            this.field3762.flush();
                        }
                    } catch (IOException var8) {
                        this.field3773 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3770 != null) {
                        this.field3770.close();
                    }
                    if (this.field3762 != null) {
                        this.field3762.close();
                    }
                    if (this.field3780 != null) {
                        this.field3780.close();
                    }
                } catch (IOException var7) {
                }
                this.field3761 = null;
                break;
            }
        } catch (Exception var12) {
            class254.method1439(22292, var12, (String) null);
        }
        field3786++;
    }

    @OriginalMember(owner = "client!qp", name = "finalize", descriptor = "()V", line = 137)
    protected final void finalize() {
        this.method1538((byte) 5);
        field3783++;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([BIII)V", line = 146)
    public final void method1529(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3767++;
        if (this.field3765) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field3770.read(arg0, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg1 -= var5;
        }
        if (arg2 != -18094) {
            this.method1530(79);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 172)
    public final void method1530(int arg0) {
        field3771++;
        if (this.field3765) {
            return;
        }
        if (arg0 != 64) {
            field3764 = null;
        }
        this.field3770 = new class312();
        this.field3762 = new class99();
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V", line = 188)
    public static void method1531(int arg0) {
        field3764 = null;
        if (arg0 != 5000) {
            field3764 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V", line = 198)
    public static final void method1532(int arg0) {
        class344.field4615.method613(true);
        field3782++;
        if (arg0 != -16236) {
            field3764 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIIBII)Z", line = 210)
    public static final boolean method1533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field3776++;
        if ((arg0 + arg8) <= arg2 || arg0 >= (arg2 + arg4)) {
            return false;
        } else if (arg3 < arg1 + arg7 && arg3 + arg5 > arg1) {
            return arg6 == -52 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)Z", line = 228)
    public static final boolean method1534(int arg0) {
        field3779++;
        if (arg0 == 21182) {
            return class429.field6292 != 0 || class110.field1357 >= 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 239)
    public final void method1535(boolean arg0) throws IOException {
        field3768++;
        if (this.field3765) {
            return;
        }
        if (this.field3773) {
            this.field3773 = false;
            throw new IOException();
        } else if (!arg0) {
            method1527(-115);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIII)V", line = 262)
    public static final void method1536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3766++;
        class194 var7 = class142.method769(arg6, arg2, arg5);
        if (var7 != null && var7.field2558 != null) {
            class425 var8 = new class425();
            var8.field6240 = var7.field2558;
            var8.field6242 = var7;
            class277.method1523(var8);
        }
        class306.field4143 = arg4;
        class291.field3960 = arg3;
        class65.field682 = true;
        class383.field5467 = arg1;
        class373.field5205 = arg0;
        class106.field1297 = arg2;
        class199.field2657 = arg5;
        class204.method1107(var7, (byte) -99);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([BZII)V", line = 289)
    public final void method1537(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field3763++;
        if (this.field3765) {
            return;
        }
        if (this.field3773) {
            this.field3773 = false;
            throw new IOException();
        }
        if (arg1) {
            method1536(61, -86, -36, -19, -30, -107, -68);
        }
        if (this.field3761 == null) {
            this.field3761 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field3761[this.field3785] = arg0[arg3 + var6];
                this.field3785 = (this.field3785 + 1) % 5000;
                if ((this.field3774 + 4900) % 5000 == this.field3785) {
                    throw new IOException();
                }
            }
            if (this.field3778 == null) {
                this.field3778 = this.field3784.method2788(this, 3, 109);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Ljava/net/Socket;Llh;)V", line = 437)
    public class278(Socket arg0, class450 arg1) throws IOException {
        this.field3784 = arg1;
        this.field3780 = arg0;
        this.field3780.setSoTimeout(30000);
        this.field3780.setTcpNoDelay(true);
        this.field3770 = this.field3780.getInputStream();
        this.field3762 = this.field3780.getOutputStream();
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 359)
    public final void method1538(byte arg0) {
        field3775++;
        if (this.field3765) {
            return;
        }
        synchronized (this) {
            this.field3765 = true;
            this.notifyAll();
        }
        if (this.field3778 != null) {
            while (this.field3778.field4123 == 0) {
                class370.method2235(1L, 10);
            }
            if (this.field3778.field4123 == 1) {
                try {
                    ((Thread) this.field3778.field4126).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0 != 5) {
            method1533(42, -92, -78, 109, 34, 67, (byte) -58, -108, 122);
        }
        this.field3778 = null;
    }

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "(I)I", line = 401)
    public final int method1539(int arg0) throws IOException {
        field3772++;
        if (this.field3765) {
            return 0;
        } else {
            if (arg0 != -32565) {
                this.field3778 = null;
            }
            return this.field3770.available();
        }
    }

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "(I)I", line = 415)
    public final int method1540(int arg0) throws IOException {
        field3769++;
        if (this.field3765) {
            return 0;
        } else {
            if (arg0 != 1824) {
                method1531(103);
            }
            return this.field3770.read();
        }
    }
}
