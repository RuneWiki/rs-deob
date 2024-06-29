import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class253 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field3693 = 0;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3697 = "Connection lost.";

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Lcc;")
    public static class327 field3698 = new class327(50);

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "[[I")
    public static int[][] field3700 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Luj;")
    public static class158 field3694;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1767(byte arg0) {
        field3696++;
        if ((class38.field463 < class38.field465)) {
            class38.field463 = (float) ((double) class38.field463 / 30.0D + (double) class38.field463);
            if (class38.field465 < class38.field463) {
                class38.field463 = class38.field465;
            }
            class144.method1122((byte) 65);
        } else if (class38.field463 > class38.field465) {
            class38.field463 = (float) ((double) class38.field463 - (double) class38.field463 / 30.0D);
            if (class38.field463 < class38.field465) {
                class38.field463 = class38.field465;
            }
            class144.method1122((byte) 65);
        }
        if (class83.field1069 != -1 && class323.field4744 != -1) {
            int var1 = class323.field4744 - class35.field428;
            int var2 = class83.field1069 - class32.field393;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class35.field428 -= -var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var2 == 0 && var1 == 0) {
                class323.field4744 = -1;
                class83.field1069 = -1;
            }
            class32.field393 += var2;
            class144.method1122((byte) 84);
        }
        if (class308.field4544 > 0) {
            class193.field2672--;
            if (class193.field2672 == 0) {
                class308.field4544--;
                class193.field2672 = 100;
            }
        } else {
            class144.field2014 = -1;
            class130.field1774 = -1;
        }
        if (class149.field2083 && class287.field4140 != null) {
            for (class65 var3 = (class65) class287.field4140.method413(1253231568); var3 != null; var3 = (class65) class287.field4140.method419(9)) {
                class287 var4 = class282.method1924(true, var3.field831.field5493);
                if (class249.field3614 == 0 && var3.method470(class105.field1361, -108, class80.field1028)) {
                    if (!var3.field831.field5492) {
                        var3.field831.field5492 = true;
                        class288.method1975(15, var3.field831.field5493, -30073, var4.field4139);
                    }
                    if (var3.field831.field5492) {
                        class288.method1975(17, var3.field831.field5493, -30073, var4.field4139);
                    }
                } else if (var3.field831.field5492) {
                    var3.field831.field5492 = false;
                    class288.method1975(16, var3.field831.field5493, -30073, var4.field4139);
                }
            }
        }
        if (arg0 > -89) {
            method1768((byte) -62);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V", line = 141)
    public static void method1768(byte arg0) {
        field3698 = null;
        field3700 = (int[][]) null;
        int var1 = -102 / ((arg0 + 37) / 42);
        field3697 = null;
        field3694 = null;
    }
}
