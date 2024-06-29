import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class357 implements Runnable {

    @OriginalMember(owner = "client!im", name = "f", descriptor = "[Ltj;")
    public volatile class354[] field5579 = new class354[2];

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Z")
    public volatile boolean field5576 = false;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Z")
    public volatile boolean field5583 = false;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Ljh;")
    public static class276 field5581 = new class276();

    @OriginalMember(owner = "client!im", name = "m", descriptor = "Lcc;")
    public static class327 field5586 = new class327(64);

    @OriginalMember(owner = "client!im", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5589 = "Face here";

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lpm;")
    public class69 field5578;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "[Lma;")
    public static class145[] field5584;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 7)
    public static final void method2477(int arg0, Component arg1) {
        Method var2 = class69.field890;
        field5580++;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg0 == 30) {
            arg1.addKeyListener(class35.field427);
            arg1.addFocusListener(class35.field427);
        }
    }

    @OriginalMember(owner = "client!im", name = "run", descriptor = "()V", line = 29)
    public final void run() {
        this.field5583 = true;
        field5582++;
        try {
            while (!this.field5576) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class354 var2 = this.field5579[var1];
                    if (var2 != null) {
                        var2.method2460((byte) -120);
                    }
                }
                class177.method1299((byte) 64, 10L);
                class279.method1884(this.field5578, (Object) null, false);
            }
        } catch (Exception var7) {
            class347.method2409(var7, 3924, (String) null);
        } finally {
            this.field5583 = false;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)Lgb;", line = 69)
    public static final class196 method2478(byte arg0, int arg1) {
        if (arg0 != -24) {
            field5589 = (String) null;
        }
        field5587++;
        return class17.field209 && class74.field974 <= arg1 && class249.field3621 >= arg1 ? class49.field651[arg1 - class74.field974] : null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBIII)V", line = 84)
    public static final void method2479(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5585++;
        if (class82.field1061 < 100) {
            class319.method2201((byte) -39);
        }
        if (class47.field623) {
            class129.method989(arg3, arg2, arg3 + arg4, arg0 + arg2);
        } else {
            class37.method235(arg3, arg2, arg3 + arg4, arg0 + arg2);
        }
        if (class82.field1061 < 100) {
            byte var16 = 20;
            int var17 = arg4 / 2 + arg3;
            int var18 = arg2 + (arg0 / 2) - var16 - 18;
            if (class47.field623) {
                class129.method997(arg3, arg2, arg4, arg0, 0);
                class129.method986(var17 - 152, var18, 304, 34, 9179409);
                class129.method997(var17 - 150, var18 - -2, class82.field1061 * 3, 30, 9179409);
            } else {
                class37.method231(arg3, arg2, arg4, arg0, 0);
                class37.method248(var17 - 152, var18, 304, 34, 9179409);
                class37.method231(var17 - 150, var18 + 2, class82.field1061 * 3, 30, 9179409);
            }
            class186.field2554.method1911(class24.field274, var17, var18 + var16, 16777215, -1);
            return;
        }
        class248.field3608 = (int) ((float) (arg0 * 2) / class38.field463);
        class119.field1551 = class35.field428 - ((int) ((float) arg0 / class38.field463));
        class321.field4707 = class32.field393 - ((int) ((float) arg4 / class38.field463));
        class56.field721 = (int) ((float) (arg4 * 2) / class38.field463);
        int var5 = class32.field393 - ((int) ((float) arg4 / class38.field463));
        int var6 = class35.field428 - (int) ((float) arg0 / class38.field463);
        if (arg1 >= -111) {
            method2482((byte) -76);
        }
        int var7 = (int) ((float) arg4 / class38.field463) + class32.field393;
        int var8 = (int) ((float) arg0 / class38.field463) + class35.field428;
        if (class47.field623) {
            if (class176.field2411 == null || class176.field2411.field2252 != arg4 || class176.field2411.field2250 != arg0) {
                class176.field2411 = null;
                class176.field2411 = new class11(arg4, arg0);
            }
            class37.method250(class176.field2411.field124, arg4, arg0);
            class38.method266(var5, var6, var7, var8, 0, 0, arg4, arg0 + 1);
            class38.method268();
            class54 var10 = class38.method262();
            class264.method1819(var10, arg3, 5938, arg2);
            class176.field2411.method74();
            class129.method993(class176.field2411.field124, arg3, arg2, arg4, arg0);
            class37.field452 = null;
        } else {
            class38.method266(var5, var6, var7, var8, arg3, arg2, arg3 + arg4, arg0 + 1 + arg2);
            class38.method268();
            class54 var9 = class38.method262();
            class264.method1819(var9, 0, 5938, 0);
        }
        if (class308.field4544 > 0) {
            class193.field2672--;
            if (class193.field2672 == 0) {
                class193.field2672 = 20;
                class308.field4544--;
            }
        }
        if (!class234.field3352) {
            return;
        }
        int var11 = arg3 + arg4 - 5;
        int var12 = 16776960;
        int var13 = arg0 + arg2 - 8;
        class235.field3374.method1915("Fps:" + class287.field4153, var11, var13, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var19 = var13 - 15;
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var15 > 65536) {
            var12 = 16711680;
        }
        class235.field3374.method1915("Mem:" + var15 + "k", var11, var19, var12, -1);
        var13 = var19 - 15;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 201)
    public static final void method2480(int arg0) {
        field5575++;
        int var1 = -84 / ((-arg0 - 31) / 36);
        class101.field1322 = null;
        class289.field4182 = null;
        class343.field5341 = null;
        class109.field1416 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIZ)V", line = 213)
    public static final void method2481(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5577++;
        if (arg4) {
            field5589 = (String) null;
        }
        if (class245.field3574 <= arg0 && class321.field4722 >= arg0) {
            int var5 = class289.method1984(class207.field2937, arg1, 1, class25.field292);
            int var6 = class289.method1984(class207.field2937, arg2, 1, class25.field292);
            class32.method205(arg0, arg3, var6, (byte) -30, var5);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 232)
    public static void method2482(byte arg0) {
        int var1 = 16 / ((9 - arg0) / 53);
        field5586 = null;
        field5584 = null;
        field5589 = null;
        field5581 = null;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V", line = 243)
    public static final void method2483(int arg0) {
        field5574++;
        if (class359.field5616 != null && class359.field5616.field4855 - (class359.field5616.method1699(-1) * 64 - 64) >> 7 == class116.field1499 && (class359.field5616.field4893 + 64 - (class359.field5616.method1699(-1) * 64) >> 7) == class5.field53) {
            class133.field1818 = false;
            class116.field1499 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class254.field3712[var1][var2] = 0;
            }
        }
        if (arg0 <= 65) {
            method2478((byte) -122, -87);
        }
        for (int var3 = 0; var3 < class112.field1441; var3++) {
            class239 var4 = class311.field4574[class288.field4157[var3]];
            if (var4 != null) {
                var4.field4876 = false;
            }
        }
        for (int var5 = 0; var5 < class257.field3747; var5++) {
            class169 var6 = class251.field3688[class305.field4455[var5]];
            if (var6 != null) {
                var6.field4876 = false;
            }
        }
    }
}
