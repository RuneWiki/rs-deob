import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class236 implements Runnable {

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Z")
    private boolean field4045 = false;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    private int field4039 = 0;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "Z")
    private boolean field4062 = false;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    private int field4048 = 0;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lgd;")
    private class123 field4040;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field4046;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "Ljava/io/InputStream;")
    private InputStream field4067;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4060;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field4057 = 50;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field4053 = 0;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lmb;")
    public static class96 field4043 = class243.method1708("Sprites geladen)3", (byte) 112);

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "Lmb;")
    public static class96 field4065 = class243.method1708("::gc", (byte) 104);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lic;")
    public static class263 field4038;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Lic;")
    private class263 field4052;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "Lff;")
    public static class3 field4058;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Lwk;")
    public static class47 field4047;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "[B")
    private byte[] field4049;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method1597(int arg0) {
        field4050++;
        if (arg0 != 128) {
            return;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class73.field1254 - 1; var2++) {
                if (class79.field1346[var2] < 1000 && class79.field1346[var2 + 1] > 1000) {
                    var1 = false;
                    class96 var3 = class192.field3316[var2];
                    class192.field3316[var2] = class192.field3316[var2 + 1];
                    class192.field3316[var2 + 1] = var3;
                    class96 var4 = class208.field3586[var2];
                    class208.field3586[var2] = class208.field3586[var2 + 1];
                    class208.field3586[var2 + 1] = var4;
                    int var5 = class53.field927[var2];
                    class53.field927[var2] = class53.field927[var2 + 1];
                    class53.field927[var2 + 1] = var5;
                    int var6 = class78.field1329[var2];
                    class78.field1329[var2] = class78.field1329[var2 + 1];
                    class78.field1329[var2 + 1] = var6;
                    short var7 = class79.field1346[var2];
                    class79.field1346[var2] = class79.field1346[var2 + 1];
                    class79.field1346[var2 + 1] = var7;
                    long var8 = class214.field3687[var2];
                    class214.field3687[var2] = class214.field3687[var2 + 1];
                    class214.field3687[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)I")
    public final int method1598(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field4049 = null;
        }
        field4064++;
        return this.field4062 ? 0 : this.field4067.available();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI[BI)V")
    public final void method1599(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4056++;
        if (this.field4062) {
            return;
        }
        if (this.field4045) {
            this.field4045 = false;
            throw new IOException();
        }
        if (this.field4049 == null) {
            this.field4049 = new byte[5000];
        }
        synchronized (this) {
            if (!arg0) {
                this.finalize();
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field4049[this.field4048] = arg2[arg3 + var6];
                this.field4048 = (this.field4048 + 1) % 5000;
                if (((this.field4039 + 4900) % 5000) == this.field4048) {
                    throw new IOException();
                }
            }
            if (this.field4052 == null) {
                this.field4052 = this.field4040.method946(3, 0, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static final void method1600(byte arg0) {
        field4055++;
        if (class106.field1800 == 0) {
            return;
        }
        try {
            if (++class187.field3258 > 2000) {
                if (class211.field3638 != null) {
                    class211.field3638.method1605(98);
                    class211.field3638 = null;
                }
                if (class5.field107 >= 1) {
                    class106.field1800 = 0;
                    class77.field1322 = -5;
                    return;
                }
                class187.field3258 = 0;
                if (class226.field3837 == class121.field2239) {
                    class121.field2239 = class232.field3981;
                } else {
                    class121.field2239 = class226.field3837;
                }
                class106.field1800 = 1;
                class5.field107++;
            }
            if (class106.field1800 == 1) {
                class216.field3722 = class234.field4017.method942(class121.field2239, class207.field3575, 11);
                class106.field1800 = 2;
            }
            if (class106.field1800 == 2) {
                if (class216.field3722.field4605 == 2) {
                    throw new IOException();
                }
                if (class216.field3722.field4605 != 1) {
                    return;
                }
                class211.field3638 = new class236((Socket) class216.field3722.field4604, class234.field4017);
                class216.field3722 = null;
                class211.field3638.method1599(true, class140.field2505.field4124, class140.field2505.field4144, 0);
                if (class20.field335 != null) {
                    class20.field335.method536((byte) 14);
                }
                if (class80.field1362 != null) {
                    class80.field1362.method536((byte) 14);
                }
                int var1 = class211.field3638.method1604((byte) 78);
                if (class20.field335 != null) {
                    class20.field335.method536((byte) 14);
                }
                if (class80.field1362 != null) {
                    class80.field1362.method536((byte) 14);
                }
                if (var1 != 21) {
                    class106.field1800 = 0;
                    class77.field1322 = var1;
                    class211.field3638.method1605(25);
                    class211.field3638 = null;
                    return;
                }
                class106.field1800 = 3;
            }
            if (arg0 != -46) {
                field4047 = null;
            }
            if (class106.field1800 == 3) {
                if (class211.field3638.method1598(0) < 1) {
                    return;
                }
                class114.field2099 = new class96[class211.field3638.method1604((byte) 78)];
                class106.field1800 = 4;
            }
            if (class106.field1800 == 4 && class211.field3638.method1598(0) >= (class114.field2099.length * 8)) {
                class1.field4.field4124 = 0;
                class211.field3638.method1603(2000, class1.field4.field4144, 0, class114.field2099.length * 8);
                for (int var2 = 0; var2 < class114.field2099.length; var2++) {
                    class114.field2099[var2] = class57.method421((byte) -114, class1.field4.method1658(arg0 - 1243377330));
                }
                class106.field1800 = 0;
                class77.field1322 = 21;
                class211.field3638.method1605(-115);
                class211.field3638 = null;
            }
        } catch (IOException var3) {
            if (class211.field3638 != null) {
                class211.field3638.method1605(37);
                class211.field3638 = null;
            }
            if (class5.field107 >= 1) {
                class77.field1322 = -4;
                class106.field1800 = 0;
            } else {
                class187.field3258 = 0;
                class5.field107++;
                class106.field1800 = 1;
                if (class226.field3837 == class121.field2239) {
                    class121.field2239 = class232.field3981;
                } else {
                    class121.field2239 = class226.field3837;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
    public final void method1601(byte arg0) {
        field4066++;
        if (this.field4062) {
            return;
        }
        this.field4067 = new class162();
        this.field4060 = new class176();
        if (arg0 != 15) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!jk", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4048 == this.field4039) {
                            if (this.field4062) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field4048 >= this.field4039) {
                            var2 = this.field4048 - this.field4039;
                        } else {
                            var2 = 5000 - this.field4039;
                        }
                        var3 = this.field4039;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field4060.write(this.field4049, var3, var2);
                    } catch (IOException var9) {
                        this.field4045 = true;
                    }
                    this.field4039 = (this.field4039 + var2) % 5000;
                    try {
                        if (this.field4048 == this.field4039) {
                            this.field4060.flush();
                        }
                    } catch (IOException var8) {
                        this.field4045 = true;
                    }
                    continue;
                }
                try {
                    if (this.field4067 != null) {
                        this.field4067.close();
                    }
                    if (this.field4060 != null) {
                        this.field4060.close();
                    }
                    if (this.field4046 != null) {
                        this.field4046.close();
                    }
                } catch (IOException var7) {
                }
                this.field4049 = null;
                break;
            }
        } catch (Exception var12) {
            client.method815((String) null, (byte) -105, var12);
        }
        field4054++;
    }

    @OriginalMember(owner = "client!jk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4036++;
        this.method1605(-116);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V")
    public static void method1602(byte arg0) {
        field4043 = null;
        field4065 = null;
        int var1 = -36 % ((-arg0 - 17) / 46);
        field4058 = null;
        field4038 = null;
        field4047 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[BII)V")
    public final void method1603(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != 2000) {
            method1606(-97, -50, -77, 0, 111, -128);
        }
        field4061++;
        if (this.field4062) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field4067.read(arg1, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)I")
    public final int method1604(byte arg0) throws IOException {
        field4059++;
        if (arg0 != 78) {
            method1602((byte) -113);
        }
        return this.field4062 ? 0 : this.field4067.read();
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
    public final void method1605(int arg0) {
        field4041++;
        if (this.field4062) {
            return;
        }
        synchronized (this) {
            this.field4062 = true;
            this.notifyAll();
            int var3 = 100 % ((-arg0 - 46) / 39);
        }
        if (this.field4052 != null) {
            while (this.field4052.field4605 == 0) {
                class226.method1543(1L, -738);
            }
            if (this.field4052.field4605 == 1) {
                try {
                    ((Thread) this.field4052.field4604).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field4052 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIII)V")
    public static final void method1606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4063++;
        if (class9.field145 <= arg1 && arg4 <= class162.field2884 && arg0 >= client.field1994 && class9.field149 >= arg3) {
            class95.method666(arg4, arg1, 110, arg5, arg3, arg0);
        } else {
            class144.method1065(arg4, arg1, (byte) -88, arg5, arg3, arg0);
        }
        if (arg2 != -20268) {
            field4047 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
    public final void method1607(int arg0) throws IOException {
        field4051++;
        if (!this.field4062 && arg0 == 1 && this.field4045) {
            this.field4045 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
    public static final void method1608(int arg0) {
        field4037++;
        int var1 = 106 / ((29 - arg0) / 60);
        for (int var2 = -1; var2 < class145.field2577; var2++) {
            int var3;
            if (var2 == -1) {
                var3 = 2047;
            } else {
                var3 = class103.field1734[var2];
            }
            class47 var4 = class22.field371[var3];
            if (var4 != null) {
                class237.method1610(var4.method366((byte) 95), -129, var4);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lwk;Lvi;IIBILrc;I)V")
    public static final void method1609(class47 arg0, class197 arg1, int arg2, int arg3, byte arg4, int arg5, class196 arg6, int arg7) {
        if (arg4 >= -88) {
            method1600((byte) -52);
        }
        field4042++;
        class38 var8 = new class38();
        var8.field647 = arg5 * 128;
        var8.field661 = arg3;
        var8.field663 = arg2 * 128;
        if (arg6 != null) {
            int var10 = arg6.field3415;
            var8.field668 = arg6.field3366;
            var8.field649 = arg6.field3403;
            var8.field662 = arg6.field3389;
            var8.field658 = arg6.field3417;
            var8.field659 = arg6.field3409 * 128;
            var8.field652 = arg6;
            int var11 = arg6.field3388;
            if (arg7 == 1 || arg7 == 3) {
                var11 = arg6.field3415;
                var10 = arg6.field3388;
            }
            var8.field644 = (arg2 + var11) * 128;
            var8.field646 = (arg5 + var10) * 128;
            if (arg6.field3408 != null) {
                var8.field660 = true;
                var8.method300(13611);
            }
            if (var8.field662 != null) {
                var8.field651 = var8.field668 + (int) (Math.random() * (double) (var8.field658 - var8.field668));
            }
            class217.field3726.method1814(1, var8);
        } else if (arg1 != null) {
            var8.field642 = arg1;
            class229 var9 = arg1.field3436;
            if (var9.field3926 != null) {
                var8.field660 = true;
                var9 = var9.method1560((byte) -74);
            }
            if (var9 != null) {
                var8.field646 = (var9.field3914 + arg5) * 128;
                var8.field644 = (var9.field3914 + arg2) * 128;
                var8.field649 = class27.method180((byte) 122, arg1);
                var8.field659 = var9.field3893 * 128;
            }
            class248.field4296.method1814(1, var8);
        } else if (arg0 != null) {
            var8.field669 = arg0;
            var8.field646 = (arg5 + arg0.method366((byte) 95)) * 128;
            var8.field644 = (arg0.method366((byte) 95) + arg2) * 128;
            var8.field649 = class134.method1003(arg0, 103);
            var8.field659 = arg0.field825 * 128;
            class260.field4525.method1085(-1, var8, arg0.field828.method685((byte) -4));
            return;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/net/Socket;Lgd;)V")
    public class236(Socket arg0, class123 arg1) throws IOException {
        this.field4040 = arg1;
        this.field4046 = arg0;
        this.field4046.setSoTimeout(30000);
        this.field4046.setTcpNoDelay(true);
        this.field4067 = this.field4046.getInputStream();
        this.field4060 = this.field4046.getOutputStream();
    }
}
