import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class353 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Ljava/lang/String;")
    public String field5095;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field5090 = 0;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Ldk;")
    public static class326 field5092 = new class326("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lef;")
    public static class311 field5099 = new class311(9, 7);

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field5101 = 0;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZZIII)V")
    public static final void method2200(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg1) {
            class398.method2385((byte) 39);
        }
        field5097++;
        if (class86.field1045 != null && (arg5 != 3 || class314.field4438.field5799 != arg4 || class314.field4438.field5790 != arg0)) {
            class201.method1227(arg2, class86.field1045, class252.field3718);
            class86.field1045 = null;
        }
        if (arg5 == 3 && class86.field1045 == null) {
            class86.field1045 = class334.method2109(0, class252.field3718, -106, arg4, arg0, 0);
            if (class86.field1045 != null) {
                class314.field4438.field5799 = arg4;
                class314.field4438.field5790 = arg0;
                class314.field4438.method1177(class252.field3718, (byte) 98);
            }
        }
        if (arg5 == 3 && class86.field1045 == null) {
            method2200(-1, true, false, arg3, -1, class314.field4438.field5800);
            return;
        }
        Container var6;
        if (class86.field1045 != null) {
            var6 = class86.field1045;
            class199.field2901 = arg0;
            class284.field4156 = arg4;
        } else if (class239.field3589 == null) {
            var6 = class252.field3718.field6021;
            class284.field4156 = var6.getSize().width;
            class199.field2901 = var6.getSize().height;
        } else {
            Insets var7 = class239.field3589.getInsets();
            class284.field4156 = class239.field3589.getSize().width - var7.left - var7.right;
            int var10001 = -var7.top;
            class199.field2901 = class239.field3589.getSize().height + var10001 - var7.bottom;
            var6 = class239.field3589;
        }
        if (arg5 == 1) {
            class236.field3552 = 0;
            class144.field1900 = class350.field5069;
            class244.field3634 = class202.field2968;
            class377.field5436 = (class284.field4156 - class350.field5069) / 2;
        } else if (class347.field5026 < 96 && class437.field6083 == 0) {
            int var8 = class284.field4156 <= 1024 ? class284.field4156 : 1024;
            class377.field5436 = (class284.field4156 - var8) / 2;
            class144.field1900 = var8;
            int var9 = class199.field2901 > 768 ? 768 : class199.field2901;
            class236.field3552 = 0;
            class244.field3634 = var9;
        } else {
            class377.field5436 = 0;
            class144.field1900 = class284.field4156;
            class236.field3552 = 0;
            class244.field3634 = class199.field2901;
        }
        if (class394.field5599 != class356.field5143) {
            boolean var10000;
            if (class144.field1900 < 1024 && class244.field3634 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class51.method330(class437.field6083, (byte) -83);
        } else {
            class465.field6503.setSize(class144.field1900, class244.field3634);
            if (class141.field1878 != null) {
                class141.field1878.method698();
            }
            if (class239.field3589 == var6) {
                Insets var10 = class239.field3589.getInsets();
                class465.field6503.setLocation(class377.field5436 + var10.left, var10.top - -class236.field3552);
            } else {
                class465.field6503.setLocation(class377.field5436, class236.field3552);
            }
        }
        if (arg5 < 2) {
            class480.field6738 = false;
        } else {
            class480.field6738 = true;
        }
        if (class36.field472 != -1) {
            class451.method2632(true, (byte) 106);
        }
        if (arg2) {
            field5102 = -24;
        }
        if (class58.field761 != null && (class363.field5227 == 30 || class363.field5227 == 25)) {
            class361.method2232(false);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class359.field5166[var11] = true;
        }
        class328.field4746 = true;
    }

    @OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5094++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method2201(byte arg0) {
        if (arg0 != -14) {
            field5099 = null;
        }
        field5099 = null;
        field5092 = null;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class353(String arg0, int arg1) {
        this.field5091 = arg1;
        this.field5095 = arg0;
    }
}
