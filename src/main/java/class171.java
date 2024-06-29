import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class171 implements Runnable {

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Z")
    public boolean field2632 = true;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Ljava/lang/Object;")
    public Object field2635 = new Object();

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public int field2638 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "[I")
    public int[] field2639 = new int[500];

    @OriginalMember(owner = "client!af", name = "r", descriptor = "[I")
    public int[] field2641 = new int[500];

    @OriginalMember(owner = "client!af", name = "c", descriptor = "J")
    public static long field2626 = 0L;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2625 = 0;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field2634 = -1;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field2627 = 0;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lni;")
    public static class202 field2629;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([Leb;IB)V", line = 4)
    public static final void method1132(class253[] arg0, int arg1, byte arg2) {
        field2637++;
        if (arg2 != -105) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class253 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field4216 == 0) {
                    if (var4.field4275 != null) {
                        method1132(var4.field4275, arg1, (byte) -105);
                    }
                    class174 var5 = (class174) class81.field1253.method1372(false, (long) var4.field4206);
                    if (var5 != null) {
                        class8.method92(0, var5.field2660, arg1);
                    }
                }
                if (arg1 == 0 && var4.field4326 != null) {
                    class256 var6 = new class256();
                    var6.field4372 = var4.field4326;
                    var6.field4382 = var4;
                    class12.method122(var6, (byte) -61);
                }
                if (arg1 == 1 && var4.field4314 != null) {
                    if (var4.field4210 >= 0) {
                        class253 var7 = class172.method1140(var4.field4206, -122);
                        if (var7 == null || var7.field4275 == null || var4.field4210 >= var7.field4275.length || var7.field4275[var4.field4210] != var4) {
                            continue;
                        }
                    }
                    class256 var8 = new class256();
                    var8.field4372 = var4.field4314;
                    var8.field4382 = var4;
                    class12.method122(var8, (byte) -40);
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 78)
    public static void method1133(int arg0) {
        int var1 = 6 / ((arg0 + 5) / 51);
        field2629 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZILeb;)V", line = 98)
    public static final void method1134(boolean arg0, int arg1, class253 arg2) {
        int var3 = arg2.field4334 == 0 ? arg2.field4190 : arg2.field4334;
        field2630++;
        int var4 = arg2.field4307 == 0 ? arg2.field4228 : arg2.field4307;
        class214.method1414(arg0, (byte) 103, class256.field4376[arg2.field4206 >> 16], var4, var3, arg2.field4206);
        if (arg2.field4275 != null) {
            class214.method1414(arg0, (byte) 86, arg2.field4275, var4, var3, arg2.field4206);
        }
        class174 var5 = (class174) class81.field1253.method1372(false, (long) arg2.field4206);
        if (var5 != null) {
            class50.method382(var5.field2660, var3, 16132, var4, arg0);
        }
        if (arg1 > -21) {
            method1132((class253[]) null, 88, (byte) 32);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLni;Lni;Lni;Lni;)V", line = 119)
    public static final void method1135(boolean arg0, class202 arg1, class202 arg2, class202 arg3, class202 arg4) {
        class29.field479 = arg1;
        if (arg0) {
            method1136(-6, 14);
        }
        class274.field4682 = arg4;
        field2636++;
        class252.field4179 = arg2;
        client.field1753 = arg3;
        class256.field4376 = new class253[class29.field479.method1332((byte) 125)][];
        class97.field1443 = new boolean[class29.field479.method1332((byte) 126)];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lu;", line = 137)
    public static final class33 method1136(int arg0, int arg1) {
        field2640++;
        class33 var2 = (class33) class212.field3377.method521((long) arg0, (byte) 80);
        if (arg1 != -6722) {
            field2634 = -57;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class248.field4113.method1342(32, class278.method1889(arg0, false), class208.method1371(arg0, 80));
        class33 var4 = new class33();
        if (var3 != null) {
            var4.method229(new class221(var3), -2);
        }
        var4.method224(arg1 + 6847);
        class212.field3377.method519((byte) -95, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "run", descriptor = "()V", line = 184)
    public final void run() {
        field2631++;
        while (this.field2632) {
            Object var1 = this.field2635;
            synchronized (this.field2635) {
                if (this.field2638 < 500) {
                    this.field2641[this.field2638] = class271.field4636;
                    this.field2639[this.field2638] = class18.field308;
                    this.field2638++;
                }
            }
            class116.method759(-1, 50L);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIZI)V", line = 218)
    public static final void method1137(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class130.field1948 < 100) {
            class16.method142(false);
        }
        class124.method822(arg0, arg1, arg0 + arg4, arg1 + arg2);
        field2624++;
        if (class130.field1948 < 100) {
            byte var5 = 20;
            int var6 = arg2 / 2 + arg1 - var5 - 18;
            int var7 = arg0 + (arg4 / 2);
            class124.method826(arg0, arg1, arg4, arg2, 0);
            class124.method823(var7 - 152, var6, 304, 34, 9179409);
            class124.method823(var7 - 151, var6 - -1, 302, 32, 0);
            class124.method826(var7 - 150, var6 + 2, class130.field1948 * 3, 30, 9179409);
            class124.method826(var7 + (class130.field1948 * 3) - 150, var6 - -2, 300 - class130.field1948 * 3, 30, 0);
            class201.field3197.method2019(class221.field3619, var7, var6 + var5, 16777215, -1);
            return;
        }
        class136.field2017 = (int) ((float) (arg4 * 2) / class98.field1473);
        class270.field4634 = class14.field269 - ((int) ((float) arg2 / class98.field1473));
        class93.field1414 = class284.field4811 - ((int) ((float) arg4 / class98.field1473));
        int var8 = class284.field4811 - (int) ((float) arg4 / class98.field1473);
        class62.field973 = (int) ((float) (arg2 * 2) / class98.field1473);
        int var9 = class14.field269 - ((int) ((float) arg2 / class98.field1473));
        int var10 = (int) ((float) arg4 / class98.field1473) + class284.field4811;
        int var11 = class14.field269 + ((int) ((float) arg2 / class98.field1473));
        if (class276.field4710 == null || class276.field4710.field3918 != arg4 || class276.field4710.field3914 != arg2) {
            class276.field4710 = null;
            class276.field4710 = new class30(arg4, arg2);
        }
        class191.method1254(class276.field4710.field3652, arg4, arg2);
        class104.method660(var11, arg2, var9, 0, 0, var10, true, var8, arg4);
        class228.method1611(-14784, var9, 0, var8, var10, 0, arg4, var11, arg2);
        class24.method186(var11, var8, arg4, var9, 0, 0, arg2, arg3, var10);
        class276.field4710.method214(arg0, arg1);
        if (class286.field4819 > 0) {
            class286.field4819--;
        }
        if (!class197.field3131) {
            return;
        }
        int var12 = 16776960;
        int var13 = arg0 + arg4 - 5;
        int var14 = arg2 + arg1 - 8;
        class72.field1127.method2017(class288.method1940((byte) 67, new class5[] { class106.field1584, class175.method1148(class266.field4545, arg3) }), var13, var14, 16776960, -1);
        int var17 = var14 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var12 = 16711680;
        }
        class72.field1127.method2017(class288.method1940((byte) 78, new class5[] { class192.field2987, class175.method1148(var16, false), class43.field649 }), var13, var17, var12, -1);
        var14 = var17 - 15;
    }
}
