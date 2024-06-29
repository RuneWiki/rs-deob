import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class84 extends class320 {

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field1459 = -50;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Lbu;")
    public static class17 field1455;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
    public int[] field1460;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "[I")
    public int[] field1461;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "[I")
    public int[] field1463;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[Lcq;")
    public class324[] field1454;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "[Lcq;")
    public class324[] field1456;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "[[[B")
    public byte[][][] field1457;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lnu;Z)Z")
    public static final boolean method651(class417 arg0, boolean arg1) {
        boolean var2 = class88.field1546 == class335.field5061;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method808((byte) 45);
        if (arg0.field6231 < 0 || arg0.field6238 < 0 || arg0.field6235 >= class151.field2408 || arg0.field6226 >= class261.field3792) {
            return false;
        }
        for (int var6 = arg0.field6231; var6 <= arg0.field6235; var6++) {
            for (int var9 = arg0.field6238; var9 <= arg0.field6226; var9++) {
                class429 var10 = class394.method2438(arg0.field6232, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field6231) {
                        var11++;
                    }
                    if (var6 < arg0.field6235) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field6238) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field6226) {
                        var11 += 2;
                    }
                    class166 var12 = class140.method1044(var11, arg0, false);
                    class166 var13 = var10.field6364;
                    if (var13 == null) {
                        var10.field6364 = var12;
                    } else {
                        while (var13.field2572 != null) {
                            var13 = var13.field2572;
                        }
                        var13.field2572 = var12;
                    }
                    var10.field6363 = (byte) (var10.field6363 | var11);
                    if (var2 && (class98.field1633[var6][var9] & 0xFF000000) != 0) {
                        var3 = class98.field1633[var6][var9];
                        var4 = class360.field5465[var6][var9];
                        var5 = class407.field6111[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field6231; var7 <= arg0.field6235; var7++) {
                for (int var8 = arg0.field6238; var8 <= arg0.field6226; var8++) {
                    if ((class98.field1633[var7][var8] & 0xFF000000) == 0) {
                        class98.field1633[var7][var8] = var3;
                        class360.field5465[var7][var8] = var4;
                        class407.field6111[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class123.field1993[class256.field3696++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method652(byte arg0) {
        int var1 = 65 % ((70 - arg0) / 39);
        field1455 = null;
    }
}
