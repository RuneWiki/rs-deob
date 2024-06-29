import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class293 implements Runnable {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    private int field4596 = 0;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Z")
    private boolean field4599 = false;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Z")
    private boolean field4605 = false;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    private int field4614 = 0;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field4612;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Ld;")
    private class244 field4604;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field4613;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4619;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4603 = "wave2:";

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field4601 = 0;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "[Z")
    public static boolean[] field4607 = new boolean[100];

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "Lic;")
    public static class143 field4609 = new class143(128);

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Lvj;")
    private class117 field4597;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "[B")
    private byte[] field4595;

    @OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4611++;
        this.method1958(5000);
    }

    @OriginalMember(owner = "client!pl", name = "run", descriptor = "()V")
    public final void run() {
        field4610++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4614 == this.field4596) {
                        if (this.field4599) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field4596 >= this.field4614) {
                        var2 = this.field4596 - this.field4614;
                    } else {
                        var2 = 5000 - this.field4614;
                    }
                    var3 = this.field4614;
                }
                if (var2 > 0) {
                    try {
                        this.field4619.write(this.field4595, var3, var2);
                    } catch (IOException var9) {
                        this.field4605 = true;
                    }
                    this.field4614 = (this.field4614 + var2) % 5000;
                    try {
                        if (this.field4614 == this.field4596) {
                            this.field4619.flush();
                        }
                    } catch (IOException var8) {
                        this.field4605 = true;
                    }
                }
            }
            try {
                if (this.field4613 != null) {
                    this.field4613.close();
                }
                if (this.field4619 != null) {
                    this.field4619.close();
                }
                if (this.field4612 != null) {
                    this.field4612.close();
                }
            } catch (IOException var7) {
            }
            this.field4595 = null;
        } catch (Exception var12) {
            class221.method1426((String) null, -1, var12);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public final void method1958(int arg0) {
        field4598++;
        if (this.field4599) {
            return;
        }
        synchronized (this) {
            this.field4599 = true;
            if (arg0 != 5000) {
                method1961((class235) null, (class235) null, 41, (class208) null, (class235) null);
            }
            this.notifyAll();
        }
        if (this.field4597 != null) {
            while (this.field4597.field1663 == 0) {
                class28.method182(1L, 124);
            }
            if (this.field4597.field1663 == 1) {
                try {
                    ((Thread) this.field4597.field1665).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4597 = null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I")
    public final int method1959(int arg0) throws IOException {
        field4608++;
        if (this.field4599) {
            return 0;
        } else if (arg0 >= -84) {
            return -82;
        } else {
            return this.field4613.read();
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)I")
    public final int method1960(int arg0) throws IOException {
        field4600++;
        if (arg0 == -1) {
            return this.field4599 ? 0 : this.field4613.available();
        } else {
            return -99;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lhc;Lhc;ILel;Lhc;)Z")
    public static final boolean method1961(class235 arg0, class235 arg1, int arg2, class208 arg3, class235 arg4) {
        class159.field2219 = arg0;
        class181.field2541 = arg3;
        if (arg2 >= -15) {
            field4609 = null;
        }
        class264.field3969 = arg1;
        field4606++;
        class222.field3328 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
    public final void method1962(int arg0) throws IOException {
        if (arg0 != 5000) {
            this.field4605 = true;
        }
        field4602++;
        if (!this.field4599 && this.field4605) {
            this.field4605 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BIZ)V")
    public final void method1963(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field4615++;
        if (this.field4599) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field4613.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg0 -= var5;
        }
        if (arg3) {
            field4607 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
    public final void method1964(int arg0) {
        field4618++;
        if (this.field4599) {
            return;
        }
        this.field4613 = new class218();
        this.field4619 = new class279();
        if (arg0 != 5000) {
            this.method1964(-47);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
    public static void method1965(boolean arg0) {
        field4607 = null;
        field4603 = null;
        if (arg0) {
            method1966((byte) -59);
        }
        field4609 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static final void method1966(byte arg0) {
        if (arg0 == 77) {
            class193.field2657.method546(-90762264);
            field4616++;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([BIII)V")
    public final void method1967(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4620++;
        if (this.field4599) {
            return;
        }
        if (this.field4605) {
            this.field4605 = false;
            throw new IOException();
        }
        if (this.field4595 == null) {
            this.field4595 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = arg3; var6 < arg2; var6++) {
                this.field4595[this.field4596] = arg0[arg1 + var6];
                this.field4596 = (this.field4596 + 1) % 5000;
                if ((this.field4614 + 4900) % 5000 == this.field4596) {
                    throw new IOException();
                }
            }
            if (this.field4597 == null) {
                this.field4597 = this.field4604.method1638(arg3 ^ 0x2, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/net/Socket;Ld;)V")
    public class293(Socket arg0, class244 arg1) throws IOException {
        this.field4612 = arg0;
        this.field4604 = arg1;
        this.field4612.setSoTimeout(30000);
        this.field4612.setTcpNoDelay(true);
        this.field4613 = this.field4612.getInputStream();
        this.field4619 = this.field4612.getOutputStream();
    }
}
