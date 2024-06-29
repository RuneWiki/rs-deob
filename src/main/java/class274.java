import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class274 extends class90 {

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "Lcd;")
    public class59 field4404;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4398 = "purple:";

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field4399 = 0;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "[I")
    public static int[] field4400 = new int[25];

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "Lsi;")
    public static class280 field4401 = new class280();

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "Ljava/awt/Image;")
    public static Image field4403;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "[Lij;")
    public static class69[] field4395;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V")
    public static void method1847(int arg0) {
        field4395 = null;
        if (arg0 != 0) {
            method1848(false, 89);
        }
        field4401 = null;
        field4403 = null;
        field4398 = null;
        field4400 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)Lgf;")
    public static final class7 method1848(boolean arg0, int arg1) {
        field4396++;
        class7 var2 = (class7) class254.field3858.method263((byte) 113, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (!arg0) {
            field4401 = null;
        }
        byte[] var3 = class280.field4476.method1538(class42.method291(arg1, 89), class235.method1545(arg1, (byte) -47), (byte) 104);
        class7 var4 = new class7();
        var4.field159 = arg1;
        if (var3 != null) {
            var4.method78(16961, new class114(var3));
        }
        class254.field3858.method255((long) arg1, var4, (byte) -127);
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1849(byte arg0, int arg1) {
        field4402++;
        if (arg0 == 98) {
            return class69.field1087[arg1].length() <= 0 ? class86.field1330[arg1] : class86.field1330[arg1] + class20.field272 + class69.field1087[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class163 var20 = new class163(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class16.field233[var21][arg1][arg2] == null) {
                    class16.field233[var21][arg1][arg2] = new class131(var21, arg1, arg2);
                }
            }
            class16.field233[arg0][arg1][arg2].field1916 = var20;
        } else if (arg3 == 1) {
            class163 var22 = new class163(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class16.field233[var23][arg1][arg2] == null) {
                    class16.field233[var23][arg1][arg2] = new class131(var23, arg1, arg2);
                }
            }
            class16.field233[arg0][arg1][arg2].field1916 = var22;
        } else {
            class139 var24 = new class139(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class16.field233[var25][arg1][arg2] == null) {
                    class16.field233[var25][arg1][arg2] = new class131(var25, arg1, arg2);
                }
            }
            class16.field233[arg0][arg1][arg2].field1915 = var24;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lcd;)V")
    public class274(class59 arg0) {
        this.field4404 = arg0;
    }
}
