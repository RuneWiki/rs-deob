import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class337 implements Runnable {

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    private int field4889 = 0;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Z")
    private boolean field4905 = false;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    private int field4904 = 0;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Z")
    private boolean field4906 = false;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lmj;")
    private class430 field4887;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field4885;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Ljava/io/InputStream;")
    private InputStream field4908;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4894;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Lvp;")
    public static class112 field4903 = new class112("", 11);

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "Ldk;")
    public static class326 field4909 = new class326("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lkj;")
    private class366 field4896;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "[B")
    private byte[] field4893;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "[Ldt;")
    public static class145[] field4900;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "[[[J")
    public static long[][][] field4910;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public final void method2118(int arg0) {
        field4890++;
        if (this.field4905) {
            return;
        }
        synchronized (this) {
            this.field4905 = true;
            this.notifyAll();
            if (arg0 != 1) {
                field4900 = null;
            }
        }
        if (this.field4896 != null) {
            while (this.field4896.field5253 == 0) {
                class111.method713(30, 1L);
            }
            if (this.field4896.field5253 == 1) {
                try {
                    ((Thread) this.field4896.field5255).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4896 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)I")
    public final int method2119(boolean arg0) throws IOException {
        field4901++;
        if (arg0) {
            return this.field4905 ? 0 : this.field4908.read();
        } else {
            return 19;
        }
    }

    @OriginalMember(owner = "client!lh", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2118(1);
        field4899++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILss;Lss;)V")
    public static final void method2120(int arg0, class272 arg1, class272 arg2) {
        if (arg2.field3964 != null) {
            arg2.method1673((byte) 27);
        }
        field4891++;
        arg2.field3964 = arg1;
        arg2.field3968 = arg1.field3968;
        arg2.field3964.field3968 = arg2;
        arg2.field3968.field3964 = arg2;
        if (arg0 != 1) {
            field4910 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)I")
    public final int method2121(boolean arg0) throws IOException {
        field4888++;
        if (!arg0) {
            this.field4889 = 75;
        }
        return this.field4905 ? 0 : this.field4908.available();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public final void method2122(byte arg0) {
        field4886++;
        if (!this.field4905) {
            int var2 = -5 % ((arg0 - 57) / 52);
            this.field4908 = new class440();
            this.field4894 = new class278();
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[BI)V")
    public final void method2123(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 < 45) {
            this.method2122((byte) -5);
        }
        field4902++;
        if (this.field4905) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field4908.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public static void method2124(byte arg0) {
        field4903 = null;
        field4910 = null;
        field4909 = null;
        field4900 = null;
        if (arg0 >= -6) {
            field4909 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4904 == this.field4889) {
                            if (this.field4905) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field4889;
                        if (this.field4904 < this.field4889) {
                            var3 = 5000 - this.field4889;
                        } else {
                            var3 = this.field4904 - this.field4889;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field4894.write(this.field4893, var2, var3);
                    } catch (IOException var9) {
                        this.field4906 = true;
                    }
                    this.field4889 = (this.field4889 + var3) % 5000;
                    try {
                        if (this.field4904 == this.field4889) {
                            this.field4894.flush();
                        }
                    } catch (IOException var8) {
                        this.field4906 = true;
                    }
                    continue;
                }
                try {
                    if (this.field4908 != null) {
                        this.field4908.close();
                    }
                    if (this.field4894 != null) {
                        this.field4894.close();
                    }
                    if (this.field4885 != null) {
                        this.field4885.close();
                    }
                } catch (IOException var7) {
                }
                this.field4893 = null;
                break;
            }
        } catch (Exception var12) {
            class267.method1641((String) null, var12, (byte) -87);
        }
        field4895++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[BBI)V")
    public final void method2125(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field4907++;
        if (this.field4905) {
            return;
        }
        if (this.field4906) {
            this.field4906 = false;
            throw new IOException();
        }
        if (this.field4893 == null) {
            this.field4893 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg2 != -36) {
                this.method2122((byte) 117);
            }
            while (arg0 > var6) {
                this.field4893[this.field4904] = arg1[arg3 + var6];
                this.field4904 = (this.field4904 + 1) % 5000;
                if (((this.field4889 + 4900) % 5000) == this.field4904) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field4896 == null) {
                this.field4896 = this.field4887.method2543(this, 3, (byte) 120);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)V")
    public final void method2126(boolean arg0) throws IOException {
        field4898++;
        if (!arg0) {
            this.field4904 = 0;
        }
        if (!this.field4905 && this.field4906) {
            this.field4906 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILdt;)Ljava/lang/String;")
    public static final String method2127(int arg0, int arg1, class145 arg2) {
        field4892++;
        if (!client.method1122(arg2).method2318(-1, arg0) && arg2.field1929 == null) {
            return null;
        } else if (arg2.field1920 == null || arg2.field1920.length <= arg0 || arg2.field1920[arg0] == null || arg2.field1920[arg0].trim().length() == 0) {
            return class342.field4986 ? "Hidden-" + arg0 : null;
        } else {
            if (arg1 != 0) {
                field4910 = null;
            }
            return arg2.field1920[arg0];
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBIII)V")
    public static final void method2128(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4897++;
        class225.field3415.field4021 = 0;
        int var5 = -121 % ((-arg1 - 39) / 33);
        class225.field3415.method1753(true, class93.field1191.field1886);
        class225.field3415.method1753(true, arg2);
        class225.field3415.method1753(true, arg4);
        class225.field3415.method1711(false, arg3);
        class225.field3415.method1711(false, arg0);
        class166.field2435 = 0;
        class355.field5138 = -3;
        class120.field1507 = 1;
        class42.field621 = 0;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/net/Socket;Lmj;)V")
    public class337(Socket arg0, class430 arg1) throws IOException {
        this.field4887 = arg1;
        this.field4885 = arg0;
        this.field4885.setSoTimeout(30000);
        this.field4885.setTcpNoDelay(true);
        this.field4908 = this.field4885.getInputStream();
        this.field4894 = this.field4885.getOutputStream();
    }
}
