import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class40 implements Runnable {

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Z")
    private boolean field705 = false;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    private int field702 = 0;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Z")
    private boolean field711 = false;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    private int field701 = 0;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field720;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lml;")
    private class129 field715;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field703;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field716;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    public static int[] field699 = new int[50];

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field723 = 10;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field700 = 0;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Lsl;")
    public static class95 field718 = new class95();

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "Lok;")
    public static class146 field724 = class235.method1724(-12908, "Shift)2click ENABLED(Q");

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "Lwi;")
    private class256 field722;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "[B")
    private byte[] field714;

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        field709++;
        this.method284((byte) 84);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIII)V", line = 18)
    public final void method277(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = 104 % ((-arg1 - 32) / 51);
        field721++;
        if (this.field711) {
            return;
        }
        while (arg2 > 0) {
            int var6 = this.field703.read(arg0, arg3, arg2);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 += var6;
            arg2 -= var6;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([IIIIII)V", line = 42)
    public static final void method278(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class11 var6 = class203.field3382[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class217 var7 = var6.field222;
        if (var7 != null) {
            int var8 = var7.field3582;
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
        class162 var10 = var6.field210;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2768;
        int var12 = var10.field2757;
        int var13 = var10.field2755;
        int var14 = var10.field2770;
        int[] var15 = class248.field4126[var11];
        int[] var16 = class258.field4285[var12];
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

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[B)V", line = 135)
    public final void method279(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field708++;
        if (this.field711) {
            return;
        }
        if (this.field705) {
            this.field705 = false;
            throw new IOException();
        }
        if (this.field714 == null) {
            this.field714 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field714[this.field701] = arg3[arg1 + var6];
                this.field701 = (this.field701 + 1) % 5000;
                if (((this.field702 + 4900) % 5000) == this.field701) {
                    throw new IOException();
                }
            }
            int var7 = 79 / ((arg0 - 78) / 44);
            if (this.field722 == null) {
                this.field722 = this.field715.method920(this, 3, 0);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I", line = 192)
    public final int method280(byte arg0) throws IOException {
        field712++;
        if (arg0 == -36) {
            return this.field711 ? 0 : this.field703.read();
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II[III)V", line = 208)
    public static final void method281(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field707++;
        int var11 = arg3 - 1;
        int var5 = var11 - arg4;
        arg1--;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg2[var6] = arg0;
            int var7 = var6 + 1;
            arg2[var7] = arg0;
            int var8 = var7 + 1;
            arg2[var8] = arg0;
            int var9 = var8 + 1;
            arg2[var9] = arg0;
            int var10 = var9 + 1;
            arg2[var10] = arg0;
            int var12 = var10 + 1;
            arg2[var12] = arg0;
            int var13 = var12 + 1;
            arg2[var13] = arg0;
            arg1 = var13 + 1;
            arg2[arg1] = arg0;
        }
        while (arg1 < var11) {
            arg1++;
            arg2[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V", line = 238)
    public static final void method282(int arg0, int arg1) {
        class118.field1892[1] = (float) (class82.method582(65366, arg0) >> 8) / 255.0F;
        field704++;
        if (arg1 != 5000) {
            field724 = (class146) null;
        }
        class118.field1892[2] = (float) class82.method582(arg0, 255) / 255.0F;
        class118.field1892[0] = (float) (class82.method582(arg0, 16761031) >> 16) / 255.0F;
        class147.method1137((byte) -71, 3);
        class147.method1137((byte) -52, 4);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 258)
    public static void method283(int arg0) {
        field718 = null;
        field699 = null;
        field724 = null;
        if (arg0 != 0) {
            field699 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "run", descriptor = "()V", line = 279)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label88: {
                    synchronized (this) {
                        label89: {
                            if (this.field702 == this.field701) {
                                if (this.field711) {
                                    break label89;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            var3 = this.field702;
                            if (this.field702 > this.field701) {
                                var4 = 5000 - this.field702;
                            } else {
                                var4 = this.field701 - this.field702;
                            }
                            break label88;
                        }
                    }
                    try {
                        if (this.field703 != null) {
                            this.field703.close();
                        }
                        if (this.field716 != null) {
                            this.field716.close();
                        }
                        if (this.field720 != null) {
                            this.field720.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field714 = null;
                    break;
                }
                if (var4 > 0) {
                    try {
                        this.field716.write(this.field714, var3, var4);
                    } catch (IOException var12) {
                        this.field705 = true;
                    }
                    this.field702 = (this.field702 + var4) % 5000;
                    try {
                        if (this.field702 == this.field701) {
                            this.field716.flush();
                        }
                    } catch (IOException var11) {
                        this.field705 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class245.method1771(var15, (String) null, 0);
        }
        field713++;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V", line = 349)
    public final void method284(byte arg0) {
        field717++;
        if (this.field711) {
            return;
        }
        synchronized (this) {
            this.field711 = true;
            int var3 = 8 % ((arg0 - 35) / 42);
            this.notifyAll();
        }
        if (this.field722 != null) {
            while (this.field722.field4265 == 0) {
                class281.method2041((byte) 105, 1L);
            }
            if (this.field722.field4265 == 1) {
                try {
                    ((Thread) this.field722.field4269).join();
                } catch (InterruptedException var6) {
                }
            }
        }
        this.field722 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Lcj;", line = 385)
    public static final class311 method285(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field218; var4++) {
            class311 var5 = var3.field217[var4];
            if ((var5.field5289 >> 29 & 0x3L) == 2L && var5.field5296 == arg1 && var5.field5294 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/net/Socket;Lml;)V", line = 513)
    public class40(Socket arg0, class129 arg1) throws IOException {
        this.field720 = arg0;
        this.field715 = arg1;
        this.field720.setSoTimeout(30000);
        this.field720.setTcpNoDelay(true);
        this.field703 = this.field720.getInputStream();
        this.field716 = this.field720.getOutputStream();
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V", line = 413)
    public final void method286(byte arg0) throws IOException {
        field706++;
        if (arg0 <= 94) {
            method281(82, -105, (int[]) null, 120, 82);
        }
        if (!this.field711 && this.field705) {
            this.field705 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Ltf;", line = 452)
    public static final class250 method287(int arg0, byte arg1) {
        field719++;
        class250 var2 = (class250) class93.field1489.method1511((long) arg0, 111);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class218.field3602.method92(1, 0, arg0 & 0x7FFF);
        } else {
            var3 = class75.field1226.method92(1, 0, arg0);
        }
        class250 var4 = new class250();
        if (var3 != null) {
            var4.method1824(new class47(var3), (byte) 119);
        }
        if (arg0 >= 32768) {
            var4.method1830((byte) -53);
        }
        int var5 = -124 % ((-arg1 - 10) / 45);
        class93.field1489.method1509((long) arg0, 112, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I", line = 481)
    public final int method288(int arg0) throws IOException {
        field698++;
        if (this.field711) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field702 = 94;
            }
            return this.field703.available();
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)V", line = 496)
    public final void method289(byte arg0) {
        if (arg0 <= 94) {
            field723 = -36;
        }
        field710++;
        if (!this.field711) {
            this.field703 = new class201();
            this.field716 = new class58();
        }
    }
}
