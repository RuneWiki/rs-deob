import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class154 extends class252 {

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Z")
    public volatile boolean field2461 = true;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field2459 = 0;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "Lgi;")
    public static class164 field2464;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Z")
    public boolean field2462;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Z")
    public boolean field2465;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)I")
    public abstract int method1043(int arg0);

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
    public static void method1044(int arg0) {
        if (arg0 == 1) {
            field2464 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method1045(boolean arg0);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIILie;IZJ)Z")
    public static final boolean method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class34 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class199.field3192 == class166.field2746;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class95.field1504 || var24 >= class200.field3208) {
                    return false;
                }
                class116 var25 = class307.field4991[arg0][var15][var24];
                if (var25 != null && var25.field1787 >= 5) {
                    return false;
                }
            }
        }
        class90 var16 = new class90();
        var16.field1402 = arg11;
        var16.field1422 = arg0;
        var16.field1411 = arg5;
        var16.field1412 = arg6;
        var16.field1406 = arg7;
        var16.field1416 = arg8;
        var16.field1403 = arg9;
        var16.field1405 = arg1;
        var16.field1407 = arg2;
        var16.field1420 = arg1 + arg3 - 1;
        var16.field1399 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class307.field4991[var22][var17][var20] == null) {
                        class307.field4991[var22][var17][var20] = new class116(var22, var17, var20);
                    }
                }
                class116 var23 = class307.field4991[arg0][var17][var20];
                var23.field1782[var23.field1787] = var16;
                var23.field1768[var23.field1787] = var21;
                var23.field1779 |= var21;
                var23.field1787++;
                if (var13 && class120.field1905[var17][var20] != 0) {
                    var14 = class120.field1905[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class120.field1905[var18][var19] == 0) {
                        class120.field1905[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class68.field1093[class198.field3188++] = var16;
        }
        return true;
    }
}
