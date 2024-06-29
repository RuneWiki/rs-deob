import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class203 {

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lp;")
    public static class280 field3530 = class18.method140((byte) -128, " ");

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lp;")
    private static class280 field3531 = class18.method140((byte) -120, " is already on your friend list)3");

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Lp;")
    private static class280 field3534 = class18.method140((byte) -119, "rating: ");

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lp;")
    private static class280 field3533 = class18.method140((byte) -119, "Created gameworld");

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Lp;")
    public static class280 field3535 = field3531;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lp;")
    public static class280 field3527 = field3533;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lp;")
    public static class280 field3526 = field3534;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lp;")
    public static class280 field3529 = class18.method140((byte) -124, "titlebg");

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[Lti;")
    public static class5[] field3525;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method1384(int arg0) {
        class154.field2674.method1485((byte) -78);
        class19.field349.method1485((byte) -83);
        field3532++;
        if (arg0 != 25791) {
            method1387((byte) 24, -62L);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method1385(int arg0) {
        field3534 = null;
        field3525 = null;
        field3531 = null;
        if (arg0 < 125) {
            return;
        }
        field3535 = null;
        field3527 = null;
        field3533 = null;
        field3529 = null;
        field3530 = null;
        field3526 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V")
    public static final void method1386(int arg0, int arg1, int arg2, int arg3) {
        field3528++;
        if (arg0 != -21585) {
            method1385(87);
        }
        class157 var4 = class257.method1740(arg1, (byte) 75, 9);
        var4.method1112((byte) 121);
        var4.field2751 = arg3;
        var4.field2748 = arg2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BJ)Lp;")
    public static final class280 method1387(byte arg0, long arg1) {
        if (arg0 != -32) {
            field3529 = null;
        }
        field3537++;
        return class238.method1590(false, arg1, 10, arg0 + 9883);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIBIII)V")
    public static final void method1388(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -47) {
            field3526 = null;
        }
        class226.field3900 = arg1;
        class16.field304 = arg4;
        class275.field4779 = arg3;
        class187.field3269 = arg5;
        field3536++;
        class212.field3648 = arg0;
        if (class226.field3900 >= 100) {
            int var6 = class212.field3648 * 128 + 64;
            int var7 = class275.field4779 * 128 + 64;
            int var8 = class158.method1123(class231.field4013, var6, -6230, var7) - class16.field304;
            int var9 = var8 - class22.field406;
            int var10 = var6 - client.field2695;
            int var11 = var7 - class78.field1273;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + (var11 * var11)));
            class8.field170 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class220.field3827 = (int) (Math.atan2((double) var10, (double) var11) * -325.949D) & 0x7FF;
            if (class8.field170 < 128) {
                class8.field170 = 128;
            }
            if (class8.field170 > 383) {
                class8.field170 = 383;
            }
        }
        class4.field113 = 2;
    }
}
