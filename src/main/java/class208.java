import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class208 {

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field3053 = 0;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lvc;I)V")
    public static final void method1421(class89 arg0, int arg1) {
        field3054++;
        int var2 = class104.field1469;
        if (arg1 != 13504) {
            return;
        }
        int var3 = class167.field2424;
        int var4 = class315.field4455;
        int var5 = class433.field6135;
        int var6 = -10660793;
        arg0.method742(11, var3, var5, var4, var6, var2);
        arg0.method742(11, var3 + 1, 16, var4 - 2, -16777216, var2 + 1);
        arg0.method751(var4 - 2, var5 + -19, var2 + 1, -16777216, 66, var3 + 18);
        class408.field5584.method1383(var6, false, var3 + 14, class462.field6526.method1078(class66.field967, 100), -1, var2 + 3);
        int var7 = class175.field2661.method1625((byte) -128);
        int var8 = class175.field2661.method1617(false);
        int var9 = 0;
        for (class73 var10 = (class73) class6.field38.method775(1); var10 != null; var10 = (class73) class6.field38.method763(0)) {
            int var11 = (class303.field4310 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < var2 + var4 && var8 > (var11 - 13) && var11 + 3 > var8 && var10.field1046) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class367.method2243((byte) -83, var10.field1048)) {
                var13 = class373.field5128.method1644((int) var10.field1055, 108).field2158;
            } else if (var10.field1047 != -1) {
                var13 = class373.field5128.method1644(var10.field1047, 103).field2158;
            } else if (class480.method2835(var10.field1048, arg1 - 13618)) {
                class361 var16 = class163.field2377[(int) var10.field1055];
                if (var16 != null) {
                    class37 var17 = var16.field4952;
                    if (var17.field434 != null) {
                        var17 = var17.method232(class416.field5691, -1);
                    }
                    if (var17 != null) {
                        var13 = var17.field416;
                    }
                }
            } else if (class264.method1784((byte) 115, var10.field1048)) {
                Object var14 = null;
                class267 var15;
                if (var10.field1048 == 1001) {
                    var15 = class468.field6599.method506(arg1 - 13629, (int) var10.field1055);
                } else {
                    var15 = class468.field6599.method506(arg1 ^ 0xFFFFCB45, (int) (var10.field1055 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field3846 != null) {
                    var15 = var15.method1799(class416.field5691, (byte) -111);
                }
                if (var15 != null) {
                    var13 = var15.field3864;
                }
            }
            String var18 = class25.method173(31230, var10);
            if (var13 != null) {
                var18 = var18 + class401.method2415(var13, arg1 ^ 0x3773);
            }
            class408.field5584.method1390(16777215, var18, var11, class217.field3142, 0, class387.field5303, var2 + 3, var12);
            if (var10.field1052) {
                class294.field4151.method2493(class402.field5516.method1354((byte) -64, var18) + var2 + 5, var11 + -12);
            }
            var9++;
        }
        class297.method1925(class315.field4455, 0, class167.field2424, class433.field6135, class104.field1469);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static final void method1422(int arg0) {
        if (arg0 != -32766) {
            return;
        }
        field3052++;
        class333.field4631 = 0;
        class312.field4413 = 0;
        class323.field4517 = 0;
        class166.field2418 = 0;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public static final void method1423(byte arg0) {
        if (class411.field5619 != null) {
            class411.field5619.method1059((byte) 9);
        }
        if (arg0 < -31) {
            field3055++;
            if (class205.field3009 != null) {
                class205.field3009.method1059((byte) 9);
            }
        }
    }
}
