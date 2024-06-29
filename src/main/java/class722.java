import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class722 implements Runnable {

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    private int field10054 = 0;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    private int field10055 = 0;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field10063;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    private int field10052;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "[B")
    private byte[] field10061;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field10058;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field10051;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field10059;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field10064;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Ljava/io/IOException;")
    private IOException field10060;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([BIIIII)V", line = 3)
    public static final void method4060(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10051++;
        if (arg1 >= arg5) {
            return;
        }
        int var6 = arg5 - arg1 >> 2;
        int var7 = arg1 + arg2;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg5 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg4 == 14286) {
                            return;
                        } else {
                            method4065((byte) -75, null, 16, 79, 71, 79, 76);
                            return;
                        }
                    }
                    arg0[var7++] = 1;
                }
            }
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!hn", name = "run", descriptor = "()V", line = 41)
    public final void run() {
        field10056++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field10060 != null) {
                        return;
                    }
                    if (this.field10055 <= this.field10054) {
                        var2 = this.field10054 - this.field10055;
                    } else {
                        var2 = this.field10054 + this.field10052 - this.field10055;
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
            try {
                if (this.field10055 + var2 <= this.field10052) {
                    this.field10063.write(this.field10061, this.field10055, var2);
                } else {
                    int var3 = this.field10052 - this.field10055;
                    this.field10063.write(this.field10061, this.field10055, var3);
                    this.field10063.write(this.field10061, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field10060 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field10055 = (this.field10055 + var2) % this.field10052;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 100)
    public final void method4061(int arg0) {
        this.field10063 = new class322();
        field10059++;
        if (arg0 != -19694) {
            this.field10063 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 284)
    public class722(OutputStream arg0, int arg1) {
        this.field10063 = arg0;
        this.field10052 = arg1 + 1;
        this.field10061 = new byte[this.field10052];
        this.field10058 = new Thread(this);
        this.field10058.setDaemon(true);
        this.field10058.start();
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)V", line = 119)
    public static final void method4062(int arg0, boolean arg1) {
        if (class549.field7251 == null) {
            class717.method4014(1);
        }
        field10062++;
        if (arg0 == -3740 && arg1) {
            class549.field7251.method1281((byte) 43);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III[B)V", line = 137)
    public final void method4063(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 8716) {
            this.field10061 = null;
        }
        field10057++;
        if (arg2 < 0 || arg1 < 0 || arg3.length < arg1 + arg2) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field10060 != null) {
                throw new IOException(this.field10060.toString());
            }
            int var6;
            if (this.field10054 < this.field10055) {
                var6 = this.field10055 - this.field10054 - 1;
            } else {
                var6 = this.field10052 + this.field10055 - this.field10054 - 1;
            }
            if (arg2 > var6) {
                throw new IOException("");
            }
            if ((this.field10054 + arg2) > this.field10052) {
                int var7 = this.field10052 - this.field10054;
                class335.method2020(arg3, arg1, this.field10061, this.field10054, var7);
                class335.method2020(arg3, arg1 + var7, this.field10061, 0, arg2 - var7);
            } else {
                class335.method2020(arg3, arg1, this.field10061, this.field10054, arg2);
            }
            this.field10054 = (this.field10054 + arg2) % this.field10052;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)I", line = 182)
    public static final int method4064(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class333.field4736 - 1; var2++) {
            if (arg0 < class568.field7468[var2] + class190.field2865[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class333.field4736 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLha;IIIII)V", line = 204)
    public static final void method4065(byte arg0, class59 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((class48.field608 == null || class164.field2491 == null || class314.field4486 == null) && class84.field1023.method2216(class190.field2870, 127) && class84.field1023.method2216(class276.field3853, -106) && class84.field1023.method2216(class410.field5689, -66)) {
            class720 var7 = class720.method4034(class84.field1023, class276.field3853, 0);
            class164.field2491 = arg1.method415(var7, true);
            var7.method4044();
            class4.field119 = arg1.method415(var7, true);
            class48.field608 = arg1.method415(class720.method4034(class84.field1023, class190.field2870, 0), true);
            class720 var8 = class720.method4034(class84.field1023, class410.field5689, 0);
            class314.field4486 = arg1.method415(var8, true);
            var8.method4044();
            class85.field1030 = arg1.method415(var8, true);
        }
        field10064++;
        if (class48.field608 != null && class164.field2491 != null && class314.field4486 != null) {
            int var9 = (arg3 - class314.field4486.method1042() * 2) / class48.field608.method1042();
            for (int var10 = 0; var10 < var9; var10++) {
                class48.field608.method1035(class314.field4486.method1042() + arg6 + (class48.field608.method1042() * var10), -class48.field608.method1043() + arg2 + arg5);
            }
            int var11 = (arg5 - arg4 - class314.field4486.method1043()) / class164.field2491.method1043();
            for (int var12 = 0; var12 < var11; var12++) {
                class164.field2491.method1035(arg6, arg2 + arg4 + (var12 * class164.field2491.method1043()));
                class4.field119.method1035(arg3 + arg6 - class4.field119.method1042(), class164.field2491.method1043() * var12 + arg2 + arg4);
            }
            class314.field4486.method1035(arg6, arg2 - (class314.field4486.method1043() - arg5));
            class85.field1030.method1035(arg3 + arg6 - class314.field4486.method1042(), -class314.field4486.method1043() + (arg2 - -arg5));
        }
        if (arg0 != 85) {
            method4060(null, 88, 58, -8, -94, -26);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 262)
    public final void method4066(boolean arg0) {
        field10053++;
        synchronized (this) {
            if (this.field10060 == null) {
                this.field10060 = new IOException("");
            }
            if (!arg0) {
                method4064(36);
            }
            this.notifyAll();
        }
        try {
            this.field10058.join();
        } catch (InterruptedException var3) {
        }
    }
}
