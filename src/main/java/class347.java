import java.awt.Canvas;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class347 implements Runnable {

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "Z")
    private boolean field5133 = false;

    @OriginalMember(owner = "client!qfa", name = "v", descriptor = "I")
    private int field5143 = 0;

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "Z")
    private boolean field5132 = false;

    @OriginalMember(owner = "client!qfa", name = "w", descriptor = "I")
    private int field5144 = 0;

    @OriginalMember(owner = "client!qfa", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field5142;

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "Lew;")
    private class226 field5147;

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "Ljava/io/InputStream;")
    private InputStream field5146;

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5148;

    @OriginalMember(owner = "client!qfa", name = "t", descriptor = "I")
    private int field5141;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "Z")
    public static boolean field5135 = false;

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "[F")
    public static float[] field5126 = new float[16384];

    @OriginalMember(owner = "client!qfa", name = "s", descriptor = "[F")
    public static float[] field5140 = new float[16384];

    @OriginalMember(owner = "client!qfa", name = "B", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!qfa", name = "D", descriptor = "Lvg;")
    public static class622 field5151;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!qfa", name = "x", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "Lae;")
    private class254 field5131;

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "[B")
    private byte[] field5128;

    @OriginalMember(owner = "client!qfa", name = "C", descriptor = "[I")
    public static int[] field5150;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)I")
    public final int method2151(boolean arg0) throws IOException {
        field5137++;
        if (this.field5132) {
            return 0;
        } else {
            if (arg0) {
                method2152(-73, 115, 53, -38, -83);
            }
            return this.field5146.read();
        }
    }

    @OriginalMember(owner = "client!qfa", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field5144 == this.field5143) {
                            if (this.field5132) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field5143 <= this.field5144) {
                            var2 = this.field5144 - this.field5143;
                        } else {
                            var2 = this.field5141 - this.field5143;
                        }
                        var3 = this.field5143;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field5148.write(this.field5128, var3, var2);
                    } catch (IOException var9) {
                        this.field5133 = true;
                    }
                    this.field5143 = (this.field5143 + var2) % this.field5141;
                    try {
                        if (this.field5144 == this.field5143) {
                            this.field5148.flush();
                        }
                    } catch (IOException var8) {
                        this.field5133 = true;
                    }
                    continue;
                }
                try {
                    if (this.field5146 != null) {
                        this.field5146.close();
                    }
                    if (this.field5148 != null) {
                        this.field5148.close();
                    }
                    if (this.field5142 != null) {
                        this.field5142.close();
                    }
                } catch (IOException var7) {
                }
                this.field5128 = null;
                break;
            }
        } catch (Exception var12) {
            class118.method869(var12, (byte) -128, null);
        }
        field5129++;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIII)V")
    public static final void method2152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5136++;
        int var5 = arg3;
        int var6 = arg2;
        int var7 = -arg2;
        class41.method235(arg4 - arg2, class565.field8253[arg1], arg3, arg2 + arg4, arg0);
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class565.field8253[arg1 + var6];
                int[] var10 = class565.field8253[arg1 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class41.method235(var12, var9, 0, var11, arg0);
                class41.method235(var12, var10, arg3, var11, arg0);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class565.field8253[arg1 + var5];
            int[] var16 = class565.field8253[arg1 - var5];
            class41.method235(var14, var15, 0, var13, arg0);
            class41.method235(var14, var16, 0, var13, arg0);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
    public final void method2153(int arg0) {
        field5127++;
        if (arg0 == -1 && !this.field5132) {
            this.field5146 = new class42();
            this.field5148 = new class462();
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Z)V")
    public static void method2154(boolean arg0) {
        field5150 = null;
        field5126 = null;
        if (!arg0) {
            field5140 = null;
        }
        field5140 = null;
        field5151 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field5122++;
        this.method2156(-52);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "([BIII)V")
    public final void method2155(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5145++;
        if (this.field5132) {
            return;
        }
        if (this.field5133) {
            this.field5133 = false;
            throw new IOException();
        }
        if (this.field5128 == null) {
            this.field5128 = new byte[this.field5141];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field5128[this.field5144] = arg0[arg2 + var6];
                this.field5144 = (this.field5144 + 1) % this.field5141;
                if (((this.field5143 + this.field5141 - 100) % this.field5141) == this.field5144) {
                    throw new IOException();
                }
            }
            if (arg1 == -31137) {
                if (this.field5131 == null) {
                    this.field5131 = this.field5147.method1414(arg1 + 31153, this, 3);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
    public final void method2156(int arg0) {
        field5125++;
        if (this.field5132) {
            return;
        }
        synchronized (this) {
            int var3 = -65 % ((47 - arg0) / 43);
            this.field5132 = true;
            this.notifyAll();
        }
        if (this.field5131 != null) {
            while (this.field5131.field3311 == 0) {
                class687.method3846(1L, -85);
            }
            if (this.field5131.field3311 == 1) {
                try {
                    ((Thread) this.field5131.field3307).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field5131 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(Z)I")
    public final int method2157(boolean arg0) throws IOException {
        if (!arg0) {
            this.finalize();
        }
        field5138++;
        return this.field5132 ? 0 : this.field5146.available();
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lr;I)V")
    public static final void method2158(class98 arg0, int arg1) {
        if (class683.field9638) {
            class572.method3290(arg0, 3435);
        } else {
            class314.method1955(arg0, 81);
        }
        field5134++;
        int var2 = -2 % ((arg1 - 27) / 45);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
    public final void method2159(byte arg0) throws IOException {
        if (arg0 < 9) {
            return;
        }
        field5123++;
        if (!this.field5132 && this.field5133) {
            this.field5133 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BC)C")
    public static final char method2160(byte arg0, char arg1) {
        field5124++;
        int var2 = 81 / ((55 - arg0) / 58);
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILr;)V")
    public static final void method2161(int arg0, class98 arg1) {
        if (arg0 <= 121) {
            field5149 = 108;
        }
        field5130++;
        if (class268.field3506.method1907((byte) 74) == 0) {
            return;
        }
        if (class62.field996 == 0) {
            for (class74 var2 = (class74) class268.field3506.method1904(false); var2 != null; var2 = (class74) class268.field3506.method1901(104)) {
                class259.field3355.method2389(var2.field1159, class597.field8642, (byte) 123, false, var2.field1166, var2.field1163, var2.field1165 ? class321.field4681.field1105 : null, false, arg1, var2.field1168, arg1, var2.field1167);
                var2.method2360((byte) 66);
            }
            class12.method83((byte) -113);
            return;
        }
        if (class528.field7533 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class528.field7533 = class98.method701(class466.field6715, class28.field492, var3, 0, 1, 0);
            class700.field9869 = class528.field7533.method684(class62.method385(0, false, class627.field9101, class283.field3785), class616.method3513(class595.field8616, class627.field9101, 0), true);
        }
        for (class74 var4 = (class74) class268.field3506.method1904(false); var4 != null; var4 = (class74) class268.field3506.method1901(112)) {
            class259.field3355.method2389(var4.field1159, class700.field9869, (byte) 121, false, var4.field1166, var4.field1163, var4.field1165 ? class321.field4681.field1105 : null, false, arg1, var4.field1168, class528.field7533, var4.field1167);
            var4.method2360((byte) 66);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B[BII)V")
    public final void method2162(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field5139++;
        if (this.field5132) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field5146.read(arg1, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg2 += var5;
        }
        if (arg0 != 1) {
            this.method2156(-58);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ljava/net/Socket;Lew;I)V")
    public class347(Socket arg0, class226 arg1, int arg2) throws IOException {
        this.field5142 = arg0;
        this.field5147 = arg1;
        this.field5142.setSoTimeout(30000);
        this.field5142.setTcpNoDelay(true);
        this.field5146 = this.field5142.getInputStream();
        this.field5148 = this.field5142.getOutputStream();
        this.field5141 = arg2;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5126[var2] = (float) Math.sin((double) var2 * var0);
            field5140[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5149 = 0;
        field5151 = new class622(45, -1);
    }
}
