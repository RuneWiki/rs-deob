import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class277 {

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Ltk;")
    public static class51 field4861 = new class51();

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Lqk;")
    public static class207 field4867 = class24.method212(255, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Lqk;")
    public static class207 field4870 = class24.method212(255, "Untersuchen");

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Lqk;")
    public static class207 field4868 = class24.method212(255, "0");

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field4871 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lpk;")
    public static class99 field4865;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZIZI)V")
    public static final void method1881(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        class286.method1950(arg3, 0, arg4, class193.field3404.length - 1, -106, arg2, arg1);
        if (arg0 >= -24) {
            field4866 = -65;
        }
        field4862++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static final void method1882(boolean arg0) {
        field4860++;
        int[] var1 = new int[class227.field4178];
        int var2 = 0;
        for (int var3 = 0; var3 < class227.field4178; var3++) {
            class173 var5 = class117.method829(var3, (byte) 48);
            if (var5.field3069 >= 0 || var5.field3111 >= 0) {
                var1[var2++] = var3;
            }
        }
        class163.field2884 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class163.field2884[var4] = var1[var4];
        }
        if (!arg0) {
            field4870 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)V")
    public static final void method1883(boolean arg0, int arg1) {
        field4859++;
        if (!arg0) {
            class90 var2 = class221.method1575(8, arg1, 1651481952);
            var2.method651(-27655);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1884(int arg0) {
        field4861 = null;
        field4870 = null;
        field4867 = null;
        field4865 = null;
        if (arg0 == -3) {
            field4868 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZZI)Lqk;")
    public static final class207 method1885(boolean arg0, boolean arg1, int arg2) {
        field4857++;
        if (arg0) {
            field4872 = -92;
        }
        return class137.method948(10, arg1, arg2, true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILqk;BLqk;)V")
    public static final void method1886(int arg0, class207 arg1, byte arg2, class207 arg3) {
        class100.field1803 = arg1;
        field4863++;
        class100.field1792 = arg3;
        class8.field114 = arg0;
        if (class100.field1803.method1436(class100.field1800, (byte) 83) || class100.field1792.method1436(class100.field1800, (byte) -113)) {
            class92.field1640 = 3;
        } else if (class173.field3089 == -1) {
            if (arg2 <= 66) {
                method1882(false);
            }
            class159.field2818 = 0;
            class92.field1640 = -3;
            class202.field3573 = 1;
            class180.field3237 = 0;
            class149 var4 = new class149(128);
            var4.method1041(true, 10);
            var4.method1083(false, (int) (Math.random() * 99999.0D));
            var4.method1083(false, 529);
            var4.method1048((byte) 126, class100.field1803.method1428(0));
            var4.method1068((int) (Math.random() * 9.9999999E7D), 110);
            var4.method1040(true, class100.field1792);
            var4.method1068((int) (Math.random() * 9.9999999E7D), 112);
            var4.method1071(class183.field3253, class80.field1462, 0);
            class261.field4645.field2593 = 0;
            class261.field4645.method1041(true, 236);
            class261.field4645.method1041(true, var4.field2593);
            class261.field4645.method1039((byte) 117, 0, var4.field2593, var4.field2568);
        } else {
            class195.method1357(1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static final void method1887(int arg0) {
        if (arg0 == 99999999) {
            class232.field4264.method1390((byte) 117);
            field4869++;
        }
    }
}
