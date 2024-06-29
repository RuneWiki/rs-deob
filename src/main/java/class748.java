import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class748 implements Runnable {

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    private int field10422 = 0;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    private int field10425 = 0;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "Z")
    private boolean field10426 = false;

    @OriginalMember(owner = "client!sda", name = "x", descriptor = "Z")
    private boolean field10441 = false;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field10418;

    @OriginalMember(owner = "client!sda", name = "t", descriptor = "Lhga;")
    private class300 field10437;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field10419;

    @OriginalMember(owner = "client!sda", name = "s", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field10436;

    @OriginalMember(owner = "client!sda", name = "y", descriptor = "I")
    private int field10442;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field10420 = new String[100];

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "Z")
    public static boolean field10423 = false;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
    public static int field10427;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
    public static int field10428;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "I")
    public static int field10429;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!sda", name = "o", descriptor = "I")
    public static int field10432;

    @OriginalMember(owner = "client!sda", name = "p", descriptor = "I")
    public static int field10433;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "I")
    public static int field10434;

    @OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
    public static int field10435;

    @OriginalMember(owner = "client!sda", name = "u", descriptor = "I")
    public static int field10438;

    @OriginalMember(owner = "client!sda", name = "w", descriptor = "I")
    public static int field10440;

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "I")
    public static int field10443;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "Ljia;")
    public static class336 field10424;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "Lsca;")
    private class432 field10421;

    @OriginalMember(owner = "client!sda", name = "v", descriptor = "[B")
    private byte[] field10439;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILwk;)I")
    public static final int method4163(int arg0, class431 arg1) {
        field10438++;
        if (class567.field8198 == arg1) {
            return 7681;
        } else if (class281.field3934 == arg1) {
            return 8448;
        } else if (class596.field8472 == arg1) {
            return 34165;
        } else if (class684.field9720 == arg1) {
            return 260;
        } else if (class757.field10537 == arg1) {
            return 34023;
        } else if (arg0 == 34165) {
            throw new IllegalArgumentException();
        } else {
            return -121;
        }
    }

    @OriginalMember(owner = "client!sda", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field10434++;
        this.method4168(1);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)I")
    public final int method4164(int arg0) throws IOException {
        if (arg0 == 21103) {
            field10430++;
            return this.field10441 ? 0 : this.field10419.read();
        } else {
            return -99;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "([BIII)V")
    public final void method4165(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field10440++;
        if (this.field10441) {
            return;
        }
        if (arg2 >= -23) {
            this.field10419 = null;
        }
        while (arg1 > 0) {
            int var5 = this.field10419.read(arg0, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)I")
    public final int method4166(int arg0) throws IOException {
        field10428++;
        if (this.field10441) {
            return 0;
        } else if (arg0 < 10) {
            return -127;
        } else {
            return this.field10419.available();
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III[B)V")
    public final void method4167(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field10429++;
        if (this.field10441) {
            return;
        }
        if (this.field10426) {
            this.field10426 = false;
            throw new IOException();
        }
        if (this.field10439 == null) {
            this.field10439 = new byte[this.field10442];
        }
        synchronized (this) {
            for (int var6 = arg2; var6 < arg0; var6++) {
                this.field10439[this.field10425] = arg3[arg1 + var6];
                this.field10425 = (this.field10425 + 1) % this.field10442;
                if (((this.field10422 + this.field10442 - 100) % this.field10442) == this.field10425) {
                    throw new IOException();
                }
            }
            if (this.field10421 == null) {
                this.field10421 = this.field10437.method1872(3, false, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)V")
    public final void method4168(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field10435++;
        if (this.field10441) {
            return;
        }
        synchronized (this) {
            this.field10441 = true;
            this.notifyAll();
        }
        if (this.field10421 != null) {
            while (this.field10421.field6198 == 0) {
                class363.method2283(1L, -24244);
            }
            if (this.field10421.field6198 == 1) {
                try {
                    ((Thread) this.field10421.field6200).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field10421 = null;
    }

    @OriginalMember(owner = "client!sda", name = "run", descriptor = "()V")
    public final void run() {
        field10432++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field10425 == this.field10422) {
                        if (this.field10441) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field10422 <= this.field10425) {
                        var2 = this.field10425 - this.field10422;
                    } else {
                        var2 = this.field10442 - this.field10422;
                    }
                    var3 = this.field10422;
                }
                if (var2 > 0) {
                    try {
                        this.field10436.write(this.field10439, var3, var2);
                    } catch (IOException var9) {
                        this.field10426 = true;
                    }
                    this.field10422 = (this.field10422 + var2) % this.field10442;
                    try {
                        if (this.field10425 == this.field10422) {
                            this.field10436.flush();
                        }
                    } catch (IOException var8) {
                        this.field10426 = true;
                    }
                }
            }
            try {
                if (this.field10419 != null) {
                    this.field10419.close();
                }
                if (this.field10436 != null) {
                    this.field10436.close();
                }
                if (this.field10418 != null) {
                    this.field10418.close();
                }
            } catch (IOException var7) {
            }
            this.field10439 = null;
        } catch (Exception var12) {
            class705.method3952(null, var12, -29913);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
    public final void method4169(byte arg0) throws IOException {
        field10431++;
        if (this.field10441) {
            return;
        }
        if (arg0 > -48) {
            method4171(-81);
        }
        if (this.field10426) {
            this.field10426 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)V")
    public final void method4170(byte arg0) {
        field10427++;
        if (this.field10441) {
            return;
        }
        this.field10419 = new class499();
        if (arg0 != 40) {
            this.field10421 = null;
        }
        this.field10436 = new class630();
    }

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "(I)V")
    public static void method4171(int arg0) {
        field10420 = null;
        if (arg0 == 0) {
            field10424 = null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILsl;)Ljava/lang/String;")
    public static final String method4172(int arg0, class479 arg1) {
        if (arg0 == 0) {
            field10443++;
            return class343.method2107(32767, arg0, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "(I)V")
    public static final void method4173(int arg0) {
        field10433++;
        if (arg0 != 45134022) {
            method4172(-5, null);
        }
        int var1 = class658.field9419.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class658.field9419[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class383.field5542; var4++) {
                    if (class690.field9791[var4] == class284.field3961[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class690.field9791[class383.field5542] = class284.field3961[var2];
                    var3 = class383.field5542++;
                }
                class479 var5 = new class479(class658.field9419[var2]);
                int var6 = 0;
                while (class658.field9419[var2].length > var5.field6864 && var6 < 511 && class619.field8816 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2882(-1);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FEA) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class284.field3961[var2] >> 8) * 64 + var10 - class41.field693;
                    int var13 = (class284.field3961[var2] & 0xFF) * 64 + (var11 - class71.field1085);
                    class521 var14 = class288.field4000.method2822(var5.method2882(arg0 - 45134023), arg0 ^ 0x2B0B0F4);
                    class63 var15 = (class63) class389.field5608.method4020((long) var7, (byte) -73);
                    if (var15 == null && (var14.field7523 & 0x1) > 0 && class717.field10118 == var9 && var12 >= 0 && class184.field2546 > (var14.field7512 + var12) && var13 >= 0 && var13 + var14.field7512 < class240.field3555) {
                        class571 var16 = new class571();
                        var16.field4592 = var7;
                        class63 var17 = new class63(var16);
                        class389.field5608.method4022(var17, arg0 ^ 0x2B0B0B3, (long) var7);
                        class414.field5889[class551.field8042++] = var17;
                        class545.field7927[class619.field8816++] = var7;
                        var16.field4548 = class703.field9918;
                        var16.method3395(var14, 0);
                        var16.method2066(var16.field8235.field7512, true);
                        var16.field4571 = var16.field8235.field7516 << 3;
                        var16.method2061((byte) 75, (var16.field8235.field7545 + 4 & 0xD7000007) << 11, true);
                        var16.method3397(var13, var9, var12, var16.method2053(true), true, (byte) -118);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Ljava/net/Socket;Lhga;I)V")
    public class748(Socket arg0, class300 arg1, int arg2) throws IOException {
        this.field10418 = arg0;
        this.field10437 = arg1;
        this.field10418.setSoTimeout(30000);
        this.field10418.setTcpNoDelay(true);
        this.field10419 = this.field10418.getInputStream();
        this.field10436 = this.field10418.getOutputStream();
        this.field10442 = arg2;
    }
}
