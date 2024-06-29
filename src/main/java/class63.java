import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class63 implements Runnable {

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    private int field1018 = 0;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Z")
    private boolean field1020 = false;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    private int field1016 = 0;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Z")
    private boolean field1025 = false;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field1012;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Ltl;")
    private class69 field999;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Ljava/io/InputStream;")
    private InputStream field1015;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1011;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lad;")
    public static class275 field1010 = new class275(64);

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1023 = Calendar.getInstance();

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public static int field1027 = 0;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field1026 = -1;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lkc;")
    private class301 field1004;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[B")
    private byte[] field1001;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)V")
    public static final void method409(int arg0, byte arg1, int arg2) {
        field1013++;
        class223 var3 = class296.field4827[class214.field3389][arg2][arg0];
        if (var3 == null) {
            class53.method332(class214.field3389, arg2, arg0);
            return;
        }
        int var4 = -99999999;
        class121 var5 = null;
        for (class121 var6 = (class121) var3.method1553(true); var6 != null; var6 = (class121) var3.method1551(0)) {
            class158 var13 = class107.method754(-20563, var6.field1913.field2628);
            int var14 = var13.field2526;
            if (var13.field2539 == 1) {
                var14 = (var6.field1913.field2623 + 1) * var14;
            }
            if (var14 > var4) {
                var5 = var6;
                var4 = var14;
            }
        }
        if (var5 == null) {
            class53.method332(class214.field3389, arg2, arg0);
            return;
        }
        var3.method1548(var5, 0);
        if (arg1 > -16) {
            field1026 = 81;
        }
        class121 var7 = (class121) var3.method1553(true);
        class161 var8 = null;
        class161 var9 = null;
        while (var7 != null) {
            class161 var12 = var7.field1913;
            if (var5.field1913.field2628 != var12.field2628) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field2628 != var12.field2628 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class121) var3.method1551(0);
        }
        long var10 = (long) ((arg0 << 7) + arg2 + 1610612736);
        class21.method166(class214.field3389, arg2, arg0, class60.method387(-18796, arg0 * 128 + 64, arg2 * 128 + 64, class214.field3389), var5.field1913, var10, var8, var9);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BIB)V")
    public final void method410(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field1014++;
        if (this.field1025) {
            return;
        }
        if (this.field1020) {
            this.field1020 = false;
            throw new IOException();
        }
        if (this.field1001 == null) {
            this.field1001 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1001[this.field1016] = arg1[arg0 + var6];
                this.field1016 = (this.field1016 + 1) % 5000;
                if ((this.field1018 + 4900) % 5000 == this.field1016) {
                    throw new IOException();
                }
            }
            if (arg3 <= 67) {
                this.field1011 = null;
            }
            if (this.field1004 == null) {
                this.field1004 = this.field999.method487(-20349, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public final void method411(int arg0) {
        field1022++;
        if (this.field1025) {
            return;
        }
        this.field1015 = new class26();
        this.field1011 = new class29();
        if (arg0 != 22716) {
            this.method411(-34);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V")
    public static final void method412(byte arg0, int arg1) {
        class89.field1388.method1880(-97, arg1);
        class174.field2911.method1880(-85, arg1);
        int var2 = -44 % ((arg0 - 11) / 60);
        field1003++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BII)V")
    public final void method413(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 > -29) {
            method421((byte) -98, '\u0002');
        }
        field1021++;
        if (this.field1025) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1015.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method414(int arg0) {
        if (arg0 != 0) {
            field1010 = null;
        }
        field1010 = null;
        field1023 = null;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)I")
    public final int method415(int arg0) throws IOException {
        if (arg0 < 32) {
            this.field1020 = true;
        }
        field1008++;
        return this.field1025 ? 0 : this.field1015.read();
    }

    @OriginalMember(owner = "client!oc", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1018 == this.field1016) {
                            if (this.field1025) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field1018;
                        if (this.field1018 <= this.field1016) {
                            var3 = this.field1016 - this.field1018;
                        } else {
                            var3 = 5000 - this.field1018;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field1011.write(this.field1001, var2, var3);
                    } catch (IOException var9) {
                        this.field1020 = true;
                    }
                    this.field1018 = (this.field1018 + var3) % 5000;
                    try {
                        if (this.field1018 == this.field1016) {
                            this.field1011.flush();
                        }
                    } catch (IOException var8) {
                        this.field1020 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1015 != null) {
                        this.field1015.close();
                    }
                    if (this.field1011 != null) {
                        this.field1011.close();
                    }
                    if (this.field1012 != null) {
                        this.field1012.close();
                    }
                } catch (IOException var7) {
                }
                this.field1001 = null;
                break;
            }
        } catch (Exception var12) {
            class284.method1930(97, (String) null, var12);
        }
        field1000++;
    }

    @OriginalMember(owner = "client!oc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1019++;
        this.method416(64);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
    public final void method416(int arg0) {
        field1009++;
        if (this.field1025) {
            return;
        }
        synchronized (this) {
            if (arg0 != 64) {
                return;
            }
            this.field1025 = true;
            this.notifyAll();
        }
        if (this.field1004 != null) {
            while (this.field1004.field4929 == 0) {
                class33.method250(1L, arg0 + 192);
            }
            if (this.field1004.field4929 == 1) {
                try {
                    ((Thread) this.field1004.field4930).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1004 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lgi;B)I")
    public static final int method417(class164 arg0, byte arg1) {
        field1005++;
        int var2 = 0;
        if (arg0.method1168(0, class49.field721)) {
            var2++;
        }
        if (arg1 != -41) {
            field1010 = null;
        }
        if (arg0.method1168(0, class34.field560)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)V")
    public static final void method418(boolean arg0, int arg1) {
        if (arg1 != 5000) {
            return;
        }
        field1006++;
        byte var2 = 4;
        byte[][] var3 = class158.field2563;
        int[] var4 = null;
        for (int var5 = 0; var5 < var2; var5++) {
            class243.method1653(false);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class290.field4757[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x38B4381) >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 14 & 0x3FF;
                            int var12 = (var9 & 0x3FFC) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            int var14 = (var9 & 0x6) >> 1;
                            for (int var15 = 0; var15 < class122.field1938.length; var15++) {
                                if (class122.field1938[var15] == var13 && var3[var15] != null) {
                                    var8 = true;
                                    int[] var16 = client.method1130(-124, var6 * 8, var12, var14, class310.field5021, var11, var7 * 8, arg0, var3[var15], var5, var10);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class230.method1593((byte) 99, var7 * 8, var6 * 8, 8, 8, var5);
                    }
                }
            }
        }
        if (var4 == null) {
            class145.field2326 = -1;
            return;
        }
        class58.field840 = var4[4];
        class122.field1927 = var4[3];
        field1028 = var4[2];
        class68.field1088 = var4[1];
        class145.field2326 = var4[0];
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)I")
    public final int method419(byte arg0) throws IOException {
        field1002++;
        if (arg0 >= -87) {
            this.field1018 = -113;
        }
        return this.field1025 ? 0 : this.field1015.available();
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
    public final void method420(int arg0) throws IOException {
        field1024++;
        if (arg0 != 0) {
            this.method411(-122);
        }
        if (!this.field1025 && this.field1020) {
            this.field1020 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BC)C")
    public static final char method421(byte arg0, char arg1) {
        field1007++;
        if (arg0 != 65) {
            method417((class164) null, (byte) -39);
        }
        return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/net/Socket;Ltl;)V")
    public class63(Socket arg0, class69 arg1) throws IOException {
        this.field1012 = arg0;
        this.field999 = arg1;
        this.field1012.setSoTimeout(30000);
        this.field1012.setTcpNoDelay(true);
        this.field1015 = this.field1012.getInputStream();
        this.field1011 = this.field1012.getOutputStream();
    }
}
