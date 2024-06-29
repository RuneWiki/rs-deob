import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class76 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field1140 = 0;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "[[[I")
    public static int[][][] field1141 = new int[4][13][13];

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lqe;")
    public static class168 field1137 = class66.method448(" )2> <col=00ffff>", 105);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "[[[B")
    public static byte[][][] field1138;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBI)I")
    public static final int method512(int arg0, int arg1, byte arg2, int arg3) {
        field1144++;
        int var4 = arg0 & arg1 - 1;
        int var5 = arg0 / arg1;
        if (arg2 > -82) {
            method514(-96, (byte) 94, 122);
        }
        int var6 = arg3 / arg1;
        int var7 = arg3 & arg1 - 1;
        int var8 = class154.method1019(var6, var5, -1);
        int var9 = class154.method1019(var6, var5 + 1, -1);
        int var10 = class154.method1019(var6 + 1, var5, -1);
        int var11 = class154.method1019(var6 + 1, var5 + 1, -1);
        int var12 = class179.method1179(var8, var9, arg1, true, var4);
        int var13 = class179.method1179(var10, var11, arg1, true, var4);
        return class179.method1179(var12, var13, arg1, true, var7);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static final void method513(int arg0) {
        field1136++;
        if (class194.field3383 > class167.field2852) {
            class167.field2852 += class167.field2852 / 30.0D;
            if (class194.field3383 < class167.field2852) {
                class167.field2852 = class194.field3383;
            }
            class55.method386((byte) 44);
        } else if (class167.field2852 > class194.field3383) {
            class167.field2852 -= class167.field2852 / 30.0D;
            if (class194.field3383 > class167.field2852) {
                class167.field2852 = class194.field3383;
            }
            class55.method386((byte) 44);
        }
        if (class27.field342 != -1 && class68.field971 != -1) {
            int var1 = class68.field971 - class91.field1423;
            int var2 = class27.field342 - class151.field2629;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class151.field2629 -= -var2;
            class91.field1423 += var1;
            if (var2 == 0 && var1 == 0) {
                class68.field971 = -1;
                class27.field342 = -1;
            }
            class55.method386((byte) 44);
        }
        if (arg0 != 1) {
            field1141 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V")
    public static final void method514(int arg0, byte arg1, int arg2) {
        field1143++;
        int var3 = arg2;
        if (arg2 > 25) {
            var3 = 25;
        }
        int var4 = 7 / ((arg1 + 39) / 62);
        arg2--;
        int var5 = class126.field2102[arg2];
        int var6 = class166.field2825[arg2];
        if (arg0 == 0) {
            class173.field3007++;
            class87.field1348.method672(135, 238);
            class87.field1348.method768(var3 + var3 + 3, 7295);
        }
        if (arg0 == 1) {
            class245.field4246++;
            class87.field1348.method672(200, 238);
            class87.field1348.method768(var3 + var3 + 3 + 14, 7295);
        }
        if (arg0 == 2) {
            class87.field1348.method672(211, 238);
            class87.field1348.method768(var3 + var3 + 3, 7295);
            class106.field1702++;
        }
        class87.field1348.method735((byte) 33, class246.field4261 + var5);
        class87.field1348.method764(0, class190.field3306[82] ? 1 : 0);
        class87.field1348.method726(class125.field2060 + var6, (byte) 127);
        class29.field351 = class166.field2825[0];
        class163.field2803 = class126.field2102[0];
        for (int var7 = 1; var7 < var3; var7++) {
            arg2--;
            class87.field1348.method773(class126.field2102[arg2] - var5, -67);
            class87.field1348.method757(class166.field2825[arg2] - var6, false);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static void method515(int arg0) {
        field1138 = null;
        if (arg0 >= -101) {
            method513(74);
        }
        field1141 = null;
        field1137 = null;
    }
}
