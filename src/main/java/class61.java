import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 implements Runnable {

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    private int field1303 = 0;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Z")
    private boolean field1310 = false;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    private int field1312 = 0;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Z")
    private boolean field1307 = false;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field1305;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lha;")
    private class50 field1308;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field1300;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1318;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lvc;")
    public static class137 field1297 = class45.method325(" )2> @cya@", -46);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lvc;")
    public static class137 field1298 = class45.method325("Zu viele Anmelde)2Versuche von Ihrer Adresse", -46);

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "Lvc;")
    public static class137 field1314 = class45.method325("::fpsoff", -46);

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1321 = 0;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field1323 = 0;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Lrb;")
    public static class112 field1315 = new class112(512);

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lvc;")
    public static class137 field1327 = class45.method325("::errortest", -46);

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "Lvc;")
    public static class137 field1325 = class45.method325("@or3@", -46);

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "Lvc;")
    private static class137 field1326 = class45.method325("Enter message to send to ", -46);

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "[[[I")
    public static int[][][] field1329 = new int[4][105][105];

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Lvc;")
    public static class137 field1328 = field1326;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lvb;")
    private class136 field1299;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "[B")
    private byte[] field1322;

    @OriginalMember(owner = "client!ie", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1312 == this.field1303) {
                            if (this.field1307) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1303 <= this.field1312) {
                            var2 = this.field1312 - this.field1303;
                        } else {
                            var2 = 5000 - this.field1303;
                        }
                        var3 = this.field1303;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1318.write(this.field1322, var3, var2);
                    } catch (IOException var9) {
                        this.field1310 = true;
                    }
                    this.field1303 = (this.field1303 + var2) % 5000;
                    try {
                        if (this.field1312 == this.field1303) {
                            this.field1318.flush();
                        }
                    } catch (IOException var8) {
                        this.field1310 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1300 != null) {
                        this.field1300.close();
                    }
                    if (this.field1318 != null) {
                        this.field1318.close();
                    }
                    if (this.field1305 != null) {
                        this.field1305.close();
                    }
                } catch (IOException var7) {
                }
                this.field1322 = null;
                break;
            }
        } catch (Exception var12) {
            class110.method850((byte) -35, null, var12);
        }
        field1301++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
    public final int method433(int arg0) throws IOException {
        field1316++;
        if (arg0 != -10648) {
            method439(46, null);
        }
        return this.field1307 ? 0 : this.field1300.read();
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public final void method434(int arg0) {
        field1313++;
        if (this.field1307) {
            return;
        }
        synchronized (this) {
            this.field1307 = true;
            this.notifyAll();
        }
        if (this.field1299 != null) {
            while (this.field1299.field3131 == 0) {
                class28.method219(true, 1L);
            }
            if (this.field1299.field3131 == 1) {
                try {
                    ((Thread) this.field1299.field3129).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1299 = null;
        if (arg0 < 55) {
            this.field1307 = false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Lvc;")
    public static final class137 method435(int arg0, int arg1) {
        field1319++;
        if (arg1 <= 67) {
            field1297 = null;
        }
        return class123.method925(-29965, arg0, false, 10);
    }

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method434(57);
        field1306++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method436(byte arg0) {
        field1325 = null;
        field1326 = null;
        field1328 = null;
        if (arg0 != 49) {
            return;
        }
        field1315 = null;
        field1329 = null;
        field1327 = null;
        field1298 = null;
        field1314 = null;
        field1297 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIILnb;)[Lvd;")
    public static final class138[] method437(byte arg0, int arg1, int arg2, class88 arg3) {
        field1320++;
        if (class8.method55(arg3, arg2, -76, arg1)) {
            return arg0 >= -75 ? null : class106.method774(127);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)I")
    public final int method438(int arg0) throws IOException {
        field1304++;
        int var2 = 97 / ((28 - arg0) / 48);
        return this.field1307 ? 0 : this.field1300.available();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILla;)V")
    public static final void method439(int arg0, class75 arg1) {
        field1309++;
        if (arg1.field1634 == 0) {
            return;
        }
        if (arg1.field1625 != -1 && arg1.field1625 < 32768) {
            class56 var2 = class125.field2914[arg1.field1625];
            if (var2 != null) {
                int var3 = arg1.field1672 - var2.field1672;
                int var4 = arg1.field1646 - var2.field1646;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1632 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1625 >= 32768) {
            int var5 = arg1.field1625 - 32768;
            if (class8.field181 == var5) {
                var5 = 2047;
            }
            class125 var6 = class102.field2358[var5];
            if (var6 != null) {
                int var7 = arg1.field1672 - var6.field1672;
                int var8 = arg1.field1646 - var6.field1646;
                if (var7 != 0 || var8 != 0) {
                    arg1.field1632 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0 != 2048) {
            method442(-27);
        }
        if ((arg1.field1678 != 0 || arg1.field1663 != 0) && (arg1.field1631 == 0 || arg1.field1650 > 0)) {
            int var9 = arg1.field1672 - (arg1.field1678 - class58.field1227 - class58.field1227) * 64;
            int var10 = arg1.field1646 - (arg1.field1663 - class91.field2163 - class91.field2163) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field1632 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1663 = 0;
            arg1.field1678 = 0;
        }
        int var11 = arg1.field1632 - arg1.field1652 & 0x7FF;
        if (var11 == 0) {
            arg1.field1659 = 0;
            return;
        }
        arg1.field1659++;
        if (var11 <= 1024) {
            arg1.field1652 += arg1.field1634;
            boolean var12 = true;
            if (var11 < arg1.field1634 || var11 > 2048 - arg1.field1634) {
                var12 = false;
                arg1.field1652 = arg1.field1632;
            }
            if (arg1.field1688 == arg1.field1668 && (arg1.field1659 > 25 || var12)) {
                if (arg1.field1639 == -1) {
                    arg1.field1668 = arg1.field1649;
                } else {
                    arg1.field1668 = arg1.field1639;
                }
            }
        } else {
            arg1.field1652 -= arg1.field1634;
            boolean var13 = true;
            if (arg1.field1634 > var11 || var11 > 2048 - arg1.field1634) {
                arg1.field1652 = arg1.field1632;
                var13 = false;
            }
            if (arg1.field1688 == arg1.field1668 && (arg1.field1659 > 25 || var13)) {
                if (arg1.field1676 == -1) {
                    arg1.field1668 = arg1.field1649;
                } else {
                    arg1.field1668 = arg1.field1676;
                }
            }
        }
        arg1.field1652 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZ[B)V")
    public final void method440(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        field1302++;
        if (this.field1307) {
            return;
        }
        if (this.field1310) {
            this.field1310 = false;
            throw new IOException();
        }
        if (this.field1322 == null) {
            this.field1322 = new byte[5000];
        }
        if (arg2) {
            return;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1322[this.field1312] = arg3[arg0 + var6];
                this.field1312 = (this.field1312 + 1) % 5000;
                if ((this.field1303 + 4900) % 5000 == this.field1312) {
                    throw new IOException();
                }
            }
            if (this.field1299 == null) {
                this.field1299 = this.field1308.method358(this, 3, 0);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[BI)V")
    public final void method441(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1324++;
        if (this.field1307) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field1300.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
        if (arg0 != 5000) {
            method442(3);
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public static final void method442(int arg0) {
        field1317++;
        for (int var1 = 0; var1 < class107.field2498; var1++) {
            int var2 = class72.field1526[var1];
            class56 var3 = class125.field2914[var2];
            if (var3 != null) {
                class36.method255(var3.field1203.field3243, -125, var3);
            }
        }
        if (arg0 <= 93) {
            method435(59, -4);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/net/Socket;Lha;)V")
    public class61(Socket arg0, class50 arg1) throws IOException {
        this.field1305 = arg0;
        this.field1308 = arg1;
        this.field1305.setSoTimeout(30000);
        this.field1305.setTcpNoDelay(true);
        this.field1300 = this.field1305.getInputStream();
        this.field1318 = this.field1305.getOutputStream();
    }
}
