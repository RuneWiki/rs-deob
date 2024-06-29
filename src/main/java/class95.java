import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class95 implements Runnable {

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Z")
    private boolean field1304 = false;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    private int field1306 = 0;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    private int field1316 = 0;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "Z")
    private boolean field1308 = false;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "Lkj;")
    private class397 field1319;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field1325;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field1315;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1322;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "[I")
    public static int[] field1321 = new int[2048];

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field1311 = 765;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "Lgu;")
    private class409 field1327;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "Lpv;")
    public static class50 field1309;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "[B")
    private byte[] field1305;

    @OriginalMember(owner = "client!mr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1324++;
        this.method644(-92);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public final void method641(int arg0) throws IOException {
        field1326++;
        if (this.field1304) {
            return;
        }
        int var2 = 123 / ((arg0 - 37) / 58);
        if (this.field1308) {
            this.field1308 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
    public final void method642(int arg0) {
        if (arg0 != 5000) {
            return;
        }
        field1310++;
        if (!this.field1304) {
            this.field1315 = new class296();
            this.field1322 = new class220();
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([BIII)V")
    public final void method643(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 != -1) {
            this.finalize();
        }
        field1318++;
        if (this.field1304) {
            return;
        }
        if (this.field1308) {
            this.field1308 = false;
            throw new IOException();
        }
        if (this.field1305 == null) {
            this.field1305 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1305[this.field1306] = arg0[arg3 + var6];
                this.field1306 = (this.field1306 + 1) % 5000;
                if (((this.field1316 + 4900) % 5000) == this.field1306) {
                    throw new IOException();
                }
            }
            if (this.field1327 == null) {
                this.field1327 = this.field1319.method2296(3, this, (byte) 32);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
    public final void method644(int arg0) {
        if (arg0 >= -77) {
            return;
        }
        field1323++;
        if (this.field1304) {
            return;
        }
        synchronized (this) {
            this.field1304 = true;
            this.notifyAll();
        }
        if (this.field1327 != null) {
            while (this.field1327.field5652 == 0) {
                class496.method2931((byte) 127, 1L);
            }
            if (this.field1327.field5652 == 1) {
                try {
                    ((Thread) this.field1327.field5654).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1327 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I")
    public final int method645(byte arg0) throws IOException {
        field1320++;
        if (arg0 >= -66) {
            return -26;
        } else if (this.field1304) {
            return 0;
        } else {
            return this.field1315.available();
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B[[BLmi;)V")
    public static final void method646(byte arg0, byte[][] arg1, class341 arg2) {
        field1313++;
        if (arg0 != -79) {
            method648((byte) 9);
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class365 var11 = new class365(var10);
                int var12 = class101.field1378[var5] >> 8;
                int var13 = class101.field1378[var5] & 0xFF;
                int var14 = var12 * 64 - class215.field3059;
                int var15 = var13 * 64 - class79.field1134;
                class503.method2959(false);
                arg2.method3046(var15, class215.field3059, false, var11, class6.field64, class79.field1134, var14);
                arg2.method1904(var3, var14, var15, class418.field6109, true, var11);
                if (!arg2.field7626 && class446.field6464 / 8 == var12 && class297.field4107 / 8 == var13 && var3[0] != -1) {
                    class325.field4462 = class56.field771.method1628(class504.field7416, var3[1], var3[2], var3[3], var3[0], arg0 ^ 0xFFFFFFB1);
                    class21.field267 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class101.field1378[var6] >> 8) * 64 - class215.field3059;
            int var8 = (class101.field1378[var6] & 0xFF) * 64 - class79.field1134;
            byte[] var9 = arg1[var6];
            if (var9 == null && class297.field4107 < 800) {
                class503.method2959(false);
                arg2.method3049(64, var8, 64, var7, -24914);
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIZ)V")
    public static final void method647(int arg0, int arg1, boolean arg2) {
        field1314++;
        class113 var3 = class223.method1313(arg2, Integer.MIN_VALUE, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field1528.length; var4++) {
            var3.field1528[var4] = -1;
            var3.field1529[var4] = 0;
        }
        if (arg1 <= 70) {
            field1309 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
    public static void method648(byte arg0) {
        field1309 = null;
        field1321 = null;
        if (arg0 != 105) {
            field1311 = 78;
        }
    }

    @OriginalMember(owner = "client!mr", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1316 == this.field1306) {
                            if (this.field1304) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1306 >= this.field1316) {
                            var2 = this.field1306 - this.field1316;
                        } else {
                            var2 = 5000 - this.field1316;
                        }
                        var3 = this.field1316;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1322.write(this.field1305, var3, var2);
                    } catch (IOException var9) {
                        this.field1308 = true;
                    }
                    this.field1316 = (this.field1316 + var2) % 5000;
                    try {
                        if (this.field1316 == this.field1306) {
                            this.field1322.flush();
                        }
                    } catch (IOException var8) {
                        this.field1308 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1315 != null) {
                        this.field1315.close();
                    }
                    if (this.field1322 != null) {
                        this.field1322.close();
                    }
                    if (this.field1325 != null) {
                        this.field1325.close();
                    }
                } catch (IOException var7) {
                }
                this.field1305 = null;
                break;
            }
        } catch (Exception var12) {
            class162.method1000((byte) -109, var12, null);
        }
        field1312++;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZI[B)V")
    public final void method649(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field1307++;
        if (this.field1304) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1315.read(arg3, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg2 += var5;
        }
        if (arg1) {
            field1321 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)I")
    public final int method650(byte arg0) throws IOException {
        if (arg0 > -3) {
            return -118;
        } else {
            field1317++;
            return this.field1304 ? 0 : this.field1315.read();
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Ljava/net/Socket;Lkj;)V")
    public class95(Socket arg0, class397 arg1) throws IOException {
        this.field1319 = arg1;
        this.field1325 = arg0;
        this.field1325.setSoTimeout(30000);
        this.field1325.setTcpNoDelay(true);
        this.field1315 = this.field1325.getInputStream();
        this.field1322 = this.field1325.getOutputStream();
    }
}
