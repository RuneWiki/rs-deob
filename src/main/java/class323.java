import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class323 implements Runnable {

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lv;")
    private class165 field4568 = new class165();

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field4570 = new Thread(this);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4563 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lvt;")
    public static class768 field4567;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 6)
    public static void method2045(int arg0) {
        if (arg0 != 2) {
            method2046(null, null, true, false, null, null);
        }
        field4567 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lhw;Lha;ZZLda;Ljava/lang/String;)V", line = 16)
    public static final void method2046(class300 arg0, class473 arg1, boolean arg2, boolean arg3, class442 arg4, String arg5) {
        field4560++;
        boolean var6 = !class301.field4373 || class529.method3148(0);
        if (!var6) {
            return;
        }
        if (arg3) {
            method2049(-99, -76, 22, -14, 2, 112, 54);
        }
        if (class301.field4373 && var6) {
            class300 var7 = class282.field4041;
            class442 var8 = arg1.method179(var7, class554.field7680, true);
            int var9 = var7.method1957(0, 250, null, arg5);
            int var10 = var7.method1954(false, arg5, 250, var7.field4362, null);
            int var11 = class685.field9571.field4014;
            int var12 = var11 + 4;
            int var13 = var12 * 2 + var10;
            int var14 = var12 * 2 + var9;
            if (var13 < class476.field6608) {
                var13 = class476.field6608;
            }
            if (var14 < class235.field3534) {
                var14 = class235.field3534;
            }
            int var15 = class18.field112.method1744(class456.field6378, var14, (byte) 124) + class744.field10272;
            int var16 = class774.field10659.method59(0, class565.field7983, var13) + class537.field7424;
            if (class55.field651) {
                var15 += class236.method1611(-5110);
                var16 += class339.method2149((byte) 123);
            }
            arg1.method192(class154.field2013, false).method748(class315.field4518.field4014 + var15, class315.field4518.field4008 + var16, var14 - (class315.field4518.field4014 * 2), var13 - class315.field4518.field4008 * 2, 1, 0, 0);
            arg1.method192(class315.field4518, true).method2025(var15, var16);
            class315.field4518.method1814();
            arg1.method192(class315.field4518, true).method2025(var14 + var15 - var11, var16);
            class315.field4518.method1815();
            arg1.method192(class315.field4518, true).method2025(var15 + var14 - var11, var13 + var16 - var11);
            class315.field4518.method1814();
            arg1.method192(class315.field4518, true).method2025(var15, var13 + var16 - var11);
            class315.field4518.method1815();
            arg1.method192(class685.field9571, true).method2031(var15, class315.field4518.field4008 + var16, var11, var13 - (class315.field4518.field4008 * 2));
            class685.field9571.method1810();
            arg1.method192(class685.field9571, true).method2031(class315.field4518.field4014 + var15, var16, var14 - (class315.field4518.field4014 * 2), var11);
            class685.field9571.method1810();
            arg1.method192(class685.field9571, true).method2031(var14 + var15 - var11, class315.field4518.field4008 + var16, var11, var13 - (class315.field4518.field4008 * 2));
            class685.field9571.method1810();
            arg1.method192(class685.field9571, true).method2031(class315.field4518.field4014 + var15, var13 + var16 + -var11, var14 - class315.field4518.field4014 * 2, var11);
            class685.field9571.method1810();
            var8.method2643(var12 + var16, 0, 1, var12 + var15, 1, var14 - (var12 * 2), -(var12 * 2) + var13, null, arg5, class121.field1612 | 0xFF000000, (byte) -33, null, -1, 0, 0, null);
            class453.method2733(var16, var13, var14, -92, var15);
        } else {
            int var17 = arg0.method1957(0, 250, null, arg5);
            int var18 = arg0.method1960(250, arg5, -107, null) * 13;
            byte var19 = 4;
            int var20 = var19 + 6;
            int var21 = var19 + 6;
            arg1.method233(var20 - var19, var21 - var19, var17 + var19 + var19, var18 + var19 - -var19, -16777216, 0);
            arg1.method171(var20 - var19, -var19 + var21, var19 + var19 + var17, var18 + var19 - -var19, -1, 0);
            arg4.method2643(var21, 0, 1, var20, 1, var17, var18, null, arg5, -1, (byte) -33, null, -1, 0, 0, null);
            class453.method2733(var21 - var19, var19 + var19 + var18, var19 + var19 + var17, -126, var20 - var19);
        }
        if (!arg2) {
            return;
        }
        try {
            if (class55.field651) {
                class537.method3193(1);
            } else {
                arg1.method2817(false);
            }
        } catch (class357 var22) {
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/lang/String;)Ljw;", line = 115)
    public final class474 method2047(byte arg0, String arg1) {
        field4569++;
        if (this.field4570 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class474 var3 = new class474(arg1);
            if (arg0 >= -40) {
                return null;
            } else {
                this.method2050(var3, (byte) -68);
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 139)
    public static final void method2048(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field4564++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class475.field6591.field5453 : class475.field6591.field5463);
        for (int var8 = var6; var8 < var7; var8++) {
            class647 var11 = class475.field6591.method2375((byte) -84, var8);
            if (var11.field9055 && var11.method3705((byte) -97).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class133.field1706 = null;
                    class22.field205 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class133.field1706 = var4;
        if (arg0 >= -1) {
            method2045(47);
        }
        class263.field3848 = 0;
        class22.field205 = var5;
        String[] var9 = new String[class22.field205];
        for (int var10 = 0; var10 < class22.field205; var10++) {
            var9[var10] = class475.field6591.method2375((byte) -71, var4[var10]).method3705((byte) -128);
        }
        class779.method4293(class133.field1706, var9, Integer.MIN_VALUE);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V", line = 212)
    public static final void method2049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4562++;
        class726 var7 = (class726) class190.field2376.method3103((byte) 72);
        if (arg3 != 2) {
            field4563 = 17;
        }
        while (var7 != null) {
            if (class533.field7336 >= var7.field10044) {
                var7.method2773(110);
            } else {
                class54.method459(arg0, 30686, arg4 >> 1, arg1 >> 1, arg5, (var7.field10038 << 9) + 256, var7.field10040, var7.field10047 * 2, (var7.field10039 << 9) + 256);
                class386.field5515.method2645(class491.field6769[1] + arg6, var7.field10045 | 0xFF000000, var7.field10048, 0, 0, class491.field6769[0] + arg2);
            }
            var7 = (class726) class190.field2376.method3104(-10964);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lsja;B)V", line = 241)
    private final void method2050(class69 arg0, byte arg1) {
        class165 var3 = this.field4568;
        synchronized (this.field4568) {
            this.field4568.method1039(arg0, 0);
            this.field4568.notify();
        }
        if (arg1 != -68) {
            this.field4568 = null;
        }
        field4566++;
    }

    @OriginalMember(owner = "client!re", name = "run", descriptor = "()V", line = 255)
    public final void run() {
        field4561++;
        while (true) {
            class165 var1 = this.field4568;
            class474 var3;
            synchronized (this.field4568) {
                class69 var2;
                for (var2 = this.field4568.method1034(20791); var2 == null; var2 = this.field4568.method1034(20791)) {
                    try {
                        this.field4568.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class474)) {
                    return;
                }
                var3 = (class474) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field6581).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field6582 = var5;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 299)
    public final void method2051(int arg0) {
        field4565++;
        if (this.field4570 == null) {
            return;
        }
        this.method2050(new class69(), (byte) -68);
        try {
            if (arg0 < 121) {
                this.field4570 = null;
            }
            this.field4570.join();
        } catch (InterruptedException var2) {
        }
        this.field4570 = null;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 323)
    public class323() {
        this.field4570.setDaemon(true);
        this.field4570.start();
    }
}
