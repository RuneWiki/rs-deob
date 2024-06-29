import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class380 {

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "Ljava/lang/String;")
    public String field5455;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "Ljava/lang/String;")
    public String field5452;

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "Ljava/lang/String;")
    public String field5457;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "[I")
    public static int[] field5451 = new int[14];

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "[I")
    public static int[] field5456 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "Lcc;")
    public static class760 field5453 = new class760(0, 0);

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "Lke;")
    public static class622 field5458 = new class622(51, 4);

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "[Lia;")
    public static class613[] field5449;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lkia;ZI)V", line = 5)
    public static final void method2343(class645 arg0, boolean arg1, int arg2) {
        if (arg2 != 30845) {
            field5456 = null;
        }
        field5454++;
        if (class543.field7608 >= 400) {
            return;
        }
        class279 var3 = arg0.field9071;
        String var4 = arg0.field9095;
        if (var3.field3943 != null) {
            var3 = var3.method1810((byte) -117, class271.field3796);
            if (var3 == null) {
                return;
            }
            var4 = var3.field3877;
        }
        if (!var3.field3894) {
            return;
        }
        if (arg0.field9097 != 0) {
            String var5 = class536.field7555 == class23.field344 ? class674.field9581.method3825((byte) -10, class526.field7494) : class674.field9579.method3825((byte) -10, class526.field7494);
            var4 = var4 + class653.method3740(arg0.field9097, (byte) -128, class251.field3549.field7975) + " (" + var5 + arg0.field9097 + ")";
        }
        if (class26.field382 && !arg1) {
            class330 var6 = class466.field6628 == -1 ? null : class788.field10824.method1609(class466.field6628, arg2 - 30934);
            if ((class641.field9043 & 0x2) != 0 && (var6 == null || var3.method1809(-1, var6.field4920, class466.field6628) != var6.field4920)) {
                class231.field3354++;
                class502.method2933(23, class373.field5373 + " -> <col=ffff00>" + var4, true, -1, 6947, class361.field5239, class75.field1013, (long) arg0.field6361, false, false, 0, 0, (long) arg0.field6361);
            }
        }
        if (!arg1) {
            String[] var7 = var3.field3949;
            if (class547.field7724) {
                var7 = class602.method3481(-123, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field3921 == 0 || !var7[var8].equalsIgnoreCase(class674.field9574.method3825((byte) -10, class526.field7494)))) {
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 47;
                        }
                        int var10 = class23.field347;
                        if (var8 == 1) {
                            var9 = 5;
                        }
                        if (var8 == 2) {
                            var9 = 9;
                        }
                        if (var8 == 3) {
                            var9 = 46;
                        }
                        if (var3.field3882 == var8) {
                            var10 = var3.field3932;
                        }
                        if (var8 == 4) {
                            var9 = 17;
                        }
                        if (var3.field3873 == var8) {
                            var10 = var3.field3908;
                        }
                        class502.method2933(var9, "<col=ffff00>" + var4, true, -1, 6947, var7[var8], var7[var8].equalsIgnoreCase(class674.field9574.method3825((byte) -10, class526.field7494)) ? var3.field3886 : var10, (long) arg0.field6361, false, false, 0, 0, (long) arg0.field6361);
                        class500.field7091++;
                    }
                }
            }
            if (var3.field3921 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class674.field9574.method3825((byte) -10, class526.field7494))) {
                        short var12 = 0;
                        if (arg0.field9097 > class251.field3549.field7975) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 47;
                        }
                        if (var11 == 1) {
                            var13 = 5;
                        }
                        if (var11 == 2) {
                            var13 = 9;
                        }
                        if (var11 == 3) {
                            var13 = 46;
                        }
                        if (var11 == 4) {
                            var13 = 17;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class502.method2933(var13, "<col=ffff00>" + var4, true, -1, arg2 ^ 0x635E, var7[var11], var3.field3886, (long) arg0.field6361, false, false, 0, 0, (long) arg0.field6361);
                        class519.field7413++;
                    }
                }
            }
        }
        class502.method2933(1002, "<col=ffff00>" + var4, true, -1, 6947, class674.field9573.method3825((byte) -10, class526.field7494), class788.field10830, (long) arg0.field6361, arg1, false, 0, 0, (long) arg0.field6361);
        class424.field5976++;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V", line = 169)
    public static void method2344(int arg0) {
        field5456 = null;
        field5449 = null;
        field5458 = null;
        field5453 = null;
        if (arg0 != 0) {
            method2344(51);
        }
        field5451 = null;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V", line = 193)
    public static final void method2345(boolean arg0) {
        class387 var1 = class211.field3052;
        synchronized (class211.field3052) {
            class211.field3052.method2364(1);
            if (!arg0) {
                method2345(true);
            }
        }
        field5450++;
        class387 var2 = class204.field2986;
        synchronized (class204.field2986) {
            class204.field2986.method2364(1);
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 216)
    public class380(String arg0, String arg1, String arg2) {
        this.field5455 = arg1;
        this.field5452 = arg0;
        this.field5457 = arg2;
    }
}
