import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class332 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lmv;")
    public static class297 field4311 = new class297(7, 0, 1, 1);

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIB)V")
    public static final void method1914(int arg0, int arg1, byte arg2) {
        field4315++;
        class367 var3 = class573.method3057(16, arg1, 2);
        var3.method2115(1);
        if (arg2 != -107) {
            method1915(54);
        }
        var3.field4735 = arg0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static final void method1915(int arg0) {
        field4316++;
        for (class549 var1 = (class549) class354.field4574.method2090(true); var1 != null; var1 = (class549) class354.field4574.method2088(-152)) {
            if (var1.field7121 == -1) {
                var1.field7114 = 0;
                if (var1.field7116 >= 0 && var1.field7125 >= 0 && var1.field7116 < class611.field8258 && class656.field9155 > var1.field7125) {
                    class258.method1615(true, var1);
                }
            } else {
                var1.method2438((byte) 10);
            }
        }
        if (arg0 != 0) {
            field4317 = 76;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)I")
    public static final int method1916(int arg0, int arg1, int arg2, int arg3) {
        field4313++;
        if (class392.field4997 == null) {
            return 0;
        }
        if (arg0 != 1218445319) {
            method1918((byte) -77, 127);
        }
        int var4 = arg3 >> 9;
        int var5 = arg1 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > (class611.field8258 - 1) || (class656.field9155 - 1) < var5) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class159.field1994[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class392.field4997[var6].method669(arg3, arg1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static final void method1917(byte arg0) {
        field4312++;
        int var1 = class214.field2754.length;
        if (arg0 != -25) {
            method1917((byte) 73);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class214.field2754[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class550.field7148; var4++) {
                    if (class547.field7096[var2] == class255.field3462[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class255.field3462[class550.field7148] = class547.field7096[var2];
                    var3 = class550.field7148++;
                }
                class418 var5 = new class418(class214.field2754[var2]);
                int var6 = 0;
                while (var5.field5367 < class214.field2754[var2].length && var6 < 511 && class248.field3351 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2393(-30727);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class547.field7096[var2] >> 8) * 64 + var10 - class100.field1326;
                    int var13 = (class547.field7096[var2] & 0xFF) * 64 + var11 - class186.field2376;
                    class699 var14 = class646.field8998.method519(var5.method2393(-30727), arg0 + 25);
                    class234 var15 = (class234) class505.field6640.method39((long) var7, 31750);
                    if (var15 == null && (var14.field9712 & 0x1) > 0 && class517.field6768 == var9 && var12 >= 0 && class611.field8258 > var14.field9711 + var12 && var13 >= 0 && var14.field9711 + var13 < class656.field9155) {
                        class532 var16 = new class532();
                        var16.field2960 = var7;
                        class234 var17 = new class234(var16);
                        class505.field6640.method38(var17, -123, (long) var7);
                        class93.field1230[class480.field6406++] = var17;
                        class40.field558[class248.field3351++] = var7;
                        var16.field2994 = class424.field5503;
                        var16.method2830((byte) -75, var14);
                        var16.method1434(arg0 + 25, var16.field6914.field9711);
                        var16.field2946 = var16.field6914.field9695 << 3;
                        var16.method1422((var16.field6914.field9697 + 4 & 0x48A00007) << 11, -69, true);
                        var16.method2828(var16.method1265(95), var13, var12, 4, true, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I")
    public static final int method1918(byte arg0, int arg1) {
        field4318++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        if (arg0 <= 104) {
            method1917((byte) 6);
        }
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static void method1919(byte arg0) {
        if (arg0 == 14) {
            field4311 = null;
        }
    }
}
