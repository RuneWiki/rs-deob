import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class387 implements Runnable {

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "I")
    private int field5164 = 0;

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
    private int field5160 = 0;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
    private int field5154;

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field5167;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "[B")
    private byte[] field5169;

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field5161;

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "I")
    public static int field5165 = -1;

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field5159;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
    public static final String method2213(int arg0, String[] arg1, int arg2, int arg3) {
        field5170++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (arg3 != 13061) {
                method2213(110, null, -10, 63);
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V")
    public final void method2214(byte arg0) {
        if (arg0 >= -100) {
            this.field5169 = null;
        }
        field5158++;
        this.field5167 = new class170();
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZII[B)I")
    public final int method2215(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5157++;
        if (arg2 < 0 || arg1 < 0 || (arg1 + arg2) > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field5164 > this.field5160) {
                var6 = this.field5154 - (this.field5164 - this.field5160);
            } else {
                var6 = this.field5160 - this.field5164;
            }
            if (arg0) {
                this.method2217(-40);
            }
            if (arg2 > var6) {
                arg2 = var6;
            }
            if (arg2 == 0 && this.field5159 != null) {
                throw new IOException(this.field5159.toString());
            }
            if (this.field5154 < (this.field5164 + arg2)) {
                int var7 = this.field5154 - this.field5164;
                class2.method9(this.field5169, this.field5164, arg3, arg1, var7);
                class2.method9(this.field5169, 0, arg3, arg1 + var7, -var7 + arg2);
            } else {
                class2.method9(this.field5169, this.field5164, arg3, arg1, arg2);
            }
            this.field5164 = (this.field5164 + arg2) % this.field5154;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BI)Z")
    public final boolean method2216(byte arg0, int arg1) throws IOException {
        field5155++;
        if (arg1 <= 0 || this.field5154 <= arg1) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field5164 > this.field5160) {
                var4 = this.field5160 + this.field5154 - this.field5164;
            } else {
                var4 = this.field5160 - this.field5164;
            }
            if (arg0 < 10) {
                this.field5167 = null;
            }
            if (arg1 <= var4) {
                return true;
            } else if (this.field5159 == null) {
                return false;
            } else {
                throw new IOException(this.field5159.toString());
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V")
    public final void method2217(int arg0) {
        field5168++;
        synchronized (this) {
            if (this.field5159 == null) {
                this.field5159 = new IOException("");
            }
            this.notifyAll();
        }
        int var3 = 1 / ((-arg0 - 18) / 49);
        try {
            this.field5161.join();
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)V")
    public static final void method2218(int arg0) {
        class37.field501.method1289(5, (byte) 104);
        field5163++;
        class35.field492.method588((byte) 57, 5);
        class516.field7170.method3901(3, 5);
        class118.field1510.method3918(5, arg0 - 616);
        class440.field5847.method500((byte) 104, 5);
        class87.field1058.method1399(5, 1);
        class423.field5620.method1706(-1, 5);
        class24.field291.method2945(5, (byte) 121);
        class632.field8745.method2758(5, -79);
        class624.field8643.method2521(2, 5);
        class159.field2282.method3593((byte) 115, 5);
        class506.field6989.method2157(5, 88);
        if (arg0 != 646) {
            method2213(97, null, 77, -23);
        }
        class291.field3852.method1019(-48, 5);
        class15.field198.method3460(360000, 5);
        class258.field3383.method2770(5, 104);
        class579.field7919.method2380((byte) 94, 5);
        class400.field5313.method1453(5, true);
        class400.field5311.method13(5, -23313);
        class130.field1802.method2430(5, 122);
        class554.field7565.method574(5, false);
        class114.method673(-123, 5);
        class309.method1821((byte) 102, 50);
        class440.method2487(50, (byte) 120);
        class131.method764((byte) -76, 5);
        class107.method585(false, 5);
        class230.field2981.method2179(false, 5);
        class436.field5815.method2179(false, 5);
        class643.field8895.method2179(false, 5);
        class704.field9925.method2179(false, 5);
        class656.field9352.method2179(false, 5);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILjava/io/File;Z[B)V")
    public static final void method2219(int arg0, File arg1, boolean arg2, byte[] arg3) throws IOException {
        field5162++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        try {
            var4.readFully(arg3, 0, arg0);
            if (!arg2) {
                field5165 = -99;
            }
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!dfa", name = "run", descriptor = "()V")
    public final void run() {
        field5156++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5159 != null) {
                        return;
                    }
                    if (this.field5164 == 0) {
                        var2 = this.field5154 - this.field5160 - 1;
                    } else if (this.field5160 <= this.field5164) {
                        var2 = this.field5164 - this.field5160 - 1;
                    } else {
                        var2 = this.field5154 - this.field5160;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            int var3;
            try {
                var3 = this.field5167.read(this.field5169, this.field5160, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field5159 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field5160 = (this.field5160 + var3) % this.field5154;
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class387(InputStream arg0, int arg1) {
        this.field5154 = arg1 + 1;
        this.field5167 = arg0;
        this.field5169 = new byte[this.field5154];
        this.field5161 = new Thread(this);
        this.field5161.setDaemon(true);
        this.field5161.start();
    }
}
