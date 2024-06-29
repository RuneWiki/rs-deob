import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class346 {

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4955 = -1;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4958 = null;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "[I")
    public static int[] field4960 = new int[32];

    @OriginalMember(owner = "client!is", name = "e", descriptor = "[F")
    public static float[] field4959 = new float[4];

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static void method2047(int arg0) {
        if (arg0 != 4) {
            field4960 = null;
        }
        field4960 = null;
        field4959 = null;
        field4958 = null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IZIIIB)V")
    public static final void method2048(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (class147.field2140 != null && (arg4 != 3 || class20.field269.field7642 != arg3 || class20.field269.field7637 != arg2)) {
            class218.method1353(class147.field2140, class202.field2840, (byte) -61);
            class147.field2140 = null;
        }
        field4956++;
        if (arg4 == 3 && class147.field2140 == null) {
            class147.field2140 = class481.method2826(0, 0, arg2, 23627, class202.field2840, arg3);
            if (class147.field2140 != null) {
                class20.field269.field7642 = arg3;
                class20.field269.field7637 = arg2;
                class20.field269.method1715((byte) -108, class202.field2840);
            }
        }
        if (arg4 == 3 && class147.field2140 == null) {
            method2048(arg0, true, -1, -1, class20.field269.field7643, (byte) -110);
            return;
        }
        Container var6;
        if (class147.field2140 != null) {
            var6 = class147.field2140;
            class480.field7020 = arg2;
            class105.field1586 = arg3;
        } else if (class367.field5383 == null) {
            var6 = class202.field2840.field7425;
            class105.field1586 = var6.getSize().width;
            class480.field7020 = var6.getSize().height;
        } else {
            Insets var7 = class367.field5383.getInsets();
            int var10001 = var7.right + var7.left;
            class105.field1586 = class367.field5383.getSize().width - var10001;
            int var13 = -var7.top;
            class480.field7020 = class367.field5383.getSize().height + var13 - var7.bottom;
            var6 = class367.field5383;
        }
        if (arg4 == 1) {
            class195.field2780 = (class105.field1586 - class320.field4381) / 2;
            class117.field1754 = class320.field4381;
            class27.field359 = class512.field7598;
            class445.field6563 = 0;
        } else if (class261.field3627 < 96 && class152.field2332 == 0) {
            int var8 = class105.field1586 > 1024 ? 1024 : class105.field1586;
            class117.field1754 = var8;
            int var9 = class480.field7020 > 768 ? 768 : class480.field7020;
            class195.field2780 = (class105.field1586 - var8) / 2;
            class27.field359 = var9;
            class445.field6563 = 0;
        } else {
            class117.field1754 = class105.field1586;
            class445.field6563 = 0;
            class195.field2780 = 0;
            class27.field359 = class480.field7020;
        }
        if (class404.field5937 != class373.field5469) {
            boolean var10000;
            if (class117.field1754 < 1024 && class27.field359 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class242.method1466(21924);
        } else {
            class426.field6248.setSize(class117.field1754, class27.field359);
            class269.field3721.method239(class426.field6248);
            if (class367.field5383 == var6) {
                Insets var10 = class367.field5383.getInsets();
                class426.field6248.setLocation(var10.left + class195.field2780, class445.field6563 + var10.top);
            } else {
                class426.field6248.setLocation(class195.field2780, class445.field6563);
            }
        }
        if (arg4 >= 2) {
            class127.field1891 = true;
        } else {
            class127.field1891 = false;
        }
        if (class188.field2723 != -1) {
            class210.method1298(-23, true);
        }
        if (class33.field438 != null && (class492.field7178 == 30 || class492.field7178 == 25)) {
            class421.method2507(false);
        }
        int var11 = 100 / ((-arg5 - 32) / 32);
        for (int var12 = 0; var12 < 100; var12++) {
            class463.field6801[var12] = true;
        }
        class292.field4042 = true;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method2049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4957++;
        if (arg5 >= arg6 + arg1 || arg6 >= (arg5 + arg8)) {
            return false;
        } else if (arg3 < arg2 + arg4 && arg4 < arg0 + arg3) {
            if (arg7 != -4) {
                field4959 = null;
            }
            return true;
        } else {
            return false;
        }
    }
}
