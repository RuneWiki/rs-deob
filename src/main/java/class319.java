import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class319 {

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "[I")
    public static int[] field4400 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field4401 = 0;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Z")
    public static boolean field4402 = true;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4405 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "[[[Lrg;")
    public static class563[][][] field4403;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
    public static void method1989(int arg0) {
        field4405 = null;
        if (arg0 == 2) {
            field4403 = null;
            field4400 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)J")
    public static final long method1990(int arg0) {
        field4406++;
        return arg0 <= 8 ? -102L : class521.field7263.method281(-9060);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1991(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (class558.field7815 != null && (arg3 != 3 || class501.field6954.field7877 != arg1 || class501.field6954.field7878 != arg0)) {
            class334.method2126(class558.field7815, 77, class31.field488);
            class558.field7815 = null;
        }
        field4404++;
        if (arg3 == 3 && class558.field7815 == null) {
            class558.field7815 = class453.method2633((byte) -82, 0, 0, class31.field488, arg0, arg1);
            if (class558.field7815 != null) {
                class501.field6954.field7878 = arg0;
                class501.field6954.field7877 = arg1;
                class501.field6954.method3537(98, class31.field488);
            }
        }
        if (arg3 == 3 && class558.field7815 == null) {
            method1991(-1, -1, arg2, class501.field6954.field7835, true, 87);
            return;
        }
        if (arg5 < 69) {
            method1991(65, -35, -114, -106, true, 116);
        }
        Container var6;
        if (class558.field7815 != null) {
            var6 = class558.field7815;
            class322.field4443 = arg0;
            class611.field8788 = arg1;
        } else if (class247.field3111 == null) {
            var6 = class31.field488.field3644;
            class611.field8788 = var6.getSize().width;
            class322.field4443 = var6.getSize().height;
        } else {
            Insets var7 = class247.field3111.getInsets();
            int var10001 = -var7.right;
            class611.field8788 = class247.field3111.getSize().width + var10001 - var7.left;
            class322.field4443 = class247.field3111.getSize().height - var7.bottom - var7.top;
            var6 = class247.field3111;
        }
        if (arg3 == 1) {
            class604.field8711 = class164.field2082;
            class502.field6955 = class586.field8501;
            class223.field2857 = (class611.field8788 - class586.field8501) / 2;
            class221.field2819 = 0;
        } else if (class282.field3697 < 96 && class428.field5845 == 0) {
            int var8 = class611.field8788 <= 1024 ? class611.field8788 : 1024;
            int var9 = class322.field4443 > 768 ? 768 : class322.field4443;
            class223.field2857 = (class611.field8788 - var8) / 2;
            class502.field6955 = var8;
            class221.field2819 = 0;
            class604.field8711 = var9;
        } else {
            class502.field6955 = class611.field8788;
            class604.field8711 = class322.field4443;
            class221.field2819 = 0;
            class223.field2857 = 0;
        }
        if (class628.field9174 != class602.field8701) {
            boolean var10000;
            if (class502.field6955 < 1024 && class604.field8711 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class317.method1978(109);
        } else {
            class141.field1806.setSize(class502.field6955, class604.field8711);
            class301.field3918.method187(class141.field1806);
            if (class247.field3111 == var6) {
                Insets var10 = class247.field3111.getInsets();
                class141.field1806.setLocation(class223.field2857 + var10.left, var10.top - -class221.field2819);
            } else {
                class141.field1806.setLocation(class223.field2857, class221.field2819);
            }
        }
        if (arg3 >= 2) {
            class317.field4370 = true;
        } else {
            class317.field4370 = false;
        }
        if (class126.field1565 != -1) {
            class266.method1638(true, true);
        }
        if (class96.field1294 != null && class168.method1004(class630.field9188, -12)) {
            class391.method2364((byte) 71);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class99.field1326[var11] = true;
        }
        class503.field7003 = true;
    }
}
