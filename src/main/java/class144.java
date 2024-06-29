import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class144 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field2530 = 0;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "[Lab;")
    public static class240[] field2533 = new class240[4];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lgj;")
    public static class226 field2528 = new class226(260);

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljf;")
    public static class70 field2536 = new class70(5000);

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Z")
    public static boolean field2537 = false;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Ldk;")
    public static class177 field2535;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lhc;")
    public static class43 field2534;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Ltg;")
    public static class75 field2539;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILjava/awt/Component;)Lt;")
    public static final class239 method1067(int arg0, int arg1, int arg2, Component arg3) {
        field2532++;
        try {
            Class var4 = Class.forName("nk");
            if (arg0 != 2) {
                field2530 = -1;
            }
            class239 var5 = (class239) var4.getDeclaredConstructor().newInstance();
            var5.method250(arg2, (byte) -78, arg3, arg1);
            return var5;
        } catch (Throwable var7) {
            class23 var6 = new class23();
            var6.method250(arg2, (byte) -28, arg3, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method1068(byte arg0) {
        field2535 = null;
        if (arg0 <= 72) {
            field2536 = null;
        }
        field2528 = null;
        field2534 = null;
        field2536 = null;
        field2533 = null;
        field2539 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)Z")
    public static final boolean method1069(int arg0, byte arg1) {
        if (arg1 != -25) {
            method1067(103, -57, -97, (Component) null);
        }
        field2531++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public static final void method1070(byte arg0) {
        field2529++;
        if (class20.field362 == 2) {
            if (class189.field3267 == class157.field2859 && class200.field3430 == class112.field1998) {
                class20.field362 = 0;
                class227.method1569(class226.field3894 - 1, 0);
            }
        } else if (class189.field3267 == class139.field2471 && class250.field4384 == class200.field3430) {
            class20.field362 = 0;
            class227.method1569(class226.field3894 - 1, 0);
        } else {
            class20.field362 = 2;
            class157.field2859 = class139.field2471;
            class112.field1998 = class250.field4384;
        }
        if (arg0 >= -6) {
            field2533 = null;
        }
    }
}
