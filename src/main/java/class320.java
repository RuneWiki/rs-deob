import java.awt.Canvas;
import java.awt.Component;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class320 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lud;")
    public static class279 field5590 = class130.method1024(" )2> <col=ffff00>", 255);

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Lgf;")
    public static class8 field5597 = null;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "[Ldb;")
    public static class182[] field5594 = new class182[14];

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIILsf;IJZ)Z", line = 30)
    public static final boolean method2251(int arg0, int arg1, int arg2, int arg3, int arg4, class108 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class78.method655(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 67)
    public static final void method2252(Component arg0, byte arg1) {
        arg0.addMouseListener(class166.field2993);
        if (arg1 > -27) {
            field5591 = 123;
        }
        field5595++;
        arg0.addMouseMotionListener(class166.field2993);
        arg0.addFocusListener(class166.field2993);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lok;B)V", line = 80)
    public static final void method2253(class149 arg0, byte arg1) {
        field5596++;
        class191.field3432 = arg0.method1167(class283.field5045, arg1 ^ 0x3D);
        class177.field3182 = arg0.method1167(class162.field2918, arg1 + 7);
        class278.field4917 = arg0.method1167(class324.field5661, arg1 ^ 0x28);
        class3.field106 = arg0.method1167(class209.field3688, 108);
        class268.field4803 = arg0.method1167(class182.field3353, 107);
        class183.field3361 = arg0.method1167(class112.field2064, arg1 + 16);
        class142.field2579 = arg0.method1167(class182.field3322, 111);
        if (arg1 != 82) {
            method2256((class279) null, (class53) null, 67);
        }
        class63.field1302 = arg0.method1167(class285.field5090, 98);
        class18.field552 = arg0.method1167(class293.field5236, arg1 + 25);
        class301.field5363 = arg0.method1167(class178.field3229, 117);
        class86.field1659 = arg0.method1167(class238.field4166, 109);
        class195.field3525 = arg0.method1167(class244.field4342, 91);
        class238.field4168 = arg0.method1167(class134.field2445, 106);
        class180.field3256 = arg0.method1167(class240.field4226, arg1 ^ 0xA);
        class170.field3065 = arg0.method1167(class139.field2511, 88);
        class15.field493 = arg0.method1167(class32.field729, 96);
        class87.field1675 = arg0.method1167(class204.field3635, 122);
        field5591 = arg0.method1167(class283.field5066, 113);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILlm;Z)V", line = 109)
    public static final void method2254(int arg0, class49 arg1, boolean arg2) {
        field5601++;
        if (class97.field1824 || arg2) {
            int var3 = class176.field3150;
            int var4 = var3 * 956 / 503;
            class178.field3224.method581((class221.field3899 - var4) / 2, 0, var4, var3);
            class287.field5129.method423(class221.field3899 / 2 - (class287.field5129.field1041 / 2), 18);
        }
        arg1.method409(class15.field501, class221.field3899 / 2, class176.field3150 / arg0 - 26, 16777215, -1);
        int var5 = class176.field3150 / 2 - 18;
        if (class97.field1824) {
            class256.method1839(class221.field3899 / 2 - 152, var5, 304, 34, 9179409);
            class256.method1839(class221.field3899 / 2 - 151, var5 + 1, 302, 32, 0);
            class256.method1827(class221.field3899 / 2 - 150, var5 + 2, class119.field2147 * 3, 30, 9179409);
            class256.method1827(class221.field3899 / 2 + class119.field2147 * 3 - 150, var5 + 2, 300 - (class119.field2147 * 3), 30, 0);
        } else {
            class146.method1124(class221.field3899 / 2 - 152, var5, 304, 34, 9179409);
            class146.method1124(class221.field3899 / 2 - 151, var5 + 1, 302, 32, 0);
            class146.method1110(class221.field3899 / 2 - 150, var5 + 2, class119.field2147 * 3, 30, 9179409);
            class146.method1110(class119.field2147 * 3 + class221.field3899 / 2 - 150, var5 + 2, 300 - (class119.field2147 * 3), 30, 0);
        }
        arg1.method409(class243.field4309, class221.field3899 / 2, class176.field3150 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 150)
    public static void method2255(byte arg0) {
        field5597 = null;
        field5590 = null;
        field5594 = null;
        if (arg0 != -37) {
            field5594 = (class182[]) null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lud;Lvh;I)I", line = 207)
    public static final int method2256(class279 arg0, class53 arg1, int arg2) {
        int var3 = arg1.field1142;
        arg1.method465((byte) 7, arg0.field4967);
        arg1.field1142 += class163.field2943.method263(arg0.field4967, (byte) -47, 0, arg1.field1142, arg1.field1168, arg0.field4935);
        field5599++;
        if (arg2 != 14) {
            method2251(29, -50, -34, 117, 37, (class108) null, -106, 43L, false);
        }
        return arg1.field1142 - var3;
    }
}
