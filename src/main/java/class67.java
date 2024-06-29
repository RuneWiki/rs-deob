import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class67 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[Z")
    public static boolean[] field987 = new boolean[100];

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lrr;")
    public static class280 field988 = new class280(8, 0, 4, 1);

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field991 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILdv;[[B)V", line = 5)
    public static final void method433(int arg0, class83 arg1, byte[][] arg2) {
        if (arg0 != 9) {
            field991 = 23;
        }
        field986++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class23 var11 = new class23(var10);
                int var12 = class23.field328[var5] >> 8;
                int var13 = class23.field328[var5] & 0xFF;
                int var14 = var12 * 64 - class16.field181;
                int var15 = var13 * 64 - class455.field6794;
                class529.method3131(94);
                arg1.method558((byte) -109, class455.field6794, class106.field1865, var15, var11, var14, class16.field181);
                arg1.method596(class305.field4873, arg0 ^ 0x58A5, var3, var15, var11, var14);
                if (!arg1.field1319 && (class419.field6341 / 8) == var12 && (class344.field5393 / 8) == var13 && var3[0] != -1) {
                    class162.field2571 = class503.field7338.method1619(var3[0], class279.field4582, var3[3], -107, var3[1], var3[2]);
                    class26.field409 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class23.field328[var6] >> 8) * 64 - class16.field181;
            int var8 = (class23.field328[var6] & 0xFF) * 64 - class455.field6794;
            byte[] var9 = arg2[var6];
            if (var9 == null && class344.field5393 < 800) {
                class529.method3131(-58);
                arg1.method554(var8, 64, false, var7, 64);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 77)
    public static final void method434(int arg0) {
        if (class32.field515 == 2) {
            class75.method540(-7, 3);
        } else if (class32.field515 == 6) {
            class75.method540(-7, 7);
        } else if (class32.field515 == 9) {
            class75.method540(-7, 10);
        }
        if (arg0 >= -41) {
            field991 = 43;
        }
        field990++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 99)
    public static void method435(byte arg0) {
        field987 = null;
        if (arg0 > 6) {
            field988 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 110)
    public static final void method436(byte arg0) {
        field989++;
        class154.method1079((long) class504.field7348, class305.field4873, (byte) 77);
        if (class379.field5881 != -1) {
            class241.method1649(class379.field5881, -1);
        }
        for (int var1 = 0; var1 < class128.field2208; var1++) {
            if (class445.field6633[var1]) {
                client.field1170[var1] = true;
            }
            field987[var1] = class445.field6633[var1];
            class445.field6633[var1] = false;
        }
        class219.field3796 = class504.field7348;
        if (class305.field4873.method831()) {
            class379.field5880 = true;
        }
        if (class379.field5881 != -1) {
            class128.field2208 = 0;
            class99.method690((byte) -44);
        }
        class305.field4873.method848();
        class413.method2559(class305.field4873, true);
        if (arg0 <= 106) {
            field987 = null;
        }
        int var2 = class356.method2285(0);
        if (var2 == -1) {
            var2 = class102.field1688;
        }
        if (var2 == -1) {
            var2 = class106.field1900;
        }
        class48.method341(true, var2);
        class431.field6455 = 0;
    }
}
