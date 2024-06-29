import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 implements Runnable {

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    private int field394 = 0;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Z")
    private boolean field376 = false;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "Z")
    private boolean field397 = false;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    private int field406 = 0;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Ld;")
    private class22 field402;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "Ljava/net/Socket;")
    private Socket field409;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Ljava/io/InputStream;")
    private InputStream field408;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field372;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Ltd;")
    public static class136 field374 = class145.method1172("leuchten1:", 45);

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Ltd;")
    public static class136 field378 = class145.method1172(" weitere Optionen", 45);

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "[Z")
    public static boolean[] field386 = new boolean[5];

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[[S")
    public static short[][] field385 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "[I")
    public static int[] field383 = new int[50];

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Ltd;")
    public static class136 field399 = class145.method1172("<img=0>", 45);

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field398 = 0;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field381 = -1;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "[I")
    public static int[] field393 = new int[25];

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field404 = 0;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "Lue;")
    public static class143 field395 = new class143(64);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lsf;")
    public static class131 field401;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lw;")
    private class150 field377;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lmd;")
    public static class87 field379;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Z")
    public static boolean field387;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "[B")
    private byte[] field384;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method133(byte arg0) {
        field399 = null;
        field395 = null;
        field401 = null;
        field385 = null;
        field383 = null;
        field386 = null;
        field378 = null;
        field379 = null;
        field393 = null;
        field374 = null;
        if (arg0 >= -29) {
            field385 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILtd;Ltd;II)V")
    public static final void method134(int arg0, int arg1, int arg2, class136 arg3, class136 arg4, int arg5, int arg6) {
        field389++;
        if (class96.field2267) {
            return;
        }
        if (arg0 > -110) {
            field379 = null;
        }
        if (class14.field274 >= 500) {
            return;
        }
        class119.field2713[class14.field274] = arg3;
        class65.field1407[class14.field274] = arg4;
        class27.field600[class14.field274] = arg1;
        class28.field618[class14.field274] = arg5;
        class61.field1301[class14.field274] = arg6;
        class132.field3122[class14.field274] = arg2;
        class14.field274++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lke;B)Z")
    public static final boolean method135(class74 arg0, byte arg1) {
        field375++;
        if (arg1 < 54) {
            field395 = null;
        }
        if (class86.field2010) {
            if (class56.method444(arg0, 0) != 0) {
                return false;
            }
            if (arg0.field1690 == 0) {
                return false;
            }
        }
        return arg0.field1633;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[BII)V")
    public final void method136(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field396++;
        if (this.field376) {
            return;
        }
        if (arg0 <= 7) {
            field401 = null;
        }
        while (arg3 > 0) {
            int var5 = this.field408.read(arg1, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
    public final int method137(int arg0) throws IOException {
        field382++;
        if (arg0 != 0) {
            field379 = null;
        }
        return this.field376 ? 0 : this.field408.read();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
    public static final void method138(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class78.field1804[arg0][arg3 + var4][arg1 + var7] = 0;
            }
        }
        field380++;
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class78.field1804[arg0][arg3][arg1 + var5] = class78.field1804[arg0][arg3 - 1][arg1 + var5];
            }
        }
        if (arg2 < arg1) {
            for (int var6 = 1; var6 < 8; var6++) {
                class78.field1804[arg0][arg3 + var6][arg1] = class78.field1804[arg0][arg3 + var6][arg1 - 1];
            }
        }
        if (arg3 > 0 && class78.field1804[arg0][arg3 - 1][arg1] != 0) {
            class78.field1804[arg0][arg3][arg1] = class78.field1804[arg0][arg3 - 1][arg1];
        } else if (arg1 > 0 && class78.field1804[arg0][arg3][arg1 - 1] != 0) {
            class78.field1804[arg0][arg3][arg1] = class78.field1804[arg0][arg3][arg1 - 1];
        } else if (arg3 > 0 && arg1 > 0 && class78.field1804[arg0][arg3 - 1][arg1 - 1] != 0) {
            class78.field1804[arg0][arg3][arg1] = class78.field1804[arg0][arg3 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public static final void method139(int arg0) {
        field391++;
        for (int var1 = -1; var1 < class55.field1255; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class24.field564[var1];
            }
            class13 var6 = class154.field3518[var5];
            if (var6 != null && var6.field3609 > 0) {
                var6.field3609--;
                if (var6.field3609 == 0) {
                    var6.field3548 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class51.field1145; var2++) {
            int var3 = class139.field3237[var2];
            class67 var4 = class122.field2846[var3];
            if (var4 != null && var4.field3609 > 0) {
                var4.field3609--;
                if (var4.field3609 == 0) {
                    var4.field3548 = null;
                }
            }
        }
        if (arg0 >= -19) {
            field385 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Ltd;")
    public static final class136 method140(int arg0, int arg1) {
        if (arg1 > -76) {
            method147(84);
        }
        field388++;
        return class85.method635(false, 10, arg0, 115);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBI)V")
    public static final void method141(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 96) {
            field379 = null;
        }
        if (class69.field1442 != 0 && arg3 != 0 && class139.field3224 < 50) {
            class11.field191[class139.field3224] = arg1;
            class139.field3230[class139.field3224] = arg3;
            field383[class139.field3224] = arg0;
            class153.field3498[class139.field3224] = null;
            class93.field2182[class139.field3224] = 0;
            class139.field3224++;
        }
        field411++;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)I")
    public final int method142(byte arg0) throws IOException {
        field373++;
        if (this.field376) {
            return 0;
        } else {
            if (arg0 != 102) {
                method133((byte) -36);
            }
            return this.field408.available();
        }
    }

    @OriginalMember(owner = "client!cd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field405++;
        this.method144(1);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
    public static final void method143(int arg0, int arg1) {
        field392++;
        int[] var2 = class124.field2886.field169;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class125.field2895[arg0][var21][var5] & 0x18) == 0) {
                    class146.field3366.method737(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class125.field2895[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class146.field3366.method737(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class124.field2886.method48();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + (238 - -((int) (Math.random() * 20.0D)) - 10 << 8) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class125.field2895[arg0][var19][var8] & 0x18) == 0) {
                    class31.method259(arg0, var19, var8, var6, var7, -38);
                }
                if (arg0 < 3 && (class125.field2895[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class31.method259(arg0 + 1, var19, var8, var6, var7, -87);
                }
            }
        }
        class106.field2502 = 0;
        if (arg1 != -4) {
            method134(6, 3, 125, null, null, 3, -108);
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class146.field3366.method755(class62.field1331, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class142.method1154(var12, -80).field3068;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class4.field83[class62.field1331].field1972;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var9 - 3 < var15 && (var16[var15 - 1][var14] & 0x12C0108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var9 + 3 > var15 && (var16[var15 + 1][var14] & 0x12C0180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var14 > var10 - 3 && (var16[var15][var14 - 1] & 0x12C0102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var10 + 3 > var14 && (var16[var15][var14 + 1] & 0x12C0120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class106.field2500[class106.field2502] = class113.field2621[var13];
                        class55.field1258[class106.field2502] = var15;
                        class80.field1894[class106.field2502] = var14;
                        class106.field2502++;
                    }
                }
            }
        }
        class12.field219.method524(arg1 + 4);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        field410++;
        if (arg0 != 1 || this.field376) {
            return;
        }
        synchronized (this) {
            this.field376 = true;
            this.notifyAll();
        }
        if (this.field377 != null) {
            while (this.field377.field3442 == 0) {
                class9.method42(0, 1L);
            }
            if (this.field377.field3442 == 1) {
                try {
                    ((Thread) this.field377.field3441).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field377 = null;
    }

    @OriginalMember(owner = "client!cd", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field406 == this.field394) {
                            if (this.field376) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field406 > this.field394) {
                            var2 = 5000 - this.field406;
                        } else {
                            var2 = this.field394 - this.field406;
                        }
                        var3 = this.field406;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field372.write(this.field384, var3, var2);
                    } catch (IOException var9) {
                        this.field397 = true;
                    }
                    this.field406 = (this.field406 + var2) % 5000;
                    try {
                        if (this.field406 == this.field394) {
                            this.field372.flush();
                        }
                    } catch (IOException var8) {
                        this.field397 = true;
                    }
                    continue;
                }
                try {
                    if (this.field408 != null) {
                        this.field408.close();
                    }
                    if (this.field372 != null) {
                        this.field372.close();
                    }
                    if (this.field409 != null) {
                        this.field409.close();
                    }
                } catch (IOException var7) {
                }
                this.field384 = null;
                break;
            }
        } catch (Exception var12) {
            class53.method433(var12, false, null);
        }
        field403++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[BI)V")
    public final void method145(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field390++;
        if (this.field376) {
            return;
        }
        if (this.field397) {
            this.field397 = false;
            throw new IOException();
        }
        if (this.field384 == null) {
            this.field384 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field384[this.field394] = arg2[arg3 + var6];
                this.field394 = (this.field394 + 1) % 5000;
                if ((this.field406 + 4900) % 5000 == this.field394) {
                    throw new IOException();
                }
            }
            if (arg1 != -6660) {
                method143(121, -31);
            }
            if (this.field377 == null) {
                this.field377 = this.field402.method185(0, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)I")
    public static int method146(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)Z")
    public static final boolean method147(int arg0) {
        field400++;
        class52 var1 = class79.field1808;
        synchronized (class79.field1808) {
            if (class62.field1316 == class153.field3499) {
                return false;
            }
            class54.field1200 = client.field451[class62.field1316];
            class53.field1179 = class44.field1021[class62.field1316];
            class62.field1316 = class62.field1316 + 1 & 0x7F;
            if (arg0 < 105) {
                field385 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ljava/net/Socket;Ld;)V")
    public class19(Socket arg0, class22 arg1) throws IOException {
        this.field402 = arg1;
        this.field409 = arg0;
        this.field409.setSoTimeout(30000);
        this.field409.setTcpNoDelay(true);
        this.field408 = this.field409.getInputStream();
        this.field372 = this.field409.getOutputStream();
    }
}
