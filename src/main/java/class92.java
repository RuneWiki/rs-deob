import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class92 implements Runnable {

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    private int field1366 = 0;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Z")
    private boolean field1367 = false;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    private int field1385 = 0;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Z")
    private boolean field1386 = false;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lbh;")
    private class7 field1360;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field1375;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field1368;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1382;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1362 = "purple:";

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[Lbe;")
    public static class29[] field1374 = new class29[2048];

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field1372 = -1;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Lh;")
    private class278 field1376;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[B")
    private byte[] field1358;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "[I")
    public static int[] field1387;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "[Lmj;")
    public static class115[] field1384;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public static final void method717(int arg0, int arg1) {
        field1361++;
        class201 var2 = class94.method738(-121, arg0, 10);
        var2.method1475(-743577184);
        if (arg1 >= -92) {
            field1362 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public final void method718(boolean arg0) {
        if (!arg0) {
            this.field1360 = null;
        }
        field1379++;
        if (!this.field1367) {
            this.field1368 = new class285();
            this.field1382 = new class215();
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)I")
    public final int method719(boolean arg0) throws IOException {
        if (!arg0) {
            this.field1382 = null;
        }
        field1365++;
        return this.field1367 ? 0 : this.field1368.read();
    }

    @OriginalMember(owner = "client!bb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1385 == this.field1366) {
                            if (this.field1367) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1385 > this.field1366) {
                            var2 = 5000 - this.field1385;
                        } else {
                            var2 = this.field1366 - this.field1385;
                        }
                        var3 = this.field1385;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1382.write(this.field1358, var3, var2);
                    } catch (IOException var9) {
                        this.field1386 = true;
                    }
                    this.field1385 = (this.field1385 + var2) % 5000;
                    try {
                        if (this.field1385 == this.field1366) {
                            this.field1382.flush();
                        }
                    } catch (IOException var8) {
                        this.field1386 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1368 != null) {
                        this.field1368.close();
                    }
                    if (this.field1382 != null) {
                        this.field1382.close();
                    }
                    if (this.field1375 != null) {
                        this.field1375.close();
                    }
                } catch (IOException var7) {
                }
                this.field1358 = null;
                break;
            }
        } catch (Exception var12) {
            class191.method1422(var12, (String) null, (byte) -115);
        }
        field1371++;
    }

    @OriginalMember(owner = "client!bb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method728((byte) -67);
        field1363++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILq;IIII)V")
    public static final void method720(int arg0, int arg1, class128 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 13013) {
            field1362 = null;
        }
        field1373++;
        class42.method316(arg4, arg1, arg2.field1979, (byte) -91, arg6, arg3, arg2.field1910, arg5);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIILwg;IJIIII)Z")
    public static final boolean method721(int arg0, int arg1, int arg2, int arg3, class178 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class216.method1549(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final void method722(int arg0) throws IOException {
        field1383++;
        if (this.field1367) {
            return;
        }
        if (arg0 != -21831) {
            this.finalize();
        }
        if (this.field1386) {
            this.field1386 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final void method723(int arg0) {
        field1377++;
        if (arg0 != 0) {
            method721(-7, -78, 43, 6, (class178) null, -66, 105L, -125, -23, 29, -66);
        }
        if (class220.field3524 != null) {
            class212 var1 = class220.field3524;
            synchronized (class220.field3524) {
                class220.field3524 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIII)V")
    public final void method724(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1381++;
        if (this.field1367) {
            return;
        }
        if (arg1 != 0) {
            this.field1385 = 112;
        }
        while (arg3 > 0) {
            int var5 = this.field1368.read(arg0, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
    public static final void method725(boolean arg0, int arg1) {
        field1378++;
        if (!class184.method1364(arg1, (byte) 65)) {
            return;
        }
        class131[] var2 = class113.field1631[arg1];
        int var3 = 0;
        if (arg0) {
            method720(-124, 30, (class128) null, 71, 21, 56, 14);
        }
        while (var3 < var2.length) {
            class131 var4 = var2[var3];
            if (var4 != null) {
                var4.field2079 = 0;
                var4.field2097 = 1;
                var4.field1994 = 0;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III[B)V")
    public final void method726(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1359++;
        if (this.field1367) {
            return;
        }
        if (this.field1386) {
            this.field1386 = false;
            throw new IOException();
        }
        if (this.field1358 == null) {
            this.field1358 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1358[this.field1366] = arg3[arg0 + var6];
                this.field1366 = (this.field1366 + 1) % 5000;
                if (((this.field1385 + 4900) % 5000) == this.field1366) {
                    throw new IOException();
                }
            }
            if (arg2 != 29023) {
                method725(false, 32);
            }
            if (this.field1376 == null) {
                this.field1376 = this.field1360.method53(3, this, -73);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)I")
    public final int method727(int arg0) throws IOException {
        field1370++;
        if (arg0 != 1) {
            method729(-116);
        }
        return this.field1367 ? 0 : this.field1368.available();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public final void method728(byte arg0) {
        field1364++;
        int var2 = 54 / ((44 - arg0) / 50);
        if (this.field1367) {
            return;
        }
        synchronized (this) {
            this.field1367 = true;
            this.notifyAll();
        }
        if (this.field1376 != null) {
            while (this.field1376.field4450 == 0) {
                class43.method324(1L, 116);
            }
            if (this.field1376.field4450 == 1) {
                try {
                    ((Thread) this.field1376.field4449).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1376 = null;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public static void method729(int arg0) {
        field1374 = null;
        if (arg0 != 5000) {
            field1362 = null;
        }
        field1362 = null;
        field1387 = null;
        field1384 = null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ljava/net/Socket;Lbh;)V")
    public class92(Socket arg0, class7 arg1) throws IOException {
        this.field1360 = arg1;
        this.field1375 = arg0;
        this.field1375.setSoTimeout(30000);
        this.field1375.setTcpNoDelay(true);
        this.field1368 = this.field1375.getInputStream();
        this.field1382 = this.field1375.getOutputStream();
    }
}
