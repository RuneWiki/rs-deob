import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class111 implements Runnable {

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Lu;")
    private class219 field1878 = new class219();

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public int field1893 = 0;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "Z")
    private boolean field1894 = false;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Ljava/lang/Thread;")
    private Thread field1892;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1872 = 0;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "J")
    public static long field1882 = 0L;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lph;")
    public static class229 field1879 = class266.method1858("W-=hlen Sie eine Option", 0);

    @OriginalMember(owner = "client!di", name = "u", descriptor = "Lph;")
    public static class229 field1891 = class266.method1858("Chargement des polices )2 ", 0);

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Lph;")
    public static class229 field1887 = class266.method1858("Fertigkeit: ", 0);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Lsi;")
    public static class66 field1876;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILln;)V", line = 6)
    private final void method842(int arg0, class43 arg1) {
        class219 var3 = this.field1878;
        synchronized (this.field1878) {
            if (arg0 != 2) {
                this.method842(28, (class43) null);
            }
            this.field1878.method1532(arg0 + 110, arg1);
            this.field1893++;
            this.field1878.notifyAll();
        }
        field1880++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILkh;)Lln;", line = 23)
    public final class43 method843(int arg0, int arg1, class250 arg2) {
        class43 var4 = new class43();
        var4.field668 = 1;
        field1875++;
        class219 var5 = this.field1878;
        synchronized (this.field1878) {
            class43 var6 = (class43) this.field1878.method1529((byte) 0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field468 && var6.field670 == arg2 && var6.field668 == 2) {
                    var4.field725 = false;
                    var4.field655 = var6.field655;
                    return var4;
                }
                var6 = (class43) this.field1878.method1533(3);
            }
        }
        var4.field655 = arg2.method1752(arg0, 749985960);
        int var8 = 89 % ((-arg1 - 44) / 55);
        var4.field727 = true;
        var4.field725 = false;
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 63)
    public final void method844(int arg0) {
        field1871++;
        this.field1894 = true;
        class219 var2 = this.field1878;
        synchronized (this.field1878) {
            this.field1878.notifyAll();
        }
        try {
            this.field1892.join();
            if (arg0 != 0) {
                field1882 = 50L;
            }
        } catch (InterruptedException var5) {
        }
        this.field1892 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BZ)Lfg;", line = 82)
    public static final class81 method845(byte[] arg0, boolean arg1) {
        field1873++;
        if (arg0 == null) {
            return null;
        }
        class81 var2 = new class81(arg0, class303.field5064, class27.field387, class36.field597, class288.field4729, class279.field4623);
        if (arg1) {
            class214.method1517(-25672);
            return var2;
        } else {
            return (class81) null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BILkh;I)Lln;", line = 101)
    public final class43 method846(byte[] arg0, int arg1, class250 arg2, int arg3) {
        field1890++;
        class43 var5 = new class43();
        var5.field668 = 2;
        var5.field727 = false;
        var5.field655 = arg0;
        var5.field468 = (long) arg1;
        var5.field670 = arg2;
        this.method842(arg3 + 2, var5);
        if (arg3 != 0) {
            field1882 = -25L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!di", name = "run", descriptor = "()V", line = 121)
    public final void run() {
        field1888++;
        while (!this.field1894) {
            class219 var1 = this.field1878;
            class43 var2;
            synchronized (this.field1878) {
                var2 = (class43) this.field1878.method1536((byte) 116);
                if (var2 == null) {
                    try {
                        this.field1878.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1893--;
            }
            try {
                if (var2.field668 == 2) {
                    var2.field670.method1754(var2.field655.length, var2.field655, 27336, (int) var2.field468);
                } else if (var2.field668 == 3) {
                    var2.field655 = var2.field670.method1752((int) var2.field468, 749985960);
                }
            } catch (Exception var6) {
                class110.method834((String) null, var6, -1);
            }
            var2.field725 = false;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 174)
    public static void method847(byte arg0) {
        if (arg0 <= 10) {
            method850(113, 51);
        }
        field1879 = null;
        field1887 = null;
        field1876 = null;
        field1891 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Lan;", line = 188)
    public static final class116 method848(int arg0, int arg1) {
        field1877++;
        class116 var2 = (class116) class193.field3188.method1027(-28, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class195.field3270.method523(-16, arg0, 5);
        class116 var4 = new class116();
        if (arg1 != 0) {
            field1891 = (class229) null;
        }
        if (var3 != null) {
            var4.method874((byte) -94, new class164(var3));
        }
        class193.field3188.method1026(var4, 120, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILsi;)V", line = 219)
    public static final void method849(int arg0, class66 arg1) {
        field1881++;
        class303.field5060 = class332.method2274(0, (byte) 27, arg1, class177.field2920);
        class181.field2959 = new class32[class303.field5060.length];
        class250.field4160 = new class32[class303.field5060.length];
        class69.field1102 = new class32[class303.field5060.length];
        for (int var2 = 0; var2 < class303.field5060.length; var2++) {
            class303.field5060[var2].method273();
            class181.field2959[var2] = class303.field5060[var2].method268();
            class303.field5060[var2].method273();
            class250.field4160[var2] = class303.field5060[var2].method268();
            class303.field5060[var2].method273();
            class69.field1102[var2] = class303.field5060[var2].method268();
            class303.field5060[var2].method273();
        }
        class105.field1779 = class307.method2076(arg1, (byte) -64, 0, class255.field4255);
        class74.field1250 = class71.method559(class131.field2131, 0, 0, arg1);
        class37.field602 = class71.method559(class37.field601, 0, 0, arg1);
        class250.field4161 = class71.method559(class271.field4545, 0, 0, arg1);
        class145.field2355 = class71.method559(class154.field2512, 0, 0, arg1);
        class300.field4872 = class101.method777(arg1, 0, (byte) -22, class6.field81);
        class314.field5342 = class101.method777(arg1, 0, (byte) 98, class266.field4483);
        class239.field3954 = class48.method339(0, -103, class234.field3863, arg1);
        class307.field5182 = class101.method777(arg1, 0, (byte) 100, class216.field3552);
        class243.field4014 = class101.method777(arg1, 0, (byte) -99, class192.field3173);
        class58.field820 = class203.method1424(class268.field4495, arg1, (byte) -118, 0);
        class260.field4346 = class203.method1424(class298.field4850, arg1, (byte) -128, 0);
        class325.field5552.method254(class260.field4346, (int[]) null);
        class237.field3905.method254(class260.field4346, (int[]) null);
        class213.field3517.method254(class260.field4346, (int[]) null);
        if (class99.field1675) {
            class137.field2226 = class332.method2274(0, (byte) 50, arg1, class273.field4563);
            for (int var3 = 0; var3 < class137.field2226.length; var3++) {
                class137.field2226[var3].method267();
            }
        }
        class327 var4 = class191.method1342(0, arg1, (byte) -68, class29.field479);
        var4.method2248();
        if (class99.field1675) {
            class234.field3864 = new class87(var4);
        } else {
            class234.field3864 = var4;
        }
        int var5 = 87 / ((-arg0 - 16) / 63);
        class327[] var6 = class307.method2076(arg1, (byte) -64, 0, class59.field837);
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7].method2248();
        }
        if (class99.field1675) {
            class221.field3625 = new class293[var6.length];
            for (int var8 = 0; var8 < var6.length; var8++) {
                class221.field3625[var8] = new class87(var6[var8]);
            }
        } else {
            class221.field3625 = var6;
        }
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        int var12 = (int) (Math.random() * 21.0D) - 10;
        for (int var13 = 0; var13 < class105.field1779.length; var13++) {
            class105.field1779[var13].method2237(var10 + var11, var9 + var11, var11 + var12);
        }
        class303.field5060[0].method274(var10 + var11, var9 + var11, var11 + var12);
        if (class99.field1675) {
            class217.field3558 = new class293[class105.field1779.length];
            for (int var14 = 0; var14 < class105.field1779.length; var14++) {
                class217.field3558[var14] = new class87(class105.field1779[var14]);
            }
        } else {
            class217.field3558 = class105.field1779;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)I", line = 345)
    public static final int method850(int arg0, int arg1) {
        field1886++;
        if (arg0 < 114) {
            method850(-22, -50);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBLkh;)Lln;", line = 356)
    public final class43 method851(int arg0, byte arg1, class250 arg2) {
        field1889++;
        class43 var4 = new class43();
        var4.field670 = arg2;
        if (arg1 < 82) {
            method849(116, (class66) null);
        }
        var4.field468 = (long) arg0;
        var4.field727 = false;
        var4.field668 = 3;
        this.method842(2, var4);
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 519)
    public class111() {
        class247 var1 = class249.field4143.method685(5, this, (byte) 118);
        while (var1.field4125 == 0) {
            class288.method1976((byte) 90, 10L);
        }
        if (var1.field4125 == 2) {
            throw new RuntimeException();
        }
        this.field1892 = (Thread) var1.field4123;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIII)V", line = 384)
    public static final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class263.method1828((byte) 95, arg0);
        field1885++;
        int var7 = -arg0;
        int var8 = 0;
        int var9 = arg0;
        int var10 = arg0 - arg6;
        if (var10 < arg2) {
            var10 = 0;
        }
        int var11 = -var10;
        int var12 = -1;
        int var13 = var10;
        int var14 = -1;
        int[] var15 = class202.field3337[arg1];
        int var16 = arg3 - var10;
        class193.method1354((byte) -37, var16, arg3 - arg0, arg5, var15);
        int var17 = arg3 + var10;
        class193.method1354((byte) -37, var17, var16, arg4, var15);
        class193.method1354((byte) -37, arg0 + arg3, var17, arg5, var15);
        while (var9 > var8) {
            var14 += 2;
            var11 += var14;
            if (var11 >= 0 && var13 >= 1) {
                class161.field2602[var13] = var8;
                var13--;
                var11 -= var13 << 1;
            }
            var8++;
            var12 += 2;
            var7 += var12;
            if (var7 >= 0) {
                var9--;
                var7 -= var9 << 1;
                if (var9 >= var10) {
                    int[] var18 = class202.field3337[arg1 - var9];
                    int var19 = arg3 + var8;
                    int[] var20 = class202.field3337[arg1 + var9];
                    int var21 = arg3 - var8;
                    class193.method1354((byte) -37, var19, var21, arg5, var20);
                    class193.method1354((byte) -37, var19, var21, arg5, var18);
                } else {
                    int[] var22 = class202.field3337[arg1 + var9];
                    int[] var23 = class202.field3337[arg1 - var9];
                    int var24 = arg3 + var8;
                    int var25 = class161.field2602[var9];
                    int var26 = arg3 - var8;
                    int var27 = arg3 + var25;
                    int var28 = arg3 - var25;
                    class193.method1354((byte) -37, var28, var26, arg5, var22);
                    class193.method1354((byte) -37, var27, var28, arg4, var22);
                    class193.method1354((byte) -37, var24, var27, arg5, var22);
                    class193.method1354((byte) -37, var28, var26, arg5, var23);
                    class193.method1354((byte) -37, var27, var28, arg4, var23);
                    class193.method1354((byte) -37, var24, var27, arg5, var23);
                }
            }
            int var29 = arg3 + var9;
            int[] var30 = class202.field3337[arg1 + var8];
            int[] var31 = class202.field3337[arg1 - var8];
            int var32 = arg3 - var9;
            if (var10 <= var8) {
                class193.method1354((byte) -37, var29, var32, arg5, var30);
                class193.method1354((byte) -37, var29, var32, arg5, var31);
            } else {
                int var33 = var13 >= var8 ? var13 : class161.field2602[var8];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class193.method1354((byte) -37, var35, var32, arg5, var30);
                class193.method1354((byte) -37, var34, var35, arg4, var30);
                class193.method1354((byte) -37, var29, var34, arg5, var30);
                class193.method1354((byte) -37, var35, var32, arg5, var31);
                class193.method1354((byte) -37, var34, var35, arg4, var31);
                class193.method1354((byte) -37, var29, var34, arg5, var31);
            }
        }
    }
}
