import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class146 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[S")
    public static short[] field2510 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "[I")
    public static int[] field2517 = new int[32768];

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)I")
    public static final int method918(byte arg0, int arg1) {
        field2511++;
        if (arg0 <= 12) {
            field2512 = -112;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)I")
    public static final int method919(int arg0, int arg1, int arg2) {
        field2516++;
        class151 var3 = (class151) class42.field688.method1298(-128, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = arg2; var5 < var3.field2626.length; var5++) {
                if (var3.field2625[var5] == arg0) {
                    var4 += var3.field2626[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method920(int arg0) {
        field2517 = null;
        int var1 = 13 / ((-arg0 - 35) / 57);
        field2510 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class237 var20 = new class237(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class261.field4539[var21][arg1][arg2] == null) {
                    class261.field4539[var21][arg1][arg2] = new class108(var21, arg1, arg2);
                }
            }
            class261.field4539[arg0][arg1][arg2].field2013 = var20;
        } else if (arg3 == 1) {
            class237 var22 = new class237(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class261.field4539[var23][arg1][arg2] == null) {
                    class261.field4539[var23][arg1][arg2] = new class108(var23, arg1, arg2);
                }
            }
            class261.field4539[arg0][arg1][arg2].field2013 = var22;
        } else {
            class1 var24 = new class1(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class261.field4539[var25][arg1][arg2] == null) {
                    class261.field4539[var25][arg1][arg2] = new class108(var25, arg1, arg2);
                }
            }
            class261.field4539[arg0][arg1][arg2].field2035 = var24;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static final void method922(int arg0) {
        if (class77.field1360 != null) {
            class77.field1360.method1322((byte) -10);
        }
        field2513++;
        if (class124.field2229 != null) {
            class124.field2229.method1322((byte) 115);
        }
        class54.method312(class71.field1256, 22050, 2, 8000);
        class77.field1360 = class176.method1122(50, class172.field2875, 0, 22050, class61.field1123);
        class77.field1360.method1328(arg0 ^ 0x1E73, class38.field635);
        if (arg0 != 906) {
            field2510 = null;
        }
        class124.field2229 = class176.method1122(45, class172.field2875, 1, 2048, class61.field1123);
        class124.field2229.method1328(7673, class94.field1627);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method923(Component arg0, int arg1) {
        arg0.removeMouseListener(class61.field1121);
        field2518++;
        arg0.removeMouseMotionListener(class61.field1121);
        arg0.removeFocusListener(class61.field1121);
        class193.field3276 = 0;
        if (arg1 >= -5) {
            method922(-16);
        }
    }
}
