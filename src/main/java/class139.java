import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class139 implements Runnable {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    private int field3484 = 0;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Z")
    private boolean field3499 = false;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Z")
    private boolean field3491 = false;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    private int field3501 = 0;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Ltc;")
    private class133 field3485;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Ljava/net/Socket;")
    private Socket field3500;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field3483;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3489;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[Lfc;")
    public static class39[] field3482 = new class39[200];

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lfc;")
    public static class39 field3494 = class90.method774("Konfig geladen)3", -127);

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Lfc;")
    private static class39 field3497 = class90.method774("Enter name of friend to add to list", -108);

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lfc;")
    public static class39 field3492 = class90.method774("Bitte versuchen Sie es in ", -85);

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Lfc;")
    public static class39 field3506 = field3497;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "Lfc;")
    private static class39 field3508 = class90.method774("Continue", -121);

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Lfc;")
    public static class39 field3507 = field3508;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3509 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "Lfc;")
    private static class39 field3516 = class90.method774("glow2:", -106);

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "Lfc;")
    public static class39 field3514 = field3516;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field3518 = 500;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "[[I")
    public static int[][] field3517 = new int[104][104];

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field3519 = -1;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "[Lfc;")
    public static class39[] field3515 = new class39[100];

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "Lfc;")
    public static class39 field3512 = field3516;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lac;")
    public static class4 field3503;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lle;")
    private class81 field3493;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Z")
    public static boolean field3513;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "[B")
    private byte[] field3487;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "[Lb;")
    public static class8[] field3511;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 9)
    public static void method1137(int arg0) {
        field3497 = null;
        field3507 = null;
        field3508 = null;
        if (arg0 != 0) {
            return;
        }
        field3515 = null;
        field3511 = null;
        field3517 = null;
        field3482 = null;
        field3492 = null;
        field3503 = null;
        field3506 = null;
        field3514 = null;
        field3512 = null;
        field3516 = null;
        field3509 = null;
        field3494 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I", line = 41)
    public final int method1138(byte arg0) throws IOException {
        field3510++;
        if (arg0 == -47) {
            return this.field3491 ? 0 : this.field3483.available();
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 60)
    public static final void method1139(int arg0) {
        class108.field2709.method927(false);
        field3505++;
        class67.field1605.method927(false);
        class109.field2733.method927(false);
        if (arg0 != 12111) {
            method1144(38, 62, 80, -78);
        }
    }

    @OriginalMember(owner = "client!uc", name = "finalize", descriptor = "()V", line = 73)
    protected final void finalize() {
        field3490++;
        this.method1145(5073);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZII[B)V", line = 83)
    public final void method1140(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3502++;
        if (this.field3491) {
            return;
        }
        if (this.field3499) {
            this.field3499 = false;
            throw new IOException();
        }
        if (this.field3487 == null) {
            this.field3487 = new byte[5000];
        }
        synchronized (this) {
            if (arg0) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field3487[this.field3501] = arg3[arg2 + var6];
                    this.field3501 = (this.field3501 + 1) % 5000;
                    if ((this.field3484 + 4900) % 5000 == this.field3501) {
                        throw new IOException();
                    }
                }
                if (this.field3493 == null) {
                    this.field3493 = this.field3485.method1087(3, this, (byte) 125);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI[BI)V", line = 138)
    public final void method1141(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3498++;
        if (this.field3491) {
            return;
        }
        if (!arg0) {
            field3518 = -63;
        }
        while (arg3 > 0) {
            int var5 = this.field3483.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/net/Socket;Ltc;)V", line = 439)
    public class139(Socket arg0, class133 arg1) throws IOException {
        this.field3485 = arg1;
        this.field3500 = arg0;
        this.field3500.setSoTimeout(30000);
        this.field3500.setTcpNoDelay(true);
        this.field3483 = this.field3500.getInputStream();
        this.field3489 = this.field3500.getOutputStream();
    }

    @OriginalMember(owner = "client!uc", name = "run", descriptor = "()V", line = 176)
    public final void run() {
        field3495++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3501 == this.field3484) {
                        if (this.field3491) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field3484 <= this.field3501) {
                        var2 = this.field3501 - this.field3484;
                    } else {
                        var2 = 5000 - this.field3484;
                    }
                    var3 = this.field3484;
                }
                if (var2 > 0) {
                    try {
                        this.field3489.write(this.field3487, var3, var2);
                    } catch (IOException var9) {
                        this.field3499 = true;
                    }
                    this.field3484 = (this.field3484 + var2) % 5000;
                    try {
                        if (this.field3501 == this.field3484) {
                            this.field3489.flush();
                        }
                    } catch (IOException var8) {
                        this.field3499 = true;
                    }
                }
            }
            try {
                if (this.field3483 != null) {
                    this.field3483.close();
                }
                if (this.field3489 != null) {
                    this.field3489.close();
                }
                if (this.field3500 != null) {
                    this.field3500.close();
                }
            } catch (IOException var7) {
            }
            this.field3487 = null;
        } catch (Exception var12) {
            class142.method1158(null, var12, -72);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 251)
    public static final void method1142(int arg0) {
        field3486++;
        if (class76.field1734 == 0) {
            return;
        }
        class84 var1 = class50.field1255;
        int var2 = 0;
        if (class120.field3131 != 0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0 != 2) {
            return;
        }
        while (var3 < 100) {
            if (class112.field2936[var3] != null) {
                int var4 = class145.field3623[var3];
                byte var5 = 0;
                class39 var6 = field3515[var3];
                if (var6 != null && var6.method472(0, class89.field2091)) {
                    var5 = 1;
                    var6 = var6.method469(5, (byte) -115);
                }
                if (var6 != null && var6.method472(0, class43.field1177)) {
                    var6 = var6.method469(5, (byte) -123);
                    var5 = 2;
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class92.field2164 == 0 || class92.field2164 == 1 && class35.method399(var6, 125))) {
                    int var7 = 329 - var2 * 13;
                    byte var8 = 4;
                    var2++;
                    var1.method700(class12.field321, var8, var7 - 1, 65535, 0);
                    int var9 = var8 + var1.method707(class12.field321);
                    int var10 = var9 + var1.method721(32);
                    if (var5 == 1) {
                        class92.field2167[0].method1155(var10, var7 - 12);
                        var10 += 14;
                    }
                    if (var5 == 2) {
                        class92.field2167[1].method1155(var10, var7 - 12);
                        var10 += 14;
                    }
                    var1.method700(class137.method1111(new class39[] { var6, class86.field1956, class112.field2936[var3] }, (byte) -28), var10, var7 - 1, 65535, 0);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class92.field2164 < 2) {
                    int var11 = 329 - var2 * 13;
                    var2++;
                    var1.method700(class112.field2936[var3], 4, var11 - 1, 65535, 0);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class92.field2164 < 2) {
                    int var12 = 329 - var2 * 13;
                    var2++;
                    var1.method700(class137.method1111(new class39[] { class1.field17, class82.field1836, var6, class86.field1956, class112.field2936[var3] }, (byte) 93), 4, var12 - 1, 65535, 0);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)I", line = 379)
    public final int method1143(int arg0) throws IOException {
        field3488++;
        if (this.field3491) {
            return 0;
        } else {
            if (arg0 >= -108) {
                method1139(107);
            }
            return this.field3483.read();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I", line = 412)
    public static final int method1144(int arg0, int arg1, int arg2, int arg3) {
        field3504++;
        int var4 = arg2 / arg1;
        int var5 = arg1 - 1 & arg2;
        int var6 = arg3 / arg1;
        int var7 = arg0 + arg1 & arg3;
        int var8 = class98.method820(true, var4, var6);
        int var9 = class98.method820(true, var4 + 1, var6);
        int var10 = class98.method820(true, var4, var6 + 1);
        int var11 = class98.method820(true, var4 + 1, var6 - -1);
        int var12 = class68.method644(var5, var8, arg1, var9, -76);
        int var13 = class68.method644(var5, var10, arg1, var11, -78);
        return class68.method644(var7, var12, arg1, var13, -106);
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V", line = 453)
    public final void method1145(int arg0) {
        field3496++;
        if (this.field3491) {
            return;
        }
        synchronized (this) {
            this.field3491 = true;
            this.notifyAll();
        }
        if (this.field3493 != null) {
            while (this.field3493.field1816 == 0) {
                class61.method609(-84, 1L);
            }
            if (this.field3493.field1816 == 1) {
                try {
                    ((Thread) this.field3493.field1820).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0 != 5073) {
            field3512 = null;
        }
        this.field3493 = null;
    }
}
