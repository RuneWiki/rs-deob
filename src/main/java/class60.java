import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class60 extends class381 {

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "J")
    public long field937;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "[I")
    public static int[] field942 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Lid;")
    public static class242 field938;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 3)
    public static final void method543(int arg0, Component arg1) {
        field941++;
        arg1.removeMouseListener(class127.field1799);
        arg1.removeMouseMotionListener(class127.field1799);
        arg1.removeFocusListener(class127.field1799);
        if (arg0 == 3) {
            class130.field1849 = 0;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZII)V", line = 22)
    public static final void method544(boolean arg0, int arg1, int arg2) {
        field939++;
        try {
            if (arg2 != 0 && arg0) {
                class249.field3415 = class232.method1548(0, class356.field4840, class30.field502, class418.field5867, 0, -2099013940);
                class249.field3415.method104(0);
                class323 var3 = class77.method667(0, (byte) 105, class49.field829, class398.field5563);
                class175 var4 = class249.field3415.method89(var3, class214.method1455(class187.field2705, class398.field5563, 0), true);
                class422.method2599(var4, class338.field4607, -104, true);
                class249.field3415.method246();
                class396.method2438(103);
            }
            class249.field3415 = class232.method1548(class31.field514, class356.field4840, class30.field502, class418.field5867, arg2, -2099013940);
            if (class249.field3415.method202()) {
                class83 var5 = class249.field3415.method206(536870912);
                class249.field3415.method256(var5);
            }
        } catch (Throwable var7) {
            if (arg2 != 0) {
                arg2 = 0;
                class249.field3415 = class232.method1548(class31.field514, class356.field4840, class30.field502, class418.field5867, 0, -2099013940);
            }
        }
        class243.field3355 = arg2;
        if (arg1 >= -66) {
            return;
        }
        class19.method269(100);
        if (!class249.field3415.method115()) {
            class165.field2433 = 1;
        }
        class249.field3415.method98(class165.field2433);
        class249.field3415.method210(0);
        class228.field3159 = class249.field3415.method239();
        class227.field3151 = class249.field3415.method239();
        int var6 = (int) ((double) class116.field1621 * 34.46D);
        if (class249.field3415.method231()) {
            var6 += 128;
        }
        class249.field3415.method124(50, var6);
        class249.field3415.method120(!class416.field5823);
        if (class249.field3415.method106()) {
            class170.method1278(class318.field4308, (byte) 95);
        }
        class298.field4019 = !class339.method2153(9);
        class420.method2591(class249.field3415, class385.field5425 >> 3, false, class116.field1621 >> 3);
        class361.method2268(90);
        class338.field4600 = false;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 91)
    public class60() {
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V", line = 94)
    public static void method545(int arg0) {
        field942 = null;
        field938 = null;
        int var1 = -91 / ((28 - arg0) / 45);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(J)V", line = 106)
    public class60(long arg0) {
        this.field937 = arg0;
    }
}
