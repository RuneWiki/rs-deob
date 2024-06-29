import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class32 implements Runnable {

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "Lum;")
    private class347 field531 = new class347();

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field532 = new Thread(this);

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Z")
    public static boolean field535 = false;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "[[B")
    public static byte[][] field528 = new byte[1000][];

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public final void method258(int arg0) {
        if (arg0 != -349279) {
            method261(null);
        }
        field536++;
        if (this.field532 == null) {
            return;
        }
        this.method260(new class86(), (byte) -65);
        try {
            this.field532.join();
        } catch (InterruptedException var2) {
        }
        this.field532 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)Lqj;")
    public final class336 method259(int arg0, String arg1) {
        if (arg0 <= 28) {
            method261(null);
        }
        field533++;
        if (this.field532 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class336 var3 = new class336(arg1);
            this.method260(var3, (byte) 116);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bt", name = "run", descriptor = "()V")
    public final void run() {
        field534++;
        while (true) {
            class347 var1 = this.field531;
            class336 var3;
            synchronized (this.field531) {
                class86 var2;
                for (var2 = this.field531.method2093(-10805); var2 == null; var2 = this.field531.method2093(-10805)) {
                    try {
                        this.field531.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class336)) {
                    return;
                }
                var3 = (class336) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field4872).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field4867 = var5;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lcg;B)V")
    private final void method260(class86 arg0, byte arg1) {
        field530++;
        class347 var3 = this.field531;
        synchronized (this.field531) {
            this.field531.method2086((byte) -114, arg0);
            int var4 = 118 % ((30 - arg1) / 63);
            this.field531.notify();
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lfi;)V")
    public static final void method261(class373 arg0) {
        if (class387.field5731 >= 65535) {
            return;
        }
        class472 var1 = arg0.field5595;
        class76.field1084[class387.field5731] = arg0;
        class415.field6147[class387.field5731] = false;
        class387.field5731++;
        int var2 = arg0.field5590;
        if (arg0.field5587) {
            var2 = 0;
        }
        int var3 = arg0.field5590;
        if (arg0.field5591) {
            var3 = class399.field5881 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2761(0) + class170.field2281 - var1.method2764(false) >> class41.field628;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2761(0) + var1.method2764(false) - class170.field2281 >> class41.field628;
            if (var7 >= class98.field1339) {
                var7 = class98.field1339 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field5592[var5++];
                int var10 = (var1.method2759(117) + class170.field2281 - var1.method2764(false) >> class41.field628) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class282.field4031) {
                    var11 = class282.field4031 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class310.field4512[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class310.field4512[var4][var12][var8] = var13 | (long) class387.field5731;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class310.field4512[var4][var12][var8] = var13 | (long) class387.field5731 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class310.field4512[var4][var12][var8] = var13 | (long) class387.field5731 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class310.field4512[var4][var12][var8] = var13 | (long) class387.field5731 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
    public class32() {
        this.field532.setDaemon(true);
        this.field532.start();
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V")
    public static void method262(boolean arg0) {
        field528 = null;
        if (arg0) {
            method264(true, -49, false, null);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIBIIIIIIII)V")
    public static final void method263(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field529++;
        if (class311.field4527 == null || arg5 != 98) {
            return;
        }
        class294 var15;
        if (arg13 >= 0) {
            int var14 = arg13 - 1;
            var15 = class504.field7697[var14];
        } else {
            int var16 = -arg13 - 1;
            if (class156.field2047 == var16) {
                var15 = class415.field6145;
            } else {
                var15 = class262.field3742[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        class486 var17 = class114.field1471.method2132((byte) 125, arg6);
        int var18;
        int var19;
        if (arg10 == 1 || arg10 == 3) {
            var19 = var17.field7096;
            var18 = var17.field7036;
        } else {
            var18 = var17.field7096;
            var19 = var17.field7036;
        }
        int var20 = (var19 >> 1) + arg9;
        int var21 = (var19 + 1 >> 1) + arg9;
        int var22 = (var18 >> 1) + arg7;
        int var23 = (var18 + 1 >> 1) + arg7;
        class441 var24 = class311.field4527[arg11];
        int var25 = var24.method848(var20, var22) + var24.method848(var21, var22) + var24.method848(var20, var23) + var24.method848(var21, var23) >> 2;
        class167 var26 = new class167();
        var26.field2187 = class263.field3748 + arg1;
        var26.field2188 = arg7;
        var26.field2186 = arg6;
        var26.field2182 = var15.field2956;
        var26.field2181 = arg12;
        var26.field2184 = arg10;
        if (arg0 > arg2) {
            int var27 = arg0;
            arg0 = arg2;
            arg2 = var27;
        }
        var26.field2180 = arg9;
        var26.field2196 = class263.field3748 + arg8;
        var26.field2191 = arg2 + arg9;
        if (arg4 > arg3) {
            int var28 = arg4;
            arg4 = arg3;
            arg3 = var28;
        }
        var26.field2193 = arg0 + arg9;
        var26.field2185 = (var26.field2180 << 7) + (var19 << 6);
        var26.field2199 = arg7 + arg4;
        var26.field2200 = arg7 + arg3;
        var26.field2197 = var25;
        var26.field2183 = (var26.field2188 << 7) + (var18 << 6);
        class121.field1589.method2086((byte) -123, var26);
        var15.field4283 = var26;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZIZLcq;)V")
    public static final void method264(boolean arg0, int arg1, boolean arg2, class311 arg3) {
        field527++;
        int var4 = arg3.field4525;
        int var5 = (int) arg3.field1177;
        arg3.method536(false);
        if (arg0) {
            class6.method49(var4, (byte) 125);
        }
        class103.method614(var4, -96);
        class356 var6 = class4.method25(var5, false);
        if (var6 != null) {
            class170.method1068(arg1 + 16318801, var6);
        }
        class330.method1983(17417);
        if (!arg2 && class465.field6737 != -1) {
            class469.method2743(1, false, class465.field6737);
        }
        class418 var7 = new class418(class213.field3010);
        if (arg1 != -16318928) {
            return;
        }
        for (class311 var8 = (class311) var7.method2484((byte) -89); var8 != null; var8 = (class311) var7.method2485((byte) -99)) {
            if (!var8.method542((byte) -20)) {
                var8 = (class311) var7.method2484((byte) 48);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field4526 == 3) {
                int var9 = (int) var8.field1177;
                if (var9 >>> 16 == var4) {
                    method264(true, -16318928, arg2, var8);
                }
            }
        }
    }
}
