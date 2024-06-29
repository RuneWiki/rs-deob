import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class211 implements Runnable {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
    public static boolean field3628 = false;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lcj;")
    public static class28 field3629;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final void method1365(byte arg0) {
        class2.field25 = null;
        class44.field777 = null;
        class136.field2517 = null;
        if (arg0 != -93) {
            field3628 = true;
        }
        class231.field4029 = null;
        class36.field541 = null;
        class199.field3443 = null;
        field3634++;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public static void method1366(byte arg0) {
        field3629 = null;
        int var1 = 9 % ((arg0 + 76) / 48);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final void method1367(int arg0) {
        class200.field3448.method1614(-51);
        field3632++;
        class162.field2901.method1614(-54);
        class170.field3020.method1614(-9);
        if (arg0 <= 52) {
            field3629 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "run", descriptor = "()V")
    public final void run() {
        field3633++;
        try {
            while (true) {
                class125 var1 = class256.field4499;
                class147 var2;
                synchronized (class256.field4499) {
                    var2 = (class147) class256.field4499.method873((byte) 76);
                }
                if (var2 == null) {
                    class91.method636(-5, 100L);
                    Object var3 = class251.field4416;
                    synchronized (class251.field4416) {
                        if (class1.field4 <= 1) {
                            class1.field4 = 0;
                            class251.field4416.notifyAll();
                            return;
                        }
                        class1.field4--;
                    }
                } else {
                    if (var2.field2684 == 0) {
                        var2.field2677.method609(var2.field2672, (int) var2.field1560, var2.field2672.length, (byte) -111);
                        class125 var4 = class256.field4499;
                        synchronized (class256.field4499) {
                            var2.method560(-17554);
                        }
                    } else if (var2.field2684 == 1) {
                        var2.field2672 = var2.field2677.method613((int) var2.field1560, true);
                        class125 var5 = class256.field4499;
                        synchronized (class256.field4499) {
                            class100.field1955.method866(var2, true);
                        }
                    }
                    Object var6 = class251.field4416;
                    synchronized (class251.field4416) {
                        if (class1.field4 <= 1) {
                            class1.field4 = 0;
                            class251.field4416.notifyAll();
                            return;
                        }
                        class1.field4 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class181.method1205((String) null, var17, 38);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)Ljb;")
    public static final class256 method1368(byte arg0) {
        int var1 = -82 % ((-arg0 - 66) / 35);
        int var2 = class2.field25[0] * class199.field3443[0];
        byte[] var3 = class44.field777[0];
        int[] var4 = new int[var2];
        field3630++;
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = class136.field2517[class115.method767(var3[var5], 255)];
        }
        class168 var6 = new class168(class11.field125, class54.field950, class36.field541[0], class231.field4029[0], class2.field25[0], class199.field3443[0], var4);
        method1365((byte) -93);
        return var6;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)V")
    public static final void method1369(byte arg0) {
        if (arg0 != -110) {
            method1369((byte) -69);
        }
        field3631++;
        int var1 = class162.field2910.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class162.field2910[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class192.field3320; var4++) {
                    if (class257.field4508[var4] == class202.field3469[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class257.field4508[class192.field3320] = class202.field3469[var2];
                    var3 = class192.field3320++;
                }
                class249 var5 = new class249(class162.field2910[var2]);
                int var6 = 0;
                while (class162.field2910[var2].length > var5.field4335 && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1674(1355769544);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3F;
                    int var11 = var8 >> 7 & 0x3F;
                    int var12 = (class202.field3469[var2] >> 8) * 64 + var11 - class3.field39;
                    int var13 = (class202.field3469[var2] & 0xFF) * 64 + var10 - class34.field512;
                    class206 var14 = class96.method665(var5.method1674(1355769544), arg0 ^ 0xFFFFFFAA);
                    if (class178.field3112[var7] == null && (var14.field3556 & 0x1) > 0 && class105.field2030 == var9 && var12 >= 0 && var14.field3561 + var12 < 104 && var13 >= 0 && var14.field3561 + var13 < 104) {
                        class178.field3112[var7] = new class37();
                        class37 var15 = class178.field3112[var7];
                        class49.field877[class160.field2869++] = var7;
                        var15.field2091 = class75.field1501;
                        var15.field548 = var14;
                        var15.field2046 = var15.field548.field3519;
                        var15.field2059 = var15.field548.field3550;
                        var15.field2080 = var15.field548.field3531;
                        var15.field2081 = var15.field548.field3577;
                        var15.field2097 = var15.field548.field3566;
                        var15.field2079 = var15.field548.field3525;
                        var15.field2048 = var15.field548.field3520;
                        var15.field2060 = var15.field548.field3561;
                        var15.field2090 = var15.field548.field3557;
                        if (var15.field2097 == 0) {
                            var15.field2064 = 0;
                        }
                        var15.method731(var13, (byte) -68, var12, true);
                    }
                }
            }
        }
    }
}
