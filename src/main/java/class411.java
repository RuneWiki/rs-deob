import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class411 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field6104 = 0;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Z")
    public static boolean field6107 = false;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field6111 = 0;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Lem;")
    public static class150 field6105 = new class150();

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "Z")
    public static boolean field6112 = false;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Z")
    public static boolean field6106;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "[I")
    public static int[] field6110;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIB)V")
    public static final void method2516(int arg0, int arg1, byte arg2) {
        field6108++;
        if (class399.field5902 < class399.field5905) {
            class399.field5902 = (float) ((double) class399.field5902 / 30.0D + (double) class399.field5902);
            if (class399.field5905 < class399.field5902) {
                class399.field5902 = class399.field5905;
            }
            class231.method1552(-1);
            class399.field5899 = (int) class399.field5902 >> 1;
            class399.field5901 = class522.method3104(0, class399.field5899);
        } else if (class399.field5902 > class399.field5905) {
            class399.field5902 = (float) ((double) class399.field5902 - (double) class399.field5902 / 30.0D);
            if (class399.field5905 > class399.field5902) {
                class399.field5902 = class399.field5905;
            }
            class231.method1552(-1);
            class399.field5899 = (int) class399.field5902 >> 1;
            class399.field5901 = class522.method3104(0, class399.field5899);
        }
        int var3 = -30 % ((arg2 + 71) / 44);
        if (class447.field6600 != -1 && class45.field510 != -1) {
            int var4 = class447.field6600 - class63.field744;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            int var5 = class45.field510 - class512.field7555;
            class63.field744 += var4;
            if (var5 < 2 || var5 > 2) {
                var5 /= 8;
            }
            class512.field7555 += var5;
            if (var4 == 0 && var5 == 0) {
                class447.field6600 = -1;
                class45.field510 = -1;
            }
            class231.method1552(-1);
        }
        if (class509.field7504 > 0) {
            class417.field6164--;
            if (class417.field6164 == 0) {
                class509.field7504--;
                class417.field6164 = 100;
            }
        } else {
            class392.field5773 = -1;
            class496.field7277 = -1;
        }
        if (!class375.field5556 || class274.field4042 == null) {
            return;
        }
        for (class504 var6 = (class504) class274.field4042.method1018(58); var6 != null; var6 = (class504) class274.field4042.method1022((byte) -112)) {
            class405 var7 = class399.field5891.method837(var6.field7476.field1567, (byte) -41);
            if (var6.method3013(arg1, -15997, arg0)) {
                if (var7.field6022 != null) {
                    if (var7.field6022[4] != null) {
                        class434.method2632(1006, (byte) -55, false, (long) var6.field7476.field1567, var7.field6007, var7.field6009, true, var7.field6022[4], 0, -1, -1);
                    }
                    if (var7.field6022[3] != null) {
                        class434.method2632(1001, (byte) -55, false, (long) var6.field7476.field1567, var7.field6007, var7.field6009, true, var7.field6022[3], 0, -1, -1);
                    }
                    if (var7.field6022[2] != null) {
                        class434.method2632(1008, (byte) -55, false, (long) var6.field7476.field1567, var7.field6007, var7.field6009, true, var7.field6022[2], 0, -1, -1);
                    }
                    if (var7.field6022[1] != null) {
                        class434.method2632(1012, (byte) -55, false, (long) var6.field7476.field1567, var7.field6007, var7.field6009, true, var7.field6022[1], 0, -1, -1);
                    }
                    if (var7.field6022[0] != null) {
                        class434.method2632(1004, (byte) -55, false, (long) var6.field7476.field1567, var7.field6007, var7.field6009, true, var7.field6022[0], 0, -1, -1);
                    }
                }
                if (!var6.field7476.field1561) {
                    var6.field7476.field1561 = true;
                    class41.method414(class129.field1866, var6.field7476.field1567, var7.field6007);
                }
                if (var6.field7476.field1561) {
                    class41.method414(class150.field2118, var6.field7476.field1567, var7.field6007);
                }
            } else if (var6.field7476.field1561) {
                var6.field7476.field1561 = false;
                class41.method414(class314.field4458, var6.field7476.field1567, var7.field6007);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILkf;ZLkf;IZB)I")
    public static final int method2517(int arg0, class166 arg1, boolean arg2, class166 arg3, int arg4, boolean arg5, byte arg6) {
        int var7 = -70 / ((arg6 + 5) / 48);
        field6109++;
        int var8 = class457.method2752(arg5, arg0, arg1, false, arg3);
        if (var8 != 0) {
            return arg5 ? -var8 : var8;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var9 = class457.method2752(arg2, arg4, arg1, false, arg3);
            return arg2 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
    public static void method2518(boolean arg0) {
        if (!arg0) {
            field6110 = null;
            field6105 = null;
        }
    }
}
