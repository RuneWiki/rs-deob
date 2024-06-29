import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class552 {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "[I")
    public static int[] field8218 = new int[4];

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lqp;")
    public static class586 field8217 = new class586(53, -1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Leea;")
    public class407 field8213;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BIIZII)V", line = 4)
    public static final void method3228(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (class644.field9345 != null && (arg2 != 3 || class94.field1158.field269 != arg1 || class94.field1158.field302 != arg4)) {
            class470.method2864(class328.field4850, class644.field9345, 0);
            class644.field9345 = null;
        }
        field8220++;
        if (arg2 == 3 && class644.field9345 == null) {
            class644.field9345 = class643.method3722(arg4, arg1, 0, 119, class328.field4850, 0);
            if (class644.field9345 != null) {
                class94.field1158.field302 = arg4;
                class94.field1158.field269 = arg1;
                class94.field1158.method2661(class328.field4850, -1);
            }
        }
        if (arg2 == 3 && class644.field9345 == null) {
            method3228((byte) -55, -1, class94.field1158.field293, true, -1, arg5);
            return;
        }
        if (arg0 != -55) {
            field8212 = -41;
        }
        Container var6;
        if (class644.field9345 != null) {
            class507.field7548 = arg1;
            var6 = class644.field9345;
            class564.field8356 = arg4;
        } else if (class248.field3628 == null) {
            var6 = class328.field4850.field5129;
            class507.field7548 = var6.getSize().width;
            class564.field8356 = var6.getSize().height;
        } else {
            Insets var7 = class248.field3628.getInsets();
            class507.field7548 = class248.field3628.getSize().width - var7.right - var7.left;
            int var10001 = -var7.top;
            class564.field8356 = class248.field3628.getSize().height + var10001 - var7.bottom;
            var6 = class248.field3628;
        }
        if (arg2 == 1) {
            class467.field6748 = 0;
            class337.field4944 = class461.field6665;
            class522.field7735 = class632.field9239;
            class124.field1632 = (class507.field7548 - class632.field9239) / 2;
        } else if (class223.field3276 < 96 && class239.field3499 == 0) {
            int var8 = class507.field7548 <= 1024 ? class507.field7548 : 1024;
            class522.field7735 = var8;
            class124.field1632 = (class507.field7548 - var8) / 2;
            int var9 = class564.field8356 <= 768 ? class564.field8356 : 768;
            class337.field4944 = var9;
            class467.field6748 = 0;
        } else {
            class467.field6748 = 0;
            class124.field1632 = 0;
            class522.field7735 = class507.field7548;
            class337.field4944 = class564.field8356;
        }
        if (class643.field9339 != class582.field8561) {
            boolean var10000;
            if (class522.field7735 < 1024 && class337.field4944 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg3) {
            class306.method1883((byte) -92);
        } else {
            class110.field1401.setSize(class522.field7735, class337.field4944);
            class379.field5558.method1023(class110.field1401);
            if (class248.field3628 == var6) {
                Insets var10 = class248.field3628.getInsets();
                class110.field1401.setLocation(class124.field1632 + var10.left, class467.field6748 + var10.top);
            } else {
                class110.field1401.setLocation(class124.field1632, class467.field6748);
            }
        }
        if (arg2 < 2) {
            class2.field13 = false;
        } else {
            class2.field13 = true;
        }
        if (class540.field8007 != -1) {
            class558.method3267(true, (byte) 119);
        }
        if (class513.field7606 != null && class196.method1263((byte) -50, class192.field2903)) {
            class197.method1271((byte) -78);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class587.field8718[var11] = true;
        }
        class534.field7901 = true;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Z", line = 152)
    public static final boolean method3229(int arg0, int arg1) {
        field8216++;
        if (arg0 != 0) {
            method3228((byte) -26, -41, -71, false, -40, 79);
        }
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 163)
    public static final void method3230(int arg0) {
        if (arg0 != -2617) {
            return;
        }
        field8214++;
        int var1 = class94.field1158.method2676(class239.field3499, 120);
        if (var1 == 0) {
            class22.field197 = null;
            class582.method3400((byte) 106, 0);
        } else if (var1 == 1) {
            class380.method2304((byte) 0, arg0 + 2493);
            class582.method3400((byte) 106, 512);
            if (class237.field3473 != null) {
                class198.method1274(arg0 ^ 0x1D5F);
            }
        } else {
            class380.method2304((byte) (class614.field9000 - 4 & 0xFF), -113);
            class582.method3400((byte) 106, 2);
        }
        class118.field1542 = class355.field5157;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 198)
    public static final void method3231(boolean arg0) {
        if (arg0) {
            method3230(-85);
        }
        field8219++;
        for (class434 var1 = (class434) class566.field8403.method2496((byte) -125); var1 != null; var1 = (class434) class566.field8403.method2494(106)) {
            if (var1.field6358) {
                var1.method2648(-7869);
            }
        }
        for (class434 var2 = (class434) class255.field3733.method2496((byte) 44); var2 != null; var2 = (class434) class255.field3733.method2494(64)) {
            if (var2.field6358) {
                var2.method2648(-7869);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 231)
    public static void method3232(int arg0) {
        field8218 = null;
        field8217 = null;
        if (arg0 != 53) {
            method3231(true);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)I", line = 251)
    public static final int method3233(int arg0, int arg1) {
        field8221++;
        int var2 = -48 / ((arg0 + 67) / 51);
        int var3 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var3 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var3 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var3 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var3 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var3++;
        }
        return var3 + arg1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZII)V", line = 305)
    public static final void method3234(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field8215++;
        if (class94.field1158.field276 != 0 && arg3 != 0 && class68.field779 < 50 && arg4 != -1) {
            class10.field94[class68.field779++] = new class585((byte) 2, arg4, arg3, arg0, arg1, 0);
        }
        if (arg2) {
            field8218 = null;
        }
    }
}
