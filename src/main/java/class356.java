import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class356 implements Runnable {

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Lld;")
    private class105 field4913 = new class105();

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field4918 = new Thread(this);

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
    public static int[] field4912 = new int[50];

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "Z")
    public static boolean field4909 = false;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Z")
    public static boolean field4911 = false;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Lr;")
    public static class110 field4916;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;B)Lha;")
    public final class40 method2182(String arg0, byte arg1) {
        field4910++;
        if (this.field4918 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            int var3 = -15 % ((arg1 + 61) / 49);
            class40 var4 = new class40(arg0);
            this.method2185(-12187, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public final void method2183(int arg0) {
        field4917++;
        if (this.field4918 == null) {
            return;
        }
        this.method2185(arg0 - 12186, new class445());
        try {
            this.field4918.join();
        } catch (InterruptedException var2) {
        }
        this.field4918 = null;
        if (arg0 != -1) {
            this.method2182((String) null, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!nl", name = "run", descriptor = "()V")
    public final void run() {
        field4914++;
        while (true) {
            class105 var1 = this.field4913;
            class40 var3;
            synchronized (this.field4913) {
                class445 var2;
                for (var2 = this.field4913.method650((byte) -3); var2 == null; var2 = this.field4913.method650((byte) -3)) {
                    try {
                        this.field4913.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class40)) {
                    return;
                }
                var3 = (class40) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field573).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field574 = var5;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static void method2184(int arg0) {
        if (arg0 < 15) {
            field4915 = 68;
        }
        field4912 = null;
        field4916 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILag;)V")
    private final void method2185(int arg0, class445 arg1) {
        if (arg0 != -12187) {
            method2186(77, -86, -125, -102, -79, 60, 17, -27);
        }
        field4920++;
        class105 var3 = this.field4913;
        synchronized (this.field4913) {
            this.field4913.method641(arg1, (byte) -93);
            this.field4913.notify();
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4919++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg6 - arg1;
        int var12 = arg2 - arg1;
        int var13 = arg6 * arg6;
        int var14 = arg2 * arg2;
        if (arg5 != 31516) {
            method2186(-113, 101, -38, -3, 27, -53, -103, -77);
        }
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class102.field1472[arg4];
        class330.method1834(arg7 - var11, var39, arg3, arg7 - arg6, 25084);
        class330.method1834(arg7 + var11, var39, arg0, arg7 - var11, 25084);
        class330.method1834(arg6 + arg7, var39, arg3, arg7 + var11, 25084);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class330.method1834(var46, class102.field1472[var41], arg3, var44, 25084);
                class330.method1834(var45, class102.field1472[var41], arg0, var46, 25084);
                class330.method1834(var43, class102.field1472[var41], arg3, var45, 25084);
                class330.method1834(var46, class102.field1472[var42], arg3, var44, 25084);
                class330.method1834(var45, class102.field1472[var42], arg0, var46, 25084);
                class330.method1834(var43, class102.field1472[var42], arg3, var45, 25084);
            } else {
                class330.method1834(var43, class102.field1472[var41], arg3, var44, 25084);
                class330.method1834(var43, class102.field1472[var42], arg3, var44, 25084);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
    public static final void method2187(int arg0, int arg1, int arg2) {
        boolean var3 = class289.field3897[0][arg1][arg2] != null && class289.field3897[0][arg1][arg2].field6862 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class289.field3897[var4][arg1][arg2] == null) {
                class491 var5 = class289.field3897[var4][arg1][arg2] = new class491(var4, arg1, arg2);
                if (var3) {
                    var5.field6836++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class356() {
        this.field4918.setDaemon(true);
        this.field4918.start();
    }
}
