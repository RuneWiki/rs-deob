import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class405 {

    @OriginalMember(owner = "client!es", name = "g", descriptor = "F")
    public static float field5580;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Lpo;")
    public static class585 field5579;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILhp;III)V")
    public static final void method2419(int arg0, class348 arg1, int arg2, int arg3, int arg4) {
        field5575++;
        if (arg3 != -492134130) {
            return;
        }
        long var5 = (long) (arg0 | arg2 << 14 | arg4 << 28);
        class234 var7 = (class234) class214.field3181.method337(var5, 1);
        if (var7 == null) {
            class234 var8 = new class234();
            class214.field3181.method341(var5, var8, (byte) 29);
            var8.field3367.method3594((byte) 114, arg1);
            return;
        }
        class730 var9 = class143.field2427.method1410((byte) 111, arg1.field4694);
        int var10 = var9.field10024;
        if (var9.field10042 == 1) {
            var10 = (arg1.field4693 + 1) * var10;
        }
        for (class348 var11 = (class348) var7.field3367.method3589((byte) -127); var11 != null; var11 = (class348) var7.field3367.method3591(0)) {
            class730 var12 = class143.field2427.method1410((byte) 54, var11.field4694);
            int var13 = var12.field10024;
            if (var12.field10042 == 1) {
                var13 = (var11.field4693 + 1) * var13;
            }
            if (var10 > var13) {
                class505.method2884(arg1, var11, 114);
                return;
            }
        }
        var7.field3367.method3594((byte) 118, arg1);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public static void method2420(boolean arg0) {
        if (!arg0) {
            field5579 = null;
        }
        field5579 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)[Leaa;")
    public static final class528[] method2421(byte arg0) {
        field5577++;
        int var1 = 24 / ((-arg0 - 75) / 35);
        return new class528[] { class554.field7830, class686.field9543, class682.field9499 };
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BCI)I")
    public static final int method2422(byte arg0, char arg1, int arg2) {
        field5574++;
        if (arg0 != 22) {
            field5579 = null;
        }
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var4 = Character.toLowerCase(arg1);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZZLwda;)V")
    public static final void method2423(boolean arg0, boolean arg1, class666 arg2) {
        field5578++;
        if (class690.field9574 >= 400) {
            return;
        }
        class568 var3 = arg2.field9253;
        String var4 = arg2.field9238;
        if (var3.field8023 != null) {
            var3 = var3.method3283((byte) -107, class694.field9613);
            if (var3 == null) {
                return;
            }
            var4 = var3.field8070;
        }
        if (!var3.field8073) {
            return;
        }
        if (arg2.field9250 != 0) {
            String var5 = class403.field5534 == class177.field2797 ? class641.field8848.method3566((byte) -104, class464.field6309) : class641.field8846.method3566((byte) -32, class464.field6309);
            var4 = var4 + class379.method2307((byte) -74, arg2.field9250, class235.field3379.field10647) + " (" + var5 + arg2.field9250 + ")";
        }
        if (class675.field9384 && !arg0) {
            class485 var6 = class220.field3234 == -1 ? null : class117.field2153.method1159((byte) -56, class220.field3234);
            if ((class448.field6148 & 0x2) != 0 && (var6 == null || var3.method3284(127, class220.field3234, var6.field6560) != var6.field6560)) {
                class712.field9805++;
                class596.method3396(true, false, -1, class340.field4584, 0, (long) arg2.field5288, class420.field5726 + " -> <col=ffff00>" + var4, 45, class508.field6980, (long) arg2.field5288, (byte) 34, false, 0);
            }
        }
        if (!arg0) {
            String[] var7 = var3.field8090;
            if (class691.field9594) {
                var7 = class311.method1977(5, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field8056 == 0 || !var7[var8].equalsIgnoreCase(class641.field8841.method3566((byte) -86, class464.field6309)))) {
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 5;
                        }
                        int var10 = class412.field5655;
                        if (var8 == 1) {
                            var9 = 52;
                        }
                        if (var8 == 2) {
                            var9 = 58;
                        }
                        if (var8 == 3) {
                            var9 = 3;
                        }
                        if (var8 == 4) {
                            var9 = 60;
                        }
                        if (var3.field8074 == var8) {
                            var10 = var3.field8048;
                        }
                        if (var3.field8055 == var8) {
                            var10 = var3.field8046;
                        }
                        class596.method3396(true, false, -1, var7[var8].equalsIgnoreCase(class641.field8841.method3566((byte) -47, class464.field6309)) ? var3.field8057 : var10, 0, (long) arg2.field5288, "<col=ffff00>" + var4, var9, var7[var8], (long) arg2.field5288, (byte) 34, false, 0);
                        class296.field4040++;
                    }
                }
            }
            if (var3.field8056 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class641.field8841.method3566((byte) -52, class464.field6309))) {
                        short var12 = 0;
                        if (class235.field3379.field10647 < arg2.field9250) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 5;
                        }
                        if (var11 == 1) {
                            var13 = 52;
                        }
                        if (var11 == 2) {
                            var13 = 58;
                        }
                        if (var11 == 3) {
                            var13 = 3;
                        }
                        if (var11 == 4) {
                            var13 = 60;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class324.field4439++;
                        class596.method3396(true, false, -1, var3.field8057, 0, (long) arg2.field5288, "<col=ffff00>" + var4, var13, var7[var11], (long) arg2.field5288, (byte) 34, false, 0);
                    }
                }
            }
        }
        class735.field10154++;
        class596.method3396(true, arg1, -1, class180.field2826, 0, (long) arg2.field5288, "<col=ffff00>" + var4, 1009, class641.field8840.method3566((byte) -93, class464.field6309), (long) arg2.field5288, (byte) 34, arg0, 0);
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)V")
    public static final void method2424(boolean arg0) {
        class534 var1 = (class534) class208.field3119.method3589((byte) -127);
        if (!arg0) {
            method2424(true);
        }
        while (var1 != null) {
            if (class37.method229(var1.field7229, -7)) {
                class165.method1289(false, var1);
            }
            var1 = (class534) class208.field3119.method3591(0);
        }
        field5576++;
    }
}
