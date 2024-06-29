import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class132 {

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
    public static int[] field1833 = new int[1000];

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[Lms;")
    public static class451[] field1831 = new class451[8];

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lng;")
    public static class190 field1834 = new class190(32);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public static final void method897(int arg0, int arg1, int arg2) {
        field1835++;
        class399 var3 = class269.method1655(7, arg2, -20);
        int var4 = 44 / ((arg0 + 37) / 35);
        var3.method2583((byte) 71);
        var3.field5842 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
    public static final boolean method898(int arg0, int arg1, String arg2, boolean arg3) {
        field1836++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var10 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg3) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var12) {
                return false;
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg1 * var6 + var12;
            if ((var11 / arg1) != var6) {
                return false;
            }
            var5 = true;
            var6 = var11;
        }
        int var9 = -81 / ((arg0 - 13) / 36);
        return var5;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static final void method899(byte arg0) {
        field1830++;
        class190 var1 = class236.field3212;
        synchronized (class236.field3212) {
            class236.field3212.method1243(1000);
        }
        if (arg0 < 33) {
            return;
        }
        class190 var2 = class395.field5772;
        synchronized (class395.field5772) {
            class395.field5772.method1243(1000);
        }
        class272 var3 = class362.field5075;
        synchronized (class362.field5075) {
            class362.field5075.method1671(-30598);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method900(int arg0) {
        field1834 = null;
        field1831 = null;
        field1833 = null;
        if (arg0 < 39) {
            method902(65, -4, 120, 117, 73);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
    public static final void method901(int arg0, int arg1) {
        field1832++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class451.field6572 = arg1;
        if (arg0 != -32190) {
            method897(43, -57, 122);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
    public static final void method902(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1837++;
        class399 var5 = class269.method1655(4, arg2, -25);
        var5.method2583((byte) 71);
        if (arg4 > -77) {
            method897(-122, -71, -36);
        }
        var5.field5837 = arg1;
        var5.field5829 = arg0;
        var5.field5842 = arg3;
    }
}
