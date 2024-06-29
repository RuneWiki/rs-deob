import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class102 extends class41 {

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1663 = "red:";

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "[F")
    public static float[] field1666 = new float[4];

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "[I")
    public static int[] field1667 = new int[128];

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1662 = "Connection lost.";

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 6)
    public static final void method790(int arg0) {
        field1668++;
        if (!class215.method1621(25) && class344.field5468 != class186.field2991) {
            class89.method705(class186.field2991, class6.field55.field3553[0], false, class316.field5050, -17690, class113.field1844, class6.field55.field3519[0], false);
            return;
        }
        class339.method2384(0);
        if (class86.field1472 != class186.field2991) {
            class135.method1032(9436);
        }
        if (arg0 != -6311) {
            field1662 = (String) null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V", line = 33)
    public static final void method791(int arg0) {
        field1665++;
        int var1 = class109.field1792.method1338(class209.field3284);
        for (int var2 = 0; var2 < class104.field1683; var2++) {
            int var3 = class109.field1792.method1338(class6.method23(96, var2));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        if (arg0 != -8118) {
            method793(81, -88, -78, -90, (class161) null, (class161) null, 124, 29, -46L);
        }
        var1 += 8;
        int var4 = class104.field1683 * 15 + 21;
        int var5 = class45.field695 - (var1 / 2);
        if (class298.field4779 < (var5 + var1)) {
            var5 = class298.field4779 - var1;
        }
        int var6 = class196.field3144;
        if (var5 < 0) {
            var5 = 0;
        }
        if (var4 + var6 > class252.field4266) {
            var6 = class252.field4266 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class117.field1960 == 1) {
            if (class65.field1157 == class45.field695 && class354.field5623 == class196.field3144) {
                class178.field2858 = var6;
                class24.field289 = (class253.field4271 ? 26 : 22) + class104.field1683 * 15;
                class358.field5687 = true;
                class259.field4361 = var5;
                class117.field1960 = 0;
                class92.field1556 = var1;
            }
        } else if (class45.field695 == class333.field5278 && class229.field3812 == class196.field3144) {
            class178.field2858 = var6;
            class259.field4361 = var5;
            class117.field1960 = 0;
            class92.field1556 = var1;
            class358.field5687 = true;
            class24.field289 = (class253.field4271 ? 26 : 22) + class104.field1683 * 15;
        } else {
            class354.field5623 = class229.field3812;
            class117.field1960 = 1;
            class65.field1157 = class333.field5278;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V", line = 128)
    public static void method792(byte arg0) {
        field1662 = null;
        field1663 = null;
        int var1 = -105 / ((-arg0 - 56) / 32);
        field1667 = null;
        field1666 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIILhd;Lhd;IIJ)V", line = 141)
    public static final void method793(int arg0, int arg1, int arg2, int arg3, class161 arg4, class161 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class338 var10 = new class338();
        var10.field5397 = arg8;
        var10.field5394 = arg1 * 128 + 64;
        var10.field5391 = arg2 * 128 + 64;
        var10.field5396 = arg3;
        var10.field5392 = arg4;
        var10.field5390 = arg5;
        var10.field5395 = arg6;
        var10.field5386 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class129.field2184[var11][arg1][arg2] == null) {
                class129.field2184[var11][arg1][arg2] = new class36(var11, arg1, arg2);
            }
        }
        class129.field2184[arg0][arg1][arg2].field533 = var10;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 173)
    public static final void method794(boolean arg0, Component arg1) {
        arg1.removeMouseListener(class4.field38);
        if (!arg0) {
            method793(100, -7, 11, -112, (class161) null, (class161) null, 57, -30, 43L);
        }
        arg1.removeMouseMotionListener(class4.field38);
        field1664++;
        arg1.removeFocusListener(class4.field38);
        class138.field2276 = 0;
    }
}
