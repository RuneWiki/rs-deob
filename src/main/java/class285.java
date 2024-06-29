import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class285 extends class80 {

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "[I")
    public int[] field4696 = new int[] { -1 };

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "[I")
    public int[] field4707 = new int[] { 0 };

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lph;")
    public static class229 field4697 = class266.method1858("(U2", 0);

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "J")
    public static long field4698 = 0L;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "Lph;")
    public static class229 field4703 = class266.method1858("Chargement du module texte )2 ", 0);

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field4699 = 1;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "Lph;")
    private static class229 field4700 = class266.method1858("Loading config )2 ", 0);

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "Lph;")
    public static class229 field4706 = field4700;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1961(boolean arg0) {
        if (arg0) {
            method1963((class229) null, -117, (byte) 75, -54, 8);
        }
        field4700 = null;
        field4697 = null;
        field4703 = null;
        field4706 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BII)I", line = 34)
    public static final int method1962(byte arg0, int arg1, int arg2) {
        int var3 = arg2 >>> 31;
        field4701++;
        if (arg0 != 115) {
            field4697 = (class229) null;
        }
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lph;IBII)V", line = 47)
    public static final void method1963(class229 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4705++;
        class301 var5 = class167.method1224(arg4, arg2 + 112, arg1);
        if (arg2 != 6 || var5 == null) {
            return;
        }
        if (var5.field5036 != null) {
            class157 var6 = new class157();
            var6.field2549 = arg0;
            var6.field2551 = var5;
            var6.field2548 = arg3;
            var6.field2552 = var5.field5036;
            class177.method1275(var6, -73);
        }
        boolean var7 = true;
        if (var5.field4996 > 0) {
            var7 = class205.method1436(var5, -121);
        }
        if (!var7 || !class84.method624(false, client.method2168(var5), arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class121.field2033.method37(93, 165);
            class317.field5379++;
            class121.field2033.method1168(arg1, (byte) -95);
            class121.field2033.method1155(-1640531527, arg4);
        }
        if (arg3 == 2) {
            class27.field391++;
            class121.field2033.method37(118, 2);
            class121.field2033.method1168(arg1, (byte) -91);
            class121.field2033.method1155(-1640531527, arg4);
        }
        if (arg3 == 3) {
            class121.field2033.method37(104, 178);
            class121.field2033.method1168(arg1, (byte) -81);
            class121.field2033.method1155(-1640531527, arg4);
            class189.field3072++;
        }
        if (arg3 == 4) {
            class121.field2033.method37(106, 132);
            class315.field5362++;
            class121.field2033.method1168(arg1, (byte) -100);
            class121.field2033.method1155(-1640531527, arg4);
        }
        if (arg3 == 5) {
            class121.field2033.method37(80, 147);
            class251.field4180++;
            class121.field2033.method1168(arg1, (byte) -115);
            class121.field2033.method1155(-1640531527, arg4);
        }
        if (arg3 == 6) {
            class200.field3316++;
            class121.field2033.method37(arg2 ^ 0x75, 166);
            class121.field2033.method1168(arg1, (byte) -82);
            class121.field2033.method1155(-1640531527, arg4);
        }
        if (arg3 == 7) {
            class301.field5017++;
            class121.field2033.method37(arg2 ^ 0x1D, 161);
            class121.field2033.method1168(arg1, (byte) -120);
            class121.field2033.method1155(-1640531527, arg4);
        }
        if (arg3 == 8) {
            class84.field1447++;
            class121.field2033.method37(arg2 + 67, 23);
            class121.field2033.method1168(arg1, (byte) -109);
            class121.field2033.method1155(arg2 - 1640531533, arg4);
        }
        if (arg3 == 9) {
            class198.field3297++;
            class121.field2033.method37(arg2 + 33, 117);
            class121.field2033.method1168(arg1, (byte) -94);
            class121.field2033.method1155(arg2 ^ 0x9E3779BF, arg4);
        }
        if (arg3 == 10) {
            class121.field2033.method37(41, 223);
            class121.field2033.method1168(arg1, (byte) -62);
            class179.field2942++;
            class121.field2033.method1155(-1640531527, arg4);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V", line = 184)
    public static final void method1964(int arg0, int arg1, int arg2) {
        field4695++;
        if (arg0 <= 109) {
            return;
        }
        if (arg1 == 4 && !class281.field4661) {
            arg2 = 2;
            arg1 = 2;
        }
        if (class281.field4656 != arg1) {
            if (class33.field547) {
                return;
            }
            if (class281.field4656 != 0) {
                class282.field4678[class281.field4656].method80();
            }
            if (arg1 != 0) {
                class14 var3 = class282.field4678[arg1];
                var3.method79();
                var3.method84(arg2);
            }
            class330.field5623 = arg2;
            class281.field4656 = arg1;
        } else if (arg1 != 0 && class330.field5623 != arg2) {
            class282.field4678[arg1].method84(arg2);
            class330.field5623 = arg2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLhb;Lph;)I", line = 231)
    public static final int method1965(byte arg0, class164 arg1, class229 arg2) {
        field4702++;
        int var3 = arg1.field2670;
        arg1.method1153(arg2.field3785, -462888633);
        if (arg0 == -76) {
            arg1.field2670 += class308.field5192.method402(arg2.field3772, (byte) -117, arg1.field2668, arg2.field3785, arg1.field2670, 0);
            return arg1.field2670 - var3;
        } else {
            return -125;
        }
    }
}
