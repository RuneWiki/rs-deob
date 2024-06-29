import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class86 extends class122 {

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "[I")
    public static int[] field1407 = new int[13];

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "I")
    public static int field1410 = 0;

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "Lnea;")
    public static class664 field1409 = new class664(93, 12);

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "Lkw;")
    public static class223 field1411;

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "[I")
    public static int[] field1408;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZBIIII)V")
    public static final void method751(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class554.field7847 != null && (arg4 != 3 || class287.field4270.field3710 != arg2 || class287.field4270.field3690 != arg3)) {
            class182.method1227(class368.field5267, -5245, class554.field7847);
            class554.field7847 = null;
        }
        field1413++;
        if (arg4 == 3 && class554.field7847 == null) {
            class554.field7847 = class8.method49(34336, 0, 0, arg2, arg3, class368.field5267);
            if (class554.field7847 != null) {
                class287.field4270.field3710 = arg2;
                class287.field4270.field3690 = arg3;
                class287.field4270.method2753(false, class368.field5267);
            }
        }
        if (arg4 == 3 && class554.field7847 == null) {
            method751(true, (byte) 50, -1, -1, class287.field4270.field3718, arg5);
            return;
        }
        Container var6;
        if (class554.field7847 != null) {
            class443.field6457 = arg3;
            var6 = class554.field7847;
            class319.field4702 = arg2;
        } else if (class683.field9634 == null) {
            if (class421.field6129 == null) {
                var6 = class108.field1660;
            } else {
                var6 = class421.field6129;
            }
            class319.field4702 = var6.getSize().width;
            class443.field6457 = var6.getSize().height;
        } else {
            Insets var7 = class683.field9634.getInsets();
            class319.field4702 = class683.field9634.getSize().width - var7.right - var7.left;
            class443.field6457 = class683.field9634.getSize().height - var7.top - var7.bottom;
            var6 = class683.field9634;
        }
        if (arg4 == 1) {
            class31.field494 = class544.field7651;
            class142.field2102 = (class319.field4702 - class245.field3815) / 2;
            class525.field7410 = 0;
            class487.field6930 = class245.field3815;
        } else {
            class627.method3499(arg1 ^ 0x32);
        }
        if (class379.field5372 != class296.field4357) {
            boolean var10000;
            if (class487.field6930 < 1024 && class31.field494 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class157.method1094(4897);
        } else {
            class31.field486.setSize(class487.field6930, class31.field494);
            class282.field4228.method182(class31.field486);
            if (class683.field9634 == var6) {
                Insets var8 = class683.field9634.getInsets();
                class31.field486.setLocation(class142.field2102 + var8.left, class525.field7410 + var8.top);
            } else {
                class31.field486.setLocation(class142.field2102, class525.field7410);
            }
        }
        if (arg4 < 2) {
            class271.field4088 = false;
        } else {
            class271.field4088 = true;
        }
        if (class100.field1556 != -1) {
            class433.method2580((byte) 15, true);
        }
        if (class274.field4181 != null && class320.method2003(arg1 - 166, class420.field6113)) {
            class666.method3679(false);
        }
        int var9 = 0;
        if (arg1 != 50) {
            return;
        }
        while (var9 < 100) {
            class508.field7177[var9] = true;
            var9++;
        }
        class245.field3808 = true;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)V")
    public static void method752(int arg0) {
        field1411 = null;
        field1408 = null;
        field1407 = null;
        field1409 = null;
        if (arg0 != 0) {
            method753((byte) 27, null);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BLmo;)Lap;")
    public static final class440 method753(byte arg0, class695 arg1) {
        arg1.method3826(false);
        field1412++;
        int var2 = arg1.method3826(false);
        class440 var3 = class673.method3731(var2, false);
        var3.field6414 = arg1.method3826(false);
        if (arg0 < 101) {
            return null;
        }
        int var4 = arg1.method3826(false);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method3826(false);
            var3.method234(5, arg1, var6);
        }
        var3.method230(-9);
        return var3;
    }
}
