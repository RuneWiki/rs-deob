import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class129 implements Runnable {

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
    private boolean field3126 = false;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private int field3127 = 0;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    private int field3138 = 0;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
    private boolean field3125 = false;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lfb;")
    private class33 field3137;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field3135;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field3139;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3145;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lrc;")
    public static class105 field3140 = class43.method374("hitmarks", 0);

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Lrc;")
    private static class105 field3143 = class43.method374("Connecting to server)3)3)3", 0);

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Z")
    public static boolean field3134 = false;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lrc;")
    public static class105 field3122 = field3143;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lrc;")
    public static class105 field3124 = class43.method374("m-Ochte mit Ihnen handeln)3", 0);

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Lrc;")
    public static class105 field3144 = class43.method374("Ausw-=hlen", 0);

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "[I")
    public static int[] field3130 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lgd;")
    private class40 field3133;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "[B")
    private byte[] field3147;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I", line = 12)
    public final int method1032(byte arg0) throws IOException {
        if (arg0 < 40) {
            this.run();
        }
        field3142++;
        return this.field3125 ? 0 : this.field3139.available();
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/net/Socket;Lfb;)V", line = 447)
    public class129(Socket arg0, class33 arg1) throws IOException {
        this.field3137 = arg1;
        this.field3135 = arg0;
        this.field3135.setSoTimeout(30000);
        this.field3135.setTcpNoDelay(true);
        this.field3139 = this.field3135.getInputStream();
        this.field3145 = this.field3135.getOutputStream();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)I", line = 41)
    public final int method1033(int arg0) throws IOException {
        field3131++;
        if (arg0 != 0) {
            this.run();
        }
        return this.field3125 ? 0 : this.field3139.read();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[BII)V", line = 57)
    public final void method1034(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3121++;
        if (this.field3125) {
            return;
        }
        if (this.field3126) {
            this.field3126 = false;
            throw new IOException();
        }
        if (this.field3147 == null) {
            this.field3147 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field3147[this.field3138] = arg1[arg0 + var6];
                this.field3138 = (this.field3138 + 1) % 5000;
                if ((this.field3127 + 4900) % 5000 == this.field3138) {
                    throw new IOException();
                }
            }
            if (this.field3133 == null) {
                this.field3133 = this.field3137.method318(3, -72, this);
            }
            this.notifyAll();
        }
        if (arg2 > -95) {
            this.method1037(-112);
        }
    }

    @OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V", line = 110)
    protected final void finalize() {
        this.method1037(0);
        field3146++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZI)Lrc;", line = 128)
    public static final class105 method1035(int arg0, boolean arg1, int arg2) {
        if (arg0 != -2) {
            field3143 = null;
        }
        field3128++;
        return class84.method704(arg2, -106, 10, arg1);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V", line = 142)
    public static void method1036(int arg0) {
        field3143 = null;
        field3140 = null;
        field3130 = null;
        field3122 = null;
        if (arg0 >= 17) {
            field3144 = null;
            field3124 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V", line = 157)
    public final void method1037(int arg0) {
        field3129++;
        if (this.field3125) {
            return;
        }
        synchronized (this) {
            this.field3125 = true;
            this.notifyAll();
            if (arg0 != 0) {
                this.finalize();
            }
        }
        if (this.field3133 != null) {
            while (this.field3133.field916 == 0) {
                class75.method634(1L, 20306);
            }
            if (this.field3133.field916 == 1) {
                try {
                    ((Thread) this.field3133.field918).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3133 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lrc;ZLrc;B)V", line = 199)
    public static final void method1038(class105 arg0, boolean arg1, class105 arg2, byte arg3) {
        field3141++;
        short var4 = 151;
        int var6 = var4 - 3;
        if (arg3 > -114) {
            method1035(62, true, 67);
        }
        if (class67.field1506) {
            class67.field1506 = false;
            class112.method923(14797);
            class72.method611(-184);
            class111.method910(15755);
            class78.method674(true);
            class31.method295(class6.field79, -91, class134.field3270, class17.field370, class55.field1106);
            class111.method914(class120.field2901, class134.field3265, client.field424 == -1, true, -1);
            class107.field2459 = true;
            class28.field620 = true;
            class28.field629 = true;
        }
        class36.method335(-80);
        class6.field79.method668(arg2, 257, var6, 0);
        class6.field79.method668(arg2, 256, var6 - 1, 16777215);
        if (arg0 != null) {
            var6 += 15;
            if (arg1) {
                int var5 = class6.field79.method662(arg0) + 4;
                class69.method580(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class6.field79.method668(arg0, 257, var6, 0);
            class6.field79.method668(arg0, 256, var6 - 1, 16777215);
        }
        class84.method705(true);
    }

    @OriginalMember(owner = "client!vc", name = "run", descriptor = "()V", line = 258)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3138 == this.field3127) {
                            if (this.field3125) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field3127 <= this.field3138) {
                            var2 = this.field3138 - this.field3127;
                        } else {
                            var2 = 5000 - this.field3127;
                        }
                        var3 = this.field3127;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field3145.write(this.field3147, var3, var2);
                    } catch (IOException var9) {
                        this.field3126 = true;
                    }
                    this.field3127 = (this.field3127 + var2) % 5000;
                    try {
                        if (this.field3138 == this.field3127) {
                            this.field3145.flush();
                        }
                    } catch (IOException var8) {
                        this.field3126 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3139 != null) {
                        this.field3139.close();
                    }
                    if (this.field3145 != null) {
                        this.field3145.close();
                    }
                    if (this.field3135 != null) {
                        this.field3135.close();
                    }
                } catch (IOException var7) {
                }
                this.field3147 = null;
                break;
            }
        } catch (Exception var12) {
            class19.method225(0, null, var12);
        }
        field3132++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lb;IIIIIII)V", line = 330)
    public static final void method1039(class7 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3123++;
        int var8 = 87 / ((arg1 - 25) / 40);
        if (arg4 < 0 || arg4 >= 104 || arg7 < 0 || arg7 >= 104) {
            while (true) {
                int var11 = arg0.method96(27023);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method96(27023);
                    return;
                }
                if (var11 <= 49) {
                    arg0.method96(27023);
                }
            }
        }
        class57.field1185[arg3][arg4][arg7] = 0;
        while (true) {
            int var9 = arg0.method96(27023);
            if (var9 == 0) {
                if (arg3 == 0) {
                    class9.field151[0][arg4][arg7] = -class18.method198(arg2 + arg4 + 932731, arg7 + 556238 + arg6, (byte) 25) * 8;
                    return;
                } else {
                    class9.field151[arg3][arg4][arg7] = class9.field151[arg3 - 1][arg4][arg7] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method96(27023);
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg3 != 0) {
                    class9.field151[arg3][arg4][arg7] = class9.field151[arg3 - 1][arg4][arg7] - var10 * 8;
                    return;
                }
                class9.field151[0][arg4][arg7] = -var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class71.field1553[arg3][arg4][arg7] = arg0.method85(-4794);
                class18.field410[arg3][arg4][arg7] = (byte) ((var9 - 2) / 4);
                class26.field596[arg3][arg4][arg7] = (byte) class100.method807(3, arg5 + var9 - 2);
            } else if (var9 <= 81) {
                class57.field1185[arg3][arg4][arg7] = (byte) (var9 - 49);
            } else {
                class26.field602[arg3][arg4][arg7] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B[BII)V", line = 418)
    public final void method1040(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 <= 55) {
            return;
        }
        field3136++;
        if (this.field3125) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field3139.read(arg1, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
    }
}
