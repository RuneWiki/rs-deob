import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class389 extends class499 {

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "Lvv;")
    public static class313 field5972 = new class313(49, 8);

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(Z)V")
    public static final void method2432(boolean arg0) {
        field5975++;
        class82 var1 = (class82) class328.field5171.method2538(-3);
        if (arg0) {
            method2433((byte) 30);
        }
        while (var1 != null) {
            class44 var2 = var1.field1441;
            if (var2.field702 < class504.field7348) {
                var1.method1821((byte) -114);
                var2.method318(0);
            } else if (class504.field7348 >= var2.field729) {
                if (var2.field714 > 0) {
                    class505 var3 = (class505) class147.field2396.method2516((long) (var2.field714 - 1), -1);
                    if (var3 != null) {
                        class265 var4 = var3.field7355;
                        if (var4.field4716 >= 0 && (class217.field3775 * 128) > var4.field4716 && var4.field4714 >= 0 && class277.field4548 * 128 > var4.field4714) {
                            var2.method324(class81.method592(var4.field4716, var4.field4714, 9251, var2.field4720) - var2.field721, class504.field7348, var4.field4714, 1, var4.field4716);
                        }
                    }
                }
                if (var2.field714 < 0) {
                    int var5 = -var2.field714 - 1;
                    class166 var6;
                    if (class265.field4432 == var5) {
                        var6 = class302.field4850;
                    } else {
                        var6 = class435.field6489[var5];
                    }
                    if (var6 != null && var6.field4716 >= 0 && (class217.field3775 * 128) > var6.field4716 && var6.field4714 >= 0 && var6.field4714 < (class277.field4548 * 128)) {
                        var2.method324(class81.method592(var6.field4716, var6.field4714, 9251, var2.field4720) - var2.field721, class504.field7348, var6.field4714, 1, var6.field4716);
                    }
                }
                var2.method321(class431.field6455, 72);
                class177.method1198(var2, true);
            }
            var1 = (class82) class328.field5171.method2535((byte) -62);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static void method2433(byte arg0) {
        int var1 = 61 / ((27 - arg0) / 44);
        field5972 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIILhh;)V")
    public static final void method2434(int arg0, int arg1, int arg2, class125 arg3) {
        class465 var4 = class406.method2512(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field6913 = arg3;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z[[BLdv;)V")
    public static final void method2435(boolean arg0, byte[][] arg1, class83 arg2) {
        if (arg0) {
            return;
        }
        field5973++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field1321; var4++) {
            class529.method3131(-110);
            for (int var5 = 0; var5 < class217.field3775 >> 3; var5++) {
                for (int var6 = 0; var6 < (class277.field4548 >> 3); var6++) {
                    int var7 = class361.field5602[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3160949) >> 24;
                        if (!arg2.field1319 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FF9) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class23.field328.length; var13++) {
                                if (class23.field328[var13] == var12 && arg1[var13] != null) {
                                    class23 var14 = new class23(arg1[var13]);
                                    arg2.method556(var10, var8, var14, var6 * 8, var11, 0, class106.field1865, var5 * 8, var9, var4);
                                    arg2.method603(var3[0] == -1 ? var3 : null, var6 * 8, var5 * 8, class305.field4873, var8, var4, var10, var9, var14, var11, (byte) -51);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class162.field2571 = class503.field7338.method1619(var3[0], class279.field4582, var3[3], -106, var3[1], var3[2]);
            class26.field409 = var3[4];
        }
    }
}
