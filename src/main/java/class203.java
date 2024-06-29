import java.awt.Container;
import java.awt.Insets;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class203 implements Runnable {

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    private int field2991 = 0;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Z")
    private boolean field2993 = false;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    private int field2985 = 0;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Z")
    private boolean field3002 = false;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Lca;")
    private class122 field3000;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field2989;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Ljava/io/InputStream;")
    private InputStream field3005;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2995;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "[J")
    public static long[] field3007 = new long[100];

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field2987 = new Random();

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "Llb;")
    public static class221 field3008 = new class221(0, 0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lvf;")
    private class60 field2983;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[B")
    private byte[] field2984;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[Laf;")
    public static class176[] field2986;

    @OriginalMember(owner = "client!ve", name = "run", descriptor = "()V")
    public final void run() {
        field2988++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2991 == this.field2985) {
                        if (this.field2993) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2985 >= this.field2991) {
                        var2 = this.field2985 - this.field2991;
                    } else {
                        var2 = 5000 - this.field2991;
                    }
                    var3 = this.field2991;
                }
                if (var2 > 0) {
                    try {
                        this.field2995.write(this.field2984, var3, var2);
                    } catch (IOException var9) {
                        this.field3002 = true;
                    }
                    this.field2991 = (this.field2991 + var2) % 5000;
                    try {
                        if (this.field2991 == this.field2985) {
                            this.field2995.flush();
                        }
                    } catch (IOException var8) {
                        this.field3002 = true;
                    }
                }
            }
            try {
                if (this.field3005 != null) {
                    this.field3005.close();
                }
                if (this.field2995 != null) {
                    this.field2995.close();
                }
                if (this.field2989 != null) {
                    this.field2989.close();
                }
            } catch (IOException var7) {
            }
            this.field2984 = null;
        } catch (Exception var12) {
            class5.method27(-41, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1432(byte arg0, byte[] arg1) {
        field2996++;
        int var2 = -94 % ((69 - arg0) / 51);
        class53 var3 = new class53(arg1);
        int var4 = var3.method366(-16505);
        int var5 = var3.method340(-103);
        if (var5 < 0 || !(class40.field537 == 0 || var5 <= class40.field537)) {
            throw new RuntimeException();
        } else if (var4 == 0) {
            byte[] var6 = new byte[var5];
            var3.method364(-1665308089, var5, 0, var6);
            return var6;
        } else {
            int var7 = var3.method340(-106);
            if (var7 < 0 || class40.field537 != 0 && var7 > class40.field537) {
                throw new RuntimeException();
            }
            byte[] var8 = new byte[var7];
            if (var4 == 1) {
                class233.method1611(var8, var7, arg1, var5, 9);
            } else {
                class35.field442.method97(-32, var3, var8);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZIZZI)V")
    public static final void method1433(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field2998++;
        if (arg2) {
            field2986 = null;
        }
        if (arg6 == 3) {
            method1433(-1, -1, false, arg3, true, true, class64.field969);
            return;
        }
        Container var7;
        if (class268.field4312 != null) {
            var7 = class268.field4312;
        } else if (class195.field2881 == null) {
            var7 = class273.field4426.field2020;
        } else {
            var7 = class195.field2881;
        }
        class123.field2039 = var7.getSize().width;
        class40.field536 = var7.getSize().height;
        if (class195.field2881 == var7) {
            Insets var8 = class195.field2881.getInsets();
            class40.field536 -= var8.top + var8.bottom;
            class123.field2039 -= var8.right + var8.left;
        }
        if (arg6 < 2) {
            class137.field2230 = 503;
            class169.field2571 = (class123.field2039 - 765) / 2;
            class305.field4931 = 0;
            class179.field2677 = 765;
        } else {
            class169.field2571 = 0;
            class179.field2677 = class123.field2039;
            class137.field2230 = class40.field536;
            class305.field4931 = 0;
        }
        if (arg5) {
            class193.method1370(class12.field136, -21532);
            class171.method1215(!arg2, class12.field136);
            if (class82.field1324 != null) {
                class82.field1324.method115(class12.field136, (byte) 54);
            }
            class91.field1466.method1221((byte) -104);
            class135.method1021(class12.field136, -99);
            class245.method1690(class12.field136, -120);
            if (class82.field1324 != null) {
                class82.field1324.method112(class12.field136, -820088272);
            }
        } else {
            class12.field136.setSize(class179.field2677, class137.field2230);
            if (class195.field2881 == var7) {
                Insets var9 = class195.field2881.getInsets();
                class12.field136.setLocation(class169.field2571 + var9.left, class305.field4931 + var9.top);
            } else {
                class12.field136.setLocation(class169.field2571, class305.field4931);
            }
        }
        if (arg6 > 0) {
            method1433(-1, -1, false, arg3, true, true, 0);
            return;
        }
        class69.field1115 = !class273.method1903(100);
        class88.method651(class179.field2677, class137.field2230);
        if (class1.field17 != -1) {
            class110.method840(0, true);
        }
        if (class281.field4537 != null && (class98.field1677 == 30 || class98.field1677 == 25)) {
            class212.method1488(-124);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class91.field1452[var10] = true;
        }
        class180.field2715 = true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
    public final int method1434(int arg0) throws IOException {
        if (arg0 == 0) {
            field3004++;
            return this.field2993 ? 0 : this.field3005.available();
        } else {
            return 31;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[BI)V")
    public final void method1435(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3001++;
        if (this.field2993) {
            return;
        }
        if (this.field3002) {
            this.field3002 = false;
            throw new IOException();
        }
        if (this.field2984 == null) {
            this.field2984 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field2984[this.field2985] = arg2[arg1 + var6];
                this.field2985 = (this.field2985 + 1) % 5000;
                if ((this.field2991 + 4900) % 5000 == this.field2985) {
                    throw new IOException();
                }
            }
            if (arg0 != 9) {
                field2987 = null;
            }
            if (this.field2983 == null) {
                this.field2983 = this.field3000.method941(3, arg0 ^ 0x65, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1436(int arg0) {
        field2987 = null;
        field3008 = null;
        field2986 = null;
        field3007 = null;
        if (arg0 < 86) {
            field2986 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2990++;
        this.method1440(-1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([ILnc;[I[II)V")
    public static final void method1437(int[] arg0, class12 arg1, int[] arg2, int[] arg3, int arg4) {
        field2999++;
        if (arg4 > -88) {
            return;
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var6 != 0 && arg1.field3678.length > var9) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg1.field3678[var9] = null;
                    } else {
                        class76 var10 = class232.method1609((byte) -32, var7);
                        int var11 = var10.field1202;
                        class152 var12 = arg1.field3678[var9];
                        if (var12 != null) {
                            if (var12.field2404 == var7) {
                                if (var11 == 0) {
                                    var12 = arg1.field3678[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2405 = 0;
                                    var12.field2406 = var8;
                                    var12.field2401 = 0;
                                    var12.field2400 = 1;
                                    var12.field2403 = 0;
                                    class32.method208(arg1.field3660, 0, true, false, arg1.field3753, var10);
                                } else if (var11 == 2) {
                                    var12.field2405 = 0;
                                }
                            } else if (var10.field1214 >= class232.method1609((byte) -32, var12.field2404).field1214) {
                                var12 = arg1.field3678[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class152 var13 = arg1.field3678[var9] = new class152();
                            var13.field2406 = var8;
                            var13.field2404 = var7;
                            var13.field2405 = 0;
                            var13.field2401 = 0;
                            var13.field2400 = 1;
                            var13.field2403 = 0;
                            class32.method208(arg1.field3660, 0, true, false, arg1.field3753, var10);
                        }
                    }
                }
                var9++;
                var6 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public final void method1438(int arg0) {
        field2994++;
        if (arg0 != 0) {
            this.method1438(111);
        }
        if (!this.field2993) {
            this.field3005 = new class11();
            this.field2995 = new class197();
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lec;IIBLdk;Lnc;II)V")
    public static final void method1439(class93 arg0, int arg1, int arg2, byte arg3, class207 arg4, class12 arg5, int arg6, int arg7) {
        field3003++;
        if (arg3 < 72) {
            field3008 = null;
        }
        class301 var8 = new class301();
        var8.field4869 = arg6;
        var8.field4874 = arg2 * 128;
        var8.field4859 = arg7 * 128;
        if (arg0 != null) {
            var8.field4876 = arg0.field1546;
            var8.field4873 = arg0.field1525 * 128;
            var8.field4872 = arg0.field1560;
            var8.field4879 = arg0.field1504;
            var8.field4877 = arg0;
            int var10 = arg0.field1544;
            var8.field4860 = arg0.field1548;
            int var11 = arg0.field1557;
            if (arg1 == 1 || arg1 == 3) {
                var10 = arg0.field1557;
                var11 = arg0.field1544;
            }
            var8.field4871 = (arg2 + var11) * 128;
            var8.field4861 = arg0.field1524;
            var8.field4866 = (arg7 + var10) * 128;
            if (arg0.field1528 != null) {
                var8.field4864 = true;
                var8.method2053((byte) 123);
            }
            if (var8.field4876 != null) {
                var8.field4863 = var8.field4872 + ((int) ((double) (var8.field4879 - var8.field4872) * Math.random()));
            }
            class17.field178.method13(32, var8);
            return;
        }
        if (arg5 != null) {
            var8.field4858 = arg5;
            class102 var9 = arg5.field137;
            if (var9.field1752 != null) {
                var8.field4864 = true;
                var9 = var9.method795(65535);
            }
            if (var9 != null) {
                var8.field4866 = (arg7 + var9.field1738) * 128;
                var8.field4871 = (arg2 + var9.field1738) * 128;
                var8.field4861 = class169.method1204((byte) -104, arg5);
                var8.field4873 = var9.field1750 * 128;
                var8.field4860 = var9.field1743;
            }
            class219.field3193.method13(32, var8);
            return;
        }
        if (arg4 == null) {
            return;
        }
        var8.field4856 = arg4;
        var8.field4866 = (arg7 + arg4.method1467(0)) * 128;
        var8.field4871 = (arg2 + arg4.method1467(0)) * 128;
        var8.field4861 = class253.method1745(arg4, 1);
        var8.field4860 = arg4.field3047;
        var8.field4873 = arg4.field3046 * 128;
        class21.field233.method1074((byte) 39, var8, class143.method1064((byte) -121, arg4.field3069));
        return;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public final void method1440(int arg0) {
        field2992++;
        if (this.field2993 || arg0 != -1) {
            return;
        }
        synchronized (this) {
            this.field2993 = true;
            this.notifyAll();
        }
        if (this.field2983 != null) {
            while (this.field2983.field936 == 0) {
                class155.method1130(1, 1L);
            }
            if (this.field2983.field936 == 1) {
                try {
                    ((Thread) this.field2983.field932).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2983 = null;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)I")
    public final int method1441(int arg0) throws IOException {
        field3006++;
        if (arg0 == 3755) {
            return this.field2993 ? 0 : this.field3005.read();
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method1442(byte arg0) throws IOException {
        field2982++;
        if (!this.field2993 && arg0 >= 71 && this.field3002) {
            this.field3002 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II[BI)V")
    public final void method1443(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2997++;
        if (this.field2993) {
            return;
        }
        int var5 = 6 % ((-arg0 - 80) / 37);
        while (arg3 > 0) {
            int var6 = this.field3005.read(arg2, arg1, arg3);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 -= var6;
            arg1 += var6;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ljava/net/Socket;Lca;)V")
    public class203(Socket arg0, class122 arg1) throws IOException {
        this.field3000 = arg1;
        this.field2989 = arg0;
        this.field2989.setSoTimeout(30000);
        this.field2989.setTcpNoDelay(true);
        this.field3005 = this.field2989.getInputStream();
        this.field2995 = this.field2989.getOutputStream();
    }
}
