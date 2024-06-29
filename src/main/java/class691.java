import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class691 extends class154 {

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "I")
    public int field9441 = (int) (class584.method3191(1) / 1000L);

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "S")
    public short field9435;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "Ljava/lang/String;")
    public String field9437;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "Lnj;")
    public static class415 field9436 = new class415(39, 8);

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "Lbc;")
    public static class9 field9442 = new class9(512);

    @OriginalMember(owner = "client!jv", name = "C", descriptor = "Lnj;")
    public static class415 field9447 = new class415(7, 3);

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "Lgda;")
    public static class486 field9440;

    @OriginalMember(owner = "client!jv", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field9448;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)V", line = 3)
    public static final void method3761(int arg0, int arg1, int arg2) {
        field9444++;
        class367 var3 = class573.method3057(6, arg2, 2);
        var3.method2115(1);
        if (arg0 > -117) {
            field9436 = null;
        }
        var3.field4735 = arg1;
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)V", line = 20)
    public static void method3762(int arg0) {
        field9436 = null;
        field9447 = null;
        field9440 = null;
        if (arg0 != 5759) {
            method3764(null, -93);
        }
        field9448 = null;
        field9442 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZ)Z", line = 35)
    public static final boolean method3763(int arg0, boolean arg1) {
        if (arg1) {
            method3764(null, -74);
        }
        field9438++;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 48)
    public static final void method3764(String arg0, int arg1) {
        field9439++;
        if (arg1 != 13864) {
            field9442 = null;
        }
        System.out.println("Error: " + class527.method2811("%0a", arg0, true, "\n"));
    }

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)V", line = 61)
    public static final void method3765(int arg0) {
        field9446++;
        if (arg0 != -8211) {
            method3761(-6, -98, -94);
        }
        for (class12 var1 = (class12) class407.field5178.method2090(true); var1 != null; var1 = (class12) class407.field5178.method2088(-152)) {
            class303 var2 = var1.field124;
            if (class424.field5503 > var2.field3963) {
                var1.method2438((byte) 123);
                var2.method1781((byte) 68);
            } else if (class424.field5503 >= var2.field3948) {
                if (var2.field3935 > 0) {
                    class234 var3 = (class234) class505.field6640.method39((long) (var2.field3935 - 1), 31750);
                    if (var3 != null) {
                        class532 var4 = var3.field3131;
                        if (var4.field506 >= 0 && class611.field8258 * 512 > var4.field506 && var4.field503 >= 0 && var4.field503 < class656.field9155 * 512) {
                            var2.method1780(var4.field503, class424.field5503, class332.method1916(arg0 + 1218453530, var4.field503, var2.field508, var4.field506) - var2.field3949, var4.field506, arg0 ^ 0xFFFFDFED);
                        }
                    }
                }
                if (var2.field3935 < 0) {
                    int var5 = -var2.field3935 - 1;
                    class193 var6;
                    if (class353.field4536 == var5) {
                        var6 = class233.field3130;
                    } else {
                        var6 = class592.field8019[var5];
                    }
                    if (var6 != null && var6.field506 >= 0 && var6.field506 < (class611.field8258 * 512) && var6.field503 >= 0 && class656.field9155 * 512 > var6.field503) {
                        var2.method1780(var6.field503, class424.field5503, class332.method1916(1218445319, var6.field503, var2.field508, var6.field506) - var2.field3949, var6.field506, arg0 + 8211);
                    }
                }
                var2.method1777(class57.field767, 12864);
                class587.method3203(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 130)
    public class691(String arg0, int arg1) {
        this.field9435 = (short) arg1;
        this.field9437 = arg0;
    }
}
