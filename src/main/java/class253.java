import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class253 implements Runnable {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Z")
    private boolean field3896 = false;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    private int field3908 = 0;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Z")
    private boolean field3901 = false;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    private int field3906 = 0;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field3914;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lgf;")
    private class26 field3907;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field3895;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3910;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Z")
    public static boolean field3900 = false;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field3902 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lec;")
    private class40 field3905;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "[B")
    private byte[] field3912;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BIII)V")
    public final void method1715(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3917++;
        if (this.field3901) {
            return;
        }
        if (arg1 <= 103) {
            method1719(30, -113, 29, 11, 114, -69, -28, -3, -71, 123, 82, 94, 118);
        }
        if (this.field3896) {
            this.field3896 = false;
            throw new IOException();
        }
        if (this.field3912 == null) {
            this.field3912 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field3912[this.field3908] = arg0[arg2 + var6];
                this.field3908 = (this.field3908 + 1) % 5000;
                if (((this.field3906 + 4900) % 5000) == this.field3908) {
                    throw new IOException();
                }
            }
            if (this.field3905 == null) {
                this.field3905 = this.field3907.method181(this, 3, (byte) 70);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1716(int arg0, int arg1, int arg2, int arg3) {
        if (class179.method1179(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class7.method66(var4 + 1, class166.field2451[arg0][arg1][arg2] + arg3, var5 + 1) && class7.method66(var4 + 128 - 1, class166.field2451[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class7.method66(var4 + 128 - 1, class166.field2451[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class7.method66(var4 + 1, class166.field2451[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method1717(int arg0) throws IOException {
        field3913++;
        if (this.field3901) {
            return;
        }
        if (arg0 != 128) {
            method1720(-25, 107, (class297) null, 31);
        }
        if (this.field3896) {
            this.field3896 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!pe", name = "run", descriptor = "()V")
    public final void run() {
        field3897++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3908 == this.field3906) {
                        if (this.field3901) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field3908 < this.field3906) {
                        var2 = 5000 - this.field3906;
                    } else {
                        var2 = this.field3908 - this.field3906;
                    }
                    var3 = this.field3906;
                }
                if (var2 > 0) {
                    try {
                        this.field3910.write(this.field3912, var3, var2);
                    } catch (IOException var9) {
                        this.field3896 = true;
                    }
                    this.field3906 = (this.field3906 + var2) % 5000;
                    try {
                        if (this.field3908 == this.field3906) {
                            this.field3910.flush();
                        }
                    } catch (IOException var8) {
                        this.field3896 = true;
                    }
                }
            }
            try {
                if (this.field3895 != null) {
                    this.field3895.close();
                }
                if (this.field3910 != null) {
                    this.field3910.close();
                }
                if (this.field3914 != null) {
                    this.field3914.close();
                }
            } catch (IOException var7) {
            }
            this.field3912 = null;
        } catch (Exception var12) {
            class121.method860((byte) 35, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public final void method1718(int arg0) {
        field3903++;
        if (this.field3901) {
            return;
        }
        synchronized (this) {
            this.field3901 = true;
            this.notifyAll();
        }
        if (this.field3905 != null) {
            while (this.field3905.field713 == 0) {
                client.method323(1L, -116);
            }
            if (this.field3905.field713 == 1) {
                try {
                    ((Thread) this.field3905.field709).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0 != -17492) {
            field3902 = 0;
        }
        this.field3905 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method1719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class55 var13 = new class55();
        var13.field935 = arg12;
        var13.field933 = arg2;
        var13.field936 = arg1;
        var13.field918 = arg9;
        var13.field931 = arg3;
        if (arg5 != 0) {
            return;
        }
        var13.field921 = arg10;
        var13.field927 = arg8;
        field3909++;
        var13.field928 = arg4;
        var13.field919 = arg6;
        var13.field937 = arg0;
        var13.field922 = arg11;
        var13.field930 = arg7;
        class127.field1865.method1881(var13, (byte) -56);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILjk;I)V")
    public static final void method1720(int arg0, int arg1, class297 arg2, int arg3) {
        if (arg2.field4576 == 1) {
            class224.field3484++;
            class246.method1685("", 0, 0L, arg2.field4636, arg2.field4683, (short) 44, -1, true);
        }
        field3915++;
        if (arg2.field4576 == 2 && !class76.field1205) {
            String var4 = class295.method1945(arg2, true);
            if (var4 != null) {
                class246.method1685("<col=00ff00>" + arg2.field4565, -1, 0L, var4, arg2.field4683, (short) 11, -1, true);
                class212.field3245++;
            }
        }
        if (arg2.field4576 == 3) {
            class90.field1376++;
            class246.method1685("", 0, 0L, class182.field2644, arg2.field4683, (short) 29, -1, true);
        }
        if (arg2.field4576 == 4) {
            class246.method1685("", 0, 0L, arg2.field4636, arg2.field4683, (short) 1, -1, true);
            class292.field4430++;
        }
        if (arg2.field4576 == 5) {
            class127.field1868++;
            class246.method1685("", 0, 0L, arg2.field4636, arg2.field4683, (short) 30, -1, true);
        }
        if (arg2.field4576 == 6 && class7.field90 == null) {
            class189.field2853++;
            class246.method1685("", -1, 0L, arg2.field4636, arg2.field4683, (short) 15, -1, true);
        }
        if (arg1 != -1) {
            return;
        }
        if (arg2.field4553 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field4530; var6++) {
                for (int var7 = 0; var7 < arg2.field4686; var7++) {
                    int var8 = (arg2.field4554 + 32) * var7;
                    int var9 = (arg2.field4620 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field4556[var5];
                        var9 += arg2.field4617[var5];
                    }
                    if (arg3 >= var8 && var9 <= arg0 && var8 + 32 > arg3 && (var9 + 32) > arg0) {
                        class17.field314 = var5;
                        class154.field2252 = arg2;
                        if (arg2.field4529[var5] > 0) {
                            class296 var10 = client.method333(arg2);
                            class15 var11 = class140.method951((byte) -94, arg2.field4529[var5] - 1);
                            if (class277.field4275 == 1 && var10.method1958(-8)) {
                                if (class139.field2018 != arg2.field4683 || class261.field4025 != var5) {
                                    class5.field65++;
                                    class246.method1685(class106.field1570 + " -> <col=ff9040>" + var11.field265, var5, (long) var11.field246, class123.field1819, arg2.field4683, (short) 20, -1, true);
                                }
                            } else if (class76.field1205 && var10.method1958(-8)) {
                                class260 var12 = class207.field3108 == -1 ? null : class77.method612(class207.field3108, 11);
                                if ((class146.field2123 & 0x10) != 0 && (var12 == null || var11.method104(true, var12.field3997, class207.field3108) != var12.field3997)) {
                                    class246.method1685(class174.field2545 + " -> <col=ff9040>" + var11.field265, var5, (long) var11.field246, class182.field2647, arg2.field4683, (short) 57, class270.field4218, true);
                                    class100.field1461++;
                                }
                            } else {
                                class59.field970++;
                                String[] var13 = var11.field248;
                                if (class227.field3540) {
                                    var13 = class177.method1172(arg1 - 5, var13);
                                }
                                if (var10.method1958(-8)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class39.field689++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 10;
                                            } else {
                                                var15 = 26;
                                            }
                                            class246.method1685("<col=ff9040>" + var11.field265, var5, (long) var11.field246, var13[var14], arg2.field4683, var15, -1, true);
                                        }
                                    }
                                }
                                if (var10.method1967(arg1 - 19278)) {
                                    class97.field1421++;
                                    class246.method1685("<col=ff9040>" + var11.field265, var5, (long) var11.field246, class123.field1819, arg2.field4683, (short) 21, class166.field2454, true);
                                }
                                if (var10.method1958(-8) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class178.field2608++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 59;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 2;
                                            }
                                            class246.method1685("<col=ff9040>" + var11.field265, var5, (long) var11.field246, var13[var16], arg2.field4683, var17, -1, true);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field4596;
                                if (class227.field3540) {
                                    var18 = class177.method1172(-6, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class104.field1530++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 13;
                                            }
                                            if (var19 == 1) {
                                                var20 = 6;
                                            }
                                            if (var19 == 2) {
                                                var20 = 35;
                                            }
                                            if (var19 == 3) {
                                                var20 = 36;
                                            }
                                            if (var19 == 4) {
                                                var20 = 50;
                                            }
                                            class246.method1685("<col=ff9040>" + var11.field265, var5, (long) var11.field246, var18[var19], arg2.field4683, var20, -1, true);
                                        }
                                    }
                                }
                                class246.method1685("<col=ff9040>" + var11.field265, var5, (long) var11.field246, class128.field1892, arg2.field4683, (short) 1006, class152.field2223, true);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field4647) {
            return;
        }
        if (!class76.field1205) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var25 = class186.method1212(var21, arg2, (byte) 49);
                if (var25 != null) {
                    class246.method1685(arg2.field4628, arg2.field4528, (long) (var21 + 1), var25, arg2.field4683, (short) 1003, class59.method482((byte) 94, var21, arg2), true);
                    class292.field4435++;
                }
            }
            String var22 = class295.method1945(arg2, true);
            if (var22 != null) {
                class212.field3245++;
                class246.method1685(arg2.field4628, arg2.field4528, 0L, var22, arg2.field4683, (short) 11, -1, true);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = class186.method1212(var23, arg2, (byte) 103);
                if (var24 != null) {
                    class246.method1685(arg2.field4628, arg2.field4528, (long) (var23 + 1), var24, arg2.field4683, (short) 8, class59.method482((byte) 38, var23, arg2), true);
                    class292.field4435++;
                }
            }
            if (client.method333(arg2).method1965((byte) -55)) {
                class189.field2853++;
                if (arg2.field4548 != null) {
                    class246.method1685("", arg2.field4528, 0L, arg2.field4548, arg2.field4683, (short) 15, -1, true);
                    return;
                }
                class246.method1685("", arg2.field4528, 0L, class66.field1089, arg2.field4683, (short) 15, -1, true);
                return;
            }
            return;
        }
        if (client.method333(arg2).method1964(-4) && (class146.field2123 & 0x20) != 0) {
            class246.method1685(class174.field2545 + " -> " + arg2.field4628, arg2.field4528, 0L, class182.field2647, arg2.field4683, (short) 42, class270.field4218, true);
            class17.field313++;
            return;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)I")
    public static final int method1721(int arg0, int arg1, byte arg2) {
        if (arg2 < 77) {
            field3900 = false;
        }
        field3916++;
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public final void method1722(int arg0) {
        field3898++;
        if (arg0 >= 79 && !this.field3901) {
            this.field3895 = new class22();
            this.field3910 = new class127();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BIB)V")
    public final void method1723(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field3911++;
        if (this.field3901 || arg3 >= -102) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field3895.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lpk;ILpk;BZ)Lob;")
    public static final class152 method1724(class237 arg0, int arg1, class237 arg2, byte arg3, boolean arg4) {
        if (arg3 <= 3) {
            method1724((class237) null, 54, (class237) null, (byte) -117, true);
        }
        field3894++;
        boolean var5 = true;
        int[] var6 = arg0.method1632(arg1, (byte) -127);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method1601(arg1, 126, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg2.method1601(0, 124, var9);
                } else {
                    var10 = arg2.method1601(var9, 127, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class152(arg0, arg2, arg1, arg4);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ljava/net/Socket;Lgf;)V")
    public class253(Socket arg0, class26 arg1) throws IOException {
        this.field3914 = arg0;
        this.field3907 = arg1;
        this.field3914.setSoTimeout(30000);
        this.field3914.setTcpNoDelay(true);
        this.field3895 = this.field3914.getInputStream();
        this.field3910 = this.field3914.getOutputStream();
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)I")
    public final int method1725(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field3895 = null;
        }
        field3918++;
        return this.field3901 ? 0 : this.field3895.available();
    }

    @OriginalMember(owner = "client!pe", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1718(-17492);
        field3904++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I")
    public final int method1726(byte arg0) throws IOException {
        if (arg0 < 125) {
            method1719(-74, 122, 120, 8, -102, -48, 99, 39, 71, 70, -60, 116, -114);
        }
        field3899++;
        return this.field3901 ? 0 : this.field3895.read();
    }
}
