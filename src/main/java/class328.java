import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class328 {

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lr;B)V", line = 5)
    public static final void method2022(class98 arg0, byte arg1) {
        field4744++;
        int var2 = class201.field2730;
        int var3 = class291.field4283;
        int var4 = class367.field5374;
        int var5 = class232.field3067;
        int var6 = -10660793;
        arg0.method710(var3, 22339, var6, var4, var2, var5);
        arg0.method710(var3 + 1, 22339, -16777216, var4 - 2, var2 + 1, 16);
        arg0.method714(-16777216, 12844, var5 - 19, var4 - 2, var3 + 18, var2 - -1);
        int var7 = 83 % ((35 - arg1) / 39);
        class395.field5976.method2447(var2 + 3, class279.field3649.method1654(-72, class262.field3401), var6, 2, var3 + 14, -1);
        int var8 = class315.field4612.method2340(40960);
        int var9 = class315.field4612.method2338((byte) 122);
        int var10 = 0;
        for (class426 var11 = (class426) class152.field2150.method1904(false); var11 != null; var11 = (class426) class152.field2150.method1901(94)) {
            int var12 = (class373.field5520 - var10 - 1) * 16 + var3 + 31;
            short var13 = -1;
            if (var2 < var8 && var8 < var2 + var4 && (var12 - 13) < var9 && var12 + 3 > var9 && var11.field6232) {
                var13 = -256;
            }
            int[] var14 = null;
            if (class56.method352(var11.field6223, (byte) -91)) {
                var14 = class259.field3355.method2382((int) var11.field6231, (byte) 28).field5842;
            } else if (var11.field6227 != -1) {
                var14 = class259.field3355.method2382(var11.field6227, (byte) 28).field5842;
            } else if (class160.method1140(false, var11.field6223)) {
                class177 var17 = (class177) class271.field3550.method2002((byte) -126, (long) ((int) var11.field6231));
                if (var17 != null) {
                    class53 var18 = var17.field2476;
                    class76 var19 = var18.field805;
                    if (var19.field1212 != null) {
                        var19 = var19.method443(class308.field4545, (byte) 106);
                    }
                    if (var19 != null) {
                        var14 = var19.field1174;
                    }
                }
            } else if (class643.method3664(var11.field6223, false)) {
                Object var15 = null;
                class289 var16;
                if (var11.field6223 == 1007) {
                    var16 = class60.field965.method2596(0, (int) var11.field6231);
                } else {
                    var16 = class60.field965.method2596(0, (int) (var11.field6231 >>> 32 & 0x7FFFFFFFL));
                }
                if (var16.field4213 != null) {
                    var16 = var16.method1788(class308.field4545, -114);
                }
                if (var16 != null) {
                    var14 = var16.field4247;
                }
            }
            String var20 = class443.method2616(var11, 72);
            if (var14 != null) {
                var20 = var20 + class365.method2237(var14, -16907);
            }
            class395.field5976.method2439(var2 + 3, 0, var12, var13, 0, class224.field2975, var20, class386.field5772);
            if (var11.field6221) {
                class547.field8065.method1534(var2 + class141.field2042.method3455(var20, (byte) 1) + 5, var12 + -12);
            }
            var10++;
        }
        class351.method2178(class291.field4283, class232.field3067, class367.field5374, 0, class201.field2730);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B[I[I)V", line = 111)
    public static final void method2023(byte arg0, int[] arg1, int[] arg2) {
        field4745++;
        if (arg1 == null || arg2 == null) {
            class352.field5236 = null;
            class436.field6373 = null;
            class150.field2118 = null;
            return;
        }
        class150.field2118 = arg1;
        class436.field6373 = new int[arg1.length];
        class352.field5236 = new byte[arg1.length][][];
        for (int var3 = 0; var3 < class150.field2118.length; var3++) {
            class352.field5236[var3] = new byte[arg2[var3]][];
        }
        int var4 = -40 % ((arg0 + 14) / 32);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)I", line = 146)
    public static final int method2024(int arg0) {
        field4746++;
        if (arg0 != 16) {
            field4743 = 56;
        }
        return 16;
    }
}
