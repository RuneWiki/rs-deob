import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class340 implements Runnable {

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lvf;")
    private class166 field4882 = new class166();

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field4871 = new Thread(this);

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field4877 = 0;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field4881 = -1;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lss;")
    public static class140 field4884;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Ltg;")
    public static class318 field4883;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lpt;I)V")
    private final void method2063(class147 arg0, int arg1) {
        field4880++;
        class166 var3 = this.field4882;
        synchronized (this.field4882) {
            this.field4882.method803(arg0, 50);
            if (arg1 > 27) {
                this.field4882.notify();
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V")
    public static final void method2064(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -7207) {
            method2065(-67, 110, -119);
        }
        field4878++;
        String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        class172.method848(var4, (byte) 1, true);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
    public static final void method2065(int arg0, int arg1, int arg2) {
        field4875++;
        if (arg0 != 0) {
            method2064(106, -56, -90, -67);
        }
        if (class480.method2837((byte) -78, arg2)) {
            class50.method263(arg0 + 109, arg1, class284.field4130[arg2]);
        }
    }

    @OriginalMember(owner = "client!mc", name = "run", descriptor = "()V")
    public final void run() {
        field4872++;
        while (true) {
            class166 var1 = this.field4882;
            class290 var3;
            synchronized (this.field4882) {
                class147 var2;
                for (var2 = this.field4882.method810(26315); var2 == null; var2 = this.field4882.method810(26315)) {
                    try {
                        this.field4882.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class290)) {
                    return;
                }
                var3 = (class290) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field4321).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field4324 = var5;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method2066(int arg0) {
        if (arg0 != 1496702376) {
            field4884 = null;
        }
        field4883 = null;
        field4884 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIIIII)V")
    public static final void method2067(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4874++;
        if (class293.field4356 == null) {
            class231.field3205.method1759(-6923, arg4, arg1, arg5, -16777216, arg3);
        } else if (class19.field258.field1008 >= 0 && class159.field1895 * 128 > class19.field258.field1008 && class19.field258.field1005 >= 0 && (class289.field4316 * 128) > class19.field258.field1005) {
            class154.field1858++;
            if (class19.field258 != null && (class19.field258.field1008 + 64 - (class19.field258.method1012(false) * 64) >> 7) == class158.field1886 && class19.field258.field1005 + 64 - class19.field258.method1012(false) * 64 >> 7 == class4.field52) {
                class158.field1886 = -1;
                class4.field52 = -1;
                class101.method492((byte) 118);
            }
            class182.method986(-127);
            if (!arg0) {
                class134.method636(0);
            }
            class153.method736(arg2 ^ 0x63AE);
            class225.method1244(true, arg5, arg1, arg4, 5172, arg3);
            int var6 = class280.field4080;
            int var7 = class324.field4678;
            int var8 = class61.field766;
            int var9 = class118.field1460;
            if (class358.field5167 == 1) {
                int var12 = (int) class31.field389;
                if (var12 < (class192.field2643 >> 8)) {
                    var12 = class192.field2643 >> 8;
                }
                if (class141.field1696[4] && var12 < class329.field4742[4] + 128) {
                    var12 = class329.field4742[4] + 128;
                }
                int var13 = (int) class349.field5021 + class2.field12 & 0x3FFF;
                class105.method501(class375.method2264(arg2 + 23981, class19.field258.field1005, class100.field1217, class19.field258.field1008) - 50, (byte) -77, (var12 >> 3) * 3 + 600, class191.field2617, var12, class186.field2445, var13, var9);
            } else if (class358.field5167 == 4) {
                int var10 = (int) class31.field389;
                if (var10 < (class192.field2643 >> 8)) {
                    var10 = class192.field2643 >> 8;
                }
                if (class141.field1696[4] && (class329.field4742[4] + 128) > var10) {
                    var10 = class329.field4742[4] + 128;
                }
                int var11 = (int) class349.field5021 & 0x3FFF;
                class105.method501(class375.method2264(arg2 ^ 0x65BD, class369.field5280, class100.field1217, class255.field3554) - 50, (byte) -77, (var10 >> 3) * 3 + 600, class191.field2617, var10, class186.field2445, var11, var9);
            } else if (class358.field5167 == 5) {
                class414.method2457(2602, var9);
            }
            int var14 = class58.field734;
            int var15 = class427.field6145;
            int var16 = class351.field5047;
            int var17 = class120.field1490;
            int var18 = class13.field193;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class141.field1696[var19]) {
                    int var22 = (int) (Math.random() * (double) (class240.field3302[var19] * 2 + 1) + Math.sin((double) class110.field1349[var19] / 100.0D * (double) class293.field4350[var19]) * (double) class329.field4742[var19] - (double) class240.field3302[var19]);
                    if (var19 == 2) {
                        class351.field5047 += var22;
                    }
                    if (var19 == 0) {
                        class58.field734 += var22;
                    }
                    if (var19 == 3) {
                        class13.field193 = class13.field193 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class427.field6145 += var22;
                    }
                    if (var19 == 4) {
                        class120.field1490 += var22;
                        if (class120.field1490 < 1024) {
                            class120.field1490 = 1024;
                        } else if (class120.field1490 > 3072) {
                            class120.field1490 = 3072;
                        }
                    }
                }
            }
            if (class58.field734 < 0) {
                class58.field734 = 0;
            }
            if (class351.field5047 < 0) {
                class351.field5047 = 0;
            }
            if ((class176.field2122 << 7) - 1 < class58.field734) {
                class58.field734 = (class176.field2122 << 7) - 1;
            }
            if (class351.field5047 > ((class225.field3116 << 7) - 1)) {
                class351.field5047 = (class225.field3116 << 7) - 1;
            }
            if (arg2 == -25528) {
                class57.method293(arg2 - 3225);
                class354.method2147((byte) 93);
                class231.field3205.method1351(var7, var6, var7 + var8, var6 + var9);
                class231.field3205.method1341();
                int var20 = class88.field1098;
                if (class381.field5395 == null) {
                    class231.field3205.method1444(var20);
                } else {
                    class381.field5395.method1042(class120.field1490, var9, class352.field5064 << 3, var7, var8, class231.field3205, var20, class13.field193, 0, var6);
                }
                class199.method1094((byte) -47);
                class29.field379.method549(class58.field734, class427.field6145, class351.field5047, -class120.field1490 & 0x3FFF, -class13.field193 & 0x3FFF, -class401.field5718 & 0x3FFF);
                class231.field3205.method1404(class29.field379);
                class231.field3205.method1468(var8 / 2 + var7, var9 / 2 + var6, class191.field2622 << 1, class191.field2622 << 1);
                class142.method671(var8 / 2 + var7, 14412, class191.field2622 << 1, var6 + (var9 / 2), class191.field2622 << 1);
                class450.method2638(class58.field734, -class13.field193 & 0x3FFF, class351.field5047, class427.field6145, (byte) 75, -class120.field1490 & 0x3FFF, -class401.field5718 & 0x3FFF);
                byte var21 = class204.method1109(false) == 2 ? (byte) class154.field1858 : 1;
                class71.method365(class231.field3205, class204.field2796, class440.field6298, class29.field379, class58.field734, class427.field6145, class351.field5047, class276.field3945, class181.field2330, class208.field2885, class173.field2087, class52.field682, class188.field2548, class19.field258.field994 + 1, var21, class19.field258.field1008 >> 7, class19.field258.field1005 >> 7, !class191.field2611);
                class199.method1094((byte) -47);
                if (class453.field6415 == 30) {
                    class147.method700(256, var8, var6, var7, 256, (byte) 127, var9);
                    class299.method1885((byte) 111, var7, var9, 256, 256, var6, var8);
                    class294.method1846(var9, 256, var7, 256, -11, var8, var6);
                    class37.method193(0, var7, var8, var9, var6);
                }
                class205.method1121();
                class13.field193 = var18;
                class351.field5047 = var16;
                class427.field6145 = var15;
                class58.field734 = var14;
                class120.field1490 = var17;
                if (class92.field1148 && class331.field4766.method1025(arg2 + 25433) == 0) {
                    class92.field1148 = false;
                }
                if (class92.field1148) {
                    class231.field3205.method1759(-6923, var9, var8, var6, -16777216, var7);
                    class291.method1835(false, class273.field3875, class154.field1854.method205((byte) 119, class68.field849), false);
                }
            }
        } else {
            class231.field3205.method1759(-6923, arg4, arg1, arg5, -16777216, arg3);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZBZ)V")
    public static final void method2068(boolean arg0, byte arg1, boolean arg2) {
        if (arg0) {
            class40.field474--;
            if (class40.field474 == 0) {
                class424.field6109 = null;
            }
        }
        field4873++;
        if (arg2) {
            class160.field1928--;
            if (class160.field1928 == 0) {
                class89.field1121 = null;
            }
        }
        if (arg1 <= 48) {
            field4877 = 19;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public final void method2069(byte arg0) {
        field4876++;
        if (this.field4871 == null) {
            return;
        }
        this.method2063(new class147(), 51);
        try {
            this.field4871.join();
            if (arg0 != -2) {
                field4884 = null;
            }
        } catch (InterruptedException var2) {
        }
        this.field4871 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/lang/String;)Ljt;")
    public final class290 method2070(int arg0, String arg1) {
        field4879++;
        if (this.field4871 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg0 != 63) {
                method2065(-57, 64, -108);
            }
            class290 var3 = new class290(arg1);
            this.method2063(var3, 40);
            return var3;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class340() {
        this.field4871.setDaemon(true);
        this.field4871.start();
    }

    static {
        new class40("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field4884 = new class140(6, 7);
    }
}
