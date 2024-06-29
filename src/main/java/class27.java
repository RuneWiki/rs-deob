import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class27 implements Runnable {

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Z")
    private boolean field377 = false;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    private int field387 = 0;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    private int field381 = 0;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "Z")
    private boolean field391 = false;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Lor;")
    private class173 field390;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Ljava/net/Socket;")
    private Socket field397;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field372;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field392;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lka;")
    public static class473 field373 = new class473(64);

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Lrb;")
    public static class283 field399 = new class283(30, 4);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Lgp;")
    private class464 field395;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "[B")
    private byte[] field375;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[[[B")
    public static byte[][][] field379;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method172(int arg0) {
        field393++;
        if (this.field377 || arg0 != 12292) {
            return;
        }
        synchronized (this) {
            this.field377 = true;
            this.notifyAll();
        }
        if (this.field395 != null) {
            while (this.field395.field6699 == 0) {
                class334.method2047(1L, 0);
            }
            if (this.field395.field6699 == 1) {
                try {
                    ((Thread) this.field395.field6695).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field395 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lsv;I)V")
    public static final void method173(class319 arg0, int arg1) {
        field385++;
        int var2 = arg0.method1877(119);
        class475.field6869 = new class279[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class475.field6869[var3] = new class279();
            class475.field6869[var3].field3792 = arg0.method1877(125);
            class475.field6869[var3].field3796 = arg0.method1878(0);
        }
        class189.field2778 = arg0.method1877(13);
        class395.field5692 = arg0.method1877(-53);
        class355.field5130 = arg0.method1877(-50);
        class336.field4900 = new class468[class395.field5692 + 1 - class189.field2778];
        if (arg1 >= -120) {
            return;
        }
        for (int var4 = 0; var4 < class355.field5130; var4++) {
            int var5 = arg0.method1877(126);
            class468 var6 = class336.field4900[var5] = new class468();
            var6.field2690 = arg0.method1869(-79);
            var6.field2687 = arg0.method1863(-1);
            var6.field6762 = class189.field2778 + var5;
            var6.field6767 = arg0.method1878(0);
            var6.field6766 = arg0.method1878(0);
        }
        class519.field7632 = arg0.method1863(-1);
        class434.field6283 = true;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public final void method174(int arg0) {
        field386++;
        if (arg0 == -1 && !this.field377) {
            this.field372 = new class257();
            this.field392 = new class345();
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)I")
    public final int method175(int arg0) throws IOException {
        field396++;
        if (arg0 != -25652) {
            method178((byte) 55);
        }
        return this.field377 ? 0 : this.field372.read();
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    public final void method176(int arg0) throws IOException {
        field384++;
        if (this.field377) {
            return;
        }
        if (this.field391) {
            this.field391 = false;
            throw new IOException();
        } else if (arg0 != 4) {
            this.field377 = true;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[BII)V")
    public final void method177(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 <= 100) {
            this.run();
        }
        field383++;
        if (this.field377) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field372.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!ml", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field387 == this.field381) {
                            if (this.field377) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field387;
                        if (this.field387 > this.field381) {
                            var3 = 5000 - this.field387;
                        } else {
                            var3 = this.field381 - this.field387;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field392.write(this.field375, var2, var3);
                    } catch (IOException var9) {
                        this.field391 = true;
                    }
                    this.field387 = (this.field387 + var3) % 5000;
                    try {
                        if (this.field387 == this.field381) {
                            this.field392.flush();
                        }
                    } catch (IOException var8) {
                        this.field391 = true;
                    }
                    continue;
                }
                try {
                    if (this.field372 != null) {
                        this.field372.close();
                    }
                    if (this.field392 != null) {
                        this.field392.close();
                    }
                    if (this.field397 != null) {
                        this.field397.close();
                    }
                } catch (IOException var7) {
                }
                this.field375 = null;
                break;
            }
        } catch (Exception var12) {
            class187.method1255(var12, null, -23);
        }
        field388++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method178(byte arg0) {
        field373 = null;
        if (arg0 == -44) {
            field399 = null;
            field379 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    public static final void method179(byte arg0) {
        field394++;
        for (int var1 = 0; var1 < 5; var1++) {
            class309.field4206[var1] = false;
        }
        if (arg0 >= -5) {
            return;
        }
        class358.field5167 = -1;
        class247.field3363 = 5;
        class44.field637 = class153.field2357;
        class164.field2504 = class118.field1848;
        class281.field3827 = class159.field2421;
        class137.field2067 = 0;
        class496.field7263 = class49.field706;
        class499.field7298 = class108.field1747;
        class142.field2115 = -1;
        class50.field714 = 0;
        class87.field1414 = class28.field417;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III[B)V")
    public final void method180(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field376++;
        if (this.field377) {
            return;
        }
        if (this.field391) {
            this.field391 = false;
            throw new IOException();
        }
        if (this.field375 == null) {
            this.field375 = new byte[5000];
        }
        if (arg2 != 18170) {
            return;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field375[this.field381] = arg3[arg0 + var6];
                this.field381 = (this.field381 + 1) % 5000;
                if ((this.field387 + 4900) % 5000 == this.field381) {
                    throw new IOException();
                }
            }
            if (this.field395 == null) {
                this.field395 = this.field390.method1182(this, (byte) -121, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)I")
    public final int method181(int arg0) throws IOException {
        if (arg0 == -1) {
            field374++;
            return this.field377 ? 0 : this.field372.available();
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
    public static final void method182(int arg0) {
        field380++;
        class473 var1 = class134.field2044;
        synchronized (class134.field2044) {
            class134.field2044.method2774((byte) 106);
        }
        class473 var2 = client.field7546;
        synchronized (client.field7546) {
            client.field7546.method2774((byte) 93);
            int var3 = 84 / ((arg0 - 71) / 53);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;I[BI)I")
    public static final int method183(String arg0, int arg1, byte[] arg2, int arg3) {
        field382++;
        int var4 = arg0.length();
        int var5 = arg3;
        if (arg1 != -367195540) {
            return -103;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 <= '\u007F') {
                arg2[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg2[var5++] = (byte) (class219.method1367(var7, 12292) >> 6);
                arg2[var5++] = (byte) class219.method1367(128, class375.method2245(63, var7));
            } else {
                arg2[var5++] = (byte) (class219.method1367(var7, 921597) >> 12);
                arg2[var5++] = (byte) class219.method1367(class375.method2245(var7 >> 6, 63), 128);
                arg2[var5++] = (byte) class219.method1367(128, class375.method2245(63, var7));
            }
        }
        return var5 - arg3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([Lat;II)V")
    public static final void method184(class444[] arg0, int arg1, int arg2) {
        if (arg2 < 57) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class444 var4 = arg0[var3];
            if (var4 != null && var4.field6515 == arg1 && !client.method3054(var4)) {
                if (var4.field6477 == 0) {
                    method184(arg0, var4.field6469, 82);
                    if (var4.field6491 != null) {
                        method184(var4.field6491, var4.field6469, 66);
                    }
                    class91 var5 = (class91) class425.field6168.method1592((byte) -25, (long) var4.field6469);
                    if (var5 != null) {
                        class137.method976(var5.field1460, (byte) -96);
                    }
                }
                if (var4.field6477 == 6 && var4.field6442 != -1) {
                    class55 var6 = class50.field716.method831(var4.field6442, (byte) 54);
                    if (var6 != null) {
                        var4.field6492 += class71.field1026;
                        while (var4.field6492 > var6.field788[var4.field6484]) {
                            var4.field6492 -= var6.field788[var4.field6484];
                            var4.field6484++;
                            if (var4.field6484 >= var6.field796.length) {
                                var4.field6484 -= var6.field807;
                                if (var4.field6484 < 0 || var4.field6484 >= var6.field796.length) {
                                    var4.field6484 = 0;
                                }
                            }
                            var4.field6479 = var4.field6484 + 1;
                            if (var4.field6479 >= var6.field796.length) {
                                var4.field6479 -= var6.field807;
                                if (var4.field6479 < 0 || var4.field6479 >= var6.field796.length) {
                                    var4.field6479 = -1;
                                }
                            }
                            class151.method1093(var4, 110);
                        }
                    }
                }
            }
        }
        field378++;
    }

    @OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field389++;
        this.method172(12292);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/net/Socket;Lor;)V")
    public class27(Socket arg0, class173 arg1) throws IOException {
        this.field390 = arg1;
        this.field397 = arg0;
        this.field397.setSoTimeout(30000);
        this.field397.setTcpNoDelay(true);
        this.field372 = this.field397.getInputStream();
        this.field392 = this.field397.getOutputStream();
    }
}
