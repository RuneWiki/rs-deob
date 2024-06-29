import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 implements Runnable {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    private int field643 = 0;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    private int field650 = 0;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Z")
    private boolean field651 = false;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "Z")
    private boolean field667 = false;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Lkc;")
    private class72 field657;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field640;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field653;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field645;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "[I")
    public static int[] field654 = new int[4000];

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/util/Calendar;")
    public static Calendar field648 = Calendar.getInstance();

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field660 = 255;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Loa;")
    public static class98 field662 = class38.method349(255, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field663 = 0;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Loa;")
    private static class98 field659 = class38.method349(255, "To create a new account you need to");

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Loa;")
    public static class98 field658 = field659;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Loa;")
    public static class98 field666 = class38.method349(255, "::fpsoff");

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lnc;")
    private class93 field646;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "[B")
    private byte[] field655;

    @OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method283(-30232);
        field664++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([BBII)V")
    public final void method278(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field641++;
        if (this.field651) {
            return;
        }
        if (this.field667) {
            this.field667 = false;
            throw new IOException();
        }
        if (this.field655 == null) {
            this.field655 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            int var7 = -108 % ((-arg1 - 13) / 60);
            while (var6 < arg2) {
                this.field655[this.field650] = arg0[arg3 + var6];
                this.field650 = (this.field650 + 1) % 5000;
                if ((this.field643 + 4900) % 5000 == this.field650) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field646 == null) {
                this.field646 = this.field657.method581(3, 25093, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILid;I)V")
    public static final void method279(int arg0, int arg1, class60 arg2, int arg3) {
        field661++;
        if (arg2 == null) {
            return;
        }
        int var4 = class25.field611 + class21.field462 & 0x7FF;
        int var5 = arg0 * arg0 + arg1 * arg1;
        if (var5 > 6400) {
            return;
        }
        int var6 = class66.field1419[var4];
        int var7 = var6 * 256 / (class76.field1662 + 256);
        if (arg3 >= -7) {
            method279(-36, 22, null, -43);
        }
        int var8 = class66.field1417[var4];
        int var9 = var8 * 256 / (class76.field1662 + 256);
        int var10 = arg0 * var7 + arg1 * var9 >> 16;
        int var11 = arg0 * var9 - arg1 * var7 >> 16;
        if (var5 > 2500) {
            arg2.method479(class46.field1068, var10 + 98 - arg2.field1309 / 2, -(arg2.field1314 / 2) + -var11 + 83 + -4);
        } else {
            arg2.method495(var10 + 94 + 4 - arg2.field1309 / 2, -var11 + 83 + -(arg2.field1314 / 2) + -4);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method280(byte arg0) {
        if (arg0 > -89) {
            method282(true);
        }
        field666 = null;
        field654 = null;
        field659 = null;
        field658 = null;
        field648 = null;
        field662 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)I")
    public final int method281(byte arg0) throws IOException {
        field647++;
        if (this.field651) {
            return 0;
        } else {
            if (arg0 != 70) {
                this.field653 = null;
            }
            return this.field653.read();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static final void method282(boolean arg0) {
        class19.field416.method441(-99);
        for (int var1 = 0; var1 < 32; var1++) {
            class132.field3121[var1] = 0L;
        }
        int var2 = 0;
        if (arg0) {
            method282(true);
        }
        while (var2 < 32) {
            class124.field2778[var2] = 0L;
            var2++;
        }
        field644++;
        class19.field421 = 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final void method283(int arg0) {
        field649++;
        if (this.field651) {
            return;
        }
        synchronized (this) {
            this.field651 = true;
            this.notifyAll();
            if (arg0 != -30232) {
                field660 = -33;
            }
        }
        if (this.field646 != null) {
            while (this.field646.field2134 == 0) {
                class82.method691(1L, (byte) -112);
            }
            if (this.field646.field2134 == 1) {
                try {
                    ((Thread) this.field646.field2130).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field646 = null;
    }

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
    public final void run() {
        field642++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field650 == this.field643) {
                        if (this.field651) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field643;
                    if (this.field650 < this.field643) {
                        var3 = 5000 - this.field643;
                    } else {
                        var3 = this.field650 - this.field643;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field645.write(this.field655, var2, var3);
                    } catch (IOException var9) {
                        this.field667 = true;
                    }
                    this.field643 = (this.field643 + var3) % 5000;
                    try {
                        if (this.field650 == this.field643) {
                            this.field645.flush();
                        }
                    } catch (IOException var8) {
                        this.field667 = true;
                    }
                }
            }
            try {
                if (this.field653 != null) {
                    this.field653.close();
                }
                if (this.field645 != null) {
                    this.field645.close();
                }
                if (this.field640 != null) {
                    this.field640.close();
                }
            } catch (IOException var7) {
            }
            this.field655 = null;
        } catch (Exception var12) {
            class75.method617(58, null, var12);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)I")
    public final int method284(int arg0) throws IOException {
        field652++;
        if (this.field651) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field643 = 29;
            }
            return this.field653.available();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[BI)V")
    public final void method285(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field656++;
        if (this.field651 || arg3 != 5000) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field653.read(arg2, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljava/net/Socket;Lkc;)V")
    public class27(Socket arg0, class72 arg1) throws IOException {
        this.field657 = arg1;
        this.field640 = arg0;
        this.field640.setSoTimeout(30000);
        this.field640.setTcpNoDelay(true);
        this.field653 = this.field640.getInputStream();
        this.field645 = this.field640.getOutputStream();
    }
}
