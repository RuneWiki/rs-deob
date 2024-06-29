import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class11 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Z")
    public static boolean field156 = true;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field153 = new String[5];

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field157 = " from your friend list first.";

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Z")
    public static boolean field164 = true;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Z")
    public static boolean field165 = false;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "J")
    public long field159;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lvh;")
    public static class108 field162;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Ltb;")
    public class184 field158;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
    public static int[] field155;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method70(int arg0) {
        for (int var1 = arg0; var1 < class292.field4664; var1++) {
            int var2 = class60.field1051[var1];
            class141 var3 = class42.field625[var2];
            int var4 = class248.field4058.method669((byte) 36);
            if ((var4 & 0x4) != 0) {
                var4 += class248.field4058.method669((byte) 36) << 8;
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class248.field4058.method657(arg0);
                int var6 = class248.field4058.method669((byte) 36);
                var3.method526(var6, -112, var5, class266.field4301);
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class248.field4058.method641(arg0 + 2);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class248.field4058.method696((byte) 102);
                boolean var9 = true;
                if (var7 != -1 && var3.field1396 != -1 && class105.method714(class189.method1243(65536, var7).field2138, (byte) 103).field2744 < class105.method714(class189.method1243(arg0 ^ 0x10000, var3.field1396).field2138, (byte) 31).field2744) {
                    var9 = false;
                }
                if (var9) {
                    var3.field1463 = 0;
                    var3.field1386 = var8 >> 16;
                    var3.field1390 = 1;
                    var3.field1385 = (var8 & 0xFFFF) + class266.field4301;
                    var3.field1396 = var7;
                    var3.field1482 = 0;
                    if (class266.field4301 < var3.field1385) {
                        var3.field1482 = -1;
                    }
                    if (var3.field1396 != -1 && class266.field4301 == var3.field1385) {
                        int var10 = class189.method1243(65536, var3.field1396).field2138;
                        if (var10 != -1) {
                            class167 var11 = class105.method714(var10, (byte) 27);
                            if (var11 != null && var11.field2736 != null) {
                                class112.method786(var3.field1458, var11, 0, var3.field1397, (byte) -126, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x100) != 0) {
                int var12 = class248.field4058.method638(0);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class248.field4058.method691((byte) 118);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var13[var16] = var17;
                    var15[var16] = class248.field4058.method669((byte) 36);
                    var14[var16] = class248.field4058.method691((byte) 125);
                }
                class100.method633(var3, var14, -121, var13, var15);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1426 = class248.field4058.method641(2);
                if (var3.field1426 == 65535) {
                    var3.field1426 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1462 = class248.field4058.method662((byte) 1);
                var3.field1425 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var18 = class248.field4058.method693(false);
                int var19 = class248.field4058.method669((byte) 36);
                if (var18 == 65535) {
                    var18 = -1;
                }
                class113.method793(var3, (byte) 116, var18, var19);
            }
            if ((var4 & 0x200) != 0) {
                var3.field1439 = class248.field4058.method691((byte) 118);
                var3.field1438 = class248.field4058.method693(false);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field2421.method1399((byte) -86)) {
                    class99.method627(var3, true);
                }
                var3.method989(class12.method73((byte) 57, class248.field4058.method691((byte) 125)), (byte) 93);
                var3.method529((byte) 127, var3.field2421.field3537);
                var3.field1471 = var3.field2421.field3505;
                var3.field1443 = var3.field2421.field3484;
                if (var3.field2421.method1399((byte) -86)) {
                    class155.method1066(var3.field1486[0], (class288) null, class176.field2886, var3, 0, 6330, var3.field1464[0], (class206) null);
                }
            }
            if ((var4 & 0x8) != 0) {
                int var20 = class248.field4058.method638(arg0);
                int var21 = class248.field4058.method669((byte) 36);
                var3.method526(var21, -97, var20, class266.field4301);
                var3.field1483 = class266.field4301 + 300;
                var3.field1453 = class248.field4058.method669((byte) 36);
            }
        }
        field152++;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static void method71(int arg0) {
        field162 = null;
        field157 = null;
        field153 = null;
        field155 = null;
        if (arg0 > -28) {
            method72(101, (class108) null, 27, -31);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILvh;II)[Lcj;")
    public static final class74[] method72(int arg0, class108 arg1, int arg2, int arg3) {
        field160++;
        if (arg2 != -1) {
            method71(-66);
        }
        return class127.method876(arg3, arg1, arg0, -8635) ? class27.method179(~arg2) : null;
    }
}
