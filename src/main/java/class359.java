import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class359 {

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "Llo;")
    public static class306 field5582 = new class306("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "Lvv;")
    public static class313 field5584 = new class313(94, 11);

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "Lpu;")
    public static class411 field5586 = new class411();

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "[I")
    public static int[] field5588 = new int[14];

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "Ldw;")
    public static class403 field5587 = new class403("", 12);

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "Lvv;")
    public static class313 field5590 = new class313(90, 17);

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "[I")
    public static int[] field5591 = new int[2];

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Lln;")
    public static class169 field5583;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "[Lo;")
    public static class138[] field5589;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2300(int arg0) {
        class396.method2476(class164.field2598, 1);
        field5585++;
        class263.field4382++;
        if (class228.field3990 && class420.field6357) {
            int var1 = class333.field5233.method1660(2766);
            int var2 = class333.field5233.method1655(-115);
            int var3 = var2 - class222.field3819;
            int var4 = var1 - class226.field3891;
            if (class97.field1607 > var4) {
                var4 = class97.field1607;
            }
            if (var3 < class326.field5135) {
                var3 = class326.field5135;
            }
            if (class97.field1607 + class529.field7780.field1009 < class164.field2598.field1009 + var4) {
                var4 = class97.field1607 + class529.field7780.field1009 - class164.field2598.field1009;
            }
            if (class164.field2598.field1081 + var3 > class326.field5135 + class529.field7780.field1081) {
                var3 = class326.field5135 + class529.field7780.field1081 - class164.field2598.field1081;
            }
            int var5 = class529.field7780.field1041 + var4 - class97.field1607;
            int var6 = var3 + class529.field7780.field1042 - class326.field5135;
            if (class333.field5233.method2106((byte) -26)) {
                if (class263.field4382 > class164.field2598.field1104) {
                    int var8 = var4 - class104.field1737;
                    int var9 = var3 - class275.field4528;
                    if (var8 > class164.field2598.field1036 || var8 < (-class164.field2598.field1036) || class164.field2598.field1036 < var9 || var9 < (-class164.field2598.field1036)) {
                        class54.field875 = true;
                    }
                }
                if (class164.field2598.field1054 != null && class54.field875) {
                    class483 var10 = new class483();
                    var10.field7095 = var6;
                    var10.field7101 = class164.field2598.field1054;
                    var10.field7100 = class164.field2598;
                    var10.field7098 = var5;
                    class521.method3073(var10);
                }
            } else {
                if (class54.field875) {
                    class467.method2772(false);
                    if (class164.field2598.field1010 != null) {
                        class483 var7 = new class483();
                        var7.field7100 = class164.field2598;
                        var7.field7099 = class38.field570;
                        var7.field7095 = var6;
                        var7.field7101 = class164.field2598.field1010;
                        var7.field7098 = var5;
                        class521.method3073(var7);
                    }
                    if (class38.field570 != null && client.method480(class164.field2598) != null) {
                        class9.method53(class38.field570, class164.field2598, true);
                    }
                } else if ((class199.field3176 == 1 || class1.method4(1009)) && class480.field7080 > 2) {
                    class281.method1841(class226.field3891 + class104.field1737, class275.field4528 + class222.field3819, arg0 ^ 0xFFFFFFCF);
                } else if (class275.method1816(-70)) {
                    class281.method1841(class226.field3891 + class104.field1737, class275.field4528 + class222.field3819, -119);
                }
                class164.field2598 = null;
            }
            if (arg0 != 90) {
                method2300(56);
            }
        } else if (class263.field4382 > 1) {
            class164.field2598 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V", line = 134)
    public static void method2301(byte arg0) {
        field5589 = null;
        field5586 = null;
        field5587 = null;
        field5588 = null;
        int var1 = -24 % ((64 - arg0) / 46);
        field5583 = null;
        field5584 = null;
        field5591 = null;
        field5582 = null;
        field5590 = null;
    }
}
