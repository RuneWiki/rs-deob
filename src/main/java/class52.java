import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class52 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Z")
    public static boolean field938 = false;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field941 = 0;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lid;")
    public static class149 field939 = class60.method382("blinken2:", (byte) 116);

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "J")
    public static volatile long field944 = 0L;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "Lid;")
    public static class149 field945 = null;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[I")
    public static int[] field942;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lal;B)V")
    public static final void method341(class230 arg0, byte arg1) {
        field943++;
        class167.field3098 = arg0;
        class192.field3439 = class167.field3098.method1559(16, -123);
        if (arg1 != -20) {
            method343((byte) 17, 67, -94, -48, -68);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method342(int arg0) {
        field942 = null;
        if (arg0 == -8677) {
            field945 = null;
            field939 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BIIII)V")
    public static final void method343(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field940++;
        for (class259 var5 = (class259) class85.field1550.method1140(0); var5 != null; var5 = (class259) class85.field1550.method1127(0)) {
            class194.method1322(var5, arg3, arg2, arg4, 0, arg1);
        }
        for (class259 var6 = (class259) class259.field4524.method1140(0); var6 != null; var6 = (class259) class259.field4524.method1127(0)) {
            byte var11 = 1;
            class264 var12 = var6.field4540.method923((byte) -128);
            if (var6.field4540.field2334 == var12.field4718) {
                var11 = 0;
            } else if (var6.field4540.field2334 == var12.field4733 || var6.field4540.field2334 == var12.field4716 || var6.field4540.field2334 == var12.field4703 || var6.field4540.field2334 == var12.field4727) {
                var11 = 2;
            } else if (var6.field4540.field2334 == var12.field4711 || var6.field4540.field2334 == var12.field4714 || var6.field4540.field2334 == var12.field4710 || var6.field4540.field2334 == var12.field4690) {
                var11 = 3;
            }
            if (var6.field4542 != var11) {
                int var13 = class237.method1604((byte) 112, var6.field4540);
                if (var6.field4545 != var13) {
                    if (var6.field4531 != null) {
                        class246.field4318.method814(var6.field4531);
                        var6.field4531 = null;
                    }
                    var6.field4545 = var13;
                }
                var6.field4542 = var11;
            }
            var6.field4534 = var6.field4540.field2347;
            var6.field4533 = var6.field4540.field2347 + var6.field4540.method885((byte) -79) * 64;
            var6.field4544 = var6.field4540.field2340;
            var6.field4536 = var6.field4540.field2340 + var6.field4540.method885((byte) -111) * 64;
            class194.method1322(var6, arg3, arg2, arg4, 0, arg1);
        }
        if (arg0 != 101) {
            field941 = -89;
        }
        for (class259 var7 = (class259) class252.field4419.method633((byte) 36); var7 != null; var7 = (class259) class252.field4419.method630(arg0 ^ 0x6E)) {
            byte var8 = 1;
            class264 var9 = var7.field4550.method923((byte) -34);
            if (var7.field4550.field2334 == var9.field4718) {
                var8 = 0;
            } else if (var7.field4550.field2334 == var9.field4733 || var7.field4550.field2334 == var9.field4716 || var7.field4550.field2334 == var9.field4703 || var7.field4550.field2334 == var9.field4727) {
                var8 = 2;
            } else if (var7.field4550.field2334 == var9.field4711 || var7.field4550.field2334 == var9.field4714 || var7.field4550.field2334 == var9.field4710 || var7.field4550.field2334 == var9.field4690) {
                var8 = 3;
            }
            if (var7.field4542 != var8) {
                int var10 = class185.method1274(91, var7.field4550);
                if (var7.field4545 != var10) {
                    if (var7.field4531 != null) {
                        class246.field4318.method814(var7.field4531);
                        var7.field4531 = null;
                    }
                    var7.field4545 = var10;
                }
                var7.field4542 = var8;
            }
            var7.field4534 = var7.field4550.field2347;
            var7.field4533 = var7.field4550.field2347 + var7.field4550.method885((byte) -48) * 64;
            var7.field4544 = var7.field4550.field2340;
            var7.field4536 = var7.field4550.field2340 + var7.field4550.method885((byte) -126) * 64;
            class194.method1322(var7, arg3, arg2, arg4, 0, arg1);
        }
    }
}
