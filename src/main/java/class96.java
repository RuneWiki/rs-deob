import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class96 {

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1420 = 0;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLpk;Lpk;)V")
    public static final void method721(byte arg0, class237 arg1, class237 arg2) {
        class23.field377 = arg1;
        class214.field3289 = arg2;
        field1419++;
        if (arg0 != -80) {
            method723((byte) 118, -85);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(JI)V")
    public static final void method722(long arg0, int arg1) {
        field1415++;
        if (arg0 == 0L || arg1 != 25378) {
            return;
        }
        if (!(class3.field36 < 100 || class29.field536) || class3.field36 >= 200) {
            class260.method1759(0, "", arg1 ^ 0x63A2, class114.field1745);
            return;
        }
        String var3 = class37.method287(arg0, (byte) 114);
        for (int var4 = 0; var4 < class3.field36; var4++) {
            if (class131.field1926[var4] == arg0) {
                class260.method1759(0, "", 128, var3 + class42.field737);
                return;
            }
        }
        for (int var5 = 0; var5 < class206.field3090; var5++) {
            if (class51.field831[var5] == arg0) {
                class260.method1759(0, "", arg1 ^ 0x63A2, class32.field575 + var3 + class284.field4361);
                return;
            }
        }
        if (var3.equals(class185.field2687.field3488)) {
            class260.method1759(0, "", 128, class209.field3131);
            return;
        }
        class61.field1005++;
        class22.field368[class3.field36] = var3;
        class131.field1926[class3.field36] = arg0;
        class117.field1762[class3.field36] = 0;
        class209.field3130[class3.field36] = "";
        class140.field2028[class3.field36] = 0;
        class180.field2622[class3.field36] = false;
        class3.field36++;
        class226.field3533 = class169.field2494;
        class59.field964.method1540(50, (byte) -2);
        class59.field964.method440(arg0, arg1 ^ 0xFFFF9CE6);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)Ltg;")
    public static final class147 method723(byte arg0, int arg1) {
        field1416++;
        class147 var2 = (class147) class188.field2761.method675(31558, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field1841.method1605(-125, 0, arg1);
        if (var3 == null) {
            return null;
        }
        class147 var4 = new class147();
        class54 var5 = new class54(var3);
        var5.field887 = var5.field848.length - 2;
        int var6 = var5.method423(85);
        int var7 = var5.field848.length - var6 - 2 - 12;
        var5.field887 = var7;
        int var8 = var5.method420((byte) 105);
        var4.field2137 = var5.method423(49);
        var4.field2135 = var5.method423(arg0 ^ 0x7E);
        var4.field2129 = var5.method423(123);
        var4.field2131 = var5.method423(arg0 ^ 0xFFFFFF96);
        int var9 = var5.method407(255);
        if (var9 > 0) {
            var4.field2125 = new class39[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method423(77);
                class39 var12 = new class39(class239.method1637(var11, 0));
                var4.field2125[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method420((byte) 121);
                    int var14 = var5.method420((byte) -83);
                    var12.method309((byte) -8, new class135(var14), (long) var13);
                }
            }
        }
        var5.field887 = 0;
        var4.field2130 = var5.method409(29780);
        var4.field2127 = new String[var8];
        var4.field2139 = new int[var8];
        var4.field2134 = new int[var8];
        if (arg0 != -42) {
            field1420 = 117;
        }
        int var15 = 0;
        while (var7 > var5.field887) {
            int var16 = var5.method423(arg0 + 121);
            if (var16 == 3) {
                var4.field2127[var15] = var5.method439((byte) 92).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2134[var15] = var5.method407(255);
            } else {
                var4.field2134[var15] = var5.method420((byte) 98);
            }
            var4.field2139[var15++] = var16;
        }
        class188.field2761.method677((byte) 125, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(BI)Lwk;")
    public static final class100 method724(byte arg0, int arg1) {
        field1418++;
        if (arg0 > -36) {
            field1420 = -6;
        }
        class100 var2 = (class100) class216.field3319.method945((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class75.field1202.method1605(-127, arg1, 29);
        class100 var4 = new class100();
        if (var3 != null) {
            var4.method734(arg1, -108, new class54(var3));
        }
        class216.field3319.method941(var4, (long) arg1, -8447);
        return var4;
    }
}
