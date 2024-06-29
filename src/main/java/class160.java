import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class160 implements Runnable {

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    private int field2342 = 0;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    private int field2350 = 0;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    private int field2339;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2345;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "[B")
    private byte[] field2336;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field2337;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "Lcba;")
    public static class471 field2346 = new class471(72, 0);

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "Ljava/io/IOException;")
    private IOException field2343;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "[Lha;")
    public static class52[] field2344;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([Ljava/lang/Object;[IIIB)V")
    public static final void method1025(Object[] arg0, int[] arg1, int arg2, int arg3, byte arg4) {
        if (arg3 > arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg2; var10 < arg3; var10++) {
                if (((var9 & var10) + var7) > arg1[var10]) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method1025(arg0, arg1, arg2, var6 - 1, (byte) 67);
            method1025(arg0, arg1, var6 + 1, arg3, (byte) 67);
        }
        field2340++;
        if (arg4 != 67) {
            field2344 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II[BI)V")
    public final void method1026(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2348++;
        if (arg0 < 0 || arg1 < 0 || arg0 + arg1 > arg2.length) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (this.field2343 != null) {
                throw new IOException(this.field2343.toString());
            }
            int var6;
            if (this.field2342 >= this.field2350) {
                var6 = this.field2339 + this.field2350 - this.field2342 - 1;
            } else {
                var6 = this.field2350 - this.field2342 - 1;
            }
            if (arg0 > var6) {
                throw new IOException("");
            }
            if ((this.field2342 + arg0) <= this.field2339) {
                class416.method2498(arg2, arg1, this.field2336, this.field2342, arg0);
            } else {
                int var7 = this.field2339 - this.field2342;
                class416.method2498(arg2, arg1, this.field2336, this.field2342, var7);
                class416.method2498(arg2, arg1 + var7, this.field2336, 0, arg0 - var7);
            }
            this.field2342 = (this.field2342 + arg0) % this.field2339;
            this.notifyAll();
            if (arg3 != -12393) {
                this.field2343 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public final void method1027(byte arg0) {
        synchronized (this) {
            if (this.field2343 == null) {
                this.field2343 = new IOException("");
            }
            this.notifyAll();
        }
        field2338++;
        try {
            if (arg0 == -15) {
                this.field2337.join();
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public final void method1028(int arg0) {
        this.field2345 = new class360();
        field2347++;
        if (arg0 != 1) {
            method1031(-49, 52, -76);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static void method1029(boolean arg0) {
        field2344 = null;
        field2346 = null;
        if (!arg0) {
            method1029(false);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lqa;IILm;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method1030(class207 arg0, int arg1, int arg2, class163 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class329.field4405 = arg0;
        class641.field9321 = arg1;
        class618.field8854 = arg3;
        class474.field6665 = class329.field4405.method1313() > 0;
        class120.field1970 = arg4 >> class272.field3786;
        class546.field7561 = arg6 >> class272.field3786;
        class2.field31 = arg4;
        class454.field6417 = arg6;
        class48.field930 = arg5;
        class213.field3024 = class120.field1970 - class325.field4377;
        if (class213.field3024 < 0) {
            class467.field6583 = -class213.field3024;
            class213.field3024 = 0;
        } else {
            class467.field6583 = 0;
        }
        class67.field1139 = class546.field7561 - class325.field4377;
        if (class67.field1139 < 0) {
            class486.field6827 = -class67.field1139;
            class67.field1139 = 0;
        } else {
            class486.field6827 = 0;
        }
        class258.field3595 = class325.field4377 + class120.field1970;
        if (class258.field3595 > class332.field4447) {
            class258.field3595 = class332.field4447;
        }
        class277.field3834 = class546.field7561 + class325.field4377;
        if (class277.field3834 > class34.field624) {
            class277.field3834 = class34.field624;
        }
        for (int var18 = 0; var18 < class325.field4377 + class325.field4377 + 2; var18++) {
            for (int var23 = 0; var23 < class325.field4377 + class325.field4377 + 2; var23++) {
                int var24 = class120.field1970 + var18 - class325.field4377;
                int var25 = class546.field7561 + var23 - class325.field4377;
                if (var24 >= 0 && var25 >= 0 && var24 < class332.field4447 && var25 < class34.field624) {
                    int var26 = var24 << class272.field3786;
                    int var27 = var25 << class272.field3786;
                    int var28 = class608.field8767[class608.field8767.length - 1].method1104(var24, var25) - (0x3E8 << class272.field3786 - 7);
                    int var29 = client.field3472 == null ? class608.field8767[0].method1104(var24, var25) + class41.field808 : client.field3472[0].method1104(var24, var25) + class41.field808;
                    class270.field3764[var18][var23] = class329.field4405.method1263(var26, var28, var27, var26, var29, var27);
                } else {
                    class270.field3764[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class325.field4377 + class325.field4377 + 1; var19++) {
            for (int var22 = 0; var22 < class325.field4377 + class325.field4377 + 1; var22++) {
                class69.field1172[var19][var22] = class270.field3764[var19][var22] || class270.field3764[var19 + 1][var22] || class270.field3764[var19][var22 + 1] || class270.field3764[var19 + 1][var22 + 1];
            }
        }
        class648.field9399 = arg8;
        class37.field772 = arg9;
        class205.field2887 = arg10;
        class393.field5546 = arg11;
        class520.field7329 = arg12;
        class589.method3455();
        class512.method2967(class329.field4405, (byte) 127);
        for (class254 var20 = (class254) class402.field5723.method3150(16); var20 != null; var20 = (class254) class402.field5723.method3147(16)) {
            var20.method939(90);
            class360.method2161(var20, 87);
        }
        if (class474.field6665) {
            for (int var21 = 0; var21 < class517.field7258; var21++) {
                class363.field4863[var21].method3315(arg17, arg1, (byte) -107);
            }
        }
        if (arg2 > 1) {
            class329.field4405.method1330(0);
            if (class233.field3288 == null || class233.field3288 instanceof class492) {
                class233.field3288 = new class619();
            }
        } else if (class233.field3288 == null || class233.field3288 instanceof class619) {
            class233.field3288 = new class492();
        }
        class233.field3288.method2856(arg2, (byte) -125);
        class233.field3288.method2858(-91);
        if (class118.field1941 != null) {
            class133.method903(true);
            class233.field3288.method2863(22, 0);
            class430.method2558(arg2, null, 0, (byte) 0, arg15, arg16);
            class233.field3288.method2858(-112);
            class233.field3288.method2863(23, 0);
            class133.method903(false);
        }
        class430.method2558(arg2, arg7, arg13, arg14, arg15, arg16);
        class233.field3288.method2858(-128);
        class233.field3288.method2855(126);
        class233.field3288.method2858(-85);
        if (arg2 > 1) {
            class329.field4405.method1280(0);
        }
        class329.field4405.method1311(0, null);
    }

    @OriginalMember(owner = "client!vp", name = "run", descriptor = "()V")
    public final void run() {
        field2341++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2343 != null) {
                        return;
                    }
                    if (this.field2350 <= this.field2342) {
                        var2 = this.field2342 - this.field2350;
                    } else {
                        var2 = this.field2339 + this.field2342 - this.field2350;
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
                if (this.field2339 >= (this.field2350 + var2)) {
                    this.field2345.write(this.field2336, this.field2350, var2);
                } else {
                    int var3 = this.field2339 - this.field2350;
                    this.field2345.write(this.field2336, this.field2350, var3);
                    this.field2345.write(this.field2336, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2343 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2350 = (this.field2350 + var2) % this.field2339;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)Z")
    public static final boolean method1031(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method1031(-52, 61, 29);
        }
        field2351++;
        return class491.method2849(arg0, arg1, false) || class147.method979(-106, arg0, arg1);
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class160(OutputStream arg0, int arg1) {
        this.field2339 = arg1 + 1;
        this.field2345 = arg0;
        this.field2336 = new byte[this.field2339];
        this.field2337 = new Thread(this);
        this.field2337.setDaemon(true);
        this.field2337.start();
    }
}
