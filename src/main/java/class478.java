import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class478 {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field6822 = 0;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[Lio;")
    public static class435[] field6826 = null;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "D")
    public static double field6825;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "F")
    public static float field6821;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field6824;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field6827;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field6828;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[[I")
    public static int[][] field6819;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lfca;IZ)V")
    public static final void method2873(class84 arg0, int arg1, boolean arg2) {
        field6824++;
        if (class409.field5682 >= 400) {
            return;
        }
        class488 var3 = arg0.field1523;
        if (var3.field6923 != null) {
            var3 = var3.method2926(arg1 ^ 0x221A, class742.field10408);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field6920) {
            return;
        }
        String var4 = var3.field6909;
        if (var3.field6964 != 0) {
            String var5 = class696.field9784 == class649.field9170 ? class281.field3971.method1839((byte) 45, class744.field10426) : class281.field3969.method1839((byte) 45, class744.field10426);
            var4 = var4 + class127.method986((byte) 126, var3.field6964, class468.field6748.field4903) + " (" + var5 + var3.field6964 + ")";
        }
        if (class737.field10375 && !arg2) {
            class513 var6 = class41.field600 == -1 ? null : class285.field4042.method2993(class41.field600, (byte) 80);
            if ((class464.field6709 & 0x2) != 0 && (var6 == null || var3.method2935(var6.field7315, (byte) 56, class41.field600) != var6.field7315)) {
                class598.field8716++;
                class673.method3807((long) arg0.field931, class623.field8966 + " -> <col=ffff00>" + var4, 0, (byte) -50, (long) arg0.field931, true, class322.field4580, 10, false, 0, false, class23.field299, -1);
            }
        }
        if (!arg2) {
            String[] var7 = var3.field6959;
            if (class725.field10145) {
                var7 = class656.method3695(var7, (byte) 85);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field6933 == 0 || !var7[var8].equalsIgnoreCase(class281.field3964.method1839((byte) 45, class744.field10426)))) {
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 6;
                        }
                        int var10 = class719.field10072;
                        if (var8 == 1) {
                            var9 = 20;
                        }
                        if (var8 == 2) {
                            var9 = 13;
                        }
                        if (var8 == 3) {
                            var9 = 49;
                        }
                        if (var8 == 4) {
                            var9 = 5;
                        }
                        if (var3.field6947 == var8) {
                            var10 = var3.field6962;
                        }
                        if (var3.field6929 == var8) {
                            var10 = var3.field6940;
                        }
                        class673.method3807((long) arg0.field931, "<col=ffff00>" + var4, 0, (byte) -62, (long) arg0.field931, true, var7[var8], var9, false, 0, false, var7[var8].equalsIgnoreCase(class281.field3964.method1839((byte) 45, class744.field10426)) ? var3.field6902 : var10, -1);
                        class76.field1442++;
                    }
                }
            }
            if (var3.field6933 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class281.field3964.method1839((byte) 45, class744.field10426))) {
                        short var12 = 0;
                        if (class468.field6748.field4903 < var3.field6964) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 6;
                        }
                        if (var11 == 1) {
                            var13 = 20;
                        }
                        if (var11 == 2) {
                            var13 = 13;
                        }
                        if (var11 == 3) {
                            var13 = 49;
                        }
                        if (var11 == 4) {
                            var13 = 5;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class673.method3807((long) arg0.field931, "<col=ffff00>" + var4, 0, (byte) -48, (long) arg0.field931, true, var7[var11], var13, false, 0, false, var3.field6902, -1);
                        class615.field8892++;
                    }
                }
            }
        }
        class673.method3807((long) arg0.field931, "<col=ffff00>" + var4, arg1, (byte) -110, (long) arg0.field931, true, class281.field3963.method1839((byte) 45, class744.field10426), 1006, false, 0, arg2, class224.field3197, -1);
        class254.field3690++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method2874(byte arg0) {
        field6819 = null;
        field6826 = null;
        if (arg0 != 124) {
            field6825 = 1.4917538212126342D;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static final synchronized void method2875(int arg0) {
        field6820++;
        if (class200.field2872 != null) {
            return;
        }
        try {
            if (arg0 != 2) {
                field6819 = null;
            }
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field6827 == null ? (field6827 = method2876("java.lang.String")) : field6827, field6828 == null ? (field6828 = method2876("java.lang.Class")) : field6828);
            class200.field2872 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2876(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
