import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class223 {

    @OriginalMember(owner = "client!np", name = "a", descriptor = "[I")
    public static int[] field3093 = new int[32];

    @OriginalMember(owner = "client!np", name = "c", descriptor = "[[I")
    public static int[][] field3095 = new int[128][128];

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Z")
    public static boolean field3096;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "S")
    public static short field3097;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Lg;")
    public static class470 field3098;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field3095 = null;
        if (arg0 != 128) {
            method1231(-72);
        }
        field3098 = null;
        field3093 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lmt;Z)Z")
    public static final boolean method1232(class83 arg0, boolean arg1) {
        boolean var2 = class398.field5667 == class361.field5208;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method422(-99);
        if (arg0.field999 < 0 || arg0.field1004 < 0 || arg0.field1011 >= class176.field2122 || arg0.field997 >= class225.field3116) {
            return false;
        }
        for (int var6 = arg0.field999; var6 <= arg0.field1011; var6++) {
            for (int var9 = arg0.field1004; var9 <= arg0.field997; var9++) {
                class263 var10 = class88.method444(arg0.field994, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field999) {
                        var11++;
                    }
                    if (var6 < arg0.field1011) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field1004) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field997) {
                        var11 += 2;
                    }
                    class248 var12 = class37.method197(var11, 0, arg0);
                    class248 var13 = var10.field3801;
                    if (var13 == null) {
                        var10.field3801 = var12;
                    } else {
                        while (var13.field3490 != null) {
                            var13 = var13.field3490;
                        }
                        var13.field3490 = var12;
                    }
                    var10.field3802 = (byte) (var10.field3802 | var11);
                    if (var2 && (class275.field3914[var6][var9] & 0xFF000000) != 0) {
                        var3 = class275.field3914[var6][var9];
                        var4 = class419.field6040[var6][var9];
                        var5 = class3.field24[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field999; var7 <= arg0.field1011; var7++) {
                for (int var8 = arg0.field1004; var8 <= arg0.field997; var8++) {
                    if ((class275.field3914[var7][var8] & 0xFF000000) == 0) {
                        class275.field3914[var7][var8] = var3;
                        class419.field6040[var7][var8] = var4;
                        class3.field24[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class413.field5880[class63.field782++] = arg0;
        }
        return true;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3093[var1] = var0 - 1;
            var0 += var0;
        }
        field3096 = false;
        field3097 = 256;
        field3099 = 0;
    }
}
