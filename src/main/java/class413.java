import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class413 extends class102 {

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public int field6080;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public int field6081;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public int field6082;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public int field6084;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lwm;")
    public class298 field6077;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 8)
    public static final void method2637(int arg0) {
        field6079++;
        class86.field1217.method335((byte) -118);
        if (arg0 != -1288490189) {
            return;
        }
        for (class212 var1 = (class212) class321.field4726.method332(arg0 ^ 0x33CEC293); var1 != null; var1 = (class212) class321.field4726.method343((byte) -87)) {
            if (var1.field2836 < 1000) {
                var1.method322(11);
                class86.field1217.method330(var1, arg0 - 842350995);
            }
        }
        class86.field1217.method334(arg0 ^ 0x4CCCCCA6, class321.field4726);
        if (class192.field2570 != null || class16.field224 != null || class435.field6397 > 0) {
            return;
        }
        int var2 = class252.field3464;
        if (!class2.field26) {
            if (var2 == 1 && class212.field2844 > 0) {
                int var17 = ((class212) class321.field4726.field663.field641).field2836;
                if (var17 == 51 || var17 == 1 || var17 == 23 || var17 == 10 || var17 == 25 || var17 == 15 || var17 == 30 || var17 == 19 || var17 == 47 || var17 == 2 || var17 == 34 || var17 == 1004) {
                    class212 var18 = (class212) class321.field4726.field663.field641;
                    class394 var19 = class196.method1168((byte) -85, var18.field2831);
                    class304 var20 = client.method1544(var19);
                    if (var20.method2070(arg0 ^ 0xB3333350)) {
                        class110.field1564 = false;
                        class97.field1359 = 0;
                        if (class192.field2570 != null) {
                            class407.method2621(class192.field2570, arg0 ^ 0xB333333C);
                        }
                        class192.field2570 = class196.method1168((byte) -70, var18.field2831);
                        class298.field4288 = class32.field453;
                        class43.field607 = var18.field2837;
                        class279.field4058 = class319.field4668;
                        class407.method2621(class192.field2570, 15);
                        return;
                    }
                }
            }
            if (var2 <= 0 && class174.field2326 > 0) {
                var2 = class174.field2326;
            }
            class174.field2326 = 0;
            if (var2 == 1 && (class88.field1232 == 1 && class212.field2844 > 2 || class194.method1163(false))) {
                var2 = 2;
            }
            if (var2 == 2 && class212.field2844 > 0) {
                class271.method1867((byte) -119);
            }
            if (var2 != 1 || class212.field2844 <= 0) {
                return;
            }
            class1.method10(81);
            return;
        }
        if (var2 != 1) {
            int var3 = class124.field1728;
            int var4 = class323.field4747;
            if (var3 < class99.field1385 - 10 || (class390.field5616 + class99.field1385 + 10) < var3 || class435.field6395 - 10 > var4 || (class435.field6395 + class183.field2485 + 10) < var4) {
                class2.field26 = false;
                class179.method1094(class99.field1385, class183.field2485, class435.field6395, 0, class390.field5616);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var5 = class99.field1385;
        int var6 = class435.field6395;
        int var7 = class390.field5616;
        int var8 = class319.field4668;
        int var9 = class32.field453;
        int var10 = -1;
        for (int var11 = 0; var11 < class212.field2844; var11++) {
            if (class282.field4109) {
                int var15 = (class212.field2844 - var11 - 1) * 16 + var6 + 33;
                if (var8 > var5 && var8 < var5 + var7 && var15 - 13 < var9 && var15 + 3 > var9) {
                    var10 = var11;
                }
            } else {
                int var16 = (class212.field2844 - var11 - 1) * 16 + var6 + 31;
                if (var8 > var5 && (var5 + var7) > var8 && var9 > (var16 - 13) && var9 < var16 + 3) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class179 var13 = new class179(class321.field4726);
            for (class212 var14 = (class212) var13.method1092((byte) 54); var14 != null; var14 = (class212) var13.method1097((byte) 117)) {
                if (var10 == var12) {
                    class211.method1257(28901, var14);
                }
                var12++;
            }
        }
        class2.field26 = false;
        class179.method1094(class99.field1385, class183.field2485, class435.field6395, 0, class390.field5616);
        return;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I", line = 189)
    public static final int method2638(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
        field6078++;
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg1 != -28139) {
            field6083 = 22;
        }
        return var6 & 0xFF;
    }
}
